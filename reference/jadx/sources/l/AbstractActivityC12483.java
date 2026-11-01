package l;

import android.R;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۫ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L61J */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC12483 extends ActivityC4866 implements InterfaceC17421 {

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f41623 = 0;

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public static WeakReference f41624;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public static final C9186 f41625;

    /* JADX INFO: renamed from: ܽۧۖ, reason: not valid java name and contains not printable characters */
    private static final short[] f41626;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f41627;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public C5965 f41628;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f41629;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public volatile C19644 f41630;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public boolean f41631;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC6772 f41632;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public boolean f41633;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f41634;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public Intent f41635;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public View f41636;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f41637;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean f41638;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public C9101 f41639;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public volatile Runnable f41640;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final Set f41641;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public boolean f41642;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC18284 f41643;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C9101 f41644;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public C6938 f41645;

    /* JADX INFO: renamed from: ֨ */
    public /* synthetic */ boolean mo114() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native View m30995(int i);

    /* JADX INFO: renamed from: ۡ */
    public abstract String mo126();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31019(View view) {
        AbstractC3062 abstractC3062M5341 = null;
        EnumC9414 enumC9414Mo9170 = null;
        int i = -596363660;
        int i2 = C1419.f5860;
        int i3 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM45029 = C19806.m45029("ۘۖ") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-8083)) ^ 1175940694;
        int i5 = 377420252;
        while (true) {
            i = ((((i ^ i2) * (-29527)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2129354226:
                case -979971167:
                    if (RunnableC1895.f7152) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۢ֫")) * (-15);
                        i4 = ((iM45029 ^ i3) * (-1765)) ^ (-1918419262);
                        i5 = 858878788;
                    } else {
                        iM45029 = C19806.m45029("᩸᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-17917)) ^ (-1096676136);
                        i5 = -186057734;
                    }
                    break;
                case -2089693193:
                case 1680875808:
                    if (C1377.f5749) {
                        iM45029 = (C19806.m45029("᩻ۨ") + i2) * 95;
                        i4 = ((iM45029 ^ i3) * 22157) ^ 1977881325;
                        i5 = -964552873;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ܿ") + i3) * (-67);
                        i4 = ((iM45029 ^ i2) * 11099) ^ 1803271935;
                        i5 = 1801179964;
                    }
                    break;
                case -2017026842:
                case 1049194583:
                    if (view instanceof C3040) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֡۟")) * (-89);
                        i4 = ((iM45029 ^ i2) * (-25601)) ^ (-1363053796);
                        i5 = -1205124647;
                    } else {
                        iM45029 = C19806.m45029("ۗ᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-27031)) ^ (-427669658);
                        i5 = 677735825;
                    }
                    break;
                case -1955142923:
                case 1629703810:
                    Class clsM10051 = RunnableC3388.m10051(view);
                    if (C0216.f1393 == 0) {
                        throw new IllegalArgumentException(C0817.m3407(clsM10051));
                    }
                    iM45029 = (ThreadFactoryC3888.m11306("᩶ܿ") + i3) * (-67);
                    i4 = ((iM45029 ^ i2) * 11099) ^ 1803271935;
                    i5 = 1801179964;
                    break;
                case -1928862493:
                case 558611582:
                    C1461.m5080();
                    return;
                case -1882610291:
                case -403136832:
                    if (enumC9414Mo9170.m24173(EnumC9414.STARTED)) {
                        iM45029 = C19806.m45029("ۤ᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-15681)) ^ (-1731977208);
                        i5 = 197455739;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ܰ֡")) * 79;
                        i4 = ((iM45029 ^ i3) * (-6581)) ^ (-1172772975);
                        i5 = -650484983;
                    }
                    break;
                case -1840032763:
                case 501444450:
                    if (RunnableC3388.m10064()) {
                        iM45029 = C19806.m45029("ܳۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12485) ^ (-1676939245);
                        i5 = -864026358;
                    } else {
                        iM45029 = (C19806.m45029("ۙۚ") + i3) * 41;
                        i4 = ((iM45029 ^ i2) * (-25867)) ^ (-921156977);
                        i5 = 1985389830;
                    }
                    break;
                case -1678182335:
                case 1049285706:
                    this.f41636 = view;
                    abstractC3062M5341 = RunnableC1564.m5341(this);
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֡᩹")) * (-67);
                        i4 = ((iM45029 ^ i2) * 23639) ^ (-656161031);
                        i5 = -2141557713;
                    } else {
                        iM45029 = C19806.m45029("ܳܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-13237)) ^ 468104654;
                        i5 = -979570667;
                    }
                    break;
                case -1613481932:
                case 450425317:
                    if (RunnableC1564.f6300) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֡᩹")) * (-67);
                        i4 = ((iM45029 ^ i2) * 23639) ^ (-656161031);
                        i5 = -2141557713;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-29923)) ^ 314042454;
                        i5 = 1420131901;
                    }
                    break;
                case -1300588093:
                case 891686606:
                    return;
                case -1186747507:
                case 930726864:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = C19806.m45029("᩸᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-17917)) ^ (-1096676136);
                        i5 = -186057734;
                    } else {
                        iM45029 = (C19806.m45029("᩵ۨ") ^ i3) * 99;
                        i4 = ((iM45029 ^ i2) * (-25803)) ^ (-63374829);
                        i5 = -908432460;
                    }
                    break;
                case -1161539952:
                case -517592451:
                    C2249.m6915();
                    C1937.m6279();
                    iM45029 = C19806.m45029("᩸᩶") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-17917)) ^ (-1096676136);
                    i5 = -186057734;
                    break;
                case -563866094:
                case 139250844:
                    f41624 = new WeakReference(view);
                    iM45029 = (i2 - C19806.m45029("ܰ֡")) * 79;
                    i4 = ((iM45029 ^ i3) * (-6581)) ^ (-1172772975);
                    i5 = -650484983;
                    break;
                case 272375560:
                case 868085084:
                    enumC9414Mo9170 = abstractC3062M5341.mo9170();
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (C19806.m45029("ۙۚ") + i3) * 41;
                        i4 = ((iM45029 ^ i2) * (-25867)) ^ (-921156977);
                        i5 = 1985389830;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 24453) ^ (-1250569522);
                        i5 = -963882096;
                    }
                    break;
                case 320368428:
                case 1597566641:
                    if (C2332.f8260) {
                        iM45029 = (C19806.m45029("ܰۢ") ^ i2) * 55;
                        i4 = ((iM45029 ^ i3) * 15847) ^ (-171676464);
                        i5 = 1557230965;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֡᩹")) * (-67);
                        i4 = ((iM45029 ^ i2) * 23639) ^ (-656161031);
                        i5 = -2141557713;
                    }
                    break;
                case 421588600:
                case 1720195406:
                    if (C3286.f12186) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ܿ") + i3) * (-67);
                        i4 = ((iM45029 ^ i2) * 11099) ^ 1803271935;
                        i5 = 1801179964;
                    } else {
                        iM45029 = (C19806.m45029("ۧܶ") ^ i3) * 31;
                        i4 = ((iM45029 ^ i2) * 4509) ^ (-1589597359);
                        i5 = 1544407347;
                    }
                    break;
                case 835322721:
                case 1218262053:
                    if (view instanceof C6111) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֡۟")) * (-89);
                        i4 = ((iM45029 ^ i2) * (-25601)) ^ (-1363053796);
                        i5 = -1205124647;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ᩵") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i2) * 32071) ^ 679069452;
                        i5 = -801401529;
                    }
                    break;
                case 1391896384:
                case 1895882906:
                    C1025.m3861();
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۗ") + i2) * (-3);
                        i4 = ((iM45029 ^ i3) * 28813) ^ 498833831;
                        i5 = 398088539;
                    } else {
                        iM45029 = C19806.m45029("᩸᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-17917)) ^ (-1096676136);
                        i5 = -186057734;
                    }
                    break;
                case 1755777061:
                case 1879150347:
                    C2871.m8646();
                    if (C3660.f13403 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ܿ") + i3) * (-67);
                        i4 = ((iM45029 ^ i2) * 11099) ^ 1803271935;
                        i5 = 1801179964;
                    } else {
                        iM45029 = C19806.m45029("᩸᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-17917)) ^ (-1096676136);
                        i5 = -186057734;
                    }
                    break;
                default:
                    C1377.m4833();
                    if (!C0817.f3443) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֡᩹")) * (-67);
                        i4 = ((iM45029 ^ i2) * 23639) ^ (-656161031);
                        i5 = -2141557713;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۗ") + i2) * (-3);
                        i4 = ((iM45029 ^ i3) * 28813) ^ 498833831;
                        i5 = 398088539;
                    }
                    break;
            }
        }
    }

    @Override // l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z = false;
        boolean z2 = false;
        C18280 c18280 = null;
        C9101 c9101M20320 = null;
        C9186 c9186 = null;
        Display defaultDisplay = null;
        Point point = null;
        int i = 2099108036;
        int i2 = C1977.f7413;
        int i3 = RunnableC1606.f6488;
        int iM11306 = (ThreadFactoryC3888.m11306("ܽۧ") + i2) * (-35);
        int i4 = ((iM11306 ^ i3) * 16983) ^ (-880758430);
        int i5 = 623845976;
        while (true) {
            i = ((((i ^ i3) * (-1147)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2103679600:
                case -1165636775:
                    this.f41631 = C20368.m45991();
                    iM11306 = (C19806.m45029("ۤ᩷") + i2) * (-107);
                    i4 = ((iM11306 ^ i3) * (-127)) ^ (-1478482667);
                    i5 = -969947622;
                    break;
                case -2075147005:
                case -1521287839:
                    if (!C0817.f3443) {
                        iM11306 = C19806.m45029("۬ۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31425)) ^ (-1683229666);
                        i5 = 631490247;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩵֡")) * (-17);
                        i4 = ((iM11306 ^ i2) * 28689) ^ (-11196093);
                        i5 = 1930476793;
                    }
                    break;
                case -2002383554:
                case 1643196109:
                    C1066.m4023();
                    iM11306 = C19806.m45029("۬ۙ") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-31425)) ^ (-1683229666);
                    i5 = 631490247;
                    break;
                case -1896916771:
                case 1289715397:
                    C1025.m3861();
                    if (!C0797.f3386) {
                        iM11306 = C19806.m45029("۬ۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31425)) ^ (-1683229666);
                        i5 = 631490247;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ۢ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11589)) ^ 1996675797;
                        i5 = -1321837690;
                    }
                    break;
                case -1877683549:
                case 699575269:
                    C17132.m40037();
                    z = true;
                    if (bundle != null) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵۟") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11306 ^ i2) * 8243) ^ (-1069507234);
                        i5 = 1011529196;
                    } else {
                        iM11306 = (C19806.m45029("۠ܺ") + i2) * (-77);
                        i4 = ((iM11306 ^ i3) * (-29175)) ^ (-971949769);
                        i5 = -853599121;
                    }
                    break;
                case -1846329303:
                case -483328571:
                    if (!C3577.m10565()) {
                        iM11306 = C19806.m45029("ۤ᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * 6941) ^ (-1685925337);
                        i5 = 1250286508;
                    } else {
                        iM11306 = C19806.m45029("۬ۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31425)) ^ (-1683229666);
                        i5 = 631490247;
                    }
                    break;
                case -1726856107:
                case 403512464:
                    z2 = false;
                    iM11306 = ThreadFactoryC3888.m11306("۬۬") ^ i2;
                    i4 = ((iM11306 ^ i3) * 31235) ^ (-478398653);
                    i5 = 1849143928;
                    break;
                case -1492198824:
                case 1662252765:
                    c18280 = new C18280(8, this);
                    if (C1937.f7317 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩵֡")) * (-17);
                        i4 = ((iM11306 ^ i2) * 28689) ^ (-11196093);
                        i5 = 1930476793;
                    } else {
                        iM11306 = C19806.m45029("᩶᩺") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5009) ^ (-334842890);
                        i5 = 413723738;
                    }
                    break;
                case -1481149416:
                case -928519739:
                    C9682.m24640(this);
                    if (C19806.f63586) {
                        iM11306 = C19806.m45029("ۤ᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * 6941) ^ (-1685925337);
                        i5 = 1250286508;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩹ᩳ")) * (-57);
                        i4 = ((iM11306 ^ i3) * (-13329)) ^ (-1949199957);
                        i5 = 1071706102;
                    }
                    break;
                case -1392934253:
                case 949151500:
                    if (C2871.f10837 >= 0) {
                        iM11306 = C19806.m45029("ۤ᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * 6941) ^ (-1685925337);
                        i5 = 1250286508;
                    } else {
                        C1937.m6282(c9186, this, new InterfaceC10597() { // from class: l.ۡܶۘ
                            @Override // l.InterfaceC10597
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo1473(Object obj) {
                                C4014 c4014 = null;
                                int i6 = 928401253;
                                int i7 = RunnableC1606.f6488;
                                int i8 = C3660.f13403;
                                int iM11307 = ThreadFactoryC3888.m11306("֡ۤ") ^ i7;
                                int i9 = ((iM11307 ^ i8) * (-22883)) ^ (-1370256008);
                                int i10 = 174596641;
                                while (true) {
                                    i6 = ((((i6 ^ i8) * (-8977)) >> 31) & i9) ^ (iM11307 ^ i10);
                                    switch (i6) {
                                        case -1940443754:
                                        case -39388733:
                                            if (C1937.f7317 >= 0) {
                                                iM11307 = ThreadFactoryC3888.m11306("ۚܿ") ^ i8;
                                                i9 = ((iM11307 ^ i7) * (-7023)) ^ 1222598578;
                                                i10 = 1740087699;
                                            } else {
                                                iM11307 = C19806.m45029("ۨ۠") ^ i7;
                                                i9 = ((iM11307 ^ i8) * (-5621)) ^ 1578367714;
                                                i10 = -1333668381;
                                            }
                                            break;
                                        case -1918945175:
                                        case 1216851506:
                                            if (c4014.m11519()) {
                                                iM11307 = ThreadFactoryC3888.m11306("ۢܰ") ^ i8;
                                                i9 = ((iM11307 ^ i7) * (-28565)) ^ (-957327450);
                                                i10 = -816684911;
                                            } else {
                                                iM11307 = ThreadFactoryC3888.m11306("ۜܿ") ^ i8;
                                                i9 = ((iM11307 ^ i7) * 12895) ^ 1984771433;
                                                i10 = -1753102603;
                                            }
                                            break;
                                        case -1801244195:
                                        case 1577660150:
                                            if (C0962.f3784) {
                                                iM11307 = ThreadFactoryC3888.m11306("ۘܳ") ^ i7;
                                                i9 = ((iM11307 ^ i8) * 2725) ^ (-1488792594);
                                                i10 = 1467518894;
                                            } else {
                                                iM11307 = ThreadFactoryC3888.m11306("ܺۙ") ^ i7;
                                                i9 = ((iM11307 ^ i8) * (-19319)) ^ (-1986819349);
                                                i10 = 986870059;
                                            }
                                            break;
                                        case -1456775102:
                                        case -350913092:
                                            if (C0962.f3784) {
                                                iM11307 = ThreadFactoryC3888.m11306("ۘܳ") ^ i7;
                                                i9 = ((iM11307 ^ i8) * 2725) ^ (-1488792594);
                                                i10 = 1467518894;
                                            } else {
                                                iM11307 = (i8 - ThreadFactoryC3888.m11306("֡ۙ")) * 123;
                                                i9 = ((iM11307 ^ i7) * 1475) ^ 441930502;
                                                i10 = 502538282;
                                            }
                                            break;
                                        case -1337825843:
                                        case -404936014:
                                            if (C1025.f4800 >= 0) {
                                                iM11307 = ThreadFactoryC3888.m11306("ۘܳ") ^ i7;
                                                i9 = ((iM11307 ^ i8) * 2725) ^ (-1488792594);
                                                i10 = 1467518894;
                                            } else {
                                                iM11307 = (C19806.m45029("ܶܿ") ^ i8) * 43;
                                                i9 = ((iM11307 ^ i7) * (-6899)) ^ (-1990305408);
                                                i10 = -1857095278;
                                            }
                                            break;
                                        case -1196457427:
                                        case 2117338627:
                                            if (C7105.f23796 < 0) {
                                                iM11307 = ThreadFactoryC3888.m11306("֡ܺ") ^ i7;
                                                i9 = ((iM11307 ^ i8) * (-4629)) ^ (-1703680479);
                                                i10 = 263689051;
                                            } else {
                                                iM11307 = ThreadFactoryC3888.m11306("ܳ᩹") ^ i8;
                                                i9 = ((iM11307 ^ i7) * 29043) ^ 2089429141;
                                                i10 = 1824067007;
                                            }
                                            break;
                                        case -1036026272:
                                        case 1599528899:
                                            if (C1461.m5080()) {
                                                iM11307 = ThreadFactoryC3888.m11306("ܳ᩹") ^ i8;
                                                i9 = ((iM11307 ^ i7) * 29043) ^ 2089429141;
                                                i10 = 1824067007;
                                            } else {
                                                iM11307 = (C19806.m45029("۠᩻") + i8) * (-29);
                                                i9 = ((iM11307 ^ i7) * (-10915)) ^ (-1489275503);
                                                i10 = 1166550791;
                                            }
                                            break;
                                        case -909698243:
                                        case 1492950364:
                                            this.f30682.mo121(c4014);
                                            iM11307 = ThreadFactoryC3888.m11306("ۜܿ") ^ i8;
                                            i9 = ((iM11307 ^ i7) * 12895) ^ 1984771433;
                                            i10 = -1753102603;
                                            break;
                                        case -842113549:
                                        case 16492119:
                                            AbstractC0464.m2313();
                                            C1398.m4895();
                                            break;
                                        case -721075924:
                                        case -616773981:
                                            if (C2871.f10837 >= 0) {
                                                iM11307 = ThreadFactoryC3888.m11306("֡ܺ") ^ i7;
                                                i9 = ((iM11307 ^ i8) * (-4629)) ^ (-1703680479);
                                                i10 = 263689051;
                                            } else {
                                                iM11307 = (C19806.m45029("ܰ֨") + i7) * 69;
                                                i9 = ((iM11307 ^ i8) * (-23361)) ^ (-1789983006);
                                                i10 = -1151925394;
                                            }
                                            break;
                                        case -530517958:
                                        case -311150291:
                                            C1398.m4895();
                                            if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                                                iM11307 = ThreadFactoryC3888.m11306("ܳ᩹") ^ i8;
                                                i9 = ((iM11307 ^ i7) * 29043) ^ 2089429141;
                                                i10 = 1824067007;
                                            } else {
                                                iM11307 = (ThreadFactoryC3888.m11306("ܽܺ") ^ i7) * 93;
                                                i9 = ((iM11307 ^ i8) * (-32727)) ^ 444405638;
                                                i10 = 567754822;
                                            }
                                            break;
                                        case -440450662:
                                        case 188624634:
                                            if (C0216.f1393 != 0) {
                                                iM11307 = ThreadFactoryC3888.m11306("ۘܳ") ^ i7;
                                                i9 = ((iM11307 ^ i8) * 2725) ^ (-1488792594);
                                                i10 = 1467518894;
                                            } else {
                                                iM11307 = ThreadFactoryC3888.m11306("᩵֫") ^ i7;
                                                i9 = ((iM11307 ^ i8) * 16887) ^ 994170420;
                                                i10 = 1603701443;
                                            }
                                            break;
                                        case -432104845:
                                        case 1169924459:
                                            c4014 = (C4014) obj;
                                            int i11 = AbstractActivityC12483.f41623;
                                            if (c4014 != null) {
                                                iM11307 = ThreadFactoryC3888.m11306("֨ۗ") ^ i7;
                                                i9 = ((iM11307 ^ i8) * 30743) ^ 1823068535;
                                                i10 = 1648908446;
                                            } else {
                                                iM11307 = ThreadFactoryC3888.m11306("ۜܿ") ^ i8;
                                                i9 = ((iM11307 ^ i7) * 12895) ^ 1984771433;
                                                i10 = -1753102603;
                                            }
                                            break;
                                        case -266773643:
                                        case 1124942809:
                                            C1875.m6086();
                                            if (C2788.f10625 < 0) {
                                                iM11307 = ThreadFactoryC3888.m11306("ۘܳ") ^ i7;
                                                i9 = ((iM11307 ^ i8) * 2725) ^ (-1488792594);
                                                i10 = 1467518894;
                                            } else {
                                                iM11307 = (ThreadFactoryC3888.m11306("ܽܺ") ^ i7) * 93;
                                                i9 = ((iM11307 ^ i8) * (-32727)) ^ 444405638;
                                                i10 = 567754822;
                                            }
                                            break;
                                        case -82324134:
                                        case 171421608:
                                            C1937.m6279();
                                            C2332.m7079();
                                            iM11307 = (ThreadFactoryC3888.m11306("ܽܺ") ^ i7) * 93;
                                            i9 = ((iM11307 ^ i8) * (-32727)) ^ 444405638;
                                            i10 = 567754822;
                                            break;
                                        case -47991095:
                                        case 1049807826:
                                            if (C0817.f3443) {
                                                iM11307 = ThreadFactoryC3888.m11306("ܳ֫") ^ i8;
                                                i9 = ((iM11307 ^ i7) * 1087) ^ 698217061;
                                                i10 = -770349840;
                                            } else {
                                                iM11307 = ThreadFactoryC3888.m11306("ۚܿ") ^ i8;
                                                i9 = ((iM11307 ^ i7) * (-7023)) ^ 1222598578;
                                                i10 = 1740087699;
                                            }
                                            break;
                                        case 3095637:
                                        case 700774836:
                                            break;
                                        case 395311391:
                                        case 1508661829:
                                            if (C1977.f7413 <= 0) {
                                                iM11307 = ThreadFactoryC3888.m11306("ܳ᩹") ^ i8;
                                                i9 = ((iM11307 ^ i7) * 29043) ^ 2089429141;
                                                i10 = 1824067007;
                                            } else {
                                                iM11307 = C19806.m45029("᩹֫") ^ i7;
                                                i9 = ((iM11307 ^ i8) * (-26919)) ^ (-2058205062);
                                                i10 = 318200387;
                                            }
                                            break;
                                        default:
                                            if (CallableC1627.m5507() != 0) {
                                                iM11307 = ThreadFactoryC3888.m11306("֡ܺ") ^ i7;
                                                i9 = ((iM11307 ^ i8) * (-4629)) ^ (-1703680479);
                                                i10 = 263689051;
                                            } else {
                                                iM11307 = (i8 - C19806.m45029("۠֡")) * (-43);
                                                i9 = ((iM11307 ^ i7) * 26941) ^ 1994105584;
                                                i10 = -1838493387;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        });
                        if (C16737.m39260()) {
                            iM11306 = (C19806.m45029("ᩳ۠") ^ i2) * (-79);
                            i4 = ((iM11306 ^ i3) * (-415)) ^ (-1336703784);
                            i5 = 1972369439;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("۟ۨ") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i4 = ((iM11306 ^ i2) * 2419) ^ 1944716351;
                            i5 = 437609860;
                        }
                    }
                    break;
                case -1391655924:
                case -1371763037:
                    defaultDisplay.getRealSize(C13932.f45878);
                    C13932.f45879 = z;
                    iM11306 = (ThreadFactoryC3888.m11306("֫ۗ") + i2) * 47;
                    i4 = ((iM11306 ^ i3) * (-4249)) ^ 1482448029;
                    i5 = 1815779373;
                    break;
                case -1355807758:
                case -286292975:
                    c9101M20320 = C7689.m20320(this, new InterfaceC8395() { // from class: l.᩺ܶۘ
                        @Override // l.InterfaceC8395
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo1796(Intent intent, int i6) {
                            int i7 = 1897566278;
                            int i8 = C2642.f10294;
                            int i9 = C3577.f13150;
                            int iM45029 = (i8 - C19806.m45029("᩻ۢ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            int i10 = ((iM45029 ^ i9) * (-13409)) ^ 1996069855;
                            int i11 = -40380990;
                            while (true) {
                                i7 = ((((i7 ^ i9) * 24351) >> 31) & i10) ^ (iM45029 ^ i11);
                                switch (i7) {
                                    case -1929158835:
                                    case 215281718:
                                        if (C1398.f5802 <= 0) {
                                            iM45029 = (ThreadFactoryC3888.m11306("᩵ۤ") ^ i8) * 19;
                                            i10 = ((iM45029 ^ i9) * 17439) ^ 2020520231;
                                            i11 = 350363672;
                                        } else {
                                            iM45029 = C19806.m45029("᩶᩷") ^ i9;
                                            i10 = ((iM45029 ^ i8) * 30539) ^ 1226044534;
                                            i11 = -2138955645;
                                        }
                                        break;
                                    case -1720843425:
                                    case 441199633:
                                        if (RunnableC1606.m5473() != 0) {
                                            iM45029 = (C19806.m45029("ۡۡ") + i9) * (-97);
                                            i10 = ((iM45029 ^ i8) * (-1811)) ^ 1323810895;
                                            i11 = 1887998226;
                                        } else {
                                            iM45029 = ThreadFactoryC3888.m11306("֡ۜ") ^ i8;
                                            i10 = ((iM45029 ^ i9) * 27915) ^ (-54508730);
                                            i11 = -977028130;
                                        }
                                        break;
                                    case -1303483169:
                                    case -631737153:
                                        if (RunnableC1564.f6300) {
                                            iM45029 = (C19806.m45029("ۡۡ") + i9) * (-97);
                                            i10 = ((iM45029 ^ i8) * (-1811)) ^ 1323810895;
                                            i11 = 1887998226;
                                        } else {
                                            iM45029 = (i9 - C19806.m45029("ܶۙ")) * 77;
                                            i10 = ((iM45029 ^ i8) * (-31791)) ^ 1422939965;
                                            i11 = -2143582472;
                                        }
                                        break;
                                    case -1302934390:
                                    case 1750320148:
                                        if (C1398.f5802 <= 0) {
                                            iM45029 = (ThreadFactoryC3888.m11306("ܶ᩻") ^ i8) * (-117);
                                            i10 = ((iM45029 ^ i9) * 10387) ^ 865926279;
                                            i11 = -1542676166;
                                        } else {
                                            iM45029 = (i8 - C19806.m45029("ۖۡ")) * 49;
                                            i10 = ((iM45029 ^ i9) * 28741) ^ (-1460341627);
                                            i11 = -66166097;
                                        }
                                        break;
                                    case -1156087343:
                                    case 109390413:
                                        if (C0216.f1393 != 0) {
                                            iM45029 = (C19806.m45029("ۡۡ") + i9) * (-97);
                                            i10 = ((iM45029 ^ i8) * (-1811)) ^ 1323810895;
                                            i11 = 1887998226;
                                        } else {
                                            iM45029 = (C19806.m45029("᩸ۧ") + i8) * (-109);
                                            i10 = ((iM45029 ^ i9) * (-10197)) ^ (-1680795811);
                                            i11 = 1766824876;
                                        }
                                        break;
                                    case -910362150:
                                    case 102311651:
                                        if (C1025.f4800 >= 0) {
                                            iM45029 = ThreadFactoryC3888.m11306("۫ᩴ") ^ i9;
                                            i10 = ((iM45029 ^ i8) * 16903) ^ 1423353760;
                                            i11 = -1426391449;
                                        } else {
                                            iM45029 = (i9 - C19806.m45029("֫۬")) * (-75);
                                            i10 = ((iM45029 ^ i8) * 23059) ^ (-854007757);
                                            i11 = -356961747;
                                        }
                                        break;
                                    case -839731948:
                                    case 1286534903:
                                        C1460.m5050();
                                        if (!RunnableC1564.f6300) {
                                            iM45029 = (ThreadFactoryC3888.m11306("ܶ᩻") ^ i8) * (-117);
                                            i10 = ((iM45029 ^ i9) * 10387) ^ 865926279;
                                            i11 = -1542676166;
                                        } else {
                                            iM45029 = (C19806.m45029("ۡۡ") + i9) * (-97);
                                            i10 = ((iM45029 ^ i8) * (-1811)) ^ 1323810895;
                                            i11 = 1887998226;
                                        }
                                        break;
                                    case -602266854:
                                    case 702726671:
                                        C2332.m7079();
                                        RunnableC3388.m10064();
                                        iM45029 = (C19806.m45029("ۡۡ") + i9) * (-97);
                                        i10 = ((iM45029 ^ i8) * (-1811)) ^ 1323810895;
                                        i11 = 1887998226;
                                        break;
                                    case -534561625:
                                    case 2074734130:
                                        if (C1668.m5583()) {
                                            iM45029 = C19806.m45029("֡᩶") ^ i9;
                                            i10 = ((iM45029 ^ i8) * 27625) ^ 1756838242;
                                            i11 = 681264684;
                                        } else {
                                            iM45029 = (C19806.m45029("֡֨") + i9) * (-23);
                                            i10 = ((iM45029 ^ i8) * (-28235)) ^ (-1794912326);
                                            i11 = 183595546;
                                        }
                                        break;
                                    case -258546032:
                                    case 1401923849:
                                        if (C1377.f5749) {
                                            iM45029 = C19806.m45029("ۖۜ") ^ i8;
                                            i10 = ((iM45029 ^ i9) * (-25617)) ^ (-83146408);
                                            i11 = 427984415;
                                        } else {
                                            iM45029 = (C19806.m45029("֡֨") + i9) * (-23);
                                            i10 = ((iM45029 ^ i8) * (-28235)) ^ (-1794912326);
                                            i11 = 183595546;
                                        }
                                        break;
                                    case -219224609:
                                    case 256647624:
                                        if (C2871.f10837 >= 0) {
                                            iM45029 = (ThreadFactoryC3888.m11306("ܶ᩻") ^ i8) * (-117);
                                            i10 = ((iM45029 ^ i9) * 10387) ^ 865926279;
                                            i11 = -1542676166;
                                        } else {
                                            iM45029 = ThreadFactoryC3888.m11306("֡ۚ") ^ i8;
                                            i10 = ((iM45029 ^ i9) * 9401) ^ (-1554565628);
                                            i11 = -1030872517;
                                        }
                                        break;
                                    case 495954192:
                                    case 838549594:
                                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                                            iM45029 = (ThreadFactoryC3888.m11306("᩵ۤ") ^ i8) * 19;
                                            i10 = ((iM45029 ^ i9) * 17439) ^ 2020520231;
                                            i11 = 350363672;
                                        } else {
                                            iM45029 = (ThreadFactoryC3888.m11306("ܶ᩻") ^ i8) * (-117);
                                            i10 = ((iM45029 ^ i9) * 10387) ^ 865926279;
                                            i11 = -1542676166;
                                        }
                                        break;
                                    case 661579647:
                                    case 1525191611:
                                        C0797.m3359();
                                        break;
                                    case 808930525:
                                    case 1643221245:
                                        C19806.m45024();
                                        if (C10634.f36300 >= 0) {
                                            iM45029 = (C19806.m45029("֡֨") + i9) * (-23);
                                            i10 = ((iM45029 ^ i8) * (-28235)) ^ (-1794912326);
                                            i11 = 183595546;
                                        } else {
                                            iM45029 = (ThreadFactoryC3888.m11306("᩵ۤ") ^ i8) * 19;
                                            i10 = ((iM45029 ^ i9) * 17439) ^ 2020520231;
                                            i11 = 350363672;
                                        }
                                        break;
                                    case 944523364:
                                    case 1286217975:
                                        AbstractActivityC12483.m30989(this.f74940, i6);
                                        break;
                                    default:
                                        if (C3660.m10791() != 0) {
                                            iM45029 = (C19806.m45029("֡֨") + i9) * (-23);
                                            i10 = ((iM45029 ^ i8) * (-28235)) ^ (-1794912326);
                                            i11 = 183595546;
                                        } else {
                                            iM45029 = ThreadFactoryC3888.m11306("ۨۜ") ^ i9;
                                            i10 = ((iM45029 ^ i8) * (-24905)) ^ (-1341392473);
                                            i11 = -1672956694;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    if (C1460.f5948 >= 0) {
                        iM11306 = C19806.m45029("۫ᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 7223) ^ 385759739;
                        i5 = -1559734028;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۙ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24269) ^ (-1731277910);
                        i5 = -629466808;
                    }
                    break;
                case -1011452654:
                case -676710654:
                    z2 = true;
                    iM11306 = ThreadFactoryC3888.m11306("۬۬") ^ i2;
                    i4 = ((iM11306 ^ i3) * 31235) ^ (-478398653);
                    i5 = 1849143928;
                    break;
                case -739594002:
                case 1271615201:
                    setTheme(C2666.m8210());
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = C19806.m45029("ۤ᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * 6941) ^ (-1685925337);
                        i5 = 1250286508;
                    } else {
                        iM11306 = C19806.m45029("ۚ֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-10779)) ^ 31758140;
                        i5 = 661710092;
                    }
                    break;
                case -660841641:
                case 1902974969:
                    if (C13932.f45879) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ۗ") + i2) * 47;
                        i4 = ((iM11306 ^ i3) * (-4249)) ^ 1482448029;
                        i5 = 1815779373;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3241) ^ 72379615;
                        i5 = 239851710;
                    }
                    break;
                case -658435452:
                case 1203053189:
                    defaultDisplay.getSize(point);
                    if (C0050.f912 <= 0) {
                        iM11306 = C19806.m45029("ۤ᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * 6941) ^ (-1685925337);
                        i5 = 1250286508;
                    } else {
                        iM11306 = (C19806.m45029("ܽۙ") ^ i3) * (-53);
                        i4 = ((iM11306 ^ i2) * (-319)) ^ (-163391769);
                        i5 = -176181312;
                    }
                    break;
                case -629303194:
                case 1760751039:
                    C0278.m1783(this);
                    iM11306 = (ThreadFactoryC3888.m11306("۟ۨ") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i4 = ((iM11306 ^ i2) * 2419) ^ 1944716351;
                    i5 = 437609860;
                    break;
                case -587146739:
                case 629658415:
                    break;
                case -533875922:
                case -332073586:
                    if (C3722.f13525 <= 0) {
                        iM11306 = C19806.m45029("۫ᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 7223) ^ 385759739;
                        i5 = -1559734028;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢۧ") ^ i3) * (-123);
                        i4 = ((iM11306 ^ i2) * (-28963)) ^ 235183719;
                        i5 = -367047308;
                    }
                    break;
                case -258543198:
                case 900475449:
                    this.f41639 = c9101M20320;
                    super.onCreate(bundle);
                    c9186 = f41625;
                    if (C2788.m8472() != 0) {
                        iM11306 = C19806.m45029("۫ᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 7223) ^ 385759739;
                        i5 = -1559734028;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۢܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM11306 ^ i2) * (-14497)) ^ (-152123613);
                        i5 = 834264531;
                    }
                    break;
                case -142838714:
                case 498644136:
                    this.f41644 = C7689.m20320(this, c18280);
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ۢ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11589)) ^ 1996675797;
                        i5 = -1321837690;
                    } else {
                        iM11306 = C19806.m45029("᩷᩻") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-501)) ^ (-1003468533);
                        i5 = -46739310;
                    }
                    break;
                case 1009971836:
                case 1242716587:
                    this.f41627 = z2;
                    if (this.f41637) {
                        iM11306 = (i3 - C19806.m45029("ܰۡ")) * 45;
                        i4 = ((iM11306 ^ i2) * (-21685)) ^ 214041818;
                        i5 = 1661152570;
                    } else {
                        iM11306 = (C19806.m45029("ۤ᩷") + i2) * (-107);
                        i4 = ((iM11306 ^ i3) * (-127)) ^ (-1478482667);
                        i5 = -969947622;
                    }
                    break;
                case 1688475967:
                case 2007402030:
                    C0278.m1789();
                    C3660.m10791();
                    break;
                default:
                    defaultDisplay = getWindowManager().getDefaultDisplay();
                    point = C13932.f45877;
                    if (C3577.f13150 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩵֡")) * (-17);
                        i4 = ((iM11306 ^ i2) * 28689) ^ (-11196093);
                        i5 = 1930476793;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹᩵") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-12945)) ^ 918300609;
                        i5 = -1966620644;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30990(ViewGroup viewGroup, int i) {
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        View viewM10566 = null;
        int i5 = 35731119;
        int i6 = C3535.f13026;
        int i7 = C0050.f912;
        int iM45029 = C19806.m45029("۬ܶ") ^ i7;
        int i8 = ((iM45029 ^ i6) * 17245) ^ (-544194397);
        int i9 = -57440206;
        while (true) {
            i5 = ((((i5 ^ i6) * 30191) >> 31) & i8) ^ (iM45029 ^ i9);
            switch (i5) {
                case -2015708604:
                case -1309602040:
                    i3 = i + i2;
                    z = false;
                    if (i3 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ᩶") ^ i7;
                        i8 = ((iM45029 ^ i6) * 6359) ^ 1347176512;
                        i9 = 1935470710;
                    } else {
                        iM45029 = C19806.m45029("ۤۙ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-6219)) ^ 700535985;
                        i9 = 1828505071;
                    }
                    break;
                case -1977505514:
                case -1218000823:
                    i4++;
                    iM45029 = (i6 - C19806.m45029("ܿۚ")) * (-125);
                    i8 = ((iM45029 ^ i7) * 20717) ^ (-507416541);
                    i9 = -1930707251;
                    break;
                case -1560115940:
                case -736423043:
                    if (C1066.m4023() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ۫") ^ i7;
                        i8 = ((iM45029 ^ i6) * 8665) ^ (-1897768525);
                        i9 = 1374992174;
                    } else {
                        iM45029 = (C19806.m45029("ۘ֨") ^ i7) * 65;
                        i8 = ((iM45029 ^ i6) * (-3099)) ^ (-2128730322);
                        i9 = -128650464;
                    }
                    break;
                case -1558702815:
                case 224486113:
                    if (i4 < RunnableC1895.m6173(viewGroup)) {
                        iM45029 = ThreadFactoryC3888.m11306("֫۬") ^ i6;
                        i8 = ((iM45029 ^ i7) * 8921) ^ 12286161;
                        i9 = -216683130;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ᩶") ^ i7;
                        i8 = ((iM45029 ^ i6) * 6359) ^ 1347176512;
                        i9 = 1935470710;
                    }
                    break;
                case -1500440275:
                case -20709183:
                    if (C2704.f10408) {
                        iM45029 = C19806.m45029("ۢ۠") ^ i6;
                        i8 = ((iM45029 ^ i7) * 30663) ^ (-243571081);
                        i9 = 1693225211;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۨ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 28343) ^ (-227476286);
                        i9 = -1920766472;
                    }
                    break;
                case -1417302685:
                case 1488984056:
                    if (C1668.f6641 >= 0) {
                        iM45029 = C19806.m45029("۠᩷") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-9109)) ^ 2041074627;
                        i9 = -1126666818;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ۖۢ")) * 119;
                        i8 = ((iM45029 ^ i7) * (-25209)) ^ (-1783079657);
                        i9 = 1771214538;
                    }
                    break;
                case -1393219784:
                case 814914620:
                    viewM10566 = C3577.m10566(viewGroup, i4);
                    if (viewM10566.getVisibility() == 0) {
                        iM45029 = C19806.m45029("ۡ֨") ^ i6;
                        i8 = ((iM45029 ^ i7) * 11979) ^ 496268591;
                        i9 = -384740877;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ۟") + i7) * (-55);
                        i8 = ((iM45029 ^ i6) * 19891) ^ 2123040636;
                        i9 = 365910407;
                    }
                    break;
                case -1360085037:
                case -371482655:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢۙ") + i7) * (-103);
                        i8 = ((iM45029 ^ i6) * 6041) ^ (-691585369);
                        i9 = 1136757198;
                    } else {
                        iM45029 = C19806.m45029("ܰ۫") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-23005)) ^ (-1193629234);
                        i9 = 135283939;
                    }
                    break;
                case -1330000869:
                case 1093288230:
                    if (C1460.f5948 >= 0) {
                        iM45029 = C19806.m45029("۠᩷") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-9109)) ^ 2041074627;
                        i9 = -1126666818;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶ᩹") ^ i6) * (-119);
                        i8 = ((iM45029 ^ i7) * (-13385)) ^ (-1531895773);
                        i9 = 663189145;
                    }
                    break;
                case -1274940824:
                case 1855825082:
                    if (m30990((ViewGroup) viewM10566, i3)) {
                        iM45029 = (C19806.m45029("᩵ۗ") ^ i6) * 59;
                        i8 = ((iM45029 ^ i7) * (-16735)) ^ 1257330629;
                        i9 = -124943057;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ۟") + i7) * (-55);
                        i8 = ((iM45029 ^ i6) * 19891) ^ 2123040636;
                        i9 = 365910407;
                    }
                    break;
                case -1225672949:
                case -1089706419:
                    if (C0797.m3363(viewM10566) > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶۬") ^ i6;
                        i8 = ((iM45029 ^ i7) * 16541) ^ 920912484;
                        i9 = 576558329;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ۟") + i7) * (-55);
                        i8 = ((iM45029 ^ i6) * 19891) ^ 2123040636;
                        i9 = 365910407;
                    }
                    break;
                case -1185026446:
                case -112940193:
                    if (C0216.f1393 != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢۙ") + i7) * (-103);
                        i8 = ((iM45029 ^ i6) * 6041) ^ (-691585369);
                        i9 = 1136757198;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡᩻") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-19627)) ^ 957382440;
                        i9 = -1427011165;
                    }
                    break;
                case -1091285358:
                case 555982823:
                    C3535.m10431();
                    if (RunnableC3388.f12514 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ۫") ^ i7;
                        i8 = ((iM45029 ^ i6) * 8665) ^ (-1897768525);
                        i9 = 1374992174;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۨ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 28343) ^ (-227476286);
                        i9 = -1920766472;
                    }
                    break;
                case -1056804778:
                case 2109641680:
                    if (C2642.m8169(viewM10566) > 0) {
                        iM45029 = C19806.m45029("᩸֫") ^ i7;
                        i8 = ((iM45029 ^ i6) * 15727) ^ (-1001366985);
                        i9 = 2031311441;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ۟") + i7) * (-55);
                        i8 = ((iM45029 ^ i6) * 19891) ^ 2123040636;
                        i9 = 365910407;
                    }
                    break;
                case -1045770348:
                case -185623197:
                    C0278.m1789();
                    C0671.m3008();
                    return false;
                case -505469312:
                case 1790664841:
                    return true;
                case -482820554:
                case 1233576780:
                    C2477.m7593();
                    if (C2249.f8050 >= 0) {
                        iM45029 = C19806.m45029("ۖܳ") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-13527)) ^ 1590858520;
                        i9 = 292040061;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢۙ") + i7) * (-103);
                        i8 = ((iM45029 ^ i6) * 6041) ^ (-691585369);
                        i9 = 1136757198;
                    }
                    break;
                case -421799750:
                case 1889583980:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۨ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 28343) ^ (-227476286);
                        i9 = -1920766472;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ۫") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-28875)) ^ (-835037905);
                        i9 = -52271831;
                    }
                    break;
                case -87248891:
                case 1064732427:
                    return z;
                case -74037710:
                case 756897202:
                    return viewM10566.getGlobalVisibleRect(new Rect());
                case 501150777:
                case 1916344386:
                    C1398.m4895();
                    C1875.m6086();
                    iM45029 = ThreadFactoryC3888.m11306("᩹ۨ") ^ i7;
                    i8 = ((iM45029 ^ i6) * 28343) ^ (-227476286);
                    i9 = -1920766472;
                    break;
                case 550928505:
                case 828266517:
                    i4 = 0;
                    iM45029 = (i6 - C19806.m45029("ܿۚ")) * (-125);
                    i8 = ((iM45029 ^ i7) * 20717) ^ (-507416541);
                    i9 = -1930707251;
                    break;
                case 796124270:
                case 1317587583:
                    if (C3577.f13150 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢۙ") + i7) * (-103);
                        i8 = ((iM45029 ^ i6) * 6041) ^ (-691585369);
                        i9 = 1136757198;
                    } else {
                        iM45029 = (i6 - C19806.m45029("ܶᩴ")) * (-81);
                        i8 = ((iM45029 ^ i7) * 1681) ^ (-810205607);
                        i9 = 346578205;
                    }
                    break;
                case 893057409:
                case 1860845175:
                    if (viewM10566 instanceof ViewGroup) {
                        iM45029 = C19806.m45029("ۙܺ") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-7185)) ^ 1395374945;
                        i9 = 830292772;
                    } else {
                        iM45029 = (C19806.m45029("ۨۗ") + i7) * 19;
                        i8 = ((iM45029 ^ i6) * 8993) ^ 152717865;
                        i9 = 1555011492;
                    }
                    break;
                case 990671066:
                case 1250608483:
                    if (C0629.f2722 <= 0) {
                        iM45029 = C19806.m45029("ۖܳ") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-13527)) ^ 1590858520;
                        i9 = 292040061;
                    } else {
                        iM45029 = C19806.m45029("ۚ۫") ^ i7;
                        i8 = ((iM45029 ^ i6) * 18463) ^ (-1436531608);
                        i9 = 350901578;
                    }
                    break;
                case 1144666299:
                case 1726825152:
                    i2 = -1;
                    if (C0962.f3784) {
                        iM45029 = C19806.m45029("۠᩷") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-9109)) ^ 2041074627;
                        i9 = -1126666818;
                    } else {
                        iM45029 = (C19806.m45029("۬ۜ") ^ i6) * 85;
                        i8 = ((iM45029 ^ i7) * 20905) ^ (-539514444);
                        i9 = 1383097247;
                    }
                    break;
                case 1225039461:
                case 1593953391:
                    if (C1977.f7413 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢۙ") + i7) * (-103);
                        i8 = ((iM45029 ^ i6) * 6041) ^ (-691585369);
                        i9 = 1136757198;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟᩵") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-27145)) ^ (-749525814);
                        i9 = -1292994988;
                    }
                    break;
                default:
                    C2332.m7079();
                    if (!C0526.f2219) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ۫") ^ i7;
                        i8 = ((iM45029 ^ i6) * 8665) ^ (-1897768525);
                        i9 = 1374992174;
                    } else {
                        iM45029 = (i6 - C19806.m45029("ܶᩴ")) * (-81);
                        i8 = ((iM45029 ^ i7) * 1681) ^ (-810205607);
                        i9 = 346578205;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo120(Intent intent) {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo130(Intent intent) {
        throw new RuntimeException();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x027e  */
    /* JADX WARN: Code duplicated, block: B:71:0x02ac  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
    
        if (l.C7105.m18985() != false) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m31007(final l.C17381 r34, final android.view.View r35, final android.view.View r36, final android.view.View r37, final android.view.View r38, final android.view.View r39, final android.view.View r40, final android.view.View r41, final android.view.View r42) {
        /*
            Method dump skipped, instruction units count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC12483.m31007(l.ܿܰۙ, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View, java.lang.ref.WeakReference] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m31015() {
        AbstractC3062 abstractC3062M3743 = null;
        EnumC9414 enumC9414Mo9170 = null;
        ?? r2 = 0;
        WeakReference weakReference = null;
        int i = 1731806205;
        int i2 = C3577.f13150;
        int i3 = C1937.f7317;
        int iM45029 = C19806.m45029("ᩳᩴ") ^ i2;
        int i4 = ((iM45029 ^ i3) * (-11559)) ^ (-22547193);
        int i5 = 1076605122;
        while (true) {
            int i6 = iM45029 ^ i5;
            r2 = r2;
            while (true) {
                i = ((((i ^ i3) * 27295) >> 31) & i4) ^ i6;
                switch (i) {
                    case -2091763151:
                    case -1094471158:
                        if (!enumC9414Mo9170.m24173(EnumC9414.STARTED)) {
                            r2 = 0;
                            iM45029 = (ThreadFactoryC3888.m11306("ۧۚ") + i3) * 41;
                            i4 = ((iM45029 ^ i2) * (-32215)) ^ (-473805662);
                            i5 = 1503998248;
                        }
                        int iM11306 = (ThreadFactoryC3888.m11306("ᩳ᩷") ^ i2) * 97;
                        i4 = ((iM11306 ^ i3) * (-8071)) ^ (-999521941);
                        i6 = iM11306 ^ (-1057999599);
                        r2 = 0;
                        break;
                        break;
                    case -1905930169:
                    case 1759679942:
                        weakReference = f41624;
                        if (weakReference == null) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۧۚ") + i3) * 41;
                            i4 = ((iM45029 ^ i2) * (-32215)) ^ (-473805662);
                            i5 = 1503998248;
                            break;
                        }
                        iM45029 = (i3 - C19806.m45029("ᩳܶ")) * 33;
                        i4 = ((iM45029 ^ i2) * (-26593)) ^ (-854960464);
                        i5 = 1971506382;
                        break;
                    case -1755139772:
                    case 2076196384:
                        if (!C1377.f5749) {
                            iM45029 = ThreadFactoryC3888.m11306("۬ۢ") ^ i3;
                            i4 = ((iM45029 ^ i2) * 16719) ^ 1887947421;
                            i5 = -1555838964;
                        } else {
                            iM45029 = (i2 - ThreadFactoryC3888.m11306("ܿ᩻")) * (-67);
                            i4 = ((iM45029 ^ i3) * 14115) ^ 578074595;
                            i5 = 140971198;
                        }
                        break;
                    case -1728635544:
                    case 1332614849:
                        this.f41636 = r2;
                        break;
                    case -1398650701:
                    case 392318788:
                        if (weakReference.get() != this.f41636) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۧۚ") + i3) * 41;
                            i4 = ((iM45029 ^ i2) * (-32215)) ^ (-473805662);
                            i5 = 1503998248;
                            break;
                        }
                        iM45029 = (C19806.m45029("ۜۢ") + i2) * 87;
                        i4 = ((iM45029 ^ i3) * (-31527)) ^ (-1323762860);
                        i5 = -425827577;
                        break;
                    case -1263523238:
                    case -456847216:
                        C3660.m10791();
                        C1937.m6279();
                        iM45029 = (C19806.m45029("ۧܶ") + i3) * 5;
                        i4 = ((iM45029 ^ i2) * 9791) ^ (-2040536867);
                        i5 = 1918315459;
                        break;
                    case -1132755344:
                    case -622478096:
                        abstractC3062M3743 = C0962.m3743(this);
                        if (C1875.f7103 < 0) {
                            iM45029 = ThreadFactoryC3888.m11306("᩹ᩳ") ^ i2;
                            i4 = ((iM45029 ^ i3) * (-30925)) ^ (-1641922562);
                            i5 = -2092185877;
                        } else {
                            iM45029 = (C19806.m45029("ܽۨ") + i3) * 57;
                            i4 = ((iM45029 ^ i2) * 31787) ^ (-390215235);
                            i5 = 1704880591;
                        }
                        break;
                    case -985512282:
                    case 1581100005:
                        enumC9414Mo9170 = abstractC3062M3743.mo9170();
                        if (C2871.f10837 < 0) {
                            iM45029 = (C19806.m45029("ܿᩴ") ^ i2) * (-5);
                            i4 = ((iM45029 ^ i3) * 9947) ^ 309595950;
                            i5 = 2057919379;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("۬ۢ") ^ i3;
                            i4 = ((iM45029 ^ i2) * 16719) ^ 1887947421;
                            i5 = -1555838964;
                        }
                        break;
                    case -950460434:
                    case 2056406968:
                        f41624 = r2;
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۚ") + i3) * 41;
                        i4 = ((iM45029 ^ i2) * (-32215)) ^ (-473805662);
                        i5 = 1503998248;
                        break;
                    case -690274638:
                    case 1224695831:
                        if (!C2871.m8646()) {
                            iM45029 = (C19806.m45029("ܽۨ") + i3) * 57;
                            i4 = ((iM45029 ^ i2) * 31787) ^ (-390215235);
                            i5 = 1704880591;
                            break;
                        }
                        iM45029 = C19806.m45029("ᩳ᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * 25883) ^ (-1654676684);
                        i5 = 953849404;
                        break;
                    case -575979141:
                    case 1589944637:
                        if (C10634.f36300 < 0) {
                            iM45029 = (C19806.m45029("᩸ۗ") ^ i3) * (-41);
                            i4 = ((iM45029 ^ i2) * (-16159)) ^ 1215426621;
                            i5 = -615135942;
                        } else {
                            iM45029 = (C19806.m45029("ܽۨ") + i3) * 57;
                            i4 = ((iM45029 ^ i2) * 31787) ^ (-390215235);
                            i5 = 1704880591;
                        }
                        break;
                    case -452346684:
                    case -104693772:
                        if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            iM45029 = C19806.m45029("ᩳ᩻") ^ i2;
                            i4 = ((iM45029 ^ i3) * 25883) ^ (-1654676684);
                            i5 = 953849404;
                            break;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("۬ۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-16201)) ^ (-1642360320);
                        i5 = -676899933;
                        break;
                    case -387598641:
                    case 1947878515:
                        C0216.m1591();
                        C0797.m3359();
                        break;
                    case -355166252:
                    case 1972553883:
                        if (!CallableC1627.f6528) {
                            iM45029 = ThreadFactoryC3888.m11306("᩹۠") ^ i2;
                            i4 = ((iM45029 ^ i3) * (-21193)) ^ 890632821;
                            i5 = 2114677060;
                        } else {
                            iM45029 = (C19806.m45029("ۡۖ") ^ i3) * (-51);
                            i4 = ((iM45029 ^ i2) * (-29451)) ^ 1041281095;
                            i5 = 1910998703;
                        }
                        break;
                    case -123527312:
                    case 428198818:
                        if (C1377.m4833() == 0) {
                            iM45029 = (i3 - C19806.m45029("֡ܳ")) * 81;
                            i4 = ((iM45029 ^ i2) * 19009) ^ 502814270;
                            i5 = -928838890;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("᩹۠") ^ i2;
                            i4 = ((iM45029 ^ i3) * (-21193)) ^ 890632821;
                            i5 = 2114677060;
                        }
                        break;
                    case 414698807:
                    case 589796915:
                        C0526.m2437();
                        if (C0629.f2722 <= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("᩹۠") ^ i2;
                            i4 = ((iM45029 ^ i3) * (-21193)) ^ 890632821;
                            i5 = 2114677060;
                            break;
                        }
                        iM45029 = (C19806.m45029("ۧܶ") + i3) * 5;
                        i4 = ((iM45029 ^ i2) * 9791) ^ (-2040536867);
                        i5 = 1918315459;
                        break;
                        break;
                    case 788782391:
                    case 2022554551:
                        if (C2788.f10625 < 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ۧۗ") ^ i3;
                            i4 = ((iM45029 ^ i2) * 3761) ^ 1175039210;
                            i5 = -1870882915;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("۬ۢ") ^ i3;
                            i4 = ((iM45029 ^ i2) * 16719) ^ 1887947421;
                            i5 = -1555838964;
                        }
                        break;
                    case 1298844831:
                    case 1319854456:
                        if (C3577.f13150 < 0) {
                            iM45029 = (C19806.m45029("ۘۖ") ^ i2) * (-53);
                            i4 = ((iM45029 ^ i3) * 23259) ^ (-270096327);
                            i5 = 431748091;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("᩹۠") ^ i2;
                            i4 = ((iM45029 ^ i3) * (-21193)) ^ 890632821;
                            i5 = 2114677060;
                        }
                        break;
                    case 1322414436:
                    case 1961775141:
                        if (ThreadFactoryC3888.f14547 > 0) {
                            iM45029 = (i3 - C19806.m45029("᩺ܳ")) * (-63);
                            i4 = ((iM45029 ^ i2) * 615) ^ (-1731001614);
                            i5 = 942185170;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("᩹۠") ^ i2;
                            i4 = ((iM45029 ^ i3) * (-21193)) ^ 890632821;
                            i5 = 2114677060;
                        }
                        break;
                    default:
                        C3743.m10966();
                        if (C1937.f7317 >= 0) {
                            iM45029 = (C19806.m45029("ܽۨ") + i3) * 57;
                            i4 = ((iM45029 ^ i2) * 31787) ^ (-390215235);
                            i5 = 1704880591;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("᩹۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-21193)) ^ 890632821;
                        i5 = 2114677060;
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0085 A[PHI: r2
      0x0085: PHI (r2v4 boolean) = (r2v3 boolean), (r2v2 boolean), (r2v2 boolean), (r2v2 boolean) binds: [B:25:0x0083, B:15:0x0048, B:13:0x0045, B:7:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0175  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a5 A[PHI: r0 r8
      0x01a5: PHI (r0v6 boolean) = (r0v5 boolean), (r0v2 boolean), (r0v2 boolean), (r0v2 boolean), (r0v2 boolean), (r0v2 boolean) binds: [B:56:0x01a3, B:48:0x0159, B:40:0x010e, B:36:0x00f1, B:21:0x0062, B:10:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x01a5: PHI (r8v8 java.util.WeakHashMap) = 
      (r8v4 java.util.WeakHashMap)
      (r8v4 java.util.WeakHashMap)
      (r8v4 java.util.WeakHashMap)
      (r8v5 java.util.WeakHashMap)
      (r8v4 java.util.WeakHashMap)
      (r8v4 java.util.WeakHashMap)
     binds: [B:56:0x01a3, B:48:0x0159, B:40:0x010e, B:36:0x00f1, B:21:0x0062, B:10:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    public AbstractActivityC12483() {
        int iM45029;
        int i;
        boolean z = false;
        boolean z2 = false;
        int i2 = -765806341;
        int i3 = ThreadFactoryC3888.f14547;
        int i4 = C1668.f6641;
        int iM450210 = C19806.m45029("۟ۜ") ^ i3;
        int i5 = ((iM450210 ^ i4) * (-10071)) ^ 2065025289;
        int i6 = -10249669;
        while (true) {
            int i7 = iM450210 ^ i6;
            WeakHashMap weakHashMap = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-22949)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1834100991:
                    case 1590882183:
                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            iM45029 = ThreadFactoryC3888.m11306("ܺ᩹") ^ i3;
                            i5 = ((iM45029 ^ i4) * 3253) ^ 2061949690;
                            i = -1617860518;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ۡܿ") + i3) * (-107);
                            i5 = ((iM45029 ^ i4) * 30207) ^ 2080457109;
                            i = 595607514;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1754130189:
                    case -1722595709:
                        this.f41641 = Collections.newSetFromMap(weakHashMap);
                        if (RunnableC1606.f6488 >= 0) {
                            iM45029 = C19806.m45029("᩺᩸") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-25461)) ^ 1320388015;
                            i = -1536071587;
                        } else {
                            iM45029 = C19806.m45029("֨ۤ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-8717)) ^ 2109207151;
                            i = -1998508141;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1579761958:
                    case 530281776:
                        this.f41638 = z;
                        z2 = false;
                        if (C0278.m1789() <= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("۠᩵") + i3) * 75;
                            i5 = ((iM45029 ^ i4) * 30461) ^ 882301123;
                            i = -347510896;
                        } else {
                            iM45029 = (C19806.m45029("᩺ۧ") ^ i3) * 19;
                            i5 = ((iM45029 ^ i4) * 13751) ^ (-1244404709);
                            i = 992678891;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1540949949:
                    case -521676132:
                        ViewTreeObserverOnPreDrawListenerC3327.m9874();
                        throw new RuntimeException();
                    case -1501691427:
                    case -1459565598:
                        z = true;
                        this.f41637 = true;
                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            iM45029 = C19806.m45029("ܶۚ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-1181)) ^ (-420379354);
                            i = 1592705428;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ۡܿ") + i3) * (-107);
                            i5 = ((iM45029 ^ i4) * 30207) ^ 2080457109;
                            i = 595607514;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1408921893:
                    case 101168385:
                        if (C1419.f5860 < 0) {
                            iM45029 = (C19806.m45029("ۡ᩺") ^ i3) * 29;
                            i5 = ((iM45029 ^ i4) * (-25479)) ^ (-1298313536);
                            i = 1542410600;
                            i7 = iM45029 ^ i;
                        }
                        break;
                    case -1020539057:
                    case 143502836:
                        if (C2788.f10625 >= 0) {
                            iM45029 = C19806.m45029("֡۬") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-2925)) ^ 638904265;
                            i = -770515230;
                        } else {
                            iM45029 = (i4 - C19806.m45029("᩵ܳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i5 = ((iM45029 ^ i3) * (-25221)) ^ 1831569966;
                            i = -562258411;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -947316624:
                    case 1472133934:
                        MenuItemOnMenuItemClickListenerC3244.m9701();
                        if (C2477.m7593() >= 0) {
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("۠᩵") + i3) * 75;
                        i5 = ((iM45029 ^ i4) * 30461) ^ 882301123;
                        i = -347510896;
                        i7 = iM45029 ^ i;
                        break;
                    case -929492465:
                    case 1164478230:
                        C2788.m8472();
                        C0526.m2437();
                        iM45029 = (ThreadFactoryC3888.m11306("۠᩵") + i3) * 75;
                        i5 = ((iM45029 ^ i4) * 30461) ^ 882301123;
                        i = -347510896;
                        i7 = iM45029 ^ i;
                        break;
                    case -920882920:
                    case 1587630083:
                        this.f41632 = null;
                        this.f41642 = z2;
                        return;
                    case -906880991:
                    case 157442031:
                        if (C1398.m4895() > 0) {
                            weakHashMap = new WeakHashMap();
                            if (C2871.f10837 >= 0) {
                                iM45029 = (ThreadFactoryC3888.m11306("ۡܿ") + i3) * (-107);
                                i5 = ((iM45029 ^ i4) * 30207) ^ 2080457109;
                                i = 595607514;
                            } else {
                                iM45029 = (i4 - C19806.m45029("ܰ֡")) * (-59);
                                i5 = ((iM45029 ^ i3) * 14647) ^ 651888254;
                                i = -2121136747;
                            }
                            i7 = iM45029 ^ i;
                        }
                        break;
                    case -582261052:
                    case 856214524:
                        C3577.m10565();
                        if (C0278.m1789() > 0) {
                            iM45029 = C19806.m45029("֡۬") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-2925)) ^ 638904265;
                            i = -770515230;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ۡܿ") + i3) * (-107);
                            i5 = ((iM45029 ^ i4) * 30207) ^ 2080457109;
                            i = 595607514;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -406283104:
                    case -397333371:
                        if (C1189.f5284 <= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۡܿ") + i3) * (-107);
                            i5 = ((iM45029 ^ i4) * 30207) ^ 2080457109;
                            i = 595607514;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ܺۖ") ^ i4) * 31;
                            i5 = ((iM45029 ^ i3) * (-10395)) ^ (-283035897);
                            i = 1371573020;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case 466243383:
                    case 1376140384:
                        this.f41633 = z2;
                        if (C0050.f912 <= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۡܿ") + i3) * (-107);
                            i5 = ((iM45029 ^ i4) * 30207) ^ 2080457109;
                            i = 595607514;
                        } else {
                            iM45029 = (C19806.m45029("ۘۡ") + i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i5 = ((iM45029 ^ i3) * 6157) ^ (-210031817);
                            i = 1740103872;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    default:
                        C1875.m6086();
                        if (C1875.f7103 >= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("۠᩵") + i3) * 75;
                            i5 = ((iM45029 ^ i4) * 30461) ^ 882301123;
                            i = -347510896;
                        } else {
                            iM45029 = C19806.m45029("֡۬") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-2925)) ^ 638904265;
                            i = -770515230;
                        }
                        i7 = iM45029 ^ i;
                        break;
                }
            }
            iM450210 = (i3 - ThreadFactoryC3888.m11306("ۚܺ")) * (-127);
            i5 = ((iM450210 ^ i4) * (-20771)) ^ (-1232254772);
            i6 = 41203116;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30996(int i, int i2, boolean z) {
        int i3 = 262326342;
        int i4 = C2642.f10294;
        int i5 = C1460.f5948;
        int iM11306 = (i5 - ThreadFactoryC3888.m11306("᩻᩸")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
        int i6 = ((iM11306 ^ i4) * (-17055)) ^ 1992365899;
        int i7 = -1799984259;
        while (true) {
            i3 = ((((i3 ^ i4) * 30209) >> 31) & i6) ^ (iM11306 ^ i7);
            switch (i3) {
                case -2034720909:
                case 532218883:
                    if (CallableC1627.f6528) {
                        iM11306 = (C19806.m45029("ۗᩳ") ^ i5) * 77;
                        i6 = ((iM11306 ^ i4) * 16559) ^ (-2122135896);
                        i7 = 793165370;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩷") ^ i4;
                        i6 = ((iM11306 ^ i5) * 12673) ^ 1122511184;
                        i7 = 1743834972;
                    }
                    break;
                case -1947782961:
                case -365319226:
                    if (C2332.f8260) {
                        iM11306 = (C19806.m45029("ܺۧ") ^ i5) * (-85);
                        i6 = ((iM11306 ^ i4) * (-21879)) ^ 1174731872;
                        i7 = 1425643232;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿۛ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-32687)) ^ (-1181807751);
                        i7 = 448594470;
                    }
                    break;
                case -1878753765:
                case 287035431:
                    m30997(i, C0817.m3412(this, i2), z);
                    break;
                case -1779149917:
                case 1567785916:
                    if (C1377.f5749) {
                        iM11306 = C19806.m45029("ۖۙ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 26135) ^ 712310330;
                        i7 = 754301301;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩷") ^ i4;
                        i6 = ((iM11306 ^ i5) * 12673) ^ 1122511184;
                        i7 = 1743834972;
                    }
                    break;
                case -1241983496:
                case 2091867096:
                    if (RunnableC1564.m5345()) {
                        iM11306 = (C19806.m45029("ᩴ۬") + i5) * 85;
                        i6 = ((iM11306 ^ i4) * 22781) ^ 2068957254;
                        i7 = -1303140537;
                    } else {
                        iM11306 = C19806.m45029("֡᩷") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-9631)) ^ 49619678;
                        i7 = 1538001353;
                    }
                    break;
                case -1078311799:
                case -418738323:
                    if (C2704.m8255() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿۛ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-32687)) ^ (-1181807751);
                        i7 = 448594470;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ۧ") ^ i4) * (-85);
                        i6 = ((iM11306 ^ i5) * (-21979)) ^ 2040312658;
                        i7 = -601666045;
                    }
                    break;
                case -1062085554:
                case 716217964:
                    if (C2788.f10625 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩷") ^ i4;
                        i6 = ((iM11306 ^ i5) * 12673) ^ 1122511184;
                        i7 = 1743834972;
                    } else {
                        iM11306 = (i4 - C19806.m45029("᩵᩵")) * (-55);
                        i6 = ((iM11306 ^ i5) * (-13455)) ^ 6331372;
                        i7 = 704095721;
                    }
                    break;
                case -855692806:
                case -404105726:
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM11306 = (C19806.m45029("ۧܳ") + i4) * 57;
                        i6 = ((iM11306 ^ i5) * (-17757)) ^ (-1723298773);
                        i7 = -1334761792;
                    } else {
                        iM11306 = (C19806.m45029("ᩴ۬") + i5) * 85;
                        i6 = ((iM11306 ^ i4) * 22781) ^ 2068957254;
                        i7 = -1303140537;
                    }
                    break;
                case -812567633:
                case 862853516:
                    if (C2642.f10294 <= 0) {
                        iM11306 = (C19806.m45029("ۧܳ") + i4) * 57;
                        i6 = ((iM11306 ^ i5) * (-17757)) ^ (-1723298773);
                        i7 = -1334761792;
                    } else {
                        iM11306 = C19806.m45029("ۘۨ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 6441) ^ 1889378879;
                        i7 = -416671506;
                    }
                    break;
                case -671872855:
                case 1368035762:
                    if (C1977.f7413 <= 0) {
                        iM11306 = (C19806.m45029("ᩴ۬") + i5) * 85;
                        i6 = ((iM11306 ^ i4) * 22781) ^ 2068957254;
                        i7 = -1303140537;
                    } else {
                        iM11306 = (C19806.m45029("᩵۬") + i4) * 55;
                        i6 = ((iM11306 ^ i5) * 187) ^ 1045674146;
                        i7 = 1090503848;
                    }
                    break;
                case -125471814:
                case 2020296074:
                    RunnableC0195.m1431();
                    RunnableC0195.m1431();
                    break;
                case -22322964:
                case 1275627621:
                    C10634.m26820();
                    iM11306 = ThreadFactoryC3888.m11306("۫᩷") ^ i4;
                    i6 = ((iM11306 ^ i5) * 12673) ^ 1122511184;
                    i7 = 1743834972;
                    break;
                case 54281800:
                case 1636826251:
                    if (C1668.f6641 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖۜ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-20291)) ^ (-1331980198);
                        i7 = 67078514;
                    } else {
                        iM11306 = C19806.m45029("᩸᩷") ^ i5;
                        i6 = ((iM11306 ^ i4) * 10439) ^ 1373335934;
                        i7 = 870433760;
                    }
                    break;
                case 249519745:
                case 907183819:
                    if (C0216.m1591() > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿۛ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-32687)) ^ (-1181807751);
                        i7 = 448594470;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩷") ^ i4;
                        i6 = ((iM11306 ^ i5) * 12673) ^ 1122511184;
                        i7 = 1743834972;
                    }
                    break;
                case 275289129:
                case 1704292418:
                    if (C1875.f7103 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖۜ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-20291)) ^ (-1331980198);
                        i7 = 67078514;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳۙ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-6013)) ^ (-3108958);
                        i7 = -1885347289;
                    }
                    break;
                default:
                    if (!C0962.f3784) {
                        iM11306 = (C19806.m45029("ᩴ۬") + i5) * 85;
                        i6 = ((iM11306 ^ i4) * 22781) ^ 2068957254;
                        i7 = -1303140537;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿۛ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-32687)) ^ (-1181807751);
                        i7 = 448594470;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.ActivityC4866, l.ActivityC10074, l.ActivityC1086, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        boolean z = false;
        boolean z2 = false;
        Throwable th = null;
        boolean z3 = false;
        boolean zM45991 = false;
        int i = -917582112;
        int i2 = C1460.f5948;
        int i3 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM11306 = (i3 - ThreadFactoryC3888.m11306("᩵ܶ")) * 59;
        int i4 = ((iM11306 ^ i2) * (-31817)) ^ 356371005;
        int i5 = -230807561;
        while (true) {
            i = ((((i ^ i2) * 12211) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2011008278:
                case -659982852:
                    z3 = this.f41631;
                    zM45991 = C20368.m45991();
                    iM11306 = ThreadFactoryC3888.m11306("ܰۨ") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-20805)) ^ (-1085354036);
                    i5 = 366497223;
                    break;
                case -1881071720:
                case -958714462:
                    if (!RunnableC3388.m10064()) {
                        iM11306 = C19806.m45029("᩸ۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 10347) ^ (-1348295697);
                        i5 = -1522152148;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ܿۜ")) * 35;
                        i4 = ((iM11306 ^ i2) * (-3879)) ^ (-512036224);
                        i5 = -828198593;
                    }
                    break;
                case -1793391250:
                case 771797360:
                    super.onConfigurationChanged(configuration);
                    z2 = this.f41637;
                    iM11306 = (ThreadFactoryC3888.m11306("ۛۘ") + i3) * (-59);
                    i4 = ((iM11306 ^ i2) * (-10535)) ^ 1107505224;
                    i5 = -1214546803;
                    break;
                case -1781503734:
                case -288550228:
                    this.f41642 = true;
                    z = false;
                    iM11306 = (ThreadFactoryC3888.m11306("᩺ܰ") + i3) * q.h;
                    i4 = ((iM11306 ^ i2) * 28555) ^ 1864223099;
                    i5 = 176415767;
                    break;
                case -1724472835:
                case 2067672794:
                    if (this.f41642) {
                        iM11306 = (C19806.m45029("۠᩸") ^ i3) * 123;
                        i4 = ((iM11306 ^ i2) * 8645) ^ 306750356;
                        i5 = -2058767314;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * 22119) ^ (-189429601);
                        i5 = 182133316;
                    }
                    break;
                case -1497604570:
                case -238146103:
                    if (z3 != zM45991) {
                        iM11306 = (C19806.m45029("۬ۚ") + i2) * (-63);
                        i4 = ((iM11306 ^ i3) * 4311) ^ 1029023053;
                        i5 = -46276480;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۨ") + i2) * (-41);
                        i4 = ((iM11306 ^ i3) * (-26301)) ^ (-1572486930);
                        i5 = 1108999925;
                    }
                    break;
                case -1491334908:
                case 1901529145:
                    if (C3535.f13026 <= 0) {
                        iM11306 = C19806.m45029("۬֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * 1043) ^ 36120817;
                        i5 = -1025307685;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ܿۜ")) * 35;
                        i4 = ((iM11306 ^ i2) * (-3879)) ^ (-512036224);
                        i5 = -828198593;
                    }
                    break;
                case -1432229812:
                case -708517151:
                    this.f41642 = z;
                    throw th;
                case -1338558927:
                case -175558513:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM11306 = C19806.m45029("ۖ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-7727)) ^ (-1178918211);
                        i5 = 1811366136;
                    } else {
                        iM11306 = (C19806.m45029("۠ۨ") ^ i2) * 31;
                        i4 = ((iM11306 ^ i3) * 13151) ^ 722428748;
                        i5 = 2022156578;
                    }
                    break;
                case -1165812836:
                case 587430564:
                    try {
                        mo135();
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۨ") + i2) * (-41);
                        i4 = ((iM11306 ^ i3) * (-26301)) ^ (-1572486930);
                        i5 = 1108999925;
                    } catch (Throwable th2) {
                        th = th2;
                        iM11306 = ThreadFactoryC3888.m11306("ۤۡ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-12569)) ^ 554025289;
                        i5 = 1320661383;
                    }
                    break;
                case -1034505401:
                case -432834784:
                    if (C0278.f1572 <= 0) {
                        iM11306 = C19806.m45029("᩸ۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 10347) ^ (-1348295697);
                        i5 = -1522152148;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19601) ^ (-23541884);
                        i5 = 1682795313;
                    }
                    break;
                case -984857300:
                case 311065971:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ܿۜ")) * 35;
                        i4 = ((iM11306 ^ i2) * (-3879)) ^ (-512036224);
                        i5 = -828198593;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * 5519) ^ (-1610217138);
                        i5 = -500559314;
                    }
                    break;
                case -846470959:
                case 723807433:
                    C0671.m3008();
                    iM11306 = (C19806.m45029("ܰᩴ") ^ i3) * 57;
                    i4 = ((iM11306 ^ i2) * (-19015)) ^ 323959764;
                    i5 = 882491658;
                    break;
                case -651722565:
                case 1222308288:
                    super.onConfigurationChanged(configuration);
                    return;
                case -621096580:
                case 773535690:
                    if (C0797.f3386) {
                        iM11306 = (i3 - C19806.m45029("ܿۜ")) * 35;
                        i4 = ((iM11306 ^ i2) * (-3879)) ^ (-512036224);
                        i5 = -828198593;
                    } else {
                        iM11306 = C19806.m45029("ۡܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 25619) ^ 1273035298;
                        i5 = 288751603;
                    }
                    break;
                case -500729191:
                case 104624532:
                    if (C1875.m6086() != 0) {
                        iM11306 = C19806.m45029("᩸ۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 10347) ^ (-1348295697);
                        i5 = -1522152148;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-6283)) ^ (-1512792610);
                        i5 = -1638020696;
                    }
                    break;
                case -459514803:
                case 123227890:
                    if (C0050.f912 <= 0) {
                        iM11306 = C19806.m45029("ۖ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-7727)) ^ (-1178918211);
                        i5 = 1811366136;
                    } else {
                        iM11306 = C19806.m45029("᩵᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * 15999) ^ (-322181380);
                        i5 = -633375287;
                    }
                    break;
                case -394103259:
                case 1607943012:
                    if (AbstractC0464.m2313() != 0) {
                        iM11306 = (C19806.m45029("ܰᩴ") ^ i3) * 57;
                        i4 = ((iM11306 ^ i2) * (-19015)) ^ 323959764;
                        i5 = 882491658;
                    } else {
                        iM11306 = C19806.m45029("ᩴ᩻") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-25733)) ^ 860678868;
                        i5 = -904987397;
                    }
                    break;
                case -314637551:
                case 286533056:
                    C0526.m2437();
                    return;
                case -69871709:
                case 1405684969:
                    if (z2) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩷ܿ")) * 13;
                        i4 = ((iM11306 ^ i2) * (-14545)) ^ 21022317;
                        i5 = -1529651159;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۨ") + i2) * (-41);
                        i4 = ((iM11306 ^ i3) * (-26301)) ^ (-1572486930);
                        i5 = 1108999925;
                    }
                    break;
                case -33707086:
                case 1668560295:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 21435) ^ (-224050286);
                        i5 = 102573871;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۢ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3851) ^ (-878309002);
                        i5 = 9045249;
                    }
                    break;
                case 136336884:
                case 1063205823:
                    if (C1189.f5284 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ܿۜ")) * 35;
                        i4 = ((iM11306 ^ i2) * (-3879)) ^ (-512036224);
                        i5 = -828198593;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-19803)) ^ 1168150289;
                        i5 = -1119552026;
                    }
                    break;
                case 153535141:
                case 474355775:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = C19806.m45029("۬֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * 1043) ^ 36120817;
                        i5 = -1025307685;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠֫") + i2) * 3;
                        i4 = ((iM11306 ^ i3) * 21025) ^ 269155489;
                        i5 = -818801628;
                    }
                    break;
                case 653611608:
                case 1432358261:
                    if (C1875.f7103 >= 0) {
                        iM11306 = (i3 - C19806.m45029("ܿۜ")) * 35;
                        i4 = ((iM11306 ^ i2) * (-3879)) ^ (-512036224);
                        i5 = -828198593;
                    } else {
                        iM11306 = (C19806.m45029("ܰᩴ") ^ i3) * 57;
                        i4 = ((iM11306 ^ i2) * (-19015)) ^ 323959764;
                        i5 = 882491658;
                    }
                    break;
                case 655338376:
                case 978882448:
                    this.f41642 = z;
                    return;
                default:
                    if (C1398.f5802 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 21435) ^ (-224050286);
                        i5 = 102573871;
                    } else {
                        iM11306 = (C19806.m45029("ܰᩴ") ^ i3) * 57;
                        i4 = ((iM11306 ^ i2) * (-19015)) ^ 323959764;
                        i5 = 882491658;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int[] m30991(View view) {
        int paddingLeft = 0;
        int paddingTop = 0;
        int paddingRight = 0;
        int i = 2090581333;
        int i2 = C3535.f13026;
        int i3 = C1875.f7103;
        int iM11306 = (ThreadFactoryC3888.m11306("᩶ۤ") ^ i2) * (-125);
        int i4 = ((iM11306 ^ i3) * 13487) ^ (-1590044933);
        int i5 = 1339936606;
        while (true) {
            i = ((((i ^ i3) * 11391) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2136229692:
                case 502973809:
                    if (C2124.f7782 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧ֫") + i3) * 9;
                        i4 = ((iM11306 ^ i2) * (-26903)) ^ (-1040259017);
                        i5 = -1038260682;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 15781) ^ (-1567741794);
                        i5 = 565070810;
                    }
                    break;
                case -2056338502:
                case -1642612922:
                    if (C1398.f5802 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺۫") + i2) * 85;
                        i4 = ((iM11306 ^ i3) * (-5789)) ^ (-1370334894);
                        i5 = 1785892109;
                    } else {
                        iM11306 = C19806.m45029("ܺܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-26195)) ^ 996872203;
                        i5 = 382956571;
                    }
                    break;
                case -2032398353:
                case -1527647506:
                    if (!RunnableC1564.f6300) {
                        iM11306 = (C19806.m45029("ۘۜ") + i3) * 59;
                        i4 = ((iM11306 ^ i2) * (-27813)) ^ 1417938141;
                        i5 = -1000643476;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ۡ") ^ i2) * 13;
                        i4 = ((iM11306 ^ i3) * (-6759)) ^ 349222193;
                        i5 = 1299084588;
                    }
                    break;
                case -1828094503:
                case 1280165744:
                    C1189.m4368();
                    C0278.m1789();
                    iM11306 = (C19806.m45029("ۘۜ") + i3) * 59;
                    i4 = ((iM11306 ^ i2) * (-27813)) ^ 1417938141;
                    i5 = -1000643476;
                    break;
                case -1718987929:
                case 1733889332:
                    if (C2332.f8260) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛܺ") + i2) * (-19);
                        i4 = ((iM11306 ^ i3) * (-23095)) ^ 1613484481;
                        i5 = -542337133;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ۡ") ^ i2) * 13;
                        i4 = ((iM11306 ^ i3) * (-6759)) ^ 349222193;
                        i5 = 1299084588;
                    }
                    break;
                case -1706799863:
                case -1297411186:
                    return null;
                case -1145843003:
                case 1228123972:
                    if (RunnableC1564.m5345()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧ֫") + i3) * 9;
                        i4 = ((iM11306 ^ i2) * (-26903)) ^ (-1040259017);
                        i5 = -1038260682;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘۢ") ^ i2) * (-71);
                        i4 = ((iM11306 ^ i3) * (-13833)) ^ 710172381;
                        i5 = 344629534;
                    }
                    break;
                case -1124842211:
                case 1274930008:
                    if (C10634.f36300 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧ֫") + i3) * 9;
                        i4 = ((iM11306 ^ i2) * (-26903)) ^ (-1040259017);
                        i5 = -1038260682;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ۡ") ^ i2) * 13;
                        i4 = ((iM11306 ^ i3) * (-6759)) ^ 349222193;
                        i5 = 1299084588;
                    }
                    break;
                case -814858954:
                case -44373668:
                    paddingLeft = view.getPaddingLeft();
                    paddingTop = view.getPaddingTop();
                    if (CallableC1627.f6528) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶ᩵") + i3) * (-119);
                        i4 = ((iM11306 ^ i2) * (-7279)) ^ (-111553904);
                        i5 = 842135147;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ۡ") ^ i2) * 13;
                        i4 = ((iM11306 ^ i3) * (-6759)) ^ 349222193;
                        i5 = 1299084588;
                    }
                    break;
                case -480305104:
                case 1344718337:
                    if (C3722.f13525 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ᩸") ^ i3) * (-5);
                        i4 = ((iM11306 ^ i2) * 22757) ^ 618157413;
                        i5 = 1261627303;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧܿ") + i3) * (-17);
                        i4 = ((iM11306 ^ i2) * (-15235)) ^ (-1055492232);
                        i5 = -457063567;
                    }
                    break;
                case -254187865:
                case -210668762:
                    C1025.m3861();
                    C3577.m10565();
                    return null;
                case 105045506:
                case 393333779:
                    return new int[]{paddingLeft, paddingTop, paddingRight, view.getPaddingBottom()};
                case 328925278:
                case 1304447361:
                    paddingRight = view.getPaddingRight();
                    if (C1377.m4833() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ᩸") ^ i3) * (-5);
                        i4 = ((iM11306 ^ i2) * 22757) ^ 618157413;
                        i5 = 1261627303;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۘܽ")) * (-63);
                        i4 = ((iM11306 ^ i3) * (-21431)) ^ (-1235674594);
                        i5 = 2138504745;
                    }
                    break;
                case 541271918:
                case 2081769523:
                    if (RunnableC1564.f6300) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ᩸") ^ i3) * (-5);
                        i4 = ((iM11306 ^ i2) * 22757) ^ 618157413;
                        i5 = 1261627303;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27261)) ^ (-1306687511);
                        i5 = -123034285;
                    }
                    break;
                case 590646816:
                case 697961405:
                    if (C0050.m946() > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺۫") + i2) * 85;
                        i4 = ((iM11306 ^ i3) * (-5789)) ^ (-1370334894);
                        i5 = 1785892109;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧ֫") + i3) * 9;
                        i4 = ((iM11306 ^ i2) * (-26903)) ^ (-1040259017);
                        i5 = -1038260682;
                    }
                    break;
                case 1038593301:
                case 1501852951:
                    if (C0629.f2722 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧ֫") + i3) * 9;
                        i4 = ((iM11306 ^ i2) * (-26903)) ^ (-1040259017);
                        i5 = -1038260682;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۨ۟")) * (-3);
                        i4 = ((iM11306 ^ i2) * 7135) ^ (-2037530198);
                        i5 = 597008047;
                    }
                    break;
                case 1313000161:
                case 2119085125:
                    if (C0050.f912 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ۡ") ^ i2) * 13;
                        i4 = ((iM11306 ^ i3) * (-6759)) ^ 349222193;
                        i5 = 1299084588;
                    } else {
                        iM11306 = (C19806.m45029("۬֫") ^ i3) * (-75);
                        i4 = ((iM11306 ^ i2) * (-13359)) ^ (-1997035772);
                        i5 = 1213134395;
                    }
                    break;
                default:
                    if (view == null) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۧۗ")) * (-17);
                        i4 = ((iM11306 ^ i2) * (-3567)) ^ (-1683756405);
                        i5 = -748205859;
                    } else {
                        iM11306 = C19806.m45029("ۗ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19121) ^ (-1791453993);
                        i5 = -1564853444;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01d0 A[PHI: r2 r9 r10 r14 r18
      0x01d0: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v4 java.lang.String) binds: [B:51:0x01ce, B:35:0x010d, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:51:0x01ce, B:35:0x010d, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:51:0x01ce, B:35:0x010d, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:51:0x01ce, B:35:0x010d, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r18v18 boolean) = (r18v11 boolean), (r18v17 boolean), (r18v19 boolean) binds: [B:51:0x01ce, B:35:0x010d, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x020a A[PHI: r6 r7 r8 r18
      0x020a: PHI (r6v4 char) = (r6v3 char), (r6v2 char) binds: [B:59:0x022d, B:55:0x0208] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r7v3 short) = (r7v2 short), (r7v4 short) binds: [B:59:0x022d, B:55:0x0208] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r8v3 short) = (r8v2 short), (r8v4 short) binds: [B:59:0x022d, B:55:0x0208] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r18v9 boolean) = (r18v8 boolean), (r18v10 boolean) binds: [B:59:0x022d, B:55:0x0208] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0297 A[PHI: r11 r18
      0x0297: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v6 int) binds: [B:16:0x006c, B:68:0x0295, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0297: PHI (r18v30 boolean) = (r18v2 boolean), (r18v6 boolean), (r18v34 boolean) binds: [B:16:0x006c, B:68:0x0295, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31018(int i) {
        int iM11306;
        int i2;
        int i3;
        int i4 = C1419.f5860;
        int i5 = C2871.f10837;
        int iM11307 = ThreadFactoryC3888.m11306("᩹ۤ") ^ i5;
        int i6 = ((iM11307 ^ i4) * (-25511)) ^ 206728193;
        String strM26821 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM11307 ^ 2146682259;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 118171533;
        while (true) {
            i15 = i7 ^ (i6 & (((i15 ^ i4) * 24271) >> 31));
            switch (i15) {
                case -2083097081:
                case 744739889:
                    m30996(i8 ^ i9, i, z);
                    break;
                case -2002064733:
                case 870829289:
                    strM26821 = C10634.m26821(sArr2, i14, 3, i13);
                    if (C2332.m7079() <= 0) {
                        z = z;
                        iM11306 = ThreadFactoryC3888.m11306("۟ۖ") ^ i5;
                        i2 = ((iM11306 ^ i4) * 25661) ^ 782669426;
                        i3 = -571872330;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗ֨") ^ i4;
                        z = z;
                        i2 = ((iM11306 ^ i5) * 17035) ^ (-1216904201);
                        i3 = -1607876273;
                    }
                    boolean z2 = z;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    z = z2;
                    break;
                case -1919889167:
                case -1915368772:
                    z = z;
                    i14 = 426;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۖ") ^ i5;
                        i2 = ((iM11306 ^ i4) * 25661) ^ 782669426;
                        i3 = -571872330;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ᩳ") ^ i5) * (-43);
                        i2 = ((iM11306 ^ i4) * (-27561)) ^ (-1306707138);
                        i3 = 2032248437;
                    }
                    boolean z3 = z;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    z = z3;
                    break;
                case -1858957418:
                case 383752096:
                    i13 = 23348;
                    iM11306 = C19806.m45029("֫ܺ") ^ i4;
                    i2 = ((iM11306 ^ i5) * (-28717)) ^ 2129824247;
                    i3 = -1994189878;
                    boolean z4 = z;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    z = z4;
                    break;
                case -1847573623:
                case -1356655903:
                    if (C2642.f10294 <= 0) {
                        z = z;
                        iM11306 = ThreadFactoryC3888.m11306("۟ۖ") ^ i5;
                        i2 = ((iM11306 ^ i4) * 25661) ^ 782669426;
                        i3 = -571872330;
                        boolean z5 = z;
                        i7 = iM11306 ^ i3;
                        i6 = i2;
                        z = z5;
                    } else {
                        int iM11308 = (i5 - ThreadFactoryC3888.m11306("۠᩻")) * 35;
                        i7 = iM11308 ^ (-1029503751);
                        i6 = ((iM11308 ^ i4) * 23675) ^ 1171423673;
                    }
                    break;
                case -1637249754:
                case -1287053543:
                    z = z;
                    c = 425;
                    if (C10634.f36300 >= 0) {
                        z = z;
                        iM11306 = ThreadFactoryC3888.m11306("ۤۧ") ^ i4;
                        z = z;
                        i2 = ((iM11306 ^ i5) * (-17693)) ^ (-1193963561);
                        i3 = 2055456536;
                    } else {
                        iM11306 = C19806.m45029("ۨۜ") ^ i4;
                        i2 = ((iM11306 ^ i5) * 27211) ^ 21827174;
                        i3 = -605028671;
                    }
                    boolean z6 = z;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    z = z6;
                    break;
                case -1452832973:
                case 1552133215:
                    sArr2 = f41626;
                    if (C2249.m6915() <= 0) {
                        z = false;
                        iM11306 = ThreadFactoryC3888.m11306("ۤۧ") ^ i4;
                        z = z;
                        i2 = ((iM11306 ^ i5) * (-17693)) ^ (-1193963561);
                        i3 = 2055456536;
                        boolean z7 = z;
                        i7 = iM11306 ^ i3;
                        i6 = i2;
                        z = z7;
                    } else {
                        int iM45029 = C19806.m45029("۟ܶ") ^ i5;
                        i7 = iM45029 ^ 1063263818;
                        i6 = ((iM45029 ^ i4) * (-32165)) ^ (-148694570);
                        z = false;
                    }
                    break;
                case -1301809184:
                case -855577452:
                    z = z;
                    if (C2249.f8050 >= 0) {
                        iM11306 = C19806.m45029("ۗۢ") ^ i4;
                        i2 = ((iM11306 ^ i5) * (-955)) ^ (-1420181825);
                        i3 = -1121614297;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۗ") ^ i5;
                        i2 = ((iM11306 ^ i4) * 5561) ^ (-347339576);
                        i3 = -687015743;
                    }
                    boolean z8 = z;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    z = z8;
                    break;
                case -1273839094:
                case 837005664:
                    C0629.m2907();
                    C3660.m10791();
                    z = z;
                    iM11306 = ThreadFactoryC3888.m11306("ᩳܿ") ^ i4;
                    i2 = ((iM11306 ^ i5) * (-20717)) ^ (-1845288067);
                    i3 = 1845426597;
                    boolean z9 = z;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    z = z9;
                    break;
                case -1206713153:
                case 240069455:
                    z = z;
                    s = sArr[c];
                    s2 = 18626;
                    if (C0817.f3443) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ֨") ^ i5) * 55;
                        i2 = ((iM11306 ^ i4) * 25081) ^ (-1620798317);
                        i3 = -1958412956;
                    } else {
                        z = z;
                        iM11306 = ThreadFactoryC3888.m11306("ۤۧ") ^ i4;
                        z = z;
                        i2 = ((iM11306 ^ i5) * (-17693)) ^ (-1193963561);
                        i3 = 2055456536;
                    }
                    boolean z10 = z;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    z = z10;
                    break;
                case -1201812493:
                case 2006490784:
                    C1977.m6356();
                    C3722.m10894();
                    break;
                case -946090997:
                case 1711026544:
                    z = z;
                    sArr = f41626;
                    if (C0278.f1572 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳܿ") ^ i4;
                        i2 = ((iM11306 ^ i5) * (-20717)) ^ (-1845288067);
                        i3 = 1845426597;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ᩺") + i4) * (-49);
                        i2 = ((iM11306 ^ i5) * 25665) ^ (-1457914418);
                        i3 = -2108047333;
                    }
                    boolean z11 = z;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    z = z11;
                    break;
                case -388635825:
                case 77668082:
                    z = z;
                    if ((i11 + i12) - i10 < 0) {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۤۤ")) * (-91);
                        i2 = ((iM11306 ^ i4) * (-6655)) ^ (-2133013173);
                        i3 = 1921805141;
                    } else {
                        iM11306 = C19806.m45029("ۙᩳ") ^ i4;
                        i2 = ((iM11306 ^ i5) * (-2123)) ^ (-1267672438);
                        i3 = 1150445654;
                    }
                    boolean z12 = z;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    z = z12;
                    break;
                case -92146936:
                case 1209425405:
                    z = z;
                    i10 = s * s2;
                    i11 = s * s;
                    if (C1460.f5948 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۖ") ^ i5;
                        i2 = ((iM11306 ^ i4) * 25661) ^ 782669426;
                        i3 = -571872330;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܿۙ")) * (-45);
                        i2 = ((iM11306 ^ i5) * 13731) ^ 972739552;
                        i3 = 1918665385;
                    }
                    boolean z13 = z;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    z = z13;
                    break;
                case 377201385:
                case 1365560164:
                    i13 = 4476;
                    iM11306 = C19806.m45029("֫ܺ") ^ i4;
                    i2 = ((iM11306 ^ i5) * (-28717)) ^ 2129824247;
                    i3 = -1994189878;
                    boolean z14 = z;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    z = z14;
                    break;
                case 672225534:
                case 1971917188:
                    int iM450210 = C19806.m45029(strM26821);
                    if (C1460.f5948 >= 0) {
                        i8 = iM450210;
                        i9 = 2129709897;
                        iM11306 = ThreadFactoryC3888.m11306("ۤۧ") ^ i4;
                        z = z;
                        i2 = ((iM11306 ^ i5) * (-17693)) ^ (-1193963561);
                        i3 = 2055456536;
                        boolean z15 = z;
                        i7 = iM11306 ^ i3;
                        i6 = i2;
                        z = z15;
                    } else {
                        int iM450211 = (C19806.m45029("᩺۬") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        int i16 = ((iM450211 ^ i4) * (-14485)) ^ 560552174;
                        i7 = iM450211 ^ 2080629237;
                        i8 = iM450210;
                        i6 = i16;
                        i9 = 2129709897;
                    }
                    break;
                case 1449358296:
                case 1753568694:
                    if (RunnableC1606.f6488 < 0) {
                        int iM11309 = (i5 - ThreadFactoryC3888.m11306("۠᩻")) * 35;
                        i7 = iM11309 ^ (-1029503751);
                        i6 = ((iM11309 ^ i4) * 23675) ^ 1171423673;
                    } else {
                        z = z;
                        iM11306 = ThreadFactoryC3888.m11306("ᩳܿ") ^ i4;
                        i2 = ((iM11306 ^ i5) * (-20717)) ^ (-1845288067);
                        i3 = 1845426597;
                        boolean z16 = z;
                        i7 = iM11306 ^ i3;
                        i6 = i2;
                        z = z16;
                    }
                    break;
                case 1760894786:
                case 1863918317:
                    C0050.m946();
                    if (C1460.f5948 < 0) {
                        z = z;
                        iM11306 = C19806.m45029("ۗۢ") ^ i4;
                        i2 = ((iM11306 ^ i5) * (-955)) ^ (-1420181825);
                        i3 = -1121614297;
                        boolean z17 = z;
                        i7 = iM11306 ^ i3;
                        i6 = i2;
                        z = z17;
                    } else {
                        int iM113010 = (i5 - ThreadFactoryC3888.m11306("۠᩻")) * 35;
                        i7 = iM113010 ^ (-1029503751);
                        i6 = ((iM113010 ^ i4) * 23675) ^ 1171423673;
                    }
                    break;
                default:
                    z = z;
                    i12 = 86731969;
                    if (CallableC1627.m5507() != 0) {
                        iM11306 = C19806.m45029("ۗۢ") ^ i4;
                        i2 = ((iM11306 ^ i5) * (-955)) ^ (-1420181825);
                        i3 = -1121614297;
                    } else {
                        iM11306 = C19806.m45029("֡᩺") ^ i5;
                        i2 = ((iM11306 ^ i4) * (-24871)) ^ 1321456650;
                        i3 = 1512388922;
                    }
                    boolean z18 = z;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    z = z18;
                    break;
            }
            return;
        }
    }

    @Override // l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public void onStop() {
        WeakReference weakReference = null;
        int i = 2071212467;
        int i2 = C2124.f7782;
        int i3 = C10634.f36300;
        int iM11306 = ThreadFactoryC3888.m11306("ᩴܽ") ^ i2;
        int i4 = ((iM11306 ^ i3) * 12999) ^ (-465198676);
        int i5 = 1106969813;
        while (true) {
            i = ((((i ^ i3) * 8533) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1941997645:
                case 148754173:
                    super.onStop();
                    break;
                case -1641578681:
                case -1155749745:
                    f41624 = null;
                    iM11306 = (i2 - C19806.m45029("ܶܳ")) * (-35);
                    i4 = ((iM11306 ^ i3) * 7743) ^ (-2034907059);
                    i5 = -1392380245;
                    break;
                case -1553509253:
                case -273922287:
                    if (C2477.f9839 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ۢ᩷")) * (-25);
                        i4 = ((iM11306 ^ i2) * (-18055)) ^ 119643697;
                        i5 = 1666656244;
                    } else {
                        iM11306 = C19806.m45029("ۡܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17621)) ^ (-85144657);
                        i5 = 1541402049;
                    }
                    break;
                case -1542016796:
                case 912505239:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("֫ۨ")) * 123;
                        i4 = ((iM11306 ^ i2) * 12477) ^ 1782057182;
                        i5 = -247952618;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩻۠")) * (-113);
                        i4 = ((iM11306 ^ i2) * (-1199)) ^ (-83528672);
                        i5 = -410584919;
                    }
                    break;
                case -1536840707:
                case -1029862058:
                    if (C0962.m3746() >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۟ۖ")) * (-53);
                        i4 = ((iM11306 ^ i2) * (-23315)) ^ (-1422895903);
                        i5 = -683535065;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-9565)) ^ 1523563944;
                        i5 = -2010922007;
                    }
                    break;
                case -1362460579:
                case -250315456:
                    if (C1066.f4915 <= 0) {
                        iM11306 = C19806.m45029("ۡܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17621)) ^ (-85144657);
                        i5 = 1541402049;
                    } else {
                        iM11306 = (C19806.m45029("᩶ۘ") ^ i3) * (-25);
                        i4 = ((iM11306 ^ i2) * 8845) ^ 711522671;
                        i5 = -61332958;
                    }
                    break;
                case -1031726148:
                case 973231115:
                    if (C1461.f5957 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ۢ᩷")) * (-25);
                        i4 = ((iM11306 ^ i2) * (-18055)) ^ 119643697;
                        i5 = 1666656244;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿܰ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-23775)) ^ 1743453618;
                        i5 = 128917230;
                    }
                    break;
                case -679625995:
                case 1346124091:
                    if (this.f41636 != null) {
                        iM11306 = ThreadFactoryC3888.m11306("۠ܿ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 18765) ^ 906371818;
                        i5 = -1596721597;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ܶܳ")) * (-35);
                        i4 = ((iM11306 ^ i3) * 7743) ^ (-2034907059);
                        i5 = -1392380245;
                    }
                    break;
                case -573833505:
                case 909443820:
                    C1977.m6356();
                    C2332.m7079();
                    iM11306 = C19806.m45029("ۡܳ") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-17621)) ^ (-85144657);
                    i5 = 1541402049;
                    break;
                case -520018218:
                case 1003348654:
                    if (C2871.f10837 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ۠") ^ i2;
                        i4 = ((iM11306 ^ i3) * 15109) ^ (-1663599038);
                        i5 = 651820867;
                    } else {
                        iM11306 = C19806.m45029("ۡܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17621)) ^ (-85144657);
                        i5 = 1541402049;
                    }
                    break;
                case -141261737:
                case 1882488628:
                    if (C3577.f13150 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۟ۖ")) * (-53);
                        i4 = ((iM11306 ^ i2) * (-23315)) ^ (-1422895903);
                        i5 = -683535065;
                    } else {
                        iM11306 = C19806.m45029("ܺܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 14473) ^ 845692109;
                        i5 = -1264260629;
                    }
                    break;
                case -138607762:
                case 534238839:
                    weakReference = f41624;
                    if (weakReference != null) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛ۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-28665)) ^ (-987241574);
                        i5 = -1993852651;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ܶܳ")) * (-35);
                        i4 = ((iM11306 ^ i3) * 7743) ^ (-2034907059);
                        i5 = -1392380245;
                    }
                    break;
                case 195097280:
                case 2114115629:
                    if (C0050.m946() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ۠") ^ i2;
                        i4 = ((iM11306 ^ i3) * 15109) ^ (-1663599038);
                        i5 = 651820867;
                    } else {
                        iM11306 = (C19806.m45029("ᩴ᩺") ^ i3) * 41;
                        i4 = ((iM11306 ^ i2) * (-8897)) ^ 1373825801;
                        i5 = -1348515871;
                    }
                    break;
                case 742700984:
                case 2108061457:
                    C0216.m1591();
                    break;
                case 908860954:
                case 1457543836:
                    if (weakReference.get() == this.f41636) {
                        iM11306 = C19806.m45029("ۙ᩵") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17093)) ^ 1575644540;
                        i5 = -863518664;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ܶܳ")) * (-35);
                        i4 = ((iM11306 ^ i3) * 7743) ^ (-2034907059);
                        i5 = -1392380245;
                    }
                    break;
                case 925338332:
                case 1763047182:
                    if (C1419.m4973()) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۟ۖ")) * (-53);
                        i4 = ((iM11306 ^ i2) * (-23315)) ^ (-1422895903);
                        i5 = -683535065;
                    } else {
                        iM11306 = C19806.m45029("ۡ۠") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19847) ^ 1443200055;
                        i5 = -1595481887;
                    }
                    break;
                case 933552148:
                case 1971628191:
                    if (C0629.m2907()) {
                        iM11306 = C19806.m45029("ܰ᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-24537)) ^ (-532080530);
                        i5 = 375365905;
                    } else {
                        iM11306 = C19806.m45029("ۡܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17621)) ^ (-85144657);
                        i5 = 1541402049;
                    }
                    break;
                case 1049648386:
                case 1640291923:
                    if (C1937.f7317 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۟ۖ")) * (-53);
                        i4 = ((iM11306 ^ i2) * (-23315)) ^ (-1422895903);
                        i5 = -683535065;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫ܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 16647) ^ 1351869093;
                        i5 = -648957762;
                    }
                    break;
                case 1384663346:
                case 1472138771:
                    if (C1461.f5957 <= 0) {
                        iM11306 = C19806.m45029("ۡܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17621)) ^ (-85144657);
                        i5 = 1541402049;
                    } else {
                        iM11306 = C19806.m45029("ۗۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 10367) ^ (-2134611769);
                        i5 = 1301874928;
                    }
                    break;
                default:
                    C0671.m3008();
                    if (C2477.f9839 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("֫ۨ")) * 123;
                        i4 = ((iM11306 ^ i2) * 12477) ^ 1782057182;
                        i5 = -247952618;
                    } else {
                        iM11306 = C19806.m45029("ۡܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17621)) ^ (-85144657);
                        i5 = 1541402049;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Exception e = null;
        int i = 1833649768;
        int i2 = C3577.f13150;
        int i3 = C1977.f7413;
        int iM45029 = C19806.m45029("ᩳۚ") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-21713)) ^ (-12303576);
        int i5 = -1943755636;
        while (true) {
            i = ((((i ^ i2) * (-27369)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1930456121:
                case 419160544:
                    if (C1025.f4800 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 69) ^ (-418739786);
                        i5 = -2030587631;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * 5423) ^ (-2061622051);
                        i5 = 818792504;
                    }
                    break;
                case -1914983300:
                case -383241812:
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 69) ^ (-418739786);
                        i5 = -2030587631;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3355)) ^ 1052292830;
                        i5 = -555035375;
                    }
                    break;
                case -1892589639:
                case -1847622329:
                    RunnableC1606.m5473();
                    RunnableC1606.m5473();
                    break;
                case -1605092188:
                case -1009419407:
                    if (C2477.f9839 > 0) {
                        iM45029 = C19806.m45029("ᩴ֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3987) ^ (-1934688106);
                        i5 = -670539877;
                    } else {
                        iM45029 = (C19806.m45029("ܿۘ") + i3) * (-115);
                        i4 = ((iM45029 ^ i2) * (-21367)) ^ 1857906596;
                        i5 = -1474093600;
                    }
                    break;
                case -1594642368:
                case -72697916:
                    if (C1398.f5802 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 32569) ^ (-37608734);
                        i5 = -1207191822;
                    } else {
                        iM45029 = C19806.m45029("ۘ۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * 32349) ^ 876284863;
                        i5 = 1164833300;
                    }
                    break;
                case -1568101636:
                case 816333517:
                    C0671.m3019(this, e, null);
                    break;
                case -1442593461:
                case -1084358193:
                    try {
                        super.onRestoreInstanceState(bundle);
                        iM45029 = (C19806.m45029("۬ܶ") + i2) * (-113);
                        i4 = ((iM45029 ^ i3) * (-17339)) ^ 2022746216;
                        i5 = 303838145;
                    } catch (Exception e2) {
                        e = e2;
                        iM45029 = ThreadFactoryC3888.m11306("ۗۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 9571) ^ 473571188;
                        i5 = -259134056;
                    }
                    break;
                case -1337601079:
                case -1189093134:
                    break;
                case -1165720434:
                case 1159912890:
                    if (C1377.f5749) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10935) ^ (-63935838);
                        i5 = 1856452822;
                    } else {
                        iM45029 = C19806.m45029("ᩴ֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3987) ^ (-1934688106);
                        i5 = -670539877;
                    }
                    break;
                case -737968682:
                case -361643529:
                    if (C7105.f23796 >= 0) {
                        iM45029 = C19806.m45029("ᩴ֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3987) ^ (-1934688106);
                        i5 = -670539877;
                    } else {
                        iM45029 = C19806.m45029("᩺᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12959) ^ 1826044362;
                        i5 = -1671353636;
                    }
                    break;
                case -722285826:
                case 772787428:
                    if (C1461.f5957 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 32569) ^ (-37608734);
                        i5 = -1207191822;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩺᩻")) * (-3);
                        i4 = ((iM45029 ^ i2) * 15207) ^ 699560681;
                        i5 = -1448269421;
                    }
                    break;
                case -568196145:
                case 185007383:
                    if (C2124.f7782 <= 0) {
                        iM45029 = C19806.m45029("ᩴ֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3987) ^ (-1934688106);
                        i5 = -670539877;
                    } else {
                        iM45029 = C19806.m45029("ܶۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 32339) ^ (-1690472894);
                        i5 = -1200309739;
                    }
                    break;
                case -235024951:
                case 1120281727:
                    C1377.m4833();
                    iM45029 = (C19806.m45029("ܿۘ") + i3) * (-115);
                    i4 = ((iM45029 ^ i2) * (-21367)) ^ 1857906596;
                    i5 = -1474093600;
                    break;
                case -194339022:
                case 1760530224:
                    if (C0216.f1393 != 0) {
                        iM45029 = C19806.m45029("ᩴ֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3987) ^ (-1934688106);
                        i5 = -670539877;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-20683)) ^ 1786026909;
                        i5 = -1154574778;
                    }
                    break;
                case 51021084:
                case 583388783:
                    C2332.m7079();
                    if (!CallableC1627.f6528) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩺᩻")) * (-3);
                        i4 = ((iM45029 ^ i2) * 15207) ^ 699560681;
                        i5 = -1448269421;
                    } else {
                        iM45029 = C19806.m45029("ᩴ֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3987) ^ (-1934688106);
                        i5 = -670539877;
                    }
                    break;
                case 112142257:
                case 314875084:
                    if (C1066.f4915 <= 0) {
                        iM45029 = (C19806.m45029("ܿۘ") + i3) * (-115);
                        i4 = ((iM45029 ^ i2) * (-21367)) ^ 1857906596;
                        i5 = -1474093600;
                    } else {
                        iM45029 = (C19806.m45029("ۘ֨") ^ i2) * (-7);
                        i4 = ((iM45029 ^ i3) * (-27485)) ^ 581825384;
                        i5 = 34607869;
                    }
                    break;
                case 392737943:
                case 1079746744:
                    if (C0278.f1572 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 32569) ^ (-37608734);
                        i5 = -1207191822;
                    } else {
                        iM45029 = C19806.m45029("ۘۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9447)) ^ 1299418496;
                        i5 = -537967382;
                    }
                    break;
                default:
                    if (C0797.m3359()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖᩴ") + i3) * 21;
                        i4 = ((iM45029 ^ i2) * 21067) ^ 342887703;
                        i5 = 444254666;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 69) ^ (-418739786);
                        i5 = -2030587631;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m30994() {
        return this.f41627;
    }

    @Override // l.ActivityC19126, l.ActivityC1086, android.app.Activity, l.InterfaceC21797
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = 151311473;
        int i3 = AbstractC0464.f2088;
        int i4 = C1148.f5161;
        int iM45029 = (C19806.m45029("ۜܽ") + i4) * (-57);
        int i5 = ((iM45029 ^ i3) * (-5579)) ^ (-565137893);
        int i6 = 852344527;
        while (true) {
            i2 = ((((i2 ^ i3) * (-14225)) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2031782728:
                case -1600449162:
                    if (C1419.f5860 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩺") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-2239)) ^ (-1858309863);
                        i6 = -1925859772;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۜ") + i3) * 75;
                        i5 = ((iM45029 ^ i4) * 11563) ^ 797111895;
                        i6 = -576478143;
                    }
                    break;
                case -1922042421:
                case 32892727:
                    super.onRequestPermissionsResult(i, strArr, iArr);
                    break;
                case -1888964029:
                case 806165880:
                    if (C3743.f13569) {
                        iM45029 = C19806.m45029("ܶۗ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-7991)) ^ 515177636;
                        i6 = -1258572337;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩺") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-2239)) ^ (-1858309863);
                        i6 = -1925859772;
                    }
                    break;
                case -1868691849:
                case 1158909988:
                    C12057.m29961(this, true);
                    break;
                case -1575838537:
                case 942403591:
                    if (C2642.m8171() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ܺ") + i4) * 5;
                        i5 = ((iM45029 ^ i3) * (-25585)) ^ 1978331651;
                        i6 = -927538375;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۧ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-30953)) ^ (-1066709657);
                        i6 = -215001561;
                    }
                    break;
                case -1420995482:
                case -155436821:
                    if (C1419.f5860 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩺") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-2239)) ^ (-1858309863);
                        i6 = -1925859772;
                    } else {
                        iM45029 = (C19806.m45029("᩷᩹") + i4) * (-99);
                        i5 = ((iM45029 ^ i3) * 4757) ^ (-887678918);
                        i6 = 646429826;
                    }
                    break;
                case -1361278814:
                case 1388430017:
                    C3722.m10894();
                    break;
                case -1238900441:
                case -693089933:
                    if (C0216.m1591() <= 0) {
                        iM45029 = C19806.m45029("ᩴ᩶") ^ i3;
                        i5 = ((iM45029 ^ i4) * 19147) ^ (-1214870937);
                        i6 = 1924696727;
                    } else {
                        iM45029 = (C19806.m45029("᩸ܺ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM45029 ^ i4) * (-14543)) ^ 399749681;
                        i6 = -1378633289;
                    }
                    break;
                case -1159949625:
                case 864329975:
                    if (C1460.m5050() != 0) {
                        iM45029 = C19806.m45029("ᩴ᩶") ^ i3;
                        i5 = ((iM45029 ^ i4) * 19147) ^ (-1214870937);
                        i6 = 1924696727;
                    } else {
                        iM45029 = (C19806.m45029("ᩳ᩷") + i4) * (-103);
                        i5 = ((iM45029 ^ i3) * (-1925)) ^ 1870266250;
                        i6 = -1819055073;
                    }
                    break;
                case -884470199:
                case -193841020:
                    if (C2332.f8260) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ܿ") + i3) * (-107);
                        i5 = ((iM45029 ^ i4) * 32675) ^ (-2068259717);
                        i6 = -1052951134;
                    } else {
                        iM45029 = (C19806.m45029("᩸ܺ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM45029 ^ i4) * (-14543)) ^ 399749681;
                        i6 = -1378633289;
                    }
                    break;
                case -815925803:
                case 990872350:
                    if (C0216.f1393 != 0) {
                        iM45029 = (C19806.m45029("᩻֡") + i4) * (-117);
                        i5 = ((iM45029 ^ i3) * (-4221)) ^ 1392620396;
                        i6 = -125548855;
                    } else {
                        iM45029 = (C19806.m45029("ۜ֫") + i4) * 15;
                        i5 = ((iM45029 ^ i3) * 16653) ^ (-1602227658);
                        i6 = 1161915794;
                    }
                    break;
                case -686600070:
                case -226122525:
                    RunnableC1895.m6170();
                    C0216.m1591();
                    iM45029 = (C19806.m45029("᩸ܺ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i5 = ((iM45029 ^ i4) * (-14543)) ^ 399749681;
                    i6 = -1378633289;
                    break;
                case -559624921:
                case 1053697720:
                    if (i == 23680) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹᩹") ^ i3) * 9;
                        i5 = ((iM45029 ^ i4) * (-3773)) ^ 638052827;
                        i6 = 1583491099;
                    } else {
                        iM45029 = C19806.m45029("ܺܿ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 18049) ^ (-1232061191);
                        i6 = 2118540693;
                    }
                    break;
                case -355685117:
                case 718893874:
                    if (!RunnableC0195.m1431()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩺") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-2239)) ^ (-1858309863);
                        i6 = -1925859772;
                    } else {
                        iM45029 = (C19806.m45029("᩸ܺ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM45029 ^ i4) * (-14543)) ^ 399749681;
                        i6 = -1378633289;
                    }
                    break;
                case 37895314:
                case 1493700838:
                    if (C1977.f7413 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ܺ") + i4) * 5;
                        i5 = ((iM45029 ^ i3) * (-25585)) ^ 1978331651;
                        i6 = -927538375;
                    } else {
                        iM45029 = (C19806.m45029("᩸ܺ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM45029 ^ i4) * (-14543)) ^ 399749681;
                        i6 = -1378633289;
                    }
                    break;
                case 236175820:
                case 1671523706:
                    if (C2788.m8472() != 0) {
                        iM45029 = (C19806.m45029("᩸ܺ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM45029 ^ i4) * (-14543)) ^ 399749681;
                        i6 = -1378633289;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠֨") ^ i3;
                        i5 = ((iM45029 ^ i4) * 15253) ^ 1152167270;
                        i6 = -117868391;
                    }
                    break;
                case 948749219:
                case 2038344227:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (C19806.m45029("᩸ܺ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM45029 ^ i4) * (-14543)) ^ 399749681;
                        i6 = -1378633289;
                    } else {
                        iM45029 = (C19806.m45029("᩶᩶") ^ i4) * (-99);
                        i5 = ((iM45029 ^ i3) * 1409) ^ (-1933382443);
                        i6 = -1414031725;
                    }
                    break;
                default:
                    if (C1937.f7317 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ܺ") + i4) * 5;
                        i5 = ((iM45029 ^ i3) * (-25585)) ^ 1978331651;
                        i6 = -927538375;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܿ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 12365) ^ 1052970446;
                        i6 = 1751945686;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, l.᩷۠ۚ] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30989(AbstractActivityC12483 abstractActivityC12483, int i) {
        AbstractC20745 abstractC20745 = null;
        ArrayList arrayList = null;
        ?? r2 = 0;
        int i2 = 131838016;
        int i3 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int i4 = C1148.f5161;
        int iM11306 = (i4 - ThreadFactoryC3888.m11306("ۧ᩶")) * (-105);
        int i5 = ((iM11306 ^ i3) * (-5677)) ^ 16527013;
        int i6 = -1572591950;
        while (true) {
            i2 = ((((i2 ^ i3) * (-1455)) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2110192296:
                case 457404790:
                    if (C7105.f23796 >= 0) {
                        iM11306 = C19806.m45029("ۘۧ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 17693) ^ (-2096378573);
                        i6 = -1883105370;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۗ᩺")) * (-55);
                        i5 = ((iM11306 ^ i3) * (-26147)) ^ 1297197707;
                        i6 = 1229941652;
                    }
                    break;
                case -2086880230:
                case -844116748:
                    C0526.m2437();
                    if (C2704.m8255() <= 0) {
                        iM11306 = (i4 - C19806.m45029("ᩴۘ")) * 53;
                        i5 = ((iM11306 ^ i3) * (-21013)) ^ 2071574395;
                        i6 = 294807474;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫۠") + i4) * (-43);
                        i5 = ((iM11306 ^ i3) * 10435) ^ 1211968795;
                        i6 = -244671615;
                    }
                    break;
                case -1986583698:
                case -1270518018:
                    abstractActivityC12483.f41634 = r2;
                    abstractActivityC12483.f41629 = r2;
                    if (abstractC20745 != null) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܶ֨")) * (-97);
                        i5 = ((iM11306 ^ i4) * (-3815)) ^ 886509067;
                        i6 = 1151771665;
                    } else {
                        iM11306 = (C19806.m45029("ܶܶ") + i4) * (-97);
                        i5 = ((iM11306 ^ i3) * 22847) ^ (-928898572);
                        i6 = -1349512843;
                    }
                    break;
                case -1972435493:
                case 1658664747:
                    r2 = 0;
                    r2 = 0;
                    if (C2249.m6915() <= 0) {
                        iM11306 = C19806.m45029("ۘۧ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 17693) ^ (-2096378573);
                        i6 = -1883105370;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۧ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-23979)) ^ 277239988;
                        i6 = -873009159;
                    }
                    break;
                case -1214599609:
                case -322979990:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i4 - C19806.m45029("ᩴۘ")) * 53;
                        i5 = ((iM11306 ^ i3) * (-21013)) ^ 2071574395;
                        i6 = 294807474;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺܳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 3619) ^ 1941365063;
                        i6 = -1839671288;
                    }
                    break;
                case -646371923:
                case 328584704:
                    if (C3722.m10894() <= 0) {
                        iM11306 = C19806.m45029("ۘۧ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 17693) ^ (-2096378573);
                        i6 = -1883105370;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ۟") ^ i3;
                        i5 = ((iM11306 ^ i4) * 10691) ^ (-1248204487);
                        i6 = 1376082572;
                    }
                    break;
                case -639272432:
                case 1079537216:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻᩺") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-23391)) ^ (-1757571355);
                        i6 = -891732266;
                    } else {
                        iM11306 = C19806.m45029("ܿۧ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 11885) ^ (-1184470097);
                        i6 = 1085605495;
                    }
                    break;
                case -618728798:
                case 1488819810:
                    if (C2124.f7782 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫۠") + i4) * (-43);
                        i5 = ((iM11306 ^ i3) * 10435) ^ 1211968795;
                        i6 = -244671615;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩹") ^ i3;
                        i5 = ((iM11306 ^ i4) * 22031) ^ 15017976;
                        i6 = 326754901;
                    }
                    break;
                case -607935918:
                case 2128959533:
                    ThreadFactoryC3888.m11300();
                    if (RunnableC0195.f1321 < 0) {
                        iM11306 = (i3 - C19806.m45029("ۜ֡")) * 11;
                        i5 = ((iM11306 ^ i4) * (-2355)) ^ (-410752798);
                        i6 = 985018903;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫۠") + i4) * (-43);
                        i5 = ((iM11306 ^ i3) * 10435) ^ 1211968795;
                        i6 = -244671615;
                    }
                    break;
                case -362270147:
                case 2015647534:
                    C3872.m11211(abstractActivityC12483, abstractC20745, arrayList);
                    iM11306 = (C19806.m45029("ܶܶ") + i4) * (-97);
                    i5 = ((iM11306 ^ i3) * 22847) ^ (-928898572);
                    i6 = -1349512843;
                    break;
                case -260992690:
                case 610004882:
                    if (C1148.f5161 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻᩺") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-23391)) ^ (-1757571355);
                        i6 = -891732266;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۜ֡")) * 11;
                        i5 = ((iM11306 ^ i4) * (-2355)) ^ (-410752798);
                        i6 = 985018903;
                    }
                    break;
                case 107400158:
                case 1033191290:
                    if (C1189.f5284 <= 0) {
                        iM11306 = (i4 - C19806.m45029("ᩴۘ")) * 53;
                        i5 = ((iM11306 ^ i3) * (-21013)) ^ 2071574395;
                        i6 = 294807474;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۖܳ")) * (-107);
                        i5 = ((iM11306 ^ i3) * (-21071)) ^ 1502665884;
                        i6 = 402258901;
                    }
                    break;
                case 166931564:
                case 847649167:
                    if (i == -1) {
                        iM11306 = (C19806.m45029("ܺۘ") + i3) * (-17);
                        i5 = ((iM11306 ^ i4) * 10105) ^ (-774793347);
                        i6 = 1167227684;
                    } else {
                        iM11306 = (C19806.m45029("ܶܶ") + i4) * (-97);
                        i5 = ((iM11306 ^ i3) * 22847) ^ (-928898572);
                        i6 = -1349512843;
                    }
                    break;
                case 297907115:
                case 1611142232:
                    if (C1148.f5161 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ۜ֡")) * 11;
                        i5 = ((iM11306 ^ i4) * (-2355)) ^ (-410752798);
                        i6 = 985018903;
                    } else {
                        iM11306 = (C19806.m45029("ۖ۟") + i4) * 33;
                        i5 = ((iM11306 ^ i3) * (-24863)) ^ 200290414;
                        i6 = -1354601699;
                    }
                    break;
                case 857861580:
                case 1819246446:
                    break;
                case 1368418558:
                case 1739554651:
                    abstractC20745 = abstractActivityC12483.f41634;
                    arrayList = abstractActivityC12483.f41629;
                    if (C10634.f36300 >= 0) {
                        iM11306 = (i4 - C19806.m45029("ᩴۘ")) * 53;
                        i5 = ((iM11306 ^ i3) * (-21013)) ^ 2071574395;
                        i6 = 294807474;
                    } else {
                        iM11306 = (C19806.m45029("ۛۗ") + i3) * (-85);
                        i5 = ((iM11306 ^ i4) * (-28765)) ^ (-2083228170);
                        i6 = 559672702;
                    }
                    break;
                case 1512412875:
                case 2108298413:
                    C1377.m4833();
                    C1419.m4973();
                    break;
                case 1513906468:
                case 2112104470:
                    if (C2788.f10625 >= 0) {
                        iM11306 = (i3 - C19806.m45029("ۜ֡")) * 11;
                        i5 = ((iM11306 ^ i4) * (-2355)) ^ (-410752798);
                        i6 = 985018903;
                    } else {
                        iM11306 = (i4 - C19806.m45029("᩻᩵")) * 65;
                        i5 = ((iM11306 ^ i3) * (-30951)) ^ 335089885;
                        i6 = 196846997;
                    }
                    break;
                default:
                    C2249.m6915();
                    iM11306 = (ThreadFactoryC3888.m11306("֫۠") + i4) * (-43);
                    i5 = ((iM11306 ^ i3) * 10435) ^ 1211968795;
                    i6 = -244671615;
                    break;
            }
            return;
        }
    }

    @Override // l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C9554.m24413(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30998(Runnable runnable) {
        this.f41640 = runnable;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x04c7 A[PHI: r1 r2 r5 r6 r12 r13 r23 r24 r25
      0x04c7: PHI (r1v12 int) = (r1v5 int), (r1v7 int), (r1v9 int), (r1v13 int) binds: [B:9:0x008c, B:89:0x04c5, B:76:0x040f, B:64:0x036f] A[DONT_GENERATE, DONT_INLINE]
      0x04c7: PHI (r2v11 int) = (r2v4 int), (r2v6 int), (r2v8 int), (r2v12 int) binds: [B:9:0x008c, B:89:0x04c5, B:76:0x040f, B:64:0x036f] A[DONT_GENERATE, DONT_INLINE]
      0x04c7: PHI (r5v12 int) = (r5v5 int), (r5v7 int), (r5v9 int), (r5v13 int) binds: [B:9:0x008c, B:89:0x04c5, B:76:0x040f, B:64:0x036f] A[DONT_GENERATE, DONT_INLINE]
      0x04c7: PHI (r6v12 l.ܺۢ) = (r6v5 l.ܺۢ), (r6v7 l.ܺۢ), (r6v9 l.ܺۢ), (r6v13 l.ܺۢ) binds: [B:9:0x008c, B:89:0x04c5, B:76:0x040f, B:64:0x036f] A[DONT_GENERATE, DONT_INLINE]
      0x04c7: PHI (r12v11 int) = (r12v4 int), (r12v6 int), (r12v8 int), (r12v12 int) binds: [B:9:0x008c, B:89:0x04c5, B:76:0x040f, B:64:0x036f] A[DONT_GENERATE, DONT_INLINE]
      0x04c7: PHI (r13v11 int) = (r13v4 int), (r13v6 int), (r13v8 int), (r13v12 int) binds: [B:9:0x008c, B:89:0x04c5, B:76:0x040f, B:64:0x036f] A[DONT_GENERATE, DONT_INLINE]
      0x04c7: PHI (r23v11 int) = (r23v4 int), (r23v6 int), (r23v8 int), (r23v12 int) binds: [B:9:0x008c, B:89:0x04c5, B:76:0x040f, B:64:0x036f] A[DONT_GENERATE, DONT_INLINE]
      0x04c7: PHI (r24v11 int) = (r24v4 int), (r24v6 int), (r24v8 int), (r24v12 int) binds: [B:9:0x008c, B:89:0x04c5, B:76:0x040f, B:64:0x036f] A[DONT_GENERATE, DONT_INLINE]
      0x04c7: PHI (r25v9 android.view.ViewGroup$MarginLayoutParams) = 
      (r25v2 android.view.ViewGroup$MarginLayoutParams)
      (r25v4 android.view.ViewGroup$MarginLayoutParams)
      (r25v6 android.view.ViewGroup$MarginLayoutParams)
      (r25v10 android.view.ViewGroup$MarginLayoutParams)
     binds: [B:9:0x008c, B:89:0x04c5, B:76:0x040f, B:64:0x036f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x050a A[PHI: r1 r2 r5 r6 r12 r13 r23 r24 r25
      0x050a: PHI (r1v17 int) = (r1v6 int), (r1v8 int), (r1v10 int), (r7v2 int) binds: [B:93:0x0508, B:80:0x043f, B:72:0x03df, B:13:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x050a: PHI (r2v18 int) = (r2v5 int), (r2v7 int), (r2v9 int), (r2v19 int) binds: [B:93:0x0508, B:80:0x043f, B:72:0x03df, B:13:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x050a: PHI (r5v18 int) = (r5v6 int), (r5v8 int), (r5v10 int), (r13v2 int) binds: [B:93:0x0508, B:80:0x043f, B:72:0x03df, B:13:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x050a: PHI (r6v16 l.ܺۢ) = (r6v6 l.ܺۢ), (r6v8 l.ܺۢ), (r6v10 l.ܺۢ), (r6v17 l.ܺۢ) binds: [B:93:0x0508, B:80:0x043f, B:72:0x03df, B:13:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x050a: PHI (r12v16 int) = (r12v5 int), (r12v7 int), (r12v9 int), (r12v17 int) binds: [B:93:0x0508, B:80:0x043f, B:72:0x03df, B:13:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x050a: PHI (r13v16 int) = (r13v5 int), (r13v7 int), (r13v9 int), (r13v17 int) binds: [B:93:0x0508, B:80:0x043f, B:72:0x03df, B:13:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x050a: PHI (r23v16 int) = (r23v5 int), (r23v7 int), (r23v9 int), (r3v5 int) binds: [B:93:0x0508, B:80:0x043f, B:72:0x03df, B:13:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x050a: PHI (r24v16 int) = (r24v5 int), (r24v7 int), (r24v9 int), (r5v2 int) binds: [B:93:0x0508, B:80:0x043f, B:72:0x03df, B:13:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x050a: PHI (r25v14 android.view.ViewGroup$MarginLayoutParams) = 
      (r25v3 android.view.ViewGroup$MarginLayoutParams)
      (r25v5 android.view.ViewGroup$MarginLayoutParams)
      (r25v7 android.view.ViewGroup$MarginLayoutParams)
      (r6v2 android.view.ViewGroup$MarginLayoutParams)
     binds: [B:93:0x0508, B:80:0x043f, B:72:0x03df, B:13:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15844 m30986(AbstractActivityC12483 abstractActivityC12483, View view, int[] iArr, View view2, int[] iArr2, C17381 c17381, View view3, View view4, int[] iArr3, int[] iArr4, View view5, View view6, int[] iArr5, int[] iArr6, View view7, int[] iArr7, View view8, int i, C15844 c15844) {
        C15844 c15845;
        int i2;
        int i3;
        int i4;
        int iM45029;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iM450210;
        int i10;
        int i11;
        int iM11306;
        int i12;
        int i13;
        int iM11307;
        int i14;
        int i15;
        int iM450211;
        int i16;
        view8 = view8;
        C15844 c15846 = c15844;
        int i17 = 0;
        int i18 = C7105.f23796;
        int i19 = C2477.f9839;
        int iM11308 = ThreadFactoryC3888.m11306("ۨ֡") ^ i18;
        int i20 = ((iM11308 ^ i19) * 28725) ^ (-1185463902);
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        int i21 = iM11308 ^ 910535306;
        int i22 = 911868753;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        C13954 c13954Mo119 = null;
        int i27 = 0;
        int i28 = 0;
        int iM3360 = 0;
        char c = 0;
        char c2 = 0;
        char c3 = 0;
        int i29 = 0;
        boolean z = false;
        boolean zM9874 = false;
        while (true) {
            int i30 = i21 ^ (i20 & (((i22 ^ i19) * (-8879)) >> 31));
            switch (i30) {
                case -2055817033:
                case 689058205:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i24;
                    i28 = i28;
                    c15845 = c15846;
                    i2 = i26;
                    i3 = i27;
                    i4 = i17;
                    if (zM9874) {
                        iM45029 = C19806.m45029("۬ۢ") ^ i19;
                        i5 = ((iM45029 ^ i18) * (-13435)) ^ (-1647513544);
                        i6 = 1025782039;
                    } else {
                        iM45029 = (C19806.m45029("᩶۫") ^ i18) * 73;
                        i5 = ((iM45029 ^ i19) * 7055) ^ 269937303;
                        i6 = 810435776;
                    }
                    i8 = iM45029 ^ i6;
                    i20 = i5;
                    i17 = i4;
                    i26 = i2;
                    i22 = i30;
                    i27 = i3;
                    i28 = i28;
                    c15846 = c15845;
                    i21 = i8;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i24;
                    view8 = view8;
                    break;
                case -2032264997:
                case 31739591:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i3 = i27;
                    i28 = i28;
                    iM3360 = C0797.m3360(i3, i28);
                    c = 0;
                    i26 = iArr[0] + c13954Mo119.f45915;
                    i7 = 1;
                    i25 = iArr[1];
                    c2 = 2;
                    i24 = iArr[2] + c13954Mo119.f45914;
                    c3 = 3;
                    if (C0050.m946() <= 0) {
                        c15845 = c15844;
                        int iM11309 = (ThreadFactoryC3888.m11306("۫ۖ") + i19) * (-109);
                        i17 = i7;
                        i20 = ((iM11309 ^ i18) * 16063) ^ (-1584966217);
                        i22 = i30;
                        i28 = i28;
                        i21 = iM11309 ^ (-1710430580);
                        i23 = i23;
                        i27 = i3;
                        c15846 = c15845;
                    } else {
                        int iM450212 = C19806.m45029("ᩳۗ") ^ i19;
                        i27 = i3;
                        i28 = i28;
                        i22 = i30;
                        i23 = i23;
                        i17 = 1;
                        c15846 = c15844;
                        i21 = iM450212 ^ 1415720793;
                        i20 = ((iM450212 ^ i18) * (-22519)) ^ (-93974188);
                    }
                    marginLayoutParams = marginLayoutParams;
                    break;
                case -2030326396:
                case 862828984:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i24;
                    i25 = i25;
                    C13954 c13954 = c13954Mo119;
                    i27 = i27;
                    i17 = i17;
                    int i31 = iM3360;
                    i28 = i28;
                    i26 = i26;
                    m30988(view3, view4, iArr3, iArr4, c13954, i31, !z);
                    m30988(view5, view6, iArr5, iArr6, c13954, i31, z);
                    if (view7 != null) {
                        iM11306 = C19806.m45029("ۘۛ") ^ i19;
                        i12 = ((iM11306 ^ i18) * (-16251)) ^ (-1588799063);
                        i13 = 1540388447;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴۗ") + i18) * 99;
                        i12 = ((iM11306 ^ i19) * (-23411)) ^ 1278603303;
                        i13 = -1820384485;
                    }
                    i15 = iM11306 ^ i13;
                    i24 = i24;
                    i25 = i25;
                    i17 = i17;
                    i26 = i26;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i27 = i27;
                    i28 = i28;
                    view8 = view8;
                    c15846 = c15844;
                    i9 = i30;
                    i21 = i15;
                    i20 = i12;
                    i22 = i9;
                    break;
                case -2026888790:
                case 603015553:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i24;
                    i28 = i28;
                    c15845 = c15846;
                    i2 = i26;
                    i3 = i27;
                    i4 = i17;
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (i18 - C19806.m45029("֫ܿ")) * 59;
                        i5 = ((iM45029 ^ i19) * 29469) ^ 47518026;
                        i6 = -2116614928;
                    } else {
                        iM45029 = (C19806.m45029("ܰ᩻") + i19) * (-91);
                        i5 = ((iM45029 ^ i18) * (-28847)) ^ (-809636004);
                        i6 = 2027656393;
                    }
                    i8 = iM45029 ^ i6;
                    i20 = i5;
                    i17 = i4;
                    i26 = i2;
                    i22 = i30;
                    i27 = i3;
                    i28 = i28;
                    c15846 = c15845;
                    i21 = i8;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i24;
                    view8 = view8;
                    break;
                case -1812588344:
                case 1165891734:
                    return C15844.f51279;
                case -1784826163:
                case 876927446:
                    C1148.m4232();
                    if (!C0526.f2219) {
                        i30 = i30;
                        i23 = i23;
                        marginLayoutParams = marginLayoutParams;
                        i7 = i17;
                        i28 = i28;
                        c15845 = c15846;
                        i3 = i27;
                        int iM113010 = (ThreadFactoryC3888.m11306("۫ۖ") + i19) * (-109);
                        i17 = i7;
                        i20 = ((iM113010 ^ i18) * 16063) ^ (-1584966217);
                        i22 = i30;
                        i28 = i28;
                        i21 = iM113010 ^ (-1710430580);
                        i23 = i23;
                        i27 = i3;
                        c15846 = c15845;
                        marginLayoutParams = marginLayoutParams;
                    } else {
                        i30 = i30;
                        i23 = i23;
                        marginLayoutParams = marginLayoutParams;
                        i24 = i24;
                        i28 = i28;
                        c15845 = c15846;
                        i2 = i26;
                        i3 = i27;
                        i4 = i17;
                        iM45029 = (i18 - C19806.m45029("֫ܿ")) * 59;
                        i5 = ((iM45029 ^ i19) * 29469) ^ 47518026;
                        i6 = -2116614928;
                        i8 = iM45029 ^ i6;
                        i20 = i5;
                        i17 = i4;
                        i26 = i2;
                        i22 = i30;
                        i27 = i3;
                        i28 = i28;
                        c15846 = c15845;
                        i21 = i8;
                        i23 = i23;
                        marginLayoutParams = marginLayoutParams;
                        i24 = i24;
                        view8 = view8;
                    }
                    break;
                case -1782442811:
                case -610735207:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i24;
                    i4 = i17;
                    i2 = i26;
                    c15845 = c15846;
                    c13954Mo119 = abstractActivityC12483.mo119(c15845);
                    C13954 c13954M37673 = c15845.m37673(8);
                    int i32 = c13954Mo119.f45913;
                    int i33 = c13954M37673.f45913;
                    if (C3660.f13403 >= 0) {
                        i28 = i33;
                        i3 = i32;
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܺ") ^ i19;
                        i5 = ((iM45029 ^ i18) * 19503) ^ 2097360613;
                        i6 = 1148642459;
                        i8 = iM45029 ^ i6;
                        i20 = i5;
                        i17 = i4;
                        i26 = i2;
                        i22 = i30;
                        i27 = i3;
                        i28 = i28;
                    } else {
                        int iM113011 = (i19 - ThreadFactoryC3888.m11306("ܺ᩷")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        int i34 = ((iM113011 ^ i18) * (-29137)) ^ (-1090340154);
                        i8 = iM113011 ^ 122793902;
                        i20 = i34;
                        i17 = i4;
                        i26 = i2;
                        i22 = i30;
                        i28 = i33;
                        i27 = i32;
                    }
                    c15846 = c15845;
                    i21 = i8;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i24;
                    view8 = view8;
                    break;
                case -1649548704:
                case -47018533:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i24;
                    i28 = i28;
                    c15845 = c15846;
                    i2 = i26;
                    i3 = i27;
                    i4 = i17;
                    if (C1668.f6641 >= 0) {
                        iM45029 = C19806.m45029("۬ۢ") ^ i19;
                        i5 = ((iM45029 ^ i18) * (-13435)) ^ (-1647513544);
                        i6 = 1025782039;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ᩸") ^ i18) * q.h;
                        i5 = ((iM45029 ^ i19) * 7975) ^ 427539529;
                        i6 = 724443863;
                    }
                    i8 = iM45029 ^ i6;
                    i20 = i5;
                    i17 = i4;
                    i26 = i2;
                    i22 = i30;
                    i27 = i3;
                    i28 = i28;
                    c15846 = c15845;
                    i21 = i8;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i24;
                    view8 = view8;
                    break;
                case -1597164233:
                case -1554177812:
                    AbstractC0464.m2313();
                    if (RunnableC0195.f1321 >= 0) {
                        int iM450213 = (C19806.m45029("ܰ۫") ^ i18) * 57;
                        i20 = ((iM450213 ^ i19) * 9463) ^ 1332030143;
                        i9 = i30;
                        i21 = iM450213 ^ 410124152;
                        i22 = i9;
                    } else {
                        c15845 = c15846;
                        i2 = i26;
                        i3 = i27;
                        i4 = i17;
                        iM45029 = C19806.m45029("۬ۢ") ^ i19;
                        i5 = ((iM45029 ^ i18) * (-13435)) ^ (-1647513544);
                        i6 = 1025782039;
                        i8 = iM45029 ^ i6;
                        i20 = i5;
                        i17 = i4;
                        i26 = i2;
                        i22 = i30;
                        i27 = i3;
                        i28 = i28;
                        c15846 = c15845;
                        i21 = i8;
                        i23 = i23;
                        marginLayoutParams = marginLayoutParams;
                        i24 = i24;
                        view8 = view8;
                    }
                    break;
                case -1430000387:
                case 504708746:
                    i30 = i30;
                    marginLayoutParams.bottomMargin = i23;
                    view8.setLayoutParams(marginLayoutParams);
                    iM450211 = (C19806.m45029("ۤ֨") + i19) * (-67);
                    i12 = ((iM450211 ^ i18) * (-7701)) ^ 893209737;
                    i16 = -410004356;
                    i15 = iM450211 ^ i16;
                    i9 = i30;
                    i21 = i15;
                    i20 = i12;
                    i22 = i9;
                    break;
                case -1155084935:
                case 1623186343:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i24;
                    i28 = i28;
                    c15845 = c15846;
                    i2 = i26;
                    i3 = i27;
                    i4 = i17;
                    if (C3743.f13569) {
                        iM45029 = (C19806.m45029("۟ܰ") + i19) * (-5);
                        i5 = ((iM45029 ^ i18) * 5911) ^ 990261277;
                        i6 = 842276286;
                    } else {
                        iM45029 = (i18 - C19806.m45029("֫ܿ")) * 59;
                        i5 = ((iM45029 ^ i19) * 29469) ^ 47518026;
                        i6 = -2116614928;
                    }
                    i8 = iM45029 ^ i6;
                    i20 = i5;
                    i17 = i4;
                    i26 = i2;
                    i22 = i30;
                    i27 = i3;
                    i28 = i28;
                    c15846 = c15845;
                    i21 = i8;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i24;
                    view8 = view8;
                    break;
                case -952215388:
                case 1293281935:
                    C1148.m4232();
                    return null;
                case -914589295:
                case 410670537:
                    i30 = i30;
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) C1398.m4890(view8);
                    i23 = i + iM3360;
                    if (marginLayoutParams.bottomMargin != i23) {
                        iM450211 = C19806.m45029("ۘܰ") ^ i19;
                        i12 = ((iM450211 ^ i18) * (-31995)) ^ 1798186890;
                        i16 = 1847911228;
                    } else {
                        iM450211 = (C19806.m45029("ۤ֨") + i19) * (-67);
                        i12 = ((iM450211 ^ i18) * (-7701)) ^ 893209737;
                        i16 = -410004356;
                    }
                    i15 = iM450211 ^ i16;
                    i9 = i30;
                    i21 = i15;
                    i20 = i12;
                    i22 = i9;
                    break;
                case -785880914:
                case 1563992542:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i24;
                    i28 = i28;
                    c15845 = c15846;
                    i2 = i26;
                    i3 = i27;
                    i4 = i17;
                    if (C2477.f9839 <= 0) {
                        iM45029 = C19806.m45029("۬ۢ") ^ i19;
                        i5 = ((iM45029 ^ i18) * (-13435)) ^ (-1647513544);
                        i6 = 1025782039;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤܿ") + i18) * 123;
                        i5 = ((iM45029 ^ i19) * 2903) ^ (-332240834);
                        i6 = 1579209065;
                    }
                    i8 = iM45029 ^ i6;
                    i20 = i5;
                    i17 = i4;
                    i26 = i2;
                    i22 = i30;
                    i27 = i3;
                    i28 = i28;
                    c15846 = c15845;
                    i21 = i8;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i24;
                    view8 = view8;
                    break;
                case -713845267:
                case 771176690:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    if (view8 == null) {
                        i23 = i23;
                        marginLayoutParams = marginLayoutParams;
                        iM450211 = (C19806.m45029("ۤ֨") + i19) * (-67);
                        i12 = ((iM450211 ^ i18) * (-7701)) ^ 893209737;
                        i16 = -410004356;
                        i15 = iM450211 ^ i16;
                        i9 = i30;
                        i21 = i15;
                        i20 = i12;
                        i22 = i9;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ܶܽ") ^ i18;
                        i12 = ((iM11307 ^ i19) * 4493) ^ (-2093205994);
                        i14 = 51956345;
                        i15 = iM11307 ^ i14;
                        i23 = i23;
                        marginLayoutParams = marginLayoutParams;
                        i9 = i30;
                        i21 = i15;
                        i20 = i12;
                        i22 = i9;
                    }
                    break;
                case -695708039:
                case -479436800:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    view7.setPadding(iArr7[c], iArr7[i17] + i29, iArr7[c2], iArr7[c3]);
                    i24 = i24;
                    i25 = i25;
                    i27 = i27;
                    i28 = i28;
                    i17 = i17;
                    i26 = i26;
                    iM11306 = (ThreadFactoryC3888.m11306("ᩴۗ") + i18) * 99;
                    i12 = ((iM11306 ^ i19) * (-23411)) ^ 1278603303;
                    i13 = -1820384485;
                    i15 = iM11306 ^ i13;
                    i24 = i24;
                    i25 = i25;
                    i17 = i17;
                    i26 = i26;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i27 = i27;
                    i28 = i28;
                    view8 = view8;
                    c15846 = c15844;
                    i9 = i30;
                    i21 = i15;
                    i20 = i12;
                    i22 = i9;
                    break;
                case -426574127:
                case 736209842:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    if (iArr7 != null) {
                        iM11307 = C19806.m45029("᩺ۗ") ^ i18;
                        i12 = ((iM11307 ^ i19) * 30609) ^ (-2137532827);
                        i14 = 688590514;
                        i15 = iM11307 ^ i14;
                        i23 = i23;
                        marginLayoutParams = marginLayoutParams;
                        i9 = i30;
                        i21 = i15;
                        i20 = i12;
                        i22 = i9;
                    }
                    i24 = i24;
                    i25 = i25;
                    i27 = i27;
                    i28 = i28;
                    i17 = i17;
                    i26 = i26;
                    iM11306 = (ThreadFactoryC3888.m11306("ᩴۗ") + i18) * 99;
                    i12 = ((iM11306 ^ i19) * (-23411)) ^ 1278603303;
                    i13 = -1820384485;
                    i15 = iM11306 ^ i13;
                    i24 = i24;
                    i25 = i25;
                    i17 = i17;
                    i26 = i26;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i27 = i27;
                    i28 = i28;
                    view8 = view8;
                    c15846 = c15844;
                    i9 = i30;
                    i21 = i15;
                    i20 = i12;
                    i22 = i9;
                    break;
                case -331661787:
                case 135966604:
                    C1461.m5080();
                    c15845 = c15846;
                    i2 = i26;
                    i3 = i27;
                    i4 = i17;
                    iM45029 = C19806.m45029("۬ۢ") ^ i19;
                    i5 = ((iM45029 ^ i18) * (-13435)) ^ (-1647513544);
                    i6 = 1025782039;
                    i8 = iM45029 ^ i6;
                    i20 = i5;
                    i17 = i4;
                    i26 = i2;
                    i22 = i30;
                    i27 = i3;
                    i28 = i28;
                    c15846 = c15845;
                    i21 = i8;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i24;
                    view8 = view8;
                    break;
                case -134105209:
                case 1828096060:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i24;
                    i28 = i28;
                    c15845 = c15846;
                    i2 = i26;
                    i3 = i27;
                    i4 = i17;
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܺ") ^ i19;
                        i5 = ((iM45029 ^ i18) * 19503) ^ 2097360613;
                        i6 = 1148642459;
                    } else {
                        iM45029 = C19806.m45029("ۨܺ") ^ i19;
                        i5 = ((iM45029 ^ i18) * 21803) ^ (-1395323756);
                        i6 = 1552605141;
                    }
                    i8 = iM45029 ^ i6;
                    i20 = i5;
                    i17 = i4;
                    i26 = i2;
                    i22 = i30;
                    i27 = i3;
                    i28 = i28;
                    c15846 = c15845;
                    i21 = i8;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i24;
                    view8 = view8;
                    break;
                case 8068506:
                case 518594546:
                    z = true;
                    iM11306 = (i18 - ThreadFactoryC3888.m11306("ܺۗ")) * 39;
                    i12 = ((iM11306 ^ i19) * 24425) ^ (-563763412);
                    i13 = -431458362;
                    i15 = iM11306 ^ i13;
                    i24 = i24;
                    i25 = i25;
                    i17 = i17;
                    i26 = i26;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i27 = i27;
                    i28 = i28;
                    view8 = view8;
                    c15846 = c15844;
                    i9 = i30;
                    i21 = i15;
                    i20 = i12;
                    i22 = i9;
                    break;
                case 114948874:
                case 609227635:
                    int i35 = i23;
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                    int i36 = i24;
                    int i37 = i25;
                    int i38 = i27;
                    int i39 = i28;
                    int i40 = i17;
                    int i41 = i26;
                    view.setPadding(i41, i37, i36, iArr[c3] + iM3360);
                    int i42 = iArr2[c];
                    int i43 = iArr2[i40];
                    int i44 = c13954Mo119.f45912;
                    view2.setPadding(i42, i43 + i44, iArr2[c2], iArr2[c3]);
                    int i45 = C5031.f17539;
                    if (c17381.getLayoutDirection() == i40) {
                        iM450210 = C19806.m45029("ܽܶ") ^ i19;
                        i10 = ((iM450210 ^ i18) * (-9403)) ^ (-929373744);
                        i11 = 1859714693;
                    } else {
                        iM450210 = C19806.m45029("۠ۙ") ^ i18;
                        i10 = ((iM450210 ^ i19) * (-32495)) ^ (-516387036);
                        i11 = -457493417;
                    }
                    int i46 = iM450210 ^ i11;
                    i24 = i36;
                    i25 = i37;
                    i29 = i44;
                    i17 = i40;
                    i26 = i41;
                    i22 = i30;
                    marginLayoutParams = marginLayoutParams2;
                    i27 = i38;
                    i28 = i39;
                    view8 = view8;
                    c15846 = c15844;
                    i21 = i46;
                    i20 = i10;
                    i23 = i35;
                    break;
                case 623014761:
                case 2127441240:
                    C10634.m26820();
                    if (!C0526.f2219) {
                        c15845 = c15846;
                        i2 = i26;
                        i3 = i27;
                        i4 = i17;
                        iM45029 = C19806.m45029("۬ۢ") ^ i19;
                        i5 = ((iM45029 ^ i18) * (-13435)) ^ (-1647513544);
                        i6 = 1025782039;
                        i8 = iM45029 ^ i6;
                        i20 = i5;
                        i17 = i4;
                        i26 = i2;
                        i22 = i30;
                        i27 = i3;
                        i28 = i28;
                        c15846 = c15845;
                        i21 = i8;
                        i23 = i23;
                        marginLayoutParams = marginLayoutParams;
                        i24 = i24;
                        view8 = view8;
                    } else {
                        i30 = i30;
                        i23 = i23;
                        marginLayoutParams = marginLayoutParams;
                        i7 = i17;
                        i28 = i28;
                        c15845 = c15846;
                        i3 = i27;
                        int iM113012 = (ThreadFactoryC3888.m11306("۫ۖ") + i19) * (-109);
                        i17 = i7;
                        i20 = ((iM113012 ^ i18) * 16063) ^ (-1584966217);
                        i22 = i30;
                        i28 = i28;
                        i21 = iM113012 ^ (-1710430580);
                        i23 = i23;
                        i27 = i3;
                        c15846 = c15845;
                        marginLayoutParams = marginLayoutParams;
                    }
                    break;
                case 750453865:
                case 886819148:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i24;
                    i28 = i28;
                    c15845 = c15846;
                    i2 = i26;
                    i3 = i27;
                    i4 = i17;
                    if (C19806.f63586) {
                        iM45029 = (i18 - C19806.m45029("֫ܿ")) * 59;
                        i5 = ((iM45029 ^ i19) * 29469) ^ 47518026;
                        i6 = -2116614928;
                    } else {
                        iM45029 = C19806.m45029("ܿᩳ") ^ i18;
                        i5 = ((iM45029 ^ i19) * (-24021)) ^ (-1774200165);
                        i6 = 1604762366;
                    }
                    i8 = iM45029 ^ i6;
                    i20 = i5;
                    i17 = i4;
                    i26 = i2;
                    i22 = i30;
                    i27 = i3;
                    i28 = i28;
                    c15846 = c15845;
                    i21 = i8;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i24;
                    view8 = view8;
                    break;
                case 786414209:
                case 1056798237:
                    z = false;
                    iM11306 = (i18 - ThreadFactoryC3888.m11306("ܺۗ")) * 39;
                    i12 = ((iM11306 ^ i19) * 24425) ^ (-563763412);
                    i13 = -431458362;
                    i15 = iM11306 ^ i13;
                    i24 = i24;
                    i25 = i25;
                    i17 = i17;
                    i26 = i26;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i27 = i27;
                    i28 = i28;
                    view8 = view8;
                    c15846 = c15844;
                    i9 = i30;
                    i21 = i15;
                    i20 = i12;
                    i22 = i9;
                    break;
                case 1726119796:
                case 2044021274:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i24;
                    i28 = i28;
                    c15845 = c15846;
                    i2 = i26;
                    i3 = i27;
                    i4 = i17;
                    if (RunnableC0195.f1321 < 0) {
                        iM45029 = C19806.m45029("ᩴ᩸") ^ i18;
                        i5 = ((iM45029 ^ i19) * (-3733)) ^ 1515714983;
                        i6 = 458191621;
                        i8 = iM45029 ^ i6;
                        i20 = i5;
                        i17 = i4;
                        i26 = i2;
                        i22 = i30;
                        i27 = i3;
                        i28 = i28;
                        c15846 = c15845;
                        i21 = i8;
                        i23 = i23;
                        marginLayoutParams = marginLayoutParams;
                        i24 = i24;
                        view8 = view8;
                    } else {
                        i24 = i24;
                        i7 = i4;
                        i26 = i2;
                        int iM113013 = (ThreadFactoryC3888.m11306("۫ۖ") + i19) * (-109);
                        i17 = i7;
                        i20 = ((iM113013 ^ i18) * 16063) ^ (-1584966217);
                        i22 = i30;
                        i28 = i28;
                        i21 = iM113013 ^ (-1710430580);
                        i23 = i23;
                        i27 = i3;
                        c15846 = c15845;
                        marginLayoutParams = marginLayoutParams;
                    }
                    break;
                default:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i24;
                    i28 = i28;
                    c15845 = c15846;
                    i2 = i26;
                    i3 = i27;
                    i4 = i17;
                    zM9874 = ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    iM45029 = ThreadFactoryC3888.m11306("ۢۘ") ^ i19;
                    i5 = ((iM45029 ^ i18) * (-32205)) ^ (-1370188513);
                    i6 = -179871121;
                    i8 = iM45029 ^ i6;
                    i20 = i5;
                    i17 = i4;
                    i26 = i2;
                    i22 = i30;
                    i27 = i3;
                    i28 = i28;
                    c15846 = c15845;
                    i21 = i8;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i24;
                    view8 = view8;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x016b A[PHI: r1 r5 r11
      0x016b: PHI (r1v4 int) = (r1v3 int), (r1v2 int), (r1v2 int) binds: [B:42:0x0169, B:31:0x011d, B:29:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x016b: PHI (r5v4 short[]) = (r5v3 short[]), (r5v2 short[]), (r5v2 short[]) binds: [B:42:0x0169, B:31:0x011d, B:29:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x016b: PHI (r11v4 java.lang.String) = (r11v3 java.lang.String), (r11v2 java.lang.String), (r11v2 java.lang.String) binds: [B:42:0x0169, B:31:0x011d, B:29:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01d9 A[PHI: r9
      0x01d9: PHI (r9v4 android.view.View) = (r9v3 android.view.View), (r9v2 android.view.View), (r9v2 android.view.View), (r9v2 android.view.View) binds: [B:50:0x01d7, B:29:0x011a, B:187:0x01d9, B:20:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x02b2 A[PHI: r8 r12 r14 r15
      0x02b2: PHI (r8v4 java.lang.String) = (r8v3 java.lang.String), (r8v2 java.lang.String), (r8v2 java.lang.String), (r8v2 java.lang.String) binds: [B:69:0x02b0, B:65:0x028a, B:54:0x0213, B:20:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:69:0x02b0, B:65:0x028a, B:54:0x0213, B:20:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:69:0x02b0, B:65:0x028a, B:54:0x0213, B:20:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:69:0x02b0, B:65:0x028a, B:54:0x0213, B:20:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x010a, code lost:
    
        if (l.ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) goto L10;
     */
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m31024() {
        /*
            Method dump skipped, instruction units count: 1890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC12483.m31024():boolean");
    }

    @Override // l.ActivityC19126, android.app.Activity
    public void onPause() {
        String strMo126 = null;
        int i = 898587824;
        int i2 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int i3 = C2871.f10837;
        int iM45029 = C19806.m45029("֨ۙ") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-24449)) ^ 1235557608;
        int i5 = -292418481;
        while (true) {
            i = ((((i ^ i2) * (-27927)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1962061469:
                case 2106703517:
                    if (C2788.f10625 >= 0) {
                        iM45029 = (i2 - C19806.m45029("ۛۧ")) * 83;
                        i4 = ((iM45029 ^ i3) * 287) ^ 19248305;
                        i5 = -42880984;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫۫") + i2) * (-51);
                        i4 = ((iM45029 ^ i3) * (-23591)) ^ 1150079229;
                        i5 = -671502141;
                    }
                    break;
                case -1936839101:
                case -1341282559:
                    if (this.f41638) {
                        iM45029 = C19806.m45029("᩸۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-26369)) ^ (-867952371);
                        i5 = -1837312442;
                    } else {
                        iM45029 = C19806.m45029("᩵ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-27601)) ^ (-2095125114);
                        i5 = 1130455833;
                    }
                    break;
                case -1900080207:
                case 1053246621:
                    if (C2124.f7782 <= 0) {
                        iM45029 = (C19806.m45029("ۗۤ") + i3) * 73;
                        i4 = ((iM45029 ^ i2) * (-15279)) ^ 848529484;
                        i5 = -1916868894;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-14383)) ^ (-1882273094);
                        i5 = -800154226;
                    }
                    break;
                case -1875165761:
                case -725028280:
                    C1025.m3861();
                    if (!C3743.f13569) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫۫") + i2) * (-51);
                        i4 = ((iM45029 ^ i3) * (-23591)) ^ 1150079229;
                        i5 = -671502141;
                    } else {
                        iM45029 = (C19806.m45029("ۖ᩹") + i2) * 5;
                        i4 = ((iM45029 ^ i3) * 14859) ^ 1892235096;
                        i5 = -2096089383;
                    }
                    break;
                case -1593079640:
                case 709127408:
                    if (C1461.f5957 <= 0) {
                        iM45029 = (C19806.m45029("ۖ᩹") + i2) * 5;
                        i4 = ((iM45029 ^ i3) * 14859) ^ 1892235096;
                        i5 = -2096089383;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨۫") + i3) * (-81);
                        i4 = ((iM45029 ^ i2) * 5383) ^ (-377723697);
                        i5 = -786678000;
                    }
                    break;
                case -1510224133:
                case -142518913:
                    if (C3743.f13569) {
                        iM45029 = C19806.m45029("᩶ۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 4307) ^ (-1070365714);
                        i5 = -1711595494;
                    } else {
                        iM45029 = (C19806.m45029("ۖ᩹") + i2) * 5;
                        i4 = ((iM45029 ^ i3) * 14859) ^ 1892235096;
                        i5 = -2096089383;
                    }
                    break;
                case -1328789103:
                case 549960224:
                    if (RunnableC0195.m1431()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-19455)) ^ 1184384955;
                        i5 = -1094395956;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫۫") + i2) * (-51);
                        i4 = ((iM45029 ^ i3) * (-23591)) ^ 1150079229;
                        i5 = -671502141;
                    }
                    break;
                case -1321658092:
                case -594868022:
                    C1066.m4023();
                    break;
                case -1038207175:
                case -617013087:
                    strMo126 = mo126();
                    int i6 = C13184.f43886;
                    if (C15198.m36412()) {
                        iM45029 = C19806.m45029("᩵ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-27601)) ^ (-2095125114);
                        i5 = 1130455833;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۤ᩻")) * 43;
                        i4 = ((iM45029 ^ i2) * (-9511)) ^ (-1807674572);
                        i5 = 961611041;
                    }
                    break;
                case -979215702:
                case -792799575:
                    if (C1189.f5284 <= 0) {
                        iM45029 = (C19806.m45029("ۗۤ") + i3) * 73;
                        i4 = ((iM45029 ^ i2) * (-15279)) ^ 848529484;
                        i5 = -1916868894;
                    } else {
                        iM45029 = C19806.m45029("ᩴۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-28959)) ^ 36657128;
                        i5 = 1453651022;
                    }
                    break;
                case -715623844:
                case 388243116:
                    if (C2871.f10837 >= 0) {
                        iM45029 = (C19806.m45029("ۗۤ") + i3) * 73;
                        i4 = ((iM45029 ^ i2) * (-15279)) ^ 848529484;
                        i5 = -1916868894;
                    } else {
                        iM45029 = C19806.m45029("֨۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * 19247) ^ 389278725;
                        i5 = 2004959030;
                    }
                    break;
                case -603015659:
                case -464004060:
                    if (C2249.f8050 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫۫") + i2) * (-51);
                        i4 = ((iM45029 ^ i3) * (-23591)) ^ 1150079229;
                        i5 = -671502141;
                    } else {
                        iM45029 = C19806.m45029("᩵ۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 26749) ^ (-817617703);
                        i5 = -706644707;
                    }
                    break;
                case -310993641:
                case 1036862361:
                    if (!C3743.f13569) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫۫") + i2) * (-51);
                        i4 = ((iM45029 ^ i3) * (-23591)) ^ 1150079229;
                        i5 = -671502141;
                    } else {
                        iM45029 = (C19806.m45029("ۗۤ") + i3) * 73;
                        i4 = ((iM45029 ^ i2) * (-15279)) ^ 848529484;
                        i5 = -1916868894;
                    }
                    break;
                case -242070837:
                case 144039074:
                    break;
                case 6405463:
                case 1656645910:
                    if (C1668.f6641 >= 0) {
                        iM45029 = (C19806.m45029("ۗۤ") + i3) * 73;
                        i4 = ((iM45029 ^ i2) * (-15279)) ^ 848529484;
                        i5 = -1916868894;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚۜ") ^ i2) * 3;
                        i4 = ((iM45029 ^ i3) * (-30999)) ^ (-645641137);
                        i5 = -241817469;
                    }
                    break;
                case 584386470:
                case 930860166:
                    MobclickAgent.onPageEnd(strMo126);
                    MobclickAgent.onPause(this);
                    iM45029 = C19806.m45029("᩵ܳ") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-27601)) ^ (-2095125114);
                    i5 = 1130455833;
                    break;
                case 1021063821:
                case 1746738123:
                    C3722.m10894();
                    CallableC1627.m5507();
                    iM45029 = (ThreadFactoryC3888.m11306("֫۫") + i2) * (-51);
                    i4 = ((iM45029 ^ i3) * (-23591)) ^ 1150079229;
                    i5 = -671502141;
                    break;
                case 1549969650:
                case 1842043336:
                    super.onPause();
                    if (C1066.m4023() <= 0) {
                        iM45029 = (i2 - C19806.m45029("ۛۧ")) * 83;
                        i4 = ((iM45029 ^ i3) * 287) ^ 19248305;
                        i5 = -42880984;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16437)) ^ (-1411507551);
                        i5 = 1739282716;
                    }
                    break;
                default:
                    if (C7105.f23796 >= 0) {
                        iM45029 = (C19806.m45029("ۡܰ") + i3) * (-89);
                        i4 = ((iM45029 ^ i2) * (-27419)) ^ 1464757201;
                        i5 = 1510463234;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩶") + i3) * (-107);
                        i4 = ((iM45029 ^ i2) * (-19099)) ^ (-1870079726);
                        i5 = -2057430910;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0194 A[PHI: r1 r3 r4 r5 r13
      0x0194: PHI (r1v4 int) = (r1v3 int), (r1v2 int), (r1v2 int), (r1v2 int), (r1v2 int) binds: [B:51:0x0192, B:43:0x0150, B:31:0x00cf, B:12:0x0068, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:51:0x0192, B:43:0x0150, B:31:0x00cf, B:12:0x0068, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:51:0x0192, B:43:0x0150, B:31:0x00cf, B:12:0x0068, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r5v4 java.lang.String) = 
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
      (r5v3 java.lang.String)
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
     binds: [B:51:0x0192, B:43:0x0150, B:31:0x00cf, B:12:0x0068, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r13v4 short[]) = (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:51:0x0192, B:43:0x0150, B:31:0x00cf, B:12:0x0068, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0223 A[PHI: r11 r23
      0x0223: PHI (r11v4 short) = (r11v3 short), (r11v2 short) binds: [B:62:0x0221, B:15:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0223: PHI (r23v5 int) = (r23v4 int), (r23v3 int) binds: [B:62:0x0221, B:15:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x027a A[PHI: r17
      0x027a: PHI (r17v4 char) = (r17v3 char), (r17v2 char) binds: [B:70:0x0278, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02b1 A[PHI: r8 r16 r18
      0x02b1: PHI (r8v3 short) = (r8v2 short), (r8v4 short) binds: [B:74:0x02af, B:66:0x0259] A[DONT_GENERATE, DONT_INLINE]
      0x02b1: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]) binds: [B:74:0x02af, B:66:0x0259] A[DONT_GENERATE, DONT_INLINE]
      0x02b1: PHI (r18v3 int) = (r18v2 int), (r18v4 int) binds: [B:74:0x02af, B:66:0x0259] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02dd A[PHI: r6 r7 r9 r14 r15
      0x02dd: PHI (r6v4 short[]) = (r6v2 short[]), (r6v3 short[]), (r6v2 short[]), (r6v2 short[]), (r6v2 short[]), (r6v2 short[]) binds: [B:47:0x0170, B:35:0x00f2, B:17:0x0074, B:15:0x0070, B:12:0x0068, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x02dd: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:47:0x0170, B:35:0x00f2, B:17:0x0074, B:15:0x0070, B:12:0x0068, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x02dd: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:47:0x0170, B:35:0x00f2, B:17:0x0074, B:15:0x0070, B:12:0x0068, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x02dd: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:47:0x0170, B:35:0x00f2, B:17:0x0074, B:15:0x0070, B:12:0x0068, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x02dd: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:47:0x0170, B:35:0x00f2, B:17:0x0074, B:15:0x0070, B:12:0x0068, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final View m31016(int i) {
        int iM45029;
        int i2;
        int i3;
        int i4 = C2871.f10837;
        int i5 = C2477.f9839;
        int iM11306 = ThreadFactoryC3888.m11306("ۙ᩶") ^ i5;
        int i6 = ((iM11306 ^ i4) * 14095) ^ 1108084677;
        View view = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i7 = iM11306 ^ (-1042410638);
        int i8 = 0;
        int iM450210 = 0;
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        int i14 = 0;
        int i15 = -118324468;
        int i16 = 0;
        String strM7082 = null;
        int i17 = 0;
        while (true) {
            i15 = i7 ^ (i6 & (((i15 ^ i4) * (-19933)) >> 31));
            switch (i15) {
                case -1961106146:
                case -831865156:
                    CallableC1627.m5507();
                    C1398.m4895();
                    iM45029 = C19806.m45029("֨ۛ") ^ i5;
                    i2 = ((iM45029 ^ i4) * (-28963)) ^ (-1843286879);
                    i3 = -501107863;
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -1844444236:
                case -422534408:
                    C0817.m3399();
                    C2249.m6915();
                    return null;
                case -1582973719:
                case 337354289:
                    super.setTitle(i);
                    return view;
                case -1444816963:
                case 844000494:
                    return findViewById(i);
                case -1442219995:
                case -1105493209:
                    iM450210 = C19806.m45029(C1460.m5047(sArr2, i12, i13, i11));
                    i17 = 2118298166;
                    if (C1460.m5050() != 0) {
                        iM45029 = (C19806.m45029("ܶܿ") + i5) * 83;
                        i2 = ((iM45029 ^ i4) * (-27805)) ^ 699315538;
                        i3 = -1532246090;
                    } else {
                        iM45029 = C19806.m45029("ܿۙ") ^ i5;
                        i2 = ((iM45029 ^ i4) * (-6689)) ^ (-982220217);
                        i3 = 1221052363;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -1255144441:
                case -614527208:
                    i11 = 19475;
                    iM45029 = C19806.m45029("᩻ۜ") ^ i4;
                    i2 = ((iM45029 ^ i5) * (-12859)) ^ (-940150409);
                    i3 = -1348589016;
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -1179851479:
                case -151516839:
                    i12 = 415;
                    i13 = 3;
                    if (C10634.m26820()) {
                        iM45029 = C19806.m45029("֨ۛ") ^ i5;
                        i2 = ((iM45029 ^ i4) * (-28963)) ^ (-1843286879);
                        i3 = -501107863;
                    } else {
                        iM45029 = C19806.m45029("ۡ۬") ^ i4;
                        i2 = ((iM45029 ^ i5) * 14083) ^ (-27263783);
                        i3 = 216747392;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -996420125:
                case 1389792858:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() == 0) {
                        iM45029 = C19806.m45029("֨ۛ") ^ i5;
                        i2 = ((iM45029 ^ i4) * (-28963)) ^ (-1843286879);
                        i3 = -501107863;
                    } else {
                        iM45029 = (C19806.m45029("۫᩹") ^ i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i2 = ((iM45029 ^ i5) * (-20401)) ^ 1986793382;
                        i3 = 415294796;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -896543990:
                case 1657466439:
                    if ((s * s2) - i16 <= 0) {
                        iM45029 = (i4 - C19806.m45029("᩺᩷")) * 9;
                        i2 = ((iM45029 ^ i5) * (-32061)) ^ (-1381141904);
                        i3 = -1096138288;
                    } else {
                        iM45029 = C19806.m45029("ۖ۠") ^ i5;
                        i2 = ((iM45029 ^ i4) * 3263) ^ 170263623;
                        i3 = -989734877;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -877396755:
                case 356733636:
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM45029 = (C19806.m45029("ܶܿ") + i5) * 83;
                        i2 = ((iM45029 ^ i4) * (-27805)) ^ 699315538;
                        i3 = -1532246090;
                    } else {
                        iM45029 = (C19806.m45029("ۛ۟") ^ i5) * (-103);
                        i2 = ((iM45029 ^ i4) * (-28309)) ^ 1446318418;
                        i3 = -306744766;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -808608272:
                case 955655775:
                    view = null;
                    if (i8 == (iM450210 ^ i17)) {
                        iM45029 = (C19806.m45029("ۘܳ") + i4) * (-85);
                        i2 = ((iM45029 ^ i5) * 4457) ^ (-747933629);
                        i3 = -693330929;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۚ") ^ i4;
                        i2 = ((iM45029 ^ i5) * (-20135)) ^ 681403171;
                        i3 = -1321586120;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -253038619:
                case 63620816:
                    sArr3 = f41626;
                    i9 = 418;
                    i10 = 3;
                    if (C0817.f3443) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۛ") ^ i5) * (-63);
                        i2 = ((iM45029 ^ i4) * (-30691)) ^ 1824329682;
                        i3 = 345500321;
                    } else {
                        iM45029 = C19806.m45029("֨ۛ") ^ i5;
                        i2 = ((iM45029 ^ i4) * (-28963)) ^ (-1843286879);
                        i3 = -501107863;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -185033705:
                case 224668764:
                    i11 = 12550;
                    iM45029 = C19806.m45029("᩻ۜ") ^ i4;
                    i2 = ((iM45029 ^ i5) * (-12859)) ^ (-940150409);
                    i3 = -1348589016;
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -177578627:
                case 493683557:
                    i8 = i & (-65536);
                    sArr2 = f41626;
                    if (C1461.f5957 <= 0) {
                        iM45029 = (C19806.m45029("ܶܿ") + i5) * 83;
                        i2 = ((iM45029 ^ i4) * (-27805)) ^ 699315538;
                        i3 = -1532246090;
                    } else {
                        iM45029 = C19806.m45029("᩶ܿ") ^ i5;
                        i2 = ((iM45029 ^ i4) * (-24783)) ^ (-61354869);
                        i3 = -2033568706;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -82431411:
                case 1545602995:
                    i16 = i14 + 357285604;
                    s2 = 37804;
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM45029 = (C19806.m45029("۫᩹") ^ i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i2 = ((iM45029 ^ i5) * (-20401)) ^ 1986793382;
                        i3 = 415294796;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ᩷") ^ i5) * 95;
                        i2 = ((iM45029 ^ i4) * (-22887)) ^ 1049310566;
                        i3 = -1068519512;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case 163993562:
                case 1085120066:
                    setContentView(i);
                    return view;
                case 454591685:
                case 694492846:
                    c = 414;
                    if (C1461.m5080()) {
                        iM45029 = (C19806.m45029("ۛ۟") ^ i5) * (-103);
                        i2 = ((iM45029 ^ i4) * (-28309)) ^ 1446318418;
                        i3 = -306744766;
                    } else {
                        iM45029 = (i5 - C19806.m45029("۠ܺ")) * (-95);
                        i2 = ((iM45029 ^ i4) * (-23835)) ^ 2112800635;
                        i3 = 412047674;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case 661650807:
                case 817687736:
                    if (i8 == (C19806.m45029(strM7082) ^ 2127394853)) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺۬") ^ i4;
                        i2 = ((iM45029 ^ i5) * (-30171)) ^ 297348040;
                        i3 = 324441559;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗ֡") ^ i5) * 89;
                        i2 = ((iM45029 ^ i4) * (-27207)) ^ (-1385616453);
                        i3 = -1464383207;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case 708510259:
                case 2090030801:
                    sArr = f41626;
                    if (C0050.m946() <= 0) {
                        iM45029 = (i4 - C19806.m45029("᩸᩵")) * 7;
                        i2 = ((iM45029 ^ i5) * 11955) ^ 1905241804;
                        i3 = 801809412;
                    } else {
                        iM45029 = C19806.m45029("֫ܽ") ^ i5;
                        i2 = ((iM45029 ^ i4) * 9557) ^ (-1800121413);
                        i3 = 1498721970;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case 911781688:
                case 1162739640:
                    C0671.m3008();
                    if (C19806.f63586) {
                        iM45029 = C19806.m45029("֨ۛ") ^ i5;
                        i2 = ((iM45029 ^ i4) * (-28963)) ^ (-1843286879);
                        i3 = -501107863;
                    } else {
                        iM45029 = (C19806.m45029("ܶܿ") + i5) * 83;
                        i2 = ((iM45029 ^ i4) * (-27805)) ^ 699315538;
                        i3 = -1532246090;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case 1185901102:
                case 1385796013:
                    s = sArr[c];
                    i14 = s * s;
                    if (C3286.f12186) {
                        iM45029 = (i4 - C19806.m45029("᩸᩵")) * 7;
                        i2 = ((iM45029 ^ i5) * 11955) ^ 1905241804;
                        i3 = 801809412;
                    } else {
                        iM45029 = C19806.m45029("֨ۙ") ^ i4;
                        i2 = ((iM45029 ^ i5) * (-7405)) ^ 600674519;
                        i3 = -288316658;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case 1999413531:
                case 2015782359:
                    strM7082 = C2332.m7082(sArr3, i9, i10, i11);
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (C19806.m45029("ܶܿ") + i5) * 83;
                        i2 = ((iM45029 ^ i4) * (-27805)) ^ 699315538;
                        i3 = -1532246090;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۢܶ")) * 127;
                        i2 = ((iM45029 ^ i5) * 30191) ^ 1097868661;
                        i3 = -199808336;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                default:
                    if (C2788.f10625 >= 0) {
                        iM45029 = C19806.m45029("֨ۛ") ^ i5;
                        i2 = ((iM45029 ^ i4) * (-28963)) ^ (-1843286879);
                        i3 = -501107863;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶ᩻") ^ i4;
                        i2 = ((iM45029 ^ i5) * (-12183)) ^ (-763417379);
                        i3 = -1731466566;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0189  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31010(AbstractC20745 abstractC20745, List list) {
        int iM11306;
        int i;
        int i2;
        ArrayList arrayList = null;
        String strM3407 = null;
        short[] sArr = null;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -774769526;
        int i6 = C2249.f8050;
        int i7 = RunnableC1606.f6488;
        int iM11307 = ThreadFactoryC3888.m11306("۫ۖ") ^ i7;
        int i8 = ((iM11307 ^ i6) * 25049) ^ (-2019366417);
        int i9 = 1100976010;
        while (true) {
            int i10 = iM11307 ^ i9;
            while (true) {
                i5 = ((((i5 ^ i6) * (-20783)) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -2135204044:
                    case 364758304:
                        sArr = f41626;
                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            iM11306 = (i7 - C19806.m45029("᩹ۘ")) * 33;
                            i = ((iM11306 ^ i6) * (-18909)) ^ 1265439643;
                            i2 = 2017938544;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۙۗ") ^ i6;
                            i = ((iM11306 ^ i7) * (-9843)) ^ 499122513;
                            i2 = -285981866;
                        }
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case -2127801894:
                    case 1265798925:
                        i4 = 63428;
                        iM11306 = (ThreadFactoryC3888.m11306("ܶ᩺") + i7) * (-79);
                        i = ((iM11306 ^ i6) * 10875) ^ 1877692156;
                        i2 = 1928267464;
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case -2027524215:
                    case 1898397201:
                        i4 = 26120;
                        iM11306 = (ThreadFactoryC3888.m11306("ܶ᩺") + i7) * (-79);
                        i = ((iM11306 ^ i6) * 10875) ^ 1877692156;
                        i2 = 1928267464;
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case -1896314156:
                    case -647462807:
                        if (Build.VERSION.SDK_INT >= 26) {
                            iM11306 = C19806.m45029("ܿۡ") ^ i6;
                            i = ((iM11306 ^ i7) * (-5531)) ^ (-429914584);
                            i2 = 2117440273;
                        } else {
                            iM11306 = (C19806.m45029("ۛۛ") + i6) * 33;
                            i = ((iM11306 ^ i7) * 25405) ^ 203787928;
                            i2 = 1575758288;
                        }
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case -1861881985:
                    case -83390276:
                        return true;
                    case -1842394615:
                    case -1591552624:
                        s = sArr[292];
                        if (C1977.f7413 <= 0) {
                            iM11306 = C19806.m45029("ۛۡ") ^ i7;
                            i = ((iM11306 ^ i6) * (-27183)) ^ 1362296816;
                            i2 = 1038869594;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ܿܰ") ^ i7;
                            i = ((iM11306 ^ i6) * 26937) ^ (-777969742);
                            i2 = -1236130114;
                        }
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case -1605157852:
                    case 344177705:
                        arrayList = new ArrayList(list);
                        iM11307 = (C19806.m45029("ܿۚ") + i7) * 41;
                        i8 = ((iM11307 ^ i6) * (-18143)) ^ 721481023;
                        i9 = -1810115691;
                        break;
                    case -1455139374:
                    case 457914350:
                        RunnableC3388.m10064();
                        iM11306 = (C19806.m45029("۬ܳ") + i6) * 37;
                        i = ((iM11306 ^ i7) * (-19937)) ^ 576877962;
                        i2 = -11705659;
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case -1372870566:
                    case -600771165:
                        if (C0629.f2722 <= 0) {
                            iM11307 = (i7 - ThreadFactoryC3888.m11306("᩸۬")) * 27;
                            i8 = ((iM11307 ^ i6) * (-19579)) ^ 513297107;
                            i9 = 1344754786;
                        }
                        iM11306 = (C19806.m45029("۬ܳ") + i6) * 37;
                        i = ((iM11306 ^ i7) * (-19937)) ^ 576877962;
                        i2 = -11705659;
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case -1370979303:
                    case -273615254:
                        if (CallableC1627.m5507() != 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۜۨ") ^ i7) * 109;
                            i = ((iM11306 ^ i6) * 18631) ^ (-1659299308);
                            i2 = -1329920866;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ᩴܳ") ^ i6;
                            i = ((iM11306 ^ i7) * 28055) ^ (-174029268);
                            i2 = -706891920;
                        }
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case -1101650436:
                    case 164840765:
                        if (getPackageManager().canRequestPackageInstalls()) {
                            iM11306 = (C19806.m45029("ۛۛ") + i6) * 33;
                            i = ((iM11306 ^ i7) * 25405) ^ 203787928;
                            i2 = 1575758288;
                        } else {
                            iM11306 = C19806.m45029("۟ᩳ") ^ i7;
                            i = ((iM11306 ^ i6) * (-4281)) ^ 1258055656;
                            i2 = 725984994;
                        }
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case -997023922:
                    case -830807117:
                        this.f41634 = abstractC20745;
                        if (list == null) {
                            iM11306 = (ThreadFactoryC3888.m11306("᩸ܳ") + i7) * 79;
                            i = ((iM11306 ^ i6) * (-14041)) ^ (-1786655505);
                            i2 = 949407550;
                        } else {
                            iM11306 = (i6 - C19806.m45029("᩷֡")) * (-51);
                            i = ((iM11306 ^ i7) * (-16597)) ^ (-1571057506);
                            i2 = 210266821;
                        }
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case -767759900:
                    case 209354165:
                        C2124.m6673();
                        if (C0671.f2816 == 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۙۗ") ^ i6;
                            i = ((iM11306 ^ i7) * (-9843)) ^ 499122513;
                            i2 = -285981866;
                            i10 = iM11306 ^ i2;
                            i8 = i;
                        }
                        iM11306 = (C19806.m45029("۬ܳ") + i6) * 37;
                        i = ((iM11306 ^ i7) * (-19937)) ^ 576877962;
                        i2 = -11705659;
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case -112437486:
                    case 1007449187:
                        arrayList = null;
                        iM11307 = (C19806.m45029("ܿۚ") + i7) * 41;
                        i8 = ((iM11307 ^ i6) * (-18143)) ^ 721481023;
                        i9 = -1810115691;
                        break;
                        break;
                    case -38950690:
                    case 325531461:
                        this.f41629 = arrayList;
                        short[] sArr2 = f41626;
                        if (!C0526.f2219 && !RunnableC1564.f6300) {
                            String strM10056 = RunnableC3388.m10056(sArr2, 293, 8, i4);
                            if (C1419.f5860 < 0) {
                                StringBuilder sb = new StringBuilder(strM10056);
                                C1148.m4223(sb, getPackageName());
                                strM3407 = C0817.m3407(sb);
                                if (!C1419.m4973()) {
                                    iM11307 = (ThreadFactoryC3888.m11306("۫ܿ") + i6) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                    i8 = ((iM11307 ^ i7) * 11501) ^ (-274530270);
                                    i9 = 1638246804;
                                }
                                iM11306 = C19806.m45029("ۛۡ") ^ i7;
                                i = ((iM11306 ^ i6) * (-27183)) ^ 1362296816;
                                i2 = 1038869594;
                                i10 = iM11306 ^ i2;
                                i8 = i;
                            }
                            iM11306 = (ThreadFactoryC3888.m11306("ۜۨ") ^ i7) * 109;
                            i = ((iM11306 ^ i6) * 18631) ^ (-1659299308);
                            i2 = -1329920866;
                            i10 = iM11306 ^ i2;
                            i8 = i;
                        }
                        iM11306 = (C19806.m45029("۬ܳ") + i6) * 37;
                        i = ((iM11306 ^ i7) * (-19937)) ^ 576877962;
                        i2 = -11705659;
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case -9534877:
                    case 781699367:
                        C1875.m6086();
                        if (RunnableC3388.f12514 >= 0) {
                            iM11307 = (i7 - ThreadFactoryC3888.m11306("᩸۬")) * 27;
                            i8 = ((iM11307 ^ i6) * (-19579)) ^ 513297107;
                            i9 = 1344754786;
                        }
                        iM11306 = (ThreadFactoryC3888.m11306("ۜۨ") ^ i7) * 109;
                        i = ((iM11306 ^ i6) * 18631) ^ (-1659299308);
                        i2 = -1329920866;
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case 166420097:
                    case 1021040746:
                        Uri uri = Uri.parse(strM3407);
                        short[] sArr3 = f41626;
                        if (!C0817.m3399()) {
                            iM11307 = (i7 - ThreadFactoryC3888.m11306("᩸۬")) * 27;
                            i8 = ((iM11307 ^ i6) * (-19579)) ^ 513297107;
                            i9 = 1344754786;
                        }
                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            this.f41639.m23450(new Intent(C2871.m8640(sArr3, 301, 43, i4), uri));
                            return false;
                        }
                        iM11306 = C19806.m45029("ۛۡ") ^ i7;
                        i = ((iM11306 ^ i6) * (-27183)) ^ 1362296816;
                        i2 = 1038869594;
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                        break;
                    case 311903411:
                    case 1501894583:
                        i3 = (s * s) + 100060009;
                        if (C1937.m6279() >= 0) {
                            iM11306 = (C19806.m45029("۬ܳ") + i6) * 37;
                            i = ((iM11306 ^ i7) * (-19937)) ^ 576877962;
                            i2 = -11705659;
                        } else {
                            iM11306 = (C19806.m45029("ܽܶ") ^ i6) * (-9);
                            i = ((iM11306 ^ i7) * 22033) ^ (-1927212981);
                            i2 = -2006490;
                        }
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                    case 825733131:
                    case 1340149547:
                        C2332.m7079();
                        C3743.m10966();
                        return false;
                    default:
                        if (i3 - (s * 20006) >= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۜܳ") ^ i6;
                            i = ((iM11306 ^ i7) * 5741) ^ 98912823;
                            i2 = -1961818699;
                        } else {
                            iM11306 = (i7 - ThreadFactoryC3888.m11306("ܰۤ")) * (-9);
                            i = ((iM11306 ^ i6) * (-13759)) ^ 1793250827;
                            i2 = -531186771;
                        }
                        i10 = iM11306 ^ i2;
                        i8 = i;
                        break;
                }
            }
        }
    }

    @Override // l.ActivityC19126, android.app.Activity
    public void onResume() {
        String strMo126 = null;
        Runnable runnable = null;
        Runnable runnable2 = null;
        int i = 2029252052;
        int i2 = ThreadFactoryC3888.f14547;
        int i3 = C3577.f13150;
        int iM45029 = C19806.m45029("᩺ۘ") ^ i2;
        int i4 = ((iM45029 ^ i3) * (-13235)) ^ 2042900094;
        int i5 = 820618943;
        while (true) {
            i = ((((i ^ i3) * 25495) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2010855901:
                case 848581009:
                    strMo126 = mo126();
                    int i6 = C13184.f43886;
                    if (C15198.m36412()) {
                        iM45029 = (i3 - C19806.m45029("۬ܶ")) * (-99);
                        i4 = ((iM45029 ^ i2) * (-24123)) ^ 2076196075;
                        i5 = -646688826;
                    } else {
                        iM45029 = (C19806.m45029("ۨܿ") ^ i3) * 31;
                        i4 = ((iM45029 ^ i2) * (-11303)) ^ (-1526426021);
                        i5 = -1943426811;
                    }
                    break;
                case -1900109954:
                case 1871204035:
                    if (C3743.f13569) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷۠") ^ i3) * 99;
                        i4 = ((iM45029 ^ i2) * (-19543)) ^ (-1950487279);
                        i5 = -762485673;
                    } else {
                        iM45029 = (C19806.m45029("ᩳۤ") + i2) * (-13);
                        i4 = ((iM45029 ^ i3) * 12329) ^ 202005253;
                        i5 = 1999362521;
                    }
                    break;
                case -1860840473:
                case 1192767223:
                    if (C3535.m10431() <= 0) {
                        iM45029 = C19806.m45029("ܶۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-9979)) ^ (-1437872992);
                        i5 = -1157796086;
                    } else {
                        iM45029 = C19806.m45029("ۖ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-6943)) ^ 1003412991;
                        i5 = 343083000;
                    }
                    break;
                case -1741863003:
                case 132369490:
                    if (!ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM45029 = (C19806.m45029("᩸ۘ") ^ i3) * (-71);
                        i4 = ((iM45029 ^ i2) * (-1715)) ^ 1486949656;
                        i5 = -756495029;
                    } else {
                        iM45029 = (C19806.m45029("ᩳۤ") + i2) * (-13);
                        i4 = ((iM45029 ^ i3) * 12329) ^ 202005253;
                        i5 = 1999362521;
                    }
                    break;
                case -1425059685:
                case -1034637424:
                    C1419.m4973();
                    iM45029 = C19806.m45029("ܶۨ") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-9979)) ^ (-1437872992);
                    i5 = -1157796086;
                    break;
                case -1341063302:
                case -1054350841:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM45029 = (i3 - C19806.m45029("ܽۗ")) * 13;
                        i4 = ((iM45029 ^ i2) * 17709) ^ (-2092992102);
                        i5 = -612144105;
                    } else {
                        iM45029 = (C19806.m45029("᩸ۘ") ^ i3) * (-71);
                        i4 = ((iM45029 ^ i2) * (-1715)) ^ 1486949656;
                        i5 = -756495029;
                    }
                    break;
                case -1298799013:
                case 82681934:
                    if (C0817.f3443) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷֫") + i2) * 119;
                        i4 = ((iM45029 ^ i3) * (-27021)) ^ (-437795444);
                        i5 = 1743374749;
                    } else {
                        iM45029 = (C19806.m45029("᩸ۘ") ^ i3) * (-71);
                        i4 = ((iM45029 ^ i2) * (-1715)) ^ 1486949656;
                        i5 = -756495029;
                    }
                    break;
                case -1272605752:
                case 182348657:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (C19806.m45029("ۛ᩵") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i2) * (-9079)) ^ (-265776936);
                        i5 = 611154843;
                    } else {
                        iM45029 = C19806.m45029("ܶۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-9979)) ^ (-1437872992);
                        i5 = -1157796086;
                    }
                    break;
                case -1129181811:
                case 229289781:
                    runnable = this.f41640;
                    runnable2 = null;
                    if (C0216.f1393 != 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܶۗ")) * (-41);
                        i4 = ((iM45029 ^ i3) * 22847) ^ 2099115959;
                        i5 = -1708968545;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩺ۡ")) * (-49);
                        i4 = ((iM45029 ^ i2) * 17923) ^ 1710106251;
                        i5 = 1950215061;
                    }
                    break;
                case -868559600:
                case 1155223495:
                    if (C1668.f6641 >= 0) {
                        iM45029 = C19806.m45029("ܶۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-9979)) ^ (-1437872992);
                        i5 = -1157796086;
                    } else {
                        iM45029 = C19806.m45029("᩶ۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 9153) ^ (-1592398877);
                        i5 = 677093161;
                    }
                    break;
                case -746176648:
                case -488128611:
                    C0278.m1783(this);
                    iM45029 = (i2 - C19806.m45029("᩷᩷")) * 27;
                    i4 = ((iM45029 ^ i3) * (-595)) ^ (-1286718902);
                    i5 = 618583460;
                    break;
                case -518101167:
                case 955836776:
                    break;
                case -464391254:
                case 150067503:
                    if (C1148.f5161 <= 0) {
                        iM45029 = (i3 - C19806.m45029("ܽۗ")) * 13;
                        i4 = ((iM45029 ^ i2) * 17709) ^ (-2092992102);
                        i5 = -612144105;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶᩸") + i2) * (-95);
                        i4 = ((iM45029 ^ i3) * 13933) ^ (-1060513375);
                        i5 = 2126536033;
                    }
                    break;
                case -405910749:
                case 1324942410:
                    if (C16737.m39260()) {
                        iM45029 = C19806.m45029("ۡۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-26749)) ^ 1741787783;
                        i5 = -1266357832;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩷᩷")) * 27;
                        i4 = ((iM45029 ^ i3) * (-595)) ^ (-1286718902);
                        i5 = 618583460;
                    }
                    break;
                case -337389322:
                case 345410863:
                    if (!C2332.f8260) {
                        iM45029 = (C19806.m45029("᩸ۘ") ^ i3) * (-71);
                        i4 = ((iM45029 ^ i2) * (-1715)) ^ 1486949656;
                        i5 = -756495029;
                    } else {
                        iM45029 = C19806.m45029("ܶۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-9979)) ^ (-1437872992);
                        i5 = -1157796086;
                    }
                    break;
                case -64732110:
                case 540068651:
                    C0962.m3746();
                    C10634.m26820();
                    break;
                case -1111081:
                case 1104797652:
                    if (C0817.f3443) {
                        iM45029 = C19806.m45029("ܰ۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * 30829) ^ 1129597007;
                        i5 = 314056812;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܽۗ")) * 13;
                        i4 = ((iM45029 ^ i2) * 17709) ^ (-2092992102);
                        i5 = -612144105;
                    }
                    break;
                case 57548442:
                case 852486265:
                    MobclickAgent.onPageStart(strMo126);
                    MobclickAgent.onResume(this);
                    iM45029 = (i3 - C19806.m45029("۬ܶ")) * (-99);
                    i4 = ((iM45029 ^ i2) * (-24123)) ^ 2076196075;
                    i5 = -646688826;
                    break;
                case 257274201:
                case 1744037842:
                    if (C3286.f12186) {
                        iM45029 = (C19806.m45029("ᩳۤ") + i2) * (-13);
                        i4 = ((iM45029 ^ i3) * 12329) ^ 202005253;
                        i5 = 1999362521;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۤۘ")) * 91;
                        i4 = ((iM45029 ^ i3) * 20739) ^ (-1483018198);
                        i5 = -188060188;
                    }
                    break;
                case 629163566:
                case 1720260389:
                    super.onResume();
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = (C19806.m45029("ᩳۤ") + i2) * (-13);
                        i4 = ((iM45029 ^ i3) * 12329) ^ 202005253;
                        i5 = 1999362521;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۖۜ")) * 25;
                        i4 = ((iM45029 ^ i3) * (-995)) ^ (-1426546384);
                        i5 = 1702721151;
                    }
                    break;
                case 728322689:
                case 2099023162:
                    this.f41640 = runnable2;
                    C2871.m8647(runnable);
                    iM45029 = (ThreadFactoryC3888.m11306("֡ܰ") + i3) * (-13);
                    i4 = ((iM45029 ^ i2) * 22527) ^ 1525452151;
                    i5 = -1002165051;
                    break;
                case 1311567541:
                case 1493926776:
                    if (this.f41638) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("֡ۨ")) * (-83);
                        i4 = ((iM45029 ^ i3) * (-5009)) ^ (-530922844);
                        i5 = 1976686394;
                    } else {
                        iM45029 = (i3 - C19806.m45029("۬ܶ")) * (-99);
                        i4 = ((iM45029 ^ i2) * (-24123)) ^ 2076196075;
                        i5 = -646688826;
                    }
                    break;
                default:
                    C12670.m31504(this);
                    if (this.f41640 != null) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۙ᩶")) * 79;
                        i4 = ((iM45029 ^ i3) * 27541) ^ 790581498;
                        i5 = -1513667108;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡ܰ") + i3) * (-13);
                        i4 = ((iM45029 ^ i2) * 22527) ^ 1525452151;
                        i5 = -1002165051;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00bb A[PHI: r24
      0x00bb: PHI (r24v18 int) = (r24v17 int), (r24v21 int) binds: [B:18:0x00b8, B:14:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x03bd A[PHI: r7 r15 r18 r19 r24 r25 r26 r27
      0x03bd: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:94:0x03bb, B:73:0x02d5] A[DONT_GENERATE, DONT_INLINE]
      0x03bd: PHI (r15v3 short[]) = (r15v2 short[]), (r15v4 short[]) binds: [B:94:0x03bb, B:73:0x02d5] A[DONT_GENERATE, DONT_INLINE]
      0x03bd: PHI (r18v4 short) = (r18v3 short), (r18v2 short) binds: [B:94:0x03bb, B:73:0x02d5] A[DONT_GENERATE, DONT_INLINE]
      0x03bd: PHI (r19v4 short) = (r19v3 short), (r19v2 short) binds: [B:94:0x03bb, B:73:0x02d5] A[DONT_GENERATE, DONT_INLINE]
      0x03bd: PHI (r24v35 int) = (r24v26 int), (r24v36 int) binds: [B:94:0x03bb, B:73:0x02d5] A[DONT_GENERATE, DONT_INLINE]
      0x03bd: PHI (r25v36 java.lang.String) = (r25v27 java.lang.String), (r25v37 java.lang.String) binds: [B:94:0x03bb, B:73:0x02d5] A[DONT_GENERATE, DONT_INLINE]
      0x03bd: PHI (r26v18 java.lang.Object) = (r26v9 java.lang.Object), (r26v19 java.lang.Object) binds: [B:94:0x03bb, B:73:0x02d5] A[DONT_GENERATE, DONT_INLINE]
      0x03bd: PHI (r27v12 int) = (r27v6 int), (r27v13 int) binds: [B:94:0x03bb, B:73:0x02d5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC17421
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30999(String str) {
        int iM45029;
        int i;
        int i2;
        int iM450210;
        int i3;
        int i4;
        int iM450211;
        int i5;
        int i6;
        int i7 = C3577.f13150;
        int i8 = C3660.f13403;
        int iM450212 = C19806.m45029("֨ۢ") ^ i8;
        int i9 = ((iM450212 ^ i7) * (-9229)) ^ 747280145;
        String strM4365 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i10 = iM450212 ^ (-176212136);
        String strM2424 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        short s3 = 0;
        int i18 = 1719695096;
        Object obj = null;
        int i19 = 0;
        while (true) {
            i18 = i10 ^ ((((i18 ^ i7) * 55) >> 31) & i9);
            switch (i18) {
                case -2109062681:
                case -99849152:
                    strM2424 = strM2424;
                    obj = obj;
                    i14 = i14;
                    i16 = i16;
                    i12 = 45;
                    if (RunnableC1895.m6170() == 0) {
                        iM450210 = C19806.m45029("᩹ۚ") ^ i8;
                        i3 = ((iM450210 ^ i7) * (-3869)) ^ 759510032;
                        i4 = -962193936;
                        i6 = iM450210 ^ i4;
                        i14 = i14;
                        obj = obj;
                        i16 = i16;
                        i10 = i6;
                        i9 = i3;
                        strM2424 = strM2424;
                    } else {
                        i14 = i14;
                        strM2424 = strM2424;
                        int iM450213 = (i8 - C19806.m45029("ۚۖ")) * 87;
                        i10 = iM450213 ^ (-2090011481);
                        i9 = ((iM450213 ^ i7) * 14865) ^ (-685306076);
                        obj = obj;
                        i16 = i16;
                    }
                    break;
                case -2039014255:
                case 719358390:
                    strM2424 = strM2424;
                    obj = obj;
                    i14 = i14;
                    i16 = i16;
                    if ((i16 * i16) - i14 < 0) {
                        iM450210 = ThreadFactoryC3888.m11306("֨ܿ") ^ i8;
                        i3 = ((iM450210 ^ i7) * 28417) ^ 1819575898;
                        i4 = 893495592;
                    } else {
                        iM450210 = C19806.m45029("᩶ۛ") ^ i7;
                        i3 = ((iM450210 ^ i8) * 6351) ^ (-1459330582);
                        i4 = 110418546;
                    }
                    i6 = iM450210 ^ i4;
                    i14 = i14;
                    obj = obj;
                    i16 = i16;
                    i10 = i6;
                    i9 = i3;
                    strM2424 = strM2424;
                    break;
                case -2032462271:
                case -2407407:
                case 445612669:
                case 1634381855:
                    break;
                case -1871927573:
                case 324975473:
                    strM2424 = strM2424;
                    obj = obj;
                    i14 = i14;
                    i16 = i16;
                    sArr2 = f41626;
                    i11 = 147;
                    if (CallableC1627.f6528) {
                        iM450210 = ThreadFactoryC3888.m11306("ܰ᩹") ^ i7;
                        i3 = ((iM450210 ^ i8) * (-15923)) ^ 1300275170;
                        i4 = 1623316314;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("ۘۚ") ^ i7) * 37;
                        i3 = ((iM450210 ^ i8) * 21061) ^ (-250421763);
                        i4 = 1997031120;
                    }
                    i6 = iM450210 ^ i4;
                    i14 = i14;
                    obj = obj;
                    i16 = i16;
                    i10 = i6;
                    i9 = i3;
                    strM2424 = strM2424;
                    break;
                case -1738349023:
                case -1561379076:
                    i17 = 56954;
                    iM450210 = C19806.m45029("۬۠") ^ i8;
                    i3 = ((iM450210 ^ i7) * (-15821)) ^ 32548982;
                    i4 = 130177756;
                    i6 = iM450210 ^ i4;
                    i14 = i14;
                    obj = obj;
                    i16 = i16;
                    i10 = i6;
                    i9 = i3;
                    strM2424 = strM2424;
                    break;
                case -1717565043:
                case -873801145:
                    i14 = i14;
                    if (!C0962.f3784) {
                        obj = obj;
                        i16 = i16;
                        i14 = i14;
                        int iM450214 = (i8 - C19806.m45029("ۚۖ")) * 87;
                        i10 = iM450214 ^ (-2090011481);
                        i9 = ((iM450214 ^ i7) * 14865) ^ (-685306076);
                        obj = obj;
                        i16 = i16;
                    } else {
                        iM45029 = C19806.m45029("ۧ֫") ^ i7;
                        i = ((iM45029 ^ i8) * 1289) ^ 640427023;
                        i2 = -117268392;
                        int i20 = i14;
                        i10 = iM45029 ^ i2;
                        i9 = i;
                        i14 = i20;
                    }
                    break;
                case -1707556814:
                case 2017512943:
                    i14 = i14;
                    if (RunnableC1606.f6488 < 0) {
                        i16 = i16;
                        iM450210 = C19806.m45029("ܺܳ") ^ i8;
                        i3 = ((iM450210 ^ i7) * 15785) ^ 198676406;
                        i4 = 1198336011;
                        i6 = iM450210 ^ i4;
                        i14 = i14;
                        obj = obj;
                        i16 = i16;
                        i10 = i6;
                        i9 = i3;
                        strM2424 = strM2424;
                    } else {
                        iM45029 = C19806.m45029("ۧ֫") ^ i7;
                        i = ((iM45029 ^ i8) * 1289) ^ 640427023;
                        i2 = -117268392;
                        int i21 = i14;
                        i10 = iM45029 ^ i2;
                        i9 = i;
                        i14 = i21;
                    }
                    break;
                case -1671781628:
                case -328038347:
                    i17 = 12683;
                    iM450210 = C19806.m45029("۬۠") ^ i8;
                    i3 = ((iM450210 ^ i7) * (-15821)) ^ 32548982;
                    i4 = 130177756;
                    i6 = iM450210 ^ i4;
                    i14 = i14;
                    obj = obj;
                    i16 = i16;
                    i10 = i6;
                    i9 = i3;
                    strM2424 = strM2424;
                    break;
                case -1507671499:
                case 814818416:
                    strM2424 = strM2424;
                    obj = obj;
                    i16 = i16;
                    i14 = s2 * s;
                    s3 = 10455;
                    if (C1419.f5860 >= 0) {
                        strM2424 = strM2424;
                        int iM450215 = (i8 - C19806.m45029("ۚۖ")) * 87;
                        i10 = iM450215 ^ (-2090011481);
                        i9 = ((iM450215 ^ i7) * 14865) ^ (-685306076);
                    } else {
                        int iM11306 = ThreadFactoryC3888.m11306("ۢۛ") ^ i8;
                        i10 = iM11306 ^ 1004919423;
                        i9 = ((iM11306 ^ i7) * 1223) ^ 793825477;
                        strM2424 = strM2424;
                    }
                    obj = obj;
                    i16 = i16;
                    break;
                case -1431616591:
                case 1359679282:
                    obj = obj;
                    i14 = i14;
                    i16 = i16;
                    strM2424 = C0526.m2424(sArr2, i11, i12, i17);
                    sArr3 = f41626;
                    if (C0050.f912 <= 0) {
                        i14 = i14;
                        int iM450216 = (i8 - C19806.m45029("ۚۖ")) * 87;
                        i10 = iM450216 ^ (-2090011481);
                        i9 = ((iM450216 ^ i7) * 14865) ^ (-685306076);
                        obj = obj;
                        i16 = i16;
                    } else {
                        int iM450217 = C19806.m45029("᩶᩶") ^ i7;
                        i14 = i14;
                        i16 = i16;
                        i10 = iM450217 ^ 1307195957;
                        i9 = ((iM450217 ^ i8) * (-5651)) ^ (-1671838603);
                        obj = obj;
                    }
                    break;
                case -1404360955:
                case 1956498207:
                    strM2424 = strM2424;
                    obj = obj;
                    i14 = i14;
                    i16 = s2 + s3;
                    if (C1398.f5802 <= 0) {
                        iM450211 = C19806.m45029("ܿ᩶") ^ i8;
                        i3 = ((iM450211 ^ i7) * 5147) ^ 2126918090;
                        i5 = -1150938175;
                    } else {
                        iM450211 = C19806.m45029("ۘ᩺") ^ i7;
                        i3 = ((iM450211 ^ i8) * (-19599)) ^ 1539609781;
                        i5 = 481996896;
                    }
                    i6 = iM450211 ^ i5;
                    i14 = i14;
                    obj = obj;
                    i10 = i6;
                    i9 = i3;
                    strM2424 = strM2424;
                    break;
                case -1183665312:
                case 380643003:
                    i14 = i14;
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (C2249.f8050 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜᩳ") ^ i7;
                        i = ((iM45029 ^ i8) * 15353) ^ (-1521345531);
                        i2 = 1361540867;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۛ") ^ i8;
                        i = ((iM45029 ^ i7) * (-27019)) ^ 357318523;
                        i2 = -2049445129;
                    }
                    int i22 = i14;
                    i10 = iM45029 ^ i2;
                    i9 = i;
                    i14 = i22;
                    break;
                case -1177912456:
                case -354529782:
                    strM2424 = strM2424;
                    obj = obj;
                    i14 = i14;
                    i16 = i16;
                    sArr = f41626;
                    if (C1066.m4023() > 0) {
                        iM450210 = (i8 - ThreadFactoryC3888.m11306("֡֨")) * (-91);
                        i3 = ((iM450210 ^ i7) * 31667) ^ 776571696;
                        i4 = -652831621;
                        i6 = iM450210 ^ i4;
                        i14 = i14;
                        obj = obj;
                        i16 = i16;
                        i10 = i6;
                        i9 = i3;
                        strM2424 = strM2424;
                    } else {
                        i16 = i16;
                        iM450211 = C19806.m45029("ܿ᩶") ^ i8;
                        i3 = ((iM450211 ^ i7) * 5147) ^ 2126918090;
                        i5 = -1150938175;
                        i6 = iM450211 ^ i5;
                        i14 = i14;
                        obj = obj;
                        i10 = i6;
                        i9 = i3;
                        strM2424 = strM2424;
                    }
                    break;
                case -1067393438:
                case 1664609284:
                    i14 = i14;
                    try {
                        Intent intent = new Intent(strM2424);
                        strM2424 = strM2424;
                        obj = obj;
                        try {
                            i16 = i16;
                            try {
                                intent.setComponent(new ComponentName(C1668.m5577(f41626, 200, 20, i17), C2249.m6918(f41626, 220, 53, i17)));
                                StringBuilder sb = new StringBuilder(strM4365);
                                C1148.m4223(sb, str);
                                intent.setData(Uri.parse(C0817.m3407(sb)));
                                C1977.m6359(intent, i19);
                                C3286.m9800(this, intent);
                                iM450210 = (i8 - C19806.m45029("ܳܶ")) * 99;
                                i3 = ((iM450210 ^ i7) * (-22317)) ^ (-1149337557);
                                i4 = -1116584227;
                            } catch (Throwable unused) {
                                iM450210 = (i7 - C19806.m45029("ܰۤ")) * 95;
                                i3 = ((iM450210 ^ i8) * 27113) ^ (-1182809680);
                                i4 = 885514399;
                            }
                        } catch (Throwable unused2) {
                            i16 = i16;
                            iM450210 = (i7 - C19806.m45029("ܰۤ")) * 95;
                            i3 = ((iM450210 ^ i8) * 27113) ^ (-1182809680);
                            i4 = 885514399;
                            i6 = iM450210 ^ i4;
                            i14 = i14;
                            obj = obj;
                            i16 = i16;
                            i10 = i6;
                            i9 = i3;
                            strM2424 = strM2424;
                            break;
                        }
                    } catch (Throwable unused3) {
                        strM2424 = strM2424;
                        obj = obj;
                    }
                    i6 = iM450210 ^ i4;
                    i14 = i14;
                    obj = obj;
                    i16 = i16;
                    i10 = i6;
                    i9 = i3;
                    strM2424 = strM2424;
                    break;
                case -933869483:
                case 436121377:
                    strM2424 = strM2424;
                    obj = obj;
                    i14 = i14;
                    i16 = i16;
                    strM4365 = C1189.m4365(sArr3, i13, i15, i17);
                    i19 = 268435456;
                    iM450210 = C19806.m45029("ᩳ֡") ^ i8;
                    i3 = ((iM450210 ^ i7) * (-30387)) ^ (-1735590432);
                    i4 = -191171383;
                    i6 = iM450210 ^ i4;
                    i14 = i14;
                    obj = obj;
                    i16 = i16;
                    i10 = i6;
                    i9 = i3;
                    strM2424 = strM2424;
                    break;
                case -867392649:
                case -833708502:
                    strM2424 = strM2424;
                    obj = obj;
                    i14 = i14;
                    i16 = i16;
                    c = 146;
                    if (C0216.f1393 == 0) {
                        iM450210 = ThreadFactoryC3888.m11306("᩷ܺ") ^ i8;
                        i3 = ((iM450210 ^ i7) * 20643) ^ 542337379;
                        i4 = -56302008;
                        i6 = iM450210 ^ i4;
                        i14 = i14;
                        obj = obj;
                        i16 = i16;
                        i10 = i6;
                        i9 = i3;
                        strM2424 = strM2424;
                    } else {
                        i14 = i14;
                        strM2424 = strM2424;
                        int iM450218 = (i8 - C19806.m45029("ۚۖ")) * 87;
                        i10 = iM450218 ^ (-2090011481);
                        i9 = ((iM450218 ^ i7) * 14865) ^ (-685306076);
                        obj = obj;
                        i16 = i16;
                    }
                    break;
                case -792465807:
                case 1445225942:
                    i14 = i14;
                    C1066.m4023();
                    iM45029 = C19806.m45029("ۧ֫") ^ i7;
                    i = ((iM45029 ^ i8) * 1289) ^ 640427023;
                    i2 = -117268392;
                    int i23 = i14;
                    i10 = iM45029 ^ i2;
                    i9 = i;
                    i14 = i23;
                    break;
                case -753040836:
                case 1158791070:
                    i14 = i14;
                    try {
                        Intent intent2 = new Intent(strM2424);
                        StringBuilder sb2 = new StringBuilder(strM4365);
                        C1148.m4223(sb2, str);
                        intent2.setData(Uri.parse(C0817.m3407(sb2)));
                        C1977.m6359(intent2, i19);
                        C1419.m4977(this, intent2);
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("᩵᩺")) * 49;
                        i = ((iM45029 ^ i8) * 26651) ^ (-720502257);
                        i2 = 1602019423;
                    } catch (Throwable th) {
                        obj = th;
                        iM45029 = C19806.m45029("ۧܳ") ^ i8;
                        i = ((iM45029 ^ i7) * (-5181)) ^ (-2010745376);
                        i2 = -362519399;
                    }
                    int i24 = i14;
                    i10 = iM45029 ^ i2;
                    i9 = i;
                    i14 = i24;
                    break;
                case -747735709:
                case 309921975:
                    i14 = i14;
                    if (C2871.f10837 < 0) {
                        strM2424 = strM2424;
                        obj = obj;
                        iM450211 = C19806.m45029("ܿ᩶") ^ i8;
                        i3 = ((iM450211 ^ i7) * 5147) ^ 2126918090;
                        i5 = -1150938175;
                        i6 = iM450211 ^ i5;
                        i14 = i14;
                        obj = obj;
                        i10 = i6;
                        i9 = i3;
                        strM2424 = strM2424;
                    } else {
                        iM45029 = C19806.m45029("ۧ֫") ^ i7;
                        i = ((iM45029 ^ i8) * 1289) ^ 640427023;
                        i2 = -117268392;
                        int i25 = i14;
                        i10 = iM45029 ^ i2;
                        i9 = i;
                        i14 = i25;
                    }
                    break;
                case -685492570:
                case -158250173:
                    strM2424 = strM2424;
                    obj = obj;
                    i14 = i14;
                    i16 = i16;
                    i13 = 192;
                    i15 = 8;
                    if (!C3743.f13569) {
                        i14 = i14;
                        strM2424 = strM2424;
                        int iM450219 = (i8 - C19806.m45029("ۚۖ")) * 87;
                        i10 = iM450219 ^ (-2090011481);
                        i9 = ((iM450219 ^ i7) * 14865) ^ (-685306076);
                        obj = obj;
                        i16 = i16;
                    } else {
                        iM450210 = (i7 - C19806.m45029("ۛ᩹")) * 61;
                        i3 = ((iM450210 ^ i8) * (-11255)) ^ 397514086;
                        i4 = -78547872;
                        i6 = iM450210 ^ i4;
                        i14 = i14;
                        obj = obj;
                        i16 = i16;
                        i10 = i6;
                        i9 = i3;
                        strM2424 = strM2424;
                    }
                    break;
                case -391634130:
                case 1169487536:
                    i14 = i14;
                    C3722.m10894();
                    if (C2871.f10837 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۛ") ^ i8;
                        i = ((iM45029 ^ i7) * (-27019)) ^ 357318523;
                        i2 = -2049445129;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۗ") ^ i7;
                        i = ((iM45029 ^ i8) * 5223) ^ (-2115977662);
                        i2 = -1937917945;
                    }
                    int i26 = i14;
                    i10 = iM45029 ^ i2;
                    i9 = i;
                    i14 = i26;
                    break;
                case -347407310:
                case 1795816616:
                    strM2424 = strM2424;
                    obj = obj;
                    i14 = i14;
                    i16 = i16;
                    s2 = sArr[c];
                    s = 41820;
                    if (C2642.f10294 <= 0) {
                        iM450210 = (ThreadFactoryC3888.m11306("ۘۚ") ^ i7) * 37;
                        i3 = ((iM450210 ^ i8) * 21061) ^ (-250421763);
                        i4 = 1997031120;
                    } else {
                        iM450210 = C19806.m45029("ۨ᩻") ^ i7;
                        i3 = ((iM450210 ^ i8) * (-16707)) ^ (-1596995598);
                        i4 = -1436772688;
                    }
                    i6 = iM450210 ^ i4;
                    i14 = i14;
                    obj = obj;
                    i16 = i16;
                    i10 = i6;
                    i9 = i3;
                    strM2424 = strM2424;
                    break;
                case -239987038:
                case 2110429430:
                    i14 = i14;
                    C1875.m6102(this, obj, null);
                    iM45029 = (i7 - ThreadFactoryC3888.m11306("᩵᩺")) * 49;
                    i = ((iM45029 ^ i8) * 26651) ^ (-720502257);
                    i2 = 1602019423;
                    int i27 = i14;
                    i10 = iM45029 ^ i2;
                    i9 = i;
                    i14 = i27;
                    break;
                case 162493422:
                case 1657905185:
                    strM2424 = strM2424;
                    obj = obj;
                    i14 = i14;
                    i16 = i16;
                    if (C1875.f7103 >= 0) {
                        iM450210 = C19806.m45029("ܺܳ") ^ i8;
                        i3 = ((iM450210 ^ i7) * 15785) ^ 198676406;
                        i4 = 1198336011;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ܿ۬") ^ i7;
                        i3 = ((iM450210 ^ i8) * 22421) ^ (-806764781);
                        i4 = 1880353748;
                    }
                    i6 = iM450210 ^ i4;
                    i14 = i14;
                    obj = obj;
                    i16 = i16;
                    i10 = i6;
                    i9 = i3;
                    strM2424 = strM2424;
                    break;
                case 683634277:
                case 710789334:
                    ThreadFactoryC3888.m11300();
                    if (C2788.f10625 >= 0) {
                        iM45029 = C19806.m45029("᩶۬") ^ i8;
                        i14 = i14;
                        i = ((iM45029 ^ i7) * 11347) ^ 1216334284;
                        i2 = -770052923;
                        int i28 = i14;
                        i10 = iM45029 ^ i2;
                        i9 = i;
                        i14 = i28;
                    } else {
                        i14 = i14;
                        i16 = i16;
                        iM450210 = C19806.m45029("ܺܳ") ^ i8;
                        i3 = ((iM450210 ^ i7) * 15785) ^ 198676406;
                        i4 = 1198336011;
                        i6 = iM450210 ^ i4;
                        i14 = i14;
                        obj = obj;
                        i16 = i16;
                        i10 = i6;
                        i9 = i3;
                        strM2424 = strM2424;
                    }
                    break;
                case 751356309:
                case 1668246754:
                    i14 = i14;
                    if (!C0629.m2907()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜᩳ") ^ i7;
                        i = ((iM45029 ^ i8) * 15353) ^ (-1521345531);
                        i2 = 1361540867;
                        int i29 = i14;
                        i10 = iM45029 ^ i2;
                        i9 = i;
                        i14 = i29;
                    } else {
                        i16 = i16;
                        iM450210 = C19806.m45029("ܺܳ") ^ i8;
                        i3 = ((iM450210 ^ i7) * 15785) ^ 198676406;
                        i4 = 1198336011;
                        i6 = iM450210 ^ i4;
                        i14 = i14;
                        obj = obj;
                        i16 = i16;
                        i10 = i6;
                        i9 = i3;
                        strM2424 = strM2424;
                    }
                    break;
                case 788406260:
                case 1674525103:
                    RunnableC0195.m1431();
                    C0671.m3008();
                    break;
                default:
                    i14 = i14;
                    if (C3535.f13026 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۙ") ^ i7;
                        i = ((iM45029 ^ i8) * 10681) ^ 1207414058;
                        i2 = -494054269;
                        int i210 = i14;
                        i10 = iM45029 ^ i2;
                        i9 = i;
                        i14 = i210;
                    } else {
                        i16 = i16;
                        iM450210 = C19806.m45029("ܺܳ") ^ i8;
                        i3 = ((iM450210 ^ i7) * 15785) ^ 198676406;
                        i4 = 1198336011;
                        i6 = iM450210 ^ i4;
                        i14 = i14;
                        obj = obj;
                        i16 = i16;
                        i10 = i6;
                        i9 = i3;
                        strM2424 = strM2424;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public void onStart() {
        int i = -1542840963;
        int i2 = AbstractC0464.f2088;
        int i3 = C2249.f8050;
        int iM45029 = C19806.m45029("֫۟") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-11801)) ^ (-1130979386);
        int i5 = 1764416212;
        while (true) {
            i = ((((i ^ i2) * 8827) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2123963028:
                case -857560411:
                    if (C1460.f5948 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * 29531) ^ (-1770831970);
                        i5 = 209753465;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨ֫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27103) ^ 288351424;
                        i5 = 960243568;
                    }
                    break;
                case -1781141174:
                case 1404016341:
                    if (C3577.f13150 >= 0) {
                        iM45029 = (C19806.m45029("ۜۘ") ^ i2) * 31;
                        i4 = ((iM45029 ^ i3) * 23817) ^ 867907734;
                        i5 = 1858817741;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨ֫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27103) ^ 288351424;
                        i5 = 960243568;
                    }
                    break;
                case -1454818001:
                case -24629139:
                    if (this.f41636 != null) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴ᩸") + i3) * (-117);
                        i4 = ((iM45029 ^ i2) * 5275) ^ (-2022455433);
                        i5 = 1708059990;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-4447)) ^ (-706310449);
                        i5 = -614461721;
                    }
                    break;
                case -857530790:
                case -856293208:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ܿ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM45029 ^ i3) * 4373) ^ (-981811420);
                        i5 = 330125621;
                    } else {
                        iM45029 = (C19806.m45029("ۜۘ") ^ i2) * 31;
                        i4 = ((iM45029 ^ i3) * 23817) ^ 867907734;
                        i5 = 1858817741;
                    }
                    break;
                case -585084472:
                case 2061249252:
                    RunnableC1564.m5345();
                    C2704.m8255();
                    iM45029 = ThreadFactoryC3888.m11306("ۨ֫") ^ i3;
                    i4 = ((iM45029 ^ i2) * 27103) ^ 288351424;
                    i5 = 960243568;
                    break;
                case -131264446:
                case 1960183975:
                    View view = this.f41636;
                    if (C1025.f4800 < 0) {
                        if (C2871.f10837 < 0) {
                            if (C3722.f13525 > 0 && C1398.f5802 > 0 && C0050.f912 > 0) {
                                if (C1875.f7103 < 0) {
                                    if (C1148.f5161 > 0) {
                                        if (ThreadFactoryC3888.f14547 <= 0) {
                                            iM45029 = (C19806.m45029("ۜۘ") ^ i2) * 31;
                                            i4 = ((iM45029 ^ i3) * 23817) ^ 867907734;
                                            i5 = 1858817741;
                                        } else if (CallableC1627.f6528) {
                                            if (C19806.f63586) {
                                                iM45029 = (i3 - C19806.m45029("ܿܶ")) * (-67);
                                                i4 = ((iM45029 ^ i2) * 1699) ^ 1864467572;
                                                i5 = 1792866205;
                                            } else {
                                                f41624 = new WeakReference(view);
                                                iM45029 = ThreadFactoryC3888.m11306("ܳ᩵") ^ i2;
                                                i4 = ((iM45029 ^ i3) * (-4447)) ^ (-706310449);
                                                i5 = -614461721;
                                            }
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                        iM45029 = ThreadFactoryC3888.m11306("ۜ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * 29531) ^ (-1770831970);
                        i5 = 209753465;
                        break;
                    }
                    iM45029 = (ThreadFactoryC3888.m11306("᩸ܿ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i4 = ((iM45029 ^ i3) * 4373) ^ (-981811420);
                    i5 = 330125621;
                    break;
                case -111170084:
                case 52614665:
                    C0817.m3399();
                    break;
                default:
                    super.onStart();
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30997(int i, String str, boolean z) {
        int i2 = -340775984;
        int i3 = C3577.f13150;
        int i4 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM45029 = (C19806.m45029("᩷۟") ^ i4) * (-117);
        int i5 = ((iM45029 ^ i3) * (-23633)) ^ 269726699;
        int i6 = 1823487100;
        while (true) {
            i2 = ((((i2 ^ i3) * (-27873)) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2050198898:
                case -762632441:
                    ThreadFactoryC3888.m11300();
                    iM45029 = C19806.m45029("᩹֡") ^ i3;
                    i5 = ((iM45029 ^ i4) * 14265) ^ (-1919717427);
                    i6 = -500827410;
                    break;
                case -1822919693:
                case -1135355738:
                    if (C1668.f6641 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ۧ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-2461)) ^ 1822597065;
                        i6 = 1430396446;
                    } else {
                        iM45029 = C19806.m45029("۠ܿ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-24335)) ^ 168893443;
                        i6 = -1199101890;
                    }
                    break;
                case -1646091511:
                case 1828065232:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (C19806.m45029("᩶֨") ^ i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM45029 ^ i3) * (-30945)) ^ 201174652;
                        i6 = 1759880686;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۗ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-8383)) ^ 1062820766;
                        i6 = 666020337;
                    }
                    break;
                case -1399002582:
                case 1664450993:
                    if (C0629.f2722 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ۧ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-2461)) ^ 1822597065;
                        i6 = 1430396446;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟ۢ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-7453)) ^ (-1814659230);
                        i6 = 1104798976;
                    }
                    break;
                case -910980496:
                case 2028700405:
                    RunnableC1606.m5473();
                    RunnableC1564.m5345();
                    break;
                case -706472773:
                case 1341166800:
                    if (C2704.f10408) {
                        iM45029 = (C19806.m45029("ۘ᩹") ^ i4) * (-37);
                        i5 = ((iM45029 ^ i3) * 23081) ^ 1477495856;
                        i6 = -1712749141;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۗ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-8383)) ^ 1062820766;
                        i6 = 666020337;
                    }
                    break;
                case -605680357:
                case 144700272:
                    if (C1419.f5860 >= 0) {
                        iM45029 = C19806.m45029("᩹֡") ^ i3;
                        i5 = ((iM45029 ^ i4) * 14265) ^ (-1919717427);
                        i6 = -500827410;
                    } else {
                        iM45029 = C19806.m45029("ܽ᩸") ^ i3;
                        i5 = ((iM45029 ^ i4) * 4911) ^ 524299168;
                        i6 = 647913518;
                    }
                    break;
                case -555423020:
                case 14384241:
                    if (C3722.f13525 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ۧ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-2461)) ^ 1822597065;
                        i6 = 1430396446;
                    } else {
                        iM45029 = (C19806.m45029("ᩳۢ") + i3) * (-103);
                        i5 = ((iM45029 ^ i4) * (-10107)) ^ (-1367792162);
                        i6 = 444681592;
                    }
                    break;
                case -273278571:
                case 1172268120:
                    if (C3722.f13525 <= 0) {
                        iM45029 = C19806.m45029("ܿۢ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-19009)) ^ (-1439662732);
                        i6 = -863348578;
                    } else {
                        iM45029 = (C19806.m45029("ᩳۘ") ^ i3) * 77;
                        i5 = ((iM45029 ^ i4) * 14317) ^ (-2045495838);
                        i6 = 1174294949;
                    }
                    break;
                case -248157075:
                case 1375960192:
                    if (C1461.f5957 <= 0) {
                        iM45029 = C19806.m45029("ܳ֫") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-20319)) ^ 903415682;
                        i6 = -585507292;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۨ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 20879) ^ (-60044483);
                        i6 = -998807460;
                    }
                    break;
                case -238994958:
                case 488521054:
                    if (C0050.m946() <= 0) {
                        iM45029 = C19806.m45029("ܿۢ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-19009)) ^ (-1439662732);
                        i6 = -863348578;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۗۢ")) * (-79);
                        i5 = ((iM45029 ^ i4) * 4131) ^ (-1895359224);
                        i6 = 1444550968;
                    }
                    break;
                case 108327886:
                case 470280224:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = C19806.m45029("ܿۢ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-19009)) ^ (-1439662732);
                        i6 = -863348578;
                    } else {
                        iM45029 = C19806.m45029("᩹֡") ^ i3;
                        i5 = ((iM45029 ^ i4) * 14265) ^ (-1919717427);
                        i6 = -500827410;
                    }
                    break;
                case 188458293:
                case 1205106863:
                    if (C0526.m2437() < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ۧ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-2461)) ^ 1822597065;
                        i6 = 1430396446;
                    } else {
                        iM45029 = C19806.m45029("ܿۢ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-19009)) ^ (-1439662732);
                        i6 = -863348578;
                    }
                    break;
                case 337450427:
                case 2126758781:
                    runOnUiThread(new RunnableC6837(this, C2124.m6690(this, i), str, z));
                    break;
                case 1204249276:
                case 1861705500:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = C19806.m45029("ܳ֫") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-20319)) ^ 903415682;
                        i6 = -585507292;
                    } else {
                        iM45029 = C19806.m45029("ܿۢ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-19009)) ^ (-1439662732);
                        i6 = -863348578;
                    }
                    break;
                default:
                    if (C10634.m26820()) {
                        iM45029 = C19806.m45029("᩹֡") ^ i3;
                        i5 = ((iM45029 ^ i4) * 14265) ^ (-1919717427);
                        i6 = -500827410;
                    } else {
                        iM45029 = (C19806.m45029("ܶ֨") ^ i4) * 93;
                        i5 = ((iM45029 ^ i3) * 20179) ^ 761610063;
                        i6 = 1083713705;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31008(InterfaceC18284 interfaceC18284) {
        this.f41643 = interfaceC18284;
    }

    @Override // l.ActivityC19126, l.ActivityC1086, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 414820402;
        int i4 = C2477.f9839;
        int i5 = C0629.f2722;
        int iM11306 = ThreadFactoryC3888.m11306("۠᩻") ^ i5;
        int i6 = ((iM11306 ^ i4) * 22791) ^ (-1077495457);
        int i7 = -2049210994;
        while (true) {
            i3 = ((((i3 ^ i4) * 30709) >> 31) & i6) ^ (iM11306 ^ i7);
            switch (i3) {
                case -2129907469:
                case -59426309:
                    super.onActivityResult(i, i2, intent);
                    break;
                case -2066835671:
                case -759195531:
                    if (RunnableC1564.f6300) {
                        iM11306 = C19806.m45029("᩸۬") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-31801)) ^ 92691687;
                        i7 = 463620121;
                    } else {
                        iM11306 = C19806.m45029("ܺܳ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-24383)) ^ 1241226932;
                        i7 = -447602307;
                    }
                    break;
                case -2011970044:
                case -1473093383:
                    C1066.m4023();
                    C2871.m8646();
                    break;
                case -1788624726:
                case 1258520909:
                    if (C1148.f5161 <= 0) {
                        iM11306 = C19806.m45029("ۨ۬") ^ i5;
                        i6 = ((iM11306 ^ i4) * 23775) ^ (-2068715239);
                        i7 = 610938140;
                    } else {
                        iM11306 = (C19806.m45029("ۢۨ") + i4) * (-29);
                        i6 = ((iM11306 ^ i5) * (-18849)) ^ (-907232369);
                        i7 = -1427172852;
                    }
                    break;
                case -1766540591:
                case 1355816793:
                    if (C3286.f12186) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܺ᩷")) * (-55);
                        i6 = ((iM11306 ^ i5) * 12479) ^ (-1089687049);
                        i7 = 156906695;
                    } else {
                        iM11306 = C19806.m45029("᩶۟") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-22263)) ^ (-102208812);
                        i7 = 1731953564;
                    }
                    break;
                case -1723684890:
                case 1384035905:
                    if (C0671.m3008() >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢ᩸") ^ i5) * 77;
                        i6 = ((iM11306 ^ i4) * (-22205)) ^ (-1213307279);
                        i7 = 1883740307;
                    } else {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۨۡ")) * 21;
                        i6 = ((iM11306 ^ i4) * (-15339)) ^ 2103404401;
                        i7 = -1830097722;
                    }
                    break;
                case -1694575507:
                case -1580334237:
                    RunnableC1564.m5345();
                    C0526.m2437();
                    iM11306 = (ThreadFactoryC3888.m11306("ۢ᩸") ^ i5) * 77;
                    i6 = ((iM11306 ^ i4) * (-22205)) ^ (-1213307279);
                    i7 = 1883740307;
                    break;
                case -1224256615:
                case 315767907:
                    if (C1668.f6641 >= 0) {
                        iM11306 = C19806.m45029("ۨ۬") ^ i5;
                        i6 = ((iM11306 ^ i4) * 23775) ^ (-2068715239);
                        i7 = 610938140;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ۫") + i4) * (-21);
                        i6 = ((iM11306 ^ i5) * (-18365)) ^ 1296436692;
                        i7 = -1718172012;
                    }
                    break;
                case -1217300197:
                case -45508422:
                    if (C2477.m7593() >= 0) {
                        iM11306 = C19806.m45029("᩸۬") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-31801)) ^ 92691687;
                        i7 = 463620121;
                    } else {
                        iM11306 = (C19806.m45029("ۡܿ") ^ i5) * 59;
                        i6 = ((iM11306 ^ i4) * 3445) ^ 1361373385;
                        i7 = 701559783;
                    }
                    break;
                case -1069785910:
                case -319330434:
                    if (!RunnableC1895.f7152) {
                        iM11306 = C19806.m45029("ۨ۬") ^ i5;
                        i6 = ((iM11306 ^ i4) * 23775) ^ (-2068715239);
                        i7 = 610938140;
                    } else {
                        iM11306 = C19806.m45029("ۜܿ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-18329)) ^ (-1110977327);
                        i7 = -355530400;
                    }
                    break;
                case -524922608:
                case 2111735735:
                    if (C7105.f23796 >= 0) {
                        iM11306 = C19806.m45029("᩸۬") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-31801)) ^ 92691687;
                        i7 = 463620121;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ᩺") ^ i5;
                        i6 = ((iM11306 ^ i4) * 29067) ^ 651785385;
                        i7 = -1536658642;
                    }
                    break;
                case -381383465:
                case 923082972:
                    C3577.m10565();
                    if (C1189.m4368() <= 0) {
                        iM11306 = C19806.m45029("ۜܿ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-18329)) ^ (-1110977327);
                        i7 = -355530400;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢ᩸") ^ i5) * 77;
                        i6 = ((iM11306 ^ i4) * (-22205)) ^ (-1213307279);
                        i7 = 1883740307;
                    }
                    break;
                case -293528153:
                case 607734802:
                    if (C1189.f5284 <= 0) {
                        iM11306 = C19806.m45029("᩸۬") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-31801)) ^ 92691687;
                        i7 = 463620121;
                    } else {
                        iM11306 = C19806.m45029("ۡۧ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-2285)) ^ 1204903352;
                        i7 = -1751016501;
                    }
                    break;
                case 121840365:
                case 183702369:
                    if (C2124.m6673() <= 0) {
                        iM11306 = C19806.m45029("ۨ۬") ^ i5;
                        i6 = ((iM11306 ^ i4) * 23775) ^ (-2068715239);
                        i7 = 610938140;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("۫ܽ")) * (-43);
                        i6 = ((iM11306 ^ i5) * 28267) ^ (-1845971175);
                        i7 = -627013034;
                    }
                    break;
                case 252360566:
                case 1804629379:
                    if (!C3286.f12186) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܺ᩷")) * (-55);
                        i6 = ((iM11306 ^ i5) * 12479) ^ (-1089687049);
                        i7 = 156906695;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢ᩸") ^ i5) * 77;
                        i6 = ((iM11306 ^ i4) * (-22205)) ^ (-1213307279);
                        i7 = 1883740307;
                    }
                    break;
                case 386514523:
                case 2082505876:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܺ᩷")) * (-55);
                        i6 = ((iM11306 ^ i5) * 12479) ^ (-1089687049);
                        i7 = 156906695;
                    } else {
                        iM11306 = C19806.m45029("ᩳۡ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 29741) ^ (-866015839);
                        i7 = -34736211;
                    }
                    break;
                case 1397169465:
                case 1517385728:
                    if (i == 11101) {
                        iM11306 = (C19806.m45029("֫ۗ") + i4) * 79;
                        i6 = ((iM11306 ^ i5) * 10767) ^ (-2113652141);
                        i7 = 637291128;
                    } else {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۧܰ")) * (-23);
                        i6 = ((iM11306 ^ i4) * 28037) ^ (-1628484999);
                        i7 = -1115872024;
                    }
                    break;
                default:
                    C18990.m43691(i, i2, intent, this.f41643);
                    this.f41643 = null;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0219 A[PHI: r2 r10 r13
      0x0219: PHI (r2v4 l.ۛۧ᩺) = (r2v2 l.ۛۧ᩺), (r2v3 l.ۛۧ᩺), (r2v2 l.ۛۧ᩺) binds: [B:59:0x0217, B:44:0x0179, B:14:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:59:0x0217, B:44:0x0179, B:14:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:59:0x0217, B:44:0x0179, B:14:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0253 A[PHI: r8 r9 r11
      0x0253: PHI (r8v4 short) = (r8v3 short), (r8v2 short) binds: [B:63:0x0251, B:55:0x01f3] A[DONT_GENERATE, DONT_INLINE]
      0x0253: PHI (r9v4 int) = (r9v3 int), (r9v2 int) binds: [B:63:0x0251, B:55:0x01f3] A[DONT_GENERATE, DONT_INLINE]
      0x0253: PHI (r11v3 short) = (r11v2 short), (r11v4 short) binds: [B:63:0x0251, B:55:0x01f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02c5 A[PHI: r4 r7 r14
      0x02c5: PHI (r4v3 l.ܿۧ᩺) = (r4v2 l.ܿۧ᩺), (r4v2 l.ܿۧ᩺), (r4v2 l.ܿۧ᩺), (r4v4 l.ܿۧ᩺) binds: [B:75:0x02c3, B:67:0x0285, B:6:0x0051, B:15:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x02c5: PHI (r7v4 char) = (r7v2 char), (r7v3 char), (r7v2 char), (r7v2 char) binds: [B:75:0x02c3, B:67:0x0285, B:6:0x0051, B:15:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x02c5: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:75:0x02c3, B:67:0x0285, B:6:0x0051, B:15:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x02f5 A[PHI: r19
      0x02f5: PHI (r19v7 short[]) = (r19v3 short[]), (r19v4 short[]), (r19v3 short[]) binds: [B:79:0x02f3, B:71:0x02a8, B:10:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0077, code lost:
    
        if (l.C1148.m4232() > 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
    
        if (l.C3535.f13026 <= 0) goto L10;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m30992(l.AbstractActivityC12483 r20, int r21) {
        /*
            Method dump skipped, instruction units count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC12483.m30992(l.۫ܶۘ, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03f9 A[PHI: r18 r20 r21
      0x03f9: PHI (r18v36 int) = (r18v6 int), (r18v7 int), (r18v8 int), (r18v9 int), (r18v34 int), (r18v37 int) binds: [B:99:0x03f7, B:95:0x03d8, B:91:0x03b7, B:87:0x0395, B:22:0x0091, B:20:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x03f9: PHI (r20v34 char) = (r20v2 char), (r20v3 char), (r20v4 char), (r20v5 char), (r20v29 char), (r20v35 char) binds: [B:99:0x03f7, B:95:0x03d8, B:91:0x03b7, B:87:0x0395, B:22:0x0091, B:20:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x03f9: PHI (r21v28 char) = (r21v0 char), (r21v1 char), (r21v2 char), (r21v3 char), (r21v27 char), (r21v29 char) binds: [B:99:0x03f7, B:95:0x03d8, B:91:0x03b7, B:87:0x0395, B:22:0x0091, B:20:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0252 A[PHI: r14 r18 r19 r20 r21
      0x0252: PHI (r14v3 char) = (r14v1 char), (r14v1 char), (r14v2 char), (r14v1 char), (r14v1 char) binds: [B:60:0x0250, B:54:0x020d, B:30:0x00e8, B:27:0x00c1, B:25:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x0252: PHI (r18v32 int) = (r18v17 int), (r18v19 int), (r18v30 int), (r18v31 int), (r18v33 int) binds: [B:60:0x0250, B:54:0x020d, B:30:0x00e8, B:27:0x00c1, B:25:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x0252: PHI (r19v4 int) = (r19v2 int), (r19v1 int), (r19v1 int), (r19v1 int), (r19v1 int) binds: [B:60:0x0250, B:54:0x020d, B:30:0x00e8, B:27:0x00c1, B:25:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x0252: PHI (r20v27 char) = (r20v13 char), (r20v14 char), (r20v25 char), (r20v26 char), (r20v28 char) binds: [B:60:0x0250, B:54:0x020d, B:30:0x00e8, B:27:0x00c1, B:25:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x0252: PHI (r21v25 char) = (r21v11 char), (r21v12 char), (r21v23 char), (r21v24 char), (r21v26 char) binds: [B:60:0x0250, B:54:0x020d, B:30:0x00e8, B:27:0x00c1, B:25:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x0329 A[PHI: r18 r20 r21
      0x0329: PHI (r18v15 int) = (r18v11 int), (r18v14 int), (r18v16 int) binds: [B:79:0x0327, B:67:0x0296, B:63:0x0271] A[DONT_GENERATE, DONT_INLINE]
      0x0329: PHI (r20v11 char) = (r20v7 char), (r20v10 char), (r20v12 char) binds: [B:79:0x0327, B:67:0x0296, B:63:0x0271] A[DONT_GENERATE, DONT_INLINE]
      0x0329: PHI (r21v9 char) = (r21v5 char), (r21v8 char), (r21v10 char) binds: [B:79:0x0327, B:67:0x0296, B:63:0x0271] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30988(View view, View view2, int[] iArr, int[] iArr2, C13954 c13954, int i, boolean z) {
        int iM45029;
        int i2;
        int i3;
        int i4;
        int iM450210;
        int i5;
        int i6;
        char c = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        char c2 = 0;
        int i10 = 0;
        int i11 = 0;
        char c3 = 0;
        int i12 = 0;
        int i13 = 0;
        char c4 = 0;
        int i14 = 1611893717;
        int i15 = C2124.f7782;
        int i16 = RunnableC0195.f1321;
        int iM11306 = (i16 - ThreadFactoryC3888.m11306("ۖ۬")) * (-61);
        int i17 = ((iM11306 ^ i15) * (-16763)) ^ (-755515707);
        int i18 = iM11306 ^ (-764643116);
        int i19 = 0;
        while (true) {
            int i20 = i18 ^ (i17 & (((i14 ^ i15) * (-28291)) >> 31));
            switch (i20) {
                case -2135834359:
                case 1147359189:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    i10 = 0;
                    iM45029 = (C19806.m45029("ܺܿ") + i15) * 47;
                    i2 = ((iM45029 ^ i16) * (-1217)) ^ 1132629217;
                    i3 = 1502965917;
                    int i21 = iM45029 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i21;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -2068950356:
                case -1312327881:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = C19806.m45029("ۨۛ") ^ i15;
                        i2 = ((iM45029 ^ i16) * 32609) ^ (-503133136);
                        i3 = -1106516778;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ۚ") ^ i16) * 77;
                        i2 = ((iM45029 ^ i15) * (-11289)) ^ (-781778866);
                        i3 = 342756494;
                    }
                    int i22 = iM45029 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i22;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -1824244274:
                case -1797159574:
                    i8 = c13954.f45915;
                    iM45029 = (C19806.m45029("ۜ᩻") + i16) * 55;
                    i2 = ((iM45029 ^ i15) * 5663) ^ (-1473760290);
                    i3 = 1504243847;
                    int i23 = iM45029 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i23;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -1681638535:
                case -1653957286:
                    C2788.m8472();
                    if (RunnableC0195.f1321 >= 0) {
                        c2 = c2;
                        c3 = c3;
                        i20 = i20;
                        iM45029 = C19806.m45029("ܳۗ") ^ i15;
                        i2 = ((iM45029 ^ i16) * (-781)) ^ (-170131502);
                        i3 = 1917081054;
                        int i24 = iM45029 ^ i3;
                        i14 = i20;
                        c3 = c3;
                        i18 = i24;
                        i17 = i2;
                        c2 = c2;
                    } else {
                        iM450210 = (i16 - C19806.m45029("᩶֫")) * (-43);
                        i4 = i20;
                        i5 = ((iM450210 ^ i15) * (-17245)) ^ 1059792119;
                        i6 = 131142650;
                        int i25 = i4;
                        i18 = iM450210 ^ i6;
                        i17 = i5;
                        i14 = i25;
                    }
                    break;
                case -1668374242:
                case 1936750228:
                    i13 = 0;
                    iM45029 = ThreadFactoryC3888.m11306("ܿۙ") ^ i16;
                    i2 = ((iM45029 ^ i15) * 1013) ^ 2088897854;
                    i3 = 2027615132;
                    int i26 = iM45029 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i26;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -1592855903:
                case -1385190538:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢᩳ") ^ i15) * (-79);
                        i2 = ((iM45029 ^ i16) * (-3939)) ^ 686257743;
                        i3 = 118498027;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ۗ") ^ i16) * (-81);
                        i2 = ((iM45029 ^ i15) * (-11113)) ^ 154555615;
                        i3 = 196573777;
                    }
                    int i27 = iM45029 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i27;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -1475648191:
                case 248840155:
                    i20 = i20;
                    c2 = c2;
                    c3 = c3;
                    view2.setPadding(iArr2[c], iArr2[c2] + i19, iArr2[c3], iArr2[c4]);
                    iM45029 = (i15 - C19806.m45029("ܳᩳ")) * 5;
                    i2 = ((iM45029 ^ i16) * (-8591)) ^ 51383653;
                    i3 = 315316172;
                    int i28 = iM45029 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i28;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -1406312147:
                case -810341359:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    i7 = iArr[c];
                    if (z) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵᩺") ^ i15;
                        i2 = ((iM45029 ^ i16) * 27179) ^ (-1871884581);
                        i3 = -478589500;
                    } else {
                        iM45029 = C19806.m45029("֨᩻") ^ i16;
                        i2 = ((iM45029 ^ i15) * (-5921)) ^ 1294089957;
                        i3 = 1909087180;
                    }
                    int i29 = iM45029 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i29;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -1399963867:
                case -288167069:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    if (iArr == null) {
                        iM45029 = (i15 - C19806.m45029("ܳᩳ")) * 5;
                        i2 = ((iM45029 ^ i16) * (-8591)) ^ 51383653;
                        i3 = 315316172;
                    } else {
                        iM45029 = C19806.m45029("۬ۛ") ^ i16;
                        i2 = ((iM45029 ^ i15) * 9537) ^ 1115492079;
                        i3 = 1886839782;
                    }
                    int i210 = iM45029 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i210;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -1372393539:
                case 482111373:
                    i13 = c13954.f45914;
                    iM45029 = ThreadFactoryC3888.m11306("ܿۙ") ^ i16;
                    i2 = ((iM45029 ^ i15) * 1013) ^ 2088897854;
                    i3 = 2027615132;
                    int i211 = iM45029 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i211;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -1143381161:
                case 98514385:
                    if (C1460.m5050() == 0) {
                        iM450210 = (i16 - C19806.m45029("᩶֫")) * (-43);
                        i4 = i20;
                        i5 = ((iM450210 ^ i15) * (-17245)) ^ 1059792119;
                        i6 = 131142650;
                        int i212 = i4;
                        i18 = iM450210 ^ i6;
                        i17 = i5;
                        i14 = i212;
                    } else {
                        c2 = c2;
                        c3 = c3;
                        i20 = i20;
                        iM45029 = C19806.m45029("ۨۛ") ^ i15;
                        i2 = ((iM45029 ^ i16) * 32609) ^ (-503133136);
                        i3 = -1106516778;
                        int i213 = iM45029 ^ i3;
                        i14 = i20;
                        c3 = c3;
                        i18 = i213;
                        i17 = i2;
                        c2 = c2;
                    }
                    break;
                case -1124637183:
                case -619724107:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    c4 = 3;
                    view.setPadding(i9, i11, i12 + i13, iArr[3] + i);
                    if (view2 != null) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰܽ") ^ i15;
                        i2 = ((iM45029 ^ i16) * (-28547)) ^ (-1027431797);
                        i3 = 1857468353;
                    } else {
                        iM45029 = (i15 - C19806.m45029("ܳᩳ")) * 5;
                        i2 = ((iM45029 ^ i16) * (-8591)) ^ 51383653;
                        i3 = 315316172;
                    }
                    int i214 = iM45029 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i214;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -1047166966:
                case 582896033:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    if (C1398.m4895() <= 0) {
                        iM45029 = C19806.m45029("ܳۗ") ^ i15;
                        i2 = ((iM45029 ^ i16) * (-781)) ^ (-170131502);
                        i3 = 1917081054;
                    } else {
                        iM45029 = (i15 - ThreadFactoryC3888.m11306("ۡ۟")) * (-59);
                        i2 = ((iM45029 ^ i16) * (-8725)) ^ 415824667;
                        i3 = 891156035;
                    }
                    int i215 = iM45029 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i215;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -1000510484:
                case 2085531596:
                    i20 = i20;
                    C0526.m2437();
                    C2249.m6915();
                    c2 = c2;
                    c3 = c3;
                    iM45029 = C19806.m45029("ۨۛ") ^ i15;
                    i2 = ((iM45029 ^ i16) * 32609) ^ (-503133136);
                    i3 = -1106516778;
                    int i216 = iM45029 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i216;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -913261010:
                case 1109283797:
                    AbstractC0464.m2313();
                    C0278.m1789();
                    break;
                case -900828055:
                case 592039216:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    int i30 = c13954.f45912;
                    if (view != null) {
                        int iM11307 = (ThreadFactoryC3888.m11306("᩹ᩳ") + i16) * (-79);
                        i19 = i30;
                        i17 = ((iM11307 ^ i15) * 27345) ^ (-805358736);
                        i14 = i20;
                        c3 = c3;
                        i18 = iM11307 ^ (-1015853960);
                    } else {
                        i19 = i30;
                        iM45029 = (i15 - C19806.m45029("ܳᩳ")) * 5;
                        i2 = ((iM45029 ^ i16) * (-8591)) ^ 51383653;
                        i3 = 315316172;
                        int i217 = iM45029 ^ i3;
                        i14 = i20;
                        c3 = c3;
                        i18 = i217;
                        i17 = i2;
                    }
                    c2 = c2;
                    break;
                case -869772037:
                case 270169937:
                    if (!RunnableC1895.f7152) {
                        c2 = c2;
                        c3 = c3;
                        i20 = i20;
                        iM45029 = C19806.m45029("ۚۚ") ^ i15;
                        i2 = ((iM45029 ^ i16) * 21855) ^ (-107337879);
                        i3 = 1953357413;
                        int i218 = iM45029 ^ i3;
                        i14 = i20;
                        c3 = c3;
                        i18 = i218;
                        i17 = i2;
                        c2 = c2;
                    } else {
                        iM450210 = (i16 - C19806.m45029("᩶֫")) * (-43);
                        i4 = i20;
                        i5 = ((iM450210 ^ i15) * (-17245)) ^ 1059792119;
                        i6 = 131142650;
                        int i219 = i4;
                        i18 = iM450210 ^ i6;
                        i17 = i5;
                        i14 = i219;
                    }
                    break;
                case -843903377:
                case 1018164612:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM45029 = C19806.m45029("ۨۛ") ^ i15;
                        i2 = ((iM45029 ^ i16) * 32609) ^ (-503133136);
                        i3 = -1106516778;
                    } else {
                        iM45029 = C19806.m45029("᩸֡") ^ i15;
                        i2 = ((iM45029 ^ i16) * (-31683)) ^ 1029501526;
                        i3 = -1995340199;
                    }
                    int i2110 = iM45029 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i2110;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -769702836:
                case 221233852:
                    i8 = 0;
                    iM45029 = (C19806.m45029("ۜ᩻") + i16) * 55;
                    i2 = ((iM45029 ^ i15) * 5663) ^ (-1473760290);
                    i3 = 1504243847;
                    int i2111 = iM45029 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i2111;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -746312766:
                case -744232742:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    c = 0;
                    if (view2 == null) {
                        i10 = i19;
                        iM45029 = (C19806.m45029("ܺܿ") + i15) * 47;
                        i2 = ((iM45029 ^ i16) * (-1217)) ^ 1132629217;
                        i3 = 1502965917;
                    } else {
                        iM45029 = C19806.m45029("ᩴ᩺") ^ i15;
                        i2 = ((iM45029 ^ i16) * (-23665)) ^ 1443829470;
                        i3 = -148305532;
                    }
                    int i2112 = iM45029 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i2112;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -717854528:
                case -24561029:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    if (C1977.f7413 <= 0) {
                        iM45029 = C19806.m45029("ۨۛ") ^ i15;
                        i2 = ((iM45029 ^ i16) * 32609) ^ (-503133136);
                        i3 = -1106516778;
                    } else {
                        iM45029 = C19806.m45029("ᩳۢ") ^ i15;
                        i2 = ((iM45029 ^ i16) * 10397) ^ 2034815744;
                        i3 = -214503832;
                    }
                    int i2113 = iM45029 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i2113;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -515464499:
                case 422434759:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    if (iArr2 != null) {
                        iM45029 = C19806.m45029("۟۫") ^ i16;
                        i2 = ((iM45029 ^ i15) * (-9775)) ^ (-100123794);
                        i3 = -1392381340;
                    } else {
                        iM45029 = (i15 - C19806.m45029("ܳᩳ")) * 5;
                        i2 = ((iM45029 ^ i16) * (-8591)) ^ 51383653;
                        i3 = 315316172;
                    }
                    int i2114 = iM45029 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i2114;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -8493497:
                case 1405836083:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    if (C0817.f3443) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ᩵") ^ i16) * (-65);
                        i2 = ((iM45029 ^ i15) * (-6425)) ^ 1566131760;
                        i3 = 1410470095;
                    } else {
                        iM45029 = C19806.m45029("ۚۚ") ^ i15;
                        i2 = ((iM45029 ^ i16) * 21855) ^ (-107337879);
                        i3 = 1953357413;
                    }
                    int i2115 = iM45029 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i2115;
                    i17 = i2;
                    c2 = c2;
                    break;
                case 66487086:
                case 657994159:
                    if (C1025.f4800 >= 0) {
                        c2 = c2;
                        c3 = c3;
                        i20 = i20;
                        iM45029 = ThreadFactoryC3888.m11306("۠ܰ") ^ i16;
                        i2 = ((iM45029 ^ i15) * (-4131)) ^ 372047051;
                        i3 = 1052743513;
                        int i2116 = iM45029 ^ i3;
                        i14 = i20;
                        c3 = c3;
                        i18 = i2116;
                        i17 = i2;
                        c2 = c2;
                    } else {
                        iM450210 = (i16 - C19806.m45029("᩶֫")) * (-43);
                        i4 = i20;
                        i5 = ((iM450210 ^ i15) * (-17245)) ^ 1059792119;
                        i6 = 131142650;
                        int i2117 = i4;
                        i18 = iM450210 ^ i6;
                        i17 = i5;
                        i14 = i2117;
                    }
                    break;
                case 111430897:
                case 715438726:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    if (RunnableC1895.m6170() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢᩳ") ^ i15) * (-79);
                        i2 = ((iM45029 ^ i16) * (-3939)) ^ 686257743;
                        i3 = 118498027;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫ۙ") ^ i15;
                        i2 = ((iM45029 ^ i16) * (-12657)) ^ 1278466717;
                        i3 = -621481933;
                    }
                    int i2118 = iM45029 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i2118;
                    i17 = i2;
                    c2 = c2;
                    break;
                case 318859020:
                case 1787599865:
                    i4 = i20;
                    i9 = i7 + i8;
                    c2 = 1;
                    i11 = iArr[1] + i10;
                    c3 = 2;
                    i12 = iArr[2];
                    if (z) {
                        iM450210 = C19806.m45029("ܺۚ") ^ i15;
                        i5 = ((iM450210 ^ i16) * (-19107)) ^ (-17911982);
                        i6 = 82515583;
                    } else {
                        iM450210 = (C19806.m45029("᩶᩷") ^ i16) * 109;
                        i5 = ((iM450210 ^ i15) * (-26369)) ^ 1754515695;
                        i6 = -555574873;
                    }
                    int i2119 = i4;
                    i18 = iM450210 ^ i6;
                    i17 = i5;
                    i14 = i2119;
                    break;
                case 606890979:
                case 742442250:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    if (C1419.f5860 >= 0) {
                        iM45029 = C19806.m45029("ۨۛ") ^ i15;
                        i2 = ((iM45029 ^ i16) * 32609) ^ (-503133136);
                        i3 = -1106516778;
                    } else {
                        iM45029 = (C19806.m45029("ܿ᩷") + i16) * 33;
                        i2 = ((iM45029 ^ i15) * 18185) ^ 806913323;
                        i3 = -754716508;
                    }
                    int i21110 = iM45029 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i21110;
                    i17 = i2;
                    c2 = c2;
                    break;
                case 854798701:
                case 1057777698:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    if (RunnableC1564.m5345()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢᩳ") ^ i15) * (-79);
                        i2 = ((iM45029 ^ i16) * (-3939)) ^ 686257743;
                        i3 = 118498027;
                    } else {
                        iM45029 = (i15 - C19806.m45029("ۗۜ")) * (-113);
                        i2 = ((iM45029 ^ i16) * 29633) ^ (-1305127550);
                        i3 = 369376667;
                    }
                    int i21111 = iM45029 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i21111;
                    i17 = i2;
                    c2 = c2;
                    break;
                case 1514610722:
                case 2024901855:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (C19806.m45029("᩵ۙ") ^ i16) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i2 = ((iM45029 ^ i15) * (-9503)) ^ 758982661;
                        i3 = 211067976;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ܰ") ^ i16;
                        i2 = ((iM45029 ^ i15) * (-4131)) ^ 372047051;
                        i3 = 1052743513;
                    }
                    int i21112 = iM45029 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i21112;
                    i17 = i2;
                    c2 = c2;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01d2 A[PHI: r10 r11
      0x01d2: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v4 int) binds: [B:52:0x01b9, B:16:0x0071, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r11v4 short) = (r11v3 short), (r11v2 short), (r11v2 short) binds: [B:52:0x01b9, B:16:0x0071, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0227 A[PHI: r7 r14
      0x0227: PHI (r7v4 char) = (r7v3 char), (r7v2 char), (r7v2 char), (r7v2 char), (r7v2 char) binds: [B:62:0x0225, B:33:0x00db, B:18:0x0075, B:16:0x0071, B:13:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:62:0x0225, B:33:0x00db, B:18:0x0075, B:16:0x0071, B:13:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0257 A[PHI: r3 r4 r5
      0x0257: PHI (r3v5 java.lang.String) = 
      (r3v2 java.lang.String)
      (r3v3 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
     binds: [B:66:0x0255, B:29:0x00bc, B:25:0x0099, B:13:0x0066, B:96:0x0257] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r4v5 int) = (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:66:0x0255, B:29:0x00bc, B:25:0x0099, B:13:0x0066, B:96:0x0257] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r5v5 int) = (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:66:0x0255, B:29:0x00bc, B:25:0x0099, B:13:0x0066, B:96:0x0257] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x028a A[PHI: r8 r9 r19
      0x028a: PHI (r8v3 short) = (r8v2 short), (r8v4 short) binds: [B:70:0x0288, B:58:0x0205] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:70:0x0288, B:58:0x0205] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]) binds: [B:70:0x0288, B:58:0x0205] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m31017() {
        int iM11306;
        int i;
        int i2;
        int i3 = C1148.f5161;
        int i4 = C1977.f7413;
        int iM11307 = ThreadFactoryC3888.m11306("ۡܿ") ^ i4;
        int i5 = ((iM11307 ^ i3) * 31067) ^ (-947860923);
        String strM45020 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11307 ^ (-1983183746);
        int iM45029 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 62301963;
        C6938 c6938 = null;
        AbstractC10697 abstractC10697M25489 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * (-309)) >> 31));
            switch (i12) {
                case -2147120622:
                case 570734947:
                    C1025.m3861();
                    if (C1148.m4232() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ᩶") ^ i4;
                        i = ((iM11306 ^ i3) * (-13883)) ^ 649488754;
                        i2 = 2003051561;
                    } else {
                        iM11306 = C19806.m45029("ۢۡ") ^ i3;
                        i = ((iM11306 ^ i4) * 32063) ^ 870212742;
                        i2 = 424646471;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -2016658262:
                case -835316379:
                    c = 421;
                    if (RunnableC1895.m6170() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ᩶") ^ i4;
                        i = ((iM11306 ^ i3) * (-13883)) ^ 649488754;
                        i2 = 2003051561;
                    } else {
                        iM11306 = (C19806.m45029("ܽۚ") + i3) * (-7);
                        i = ((iM11306 ^ i4) * 28313) ^ 360221550;
                        i2 = -2095886608;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1960641916:
                case -536788181:
                    i11 = 422;
                    if (C0526.m2437() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ᩶") ^ i4;
                        i = ((iM11306 ^ i3) * (-13883)) ^ 649488754;
                        i2 = 2003051561;
                    } else {
                        iM11306 = C19806.m45029("᩻ۙ") ^ i3;
                        i = ((iM11306 ^ i4) * (-3319)) ^ (-1841988129);
                        i2 = -1219990960;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1674997508:
                case 1213655897:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩷ۤ")) * 17;
                        i = ((iM11306 ^ i3) * (-17995)) ^ (-1003022799);
                        i2 = 1345076420;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷᩷") ^ i3) * 25;
                        i = ((iM11306 ^ i4) * (-30091)) ^ 2021004904;
                        i2 = -1241002294;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1620236066:
                case -53533111:
                    i10 = 25496;
                    iM11306 = ThreadFactoryC3888.m11306("֫ܳ") ^ i3;
                    i = ((iM11306 ^ i4) * 17403) ^ (-910853582);
                    i2 = -1817359615;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1597973875:
                case -1457212881:
                    if (i9 - (s * s2) >= 0) {
                        iM11306 = C19806.m45029("ۘۧ") ^ i3;
                        i = ((iM11306 ^ i4) * (-15841)) ^ 2050705118;
                        i2 = 683427752;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸᩵") ^ i4;
                        i = ((iM11306 ^ i3) * 17055) ^ 1361731253;
                        i2 = -848561241;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1220066955:
                case -333537266:
                    abstractC10697M25489 = m25489();
                    if (abstractC10697M25489 != null) {
                        iM11306 = (i3 - C19806.m45029("᩺ۤ")) * 23;
                        i = ((iM11306 ^ i4) * (-25493)) ^ 433018838;
                        i2 = -1844514361;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("۫᩵")) * (-125);
                        i = ((iM11306 ^ i3) * 32017) ^ (-623103405);
                        i2 = -1567826994;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1047456227:
                case -953410634:
                    C1025.m3861();
                    if (C1066.f4915 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ᩶") ^ i4;
                        i = ((iM11306 ^ i3) * (-13883)) ^ 649488754;
                        i2 = 2003051561;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩷ۤ")) * 17;
                        i = ((iM11306 ^ i3) * (-17995)) ^ (-1003022799);
                        i2 = 1345076420;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -923268087:
                case 123129875:
                    strM45020 = C19806.m45020(sArr2, i11, 3, i10);
                    if (C10634.f36300 >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩷ۤ")) * 17;
                        i = ((iM11306 ^ i3) * (-17995)) ^ (-1003022799);
                        i2 = 1345076420;
                    } else {
                        iM11306 = C19806.m45029("ۢ֡") ^ i3;
                        i = ((iM11306 ^ i4) * (-15497)) ^ (-2072595080);
                        i2 = 1919265933;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -607238780:
                case 1330330766:
                    sArr = f41626;
                    if (C1461.f5957 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ᩴᩳ")) * (-19);
                        i = ((iM11306 ^ i4) * 20249) ^ (-366732136);
                        i2 = -1377521080;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ᩴۖ")) * (-37);
                        i = ((iM11306 ^ i3) * (-25073)) ^ (-1671992774);
                        i2 = -1181864342;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -457138689:
                case -354557252:
                    abstractC10697M25489.mo13895(true);
                    iM11306 = (i4 - ThreadFactoryC3888.m11306("۫᩵")) * (-125);
                    i = ((iM11306 ^ i3) * 32017) ^ (-623103405);
                    i2 = -1567826994;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -171694919:
                case -112214785:
                    c6938.setNavigationIcon(iM45029 ^ i7);
                    break;
                case 16863988:
                case 1674099738:
                    s = sArr[c];
                    i8 = s * s;
                    if (C1066.f4915 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ᩴᩳ")) * (-19);
                        i = ((iM11306 ^ i4) * 20249) ^ (-366732136);
                        i2 = -1377521080;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿۜ") ^ i4;
                        i = ((iM11306 ^ i3) * 1649) ^ 307842094;
                        i2 = -557794428;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 91784176:
                case 627131309:
                    RunnableC1564.m5345();
                    C1461.m5080();
                    break;
                case 232139669:
                case 1391438953:
                    iM45029 = C19806.m45029(strM45020);
                    i7 = 2120506826;
                    if (C10634.f36300 >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩷ۤ")) * 17;
                        i = ((iM11306 ^ i3) * (-17995)) ^ (-1003022799);
                        i2 = 1345076420;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩶۠")) * 127;
                        i = ((iM11306 ^ i3) * (-20991)) ^ 1520524551;
                        i2 = 1449227865;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 671770880:
                case 1929160820:
                    if (C2477.m7593() < 0) {
                        int iM450210 = C19806.m45029("֫۠") ^ i4;
                        i5 = ((iM450210 ^ i3) * (-8147)) ^ 1015620757;
                        i6 = iM450210 ^ (-1792462681);
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩷ۤ")) * 17;
                        i = ((iM11306 ^ i3) * (-17995)) ^ (-1003022799);
                        i2 = 1345076420;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    }
                    break;
                case 1004498410:
                case 1362846464:
                    c6938 = this.f41645;
                    sArr2 = f41626;
                    if (C1937.f7317 < 0) {
                        iM11306 = (i4 - C19806.m45029("ۗ᩻")) * (-101);
                        i = ((iM11306 ^ i3) * 9409) ^ (-55088248);
                        i2 = 788795268;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    } else {
                        int iM450211 = C19806.m45029("֫۠") ^ i4;
                        i5 = ((iM450211 ^ i3) * (-8147)) ^ 1015620757;
                        i6 = iM450211 ^ (-1792462681);
                    }
                    break;
                case 1130212746:
                case 1460650304:
                    i10 = 57622;
                    iM11306 = ThreadFactoryC3888.m11306("֫ܳ") ^ i3;
                    i = ((iM11306 ^ i4) * 17403) ^ (-910853582);
                    i2 = -1817359615;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1727796895:
                case 2123076797:
                    C0962.m3746();
                    C2124.m6673();
                    iM11306 = ThreadFactoryC3888.m11306("ܶ᩶") ^ i4;
                    i = ((iM11306 ^ i3) * (-13883)) ^ 649488754;
                    i2 = 2003051561;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1902285706:
                case 1930090856:
                    s2 = 14016;
                    if (C0817.f3443) {
                        iM11306 = C19806.m45029("ۚ۫") ^ i4;
                        i = ((iM11306 ^ i3) * 22037) ^ (-453546056);
                        i2 = -221930408;
                    } else {
                        iM11306 = C19806.m45029("ۢۡ") ^ i3;
                        i = ((iM11306 ^ i4) * 32063) ^ 870212742;
                        i2 = 424646471;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    i9 = i8 + 49112064;
                    if (RunnableC1895.f7152) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۚ۬")) * (-53);
                        i = ((iM11306 ^ i4) * 30393) ^ 1512274729;
                        i2 = -486527409;
                    } else {
                        iM11306 = C19806.m45029("ۢۡ") ^ i3;
                        i = ((iM11306 ^ i4) * 32063) ^ 870212742;
                        i2 = 424646471;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:87:0x03cb A[PHI: r9 r10 r11 r18 r19 r20 r21
      0x03cb: PHI (r9v3 short[]) = (r9v2 short[]), (r9v2 short[]), (r9v2 short[]), (r9v4 short[]) binds: [B:16:0x006b, B:86:0x03c9, B:73:0x0343, B:48:0x0209] A[DONT_GENERATE, DONT_INLINE]
      0x03cb: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v4 int) binds: [B:16:0x006b, B:86:0x03c9, B:73:0x0343, B:48:0x0209] A[DONT_GENERATE, DONT_INLINE]
      0x03cb: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:16:0x006b, B:86:0x03c9, B:73:0x0343, B:48:0x0209] A[DONT_GENERATE, DONT_INLINE]
      0x03cb: PHI (r18v16 java.lang.String) = (r18v2 java.lang.String), (r18v4 java.lang.String), (r18v7 java.lang.String), (r18v17 java.lang.String) binds: [B:16:0x006b, B:86:0x03c9, B:73:0x0343, B:48:0x0209] A[DONT_GENERATE, DONT_INLINE]
      0x03cb: PHI (r19v5 short[]) = (r19v3 short[]), (r19v3 short[]), (r19v4 short[]), (r19v3 short[]) binds: [B:16:0x006b, B:86:0x03c9, B:73:0x0343, B:48:0x0209] A[DONT_GENERATE, DONT_INLINE]
      0x03cb: PHI (r20v14 java.lang.String) = (r20v0 java.lang.String), (r20v2 java.lang.String), (r20v5 java.lang.String), (r20v15 java.lang.String) binds: [B:16:0x006b, B:86:0x03c9, B:73:0x0343, B:48:0x0209] A[DONT_GENERATE, DONT_INLINE]
      0x03cb: PHI (r21v14 int) = (r21v0 int), (r21v2 int), (r21v5 int), (r21v15 int) binds: [B:16:0x006b, B:86:0x03c9, B:73:0x0343, B:48:0x0209] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31000(String str, boolean z) {
        int iM45029;
        int i;
        int i2;
        String strM6290;
        int i3;
        int iM450210;
        int i4;
        int i5;
        String strM1588;
        int iM11306;
        String str2;
        int i6;
        int i7 = C1419.f5860;
        int i8 = C3535.f13026;
        int iM11307 = ThreadFactoryC3888.m11306("ۘۢ") ^ i8;
        int i9 = ((iM11307 ^ i7) * 28975) ^ 549384505;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i10 = iM11307 ^ 1219822350;
        short s = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 2144828801;
        String str3 = null;
        String str4 = null;
        int iM6360 = 0;
        while (true) {
            i17 = i10 ^ (i9 & (((i17 ^ i7) * (-12229)) >> 31));
            switch (i17) {
                case -2052724437:
                case -1181038095:
                    str4 = str4;
                    str3 = str3;
                    iM6360 = C1977.m6360(str) - 2;
                    if (C0050.f912 <= 0) {
                        iM450210 = C19806.m45029("᩺᩻") ^ i7;
                        i4 = ((iM450210 ^ i8) * (-19979)) ^ 1196968139;
                        i5 = -853419954;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("۠ܶ") + i7) * 91;
                        i4 = ((iM450210 ^ i8) * (-2647)) ^ 1663081704;
                        i5 = -239475259;
                    }
                    str3 = str3;
                    i10 = iM450210 ^ i5;
                    i9 = i4;
                    str4 = str4;
                    break;
                case -1962293321:
                case 885924011:
                    str3 = str3;
                    m30997(C19806.m45029(str3) ^ 2122253779, str4, z);
                    iM6360 = iM6360;
                    str4 = str4;
                    iM45029 = C19806.m45029("ۚ֡") ^ i8;
                    i = ((iM45029 ^ i7) * 28395) ^ (-870420077);
                    i2 = -167042143;
                    i3 = iM45029 ^ i2;
                    str3 = str3;
                    str4 = str4;
                    i10 = i3;
                    i9 = i;
                    iM6360 = iM6360;
                    break;
                case -1814188167:
                case 1663620909:
                    iM6360 = iM6360;
                    str4 = str4;
                    str3 = str3;
                    sArr = f41626;
                    if (C0817.f3443) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ᩳ") ^ i8;
                        i = ((iM45029 ^ i7) * 28265) ^ (-1150161166);
                        i2 = -1510350946;
                    } else {
                        iM45029 = (C19806.m45029("᩺᩷") ^ i8) * (-125);
                        i = ((iM45029 ^ i7) * (-26437)) ^ 1158575513;
                        i2 = -1153253171;
                    }
                    i3 = iM45029 ^ i2;
                    str3 = str3;
                    str4 = str4;
                    i10 = i3;
                    i9 = i;
                    iM6360 = iM6360;
                    break;
                case -1806796149:
                case 106008470:
                    iM6360 = iM6360;
                    str4 = str4;
                    str3 = str3;
                    if (C2124.m6673() > 0) {
                        iM45029 = C19806.m45029("۫ۢ") ^ i7;
                        i = ((iM45029 ^ i8) * 14575) ^ (-1248407814);
                        i2 = -1232600320;
                        i3 = iM45029 ^ i2;
                        str3 = str3;
                        str4 = str4;
                        i10 = i3;
                        i9 = i;
                        iM6360 = iM6360;
                    } else {
                        iM6360 = iM6360;
                        iM450210 = C19806.m45029("᩺᩻") ^ i7;
                        i4 = ((iM450210 ^ i8) * (-19979)) ^ 1196968139;
                        i5 = -853419954;
                        str3 = str3;
                        i10 = iM450210 ^ i5;
                        i9 = i4;
                        str4 = str4;
                    }
                    break;
                case -1766717269:
                case 1194709574:
                    RunnableC1895.m6170();
                    int iM450211 = C19806.m45029("۬ܽ") ^ i7;
                    i10 = iM450211 ^ (-217980723);
                    i9 = ((iM450211 ^ i8) * (-15233)) ^ 457726810;
                    break;
                case -1690129292:
                case -1367671180:
                    str3 = str3;
                    if (C2871.m8641(str4) <= 0) {
                        str4 = str4;
                        iM6360 = iM6360;
                        iM45029 = C19806.m45029("ۚ֡") ^ i8;
                        i = ((iM45029 ^ i7) * 28395) ^ (-870420077);
                        i2 = -167042143;
                        i3 = iM45029 ^ i2;
                        str3 = str3;
                        str4 = str4;
                        i10 = i3;
                        i9 = i;
                        iM6360 = iM6360;
                    } else {
                        iM450210 = (i7 - C19806.m45029("ᩴۗ")) * (-99);
                        str4 = str4;
                        i4 = ((iM450210 ^ i8) * 12569) ^ 836474271;
                        i5 = 874118201;
                        str3 = str3;
                        i10 = iM450210 ^ i5;
                        i9 = i4;
                        str4 = str4;
                    }
                    break;
                case -1651904993:
                case 659437969:
                    iM6360 = iM6360;
                    str4 = str4;
                    str3 = str3;
                    i11 = (s * s) + 127486681;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺ۖ") + i8) * 49;
                        i = ((iM45029 ^ i7) * 29685) ^ (-1298225539);
                        i2 = -1927590549;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ᩶") + i7) * 127;
                        i = ((iM45029 ^ i8) * 10291) ^ 1533449824;
                        i2 = -1881366556;
                    }
                    i3 = iM45029 ^ i2;
                    str3 = str3;
                    str4 = str4;
                    i10 = i3;
                    i9 = i;
                    iM6360 = iM6360;
                    break;
                case -1444166215:
                case -1249743140:
                    break;
                case -1319933256:
                case -678254688:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        strM1588 = str3;
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("᩶ۧ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        str2 = strM1588;
                        i9 = ((iM11306 ^ i8) * 20319) ^ 54679673;
                        i6 = -2135304489;
                        i10 = iM11306 ^ i6;
                        str3 = str2;
                    } else {
                        int iM450212 = C19806.m45029("۬ܽ") ^ i7;
                        i10 = iM450212 ^ (-217980723);
                        i9 = ((iM450212 ^ i8) * (-15233)) ^ 457726810;
                    }
                    break;
                case -1183945255:
                case 1346758562:
                    str3 = str3;
                    sArr3 = f41626;
                    i16 = 3;
                    if (C7105.f23796 >= 0) {
                        iM6360 = iM6360;
                        str4 = str4;
                        i15 = 276;
                        iM45029 = (ThreadFactoryC3888.m11306("᩺ۖ") + i8) * 49;
                        i = ((iM45029 ^ i7) * 29685) ^ (-1298225539);
                        i2 = -1927590549;
                        i3 = iM45029 ^ i2;
                        str3 = str3;
                        str4 = str4;
                        i10 = i3;
                        i9 = i;
                        iM6360 = iM6360;
                    } else {
                        int iM450213 = C19806.m45029("ۡۜ") ^ i8;
                        str3 = str3;
                        i10 = iM450213 ^ 1281401163;
                        i9 = ((iM450213 ^ i7) * (-28223)) ^ 97694226;
                        i15 = 276;
                    }
                    break;
                case -1147200114:
                case 2098135821:
                    iM6360 = iM6360;
                    str4 = str4;
                    str3 = str3;
                    sArr2 = f41626;
                    i13 = 274;
                    i14 = 2;
                    if (RunnableC1606.m5473() != 0) {
                        iM45029 = (C19806.m45029("᩺᩷") ^ i8) * (-125);
                        i = ((iM45029 ^ i7) * (-26437)) ^ 1158575513;
                        i2 = -1153253171;
                    } else {
                        iM45029 = C19806.m45029("᩸ᩴ") ^ i8;
                        i = ((iM45029 ^ i7) * 32635) ^ (-18474426);
                        i2 = 669142906;
                    }
                    i3 = iM45029 ^ i2;
                    str3 = str3;
                    str4 = str4;
                    i10 = i3;
                    i9 = i;
                    iM6360 = iM6360;
                    break;
                case -912632762:
                case -99020154:
                    iM6360 = iM6360;
                    str4 = str4;
                    str3 = str3;
                    s = sArr[273];
                    if (!C0526.f2219) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ۠") ^ i8;
                        i = ((iM45029 ^ i7) * 26283) ^ (-2104842856);
                        i2 = -1033303769;
                        i3 = iM45029 ^ i2;
                        str3 = str3;
                        str4 = str4;
                        i10 = i3;
                        i9 = i;
                        iM6360 = iM6360;
                    } else {
                        iM6360 = iM6360;
                        iM450210 = C19806.m45029("᩺᩻") ^ i7;
                        i4 = ((iM450210 ^ i8) * (-19979)) ^ 1196968139;
                        i5 = -853419954;
                        str3 = str3;
                        i10 = iM450210 ^ i5;
                        i9 = i4;
                        str4 = str4;
                    }
                    break;
                case -745619736:
                case 1896043018:
                    strM6290 = C1937.m6290(str);
                    str4 = strM6290;
                    int iM11308 = ThreadFactoryC3888.m11306("ܺۙ") ^ i8;
                    iM6360 = iM6360;
                    i = ((iM11308 ^ i7) * 11855) ^ 1697943654;
                    i3 = iM11308 ^ (-241556300);
                    str3 = str3;
                    i10 = i3;
                    i9 = i;
                    iM6360 = iM6360;
                    break;
                case -731194554:
                case -414840962:
                    iM6360 = iM6360;
                    str4 = str4;
                    str3 = str3;
                    if (str != null) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗ֨") + i7) * (-51);
                        i = ((iM45029 ^ i8) * (-21253)) ^ (-758563501);
                        i2 = -882007071;
                    } else {
                        iM45029 = C19806.m45029("ۚ֡") ^ i8;
                        i = ((iM45029 ^ i7) * 28395) ^ (-870420077);
                        i2 = -167042143;
                    }
                    i3 = iM45029 ^ i2;
                    str3 = str3;
                    str4 = str4;
                    i10 = i3;
                    i9 = i;
                    iM6360 = iM6360;
                    break;
                case -711626925:
                case 1966871687:
                    iM6360 = iM6360;
                    str4 = str4;
                    str3 = str3;
                    if (i11 - (s * 22582) >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۚ") ^ i7;
                        i = ((iM45029 ^ i8) * (-17479)) ^ 1259741226;
                        i2 = -1899340085;
                    } else {
                        iM45029 = C19806.m45029("ۚۙ") ^ i8;
                        i = ((iM45029 ^ i7) * (-4521)) ^ 2140080381;
                        i2 = 1712593941;
                    }
                    i3 = iM45029 ^ i2;
                    str3 = str3;
                    str4 = str4;
                    i10 = i3;
                    i9 = i;
                    iM6360 = iM6360;
                    break;
                case -44013931:
                case 364765249:
                    iM6360 = iM6360;
                    str4 = str4;
                    str3 = str3;
                    if (C0962.m3746() < 0) {
                        iM45029 = (i7 - C19806.m45029("ܿ᩵")) * 41;
                        i = ((iM45029 ^ i8) * (-6039)) ^ 2132979726;
                        i2 = -1573440369;
                        i3 = iM45029 ^ i2;
                        str3 = str3;
                        str4 = str4;
                        i10 = i3;
                        i9 = i;
                        iM6360 = iM6360;
                    } else {
                        iM6360 = iM6360;
                        iM450210 = C19806.m45029("᩺᩻") ^ i7;
                        i4 = ((iM450210 ^ i8) * (-19979)) ^ 1196968139;
                        i5 = -853419954;
                        str3 = str3;
                        i10 = iM450210 ^ i5;
                        i9 = i4;
                        str4 = str4;
                    }
                    break;
                case 25711925:
                case 1928269082:
                    strM6290 = C1937.m6290(C3743.m10952(str, 0, iM6360));
                    str4 = strM6290;
                    int iM11309 = ThreadFactoryC3888.m11306("ܺۙ") ^ i8;
                    iM6360 = iM6360;
                    i = ((iM11309 ^ i7) * 11855) ^ 1697943654;
                    i3 = iM11309 ^ (-241556300);
                    str3 = str3;
                    i10 = i3;
                    i9 = i;
                    iM6360 = iM6360;
                    break;
                case 65050275:
                case 327172431:
                    strM1588 = C0216.m1588(sArr3, i15, i16, i12);
                    if (C0216.f1393 != 0) {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("᩶ۧ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        str2 = strM1588;
                        i9 = ((iM11306 ^ i8) * 20319) ^ 54679673;
                        i6 = -2135304489;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۧ") + i8) * (-119);
                        str2 = strM1588;
                        i9 = ((iM11306 ^ i7) * 5411) ^ 860409041;
                        i6 = -447222654;
                    }
                    i10 = iM11306 ^ i6;
                    str3 = str2;
                    break;
                case 391504923:
                case 1019334723:
                    iM6360 = iM6360;
                    str4 = str4;
                    str3 = str3;
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (C19806.m45029("᩺᩷") ^ i8) * (-125);
                        i = ((iM45029 ^ i7) * (-26437)) ^ 1158575513;
                        i2 = -1153253171;
                    } else {
                        iM45029 = C19806.m45029("᩺ۗ") ^ i8;
                        i = ((iM45029 ^ i7) * 665) ^ (-1058249492);
                        i2 = 1247733699;
                    }
                    i3 = iM45029 ^ i2;
                    str3 = str3;
                    str4 = str4;
                    i10 = i3;
                    i9 = i;
                    iM6360 = iM6360;
                    break;
                case 648098918:
                case 1648373360:
                    C2704.m8255();
                    break;
                case 758472542:
                case 972356405:
                    i12 = 53588;
                    iM45029 = C19806.m45029("ܳ᩺") ^ i7;
                    i = ((iM45029 ^ i8) * (-5505)) ^ 933245958;
                    i2 = 853997475;
                    i3 = iM45029 ^ i2;
                    str3 = str3;
                    str4 = str4;
                    i10 = i3;
                    i9 = i;
                    iM6360 = iM6360;
                    break;
                case 1533718997:
                case 2139465542:
                    i12 = 16982;
                    iM45029 = C19806.m45029("ܳ᩺") ^ i7;
                    i = ((iM45029 ^ i8) * (-5505)) ^ 933245958;
                    i2 = 853997475;
                    i3 = iM45029 ^ i2;
                    str3 = str3;
                    str4 = str4;
                    i10 = i3;
                    i9 = i;
                    iM6360 = iM6360;
                    break;
                case 1851420252:
                case 2013347225:
                    iM6360 = iM6360;
                    str4 = str4;
                    str3 = str3;
                    if (C3722.m10902(str, C1025.m3859(sArr2, i13, i14, i12))) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۤ") ^ i8;
                        i = ((iM45029 ^ i7) * (-30843)) ^ 517501830;
                        i2 = -428224985;
                    } else {
                        iM45029 = C19806.m45029("᩹֫") ^ i7;
                        i = ((iM45029 ^ i8) * (-18053)) ^ 2005787279;
                        i2 = -1532993246;
                    }
                    i3 = iM45029 ^ i2;
                    str3 = str3;
                    str4 = str4;
                    i10 = i3;
                    i9 = i;
                    iM6360 = iM6360;
                    break;
                case 2007258710:
                case 2008796813:
                    if (C0216.f1393 != 0) {
                        iM6360 = iM6360;
                        str4 = str4;
                        str3 = str3;
                        iM45029 = (C19806.m45029("᩺᩷") ^ i8) * (-125);
                        i = ((iM45029 ^ i7) * (-26437)) ^ 1158575513;
                        i2 = -1153253171;
                        i3 = iM45029 ^ i2;
                        str3 = str3;
                        str4 = str4;
                        i10 = i3;
                        i9 = i;
                        iM6360 = iM6360;
                    } else {
                        int iM450214 = C19806.m45029("۬ܽ") ^ i7;
                        i10 = iM450214 ^ (-217980723);
                        i9 = ((iM450214 ^ i8) * (-15233)) ^ 457726810;
                    }
                    break;
                default:
                    if (C1460.f5948 >= 0) {
                        iM6360 = iM6360;
                        str4 = str4;
                        str3 = str3;
                        iM45029 = (ThreadFactoryC3888.m11306("᩺ۖ") + i8) * 49;
                        i = ((iM45029 ^ i7) * 29685) ^ (-1298225539);
                        i2 = -1927590549;
                        i3 = iM45029 ^ i2;
                        str3 = str3;
                        str4 = str4;
                        i10 = i3;
                        i9 = i;
                        iM6360 = iM6360;
                    } else {
                        int iM450215 = C19806.m45029("۬ܽ") ^ i7;
                        i10 = iM450215 ^ (-217980723);
                        i9 = ((iM450215 ^ i8) * (-15233)) ^ 457726810;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6938 m31025() {
        return this.f41645;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m31022() {
        Window windowM10777 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 1547614504;
        int i5 = C3535.f13026;
        int i6 = C0629.f2722;
        int iM45029 = (i6 - C19806.m45029("ܳᩳ")) * 15;
        int i7 = ((iM45029 ^ i5) * (-22175)) ^ (-1308877921);
        int i8 = -186012306;
        while (true) {
            i4 = ((((i4 ^ i5) * (-9051)) >> 31) & i7) ^ (iM45029 ^ i8);
            switch (i4) {
                case -2112131854:
                case -1522259465:
                    C0671.m3008();
                    break;
                case -2101852252:
                case -1606083034:
                    windowM10777.setNavigationBarDividerColor(z ? 1 : 0);
                    iM45029 = C19806.m45029("ۗ֫") ^ i6;
                    i7 = ((iM45029 ^ i5) * 24959) ^ (-727992638);
                    i8 = -489555204;
                    break;
                case -1990295921:
                case 384230384:
                    windowM10777.setNavigationBarColor(z ? 1 : 0);
                    if (C0817.f3443) {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("֨᩶")) * (-9);
                        i7 = ((iM45029 ^ i5) * 31373) ^ 830015821;
                        i8 = -1004633794;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۛ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-9639)) ^ (-1816648117);
                        i8 = -570922040;
                    }
                    break;
                case -1910837073:
                case -174974129:
                    if (CallableC1627.f6528) {
                        iM45029 = (C19806.m45029("ܳ۠") ^ i5) * (-91);
                        i7 = ((iM45029 ^ i6) * 6431) ^ 273859775;
                        i8 = 1950357323;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ۗ") + i6) * (-103);
                        i7 = ((iM45029 ^ i5) * (-22631)) ^ 1842880774;
                        i8 = 1357002758;
                    }
                    break;
                case -1794752412:
                case 1135159336:
                    i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 28) {
                        iM45029 = C19806.m45029("ᩳܺ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-29093)) ^ 1595922198;
                        i8 = -581222244;
                    } else {
                        iM45029 = C19806.m45029("ۗ֫") ^ i6;
                        i7 = ((iM45029 ^ i5) * 24959) ^ (-727992638);
                        i8 = -489555204;
                    }
                    break;
                case -1621988143:
                case -739031540:
                    if (C19806.f63586) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۛ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-9639)) ^ (-1816648117);
                        i8 = -570922040;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡ۜ") + i6) * q.h;
                        i7 = ((iM45029 ^ i5) * (-20981)) ^ (-1039857543);
                        i8 = 1231745033;
                    }
                    break;
                case -1573097852:
                case -1111018452:
                    break;
                case -1338149601:
                case -1172084542:
                    if (C3722.m10894() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴۖ") ^ i5) * (-13);
                        i7 = ((iM45029 ^ i6) * 30525) ^ 1525313955;
                        i8 = -595208321;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩻") ^ i5;
                        i7 = ((iM45029 ^ i6) * 17601) ^ 1429800938;
                        i8 = 1859469752;
                    }
                    break;
                case -1334366281:
                case 636426775:
                    windowM10777.setBackgroundDrawableResource(i2);
                    z = false;
                    z = false;
                    if (CallableC1627.m5507() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۛ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-9639)) ^ (-1816648117);
                        i8 = -570922040;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ۬") + i5) * 47;
                        i7 = ((iM45029 ^ i6) * (-31317)) ^ 247395404;
                        i8 = -1934253651;
                    }
                    break;
                case -1258899676:
                case -1213439305:
                    C3577.m10565();
                    if (C1025.f4800 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۛ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-9639)) ^ (-1816648117);
                        i8 = -570922040;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ۢۡ")) * (-75);
                        i7 = ((iM45029 ^ i5) * (-5401)) ^ 1609848548;
                        i8 = 794997336;
                    }
                    break;
                case -677955982:
                case 724594382:
                    windowM10777 = C3660.m10777(this);
                    if (C1377.f5749) {
                        iM45029 = C19806.m45029("ܿۘ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-28745)) ^ (-1420160658);
                        i8 = 613210263;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴۖ") ^ i5) * (-13);
                        i7 = ((iM45029 ^ i6) * 30525) ^ 1525313955;
                        i8 = -595208321;
                    }
                    break;
                case -239144052:
                case 460313695:
                    if (i3 >= 29) {
                        iM45029 = C19806.m45029("۠ۚ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 11265) ^ (-1930419150);
                        i8 = 1492955793;
                    } else {
                        iM45029 = C19806.m45029("۟ۘ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-13837)) ^ (-119238066);
                        i8 = -1319934567;
                    }
                    break;
                case -33721768:
                case 1886691308:
                    C1419.m4973();
                    if (C1875.f7103 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ۗ") + i6) * (-103);
                        i7 = ((iM45029 ^ i5) * (-22631)) ^ 1842880774;
                        i8 = 1357002758;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۛ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-9639)) ^ (-1816648117);
                        i8 = -570922040;
                    }
                    break;
                case 119297396:
                case 1642369639:
                    windowM10777.setNavigationBarContrastEnforced(z);
                    iM45029 = C19806.m45029("۟ۘ") ^ i6;
                    i7 = ((iM45029 ^ i5) * (-13837)) ^ (-119238066);
                    i8 = -1319934567;
                    break;
                case 224976263:
                case 2086125702:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    RunnableC3388.m10064();
                    iM45029 = ThreadFactoryC3888.m11306("᩶ۛ") ^ i5;
                    i7 = ((iM45029 ^ i6) * (-9639)) ^ (-1816648117);
                    i8 = -570922040;
                    break;
                case 825635558:
                case 1970473494:
                    if (C0526.f2219) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۛ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-9639)) ^ (-1816648117);
                        i8 = -570922040;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۖ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-28349)) ^ 2017481233;
                        i8 = -419615253;
                    }
                    break;
                case 891059523:
                case 907443826:
                    windowM10777.addFlags(i);
                    i2 = R.color.transparent;
                    if (C2788.f10625 >= 0) {
                        iM45029 = C19806.m45029("ۖۡ") ^ i6;
                        i7 = ((iM45029 ^ i5) * 18701) ^ (-1159029949);
                        i8 = -1530697544;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ۠") ^ i5) * (-69);
                        i7 = ((iM45029 ^ i6) * (-31127)) ^ (-908084719);
                        i8 = -1743349382;
                    }
                    break;
                case 1177082961:
                case 2070676465:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴۖ") ^ i5) * (-13);
                        i7 = ((iM45029 ^ i6) * 30525) ^ 1525313955;
                        i8 = -595208321;
                    } else {
                        iM45029 = C19806.m45029("֫۬") ^ i6;
                        i7 = ((iM45029 ^ i5) * 25693) ^ (-982148209);
                        i8 = -1454633305;
                    }
                    break;
                case 1629286225:
                case 2004422511:
                    if (C3535.m10431() > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴۖ") ^ i5) * (-13);
                        i7 = ((iM45029 ^ i6) * 30525) ^ 1525313955;
                        i8 = -595208321;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ۗ") + i6) * (-103);
                        i7 = ((iM45029 ^ i5) * (-22631)) ^ 1842880774;
                        i8 = 1357002758;
                    }
                    break;
                default:
                    i = 201326592;
                    if (C2332.m7079() <= 0) {
                        iM45029 = C19806.m45029("ۖۡ") ^ i6;
                        i7 = ((iM45029 ^ i5) * 18701) ^ (-1159029949);
                        i8 = -1530697544;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ۙ᩷")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i7 = ((iM45029 ^ i5) * (-19083)) ^ (-1192316168);
                        i8 = 1526890216;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31006(C17381 c17381, View view, View view2, View view3, View view4, View view5) {
        int i = 1623838284;
        int i2 = C1419.f5860;
        int i3 = AbstractC0464.f2088;
        int iM45029 = C19806.m45029("ܺܽ") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-26817)) ^ 177160300;
        int i5 = -1223662203;
        while (true) {
            i = ((((i ^ i2) * 19067) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2077209147:
                case -413417148:
                    m31007(c17381, view, view2, view3, view4, null, null, view5, null);
                    break;
                case -2014035488:
                case -959541535:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (i3 - C19806.m45029("֫ܰ")) * 39;
                        i4 = ((iM45029 ^ i2) * 13227) ^ 341655351;
                        i5 = 689150585;
                    } else {
                        iM45029 = C19806.m45029("ۖۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-11507)) ^ 1683697951;
                        i5 = 855315189;
                    }
                    break;
                case -1603273967:
                case 759098393:
                    C0817.m3399();
                    C1419.m4973();
                    iM45029 = (i3 - C19806.m45029("ܳ֨")) * (-41);
                    i4 = ((iM45029 ^ i2) * (-24549)) ^ 694428048;
                    i5 = 1012689215;
                    break;
                case -1183220690:
                case -461594408:
                    if (C3535.f13026 <= 0) {
                        iM45029 = (i3 - C19806.m45029("ܳ֨")) * (-41);
                        i4 = ((iM45029 ^ i2) * (-24549)) ^ 694428048;
                        i5 = 1012689215;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("֡᩷")) * (-73);
                        i4 = ((iM45029 ^ i3) * (-30155)) ^ 2094932545;
                        i5 = -260240070;
                    }
                    break;
                case -1171264451:
                case -469157407:
                    C2704.m8255();
                    break;
                case -1150115634:
                case -1005457835:
                    if (C0278.f1572 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 32095) ^ (-1776516181);
                        i5 = -1261133664;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-2637)) ^ 1196307102;
                        i5 = 487728580;
                    }
                    break;
                case -961711968:
                case 1164986878:
                    if (C1977.f7413 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 32095) ^ (-1776516181);
                        i5 = -1261133664;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20895)) ^ (-802897993);
                        i5 = 842916631;
                    }
                    break;
                case -910436881:
                case -277727775:
                    if (RunnableC1895.f7152) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-32339)) ^ 1646562257;
                        i5 = -474173547;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 32095) ^ (-1776516181);
                        i5 = -1261133664;
                    }
                    break;
                case -731069124:
                case 1610453111:
                    C3535.m10431();
                    if (C1875.f7103 >= 0) {
                        iM45029 = (i2 - C19806.m45029("֫۠")) * 29;
                        i4 = ((iM45029 ^ i3) * 22263) ^ (-2112790309);
                        i5 = -391370886;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 32095) ^ (-1776516181);
                        i5 = -1261133664;
                    }
                    break;
                case -437545114:
                case 262344016:
                    if (C1937.m6279() >= 0) {
                        iM45029 = (i2 - C19806.m45029("֫۠")) * 29;
                        i4 = ((iM45029 ^ i3) * 22263) ^ (-2112790309);
                        i5 = -391370886;
                    } else {
                        iM45029 = C19806.m45029("᩷ۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 8055) ^ 354970032;
                        i5 = -1632697716;
                    }
                    break;
                case -409137999:
                case 1106478567:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (i2 - C19806.m45029("֫۠")) * 29;
                        i4 = ((iM45029 ^ i3) * 22263) ^ (-2112790309);
                        i5 = -391370886;
                    } else {
                        iM45029 = C19806.m45029("֨ᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-20017)) ^ (-1068321604);
                        i5 = -1138827724;
                    }
                    break;
                case -323670826:
                case 1651414025:
                    if (C1148.m4232() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤۨ") + i2) * 3;
                        i4 = ((iM45029 ^ i3) * 20947) ^ 2128642607;
                        i5 = 546130667;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܳ֨")) * (-41);
                        i4 = ((iM45029 ^ i2) * (-24549)) ^ 694428048;
                        i5 = 1012689215;
                    }
                    break;
                case -230296925:
                case -112758636:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤۨ") + i2) * 3;
                        i4 = ((iM45029 ^ i3) * 20947) ^ 2128642607;
                        i5 = 546130667;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-6541)) ^ (-1925923726);
                        i5 = -1670141668;
                    }
                    break;
                case 155446275:
                case 907835962:
                    if (C10634.m26820()) {
                        iM45029 = (i2 - C19806.m45029("֫۠")) * 29;
                        i4 = ((iM45029 ^ i3) * 22263) ^ (-2112790309);
                        i5 = -391370886;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-13049)) ^ 467386661;
                        i5 = 655696956;
                    }
                    break;
                case 906974031:
                case 2138351772:
                    if (C2704.f10408) {
                        iM45029 = C19806.m45029("᩺ۘ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 6069) ^ (-1747282456);
                        i5 = 753156720;
                    } else {
                        iM45029 = (i2 - C19806.m45029("֫۠")) * 29;
                        i4 = ((iM45029 ^ i3) * 22263) ^ (-2112790309);
                        i5 = -391370886;
                    }
                    break;
                default:
                    C0817.m3399();
                    if (C1066.f4915 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 32095) ^ (-1776516181);
                        i5 = -1261133664;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܳ֨")) * (-41);
                        i4 = ((iM45029 ^ i2) * (-24549)) ^ 694428048;
                        i5 = 1012689215;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31003(Throwable th, boolean z) {
        DialogInterface.OnDismissListener onDismissListener = null;
        int i = 1758276239;
        int i2 = C2477.f9839;
        int i3 = C2871.f10837;
        int iM45029 = (C19806.m45029("ᩳۗ") + i2) * (-91);
        int i4 = ((iM45029 ^ i3) * 25127) ^ (-1567563730);
        int i5 = 1902768417;
        while (true) {
            i = ((((i ^ i3) * (-15707)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2100142673:
                case -1263610710:
                    if (C0797.m3359()) {
                        iM45029 = C19806.m45029("ᩳ᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12767) ^ 463289540;
                        i5 = -1958987214;
                    } else {
                        iM45029 = (C19806.m45029("۟᩻") ^ i2) * (-127);
                        i4 = ((iM45029 ^ i3) * 15061) ^ 1133996816;
                        i5 = -577075034;
                    }
                    break;
                case -1745837866:
                case 1212826788:
                    onDismissListener = null;
                    iM45029 = ThreadFactoryC3888.m11306("᩷۠") ^ i2;
                    i4 = ((iM45029 ^ i3) * 28207) ^ 1230565669;
                    i5 = 1541353196;
                    break;
                case -1413437283:
                case -238236978:
                    if (C0671.f2816 != 0) {
                        iM45029 = (C19806.m45029("۟᩻") ^ i2) * (-127);
                        i4 = ((iM45029 ^ i3) * 15061) ^ 1133996816;
                        i5 = -577075034;
                    } else {
                        iM45029 = (C19806.m45029("ۘ۟") + i3) * 33;
                        i4 = ((iM45029 ^ i2) * (-22529)) ^ 1535565939;
                        i5 = 1276889364;
                    }
                    break;
                case -1410585062:
                case 1878736615:
                    if (C2704.f10408) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("֡֨")) * (-5);
                        i4 = ((iM45029 ^ i3) * (-11475)) ^ 351325554;
                        i5 = 2093696112;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * 31773) ^ (-1463195691);
                        i5 = -1731706676;
                    }
                    break;
                case -1278925203:
                case -859461790:
                    if (C2249.f8050 >= 0) {
                        iM45029 = (C19806.m45029("۟᩻") ^ i2) * (-127);
                        i4 = ((iM45029 ^ i3) * 15061) ^ 1133996816;
                        i5 = -577075034;
                    } else {
                        iM45029 = C19806.m45029("ܳ᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * 2999) ^ (-1032680895);
                        i5 = 1142308373;
                    }
                    break;
                case -1186191882:
                case -152644291:
                    if (C2477.f9839 <= 0) {
                        iM45029 = (C19806.m45029("ۘ۟") + i3) * 33;
                        i4 = ((iM45029 ^ i2) * (-22529)) ^ 1535565939;
                        i5 = 1276889364;
                    } else {
                        iM45029 = (C19806.m45029("۠ܺ") + i3) * 75;
                        i4 = ((iM45029 ^ i2) * (-17505)) ^ 1691875057;
                        i5 = -297295667;
                    }
                    break;
                case -997336969:
                case 1561679591:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    C1025.m3861();
                    iM45029 = ThreadFactoryC3888.m11306("֫֡") ^ i3;
                    i4 = ((iM45029 ^ i2) * 31773) ^ (-1463195691);
                    i5 = -1731706676;
                    break;
                case -728985827:
                case -657090709:
                    if (z) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-4179)) ^ 761837474;
                        i5 = 167249597;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13745) ^ 283168556;
                        i5 = 620778630;
                    }
                    break;
                case -703964882:
                case 454744982:
                    if (C1189.f5284 <= 0) {
                        iM45029 = (C19806.m45029("ۘ۟") + i3) * 33;
                        i4 = ((iM45029 ^ i2) * (-22529)) ^ 1535565939;
                        i5 = 1276889364;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡ۨ") + i3) * 67;
                        i4 = ((iM45029 ^ i2) * (-16407)) ^ (-162168818);
                        i5 = -677151543;
                    }
                    break;
                case -436028712:
                case 803260816:
                    if (C1148.f5161 > 0) {
                        iM45029 = (C19806.m45029("ۖᩳ") + i3) * 33;
                        i4 = ((iM45029 ^ i2) * 5779) ^ (-576830218);
                        i5 = -1160661356;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * 31773) ^ (-1463195691);
                        i5 = -1731706676;
                    }
                    break;
                case -359982869:
                case 2043272131:
                    onDismissListener = new DialogInterface.OnDismissListener() { // from class: l.᩵ܶۘ
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            int i6 = 845718242;
                            int i7 = C1460.f5948;
                            int i8 = C1398.f5802;
                            int iM450210 = (C19806.m45029("ۨۙ") + i7) * (-83);
                            int i9 = ((iM450210 ^ i8) * (-22315)) ^ (-25058709);
                            int i10 = -451769682;
                            while (true) {
                                i6 = ((((i6 ^ i8) * 7017) >> 31) & i9) ^ (iM450210 ^ i10);
                                switch (i6) {
                                    case -1890104117:
                                    case 608352578:
                                        if (C1066.f4915 <= 0) {
                                            iM450210 = (ThreadFactoryC3888.m11306("ᩴ۠") + i8) * (-23);
                                            i9 = ((iM450210 ^ i7) * (-18691)) ^ (-1235293122);
                                            i10 = 106192512;
                                        } else {
                                            iM450210 = (ThreadFactoryC3888.m11306("᩺ۘ") + i7) * 85;
                                            i9 = ((iM450210 ^ i8) * (-32071)) ^ (-1906735587);
                                            i10 = -381482667;
                                        }
                                        break;
                                    case -1610013618:
                                    case 174619595:
                                        if (CallableC1627.f6528) {
                                            iM450210 = (ThreadFactoryC3888.m11306("֫ۘ") ^ i8) * (-107);
                                            i9 = ((iM450210 ^ i7) * 26169) ^ (-2000279219);
                                            i10 = 813297747;
                                        } else {
                                            iM450210 = (ThreadFactoryC3888.m11306("ᩴ۠") + i8) * (-23);
                                            i9 = ((iM450210 ^ i7) * (-18691)) ^ (-1235293122);
                                            i10 = 106192512;
                                        }
                                        break;
                                    case -1397156384:
                                    case 1582983803:
                                        if (RunnableC1564.f6300) {
                                            iM450210 = C19806.m45029("ᩳ᩷") ^ i8;
                                            i9 = ((iM450210 ^ i7) * 13269) ^ (-1215699780);
                                            i10 = -929149894;
                                        } else {
                                            iM450210 = (ThreadFactoryC3888.m11306("۟ۨ") ^ i8) * 33;
                                            i9 = ((iM450210 ^ i7) * (-12135)) ^ (-1515479052);
                                            i10 = -1468058818;
                                        }
                                        break;
                                    case -1279841116:
                                    case 647595409:
                                        C2249.m6915();
                                        C3660.m10791();
                                        break;
                                    case -1126073076:
                                    case 632062890:
                                        if (C1668.f6641 >= 0) {
                                            iM450210 = (ThreadFactoryC3888.m11306("ᩴ۠") + i8) * (-23);
                                            i9 = ((iM450210 ^ i7) * (-18691)) ^ (-1235293122);
                                            i10 = 106192512;
                                        } else {
                                            iM450210 = ThreadFactoryC3888.m11306("ܳۚ") ^ i7;
                                            i9 = ((iM450210 ^ i8) * (-17453)) ^ (-1361826524);
                                            i10 = -1397398497;
                                        }
                                        break;
                                    case -929915321:
                                    case 407622730:
                                        if (C1066.m4023() <= 0) {
                                            iM450210 = (ThreadFactoryC3888.m11306("ᩴ۠") + i8) * (-23);
                                            i9 = ((iM450210 ^ i7) * (-18691)) ^ (-1235293122);
                                            i10 = 106192512;
                                        } else {
                                            iM450210 = ThreadFactoryC3888.m11306("ܽ᩺") ^ i8;
                                            i9 = ((iM450210 ^ i7) * (-4555)) ^ 192548999;
                                            i10 = 257390178;
                                        }
                                        break;
                                    case -539115699:
                                    case 2128267407:
                                        if (C2788.f10625 >= 0) {
                                            iM450210 = C19806.m45029("ᩳ᩷") ^ i8;
                                            i9 = ((iM450210 ^ i7) * 13269) ^ (-1215699780);
                                            i10 = -929149894;
                                        } else {
                                            iM450210 = (ThreadFactoryC3888.m11306("ۡۖ") + i7) * 43;
                                            i9 = ((iM450210 ^ i8) * 5169) ^ 1218030655;
                                            i10 = -481003271;
                                        }
                                        break;
                                    case -477612125:
                                    case 980879620:
                                        if (C0962.f3784) {
                                            iM450210 = ThreadFactoryC3888.m11306("֡ۤ") ^ i7;
                                            i9 = ((iM450210 ^ i8) * 19849) ^ 457938413;
                                            i10 = -293713122;
                                        } else {
                                            iM450210 = (ThreadFactoryC3888.m11306("ᩴ۠") + i8) * (-23);
                                            i9 = ((iM450210 ^ i7) * (-18691)) ^ (-1235293122);
                                            i10 = 106192512;
                                        }
                                        break;
                                    case -377910923:
                                    case 1855837824:
                                        if (C2788.f10625 >= 0) {
                                            iM450210 = C19806.m45029("ᩳ᩷") ^ i8;
                                            i9 = ((iM450210 ^ i7) * 13269) ^ (-1215699780);
                                            i10 = -929149894;
                                        } else {
                                            iM450210 = (C19806.m45029("۬᩹") ^ i7) * 71;
                                            i9 = ((iM450210 ^ i8) * 24357) ^ 1358975063;
                                            i10 = -1183080450;
                                        }
                                        break;
                                    case -364425623:
                                    case 506170274:
                                        C1461.m5080();
                                        MenuItemOnMenuItemClickListenerC3244.m9701();
                                        iM450210 = (ThreadFactoryC3888.m11306("ᩴ۠") + i8) * (-23);
                                        i9 = ((iM450210 ^ i7) * (-18691)) ^ (-1235293122);
                                        i10 = 106192512;
                                        break;
                                    case -336508292:
                                    case 2064521899:
                                        int i11 = AbstractActivityC12483.f41623;
                                        if (C1398.f5802 <= 0) {
                                            iM450210 = C19806.m45029("ᩳ᩷") ^ i8;
                                            i9 = ((iM450210 ^ i7) * 13269) ^ (-1215699780);
                                            i10 = -929149894;
                                        } else {
                                            iM450210 = (C19806.m45029("֫ۨ") ^ i8) * (-115);
                                            i9 = ((iM450210 ^ i7) * (-18983)) ^ 579367852;
                                            i10 = -258222935;
                                        }
                                        break;
                                    case -79577053:
                                    case 1719510740:
                                        if (AbstractC0464.f2088 <= 0) {
                                            iM450210 = (i7 - ThreadFactoryC3888.m11306("ۗ᩺")) * (-51);
                                            i9 = ((iM450210 ^ i8) * (-16101)) ^ (-464330587);
                                            i10 = 1710599870;
                                        } else {
                                            iM450210 = (i8 - C19806.m45029("ۜۧ")) * (-71);
                                            i9 = ((iM450210 ^ i7) * 1949) ^ (-97113335);
                                            i10 = 353451560;
                                        }
                                        break;
                                    case -76236797:
                                    case 1439575881:
                                        C0216.m1586(this.f62809);
                                        break;
                                    case 1218643886:
                                    case 1594527278:
                                        if (C2249.f8050 >= 0) {
                                            iM450210 = C19806.m45029("ᩳ᩷") ^ i8;
                                            i9 = ((iM450210 ^ i7) * 13269) ^ (-1215699780);
                                            i10 = -929149894;
                                        } else {
                                            iM450210 = ThreadFactoryC3888.m11306("ۘ۬") ^ i7;
                                            i9 = ((iM450210 ^ i8) * (-5769)) ^ 2064527614;
                                            i10 = -1625799671;
                                        }
                                        break;
                                    case 1439578545:
                                    case 1640947389:
                                        if (C2871.f10837 >= 0) {
                                            iM450210 = (i7 - ThreadFactoryC3888.m11306("ۗ᩺")) * (-51);
                                            i9 = ((iM450210 ^ i8) * (-16101)) ^ (-464330587);
                                            i10 = 1710599870;
                                        } else {
                                            iM450210 = (ThreadFactoryC3888.m11306("ܶܿ") + i8) * (-15);
                                            i9 = ((iM450210 ^ i7) * 11505) ^ (-1039368430);
                                            i10 = -1503006933;
                                        }
                                        break;
                                    default:
                                        C1148.m4232();
                                        if (!C3286.f12186) {
                                            iM450210 = (ThreadFactoryC3888.m11306("ᩴ۠") + i8) * (-23);
                                            i9 = ((iM450210 ^ i7) * (-18691)) ^ (-1235293122);
                                            i10 = 106192512;
                                        } else {
                                            iM450210 = (i7 - ThreadFactoryC3888.m11306("ۗ᩺")) * (-51);
                                            i9 = ((iM450210 ^ i8) * (-16101)) ^ (-464330587);
                                            i10 = 1710599870;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    iM45029 = ThreadFactoryC3888.m11306("᩷۠") ^ i2;
                    i4 = ((iM45029 ^ i3) * 28207) ^ 1230565669;
                    i5 = 1541353196;
                    break;
                case -82939208:
                case 974446406:
                    if (C1937.f7317 >= 0) {
                        iM45029 = C19806.m45029("᩻᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20447)) ^ (-1754767273);
                        i5 = -1775176853;
                    } else {
                        iM45029 = (C19806.m45029("᩹ۢ") ^ i3) * (-19);
                        i4 = ((iM45029 ^ i2) * (-7027)) ^ (-893090207);
                        i5 = -162502100;
                    }
                    break;
                case 44509264:
                case 660963089:
                    if (C10634.f36300 >= 0) {
                        iM45029 = (C19806.m45029("ۖᩳ") + i3) * 33;
                        i4 = ((iM45029 ^ i2) * 5779) ^ (-576830218);
                        i5 = -1160661356;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘܿ") + i2) * 99;
                        i4 = ((iM45029 ^ i3) * (-28385)) ^ (-1152325136);
                        i5 = 212973624;
                    }
                    break;
                case 115398852:
                case 1550803357:
                    if (C1066.m4023() <= 0) {
                        iM45029 = C19806.m45029("᩻᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20447)) ^ (-1754767273);
                        i5 = -1775176853;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-26319)) ^ (-2115010350);
                        i5 = -1506048728;
                    }
                    break;
                case 708372246:
                case 1492513319:
                    C2249.m6915();
                    break;
                case 736957259:
                case 1398718603:
                    C1875.m6102(this, th, onDismissListener);
                    break;
                case 951699823:
                case 1101241997:
                    if (C2642.f10294 <= 0) {
                        iM45029 = C19806.m45029("᩻᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20447)) ^ (-1754767273);
                        i5 = -1775176853;
                    } else {
                        iM45029 = C19806.m45029("ۜۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 31465) ^ (-1823476562);
                        i5 = -1531096439;
                    }
                    break;
                case 1812288667:
                case 1905729935:
                    if (C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23673)) ^ 1939288613;
                        i5 = -1273761394;
                    } else {
                        iM45029 = C19806.m45029("᩻᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20447)) ^ (-1754767273);
                        i5 = -1775176853;
                    }
                    break;
                default:
                    if (C2788.f10625 >= 0) {
                        iM45029 = (C19806.m45029("ۘ۟") + i3) * 33;
                        i4 = ((iM45029 ^ i2) * (-22529)) ^ 1535565939;
                        i5 = 1276889364;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * 31773) ^ (-1463195691);
                        i5 = -1731706676;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m31013() {
        this.f41638 = false;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m31023() {
        this.f41633 = true;
    }

    /* JADX WARN: Code duplicated, block: B:98:0x0395 A[PHI: r26
      0x0395: PHI (r26v15 short[]) = (r26v14 short[]), (r26v16 short[]) binds: [B:96:0x037d, B:91:0x035c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a3, code lost:
    
        if (l.C1419.f5860 >= 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ab, code lost:
    
        if (l.C1460.f5948 < 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
    
        if (l.C3743.m10966() > 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cb, code lost:
    
        if (l.C0817.f3443 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d5, code lost:
    
        if (l.RunnableC3388.m10064() != false) goto L17;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.ActivityC10074, l.ActivityC16858, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r30) {
        /*
            Method dump skipped, instruction units count: 1616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC12483.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // l.InterfaceC17421
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo31001(Throwable th) {
        C0671.m3019(this, th, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31002(final Throwable th, final DialogInterface.OnDismissListener onDismissListener) {
        AbstractC3062 abstractC3062M5341 = null;
        int i = 22471273;
        int i2 = C3660.f13403;
        int i3 = C1875.f7103;
        int iM45029 = (C19806.m45029("᩺ۚ") + i2) * (-125);
        int i4 = ((iM45029 ^ i3) * (-27537)) ^ (-1874627137);
        int i5 = -423339366;
        while (true) {
            i = ((((i ^ i3) * (-12139)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2012603169:
                case -1407922994:
                    if (C7105.f23796 < 0) {
                        iM45029 = (C19806.m45029("ۢۖ") ^ i2) * 43;
                        i4 = ((iM45029 ^ i3) * (-32563)) ^ (-1119044495);
                        i5 = -1186602878;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("۠ܺ")) * (-77);
                        i4 = ((iM45029 ^ i2) * (-27893)) ^ (-1382682512);
                        i5 = 1561292702;
                    }
                    break;
                case -1987900430:
                case -683608241:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (C19806.m45029("ۢۖ") ^ i2) * 43;
                        i4 = ((iM45029 ^ i3) * (-32563)) ^ (-1119044495);
                        i5 = -1186602878;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * 2023) ^ 1305781688;
                        i5 = 675226021;
                    }
                    break;
                case -1727172760:
                case 582578227:
                    RunnableC1895.m6170();
                    break;
                case -1284599900:
                case 213880432:
                    if (C1937.f7317 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ܽ") + i2) * 109;
                        i4 = ((iM45029 ^ i3) * (-21673)) ^ 1189574163;
                        i5 = -1874350336;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-24015)) ^ 1282470277;
                        i5 = -742563706;
                    }
                    break;
                case -1080930311:
                case 1256313142:
                    if (C1419.m4973()) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ܽ") + i2) * 109;
                        i4 = ((iM45029 ^ i3) * (-21673)) ^ 1189574163;
                        i5 = -1874350336;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23337)) ^ (-1928376770);
                        i5 = -410106091;
                    }
                    break;
                case -1021218177:
                case -558021858:
                    CallableC1627.m5507();
                    iM45029 = C19806.m45029("֫᩶") ^ i3;
                    i4 = ((iM45029 ^ i2) * 4505) ^ (-1600856602);
                    i5 = 1916581614;
                    break;
                case -461074482:
                case 1374610558:
                    if (C19806.f63586) {
                        iM45029 = (C19806.m45029("ۢۖ") ^ i2) * 43;
                        i4 = ((iM45029 ^ i3) * (-32563)) ^ (-1119044495);
                        i5 = -1186602878;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖᩴ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 17805) ^ 1541635019;
                        i5 = -1735580706;
                    }
                    break;
                case -327594915:
                case 562857815:
                    if (C1977.f7413 <= 0) {
                        iM45029 = C19806.m45029("֫᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4505) ^ (-1600856602);
                        i5 = 1916581614;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֨᩻")) * 9;
                        i4 = ((iM45029 ^ i2) * 25447) ^ (-1189508081);
                        i5 = 358382804;
                    }
                    break;
                case -297309192:
                case 254012611:
                    if (C2124.f7782 <= 0) {
                        iM45029 = (C19806.m45029("ۢۖ") ^ i2) * 43;
                        i4 = ((iM45029 ^ i3) * (-32563)) ^ (-1119044495);
                        i5 = -1186602878;
                    } else {
                        iM45029 = C19806.m45029("ۛۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 24351) ^ (-2013128805);
                        i5 = 387698738;
                    }
                    break;
                case -89011997:
                case 1621623069:
                    abstractC3062M5341 = RunnableC1564.m5341(this);
                    if (abstractC3062M5341.mo9170() == EnumC9414.DESTROYED) {
                        iM45029 = (C19806.m45029("֫ۗ") ^ i3) * (-105);
                        i4 = ((iM45029 ^ i2) * (-3949)) ^ (-508778973);
                        i5 = -670105432;
                    } else {
                        iM45029 = C19806.m45029("ۨܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-10119)) ^ 505676318;
                        i5 = -1798159948;
                    }
                    break;
                case -64349962:
                case 456027956:
                    if (C1875.m6086() != 0) {
                        iM45029 = C19806.m45029("᩶ᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 14077) ^ 218017814;
                        i5 = 1193710046;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17857) ^ (-1482886372);
                        i5 = -297922932;
                    }
                    break;
                case 84912993:
                case 1368831315:
                    if (C3286.m9798() <= 0) {
                        iM45029 = C19806.m45029("֫᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4505) ^ (-1600856602);
                        i5 = 1916581614;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫ܽ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 16161) ^ 215029537;
                        i5 = 1089364222;
                    }
                    break;
                case 96810116:
                case 837806712:
                    C0671.m3008();
                    if (C3535.f13026 > 0) {
                        iM45029 = (C19806.m45029("ۢۖ") ^ i2) * 43;
                        i4 = ((iM45029 ^ i3) * (-32563)) ^ (-1119044495);
                        i5 = -1186602878;
                    } else {
                        iM45029 = C19806.m45029("֫᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4505) ^ (-1600856602);
                        i5 = 1916581614;
                    }
                    break;
                case 144834483:
                case 173668656:
                    if (C1937.f7317 >= 0) {
                        iM45029 = C19806.m45029("֫᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4505) ^ (-1600856602);
                        i5 = 1916581614;
                    } else {
                        iM45029 = (C19806.m45029("᩵ۖ") + i2) * (-83);
                        i4 = ((iM45029 ^ i3) * (-17003)) ^ 1312140743;
                        i5 = 1023826345;
                    }
                    break;
                case 527446935:
                case 1329734601:
                    C2871.m8646();
                    if (C1937.m6279() < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ܽ") + i2) * 109;
                        i4 = ((iM45029 ^ i3) * (-21673)) ^ 1189574163;
                        i5 = -1874350336;
                    } else {
                        iM45029 = C19806.m45029("֫᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4505) ^ (-1600856602);
                        i5 = 1916581614;
                    }
                    break;
                case 948737352:
                case 1584892976:
                    if (C2704.f10408) {
                        iM45029 = (C19806.m45029("ۜۖ") + i2) * (-13);
                        i4 = ((iM45029 ^ i3) * (-6339)) ^ 435995356;
                        i5 = -1230183804;
                    } else {
                        iM45029 = C19806.m45029("᩶ᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 14077) ^ 218017814;
                        i5 = 1193710046;
                    }
                    break;
                case 1332587040:
                case 1353467359:
                    break;
                default:
                    final C4245 c4245 = (C4245) abstractC3062M5341;
                    runOnUiThread(new Runnable(this) { // from class: l.ۤܶۘ

                        /* JADX INFO: renamed from: ᩶ۡ᩷, reason: not valid java name and contains not printable characters */
                        private static final short[] f35522 = {2765, -26461, -16501, -18195, -14984, -14989, -14990, -14994, -14995, -14978, -14989, -15022, -15075, -15026, -15027, -15012, -15010, -15016, -15075, -15023, -15016, -15013, -15031, -15075, -15022, -15021, -15075, -15015, -15016, -15029, -15020, -15010, -15016, -27026, -28176, 18071, -26842, 20421, 21367, 17727, -22547, -22558, -14984, -14988, -14994, -14983, -14988, -14993, -15021, -15022, -15031, -15075, -15013, -15022, -15032, -15021, -15015, 24249, 18668, -17433, -15021, -15022, -15031, -15075, -15016, -15035, -15020, -15026, -15031, -28586, -25526, 24281, 24457, -17203, -24574, -23011, -25696, -21040, -14981, -15020, -15023, -15016, -15075, -15021, -15022, -15031, -15075, -15013, -15022, -15032, -15021, -15015, -15097, -15049, 23783, 21031, -23277};

                        /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ AbstractActivityC12483 f35524;

                        {
                            int i6 = 881398730;
                            int i7 = C2249.f8050;
                            int i8 = C0278.f1572;
                            int iM11306 = ThreadFactoryC3888.m11306("۟ܳ") ^ i7;
                            int i9 = ((iM11306 ^ i8) * (-3649)) ^ (-107782740);
                            int i10 = 267583349;
                            while (true) {
                                i6 = ((((i6 ^ i8) * (-24369)) >> 31) & i9) ^ (iM11306 ^ i10);
                                switch (i6) {
                                    case -2119843755:
                                    case 1601347599:
                                        if (C2124.f7782 <= 0) {
                                            iM11306 = C19806.m45029("֡ۢ") ^ i8;
                                            i9 = ((iM11306 ^ i7) * 12805) ^ 1542797919;
                                            i10 = -432025758;
                                        } else {
                                            iM11306 = C19806.m45029("᩺ܶ") ^ i8;
                                            i9 = ((iM11306 ^ i7) * 12269) ^ 911142532;
                                            i10 = 244558837;
                                        }
                                        break;
                                    case -2118831582:
                                    case -1677217485:
                                        if (C3722.f13525 <= 0) {
                                            iM11306 = (i7 - C19806.m45029("ܶܿ")) * 69;
                                            i9 = ((iM11306 ^ i8) * (-25659)) ^ (-1544086873);
                                            i10 = -2047598927;
                                        } else {
                                            iM11306 = C19806.m45029("ܽ֡") ^ i7;
                                            i9 = ((iM11306 ^ i8) * (-11795)) ^ (-1185783678);
                                            i10 = -260890909;
                                        }
                                        break;
                                    case -2013088442:
                                    case -812551634:
                                        this.f35524 = this;
                                        if (C2704.f10408) {
                                            iM11306 = (C19806.m45029("᩷۫") ^ i8) * 15;
                                            i9 = ((iM11306 ^ i7) * 23581) ^ (-1076554597);
                                            i10 = 947550431;
                                        } else {
                                            iM11306 = (C19806.m45029("ۙۙ") ^ i7) * (-29);
                                            i9 = ((iM11306 ^ i8) * 9289) ^ 960613923;
                                            i10 = -913202130;
                                        }
                                        break;
                                    case -1695155628:
                                    case -1220602238:
                                        C0526.m2437();
                                        throw new RuntimeException();
                                    case -1680429620:
                                    case -1247866926:
                                        if (C3743.f13569) {
                                            iM11306 = (ThreadFactoryC3888.m11306("ۛ֨") + i7) * 43;
                                            i9 = ((iM11306 ^ i8) * 27277) ^ (-1815092020);
                                            i10 = -407970655;
                                        } else {
                                            iM11306 = (i7 - C19806.m45029("ܶܿ")) * 69;
                                            i9 = ((iM11306 ^ i8) * (-25659)) ^ (-1544086873);
                                            i10 = -2047598927;
                                        }
                                        break;
                                    case -1216508011:
                                    case -395251474:
                                        if (C0216.m1591() <= 0) {
                                            iM11306 = (C19806.m45029("ۙۙ") ^ i7) * (-29);
                                            i9 = ((iM11306 ^ i8) * 9289) ^ 960613923;
                                            i10 = -913202130;
                                        } else {
                                            iM11306 = (ThreadFactoryC3888.m11306("ۨۘ") ^ i8) * 7;
                                            i9 = ((iM11306 ^ i7) * (-13411)) ^ (-517142237);
                                            i10 = 211397351;
                                        }
                                        break;
                                    case -1179290760:
                                    case 1974653161:
                                        if (C19806.f63586) {
                                            iM11306 = C19806.m45029("֡ۢ") ^ i8;
                                            i9 = ((iM11306 ^ i7) * 12805) ^ 1542797919;
                                            i10 = -432025758;
                                        } else {
                                            iM11306 = ThreadFactoryC3888.m11306("ۨᩳ") ^ i8;
                                            i9 = ((iM11306 ^ i7) * 2957) ^ (-1291297084);
                                            i10 = 719960790;
                                        }
                                        break;
                                    case -1127143396:
                                    case 1304497832:
                                        if (C0278.m1789() <= 0) {
                                            iM11306 = C19806.m45029("֡ۢ") ^ i8;
                                            i9 = ((iM11306 ^ i7) * 12805) ^ 1542797919;
                                            i10 = -432025758;
                                        } else {
                                            iM11306 = ThreadFactoryC3888.m11306("᩶ۡ") ^ i7;
                                            i9 = ((iM11306 ^ i8) * 5297) ^ (-1624256723);
                                            i10 = 1979671958;
                                        }
                                        break;
                                    case -1092644877:
                                    case -722885947:
                                        return;
                                    case -1025591354:
                                    case 193272627:
                                        if (C2642.f10294 <= 0) {
                                            iM11306 = (i7 - C19806.m45029("ܶܿ")) * 69;
                                            i9 = ((iM11306 ^ i8) * (-25659)) ^ (-1544086873);
                                            i10 = -2047598927;
                                        } else {
                                            iM11306 = ThreadFactoryC3888.m11306("᩸᩸") ^ i8;
                                            i9 = ((iM11306 ^ i7) * 28161) ^ 16566373;
                                            i10 = 175780305;
                                        }
                                        break;
                                    case -970570698:
                                    case -79136412:
                                        C7105.m18985();
                                        ViewTreeObserverOnPreDrawListenerC3327.m9874();
                                        iM11306 = C19806.m45029("᩵᩷") ^ i7;
                                        i9 = ((iM11306 ^ i8) * (-29171)) ^ (-1029559180);
                                        i10 = 1519773081;
                                        break;
                                    case -597542693:
                                    case 386825654:
                                        if (C0050.f912 <= 0) {
                                            iM11306 = C19806.m45029("֡ۢ") ^ i8;
                                            i9 = ((iM11306 ^ i7) * 12805) ^ 1542797919;
                                            i10 = -432025758;
                                        } else {
                                            iM11306 = (ThreadFactoryC3888.m11306("ۜ֫") ^ i7) * 87;
                                            i9 = ((iM11306 ^ i8) * 14427) ^ (-922664852);
                                            i10 = -664718184;
                                        }
                                        break;
                                    case -561406194:
                                    case 333943662:
                                        C1977.m6356();
                                        if (C0278.f1572 <= 0) {
                                            iM11306 = (C19806.m45029("ۙۙ") ^ i7) * (-29);
                                            i9 = ((iM11306 ^ i8) * 9289) ^ 960613923;
                                            i10 = -913202130;
                                        } else {
                                            iM11306 = C19806.m45029("᩵᩷") ^ i7;
                                            i9 = ((iM11306 ^ i8) * (-29171)) ^ (-1029559180);
                                            i10 = 1519773081;
                                        }
                                        break;
                                    case -47648477:
                                    case 731165498:
                                        if (C1937.f7317 < 0) {
                                            iM11306 = C19806.m45029("֡ۢ") ^ i8;
                                            i9 = ((iM11306 ^ i7) * 12805) ^ 1542797919;
                                            i10 = -432025758;
                                        } else {
                                            iM11306 = C19806.m45029("᩵᩷") ^ i7;
                                            i9 = ((iM11306 ^ i8) * (-29171)) ^ (-1029559180);
                                            i10 = 1519773081;
                                        }
                                        break;
                                    case 600782041:
                                    case 933120314:
                                        if (C1875.f7103 >= 0) {
                                            iM11306 = (i7 - C19806.m45029("ܶܿ")) * 69;
                                            i9 = ((iM11306 ^ i8) * (-25659)) ^ (-1544086873);
                                            i10 = -2047598927;
                                        } else {
                                            iM11306 = C19806.m45029("֡ۙ") ^ i7;
                                            i9 = ((iM11306 ^ i8) * 2069) ^ (-1547217754);
                                            i10 = 344606450;
                                        }
                                        break;
                                    default:
                                        if (C0278.m1789() <= 0) {
                                            iM11306 = C19806.m45029("֡ۢ") ^ i8;
                                            i9 = ((iM11306 ^ i7) * 12805) ^ 1542797919;
                                            i10 = -432025758;
                                        } else {
                                            iM11306 = C19806.m45029("ۡۘ") ^ i8;
                                            i9 = ((iM11306 ^ i7) * (-5549)) ^ 409160889;
                                            i10 = 1354158552;
                                        }
                                        break;
                                }
                            }
                        }

                        /*  JADX ERROR: Type inference failed
                            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 35721. Try increasing type updates limit count.
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                            */
                        @Override // java.lang.Runnable
                        public final void run() {
                            /*
                                Method dump skipped, instruction units count: 3572
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: l.RunnableC10366.run():void");
                        }
                    });
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x041b A[PHI: r23 r27 r29
      0x041b: PHI (r23v12 int) = (r23v9 int), (r23v2 int), (r23v2 int) binds: [B:103:0x0419, B:92:0x0383, B:83:0x0342] A[DONT_GENERATE, DONT_INLINE]
      0x041b: PHI (r27v31 int) = (r27v23 int), (r27v29 int), (r27v32 int) binds: [B:103:0x0419, B:92:0x0383, B:83:0x0342] A[DONT_GENERATE, DONT_INLINE]
      0x041b: PHI (r29v20 java.lang.String) = (r29v15 java.lang.String), (r29v18 java.lang.String), (r29v21 java.lang.String) binds: [B:103:0x0419, B:92:0x0383, B:83:0x0342] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00fe  */
    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context, l.InterfaceC17421
    public void startActivity(Intent intent) {
        int iM11306;
        int i;
        int i2;
        short s;
        int iM11307;
        int i3;
        int iM11308;
        int i4;
        int i5;
        int iM45029;
        int i6;
        int iM450210;
        int i7;
        int i8;
        int i9;
        int i10;
        short[] sArr;
        int i11;
        String strM10901;
        String str;
        int i12;
        int i13;
        int iM11309;
        int i14;
        int i15;
        AbstractActivityC12483 abstractActivityC12483 = this;
        intent = intent;
        int i16 = C2477.f9839;
        int i17 = C1460.f5948;
        int iM450211 = C19806.m45029("ۘ۬") ^ i16;
        int i18 = ((iM450211 ^ i17) * (-31419)) ^ (-1561306863);
        String str2 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i19 = iM450211 ^ (-2055731060);
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        char c = 0;
        short s2 = 0;
        short s3 = 0;
        String type = null;
        int i23 = 0;
        int i24 = 0;
        int i25 = 73338396;
        boolean zM5058 = false;
        short[] sArr5 = null;
        File file = null;
        InterfaceC17314 interfaceC17314M8257 = null;
        String scheme = null;
        Uri data = null;
        Uri uri = null;
        int i26 = 0;
        while (true) {
            i25 = i19 ^ (i18 & (((i25 ^ i17) * (-21573)) >> 31));
            switch (i25) {
                case -2015812780:
                case 428806718:
                    if (C2871.f10837 < 0) {
                        iM11306 = C19806.m45029("ۘܳ") ^ i16;
                        i = ((iM11306 ^ i17) * 10801) ^ (-1987368513);
                        i2 = 2122247494;
                        i19 = iM11306 ^ i2;
                        i18 = i;
                    } else {
                        i20 = i20;
                        str2 = str2;
                        iM450210 = C19806.m45029("᩵ܳ") ^ i16;
                        i7 = ((iM450210 ^ i17) * 31529) ^ 1853774423;
                        i8 = -1229536206;
                        i15 = iM450210 ^ i8;
                        str2 = str2;
                        i12 = i20;
                        i19 = i15;
                        i18 = i7;
                        i20 = i12;
                    }
                    break;
                case -1911207070:
                case -1056428842:
                    i20 = i20;
                    str2 = str2;
                    i13 = i24;
                    if (i13 >= 24) {
                        iM11309 = (i16 - ThreadFactoryC3888.m11306("ۛ᩺")) * (-43);
                        i7 = ((iM11309 ^ i17) * (-23011)) ^ (-1038421963);
                        i14 = 660918061;
                    } else {
                        iM11309 = C19806.m45029("֫᩹") ^ i17;
                        i7 = ((iM11309 ^ i16) * (-3329)) ^ (-448778557);
                        i14 = 799390398;
                    }
                    i15 = iM11309 ^ i14;
                    i24 = i13;
                    str2 = str2;
                    i12 = i20;
                    i19 = i15;
                    i18 = i7;
                    i20 = i12;
                    break;
                case -1800208539:
                case 162569030:
                    if (!AbstractC0464.m2315(C0526.m2424(sArr3, i20, 4, i21), scheme)) {
                        i20 = i20;
                        str2 = str2;
                        i13 = i24;
                        iM11309 = C19806.m45029("֫᩹") ^ i17;
                        i7 = ((iM11309 ^ i16) * (-3329)) ^ (-448778557);
                        i14 = 799390398;
                        i15 = iM11309 ^ i14;
                        i24 = i13;
                        str2 = str2;
                        i12 = i20;
                        i19 = i15;
                        i18 = i7;
                        i20 = i12;
                    } else {
                        iM11306 = C19806.m45029("֨᩺") ^ i17;
                        i = ((iM11306 ^ i16) * 29007) ^ 1604324079;
                        i2 = 1452151053;
                        i19 = iM11306 ^ i2;
                        i18 = i;
                    }
                    break;
                case -1797177377:
                case -1187218857:
                    C3660.m10791();
                    i20 = i20;
                    str2 = str2;
                    iM450210 = C19806.m45029("᩵ܳ") ^ i16;
                    i7 = ((iM450210 ^ i17) * 31529) ^ 1853774423;
                    i8 = -1229536206;
                    i15 = iM450210 ^ i8;
                    str2 = str2;
                    i12 = i20;
                    i19 = i15;
                    i18 = i7;
                    i20 = i12;
                    break;
                case -1744324171:
                case 252677575:
                    interfaceC17314M8257 = C2704.m8257(ApplicationC0716.f2992);
                    sArr4 = f41626;
                    i22 = 134;
                    i26 = 4;
                    if (C1066.f4915 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۗ") ^ i16;
                        i = ((iM11306 ^ i17) * (-8699)) ^ 1025814087;
                        i2 = 169817634;
                        i19 = iM11306 ^ i2;
                        i18 = i;
                    } else {
                        i20 = i20;
                        str2 = str2;
                        i24 = i24;
                        iM45029 = C19806.m45029("ܽۢ") ^ i16;
                        i18 = (-1666266322) ^ ((iM45029 ^ i17) * (-23963));
                        i6 = 1467248472;
                        i5 = iM45029 ^ i6;
                        intent = intent;
                        i24 = i24;
                        i20 = i20;
                        str2 = str2;
                        i19 = i5;
                        abstractActivityC12483 = this;
                    }
                    break;
                case -1729693394:
                case -1602594692:
                    if (C2124.m6673() > 0) {
                        i20 = i20;
                        str2 = str2;
                        i24 = i24;
                        iM45029 = C19806.m45029("ܽۢ") ^ i16;
                        i18 = (-1666266322) ^ ((iM45029 ^ i17) * (-23963));
                        i6 = 1467248472;
                        i5 = iM45029 ^ i6;
                        intent = intent;
                        i24 = i24;
                        i20 = i20;
                        str2 = str2;
                        i19 = i5;
                        abstractActivityC12483 = this;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢܳ") + i17) * 73;
                        i = ((iM11306 ^ i16) * (-8583)) ^ 1951580933;
                        i2 = 2143116439;
                        i19 = iM11306 ^ i2;
                        i18 = i;
                    }
                    break;
                case -1726571485:
                case 1255737881:
                    C9101 c9101 = abstractActivityC12483.f41644;
                    i20 = i20;
                    short[] sArr6 = f41626;
                    str2 = str2;
                    if (C0817.f3443) {
                        c9101.m23450(new Intent(C1668.m5577(sArr6, 87, 43, i21), uri));
                        data = abstractActivityC12483.f41635.getData();
                        if (data != null) {
                            iM450210 = C19806.m45029("᩺ۤ") ^ i16;
                            i7 = ((iM450210 ^ i17) * (-32601)) ^ (-797732436);
                            i8 = -399145743;
                        } else {
                            iM450210 = ThreadFactoryC3888.m11306("ܺۘ") ^ i17;
                            i7 = ((iM450210 ^ i16) * 17147) ^ 1825732269;
                            i8 = -1991400255;
                        }
                    } else {
                        iM450210 = C19806.m45029("᩵ܳ") ^ i16;
                        i7 = ((iM450210 ^ i17) * 31529) ^ 1853774423;
                        i8 = -1229536206;
                    }
                    i15 = iM450210 ^ i8;
                    str2 = str2;
                    i12 = i20;
                    i19 = i15;
                    i18 = i7;
                    i20 = i12;
                    break;
                case -1698337906:
                case -636351390:
                    i20 = i20;
                    str2 = str2;
                    i24 = i24;
                    type = intent.getType();
                    sArr2 = f41626;
                    i23 = 13;
                    if (C3743.m10966() <= 0) {
                        iM45029 = C19806.m45029("ܽۢ") ^ i16;
                        i18 = (-1666266322) ^ ((iM45029 ^ i17) * (-23963));
                        i6 = 1467248472;
                    } else {
                        iM45029 = C19806.m45029("ۧ᩻") ^ i16;
                        i18 = (-2135234664) ^ ((iM45029 ^ i17) * (-10693));
                        i6 = 444216083;
                    }
                    i5 = iM45029 ^ i6;
                    intent = intent;
                    i24 = i24;
                    i20 = i20;
                    str2 = str2;
                    i19 = i5;
                    abstractActivityC12483 = this;
                    break;
                case -1304103088:
                case -89122926:
                    Uri uriM34656 = C14396.m34656(file.getPath());
                    intent.setDataAndType(uriM34656, str2);
                    C21273.m47737(intent, uriM34656);
                    super.startActivity(intent);
                    break;
                case -1298637463:
                case -46220016:
                    try {
                        super.startActivity(intent);
                        iM11306 = (ThreadFactoryC3888.m11306("ۚܰ") + i17) * (-33);
                        i = ((iM11306 ^ i16) * (-18827)) ^ 1045779957;
                        i2 = -458940513;
                    } catch (ActivityNotFoundException unused) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۙ") ^ i16;
                        i = ((iM11306 ^ i17) * 18711) ^ (-1482974919);
                        i2 = 1024869465;
                    }
                    i19 = iM11306 ^ i2;
                    i18 = i;
                    break;
                case -1229173684:
                case 435912432:
                    scheme = intent.getData().getScheme();
                    sArr3 = f41626;
                    i20 = 130;
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM11306 = (C19806.m45029("ۨۜ") ^ i17) * 91;
                        i = ((iM11306 ^ i16) * 32183) ^ (-136352629);
                        i2 = -2025634541;
                        i19 = iM11306 ^ i2;
                        i18 = i;
                    } else {
                        str2 = str2;
                        int iM113010 = (i17 - ThreadFactoryC3888.m11306("۟ۖ")) * 115;
                        i19 = iM113010 ^ (-514166542);
                        i18 = ((iM113010 ^ i16) * 32277) ^ (-1451539593);
                        str2 = str2;
                    }
                    break;
                case -1169083911:
                case 378375672:
                    i20 = i20;
                    str2 = str2;
                    if (zM5058) {
                        iM450210 = C19806.m45029("ۢۢ") ^ i17;
                        i7 = ((iM450210 ^ i16) * 16915) ^ 1004031816;
                        i8 = -1120908171;
                    } else {
                        iM450210 = C19806.m45029("۫᩸") ^ i16;
                        i7 = ((iM450210 ^ i17) * (-27205)) ^ (-194397821);
                        i8 = -1321608491;
                    }
                    i15 = iM450210 ^ i8;
                    str2 = str2;
                    i12 = i20;
                    i19 = i15;
                    i18 = i7;
                    i20 = i12;
                    break;
                case -964363902:
                case -155780829:
                    C1977.m6356();
                    break;
                case -902956786:
                case 1366143617:
                    i20 = i20;
                    str2 = str2;
                    sArr2 = sArr2;
                    i23 = i23;
                    i24 = i24;
                    type = type;
                    s = s2;
                    int i27 = s + 6139;
                    if ((s2 * s3) - (i27 * i27) > 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ۛ֨") ^ i16;
                        i18 = ((iM11307 ^ i17) * (-23677)) ^ (-1749955046);
                        i3 = -867900252;
                    } else {
                        iM11307 = C19806.m45029("۬ۡ") ^ i17;
                        i18 = ((iM11307 ^ i16) * 28453) ^ (-1547599135);
                        i3 = 876496276;
                    }
                    i5 = iM11307 ^ i3;
                    s2 = s;
                    i23 = i23;
                    i24 = i24;
                    type = type;
                    str2 = str2;
                    sArr2 = sArr2;
                    i20 = i20;
                    i19 = i5;
                    abstractActivityC12483 = this;
                    break;
                case -877398746:
                case 1139696495:
                    super.startActivity(intent);
                    break;
                case -802677417:
                case 141525047:
                    i21 = 891;
                    iM11308 = ThreadFactoryC3888.m11306("ۗܺ") ^ i17;
                    i18 = 1189724309 ^ ((iM11308 ^ i16) * 8187);
                    i4 = 2127771003;
                    i5 = iM11308 ^ i4;
                    i23 = i23;
                    i24 = i24;
                    type = type;
                    str2 = str2;
                    sArr2 = sArr2;
                    i20 = i20;
                    i19 = i5;
                    abstractActivityC12483 = this;
                    break;
                case -725686681:
                case -95218155:
                    if (C2642.m8171() == 0) {
                        iM11306 = C19806.m45029("ۘܳ") ^ i16;
                        i = ((iM11306 ^ i17) * 10801) ^ (-1987368513);
                        i2 = 2122247494;
                    } else {
                        iM11306 = (i17 - ThreadFactoryC3888.m11306("ܳܽ")) * (-121);
                        i = ((iM11306 ^ i16) * (-29311)) ^ 1391182760;
                        i2 = -1849823896;
                    }
                    i19 = iM11306 ^ i2;
                    i18 = i;
                    break;
                case -696330086:
                case 9385462:
                    i20 = i20;
                    str2 = str2;
                    if (zM5058) {
                        iM450210 = (ThreadFactoryC3888.m11306("ۖ᩵") ^ i16) * (-7);
                        i7 = ((iM450210 ^ i17) * 31893) ^ 576734842;
                        i8 = -1793483174;
                        i15 = iM450210 ^ i8;
                        str2 = str2;
                        i12 = i20;
                        i19 = i15;
                        i18 = i7;
                        i20 = i12;
                    }
                    i13 = i24;
                    iM11309 = C19806.m45029("֫᩹") ^ i17;
                    i7 = ((iM11309 ^ i16) * (-3329)) ^ (-448778557);
                    i14 = 799390398;
                    i15 = iM11309 ^ i14;
                    i24 = i13;
                    str2 = str2;
                    i12 = i20;
                    i19 = i15;
                    i18 = i7;
                    i20 = i12;
                    break;
                case -611517094:
                case 225757396:
                    i20 = i20;
                    str2 = str2;
                    int i28 = Build.VERSION.SDK_INT;
                    if (i28 >= 26) {
                        int iM450212 = (C19806.m45029("ۡ۠") ^ i17) * (-109);
                        i24 = i28;
                        i18 = ((iM450212 ^ i16) * 27577) ^ 1403516284;
                        str2 = str2;
                        i12 = i20;
                        i19 = iM450212 ^ 1479205618;
                    } else {
                        i24 = i28;
                        iM450210 = C19806.m45029("۫᩸") ^ i16;
                        i7 = ((iM450210 ^ i17) * (-27205)) ^ (-194397821);
                        i8 = -1321608491;
                        i15 = iM450210 ^ i8;
                        str2 = str2;
                        i12 = i20;
                        i19 = i15;
                        i18 = i7;
                    }
                    i20 = i12;
                    break;
                case -483021984:
                case 1125334034:
                    i9 = i20;
                    String str3 = str2;
                    i10 = i24;
                    intent.putExtra(C3660.m10790(f41626, 52, 27, i21), true);
                    sArr = sArr2;
                    i11 = i23;
                    strM10901 = str3;
                    str = type;
                    int iM113011 = (i17 - ThreadFactoryC3888.m11306("۟᩶")) * 69;
                    i23 = i11;
                    i24 = i10;
                    type = str;
                    str2 = strM10901;
                    sArr2 = sArr;
                    i20 = i9;
                    i19 = iM113011 ^ 1957017135;
                    i18 = ((iM113011 ^ i16) * (-21575)) ^ 1303378851;
                    abstractActivityC12483 = this;
                    intent = intent;
                    break;
                case -304687561:
                case 2049894963:
                    C1398.m4894(interfaceC17314M8257, C2477.m7604(sArr4, i22, i26, i21), C0817.m3407(data)).commit();
                    i20 = i20;
                    str2 = str2;
                    iM450210 = ThreadFactoryC3888.m11306("ܺۘ") ^ i17;
                    i7 = ((iM450210 ^ i16) * 17147) ^ 1825732269;
                    i8 = -1991400255;
                    i15 = iM450210 ^ i8;
                    str2 = str2;
                    i12 = i20;
                    i19 = i15;
                    i18 = i7;
                    i20 = i12;
                    break;
                case -266072946:
                case 1545621224:
                    ThreadFactoryC3888.m11300();
                    if (!CallableC1627.f6528) {
                        iM11306 = ThreadFactoryC3888.m11306("۬ܽ") ^ i16;
                        i = ((iM11306 ^ i17) * 30833) ^ 1206305555;
                        i2 = -135726997;
                        i19 = iM11306 ^ i2;
                        i18 = i;
                    } else {
                        str2 = str2;
                        int iM113012 = (i17 - ThreadFactoryC3888.m11306("۟ۖ")) * 115;
                        i19 = iM113012 ^ (-514166542);
                        i18 = ((iM113012 ^ i16) * 32277) ^ (-1451539593);
                        str2 = str2;
                    }
                    break;
                case -179710602:
                case 1352123419:
                    i20 = i20;
                    str2 = str2;
                    s = s2;
                    sArr2 = sArr2;
                    i23 = i23;
                    i24 = i24;
                    type = type;
                    sArr5 = f41626;
                    c = '\f';
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ۙ֡") + i16) * 13;
                        i18 = ((iM11307 ^ i17) * 7501) ^ 1124946773;
                        i3 = -1400857165;
                        i5 = iM11307 ^ i3;
                        s2 = s;
                        i23 = i23;
                        i24 = i24;
                        type = type;
                        str2 = str2;
                        sArr2 = sArr2;
                        i20 = i20;
                        i19 = i5;
                        abstractActivityC12483 = this;
                    } else {
                        s2 = s;
                        i23 = i23;
                        type = type;
                        sArr2 = sArr2;
                        iM45029 = C19806.m45029("ܽۢ") ^ i16;
                        i18 = (-1666266322) ^ ((iM45029 ^ i17) * (-23963));
                        i6 = 1467248472;
                        i5 = iM45029 ^ i6;
                        intent = intent;
                        i24 = i24;
                        i20 = i20;
                        str2 = str2;
                        i19 = i5;
                        abstractActivityC12483 = this;
                    }
                    break;
                case 240070899:
                case 1211912159:
                    C2704.m8255();
                    if (!C0817.f3443) {
                        i20 = i20;
                        str2 = str2;
                        iM450210 = C19806.m45029("᩵ܳ") ^ i16;
                        i7 = ((iM450210 ^ i17) * 31529) ^ 1853774423;
                        i8 = -1229536206;
                        i15 = iM450210 ^ i8;
                        str2 = str2;
                        i12 = i20;
                        i19 = i15;
                        i18 = i7;
                        i20 = i12;
                    } else {
                        str2 = str2;
                        int iM113013 = (i17 - ThreadFactoryC3888.m11306("۟ۖ")) * 115;
                        i19 = iM113013 ^ (-514166542);
                        i18 = ((iM113013 ^ i16) * 32277) ^ (-1451539593);
                        str2 = str2;
                    }
                    break;
                case 414038063:
                case 1707345583:
                    i20 = i20;
                    str2 = str2;
                    abstractActivityC12483.f41635 = intent;
                    short[] sArr7 = f41626;
                    if (!C3286.f12186) {
                        String strM18989 = C7105.m18989(sArr7, 79, 8, i21);
                        if (C3722.f13525 > 0) {
                            StringBuilder sb = new StringBuilder(strM18989);
                            C2788.m8480(sb, getPackageName());
                            uri = Uri.parse(C0817.m3407(sb));
                            if (C0797.f3386) {
                                iM450210 = ThreadFactoryC3888.m11306("ۢ᩵") ^ i16;
                                i7 = ((iM450210 ^ i17) * 31655) ^ (-1204590625);
                                i8 = -1534128294;
                            } else {
                                iM450210 = (C19806.m45029("ܿ᩹") ^ i17) * 33;
                                i7 = ((iM450210 ^ i16) * (-16411)) ^ 290870192;
                                i8 = 742350389;
                            }
                            i15 = iM450210 ^ i8;
                            str2 = str2;
                            i12 = i20;
                            i19 = i15;
                            i18 = i7;
                            i20 = i12;
                        } else {
                            i24 = i24;
                            iM45029 = C19806.m45029("ܽۢ") ^ i16;
                            i18 = (-1666266322) ^ ((iM45029 ^ i17) * (-23963));
                            i6 = 1467248472;
                            i5 = iM45029 ^ i6;
                            intent = intent;
                            i24 = i24;
                            i20 = i20;
                            str2 = str2;
                            i19 = i5;
                            abstractActivityC12483 = this;
                        }
                    } else {
                        i20 = i20;
                        int iM113014 = (i17 - ThreadFactoryC3888.m11306("۟ۖ")) * 115;
                        i19 = iM113014 ^ (-514166542);
                        i18 = ((iM113014 ^ i16) * 32277) ^ (-1451539593);
                        str2 = str2;
                    }
                    break;
                case 503904109:
                case 1407807088:
                    i20 = i20;
                    str2 = str2;
                    sArr2 = sArr2;
                    i23 = i23;
                    i24 = i24;
                    type = type;
                    s2 = sArr5[c];
                    s3 = 24556;
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM11308 = (ThreadFactoryC3888.m11306("ۡۘ") + i17) * 69;
                        i18 = 291420072 ^ ((iM11308 ^ i16) * (-3063));
                        i4 = -1335843505;
                        i5 = iM11308 ^ i4;
                        i23 = i23;
                        i24 = i24;
                        type = type;
                        str2 = str2;
                        sArr2 = sArr2;
                        i20 = i20;
                        i19 = i5;
                        abstractActivityC12483 = this;
                    }
                    i23 = i23;
                    type = type;
                    sArr2 = sArr2;
                    iM45029 = C19806.m45029("ܽۢ") ^ i16;
                    i18 = (-1666266322) ^ ((iM45029 ^ i17) * (-23963));
                    i6 = 1467248472;
                    i5 = iM45029 ^ i6;
                    intent = intent;
                    i24 = i24;
                    i20 = i20;
                    str2 = str2;
                    i19 = i5;
                    abstractActivityC12483 = this;
                    break;
                case 609486210:
                case 2075868531:
                    i20 = i20;
                    str2 = str2;
                    if (intent.getData() != null) {
                        iM450210 = (C19806.m45029("ۜۛ") ^ i16) * 7;
                        i7 = ((iM450210 ^ i17) * (-16035)) ^ 711697697;
                        i8 = -1478409541;
                        i15 = iM450210 ^ i8;
                        str2 = str2;
                        i12 = i20;
                        i19 = i15;
                        i18 = i7;
                        i20 = i12;
                    }
                    i13 = i24;
                    iM11309 = C19806.m45029("֫᩹") ^ i17;
                    i7 = ((iM11309 ^ i16) * (-3329)) ^ (-448778557);
                    i14 = 799390398;
                    i15 = iM11309 ^ i14;
                    i24 = i13;
                    str2 = str2;
                    i12 = i20;
                    i19 = i15;
                    i18 = i7;
                    i20 = i12;
                    break;
                case 658870003:
                case 1194106028:
                    if (C0962.f3784) {
                        iM11306 = C19806.m45029("ۘܳ") ^ i16;
                        i = ((iM11306 ^ i17) * 10801) ^ (-1987368513);
                        i2 = 2122247494;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢܳ") + i17) * 73;
                        i = ((iM11306 ^ i16) * (-8583)) ^ 1951580933;
                        i2 = 2143116439;
                    }
                    i19 = iM11306 ^ i2;
                    i18 = i;
                    break;
                case 1080349180:
                case 2086234795:
                    break;
                case 1187213621:
                case 1783350665:
                    i9 = i20;
                    i10 = i24;
                    sArr = sArr2;
                    i11 = i23;
                    strM10901 = C3722.m10901(sArr, i11, 39, i21);
                    String str4 = type;
                    zM5058 = C1460.m5058(strM10901, str4);
                    if (zM5058) {
                        int iM450213 = C19806.m45029("ۘۨ") ^ i16;
                        i23 = i11;
                        i24 = i10;
                        str2 = strM10901;
                        i18 = ((iM450213 ^ i17) * 26245) ^ 96147994;
                        abstractActivityC12483 = this;
                        sArr2 = sArr;
                        i20 = i9;
                        i19 = iM450213 ^ 857924076;
                        type = str4;
                    } else {
                        str = str4;
                        int iM113015 = (i17 - ThreadFactoryC3888.m11306("۟᩶")) * 69;
                        i23 = i11;
                        i24 = i10;
                        type = str;
                        str2 = strM10901;
                        sArr2 = sArr;
                        i20 = i9;
                        i19 = iM113015 ^ 1957017135;
                        i18 = ((iM113015 ^ i16) * (-21575)) ^ 1303378851;
                        abstractActivityC12483 = this;
                        intent = intent;
                    }
                    break;
                case 1200514051:
                case 1495668099:
                    i20 = i20;
                    str2 = str2;
                    if (getPackageManager().canRequestPackageInstalls()) {
                        iM450210 = C19806.m45029("۫᩸") ^ i16;
                        i7 = ((iM450210 ^ i17) * (-27205)) ^ (-194397821);
                        i8 = -1321608491;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("ܳ᩵") + i16) * 29;
                        i7 = ((iM450210 ^ i17) * 25613) ^ (-1404515794);
                        i8 = -798091521;
                    }
                    i15 = iM450210 ^ i8;
                    str2 = str2;
                    i12 = i20;
                    i19 = i15;
                    i18 = i7;
                    i20 = i12;
                    break;
                case 1294443915:
                case 1637266510:
                    file = new File(intent.getData().getPath());
                    String str5 = C14396.f47198;
                    if (C3743.f13569) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ۛ") ^ i17;
                        i = ((iM11306 ^ i16) * (-27741)) ^ (-368285308);
                        i2 = 1448265660;
                    } else {
                        iM11306 = C19806.m45029("ۧۙ") ^ i17;
                        i = ((iM11306 ^ i16) * (-27589)) ^ 616599208;
                        i2 = -1204414580;
                    }
                    i19 = iM11306 ^ i2;
                    i18 = i;
                    break;
                case 1799661414:
                case 1834731433:
                    break;
                case 1964399272:
                case 2146056548:
                    C3743.m10966();
                    if (C2788.f10625 < 0) {
                        iM11306 = C19806.m45029("ۧۙ") ^ i17;
                        i = ((iM11306 ^ i16) * (-27589)) ^ 616599208;
                        i2 = -1204414580;
                        i19 = iM11306 ^ i2;
                        i18 = i;
                    } else {
                        str2 = str2;
                        int iM113016 = (i17 - ThreadFactoryC3888.m11306("۟ۖ")) * 115;
                        i19 = iM113016 ^ (-514166542);
                        i18 = ((iM113016 ^ i16) * 32277) ^ (-1451539593);
                        str2 = str2;
                    }
                    break;
                default:
                    i21 = 15860;
                    iM11308 = ThreadFactoryC3888.m11306("ۗܺ") ^ i17;
                    i18 = 1189724309 ^ ((iM11308 ^ i16) * 8187);
                    i4 = 2127771003;
                    i5 = iM11308 ^ i4;
                    i23 = i23;
                    i24 = i24;
                    type = type;
                    str2 = str2;
                    sArr2 = sArr2;
                    i20 = i20;
                    i19 = i5;
                    abstractActivityC12483 = this;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30987(Intent intent, boolean z) {
        int iM11306;
        int i;
        C4014 c4014 = null;
        C9186 c9186 = null;
        int i2 = 905136554;
        int i3 = C1461.f5957;
        int i4 = RunnableC1606.f6488;
        int iM11307 = ThreadFactoryC3888.m11306("֨ܽ") ^ i4;
        int i5 = ((iM11307 ^ i3) * (-26893)) ^ (-328734486);
        int i6 = 727819262;
        while (true) {
            int i7 = iM11307 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i3) * (-18331)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1825483558:
                    case 856236794:
                        if (!C0817.f3443) {
                            iM11307 = C19806.m45029("۟ۖ") ^ i3;
                            i5 = ((iM11307 ^ i4) * 3415) ^ (-1333698049);
                            i6 = -1343278918;
                        } else {
                            iM11307 = C19806.m45029("ܿܰ") ^ i4;
                            i5 = ((iM11307 ^ i3) * 25381) ^ (-9963480);
                            i6 = -1769993365;
                        }
                        break;
                    case -1816107958:
                    case 1663988135:
                        if (C1189.f5284 > 0) {
                            iM11307 = ThreadFactoryC3888.m11306("ۘܺ") ^ i4;
                            i5 = ((iM11307 ^ i3) * 20139) ^ (-214282776);
                            i6 = -1632668522;
                        } else {
                            iM11307 = C19806.m45029("ᩴ֨") ^ i3;
                            i5 = ((iM11307 ^ i4) * (-23001)) ^ (-1031443056);
                            i6 = 2060758440;
                        }
                        break;
                    case -1748135002:
                    case 582134207:
                        C3577.m10565();
                        break;
                    case -1548901853:
                    case 1258763034:
                        if (!C19806.f63586) {
                            iM11307 = (i4 - ThreadFactoryC3888.m11306("֡ۧ")) * (-27);
                            i5 = ((iM11307 ^ i3) * (-10045)) ^ 2097154589;
                            i6 = -1445272209;
                        } else {
                            iM11307 = C19806.m45029("ᩴ֨") ^ i3;
                            i5 = ((iM11307 ^ i4) * (-23001)) ^ (-1031443056);
                            i6 = 2060758440;
                        }
                        break;
                    case -1413761101:
                    case -994655309:
                        if (C1066.m4023() > 0) {
                            iM11307 = C19806.m45029("᩻ۧ") ^ i3;
                            i5 = ((iM11307 ^ i4) * 13257) ^ 1335608726;
                            i6 = 325137781;
                        } else {
                            iM11307 = ThreadFactoryC3888.m11306("ۖۙ") ^ i4;
                            i5 = ((iM11307 ^ i3) * (-14165)) ^ (-1159404647);
                            i6 = 1425071622;
                        }
                        break;
                    case -1192901524:
                    case -1155018211:
                        RunnableC0195.m1431();
                        if (C1189.f5284 > 0) {
                            iM11307 = (ThreadFactoryC3888.m11306("ᩳ᩵") + i3) * (-91);
                            i5 = ((iM11307 ^ i4) * (-28047)) ^ (-1230700537);
                            i6 = -1533939753;
                        } else {
                            iM11307 = C19806.m45029("ᩴ֨") ^ i3;
                            i5 = ((iM11307 ^ i4) * (-23001)) ^ (-1031443056);
                            i6 = 2060758440;
                        }
                        break;
                    case -892770144:
                    case 1114112704:
                        boolean zM33728 = C13890.m33728();
                        C9186 c9187 = f41625;
                        if (zM33728) {
                            iM11306 = (i4 - ThreadFactoryC3888.m11306("ۢۖ")) * (-55);
                            i5 = ((iM11306 ^ i3) * 20207) ^ 1095144716;
                            i = -1717274166;
                        } else {
                            iM11306 = (i3 - ThreadFactoryC3888.m11306("ۚܶ")) * 99;
                            i5 = ((iM11306 ^ i4) * (-3817)) ^ 1813058269;
                            i = -1221083;
                        }
                        i7 = iM11306 ^ i;
                        c9186 = c9187;
                        break;
                    case -784550256:
                    case 1154129030:
                        c9186.mo23641(c4014);
                        break;
                    case -621661000:
                    case 910677486:
                        if (C2124.f7782 > 0) {
                            iM11307 = (i4 - C19806.m45029("֨᩶")) * (-117);
                            i5 = ((iM11307 ^ i3) * (-13867)) ^ (-848873236);
                            i6 = 1658482419;
                        } else {
                            iM11307 = C19806.m45029("ᩴ֨") ^ i3;
                            i5 = ((iM11307 ^ i4) * (-23001)) ^ (-1031443056);
                            i6 = 2060758440;
                        }
                        break;
                    case -613899654:
                    case 1007599765:
                        if (C0216.f1393 == 0) {
                            iM11307 = C19806.m45029("ܺۧ") ^ i3;
                            i5 = ((iM11307 ^ i4) * (-21569)) ^ 1332552394;
                            i6 = -883650668;
                        } else {
                            iM11307 = C19806.m45029("۟ۖ") ^ i3;
                            i5 = ((iM11307 ^ i4) * 3415) ^ (-1333698049);
                            i6 = -1343278918;
                        }
                        break;
                    case -532404261:
                    case -426919213:
                        if (!C19806.f63586) {
                            iM11307 = (i4 - C19806.m45029("۠᩶")) * (-91);
                            i5 = ((iM11307 ^ i3) * (-16041)) ^ (-1220960482);
                            i6 = -1947422217;
                        } else {
                            iM11307 = C19806.m45029("۟ۖ") ^ i3;
                            i5 = ((iM11307 ^ i4) * 3415) ^ (-1333698049);
                            i6 = -1343278918;
                        }
                        break;
                    case -512467186:
                    case 392117547:
                        c9186.mo23642(c4014);
                        break;
                    case -510570280:
                    case 2035759714:
                        c4014 = new C4014(intent);
                        if (!z) {
                            iM11307 = (i4 - C19806.m45029("ۖۤ")) * (-75);
                            i5 = ((iM11307 ^ i3) * 1739) ^ 2134583147;
                            i6 = -1791273656;
                        } else {
                            iM11307 = (i3 - ThreadFactoryC3888.m11306("ۛ᩻")) * (-37);
                            i5 = ((iM11307 ^ i4) * (-11717)) ^ 663809683;
                            i6 = -213267759;
                        }
                        break;
                    case -141895986:
                    case 1024258373:
                        RunnableC1606.m5473();
                        if (!C0962.f3784) {
                            iM11307 = (i4 - C19806.m45029("֨᩶")) * (-117);
                            i5 = ((iM11307 ^ i3) * (-13867)) ^ (-848873236);
                            i6 = 1658482419;
                            break;
                        }
                        iM11307 = ThreadFactoryC3888.m11306("ۖۙ") ^ i4;
                        i5 = ((iM11307 ^ i3) * (-14165)) ^ (-1159404647);
                        i6 = 1425071622;
                        break;
                    case 7169181:
                    case 199311072:
                        C2642.m8171();
                        C1937.m6279();
                        iM11307 = C19806.m45029("ᩴ֨") ^ i3;
                        i5 = ((iM11307 ^ i4) * (-23001)) ^ (-1031443056);
                        i6 = 2060758440;
                        break;
                    case 158586218:
                    case 692026458:
                        c4014.m11521();
                        iM11307 = (i3 - ThreadFactoryC3888.m11306("ۛ᩻")) * (-37);
                        i5 = ((iM11307 ^ i4) * (-11717)) ^ 663809683;
                        i6 = -213267759;
                        break;
                    case 496344469:
                    case 701070659:
                        if (RunnableC1606.f6488 < 0) {
                            iM11307 = C19806.m45029("ᩴᩳ") ^ i3;
                            i5 = ((iM11307 ^ i4) * 23543) ^ (-1830766799);
                            i6 = -878307434;
                        } else {
                            iM11307 = (ThreadFactoryC3888.m11306("ᩳ᩵") + i3) * (-91);
                            i5 = ((iM11307 ^ i4) * (-28047)) ^ (-1230700537);
                            i6 = -1533939753;
                        }
                        break;
                    case 897022589:
                    case 1079997836:
                        if (C1025.f4800 < 0) {
                            iM11307 = (ThreadFactoryC3888.m11306("᩸ۧ") + i3) * 91;
                            i5 = ((iM11307 ^ i4) * 19921) ^ 1985000177;
                            i6 = -1236554980;
                        } else {
                            iM11307 = C19806.m45029("ᩴ֨") ^ i3;
                            i5 = ((iM11307 ^ i4) * (-23001)) ^ (-1031443056);
                            i6 = 2060758440;
                        }
                        break;
                    case 1903720748:
                    case 2096073335:
                        if (C1937.f7317 < 0) {
                            iM11307 = C19806.m45029("᩶ܶ") ^ i3;
                            i5 = ((iM11307 ^ i4) * 22989) ^ 1991985832;
                            i6 = -552633896;
                        } else {
                            iM11307 = C19806.m45029("ᩴ֨") ^ i3;
                            i5 = ((iM11307 ^ i4) * (-23001)) ^ (-1031443056);
                            i6 = 2060758440;
                        }
                        break;
                    default:
                        if (C1148.f5161 > 0) {
                            iM11307 = (i4 - ThreadFactoryC3888.m11306("۬ۜ")) * (-11);
                            i5 = ((iM11307 ^ i3) * (-22893)) ^ (-1548897095);
                            i6 = 1464791643;
                        } else {
                            iM11307 = (ThreadFactoryC3888.m11306("ᩳ᩵") + i3) * (-91);
                            i5 = ((iM11307 ^ i4) * (-28047)) ^ (-1230700537);
                            i6 = -1533939753;
                        }
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31004(C6938 c6938) {
        AbstractC17129 abstractC17129M25488 = null;
        int contentInsetStartWithNavigation = 0;
        int i = 0;
        int i2 = 443051062;
        int i3 = C3535.f13026;
        int i4 = C1189.f5284;
        int iM11306 = ThreadFactoryC3888.m11306("ۜ᩶") ^ i3;
        int i5 = ((iM11306 ^ i4) * 9777) ^ 1875634290;
        int i6 = 1602882451;
        while (true) {
            i2 = ((((i2 ^ i4) * 17789) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2047870345:
                case 2124678930:
                    if (C1937.f7317 >= 0) {
                        iM11306 = (i3 - C19806.m45029("֨ۧ")) * 31;
                        i5 = ((iM11306 ^ i4) * (-16583)) ^ (-2074237895);
                        i6 = -819615838;
                    } else {
                        iM11306 = (C19806.m45029("᩵ۜ") ^ i3) * (-69);
                        i5 = ((iM11306 ^ i4) * 6075) ^ 973322294;
                        i6 = 280876792;
                    }
                    break;
                case -1936947836:
                case -1726633863:
                    c6938.setContentInsetStartWithNavigation(contentInsetStartWithNavigation / i);
                    break;
                case -1844149632:
                case -1731219623:
                    if (C2477.f9839 <= 0) {
                        iM11306 = C19806.m45029("ۤ۟") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-26517)) ^ (-1916854237);
                        i6 = -2005506544;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ۬") ^ i4;
                        i5 = ((iM11306 ^ i3) * 21579) ^ (-1921907019);
                        i6 = -1240029863;
                    }
                    break;
                case -1824960011:
                case 1384637016:
                    C0629.m2907();
                    C2249.m6915();
                    iM11306 = (i3 - C19806.m45029("֨ۧ")) * 31;
                    i5 = ((iM11306 ^ i4) * (-16583)) ^ (-2074237895);
                    i6 = -819615838;
                    break;
                case -1782579068:
                case -1568787112:
                    abstractC17129M25488.mo23551(c6938);
                    if (C0278.f1572 <= 0) {
                        iM11306 = C19806.m45029("᩹ۢ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 32365) ^ (-701308990);
                        i6 = -839416554;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۘ᩹")) * 7;
                        i5 = ((iM11306 ^ i4) * (-27999)) ^ (-1427934890);
                        i6 = -1703657977;
                    }
                    break;
                case -1706250665:
                case -1168703640:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧܶ") ^ i4) * (-27);
                        i5 = ((iM11306 ^ i3) * 23475) ^ (-1299920090);
                        i6 = -1146466781;
                    } else {
                        iM11306 = (C19806.m45029("ۢ֡") + i4) * (-7);
                        i5 = ((iM11306 ^ i3) * 21473) ^ 4717771;
                        i6 = 789850533;
                    }
                    break;
                case -1109988848:
                case 7002262:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = C19806.m45029("᩹ۢ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 32365) ^ (-701308990);
                        i6 = -839416554;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬۬") ^ i4;
                        i5 = ((iM11306 ^ i3) * 20913) ^ (-652118762);
                        i6 = -808788410;
                    }
                    break;
                case -1081296393:
                case -206914129:
                    if (C10634.f36300 >= 0) {
                        iM11306 = C19806.m45029("ۤ۟") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-26517)) ^ (-1916854237);
                        i6 = -2005506544;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫ܺ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 5289) ^ (-989052276);
                        i6 = -1277574980;
                    }
                    break;
                case -1054948843:
                case 1108112145:
                    if (C0526.f2219) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ۬") ^ i4;
                        i5 = ((iM11306 ^ i3) * 21579) ^ (-1921907019);
                        i6 = -1240029863;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ᩸") ^ i4;
                        i5 = ((iM11306 ^ i3) * 8117) ^ 2003999147;
                        i6 = 121769138;
                    }
                    break;
                case -967771791:
                case -965557287:
                    if (!C1668.m5583()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧܶ") ^ i4) * (-27);
                        i5 = ((iM11306 ^ i3) * 23475) ^ (-1299920090);
                        i6 = -1146466781;
                    } else {
                        iM11306 = (i3 - C19806.m45029("֨ۧ")) * 31;
                        i5 = ((iM11306 ^ i4) * (-16583)) ^ (-2074237895);
                        i6 = -819615838;
                    }
                    break;
                case -678001036:
                case 268214224:
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ۬") ^ i4;
                        i5 = ((iM11306 ^ i3) * 21579) ^ (-1921907019);
                        i6 = -1240029863;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧܶ") ^ i4) * (-27);
                        i5 = ((iM11306 ^ i3) * 23475) ^ (-1299920090);
                        i6 = -1146466781;
                    }
                    break;
                case -641086922:
                case 1996770433:
                    if (C2332.f8260) {
                        iM11306 = (C19806.m45029("ܽ֡") ^ i3) * 85;
                        i5 = ((iM11306 ^ i4) * (-4131)) ^ (-1744377461);
                        i6 = 1346867328;
                    } else {
                        iM11306 = C19806.m45029("᩹ۢ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 32365) ^ (-701308990);
                        i6 = -839416554;
                    }
                    break;
                case -490482432:
                case 91168885:
                    contentInsetStartWithNavigation = c6938.getContentInsetStartWithNavigation();
                    i = 3;
                    if (C10634.m26820()) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ۬") ^ i4;
                        i5 = ((iM11306 ^ i3) * 21579) ^ (-1921907019);
                        i6 = -1240029863;
                    } else {
                        iM11306 = (i4 - C19806.m45029("֡ۖ")) * (-67);
                        i5 = ((iM11306 ^ i3) * 22075) ^ 1767158652;
                        i6 = 287326184;
                    }
                    break;
                case -331789748:
                case 1504725929:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i3 - C19806.m45029("֨ۧ")) * 31;
                        i5 = ((iM11306 ^ i4) * (-16583)) ^ (-2074237895);
                        i6 = -819615838;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹᩺") + i3) * 19;
                        i5 = ((iM11306 ^ i4) * 24613) ^ 854351082;
                        i6 = -1481266520;
                    }
                    break;
                case 930267248:
                case 1566880357:
                    abstractC17129M25488 = m25488();
                    if (C3535.m10431() <= 0) {
                        iM11306 = C19806.m45029("᩹ۢ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 32365) ^ (-701308990);
                        i6 = -839416554;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩸۫")) * (-69);
                        i5 = ((iM11306 ^ i3) * 15183) ^ (-1423459481);
                        i6 = 531686290;
                    }
                    break;
                default:
                    C3743.m10966();
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C5965 m31021() {
        C5965 c5965;
        C5965 c5966 = null;
        int i = -779359283;
        int i2 = C3722.f13525;
        int i3 = C3577.f13150;
        int iM45029 = C19806.m45029("ۙܿ") ^ i2;
        int i4 = ((iM45029 ^ i3) * (-28103)) ^ (-654093889);
        int i5 = 308031494;
        while (true) {
            i = ((((i ^ i3) * 21879) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1943856830:
                case -1119695182:
                    return c5966;
                case -1810447694:
                case 925031514:
                    c5965 = this.f41628;
                    if (c5965 == null) {
                        iM45029 = C19806.m45029("ۨܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 8061) ^ 1815280703;
                        i5 = -1020701956;
                    } else {
                        c5966 = c5965;
                        iM45029 = ThreadFactoryC3888.m11306("֨ۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-30365)) ^ (-1544704311);
                        i5 = 384757035;
                    }
                    break;
                case -769565931:
                case 919007486:
                    if (C0216.f1393 == 0) {
                        iM45029 = (i3 - C19806.m45029("ܳ۬")) * 127;
                        i4 = ((iM45029 ^ i2) * 20511) ^ (-1613070935);
                        i5 = -1740156468;
                    } else {
                        iM45029 = (C19806.m45029("ܿ֨") + i2) * (-123);
                        i4 = ((iM45029 ^ i3) * (-22687)) ^ (-1692032485);
                        i5 = -636576378;
                    }
                    break;
                case -699854296:
                case -430458767:
                    Window windowM6910 = C2249.m6910(this);
                    if (!C0797.f3386) {
                        if (C1460.f5948 < 0) {
                            if (C3535.m10431() <= 0) {
                                iM45029 = C19806.m45029("᩵᩹") ^ i3;
                                i4 = ((iM45029 ^ i2) * (-5499)) ^ (-1621266185);
                                i5 = 1207504057;
                            } else if (C2249.f8050 < 0) {
                                if (!RunnableC1895.f7152 || C1148.f5161 <= 0) {
                                    iM45029 = ThreadFactoryC3888.m11306("ܿ۠") ^ i2;
                                    i4 = ((iM45029 ^ i3) * 24897) ^ (-334187604);
                                    i5 = 1173566627;
                                } else if (C0526.m2437() < 0) {
                                    if (C1377.f5749) {
                                        if (C1668.f6641 < 0) {
                                            Window windowM10777 = C3660.m10777(this);
                                            if (C1977.f7413 > 0) {
                                                c5965 = new C5965(windowM6910, windowM10777.getDecorView());
                                                this.f41628 = c5965;
                                                c5966 = c5965;
                                                iM45029 = ThreadFactoryC3888.m11306("֨ۢ") ^ i3;
                                                i4 = ((iM45029 ^ i2) * (-30365)) ^ (-1544704311);
                                                i5 = 384757035;
                                            }
                                        }
                                    }
                                    iM45029 = C19806.m45029("ܽ᩺") ^ i3;
                                    i4 = ((iM45029 ^ i2) * (-16683)) ^ (-778751217);
                                    i5 = -1408546704;
                                }
                            }
                            break;
                        }
                        iM45029 = (C19806.m45029("ܿ֨") + i2) * (-123);
                        i4 = ((iM45029 ^ i3) * (-22687)) ^ (-1692032485);
                        i5 = -636576378;
                        break;
                    }
                    iM45029 = (i3 - C19806.m45029("ܳ۬")) * 127;
                    i4 = ((iM45029 ^ i2) * 20511) ^ (-1613070935);
                    i5 = -1740156468;
                    break;
                case -583598002:
                case 856854744:
                    C2124.m6673();
                    iM45029 = (C19806.m45029("ܿ֨") + i2) * (-123);
                    i4 = ((iM45029 ^ i3) * (-22687)) ^ (-1692032485);
                    i5 = -636576378;
                    break;
                case 535511239:
                case 1395036426:
                    if (C0216.m1591() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * 24897) ^ (-334187604);
                        i5 = 1173566627;
                    } else {
                        iM45029 = C19806.m45029("᩵᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-5499)) ^ (-1621266185);
                        i5 = 1207504057;
                    }
                    break;
                case 980699996:
                case 1619911928:
                    C1066.m4023();
                    if (C3660.f13403 < 0) {
                        iM45029 = C19806.m45029("᩵᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-5499)) ^ (-1621266185);
                        i5 = 1207504057;
                    } else {
                        iM45029 = (C19806.m45029("ܿ֨") + i2) * (-123);
                        i4 = ((iM45029 ^ i3) * (-22687)) ^ (-1692032485);
                        i5 = -636576378;
                    }
                    break;
                default:
                    C2332.m7079();
                    return null;
            }
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m30993() {
        WeakReference weakReference = null;
        View view = null;
        C6111 c6111M9095 = null;
        int i = -1541257538;
        int i2 = C1460.f5948;
        int i3 = RunnableC3388.f12514;
        int iM11306 = (ThreadFactoryC3888.m11306("᩶᩺") + i2) * (-127);
        int i4 = ((iM11306 ^ i3) * 6605) ^ 1524451412;
        int i5 = 983407741;
        while (true) {
            i = ((((i ^ i3) * 10101) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1991152758:
                case -367547365:
                    return null;
                case -1960715189:
                case -1957666855:
                    return c6111M9095.m17016();
                case -1948533998:
                case -525220840:
                    if (C2704.f10408) {
                        iM11306 = (C19806.m45029("᩵ۧ") ^ i3) * (-29);
                        i4 = ((iM11306 ^ i2) * (-20831)) ^ 1861330379;
                        i5 = 1005161722;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-5271)) ^ 2109285380;
                        i5 = -1291084834;
                    }
                    break;
                case -1936602222:
                case -307098873:
                    weakReference = f41624;
                    if (weakReference != null) {
                        iM11306 = (i2 - C19806.m45029("᩶᩷")) * (-83);
                        i4 = ((iM11306 ^ i3) * (-12581)) ^ (-1575325458);
                        i5 = 1180335015;
                    } else {
                        iM11306 = C19806.m45029("ܳۢ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 17179) ^ (-1411498189);
                        i5 = 1947712427;
                    }
                    break;
                case -1845870376:
                case 1638575295:
                    if (C1460.m5050() != 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۫᩶")) * 123;
                        i4 = ((iM11306 ^ i2) * (-7523)) ^ (-1798926698);
                        i5 = 2089987713;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖ᩷") + i3) * 77;
                        i4 = ((iM11306 ^ i2) * (-30301)) ^ 1919549650;
                        i5 = 1345431692;
                    }
                    break;
                case -1768764579:
                case -135302967:
                    C19806.m45024();
                    return null;
                case -1595811332:
                case -694042324:
                    if (C3535.f13026 <= 0) {
                        iM11306 = C19806.m45029("ᩳ۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-23983)) ^ (-142318610);
                        i5 = 1306048993;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ܿ") + i2) * 97;
                        i4 = ((iM11306 ^ i3) * 11649) ^ 318561010;
                        i5 = -421272428;
                    }
                    break;
                case -1207795977:
                case 1564512519:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (C2477.f9839 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-5271)) ^ 2109285380;
                        i5 = -1291084834;
                    } else {
                        iM11306 = (C19806.m45029("ܰܶ") ^ i2) * (-3);
                        i4 = ((iM11306 ^ i3) * (-13333)) ^ 1159280947;
                        i5 = 508938670;
                    }
                    break;
                case -896597633:
                case 1121921488:
                    if (C0526.f2219) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-5271)) ^ 2109285380;
                        i5 = -1291084834;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ۖ") ^ i3) * (-111);
                        i4 = ((iM11306 ^ i2) * (-32305)) ^ 891350766;
                        i5 = -1342694176;
                    }
                    break;
                case -894322859:
                case -434246017:
                    c6111M9095 = ((C3040) view).m9095();
                    if (CallableC1627.f6528) {
                        iM11306 = C19806.m45029("ᩳᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30803) ^ (-483830015);
                        i5 = 1875800260;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-5271)) ^ 2109285380;
                        i5 = -1291084834;
                    }
                    break;
                case -744277521:
                case 1116404118:
                    if (C10634.f36300 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-5271)) ^ 2109285380;
                        i5 = -1291084834;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛ۠") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-26161)) ^ (-1427991707);
                        i5 = -846825269;
                    }
                    break;
                case -740593017:
                case -376267079:
                    if (C0526.m2437() < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۢ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-18619)) ^ (-1754987208);
                        i5 = -1019167591;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-5271)) ^ 2109285380;
                        i5 = -1291084834;
                    }
                    break;
                case -284376856:
                case 1307123038:
                    C1025.m3861();
                    ThreadFactoryC3888.m11300();
                    iM11306 = (i3 - ThreadFactoryC3888.m11306("۫᩶")) * 123;
                    i4 = ((iM11306 ^ i2) * (-7523)) ^ (-1798926698);
                    i5 = 2089987713;
                    break;
                case -256696538:
                case 1341593004:
                    return ((C6111) view).m16914();
                case -165356957:
                case 981491317:
                    if (AbstractC0464.m2313() != 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۫᩶")) * 123;
                        i4 = ((iM11306 ^ i2) * (-7523)) ^ (-1798926698);
                        i5 = 2089987713;
                    } else {
                        iM11306 = C19806.m45029("᩷ܿ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-30665)) ^ 1706902528;
                        i5 = -89470679;
                    }
                    break;
                case -140588540:
                case 981489630:
                    if (view instanceof C3040) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * 3143) ^ (-953837478);
                        i5 = 1420929523;
                    } else {
                        iM11306 = C19806.m45029("ܳۢ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 17179) ^ (-1411498189);
                        i5 = 1947712427;
                    }
                    break;
                case 67836791:
                case 565297244:
                    if (view instanceof C6111) {
                        iM11306 = (C19806.m45029("᩻᩶") + i2) * (-9);
                        i4 = ((iM11306 ^ i3) * 1111) ^ 126072034;
                        i5 = 195337537;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ᩴ") + i2) * (-69);
                        i4 = ((iM11306 ^ i3) * (-21419)) ^ (-245285601);
                        i5 = 1915988234;
                    }
                    break;
                case 327786477:
                case 1461582122:
                    if (!C7105.m18985()) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۫᩶")) * 123;
                        i4 = ((iM11306 ^ i2) * (-7523)) ^ (-1798926698);
                        i5 = 2089987713;
                    } else {
                        iM11306 = (C19806.m45029("ܰܶ") ^ i2) * (-3);
                        i4 = ((iM11306 ^ i3) * (-13333)) ^ 1159280947;
                        i5 = 508938670;
                    }
                    break;
                case 347197737:
                case 697312792:
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۢ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-18619)) ^ (-1754987208);
                        i5 = -1019167591;
                    } else {
                        iM11306 = (C19806.m45029("ۙ֡") ^ i3) * (-97);
                        i4 = ((iM11306 ^ i2) * 29787) ^ 1802899955;
                        i5 = 460384636;
                    }
                    break;
                case 757847426:
                case 1268733238:
                    view = (View) weakReference.get();
                    if (view != null) {
                        iM11306 = C19806.m45029("᩵۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 26883) ^ 235503478;
                        i5 = -1710698018;
                    } else {
                        iM11306 = C19806.m45029("ܳۢ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 17179) ^ (-1411498189);
                        i5 = 1947712427;
                    }
                    break;
                case 1012196521:
                case 1688798014:
                    if (C1377.f5749) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("۬᩻")) * (-75);
                        i4 = ((iM11306 ^ i3) * 20323) ^ (-147033885);
                        i5 = -1135135797;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۫᩶")) * 123;
                        i4 = ((iM11306 ^ i2) * (-7523)) ^ (-1798926698);
                        i5 = 2089987713;
                    }
                    break;
                default:
                    if (RunnableC1564.f6300) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-5271)) ^ 2109285380;
                        i5 = -1291084834;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ܰ") + i2) * (-127);
                        i4 = ((iM11306 ^ i3) * 8603) ^ 1391310695;
                        i5 = -1699133513;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01f9 A[PHI: r2 r4 r5 r6 r17
      0x01f9: PHI (r2v2 android.content.Intent) = (r2v1 android.content.Intent), (r2v1 android.content.Intent), (r2v6 android.content.Intent) binds: [B:62:0x01f7, B:58:0x01d7, B:40:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x01f9: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:62:0x01f7, B:58:0x01d7, B:40:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x01f9: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short) binds: [B:62:0x01f7, B:58:0x01d7, B:40:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x01f9: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:62:0x01f7, B:58:0x01d7, B:40:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x01f9: PHI (r17v12 'th' java.lang.Object) = (r17v4 'th' java.lang.Object), (r17v5 'th' java.lang.Object), (r17v14 'th' java.lang.Object) binds: [B:62:0x01f7, B:58:0x01d7, B:40:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x022f A[PHI: r3 r9 r17
      0x022f: PHI (r3v4 short[]) = (r3v3 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:66:0x022d, B:50:0x017b, B:13:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:66:0x022d, B:50:0x017b, B:13:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r17v17 'th' java.lang.Object) = (r17v3 'th' java.lang.Object), (r17v7 'th' java.lang.Object), (r17v18 'th' java.lang.Object) binds: [B:66:0x022d, B:50:0x017b, B:13:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (l.C2642.f10294 <= 0) goto L13;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m31020(java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC12483.m31020(java.lang.String):void");
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo135() {
        C9927.m25128();
        C17605.m40925();
        recreate();
    }

    @Override // l.InterfaceC17421
    public final C8067 buildDialog() {
        int i = DialogInterfaceC19356.f62401;
        return new C8067(this);
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C19644 m31012() {
        if (this.f41630 == null) {
            synchronized (this) {
                if (this.f41630 == null) {
                    this.f41630 = new C19644(this);
                }
            }
        }
        return this.f41630;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0146  */
    /* JADX WARN: Code duplicated, block: B:49:0x019c  */
    /* JADX WARN: Code duplicated, block: B:80:0x02e5 A[PHI: r2
      0x02e5: PHI (r2v5 java.lang.String) = (r2v2 java.lang.String), (r2v4 java.lang.String), (r2v2 java.lang.String), (r2v2 java.lang.String) binds: [B:78:0x02cd, B:73:0x02ae, B:27:0x00a4, B:128:0x02e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0351 A[PHI: r11 r12
      0x0351: PHI (r11v7 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:89:0x034f, B:61:0x0223, B:54:0x01d6, B:126:0x0351, B:125:0x0351] A[DONT_GENERATE, DONT_INLINE]
      0x0351: PHI (r12v7 short) = (r12v3 short), (r12v2 short), (r12v2 short), (r12v2 short), (r12v2 short) binds: [B:89:0x034f, B:61:0x0223, B:54:0x01d6, B:126:0x0351, B:125:0x0351] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x0385 A[PHI: r14 r20
      0x0385: PHI (r14v3 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v4 short[]) binds: [B:93:0x0383, B:14:0x006a, B:129:0x0385] A[DONT_GENERATE, DONT_INLINE]
      0x0385: PHI (r20v3 int) = (r20v2 int), (r20v1 int), (r20v1 int) binds: [B:93:0x0383, B:14:0x006a, B:129:0x0385] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x03b9 A[PHI: r3 r5 r9
      0x03b9: PHI (r3v5 android.net.Uri) = (r3v2 android.net.Uri), (r3v3 android.net.Uri), (r3v2 android.net.Uri), (r3v2 android.net.Uri), (r3v2 android.net.Uri) binds: [B:97:0x03b7, B:65:0x0250, B:23:0x0093, B:14:0x006a, B:127:0x03b9] A[DONT_GENERATE, DONT_INLINE]
      0x03b9: PHI (r5v5 l.ۛۧ᩺) = (r5v2 l.ۛۧ᩺), (r5v3 l.ۛۧ᩺), (r5v2 l.ۛۧ᩺), (r5v2 l.ۛۧ᩺), (r5v2 l.ۛۧ᩺) binds: [B:97:0x03b7, B:65:0x0250, B:23:0x0093, B:14:0x006a, B:127:0x03b9] A[DONT_GENERATE, DONT_INLINE]
      0x03b9: PHI (r9v5 short) = (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:97:0x03b7, B:65:0x0250, B:23:0x0093, B:14:0x006a, B:127:0x03b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m31011() {
        int iM11306;
        int i;
        int i2;
        int iM11307;
        int i3;
        int i4;
        AbstractActivityC12483 abstractActivityC12483 = this;
        int i5 = C1066.f4915;
        int i6 = C1937.f7317;
        int iM11308 = ThreadFactoryC3888.m11306("ۤۛ") ^ i6;
        int i7 = ((iM11308 ^ i5) * 23507) ^ (-1576350927);
        ActivityNotFoundException activityNotFoundException = null;
        short[] sArr = null;
        int i8 = iM11308 ^ (-607609887);
        Intent intent = null;
        short s = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = -1909124088;
        int i12 = 0;
        ComponentName componentName = null;
        ComponentName componentNameM48441 = null;
        InterfaceC6025 interfaceC6025 = null;
        Uri uri = null;
        String strM6288 = null;
        while (true) {
            i11 = i8 ^ (i7 & (((i11 ^ i5) * (-31741)) >> 31));
            switch (i11) {
                case -1962566130:
                case 1063797104:
                    intent.setComponent(componentName);
                    iM11306 = (ThreadFactoryC3888.m11306("ۢۛ") ^ i5) * 33;
                    i = ((iM11306 ^ i6) * 8177) ^ (-865142091);
                    i2 = -1333279793;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1959096706:
                case 1616439918:
                    componentNameM48441 = C21696.m48441(getPackageManager());
                    componentName = null;
                    if (componentNameM48441 != null) {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ᩴ۟")) * 109;
                        i = ((iM11306 ^ i6) * (-31847)) ^ 990202660;
                        i2 = -2022867752;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢۛ") ^ i5) * 33;
                        i = ((iM11306 ^ i6) * 8177) ^ (-865142091);
                        i2 = -1333279793;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1943402937:
                case -1417369734:
                    i9 = i12 + 1;
                    s2 = 1;
                    if (C3535.f13026 <= 0) {
                        int iM45029 = C19806.m45029("᩷ۨ") ^ i6;
                        i3 = ((iM45029 ^ i5) * (-2649)) ^ (-31313456);
                        i8 = iM45029 ^ (-1484062113);
                        intent = null;
                    } else {
                        iM11307 = (C19806.m45029("֨᩻") + i6) * (-81);
                        i3 = ((iM11307 ^ i5) * 25401) ^ 906019699;
                        i4 = -1346937902;
                        i8 = iM11307 ^ i4;
                    }
                    i7 = i3;
                    abstractActivityC12483 = this;
                    break;
                case -1913398806:
                case 610317709:
                    if (C1419.f5860 < 0) {
                        iM11306 = C19806.m45029("ܿܺ") ^ i5;
                        i = ((iM11306 ^ i6) * 22605) ^ 1448265239;
                        i2 = -1544134174;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                    } else {
                        int iM450210 = C19806.m45029("᩷ۨ") ^ i6;
                        i3 = ((iM450210 ^ i5) * (-2649)) ^ (-31313456);
                        i8 = iM450210 ^ (-1484062113);
                        intent = null;
                        i7 = i3;
                        abstractActivityC12483 = this;
                    }
                    break;
                case -1868062697:
                case -1739409776:
                    C3660.m10783(C2704.m8257(interfaceC6025).remove(strM6288));
                    if (RunnableC1564.f6300) {
                        int iM450211 = C19806.m45029("᩷ۨ") ^ i6;
                        i3 = ((iM450211 ^ i5) * (-2649)) ^ (-31313456);
                        i8 = iM450211 ^ (-1484062113);
                        intent = null;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ۚۗ") + i6) * (-15);
                        i3 = ((iM11307 ^ i5) * (-7013)) ^ 2110746066;
                        i4 = -1153350105;
                        i8 = iM11307 ^ i4;
                    }
                    i7 = i3;
                    abstractActivityC12483 = this;
                    break;
                case -1800863699:
                case 764865651:
                    short[] sArr2 = f41626;
                    if (C10634.f36300 >= 0) {
                        int iM450212 = C19806.m45029("᩷ۨ") ^ i6;
                        i3 = ((iM450212 ^ i5) * (-2649)) ^ (-31313456);
                        i8 = iM450212 ^ (-1484062113);
                        intent = null;
                    } else {
                        intent = new Intent(C0671.m3009(sArr2, 349, 26, i10));
                        if (C2124.m6673() <= 0) {
                            iM11307 = (ThreadFactoryC3888.m11306("᩻ۛ") + i5) * 23;
                            i3 = ((iM11307 ^ i6) * (-18095)) ^ 973446103;
                            i4 = -278265540;
                        } else {
                            iM11307 = (i5 - ThreadFactoryC3888.m11306("۫۠")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i3 = ((iM11307 ^ i6) * 11391) ^ (-1368815609);
                            i4 = -371537502;
                        }
                        i8 = iM11307 ^ i4;
                    }
                    i7 = i3;
                    abstractActivityC12483 = this;
                    break;
                case -1757212977:
                case 1096927432:
                    C1977.m6359(intent, 268435456);
                    C1977.m6359(intent, 1);
                    if (C0526.f2219) {
                        iM11306 = (C19806.m45029("֫֨") + i6) * (-101);
                        i = ((iM11306 ^ i5) * (-24059)) ^ 1388199879;
                        i2 = 1940768676;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗۜ") + i6) * (-27);
                        i = ((iM11306 ^ i5) * 31283) ^ (-977249187);
                        i2 = -1115101276;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1756046966:
                case -50934076:
                    break;
                case -1723029657:
                case 13124646:
                    C0817.m3399();
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    break;
                case -1635753730:
                case 1782792447:
                    C2871.m8643(intent, 2);
                    sArr = f41626;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۚ") ^ i6;
                        i = ((iM11306 ^ i5) * 19841) ^ (-1524228623);
                        i2 = -699526958;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                    } else {
                        iM11307 = (C19806.m45029("ۨܺ") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i3 = ((iM11307 ^ i6) * (-28213)) ^ 1536575292;
                        i4 = -965917641;
                        i8 = iM11307 ^ i4;
                        i7 = i3;
                        abstractActivityC12483 = this;
                    }
                    break;
                case -1521960343:
                case 418699392:
                    i10 = 13353;
                    iM11307 = C19806.m45029("ܽ۠") ^ i6;
                    i3 = ((iM11307 ^ i5) * 6281) ^ 1527826529;
                    i4 = -520212031;
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    abstractActivityC12483 = this;
                    break;
                case -1435639210:
                case 812921595:
                    s = f41626[344];
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ܶۙ") ^ i6) * (-49);
                        i3 = ((iM11307 ^ i5) * 7205) ^ (-849324819);
                        i4 = -533750156;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۡ۬") ^ i6;
                        i3 = ((iM11307 ^ i5) * 26433) ^ (-1060202011);
                        i4 = 1404045948;
                    }
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    abstractActivityC12483 = this;
                    break;
                case -1378065416:
                case -492361993:
                    try {
                        C3286.m9800(abstractActivityC12483, intent);
                        iM11307 = ThreadFactoryC3888.m11306("ᩳ᩹") ^ i6;
                        i3 = ((iM11307 ^ i5) * (-11583)) ^ (-1180585820);
                        i4 = -560733451;
                        i8 = iM11307 ^ i4;
                        i7 = i3;
                        abstractActivityC12483 = this;
                    } catch (ActivityNotFoundException e) {
                        int iM11309 = (ThreadFactoryC3888.m11306("ܽ۬") ^ i6) * 33;
                        i = ((iM11309 ^ i5) * (-7197)) ^ (-661811252);
                        i8 = iM11309 ^ 1022631013;
                        activityNotFoundException = e;
                        i7 = i;
                    }
                    break;
                case -1362708217:
                case 822385479:
                    i10 = 4764;
                    iM11307 = C19806.m45029("ܽ۠") ^ i6;
                    i3 = ((iM11307 ^ i5) * 6281) ^ 1527826529;
                    i4 = -520212031;
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    abstractActivityC12483 = this;
                    break;
                case -1207131334:
                case 963811575:
                    i12 = s * 2;
                    if (C2642.f10294 <= 0) {
                        iM11307 = (C19806.m45029("ۨܺ") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i3 = ((iM11307 ^ i6) * (-28213)) ^ 1536575292;
                        i4 = -965917641;
                    } else {
                        iM11307 = (C19806.m45029("ۧ۫") + i5) * 67;
                        i3 = ((iM11307 ^ i6) * (-915)) ^ 137078850;
                        i4 = 201064460;
                    }
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    abstractActivityC12483 = this;
                    break;
                case -968183977:
                case 1725093560:
                    C0671.m3008();
                    if (C0278.m1789() <= 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ܶۙ") ^ i6) * (-49);
                        i3 = ((iM11307 ^ i5) * 7205) ^ (-849324819);
                        i4 = -533750156;
                    } else {
                        iM11307 = (C19806.m45029("ۨܺ") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i3 = ((iM11307 ^ i6) * (-28213)) ^ 1536575292;
                        i4 = -965917641;
                    }
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    abstractActivityC12483 = this;
                    break;
                case -961960174:
                case 944421343:
                    int i13 = s + s2;
                    if (i9 - (i13 * i13) <= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("᩹֡") ^ i5;
                        i3 = ((iM11307 ^ i6) * (-6455)) ^ (-1215983453);
                        i4 = 1421576289;
                    } else {
                        iM11307 = (C19806.m45029("᩹ۘ") + i5) * (-81);
                        i3 = ((iM11307 ^ i6) * 2799) ^ (-317625253);
                        i4 = -695875197;
                    }
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    abstractActivityC12483 = this;
                    break;
                case -925830881:
                case -48815711:
                    try {
                        intent.setComponent(componentNameM48441);
                        C1419.m4977(abstractActivityC12483, intent);
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("۠۟")) * 65;
                        i = ((iM11306 ^ i5) * (-14677)) ^ (-1889410098);
                        i2 = 643250730;
                    } catch (ActivityNotFoundException unused) {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩶") ^ i5;
                        i = ((iM11306 ^ i6) * (-829)) ^ (-1814610398);
                        i2 = -289843177;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -891573744:
                case 1593621264:
                    C1398.m4895();
                    iM11307 = (ThreadFactoryC3888.m11306("ܶۙ") ^ i6) * (-49);
                    i3 = ((iM11307 ^ i5) * 7205) ^ (-849324819);
                    i4 = -533750156;
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    abstractActivityC12483 = this;
                    break;
                case -883419618:
                case -543900618:
                    if (C3743.f13569) {
                        iM11306 = C19806.m45029("ܿܺ") ^ i5;
                        i = ((iM11306 ^ i6) * 22605) ^ 1448265239;
                        i2 = -1544134174;
                    } else {
                        iM11306 = (C19806.m45029("֫֨") + i6) * (-101);
                        i = ((iM11306 ^ i5) * (-24059)) ^ 1388199879;
                        i2 = 1940768676;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -858677811:
                case 1278495843:
                    CallableC1627.m5507();
                    if (!C1419.m4973()) {
                        iM11307 = (ThreadFactoryC3888.m11306("ܶۙ") ^ i6) * (-49);
                        i3 = ((iM11307 ^ i5) * 7205) ^ (-849324819);
                        i4 = -533750156;
                        i8 = iM11307 ^ i4;
                        i7 = i3;
                        abstractActivityC12483 = this;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۘ") ^ i5;
                        i = ((iM11306 ^ i6) * 19513) ^ 895728406;
                        i2 = 994289851;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                    }
                    break;
                case -684342556:
                case 694219639:
                    if (C10634.f36300 < 0) {
                        int iM450213 = C19806.m45029("᩷ۨ") ^ i6;
                        i3 = ((iM450213 ^ i5) * (-2649)) ^ (-31313456);
                        i8 = iM450213 ^ (-1484062113);
                        intent = null;
                        i7 = i3;
                        abstractActivityC12483 = this;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۘ") ^ i5;
                        i = ((iM11306 ^ i6) * 19513) ^ 895728406;
                        i2 = 994289851;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                    }
                    break;
                case -112183071:
                case 935767627:
                    uri = Uri.parse(RunnableC0195.m1433(ApplicationC0716.f2992, strM6288, ""));
                    interfaceC6025 = ApplicationC0716.f2992;
                    if (C2249.m6915() <= 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ܶۙ") ^ i6) * (-49);
                        i3 = ((iM11307 ^ i5) * 7205) ^ (-849324819);
                        i4 = -533750156;
                    } else {
                        iM11307 = (C19806.m45029("ۜ᩹") ^ i5) * (-117);
                        i3 = ((iM11307 ^ i6) * 17985) ^ (-1855983205);
                        i4 = 418118625;
                    }
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    abstractActivityC12483 = this;
                    break;
                case 188916719:
                case 1604345550:
                    if (Build.VERSION.SDK_INT >= 26) {
                        iM11307 = (C19806.m45029("۬ۨ") + i5) * 71;
                        i3 = ((iM11307 ^ i6) * (-409)) ^ 1880281851;
                        i4 = 1581347880;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ᩳ᩹") ^ i6;
                        i3 = ((iM11307 ^ i5) * (-11583)) ^ (-1180585820);
                        i4 = -560733451;
                    }
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    abstractActivityC12483 = this;
                    break;
                case 261083519:
                case 892131838:
                    break;
                case 631541359:
                case 1606076935:
                    C1875.m6102(abstractActivityC12483, activityNotFoundException, componentName);
                    iM11307 = ThreadFactoryC3888.m11306("ᩳ᩹") ^ i6;
                    i3 = ((iM11307 ^ i5) * (-11583)) ^ (-1180585820);
                    i4 = -560733451;
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    abstractActivityC12483 = this;
                    break;
                case 774368461:
                case 1039318783:
                    intent.setDataAndType(uri, C0817.m3406(sArr, 375, 39, i10));
                    if (C0526.f2219) {
                        iM11306 = C19806.m45029("ܿܺ") ^ i5;
                        i = ((iM11306 ^ i6) * 22605) ^ 1448265239;
                        i2 = -1544134174;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ᩵") ^ i5;
                        i = ((iM11306 ^ i6) * (-3035)) ^ (-1764307246);
                        i2 = -293189623;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case 797857496:
                case 1764597454:
                    InterfaceC6025 interfaceC6026 = ApplicationC0716.f2992;
                    strM6288 = C1937.m6288(f41626, 345, 4, i10);
                    if (interfaceC6026.contains(strM6288)) {
                        iM11307 = (ThreadFactoryC3888.m11306("ۚۨ") + i6) * (-91);
                        i3 = ((iM11307 ^ i5) * 3099) ^ 1224498142;
                        i4 = 1774512910;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ᩳ᩹") ^ i6;
                        i3 = ((iM11307 ^ i5) * (-11583)) ^ (-1180585820);
                        i4 = -560733451;
                    }
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    abstractActivityC12483 = this;
                    break;
                case 1517332105:
                case 1695641028:
                    if (getPackageManager().canRequestPackageInstalls()) {
                        iM11307 = (ThreadFactoryC3888.m11306("ۖ֡") ^ i5) * 53;
                        i3 = ((iM11307 ^ i6) * (-9413)) ^ 1849232454;
                        i4 = 668692770;
                    } else {
                        iM11307 = C19806.m45029("᩻۠") ^ i6;
                        i3 = ((iM11307 ^ i5) * 25145) ^ 1165654845;
                        i4 = -1665921691;
                    }
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    abstractActivityC12483 = this;
                    break;
                default:
                    C2249.m6906(C2704.m8257(ApplicationC0716.f2992).remove(strM6288));
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31009(DialogInterfaceC19356 dialogInterfaceC19356) {
        synchronized (this.f41641) {
            C1377.m4830(this.f41641, dialogInterfaceC19356);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m31014() {
        int i;
        synchronized (this.f41641) {
            Iterator itM4831 = C1377.m4831(this.f41641);
            i = 0;
            while (C0962.m3748(itM4831)) {
                if (RunnableC0195.m1443((DialogInterfaceC19356) C0278.m1776(itM4831))) {
                    i++;
                }
            }
        }
        return i;
    }

    static {
        ApplicationC6132.m17119(BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION);
        f41626 = new short[]{1018, -6158, -6150, -6156, -6168, 8791, -30278, 28192, -28959, -21766, -28439, -25264, 3493, 794, 779, 779, 791, 786, 792, 794, 783, 786, 788, 789, 852, 781, 789, 799, 853, 794, 789, 799, 777, 788, 786, 799, 853, 779, 794, 792, 784, 794, 796, 798, 854, 794, 777, 792, 787, 786, 781, 798, 804, 786, 789, 776, 783, 794, 791, 791, 804, 794, 779, 784, 804, 797, 777, 788, 790, 804, 790, 783, 804, 794, 776, 846, 799, 847, 841, 779, 794, 792, 784, 794, 796, 798, 833, 794, 789, 799, 777, 788, 786, 799, 853, 776, 798, 783, 783, 786, 789, 796, 776, 853, 822, 826, 821, 826, 828, 830, 804, 814, 821, 816, 821, 820, 812, 821, 804, 826, 811, 811, 804, 808, 820, 814, 809, 824, 830, 808, 797, 786, 791, 798, 786, 794, 788, 776, 992, -8889, -10415, 6507, 19272, 19287, 19278, 19281, 730, 12778, 12773, 12783, 12793, 12772, 12770, 12783, 12709, 12792, 12782, 12799, 12799, 12770, 12773, 12780, 12792, 12709, 12746, 12763, 12763, 12743, 12738, 12744, 12746, 12767, 12738, 12740, 12741, 12756, 12751, 12750, 12767, 12746, 12738, 12743, 12760, 12756, 12760, 12750, 12767, 12767, 12738, 12741, 12748, 12760, 12795, 12778, 12776, 12768, 12778, 12780, 12782, 12721, 12776, 12772, 12774, 12709, 12778, 12773, 12783, 12793, 12772, 12770, 12783, 12709, 12792, 12782, 12799, 12799, 12770, 12773, 12780, 12792, 12776, 12772, 12774, 12709, 12778, 12773, 12783, 12793, 12772, 12770, 12783, 12709, 12792, 12782, 12799, 12799, 12770, 12773, 12780, 12792, 12709, 12778, 12795, 12795, 12775, 12770, 12776, 12778, 12799, 12770, 12772, 12773, 12792, 12709, 12738, 12773, 12792, 12799, 12778, 12775, 12775, 12782, 12783, 12746, 12795, 12795, 12751, 12782, 12799, 12778, 12770, 12775, 12792, 5101, 16988, 16988, 7776, -9395, 6066, 9913, 9269, 12158, -2665, -4635, 8727, 766, 7462, -4152, -4216, -4162, 14733, 9900, 523, -2124, -2139, -2137, -2129, -2139, -2141, -2143, -2050, -2139, -2134, -2144, -2122, -2133, -2131, -2144, -2070, -2121, -2143, -2128, -2128, -2131, -2134, -2141, -2121, -2070, -2167, -2171, -2166, -2171, -2173, -2175, -2149, -2159, -2166, -2161, -2166, -2165, -2157, -2166, -2149, -2171, -2156, -2156, -2149, -2153, -2165, -2159, -2154, -2169, -2175, -2153, 7842, 4853, 4861, 4851, 4847, 4861, 4850, 4856, 4846, 4851, 4853, 4856, 4786, 4853, 4850, 4840, 4857, 4850, 4840, 4786, 4861, 4863, 4840, 4853, 4851, 4850, 4786, 4810, 4821, 4825, 4811, 4861, 4844, 4844, 4848, 4853, 4863, 4861, 4840, 4853, 4851, 4850, 4787, 4842, 4850, 4856, 4786, 4861, 4850, 4856, 4846, 4851, 4853, 4856, 4786, 4844, 4861, 4863, 4855, 4861, 4859, 4857, 4785, 4861, 4846, 4863, 4852, 4853, 4842, 4857, 4334, 26037, -16631, -19596, 19800, 21919, 24006, 8140, -16564, -20480, -17411, 6238, 10223, 11238, 14216, 5795, -11448, -11449, -11443, -11429, -11450, -11456, -11443, -11513, -11456, -11449, -11427, -11444, -11449, -11427, -11513, -11448, -11446, -11427, -11456, -11450, -11449, -11513, -11393, -11424, -11412, -11394, 9351, 31239, 31270, 31264, 31276, 31281, 31253, 31274, 31270, 31284, -1574, -1605, 13519, 31266, 31277, 31271, 31281, 31276, 31274, 31271, 31341, 31284, 31274, 31271, 31268, 31270, 31287, 31341, 31251, 31276, 31283, 31286, 31283, 31252, 31274, 31277, 31271, 31276, 31284, 31335, 31251, 31276, 31283, 31286, 31283, 31239, 31270, 31264, 31276, 31281, 31253, 31274, 31270, 31284};
        f41625 = new C9186();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00e8 A[PHI: r4 r6 r7 r13
      0x00e8: PHI (r4v4 l.ܽۤۘ) = (r4v2 l.ܽۤۘ), (r4v3 l.ܽۤۘ), (r4v2 l.ܽۤۘ) binds: [B:86:0x00e8, B:26:0x00e6, B:22:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x00e8: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v8 int) binds: [B:86:0x00e8, B:26:0x00e6, B:22:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x00e8: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v7 int) binds: [B:86:0x00e8, B:26:0x00e6, B:22:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x00e8: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:86:0x00e8, B:26:0x00e6, B:22:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ */
    public void mo121(C4014 c4014) {
        int iM45029;
        int i;
        int i2;
        int iM11306;
        int i3;
        int iM11307;
        int i4;
        C4014 c4015 = c4014;
        int i5 = C1189.f5284;
        int i6 = C2124.f7782;
        int iM450210 = C19806.m45029("ۚ᩻") ^ i6;
        int i7 = ((iM450210 ^ i5) * 28581) ^ 92070014;
        DialogInterfaceOnClickListenerC16572 dialogInterfaceOnClickListenerC16572 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i8 = iM450210 ^ (-1569747460);
        int iM450211 = 0;
        int iM11308 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        short s = 0;
        int i14 = 0;
        int i15 = -1689099956;
        int i16 = 0;
        DialogInterfaceOnClickListenerC0343 dialogInterfaceOnClickListenerC0343 = null;
        C8067 c8067M5356 = null;
        while (true) {
            i15 = i8 ^ (i7 & (((i15 ^ i5) * (-27285)) >> 31));
            switch (i15) {
                case -2076667244:
                case -141745337:
                    c8067M5356 = RunnableC1564.m5356(this);
                    sArr2 = f41626;
                    i16 = 280;
                    i13 = 3;
                    if (C1460.f5948 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ֨") ^ i6;
                        i = ((iM45029 ^ i5) * 17149) ^ 1884812304;
                        i2 = 234219635;
                    } else {
                        iM45029 = C19806.m45029("ۢܺ") ^ i6;
                        i = ((iM45029 ^ i5) * 10791) ^ (-1796443973);
                        i2 = 1653073285;
                    }
                    i8 = iM45029 ^ i2;
                    c4015 = c4014;
                    i7 = i;
                    break;
                case -2004570348:
                case 1406184354:
                    if (C1937.f7317 < 0) {
                        iM11306 = C19806.m45029("ܽۜ") ^ i5;
                        i = ((iM11306 ^ i6) * 32389) ^ (-1521618761);
                        i3 = 1380192416;
                        i8 = iM11306 ^ i3;
                        i7 = i;
                    } else {
                        sArr2 = sArr2;
                        i16 = i16;
                        iM11307 = (C19806.m45029("ܳ᩻") ^ i5) * 63;
                        i7 = ((iM11307 ^ i6) * (-20637)) ^ 2034887023;
                        i4 = -1263146078;
                        int i17 = iM11307 ^ i4;
                        i16 = i16;
                        sArr2 = sArr2;
                        i8 = i17;
                        c4015 = c4014;
                    }
                    break;
                case -2003529141:
                case -371557201:
                    sArr2 = sArr2;
                    i16 = i16;
                    s = sArr[c];
                    i14 = s * 2;
                    if (C1066.m4023() <= 0) {
                        iM11307 = C19806.m45029("ۨ᩶") ^ i5;
                        i7 = ((iM11307 ^ i6) * 21533) ^ 1226464664;
                        i4 = -1787388326;
                    } else {
                        iM11307 = (i6 - ThreadFactoryC3888.m11306("ۡ᩵")) * (-119);
                        i7 = ((iM11307 ^ i5) * (-12905)) ^ (-1420950174);
                        i4 = -1962583513;
                    }
                    int i18 = iM11307 ^ i4;
                    i16 = i16;
                    sArr2 = sArr2;
                    i8 = i18;
                    c4015 = c4014;
                    break;
                case -1979491361:
                case -824717460:
                    dialogInterfaceOnClickListenerC16572 = new DialogInterfaceOnClickListenerC16572(2, c4015);
                    sArr5 = f41626;
                    if (C3535.f13026 <= 0) {
                        iM11306 = (i6 - C19806.m45029("ᩳ۟")) * (-95);
                        i = ((iM11306 ^ i5) * (-27683)) ^ 1966170496;
                        i3 = 385399947;
                    } else {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۛ֨")) * 51;
                        i = ((iM11306 ^ i6) * (-13341)) ^ (-48103711);
                        i3 = 614729953;
                    }
                    i8 = iM11306 ^ i3;
                    i7 = i;
                    break;
                case -1963957522:
                case 369051909:
                    RunnableC0195.m1431();
                    C0526.m2437();
                    break;
                case -1896296973:
                case -496977414:
                    dialogInterfaceOnClickListenerC0343 = new DialogInterfaceOnClickListenerC0343(this, c4015);
                    sArr4 = f41626;
                    if (C1066.f4915 <= 0) {
                        sArr2 = sArr2;
                        i16 = i16;
                        i11 = 286;
                        iM11307 = C19806.m45029("ۨ᩶") ^ i5;
                        i7 = ((iM11307 ^ i6) * 21533) ^ 1226464664;
                        i4 = -1787388326;
                        int i19 = iM11307 ^ i4;
                        i16 = i16;
                        sArr2 = sArr2;
                        i8 = i19;
                        c4015 = c4014;
                    } else {
                        int iM11309 = ThreadFactoryC3888.m11306("᩵ۧ") ^ i5;
                        i7 = ((iM11309 ^ i6) * (-7193)) ^ 1564469911;
                        i8 = iM11309 ^ (-1769190221);
                        i11 = 286;
                    }
                    break;
                case -1878103526:
                case 1375890205:
                    i12 = 30331;
                    iM11307 = C19806.m45029("ۙ᩸") ^ i6;
                    i7 = ((iM11307 ^ i5) * 29439) ^ (-860460604);
                    i4 = 996385077;
                    int i110 = iM11307 ^ i4;
                    i16 = i16;
                    sArr2 = sArr2;
                    i8 = i110;
                    c4015 = c4014;
                    break;
                case -1863460529:
                case -705370858:
                    sArr2 = sArr2;
                    i16 = i16;
                    sArr = f41626;
                    c = 279;
                    if (C3577.m10565()) {
                        iM11307 = ThreadFactoryC3888.m11306("ۙۧ") ^ i5;
                        i7 = ((iM11307 ^ i6) * (-26503)) ^ (-213059952);
                        i4 = -1717822032;
                    } else {
                        iM11307 = (C19806.m45029("ܳ᩻") ^ i5) * 63;
                        i7 = ((iM11307 ^ i6) * (-20637)) ^ 2034887023;
                        i4 = -1263146078;
                    }
                    int i111 = iM11307 ^ i4;
                    i16 = i16;
                    sArr2 = sArr2;
                    i8 = i111;
                    c4015 = c4014;
                    break;
                case -817855872:
                case 570576302:
                    C0671.m3008();
                    C3286.m9798();
                    sArr2 = sArr2;
                    i16 = i16;
                    iM11307 = (C19806.m45029("ܳ᩻") ^ i5) * 63;
                    i7 = ((iM11307 ^ i6) * (-20637)) ^ 2034887023;
                    i4 = -1263146078;
                    int i112 = iM11307 ^ i4;
                    i16 = i16;
                    sArr2 = sArr2;
                    i8 = i112;
                    c4015 = c4014;
                    break;
                case -449784603:
                case 123848985:
                    C3535.m10431();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ֨") ^ i6;
                        i = ((iM45029 ^ i5) * 17149) ^ 1884812304;
                        i2 = 234219635;
                        i8 = iM45029 ^ i2;
                        c4015 = c4014;
                        i7 = i;
                    } else {
                        sArr2 = sArr2;
                        i16 = i16;
                        iM11307 = (C19806.m45029("ܳ᩻") ^ i5) * 63;
                        i7 = ((iM11307 ^ i6) * (-20637)) ^ 2034887023;
                        i4 = -1263146078;
                        int i113 = iM11307 ^ i4;
                        i16 = i16;
                        sArr2 = sArr2;
                        i8 = i113;
                        c4015 = c4014;
                    }
                    break;
                case -422982256:
                case 1233046047:
                    AbstractC0464.m2309(c8067M5356, C19806.m45029(C2332.m7082(sArr4, i11, 3, i12)) ^ 2125740471, dialogInterfaceOnClickListenerC0343);
                    if (C1398.f5802 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧᩴ") ^ i6;
                        i = ((iM11306 ^ i5) * 17921) ^ (-378993948);
                        i3 = -1186154230;
                        i8 = iM11306 ^ i3;
                        i7 = i;
                    } else {
                        sArr2 = sArr2;
                        i16 = i16;
                        iM11307 = C19806.m45029("ۨ᩶") ^ i5;
                        i7 = ((iM11307 ^ i6) * 21533) ^ 1226464664;
                        i4 = -1787388326;
                        int i114 = iM11307 ^ i4;
                        i16 = i16;
                        sArr2 = sArr2;
                        i8 = i114;
                        c4015 = c4014;
                    }
                    break;
                case -333363288:
                case 1688819160:
                    sArr2 = sArr2;
                    i16 = i16;
                    int i20 = s + 1;
                    if ((i14 + 1) - (i20 * i20) > 0) {
                        iM11307 = C19806.m45029("֡᩹") ^ i6;
                        i7 = ((iM11307 ^ i5) * 6095) ^ 1644648986;
                        i4 = 1846690985;
                    } else {
                        iM11307 = (C19806.m45029("ۛ᩺") + i5) * 29;
                        i7 = ((iM11307 ^ i6) * (-20605)) ^ 668489462;
                        i4 = -367246995;
                    }
                    int i115 = iM11307 ^ i4;
                    i16 = i16;
                    sArr2 = sArr2;
                    i8 = i115;
                    c4015 = c4014;
                    break;
                case -318408263:
                case 2035263533:
                    iM11308 = ThreadFactoryC3888.m11306(C0526.m2424(sArr5, 289, 3, i12));
                    i9 = 2103000440;
                    if (C1377.m4833() != 0) {
                        iM11306 = (i6 - C19806.m45029("ᩳ۟")) * (-95);
                        i = ((iM11306 ^ i5) * (-27683)) ^ 1966170496;
                        i3 = 385399947;
                    } else {
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("ۤۢ")) * (-87);
                        i = ((iM11306 ^ i5) * 5995) ^ 1437450313;
                        i3 = 1481650290;
                    }
                    i8 = iM11306 ^ i3;
                    i7 = i;
                    break;
                case -241391358:
                case 2054075510:
                    C0050.m946();
                    if (!C1377.f5749) {
                        iM11306 = (i6 - C19806.m45029("ᩳ۟")) * (-95);
                        i = ((iM11306 ^ i5) * (-27683)) ^ 1966170496;
                        i3 = 385399947;
                        i8 = iM11306 ^ i3;
                        i7 = i;
                    } else {
                        sArr2 = sArr2;
                        i16 = i16;
                        iM11307 = (C19806.m45029("ܳ᩻") ^ i5) * 63;
                        i7 = ((iM11307 ^ i6) * (-20637)) ^ 2034887023;
                        i4 = -1263146078;
                        int i116 = iM11307 ^ i4;
                        i16 = i16;
                        sArr2 = sArr2;
                        i8 = i116;
                        c4015 = c4014;
                    }
                    break;
                case -170753145:
                case -160661570:
                    mo10632();
                    break;
                case 354205462:
                case 408355587:
                    short[] sArr6 = sArr2;
                    i16 = i16;
                    iM450211 = C19806.m45029(C1189.m4365(sArr6, i16, i13, i12));
                    if (C3722.m10894() <= 0) {
                        sArr2 = sArr6;
                        iM11307 = (C19806.m45029("ܳ᩻") ^ i5) * 63;
                        i7 = ((iM11307 ^ i6) * (-20637)) ^ 2034887023;
                        i4 = -1263146078;
                        int i117 = iM11307 ^ i4;
                        i16 = i16;
                        sArr2 = sArr2;
                        i8 = i117;
                        c4015 = c4014;
                    } else {
                        int iM450212 = (C19806.m45029("ۖܽ") ^ i5) * 67;
                        i7 = ((iM450212 ^ i6) * 13723) ^ 827613886;
                        i16 = i16;
                        c4015 = c4014;
                        i8 = iM450212 ^ 1297230427;
                        sArr2 = sArr6;
                    }
                    break;
                case 400751048:
                case 1706071329:
                    C1148.m4224(c8067M5356, C19806.m45029(C1066.m4040(sArr3, i10, 3, i12)) ^ 2101401763);
                    if (!C1377.f5749) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ֨") ^ i6;
                        i = ((iM45029 ^ i5) * 17149) ^ 1884812304;
                        i2 = 234219635;
                        i8 = iM45029 ^ i2;
                        c4015 = c4014;
                        i7 = i;
                    } else {
                        int iM113010 = (ThreadFactoryC3888.m11306("ܿ۬") + i6) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i8 = iM113010 ^ (-1861691941);
                        i7 = ((iM113010 ^ i5) * 26693) ^ 579579060;
                        c4015 = c4014;
                    }
                    break;
                case 428411482:
                case 922224286:
                    i12 = 61768;
                    iM11307 = C19806.m45029("ۙ᩸") ^ i6;
                    i7 = ((iM11307 ^ i5) * 29439) ^ (-860460604);
                    i4 = 996385077;
                    int i118 = iM11307 ^ i4;
                    i16 = i16;
                    sArr2 = sArr2;
                    i8 = i118;
                    c4015 = c4014;
                    break;
                case 503139390:
                case 1291372929:
                    sArr2 = sArr2;
                    i16 = i16;
                    if (c4014.m11522()) {
                        iM11307 = C19806.m45029("᩻ܳ") ^ i5;
                        i7 = ((iM11307 ^ i6) * (-9681)) ^ 235490285;
                        i4 = -2016893586;
                    } else {
                        iM11307 = C19806.m45029("ᩳۡ") ^ i5;
                        i7 = ((iM11307 ^ i6) * 24819) ^ (-1176312411);
                        i4 = -2044068031;
                    }
                    int i119 = iM11307 ^ i4;
                    i16 = i16;
                    sArr2 = sArr2;
                    i8 = i119;
                    c4015 = c4014;
                    break;
                case 792281753:
                case 876417172:
                    C0050.m933(c8067M5356, 2119321902 ^ iM450211);
                    sArr3 = f41626;
                    i10 = 283;
                    if (C1377.m4833() == 0) {
                        iM45029 = (i6 - C19806.m45029("ۜ᩺")) * (-19);
                        i = ((iM45029 ^ i5) * 16285) ^ (-1803921647);
                        i2 = 140785057;
                        i8 = iM45029 ^ i2;
                        c4015 = c4014;
                        i7 = i;
                    } else {
                        sArr2 = sArr2;
                        i16 = i16;
                        iM11307 = C19806.m45029("ۨ᩶") ^ i5;
                        i7 = ((iM11307 ^ i6) * 21533) ^ 1226464664;
                        i4 = -1787388326;
                        int i1110 = iM11307 ^ i4;
                        i16 = i16;
                        sArr2 = sArr2;
                        i8 = i1110;
                        c4015 = c4014;
                    }
                    break;
                default:
                    C10634.m26830(c8067M5356, iM11308 ^ i9, dialogInterfaceOnClickListenerC16572);
                    C19806.m45028(c8067M5356, false);
                    CallableC1627.m5514(c8067M5356);
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public C13954 mo119(C15844 c15844) {
        return c15844.m37673(7);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31005(C17381 c17381) {
        int i = 0;
        Resources.Theme theme = null;
        int iM942 = 0;
        int i2 = 0;
        int iM943 = 0;
        Window windowM10777 = null;
        int i3 = -1277748717;
        int i4 = C1937.f7317;
        int i5 = C1025.f4800;
        int iM45029 = C19806.m45029("֫ۤ") ^ i4;
        int i6 = ((iM45029 ^ i5) * 16711) ^ (-494879328);
        int i7 = 1518342608;
        while (true) {
            i3 = ((((i3 ^ i5) * 20307) >> 31) & i6) ^ (iM45029 ^ i7);
            switch (i3) {
                case -2054365754:
                case 952835754:
                    C1668.m5583();
                    if (C3535.f13026 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۖ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 26903) ^ (-2128515643);
                        i7 = 1095676535;
                    } else {
                        iM45029 = (C19806.m45029("ۨ᩻") ^ i5) * 99;
                        i6 = ((iM45029 ^ i4) * 31071) ^ 750170045;
                        i7 = 112846441;
                    }
                    break;
                case -1999830332:
                case 695629903:
                    iM942 = C0050.m942(theme, i);
                    i2 = R.attr.colorBackground;
                    if (C0797.f3386) {
                        iM45029 = (C19806.m45029("᩶ۢ") ^ i4) * 17;
                        i6 = ((iM45029 ^ i5) * 4475) ^ 749807750;
                        i7 = -1619055365;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛܳ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-21677)) ^ 1194987989;
                        i7 = -888261150;
                    }
                    break;
                case -1965386807:
                case -918518877:
                    if (C2704.f10408) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ۟") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-26563)) ^ 246834354;
                        i7 = -640027344;
                    } else {
                        iM45029 = C19806.m45029("ۖܿ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 19645) ^ 1100449388;
                        i7 = 1558485577;
                    }
                    break;
                case -1864653499:
                case 1341334234:
                    theme = getTheme();
                    if (C2124.f7782 <= 0) {
                        iM45029 = C19806.m45029("ۖܿ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 19645) ^ 1100449388;
                        i7 = 1558485577;
                    } else {
                        iM45029 = (C19806.m45029("ܶ᩹") ^ i5) * (-99);
                        i6 = ((iM45029 ^ i4) * 17387) ^ 892443184;
                        i7 = 1659977555;
                    }
                    break;
                case -1486027561:
                case 157869695:
                    if (C0671.f2816 != 0) {
                        iM45029 = C19806.m45029("ۖܿ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 19645) ^ 1100449388;
                        i7 = 1558485577;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠᩻") ^ i4) * (-101);
                        i6 = ((iM45029 ^ i5) * (-24761)) ^ 1759904860;
                        i7 = 885451886;
                    }
                    break;
                case -1426973631:
                case -481280805:
                    C1460.m5050();
                    C3660.m10791();
                    iM45029 = (C19806.m45029("ۨ᩻") ^ i5) * 99;
                    i6 = ((iM45029 ^ i4) * 31071) ^ 750170045;
                    i7 = 112846441;
                    break;
                case -1321414108:
                case -401857575:
                    if (C1875.f7103 >= 0) {
                        iM45029 = (C19806.m45029("᩶ۢ") ^ i4) * 17;
                        i6 = ((iM45029 ^ i5) * 4475) ^ 749807750;
                        i7 = -1619055365;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗ᩸") ^ i5) * 21;
                        i6 = ((iM45029 ^ i4) * (-26493)) ^ 1431492439;
                        i7 = -877984111;
                    }
                    break;
                case -1295169027:
                case -445442777:
                    C2704.m8255();
                    break;
                case -1218956275:
                case 2037559038:
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۖ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 26903) ^ (-2128515643);
                        i7 = 1095676535;
                    } else {
                        iM45029 = C19806.m45029("֫֫") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-1631)) ^ (-741554912);
                        i7 = 307843253;
                    }
                    break;
                case -1024978662:
                case -671599560:
                    if (!CallableC1627.f6528) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۖ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 26903) ^ (-2128515643);
                        i7 = 1095676535;
                    } else {
                        iM45029 = (C19806.m45029("᩶ۢ") ^ i4) * 17;
                        i6 = ((iM45029 ^ i5) * 4475) ^ 749807750;
                        i7 = -1619055365;
                    }
                    break;
                case -900714340:
                case 1412120363:
                    i = R.attr.navigationBarColor;
                    if (RunnableC1564.f6300) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۖ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 26903) ^ (-2128515643);
                        i7 = 1095676535;
                    } else {
                        iM45029 = (C19806.m45029("ۗ۬") + i4) * (-51);
                        i6 = ((iM45029 ^ i5) * 8033) ^ 1614983178;
                        i7 = -1718396609;
                    }
                    break;
                case -773775732:
                case 548576055:
                    iM943 = C0050.m942(getTheme(), i2);
                    if (iM942 == iM943) {
                        iM45029 = C19806.m45029("֨֨") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-22983)) ^ 836623213;
                        i7 = -371188310;
                    } else {
                        iM45029 = (i5 - C19806.m45029("᩹ᩳ")) * (-59);
                        i6 = ((iM45029 ^ i4) * 12065) ^ (-1103157873);
                        i7 = 218646340;
                    }
                    break;
                case -718524681:
                case -538256127:
                    if (C0050.f912 <= 0) {
                        iM45029 = (C19806.m45029("ۨ᩻") ^ i5) * 99;
                        i6 = ((iM45029 ^ i4) * 31071) ^ 750170045;
                        i7 = 112846441;
                    } else {
                        iM45029 = C19806.m45029("᩻ۜ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 25509) ^ (-2144338240);
                        i7 = -793646584;
                    }
                    break;
                case -357070835:
                case 1865365286:
                    C0629.m2914(c17381, iM943);
                    C2249.m6910(this).setNavigationBarColor(iM942);
                    break;
                case 763056980:
                case 1007037126:
                    windowM10777.setNavigationBarColor(0);
                    break;
                case 990815396:
                case 2041786539:
                    if (C2642.f10294 <= 0) {
                        iM45029 = C19806.m45029("ۖܿ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 19645) ^ 1100449388;
                        i7 = 1558485577;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡ܽ") ^ i4) * (-125);
                        i6 = ((iM45029 ^ i5) * 9979) ^ 944738196;
                        i7 = -1580212914;
                    }
                    break;
                case 1102760701:
                case 1159333053:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (C19806.m45029("ۨ᩻") ^ i5) * 99;
                        i6 = ((iM45029 ^ i4) * 31071) ^ 750170045;
                        i7 = 112846441;
                    } else {
                        iM45029 = (C19806.m45029("ۗۗ") ^ i5) * 39;
                        i6 = ((iM45029 ^ i4) * (-14311)) ^ (-137014578);
                        i7 = 1076140768;
                    }
                    break;
                default:
                    ViewGroupOnHierarchyChangeListenerC1916.m6237(c17381, iM942);
                    windowM10777 = C3660.m10777(this);
                    if (C1189.f5284 <= 0) {
                        iM45029 = C19806.m45029("֫֫") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-1631)) ^ (-741554912);
                        i7 = 307843253;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ܶۤ")) * 61;
                        i6 = ((iM45029 ^ i4) * (-27481)) ^ 157927554;
                        i7 = -2043263013;
                    }
                    break;
            }
            return;
        }
    }
}
