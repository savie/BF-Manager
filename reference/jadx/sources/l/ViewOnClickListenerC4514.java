package l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.tabs.TabLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.ec.custom.sec.SecP192K1Field;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.ۙ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC4514 extends AbstractActivityC12483 implements InterfaceC16602, View.OnClickListener {

    /* JADX INFO: renamed from: ܳܰ, reason: not valid java name and contains not printable characters */
    public static final int[] f16036;

    /* JADX INFO: renamed from: ܳᩴ᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f16037;

    /* JADX INFO: renamed from: ᩻ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f16038 = 0;

    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public boolean f16039;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public int f16040;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f16041;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public EditText f16042;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f16043;

    /* JADX INFO: renamed from: ۛܰ, reason: not valid java name and contains not printable characters */
    public C12586 f16044;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public C23566 f16045;

    /* JADX INFO: renamed from: ۟ܰ, reason: not valid java name and contains not printable characters */
    public MenuItem f16046;

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public C9764 f16047;

    /* JADX INFO: renamed from: ۡܰ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f16048;

    /* JADX INFO: renamed from: ۤܰ, reason: not valid java name and contains not printable characters */
    public boolean f16049;

    /* JADX INFO: renamed from: ۧܰ, reason: not valid java name and contains not printable characters */
    public C19383 f16050;

    /* JADX INFO: renamed from: ۫ܰ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f16051;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f16052;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f16053;

    /* JADX INFO: renamed from: ܺܰ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f16054;

    /* JADX INFO: renamed from: ܽܰ, reason: not valid java name and contains not printable characters */
    public C12586 f16055;

    /* JADX INFO: renamed from: ܿܰ, reason: not valid java name and contains not printable characters */
    public C3412 f16056;

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public boolean f16057;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public int f16058;

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public boolean f16059;

    /* JADX INFO: renamed from: ᩶ܰ, reason: not valid java name and contains not printable characters */
    public int f16060;

    /* JADX INFO: renamed from: ᩷ܰ, reason: not valid java name and contains not printable characters */
    public C1439 f16061;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public boolean f16062;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public int f16063;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f16064;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private native void m12577(C7817 c7817, C8387 c8387, C8387 c8388);

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = -2002378324;
        int i6 = C0050.f912;
        int i7 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM45029 = (C19806.m45029("ۚܺ") + i7) * (-121);
        int i8 = ((iM45029 ^ i6) * 22107) ^ (-2088883430);
        int i9 = 1818776264;
        while (true) {
            i5 = ((((i5 ^ i6) * (-579)) >> 31) & i8) ^ (iM45029 ^ i9);
            switch (i5) {
                case -1983838369:
                case 971269055:
                    RunnableC1895.m6170();
                    if (C3660.f13403 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ᩻") ^ i6) * (-69);
                        i8 = ((iM45029 ^ i7) * (-22199)) ^ 1684867682;
                        i9 = 1733041705;
                    } else {
                        iM45029 = (i7 - C19806.m45029("᩷᩹")) * (-3);
                        i8 = ((iM45029 ^ i6) * (-21781)) ^ (-1911294940);
                        i9 = 1602822399;
                    }
                    break;
                case -1906649735:
                case 711406713:
                    if (C1460.f5948 >= 0) {
                        iM45029 = (i7 - C19806.m45029("᩷᩹")) * (-3);
                        i8 = ((iM45029 ^ i6) * (-21781)) ^ (-1911294940);
                        i9 = 1602822399;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ᩳ") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-30217)) ^ (-1734805445);
                        i9 = -1763271282;
                    }
                    break;
                case -1880325581:
                case -912253795:
                    if (C0817.f3443) {
                        iM45029 = C19806.m45029("ۛۤ") ^ i6;
                        i8 = ((iM45029 ^ i7) * 21915) ^ 636593846;
                        i9 = 787059917;
                    } else {
                        iM45029 = (C19806.m45029("ۨܰ") ^ i6) * 51;
                        i8 = ((iM45029 ^ i7) * (-14077)) ^ 1423010290;
                        i9 = 101489256;
                    }
                    break;
                case -1851431484:
                case 534612729:
                    if (C1025.m3861() > 0) {
                        iM45029 = (C19806.m45029("ۨܰ") ^ i6) * 51;
                        i8 = ((iM45029 ^ i7) * (-14077)) ^ 1423010290;
                        i9 = 101489256;
                    } else {
                        iM45029 = (i7 - C19806.m45029("᩷᩹")) * (-3);
                        i8 = ((iM45029 ^ i6) * (-21781)) ^ (-1911294940);
                        i9 = 1602822399;
                    }
                    break;
                case -1690646520:
                case -1494524214:
                    i = s * 2;
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM45029 = C19806.m45029("᩸ۤ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-187)) ^ 1899253496;
                        i9 = 683682180;
                    } else {
                        iM45029 = (i7 - C19806.m45029("᩹۠")) * 57;
                        i8 = ((iM45029 ^ i6) * 12183) ^ 1334934682;
                        i9 = 2039624668;
                    }
                    break;
                case -1590909076:
                case 1065075459:
                    i2 = i + 1;
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM45029 = (C19806.m45029("ۨܰ") ^ i6) * 51;
                        i8 = ((iM45029 ^ i7) * (-14077)) ^ 1423010290;
                        i9 = 101489256;
                    } else {
                        iM45029 = C19806.m45029("᩷ܶ") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-13515)) ^ (-2028746160);
                        i9 = 2100807638;
                    }
                    break;
                case -1394097969:
                case -682472929:
                    if (C7105.f23796 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ᩻") ^ i6) * (-69);
                        i8 = ((iM45029 ^ i7) * (-22199)) ^ 1684867682;
                        i9 = 1733041705;
                    } else {
                        iM45029 = (C19806.m45029("֡۟") ^ i7) * 89;
                        i8 = ((iM45029 ^ i6) * 23507) ^ 1578029156;
                        i9 = -1659525505;
                    }
                    break;
                case -1327254296:
                case 2135441893:
                    i3 = 28975;
                    iM45029 = C19806.m45029("᩹ܶ") ^ i7;
                    i8 = ((iM45029 ^ i6) * (-2313)) ^ 1682566637;
                    i9 = -1199235625;
                    break;
                case -1217994765:
                case -579652659:
                    return C10634.m26821(sArr2, i4, 18, i3);
                case -1156732419:
                case 824075690:
                    s2 = 1;
                    if (C3722.f13525 <= 0) {
                        iM45029 = C19806.m45029("᩸ۤ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-187)) ^ 1899253496;
                        i9 = 683682180;
                    } else {
                        iM45029 = C19806.m45029("ᩴ֫") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-14531)) ^ 1321800169;
                        i9 = 250173835;
                    }
                    break;
                case -1151966690:
                case 1657001543:
                    c = 645;
                    if (C0797.m3359()) {
                        iM45029 = (i7 - C19806.m45029("᩷ۜ")) * 27;
                        i8 = ((iM45029 ^ i6) * 30977) ^ 2097419473;
                        i9 = -717337957;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ᩻") ^ i6) * (-69);
                        i8 = ((iM45029 ^ i7) * (-22199)) ^ 1684867682;
                        i9 = 1733041705;
                    }
                    break;
                case -1117158231:
                case 803160221:
                    s = sArr[c];
                    if (C2642.f10294 <= 0) {
                        iM45029 = C19806.m45029("᩸ۤ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-187)) ^ 1899253496;
                        i9 = 683682180;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡۨ") ^ i6) * 119;
                        i8 = ((iM45029 ^ i7) * 15227) ^ 1683374827;
                        i9 = -56842732;
                    }
                    break;
                case -874306527:
                case 1119943135:
                    int i10 = s + s2;
                    if ((i10 * i10) - i2 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺܽ") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-2531)) ^ (-2033267050);
                        i9 = 862076741;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸᩸") ^ i7) * 65;
                        i8 = ((iM45029 ^ i6) * (-31387)) ^ (-1002000187);
                        i9 = -1107737095;
                    }
                    break;
                case -623949069:
                case 1073395758:
                    RunnableC1895.m6170();
                    C2124.m6673();
                    return null;
                case -89739729:
                case 1554075022:
                    i3 = 33700;
                    iM45029 = C19806.m45029("᩹ܶ") ^ i7;
                    i8 = ((iM45029 ^ i6) * (-2313)) ^ 1682566637;
                    i9 = -1199235625;
                    break;
                case 428094397:
                case 1573873023:
                    sArr2 = f16037;
                    i4 = 646;
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (i7 - C19806.m45029("᩷᩹")) * (-3);
                        i8 = ((iM45029 ^ i6) * (-21781)) ^ (-1911294940);
                        i9 = 1602822399;
                    } else {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("۬ۜ")) * (-107);
                        i8 = ((iM45029 ^ i6) * 4599) ^ 419345134;
                        i9 = 1762544030;
                    }
                    break;
                case 1116375934:
                case 1702702252:
                    RunnableC1606.m5473();
                    RunnableC0195.m1431();
                    iM45029 = ThreadFactoryC3888.m11306("᩵ᩳ") ^ i6;
                    i8 = ((iM45029 ^ i7) * (-30217)) ^ (-1734805445);
                    i9 = -1763271282;
                    break;
                case 1694259070:
                case 2091208540:
                    if (C1937.f7317 >= 0) {
                        iM45029 = (i7 - C19806.m45029("᩷᩹")) * (-3);
                        i8 = ((iM45029 ^ i6) * (-21781)) ^ (-1911294940);
                        i9 = 1602822399;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡᩵") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-20925)) ^ 1841441614;
                        i9 = 787373936;
                    }
                    break;
                default:
                    sArr = f16037;
                    if (RunnableC0195.m1431()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩶") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-27637)) ^ (-1044115544);
                        i9 = -1686397760;
                    } else {
                        iM45029 = (C19806.m45029("ۨܰ") ^ i6) * 51;
                        i8 = ((iM45029 ^ i7) * (-14077)) ^ 1423010290;
                        i9 = 101489256;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ void m12570(ViewOnClickListenerC4514 viewOnClickListenerC4514, C7817 c7817, C8387 c8387, C8387 c8388) {
        int i = -1712600629;
        int i2 = C3535.f13026;
        int i3 = C3660.f13403;
        int iM45029 = (i2 - C19806.m45029("ۢۚ")) * (-105);
        int i4 = ((iM45029 ^ i3) * (-26065)) ^ (-489239531);
        int i5 = -507020948;
        while (true) {
            i = ((((i ^ i3) * (-15377)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1973194488:
                case 2101418372:
                    C1668.m5583();
                    C3660.m10791();
                    iM45029 = ThreadFactoryC3888.m11306("֨ۛ") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-3035)) ^ (-1184968649);
                    i5 = -999697666;
                    break;
                case -1645586328:
                case 1949256345:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * 14509) ^ (-1934270315);
                        i5 = -1975591162;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۨۙ")) * (-89);
                        i4 = ((iM45029 ^ i3) * (-16313)) ^ (-390261823);
                        i5 = -922545458;
                    }
                    break;
                case -1609403124:
                case -666967742:
                    if (C1189.f5284 <= 0) {
                        iM45029 = C19806.m45029("ۤᩴ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-3711)) ^ (-1709027870);
                        i5 = -184387253;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴ֨") + i3) * (-15);
                        i4 = ((iM45029 ^ i2) * 6557) ^ (-1654865207);
                        i5 = -2123238417;
                    }
                    break;
                case -1446246734:
                case 1405568398:
                    C2249.m6915();
                    break;
                case -1427983036:
                case 2132731882:
                    C3577.m10565();
                    if (C1398.f5802 <= 0) {
                        iM45029 = C19806.m45029("۬᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * 30641) ^ (-412288165);
                        i5 = 2116988236;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3035)) ^ (-1184968649);
                        i5 = -999697666;
                    }
                    break;
                case -1362981981:
                case 1853086371:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = C19806.m45029("ۤᩴ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-3711)) ^ (-1709027870);
                        i5 = -184387253;
                    } else {
                        iM45029 = C19806.m45029("ܽ֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-11083)) ^ 903776958;
                        i5 = 534295887;
                    }
                    break;
                case -1261984154:
                case 1286001453:
                    if (C0671.f2816 != 0) {
                        iM45029 = C19806.m45029("۬᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * 30641) ^ (-412288165);
                        i5 = 2116988236;
                    } else {
                        iM45029 = C19806.m45029("᩷۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * 1341) ^ 1918913763;
                        i5 = -743730759;
                    }
                    break;
                case -596690994:
                case 1560844050:
                    if (RunnableC1895.m6170() != 0) {
                        iM45029 = C19806.m45029("۬᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * 30641) ^ (-412288165);
                        i5 = 2116988236;
                    } else {
                        iM45029 = C19806.m45029("ۜ֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-32317)) ^ (-1748168803);
                        i5 = -1399793312;
                    }
                    break;
                case -444885659:
                case 1849718491:
                    viewOnClickListenerC4514.m12577(c7817, c8387, c8388);
                    break;
                case -377455358:
                case 545754456:
                    if (C1460.f5948 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3035)) ^ (-1184968649);
                        i5 = -999697666;
                    } else {
                        iM45029 = (C19806.m45029("۟ۛ") ^ i2) * 25;
                        i4 = ((iM45029 ^ i3) * 12089) ^ 1911364484;
                        i5 = -694824189;
                    }
                    break;
                case -210747590:
                case 461468076:
                    if (C2704.f10408) {
                        iM45029 = (C19806.m45029("ۙܽ") ^ i3) * (-7);
                        i4 = ((iM45029 ^ i2) * 5765) ^ 2096150174;
                        i5 = 34194893;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * 14509) ^ (-1934270315);
                        i5 = -1975591162;
                    }
                    break;
                case 172423785:
                case 1141279663:
                    if (C3722.m10894() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3035)) ^ (-1184968649);
                        i5 = -999697666;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-29393)) ^ (-1894115345);
                        i5 = 831719841;
                    }
                    break;
                case 236051880:
                case 495978252:
                    if (!RunnableC1564.f6300) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3035)) ^ (-1184968649);
                        i5 = -999697666;
                    } else {
                        iM45029 = C19806.m45029("ۤᩴ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-3711)) ^ (-1709027870);
                        i5 = -184387253;
                    }
                    break;
                case 791718451:
                case 963942763:
                    if (C10634.f36300 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * 14509) ^ (-1934270315);
                        i5 = -1975591162;
                    } else {
                        iM45029 = (C19806.m45029("֡ۚ") ^ i2) * 109;
                        i4 = ((iM45029 ^ i3) * 9377) ^ 1788066835;
                        i5 = -1126562795;
                    }
                    break;
                case 1077440340:
                case 2034397394:
                    if (C3577.m10565()) {
                        iM45029 = (i3 - C19806.m45029("ᩳᩴ")) * (-117);
                        i4 = ((iM45029 ^ i2) * 16791) ^ 607156851;
                        i5 = 1921165688;
                    } else {
                        iM45029 = C19806.m45029("ۤᩴ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-3711)) ^ (-1709027870);
                        i5 = -184387253;
                    }
                    break;
                default:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = C19806.m45029("᩹᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-573)) ^ (-1129681553);
                        i5 = -1361447159;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * 14509) ^ (-1934270315);
                        i5 = -1975591162;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ void m12571(ViewOnClickListenerC4514 viewOnClickListenerC4514, C8387 c8387, C17492 c17492, AtomicInteger atomicInteger, int i) throws Throwable {
        int i2 = -2113639658;
        int i3 = C1025.f4800;
        int i4 = C1189.f5284;
        int iM11306 = ThreadFactoryC3888.m11306("ۧ᩺") ^ i3;
        int i5 = ((iM11306 ^ i4) * 25293) ^ (-304936925);
        int i6 = 1162541901;
        while (true) {
            i2 = ((((i2 ^ i4) * 22073) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2083273535:
                case 289175415:
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩷") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-27851)) ^ 1887932706;
                        i6 = -1473065352;
                    } else {
                        iM11306 = (C19806.m45029("ᩳۖ") ^ i4) * 53;
                        i5 = ((iM11306 ^ i3) * (-17767)) ^ (-604850965);
                        i6 = 646894105;
                    }
                    break;
                case -2007325183:
                case -776171578:
                    if (CallableC1627.f6528) {
                        iM11306 = C19806.m45029("֡۠") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-1133)) ^ 2058114425;
                        i6 = 268798692;
                    } else {
                        iM11306 = (i4 - C19806.m45029("۟֫")) * 99;
                        i5 = ((iM11306 ^ i3) * 8635) ^ 1729746821;
                        i6 = -1092219755;
                    }
                    break;
                case -1936422784:
                case 1615037834:
                    if (CallableC1627.f6528) {
                        iM11306 = C19806.m45029("ܽᩳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 11103) ^ (-977198738);
                        i6 = 1398983384;
                    } else {
                        iM11306 = (i4 - C19806.m45029("۟֫")) * 99;
                        i5 = ((iM11306 ^ i3) * 8635) ^ 1729746821;
                        i6 = -1092219755;
                    }
                    break;
                case -1778647055:
                case -981637317:
                    if (C1189.f5284 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩷") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-27851)) ^ 1887932706;
                        i6 = -1473065352;
                    } else {
                        iM11306 = C19806.m45029("֫᩶") ^ i3;
                        i5 = ((iM11306 ^ i4) * 9767) ^ 370400848;
                        i6 = -323726368;
                    }
                    break;
                case -1546231018:
                case 698335260:
                    if (C0278.f1572 <= 0) {
                        iM11306 = (C19806.m45029("᩷۬") + i3) * 53;
                        i5 = ((iM11306 ^ i4) * 11525) ^ 1448975085;
                        i6 = 215024084;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ܺ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-14837)) ^ (-1952497732);
                        i6 = 1422392546;
                    }
                    break;
                case -1328241852:
                case -665947147:
                    if (!C0817.f3443) {
                        iM11306 = (C19806.m45029("᩷۬") + i3) * 53;
                        i5 = ((iM11306 ^ i4) * 11525) ^ 1448975085;
                        i6 = 215024084;
                    } else {
                        iM11306 = (i4 - C19806.m45029("۟֫")) * 99;
                        i5 = ((iM11306 ^ i3) * 8635) ^ 1729746821;
                        i6 = -1092219755;
                    }
                    break;
                case -1318793452:
                case 961803936:
                    C2124.m6673();
                    break;
                case -753980513:
                case -706511622:
                    RunnableC1564.m5345();
                    if (C1148.f5161 > 0) {
                        iM11306 = (C19806.m45029("ۘۗ") ^ i4) * 49;
                        i5 = ((iM11306 ^ i3) * (-29979)) ^ (-51111908);
                        i6 = 2125133094;
                    } else {
                        iM11306 = (C19806.m45029("᩷۬") + i3) * 53;
                        i5 = ((iM11306 ^ i4) * 11525) ^ 1448975085;
                        i6 = 215024084;
                    }
                    break;
                case -353939464:
                case -196212136:
                    if (C3286.f12186) {
                        iM11306 = C19806.m45029("᩵᩹") ^ i3;
                        i5 = ((iM11306 ^ i4) * 19357) ^ 1495549315;
                        i6 = 150784414;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۙ") ^ i4) * (-19);
                        i5 = ((iM11306 ^ i3) * (-5579)) ^ (-522628124);
                        i6 = -1275924155;
                    }
                    break;
                case -11418715:
                case 418209795:
                    viewOnClickListenerC4514.m12563(c8387, c17492, atomicInteger, i);
                    break;
                case 64123464:
                case 1724797777:
                    C19806.m45024();
                    C1419.m4973();
                    iM11306 = (C19806.m45029("᩷۬") + i3) * 53;
                    i5 = ((iM11306 ^ i4) * 11525) ^ 1448975085;
                    i6 = 215024084;
                    break;
                case 72728314:
                case 2040709338:
                    if (C1398.f5802 <= 0) {
                        iM11306 = (i4 - C19806.m45029("۟֫")) * 99;
                        i5 = ((iM11306 ^ i3) * 8635) ^ 1729746821;
                        i6 = -1092219755;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙۘ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 255) ^ 259547864;
                        i6 = 1491831249;
                    }
                    break;
                case 612530899:
                case 661528965:
                    if (C0050.f912 <= 0) {
                        iM11306 = (i4 - C19806.m45029("۟֫")) * 99;
                        i5 = ((iM11306 ^ i3) * 8635) ^ 1729746821;
                        i6 = -1092219755;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ֨") ^ i3;
                        i5 = ((iM11306 ^ i4) * 7579) ^ (-1622302584);
                        i6 = 620701073;
                    }
                    break;
                case 1006988548:
                case 1769629991:
                    if (C1419.f5860 >= 0) {
                        iM11306 = (C19806.m45029("᩷۬") + i3) * 53;
                        i5 = ((iM11306 ^ i4) * 11525) ^ 1448975085;
                        i6 = 215024084;
                    } else {
                        iM11306 = (C19806.m45029("᩷᩸") + i4) * (-83);
                        i5 = ((iM11306 ^ i3) * 25481) ^ 1055391623;
                        i6 = 875129916;
                    }
                    break;
                case 1715824659:
                case 2021684435:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (C2871.f10837 < 0) {
                        iM11306 = C19806.m45029("᩵᩹") ^ i3;
                        i5 = ((iM11306 ^ i4) * 19357) ^ 1495549315;
                        i6 = 150784414;
                    } else {
                        iM11306 = (C19806.m45029("ۘۗ") ^ i4) * 49;
                        i5 = ((iM11306 ^ i3) * (-29979)) ^ (-51111908);
                        i6 = 2125133094;
                    }
                    break;
                default:
                    if (C2642.f10294 <= 0) {
                        iM11306 = C19806.m45029("᩵᩹") ^ i3;
                        i5 = ((iM11306 ^ i4) * 19357) ^ 1495549315;
                        i6 = 150784414;
                    } else {
                        iM11306 = (C19806.m45029("ܿ۬") + i3) * (-9);
                        i5 = ((iM11306 ^ i4) * (-28765)) ^ 408869599;
                        i6 = -803962850;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0215 A[PHI: r6 r7 r17
      0x0215: PHI (r6v3 int) = (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:59:0x0213, B:55:0x01f0, B:16:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r7v3 short) = (r7v1 short), (r7v2 short), (r7v1 short) binds: [B:59:0x0213, B:55:0x01f0, B:16:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r17v20 int) = (r17v5 int), (r17v6 int), (r17v21 int) binds: [B:59:0x0213, B:55:0x01f0, B:16:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0270 A[PHI: r3 r9 r10 r16 r17
      0x0270: PHI (r3v4 char) = (r3v2 char), (r3v1 char), (r3v1 char), (r3v1 char) binds: [B:67:0x026e, B:39:0x0136, B:27:0x00b5, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r9v4 short[]) = (r9v1 short[]), (r9v2 short[]), (r9v1 short[]), (r9v1 short[]) binds: [B:67:0x026e, B:39:0x0136, B:27:0x00b5, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r10v4 int) = (r10v1 int), (r10v2 int), (r10v1 int), (r10v1 int) binds: [B:67:0x026e, B:39:0x0136, B:27:0x00b5, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r16v4 int) = (r16v1 int), (r16v1 int), (r16v2 int), (r16v1 int) binds: [B:67:0x026e, B:39:0x0136, B:27:0x00b5, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r17v25 int) = (r17v3 int), (r17v12 int), (r17v16 int), (r17v26 int) binds: [B:67:0x026e, B:39:0x0136, B:27:0x00b5, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02a5 A[PHI: r1 r2 r4 r5 r17
      0x02a5: PHI (r1v2 int) = (r1v1 int), (r1v1 int), (r1v3 int) binds: [B:71:0x02a3, B:63:0x024d, B:31:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r2v3 short[]) = (r2v2 short[]), (r2v1 short[]), (r2v1 short[]) binds: [B:71:0x02a3, B:63:0x024d, B:31:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r4v3 short) = (r4v1 short), (r4v2 short), (r4v1 short) binds: [B:71:0x02a3, B:63:0x024d, B:31:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r5v3 int) = (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:71:0x02a3, B:63:0x024d, B:31:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r17v14 int) = (r17v2 int), (r17v4 int), (r17v15 int) binds: [B:71:0x02a3, B:63:0x024d, B:31:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12593(ViewOnClickListenerC4514 viewOnClickListenerC4514) {
        int iM45029;
        int i;
        int i2;
        int iM11306 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 2095009595;
        int i9 = ThreadFactoryC3888.f14547;
        int i10 = C1066.f4915;
        int iM450210 = C19806.m45029("۬۬") ^ i9;
        int i11 = ((iM450210 ^ i10) * 11315) ^ 1279742861;
        int i12 = iM450210 ^ (-1788241274);
        int i13 = 0;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i10) * 28891) >> 31));
            switch (i8) {
                case -1974215020:
                case -1114073366:
                    i8 = i8;
                    i7 = 3;
                    if (C19806.f63586) {
                        iM45029 = ThreadFactoryC3888.m11306("۠ۗ") ^ i10;
                        i = ((iM45029 ^ i9) * (-26935)) ^ (-1013932756);
                        i2 = 977938648;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ۨ") + i10) * (-107);
                        i = ((iM45029 ^ i9) * 14561) ^ 9946943;
                        i2 = 413809889;
                    }
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    i8 = i8;
                    break;
                case -1785127042:
                case 2117306737:
                    i5 = 36471;
                    iM45029 = (C19806.m45029("ۜۛ") ^ i10) * (-39);
                    i = ((iM45029 ^ i9) * (-11779)) ^ (-69133139);
                    i2 = 1505469270;
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    i8 = i8;
                    break;
                case -1616099762:
                case -237798721:
                    i8 = i8;
                    s = sArr[c];
                    i3 = s * s;
                    if (C2788.m8472() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤܶ") + i9) * (-45);
                        i = ((iM45029 ^ i10) * (-14117)) ^ (-1826447861);
                        i2 = -346876998;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ֫") + i10) * (-31);
                        i = ((iM45029 ^ i9) * (-30855)) ^ (-1991550322);
                        i2 = -1278822217;
                    }
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    i8 = i8;
                    break;
                case -1534597279:
                case -1122214697:
                    viewOnClickListenerC4514.f16047 = null;
                    i8 = i8;
                    iM45029 = ThreadFactoryC3888.m11306("ۜۗ") ^ i10;
                    i = ((iM45029 ^ i9) * (-11513)) ^ 1772576249;
                    i2 = 1069963400;
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    i8 = i8;
                    break;
                case -1478393475:
                case -445688850:
                    i8 = i8;
                    sArr2 = f16037;
                    i6 = 329;
                    if (C3535.f13026 <= 0) {
                        iM45029 = (i10 - ThreadFactoryC3888.m11306("ᩳܰ")) * 47;
                        i = ((iM45029 ^ i9) * (-20687)) ^ (-467882170);
                        i2 = -1076741737;
                    } else {
                        iM45029 = (i9 - C19806.m45029("᩹۫")) * 55;
                        i = ((iM45029 ^ i10) * (-13393)) ^ (-934502514);
                        i2 = 81986794;
                    }
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    i8 = i8;
                    break;
                case -1360857560:
                case 1610013249:
                    C3722.m10894();
                    if (C1937.f7317 >= 0) {
                        i8 = i8;
                        iM45029 = (C19806.m45029("ۖۤ") ^ i10) * (-31);
                        i = ((iM45029 ^ i9) * (-24309)) ^ (-887728499);
                        i2 = -122646641;
                        i12 = iM45029 ^ i2;
                        i11 = i;
                        i8 = i8;
                    } else {
                        int iM450211 = C19806.m45029("ۛۖ") ^ i9;
                        i12 = iM450211 ^ (-1805412478);
                        i11 = ((iM450211 ^ i10) * (-8565)) ^ (-144837072);
                    }
                    break;
                case -1160618267:
                case 320993608:
                    C0278.m1789();
                    break;
                case -1040136483:
                case 1224929398:
                    RunnableC1895.m6170();
                    i8 = i8;
                    iM45029 = (i10 - ThreadFactoryC3888.m11306("ᩳܰ")) * 47;
                    i = ((iM45029 ^ i9) * (-20687)) ^ (-467882170);
                    i2 = -1076741737;
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    i8 = i8;
                    break;
                case -1022702334:
                case 807083537:
                    i8 = i8;
                    sArr = f16037;
                    if (C1875.f7103 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤܶ") + i9) * (-45);
                        i = ((iM45029 ^ i10) * (-14117)) ^ (-1826447861);
                        i2 = -346876998;
                    } else {
                        iM45029 = C19806.m45029("ᩳܿ") ^ i10;
                        i = ((iM45029 ^ i9) * 6851) ^ (-506703136);
                        i2 = 1229780371;
                    }
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    i8 = i8;
                    break;
                case -921672938:
                case -273449290:
                    i8 = i8;
                    i13 = iM11306 ^ 2125675418;
                    if (C2704.f10408) {
                        iM45029 = (C19806.m45029("ۨۖ") + i10) * (-39);
                        i = ((iM45029 ^ i9) * (-24939)) ^ 1788670963;
                        i2 = -97128578;
                    } else {
                        iM45029 = (i10 - ThreadFactoryC3888.m11306("ᩳܰ")) * 47;
                        i = ((iM45029 ^ i9) * (-20687)) ^ (-467882170);
                        i2 = -1076741737;
                    }
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    i8 = i8;
                    break;
                case -781191882:
                case 1658544089:
                    i5 = 33925;
                    iM45029 = (C19806.m45029("ۜۛ") ^ i10) * (-39);
                    i = ((iM45029 ^ i9) * (-11779)) ^ (-69133139);
                    i2 = 1505469270;
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    i8 = i8;
                    break;
                case -645088193:
                case 1749354795:
                    i8 = i8;
                    if (viewOnClickListenerC4514.m12590()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۗ") ^ i10;
                        i = ((iM45029 ^ i9) * (-11513)) ^ 1772576249;
                        i2 = 1069963400;
                    } else {
                        iM45029 = C19806.m45029("ۧۢ") ^ i9;
                        i = ((iM45029 ^ i10) * 12609) ^ (-1312907678);
                        i2 = -1291057871;
                    }
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    i8 = i8;
                    break;
                case -262369129:
                case 990576600:
                    if (C1148.m4232() > 0) {
                        i8 = i8;
                        iM45029 = ThreadFactoryC3888.m11306("۠ۗ") ^ i10;
                        i = ((iM45029 ^ i9) * (-26935)) ^ (-1013932756);
                        i2 = 977938648;
                        i12 = iM45029 ^ i2;
                        i11 = i;
                        i8 = i8;
                    } else {
                        int iM450212 = C19806.m45029("ۛۖ") ^ i9;
                        i12 = iM450212 ^ (-1805412478);
                        i11 = ((iM450212 ^ i10) * (-8565)) ^ (-144837072);
                    }
                    break;
                case -261757851:
                case 500835222:
                    i8 = i8;
                    i4 = i3 + 63568729;
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (C19806.m45029("ۖۤ") ^ i10) * (-31);
                        i = ((iM45029 ^ i9) * (-24309)) ^ (-887728499);
                        i2 = -122646641;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۘ") ^ i9;
                        i = ((iM45029 ^ i10) * 20743) ^ 493499402;
                        i2 = 1671148774;
                    }
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    i8 = i8;
                    break;
                case 38339191:
                case 1306413065:
                    i8 = i8;
                    if ((s * s2) - i4 > 0) {
                        iM45029 = C19806.m45029("ܽۘ") ^ i9;
                        i = ((iM45029 ^ i10) * 16661) ^ 1109229898;
                        i2 = 884486886;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰ֨") ^ i10) * (-59);
                        i = ((iM45029 ^ i9) * (-22997)) ^ 1025214529;
                        i2 = -212913505;
                    }
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    i8 = i8;
                    break;
                case 146542490:
                case 905504220:
                    i8 = i8;
                    s2 = 15946;
                    if (C2124.f7782 <= 0) {
                        iM45029 = (C19806.m45029("ۖۤ") ^ i10) * (-31);
                        i = ((iM45029 ^ i9) * (-24309)) ^ (-887728499);
                        i2 = -122646641;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟ۢ") ^ i9;
                        i = ((iM45029 ^ i10) * 913) ^ (-1335121177);
                        i2 = 465377774;
                    }
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    i8 = i8;
                    break;
                case 282901523:
                case 1517988509:
                    break;
                case 624995427:
                case 754182097:
                    i8 = i8;
                    c = 328;
                    if (C1461.f5957 <= 0) {
                        iM45029 = (i10 - ThreadFactoryC3888.m11306("ᩳܰ")) * 47;
                        i = ((iM45029 ^ i9) * (-20687)) ^ (-467882170);
                        i2 = -1076741737;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۧ") ^ i9;
                        i = ((iM45029 ^ i10) * (-3191)) ^ (-483230169);
                        i2 = -909314170;
                    }
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    i8 = i8;
                    break;
                case 738306601:
                case 2046945410:
                    C1189.m4360(i13);
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        i8 = i8;
                        iM45029 = (C19806.m45029("ۖۤ") ^ i10) * (-31);
                        i = ((iM45029 ^ i9) * (-24309)) ^ (-887728499);
                        i2 = -122646641;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۧ") ^ i9;
                        i8 = i8;
                        i = ((iM45029 ^ i10) * (-32699)) ^ (-1214738750);
                        i2 = -344134307;
                    }
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    i8 = i8;
                    break;
                case 1031251258:
                case 1638594208:
                    i8 = i8;
                    iM11306 = ThreadFactoryC3888.m11306(RunnableC1564.m5344(sArr2, i6, i7, i5));
                    if (C0050.f912 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤܶ") + i9) * (-45);
                        i = ((iM45029 ^ i10) * (-14117)) ^ (-1826447861);
                        i2 = -346876998;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۖ") ^ i9;
                        i = ((iM45029 ^ i10) * (-28685)) ^ (-61615933);
                        i2 = -1177301239;
                    }
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    i8 = i8;
                    break;
                default:
                    if (C2477.m7593() >= 0) {
                        int iM450213 = C19806.m45029("ۛۖ") ^ i9;
                        i12 = iM450213 ^ (-1805412478);
                        i11 = ((iM450213 ^ i10) * (-8565)) ^ (-144837072);
                    } else {
                        i8 = i8;
                        iM45029 = (i10 - ThreadFactoryC3888.m11306("ᩳܰ")) * 47;
                        i = ((iM45029 ^ i9) * (-20687)) ^ (-467882170);
                        i2 = -1076741737;
                        i12 = iM45029 ^ i2;
                        i11 = i;
                        i8 = i8;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12565(ViewOnClickListenerC4514 viewOnClickListenerC4514, int i) throws Throwable {
        long j = 0;
        int i2 = 2050481824;
        int i3 = C3577.f13150;
        int i4 = C2642.f10294;
        int iM45029 = (i4 - C19806.m45029("ۤۙ")) * 43;
        int i5 = ((iM45029 ^ i3) * (-5855)) ^ (-1950345110);
        int i6 = -1609708496;
        while (true) {
            i2 = ((((i2 ^ i3) * (-11981)) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2129893451:
                case 1252074671:
                    j = 100;
                    iM45029 = ThreadFactoryC3888.m11306("ۗ۬") ^ i3;
                    i5 = ((iM45029 ^ i4) * (-13625)) ^ 1218726775;
                    i6 = -824335014;
                    break;
                case -2127298453:
                case 365755384:
                    if (C2477.f9839 <= 0) {
                        iM45029 = (C19806.m45029("۟۫") ^ i4) * (-51);
                        i5 = ((iM45029 ^ i3) * 27031) ^ 839213624;
                        i6 = 1500818918;
                    } else {
                        iM45029 = C19806.m45029("ܰ֫") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-11173)) ^ (-183519656);
                        i6 = 549321267;
                    }
                    break;
                case -1998762737:
                case 539267909:
                    if (C1148.f5161 <= 0) {
                        iM45029 = (i4 - C19806.m45029("᩹۠")) * 29;
                        i5 = ((iM45029 ^ i3) * (-27169)) ^ 213492799;
                        i6 = 1056744315;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ֨") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-20147)) ^ (-2028140351);
                        i6 = 465682504;
                    }
                    break;
                case -1556932699:
                case -686000363:
                    if (C1189.f5284 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ܺ") ^ i3) * (-109);
                        i5 = ((iM45029 ^ i4) * (-6443)) ^ 1466588223;
                        i6 = -683633753;
                    } else {
                        iM45029 = (C19806.m45029("۟۫") ^ i4) * (-51);
                        i5 = ((iM45029 ^ i3) * 27031) ^ 839213624;
                        i6 = 1500818918;
                    }
                    break;
                case -1430013636:
                case 472924271:
                    C19806.m45024();
                    if (C0278.f1572 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶᩳ") + i3) * (-65);
                        i5 = ((iM45029 ^ i4) * (-19843)) ^ (-1166980921);
                        i6 = 1704409775;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ܺ") ^ i3) * (-109);
                        i5 = ((iM45029 ^ i4) * (-6443)) ^ 1466588223;
                        i6 = -683633753;
                    }
                    break;
                case -1167041509:
                case 930269221:
                    if (C2871.m8646()) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿܰ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-11415)) ^ (-22804765);
                        i6 = 1522465366;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶᩳ") + i3) * (-65);
                        i5 = ((iM45029 ^ i4) * (-19843)) ^ (-1166980921);
                        i6 = 1704409775;
                    }
                    break;
                case -1057248725:
                case 591500282:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = (C19806.m45029("۟۫") ^ i4) * (-51);
                        i5 = ((iM45029 ^ i3) * 27031) ^ 839213624;
                        i6 = 1500818918;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۜܿ")) * 51;
                        i5 = ((iM45029 ^ i3) * 10887) ^ (-1511759458);
                        i6 = -1228033355;
                    }
                    break;
                case -1053658605:
                case 332017418:
                    C1148.m4232();
                    iM45029 = (C19806.m45029("۟۫") ^ i4) * (-51);
                    i5 = ((iM45029 ^ i3) * 27031) ^ 839213624;
                    i6 = 1500818918;
                    break;
                case -791737562:
                case 1160079293:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ܺ") ^ i3) * (-109);
                        i5 = ((iM45029 ^ i4) * (-6443)) ^ 1466588223;
                        i6 = -683633753;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖ۬") ^ i3) * (-27);
                        i5 = ((iM45029 ^ i4) * 28867) ^ (-418585512);
                        i6 = -1894680061;
                    }
                    break;
                case -734685921:
                case 493479354:
                    if (C3743.m10966() > 0) {
                        iM45029 = (i4 - C19806.m45029("ܿ᩵")) * (-11);
                        i5 = ((iM45029 ^ i3) * (-20751)) ^ 1073914119;
                        i6 = 1933639265;
                    } else {
                        iM45029 = (C19806.m45029("۟۫") ^ i4) * (-51);
                        i5 = ((iM45029 ^ i3) * 27031) ^ 839213624;
                        i6 = 1500818918;
                    }
                    break;
                case -481510775:
                case -285914073:
                    if (C1377.f5749) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ۟") ^ i3;
                        i5 = ((iM45029 ^ i4) * 5207) ^ 1832264428;
                        i6 = -290185416;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶᩳ") + i3) * (-65);
                        i5 = ((iM45029 ^ i4) * (-19843)) ^ (-1166980921);
                        i6 = 1704409775;
                    }
                    break;
                case -435369087:
                case 2038427785:
                    if (C0050.f912 <= 0) {
                        iM45029 = (i4 - C19806.m45029("᩹۠")) * 29;
                        i5 = ((iM45029 ^ i3) * (-27169)) ^ 213492799;
                        i6 = 1056744315;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻᩹") ^ i4;
                        i5 = ((iM45029 ^ i3) * 7301) ^ 176687104;
                        i6 = -1632881393;
                    }
                    break;
                case -433612890:
                case 564249270:
                    if (C3286.f12186) {
                        iM45029 = (i4 - C19806.m45029("ܿ᩵")) * (-11);
                        i5 = ((iM45029 ^ i3) * (-20751)) ^ 1073914119;
                        i6 = 1933639265;
                    } else {
                        iM45029 = C19806.m45029("۠ܿ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 14409) ^ (-1354023636);
                        i6 = -1756959894;
                    }
                    break;
                case -342047850:
                case -28795993:
                    break;
                case -50316832:
                case 8431188:
                    if (C1066.m4023() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶᩳ") + i3) * (-65);
                        i5 = ((iM45029 ^ i4) * (-19843)) ^ (-1166980921);
                        i6 = 1704409775;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸᩺") ^ i3) * q.h;
                        i5 = ((iM45029 ^ i4) * (-16933)) ^ (-457981795);
                        i6 = 1891309355;
                    }
                    break;
                case 50923318:
                case 1954121262:
                    if (C2249.m6915() <= 0) {
                        iM45029 = (C19806.m45029("۟۫") ^ i4) * (-51);
                        i5 = ((iM45029 ^ i3) * 27031) ^ 839213624;
                        i6 = 1500818918;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖܽ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 6739) ^ (-1858951870);
                        i6 = 1726239124;
                    }
                    break;
                case 1309231567:
                case 1410350588:
                    try {
                        SystemClock.sleep(j);
                        C12586 c12586 = viewOnClickListenerC4514.f16055;
                        viewOnClickListenerC4514.m12563(c12586.f42057.f2562, c12586.f42056, viewOnClickListenerC4514.f16064, i);
                        break;
                    } catch (Exception unused) {
                    }
                    iM45029 = ThreadFactoryC3888.m11306("᩺᩷") ^ i4;
                    i5 = ((iM45029 ^ i3) * 21117) ^ 1864397877;
                    i6 = -506417504;
                    break;
                default:
                    C0278.m1789();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0177  */
    public ViewOnClickListenerC4514() {
        int iM11306;
        int i;
        int i2 = -1971892657;
        int i3 = C1668.f6641;
        int i4 = RunnableC1606.f6488;
        int iM11307 = (ThreadFactoryC3888.m11306("ᩳ֫") + i4) * (-35);
        int i5 = ((iM11307 ^ i3) * (-13865)) ^ 2039356024;
        int i6 = 1814143710;
        while (true) {
            int i7 = iM11307 ^ i6;
            AtomicInteger atomicInteger = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 3083) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2099460204:
                    case 209937485:
                        if (C1189.f5284 > 0) {
                            this.f16048 = new AtomicInteger();
                            return;
                        }
                        iM11306 = (C19806.m45029("ܿᩳ") ^ i4) * 61;
                        i5 = ((iM11306 ^ i3) * (-32261)) ^ (-1516123240);
                        i = -1126201424;
                        i7 = iM11306 ^ i;
                        break;
                    case -1970541655:
                    case 1938662709:
                        if (ViewGroupOnHierarchyChangeListenerC1916.m6233() == 0) {
                        }
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܽۛ")) * 65;
                        i5 = ((iM11306 ^ i4) * 26039) ^ (-778831);
                        i = 1717981509;
                        i7 = iM11306 ^ i;
                        break;
                    case -1902909184:
                    case -85040766:
                        this.f16053 = atomicInteger;
                        if (C2642.f10294 <= 0) {
                            iM11306 = (C19806.m45029("ܿᩳ") ^ i4) * 61;
                            i5 = ((iM11306 ^ i3) * (-32261)) ^ (-1516123240);
                            i = -1126201424;
                        } else {
                            this.f16064 = new AtomicInteger();
                            if (C0817.f3443) {
                                iM11306 = (i4 - ThreadFactoryC3888.m11306("ܶۗ")) * 25;
                                i5 = ((iM11306 ^ i3) * 25101) ^ 888080601;
                                i = -383665141;
                            } else {
                                iM11306 = (i3 - ThreadFactoryC3888.m11306("ܽۛ")) * 65;
                                i5 = ((iM11306 ^ i4) * 26039) ^ (-778831);
                                i = 1717981509;
                            }
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -1701155284:
                    case -1166620347:
                        CallableC1627.m5507();
                        if (C3577.f13150 < 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("۫ۡ") ^ i4) * 9;
                            i5 = ((iM11306 ^ i3) * (-31223)) ^ 1010033397;
                            i = -469463977;
                        } else {
                            iM11306 = C19806.m45029("ۖ۬") ^ i3;
                            i5 = ((iM11306 ^ i4) * 30489) ^ 1142838028;
                            i = -66806703;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -1287738307:
                    case 1803463192:
                        C3722.m10894();
                        if (C7105.f23796 < 0) {
                            iM11306 = (i3 - ThreadFactoryC3888.m11306("ܽۛ")) * 65;
                            i5 = ((iM11306 ^ i4) * 26039) ^ (-778831);
                            i = 1717981509;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("۫ۡ") ^ i4) * 9;
                            i5 = ((iM11306 ^ i3) * (-31223)) ^ 1010033397;
                            i = -469463977;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -862296979:
                    case 1410287456:
                        if (C3722.f13525 > 0) {
                            atomicInteger = new AtomicInteger();
                            if (!ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                                iM11306 = ThreadFactoryC3888.m11306("۠ۘ") ^ i3;
                                i5 = ((iM11306 ^ i4) * (-2223)) ^ 1718173421;
                                i = 434757223;
                                i7 = iM11306 ^ i;
                            }
                        }
                        break;
                    case -532948927:
                    case -526864001:
                        if (C1148.f5161 <= 0) {
                            iM11306 = (i3 - ThreadFactoryC3888.m11306("ܽۛ")) * 65;
                            i5 = ((iM11306 ^ i4) * 26039) ^ (-778831);
                            i = 1717981509;
                        } else {
                            iM11306 = (C19806.m45029("᩶۟") ^ i4) * 89;
                            i5 = ((iM11306 ^ i3) * 25281) ^ 1391007220;
                            i = 6938818;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 329059556:
                    case 615997738:
                        C2249.m6915();
                        throw new RuntimeException();
                    case 580225500:
                    case 804633466:
                        if (C0050.m946() <= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("۫ۡ") ^ i4) * 9;
                            i5 = ((iM11306 ^ i3) * (-31223)) ^ 1010033397;
                            i = -469463977;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۧ۟") ^ i4) * (-95);
                            i5 = ((iM11306 ^ i3) * 8755) ^ (-1133200976);
                            i = 85372928;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 605390235:
                    case 1137807324:
                        C0278.m1789();
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܽۛ")) * 65;
                        i5 = ((iM11306 ^ i4) * 26039) ^ (-778831);
                        i = 1717981509;
                        i7 = iM11306 ^ i;
                        break;
                    case 761428591:
                    case 1496146542:
                        this.f16059 = true;
                        if (C1148.f5161 <= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("۫ۡ") ^ i4) * 9;
                            i5 = ((iM11306 ^ i3) * (-31223)) ^ 1010033397;
                            i = -469463977;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۙۙ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 23191) ^ 1118706535;
                            i = -1242579357;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 1602407721:
                    case 1634686987:
                        if (C1977.f7413 <= 0) {
                            iM11306 = (i3 - ThreadFactoryC3888.m11306("ܽۛ")) * 65;
                            i5 = ((iM11306 ^ i4) * 26039) ^ (-778831);
                            i = 1717981509;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۡۚ") ^ i4) * 127;
                            i5 = ((iM11306 ^ i3) * 32517) ^ 1064001197;
                            i = 926167506;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    default:
                        if (!C3743.f13569) {
                        }
                        iM11306 = C19806.m45029("֡ܰ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 30137) ^ (-2003734634);
                        i = 2000781681;
                        i7 = iM11306 ^ i;
                        break;
                        break;
                }
            }
            iM11307 = (i3 - ThreadFactoryC3888.m11306("ܶۧ")) * (-55);
            i5 = ((iM11307 ^ i4) * 26815) ^ (-510065667);
            i6 = 1356671365;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00f0 A[PHI: r3
      0x00f0: PHI (r3v2 java.lang.Integer) = (r3v1 java.lang.Integer), (r3v3 java.lang.Integer) binds: [B:9:0x0055, B:6:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0130 A[PHI: r2 r7 r14 r15 r21
      0x0130: PHI (r2v4 int) = (r2v1 int), (r2v1 int), (r2v1 int), (r2v1 int), (r2v1 int), (r2v7 int) binds: [B:27:0x00b2, B:17:0x006d, B:15:0x0069, B:12:0x005e, B:9:0x0055, B:38:0x012e] A[DONT_GENERATE, DONT_INLINE]
      0x0130: PHI (r7v5 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:27:0x00b2, B:17:0x006d, B:15:0x0069, B:12:0x005e, B:9:0x0055, B:38:0x012e] A[DONT_GENERATE, DONT_INLINE]
      0x0130: PHI (r14v4 short[]) = (r14v2 short[]), (r14v1 short[]), (r14v1 short[]), (r14v1 short[]), (r14v1 short[]), (r14v1 short[]) binds: [B:27:0x00b2, B:17:0x006d, B:15:0x0069, B:12:0x005e, B:9:0x0055, B:38:0x012e] A[DONT_GENERATE, DONT_INLINE]
      0x0130: PHI (r15v4 int) = (r15v2 int), (r15v1 int), (r15v1 int), (r15v1 int), (r15v1 int), (r15v1 int) binds: [B:27:0x00b2, B:17:0x006d, B:15:0x0069, B:12:0x005e, B:9:0x0055, B:38:0x012e] A[DONT_GENERATE, DONT_INLINE]
      0x0130: PHI (r21v3 int) = (r21v1 int), (r21v1 int), (r21v1 int), (r21v1 int), (r21v1 int), (r21v5 int) binds: [B:27:0x00b2, B:17:0x006d, B:15:0x0069, B:12:0x005e, B:9:0x0055, B:38:0x012e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0244 A[PHI: r5 r6 r10 r11 r12
      0x0244: PHI (r5v4 java.lang.String) = 
      (r5v1 java.lang.String)
      (r5v1 java.lang.String)
      (r5v3 java.lang.String)
      (r5v1 java.lang.String)
      (r5v1 java.lang.String)
     binds: [B:63:0x0242, B:59:0x0223, B:44:0x017d, B:23:0x008f, B:15:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r6v3 int) = (r6v1 int), (r6v1 int), (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:63:0x0242, B:59:0x0223, B:44:0x017d, B:23:0x008f, B:15:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r10v3 int) = (r10v2 int), (r10v1 int), (r10v1 int), (r10v1 int), (r10v1 int) binds: [B:63:0x0242, B:59:0x0223, B:44:0x017d, B:23:0x008f, B:15:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int), (r11v1 int), (r11v1 int) binds: [B:63:0x0242, B:59:0x0223, B:44:0x017d, B:23:0x008f, B:15:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int), (r12v1 int), (r12v1 int) binds: [B:63:0x0242, B:59:0x0223, B:44:0x017d, B:23:0x008f, B:15:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0277 A[PHI: r9
      0x0277: PHI (r9v3 short) = (r9v2 short), (r9v1 short) binds: [B:67:0x0275, B:12:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02ad A[PHI: r4 r16 r22
      0x02ad: PHI (r4v2 java.lang.Object[]) = (r4v1 java.lang.Object[]), (r4v3 java.lang.Object[]) binds: [B:71:0x02ab, B:31:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]) binds: [B:71:0x02ab, B:31:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r22v5 char) = (r22v4 char), (r22v3 char) binds: [B:71:0x02ab, B:31:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public void m12584() {
        int iM11306;
        int i;
        int i2;
        int i3 = 0;
        Integer numM4234 = null;
        Object[] objArr = null;
        String strM8640 = null;
        int iM45029 = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr = null;
        int i8 = 0;
        int i9 = 109002883;
        int i10 = C1937.f7317;
        int i11 = C1419.f5860;
        int iM11307 = ThreadFactoryC3888.m11306("ۗܶ") ^ i10;
        int i12 = ((iM11307 ^ i11) * 13319) ^ (-448662434);
        int i13 = iM11307 ^ 1040858182;
        short[] sArr2 = null;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i11) * (-11483)) >> 31));
            switch (i9) {
                case -2133767705:
                case 346825858:
                    C1937.m6279();
                    if (C1460.f5948 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ۗ") ^ i10;
                        i = ((iM11306 ^ i11) * 23587) ^ (-813389455);
                        i2 = -1059062222;
                    } else {
                        iM11306 = C19806.m45029("ۡᩴ") ^ i10;
                        i = ((iM11306 ^ i11) * 6103) ^ 1983832919;
                        i2 = -1732700897;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -2016148798:
                case 513324106:
                    i7 = 13717;
                    iM11306 = C19806.m45029("ۗۤ") ^ i10;
                    i = ((iM11306 ^ i11) * 18757) ^ 675641182;
                    i2 = 943665653;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1681336964:
                case 1372301100:
                    s = sArr2[c];
                    if (C7105.f23796 >= 0) {
                        iM11306 = C19806.m45029("ۡᩴ") ^ i10;
                        i = ((iM11306 ^ i11) * 6103) ^ 1983832919;
                        i2 = -1732700897;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽܿ") ^ i10) * (-109);
                        i = ((iM11306 ^ i11) * 31471) ^ (-1475634240);
                        i2 = 1405673216;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1300075271:
                case -488484607:
                    iM45029 = C19806.m45029(C0216.m1588(sArr, i8, i14, i7));
                    if (C1377.f5749) {
                        iM11306 = (C19806.m45029("ᩴۤ") ^ i11) * 23;
                        i = ((iM11306 ^ i10) * (-20087)) ^ (-1731166404);
                        i2 = -327881775;
                    } else {
                        iM11306 = C19806.m45029("ۜ۫") ^ i11;
                        i = ((iM11306 ^ i10) * 28243) ^ 1037115657;
                        i2 = 1839136467;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1270098862:
                case -709455340:
                    sArr2 = f16037;
                    c = 293;
                    if (RunnableC3388.m10064()) {
                        iM11306 = (ThreadFactoryC3888.m11306("֨᩶") ^ i11) * 95;
                        i = ((iM11306 ^ i10) * (-25367)) ^ 1807355865;
                        i2 = -579905616;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ᩴ") ^ i10;
                        i = ((iM11306 ^ i11) * 14087) ^ (-159256448);
                        i2 = -1670485396;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1256260948:
                case -674621109:
                    objArr = new Object[]{numM4234};
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = C19806.m45029("ۨᩴ") ^ i11;
                        i = ((iM11306 ^ i10) * (-10133)) ^ 1605248264;
                        i2 = -793572837;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ᩴ") ^ i10;
                        i = ((iM11306 ^ i11) * 14087) ^ (-159256448);
                        i2 = -1670485396;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1203885018:
                case -157111449:
                    C1875.m6086();
                    C1066.m4023();
                    iM11306 = ThreadFactoryC3888.m11306("֡ۗ") ^ i10;
                    i = ((iM11306 ^ i11) * 23587) ^ (-813389455);
                    i2 = -1059062222;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1137565336:
                case -572699977:
                    setTitle(C1875.m6104(this, 2100571269 ^ iM45029, objArr));
                    break;
                case -1099377110:
                case 1929744321:
                    C1461.m5080();
                    if (RunnableC0195.m1431()) {
                        iM11306 = C19806.m45029("ۜ۫") ^ i11;
                        i = ((iM11306 ^ i10) * 28243) ^ 1037115657;
                        i2 = 1839136467;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡ۗ") ^ i10;
                        i = ((iM11306 ^ i11) * 23587) ^ (-813389455);
                        i2 = -1059062222;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -1095191778:
                case -985789295:
                    if ((i6 + 1) - i5 > 0) {
                        iM11306 = (C19806.m45029("ۡܳ") ^ i11) * 17;
                        i = ((iM11306 ^ i10) * (-28655)) ^ (-1734370883);
                        i2 = 825659842;
                    } else {
                        iM11306 = (i10 - C19806.m45029("֨ܽ")) * (-91);
                        i = ((iM11306 ^ i11) * 13203) ^ (-861319381);
                        i2 = 1085223147;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -746348939:
                case 311468617:
                    if (this.f16057) {
                        iM11306 = C19806.m45029("᩶ۨ") ^ i10;
                        i = ((iM11306 ^ i11) * 21341) ^ (-83092296);
                        i2 = -93469291;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙ۠") + i11) * 97;
                        i = ((iM11306 ^ i10) * 7991) ^ (-307292475);
                        i2 = -522674597;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -739687180:
                case -209870115:
                    i4 = s + 1;
                    if (C0526.m2437() >= 0) {
                        iM11306 = C19806.m45029("ۜ۫") ^ i11;
                        i = ((iM11306 ^ i10) * 28243) ^ 1037115657;
                        i2 = 1839136467;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۗ") ^ i11) * (-99);
                        i = ((iM11306 ^ i10) * 16315) ^ (-1329015056);
                        i2 = -1129834571;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -582269154:
                case 273662028:
                    i5 = i4 * i4;
                    i6 = s * 2;
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = C19806.m45029("ۜ۫") ^ i11;
                        i = ((iM11306 ^ i10) * 28243) ^ 1037115657;
                        i2 = 1839136467;
                    } else {
                        iM11306 = C19806.m45029("֫᩹") ^ i10;
                        i = ((iM11306 ^ i11) * 13707) ^ (-791281028);
                        i2 = 1426328669;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case -407860742:
                case 2010206296:
                    C1668.m5583();
                    if (C0962.m3746() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ۗ") ^ i10;
                        i = ((iM11306 ^ i11) * 23587) ^ (-813389455);
                        i2 = -1059062222;
                    } else {
                        iM11306 = (C19806.m45029("ۡ᩸") + i11) * (-11);
                        i = ((iM11306 ^ i10) * 2159) ^ (-568088931);
                        i2 = -960926105;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case 85193709:
                case 625695276:
                    sArr = f16037;
                    i8 = 297;
                    i14 = 3;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ۗ") ^ i10;
                        i = ((iM11306 ^ i11) * 23587) ^ (-813389455);
                        i2 = -1059062222;
                    } else {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ᩴۗ")) * 53;
                        i = ((iM11306 ^ i11) * 7843) ^ 1191662912;
                        i2 = 2145088107;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case 245270520:
                case 610682728:
                    setTitle(ThreadFactoryC3888.m11306(strM8640) ^ 2119884861);
                    break;
                case 288243546:
                case 1229823659:
                    strM8640 = C2871.m8640(f16037, 294, 3, i7);
                    if (C0962.f3784) {
                        iM11306 = C19806.m45029("ۜ۫") ^ i11;
                        i = ((iM11306 ^ i10) * 28243) ^ 1037115657;
                        i2 = 1839136467;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۘ") ^ i11;
                        i = ((iM11306 ^ i10) * 3101) ^ 1250048977;
                        i2 = -616666912;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                case 299011018:
                case 1605582851:
                    int i16 = this.f16044.f42060;
                    i3 = this.f16055.f42060;
                    if (C0526.m2437() >= 0) {
                        i15 = i16;
                        iM11306 = ThreadFactoryC3888.m11306("֡ۗ") ^ i10;
                        i = ((iM11306 ^ i11) * 23587) ^ (-813389455);
                        i2 = -1059062222;
                        i13 = iM11306 ^ i2;
                        i12 = i;
                    } else {
                        int iM450210 = (C19806.m45029("ܰۡ") ^ i11) * 101;
                        i12 = ((iM450210 ^ i10) * (-23015)) ^ (-1305512312);
                        i15 = i16;
                        i13 = iM450210 ^ 184187533;
                    }
                    break;
                case 727924233:
                case 849692827:
                    C0050.m946();
                    break;
                case 1285422366:
                case 1961630163:
                    i7 = 2547;
                    iM11306 = C19806.m45029("ۗۤ") ^ i10;
                    i = ((iM11306 ^ i11) * 18757) ^ 675641182;
                    i2 = 943665653;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
                default:
                    numM4234 = C1148.m4234(i15 + i3);
                    if (C2704.f10408) {
                        iM11306 = (C19806.m45029("᩹ܺ") ^ i10) * 95;
                        i = ((iM11306 ^ i11) * (-15921)) ^ (-1275332811);
                        i2 = -824123560;
                    } else {
                        iM11306 = (C19806.m45029("ۡ᩸") + i11) * (-11);
                        i = ((iM11306 ^ i10) * 2159) ^ (-568088931);
                        i2 = -960926105;
                    }
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0334 A[PHI: r5 r13 r36 r37
      0x0334: PHI (r5v3 com.google.android.material.floatingactionbutton.FloatingActionButton) = 
      (r5v2 com.google.android.material.floatingactionbutton.FloatingActionButton)
      (r5v5 com.google.android.material.floatingactionbutton.FloatingActionButton)
     binds: [B:53:0x0332, B:47:0x02bb] A[DONT_GENERATE, DONT_INLINE]
      0x0334: PHI (r13v4 int) = (r13v3 int), (r13v2 int) binds: [B:53:0x0332, B:47:0x02bb] A[DONT_GENERATE, DONT_INLINE]
      0x0334: PHI (r36v11 int) = (r36v9 int), (r36v12 int) binds: [B:53:0x0332, B:47:0x02bb] A[DONT_GENERATE, DONT_INLINE]
      0x0334: PHI (r37v3 short[]) = (r37v2 short[]), (r37v1 short[]) binds: [B:53:0x0332, B:47:0x02bb] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int iM45029;
        int i2;
        int i3;
        int iM11306;
        int i4;
        int i5;
        short[] sArr;
        int iM11307;
        int i6;
        int i7;
        int iM11308;
        int i8;
        int i9;
        int i10;
        int i11;
        int iM11309;
        int i12;
        int i13;
        int i14;
        short[] sArr2;
        short[] sArr3;
        short[] sArr4;
        int iM113010;
        int i15;
        int i16;
        FloatingActionButton floatingActionButton;
        short[] sArr5;
        short[] sArr6;
        int i17;
        int i18;
        int i19;
        int i20 = 0;
        int i21 = 0;
        int i22 = 1401651824;
        int i23 = C10634.f36300;
        int i24 = C2124.f7782;
        int iM450210 = (C19806.m45029("᩺ۜ") ^ i23) * 27;
        int i25 = ((iM450210 ^ i24) * 32157) ^ 844968726;
        int i26 = iM450210 ^ 1978789381;
        View viewM7083 = null;
        FloatingActionButton floatingActionButton2 = null;
        String strM10423 = null;
        String strM4969 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int iM113011 = 0;
        int iM113012 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        FloatingActionButton floatingActionButton3 = null;
        int i33 = 0;
        int i34 = 0;
        short s = 0;
        FloatingActionButton floatingActionButton4 = null;
        C6938 c6938 = null;
        short[] sArr11 = null;
        int iM450211 = 0;
        C19383 c19383 = null;
        short[] sArr12 = null;
        int iM450212 = 0;
        C19383 c19384 = null;
        TabLayout tabLayout = null;
        boolean z = false;
        while (true) {
            i22 = i26 ^ (i25 & (((i22 ^ i24) * (-15917)) >> 31));
            switch (i22) {
                case -2118938881:
                case -478606617:
                    c19383.m44422(new C6941(this));
                    tabLayout.setupWithViewPager(this.f16050);
                    c6938 = this.f41645;
                    sArr10 = f16037;
                    i27 = 500;
                    if (C0050.m946() > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨᩸") ^ i23;
                        i2 = ((iM11306 ^ i24) * (-29213)) ^ (-1012899280);
                        i4 = -1217857891;
                        i26 = iM11306 ^ i4;
                        i25 = i2;
                    } else {
                        int i35 = i34;
                        sArr11 = sArr11;
                        i33 = i33;
                        i5 = i35;
                        short[] sArr13 = sArr8;
                        sArr7 = sArr7;
                        sArr = sArr13;
                        int iM113013 = (ThreadFactoryC3888.m11306("۠᩵") + i23) * (-105);
                        i6 = ((iM113013 ^ i24) * 9243) ^ 1477217444;
                        i26 = iM113013 ^ 2022872714;
                        i25 = i6;
                        int i36 = i5;
                        i33 = i33;
                        sArr11 = sArr11;
                        i34 = i36;
                        short[] sArr14 = sArr7;
                        sArr8 = sArr;
                        sArr7 = sArr14;
                    }
                    break;
                case -1937371109:
                case 863976671:
                    i = i27;
                    this.f16043 = (FloatingActionButton) C2332.m7083(this, iM450211);
                    sArr9 = f16037;
                    iM45029 = ThreadFactoryC3888.m11306("᩺ۗ") ^ i24;
                    i2 = ((iM45029 ^ i23) * (-12973)) ^ 1890324345;
                    i3 = 1673569846;
                    int i37 = iM45029 ^ i3;
                    i27 = i;
                    i26 = i37;
                    i25 = i2;
                    break;
                case -1921520930:
                case 341318560:
                    i = i27;
                    floatingActionButton4 = (FloatingActionButton) C2332.m7083(this, ThreadFactoryC3888.m11306(C3743.m10964(sArr9, 491, 3, i28)) ^ 2098046007);
                    if (C1460.f5948 >= 0) {
                        iM45029 = (C19806.m45029("᩻ۢ") ^ i24) * (-5);
                        i2 = ((iM45029 ^ i23) * (-26923)) ^ (-1858905954);
                        i3 = 901197891;
                    } else {
                        iM45029 = (i23 - ThreadFactoryC3888.m11306("᩷۬")) * 95;
                        i2 = ((iM45029 ^ i24) * (-10507)) ^ 30217434;
                        i3 = -965480315;
                    }
                    int i38 = iM45029 ^ i3;
                    i27 = i;
                    i26 = i38;
                    i25 = i2;
                    break;
                case -1902113059:
                case -614245675:
                    i27 = i27;
                    int i39 = i34;
                    sArr11 = sArr11;
                    i33 = i33;
                    i5 = i39;
                    short[] sArr15 = sArr8;
                    sArr7 = sArr7;
                    sArr = sArr15;
                    C2332.m7083(this, C19806.m45029(strM10423) ^ 2120472511);
                    if (!C0962.f3784) {
                        iM11307 = ThreadFactoryC3888.m11306("ۧۜ") ^ i24;
                        i6 = ((iM11307 ^ i23) * (-27815)) ^ (-1400650562);
                        i7 = 1343642202;
                        i10 = iM11307 ^ i7;
                        i27 = i27;
                        i26 = i10;
                        i25 = i6;
                        int i310 = i5;
                        i33 = i33;
                        sArr11 = sArr11;
                        i34 = i310;
                        short[] sArr16 = sArr7;
                        sArr8 = sArr;
                        sArr7 = sArr16;
                    } else {
                        i27 = i27;
                        int iM113014 = (ThreadFactoryC3888.m11306("۠᩵") + i23) * (-105);
                        i6 = ((iM113014 ^ i24) * 9243) ^ 1477217444;
                        i26 = iM113014 ^ 2022872714;
                        i25 = i6;
                        int i311 = i5;
                        i33 = i33;
                        sArr11 = sArr11;
                        i34 = i311;
                        short[] sArr17 = sArr7;
                        sArr8 = sArr;
                        sArr7 = sArr17;
                    }
                    break;
                case -1844491491:
                case -548538111:
                    i27 = i27;
                    int i40 = i34;
                    sArr11 = sArr11;
                    i33 = i33;
                    i5 = i40;
                    short[] sArr18 = sArr8;
                    sArr7 = sArr7;
                    sArr = sArr18;
                    super.onCreate(bundle);
                    m31023();
                    strM10423 = C3535.m10423(f16037, 473, 3, i28);
                    iM11307 = C19806.m45029("᩹ۚ") ^ i23;
                    i6 = ((iM11307 ^ i24) * (-18225)) ^ 370321639;
                    i7 = 1684315455;
                    i10 = iM11307 ^ i7;
                    i27 = i27;
                    i26 = i10;
                    i25 = i6;
                    int i312 = i5;
                    i33 = i33;
                    sArr11 = sArr11;
                    i34 = i312;
                    short[] sArr19 = sArr7;
                    sArr8 = sArr;
                    sArr7 = sArr19;
                    break;
                case -1672684131:
                case -893737703:
                    i11 = i32;
                    int i41 = i34;
                    sArr11 = sArr11;
                    i5 = i41;
                    sArr = sArr8;
                    C14494 onBackPressedDispatcher = getOnBackPressedDispatcher();
                    C7647 c7647 = new C7647(this);
                    C0526.m2429(onBackPressedDispatcher);
                    onBackPressedDispatcher.m34905(c7647);
                    iM11309 = (i24 - C19806.m45029("᩺ܽ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i6 = ((iM11309 ^ i23) * 15025) ^ 1396266843;
                    i12 = -59792128;
                    i10 = iM11309 ^ i12;
                    i32 = i11;
                    i27 = i27;
                    i26 = i10;
                    i25 = i6;
                    int i313 = i5;
                    i33 = i33;
                    sArr11 = sArr11;
                    i34 = i313;
                    short[] sArr110 = sArr7;
                    sArr8 = sArr;
                    sArr7 = sArr110;
                    break;
                case -1615627449:
                case 589597314:
                    C2788.m8472();
                    if (RunnableC1606.f6488 < 0) {
                        int i314 = i34;
                        sArr11 = sArr11;
                        i33 = i33;
                        i5 = i314;
                        short[] sArr111 = sArr8;
                        sArr7 = sArr7;
                        sArr = sArr111;
                        int iM113015 = (ThreadFactoryC3888.m11306("۠᩵") + i23) * (-105);
                        i6 = ((iM113015 ^ i24) * 9243) ^ 1477217444;
                        i26 = iM113015 ^ 2022872714;
                        i25 = i6;
                        int i315 = i5;
                        i33 = i33;
                        sArr11 = sArr11;
                        i34 = i315;
                        short[] sArr112 = sArr7;
                        sArr8 = sArr;
                        sArr7 = sArr112;
                    } else {
                        i = i27;
                        sArr4 = sArr11;
                        i13 = i33;
                        i14 = i34;
                        short[] sArr20 = sArr8;
                        sArr2 = sArr7;
                        sArr3 = sArr20;
                        iM113010 = (i23 - ThreadFactoryC3888.m11306("ۡ᩷")) * 127;
                        i15 = ((iM113010 ^ i24) * 17061) ^ 1988873110;
                        i16 = 1559513464;
                        int i42 = iM113010 ^ i16;
                        i34 = i14;
                        i33 = i13;
                        sArr11 = sArr4;
                        i25 = i15;
                        i27 = i;
                        i26 = i42;
                        short[] sArr21 = sArr2;
                        sArr8 = sArr3;
                        sArr7 = sArr21;
                    }
                    break;
                case -1611266893:
                case -455467547:
                    C2871.m8646();
                    if (C0671.f2816 == 0) {
                        i27 = i27;
                        int i43 = i34;
                        sArr11 = sArr11;
                        i33 = i33;
                        i5 = i43;
                        short[] sArr22 = sArr8;
                        sArr7 = sArr7;
                        sArr = sArr22;
                        iM11307 = (C19806.m45029("ۧۖ") ^ i24) * q.h;
                        i6 = ((iM11307 ^ i23) * 24465) ^ (-57088456);
                        i7 = 942508192;
                        i10 = iM11307 ^ i7;
                        i27 = i27;
                        i26 = i10;
                        i25 = i6;
                        int i316 = i5;
                        i33 = i33;
                        sArr11 = sArr11;
                        i34 = i316;
                        short[] sArr113 = sArr7;
                        sArr8 = sArr;
                        sArr7 = sArr113;
                    } else {
                        i = i27;
                        floatingActionButton = floatingActionButton3;
                        sArr6 = sArr7;
                        sArr5 = sArr8;
                        int iM450213 = C19806.m45029("᩶ۨ") ^ i24;
                        floatingActionButton3 = floatingActionButton;
                        i25 = ((iM450213 ^ i23) * (-23861)) ^ 486826659;
                        sArr8 = sArr5;
                        sArr7 = sArr6;
                        i19 = i;
                        i26 = iM450213 ^ 680351884;
                        i27 = i19;
                    }
                    break;
                case -1567850919:
                case -1326811183:
                    short[] sArr23 = sArr11;
                    int i44 = i31;
                    i11 = i32;
                    i5 = i34;
                    sArr = sArr8;
                    sArr11 = sArr23;
                    floatingActionButton3 = (FloatingActionButton) C2332.m7083(this, C19806.m45029(C3722.m10901(sArr23, i44, i11, i28)) ^ 2098135745);
                    iM11309 = C19806.m45029("۬۟") ^ i23;
                    i31 = i44;
                    i6 = ((iM11309 ^ i24) * 21083) ^ (-1639897601);
                    i12 = -2046909501;
                    i10 = iM11309 ^ i12;
                    i32 = i11;
                    i27 = i27;
                    i26 = i10;
                    i25 = i6;
                    int i317 = i5;
                    i33 = i33;
                    sArr11 = sArr11;
                    i34 = i317;
                    short[] sArr114 = sArr7;
                    sArr8 = sArr;
                    sArr7 = sArr114;
                    break;
                case -1471328226:
                case -1088218663:
                    this.f16061.m5029(new C23170(this));
                    mo2119();
                    this.f16045 = ViewOnClickListenerC8374.m21926(this, new C17503(this));
                    break;
                case -1246465634:
                case 1657301074:
                    i = i27;
                    z = true;
                    this.f16044 = new C12586(this, true);
                    if (C0629.f2722 > 0) {
                        iM45029 = C19806.m45029("ۛ֫") ^ i24;
                        i2 = ((iM45029 ^ i23) * (-16303)) ^ 150922059;
                        i3 = 436167416;
                        int i318 = iM45029 ^ i3;
                        i27 = i;
                        i26 = i318;
                        i25 = i2;
                    } else {
                        i27 = i;
                        int i319 = i34;
                        sArr11 = sArr11;
                        i33 = i33;
                        i5 = i319;
                        short[] sArr115 = sArr8;
                        sArr7 = sArr7;
                        sArr = sArr115;
                        int iM113016 = (ThreadFactoryC3888.m11306("۠᩵") + i23) * (-105);
                        i6 = ((iM113016 ^ i24) * 9243) ^ 1477217444;
                        i26 = iM113016 ^ 2022872714;
                        i25 = i6;
                        int i3110 = i5;
                        i33 = i33;
                        sArr11 = sArr11;
                        i34 = i3110;
                        short[] sArr116 = sArr7;
                        sArr8 = sArr;
                        sArr7 = sArr116;
                    }
                    break;
                case -1011889857:
                case 598377710:
                    i11 = i32;
                    int i45 = i34;
                    sArr11 = sArr11;
                    i5 = i45;
                    sArr = sArr8;
                    C6938 c6939 = (C6938) C2332.m7083(this, iM113012 ^ i30);
                    this.f41645 = c6939;
                    C0216.m1585(this, c6939);
                    iM11309 = (ThreadFactoryC3888.m11306("۠ۖ") + i24) * 39;
                    i6 = ((iM11309 ^ i23) * 20879) ^ (-894944016);
                    i12 = -228046018;
                    i10 = iM11309 ^ i12;
                    i32 = i11;
                    i27 = i27;
                    i26 = i10;
                    i25 = i6;
                    int i3111 = i5;
                    i33 = i33;
                    sArr11 = sArr11;
                    i34 = i3111;
                    short[] sArr117 = sArr7;
                    sArr8 = sArr;
                    sArr7 = sArr117;
                    break;
                case -883358877:
                case 1593235732:
                    C1668.m5583();
                    C3577.m10565();
                    i = i27;
                    floatingActionButton = floatingActionButton3;
                    sArr6 = sArr7;
                    sArr5 = sArr8;
                    int iM450214 = C19806.m45029("᩶ۨ") ^ i24;
                    floatingActionButton3 = floatingActionButton;
                    i25 = ((iM450214 ^ i23) * (-23861)) ^ 486826659;
                    sArr8 = sArr5;
                    sArr7 = sArr6;
                    i19 = i;
                    i26 = iM450214 ^ 680351884;
                    i27 = i19;
                    break;
                case -788537627:
                case 989496027:
                    i = i27;
                    floatingActionButton = floatingActionButton3;
                    sArr5 = sArr8;
                    this.f16052 = floatingActionButton;
                    sArr6 = f16037;
                    i33 = 485;
                    i34 = 3;
                    if (C3743.m10966() <= 0) {
                        int iM450215 = C19806.m45029("᩶ۨ") ^ i24;
                        floatingActionButton3 = floatingActionButton;
                        i25 = ((iM450215 ^ i23) * (-23861)) ^ 486826659;
                        sArr8 = sArr5;
                        sArr7 = sArr6;
                        i19 = i;
                        i26 = iM450215 ^ 680351884;
                    } else {
                        floatingActionButton3 = floatingActionButton;
                        int iM113017 = ThreadFactoryC3888.m11306("ܿۡ") ^ i24;
                        i17 = ((iM113017 ^ i23) * 21681) ^ (-862631303);
                        i18 = iM113017 ^ 1574129268;
                        sArr8 = sArr5;
                        sArr7 = sArr6;
                        i19 = i;
                        i26 = i18;
                        i25 = i17;
                    }
                    i27 = i19;
                    break;
                case -570383734:
                case -284984057:
                    if (C1148.f5161 <= 0) {
                        i = i27;
                        sArr4 = sArr11;
                        i13 = i33;
                        i14 = i34;
                        short[] sArr24 = sArr8;
                        sArr2 = sArr7;
                        sArr3 = sArr24;
                        iM113010 = (i23 - ThreadFactoryC3888.m11306("ۡ᩷")) * 127;
                        i15 = ((iM113010 ^ i24) * 17061) ^ 1988873110;
                        i16 = 1559513464;
                        int i46 = iM113010 ^ i16;
                        i34 = i14;
                        i33 = i13;
                        sArr11 = sArr4;
                        i25 = i15;
                        i27 = i;
                        i26 = i46;
                        short[] sArr25 = sArr2;
                        sArr8 = sArr3;
                        sArr7 = sArr25;
                    } else {
                        i27 = i27;
                        int i47 = i34;
                        sArr11 = sArr11;
                        i33 = i33;
                        i5 = i47;
                        short[] sArr26 = sArr8;
                        sArr7 = sArr7;
                        sArr = sArr26;
                        iM11307 = (C19806.m45029("ۧۖ") ^ i24) * q.h;
                        i6 = ((iM11307 ^ i23) * 24465) ^ (-57088456);
                        i7 = 942508192;
                        i10 = iM11307 ^ i7;
                        i27 = i27;
                        i26 = i10;
                        i25 = i6;
                        int i3112 = i5;
                        i33 = i33;
                        sArr11 = sArr11;
                        i34 = i3112;
                        short[] sArr118 = sArr7;
                        sArr8 = sArr;
                        sArr7 = sArr118;
                    }
                    break;
                case -483216928:
                case -207785494:
                    int i48 = i27;
                    int i49 = i34;
                    short[] sArr27 = sArr11;
                    int i50 = i33;
                    short[] sArr28 = sArr8;
                    short[] sArr29 = sArr7;
                    short s2 = s;
                    if ((i20 + i21) - (s2 * 13552) >= 0) {
                        iM11308 = ThreadFactoryC3888.m11306("ᩴ֡") ^ i23;
                        i8 = ((iM11308 ^ i24) * 25099) ^ 2108375096;
                        i9 = -1570671523;
                    } else {
                        iM11308 = (i23 - ThreadFactoryC3888.m11306("֨᩹")) * 53;
                        i8 = ((iM11308 ^ i24) * (-10301)) ^ (-1467687943);
                        i9 = -1314895015;
                    }
                    s = s2;
                    i26 = iM11308 ^ i9;
                    i25 = i8;
                    i27 = i48;
                    i33 = i50;
                    sArr11 = sArr27;
                    i34 = i49;
                    sArr8 = sArr28;
                    sArr7 = sArr29;
                    break;
                case -478345087:
                case 687631952:
                    i27 = i27;
                    int i51 = i34;
                    sArr11 = sArr11;
                    i33 = i33;
                    i5 = i51;
                    short[] sArr30 = sArr8;
                    sArr7 = sArr7;
                    sArr = sArr30;
                    C2332.m7083(this, iM450212 ^ 2119369052);
                    sArr12 = f16037;
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11307 = (C19806.m45029("ۧۖ") ^ i24) * q.h;
                        i6 = ((iM11307 ^ i23) * 24465) ^ (-57088456);
                        i7 = 942508192;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("᩷ܳ") ^ i23) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM11307 ^ i24) * (-15269)) ^ 1298348496;
                        i7 = 405465902;
                    }
                    i10 = iM11307 ^ i7;
                    i27 = i27;
                    i26 = i10;
                    i25 = i6;
                    int i3113 = i5;
                    i33 = i33;
                    sArr11 = sArr11;
                    i34 = i3113;
                    short[] sArr119 = sArr7;
                    sArr8 = sArr;
                    sArr7 = sArr119;
                    break;
                case -465237109:
                case 1172281206:
                    i = i27;
                    this.f16054 = (FloatingActionButton) viewM7083;
                    sArr8 = f16037;
                    i29 = 488;
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM45029 = (C19806.m45029("᩻ۢ") ^ i24) * (-5);
                        i2 = ((iM45029 ^ i23) * (-26923)) ^ (-1858905954);
                        i3 = 901197891;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۡ") ^ i23;
                        i2 = ((iM45029 ^ i24) * (-11575)) ^ 1264911907;
                        i3 = 1482572191;
                    }
                    int i3114 = iM45029 ^ i3;
                    i27 = i;
                    i26 = i3114;
                    i25 = i2;
                    break;
                case -418838048:
                case 668293039:
                    i = i27;
                    this.f16051 = floatingActionButton4;
                    C7105.m18993(this.f16052, this);
                    C1937.m6291(this.f16054, this);
                    floatingActionButton2 = this.f16043;
                    iM45029 = ThreadFactoryC3888.m11306("ۜۧ") ^ i24;
                    i2 = ((iM45029 ^ i23) * 21771) ^ (-1621974358);
                    i3 = -1661366027;
                    int i3115 = iM45029 ^ i3;
                    i27 = i;
                    i26 = i3115;
                    i25 = i2;
                    break;
                case -413505762:
                case 2051219815:
                    i = i27;
                    short[] sArr31 = sArr8;
                    iM450211 = C19806.m45029(CallableC1627.m5502(sArr31, i29, 3, i28)) ^ 2121040268;
                    int iM113018 = ThreadFactoryC3888.m11306("᩹۬") ^ i23;
                    i17 = ((iM113018 ^ i24) * (-1461)) ^ (-1547531019);
                    i18 = iM113018 ^ (-1938228441);
                    sArr8 = sArr31;
                    i19 = i;
                    i26 = i18;
                    i25 = i17;
                    i27 = i19;
                    break;
                case -345846411:
                case -340880442:
                    i = i27;
                    C7105.m18993(floatingActionButton2, this);
                    C7105.m18993(this.f16051, this);
                    C7105.m18992(this);
                    if (!RunnableC1895.f7152) {
                        floatingActionButton = floatingActionButton3;
                        sArr6 = sArr7;
                        sArr5 = sArr8;
                        int iM450216 = C19806.m45029("᩶ۨ") ^ i24;
                        floatingActionButton3 = floatingActionButton;
                        i25 = ((iM450216 ^ i23) * (-23861)) ^ 486826659;
                        sArr8 = sArr5;
                        sArr7 = sArr6;
                        i19 = i;
                        i26 = iM450216 ^ 680351884;
                        i27 = i19;
                    } else {
                        iM45029 = C19806.m45029("ܶᩴ") ^ i23;
                        i2 = ((iM45029 ^ i24) * 9475) ^ (-151479258);
                        i3 = 1407721860;
                        int i3116 = iM45029 ^ i3;
                        i27 = i;
                        i26 = i3116;
                        i25 = i2;
                    }
                    break;
                case -332864506:
                case 141345574:
                    C1439 c1439 = (C1439) C2642.m8167(c6938, C19806.m45029(C1668.m5577(sArr10, i27, 3, i28)) ^ 2117872319);
                    this.f16061 = c1439;
                    c1439.m5030(z);
                    iM11306 = C19806.m45029("ܶۨ") ^ i23;
                    i2 = ((iM11306 ^ i24) * 13175) ^ 422013849;
                    i4 = 390679047;
                    i26 = iM11306 ^ i4;
                    i25 = i2;
                    break;
                case -320068591:
                case 2112936173:
                    i = i27;
                    RunnableC3388.m10053(this.f41645, new ViewOnClickListenerC20244(this, 2));
                    iM45029 = ThreadFactoryC3888.m11306("ۡ֨") ^ i24;
                    i2 = ((iM45029 ^ i23) * (-1633)) ^ (-356705515);
                    i3 = 357774526;
                    int i3117 = iM45029 ^ i3;
                    i27 = i;
                    i26 = i3117;
                    i25 = i2;
                    break;
                case -252234554:
                case 709373949:
                    int i52 = i27;
                    short[] sArr32 = sArr7;
                    int i53 = i33;
                    int i54 = i34;
                    sArr3 = sArr8;
                    sArr2 = sArr32;
                    viewM7083 = C2332.m7083(this, C19806.m45029(C2124.m6685(sArr32, i53, i54, i28)) ^ 2129407745);
                    int iM113019 = ThreadFactoryC3888.m11306("ۨܿ") ^ i24;
                    i34 = i54;
                    i33 = i53;
                    i27 = i52;
                    i26 = iM113019 ^ 843369514;
                    i25 = ((iM113019 ^ i23) * (-6751)) ^ (-195051414);
                    short[] sArr210 = sArr2;
                    sArr8 = sArr3;
                    sArr7 = sArr210;
                    break;
                case -249956280:
                case -68945888:
                    i = i27;
                    i13 = i33;
                    i14 = i34;
                    short[] sArr33 = sArr8;
                    sArr2 = sArr7;
                    sArr3 = sArr33;
                    sArr4 = f16037;
                    i31 = 482;
                    i32 = 3;
                    if (C2332.f8260) {
                        iM113010 = ThreadFactoryC3888.m11306("֨ܺ") ^ i23;
                        i15 = ((iM113010 ^ i24) * (-8153)) ^ (-2065698474);
                        i16 = 495465632;
                    } else {
                        iM113010 = (i23 - ThreadFactoryC3888.m11306("ۡ᩷")) * 127;
                        i15 = ((iM113010 ^ i24) * 17061) ^ 1988873110;
                        i16 = 1559513464;
                    }
                    int i410 = iM113010 ^ i16;
                    i34 = i14;
                    i33 = i13;
                    sArr11 = sArr4;
                    i25 = i15;
                    i27 = i;
                    i26 = i410;
                    short[] sArr211 = sArr2;
                    sArr8 = sArr3;
                    sArr7 = sArr211;
                    break;
                case -235260144:
                case 1595270581:
                    C1025.m3861();
                    break;
                case -185113384:
                case 1852063427:
                    i = i27;
                    this.f16055 = new C12586(this, false);
                    iM113011 = ThreadFactoryC3888.m11306(CallableC1627.m5502(f16037, 494, 3, i28));
                    iM45029 = (i23 - ThreadFactoryC3888.m11306("ۡܳ")) * (-99);
                    i2 = ((iM45029 ^ i24) * 23901) ^ 1446108412;
                    i3 = 1932605049;
                    int i3118 = iM45029 ^ i3;
                    i27 = i;
                    i26 = i3118;
                    i25 = i2;
                    break;
                case 100790648:
                case 1344535606:
                    i27 = i27;
                    int i55 = i34;
                    sArr11 = sArr11;
                    i33 = i33;
                    i5 = i55;
                    short[] sArr34 = sArr8;
                    sArr7 = sArr7;
                    sArr = sArr34;
                    s = f16037[472];
                    i20 = s * s;
                    i21 = 45914176;
                    iM11307 = (ThreadFactoryC3888.m11306("ܿ۬") + i24) * 17;
                    i6 = ((iM11307 ^ i23) * (-15695)) ^ 117244041;
                    i7 = 307361528;
                    i10 = iM11307 ^ i7;
                    i27 = i27;
                    i26 = i10;
                    i25 = i6;
                    int i3119 = i5;
                    i33 = i33;
                    sArr11 = sArr11;
                    i34 = i3119;
                    short[] sArr1110 = sArr7;
                    sArr8 = sArr;
                    sArr7 = sArr1110;
                    break;
                case 275157612:
                case 493269403:
                    i5 = i34;
                    sArr = sArr8;
                    i28 = 24187;
                    iM11307 = (i24 - C19806.m45029("ᩴۨ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i6 = ((iM11307 ^ i23) * 955) ^ 505630126;
                    i7 = 602577820;
                    i10 = iM11307 ^ i7;
                    i27 = i27;
                    i26 = i10;
                    i25 = i6;
                    int i31110 = i5;
                    i33 = i33;
                    sArr11 = sArr11;
                    i34 = i31110;
                    short[] sArr1111 = sArr7;
                    sArr8 = sArr;
                    sArr7 = sArr1111;
                    break;
                case 663552132:
                case 1317742551:
                    i27 = i27;
                    int i56 = i34;
                    sArr11 = sArr11;
                    i33 = i33;
                    i5 = i56;
                    short[] sArr35 = sArr8;
                    sArr7 = sArr7;
                    sArr = sArr35;
                    iM450212 = C19806.m45029(C1377.m4832(f16037, 476, 3, i28));
                    iM11307 = ThreadFactoryC3888.m11306("᩻ۚ") ^ i24;
                    i6 = ((iM11307 ^ i23) * (-27277)) ^ 86508796;
                    i7 = 1600443364;
                    i10 = iM11307 ^ i7;
                    i27 = i27;
                    i26 = i10;
                    i25 = i6;
                    int i31111 = i5;
                    i33 = i33;
                    sArr11 = sArr11;
                    i34 = i31111;
                    short[] sArr1112 = sArr7;
                    sArr8 = sArr;
                    sArr7 = sArr1112;
                    break;
                case 664845501:
                case 1246080809:
                    i27 = i27;
                    int i57 = i34;
                    sArr11 = sArr11;
                    i33 = i33;
                    i5 = i57;
                    short[] sArr36 = sArr8;
                    sArr7 = sArr7;
                    sArr = sArr36;
                    short[] sArr37 = sArr12;
                    iM113012 = ThreadFactoryC3888.m11306(C0962.m3747(sArr37, 479, 3, i28));
                    i30 = 2125508882;
                    int iM450217 = C19806.m45029("ۙ۫") ^ i23;
                    i6 = ((iM450217 ^ i24) * (-25769)) ^ (-744540913);
                    i10 = iM450217 ^ (-1666276425);
                    sArr12 = sArr37;
                    i27 = i27;
                    i26 = i10;
                    i25 = i6;
                    int i31112 = i5;
                    i33 = i33;
                    sArr11 = sArr11;
                    i34 = i31112;
                    short[] sArr1113 = sArr7;
                    sArr8 = sArr;
                    sArr7 = sArr1113;
                    break;
                case 915740470:
                case 1381405900:
                    tabLayout = (TabLayout) C2332.m7083(this, iM113011 ^ 2127754130);
                    i = i27;
                    strM4969 = C1419.m4969(f16037, 497, 3, i28);
                    if (C2642.f10294 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻֨") ^ i24;
                        i2 = ((iM45029 ^ i23) * (-26833)) ^ (-231233289);
                        i3 = -269193299;
                        int i31113 = iM45029 ^ i3;
                        i27 = i;
                        i26 = i31113;
                        i25 = i2;
                    } else {
                        sArr4 = sArr11;
                        i13 = i33;
                        i14 = i34;
                        short[] sArr212 = sArr8;
                        sArr2 = sArr7;
                        sArr3 = sArr212;
                        iM113010 = (i23 - ThreadFactoryC3888.m11306("ۡ᩷")) * 127;
                        i15 = ((iM113010 ^ i24) * 17061) ^ 1988873110;
                        i16 = 1559513464;
                        int i411 = iM113010 ^ i16;
                        i34 = i14;
                        i33 = i13;
                        sArr11 = sArr4;
                        i25 = i15;
                        i27 = i;
                        i26 = i411;
                        short[] sArr213 = sArr2;
                        sArr8 = sArr3;
                        sArr7 = sArr213;
                    }
                    break;
                case 981349051:
                case 1638888505:
                    i5 = i34;
                    sArr = sArr8;
                    i28 = 24836;
                    iM11307 = (i24 - C19806.m45029("ᩴۨ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i6 = ((iM11307 ^ i23) * 955) ^ 505630126;
                    i7 = 602577820;
                    i10 = iM11307 ^ i7;
                    i27 = i27;
                    i26 = i10;
                    i25 = i6;
                    int i31114 = i5;
                    i33 = i33;
                    sArr11 = sArr11;
                    i34 = i31114;
                    short[] sArr1114 = sArr7;
                    sArr8 = sArr;
                    sArr7 = sArr1114;
                    break;
                case 1066003060:
                case 1237272304:
                    this.f16050 = c19384;
                    c19384.m44420(new C4118(this));
                    c19383 = this.f16050;
                    iM11306 = (ThreadFactoryC3888.m11306("ܶۙ") ^ i24) * (-95);
                    i2 = ((iM11306 ^ i23) * 7231) ^ (-18658395);
                    i4 = 2116957071;
                    i26 = iM11306 ^ i4;
                    i25 = i2;
                    break;
                default:
                    c19384 = (C19383) RunnableC0195.m1436(this, ThreadFactoryC3888.m11306(strM4969) ^ 2121158935);
                    iM11306 = (ThreadFactoryC3888.m11306("᩹᩺") + i23) * 35;
                    i2 = ((iM11306 ^ i24) * (-7525)) ^ 1255566577;
                    i4 = 564903504;
                    i26 = iM11306 ^ i4;
                    i25 = i2;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC12483, l.ActivityC19126, l.ActivityC1086, android.app.Activity, l.InterfaceC21797
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = -879730971;
        int i3 = C2871.f10837;
        int i4 = C1977.f7413;
        int iM11306 = (ThreadFactoryC3888.m11306("᩵᩶") + i3) * 27;
        int i5 = ((iM11306 ^ i4) * 179) ^ (-84233978);
        int i6 = -1186559600;
        while (true) {
            i2 = ((((i2 ^ i4) * (-31483)) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2032496723:
                case 878399751:
                    if (C2871.f10837 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֫۫") ^ i4;
                        i5 = ((iM11306 ^ i3) * 9475) ^ (-1459945047);
                        i6 = -2115170329;
                    } else {
                        iM11306 = (C19806.m45029("᩵᩸") ^ i3) * 15;
                        i5 = ((iM11306 ^ i4) * 12603) ^ 1853140043;
                        i6 = -1477242623;
                    }
                    break;
                case -1972595106:
                case 2069334765:
                    if (C1377.f5749) {
                        iM11306 = (i4 - C19806.m45029("᩶ܰ")) * (-121);
                        i5 = ((iM11306 ^ i3) * (-27385)) ^ (-412519835);
                        i6 = -1999434297;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫۫") ^ i4;
                        i5 = ((iM11306 ^ i3) * 9475) ^ (-1459945047);
                        i6 = -2115170329;
                    }
                    break;
                case -1928566680:
                case 1726854703:
                    if (C2332.m7079() <= 0) {
                        iM11306 = (i3 - C19806.m45029("ᩴۢ")) * 65;
                        i5 = ((iM11306 ^ i4) * (-3661)) ^ 1993864452;
                        i6 = 1517940249;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜۧ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-16517)) ^ 121553299;
                        i6 = -1150463204;
                    }
                    break;
                case -1837348036:
                case 1266579485:
                    if (C2477.f9839 <= 0) {
                        iM11306 = (C19806.m45029("᩵᩸") ^ i3) * 15;
                        i5 = ((iM11306 ^ i4) * 12603) ^ 1853140043;
                        i6 = -1477242623;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ۫") ^ i4;
                        i5 = ((iM11306 ^ i3) * 19241) ^ (-25221783);
                        i6 = -1261338888;
                    }
                    break;
                case -1687320185:
                case 875480352:
                    C0797.m3359();
                    break;
                case -1524468824:
                case -1191478092:
                    if (!C0526.f2219) {
                        iM11306 = (C19806.m45029("᩵᩸") ^ i3) * 15;
                        i5 = ((iM11306 ^ i4) * 12603) ^ 1853140043;
                        i6 = -1477242623;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۙۡ")) * (-21);
                        i5 = ((iM11306 ^ i3) * 30625) ^ 1932931935;
                        i6 = -554596365;
                    }
                    break;
                case -1274239871:
                case -1128963486:
                    if (CallableC1627.f6528) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ܶ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 2899) ^ (-479282974);
                        i6 = 787555112;
                    } else {
                        iM11306 = (C19806.m45029("᩵᩸") ^ i3) * 15;
                        i5 = ((iM11306 ^ i4) * 12603) ^ 1853140043;
                        i6 = -1477242623;
                    }
                    break;
                case -1107924375:
                case -44527272:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۡܿ")) * 127;
                        i5 = ((iM11306 ^ i3) * 23609) ^ (-2126360985);
                        i6 = -81413657;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ᩴۢ")) * 65;
                        i5 = ((iM11306 ^ i4) * (-3661)) ^ 1993864452;
                        i6 = 1517940249;
                    }
                    break;
                case -999635348:
                case -609126464:
                    RunnableC1606.m5473();
                    iM11306 = (i4 - ThreadFactoryC3888.m11306("ۙۡ")) * (-21);
                    i5 = ((iM11306 ^ i3) * 30625) ^ 1932931935;
                    i6 = -554596365;
                    break;
                case -860775367:
                case 911309410:
                    if (C2788.f10625 >= 0) {
                        iM11306 = (i3 - C19806.m45029("ᩴۢ")) * 65;
                        i5 = ((iM11306 ^ i4) * (-3661)) ^ 1993864452;
                        i6 = 1517940249;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۤ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-17091)) ^ (-1582953230);
                        i6 = -314723785;
                    }
                    break;
                case -739760957:
                case 1864880530:
                    if (C3535.f13026 <= 0) {
                        iM11306 = C19806.m45029("᩺ۤ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-24577)) ^ (-2037021630);
                        i6 = 168318354;
                    } else {
                        iM11306 = (C19806.m45029("᩵᩸") ^ i3) * 15;
                        i5 = ((iM11306 ^ i4) * 12603) ^ 1853140043;
                        i6 = -1477242623;
                    }
                    break;
                case -597743786:
                case -242358330:
                    if (i == 23680) {
                        iM11306 = C19806.m45029("ᩳۧ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-25519)) ^ 1214455798;
                        i6 = 1465096640;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۧ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-26027)) ^ (-53340818);
                        i6 = 1403837680;
                    }
                    break;
                case -442453608:
                case 1657156850:
                    this.f16059 = false;
                    mo2119();
                    break;
                case -422312720:
                case -196654915:
                    if (C19806.f63586) {
                        iM11306 = (i3 - C19806.m45029("ᩴۢ")) * 65;
                        i5 = ((iM11306 ^ i4) * (-3661)) ^ 1993864452;
                        i6 = 1517940249;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩶۟")) * (-91);
                        i5 = ((iM11306 ^ i4) * 8761) ^ 1301227555;
                        i6 = -1181726567;
                    }
                    break;
                case -379054829:
                case 624722801:
                    if (C0671.f2816 != 0) {
                        iM11306 = (i3 - C19806.m45029("ᩴۢ")) * 65;
                        i5 = ((iM11306 ^ i4) * (-3661)) ^ 1993864452;
                        i6 = 1517940249;
                    } else {
                        iM11306 = C19806.m45029("ᩳ᩹") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-13381)) ^ (-992779519);
                        i6 = 2118303955;
                    }
                    break;
                case -138180627:
                case 1607375796:
                    if (C1066.f4915 <= 0) {
                        iM11306 = (C19806.m45029("᩵᩸") ^ i3) * 15;
                        i5 = ((iM11306 ^ i4) * 12603) ^ 1853140043;
                        i6 = -1477242623;
                    } else {
                        iM11306 = C19806.m45029("ۡ֡") ^ i4;
                        i5 = ((iM11306 ^ i3) * 2897) ^ 1231698651;
                        i6 = -664153798;
                    }
                    break;
                case 27892347:
                case 209818438:
                    super.onRequestPermissionsResult(i, strArr, iArr);
                    break;
                default:
                    if (C1377.m4833() != 0) {
                        iM11306 = C19806.m45029("᩺ۤ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-24577)) ^ (-2037021630);
                        i6 = 168318354;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۢ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-1841)) ^ 2064901361;
                        i6 = 1336432796;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0272 A[PHI: r4 r9 r10 r18
      0x0272: PHI (r4v6 l.ܿᩴۘ) = (r4v2 l.ܿᩴۘ), (r4v3 l.ܿᩴۘ), (r4v2 l.ܿᩴۘ), (r4v2 l.ܿᩴۘ) binds: [B:90:0x0272, B:67:0x0270, B:38:0x0152, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0272: PHI (r9v6 l.۫ᩴۘ) = (r9v2 l.۫ᩴۘ), (r9v2 l.۫ᩴۘ), (r9v3 l.۫ᩴۘ), (r9v2 l.۫ᩴۘ) binds: [B:90:0x0272, B:67:0x0270, B:38:0x0152, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0272: PHI (r10v6 l.ܿᩴۘ) = (r10v2 l.ܿᩴۘ), (r10v2 l.ܿᩴۘ), (r10v3 l.ܿᩴۘ), (r10v2 l.ܿᩴۘ) binds: [B:90:0x0272, B:67:0x0270, B:38:0x0152, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0272: PHI (r18v14 l.۫ᩴۘ) = (r18v3 l.۫ᩴۘ), (r18v10 l.۫ᩴۘ), (r18v3 l.۫ᩴۘ), (r18v3 l.۫ᩴۘ) binds: [B:90:0x0272, B:67:0x0270, B:38:0x0152, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12575(ViewOnClickListenerC4514 viewOnClickListenerC4514, C23875 c23875) {
        C12586 c12586;
        int i;
        int iM11306;
        int i2;
        C12586 c12587;
        int i3;
        int i4;
        C0590 c0590;
        int i5;
        int iM45029;
        ViewOnClickListenerC4514 viewOnClickListenerC4515 = viewOnClickListenerC4514;
        int i6 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int i7 = AbstractC0464.f2088;
        int iM450210 = (C19806.m45029("ᩳۡ") ^ i7) * (-103);
        int i8 = ((iM450210 ^ i6) * 2919) ^ 1075124446;
        ViewOnClickListenerC4514 viewOnClickListenerC4516 = null;
        C8387 c8387 = null;
        int i9 = iM450210 ^ 778765696;
        int i10 = 0;
        int i11 = 2077101984;
        C12586 c12588 = null;
        C8387 c8388 = null;
        C0590 c0591 = null;
        C0590 c0592 = null;
        C17524 c17524 = null;
        C17524 c17525 = null;
        C12586 c12589 = null;
        int i12 = 0;
        while (true) {
            i11 = i9 ^ (i8 & (((i11 ^ i6) * 22861) >> 31));
            switch (i11) {
                case -2093337392:
                case 1313105385:
                    C1398.m4901(c0592);
                    c12589 = viewOnClickListenerC4515.f16055;
                    c17524 = c23875.f77159;
                    RunnableC3388.m10051(c12589);
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = (C19806.m45029("ܺ᩷") ^ i6) * 41;
                        i = ((iM11306 ^ i7) * 9127) ^ (-1116738207);
                        i2 = -1596918180;
                    } else {
                        iM11306 = (C19806.m45029("ۤܶ") ^ i6) * (-21);
                        i = ((iM11306 ^ i7) * (-17811)) ^ (-1806446416);
                        i2 = 1079696665;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -2043124500:
                case 1772654854:
                    AbstractC0464.m2313();
                    iM11306 = (C19806.m45029("ܳ᩻") ^ i7) * 75;
                    i = ((iM11306 ^ i6) * 9715) ^ 295898398;
                    i2 = -274600028;
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1976308115:
                case -1421679297:
                    c0592.f2561 = c8388;
                    c0592.f2560 = c17525.f55713;
                    viewOnClickListenerC4516 = c0592.f2565;
                    if (C1025.f4800 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ۛ") + i7) * 23;
                        i = ((iM11306 ^ i6) * 30753) ^ (-235091527);
                        i2 = 244901529;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    } else {
                        c12587 = c12588;
                        iM45029 = C19806.m45029("ۙᩳ") ^ i6;
                        c0590 = c0592;
                        i5 = ((iM45029 ^ i7) * 23443) ^ (-586162110);
                        i4 = 857322755;
                        i3 = iM45029 ^ i4;
                        c12588 = c12587;
                        i8 = i5;
                        c0592 = c0590;
                        i9 = i3;
                    }
                    break;
                case -1969248338:
                case -1846455986:
                    c12589.f42060 = c17524.f55711;
                    if (!C0526.f2219) {
                        iM11306 = (C19806.m45029("᩺ᩳ") + i7) * 57;
                        i = ((iM11306 ^ i6) * (-10923)) ^ (-407816930);
                        i2 = 84929623;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    } else {
                        c12586 = c12588;
                        int iM11307 = (i7 - ThreadFactoryC3888.m11306("ۧ۟")) * 101;
                        C12586 c125810 = c12586;
                        i8 = ((iM11307 ^ i6) * 15437) ^ (-136462159);
                        i3 = iM11307 ^ 1029809038;
                        c12588 = c125810;
                        i9 = i3;
                    }
                    break;
                case -1922144342:
                case -758466747:
                    c12587 = c12588;
                    c0592 = c12587.f42057;
                    C0526.m2429(c0592);
                    c0592.f2562 = c17525.f55712;
                    c8388 = c17525.f55710;
                    if (C1461.f5957 <= 0) {
                        iM45029 = C19806.m45029("ۙᩳ") ^ i6;
                        c0590 = c0592;
                        i5 = ((iM45029 ^ i7) * 23443) ^ (-586162110);
                        i4 = 857322755;
                    } else {
                        iM45029 = (C19806.m45029("ۤ᩹") + i6) * (-67);
                        c0590 = c0592;
                        i5 = ((iM45029 ^ i7) * 6481) ^ 1404502393;
                        i4 = 2004328099;
                    }
                    i3 = iM45029 ^ i4;
                    c12588 = c12587;
                    i8 = i5;
                    c0592 = c0590;
                    i9 = i3;
                    break;
                case -1899439973:
                case 2013854694:
                    c0591.f2563 = i10 + 1;
                    C3535.m10422(c0591);
                    if (viewOnClickListenerC4515.f16057) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢۙ") + i6) * (-87);
                        i = ((iM11306 ^ i7) * (-5177)) ^ 491797860;
                        i2 = 783219912;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨᩹") ^ i7;
                        i = ((iM11306 ^ i6) * (-3171)) ^ (-1215572726);
                        i2 = -169605312;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1843704306:
                case 575276114:
                    if (C3577.f13150 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙۢ") ^ i6;
                        i = ((iM11306 ^ i7) * 21529) ^ (-1543394635);
                        i2 = 1531079887;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    } else {
                        c12586 = c12588;
                        int iM11308 = (i7 - ThreadFactoryC3888.m11306("ۧ۟")) * 101;
                        C12586 c125811 = c12586;
                        i8 = ((iM11308 ^ i6) * 15437) ^ (-136462159);
                        i3 = iM11308 ^ 1029809038;
                        c12588 = c125811;
                        i9 = i3;
                    }
                    break;
                case -1843615515:
                case 1591009985:
                    C12586 c125812 = viewOnClickListenerC4515.f16044;
                    c17525 = c23875.f77160;
                    if (C0216.f1393 != 0) {
                        c12588 = c125812;
                        iM11306 = (C19806.m45029("ܺ᩷") ^ i6) * 41;
                        i = ((iM11306 ^ i7) * 9127) ^ (-1116738207);
                        i2 = -1596918180;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    } else {
                        int iM11309 = ThreadFactoryC3888.m11306("᩻᩷") ^ i6;
                        i9 = iM11309 ^ (-1029062884);
                        c12588 = c125812;
                        i8 = ((iM11309 ^ i7) * 28795) ^ 1278032224;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    }
                    break;
                case -1534501485:
                case 1672013303:
                    c12586 = c12588;
                    C0526.m2429(c12586);
                    c12586.f42060 = c17525.f55711;
                    if (!RunnableC1895.f7152) {
                        int iM113010 = (i7 - ThreadFactoryC3888.m11306("ۧ۟")) * 101;
                        C12586 c125813 = c12586;
                        i8 = ((iM113010 ^ i6) * 15437) ^ (-136462159);
                        i3 = iM113010 ^ 1029809038;
                        c12588 = c125813;
                        i9 = i3;
                    } else {
                        int iM113011 = (ThreadFactoryC3888.m11306("֨᩵") + i7) * 53;
                        i = ((iM113011 ^ i6) * (-10589)) ^ (-1626749034);
                        c12588 = c12586;
                        i9 = iM113011 ^ (-1040722642);
                        i8 = i;
                    }
                    break;
                case -1458657859:
                case 506747466:
                    c0591.f2561 = c8387;
                    c0591.f2560 = c17524.f55713;
                    c0591.f2565.f16040 = i12;
                    i10 = c0591.f2563;
                    if (C2788.m8472() == 0) {
                        iM11306 = C19806.m45029("ۘܳ") ^ i6;
                        i = ((iM11306 ^ i7) * 19655) ^ (-1998138448);
                        i2 = -653642486;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    } else {
                        c12586 = c12588;
                        int iM113012 = (i7 - ThreadFactoryC3888.m11306("ۧ۟")) * 101;
                        C12586 c125814 = c12586;
                        i8 = ((iM113012 ^ i6) * 15437) ^ (-136462159);
                        i3 = iM113012 ^ 1029809038;
                        c12588 = c125814;
                        i9 = i3;
                    }
                    break;
                case -1413970121:
                case -151211446:
                    c0591 = c12589.f42057;
                    RunnableC3388.m10051(c0591);
                    c0591.f2562 = c17524.f55712;
                    c8387 = c17524.f55710;
                    if (C0671.f2816 == 0) {
                        iM11306 = (C19806.m45029("᩻֡") ^ i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM11306 ^ i6) * (-771)) ^ (-1918443409);
                        i2 = -79508110;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    } else {
                        c12587 = c12588;
                        iM45029 = C19806.m45029("ۙᩳ") ^ i6;
                        c0590 = c0592;
                        i5 = ((iM45029 ^ i7) * 23443) ^ (-586162110);
                        i4 = 857322755;
                        i3 = iM45029 ^ i4;
                        c12588 = c12587;
                        i8 = i5;
                        c0592 = c0590;
                        i9 = i3;
                    }
                    break;
                case -1383695946:
                case 279106913:
                    break;
                case -738250243:
                case 1766929622:
                    viewOnClickListenerC4515.f16057 = false;
                    viewOnClickListenerC4515.m12579(false);
                    iM11306 = ThreadFactoryC3888.m11306("֨᩹") ^ i7;
                    i = ((iM11306 ^ i6) * (-3171)) ^ (-1215572726);
                    i2 = -169605312;
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -96427439:
                case 1545445365:
                    if (RunnableC1606.f6488 >= 0) {
                        c12586 = c12588;
                        int iM113013 = (i7 - ThreadFactoryC3888.m11306("ۧ۟")) * 101;
                        C12586 c125815 = c12586;
                        i8 = ((iM113013 ^ i6) * 15437) ^ (-136462159);
                        i3 = iM113013 ^ 1029809038;
                        c12588 = c125815;
                        i9 = i3;
                    } else {
                        iM11306 = (C19806.m45029("ܺ᩷") ^ i6) * 41;
                        i = ((iM11306 ^ i7) * 9127) ^ (-1116738207);
                        i2 = -1596918180;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    }
                    break;
                case -25798386:
                case 1892318871:
                    i12 = -1;
                    viewOnClickListenerC4516.f16040 = -1;
                    if (C1398.f5802 > 0) {
                        iM11306 = (i7 - C19806.m45029("֫ۙ")) * 73;
                        i = ((iM11306 ^ i6) * 10851) ^ 1700240890;
                        i2 = 2127661036;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    } else {
                        c12587 = c12588;
                        iM45029 = C19806.m45029("ۙᩳ") ^ i6;
                        c0590 = c0592;
                        i5 = ((iM45029 ^ i7) * 23443) ^ (-586162110);
                        i4 = 857322755;
                        i3 = iM45029 ^ i4;
                        c12588 = c12587;
                        i8 = i5;
                        c0592 = c0590;
                        i9 = i3;
                    }
                    break;
                case 191687745:
                case 721676425:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    C3743.m10966();
                    break;
                case 358854453:
                case 1294183501:
                    c0592.f2563++;
                    if (C1398.f5802 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ۠") ^ i6) * 47;
                        i = ((iM11306 ^ i7) * (-7583)) ^ (-1795907162);
                        i2 = -1043898319;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    } else {
                        c12587 = c12588;
                        iM45029 = C19806.m45029("ۙᩳ") ^ i6;
                        c0590 = c0592;
                        i5 = ((iM45029 ^ i7) * 23443) ^ (-586162110);
                        i4 = 857322755;
                        i3 = iM45029 ^ i4;
                        c12588 = c12587;
                        i8 = i5;
                        c0592 = c0590;
                        i9 = i3;
                    }
                    break;
                default:
                    if (C0797.m3359()) {
                        iM11306 = (C19806.m45029("ܳ᩻") ^ i7) * 75;
                        i = ((iM11306 ^ i6) * 9715) ^ 295898398;
                        i2 = -274600028;
                    } else {
                        iM11306 = (C19806.m45029("ܺ᩷") ^ i6) * 41;
                        i = ((iM11306 ^ i7) * 9127) ^ (-1116738207);
                        i2 = -1596918180;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12602(ViewOnClickListenerC4514 viewOnClickListenerC4514, String str) {
        EditText editText = null;
        EditText editText2 = null;
        int i = 1730965206;
        int i2 = ThreadFactoryC3888.f14547;
        int i3 = C1461.f5957;
        int iM11306 = ThreadFactoryC3888.m11306("ܿ֡") ^ i3;
        int i4 = ((iM11306 ^ i2) * 8629) ^ (-688815612);
        int i5 = 656590041;
        while (true) {
            i = ((((i ^ i2) * 11525) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2059201810:
                case 1556467508:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (C1668.f6641 < 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۨ᩸")) * 41;
                        i4 = ((iM11306 ^ i3) * (-4817)) ^ 465779098;
                        i5 = 2043180654;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-245)) ^ (-1092677244);
                        i5 = 1899524181;
                    }
                    break;
                case -2037822887:
                case -110976898:
                    if (C2788.m8472() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֨᩹") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM11306 ^ i3) * (-8149)) ^ 79013248;
                        i5 = 1344834883;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧۤ") ^ i2) * (-123);
                        i4 = ((iM11306 ^ i3) * 29981) ^ (-3823939);
                        i5 = 1646918067;
                    }
                    break;
                case -1858839227:
                case -1665792979:
                    if (C2788.f10625 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۧ۫")) * (-13);
                        i4 = ((iM11306 ^ i2) * 29649) ^ 37150911;
                        i5 = 778281817;
                    } else {
                        iM11306 = (C19806.m45029("ۛܺ") + i3) * (-53);
                        i4 = ((iM11306 ^ i2) * (-18825)) ^ 709301998;
                        i5 = 183338185;
                    }
                    break;
                case -1718345630:
                case -1283998969:
                    if (RunnableC1564.f6300) {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-245)) ^ (-1092677244);
                        i5 = 1899524181;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۗ֨")) * (-73);
                        i4 = ((iM11306 ^ i2) * (-20643)) ^ (-1430606859);
                        i5 = 842915712;
                    }
                    break;
                case -1647303121:
                case -1204733313:
                    if (C2249.f8050 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֨᩹") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM11306 ^ i3) * (-8149)) ^ 79013248;
                        i5 = 1344834883;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31599)) ^ 2085498644;
                        i5 = -1451519765;
                    }
                    break;
                case -1441237929:
                case 467119138:
                    editText2.setSelection(C1461.m5087(editText2));
                    iM11306 = C19806.m45029("᩹۫") ^ i3;
                    i4 = ((iM11306 ^ i2) * 3363) ^ 1518338381;
                    i5 = 407209802;
                    break;
                case -1409096198:
                case 1318271865:
                    if (C10634.f36300 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-245)) ^ (-1092677244);
                        i5 = 1899524181;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۧ۫")) * (-13);
                        i4 = ((iM11306 ^ i2) * 29649) ^ 37150911;
                        i5 = 778281817;
                    }
                    break;
                case -1400589036:
                case -1127598286:
                    C2642.m8171();
                    C1937.m6279();
                    iM11306 = C19806.m45029("ܳۘ") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-10305)) ^ (-2134806163);
                    i5 = 443489098;
                    break;
                case -1259909448:
                case 609734083:
                    editText = viewOnClickListenerC4514.f16042;
                    if (editText != null) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-24639)) ^ (-603683556);
                        i5 = 1251199909;
                    } else {
                        iM11306 = C19806.m45029("᩹۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 3363) ^ 1518338381;
                        i5 = 407209802;
                    }
                    break;
                case -1213899046:
                case 485718063:
                    C1461.m5083(editText, str);
                    editText2 = viewOnClickListenerC4514.f16042;
                    if (C0216.f1393 != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֨᩹") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM11306 ^ i3) * (-8149)) ^ 79013248;
                        i5 = 1344834883;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛᩴ") ^ i3) * 19;
                        i4 = ((iM11306 ^ i2) * (-18945)) ^ 685796899;
                        i5 = -1806105716;
                    }
                    break;
                case -1083247624:
                case 1275885387:
                    C1398.m4895();
                    break;
                case -885371947:
                case 476888078:
                    if (C1377.f5749) {
                        iM11306 = C19806.m45029("ۚۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-6927)) ^ 278104098;
                        i5 = 1916050569;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۨ᩸")) * 41;
                        i4 = ((iM11306 ^ i3) * (-4817)) ^ 465779098;
                        i5 = 2043180654;
                    }
                    break;
                case -339038379:
                case 1528599466:
                    if (RunnableC1564.f6300) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۧ۫")) * (-13);
                        i4 = ((iM11306 ^ i2) * 29649) ^ 37150911;
                        i5 = 778281817;
                    } else {
                        iM11306 = (C19806.m45029("۟֡") + i3) * 123;
                        i4 = ((iM11306 ^ i2) * (-10259)) ^ 1874228994;
                        i5 = -526808763;
                    }
                    break;
                case -15154938:
                case 1450933820:
                    if (C0797.m3359()) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22205)) ^ 2018368679;
                        i5 = -1112924610;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۧ۫")) * (-13);
                        i4 = ((iM11306 ^ i2) * 29649) ^ 37150911;
                        i5 = 778281817;
                    }
                    break;
                case 75459519:
                case 694009112:
                    C19806.m45024();
                    if (C2871.f10837 < 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۧ۫")) * (-13);
                        i4 = ((iM11306 ^ i2) * 29649) ^ 37150911;
                        i5 = 778281817;
                    } else {
                        iM11306 = C19806.m45029("ܳۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10305)) ^ (-2134806163);
                        i5 = 443489098;
                    }
                    break;
                case 322961152:
                case 1630084618:
                    if (C2124.m6673() <= 0) {
                        iM11306 = C19806.m45029("ܳۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10305)) ^ (-2134806163);
                        i5 = 443489098;
                    } else {
                        iM11306 = (C19806.m45029("ۙᩴ") + i2) * 65;
                        i4 = ((iM11306 ^ i3) * 21979) ^ 979199580;
                        i5 = 2125919546;
                    }
                    break;
                case 675503113:
                case 1076068731:
                    break;
                default:
                    if (C0278.f1572 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۧ۫")) * (-13);
                        i4 = ((iM11306 ^ i2) * 29649) ^ 37150911;
                        i5 = 778281817;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿۙ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 7371) ^ (-1110660555);
                        i5 = 1264199129;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23875 m12561(ViewOnClickListenerC4514 viewOnClickListenerC4514, C8387 c8387, C8387 c8388, String str, String str2) {
        int i = -2055227626;
        int i2 = C2788.f10625;
        int i3 = C2124.f7782;
        int iM11306 = ThreadFactoryC3888.m11306("ۘ᩵") ^ i3;
        int i4 = ((iM11306 ^ i2) * 11387) ^ 731924851;
        int i5 = -1432301245;
        while (true) {
            i = ((((i ^ i2) * (-28855)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2068322771:
                case 1590757158:
                    if (C1419.f5860 >= 0) {
                        iM11306 = (i2 - C19806.m45029("᩷۫")) * (-27);
                        i4 = ((iM11306 ^ i3) * (-5445)) ^ 121856312;
                        i5 = -861806477;
                    } else {
                        iM11306 = C19806.m45029("ۢۡ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 749) ^ 1388022863;
                        i5 = -381916537;
                    }
                    break;
                case -2038207350:
                case 43669034:
                    if (C1875.f7103 >= 0) {
                        iM11306 = (i2 - C19806.m45029("᩷۫")) * (-27);
                        i4 = ((iM11306 ^ i3) * (-5445)) ^ 121856312;
                        i5 = -861806477;
                    } else {
                        iM11306 = (C19806.m45029("᩸ܳ") + i3) * (-33);
                        i4 = ((iM11306 ^ i2) * (-6459)) ^ 1266909613;
                        i5 = 1766476658;
                    }
                    break;
                case -2031967204:
                case -347391924:
                    if (C1977.m6356()) {
                        iM11306 = (i2 - C19806.m45029("᩷۫")) * (-27);
                        i4 = ((iM11306 ^ i3) * (-5445)) ^ 121856312;
                        i5 = -861806477;
                    } else {
                        iM11306 = C19806.m45029("ܽۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 16109) ^ (-988502490);
                        i5 = -941601246;
                    }
                    break;
                case -1972243825:
                case 212312888:
                    RunnableC3388.m10051(viewOnClickListenerC4514.f16044);
                    if (C0797.f3386) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧ۫") + i2) * (-107);
                        i4 = ((iM11306 ^ i3) * 3453) ^ 1618789239;
                        i5 = 1810506456;
                    } else {
                        iM11306 = C19806.m45029("᩹ۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19217) ^ (-1312736821);
                        i5 = 1154901455;
                    }
                    break;
                case -1920562784:
                case -1798500165:
                    if (C2332.f8260) {
                        iM11306 = (C19806.m45029("᩷ۡ") + i2) * 51;
                        i4 = ((iM11306 ^ i3) * (-23305)) ^ (-205460762);
                        i5 = 859272225;
                    } else {
                        iM11306 = (i2 - C19806.m45029("᩷۫")) * (-27);
                        i4 = ((iM11306 ^ i3) * (-5445)) ^ 121856312;
                        i5 = -861806477;
                    }
                    break;
                case -1839067526:
                case -1132094151:
                    C2477.m7593();
                    iM11306 = (C19806.m45029("᩸ܳ") + i3) * (-33);
                    i4 = ((iM11306 ^ i2) * (-6459)) ^ 1266909613;
                    i5 = 1766476658;
                    break;
                case -1701649510:
                case -1408570303:
                    if (C0278.f1572 <= 0) {
                        iM11306 = (C19806.m45029("ܺܰ") ^ i3) * q.h;
                        i4 = ((iM11306 ^ i2) * 28909) ^ (-2117130140);
                        i5 = -1990924974;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 23201) ^ 145235852;
                        i5 = -649489816;
                    }
                    break;
                case -1237097370:
                case -583288363:
                    if (C0962.m3746() >= 0) {
                        iM11306 = (i2 - C19806.m45029("᩹ܿ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM11306 ^ i3) * (-23629)) ^ 1092442209;
                        i5 = 1110810426;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢۢ") ^ i3) * (-91);
                        i4 = ((iM11306 ^ i2) * 32503) ^ 1697408124;
                        i5 = 622321777;
                    }
                    break;
                case -276127845:
                case 1296517964:
                    RunnableC0195.m1431();
                    if (C0216.m1591() <= 0) {
                        iM11306 = (i2 - C19806.m45029("᩹ܿ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM11306 ^ i3) * (-23629)) ^ 1092442209;
                        i5 = 1110810426;
                    } else {
                        iM11306 = (C19806.m45029("᩸ܳ") + i3) * (-33);
                        i4 = ((iM11306 ^ i2) * (-6459)) ^ 1266909613;
                        i5 = 1766476658;
                    }
                    break;
                case -134284286:
                case 860805194:
                    C17524 c17524M31302 = C12586.m31302(c8387, str);
                    C0526.m2429(viewOnClickListenerC4514.f16055);
                    return new C23875(c17524M31302, C12586.m31302(c8388, str2));
                case -37532152:
                case 1893939449:
                    C2124.m6673();
                    C7105.m18985();
                    return null;
                case -13785190:
                case 793324360:
                    C2477.m7593();
                    if (C10634.f36300 >= 0) {
                        iM11306 = (C19806.m45029("ܺܰ") ^ i3) * q.h;
                        i4 = ((iM11306 ^ i2) * 28909) ^ (-2117130140);
                        i5 = -1990924974;
                    } else {
                        iM11306 = (C19806.m45029("᩸ܳ") + i3) * (-33);
                        i4 = ((iM11306 ^ i2) * (-6459)) ^ 1266909613;
                        i5 = 1766476658;
                    }
                    break;
                case 450200920:
                case 1861122943:
                    if (C19806.f63586) {
                        iM11306 = (C19806.m45029("᩸ܳ") + i3) * (-33);
                        i4 = ((iM11306 ^ i2) * (-6459)) ^ 1266909613;
                        i5 = 1766476658;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴܳ") + i3) * (-85);
                        i4 = ((iM11306 ^ i2) * 31039) ^ (-859933613);
                        i5 = -976266290;
                    }
                    break;
                case 1010783515:
                case 1020419182:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = (C19806.m45029("ܺܰ") ^ i3) * q.h;
                        i4 = ((iM11306 ^ i2) * 28909) ^ (-2117130140);
                        i5 = -1990924974;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩻۬")) * (-39);
                        i4 = ((iM11306 ^ i3) * 28779) ^ 1988570344;
                        i5 = 307939196;
                    }
                    break;
                case 1642732347:
                case 2067960129:
                    if (C0962.f3784) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧ۫") + i2) * (-107);
                        i4 = ((iM11306 ^ i3) * 3453) ^ 1618789239;
                        i5 = 1810506456;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 7583) ^ 1518010738;
                        i5 = -243677868;
                    }
                    break;
                default:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (C19806.m45029("ܺܰ") ^ i3) * q.h;
                        i4 = ((iM11306 ^ i2) * 28909) ^ (-2117130140);
                        i5 = -1990924974;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 8853) ^ 851436460;
                        i5 = 1833777169;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onStop() {
        DialogInterfaceC19356 dialogInterfaceC19356 = null;
        AtomicInteger atomicInteger = null;
        int i = 801771625;
        int i2 = RunnableC0195.f1321;
        int i3 = AbstractC0464.f2088;
        int iM11306 = ThreadFactoryC3888.m11306("۬ܺ") ^ i3;
        int i4 = ((iM11306 ^ i2) * 26757) ^ (-1992386214);
        int i5 = 1631243289;
        while (true) {
            i = ((((i ^ i2) * (-16367)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1807230059:
                case 1501936580:
                    if (RunnableC1606.m5473() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵۬") ^ i3) * (-17);
                        i4 = ((iM11306 ^ i2) * (-7825)) ^ (-208260987);
                        i5 = -517959727;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۙۨ")) * 97;
                        i4 = ((iM11306 ^ i3) * 14761) ^ (-1430148092);
                        i5 = -1495964571;
                    }
                    break;
                case -1705264818:
                case -14683624:
                    if (C0278.f1572 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵۬") ^ i3) * (-17);
                        i4 = ((iM11306 ^ i2) * (-7825)) ^ (-208260987);
                        i5 = -517959727;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۘۗ")) * (-101);
                        i4 = ((iM11306 ^ i3) * 4747) ^ 1862875177;
                        i5 = 809831032;
                    }
                    break;
                case -1584210156:
                case -711396675:
                    atomicInteger = this.f16053;
                    if (C3722.m10894() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 23275) ^ (-1243082114);
                        i5 = -541205227;
                    } else {
                        iM11306 = C19806.m45029("ۡ۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3207) ^ 70538396;
                        i5 = -943020943;
                    }
                    break;
                case -1505650498:
                case -1251586879:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ᩶") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM11306 ^ i3) * 22401) ^ 2110833006;
                        i5 = -1734624064;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧ᩷") ^ i3) * (-75);
                        i4 = ((iM11306 ^ i2) * 16509) ^ 486355910;
                        i5 = -2123456307;
                    }
                    break;
                case -1415945303:
                case 1418357307:
                    if (C3743.m10966() <= 0) {
                        iM11306 = C19806.m45029("ᩴۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 32107) ^ (-1500703825);
                        i5 = -1205132297;
                    } else {
                        iM11306 = C19806.m45029("᩷ܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 5249) ^ (-1728986303);
                        i5 = 1984831346;
                    }
                    break;
                case -1395203575:
                case -497025274:
                    C3577.m10565();
                    if (C2124.f7782 <= 0) {
                        iM11306 = C19806.m45029("ᩴۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 32107) ^ (-1500703825);
                        i5 = -1205132297;
                    } else {
                        iM11306 = C19806.m45029("ܿᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31347)) ^ 1843301398;
                        i5 = -1462742912;
                    }
                    break;
                case -1106659129:
                case 475867574:
                    dialogInterfaceC19356 = this.f16041;
                    if (dialogInterfaceC19356 != null) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖ᩷") + i3) * 59;
                        i4 = ((iM11306 ^ i2) * (-16989)) ^ (-2036637145);
                        i5 = -1687669742;
                    } else {
                        iM11306 = C19806.m45029("ۛ᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19425)) ^ 1459113925;
                        i5 = -825719405;
                    }
                    break;
                case -1086198424:
                case 2087399844:
                    if (!C10634.m26820()) {
                        iM11306 = C19806.m45029("ᩴۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 32107) ^ (-1500703825);
                        i5 = -1205132297;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵۬") ^ i3) * (-17);
                        i4 = ((iM11306 ^ i2) * (-7825)) ^ (-208260987);
                        i5 = -517959727;
                    }
                    break;
                case -1062912255:
                case -146695607:
                    if (C2249.f8050 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ᩶") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM11306 ^ i3) * 22401) ^ 2110833006;
                        i5 = -1734624064;
                    } else {
                        iM11306 = C19806.m45029("ܿᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31347)) ^ 1843301398;
                        i5 = -1462742912;
                    }
                    break;
                case -1055565862:
                case 190536074:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵۬") ^ i3) * (-17);
                        i4 = ((iM11306 ^ i2) * (-7825)) ^ (-208260987);
                        i5 = -517959727;
                    } else {
                        iM11306 = (C19806.m45029("ۘᩳ") + i3) * 95;
                        i4 = ((iM11306 ^ i2) * 31553) ^ 896663228;
                        i5 = 1488804203;
                    }
                    break;
                case -1003093707:
                case -823585618:
                    if (C1377.f5749) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22655)) ^ (-37152653);
                        i5 = 216540681;
                    } else {
                        iM11306 = C19806.m45029("ܿᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31347)) ^ 1843301398;
                        i5 = -1462742912;
                    }
                    break;
                case -979430838:
                case 1265600108:
                    if (RunnableC0195.m1443(dialogInterfaceC19356)) {
                        iM11306 = (C19806.m45029("ۚᩴ") ^ i3) * (-123);
                        i4 = ((iM11306 ^ i2) * (-18409)) ^ 1540660501;
                        i5 = 1097431626;
                    } else {
                        iM11306 = C19806.m45029("ۛ᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19425)) ^ 1459113925;
                        i5 = -825719405;
                    }
                    break;
                case -948375761:
                case 1830665535:
                    this.f16039 = true;
                    if (C1668.f6641 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ᩶") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM11306 ^ i3) * 22401) ^ 2110833006;
                        i5 = -1734624064;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜܺ") + i3) * (-75);
                        i4 = ((iM11306 ^ i2) * (-29081)) ^ 1620381414;
                        i5 = -607733165;
                    }
                    break;
                case -908609221:
                case 1521381920:
                    C1668.m5572(dialogInterfaceC19356);
                    iM11306 = C19806.m45029("ۛ᩺") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-19425)) ^ 1459113925;
                    i5 = -825719405;
                    break;
                case -531976653:
                case 64798337:
                    C2788.m8472();
                    iM11306 = C19806.m45029("ܿᩳ") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-31347)) ^ 1843301398;
                    i5 = -1462742912;
                    break;
                case -86064877:
                case 1421054265:
                    if (C1066.f4915 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵۬") ^ i3) * (-17);
                        i4 = ((iM11306 ^ i2) * (-7825)) ^ (-208260987);
                        i5 = -517959727;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ۧ") ^ i2) * 23;
                        i4 = ((iM11306 ^ i3) * 20133) ^ 1892904372;
                        i5 = 2088325457;
                    }
                    break;
                case 170399537:
                case 184909255:
                    C2642.m8171();
                    break;
                case 817554761:
                case 1198451461:
                    super.onStop();
                    break;
                case 988724742:
                case 1679797768:
                    C3660.m10778(atomicInteger);
                    C2249.m6903(this.f16064);
                    iM11306 = ThreadFactoryC3888.m11306("᩷ۧ") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-15793)) ^ (-1996023984);
                    i5 = 521103218;
                    break;
                case 1494264772:
                case 1824382372:
                    if (C1189.f5284 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ᩶") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM11306 ^ i3) * 22401) ^ 2110833006;
                        i5 = -1734624064;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ֡") ^ i3) * 53;
                        i4 = ((iM11306 ^ i2) * 25401) ^ 125976128;
                        i5 = 417941712;
                    }
                    break;
                default:
                    if (isChangingConfigurations()) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-15793)) ^ (-1996023984);
                        i5 = 521103218;
                    } else {
                        iM11306 = C19806.m45029("ۢ۠") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13513) ^ 1474442859;
                        i5 = 501002922;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC16602
    /* JADX INFO: renamed from: ۖ */
    public final void mo2119() {
        AtomicInteger atomicInteger = null;
        int iM6903 = 0;
        C6018 c6018 = null;
        boolean z = false;
        int i = -1201156927;
        int i2 = C10634.f36300;
        int i3 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM45029 = (C19806.m45029("ۢۘ") ^ i2) * (-23);
        int i4 = ((iM45029 ^ i3) * (-20685)) ^ 1885292465;
        int i5 = 399829790;
        while (true) {
            i = ((((i ^ i3) * 22121) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2127704581:
                case 227175187:
                    this.f16062 = true;
                    if (C19806.f63586) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-1893)) ^ 1535900506;
                        i5 = -1215847020;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶۜ") ^ i2) * 47;
                        i4 = ((iM45029 ^ i3) * (-16135)) ^ 1851011447;
                        i5 = -1123252148;
                    }
                    break;
                case -1395900369:
                case -192105876:
                    iM6903 = C2249.m6903(this.f16048);
                    if (C1419.f5860 >= 0) {
                        iM45029 = C19806.m45029("᩵ۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 7035) ^ (-283659381);
                        i5 = -1970302818;
                    } else {
                        iM45029 = (C19806.m45029("ۘܳ") + i3) * 77;
                        i4 = ((iM45029 ^ i2) * 27799) ^ 877622738;
                        i5 = 60918332;
                    }
                    break;
                case -1379994036:
                case -578472513:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (C1460.f5948 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-2363)) ^ 194996699;
                        i5 = 1965447814;
                    } else {
                        iM45029 = C19806.m45029("᩵ۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 7035) ^ (-283659381);
                        i5 = -1970302818;
                    }
                    break;
                case -1276945235:
                case 377916139:
                    C3660.m10791();
                    if (C2871.f10837 >= 0) {
                        iM45029 = (i2 - C19806.m45029("᩷֡")) * 43;
                        i4 = ((iM45029 ^ i3) * (-22109)) ^ (-1887625558);
                        i5 = -370696185;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-2363)) ^ 194996699;
                        i5 = 1965447814;
                    }
                    break;
                case -1068104479:
                case -402983192:
                    atomicInteger = this.f16064;
                    if (C10634.f36300 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-1893)) ^ 1535900506;
                        i5 = -1215847020;
                    } else {
                        iM45029 = C19806.m45029("ۗ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27971) ^ 1272946302;
                        i5 = -1966819023;
                    }
                    break;
                case -1049232197:
                case -251982692:
                    if (this.f16057) {
                        iM45029 = (C19806.m45029("۬ۚ") ^ i2) * 81;
                        i4 = ((iM45029 ^ i3) * (-8609)) ^ (-2087480374);
                        i5 = 1304400868;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ۫") + i3) * (-91);
                        i4 = ((iM45029 ^ i2) * 26933) ^ (-112954019);
                        i5 = -1192677047;
                    }
                    break;
                case -903767037:
                case 562390178:
                    RunnableC0195.m1431();
                    iM45029 = C19806.m45029("᩵ۙ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 7035) ^ (-283659381);
                    i5 = -1970302818;
                    break;
                case -854332014:
                case -55835060:
                    C1066.m4023();
                    if (C1977.f7413 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-2363)) ^ 194996699;
                        i5 = 1965447814;
                    } else {
                        iM45029 = (C19806.m45029("᩶ۙ") ^ i3) * 109;
                        i4 = ((iM45029 ^ i2) * (-16423)) ^ 867840996;
                        i5 = 540943176;
                    }
                    break;
                case -795414094:
                case 898127857:
                    C2871.m8646();
                    break;
                case -369800922:
                case 1848400013:
                    if (C2124.f7782 <= 0) {
                        iM45029 = (i2 - C19806.m45029("᩷֡")) * 43;
                        i4 = ((iM45029 ^ i3) * (-22109)) ^ (-1887625558);
                        i5 = -370696185;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰۚ") + i2) * (-19);
                        i4 = ((iM45029 ^ i3) * 13981) ^ (-1847516057);
                        i5 = 314981520;
                    }
                    break;
                case -116341997:
                case 1849886806:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        RunnableC0195.m1442(new C8353(this, iM6903));
                    }
                    iM45029 = C19806.m45029("᩵ۙ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 7035) ^ (-283659381);
                    i5 = -1970302818;
                    break;
                case 150870859:
                case 2065521019:
                    C2249.m6903(this.f16053);
                    if (C1875.f7103 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-1893)) ^ 1535900506;
                        i5 = -1215847020;
                    } else {
                        iM45029 = C19806.m45029("۫᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * 19055) ^ 1077178629;
                        i5 = -785886200;
                    }
                    break;
                case 212818478:
                case 734413319:
                    C3660.m10778(atomicInteger);
                    if (C3577.f13150 >= 0) {
                        iM45029 = C19806.m45029("᩵ۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 7035) ^ (-283659381);
                        i5 = -1970302818;
                    } else {
                        iM45029 = C19806.m45029("᩷ܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-557)) ^ 569556852;
                        i5 = -1400158964;
                    }
                    break;
                case 346426432:
                case 1668181770:
                    z = false;
                    if (C3660.f13403 >= 0) {
                        iM45029 = C19806.m45029("᩵ۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 7035) ^ (-283659381);
                        i5 = -1970302818;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷᩶") + i2) * (-93);
                        i4 = ((iM45029 ^ i3) * (-31437)) ^ (-663492557);
                        i5 = -164679732;
                    }
                    break;
                case 437321867:
                case 612668144:
                    this.f16055.f42059.m16335(z);
                    break;
                case 1305212490:
                case 1876134354:
                    c6018.m16335(z);
                    if (C2704.f10408) {
                        iM45029 = C19806.m45029("᩵ۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-21435)) ^ 284679865;
                        i5 = -2054833087;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-1893)) ^ 1535900506;
                        i5 = -1215847020;
                    }
                    break;
                default:
                    c6018 = this.f16044.f42059;
                    if (C2477.f9839 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-2363)) ^ 194996699;
                        i5 = 1965447814;
                    } else {
                        iM45029 = C19806.m45029("ܺۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-17885)) ^ 90423126;
                        i5 = -1033069483;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0111 A[PHI: r8
      0x0111: PHI (r8v6 java.lang.Thread) = (r8v4 java.lang.Thread), (r8v7 java.lang.Thread) binds: [B:47:0x010f, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0158 A[PHI: r0
      0x0158: PHI (r0v4 java.util.concurrent.atomic.AtomicInteger) = 
      (r0v3 java.util.concurrent.atomic.AtomicInteger)
      (r0v2 java.util.concurrent.atomic.AtomicInteger)
      (r0v2 java.util.concurrent.atomic.AtomicInteger)
     binds: [B:55:0x0156, B:51:0x013c, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m12597(final ViewOnClickListenerC4514 viewOnClickListenerC4514) {
        int iM11306;
        int i;
        AtomicInteger atomicInteger = null;
        final int iM10778 = 0;
        int i2 = 1925529268;
        int i3 = C1875.f7103;
        int i4 = C1419.f5860;
        int iM11307 = ThreadFactoryC3888.m11306("ۛۜ") ^ i4;
        int i5 = ((iM11307 ^ i3) * 29681) ^ 1030238561;
        int i6 = -1560311816;
        while (true) {
            int i7 = iM11307 ^ i6;
            Thread thread = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 8333) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1937464612:
                    case 579916949:
                        RunnableC1606.m5473();
                        C1937.m6279();
                        iM11306 = (ThreadFactoryC3888.m11306("֡ܰ") + i4) * (-77);
                        i5 = ((iM11306 ^ i3) * (-29543)) ^ (-111138337);
                        i = -1540959990;
                        i7 = iM11306 ^ i;
                        break;
                    case -1856480832:
                    case 1006232648:
                        if (!C0962.f3784) {
                            Runnable runnable = new Runnable(viewOnClickListenerC4514) { // from class: l.ᩴᩳۘ

                                /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                                public final /* synthetic */ ViewOnClickListenerC4514 f61201;

                                @Override // java.lang.Runnable
                                public final void run() throws Throwable {
                                    ViewOnClickListenerC4514.m12594(this.f61201, iM10778);
                                }

                                {
                                    int i8 = -565187821;
                                    int i9 = C1025.f4800;
                                    int i10 = C3535.f13026;
                                    int iM11308 = (ThreadFactoryC3888.m11306("ܳۨ") + i10) * (-29);
                                    int i11 = ((iM11308 ^ i9) * 31431) ^ 1144542433;
                                    int i12 = -889198085;
                                    while (true) {
                                        i8 = ((((i8 ^ i9) * (-13677)) >> 31) & i11) ^ (iM11308 ^ i12);
                                        switch (i8) {
                                            case -2087522805:
                                            case 1615360141:
                                                if (C0817.f3443) {
                                                    iM11308 = C19806.m45029("֫ۘ") ^ i9;
                                                    i11 = ((iM11308 ^ i10) * 27159) ^ (-525402820);
                                                    i12 = 723243854;
                                                } else {
                                                    iM11308 = (ThreadFactoryC3888.m11306("ܰ᩵") ^ i10) * 31;
                                                    i11 = ((iM11308 ^ i9) * (-15135)) ^ 848879755;
                                                    i12 = -1062685716;
                                                }
                                                break;
                                            case -2053066645:
                                            case -72707828:
                                                if (C1189.f5284 <= 0) {
                                                    iM11308 = ThreadFactoryC3888.m11306("۟ۚ") ^ i10;
                                                    i11 = ((iM11308 ^ i9) * 10881) ^ 1615828831;
                                                    i12 = -54347461;
                                                } else {
                                                    iM11308 = C19806.m45029("۟۬") ^ i10;
                                                    i11 = ((iM11308 ^ i9) * 16075) ^ 1889861241;
                                                    i12 = 1573627387;
                                                }
                                                break;
                                            case -1823453945:
                                            case 802634263:
                                                if (C2871.f10837 >= 0) {
                                                    iM11308 = C19806.m45029("ۡ᩻") ^ i9;
                                                    i11 = ((iM11308 ^ i10) * (-121)) ^ 918897360;
                                                    i12 = -2075545844;
                                                } else {
                                                    iM11308 = (i10 - ThreadFactoryC3888.m11306("ᩳۚ")) * (-87);
                                                    i11 = ((iM11308 ^ i9) * 6963) ^ (-803888823);
                                                    i12 = -835342637;
                                                }
                                                break;
                                            case -1558028545:
                                            case 1201123115:
                                                C2249.m6915();
                                                if (!C0797.m3359()) {
                                                    iM11308 = C19806.m45029("ۡ᩻") ^ i9;
                                                    i11 = ((iM11308 ^ i10) * (-121)) ^ 918897360;
                                                    i12 = -2075545844;
                                                } else {
                                                    iM11308 = (ThreadFactoryC3888.m11306("ܰ᩵") ^ i10) * 31;
                                                    i11 = ((iM11308 ^ i9) * (-15135)) ^ 848879755;
                                                    i12 = -1062685716;
                                                }
                                                break;
                                            case -1513019957:
                                            case 591437911:
                                                if (ThreadFactoryC3888.m11300() <= 0) {
                                                    iM11308 = (i9 - C19806.m45029("᩵֡")) * (-127);
                                                    i11 = ((iM11308 ^ i10) * (-12403)) ^ (-987454616);
                                                    i12 = -2137409660;
                                                } else {
                                                    iM11308 = (i9 - C19806.m45029("ۧ۟")) * 23;
                                                    i11 = ((iM11308 ^ i10) * (-27379)) ^ 1156934076;
                                                    i12 = -595539085;
                                                }
                                                break;
                                            case -1294557043:
                                            case -115094802:
                                                if (C2788.f10625 >= 0) {
                                                    iM11308 = (ThreadFactoryC3888.m11306("ܰ᩵") ^ i10) * 31;
                                                    i11 = ((iM11308 ^ i9) * (-15135)) ^ 848879755;
                                                    i12 = -1062685716;
                                                } else {
                                                    iM11308 = (i10 - C19806.m45029("᩸۟")) * (-107);
                                                    i11 = ((iM11308 ^ i9) * (-26279)) ^ (-1264133944);
                                                    i12 = -1324364795;
                                                }
                                                break;
                                            case -1249467736:
                                            case 1667886146:
                                                if (C1066.f4915 <= 0) {
                                                    iM11308 = (i9 - C19806.m45029("᩵֡")) * (-127);
                                                    i11 = ((iM11308 ^ i10) * (-12403)) ^ (-987454616);
                                                    i12 = -2137409660;
                                                } else {
                                                    iM11308 = (C19806.m45029("ܽܺ") ^ i10) * (-5);
                                                    i11 = ((iM11308 ^ i9) * 18287) ^ (-1465486495);
                                                    i12 = 1077805714;
                                                }
                                                break;
                                            case -1165270269:
                                            case -377435673:
                                                this.f61201 = viewOnClickListenerC4514;
                                                if (C0962.f3784) {
                                                    iM11308 = ThreadFactoryC3888.m11306("۟ۚ") ^ i10;
                                                    i11 = ((iM11308 ^ i9) * 10881) ^ 1615828831;
                                                    i12 = -54347461;
                                                } else {
                                                    iM11308 = C19806.m45029("ܳ᩻") ^ i9;
                                                    i11 = ((iM11308 ^ i10) * 30053) ^ 438512456;
                                                    i12 = -10078352;
                                                }
                                                break;
                                            case -1144467576:
                                            case 1553946122:
                                                if (C1025.f4800 < 0) {
                                                    iM11308 = (i9 - C19806.m45029("᩵֡")) * (-127);
                                                    i11 = ((iM11308 ^ i10) * (-12403)) ^ (-987454616);
                                                    i12 = -2137409660;
                                                } else {
                                                    iM11308 = C19806.m45029("۠ۡ") ^ i10;
                                                    i11 = ((iM11308 ^ i9) * 24251) ^ (-565103872);
                                                    i12 = 201507541;
                                                }
                                                break;
                                            case -224327589:
                                            case 387107388:
                                                if (RunnableC3388.m10064()) {
                                                    iM11308 = ThreadFactoryC3888.m11306("۟᩺") ^ i10;
                                                    i11 = ((iM11308 ^ i9) * 20525) ^ 1853093769;
                                                    i12 = 1068016617;
                                                } else {
                                                    iM11308 = (i9 - C19806.m45029("᩵֡")) * (-127);
                                                    i11 = ((iM11308 ^ i10) * (-12403)) ^ (-987454616);
                                                    i12 = -2137409660;
                                                }
                                                break;
                                            case -127016096:
                                            case 1407328971:
                                                C7105.m18985();
                                                throw new RuntimeException();
                                            case -104296953:
                                            case 1367414659:
                                                C0629.m2907();
                                                if (!C0797.f3386) {
                                                    iM11308 = C19806.m45029("ۡ᩻") ^ i9;
                                                    i11 = ((iM11308 ^ i10) * (-121)) ^ 918897360;
                                                    i12 = -2075545844;
                                                } else {
                                                    iM11308 = C19806.m45029("۠ۡ") ^ i10;
                                                    i11 = ((iM11308 ^ i9) * 24251) ^ (-565103872);
                                                    i12 = 201507541;
                                                }
                                                break;
                                            case 36389385:
                                            case 897366831:
                                                return;
                                            case 546941007:
                                            case 1425585273:
                                                RunnableC0195.m1431();
                                                iM11308 = C19806.m45029("۠ۡ") ^ i10;
                                                i11 = ((iM11308 ^ i9) * 24251) ^ (-565103872);
                                                i12 = 201507541;
                                                break;
                                            case 1259593578:
                                            case 1605336861:
                                                if (C1066.f4915 <= 0) {
                                                    iM11308 = (ThreadFactoryC3888.m11306("ܰ᩵") ^ i10) * 31;
                                                    i11 = ((iM11308 ^ i9) * (-15135)) ^ 848879755;
                                                    i12 = -1062685716;
                                                } else {
                                                    iM11308 = (C19806.m45029("ۨۚ") ^ i9) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                    i11 = ((iM11308 ^ i10) * 11723) ^ (-1230026679);
                                                    i12 = -1263612183;
                                                }
                                                break;
                                            default:
                                                if (C0817.f3443) {
                                                    iM11308 = (C19806.m45029("֡֫") + i9) * (-117);
                                                    i11 = ((iM11308 ^ i10) * 4369) ^ 1846600335;
                                                    i12 = 1736117469;
                                                } else {
                                                    iM11308 = ThreadFactoryC3888.m11306("۟ۚ") ^ i10;
                                                    i11 = ((iM11308 ^ i9) * 10881) ^ 1615828831;
                                                    i12 = -54347461;
                                                }
                                                break;
                                        }
                                    }
                                }
                            };
                            if (RunnableC1895.m6170() == 0) {
                                thread = new Thread(runnable);
                                if (C0817.f3443) {
                                    iM11306 = ThreadFactoryC3888.m11306("ܿۧ") ^ i4;
                                    i5 = ((iM11306 ^ i3) * (-9049)) ^ (-1309497815);
                                    i = 1780774984;
                                } else {
                                    iM11306 = C19806.m45029("ۜܽ") ^ i4;
                                    i5 = ((iM11306 ^ i3) * 27385) ^ (-1707096373);
                                    i = 2069908604;
                                }
                                i7 = iM11306 ^ i;
                            } else {
                                iM11307 = (C19806.m45029("᩹ۧ") + i3) * (-85);
                                i5 = ((iM11307 ^ i4) * 29525) ^ (-1914887920);
                                i6 = -1055065389;
                            }
                        } else {
                            iM11307 = (i4 - C19806.m45029("۬ܰ")) * 87;
                            i5 = ((iM11307 ^ i3) * 6569) ^ (-1334075433);
                            i6 = 1204710105;
                        }
                        break;
                    case -1731287455:
                    case 1790855330:
                        if (C1377.f5749) {
                            iM11306 = (i4 - C19806.m45029("۟᩺")) * (-127);
                            i5 = ((iM11306 ^ i3) * 2843) ^ (-733627621);
                            i = 1139141193;
                        } else {
                            iM11306 = C19806.m45029("ۜܽ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 27385) ^ (-1707096373);
                            i = 2069908604;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -1692901656:
                    case 444617121:
                        C1419.m4973();
                        break;
                    case -1363108121:
                    case 20582826:
                        CallableC1627.m5507();
                        if (C0962.f3784) {
                            iM11307 = (C19806.m45029("᩹ۧ") + i3) * (-85);
                            i5 = ((iM11307 ^ i4) * 29525) ^ (-1914887920);
                            i6 = -1055065389;
                        }
                        iM11306 = (ThreadFactoryC3888.m11306("֡ܰ") + i4) * (-77);
                        i5 = ((iM11306 ^ i3) * (-29543)) ^ (-111138337);
                        i = -1540959990;
                        i7 = iM11306 ^ i;
                        break;
                    case -1360388043:
                    case -1277035829:
                        iM10778 = C3660.m10778(atomicInteger);
                        if (C3535.f13026 > 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۙ֨") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-14039)) ^ 516327024;
                            i = -792187382;
                            i7 = iM11306 ^ i;
                        } else {
                            iM11307 = (i4 - C19806.m45029("۬ܰ")) * 87;
                            i5 = ((iM11307 ^ i3) * 6569) ^ (-1334075433);
                            i6 = 1204710105;
                        }
                        break;
                    case -1081829702:
                    case 1206705258:
                        C2642.m8165(thread);
                        if (C0671.f2816 == 0 && C2477.f9839 > 0) {
                            C3743.m10965(new Thread(new Runnable(viewOnClickListenerC4514) { // from class: l.۠ᩳۘ

                                /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                                public final /* synthetic */ ViewOnClickListenerC4514 f28860;

                                {
                                    int i8 = -1326905105;
                                    int i9 = C1025.f4800;
                                    int i10 = C2477.f9839;
                                    int iM11308 = (ThreadFactoryC3888.m11306("ۤܶ") + i9) * (-121);
                                    int i11 = ((iM11308 ^ i10) * 25623) ^ 1097306746;
                                    int i12 = -1002259520;
                                    while (true) {
                                        i8 = ((((i8 ^ i10) * (-7011)) >> 31) & i11) ^ (iM11308 ^ i12);
                                        switch (i8) {
                                            case -1991495426:
                                            case 1644187005:
                                                if (C1977.f7413 <= 0) {
                                                    iM11308 = (ThreadFactoryC3888.m11306("ܰۗ") ^ i9) * (-127);
                                                    i11 = ((iM11308 ^ i10) * 4815) ^ (-1844623646);
                                                    i12 = -1162829302;
                                                } else {
                                                    iM11308 = ThreadFactoryC3888.m11306("᩸᩵") ^ i10;
                                                    i11 = ((iM11308 ^ i9) * 12471) ^ (-1343639267);
                                                    i12 = 622054326;
                                                }
                                                break;
                                            case -1956809732:
                                            case 1428259749:
                                                if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                                                    iM11308 = C19806.m45029("۫ۜ") ^ i10;
                                                    i11 = ((iM11308 ^ i9) * (-28749)) ^ (-985906109);
                                                    i12 = -1519591153;
                                                } else {
                                                    iM11308 = (i9 - C19806.m45029("ܰ۫")) * 9;
                                                    i11 = ((iM11308 ^ i10) * (-1281)) ^ (-104152457);
                                                    i12 = -997764086;
                                                }
                                                break;
                                            case -1940602203:
                                            case -1020761218:
                                                if (C1977.f7413 <= 0) {
                                                    iM11308 = (ThreadFactoryC3888.m11306("ܰۗ") ^ i9) * (-127);
                                                    i11 = ((iM11308 ^ i10) * 4815) ^ (-1844623646);
                                                    i12 = -1162829302;
                                                } else {
                                                    iM11308 = ThreadFactoryC3888.m11306("ᩳ۫") ^ i10;
                                                    i11 = ((iM11308 ^ i9) * 6593) ^ (-1578350098);
                                                    i12 = 1649171232;
                                                }
                                                break;
                                            case -1853413864:
                                            case 527153378:
                                                if (RunnableC0195.f1321 >= 0) {
                                                    iM11308 = (i9 - ThreadFactoryC3888.m11306("֨᩷")) * 81;
                                                    i11 = ((iM11308 ^ i10) * 5361) ^ (-1536784100);
                                                    i12 = 719620153;
                                                } else {
                                                    iM11308 = ThreadFactoryC3888.m11306("᩸ۢ") ^ i9;
                                                    i11 = ((iM11308 ^ i10) * 17865) ^ (-635272942);
                                                    i12 = -830193103;
                                                }
                                                break;
                                            case -1832987714:
                                            case -1006326417:
                                                if (C0962.f3784) {
                                                    iM11308 = C19806.m45029("۫ۜ") ^ i10;
                                                    i11 = ((iM11308 ^ i9) * (-28749)) ^ (-985906109);
                                                    i12 = -1519591153;
                                                } else {
                                                    iM11308 = (C19806.m45029("᩶ۘ") + i10) * (-121);
                                                    i11 = ((iM11308 ^ i9) * (-24359)) ^ 2088041757;
                                                    i12 = 1724637288;
                                                }
                                                break;
                                            case -1623699161:
                                            case 1381661586:
                                                this.f28860 = viewOnClickListenerC4514;
                                                if (RunnableC1895.f7152) {
                                                    iM11308 = (C19806.m45029("ܺܺ") ^ i9) * 93;
                                                    i11 = ((iM11308 ^ i10) * (-14459)) ^ 413673036;
                                                    i12 = -1110171577;
                                                } else {
                                                    iM11308 = (i9 - ThreadFactoryC3888.m11306("֨᩷")) * 81;
                                                    i11 = ((iM11308 ^ i10) * 5361) ^ (-1536784100);
                                                    i12 = 719620153;
                                                }
                                                break;
                                            case -1536345367:
                                            case 1837120180:
                                                if (C0797.f3386) {
                                                    iM11308 = (i10 - ThreadFactoryC3888.m11306("ᩳ᩻")) * (-37);
                                                    i11 = ((iM11308 ^ i9) * (-20967)) ^ (-1286159506);
                                                    i12 = 989883327;
                                                } else {
                                                    iM11308 = C19806.m45029("ᩳ֨") ^ i10;
                                                    i11 = ((iM11308 ^ i9) * 5187) ^ 61139261;
                                                    i12 = 1946957276;
                                                }
                                                break;
                                            case -1430855893:
                                            case 585765689:
                                                C2332.m7079();
                                                if (C3535.f13026 > 0) {
                                                    iM11308 = (i10 - ThreadFactoryC3888.m11306("ᩳ᩻")) * (-37);
                                                    i11 = ((iM11308 ^ i9) * (-20967)) ^ (-1286159506);
                                                    i12 = 989883327;
                                                } else {
                                                    iM11308 = (ThreadFactoryC3888.m11306("ܽ۠") ^ i9) * 91;
                                                    i11 = ((iM11308 ^ i10) * (-9763)) ^ 772924358;
                                                    i12 = -2143578861;
                                                }
                                                break;
                                            case -1261320797:
                                            case -715310416:
                                                if (!C0817.f3443) {
                                                    iM11308 = (i10 - ThreadFactoryC3888.m11306("ᩳ᩻")) * (-37);
                                                    i11 = ((iM11308 ^ i9) * (-20967)) ^ (-1286159506);
                                                    i12 = 989883327;
                                                } else {
                                                    iM11308 = (i9 - ThreadFactoryC3888.m11306("֨᩷")) * 81;
                                                    i11 = ((iM11308 ^ i10) * 5361) ^ (-1536784100);
                                                    i12 = 719620153;
                                                }
                                                break;
                                            case -1208361883:
                                            case 2141122728:
                                                if (C2642.f10294 <= 0) {
                                                    iM11308 = (i9 - ThreadFactoryC3888.m11306("֨᩷")) * 81;
                                                    i11 = ((iM11308 ^ i10) * 5361) ^ (-1536784100);
                                                    i12 = 719620153;
                                                } else {
                                                    iM11308 = ThreadFactoryC3888.m11306("ܺ۬") ^ i10;
                                                    i11 = ((iM11308 ^ i9) * (-32203)) ^ (-620230612);
                                                    i12 = -109195038;
                                                }
                                                break;
                                            case -1030160542:
                                            case 73782490:
                                                ThreadFactoryC3888.m11300();
                                                if (C1148.f5161 <= 0) {
                                                    iM11308 = C19806.m45029("۫ۜ") ^ i10;
                                                    i11 = ((iM11308 ^ i9) * (-28749)) ^ (-985906109);
                                                    i12 = -1519591153;
                                                } else {
                                                    iM11308 = (i9 - ThreadFactoryC3888.m11306("֨᩷")) * 81;
                                                    i11 = ((iM11308 ^ i10) * 5361) ^ (-1536784100);
                                                    i12 = 719620153;
                                                }
                                                break;
                                            case -228311267:
                                            case 1498102998:
                                                C19806.m45024();
                                                throw new RuntimeException();
                                            case 71174823:
                                            case 1240630150:
                                                if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                                    iM11308 = (i10 - ThreadFactoryC3888.m11306("ᩳ᩻")) * (-37);
                                                    i11 = ((iM11308 ^ i9) * (-20967)) ^ (-1286159506);
                                                    i12 = 989883327;
                                                } else {
                                                    iM11308 = C19806.m45029("ۜۨ") ^ i9;
                                                    i11 = ((iM11308 ^ i10) * 7551) ^ (-332764898);
                                                    i12 = 1732834086;
                                                }
                                                break;
                                            case 310273814:
                                            case 1382611521:
                                                return;
                                            case 506891668:
                                            case 1219382885:
                                                if (C0526.m2437() >= 0) {
                                                    iM11308 = C19806.m45029("۫ۜ") ^ i10;
                                                    i11 = ((iM11308 ^ i9) * (-28749)) ^ (-985906109);
                                                    i12 = -1519591153;
                                                } else {
                                                    iM11308 = (ThreadFactoryC3888.m11306("ۧۤ") + i9) * 17;
                                                    i11 = ((iM11308 ^ i10) * (-3623)) ^ (-222592023);
                                                    i12 = 1468739273;
                                                }
                                                break;
                                            default:
                                                RunnableC0195.m1431();
                                                iM11308 = (i10 - ThreadFactoryC3888.m11306("ᩳ᩻")) * (-37);
                                                i11 = ((iM11308 ^ i9) * (-20967)) ^ (-1286159506);
                                                i12 = 989883327;
                                                break;
                                        }
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() throws Throwable {
                                    ViewOnClickListenerC4514.m12565(this.f28860, iM10778);
                                }
                            }));
                        }
                        iM11307 = (i4 - C19806.m45029("۬ܰ")) * 87;
                        i5 = ((iM11307 ^ i3) * 6569) ^ (-1334075433);
                        i6 = 1204710105;
                        break;
                    case -886911515:
                    case 649939898:
                        C1398.m4895();
                        if (!C10634.m26820()) {
                            iM11307 = (i4 - C19806.m45029("۬ܰ")) * 87;
                            i5 = ((iM11307 ^ i3) * 6569) ^ (-1334075433);
                            i6 = 1204710105;
                        }
                        iM11306 = (ThreadFactoryC3888.m11306("֡ܰ") + i4) * (-77);
                        i5 = ((iM11306 ^ i3) * (-29543)) ^ (-111138337);
                        i = -1540959990;
                        i7 = iM11306 ^ i;
                        break;
                    case -556158973:
                    case 1273344347:
                        if (C0278.f1572 > 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("֡ܰ") + i4) * (-77);
                            i5 = ((iM11306 ^ i3) * (-29543)) ^ (-111138337);
                            i = -1540959990;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۡ᩺") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-11893)) ^ (-2094700813);
                            i = -912185215;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 466857966:
                    case 1571539287:
                        if (C2124.f7782 <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۡ᩺") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-11893)) ^ (-2094700813);
                            i = -912185215;
                        } else {
                            iM11306 = C19806.m45029("ۗۜ") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-15565)) ^ 1313714485;
                            i = 1299084798;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 722172628:
                    case 2002736611:
                        atomicInteger = viewOnClickListenerC4514.f16064;
                        if (C1377.f5749) {
                            iM11306 = ThreadFactoryC3888.m11306("ܶ᩶") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-27465)) ^ 1763009288;
                            i = -1231412998;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۡ᩺") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-11893)) ^ (-2094700813);
                            i = -912185215;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    default:
                        if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            iM11307 = (i4 - C19806.m45029("۬ܰ")) * 87;
                            i5 = ((iM11307 ^ i3) * 6569) ^ (-1334075433);
                            i6 = 1204710105;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ܿۙ") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-30717)) ^ 1372011513;
                            i = 1490030108;
                            i7 = iM11306 ^ i;
                        }
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m12554() {
        C9764 c9764 = null;
        int i = 0;
        ViewOnClickListenerC4514 viewOnClickListenerC4514 = null;
        int i2 = 1406328596;
        int i3 = RunnableC1606.f6488;
        int i4 = ThreadFactoryC3888.f14547;
        int iM11306 = (i4 - ThreadFactoryC3888.m11306("ۧ֨")) * 85;
        int i5 = ((iM11306 ^ i3) * 145) ^ (-107121626);
        int i6 = 1810141956;
        while (true) {
            i2 = ((((i2 ^ i3) * (-6733)) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -1868526366:
                case 604829323:
                    C2332.m7079();
                    iM11306 = (C19806.m45029("ܳ֡") + i4) * (-105);
                    i5 = ((iM11306 ^ i3) * 12163) ^ 295132457;
                    i6 = -2002457684;
                    break;
                case -1836402964:
                case -971924219:
                    if (i != C0629.m2913(viewOnClickListenerC4514.f16048)) {
                        iM11306 = (C19806.m45029("ۢ᩻") + i4) * 31;
                        i5 = ((iM11306 ^ i3) * 12001) ^ 881346339;
                        i6 = 554731607;
                    } else {
                        iM11306 = C19806.m45029("ܰ۠") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-7163)) ^ (-39272189);
                        i6 = 65567870;
                    }
                    break;
                case -1804387249:
                case -322772358:
                    if (this.f16057) {
                        iM11306 = C19806.m45029("ܰ۠") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-7163)) ^ (-39272189);
                        i6 = 65567870;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۗ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-22193)) ^ 30313501;
                        i6 = 1103578120;
                    }
                    break;
                case -1783632278:
                case -124057080:
                    if (C1461.f5957 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ᩻") ^ i4;
                        i5 = ((iM11306 ^ i3) * 243) ^ 212531724;
                        i6 = -1449477881;
                    } else {
                        iM11306 = (C19806.m45029("ܺ֡") ^ i4) * 77;
                        i5 = ((iM11306 ^ i3) * (-5687)) ^ 242325455;
                        i6 = -735036515;
                    }
                    break;
                case -1419240431:
                case -350713005:
                    if (C3535.f13026 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫᩸") ^ i3) * (-37);
                        i5 = ((iM11306 ^ i4) * (-22491)) ^ 1001031317;
                        i6 = -1337492933;
                    } else {
                        iM11306 = C19806.m45029("۬᩹") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-5221)) ^ 1013934084;
                        i6 = 1031385762;
                    }
                    break;
                case -1374664656:
                case 1523174569:
                    c9764 = this.f16047;
                    if (c9764 != null) {
                        iM11306 = C19806.m45029("ܺ᩶") ^ i4;
                        i5 = ((iM11306 ^ i3) * 3937) ^ 1204293204;
                        i6 = 551255268;
                    } else {
                        iM11306 = (C19806.m45029("ۢ᩻") + i4) * 31;
                        i5 = ((iM11306 ^ i3) * 12001) ^ 881346339;
                        i6 = 554731607;
                    }
                    break;
                case -1305860596:
                case 1463437716:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9870(this)) {
                        iM11306 = C19806.m45029("ܰ۠") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-7163)) ^ (-39272189);
                        i6 = 65567870;
                    } else {
                        iM11306 = (C19806.m45029("ۤᩴ") ^ i4) * (-59);
                        i5 = ((iM11306 ^ i3) * (-22025)) ^ 1924554292;
                        i6 = 1942978954;
                    }
                    break;
                case -1255482935:
                case -407166:
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = C19806.m45029("ۧܽ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-30357)) ^ 44235943;
                        i6 = 2138539788;
                    } else {
                        iM11306 = (C19806.m45029("ܳ֡") + i4) * (-105);
                        i5 = ((iM11306 ^ i3) * 12163) ^ 295132457;
                        i6 = -2002457684;
                    }
                    break;
                case -1141667511:
                case 409624690:
                    C0962.m3746();
                    RunnableC0195.m1431();
                    return false;
                case -1035567000:
                case 1991773340:
                    i = c9764.f32828;
                    viewOnClickListenerC4514 = c9764.f32825;
                    if (C2704.f10408) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۗ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-31161)) ^ (-94476610);
                        i6 = 611387643;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ᩻") ^ i4;
                        i5 = ((iM11306 ^ i3) * 243) ^ 212531724;
                        i6 = -1449477881;
                    }
                    break;
                case -1002145503:
                case 1664207650:
                    return true;
                case -987269669:
                case -522898934:
                    if (this.f16062) {
                        iM11306 = C19806.m45029("ܰ۠") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-7163)) ^ (-39272189);
                        i6 = 65567870;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۢ") + i4) * 29;
                        i5 = ((iM11306 ^ i3) * (-30313)) ^ 1332528354;
                        i6 = 631084131;
                    }
                    break;
                case -966178395:
                case -2437050:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫᩸") ^ i3) * (-37);
                        i5 = ((iM11306 ^ i4) * (-22491)) ^ 1001031317;
                        i6 = -1337492933;
                    } else {
                        iM11306 = C19806.m45029("ۧܽ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-30357)) ^ 44235943;
                        i6 = 2138539788;
                    }
                    break;
                case -878320285:
                case 730261401:
                    if (C1668.f6641 >= 0) {
                        iM11306 = C19806.m45029("ۗܰ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-3427)) ^ 1039878290;
                        i6 = -1447460485;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۚܺ")) * 7;
                        i5 = ((iM11306 ^ i4) * 23317) ^ (-993352900);
                        i6 = 1437873574;
                    }
                    break;
                case -851367431:
                case 1517861375:
                    if (C3722.f13525 <= 0) {
                        iM11306 = C19806.m45029("ۗܰ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-3427)) ^ 1039878290;
                        i6 = -1447460485;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۚܿ")) * (-69);
                        i5 = ((iM11306 ^ i4) * 19061) ^ (-1986237088);
                        i6 = -914031187;
                    }
                    break;
                case -844611319:
                case -331395306:
                    return false;
                case -615191762:
                case 1850604398:
                    if (C2249.m6915() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫᩸") ^ i3) * (-37);
                        i5 = ((iM11306 ^ i4) * (-22491)) ^ 1001031317;
                        i6 = -1337492933;
                    } else {
                        iM11306 = C19806.m45029("ܿܺ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 29709) ^ (-1575932590);
                        i6 = -1387645322;
                    }
                    break;
                case -479248375:
                case -435767863:
                    if (C2704.f10408) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۛ") + i3) * (-113);
                        i5 = ((iM11306 ^ i4) * (-813)) ^ (-852407390);
                        i6 = -333939535;
                    } else {
                        iM11306 = C19806.m45029("ۗܰ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-3427)) ^ 1039878290;
                        i6 = -1447460485;
                    }
                    break;
                case -441472340:
                case 1107600134:
                    RunnableC1895.m6170();
                    if (C0278.m1789() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ᩻") ^ i4;
                        i5 = ((iM11306 ^ i3) * 243) ^ 212531724;
                        i6 = -1449477881;
                    } else {
                        iM11306 = (C19806.m45029("ܳ֡") + i4) * (-105);
                        i5 = ((iM11306 ^ i3) * 12163) ^ 295132457;
                        i6 = -2002457684;
                    }
                    break;
                case -81175639:
                case 198499744:
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫᩸") ^ i3) * (-37);
                        i5 = ((iM11306 ^ i4) * (-22491)) ^ 1001031317;
                        i6 = -1337492933;
                    } else {
                        iM11306 = C19806.m45029("ۜۙ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-8341)) ^ 902564649;
                        i6 = 2054742991;
                    }
                    break;
                case 385892418:
                case 802729882:
                    if (RunnableC3388.m10064()) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺۠") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-16489)) ^ (-1181181516);
                        i6 = -1116194063;
                    } else {
                        iM11306 = C19806.m45029("ۧܽ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-30357)) ^ 44235943;
                        i6 = 2138539788;
                    }
                    break;
                case 424307902:
                case 1692228846:
                    if (isDestroyed()) {
                        iM11306 = C19806.m45029("ܰ۠") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-7163)) ^ (-39272189);
                        i6 = 65567870;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰ֡") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-10635)) ^ (-1640384750);
                        i6 = 731073416;
                    }
                    break;
                default:
                    if (C1377.f5749) {
                        iM11306 = (C19806.m45029("۠֫") ^ i4) * 93;
                        i5 = ((iM11306 ^ i3) * (-29695)) ^ (-199433173);
                        i6 = -2079133958;
                    } else {
                        iM11306 = (C19806.m45029("ܳ֡") + i4) * (-105);
                        i5 = ((iM11306 ^ i3) * 12163) ^ 295132457;
                        i6 = -2002457684;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b2 A[PHI: r3 r8
      0x00b2: PHI (r3v4 l.֡ᩴۘ) = (r3v3 l.֡ᩴۘ), (r3v2 l.֡ᩴۘ) binds: [B:31:0x00b0, B:23:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x00b2: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v3 java.lang.String) binds: [B:31:0x00b0, B:23:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0122 A[PHI: r1 r2
      0x0122: PHI (r1v4 l.۫ᩴۘ) = (r1v3 l.۫ᩴۘ), (r1v1 l.۫ᩴۘ), (r1v1 l.۫ᩴۘ), (r1v1 l.۫ᩴۘ), (r1v1 l.۫ᩴۘ) binds: [B:43:0x0120, B:39:0x0101, B:17:0x0052, B:15:0x004e, B:12:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0122: PHI (r2v4 l.֡ᩴۘ) = (r2v1 l.֡ᩴۘ), (r2v3 l.֡ᩴۘ), (r2v1 l.֡ᩴۘ), (r2v1 l.֡ᩴۘ), (r2v1 l.֡ᩴۘ) binds: [B:43:0x0120, B:39:0x0101, B:17:0x0052, B:15:0x004e, B:12:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x019f A[PHI: r0 r5
      0x019f: PHI (r0v5 l.۫ᩴۘ) = (r0v2 l.۫ᩴۘ), (r0v4 l.۫ᩴۘ), (r0v2 l.۫ᩴۘ) binds: [B:55:0x019d, B:35:0x00e0, B:9:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:55:0x019d, B:35:0x00e0, B:9:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01c7 A[PHI: r4 r6 r7
      0x01c7: PHI (r4v5 int) = (r4v4 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:47:0x0152, B:27:0x0092, B:15:0x004e, B:6:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r6v3 int) = (r6v1 int), (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:47:0x0152, B:27:0x0092, B:15:0x004e, B:6:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r7v3 java.lang.String) = (r7v1 java.lang.String), (r7v2 java.lang.String), (r7v1 java.lang.String), (r7v1 java.lang.String) binds: [B:47:0x0152, B:27:0x0092, B:15:0x004e, B:6:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x01f5  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12562(long j) {
        int iM45029;
        int i;
        C12586 c12586 = null;
        C0590 c0590 = null;
        int i2 = 0;
        String str = null;
        String str2 = null;
        int i3 = 1304535201;
        int i4 = C2642.f10294;
        int i5 = C1460.f5948;
        int iM450210 = (C19806.m45029("۟ۗ") + i4) * (-17);
        int i6 = ((iM450210 ^ i5) * (-4855)) ^ (-928010762);
        int i7 = iM450210 ^ 307010490;
        C12586 c12587 = null;
        C0590 c0591 = null;
        int iM10778 = 0;
        int i8 = 0;
        while (true) {
            i3 = ((((i3 ^ i5) * 11447) >> 31) & i6) ^ i7;
            switch (i3) {
                case -2068591987:
                case -1887853252:
                    if (C3535.m10431() <= 0) {
                        iM45029 = (C19806.m45029("۠ܺ") + i4) * 33;
                        i6 = ((iM45029 ^ i5) * (-13681)) ^ 1389020251;
                        i = -4222487;
                    } else {
                        iM45029 = C19806.m45029("᩶ۨ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-27621)) ^ (-1497052429);
                        i = -2074625814;
                    }
                    i7 = iM45029 ^ i;
                    break;
                case -1696846171:
                case -312241839:
                    iM10778 = C3660.m10778(this.f16053);
                    if (C1025.f4800 >= 0) {
                        iM45029 = C19806.m45029("᩶ܶ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 11673) ^ 1711628305;
                        i = -667123435;
                    } else {
                        iM45029 = C19806.m45029("ܶܰ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 1263) ^ 2133324034;
                        i = 1216857769;
                    }
                    i7 = iM45029 ^ i;
                    break;
                case -1680868894:
                case 1879419675:
                    if (m12554()) {
                        iM45029 = (ThreadFactoryC3888.m11306("֡ᩳ") + i5) * (-77);
                        i6 = ((iM45029 ^ i4) * 24189) ^ (-1304565042);
                        i = -31360547;
                    } else {
                        iM45029 = C19806.m45029("۟ܿ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 17241) ^ (-639611877);
                        i = 314221959;
                    }
                    i7 = iM45029 ^ i;
                    break;
                case -1656305897:
                case -291044818:
                    str2 = c0591.f2560;
                    if (C1377.f5749) {
                        iM45029 = (C19806.m45029("ۖ᩺") ^ i4) * 91;
                        i6 = ((iM45029 ^ i5) * 22477) ^ 70788851;
                        i = -1741684288;
                    } else {
                        iM45029 = C19806.m45029("ۗ֨") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-7783)) ^ (-1392892967);
                        i = -73287638;
                    }
                    i7 = iM45029 ^ i;
                    break;
                case -1535263574:
                case -518334859:
                    RunnableC0195.m1442(new C19642(this, j, iM10778, i8, i2, str, str2));
                    break;
                case -1424186109:
                case -302916251:
                    c0591 = c12587.f42057;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = C19806.m45029("ܽۢ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 19005) ^ (-1370318738);
                        i = -822665051;
                    } else {
                        iM45029 = C19806.m45029("ۗ֨") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-7783)) ^ (-1392892967);
                        i = -73287638;
                    }
                    i7 = iM45029 ^ i;
                    break;
                case -1399741019:
                case -559335987:
                    c12586 = this.f16044;
                    if (C1025.m3861() <= 0) {
                        iM45029 = C19806.m45029("ۗܳ") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-6605)) ^ (-749771630);
                        i = 360817515;
                    } else {
                        iM45029 = C19806.m45029("᩻۫") ^ i4;
                        i6 = ((iM45029 ^ i5) * 3689) ^ (-570379637);
                        i = 61800964;
                    }
                    i7 = iM45029 ^ i;
                    break;
                case -945504081:
                case -781654126:
                    C1977.m6356();
                    C0216.m1591();
                    iM45029 = C19806.m45029("ۗܳ") ^ i5;
                    i6 = ((iM45029 ^ i4) * (-6605)) ^ (-749771630);
                    i = 360817515;
                    i7 = iM45029 ^ i;
                    break;
                case -761758719:
                case 1505010298:
                    C0797.m3359();
                    if (C2477.f9839 > 0) {
                        iM45029 = C19806.m45029("ۗܳ") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-6605)) ^ (-749771630);
                        i = 360817515;
                    } else {
                        iM45029 = C19806.m45029("᩶ܶ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 11673) ^ 1711628305;
                        i = -667123435;
                    }
                    i7 = iM45029 ^ i;
                    break;
                case -739102790:
                case -187509900:
                    if (RunnableC0195.m1431()) {
                        iM45029 = (C19806.m45029("۬ۜ") + i5) * (-43);
                        i6 = ((iM45029 ^ i4) * (-12277)) ^ 1574415511;
                        i = -1193696916;
                    } else {
                        iM45029 = (C19806.m45029("֡۫") ^ i5) * 49;
                        i6 = ((iM45029 ^ i4) * (-529)) ^ 250957569;
                        i = 2057774621;
                    }
                    i7 = iM45029 ^ i;
                    break;
                case -465953887:
                case 2004504333:
                    if (C0278.f1572 > 0) {
                        iM45029 = (C19806.m45029("֡۫") ^ i5) * 49;
                        i6 = ((iM45029 ^ i4) * (-529)) ^ 250957569;
                        i = 2057774621;
                    } else {
                        iM45029 = (C19806.m45029("۠ܺ") + i4) * 33;
                        i6 = ((iM45029 ^ i5) * (-13681)) ^ 1389020251;
                        i = -4222487;
                    }
                    i7 = iM45029 ^ i;
                    break;
                case -440600989:
                case -241697311:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    C0962.m3746();
                    break;
                case -325535491:
                case 604454616:
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM45029 = C19806.m45029("ۗܳ") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-6605)) ^ (-749771630);
                        i = 360817515;
                    } else {
                        iM45029 = (C19806.m45029("֡۫") ^ i5) * 49;
                        i6 = ((iM45029 ^ i4) * (-529)) ^ 250957569;
                        i = 2057774621;
                    }
                    i7 = iM45029 ^ i;
                    break;
                case -156435343:
                case 1260610950:
                    break;
                case 473383918:
                case 1048338649:
                    c0590 = c12586.f42057;
                    if (C2249.m6915() <= 0) {
                        iM45029 = C19806.m45029("ۗܳ") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-6605)) ^ (-749771630);
                        i = 360817515;
                    } else {
                        iM45029 = (C19806.m45029("ۨ᩷") ^ i4) * (-51);
                        i6 = ((iM45029 ^ i5) * (-5643)) ^ (-1293031302);
                        i = -227649541;
                    }
                    i7 = iM45029 ^ i;
                    break;
                case 719405654:
                case 1031461853:
                    i2 = c0591.f2563;
                    str = c0590.f2560;
                    if (RunnableC1564.f6300) {
                        iM45029 = C19806.m45029("᩶ܶ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 11673) ^ 1711628305;
                        i = -667123435;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢۖ") + i4) * (-115);
                        i6 = ((iM45029 ^ i5) * 18375) ^ 59871961;
                        i = 1367600001;
                    }
                    i7 = iM45029 ^ i;
                    break;
                case 1181551114:
                case 1526298755:
                    i8 = c0590.f2563;
                    c12587 = this.f16055;
                    if (C0629.f2722 <= 0) {
                        iM45029 = (C19806.m45029("۠ܺ") + i4) * 33;
                        i6 = ((iM45029 ^ i5) * (-13681)) ^ 1389020251;
                        i = -4222487;
                    } else {
                        iM45029 = (i5 - C19806.m45029("ۗ۫")) * 83;
                        i6 = ((iM45029 ^ i4) * 18591) ^ 1852078786;
                        i = 1478162917;
                    }
                    i7 = iM45029 ^ i;
                    break;
                default:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = C19806.m45029("᩶ܶ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 11673) ^ 1711628305;
                        i = -667123435;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤܺ") + i4) * (-11);
                        i6 = ((iM45029 ^ i5) * 21491) ^ (-552780061);
                        i = 724690796;
                    }
                    i7 = iM45029 ^ i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12601(ViewOnClickListenerC4514 viewOnClickListenerC4514, int i) {
        int[] iArr = null;
        int i2 = 268147509;
        int i3 = C1460.f5948;
        int i4 = C3535.f13026;
        int iM45029 = (i4 - C19806.m45029("۫ܳ")) * (-123);
        int i5 = ((iM45029 ^ i3) * 4837) ^ 435429166;
        int i6 = -1759369878;
        while (true) {
            i2 = ((((i2 ^ i3) * 17307) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -1757118422:
                case -913252856:
                    RunnableC1606.m5473();
                    if (!C19806.f63586) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺܽ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-22763)) ^ (-397288818);
                        i6 = 1996121533;
                    } else {
                        iM45029 = (C19806.m45029("᩺ܳ") ^ i3) * 39;
                        i5 = ((iM45029 ^ i4) * (-21927)) ^ 1303902600;
                        i6 = -804102145;
                    }
                    break;
                case -1425603138:
                case 1547868731:
                    if (C1668.f6641 < 0) {
                        iM45029 = C19806.m45029("ۖ֫") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-3225)) ^ 1139405318;
                        i6 = -1771029630;
                    } else {
                        iM45029 = (C19806.m45029("᩺ܳ") ^ i3) * 39;
                        i5 = ((iM45029 ^ i4) * (-21927)) ^ 1303902600;
                        i6 = -804102145;
                    }
                    break;
                case -1422318447:
                case -606843702:
                    if (C1461.f5957 <= 0) {
                        iM45029 = C19806.m45029("ۖ֫") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-3225)) ^ 1139405318;
                        i6 = -1771029630;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤۡ") + i3) * (-31);
                        i5 = ((iM45029 ^ i4) * 8581) ^ 1989104665;
                        i6 = 514435697;
                    }
                    break;
                case -962519737:
                case 2139271586:
                    if (C1398.m4895() <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܽᩴ")) * 45;
                        i5 = ((iM45029 ^ i4) * (-9975)) ^ (-901786359);
                        i6 = 1267462920;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘܶ") + i4) * (-103);
                        i5 = ((iM45029 ^ i3) * 21311) ^ (-827058696);
                        i6 = 331997794;
                    }
                    break;
                case -950175794:
                case 2022685113:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩷") ^ i4;
                        i5 = ((iM45029 ^ i3) * 23911) ^ (-460541348);
                        i6 = -2094599251;
                    } else {
                        iM45029 = C19806.m45029("ۖ֫") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-3225)) ^ 1139405318;
                        i6 = -1771029630;
                    }
                    break;
                case -590989579:
                case 769659243:
                    if (C0216.f1393 != 0) {
                        iM45029 = (C19806.m45029("᩺ܳ") ^ i3) * 39;
                        i5 = ((iM45029 ^ i4) * (-21927)) ^ 1303902600;
                        i6 = -804102145;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܺ᩺")) * (-65);
                        i5 = ((iM45029 ^ i4) * (-18375)) ^ 1582845420;
                        i6 = 525405587;
                    }
                    break;
                case -344978450:
                case 109394924:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (C19806.m45029("᩺ܳ") ^ i3) * 39;
                        i5 = ((iM45029 ^ i4) * (-21927)) ^ 1303902600;
                        i6 = -804102145;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ۠") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-12743)) ^ (-293380478);
                        i6 = 155772695;
                    }
                    break;
                case -342818114:
                case -190152047:
                    if (RunnableC1895.f7152) {
                        iM45029 = (C19806.m45029("ۜᩴ") + i3) * 65;
                        i5 = ((iM45029 ^ i4) * 12971) ^ 1229181977;
                        i6 = -277769310;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺܽ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-22763)) ^ (-397288818);
                        i6 = 1996121533;
                    }
                    break;
                case -201661125:
                case 378849672:
                    if (C2249.f8050 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܽᩴ")) * 45;
                        i5 = ((iM45029 ^ i4) * (-9975)) ^ (-901786359);
                        i6 = 1267462920;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۖ۫")) * 79;
                        i5 = ((iM45029 ^ i3) * (-20869)) ^ (-1490254213);
                        i6 = 1054220615;
                    }
                    break;
                case 44173307:
                case 1453850702:
                    if (C2704.f10408) {
                        iM45029 = (i3 - C19806.m45029("ۜܺ")) * (-65);
                        i5 = ((iM45029 ^ i4) * (-28815)) ^ 171295220;
                        i6 = 15411616;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܽᩴ")) * 45;
                        i5 = ((iM45029 ^ i4) * (-9975)) ^ (-901786359);
                        i6 = 1267462920;
                    }
                    break;
                case 92080989:
                case 689618657:
                    C3535.m10431();
                    C1460.m5050();
                    break;
                case 165063385:
                case 1676626648:
                    if (C1148.f5161 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܽᩴ")) * 45;
                        i5 = ((iM45029 ^ i4) * (-9975)) ^ (-901786359);
                        i6 = 1267462920;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ܽܶ")) * 5;
                        i5 = ((iM45029 ^ i3) * (-20937)) ^ (-493797961);
                        i6 = 737551375;
                    }
                    break;
                case 409990954:
                case 1012155759:
                    C0629.m2907();
                    if (C1189.f5284 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܽᩴ")) * 45;
                        i5 = ((iM45029 ^ i4) * (-9975)) ^ (-901786359);
                        i6 = 1267462920;
                    } else {
                        iM45029 = C19806.m45029("ۖ֫") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-3225)) ^ 1139405318;
                        i6 = -1771029630;
                    }
                    break;
                case 601436349:
                case 713019752:
                    viewOnClickListenerC4514.f16060 = iArr[i];
                    break;
                case 1655131026:
                case 2141613783:
                    iArr = f16036;
                    if (C1066.f4915 <= 0) {
                        iM45029 = C19806.m45029("᩺᩺") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-27243)) ^ (-1278287656);
                        i6 = -666792039;
                    } else {
                        iM45029 = C19806.m45029("᩺᩻") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-12833)) ^ (-1296613939);
                        i6 = -942867894;
                    }
                    break;
                default:
                    C1419.m4973();
                    C10634.m26820();
                    iM45029 = ThreadFactoryC3888.m11306("ܺܽ") ^ i4;
                    i5 = ((iM45029 ^ i3) * (-22763)) ^ (-397288818);
                    i6 = 1996121533;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m12594(ViewOnClickListenerC4514 viewOnClickListenerC4514, int i) throws Throwable {
        long j = 0;
        int i2 = 677669307;
        int i3 = C2642.f10294;
        int i4 = C1937.f7317;
        int iM45029 = C19806.m45029("ܿܿ") ^ i3;
        int i5 = ((iM45029 ^ i4) * 19929) ^ 143576186;
        int i6 = -1886930041;
        while (true) {
            i2 = ((((i2 ^ i4) * 10581) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2011978651:
                case -389635481:
                    if (C0817.f3443) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ᩻") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-5243)) ^ (-1711625026);
                        i6 = 368470938;
                    } else {
                        iM45029 = C19806.m45029("᩸۫") ^ i4;
                        i5 = ((iM45029 ^ i3) * 8283) ^ 905623368;
                        i6 = -1972173866;
                    }
                    break;
                case -1877203363:
                case 1849795640:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ᩹") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-31077)) ^ 1741376984;
                        i6 = 2054984498;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩸ۛ")) * 109;
                        i5 = ((iM45029 ^ i4) * (-28701)) ^ 847308945;
                        i6 = -1621014575;
                    }
                    break;
                case -1849679879:
                case 1049164746:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (C3660.f13403 >= 0) {
                        iM45029 = C19806.m45029("᩸۫") ^ i4;
                        i5 = ((iM45029 ^ i3) * 8283) ^ 905623368;
                        i6 = -1972173866;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ۠") ^ i3;
                        i5 = ((iM45029 ^ i4) * 13049) ^ 946847252;
                        i6 = 1472954265;
                    }
                    break;
                case -1847846746:
                case 1462523888:
                    if (C0216.f1393 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ۠") ^ i3;
                        i5 = ((iM45029 ^ i4) * 13049) ^ 946847252;
                        i6 = 1472954265;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۘᩴ")) * 123;
                        i5 = ((iM45029 ^ i4) * (-26285)) ^ (-1958982713);
                        i6 = -947407219;
                    }
                    break;
                case -1838969031:
                case -323778982:
                    if (C2642.f10294 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ᩹") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-31077)) ^ 1741376984;
                        i6 = 2054984498;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨ֨") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-8249)) ^ (-1511353173);
                        i6 = -1869548344;
                    }
                    break;
                case -1809346849:
                case 357642699:
                    break;
                case -1479334139:
                case 608058118:
                    j = 100;
                    iM45029 = ThreadFactoryC3888.m11306("᩺ܽ") ^ i4;
                    i5 = ((iM45029 ^ i3) * (-13371)) ^ (-973534256);
                    i6 = 811848819;
                    break;
                case -1362036469:
                case -176405316:
                    if (C2871.f10837 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ۟") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-25161)) ^ 1709669310;
                        i6 = -1592868591;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۗۛ")) * (-73);
                        i5 = ((iM45029 ^ i4) * 23331) ^ (-1728434061);
                        i6 = -1413167222;
                    }
                    break;
                case -1140155579:
                case -473433917:
                    if (CallableC1627.f6528) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢۘ") + i4) * (-73);
                        i5 = ((iM45029 ^ i3) * (-1867)) ^ (-569989880);
                        i6 = -482507901;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ۟") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-25161)) ^ 1709669310;
                        i6 = -1592868591;
                    }
                    break;
                case -606298851:
                case 2132708713:
                    try {
                        SystemClock.sleep(j);
                        C12586 c12586 = viewOnClickListenerC4514.f16044;
                        viewOnClickListenerC4514.m12563(c12586.f42057.f2562, c12586.f42056, viewOnClickListenerC4514.f16064, i);
                        break;
                    } catch (Exception unused) {
                    }
                    iM45029 = (C19806.m45029("᩻۠") ^ i3) * (-9);
                    i5 = ((iM45029 ^ i4) * 32615) ^ (-1756668376);
                    i6 = -151740478;
                    break;
                case -190905554:
                case -28643244:
                    if (C3286.f12186) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ۟") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-25161)) ^ 1709669310;
                        i6 = -1592868591;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬᩶") ^ i3;
                        i5 = ((iM45029 ^ i4) * 30087) ^ 690298269;
                        i6 = 763631851;
                    }
                    break;
                case 154557972:
                case 1577402626:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ۠") ^ i3;
                        i5 = ((iM45029 ^ i4) * 13049) ^ 946847252;
                        i6 = 1472954265;
                    } else {
                        iM45029 = (C19806.m45029("ܰۜ") ^ i3) * (-41);
                        i5 = ((iM45029 ^ i4) * 13625) ^ 971891225;
                        i6 = 1276767167;
                    }
                    break;
                case 260607225:
                case 1253207733:
                    RunnableC1564.m5345();
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ۠") ^ i3;
                        i5 = ((iM45029 ^ i4) * 13049) ^ 946847252;
                        i6 = 1472954265;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۛ") + i3) * (-13);
                        i5 = ((iM45029 ^ i4) * 22687) ^ (-1462395695);
                        i6 = 379849680;
                    }
                    break;
                case 325921357:
                case 840930267:
                    if (C2704.m8255() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ᩹") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-31077)) ^ 1741376984;
                        i6 = 2054984498;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬ܰ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-31981)) ^ (-99498241);
                        i6 = -1246107221;
                    }
                    break;
                case 458617420:
                case 1640779208:
                    C1668.m5583();
                    C3743.m10966();
                    iM45029 = ThreadFactoryC3888.m11306("ۗ۠") ^ i3;
                    i5 = ((iM45029 ^ i4) * 13049) ^ 946847252;
                    i6 = 1472954265;
                    break;
                case 843145360:
                case 1213259594:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    C0797.m3359();
                    break;
                case 1984431279:
                case 2066504293:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ۠") ^ i3;
                        i5 = ((iM45029 ^ i4) * 13049) ^ 946847252;
                        i6 = 1472954265;
                    } else {
                        iM45029 = C19806.m45029("ۨۧ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-9137)) ^ (-450228881);
                        i6 = 515960110;
                    }
                    break;
                default:
                    if (C1377.m4833() == 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ᩹") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-31077)) ^ 1741376984;
                        i6 = 2054984498;
                    } else {
                        iM45029 = C19806.m45029("᩸۫") ^ i4;
                        i5 = ((iM45029 ^ i3) * 8283) ^ 905623368;
                        i6 = -1972173866;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x0133 A[PHI: r11 r12 r15 r16 r22
      0x0133: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v6 int) binds: [B:66:0x02b8, B:34:0x0131, B:6:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0133: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v6 int) binds: [B:66:0x02b8, B:34:0x0131, B:6:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0133: PHI (r15v5 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:66:0x02b8, B:34:0x0131, B:6:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0133: PHI (r16v5 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:66:0x02b8, B:34:0x0131, B:6:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0133: PHI (r22v22 android.os.Bundle) = (r22v5 android.os.Bundle), (r22v15 android.os.Bundle), (r22v25 android.os.Bundle) binds: [B:66:0x02b8, B:34:0x0131, B:6:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0284 A[PHI: r2 r5 r13 r14 r17 r18 r22
      0x0284: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:62:0x0282, B:58:0x0261, B:38:0x015f, B:10:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0284: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:62:0x0282, B:58:0x0261, B:38:0x015f, B:10:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0284: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:62:0x0282, B:58:0x0261, B:38:0x015f, B:10:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0284: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:62:0x0282, B:58:0x0261, B:38:0x015f, B:10:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0284: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:62:0x0282, B:58:0x0261, B:38:0x015f, B:10:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0284: PHI (r18v4 short) = (r18v2 short), (r18v3 short), (r18v2 short), (r18v2 short) binds: [B:62:0x0282, B:58:0x0261, B:38:0x015f, B:10:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0284: PHI (r22v17 android.os.Bundle) = (r22v6 android.os.Bundle), (r22v7 android.os.Bundle), (r22v14 android.os.Bundle), (r22v18 android.os.Bundle) binds: [B:62:0x0282, B:58:0x0261, B:38:0x015f, B:10:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x02bc A[PHI: r1 r3 r10 r11 r12 r15 r16
      0x02bc: PHI (r1v43 android.os.Bundle) = (r1v24 android.os.Bundle), (r1v2 android.os.Bundle), (r1v47 android.os.Bundle) binds: [B:43:0x019c, B:30:0x010b, B:35:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r3v4 short[]) = (r3v2 short[]), (r3v3 short[]), (r3v2 short[]) binds: [B:43:0x019c, B:30:0x010b, B:35:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:43:0x019c, B:30:0x010b, B:35:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:43:0x019c, B:30:0x010b, B:35:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v4 int) binds: [B:43:0x019c, B:30:0x010b, B:35:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v5 int) binds: [B:43:0x019c, B:30:0x010b, B:35:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r16v4 short[]) = (r16v2 short[]), (r16v2 short[]), (r16v5 short[]) binds: [B:43:0x019c, B:30:0x010b, B:35:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m12592(String str) {
        int iM45029;
        int i;
        int i2;
        int i3;
        int i4 = C1189.f5284;
        int i5 = C1668.f6641;
        int iM11306 = (ThreadFactoryC3888.m11306("֡ۧ") ^ i4) * (-45);
        int i6 = ((iM11306 ^ i5) * 30501) ^ 1447646255;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i7 = iM11306 ^ 404277484;
        int i8 = 0;
        short s = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        char c = 0;
        short s3 = 0;
        int i15 = -1676319597;
        int i16 = 0;
        String strM9715 = null;
        Bundle bundle = null;
        while (true) {
            i15 = i7 ^ (i6 & (((i15 ^ i5) * (-20319)) >> 31));
            switch (i15) {
                case -2077616450:
                case -45066915:
                    i9 = 4;
                    if (RunnableC0195.f1321 >= 0) {
                        i3 = 324;
                        int iM450210 = (C19806.m45029("᩶᩻") + i5) * 11;
                        int i17 = i3;
                        i6 = ((iM450210 ^ i4) * (-7359)) ^ 60112511;
                        i7 = iM450210 ^ (-1490808780);
                        i8 = i17;
                    } else {
                        int iM11307 = ThreadFactoryC3888.m11306("ۧۢ") ^ i4;
                        i6 = ((iM11307 ^ i5) * (-24483)) ^ (-960294390);
                        i7 = iM11307 ^ 1970611056;
                        i8 = 324;
                    }
                    break;
                case -1897776367:
                case 87246234:
                    bundle.putString(ViewGroupOnHierarchyChangeListenerC1916.m6241(sArr4, i8, i9, i10), str);
                    Main.m66((Activity) this, bundle, false);
                    break;
                case -1850300108:
                case 56252050:
                    if (C1148.f5161 <= 0) {
                        bundle = bundle;
                        iM45029 = ThreadFactoryC3888.m11306("ܽܺ") ^ i4;
                        i = ((iM45029 ^ i5) * 9433) ^ 310775727;
                        i2 = -2006222544;
                        Bundle bundle2 = bundle;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        bundle = bundle2;
                    } else {
                        i3 = i8;
                        int iM450211 = (C19806.m45029("᩶᩻") + i5) * 11;
                        int i18 = i3;
                        i6 = ((iM450211 ^ i4) * (-7359)) ^ 60112511;
                        i7 = iM450211 ^ (-1490808780);
                        i8 = i18;
                    }
                    break;
                case -1833742662:
                case 625515896:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    bundle = bundle;
                    iM45029 = C19806.m45029("ۛ᩸") ^ i5;
                    i = ((iM45029 ^ i4) * (-21291)) ^ 768663261;
                    i2 = 878557063;
                    Bundle bundle3 = bundle;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    bundle = bundle3;
                    break;
                case -1715373997:
                case 1741607125:
                    i10 = 43404;
                    iM45029 = (i5 - ThreadFactoryC3888.m11306("ܶۧ")) * (-93);
                    i = ((iM45029 ^ i4) * (-27355)) ^ 1457840263;
                    i2 = 1346793244;
                    Bundle bundle4 = bundle;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    bundle = bundle4;
                    break;
                case -1706384061:
                case -1377500497:
                    bundle = bundle;
                    if (i16 - (s * s2) < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨᩷") ^ i5;
                        i = ((iM45029 ^ i4) * (-3683)) ^ (-1126651909);
                        i2 = 247160067;
                    } else {
                        iM45029 = (C19806.m45029("᩷۟") ^ i4) * (-9);
                        i = ((iM45029 ^ i5) * (-28205)) ^ (-733184090);
                        i2 = -1357913294;
                    }
                    Bundle bundle5 = bundle;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    bundle = bundle5;
                    break;
                case -1568566899:
                case -775710133:
                    i10 = 44974;
                    iM45029 = (i5 - ThreadFactoryC3888.m11306("ܶۧ")) * (-93);
                    i = ((iM45029 ^ i4) * (-27355)) ^ 1457840263;
                    i2 = 1346793244;
                    Bundle bundle6 = bundle;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    bundle = bundle6;
                    break;
                case -1557678619:
                case -134395337:
                    C1461.m5080();
                    break;
                case -1460818346:
                case 2042568982:
                    bundle = new Bundle();
                    sArr2 = f16037;
                    if (C3743.m10966() <= 0) {
                        iM45029 = (C19806.m45029("᩺ܰ") + i5) * 61;
                        bundle = bundle;
                        i = ((iM45029 ^ i4) * 19199) ^ 78705942;
                        i2 = -1242965605;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ۬") ^ i4;
                        bundle = bundle;
                        i = ((iM45029 ^ i5) * (-19763)) ^ (-1131406347);
                        i2 = 1395469393;
                    }
                    Bundle bundle7 = bundle;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    bundle = bundle7;
                    break;
                case -1394183654:
                case 1454635356:
                    C7105.m18985();
                    if (C1377.f5749) {
                        int iM450212 = (C19806.m45029("ܿۙ") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = iM450212 ^ 238754225;
                        i6 = ((iM450212 ^ i5) * (-10181)) ^ (-1608145934);
                    } else {
                        bundle = bundle;
                        iM45029 = C19806.m45029("ۛ᩸") ^ i5;
                        i = ((iM45029 ^ i4) * (-21291)) ^ 768663261;
                        i2 = 878557063;
                        Bundle bundle8 = bundle;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        bundle = bundle8;
                    }
                    break;
                case -1235209892:
                case 1600052187:
                    bundle = bundle;
                    strM9715 = MenuItemOnMenuItemClickListenerC3244.m9715(sArr2, i11, i12, i10);
                    sArr3 = f16037;
                    i13 = 310;
                    if (C0526.m2437() >= 0) {
                        iM45029 = C19806.m45029("ۛ᩸") ^ i5;
                        i = ((iM45029 ^ i4) * (-21291)) ^ 768663261;
                        i2 = 878557063;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡᩶") ^ i5;
                        i = ((iM45029 ^ i4) * (-6743)) ^ 1458163529;
                        i2 = -1102632168;
                    }
                    Bundle bundle9 = bundle;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    bundle = bundle9;
                    break;
                case -1133713972:
                case 1746597383:
                    bundle = bundle;
                    s = sArr[c];
                    s3 = 6073;
                    if (C1148.f5161 <= 0) {
                        iM45029 = C19806.m45029("ۛ᩸") ^ i5;
                        i = ((iM45029 ^ i4) * (-21291)) ^ 768663261;
                        i2 = 878557063;
                    } else {
                        iM45029 = C19806.m45029("ۧۧ") ^ i4;
                        i = ((iM45029 ^ i5) * (-21919)) ^ (-1959506150);
                        i2 = -1619074407;
                    }
                    Bundle bundle10 = bundle;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    bundle = bundle10;
                    break;
                case -705500277:
                case 1873684838:
                    bundle = bundle;
                    c = 300;
                    if (C2332.f8260) {
                        iM45029 = (C19806.m45029("ۢ֫") + i4) * (-89);
                        i = ((iM45029 ^ i5) * 25989) ^ (-857620698);
                        i2 = -1626871599;
                    } else {
                        iM45029 = C19806.m45029("ۛ᩸") ^ i5;
                        i = ((iM45029 ^ i4) * (-21291)) ^ 768663261;
                        i2 = 878557063;
                    }
                    Bundle bundle11 = bundle;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    bundle = bundle11;
                    break;
                case -281508792:
                case 594999516:
                    bundle = bundle;
                    int i19 = s + s3;
                    i16 = i19 * i19;
                    s2 = 24292;
                    if (C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ۠") ^ i5;
                        i = ((iM45029 ^ i4) * 29401) ^ (-815455805);
                        i2 = 983512281;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽܺ") ^ i4;
                        i = ((iM45029 ^ i5) * 9433) ^ 310775727;
                        i2 = -2006222544;
                    }
                    Bundle bundle12 = bundle;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    bundle = bundle12;
                    break;
                case -131259236:
                case 1643531016:
                    if (!RunnableC1895.f7152) {
                        bundle = bundle;
                        iM45029 = C19806.m45029("ۛ᩸") ^ i5;
                        i = ((iM45029 ^ i4) * (-21291)) ^ 768663261;
                        i2 = 878557063;
                        Bundle bundle13 = bundle;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        bundle = bundle13;
                    } else {
                        i3 = i8;
                        int iM450213 = (C19806.m45029("᩶᩻") + i5) * 11;
                        int i110 = i3;
                        i6 = ((iM450213 ^ i4) * (-7359)) ^ 60112511;
                        i7 = iM450213 ^ (-1490808780);
                        i8 = i110;
                    }
                    break;
                case 489947236:
                case 1538753881:
                    bundle = bundle;
                    sArr = f16037;
                    if (CallableC1627.f6528) {
                        iM45029 = C19806.m45029("۫۬") ^ i5;
                        i = ((iM45029 ^ i4) * 32361) ^ 519699210;
                        i2 = 1116265077;
                    } else {
                        bundle = bundle;
                        iM45029 = (C19806.m45029("᩺ܰ") + i5) * 61;
                        bundle = bundle;
                        i = ((iM45029 ^ i4) * 19199) ^ 78705942;
                        i2 = -1242965605;
                    }
                    Bundle bundle14 = bundle;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    bundle = bundle14;
                    break;
                case 646638553:
                case 1405388642:
                    bundle.putString(strM9715, C1460.m5047(sArr3, i13, i14, i10));
                    sArr4 = f16037;
                    if (C3535.f13026 <= 0) {
                        iM45029 = (C19806.m45029("᩺ܰ") + i5) * 61;
                        bundle = bundle;
                        i = ((iM45029 ^ i4) * 19199) ^ 78705942;
                        i2 = -1242965605;
                    } else {
                        iM45029 = (C19806.m45029("ܶ᩻") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        bundle = bundle;
                        i = ((iM45029 ^ i5) * (-30809)) ^ 1876900838;
                        i2 = -1469463982;
                    }
                    Bundle bundle15 = bundle;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    bundle = bundle15;
                    break;
                case 691867506:
                case 1032073512:
                    bundle = bundle;
                    i14 = 14;
                    if (C0278.f1572 <= 0) {
                        bundle = bundle;
                        iM45029 = (C19806.m45029("᩺ܰ") + i5) * 61;
                        bundle = bundle;
                        i = ((iM45029 ^ i4) * 19199) ^ 78705942;
                        i2 = -1242965605;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ᩶") + i5) * (-23);
                        i = ((iM45029 ^ i4) * (-23785)) ^ 569643562;
                        i2 = 807053764;
                    }
                    Bundle bundle16 = bundle;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    bundle = bundle16;
                    break;
                default:
                    bundle = bundle;
                    i11 = 301;
                    i12 = 9;
                    if (C10634.f36300 >= 0) {
                        bundle = bundle;
                        iM45029 = (C19806.m45029("᩺ܰ") + i5) * 61;
                        bundle = bundle;
                        i = ((iM45029 ^ i4) * 19199) ^ 78705942;
                        i2 = -1242965605;
                    } else {
                        iM45029 = C19806.m45029("ۧ۟") ^ i4;
                        i = ((iM45029 ^ i5) * 17571) ^ (-1184011355);
                        i2 = -970565707;
                    }
                    Bundle bundle17 = bundle;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    bundle = bundle17;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m12580(ViewOnClickListenerC4514 viewOnClickListenerC4514, int i, int i2, int i3, String str, String str2) {
        C0590 c0590 = null;
        int i4 = -506748087;
        int i5 = C3535.f13026;
        int i6 = C2249.f8050;
        int iM11306 = ThreadFactoryC3888.m11306("ܳۗ") ^ i6;
        int i7 = ((iM11306 ^ i5) * 455) ^ (-209984610);
        int i8 = 874417295;
        while (true) {
            i4 = ((((i4 ^ i5) * (-19085)) >> 31) & i7) ^ (iM11306 ^ i8);
            switch (i4) {
                case -2050358442:
                case -193119260:
                    if (C1937.f7317 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۗ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 31059) ^ 1866542982;
                        i8 = -2055334602;
                    } else {
                        iM11306 = (i6 - C19806.m45029("۠ۜ")) * 29;
                        i7 = ((iM11306 ^ i5) * (-851)) ^ (-1579395498);
                        i8 = 234642803;
                    }
                    break;
                case -1893784607:
                case -1240721830:
                    viewOnClickListenerC4514.m12562(0L);
                    return true;
                case -1604172053:
                case 2057471262:
                    if (C2871.f10837 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۗ") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-23369)) ^ 1079374913;
                        i8 = 365783097;
                    } else {
                        iM11306 = C19806.m45029("᩵۫") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-22619)) ^ 303954450;
                        i8 = -204003761;
                    }
                    break;
                case -1563605382:
                case -598523485:
                    if (C2642.f10294 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۗ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 31059) ^ 1866542982;
                        i8 = -2055334602;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶۛ") ^ i5) * (-31);
                        i7 = ((iM11306 ^ i6) * (-3595)) ^ 1314862400;
                        i8 = 641977415;
                    }
                    break;
                case -1416140822:
                case 1937871479:
                    if (C1189.m4368() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ᩺") ^ i6;
                        i7 = ((iM11306 ^ i5) * 47) ^ 728925029;
                        i8 = -612139116;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬۠") + i6) * 11;
                        i7 = ((iM11306 ^ i5) * 3101) ^ (-1106758609);
                        i8 = -1624919763;
                    }
                    break;
                case -1152865887:
                case 1244499673:
                    if (C2477.f9839 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ᩺") ^ i6;
                        i7 = ((iM11306 ^ i5) * 47) ^ 728925029;
                        i8 = -612139116;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫ᩴ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 1029) ^ 1388865264;
                        i8 = -1015900630;
                    }
                    break;
                case -1118863929:
                case -796339260:
                    if (C7105.f23796 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ᩺") ^ i6;
                        i7 = ((iM11306 ^ i5) * 47) ^ 728925029;
                        i8 = -612139116;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵֫") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-31135)) ^ (-1652017901);
                        i8 = -8305886;
                    }
                    break;
                case -1099951610:
                case 175256563:
                    if (C0050.f912 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۗ") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-23369)) ^ 1079374913;
                        i8 = 365783097;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ᩺") ^ i6;
                        i7 = ((iM11306 ^ i5) * 47) ^ 728925029;
                        i8 = -612139116;
                    }
                    break;
                case -1090104184:
                case -531794479:
                    if (!C2704.m8252(str2, viewOnClickListenerC4514.f16055.f42057.f2560)) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙᩳ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 311) ^ (-237621283);
                        i8 = 1333566516;
                    } else {
                        iM11306 = C19806.m45029("۟ۛ") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-5003)) ^ 945666268;
                        i8 = 422876111;
                    }
                    break;
                case -1015126605:
                case 1287252045:
                    if (viewOnClickListenerC4514.m12554()) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۖ") ^ i5;
                        i7 = ((iM11306 ^ i6) * 2027) ^ (-1176352655);
                        i8 = -1568862913;
                    } else {
                        iM11306 = C19806.m45029("۟ۛ") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-5003)) ^ 945666268;
                        i8 = 422876111;
                    }
                    break;
                case -958721164:
                case 200867610:
                    if (C2249.f8050 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۗ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 31059) ^ 1866542982;
                        i8 = -2055334602;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫۠") ^ i5) * 53;
                        i7 = ((iM11306 ^ i6) * 26405) ^ (-329685870);
                        i8 = 1681118037;
                    }
                    break;
                case -816046837:
                case 195670867:
                    if (C1148.m4232() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ֡") ^ i5;
                        i7 = ((iM11306 ^ i6) * 9441) ^ 100197899;
                        i8 = -510604585;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺ֨") ^ i6) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i7 = ((iM11306 ^ i5) * 18763) ^ 368702883;
                        i8 = 1322225483;
                    }
                    break;
                case -739663650:
                case -626543933:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۗ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 31059) ^ 1866542982;
                        i8 = -2055334602;
                    } else {
                        iM11306 = C19806.m45029("ۘܳ") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-17859)) ^ 646206370;
                        i8 = -193494866;
                    }
                    break;
                case -648603268:
                case 2112335164:
                    return false;
                case -613698836:
                case 685253349:
                    if (C0629.f2722 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ֡") ^ i5;
                        i7 = ((iM11306 ^ i6) * 9441) ^ 100197899;
                        i8 = -510604585;
                    } else {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۗ᩹")) * (-31);
                        i7 = ((iM11306 ^ i6) * 9283) ^ (-1067538322);
                        i8 = -1398176522;
                    }
                    break;
                case -600143260:
                case 1166428029:
                    if (i == C0629.m2913(viewOnClickListenerC4514.f16053)) {
                        iM11306 = C19806.m45029("ۘ᩻") ^ i5;
                        i7 = ((iM11306 ^ i6) * 3677) ^ (-1405362087);
                        i8 = -1667320049;
                    } else {
                        iM11306 = C19806.m45029("۟ۛ") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-5003)) ^ 945666268;
                        i8 = 422876111;
                    }
                    break;
                case -587593027:
                case 1159567542:
                    C1977.m6356();
                    if (C0216.f1393 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ֡") ^ i5;
                        i7 = ((iM11306 ^ i6) * 9441) ^ 100197899;
                        i8 = -510604585;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫ᩴ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 1029) ^ 1388865264;
                        i8 = -1015900630;
                    }
                    break;
                case -39988090:
                case 1107552901:
                    c0590 = viewOnClickListenerC4514.f16044.f42057;
                    if (c0590.f2563 == i2) {
                        iM11306 = (C19806.m45029("᩶۠") ^ i5) * 53;
                        i7 = ((iM11306 ^ i6) * (-27623)) ^ 1189857691;
                        i8 = 478076669;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙᩳ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 311) ^ (-237621283);
                        i8 = 1333566516;
                    }
                    break;
                case 51460012:
                case 2110858913:
                    C0797.m3359();
                    C2477.m7593();
                    return false;
                case 235179930:
                case 867650614:
                    if (C2477.f9839 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ᩴ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 1029) ^ 1388865264;
                        i8 = -1015900630;
                    } else {
                        iM11306 = C19806.m45029("۫ܶ") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-3261)) ^ 103954508;
                        i8 = 327822362;
                    }
                    break;
                case 436215478:
                case 1562762834:
                    if (CallableC1627.m5505(str, c0590.f2560)) {
                        iM11306 = (i5 - C19806.m45029("۬ᩴ")) * 23;
                        i7 = ((iM11306 ^ i6) * (-21327)) ^ (-2059097017);
                        i8 = 571075481;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙᩳ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 311) ^ (-237621283);
                        i8 = 1333566516;
                    }
                    break;
                case 467719648:
                case 2042284832:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    iM11306 = ThreadFactoryC3888.m11306("۫ᩴ") ^ i6;
                    i7 = ((iM11306 ^ i5) * 1029) ^ 1388865264;
                    i8 = -1015900630;
                    break;
                default:
                    if (viewOnClickListenerC4514.f16055.f42057.f2563 == i3) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗۨ") ^ i6) * 25;
                        i7 = ((iM11306 ^ i5) * (-29019)) ^ 933891121;
                        i8 = -742867752;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙᩳ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 311) ^ (-237621283);
                        i8 = 1333566516;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12566(ViewOnClickListenerC4514 viewOnClickListenerC4514, long j, DialogInterfaceC19356 dialogInterfaceC19356) {
        int i = -1442238471;
        int i2 = C2642.f10294;
        int i3 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM45029 = C19806.m45029("۠ܿ") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-7173)) ^ 411714069;
        int i5 = 429929752;
        while (true) {
            i = ((((i ^ i2) * 8829) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2074240185:
                case 1601721886:
                    if (C1377.m4833() != 0) {
                        iM45029 = C19806.m45029("᩸ܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-22399)) ^ (-1191347836);
                        i5 = 799081968;
                    } else {
                        iM45029 = C19806.m45029("ᩴܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 8543) ^ (-871653246);
                        i5 = 1023888198;
                    }
                    break;
                case -2016366248:
                case -1255006074:
                    C0050.m946();
                    iM45029 = C19806.m45029("᩷֡") ^ i2;
                    i4 = ((iM45029 ^ i3) * 23613) ^ (-1643980043);
                    i5 = 1432718924;
                    break;
                case -1648638931:
                case -1503164030:
                    if (C3286.f12186) {
                        iM45029 = C19806.m45029("᩸ܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-22399)) ^ (-1191347836);
                        i5 = 799081968;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 29551) ^ (-576604182);
                        i5 = -642607935;
                    }
                    break;
                case -1629775794:
                case 307963437:
                    C13872.m33716(j);
                    if (viewOnClickListenerC4514.f16041 == dialogInterfaceC19356) {
                        iM45029 = C19806.m45029("᩸ۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 25045) ^ (-1325055637);
                        i5 = -247199357;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-20407)) ^ 1879372469;
                        i5 = -1976242583;
                    }
                    break;
                case -1549374622:
                case -83606602:
                    if (C1875.m6086() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۟᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16857)) ^ 383118698;
                        i5 = -1368252694;
                    } else {
                        iM45029 = (C19806.m45029("ᩴ֡") ^ i2) * 123;
                        i4 = ((iM45029 ^ i3) * (-9541)) ^ (-882062275);
                        i5 = 1014194080;
                    }
                    break;
                case -1497006192:
                case -1342532771:
                    if (C1937.f7317 >= 0) {
                        iM45029 = C19806.m45029("᩷֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * 23613) ^ (-1643980043);
                        i5 = 1432718924;
                    } else {
                        iM45029 = (C19806.m45029("ۘᩴ") + i3) * (-81);
                        i4 = ((iM45029 ^ i2) * (-25267)) ^ 453966415;
                        i5 = -1381119265;
                    }
                    break;
                case -1425267220:
                case -970377858:
                    if (C1977.f7413 <= 0) {
                        iM45029 = (i3 - C19806.m45029("۫᩺")) * 65;
                        i4 = ((iM45029 ^ i2) * 13161) ^ 492647580;
                        i5 = 1721427856;
                    } else {
                        iM45029 = C19806.m45029("ܿۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-16843)) ^ (-465881523);
                        i5 = -943990086;
                    }
                    break;
                case -1290734399:
                case 1832973744:
                    C2332.m7079();
                    if (!C3286.f12186) {
                        iM45029 = C19806.m45029("᩸ܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-22399)) ^ (-1191347836);
                        i5 = 799081968;
                    } else {
                        iM45029 = C19806.m45029("᩷֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * 23613) ^ (-1643980043);
                        i5 = 1432718924;
                    }
                    break;
                case -668973064:
                case -597606132:
                    if (C0526.f2219) {
                        iM45029 = C19806.m45029("᩷֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * 23613) ^ (-1643980043);
                        i5 = 1432718924;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 19063) ^ 1060222509;
                        i5 = 130306442;
                    }
                    break;
                case -287553320:
                case 1330585071:
                    viewOnClickListenerC4514.f16041 = null;
                    iM45029 = ThreadFactoryC3888.m11306("ۚۙ") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-20407)) ^ 1879372469;
                    i5 = -1976242583;
                    break;
                case -253378011:
                case 655719982:
                    if (RunnableC1895.f7152) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚۧ") + i3) * 95;
                        i4 = ((iM45029 ^ i2) * 6323) ^ 1413346141;
                        i5 = 1571599441;
                    } else {
                        iM45029 = C19806.m45029("ᩴۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13165) ^ 955154903;
                        i5 = -868099340;
                    }
                    break;
                case 174994582:
                case 724967649:
                    break;
                case 259056673:
                case 1870760956:
                    if (C2871.f10837 < 0) {
                        iM45029 = C19806.m45029("ᩴۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13165) ^ 955154903;
                        i5 = -868099340;
                    } else {
                        iM45029 = C19806.m45029("᩸ܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-22399)) ^ (-1191347836);
                        i5 = 799081968;
                    }
                    break;
                case 294034755:
                case 892016243:
                    if (C0817.f3443) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗܿ") + i2) * (-67);
                        i4 = ((iM45029 ^ i3) * (-19515)) ^ 522044440;
                        i5 = -445789980;
                    } else {
                        iM45029 = C19806.m45029("ᩴۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13165) ^ 955154903;
                        i5 = -868099340;
                    }
                    break;
                case 580848186:
                case 1319569645:
                    if (C1148.f5161 <= 0) {
                        iM45029 = C19806.m45029("᩷֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * 23613) ^ (-1643980043);
                        i5 = 1432718924;
                    } else {
                        iM45029 = (C19806.m45029("ۛ֨") ^ i3) * (-79);
                        i4 = ((iM45029 ^ i2) * (-5795)) ^ (-458242997);
                        i5 = -1597756065;
                    }
                    break;
                case 809059336:
                case 1980591683:
                    C3535.m10431();
                    if (C0629.f2722 > 0) {
                        iM45029 = (i3 - C19806.m45029("۫᩺")) * 65;
                        i4 = ((iM45029 ^ i2) * 13161) ^ 492647580;
                        i5 = 1721427856;
                    } else {
                        iM45029 = C19806.m45029("᩷֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * 23613) ^ (-1643980043);
                        i5 = 1432718924;
                    }
                    break;
                case 897446306:
                case 1258147452:
                    C3577.m10565();
                    C7105.m18985();
                    break;
                default:
                    if (C1148.f5161 <= 0) {
                        iM45029 = C19806.m45029("᩷֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * 23613) ^ (-1643980043);
                        i5 = 1432718924;
                    } else {
                        iM45029 = (C19806.m45029("ۤۖ") ^ i3) * (-99);
                        i4 = ((iM45029 ^ i2) * (-32039)) ^ 641909763;
                        i5 = -1435671150;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m12581(C8387 c8387, C8387 c8388) {
        int size = 0;
        boolean z = false;
        int i = 0;
        C16819 c16819 = null;
        C16819 c168110 = null;
        long j = 0;
        PackageInfo packageInfo = null;
        int i2 = 1849963495;
        int i3 = C1419.f5860;
        int i4 = AbstractC0464.f2088;
        int iM45029 = C19806.m45029("ۡۛ") ^ i4;
        int i5 = ((iM45029 ^ i3) * (-6613)) ^ (-1056389008);
        int i6 = -1528943678;
        while (true) {
            int i7 = iM45029 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i3) * (-4515)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2106530255:
                    case 774283490:
                        size = c8387.size();
                        if (C0671.m3008() < 0) {
                            iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩳ᩻")) * (-55);
                            i5 = ((iM45029 ^ i4) * (-32709)) ^ 906327395;
                            i6 = -677537135;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۜ") ^ i4;
                        i5 = ((iM45029 ^ i3) * SecP192K1Field.PInv33) ^ (-1870750487);
                        i6 = 768960570;
                        break;
                    case -2014877001:
                    case -469769225:
                        if (C1189.f5284 <= 0) {
                            iM45029 = (i3 - C19806.m45029("᩹ᩴ")) * (-31);
                            i5 = ((iM45029 ^ i4) * 4065) ^ (-1128146203);
                            i6 = -2120792585;
                            break;
                        }
                        iM45029 = C19806.m45029("ۤܳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 23043) ^ 1238625693;
                        i6 = 2071538118;
                        break;
                    case -1827765446:
                    case 127325527:
                        C2642.m8171();
                        return false;
                    case -1792617467:
                    case 588988974:
                        if (!C0962.f3784) {
                            iM45029 = ThreadFactoryC3888.m11306("ܿۘ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-11331)) ^ (-364368391);
                            i6 = -882060444;
                            break;
                        }
                        iM45029 = (C19806.m45029("ۛۤ") + i3) * 87;
                        i5 = ((iM45029 ^ i4) * (-22401)) ^ 1309584688;
                        i6 = 1185344573;
                        break;
                    case -1698190921:
                    case -1509372055:
                        if (C1189.m4368() > 0) {
                            iM45029 = (i3 - C19806.m45029("᩶ۢ")) * 89;
                            i5 = ((iM45029 ^ i4) * 1133) ^ (-1550041416);
                            i6 = 989480277;
                            break;
                        }
                        iM45029 = (C19806.m45029("ۛۤ") + i3) * 87;
                        i5 = ((iM45029 ^ i4) * (-22401)) ^ 1309584688;
                        i6 = 1185344573;
                        break;
                        break;
                    case -1607478895:
                    case 1877673788:
                        return true;
                    case -1550701688:
                    case -1269702859:
                        RunnableC0195.m1431();
                        if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                            iM45029 = C19806.m45029("ۤܳ") ^ i4;
                            i5 = ((iM45029 ^ i3) * 23043) ^ 1238625693;
                            i6 = 2071538118;
                            break;
                            break;
                        }
                        iM45029 = (C19806.m45029("ۛۤ") + i3) * 87;
                        i5 = ((iM45029 ^ i4) * (-22401)) ^ 1309584688;
                        i6 = 1185344573;
                        break;
                        break;
                    case -1529193466:
                    case 2075905287:
                        j = c16819.f53841.lastUpdateTime;
                        if (!RunnableC3388.m10064()) {
                            iM45029 = ThreadFactoryC3888.m11306("ܿۘ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-11331)) ^ (-364368391);
                            i6 = -882060444;
                            break;
                            break;
                        }
                        iM45029 = C19806.m45029("ܽۙ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-2651)) ^ (-1922351500);
                        i6 = 516761628;
                        break;
                    case -1408772349:
                    case 1740850526:
                        i++;
                        iM45029 = ThreadFactoryC3888.m11306("֡ܳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 32183) ^ (-1429440641);
                        i6 = -390477139;
                        break;
                    case -1327773640:
                    case 261981598:
                        if (i >= c8387.size()) {
                            iM45029 = C19806.m45029("ۗۡ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-28645)) ^ 682908128;
                            i6 = -129123236;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("֨֨") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-27025)) ^ 1881288607;
                        i6 = 65738402;
                        break;
                    case -1207439852:
                    case -699684136:
                        c16819 = (C16819) c8387.get(i);
                        if (C1460.m5050() == 0) {
                            iM45029 = ThreadFactoryC3888.m11306("۫ᩳ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-27775)) ^ (-125836353);
                            i6 = -1173562225;
                            break;
                        }
                        iM45029 = (i3 - C19806.m45029("۠ۡ")) * 17;
                        i5 = ((iM45029 ^ i4) * 4025) ^ (-1552286594);
                        i6 = -865212674;
                        break;
                    case -1175572298:
                    case 2038037579:
                        if (C3743.m10966() > 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ۗ۟") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-4599)) ^ (-57239922);
                            i6 = -636318722;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۜ") ^ i4;
                        i5 = ((iM45029 ^ i3) * SecP192K1Field.PInv33) ^ (-1870750487);
                        i6 = 768960570;
                        break;
                        break;
                    case -1022669311:
                    case 1974789621:
                        if (C0278.f1572 > 0) {
                            iM45029 = (i3 - C19806.m45029("۠ۡ")) * 17;
                            i5 = ((iM45029 ^ i4) * 4025) ^ (-1552286594);
                            i6 = -865212674;
                            break;
                            break;
                        }
                        iM45029 = (i3 - C19806.m45029("᩹ᩴ")) * (-31);
                        i5 = ((iM45029 ^ i4) * 4065) ^ (-1128146203);
                        i6 = -2120792585;
                        break;
                        break;
                    case -811059466:
                    case 1185904647:
                        packageInfo = c168110.f53841;
                        if (C7105.f23796 < 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("᩸ۗ") + i3) * 23;
                            i5 = ((iM45029 ^ i4) * 17975) ^ 685959277;
                            i6 = 1016206983;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("ܿۘ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-11331)) ^ (-364368391);
                        i6 = -882060444;
                        break;
                        break;
                    case -552917736:
                    case 1134254806:
                        C1419.m4973();
                        iM45029 = ThreadFactoryC3888.m11306("ܿۘ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-11331)) ^ (-364368391);
                        i6 = -882060444;
                        break;
                        break;
                    case -273334655:
                    case 749856398:
                        return z;
                    case -64218243:
                    case 221854200:
                        if (j == packageInfo.lastUpdateTime) {
                            iM45029 = (C19806.m45029("ܿ֫") + i4) * (-9);
                            i5 = ((iM45029 ^ i3) * (-10457)) ^ 106567060;
                            i6 = -2084818005;
                            break;
                        }
                        iM45029 = (i3 - C19806.m45029("᩸ۙ")) * (-57);
                        i5 = ((iM45029 ^ i4) * (-24593)) ^ 1392605239;
                        i6 = -1616698642;
                        break;
                    case -54771457:
                    case 740279138:
                        if (C7105.f23796 < 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۧ᩺") + i3) * 75;
                            i5 = ((iM45029 ^ i4) * 16097) ^ (-1185812841);
                            i6 = -561682693;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("ܿۘ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-11331)) ^ (-364368391);
                        i6 = -882060444;
                        break;
                        break;
                    case 6374870:
                    case 2097091128:
                        if (c16819 == c168110) {
                            iM45029 = (C19806.m45029("ܿ֫") + i4) * (-9);
                            i5 = ((iM45029 ^ i3) * (-10457)) ^ 106567060;
                            i6 = -2084818005;
                            break;
                            break;
                        }
                        iM45029 = (i3 - C19806.m45029("᩸ۙ")) * (-57);
                        i5 = ((iM45029 ^ i4) * (-24593)) ^ 1392605239;
                        i6 = -1616698642;
                        break;
                        break;
                    case 154374971:
                    case 1881226580:
                        i = 0;
                        iM45029 = ThreadFactoryC3888.m11306("֡ܳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 32183) ^ (-1429440641);
                        i6 = -390477139;
                        break;
                        break;
                    case 615866007:
                    case 1873552669:
                        c168110 = (C16819) c8388.get(i);
                        if (c16819 == null) {
                            iM45029 = (ThreadFactoryC3888.m11306("᩶ۧ") + i4) * 37;
                            i5 = ((iM45029 ^ i3) * 11503) ^ (-713664016);
                            i6 = -958577810;
                            break;
                        }
                        iM45029 = C19806.m45029("ܿܳ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-10073)) ^ 66660469;
                        i6 = -1860131915;
                        break;
                    case 668918184:
                    case 1180520301:
                        if (!C19806.m45024()) {
                            iM45029 = C19806.m45029("۫֨") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-23859)) ^ 408570782;
                            i6 = -26565549;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۜ") ^ i4;
                        i5 = ((iM45029 ^ i3) * SecP192K1Field.PInv33) ^ (-1870750487);
                        i6 = 768960570;
                        break;
                        break;
                    case 872681760:
                    case 1805627976:
                        if (C1066.f4915 > 0) {
                            iM45029 = C19806.m45029("ۤۗ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-21541)) ^ (-617408097);
                            i6 = -1812096412;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۜ") ^ i4;
                        i5 = ((iM45029 ^ i3) * SecP192K1Field.PInv33) ^ (-1870750487);
                        i6 = 768960570;
                        break;
                        break;
                    case 1149259035:
                    case 1555195185:
                        if (c168110 != null) {
                            iM45029 = (i3 - C19806.m45029("֡ۚ")) * (-53);
                            i5 = ((iM45029 ^ i4) * (-31815)) ^ 21398909;
                            i6 = -1407905179;
                            break;
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۧ") + i4) * 37;
                        i5 = ((iM45029 ^ i3) * 11503) ^ (-713664016);
                        i6 = -958577810;
                        break;
                        break;
                    case 1219255956:
                    case 1826745931:
                        if (!C3743.f13569) {
                            iM45029 = (C19806.m45029("ۛۤ") + i3) * 87;
                            i5 = ((iM45029 ^ i4) * (-22401)) ^ 1309584688;
                            i6 = 1185344573;
                            break;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("᩺ܶ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-15679)) ^ 1595106057;
                        i6 = 872300179;
                        break;
                    case 1779861326:
                    case 1841413279:
                        if (!AbstractC0464.m2315(c16819.f53838, c168110.f53838)) {
                            iM45029 = (i3 - C19806.m45029("᩸ۙ")) * (-57);
                            i5 = ((iM45029 ^ i4) * (-24593)) ^ 1392605239;
                            i6 = -1616698642;
                            break;
                            break;
                        }
                        iM45029 = (C19806.m45029("ۜ۬") + i4) * (-59);
                        i5 = ((iM45029 ^ i3) * (-16711)) ^ 1917374240;
                        i6 = 98005973;
                        break;
                    default:
                        if (size != c8388.size()) {
                            z = false;
                            iM45029 = (i3 - C19806.m45029("᩸ۙ")) * (-57);
                            i5 = ((iM45029 ^ i4) * (-24593)) ^ 1392605239;
                            i6 = -1616698642;
                            break;
                        }
                        int iM450210 = (i4 - C19806.m45029("ܶ᩵")) * 55;
                        i5 = ((iM450210 ^ i3) * (-17265)) ^ (-903953839);
                        i7 = iM450210 ^ (-171167581);
                        z = false;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:35:0x011a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0138  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12574(ViewOnClickListenerC4514 viewOnClickListenerC4514, C16819 c16819, ViewOnClickListenerC2001 viewOnClickListenerC2001, DialogInterfaceC19356 dialogInterfaceC19356, MenuItem menuItem) {
        int iM45029;
        int i;
        int i2;
        int iM450210;
        int i3;
        int i4;
        int iM11306;
        int i5;
        int i6;
        int iM11307;
        int i7;
        int i8;
        int iM450211;
        int i9;
        ViewOnClickListenerC4514 viewOnClickListenerC4515 = viewOnClickListenerC4514;
        int i10 = C2477.f9839;
        int i11 = RunnableC1606.f6488;
        int iM450212 = (i11 - C19806.m45029("ۛ᩶")) * (-29);
        int i12 = ((iM450212 ^ i10) * 28967) ^ (-1562104378);
        String strM10790 = null;
        String strM8470 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i13 = iM450212 ^ 1828726216;
        int i14 = 0;
        short s = 0;
        int i15 = 0;
        char c = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = -1189369859;
        Exception exc = null;
        String strM3406 = null;
        short[] sArr3 = null;
        int iM450213 = 0;
        Intent launchIntentForPackage = null;
        C1777 c1777 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int iM6285 = 0;
        while (true) {
            i18 = i13 ^ (i12 & (((i18 ^ i10) * 30979) >> 31));
            switch (i18) {
                case -2073909736:
                case 1905506636:
                    str3 = str3;
                    str2 = str2;
                    str = str;
                    strM8470 = C2788.m8470(f16037, 163, 3, i14);
                    if (!C19806.f63586) {
                        iM11307 = (ThreadFactoryC3888.m11306("ۚᩴ") + i11) * (-41);
                        i7 = ((iM11307 ^ i10) * 18647) ^ (-1896342468);
                        i8 = 1989781258;
                        str2 = str2;
                        str3 = str3;
                        i13 = iM11307 ^ i8;
                        i12 = i7;
                        str = str;
                    } else {
                        sArr = sArr;
                        i16 = i16;
                        i17 = i17;
                        iM450210 = (i11 - C19806.m45029("ۡۡ")) * 33;
                        i3 = ((iM450210 ^ i10) * 10411) ^ (-2012957008);
                        i4 = 459188655;
                        int i19 = iM450210 ^ i4;
                        i16 = i16;
                        i17 = i17;
                        str2 = str2;
                        str3 = str3;
                        i13 = i19;
                        i12 = i3;
                        sArr = sArr;
                        str = str;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    }
                    break;
                case -2027068362:
                case -1180197313:
                    str3 = str3;
                    str2 = str2;
                    str = str;
                    sArr = sArr;
                    i16 = i16;
                    i17 = i17;
                    if (C2788.f10625 >= 0) {
                        iM450210 = (i10 - ThreadFactoryC3888.m11306("ᩴܽ")) * (-77);
                        i3 = ((iM450210 ^ i11) * (-3653)) ^ 1969293494;
                        i4 = -1094101325;
                    } else {
                        iM450210 = C19806.m45029("֨ܶ") ^ i11;
                        i3 = ((iM450210 ^ i10) * (-21233)) ^ (-1225163202);
                        i4 = -1174156608;
                    }
                    int i110 = iM450210 ^ i4;
                    i16 = i16;
                    i17 = i17;
                    str2 = str2;
                    str3 = str3;
                    i13 = i110;
                    i12 = i3;
                    sArr = sArr;
                    str = str;
                    viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    break;
                case -1968231422:
                case 1237007174:
                    str3 = str3;
                    str2 = str2;
                    str = str;
                    if (iM6285 == (C19806.m45029(strM3406) ^ 2122565397)) {
                        iM11307 = ThreadFactoryC3888.m11306("ۡᩴ") ^ i10;
                        i7 = ((iM11307 ^ i11) * 19987) ^ 1576202700;
                        i8 = -344613939;
                    } else {
                        iM11307 = (i10 - ThreadFactoryC3888.m11306("ܽᩳ")) * 89;
                        i7 = ((iM11307 ^ i11) * (-6309)) ^ (-1567482668);
                        i8 = -2066312640;
                    }
                    str2 = str2;
                    str3 = str3;
                    i13 = iM11307 ^ i8;
                    i12 = i7;
                    str = str;
                    break;
                case -1881444513:
                case -587674162:
                    C0671.m3008();
                    if (C1419.f5860 >= 0) {
                        str3 = str3;
                        str2 = str2;
                        str = str;
                        sArr = sArr;
                        i16 = i16;
                        i17 = i17;
                        iM450210 = (i11 - C19806.m45029("ۡۡ")) * 33;
                        i3 = ((iM450210 ^ i10) * 10411) ^ (-2012957008);
                        i4 = 459188655;
                        int i111 = iM450210 ^ i4;
                        i16 = i16;
                        i17 = i17;
                        str2 = str2;
                        str3 = str3;
                        i13 = i111;
                        i12 = i3;
                        sArr = sArr;
                        str = str;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۙ") ^ i10;
                        i = ((iM45029 ^ i11) * 9577) ^ (-1895247852);
                        i2 = -1208458292;
                        i13 = iM45029 ^ i2;
                        i12 = i;
                    }
                    break;
                case -1819819384:
                case -943094975:
                    C2249.m6915();
                    break;
                case -1690013040:
                case -1010319485:
                    try {
                        str2 = str2;
                        try {
                            str3 = str3;
                            str = str;
                            try {
                                C3286.m9800(viewOnClickListenerC4515, new Intent(C0797.m3361(f16037, PicnicEngine.MAX_AUX_BYTES, 28, i14), Uri.fromParts(C1025.m3859(f16037, 166, 7, i14), c16819.f53838, str3)));
                                try {
                                    viewOnClickListenerC4515.f16056 = new C3412(viewOnClickListenerC4515, viewOnClickListenerC2001, dialogInterfaceC19356);
                                    iM11307 = (ThreadFactoryC3888.m11306("۠ۗ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                    i7 = ((iM11307 ^ i11) * (-19587)) ^ 1391074638;
                                    i8 = 285641092;
                                } catch (Throwable th) {
                                    th = th;
                                    exc = th;
                                    iM11307 = (C19806.m45029("֫᩹") ^ i10) * 91;
                                    i7 = ((iM11307 ^ i11) * 821) ^ 2103050901;
                                    i8 = -780585998;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                exc = th;
                                iM11307 = (C19806.m45029("֫᩹") ^ i10) * 91;
                                i7 = ((iM11307 ^ i11) * 821) ^ 2103050901;
                                i8 = -780585998;
                                str2 = str2;
                                str3 = str3;
                                i13 = iM11307 ^ i8;
                                i12 = i7;
                                str = str;
                                break;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            str3 = str3;
                            str = str;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        str3 = str3;
                        str2 = str2;
                        str = str;
                    }
                    str2 = str2;
                    str3 = str3;
                    i13 = iM11307 ^ i8;
                    i12 = i7;
                    str = str;
                    break;
                case -1685968319:
                case 1799131677:
                    str3 = str3;
                    str2 = str2;
                    str = str;
                    strM10790 = C3660.m10790(f16037, 157, 3, i14);
                    if (C1398.f5802 > 0) {
                        iM11307 = (i10 - ThreadFactoryC3888.m11306("ۚ֨")) * (-125);
                        i7 = ((iM11307 ^ i11) * 13251) ^ (-840518245);
                        i8 = 1878167207;
                        str2 = str2;
                        str3 = str3;
                        i13 = iM11307 ^ i8;
                        i12 = i7;
                        str = str;
                    } else {
                        iM11306 = C19806.m45029("᩻֡") ^ i10;
                        i5 = ((iM11306 ^ i11) * (-25265)) ^ (-1025191092);
                        i6 = -749835426;
                        int i20 = iM11306 ^ i6;
                        str2 = str2;
                        str3 = str3;
                        str = str;
                        i13 = i20;
                        i12 = i5;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    }
                    break;
                case -1654010425:
                case -51320340:
                    RunnableC1564.m5345();
                    if (!C2704.f10408) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۘ") ^ i10) * 35;
                        i = ((iM45029 ^ i11) * (-12247)) ^ 183661625;
                        i2 = 1899715705;
                        i13 = iM45029 ^ i2;
                        i12 = i;
                    } else {
                        str3 = str3;
                        str2 = str2;
                        str = str;
                        sArr = sArr;
                        i16 = i16;
                        i17 = i17;
                        iM450210 = C19806.m45029("᩵ۤ") ^ i11;
                        i3 = ((iM450210 ^ i10) * (-551)) ^ (-787994481);
                        i4 = -946386838;
                        int i112 = iM450210 ^ i4;
                        i16 = i16;
                        i17 = i17;
                        str2 = str2;
                        str3 = str3;
                        i13 = i112;
                        i12 = i3;
                        sArr = sArr;
                        str = str;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    }
                    break;
                case -1590086951:
                case 212185538:
                    str3 = str3;
                    str2 = str2;
                    str = str;
                    strM3406 = C0817.m3406(f16037, DHParameters.DEFAULT_MINIMUM_LENGTH, 3, i14);
                    if (RunnableC1606.f6488 < 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ۤۜ") ^ i11;
                        i7 = ((iM11307 ^ i10) * 13425) ^ (-1944104662);
                        i8 = 1702373026;
                        str2 = str2;
                        str3 = str3;
                        i13 = iM11307 ^ i8;
                        i12 = i7;
                        str = str;
                    } else {
                        sArr = sArr;
                        i16 = i16;
                        i17 = i17;
                        iM450210 = (i10 - ThreadFactoryC3888.m11306("ᩴܽ")) * (-77);
                        i3 = ((iM450210 ^ i11) * (-3653)) ^ 1969293494;
                        i4 = -1094101325;
                        int i113 = iM450210 ^ i4;
                        i16 = i16;
                        i17 = i17;
                        str2 = str2;
                        str3 = str3;
                        i13 = i113;
                        i12 = i3;
                        sArr = sArr;
                        str = str;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    }
                    break;
                case -1552132298:
                case 262789162:
                    if (C2249.f8050 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۙ") ^ i10;
                        i = ((iM45029 ^ i11) * 9577) ^ (-1895247852);
                        i2 = -1208458292;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ᩸") ^ i11) * (-7);
                        i = ((iM45029 ^ i10) * 20843) ^ 504318072;
                        i2 = -596380828;
                    }
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    break;
                case -1470116396:
                case 727957308:
                    str = c16819.f53841.applicationInfo.sourceDir;
                    c1777 = new C1777(viewOnClickListenerC4515);
                    sArr2 = f16037;
                    if (!C3286.f12186) {
                        iM45029 = (C19806.m45029("᩻᩷") ^ i10) * 41;
                        i = ((iM45029 ^ i11) * 17503) ^ (-619335903);
                        i2 = 1465180668;
                        i13 = iM45029 ^ i2;
                        i12 = i;
                    } else {
                        str3 = str3;
                        str2 = str2;
                        str = str;
                        sArr = sArr;
                        i16 = i16;
                        i17 = i17;
                        iM450210 = (i11 - C19806.m45029("ۡۡ")) * 33;
                        i3 = ((iM450210 ^ i10) * 10411) ^ (-2012957008);
                        i4 = 459188655;
                        int i114 = iM450210 ^ i4;
                        i16 = i16;
                        i17 = i17;
                        str2 = str2;
                        str3 = str3;
                        i13 = i114;
                        i12 = i3;
                        sArr = sArr;
                        str = str;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    }
                    break;
                case -1385280291:
                case 389348088:
                    C2477.m7593();
                    C1419.m4973();
                    iM45029 = ThreadFactoryC3888.m11306("ܶۙ") ^ i10;
                    i = ((iM45029 ^ i11) * 9577) ^ (-1895247852);
                    i2 = -1208458292;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    break;
                case -1353110402:
                case -1116172999:
                    iM450213 = C19806.m45029(C2477.m7604(sArr2, 173, 3, i14));
                    if (C1189.f5284 > 0) {
                        iM45029 = (i10 - ThreadFactoryC3888.m11306("֨᩺")) * (-97);
                        i = ((iM45029 ^ i11) * (-29661)) ^ 48150968;
                        i2 = 250049234;
                        i13 = iM45029 ^ i2;
                        i12 = i;
                    } else {
                        str3 = str3;
                        str2 = str2;
                        str = str;
                        sArr = sArr;
                        i16 = i16;
                        i17 = i17;
                        iM450210 = (i10 - ThreadFactoryC3888.m11306("ᩴܽ")) * (-77);
                        i3 = ((iM450210 ^ i11) * (-3653)) ^ 1969293494;
                        i4 = -1094101325;
                        int i115 = iM450210 ^ i4;
                        i16 = i16;
                        i17 = i17;
                        str2 = str2;
                        str3 = str3;
                        i13 = i115;
                        i12 = i3;
                        sArr = sArr;
                        str = str;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    }
                    break;
                case -1283770206:
                case 96297417:
                    str3 = str3;
                    str2 = str2;
                    str = str;
                    sArr = sArr;
                    i16 = i16;
                    i17 = i17;
                    short s2 = sArr3[c];
                    int i21 = s2 + 9525;
                    i15 = i21 * i21;
                    if (C3535.f13026 <= 0) {
                        s = s2;
                        iM450210 = (i11 - C19806.m45029("ۡۡ")) * 33;
                        i3 = ((iM450210 ^ i10) * 10411) ^ (-2012957008);
                        i4 = 459188655;
                        int i116 = iM450210 ^ i4;
                        i16 = i16;
                        i17 = i17;
                        str2 = str2;
                        str3 = str3;
                        i13 = i116;
                        i12 = i3;
                    } else {
                        int iM450214 = C19806.m45029("۟᩹") ^ i11;
                        s = s2;
                        i12 = ((iM450214 ^ i10) * 1245) ^ 126438308;
                        i16 = i16;
                        i17 = i17;
                        str2 = str2;
                        str3 = str3;
                        i13 = iM450214 ^ 2751239;
                    }
                    sArr = sArr;
                    str = str;
                    viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    break;
                case -1280660317:
                case 744922784:
                    str3 = str3;
                    str2 = str2;
                    str = str;
                    viewOnClickListenerC4515.mo30999(c16819.f53838);
                    iM11307 = (ThreadFactoryC3888.m11306("۠ۗ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i7 = ((iM11307 ^ i11) * (-19587)) ^ 1391074638;
                    i8 = 285641092;
                    str2 = str2;
                    str3 = str3;
                    i13 = iM11307 ^ i8;
                    i12 = i7;
                    str = str;
                    break;
                case -1153806979:
                case 40309240:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (C0629.f2722 <= 0) {
                        str3 = str3;
                        str2 = str2;
                        str = str;
                        iM11306 = C19806.m45029("᩻֡") ^ i10;
                        i5 = ((iM11306 ^ i11) * (-25265)) ^ (-1025191092);
                        i6 = -749835426;
                        int i22 = iM11306 ^ i6;
                        str2 = str2;
                        str3 = str3;
                        str = str;
                        i13 = i22;
                        i12 = i5;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ᩸") ^ i11) * (-7);
                        i = ((iM45029 ^ i10) * 20843) ^ 504318072;
                        i2 = -596380828;
                        i13 = iM45029 ^ i2;
                        i12 = i;
                    }
                    break;
                case -1063074376:
                case -523112076:
                    str3 = str3;
                    str2 = str2;
                    str = str;
                    if (iM6285 == (ThreadFactoryC3888.m11306(strM8470) ^ 2123489071)) {
                        iM11307 = ThreadFactoryC3888.m11306("ܺۖ") ^ i11;
                        i7 = ((iM11307 ^ i10) * 59) ^ 1496503558;
                        i8 = -994799816;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("۠ۗ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((iM11307 ^ i11) * (-19587)) ^ 1391074638;
                        i8 = 285641092;
                    }
                    str2 = str2;
                    str3 = str3;
                    i13 = iM11307 ^ i8;
                    i12 = i7;
                    str = str;
                    break;
                case -1023360838:
                case 1935649462:
                    c1777.m5837(2116485428 ^ iM450213);
                    c1777.mo5843();
                    if (C3535.f13026 > 0) {
                        C2332.m7081(new C13292(viewOnClickListenerC4515, str, c1777, new StringBuilder()));
                        str3 = str3;
                        str2 = str2;
                        str = str;
                        iM11307 = (ThreadFactoryC3888.m11306("۠ۗ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((iM11307 ^ i11) * (-19587)) ^ 1391074638;
                        i8 = 285641092;
                        str2 = str2;
                        str3 = str3;
                        i13 = iM11307 ^ i8;
                        i12 = i7;
                        str = str;
                    } else {
                        iM45029 = (C19806.m45029("ܿۧ") + i11) * (-97);
                        i = ((iM45029 ^ i10) * 30705) ^ 948444825;
                        i2 = 269046858;
                        i13 = iM45029 ^ i2;
                        i12 = i;
                    }
                    break;
                case -769624537:
                case 2046388364:
                    str = str;
                    String str4 = c16819.f53838;
                    int iM450215 = C19806.m45029("۟ᩴ") ^ i11;
                    i13 = iM450215 ^ 235932149;
                    str2 = str4;
                    i12 = ((iM450215 ^ i10) * 30985) ^ 2086905946;
                    str3 = str3;
                    str = str;
                    break;
                case -507039656:
                case -279282599:
                    launchIntentForPackage = viewOnClickListenerC4514.getPackageManager().getLaunchIntentForPackage(str2);
                    iM45029 = ThreadFactoryC3888.m11306("۬᩹") ^ i11;
                    i = ((iM45029 ^ i10) * 1813) ^ 809203;
                    i2 = -968750152;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    break;
                case -469697504:
                case 1164622944:
                    str3 = str3;
                    str2 = str2;
                    str = str;
                    iM6285 = C1937.m6285(menuItem);
                    sArr = f16037;
                    i16 = EnumC2300.f8185;
                    i17 = 3;
                    if (C2249.f8050 >= 0) {
                        iM11306 = C19806.m45029("᩻֡") ^ i10;
                        i5 = ((iM11306 ^ i11) * (-25265)) ^ (-1025191092);
                        i6 = -749835426;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۛ") + i10) * (-65);
                        i5 = ((iM11306 ^ i11) * (-10055)) ^ (-572451943);
                        i6 = 1870472499;
                    }
                    int i23 = iM11306 ^ i6;
                    str2 = str2;
                    str3 = str3;
                    str = str;
                    i13 = i23;
                    i12 = i5;
                    viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    break;
                case -397046619:
                case 771830235:
                    i14 = 12722;
                    iM450210 = (C19806.m45029("ۧ֫") + i11) * (-103);
                    i3 = ((iM450210 ^ i10) * 22561) ^ (-679410318);
                    i4 = -1680815044;
                    int i117 = iM450210 ^ i4;
                    i16 = i16;
                    i17 = i17;
                    str2 = str2;
                    str3 = str3;
                    i13 = i117;
                    i12 = i3;
                    sArr = sArr;
                    str = str;
                    viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    break;
                case -332890165:
                case 901459826:
                    str3 = str3;
                    str2 = str2;
                    str = str;
                    sArr = sArr;
                    i16 = i16;
                    int i24 = i17;
                    if (iM6285 == (ThreadFactoryC3888.m11306(C2477.m7604(sArr, i16, i24, i14)) ^ 2099652912)) {
                        iM450210 = C19806.m45029("᩶᩷") ^ i11;
                        i17 = i24;
                        i3 = ((iM450210 ^ i10) * (-779)) ^ (-276204448);
                        i4 = -1011743047;
                    } else {
                        i17 = i24;
                        iM450210 = C19806.m45029("۟ۜ") ^ i11;
                        i3 = ((iM450210 ^ i10) * (-12149)) ^ 1595068613;
                        i4 = -2064933096;
                    }
                    int i118 = iM450210 ^ i4;
                    i16 = i16;
                    i17 = i17;
                    str2 = str2;
                    str3 = str3;
                    i13 = i118;
                    i12 = i3;
                    sArr = sArr;
                    str = str;
                    viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    break;
                case -268516699:
                case 1253465501:
                    str3 = str3;
                    str2 = str2;
                    str = str;
                    sArr = sArr;
                    i16 = i16;
                    i17 = i17;
                    if ((38100 * s) - i15 > 0) {
                        iM450210 = (ThreadFactoryC3888.m11306("᩷ᩴ") ^ i10) * (-91);
                        i3 = ((iM450210 ^ i11) * 22241) ^ 383401561;
                        i4 = 807494660;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ۗܽ") ^ i10;
                        i3 = ((iM450210 ^ i11) * 29447) ^ (-1169041153);
                        i4 = 339945134;
                    }
                    int i119 = iM450210 ^ i4;
                    i16 = i16;
                    i17 = i17;
                    str2 = str2;
                    str3 = str3;
                    i13 = i119;
                    i12 = i3;
                    sArr = sArr;
                    str = str;
                    viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    break;
                case -236390377:
                case 669026517:
                    if (C3286.f12186) {
                        iM45029 = (C19806.m45029("۟ۨ") ^ i11) * 11;
                        i = ((iM45029 ^ i10) * (-29453)) ^ (-2008783606);
                        i2 = -184034202;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۙ") ^ i10;
                        i = ((iM45029 ^ i11) * 9577) ^ (-1895247852);
                        i2 = -1208458292;
                    }
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    break;
                case -182158273:
                case 1471566188:
                    try {
                        C3286.m9800(viewOnClickListenerC4515, launchIntentForPackage);
                        str3 = str3;
                        str2 = str2;
                        str = str;
                        iM11307 = (ThreadFactoryC3888.m11306("۠ۗ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((iM11307 ^ i11) * (-19587)) ^ 1391074638;
                        i8 = 285641092;
                    } catch (Exception e) {
                        exc = e;
                        str3 = str3;
                        str2 = str2;
                        str = str;
                        iM11307 = (C19806.m45029("֫᩹") ^ i10) * 91;
                        i7 = ((iM11307 ^ i11) * 821) ^ 2103050901;
                        i8 = -780585998;
                    }
                    str2 = str2;
                    str3 = str3;
                    i13 = iM11307 ^ i8;
                    i12 = i7;
                    str = str;
                    break;
                case 248941034:
                case 1083384093:
                    RunnableC1564.m5345();
                    if (C1189.f5284 <= 0) {
                        iM45029 = (C19806.m45029("۟ۨ") ^ i11) * 11;
                        i = ((iM45029 ^ i10) * (-29453)) ^ (-2008783606);
                        i2 = -184034202;
                    } else {
                        iM45029 = (i10 - C19806.m45029("۫۫")) * 15;
                        i = ((iM45029 ^ i11) * 21719) ^ (-1282164617);
                        i2 = 1311416988;
                    }
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    break;
                case 560543075:
                case 675521981:
                    RunnableC1895.m6170();
                    if (C0962.f3784) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ᩸") ^ i11) * (-7);
                        i = ((iM45029 ^ i10) * 20843) ^ 504318072;
                        i2 = -596380828;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۘ") ^ i10) * 35;
                        i = ((iM45029 ^ i11) * (-12247)) ^ 183661625;
                        i2 = 1899715705;
                    }
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    break;
                case 669672188:
                case 2073153568:
                    if (!RunnableC1564.f6300) {
                        iM45029 = (C19806.m45029("ܿۧ") + i11) * (-97);
                        i = ((iM45029 ^ i10) * 30705) ^ 948444825;
                        i2 = 269046858;
                        i13 = iM45029 ^ i2;
                        i12 = i;
                    } else {
                        str3 = str3;
                        str2 = str2;
                        str = str;
                        sArr = sArr;
                        i16 = i16;
                        i17 = i17;
                        iM450210 = (i11 - C19806.m45029("ۡۡ")) * 33;
                        i3 = ((iM450210 ^ i10) * 10411) ^ (-2012957008);
                        i4 = 459188655;
                        int i1110 = iM450210 ^ i4;
                        i16 = i16;
                        i17 = i17;
                        str2 = str2;
                        str3 = str3;
                        i13 = i1110;
                        i12 = i3;
                        sArr = sArr;
                        str = str;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    }
                    break;
                case 697642093:
                case 1095770697:
                    if (launchIntentForPackage == null) {
                        str3 = str3;
                        str2 = str2;
                        str = str;
                        iM11307 = (ThreadFactoryC3888.m11306("۠ۗ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((iM11307 ^ i11) * (-19587)) ^ 1391074638;
                        i8 = 285641092;
                        str2 = str2;
                        str3 = str3;
                        i13 = iM11307 ^ i8;
                        i12 = i7;
                        str = str;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۖ") ^ i11;
                        i = ((iM45029 ^ i10) * 12353) ^ 401014213;
                        i2 = -1201488748;
                        i13 = iM45029 ^ i2;
                        i12 = i;
                    }
                    break;
                case 818609074:
                case 1787225183:
                    C0671.m3019(viewOnClickListenerC4515, exc, str3);
                    str3 = str3;
                    str2 = str2;
                    str = str;
                    iM11307 = (ThreadFactoryC3888.m11306("۠ۗ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i7 = ((iM11307 ^ i11) * (-19587)) ^ 1391074638;
                    i8 = 285641092;
                    str2 = str2;
                    str3 = str3;
                    i13 = iM11307 ^ i8;
                    i12 = i7;
                    str = str;
                    break;
                case 1210026080:
                case 1440000662:
                    str3 = str3;
                    str2 = str2;
                    str = str;
                    sArr = sArr;
                    i16 = i16;
                    i17 = i17;
                    sArr3 = f16037;
                    c = 153;
                    if (C1461.f5957 <= 0) {
                        iM450210 = C19806.m45029("᩵ۤ") ^ i11;
                        i3 = ((iM450210 ^ i10) * (-551)) ^ (-787994481);
                        i4 = -946386838;
                    } else {
                        iM450210 = (C19806.m45029("ۗۘ") + i10) * (-29);
                        i3 = ((iM450210 ^ i11) * (-14747)) ^ 1286416866;
                        i4 = -115190993;
                    }
                    int i1111 = iM450210 ^ i4;
                    i16 = i16;
                    i17 = i17;
                    str2 = str2;
                    str3 = str3;
                    i13 = i1111;
                    i12 = i3;
                    sArr = sArr;
                    str = str;
                    viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    break;
                case 1468569607:
                case 2095034100:
                    String str5 = str2;
                    String str6 = str;
                    if (iM6285 == (C19806.m45029(strM10790) ^ 2121746634)) {
                        iM450211 = (i11 - C19806.m45029("۟᩸")) * 61;
                        i = ((iM450211 ^ i10) * 7875) ^ (-1440879860);
                        i9 = 1607223599;
                    } else {
                        iM450211 = C19806.m45029("֨ᩴ") ^ i10;
                        i = ((iM450211 ^ i11) * 29029) ^ 178461369;
                        i9 = 2090106592;
                    }
                    str3 = null;
                    str2 = str5;
                    str = str6;
                    i13 = iM450211 ^ i9;
                    i12 = i;
                    break;
                case 1685256966:
                case 1749976041:
                    i14 = 42636;
                    iM450210 = (C19806.m45029("ۧ֫") + i11) * (-103);
                    i3 = ((iM450210 ^ i10) * 22561) ^ (-679410318);
                    i4 = -1680815044;
                    int i1112 = iM450210 ^ i4;
                    i16 = i16;
                    i17 = i17;
                    str2 = str2;
                    str3 = str3;
                    i13 = i1112;
                    i12 = i3;
                    sArr = sArr;
                    str = str;
                    viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x021e A[PHI: r6 r10 r11 r21
      0x021e: PHI (r6v3 l.۫ᩴۘ) = (r6v2 l.۫ᩴۘ), (r6v1 l.۫ᩴۘ) binds: [B:57:0x021c, B:50:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r10v4 java.lang.String) = (r10v3 java.lang.String), (r10v2 java.lang.String) binds: [B:57:0x021c, B:50:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r11v3 java.lang.String) = (r11v2 java.lang.String), (r11v4 java.lang.String) binds: [B:57:0x021c, B:50:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r21v24 l.ܽᩴۘ) = (r21v23 l.ܽᩴۘ), (r21v25 l.ܽᩴۘ) binds: [B:57:0x021c, B:50:0x01d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0065, code lost:
    
        if (l.C1377.m4833() != 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        if (l.RunnableC0195.f1321 < 0) goto L16;
     */
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C14703 m12552(l.ViewOnClickListenerC4514 r24) {
        /*
            Method dump skipped, instruction units count: 962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC4514.m12552(l.ۙ۠ۘ):l.ܳᩴۘ");
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m12579(boolean z) {
        FloatingActionButton floatingActionButton;
        float[] fArr;
        C12586 c12586;
        String str;
        float[] fArr2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        AnimatorSet animatorSet;
        FloatingActionButton floatingActionButton2;
        char c;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        FloatingActionButton floatingActionButton3;
        float[] fArr3;
        int i2;
        int i3;
        String str2;
        int iM45029;
        int i4;
        int i5;
        FloatingActionButton floatingActionButton4;
        float[] fArr4;
        C12586 c12587;
        String str3;
        float[] fArr5;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        AnimatorSet animatorSet2;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        FloatingActionButton floatingActionButton5;
        short[] sArr;
        char c2;
        float[] fArr6;
        String str4;
        int iM11306;
        int i6;
        int iM450210;
        int i7;
        int i8;
        FloatingActionButton floatingActionButton6;
        float[] fArr7;
        C12586 c12588;
        String str5;
        float[] fArr8;
        ViewGroup.MarginLayoutParams marginLayoutParams5;
        AnimatorSet animatorSet3;
        FloatingActionButton floatingActionButton7;
        int i9;
        ViewGroup.MarginLayoutParams marginLayoutParams6;
        FloatingActionButton floatingActionButton8;
        float[] fArr9;
        short[] sArr2;
        String strM5047;
        int iM11307;
        String str6;
        int i10;
        String str7;
        float[] fArr10;
        String str8;
        ViewGroup.MarginLayoutParams marginLayoutParams7;
        AnimatorSet animatorSet4;
        FloatingActionButton floatingActionButton9;
        char c3;
        int iM11308;
        float[] fArr11;
        int i11;
        int i12;
        String str9;
        float[] fArr12;
        int iM11309;
        int i13;
        int i14;
        ViewOnClickListenerC4514 viewOnClickListenerC4514 = this;
        int i15 = 188176024;
        int i16 = RunnableC1606.f6488;
        int i17 = ThreadFactoryC3888.f14547;
        int iM450211 = (C19806.m45029("ۚۨ") ^ i16) * 53;
        int i18 = ((iM450211 ^ i17) * (-19515)) ^ 153998948;
        int i19 = iM450211 ^ (-1865228224);
        ViewGroup.MarginLayoutParams marginLayoutParams8 = null;
        FloatingActionButton floatingActionButton10 = null;
        float[] fArr13 = null;
        FloatingActionButton floatingActionButton11 = null;
        String strM45020 = null;
        FloatingActionButton floatingActionButton12 = null;
        short[] sArr3 = null;
        AnimatorSet duration = null;
        char c4 = 0;
        int i20 = 0;
        char c5 = 0;
        int i21 = 0;
        int iM10956 = 0;
        int iM10957 = 0;
        float f = 0.0f;
        int iM8169 = 0;
        int i22 = 0;
        int iM81610 = 0;
        int i23 = 0;
        float f2 = 0.0f;
        short s = 0;
        int i24 = 0;
        float[] fArr14 = null;
        String str10 = null;
        ObjectAnimator objectAnimatorM26816 = null;
        FloatingActionButton floatingActionButton13 = null;
        FloatingActionButton floatingActionButton14 = null;
        float[] fArr15 = null;
        ObjectAnimator objectAnimatorM4024 = null;
        float f3 = 0.0f;
        int i25 = 0;
        ViewGroup.MarginLayoutParams marginLayoutParams9 = null;
        float[] fArr16 = null;
        ViewGroup.LayoutParams layoutParamsM4890 = null;
        ObjectAnimator objectAnimatorM4025 = null;
        boolean z2 = false;
        int i26 = 0;
        ObjectAnimator objectAnimatorM4026 = null;
        float[] fArr17 = null;
        int i27 = 0;
        float f4 = 0.0f;
        FloatingActionButton floatingActionButton15 = null;
        C12586 c12589 = null;
        ObjectAnimator objectAnimatorM26817 = null;
        ObjectAnimator objectAnimatorM26818 = null;
        ViewGroup.MarginLayoutParams marginLayoutParams10 = null;
        ObjectAnimator objectAnimatorM26819 = null;
        while (true) {
            i15 = i19 ^ (i18 & (((i15 ^ i17) * (-18735)) >> 31));
            switch (i15) {
                case -2119915893:
                case -1519825367:
                    floatingActionButton = floatingActionButton10;
                    fArr = fArr13;
                    c12586 = c12589;
                    str = strM45020;
                    fArr2 = fArr17;
                    marginLayoutParams = marginLayoutParams10;
                    animatorSet = duration;
                    floatingActionButton2 = floatingActionButton14;
                    c = c4;
                    float[] fArr18 = fArr16;
                    i = i20;
                    marginLayoutParams2 = marginLayoutParams8;
                    floatingActionButton3 = floatingActionButton13;
                    fArr3 = fArr18;
                    float[] fArr19 = new float[i21];
                    f3 = 0.0f;
                    fArr19[c5] = 0.0f;
                    fArr19[z2 ? 1 : 0] = f;
                    sArr3 = f16037;
                    int iM113010 = (ThreadFactoryC3888.m11306("ۙ᩹") + i17) * (-127);
                    i2 = ((iM113010 ^ i16) * 18029) ^ 1480915789;
                    i3 = iM113010 ^ 1212093118;
                    str10 = str10;
                    fArr14 = fArr19;
                    i18 = i2;
                    c4 = c;
                    floatingActionButton14 = floatingActionButton2;
                    fArr17 = fArr2;
                    c12589 = c12586;
                    floatingActionButton10 = floatingActionButton;
                    float[] fArr20 = fArr;
                    i19 = i3;
                    duration = animatorSet;
                    marginLayoutParams10 = marginLayoutParams;
                    strM45020 = str;
                    fArr13 = fArr20;
                    FloatingActionButton floatingActionButton16 = floatingActionButton3;
                    marginLayoutParams8 = marginLayoutParams2;
                    i20 = i;
                    fArr16 = fArr3;
                    floatingActionButton13 = floatingActionButton16;
                    break;
                case -1799500011:
                case -1263759803:
                    fArr13[c5] = f3;
                    fArr13[z2 ? 1 : 0] = f2;
                    floatingActionButton6 = floatingActionButton10;
                    str9 = str10;
                    c12588 = c12589;
                    float[] fArr21 = fArr13;
                    ObjectAnimator objectAnimatorM4027 = C1066.m4024(floatingActionButton6, str9, fArr21);
                    fArr12 = fArr21;
                    if (C0671.f2816 != 0) {
                        iM11309 = ThreadFactoryC3888.m11306("ܽ᩶") ^ i16;
                        strM45020 = strM45020;
                        i13 = ((iM11309 ^ i17) * 8533) ^ 819668069;
                        i14 = -407673332;
                    } else {
                        duration.setInterpolator(new AccelerateInterpolator());
                        Animator[] animatorArr = new Animator[i20];
                        animatorArr[c5] = objectAnimatorM26816;
                        animatorArr[z2 ? 1 : 0] = objectAnimatorM4026;
                        animatorArr[i21] = objectAnimatorM26819;
                        animatorArr[c4] = objectAnimatorM4027;
                        duration.playTogether(animatorArr);
                        iM11309 = ThreadFactoryC3888.m11306("ᩳۜ") ^ i17;
                        i13 = ((iM11309 ^ i16) * 27711) ^ 188754658;
                        i14 = -1564494947;
                    }
                    int i28 = iM11309 ^ i14;
                    str10 = str9;
                    i18 = i13;
                    strM45020 = strM45020;
                    fArr13 = fArr12;
                    i19 = i28;
                    c12589 = c12588;
                    floatingActionButton10 = floatingActionButton6;
                    break;
                case -1544019325:
                case 1588375920:
                    C2477.m7593();
                    RunnableC0195.m1431();
                    break;
                case -1492900820:
                case -224628651:
                    if (ThreadFactoryC3888.f14547 > 0) {
                        floatingActionButton6 = floatingActionButton10;
                        str9 = str10;
                        fArr12 = fArr13;
                        c12588 = c12589;
                        iM11309 = ThreadFactoryC3888.m11306("ܽ᩶") ^ i16;
                        strM45020 = strM45020;
                        i13 = ((iM11309 ^ i17) * 8533) ^ 819668069;
                        i14 = -407673332;
                        int i29 = iM11309 ^ i14;
                        str10 = str9;
                        i18 = i13;
                        strM45020 = strM45020;
                        fArr13 = fArr12;
                        i19 = i29;
                        c12589 = c12588;
                        floatingActionButton10 = floatingActionButton6;
                    } else {
                        floatingActionButton = floatingActionButton10;
                        str2 = str10;
                        fArr = fArr13;
                        c12586 = c12589;
                        str = strM45020;
                        fArr2 = fArr17;
                        marginLayoutParams = marginLayoutParams10;
                        animatorSet = duration;
                        floatingActionButton2 = floatingActionButton14;
                        c = c4;
                        float[] fArr22 = fArr16;
                        i = i20;
                        marginLayoutParams2 = marginLayoutParams8;
                        floatingActionButton3 = floatingActionButton13;
                        fArr3 = fArr22;
                        int iM113011 = (ThreadFactoryC3888.m11306("ۖۧ") + i16) * (-103);
                        i2 = ((iM113011 ^ i17) * (-32745)) ^ (-892908928);
                        i3 = iM113011 ^ 561788017;
                        str10 = str2;
                        i18 = i2;
                        c4 = c;
                        floatingActionButton14 = floatingActionButton2;
                        fArr17 = fArr2;
                        c12589 = c12586;
                        floatingActionButton10 = floatingActionButton;
                        float[] fArr23 = fArr;
                        i19 = i3;
                        duration = animatorSet;
                        marginLayoutParams10 = marginLayoutParams;
                        strM45020 = str;
                        fArr13 = fArr23;
                        FloatingActionButton floatingActionButton17 = floatingActionButton3;
                        marginLayoutParams8 = marginLayoutParams2;
                        i20 = i;
                        fArr16 = fArr3;
                        floatingActionButton13 = floatingActionButton17;
                    }
                    break;
                case -1419937705:
                case 106363343:
                    c12589.f42059.setEnabled(z2);
                    viewOnClickListenerC4514.f16055.f42059.setEnabled(z2);
                    break;
                case -1296174356:
                case 608967699:
                    floatingActionButton7 = floatingActionButton14;
                    floatingActionButton6 = floatingActionButton10;
                    strM5047 = str10;
                    fArr7 = fArr13;
                    c12588 = c12589;
                    str5 = strM45020;
                    marginLayoutParams5 = marginLayoutParams10;
                    animatorSet3 = duration;
                    float f5 = iM8169 + i22;
                    fArr8 = new float[i21];
                    fArr8[c5] = f3;
                    if (AbstractC0464.f2088 > 0) {
                        int iM113012 = (ThreadFactoryC3888.m11306("֫ܺ") + i17) * (-111);
                        str10 = strM5047;
                        i18 = ((iM113012 ^ i16) * (-13753)) ^ (-770793505);
                        duration = animatorSet3;
                        marginLayoutParams10 = marginLayoutParams5;
                        strM45020 = str5;
                        fArr13 = fArr7;
                        i19 = iM113012 ^ (-1507143138);
                        f4 = f5;
                        floatingActionButton14 = floatingActionButton7;
                        fArr17 = fArr8;
                        c12589 = c12588;
                        floatingActionButton10 = floatingActionButton6;
                    } else {
                        f4 = f5;
                        sArr2 = sArr3;
                        float[] fArr24 = fArr16;
                        i9 = i20;
                        marginLayoutParams6 = marginLayoutParams8;
                        floatingActionButton8 = floatingActionButton13;
                        fArr9 = fArr24;
                        iM11307 = (ThreadFactoryC3888.m11306("۫ۘ") + i17) * (-63);
                        str6 = strM5047;
                        i18 = ((iM11307 ^ i16) * (-12219)) ^ (-1831449772);
                        i10 = 1339482948;
                        sArr3 = sArr2;
                        c4 = c4;
                        floatingActionButton14 = floatingActionButton7;
                        fArr17 = fArr8;
                        c12589 = c12588;
                        floatingActionButton10 = floatingActionButton6;
                        float[] fArr25 = fArr7;
                        i19 = iM11307 ^ i10;
                        duration = animatorSet3;
                        marginLayoutParams10 = marginLayoutParams5;
                        strM45020 = str5;
                        fArr13 = fArr25;
                        FloatingActionButton floatingActionButton18 = floatingActionButton8;
                        marginLayoutParams8 = marginLayoutParams6;
                        i20 = i9;
                        fArr16 = fArr9;
                        floatingActionButton13 = floatingActionButton18;
                        float[] fArr26 = fArr14;
                        str10 = str6;
                        fArr14 = fArr26;
                    }
                    break;
                case -1044584521:
                case 1910906431:
                    float[] fArr27 = new float[i21];
                    // fill-array-data instruction
                    fArr27[0] = 0.8f;
                    fArr27[1] = 0.0f;
                    objectAnimatorM26818 = C10634.m26816(floatingActionButton12, strM45020, fArr27);
                    float[] fArr28 = new float[i21];
                    // fill-array-data instruction
                    fArr28[0] = 0.8f;
                    fArr28[1] = 0.0f;
                    objectAnimatorM26817 = C10634.m26816(viewOnClickListenerC4514.f16051, strM45020, fArr28);
                    if (C1461.f5957 > 0) {
                        iM45029 = C19806.m45029("ᩴۢ") ^ i16;
                        i4 = ((iM45029 ^ i17) * 5835) ^ (-1910147075);
                        i5 = -1702220021;
                        i19 = iM45029 ^ i5;
                        i18 = i4;
                    } else {
                        floatingActionButton = floatingActionButton10;
                        str2 = str10;
                        fArr = fArr13;
                        c12586 = c12589;
                        str = strM45020;
                        fArr2 = fArr17;
                        marginLayoutParams = marginLayoutParams10;
                        animatorSet = duration;
                        floatingActionButton2 = floatingActionButton14;
                        c = c4;
                        float[] fArr29 = fArr16;
                        i = i20;
                        marginLayoutParams2 = marginLayoutParams8;
                        floatingActionButton3 = floatingActionButton13;
                        fArr3 = fArr29;
                        int iM113013 = (ThreadFactoryC3888.m11306("ۖۧ") + i16) * (-103);
                        i2 = ((iM113013 ^ i17) * (-32745)) ^ (-892908928);
                        i3 = iM113013 ^ 561788017;
                        str10 = str2;
                        i18 = i2;
                        c4 = c;
                        floatingActionButton14 = floatingActionButton2;
                        fArr17 = fArr2;
                        c12589 = c12586;
                        floatingActionButton10 = floatingActionButton;
                        float[] fArr210 = fArr;
                        i19 = i3;
                        duration = animatorSet;
                        marginLayoutParams10 = marginLayoutParams;
                        strM45020 = str;
                        fArr13 = fArr210;
                        FloatingActionButton floatingActionButton19 = floatingActionButton3;
                        marginLayoutParams8 = marginLayoutParams2;
                        i20 = i;
                        fArr16 = fArr3;
                        floatingActionButton13 = floatingActionButton19;
                    }
                    break;
                case -1029594507:
                case -992950824:
                    floatingActionButton = floatingActionButton10;
                    str2 = str10;
                    fArr = fArr13;
                    c12586 = c12589;
                    str = strM45020;
                    fArr2 = fArr17;
                    marginLayoutParams = marginLayoutParams10;
                    animatorSet = duration;
                    FloatingActionButton floatingActionButton20 = floatingActionButton13;
                    fArr3 = fArr16;
                    floatingActionButton2 = floatingActionButton14;
                    c = c4;
                    i = i20;
                    marginLayoutParams2 = marginLayoutParams8;
                    floatingActionButton3 = floatingActionButton20;
                    iM10957 = C3743.m10956(floatingActionButton20) + marginLayoutParams2.topMargin;
                    int i30 = marginLayoutParams2.bottomMargin;
                    if (C3535.f13026 <= 0) {
                        i26 = i30;
                        int iM113014 = (ThreadFactoryC3888.m11306("ۖۧ") + i16) * (-103);
                        i2 = ((iM113014 ^ i17) * (-32745)) ^ (-892908928);
                        i3 = iM113014 ^ 561788017;
                        str10 = str2;
                        i18 = i2;
                        c4 = c;
                        floatingActionButton14 = floatingActionButton2;
                        fArr17 = fArr2;
                        c12589 = c12586;
                        floatingActionButton10 = floatingActionButton;
                        float[] fArr211 = fArr;
                        i19 = i3;
                        duration = animatorSet;
                        marginLayoutParams10 = marginLayoutParams;
                        strM45020 = str;
                        fArr13 = fArr211;
                        FloatingActionButton floatingActionButton110 = floatingActionButton3;
                        marginLayoutParams8 = marginLayoutParams2;
                        i20 = i;
                        fArr16 = fArr3;
                        floatingActionButton13 = floatingActionButton110;
                    } else {
                        int iM113015 = (ThreadFactoryC3888.m11306("֡ۚ") + i17) * 97;
                        i26 = i30;
                        str10 = str2;
                        i18 = ((iM113015 ^ i16) * 4203) ^ (-1904821608);
                        duration = animatorSet;
                        marginLayoutParams10 = marginLayoutParams;
                        strM45020 = str;
                        fArr13 = fArr;
                        i19 = iM113015 ^ (-651698698);
                        c4 = c;
                        floatingActionButton14 = floatingActionButton2;
                        fArr17 = fArr2;
                        c12589 = c12586;
                        floatingActionButton10 = floatingActionButton;
                        marginLayoutParams8 = marginLayoutParams2;
                        i20 = i;
                        fArr16 = fArr3;
                        floatingActionButton13 = floatingActionButton3;
                    }
                    break;
                case -994656681:
                case 1290423890:
                    floatingActionButton4 = floatingActionButton10;
                    fArr4 = fArr13;
                    c12587 = c12589;
                    str3 = strM45020;
                    fArr5 = fArr17;
                    marginLayoutParams3 = marginLayoutParams10;
                    animatorSet2 = duration;
                    floatingActionButton5 = floatingActionButton14;
                    c2 = c4;
                    float[] fArr30 = fArr16;
                    i20 = i20;
                    marginLayoutParams8 = marginLayoutParams8;
                    floatingActionButton13 = floatingActionButton13;
                    fArr6 = fArr30;
                    String str11 = str10;
                    fArr14 = fArr14;
                    str4 = str11;
                    marginLayoutParams4 = marginLayoutParams9;
                    sArr = sArr3;
                    float f6 = iM10956 + i27 + marginLayoutParams4.bottomMargin;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        f = f6;
                        int iM450212 = (C19806.m45029("᩸۫") + i17) * 43;
                        sArr3 = sArr;
                        marginLayoutParams9 = marginLayoutParams4;
                        duration = animatorSet2;
                        marginLayoutParams10 = marginLayoutParams3;
                        strM45020 = str3;
                        fArr13 = fArr4;
                        i19 = iM450212 ^ 13668251;
                        i18 = ((iM450212 ^ i16) * (-15389)) ^ (-1423727412);
                    } else {
                        int iM113016 = ThreadFactoryC3888.m11306("᩺۬") ^ i17;
                        f = f6;
                        i18 = ((iM113016 ^ i16) * (-7585)) ^ 1211995504;
                        sArr3 = sArr;
                        marginLayoutParams9 = marginLayoutParams4;
                        duration = animatorSet2;
                        marginLayoutParams10 = marginLayoutParams3;
                        strM45020 = str3;
                        fArr13 = fArr4;
                        i19 = iM113016 ^ (-217448545);
                    }
                    c4 = c2;
                    floatingActionButton14 = floatingActionButton5;
                    fArr17 = fArr5;
                    c12589 = c12587;
                    floatingActionButton10 = floatingActionButton4;
                    FloatingActionButton floatingActionButton21 = floatingActionButton13;
                    marginLayoutParams8 = marginLayoutParams8;
                    i20 = i20;
                    fArr16 = fArr6;
                    floatingActionButton13 = floatingActionButton21;
                    float[] fArr31 = fArr14;
                    str10 = str4;
                    fArr14 = fArr31;
                    break;
                case -944395393:
                case 749536445:
                    AnimatorSet animatorSet5 = duration;
                    floatingActionButton6 = floatingActionButton10;
                    String str12 = str10;
                    float[] fArr32 = fArr13;
                    c12588 = c12589;
                    String str13 = strM45020;
                    fArr17[z2 ? 1 : 0] = f4;
                    FloatingActionButton floatingActionButton22 = floatingActionButton14;
                    fArr8 = fArr17;
                    objectAnimatorM26819 = C10634.m26816(floatingActionButton22, str12, fArr8);
                    ViewGroup.MarginLayoutParams marginLayoutParams11 = (ViewGroup.MarginLayoutParams) C1398.m4890(viewOnClickListenerC4514.f16051);
                    int iM113017 = (i16 - ThreadFactoryC3888.m11306("֡ۤ")) * 85;
                    floatingActionButton7 = floatingActionButton22;
                    str10 = str12;
                    i18 = ((iM113017 ^ i17) * 24985) ^ 867193271;
                    duration = animatorSet5;
                    marginLayoutParams10 = marginLayoutParams11;
                    strM45020 = str13;
                    fArr13 = fArr32;
                    i19 = iM113017 ^ 1968580013;
                    floatingActionButton14 = floatingActionButton7;
                    fArr17 = fArr8;
                    c12589 = c12588;
                    floatingActionButton10 = floatingActionButton6;
                    break;
                case -891376959:
                case 140790285:
                    C1398.m4895();
                    if (C3535.f13026 <= 0) {
                        floatingActionButton4 = floatingActionButton10;
                        fArr4 = fArr13;
                        c12587 = c12589;
                        str3 = strM45020;
                        fArr5 = fArr17;
                        marginLayoutParams3 = marginLayoutParams10;
                        animatorSet2 = duration;
                        marginLayoutParams4 = marginLayoutParams9;
                        floatingActionButton5 = floatingActionButton14;
                        sArr = sArr3;
                        c2 = c4;
                        float[] fArr33 = fArr16;
                        i20 = i20;
                        marginLayoutParams8 = marginLayoutParams8;
                        floatingActionButton13 = floatingActionButton13;
                        fArr6 = fArr33;
                        String str14 = str10;
                        fArr14 = fArr14;
                        str4 = str14;
                        int iM450213 = (C19806.m45029("᩸۫") + i17) * 43;
                        sArr3 = sArr;
                        marginLayoutParams9 = marginLayoutParams4;
                        duration = animatorSet2;
                        marginLayoutParams10 = marginLayoutParams3;
                        strM45020 = str3;
                        fArr13 = fArr4;
                        i19 = iM450213 ^ 13668251;
                        i18 = ((iM450213 ^ i16) * (-15389)) ^ (-1423727412);
                        c4 = c2;
                        floatingActionButton14 = floatingActionButton5;
                        fArr17 = fArr5;
                        c12589 = c12587;
                        floatingActionButton10 = floatingActionButton4;
                        FloatingActionButton floatingActionButton23 = floatingActionButton13;
                        marginLayoutParams8 = marginLayoutParams8;
                        i20 = i20;
                        fArr16 = fArr6;
                        floatingActionButton13 = floatingActionButton23;
                        float[] fArr34 = fArr14;
                        str10 = str4;
                        fArr14 = fArr34;
                    } else {
                        floatingActionButton = floatingActionButton10;
                        str2 = str10;
                        fArr = fArr13;
                        c12586 = c12589;
                        str = strM45020;
                        fArr2 = fArr17;
                        marginLayoutParams = marginLayoutParams10;
                        animatorSet = duration;
                        floatingActionButton2 = floatingActionButton14;
                        c = c4;
                        float[] fArr212 = fArr16;
                        i = i20;
                        marginLayoutParams2 = marginLayoutParams8;
                        floatingActionButton3 = floatingActionButton13;
                        fArr3 = fArr212;
                        int iM113018 = (ThreadFactoryC3888.m11306("ۖۧ") + i16) * (-103);
                        i2 = ((iM113018 ^ i17) * (-32745)) ^ (-892908928);
                        i3 = iM113018 ^ 561788017;
                        str10 = str2;
                        i18 = i2;
                        c4 = c;
                        floatingActionButton14 = floatingActionButton2;
                        fArr17 = fArr2;
                        c12589 = c12586;
                        floatingActionButton10 = floatingActionButton;
                        float[] fArr213 = fArr;
                        i19 = i3;
                        duration = animatorSet;
                        marginLayoutParams10 = marginLayoutParams;
                        strM45020 = str;
                        fArr13 = fArr213;
                        FloatingActionButton floatingActionButton111 = floatingActionButton3;
                        marginLayoutParams8 = marginLayoutParams2;
                        i20 = i;
                        fArr16 = fArr3;
                        floatingActionButton13 = floatingActionButton111;
                    }
                    break;
                case -825723739:
                case 31397167:
                    floatingActionButton11 = viewOnClickListenerC4514.f16052;
                    fArr15 = new float[i21];
                    // fill-array-data instruction
                    fArr15[0] = 0.8f;
                    fArr15[1] = 0.0f;
                    strM45020 = C19806.m45020(f16037, 267, 5, i25);
                    if (C3722.f13525 > 0) {
                        iM45029 = C19806.m45029("ۜۘ") ^ i16;
                        i4 = ((iM45029 ^ i17) * (-25117)) ^ (-1490484502);
                        i5 = -526747301;
                        i19 = iM45029 ^ i5;
                        i18 = i4;
                    } else {
                        floatingActionButton = floatingActionButton10;
                        str2 = str10;
                        fArr = fArr13;
                        c12586 = c12589;
                        str = strM45020;
                        fArr2 = fArr17;
                        marginLayoutParams = marginLayoutParams10;
                        animatorSet = duration;
                        floatingActionButton2 = floatingActionButton14;
                        c = c4;
                        float[] fArr214 = fArr16;
                        i = i20;
                        marginLayoutParams2 = marginLayoutParams8;
                        floatingActionButton3 = floatingActionButton13;
                        fArr3 = fArr214;
                        int iM113019 = (ThreadFactoryC3888.m11306("ۖۧ") + i16) * (-103);
                        i2 = ((iM113019 ^ i17) * (-32745)) ^ (-892908928);
                        i3 = iM113019 ^ 561788017;
                        str10 = str2;
                        i18 = i2;
                        c4 = c;
                        floatingActionButton14 = floatingActionButton2;
                        fArr17 = fArr2;
                        c12589 = c12586;
                        floatingActionButton10 = floatingActionButton;
                        float[] fArr215 = fArr;
                        i19 = i3;
                        duration = animatorSet;
                        marginLayoutParams10 = marginLayoutParams;
                        strM45020 = str;
                        fArr13 = fArr215;
                        FloatingActionButton floatingActionButton112 = floatingActionButton3;
                        marginLayoutParams8 = marginLayoutParams2;
                        i20 = i;
                        fArr16 = fArr3;
                        floatingActionButton13 = floatingActionButton112;
                    }
                    break;
                case -684179852:
                case -454523434:
                    c12588 = c12589;
                    str7 = str10;
                    fArr10 = fArr13;
                    str8 = strM45020;
                    marginLayoutParams7 = marginLayoutParams10;
                    animatorSet4 = duration;
                    FloatingActionButton floatingActionButton24 = viewOnClickListenerC4514.f16051;
                    iM81610 = C2642.m8169(floatingActionButton24);
                    int i31 = marginLayoutParams7.topMargin;
                    if (AbstractC0464.f2088 <= 0) {
                        floatingActionButton6 = floatingActionButton24;
                        i23 = i31;
                        floatingActionButton9 = floatingActionButton13;
                        fArr11 = fArr16;
                        fArr8 = fArr17;
                        floatingActionButton7 = floatingActionButton14;
                        c3 = c4;
                        iM11308 = C19806.m45029("֫֫") ^ i16;
                        i11 = ((iM11308 ^ i17) * (-15391)) ^ 715873298;
                        i12 = -1540645286;
                        int i32 = iM11308 ^ i12;
                        str10 = str7;
                        i18 = i11;
                        i20 = i20;
                        fArr16 = fArr11;
                        floatingActionButton13 = floatingActionButton9;
                        duration = animatorSet4;
                        marginLayoutParams10 = marginLayoutParams7;
                        strM45020 = str8;
                        fArr13 = fArr10;
                        i19 = i32;
                        c4 = c3;
                        floatingActionButton14 = floatingActionButton7;
                        fArr17 = fArr8;
                        c12589 = c12588;
                        floatingActionButton10 = floatingActionButton6;
                    } else {
                        int iM450214 = C19806.m45029("֨ܶ") ^ i17;
                        str10 = str7;
                        i18 = ((iM450214 ^ i16) * (-24115)) ^ (-2119474986);
                        duration = animatorSet4;
                        marginLayoutParams10 = marginLayoutParams7;
                        strM45020 = str8;
                        fArr13 = fArr10;
                        i19 = iM450214 ^ (-1160811107);
                        i23 = i31;
                        c12589 = c12588;
                        floatingActionButton10 = floatingActionButton24;
                    }
                    break;
                case -480992872:
                case 928460878:
                    floatingActionButton10 = floatingActionButton10;
                    fArr13 = fArr13;
                    c12589 = c12589;
                    strM45020 = strM45020;
                    fArr17 = fArr17;
                    marginLayoutParams10 = marginLayoutParams10;
                    duration = duration;
                    floatingActionButton14 = floatingActionButton14;
                    c4 = c4;
                    marginLayoutParams9 = marginLayoutParams9;
                    sArr3 = sArr3;
                    float[] fArr35 = fArr16;
                    i20 = i20;
                    marginLayoutParams8 = marginLayoutParams8;
                    floatingActionButton13 = floatingActionButton13;
                    fArr6 = fArr35;
                    String str15 = str10;
                    fArr14 = fArr14;
                    str4 = str15;
                    s = f16037[254];
                    i24 = s * 33426;
                    iM11306 = ThreadFactoryC3888.m11306("ۛ۬") ^ i17;
                    i18 = ((iM11306 ^ i16) * (-11081)) ^ (-1331807394);
                    i6 = 277647382;
                    int i33 = iM11306 ^ i6;
                    sArr3 = sArr3;
                    duration = duration;
                    marginLayoutParams9 = marginLayoutParams9;
                    marginLayoutParams10 = marginLayoutParams10;
                    c4 = c4;
                    floatingActionButton14 = floatingActionButton14;
                    strM45020 = strM45020;
                    fArr17 = fArr17;
                    c12589 = c12589;
                    fArr13 = fArr13;
                    i19 = i33;
                    floatingActionButton10 = floatingActionButton10;
                    viewOnClickListenerC4514 = this;
                    FloatingActionButton floatingActionButton25 = floatingActionButton13;
                    marginLayoutParams8 = marginLayoutParams8;
                    i20 = i20;
                    fArr16 = fArr6;
                    floatingActionButton13 = floatingActionButton25;
                    float[] fArr36 = fArr14;
                    str10 = str4;
                    fArr14 = fArr36;
                    break;
                case -325154581:
                case 1088369514:
                    floatingActionButton6 = floatingActionButton10;
                    float[] fArr37 = fArr13;
                    c12588 = c12589;
                    String str16 = strM45020;
                    fArr8 = fArr17;
                    ViewGroup.MarginLayoutParams marginLayoutParams12 = marginLayoutParams10;
                    AnimatorSet animatorSet6 = duration;
                    ViewGroup.MarginLayoutParams marginLayoutParams13 = (ViewGroup.MarginLayoutParams) layoutParamsM4890;
                    char c6 = c4;
                    FloatingActionButton floatingActionButton26 = viewOnClickListenerC4514.f16043;
                    iM8169 = C2642.m8169(floatingActionButton26) + marginLayoutParams13.topMargin;
                    int i34 = marginLayoutParams13.bottomMargin;
                    int iM113020 = (i16 - ThreadFactoryC3888.m11306("۟֨")) * 41;
                    str10 = str10;
                    i18 = ((iM113020 ^ i17) * (-2923)) ^ (-1697174592);
                    duration = animatorSet6;
                    marginLayoutParams10 = marginLayoutParams12;
                    strM45020 = str16;
                    fArr13 = fArr37;
                    i19 = iM113020 ^ 1294106516;
                    c4 = c6;
                    floatingActionButton14 = floatingActionButton26;
                    i22 = i34;
                    fArr17 = fArr8;
                    c12589 = c12588;
                    floatingActionButton10 = floatingActionButton6;
                    break;
                case -324251369:
                case -1309589:
                    String str17 = strM45020;
                    floatingActionButton6 = floatingActionButton10;
                    c12588 = c12589;
                    ViewGroup.MarginLayoutParams marginLayoutParams14 = marginLayoutParams10;
                    AnimatorSet animatorSet7 = duration;
                    float f7 = iM81610 + i23 + marginLayoutParams14.bottomMargin;
                    int iM450215 = (C19806.m45029("ۖۙ") + i16) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    int i35 = ((iM450215 ^ i17) * (-30673)) ^ 276046057;
                    i19 = iM450215 ^ (-883091578);
                    f2 = f7;
                    str10 = str10;
                    i18 = i35;
                    duration = animatorSet7;
                    marginLayoutParams10 = marginLayoutParams14;
                    strM45020 = str17;
                    fArr13 = new float[i21];
                    c12589 = c12588;
                    floatingActionButton10 = floatingActionButton6;
                    break;
                case -324152679:
                case -186711216:
                    duration.addListener(new C1296(viewOnClickListenerC4514));
                    duration.start();
                    c12589 = viewOnClickListenerC4514.f16044;
                    iM45029 = C19806.m45029("۫ۜ") ^ i17;
                    i4 = ((iM45029 ^ i16) * (-19163)) ^ 1479142393;
                    i5 = -46256382;
                    i19 = iM45029 ^ i5;
                    i18 = i4;
                    break;
                case -131634229:
                case 1848588038:
                    fArr6 = fArr16;
                    str4 = str10;
                    i25 = 23084;
                    iM11306 = C19806.m45029("ۘܽ") ^ i17;
                    i18 = ((iM11306 ^ i16) * (-25191)) ^ 1789542124;
                    i6 = 1690335180;
                    int i36 = iM11306 ^ i6;
                    sArr3 = sArr3;
                    duration = duration;
                    marginLayoutParams9 = marginLayoutParams9;
                    marginLayoutParams10 = marginLayoutParams10;
                    c4 = c4;
                    floatingActionButton14 = floatingActionButton14;
                    strM45020 = strM45020;
                    fArr17 = fArr17;
                    c12589 = c12589;
                    fArr13 = fArr13;
                    i19 = i36;
                    floatingActionButton10 = floatingActionButton10;
                    viewOnClickListenerC4514 = this;
                    FloatingActionButton floatingActionButton27 = floatingActionButton13;
                    marginLayoutParams8 = marginLayoutParams8;
                    i20 = i20;
                    fArr16 = fArr6;
                    floatingActionButton13 = floatingActionButton27;
                    float[] fArr38 = fArr14;
                    str10 = str4;
                    fArr14 = fArr38;
                    break;
                case -62004890:
                case 1969144637:
                    Animator[] animatorArr2 = new Animator[i20];
                    animatorArr2[c5] = objectAnimatorM4025;
                    animatorArr2[z2 ? 1 : 0] = objectAnimatorM4024;
                    animatorArr2[i21] = objectAnimatorM26818;
                    animatorArr2[c4] = objectAnimatorM26817;
                    duration.playTogether(animatorArr2);
                    floatingActionButton6 = floatingActionButton10;
                    str9 = str10;
                    fArr12 = fArr13;
                    c12588 = c12589;
                    iM11309 = ThreadFactoryC3888.m11306("ᩳۜ") ^ i17;
                    i13 = ((iM11309 ^ i16) * 27711) ^ 188754658;
                    i14 = -1564494947;
                    int i210 = iM11309 ^ i14;
                    str10 = str9;
                    i18 = i13;
                    strM45020 = strM45020;
                    fArr13 = fArr12;
                    i19 = i210;
                    c12589 = c12588;
                    floatingActionButton10 = floatingActionButton6;
                    break;
                case -29389605:
                case 1813447802:
                    floatingActionButton6 = floatingActionButton10;
                    fArr7 = fArr13;
                    c12588 = c12589;
                    str5 = strM45020;
                    fArr8 = fArr17;
                    marginLayoutParams5 = marginLayoutParams10;
                    animatorSet3 = duration;
                    floatingActionButton7 = floatingActionButton14;
                    c4 = c4;
                    float[] fArr39 = fArr16;
                    i9 = i20;
                    marginLayoutParams6 = marginLayoutParams8;
                    floatingActionButton8 = floatingActionButton13;
                    fArr9 = fArr39;
                    fArr14 = fArr14;
                    sArr2 = sArr3;
                    strM5047 = C1460.m5047(sArr2, 255, 12, i25);
                    if (C1419.m4973()) {
                        iM11307 = (ThreadFactoryC3888.m11306("۫ۘ") + i17) * (-63);
                        str6 = strM5047;
                        i18 = ((iM11307 ^ i16) * (-12219)) ^ (-1831449772);
                        i10 = 1339482948;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۙۜ") ^ i16;
                        str6 = strM5047;
                        i18 = ((iM11307 ^ i17) * (-20541)) ^ 942894645;
                        i10 = -1482939981;
                    }
                    sArr3 = sArr2;
                    c4 = c4;
                    floatingActionButton14 = floatingActionButton7;
                    fArr17 = fArr8;
                    c12589 = c12588;
                    floatingActionButton10 = floatingActionButton6;
                    float[] fArr216 = fArr7;
                    i19 = iM11307 ^ i10;
                    duration = animatorSet3;
                    marginLayoutParams10 = marginLayoutParams5;
                    strM45020 = str5;
                    fArr13 = fArr216;
                    FloatingActionButton floatingActionButton113 = floatingActionButton8;
                    marginLayoutParams8 = marginLayoutParams6;
                    i20 = i9;
                    fArr16 = fArr9;
                    floatingActionButton13 = floatingActionButton113;
                    float[] fArr217 = fArr14;
                    str10 = str6;
                    fArr14 = fArr217;
                    break;
                case 65233775:
                case 350018370:
                    floatingActionButton4 = floatingActionButton10;
                    float[] fArr40 = fArr13;
                    c12587 = c12589;
                    String str18 = strM45020;
                    fArr5 = fArr17;
                    ViewGroup.MarginLayoutParams marginLayoutParams15 = marginLayoutParams10;
                    AnimatorSet animatorSet8 = duration;
                    floatingActionButton5 = floatingActionButton14;
                    c2 = c4;
                    float[] fArr41 = fArr16;
                    i20 = i20;
                    marginLayoutParams8 = marginLayoutParams8;
                    floatingActionButton13 = floatingActionButton13;
                    fArr6 = fArr41;
                    String str19 = str10;
                    fArr14 = fArr14;
                    str4 = str19;
                    ViewGroup.MarginLayoutParams marginLayoutParams16 = (ViewGroup.MarginLayoutParams) C3535.m10428(viewOnClickListenerC4514.f16052);
                    FloatingActionButton floatingActionButton28 = viewOnClickListenerC4514.f16052;
                    iM10956 = C3743.m10956(floatingActionButton28);
                    int i37 = marginLayoutParams16.topMargin;
                    int iM450216 = C19806.m45029("ۚܰ") ^ i16;
                    floatingActionButton15 = floatingActionButton28;
                    sArr3 = sArr3;
                    duration = animatorSet8;
                    marginLayoutParams9 = marginLayoutParams16;
                    marginLayoutParams10 = marginLayoutParams15;
                    strM45020 = str18;
                    i18 = ((iM450216 ^ i17) * 20793) ^ (-262375041);
                    fArr13 = fArr40;
                    viewOnClickListenerC4514 = this;
                    i19 = iM450216 ^ (-1556266212);
                    i27 = i37;
                    c4 = c2;
                    floatingActionButton14 = floatingActionButton5;
                    fArr17 = fArr5;
                    c12589 = c12587;
                    floatingActionButton10 = floatingActionButton4;
                    FloatingActionButton floatingActionButton29 = floatingActionButton13;
                    marginLayoutParams8 = marginLayoutParams8;
                    i20 = i20;
                    fArr16 = fArr6;
                    floatingActionButton13 = floatingActionButton29;
                    float[] fArr310 = fArr14;
                    str10 = str4;
                    fArr14 = fArr310;
                    break;
                case 118304484:
                case 1658576843:
                    floatingActionButton6 = floatingActionButton10;
                    str7 = str10;
                    fArr10 = fArr13;
                    c12588 = c12589;
                    str8 = strM45020;
                    fArr8 = fArr17;
                    marginLayoutParams7 = marginLayoutParams10;
                    animatorSet4 = duration;
                    floatingActionButton9 = floatingActionButton13;
                    floatingActionButton7 = floatingActionButton14;
                    c3 = c4;
                    float[] fArr42 = new float[i21];
                    fArr42[c5] = f3;
                    fArr42[z2 ? 1 : 0] = iM10957 + i26;
                    iM11308 = ThreadFactoryC3888.m11306("ܰܺ") ^ i17;
                    fArr11 = fArr42;
                    i11 = ((iM11308 ^ i16) * (-29215)) ^ 1223160838;
                    i12 = 245639809;
                    int i38 = iM11308 ^ i12;
                    str10 = str7;
                    i18 = i11;
                    i20 = i20;
                    fArr16 = fArr11;
                    floatingActionButton13 = floatingActionButton9;
                    duration = animatorSet4;
                    marginLayoutParams10 = marginLayoutParams7;
                    strM45020 = str8;
                    fArr13 = fArr10;
                    i19 = i38;
                    c4 = c3;
                    floatingActionButton14 = floatingActionButton7;
                    fArr17 = fArr8;
                    c12589 = c12588;
                    floatingActionButton10 = floatingActionButton6;
                    break;
                case 223640281:
                case 1943549101:
                    fArr6 = fArr16;
                    str4 = str10;
                    i25 = 32763;
                    iM11306 = C19806.m45029("ۘܽ") ^ i17;
                    i18 = ((iM11306 ^ i16) * (-25191)) ^ 1789542124;
                    i6 = 1690335180;
                    int i39 = iM11306 ^ i6;
                    sArr3 = sArr3;
                    duration = duration;
                    marginLayoutParams9 = marginLayoutParams9;
                    marginLayoutParams10 = marginLayoutParams10;
                    c4 = c4;
                    floatingActionButton14 = floatingActionButton14;
                    strM45020 = strM45020;
                    fArr17 = fArr17;
                    c12589 = c12589;
                    fArr13 = fArr13;
                    i19 = i39;
                    floatingActionButton10 = floatingActionButton10;
                    viewOnClickListenerC4514 = this;
                    FloatingActionButton floatingActionButton210 = floatingActionButton13;
                    marginLayoutParams8 = marginLayoutParams8;
                    i20 = i20;
                    fArr16 = fArr6;
                    floatingActionButton13 = floatingActionButton210;
                    float[] fArr311 = fArr14;
                    str10 = str4;
                    fArr14 = fArr311;
                    break;
                case 256734463:
                case 1925518581:
                    objectAnimatorM4025 = C1066.m4024(floatingActionButton11, strM45020, fArr15);
                    float[] fArr43 = new float[i21];
                    // fill-array-data instruction
                    fArr43[0] = 0.8f;
                    fArr43[1] = 0.0f;
                    objectAnimatorM4024 = C1066.m4024(viewOnClickListenerC4514.f16054, strM45020, fArr43);
                    floatingActionButton12 = viewOnClickListenerC4514.f16043;
                    if (!C19806.m45024()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺ᩸") + i17) * (-81);
                        i4 = ((iM45029 ^ i16) * 2959) ^ 1520318674;
                        i5 = -606860063;
                        i19 = iM45029 ^ i5;
                        i18 = i4;
                    } else {
                        floatingActionButton6 = floatingActionButton10;
                        str9 = str10;
                        fArr12 = fArr13;
                        c12588 = c12589;
                        iM11309 = ThreadFactoryC3888.m11306("ܽ᩶") ^ i16;
                        strM45020 = strM45020;
                        i13 = ((iM11309 ^ i17) * 8533) ^ 819668069;
                        i14 = -407673332;
                        int i211 = iM11309 ^ i14;
                        str10 = str9;
                        i18 = i13;
                        strM45020 = strM45020;
                        fArr13 = fArr12;
                        i19 = i211;
                        c12589 = c12588;
                        floatingActionButton10 = floatingActionButton6;
                    }
                    break;
                case 399156895:
                case 1489454735:
                    floatingActionButton6 = floatingActionButton10;
                    str7 = str10;
                    fArr10 = fArr13;
                    c12588 = c12589;
                    str8 = strM45020;
                    fArr8 = fArr17;
                    marginLayoutParams7 = marginLayoutParams10;
                    animatorSet4 = duration;
                    floatingActionButton9 = floatingActionButton13;
                    floatingActionButton7 = floatingActionButton14;
                    c3 = c4;
                    float[] fArr44 = fArr16;
                    objectAnimatorM4026 = C1066.m4024(floatingActionButton9, str7, fArr44);
                    fArr11 = fArr44;
                    layoutParamsM4890 = C1398.m4890(viewOnClickListenerC4514.f16043);
                    if (C0050.f912 <= 0) {
                        iM11308 = C19806.m45029("֫֫") ^ i16;
                        i11 = ((iM11308 ^ i17) * (-15391)) ^ 715873298;
                        i12 = -1540645286;
                    } else {
                        iM11308 = C19806.m45029("ۨܽ") ^ i16;
                        i11 = ((iM11308 ^ i17) * 25723) ^ 269646674;
                        i12 = -1358415641;
                    }
                    int i310 = iM11308 ^ i12;
                    str10 = str7;
                    i18 = i11;
                    i20 = i20;
                    fArr16 = fArr11;
                    floatingActionButton13 = floatingActionButton9;
                    duration = animatorSet4;
                    marginLayoutParams10 = marginLayoutParams7;
                    strM45020 = str8;
                    fArr13 = fArr10;
                    i19 = i310;
                    c4 = c3;
                    floatingActionButton14 = floatingActionButton7;
                    fArr17 = fArr8;
                    c12589 = c12588;
                    floatingActionButton10 = floatingActionButton6;
                    break;
                case 620997184:
                case 1212886088:
                    float[] fArr45 = fArr16;
                    FloatingActionButton floatingActionButton30 = floatingActionButton10;
                    String str20 = str10;
                    float[] fArr46 = fArr13;
                    int i40 = i20;
                    C12586 c125810 = c12589;
                    String str21 = strM45020;
                    float[] fArr47 = fArr17;
                    ViewGroup.MarginLayoutParams marginLayoutParams17 = marginLayoutParams10;
                    AnimatorSet animatorSet9 = duration;
                    FloatingActionButton floatingActionButton31 = floatingActionButton15;
                    FloatingActionButton floatingActionButton32 = floatingActionButton14;
                    char c7 = c4;
                    float[] fArr48 = fArr14;
                    objectAnimatorM26816 = C10634.m26816(floatingActionButton31, str20, fArr48);
                    marginLayoutParams8 = (ViewGroup.MarginLayoutParams) C1398.m4890(viewOnClickListenerC4514.f16054);
                    FloatingActionButton floatingActionButton33 = viewOnClickListenerC4514.f16054;
                    int iM450217 = (C19806.m45029("᩷֡") ^ i16) * (-119);
                    i18 = ((iM450217 ^ i17) * (-32699)) ^ (-2095735597);
                    int i41 = iM450217 ^ 1185171479;
                    str10 = str20;
                    fArr14 = fArr48;
                    c4 = c7;
                    floatingActionButton14 = floatingActionButton32;
                    fArr17 = fArr47;
                    c12589 = c125810;
                    floatingActionButton10 = floatingActionButton30;
                    floatingActionButton15 = floatingActionButton31;
                    duration = animatorSet9;
                    marginLayoutParams10 = marginLayoutParams17;
                    strM45020 = str21;
                    fArr13 = fArr46;
                    i19 = i41;
                    floatingActionButton13 = floatingActionButton33;
                    i20 = i40;
                    fArr16 = fArr45;
                    break;
                case 705431676:
                case 2000946166:
                    ViewGroup.MarginLayoutParams marginLayoutParams18 = marginLayoutParams8;
                    FloatingActionButton floatingActionButton34 = floatingActionButton13;
                    float[] fArr49 = fArr16;
                    FloatingActionButton floatingActionButton35 = floatingActionButton10;
                    float[] fArr50 = fArr13;
                    C12586 c125811 = c12589;
                    String str22 = strM45020;
                    float[] fArr51 = fArr17;
                    ViewGroup.MarginLayoutParams marginLayoutParams19 = marginLayoutParams10;
                    AnimatorSet animatorSet10 = duration;
                    ViewGroup.MarginLayoutParams marginLayoutParams20 = marginLayoutParams9;
                    FloatingActionButton floatingActionButton36 = floatingActionButton14;
                    short[] sArr4 = sArr3;
                    char c8 = c4;
                    String str23 = str10;
                    float[] fArr52 = fArr14;
                    c5 = 0;
                    i21 = 2;
                    z2 = true;
                    if (z) {
                        iM450210 = ThreadFactoryC3888.m11306("ܿᩳ") ^ i17;
                        i7 = ((iM450210 ^ i16) * 20413) ^ 355596066;
                        i8 = -1733622347;
                    } else {
                        iM450210 = (C19806.m45029("֡ۧ") ^ i17) * (-75);
                        i7 = ((iM450210 ^ i16) * 18259) ^ 1739779451;
                        i8 = -1540311800;
                    }
                    int i42 = iM450210 ^ i8;
                    viewOnClickListenerC4514 = this;
                    sArr3 = sArr4;
                    fArr16 = fArr49;
                    marginLayoutParams9 = marginLayoutParams20;
                    floatingActionButton13 = floatingActionButton34;
                    duration = animatorSet10;
                    marginLayoutParams8 = marginLayoutParams18;
                    marginLayoutParams10 = marginLayoutParams19;
                    strM45020 = str22;
                    i20 = 4;
                    fArr13 = fArr50;
                    i19 = i42;
                    i18 = i7;
                    c4 = c8;
                    floatingActionButton14 = floatingActionButton36;
                    fArr17 = fArr51;
                    c12589 = c125811;
                    floatingActionButton10 = floatingActionButton35;
                    str10 = str23;
                    fArr14 = fArr52;
                    break;
                case 849553069:
                case 1952549584:
                    FloatingActionButton floatingActionButton37 = floatingActionButton10;
                    float[] fArr53 = fArr16;
                    i20 = i20;
                    marginLayoutParams8 = marginLayoutParams8;
                    floatingActionButton13 = floatingActionButton13;
                    fArr6 = fArr53;
                    String str24 = str10;
                    fArr14 = fArr14;
                    str4 = str24;
                    duration = new AnimatorSet().setDuration(200L);
                    int iM113021 = ThreadFactoryC3888.m11306("ۙ᩷") ^ i16;
                    marginLayoutParams10 = marginLayoutParams10;
                    sArr3 = sArr3;
                    floatingActionButton14 = floatingActionButton14;
                    strM45020 = strM45020;
                    marginLayoutParams9 = marginLayoutParams9;
                    fArr17 = fArr17;
                    c12589 = c12589;
                    fArr13 = fArr13;
                    c4 = 3;
                    i19 = iM113021 ^ (-1735181424);
                    floatingActionButton10 = floatingActionButton37;
                    i18 = ((iM113021 ^ i17) * 31671) ^ (-861367932);
                    viewOnClickListenerC4514 = this;
                    FloatingActionButton floatingActionButton211 = floatingActionButton13;
                    marginLayoutParams8 = marginLayoutParams8;
                    i20 = i20;
                    fArr16 = fArr6;
                    floatingActionButton13 = floatingActionButton211;
                    float[] fArr312 = fArr14;
                    str10 = str4;
                    fArr14 = fArr312;
                    break;
                case 1190117731:
                case 1321908886:
                    floatingActionButton10 = floatingActionButton10;
                    fArr13 = fArr13;
                    c12589 = c12589;
                    strM45020 = strM45020;
                    fArr17 = fArr17;
                    marginLayoutParams10 = marginLayoutParams10;
                    duration = duration;
                    floatingActionButton14 = floatingActionButton14;
                    c4 = c4;
                    marginLayoutParams9 = marginLayoutParams9;
                    sArr3 = sArr3;
                    float[] fArr54 = fArr16;
                    i20 = i20;
                    marginLayoutParams8 = marginLayoutParams8;
                    floatingActionButton13 = floatingActionButton13;
                    fArr6 = fArr54;
                    String str25 = str10;
                    fArr14 = fArr14;
                    str4 = str25;
                    if (((s * s) + 279324369) - i24 >= 0) {
                        iM11306 = (C19806.m45029("۠᩶") ^ i16) * (-91);
                        i18 = ((iM11306 ^ i17) * (-26515)) ^ 1825621975;
                        i6 = 1180289677;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩺") ^ i16;
                        i18 = ((iM11306 ^ i17) * 21963) ^ 1060505176;
                        i6 = -494713895;
                    }
                    int i311 = iM11306 ^ i6;
                    sArr3 = sArr3;
                    duration = duration;
                    marginLayoutParams9 = marginLayoutParams9;
                    marginLayoutParams10 = marginLayoutParams10;
                    c4 = c4;
                    floatingActionButton14 = floatingActionButton14;
                    strM45020 = strM45020;
                    fArr17 = fArr17;
                    c12589 = c12589;
                    fArr13 = fArr13;
                    i19 = i311;
                    floatingActionButton10 = floatingActionButton10;
                    viewOnClickListenerC4514 = this;
                    FloatingActionButton floatingActionButton212 = floatingActionButton13;
                    marginLayoutParams8 = marginLayoutParams8;
                    i20 = i20;
                    fArr16 = fArr6;
                    floatingActionButton13 = floatingActionButton212;
                    float[] fArr313 = fArr14;
                    str10 = str4;
                    fArr14 = fArr313;
                    break;
                case 1274871266:
                case 2098725836:
                    if (!C0526.f2219) {
                        floatingActionButton6 = floatingActionButton10;
                        str9 = str10;
                        fArr12 = fArr13;
                        c12588 = c12589;
                        iM11309 = ThreadFactoryC3888.m11306("ܽ᩶") ^ i16;
                        strM45020 = strM45020;
                        i13 = ((iM11309 ^ i17) * 8533) ^ 819668069;
                        i14 = -407673332;
                        int i212 = iM11309 ^ i14;
                        str10 = str9;
                        i18 = i13;
                        strM45020 = strM45020;
                        fArr13 = fArr12;
                        i19 = i212;
                        c12589 = c12588;
                        floatingActionButton10 = floatingActionButton6;
                    } else {
                        floatingActionButton6 = floatingActionButton10;
                        strM5047 = str10;
                        fArr7 = fArr13;
                        c12588 = c12589;
                        str5 = strM45020;
                        fArr8 = fArr17;
                        marginLayoutParams5 = marginLayoutParams10;
                        animatorSet3 = duration;
                        floatingActionButton7 = floatingActionButton14;
                        sArr2 = sArr3;
                        float[] fArr218 = fArr16;
                        i9 = i20;
                        marginLayoutParams6 = marginLayoutParams8;
                        floatingActionButton8 = floatingActionButton13;
                        fArr9 = fArr218;
                        iM11307 = (ThreadFactoryC3888.m11306("۫ۘ") + i17) * (-63);
                        str6 = strM5047;
                        i18 = ((iM11307 ^ i16) * (-12219)) ^ (-1831449772);
                        i10 = 1339482948;
                        sArr3 = sArr2;
                        c4 = c4;
                        floatingActionButton14 = floatingActionButton7;
                        fArr17 = fArr8;
                        c12589 = c12588;
                        floatingActionButton10 = floatingActionButton6;
                        float[] fArr219 = fArr7;
                        i19 = iM11307 ^ i10;
                        duration = animatorSet3;
                        marginLayoutParams10 = marginLayoutParams5;
                        strM45020 = str5;
                        fArr13 = fArr219;
                        FloatingActionButton floatingActionButton114 = floatingActionButton8;
                        marginLayoutParams8 = marginLayoutParams6;
                        i20 = i9;
                        fArr16 = fArr9;
                        floatingActionButton13 = floatingActionButton114;
                        float[] fArr2110 = fArr14;
                        str10 = str6;
                        fArr14 = fArr2110;
                    }
                    break;
                default:
                    C0817.m3399();
                    C0671.m3008();
                    floatingActionButton = floatingActionButton10;
                    str2 = str10;
                    fArr = fArr13;
                    c12586 = c12589;
                    str = strM45020;
                    fArr2 = fArr17;
                    marginLayoutParams = marginLayoutParams10;
                    animatorSet = duration;
                    floatingActionButton2 = floatingActionButton14;
                    c = c4;
                    float[] fArr2111 = fArr16;
                    i = i20;
                    marginLayoutParams2 = marginLayoutParams8;
                    floatingActionButton3 = floatingActionButton13;
                    fArr3 = fArr2111;
                    int iM1130110 = (ThreadFactoryC3888.m11306("ۖۧ") + i16) * (-103);
                    i2 = ((iM1130110 ^ i17) * (-32745)) ^ (-892908928);
                    i3 = iM1130110 ^ 561788017;
                    str10 = str2;
                    i18 = i2;
                    c4 = c;
                    floatingActionButton14 = floatingActionButton2;
                    fArr17 = fArr2;
                    c12589 = c12586;
                    floatingActionButton10 = floatingActionButton;
                    float[] fArr2112 = fArr;
                    i19 = i3;
                    duration = animatorSet;
                    marginLayoutParams10 = marginLayoutParams;
                    strM45020 = str;
                    fArr13 = fArr2112;
                    FloatingActionButton floatingActionButton115 = floatingActionButton3;
                    marginLayoutParams8 = marginLayoutParams2;
                    i20 = i;
                    fArr16 = fArr3;
                    floatingActionButton13 = floatingActionButton115;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x016c  */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0083, code lost:
    
        if (l.RunnableC1564.m5345() != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r37) {
        /*
            Method dump skipped, instruction units count: 2150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC4514.onClick(android.view.View):void");
    }

    @Override // l.AbstractActivityC12483, l.ActivityC19126, android.app.Activity
    public final void onResume() {
        int iM45029;
        int i;
        final C3412 c3412 = null;
        long j = 0;
        boolean z = false;
        int i2 = 2066211677;
        int i3 = C1419.f5860;
        int i4 = C0050.f912;
        int iM11306 = ThreadFactoryC3888.m11306("۬ۚ") ^ i4;
        int i5 = ((iM11306 ^ i3) * (-22973)) ^ 1357358212;
        int i6 = 1817675989;
        while (true) {
            int i7 = iM11306 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i3) * 7893) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2097234972:
                    case -1169599308:
                        C2124.m6681(new Runnable() { // from class: l.ۛᩳۘ
                            @Override // java.lang.Runnable
                            public final void run() {
                                c3412.m10113();
                            }
                        }, j);
                        iM11306 = C19806.m45029("֨ܶ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-18113)) ^ (-948279504);
                        i6 = -256957140;
                    case -1520503920:
                    case 756492290:
                        this.f16056 = null;
                        if (!c3412.m10113()) {
                            iM11306 = ThreadFactoryC3888.m11306("ᩳ֨") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-15389)) ^ 1870587636;
                            i6 = 1465748235;
                        } else {
                            iM11306 = C19806.m45029("֨ܶ") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-18113)) ^ (-948279504);
                            i6 = -256957140;
                        }
                        break;
                    case -1341704621:
                    case 1211993999:
                        if (RunnableC1606.f6488 < 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۙۚ") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-29837)) ^ (-1193009552);
                            i6 = -1027797378;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۚ֡") ^ i4) * (-123);
                            i5 = ((iM11306 ^ i3) * 8849) ^ 2036889540;
                            i6 = 331271795;
                        }
                        break;
                    case -1308485007:
                    case 242057479:
                        break;
                    case -1308014478:
                    case 1106309304:
                        if (!this.f16039) {
                            iM11306 = C19806.m45029("ۙܽ") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-17811)) ^ 859280943;
                            i6 = 1738721423;
                        } else {
                            iM11306 = (C19806.m45029("ܺܶ") ^ i3) * (-91);
                            i5 = ((iM11306 ^ i4) * (-14307)) ^ 845123690;
                            i6 = 1980183210;
                        }
                        break;
                    case -1132131775:
                    case 59872216:
                        if (this.f16047 == null) {
                            iM11306 = (ThreadFactoryC3888.m11306("۫ۙ") ^ i4) * (-69);
                            i5 = ((iM11306 ^ i3) * (-27935)) ^ (-289167540);
                            i6 = 1885202523;
                        } else {
                            iM11306 = C19806.m45029("ۚ۠") ^ i4;
                            i5 = ((iM11306 ^ i3) * 19951) ^ 1755401426;
                            i6 = 701807980;
                        }
                        break;
                    case -986049896:
                    case 565317323:
                        int i8 = 1;
                        if (C3722.f13525 > 0) {
                            C2124.m6681(new RunnableC17545(i8, this), j);
                            iM11306 = (ThreadFactoryC3888.m11306("۫ۙ") ^ i4) * (-69);
                            i5 = ((iM11306 ^ i3) * (-27935)) ^ (-289167540);
                            i6 = 1885202523;
                            break;
                        }
                        iM11306 = (C19806.m45029("ܽۡ") ^ i4) * 11;
                        i5 = ((iM11306 ^ i3) * 27389) ^ 870571925;
                        i6 = -1178609552;
                        break;
                    case -871559870:
                    case -36468975:
                        if (AbstractC0464.f2088 > 0) {
                            iM11306 = (C19806.m45029("۬ܳ") ^ i4) * (-7);
                            i5 = ((iM11306 ^ i3) * (-24515)) ^ (-1061002457);
                            i6 = -342539082;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 26343) ^ (-1772618200);
                            i6 = -1604631554;
                        }
                        break;
                    case -834804589:
                    case 21850034:
                        if (!RunnableC1564.m5345()) {
                            iM11306 = C19806.m45029("۬ᩴ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 5983) ^ (-186226960);
                            i6 = 722626394;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۘ᩹") ^ i3;
                            i5 = ((iM11306 ^ i4) * 15985) ^ (-849218038);
                            i6 = 614844571;
                        }
                        break;
                    case -766030780:
                    case 35157244:
                        this.f16049 = z;
                        this.f16039 = z;
                        mo2119();
                        break;
                    case -547964829:
                    case 1860108433:
                        if (C1189.f5284 > 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("֫ܰ") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i5 = ((iM11306 ^ i4) * 20613) ^ 1767863031;
                            i6 = -1991586442;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۘ᩹") ^ i3;
                            i5 = ((iM11306 ^ i4) * 15985) ^ (-849218038);
                            i6 = 614844571;
                        }
                        break;
                    case -349408910:
                    case 1907384145:
                        if (AbstractC0464.f2088 > 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("۠ܶ") + i4) * 55;
                            i5 = ((iM11306 ^ i3) * 25301) ^ (-1281865803);
                            i6 = -313438100;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("᩸ۖ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 24183) ^ 1225463657;
                            i6 = 511616561;
                        }
                        break;
                    case -251318464:
                    case 1826070514:
                        C0671.m3008();
                        if (C1148.f5161 > 0) {
                            iM11306 = (C19806.m45029("ܽۡ") ^ i4) * 11;
                            i5 = ((iM11306 ^ i3) * 27389) ^ 870571925;
                            i6 = -1178609552;
                            break;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 26343) ^ (-1772618200);
                        i6 = -1604631554;
                        break;
                    case -145885084:
                    case 1381434508:
                        RunnableC1564.m5345();
                        if (C3577.f13150 >= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 26343) ^ (-1772618200);
                            i6 = -1604631554;
                            break;
                        }
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ֡") ^ i4) * (-123);
                        i5 = ((iM11306 ^ i3) * 8849) ^ 2036889540;
                        i6 = 331271795;
                        break;
                    case -97353212:
                    case 2092933767:
                        if (C10634.f36300 < 0) {
                            iM11306 = (C19806.m45029("ᩴ۠") ^ i3) * 59;
                            i5 = ((iM11306 ^ i4) * (-779)) ^ 896000118;
                            i6 = -258871600;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("᩸ۖ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 24183) ^ 1225463657;
                            i6 = 511616561;
                        }
                        break;
                    case -59987619:
                    case 1585349939:
                        C1875.m6086();
                        if (C1668.f6641 >= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("᩸ۖ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 24183) ^ 1225463657;
                            i6 = 511616561;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 26343) ^ (-1772618200);
                        i6 = -1604631554;
                        break;
                    case -38708438:
                    case 1711210441:
                        if (!m12590()) {
                            iM11306 = (i4 - ThreadFactoryC3888.m11306("ܶۚ")) * (-67);
                            i5 = ((iM11306 ^ i3) * 3211) ^ (-1275492320);
                            i6 = 816057096;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("۫ۙ") ^ i4) * (-69);
                            i5 = ((iM11306 ^ i3) * (-27935)) ^ (-289167540);
                            i6 = 1885202523;
                        }
                        break;
                    case -21848280:
                    case 1665843735:
                        if (C1668.f6641 < 0) {
                            iM11306 = C19806.m45029("᩺ܰ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 27205) ^ 1088759411;
                            i6 = -1121862219;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۘ᩹") ^ i3;
                            i5 = ((iM11306 ^ i4) * 15985) ^ (-849218038);
                            i6 = 614844571;
                        }
                        break;
                    case -11273863:
                    case 545115224:
                        super.onResume();
                        if (!C0817.f3443) {
                            iM11306 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 26343) ^ (-1772618200);
                            i6 = -1604631554;
                            break;
                        }
                        iM11306 = (C19806.m45029("ܶ᩺") ^ i4) * (-11);
                        i5 = ((iM11306 ^ i3) * (-10131)) ^ (-396269497);
                        i6 = 1702563184;
                        break;
                    case 40773495:
                    case 2043445172:
                        this.f16039 = z;
                        m12562(j);
                        iM11306 = C19806.m45029("ۙܽ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-17811)) ^ 859280943;
                        i6 = 1738721423;
                        break;
                    case 147232004:
                    case 1398545613:
                        if (this.f16049) {
                            iM45029 = (C19806.m45029("ܺۢ") + i4) * (-121);
                            i5 = ((iM45029 ^ i3) * 6379) ^ 11927685;
                            i = -43494159;
                        } else {
                            iM45029 = (i3 - C19806.m45029("᩷ۚ")) * (-15);
                            i5 = ((iM45029 ^ i4) * 12391) ^ 1896983478;
                            i = 977214079;
                        }
                        i7 = iM45029 ^ i;
                        z = false;
                        break;
                    case 387832869:
                    case 1803364861:
                        if (C1460.m5050() == 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۡ᩺") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-27197)) ^ (-1747888669);
                            i6 = 815125725;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("᩸ۖ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 24183) ^ 1225463657;
                            i6 = 511616561;
                        }
                        break;
                    case 650777389:
                    case 1947184903:
                        C1875.m6086();
                        break;
                    case 1265664929:
                    case 1753386809:
                        c3412 = this.f16056;
                        j = 200;
                        if (c3412 == null) {
                            iM11306 = C19806.m45029("֨ܶ") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-18113)) ^ (-948279504);
                            i6 = -256957140;
                            break;
                        }
                        iM11306 = C19806.m45029("᩻᩵") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-16455)) ^ 2057038713;
                        i6 = 1895675312;
                        break;
                    default:
                        C1875.m6086();
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ֡") ^ i4) * (-123);
                        i5 = ((iM11306 ^ i3) * 8849) ^ 2036889540;
                        i6 = 331271795;
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0513 A[PHI: r3 r5 r23
      0x0513: PHI (r3v3 java.util.concurrent.atomic.AtomicBoolean) = 
      (r3v2 java.util.concurrent.atomic.AtomicBoolean)
      (r3v2 java.util.concurrent.atomic.AtomicBoolean)
      (r3v4 java.util.concurrent.atomic.AtomicBoolean)
     binds: [B:143:0x0511, B:131:0x04aa, B:116:0x03f6] A[DONT_GENERATE, DONT_INLINE]
      0x0513: PHI (r5v3 boolean) = (r5v2 boolean), (r5v2 boolean), (r5v4 boolean) binds: [B:143:0x0511, B:131:0x04aa, B:116:0x03f6] A[DONT_GENERATE, DONT_INLINE]
      0x0513: PHI (r23v20 int) = (r23v14 int), (r23v17 int), (r23v21 int) binds: [B:143:0x0511, B:131:0x04aa, B:116:0x03f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:153:0x0586 A[PHI: r4 r23
      0x0586: PHI (r4v20 java.util.concurrent.atomic.AtomicBoolean) = 
      (r4v2 java.util.concurrent.atomic.AtomicBoolean)
      (r4v5 java.util.concurrent.atomic.AtomicBoolean)
      (r4v6 java.util.concurrent.atomic.AtomicBoolean)
      (r4v21 java.util.concurrent.atomic.AtomicBoolean)
     binds: [B:152:0x0584, B:139:0x04ef, B:135:0x04cb, B:24:0x00db] A[DONT_GENERATE, DONT_INLINE]
      0x0586: PHI (r23v26 int) = (r23v12 int), (r23v15 int), (r23v16 int), (r23v27 int) binds: [B:152:0x0584, B:139:0x04ef, B:135:0x04cb, B:24:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
    
        if (l.C0817.f3443 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        r23 = r4;
        r4 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d9, code lost:
    
        if (l.C3577.f13150 >= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00db, code lost:
    
        r23 = r4;
        r4 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e8, code lost:
    
        if (l.C10634.f36300 >= 0) goto L20;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m12563(java.util.List r30, l.C17492 r31, java.util.concurrent.atomic.AtomicInteger r32, int r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC4514.m12563(java.util.List, l.ܿܿܰ, java.util.concurrent.atomic.AtomicInteger, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0124 A[PHI: r3 r5 r6 r9
      0x0124: PHI (r3v4 int) = (r3v3 int), (r3v2 int), (r3v2 int) binds: [B:33:0x0122, B:25:0x00b7, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:33:0x0122, B:25:0x00b7, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r6v8 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:33:0x0122, B:25:0x00b7, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r9v3 short[]) = (r9v2 short[]), (r9v2 short[]), (r9v5 short[]) binds: [B:33:0x0122, B:25:0x00b7, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x017f A[PHI: r2 r7 r15
      0x017f: PHI (r2v4 android.view.MenuInflater) = (r2v3 android.view.MenuInflater), (r2v2 android.view.MenuInflater), (r2v2 android.view.MenuInflater) binds: [B:41:0x017d, B:18:0x0094, B:15:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:41:0x017d, B:18:0x0094, B:15:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r15v4 short[]) = (r15v3 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:41:0x017d, B:18:0x0094, B:15:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x020f A[PHI: r8 r11 r12 r13
      0x020f: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:52:0x020d, B:37:0x0157, B:12:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x020f: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:52:0x020d, B:37:0x0157, B:12:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x020f: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:52:0x020d, B:37:0x0157, B:12:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x020f: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:52:0x020d, B:37:0x0157, B:12:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x028b A[PHI: r4 r16 r17 r18 r23
      0x028b: PHI (r4v5 java.lang.String) = 
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v8 java.lang.String)
     binds: [B:76:0x028b, B:65:0x0289, B:61:0x026e, B:58:0x0247, B:93:0x028b] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r16v6 short[]) = (r16v2 short[]), (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:76:0x028b, B:65:0x0289, B:61:0x026e, B:58:0x0247, B:93:0x028b] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r17v6 char) = (r17v2 char), (r17v2 char), (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:76:0x028b, B:65:0x0289, B:61:0x026e, B:58:0x0247, B:93:0x028b] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r18v12 short) = (r18v2 short), (r18v2 short), (r18v2 short), (r18v9 short), (r18v2 short) binds: [B:76:0x028b, B:65:0x0289, B:61:0x026e, B:58:0x0247, B:93:0x028b] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r23v8 int) = (r23v3 int), (r23v3 int), (r23v3 int), (r23v5 int), (r23v3 int) binds: [B:76:0x028b, B:65:0x0289, B:61:0x026e, B:58:0x0247, B:93:0x028b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int iM11306;
        int i;
        int i2;
        int iM11307;
        int i3;
        Menu menu2 = menu;
        int i4 = C2124.f7782;
        int i5 = C3577.f13150;
        int iM11308 = ThreadFactoryC3888.m11306("ۧܿ") ^ i5;
        int i6 = ((iM11308 ^ i4) * 29831) ^ (-305811852);
        String strM10571 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i7 = iM11308 ^ 20477296;
        MenuInflater menuInflater = null;
        int iM11309 = 0;
        int iM113010 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        char c = 0;
        short s = 0;
        int i15 = 185783343;
        int i16 = 0;
        while (true) {
            i15 = i7 ^ (i6 & (((i15 ^ i4) * 3469) >> 31));
            switch (i15) {
                case -2045523539:
                case 123214261:
                    C1025.m3861();
                    if (C1668.f6641 >= 0) {
                        iM11306 = C19806.m45029("ۖۗ") ^ i5;
                        i = ((iM11306 ^ i4) * (-11253)) ^ 206084102;
                        i2 = -464037129;
                    } else {
                        iM11306 = C19806.m45029("֨᩷") ^ i4;
                        i = ((iM11306 ^ i5) * 32247) ^ (-767283367);
                        i2 = 1833152184;
                    }
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    break;
                case -1854841963:
                case 1467201151:
                    strM10571 = C3577.m10571(sArr3, 507, 3, i14);
                    if (AbstractC0464.m2313() != 0) {
                        iM11307 = C19806.m45029("᩺ܽ") ^ i5;
                        i6 = ((iM11307 ^ i4) * (-18333)) ^ (-1665203592);
                        i3 = -665940699;
                        i7 = iM11307 ^ i3;
                        menu2 = menu;
                    } else {
                        int iM45029 = C19806.m45029("ۡ᩻") ^ i5;
                        i6 = ((iM45029 ^ i4) * 29155) ^ 895541195;
                        i7 = iM45029 ^ (-1612246742);
                    }
                    break;
                case -1703396482:
                case 1266243312:
                    if (C3286.m9798() > 0) {
                        iM11307 = C19806.m45029("᩺ܽ") ^ i5;
                        i6 = ((iM11307 ^ i4) * (-18333)) ^ (-1665203592);
                        i3 = -665940699;
                        i7 = iM11307 ^ i3;
                        menu2 = menu;
                    } else {
                        iM11306 = C19806.m45029("֨᩷") ^ i4;
                        i = ((iM11306 ^ i5) * 32247) ^ (-767283367);
                        i2 = 1833152184;
                        i7 = iM11306 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1678382565:
                case 1574348239:
                    sArr = f16037;
                    if (RunnableC1606.f6488 >= 0) {
                        iM11307 = C19806.m45029("᩺ܽ") ^ i5;
                        i6 = ((iM11307 ^ i4) * (-18333)) ^ (-1665203592);
                        i3 = -665940699;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("֡۫") + i5) * (-125);
                        i6 = ((iM11307 ^ i4) * 5459) ^ (-966817717);
                        i3 = -1749673520;
                    }
                    i7 = iM11307 ^ i3;
                    menu2 = menu;
                    break;
                case -1498143247:
                case -464842753:
                    this.f16046 = C2249.m6916(menu2, iM113010 ^ i8);
                    return true;
                case -1284549515:
                case 1509194840:
                    iM11309 = ThreadFactoryC3888.m11306(C1419.m4969(sArr2, i9, i10, i14));
                    if (C1189.f5284 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۧ") ^ i4;
                        i = ((iM11306 ^ i5) * 10829) ^ 1408351669;
                        i2 = -303865462;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۢۨ")) * (-23);
                        i = ((iM11306 ^ i5) * 18117) ^ (-1582210222);
                        i2 = 1398598227;
                    }
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    break;
                case -1103775684:
                case 1434605871:
                    i14 = 47424;
                    iM11306 = (i5 - C19806.m45029("ۚ᩹")) * 51;
                    i = ((iM11306 ^ i4) * (-18091)) ^ 625618705;
                    i2 = -39868519;
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    break;
                case -1027555226:
                case -794640908:
                    short s2 = sArr[c];
                    int i17 = s2 + 10083;
                    if (C0050.f912 <= 0) {
                        s = s2;
                        i16 = i17;
                        iM11307 = C19806.m45029("᩺ܽ") ^ i5;
                        i6 = ((iM11307 ^ i4) * (-18333)) ^ (-1665203592);
                        i3 = -665940699;
                        i7 = iM11307 ^ i3;
                    } else {
                        int iM450210 = (C19806.m45029("ۙۡ") ^ i5) * 101;
                        int i18 = ((iM450210 ^ i4) * (-4337)) ^ (-1168185183);
                        i7 = iM450210 ^ 721240414;
                        s = s2;
                        i16 = i17;
                        i6 = i18;
                    }
                    menu2 = menu;
                    break;
                case -902489708:
                case 450421116:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    iM11306 = C19806.m45029("ۖۗ") ^ i5;
                    i = ((iM11306 ^ i4) * (-11253)) ^ 206084102;
                    i2 = -464037129;
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    break;
                case -19394201:
                case 383069144:
                    c = 503;
                    if (RunnableC1895.f7152) {
                        iM11307 = ThreadFactoryC3888.m11306("᩻ۗ") ^ i4;
                        i6 = ((iM11307 ^ i5) * 15195) ^ 1038745502;
                        i3 = -1489371069;
                    } else {
                        iM11307 = C19806.m45029("᩺ܽ") ^ i5;
                        i6 = ((iM11307 ^ i4) * (-18333)) ^ (-1665203592);
                        i3 = -665940699;
                    }
                    i7 = iM11307 ^ i3;
                    menu2 = menu;
                    break;
                case 73700190:
                case 529116910:
                    i10 = 3;
                    if (C2642.m8171() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ܺ") + i5) * 75;
                        i = ((iM11306 ^ i4) * 31507) ^ (-1001671461);
                        i2 = -596559305;
                    } else {
                        iM11306 = (C19806.m45029("ܿۗ") ^ i5) * (-63);
                        i = ((iM11306 ^ i4) * 12435) ^ (-693722355);
                        i2 = -1097849293;
                    }
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    break;
                case 86686915:
                case 1284360302:
                    iM113010 = ThreadFactoryC3888.m11306(strM10571);
                    if (AbstractC0464.f2088 <= 0) {
                        i8 = 2127999026;
                        iM11306 = ThreadFactoryC3888.m11306("ۨۧ") ^ i4;
                        i = ((iM11306 ^ i5) * 10829) ^ 1408351669;
                        i2 = -303865462;
                        i7 = iM11306 ^ i2;
                        i6 = i;
                    } else {
                        int iM113011 = ThreadFactoryC3888.m11306("ۨܶ") ^ i4;
                        i6 = ((iM113011 ^ i5) * 13927) ^ (-468610604);
                        i7 = iM113011 ^ (-1815063366);
                        i8 = 2127999026;
                    }
                    break;
                case 396582640:
                case 2124071525:
                    C1977.m6356();
                    C0962.m3746();
                    return false;
                case 724240261:
                case 2138467383:
                    menuInflater = getMenuInflater();
                    sArr2 = f16037;
                    i9 = 504;
                    if (C3286.f12186) {
                        iM11306 = C19806.m45029("ۖۗ") ^ i5;
                        i = ((iM11306 ^ i4) * (-11253)) ^ 206084102;
                        i2 = -464037129;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ܽ") + i4) * 73;
                        i = ((iM11306 ^ i5) * 8851) ^ 1237547564;
                        i2 = 63759305;
                    }
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    break;
                case 971033817:
                case 2124957004:
                    i11 = i16 * i16;
                    i12 = s * s;
                    i13 = 101666889;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ۗ") ^ i4;
                        i = ((iM11306 ^ i5) * (-18489)) ^ (-556848918);
                        i2 = 393621716;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ܺ") + i5) * 75;
                        i = ((iM11306 ^ i4) * 31507) ^ (-1001671461);
                        i2 = -596559305;
                    }
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    break;
                case 1115747189:
                case 1146782268:
                    if (C2704.f10408) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ܺ") + i5) * 75;
                        i = ((iM11306 ^ i4) * 31507) ^ (-1001671461);
                        i2 = -596559305;
                    } else {
                        iM11306 = C19806.m45029("֨᩷") ^ i4;
                        i = ((iM11306 ^ i5) * 32247) ^ (-767283367);
                        i2 = 1833152184;
                    }
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    break;
                case 1238040715:
                case 1626246466:
                    int i19 = i12 + i13;
                    if (i11 - (i19 + i19) <= 0) {
                        iM11306 = C19806.m45029("ۘۛ") ^ i5;
                        i = ((iM11306 ^ i4) * (-17623)) ^ (-699587062);
                        i2 = -691916980;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ۡ") + i4) * (-55);
                        i = ((iM11306 ^ i5) * (-2593)) ^ 623081621;
                        i2 = 418160710;
                    }
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    break;
                case 1276098076:
                case 1444277893:
                    i14 = 46014;
                    iM11306 = (i5 - C19806.m45029("ۚ᩹")) * 51;
                    i = ((iM11306 ^ i4) * (-18091)) ^ 625618705;
                    i2 = -39868519;
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    break;
                default:
                    menuInflater.inflate(2130592951 ^ iM11309, menu2);
                    sArr3 = f16037;
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۧ") ^ i4;
                        i = ((iM11306 ^ i5) * 10829) ^ 1408351669;
                        i2 = -303865462;
                    } else {
                        iM11306 = C19806.m45029("᩸ۡ") ^ i4;
                        i = ((iM11306 ^ i5) * (-16339)) ^ (-28084617);
                        i2 = 552274717;
                    }
                    i7 = iM11306 ^ i2;
                    i6 = i;
                    break;
            }
        }
    }

    static {
        ApplicationC6132.m17119(69);
        f16037 = new short[]{2112, -19117, -19115, -19130, -19127, -19116, -19125, -19130, -19117, -19122, -19128, -19127, -19074, 1424, -32033, -21535, -23927, 3949, -2836, 13550, -205, -13498, -9132, -13008, -9860, -1488, -14550, -1996, 14540, -15779, -12707, -1045, 8857, -15996, -1712, -1453, 13039, 13219, -9464, 10149, 15346, -8261, -8930, -9040, -13915, -3325, -14612, -1818, 9701, -8553, -10882, -524, 14576, 13858, -483, 8257, -13216, 8622, 13339, -7992, -20545, -20592, -20582, -20596, -20591, -20585, -20582, -20527, -20582, -20577, -20598, -20577, -20527, 16161, 13934, -3970, 14462, -10279, -3135, -20514, -20529, -10538, -778, 13468, -20514, -20532, -2416, 8677, -3310, 14961, -1061, -3881, -11005, -11337, 10178, -2786, -1665, 8397, -186, 13615, 9002, 12240, -3718, -1508, -14641, -15560, 9919, -20581, -20577, -20581, -20595, -20600, -11307, -10567, -15930, 5830, 1738, 1788, 1782, 1786, 1787, 1723, 1775, 1788, 1765, 1723, 1765, 1787, 1778, 1723, 1762, 1776, 1783, 1765, 1738, 1788, 1782, 1786, 1787, 2330, 16974, 16896, 16911, 16901, 16915, 16910, 16904, 16901, 16958, 16901, 16896, 16917, 16896, 6905, 14258, 16368, -143, -773, 10456, -8581, -15542, 14490, 14919, -15121, 13667, 14615, -22788, -22803, -22801, -22809, -22803, -22805, -22807, -6048, -15635, 15460, -22803, -22814, -22808, -22786, -22813, -22811, -22808, -22878, -22811, -22814, -22792, -22807, -22814, -22792, -22878, -22803, -22801, -22792, -22811, -22813, -22814, -22878, -22840, -22839, -22848, -22839, -22824, -22839, 2984, 13321, 13378, 13383, 13394, 13383, 131, 26515, 26510, 26498, 26500, 26519, 26517, 26498, 26537, 26519, 26502, 26525, 26537, 26501, 26521, 26500, 26498, 26537, 26516, 26511, 26515, 26510, 26498, 26500, 26519, 26517, 26498, 26537, 26519, 26502, 26525, 26537, 26501, 26521, 26500, 26498, 26537, 26500, 26515, 26496, 26515, 26500, 26501, 26515, 861, 23128, 23134, 23117, 23106, 23135, 23104, 23117, 23128, 23109, 23107, 23106, 23157, 23117, 23104, 23132, 23108, 23117, 5443, 11955, 11950, 11938, 11940, 11959, 11957, 11938, 11913, 11959, 11942, 11965, 11913, 11942, 11959, 11938, 11966, 11959, 11942, 11965, 11941, 983, 23317, -31515, -27231, -30749, -28982, 29262, 6778, -20543, -20514, -20533, -20516, -20529, -20518, -20537, -20543, -20544, -20535, -20543, -20518, -20543, -20605, -20543, -20516, -20605, -20542, -20543, -20531, -20529, -20518, -20533, -20514, -20529, -20518, -20538, 195, -7652, -8324, -7819, 2078, 5969, 5952, 5954, 5962, 5952, 5958, 5956, 5952, 5967, 5957, 5971, 5966, 5960, 5957, 5903, 5960, 5967, 5973, 5956, 5967, 5973, 5903, 5952, 5954, 5973, 5960, 5966, 5967, 5903, 5989, 5988, 5997, 5988, 6005, 5988, 7023, 8679, 8698, 8694, 8688, 8675, 8673, 8694, 8669, 8675, 8690, 8681, 8669, 8690, 8675, 8694, 8694, 8679, 8688, 8684, 8697, 8643, 8703, 8669, 8697, 8660, 8703, 8620, 8675, 8690, 8681, 8697, 8643, 8703, 8697, 8658, 8703, 8697, 8660, 8703, 8697, 8641, 8703, 8665, 8632, 8670, 8670, 8621, 8616, 8637, 8638, 8636, 8608, 8702, 8671, 8669, 8670, 8689, 8610, 7517, 27462, -24454, -21190, -1565, -1565, -1565, 3152, -19196, -19121, -19126, -19105, -19126, 2115, 20181, 20095, -24735, 9506, -21438, 26628, -25540, 28489, 24850, -26843, -32454, 31397, -29090, -31584, -27957, 24730, -17737, 28798, -21943, 32228, -23200, 26329, -25131, -25601, -23952, 29465, -24215, -23370, 27993, -30229, -24066, 9636, 930, 10833, 9360, 3661, -16090, -14991, 12234, 8320, -11479, -9322, 11271, 15213, 8276, 15686, 9292, 1281, 9325, 2969, -9398, -16294, -8905, 10131, 9282, -10472, 1997, -15539, -10327, 4220, -11170, -10772, 6664, 13204, 13300, 11682, -13917, 10133, -4267, 816, -12254, 10317, 8775, -14619, -16371, 15828, 9614, -8888, 15775, 8312, 9593, -5208, -12443, -9462, -11480, 13784, 10020, 13171, -19549, -19522, -19534, -19532, -19545, -19547, -19534, -19559, -19545, -19530, -19539, -19559, -19531, -19543, -19532, -19534, -19559, -19532, -19549, -19536, -19549, -19532, -19531, -19549, -8727, -949, -10367, -19549, -19522, -19534, -19532, -19545, -19547, -19534, -19559, -19545, -19530, -19539, -19559, -19531, -19543, -19532, -19534, -19559, -19548, -19521, 10360, -15165, -5272, 11905, -6073, 8655, -5786, -5321, -9956, 15057, -13264, -11897, -10545, 9843, -7103, -19545, -19530, -19539, -19531, -19523, -19577, -19525, -19559, -19523, -19568, -19525, -19480, -19545, -19530, -19539, -19549, -19522, -19534, -19532, -19545, -19547, -19534, -19559, -19545, -19530, -19539, -19559, -19530, -19545, -19534, -19534, -19549, -19532, -19544, -19549, -19545, -19549, -19531, -19536, -14939, 8662, -15849, 10127, -7798, -8269, -19523, -19482, -19482, -19525, -13058, -7858, 10724, -9166, -12707, 13112, 6563, -31775, -31780, -31792, -31786, -31803, -31801, -31792, -31771, -31788, -31788, -31771, -31801, -31792, -31795, -31790, -31795, -31792, -31779};
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 400267786;
        int i6 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int i7 = RunnableC0195.f1321;
        int iM45029 = C19806.m45029("᩻۠") ^ i7;
        int i8 = ((iM45029 ^ i6) * 32659) ^ (-1661642005);
        int i9 = -303092740;
        while (true) {
            i5 = ((((i5 ^ i6) * 2251) >> 31) & i8) ^ (iM45029 ^ i9);
            switch (i5) {
                case -2008959000:
                case -1653573207:
                    if (C3577.f13150 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۙ") ^ i6) * 65;
                        i8 = ((iM45029 ^ i7) * 20225) ^ 1733715690;
                        i9 = 869127975;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ֨") + i7) * (-63);
                        i8 = ((iM45029 ^ i6) * (-21643)) ^ (-412316879);
                        i9 = 222955719;
                    }
                    break;
                case -1908456290:
                case -1456950523:
                    C3660.m10791();
                    iM45029 = (i7 - C19806.m45029("ܺۤ")) * (-99);
                    i8 = ((iM45029 ^ i6) * 2389) ^ (-853020275);
                    i9 = 299062022;
                    break;
                case -1856558075:
                case -1600911027:
                    if (C3660.f13403 >= 0) {
                        iM45029 = (i6 - C19806.m45029("ۡܳ")) * (-95);
                        i8 = ((iM45029 ^ i7) * (-15945)) ^ (-1776164774);
                        i9 = 921967594;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴ۠") + i6) * 39;
                        i8 = ((iM45029 ^ i7) * (-3735)) ^ 1181539204;
                        i9 = 1534996867;
                    }
                    break;
                case -1836604864:
                case -1250674333:
                    RunnableC3388.m10064();
                    throw new RuntimeException();
                case -1553968162:
                case -223861763:
                    if (C3660.m10791() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۙ") ^ i6) * 65;
                        i8 = ((iM45029 ^ i7) * 20225) ^ 1733715690;
                        i9 = 869127975;
                    } else {
                        iM45029 = (C19806.m45029("ᩴۖ") ^ i6) * (-43);
                        i8 = ((iM45029 ^ i7) * 3495) ^ 492006494;
                        i9 = -356113048;
                    }
                    break;
                case -1474906427:
                case 185007676:
                    f16036 = new int[]{i3, i4, 2, i, i2};
                    return;
                case -1152355400:
                case -1091226635:
                    if (C3286.f12186) {
                        iM45029 = (i6 - C19806.m45029("ۡܳ")) * (-95);
                        i8 = ((iM45029 ^ i7) * (-15945)) ^ (-1776164774);
                        i9 = 921967594;
                    } else {
                        iM45029 = (C19806.m45029("ۛ᩸") + i6) * (-9);
                        i8 = ((iM45029 ^ i7) * (-29497)) ^ 1981465664;
                        i9 = 1440385761;
                    }
                    break;
                case -582423939:
                case 623183239:
                    if (C2249.f8050 < 0) {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("᩶ۜ")) * 109;
                        i8 = ((iM45029 ^ i6) * 13465) ^ 340291444;
                        i9 = -852439647;
                    } else {
                        iM45029 = (i7 - C19806.m45029("ܺۤ")) * (-99);
                        i8 = ((iM45029 ^ i6) * 2389) ^ (-853020275);
                        i9 = 299062022;
                    }
                    break;
                case -496484002:
                case 1312409194:
                    i = 4;
                    i2 = 3;
                    if (C2871.f10837 >= 0) {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("᩶ۜ")) * 109;
                        i8 = ((iM45029 ^ i6) * 13465) ^ 340291444;
                        i9 = -852439647;
                    } else {
                        iM45029 = (C19806.m45029("᩷۫") ^ i6) * 7;
                        i8 = ((iM45029 ^ i7) * (-15589)) ^ (-949996841);
                        i9 = -2002253671;
                    }
                    break;
                case -491031996:
                case 1899592410:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("᩶ۜ")) * 109;
                        i8 = ((iM45029 ^ i6) * 13465) ^ 340291444;
                        i9 = -852439647;
                    } else {
                        iM45029 = (C19806.m45029("ܺ֫") ^ i7) * 71;
                        i8 = ((iM45029 ^ i6) * (-8947)) ^ (-450779104);
                        i9 = 809248020;
                    }
                    break;
                case -100688085:
                case 1933928239:
                    C1189.m4368();
                    if (C1398.m4895() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۙ") ^ i6) * 65;
                        i8 = ((iM45029 ^ i7) * 20225) ^ 1733715690;
                        i9 = 869127975;
                    } else {
                        iM45029 = C19806.m45029("ۙۗ") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-23255)) ^ (-193522060);
                        i9 = 1818432266;
                    }
                    break;
                case 60238347:
                case 631662115:
                    i4 = 1;
                    if (C2332.m7079() <= 0) {
                        iM45029 = (i6 - C19806.m45029("ۡܳ")) * (-95);
                        i8 = ((iM45029 ^ i7) * (-15945)) ^ (-1776164774);
                        i9 = 921967594;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚܳ") ^ i6;
                        i8 = ((iM45029 ^ i7) * 25119) ^ 1419121726;
                        i9 = -514809649;
                    }
                    break;
                case 120510761:
                case 1543066989:
                    if (CallableC1627.m5507() != 0) {
                        iM45029 = (i7 - C19806.m45029("ܺۤ")) * (-99);
                        i8 = ((iM45029 ^ i6) * 2389) ^ (-853020275);
                        i9 = 299062022;
                    } else {
                        iM45029 = (C19806.m45029("᩻۟") ^ i7) * 81;
                        i8 = ((iM45029 ^ i6) * 4095) ^ (-630710559);
                        i9 = 1817272191;
                    }
                    break;
                case 228384648:
                case 990236374:
                    if (C10634.f36300 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۙ") ^ i6) * 65;
                        i8 = ((iM45029 ^ i7) * 20225) ^ 1733715690;
                        i9 = 869127975;
                    } else {
                        iM45029 = (i7 - C19806.m45029("ܺۤ")) * (-99);
                        i8 = ((iM45029 ^ i6) * 2389) ^ (-853020275);
                        i9 = 299062022;
                    }
                    break;
                case 407727235:
                case 1075660474:
                    i3 = 0;
                    if (C1419.f5860 >= 0) {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("᩶ۜ")) * 109;
                        i8 = ((iM45029 ^ i6) * 13465) ^ 340291444;
                        i9 = -852439647;
                    } else {
                        iM45029 = C19806.m45029("ۗۗ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 25541) ^ (-2125221496);
                        i9 = -1606277448;
                    }
                    break;
                default:
                    if (C2477.m7593() >= 0) {
                        iM45029 = (i7 - C19806.m45029("ܺۤ")) * (-99);
                        i8 = ((iM45029 ^ i6) * 2389) ^ (-853020275);
                        i9 = 299062022;
                    } else {
                        iM45029 = (i7 - C19806.m45029("ܶ᩹")) * (-31);
                        i8 = ((iM45029 ^ i6) * (-5547)) ^ 593915127;
                        i9 = -1200718251;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0239 A[PHI: r11 r13 r14 r25
      0x0239: PHI (r11v4 l.֡ᩴۘ) = (r11v3 l.֡ᩴۘ), (r11v2 l.֡ᩴۘ), (r11v2 l.֡ᩴۘ), (r11v2 l.֡ᩴۘ) binds: [B:59:0x0223, B:55:0x01f5, B:44:0x0161, B:43:0x0159] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r13v4 l.֡ᩴۘ) = (r13v2 l.֡ᩴۘ), (r13v3 l.֡ᩴۘ), (r13v2 l.֡ᩴۘ), (r13v2 l.֡ᩴۘ) binds: [B:59:0x0223, B:55:0x01f5, B:44:0x0161, B:43:0x0159] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r14v33 l.֡ᩴۘ) = (r14v22 l.֡ᩴۘ), (r14v26 l.֡ᩴۘ), (r14v32 l.֡ᩴۘ), (r14v34 l.֡ᩴۘ) binds: [B:59:0x0223, B:55:0x01f5, B:44:0x0161, B:43:0x0159] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r25v41 l.۫ᩴۘ) = (r25v27 l.۫ᩴۘ), (r25v32 l.۫ᩴۘ), (r25v40 l.۫ᩴۘ), (r25v42 l.۫ᩴۘ) binds: [B:59:0x0223, B:55:0x01f5, B:44:0x0161, B:43:0x0159] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x006f, code lost:
    
        if (l.RunnableC1564.m5345() != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m12590() {
        /*
            Method dump skipped, instruction units count: 2076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC4514.m12590():boolean");
    }

    /* JADX WARN: Code duplicated, block: B:125:0x04eb A[PHI: r16 r18 r19 r26
      0x04eb: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:124:0x04e9, B:116:0x0499, B:112:0x0477] A[DONT_GENERATE, DONT_INLINE]
      0x04eb: PHI (r18v3 int) = (r18v2 int), (r18v2 int), (r18v4 int) binds: [B:124:0x04e9, B:116:0x0499, B:112:0x0477] A[DONT_GENERATE, DONT_INLINE]
      0x04eb: PHI (r19v4 short) = (r19v2 short), (r19v3 short), (r19v2 short) binds: [B:124:0x04e9, B:116:0x0499, B:112:0x0477] A[DONT_GENERATE, DONT_INLINE]
      0x04eb: PHI (r26v10 l.ۛۧ᩺) = (r26v7 l.ۛۧ᩺), (r26v9 l.ۛۧ᩺), (r26v11 l.ۛۧ᩺) binds: [B:124:0x04e9, B:116:0x0499, B:112:0x0477] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x0381 A[PHI: r10 r12 r15 r27
      0x0381: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:94:0x037f, B:54:0x01b6, B:17:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0381: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:94:0x037f, B:54:0x01b6, B:17:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0381: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:94:0x037f, B:54:0x01b6, B:17:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0381: PHI (r27v32 l.ۛۧ᩺) = (r27v22 l.ۛۧ᩺), (r27v3 l.ۛۧ᩺), (r27v3 l.ۛۧ᩺) binds: [B:94:0x037f, B:54:0x01b6, B:17:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
    
        if (l.C3743.f13569 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bf, code lost:
    
        if (l.C1066.f4915 <= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0077, code lost:
    
        if (l.C2124.f7782 <= 0) goto L30;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m12578(l.C8387 r28) {
        /*
            Method dump skipped, instruction units count: 1628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC4514.m12578(l.۠᩵ᩴ):void");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m12600(ViewOnClickListenerC4514 viewOnClickListenerC4514) {
        int i;
        int iM11306;
        int i2;
        int i3;
        short s;
        int iM45029;
        int i4;
        int i5;
        int iM11307;
        int i6;
        int iM450210;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ViewOnClickListenerC4514 viewOnClickListenerC4515 = viewOnClickListenerC4514;
        InterfaceC13722 interfaceC13722ListIterator = null;
        C3947 c3947 = null;
        C20164 c20164 = null;
        String strM5344 = null;
        Runnable runnable = null;
        C16819 c16819 = null;
        int iM450211 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1303728664;
        int i16 = C1419.f5860;
        int i17 = C10634.f36300;
        int iM11308 = ThreadFactoryC3888.m11306("᩹ܶ") ^ i17;
        int i18 = ((iM11308 ^ i16) * (-4791)) ^ 2092353246;
        int i19 = iM11308 ^ (-1470268140);
        C12586 c12586 = null;
        InterfaceC13722 interfaceC13722ListIterator2 = null;
        C16819 c168110 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i20 = 0;
        int i21 = 0;
        ArrayList arrayList = null;
        int i22 = 0;
        char c = 0;
        short s2 = 0;
        int i23 = 0;
        while (true) {
            i15 = i19 ^ (i18 & (((i15 ^ i16) * (-659)) >> 31));
            switch (i15) {
                case -1948402445:
                case 487322436:
                    iM450211 = C19806.m45029(C0671.m3009(sArr2, i20, i21, i22));
                    i13 = 2099466219;
                    if (!C0797.m3359()) {
                        c168110 = c168110;
                        int iM450212 = (C19806.m45029("ۛ۫") ^ i17) * (-43);
                        i19 = iM450212 ^ (-384598380);
                        i18 = ((iM450212 ^ i16) * 29963) ^ 1535384467;
                        c168110 = c168110;
                        arrayList = null;
                    } else {
                        iM11306 = C19806.m45029("᩷ۨ") ^ i16;
                        i2 = ((iM11306 ^ i17) * (-15221)) ^ (-845867884);
                        i3 = -72960762;
                        i19 = iM11306 ^ i3;
                        i18 = i2;
                    }
                    break;
                case -1946025759:
                case 431790117:
                    i20 = i20;
                    interfaceC13722ListIterator2 = c12586.f42057.f2562.listIterator(0);
                    i23 = 0;
                    int iM11309 = ThreadFactoryC3888.m11306("ۙۧ") ^ i16;
                    i7 = ((iM11309 ^ i17) * (-4259)) ^ (-1606381497);
                    i11 = iM11309 ^ (-1963456151);
                    i10 = i20;
                    i19 = i11;
                    i18 = i7;
                    i20 = i10;
                    break;
                case -1937825512:
                case -1763851818:
                    i20 = i20;
                    C16819 c168111 = (C16819) C0216.m1584(interfaceC13722ListIterator2);
                    if (!c168111.f53833) {
                        c168110 = c168111;
                        int iM113010 = ThreadFactoryC3888.m11306("ۙۧ") ^ i16;
                        i7 = ((iM113010 ^ i17) * (-4259)) ^ (-1606381497);
                        i11 = iM113010 ^ (-1963456151);
                        i10 = i20;
                        i19 = i11;
                        i18 = i7;
                        i20 = i10;
                    } else {
                        int iM113011 = ThreadFactoryC3888.m11306("ۡۨ") ^ i16;
                        int i24 = ((iM113011 ^ i17) * 11169) ^ (-1838152471);
                        i = iM113011 ^ (-938013608);
                        c168110 = c168111;
                        i18 = i24;
                        i10 = i20;
                        i19 = i;
                        i20 = i10;
                    }
                    break;
                case -1919200940:
                case 675030356:
                    i20 = i20;
                    c168110 = c168110;
                    s = s2;
                    if ((i14 + 7733961) - (s * 5562) < 0) {
                        iM45029 = (i16 - ThreadFactoryC3888.m11306("᩵ܽ")) * (-81);
                        i4 = ((iM45029 ^ i17) * 21449) ^ 503578306;
                        i5 = 1375439500;
                    } else {
                        iM45029 = (i17 - ThreadFactoryC3888.m11306("ۘۙ")) * (-53);
                        i4 = ((iM45029 ^ i16) * 13061) ^ (-1583629430);
                        i5 = -1441304502;
                    }
                    i12 = iM45029 ^ i5;
                    s2 = s;
                    i18 = i4;
                    c168110 = c168110;
                    i20 = i20;
                    i19 = i12;
                    viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    break;
                case -1677456723:
                case 1591103060:
                    c16819 = (C16819) C0278.m1776(interfaceC13722ListIterator);
                    if (!c16819.f53833) {
                        i9 = i23;
                        iM450210 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i16;
                        i23 = i9;
                        i7 = ((iM450210 ^ i17) * 20649) ^ (-1296659795);
                        i8 = -548285963;
                        i11 = iM450210 ^ i8;
                        c168110 = c168110;
                        i10 = i20;
                        i19 = i11;
                        i18 = i7;
                        i20 = i10;
                    } else {
                        iM11306 = C19806.m45029("ۚ᩻") ^ i17;
                        i2 = ((iM11306 ^ i16) * 3373) ^ 1188518565;
                        i3 = -1136810877;
                        i19 = iM11306 ^ i3;
                        i18 = i2;
                    }
                    break;
                case -1637046192:
                case 391821986:
                    i20 = i20;
                    s = s2;
                    c168110 = c168110;
                    sArr = f16037;
                    c = 427;
                    if (RunnableC1606.m5473() != 0) {
                        iM45029 = (C19806.m45029("ۛۘ") ^ i16) * 89;
                        i4 = ((iM45029 ^ i17) * 23005) ^ (-268329047);
                        i5 = -1779077750;
                    } else {
                        iM45029 = (i16 - C19806.m45029("᩷᩸")) * 19;
                        i4 = ((iM45029 ^ i17) * 16221) ^ 1815207404;
                        i5 = -928805844;
                    }
                    i12 = iM45029 ^ i5;
                    s2 = s;
                    i18 = i4;
                    c168110 = c168110;
                    i20 = i20;
                    i19 = i12;
                    viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    break;
                case -1577611698:
                case 1719012975:
                    c3947 = new C3947(viewOnClickListenerC4515);
                    c20164 = new C20164(viewOnClickListenerC4515);
                    if (C1148.f5161 > 0) {
                        iM11306 = C19806.m45029("ᩴۨ") ^ i16;
                        i2 = ((iM11306 ^ i17) * (-20275)) ^ (-5608816);
                        i3 = 609419911;
                        i19 = iM11306 ^ i3;
                        i18 = i2;
                    } else {
                        i20 = i20;
                        c168110 = c168110;
                        iM450210 = C19806.m45029("ۗ֨") ^ i16;
                        i7 = ((iM450210 ^ i17) * 11933) ^ (-1955173392);
                        i8 = -1035817890;
                        i11 = iM450210 ^ i8;
                        c168110 = c168110;
                        i10 = i20;
                        i19 = i11;
                        i18 = i7;
                        i20 = i10;
                    }
                    break;
                case -1474147863:
                case -659236177:
                    i9 = i23;
                    interfaceC13722ListIterator = viewOnClickListenerC4515.f16055.f42057.f2562.listIterator(i9);
                    iM450210 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i16;
                    i23 = i9;
                    i7 = ((iM450210 ^ i17) * 20649) ^ (-1296659795);
                    i8 = -548285963;
                    i11 = iM450210 ^ i8;
                    c168110 = c168110;
                    i10 = i20;
                    i19 = i11;
                    i18 = i7;
                    i20 = i10;
                    break;
                case -1422033044:
                case 1803000995:
                    c20164.mo5828(runnable);
                    c20164.m45600();
                    RunnableC0195.m1442(new C3391(viewOnClickListenerC4515, arrayList, c20164, c3947));
                    break;
                case -1054237132:
                case 1215765342:
                    c20164.m45588(strM5344);
                    runnable = null;
                    if (RunnableC3388.f12514 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ܰ") ^ i16;
                        i2 = ((iM11306 ^ i17) * 14945) ^ (-1372750906);
                        i3 = 2124303790;
                        i19 = iM11306 ^ i3;
                        i18 = i2;
                    } else {
                        c168110 = c168110;
                        int iM450213 = (C19806.m45029("ۛ۫") ^ i17) * (-43);
                        i19 = iM450213 ^ (-384598380);
                        i18 = ((iM450213 ^ i16) * 29963) ^ 1535384467;
                        c168110 = c168110;
                        arrayList = null;
                    }
                    break;
                case -1014996687:
                case -3985783:
                    i20 = i20;
                    c168110 = c168110;
                    viewOnClickListenerC4515.f16040 = -1;
                    if (AbstractC0464.f2088 > 0) {
                        arrayList = new ArrayList();
                        C12586 c12587 = viewOnClickListenerC4515.f16044;
                        if (!C1419.m4973()) {
                            int iM113012 = ThreadFactoryC3888.m11306("᩵ۗ") ^ i17;
                            int i25 = ((iM113012 ^ i16) * 7345) ^ (-1926162457);
                            i = iM113012 ^ 856016776;
                            c12586 = c12587;
                            c168110 = c168110;
                            i18 = i25;
                            viewOnClickListenerC4515 = viewOnClickListenerC4514;
                            i10 = i20;
                            i19 = i;
                            i20 = i10;
                        } else {
                            c12586 = c12587;
                            iM450210 = C19806.m45029("ۗ֨") ^ i16;
                            i7 = ((iM450210 ^ i17) * 11933) ^ (-1955173392);
                            i8 = -1035817890;
                            i11 = iM450210 ^ i8;
                            c168110 = c168110;
                            i10 = i20;
                            i19 = i11;
                            i18 = i7;
                            i20 = i10;
                        }
                    } else {
                        i20 = i20;
                        int iM450214 = (C19806.m45029("ۛ۫") ^ i17) * (-43);
                        i19 = iM450214 ^ (-384598380);
                        i18 = ((iM450214 ^ i16) * 29963) ^ 1535384467;
                        c168110 = c168110;
                        arrayList = null;
                    }
                    break;
                case -978440696:
                case 511166026:
                    strM5344 = RunnableC1564.m5344(f16037, 431, 3, i22);
                    if (C2124.f7782 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ۠") ^ i17) * (-51);
                        i2 = ((iM11306 ^ i16) * 31897) ^ 1483921271;
                        i3 = 856115051;
                        i19 = iM11306 ^ i3;
                        i18 = i2;
                    } else {
                        i20 = i20;
                        s = s2;
                        c168110 = c168110;
                        iM45029 = (C19806.m45029("ۛۘ") ^ i16) * 89;
                        i4 = ((iM45029 ^ i17) * 23005) ^ (-268329047);
                        i5 = -1779077750;
                        i12 = iM45029 ^ i5;
                        s2 = s;
                        i18 = i4;
                        c168110 = c168110;
                        i20 = i20;
                        i19 = i12;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    }
                    break;
                case -786669051:
                case 388510328:
                    C3286.m9798();
                    if (C0629.f2722 <= 0) {
                        iM11306 = (i17 - ThreadFactoryC3888.m11306("۫ۘ")) * (-21);
                        i2 = ((iM11306 ^ i16) * 31159) ^ 466236567;
                        i3 = 464807035;
                        i19 = iM11306 ^ i3;
                        i18 = i2;
                    } else {
                        i20 = i20;
                        c168110 = c168110;
                        iM450210 = C19806.m45029("ۗ֨") ^ i16;
                        i7 = ((iM450210 ^ i17) * 11933) ^ (-1955173392);
                        i8 = -1035817890;
                        i11 = iM450210 ^ i8;
                        c168110 = c168110;
                        i10 = i20;
                        i19 = i11;
                        i18 = i7;
                        i20 = i10;
                    }
                    break;
                case -739412854:
                case -567122620:
                    i22 = 63949;
                    iM11307 = (C19806.m45029("ᩳۤ") + i16) * 43;
                    i18 = ((iM11307 ^ i17) * (-13771)) ^ 1994077602;
                    i6 = 569121192;
                    i12 = iM11307 ^ i6;
                    c168110 = c168110;
                    i20 = i20;
                    i19 = i12;
                    viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    break;
                case -283714837:
                case 302142839:
                    i20 = i20;
                    c168110 = c168110;
                    s2 = sArr[c];
                    i14 = s2 * s2;
                    if (C1025.f4800 >= 0) {
                        iM11307 = C19806.m45029("ᩴܶ") ^ i16;
                        i18 = ((iM11307 ^ i17) * 12591) ^ 1547659002;
                        i6 = -924413186;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ᩳۜ") ^ i17;
                        i18 = ((iM11307 ^ i16) * (-20149)) ^ (-744404920);
                        i6 = 849123318;
                    }
                    i12 = iM11307 ^ i6;
                    c168110 = c168110;
                    i20 = i20;
                    i19 = i12;
                    viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    break;
                case -235917047:
                case -114052616:
                    sArr2 = f16037;
                    i20 = 428;
                    i21 = 3;
                    if (RunnableC3388.f12514 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۨ") ^ i17;
                        i2 = ((iM11306 ^ i16) * (-8413)) ^ (-123850324);
                        i3 = -1576015209;
                        i19 = iM11306 ^ i3;
                        i18 = i2;
                    } else {
                        c168110 = c168110;
                        int iM450215 = (C19806.m45029("ۛ۫") ^ i17) * (-43);
                        i19 = iM450215 ^ (-384598380);
                        i18 = ((iM450215 ^ i16) * 29963) ^ 1535384467;
                        c168110 = c168110;
                        arrayList = null;
                    }
                    break;
                case -231341567:
                case 491102406:
                    if (!C19806.f63586) {
                        i20 = i20;
                        s = s2;
                        c168110 = c168110;
                        iM45029 = (C19806.m45029("ۛۘ") ^ i16) * 89;
                        i4 = ((iM45029 ^ i17) * 23005) ^ (-268329047);
                        i5 = -1779077750;
                        i12 = iM45029 ^ i5;
                        s2 = s;
                        i18 = i4;
                        c168110 = c168110;
                        i20 = i20;
                        i19 = i12;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    } else {
                        i20 = i20;
                        c168110 = c168110;
                        iM450210 = C19806.m45029("ۗ֨") ^ i16;
                        i7 = ((iM450210 ^ i17) * 11933) ^ (-1955173392);
                        i8 = -1035817890;
                        i11 = iM450210 ^ i8;
                        c168110 = c168110;
                        i10 = i20;
                        i19 = i11;
                        i18 = i7;
                        i20 = i10;
                    }
                    break;
                case 54113801:
                case 1370158492:
                    C3660.m10788(arrayList, c16819);
                    i9 = i23;
                    iM450210 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i16;
                    i23 = i9;
                    i7 = ((iM450210 ^ i17) * 20649) ^ (-1296659795);
                    i8 = -548285963;
                    i11 = iM450210 ^ i8;
                    c168110 = c168110;
                    i10 = i20;
                    i19 = i11;
                    i18 = i7;
                    i20 = i10;
                    break;
                case 56496355:
                case 1737905663:
                    C1875.m6086();
                    C0797.m3359();
                    i20 = i20;
                    c168110 = c168110;
                    iM450210 = C19806.m45029("ۗ֨") ^ i16;
                    i7 = ((iM450210 ^ i17) * 11933) ^ (-1955173392);
                    i8 = -1035817890;
                    i11 = iM450210 ^ i8;
                    c168110 = c168110;
                    i10 = i20;
                    i19 = i11;
                    i18 = i7;
                    i20 = i10;
                    break;
                case 183690181:
                case 1627898747:
                    c168110 = c168110;
                    if (RunnableC1564.m5348(interfaceC13722ListIterator)) {
                        iM450210 = (ThreadFactoryC3888.m11306("᩸ۧ") ^ i16) * 83;
                        i20 = i20;
                        i7 = ((iM450210 ^ i17) * 18835) ^ (-895080747);
                        i8 = 490697371;
                    } else {
                        i20 = i20;
                        iM450210 = ThreadFactoryC3888.m11306("۫᩹") ^ i17;
                        i7 = ((iM450210 ^ i16) * (-2485)) ^ 307252116;
                        i8 = -646839574;
                    }
                    i11 = iM450210 ^ i8;
                    c168110 = c168110;
                    i10 = i20;
                    i19 = i11;
                    i18 = i7;
                    i20 = i10;
                    break;
                case 400718997:
                case 2048919877:
                    C2249.m6915();
                    break;
                case 498587909:
                case 737026330:
                    C3660.m10788(arrayList, c168110);
                    i20 = i20;
                    int iM113013 = ThreadFactoryC3888.m11306("ۙۧ") ^ i16;
                    i7 = ((iM113013 ^ i17) * (-4259)) ^ (-1606381497);
                    i11 = iM113013 ^ (-1963456151);
                    i10 = i20;
                    i19 = i11;
                    i18 = i7;
                    i20 = i10;
                    break;
                case 696964761:
                case 1599658813:
                    i20 = i20;
                    c168110 = c168110;
                    if (RunnableC1564.m5348(interfaceC13722ListIterator2)) {
                        iM450210 = C19806.m45029("᩸ܿ") ^ i17;
                        i7 = ((iM450210 ^ i16) * (-9225)) ^ (-1113505100);
                        i8 = 702154362;
                    } else {
                        iM450210 = (i17 - C19806.m45029("ܿۜ")) * (-99);
                        i7 = ((iM450210 ^ i16) * 30703) ^ 651189234;
                        i8 = -1991660001;
                    }
                    i11 = iM450210 ^ i8;
                    c168110 = c168110;
                    i10 = i20;
                    i19 = i11;
                    i18 = i7;
                    i20 = i10;
                    break;
                case 772114221:
                case 2002087801:
                    c20164.m45586(iM450211 ^ i13);
                    if (!C1377.f5749) {
                        i20 = i20;
                        c168110 = c168110;
                        iM11307 = C19806.m45029("ᩴܶ") ^ i16;
                        i18 = ((iM11307 ^ i17) * 12591) ^ 1547659002;
                        i6 = -924413186;
                        i12 = iM11307 ^ i6;
                        c168110 = c168110;
                        i20 = i20;
                        i19 = i12;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    } else {
                        iM11306 = C19806.m45029("᩷᩶") ^ i17;
                        i2 = ((iM11306 ^ i16) * 28963) ^ 1158509416;
                        i3 = 2057936060;
                        i19 = iM11306 ^ i3;
                        i18 = i2;
                    }
                    break;
                case 949569218:
                case 1364030477:
                    i22 = 41309;
                    iM11307 = (C19806.m45029("ᩳۤ") + i16) * 43;
                    i18 = ((iM11307 ^ i17) * (-13771)) ^ 1994077602;
                    i6 = 569121192;
                    i12 = iM11307 ^ i6;
                    c168110 = c168110;
                    i20 = i20;
                    i19 = i12;
                    viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    break;
                default:
                    if (!C0526.f2219) {
                        c168110 = c168110;
                        int iM450216 = (C19806.m45029("ۛ۫") ^ i17) * (-43);
                        i19 = iM450216 ^ (-384598380);
                        i18 = ((iM450216 ^ i16) * 29963) ^ 1535384467;
                        c168110 = c168110;
                        arrayList = null;
                    } else {
                        i20 = i20;
                        c168110 = c168110;
                        iM450210 = C19806.m45029("ۗ֨") ^ i16;
                        i7 = ((iM450210 ^ i17) * 11933) ^ (-1955173392);
                        i8 = -1035817890;
                        i11 = iM450210 ^ i8;
                        c168110 = c168110;
                        i10 = i20;
                        i19 = i11;
                        i18 = i7;
                        i20 = i10;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x024b A[PHI: r4 r5 r9 r10 r16
      0x024b: PHI (r4v4 short[]) = (r4v3 short[]), (r4v2 short[]), (r4v2 short[]) binds: [B:67:0x0249, B:63:0x0227, B:31:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short) binds: [B:67:0x0249, B:63:0x0227, B:31:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r9v3 short[]) = (r9v2 short[]), (r9v2 short[]), (r9v4 short[]) binds: [B:67:0x0249, B:63:0x0227, B:31:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v4 int) binds: [B:67:0x0249, B:63:0x0227, B:31:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r16v18 l.ᩳ᩷ۚ) = (r16v5 l.ᩳ᩷ۚ), (r16v6 l.ᩳ᩷ۚ), (r16v21 l.ᩳ᩷ۚ) binds: [B:67:0x0249, B:63:0x0227, B:31:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0281 A[PHI: r6 r7 r16
      0x0281: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:71:0x027f, B:59:0x0202, B:12:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:71:0x027f, B:59:0x0202, B:12:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r16v26 l.ᩳ᩷ۚ) = (r16v4 l.ᩳ᩷ۚ), (r16v7 l.ᩳ᩷ۚ), (r16v27 l.ᩳ᩷ۚ) binds: [B:71:0x027f, B:59:0x0202, B:12:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        if (l.C3660.f13403 < 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        if (l.C10634.f36300 < 0) goto L11;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m12603(l.ViewOnClickListenerC4514 r18, l.C16819 r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC4514.m12603(l.ۙ۠ۘ, l.ܽᩴۘ, java.lang.String):void");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m12599(C16819 c16819) {
        String strM8249;
        String str;
        short[] sArr;
        PackageInfo packageInfo;
        int i;
        String str2;
        int iM11306;
        int i2;
        String str3;
        String str4;
        String str5;
        PackageInfo packageInfo2;
        int i3;
        int iM45029;
        int i4;
        PackageInfo packageInfo3;
        String str6;
        String str7;
        short[] sArr2;
        String str8;
        PackageInfo packageInfo4;
        int i5;
        short[] sArr3;
        String str9;
        String str10;
        String strM82410;
        int iM11307;
        String str11;
        int i6;
        int i7;
        String str12;
        String str13;
        short[] sArr4;
        String str14;
        PackageInfo packageInfo5;
        String str15;
        String str16;
        int i8;
        int iM11308;
        int i9;
        int i10;
        int i11 = -1610061514;
        int i12 = C2871.f10837;
        int i13 = C2642.f10294;
        int iM11309 = (ThreadFactoryC3888.m11306("ܿ۫") + i12) * (-31);
        int i14 = ((iM11309 ^ i13) * 9133) ^ (-2113577142);
        int i15 = iM11309 ^ 1634152576;
        String strM2424 = null;
        String strValueOf = null;
        String strM82411 = null;
        String strM7078 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        int i16 = 0;
        short s = 0;
        int i17 = 0;
        String strM7076 = null;
        String str17 = null;
        String str18 = null;
        String strM6684 = null;
        String strM8164 = null;
        String strM9788 = null;
        short[] sArr8 = null;
        int i18 = 0;
        InterfaceC6025 interfaceC6025 = null;
        String str19 = null;
        String strM3406 = null;
        short[] sArr9 = null;
        int i19 = 0;
        PackageInfo packageInfo6 = null;
        int i20 = 0;
        String strM82412 = null;
        short[] sArr10 = null;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * (-15983)) >> 31));
            switch (i11) {
                case -1995478935:
                case 1744120977:
                    RunnableC1606.m5473();
                    return null;
                case -1912356364:
                case 1840642671:
                    str3 = str17;
                    str18 = str18;
                    strM82412 = strM82412;
                    sArr7 = sArr7;
                    str4 = strM7078;
                    str5 = strValueOf;
                    packageInfo2 = packageInfo6;
                    i3 = i16;
                    interfaceC6025 = ApplicationC0716.f2992;
                    strM2424 = C0526.m2424(f16037, 369, 19, i18);
                    sArr5 = f16037;
                    if (C2249.f8050 >= 0) {
                        iM45029 = C19806.m45029("ۙܽ") ^ i13;
                        i14 = ((iM45029 ^ i12) * 7531) ^ (-1199687225);
                        i4 = -1612242405;
                    } else {
                        iM45029 = (C19806.m45029("᩵ܳ") ^ i12) * 31;
                        i14 = ((iM45029 ^ i13) * 13471) ^ 1302138083;
                        i4 = -1921993238;
                    }
                    i15 = iM45029 ^ i4;
                    strM7078 = str4;
                    i16 = i3;
                    str17 = str3;
                    packageInfo6 = packageInfo2;
                    strValueOf = str5;
                    sArr7 = sArr7;
                    strM82412 = strM82412;
                    str18 = str18;
                    break;
                case -1769997180:
                case -194591249:
                    PackageInfo packageInfo7 = packageInfo6;
                    strM6684 = C2124.m6684(packageInfo7.versionCode);
                    sArr10 = f16037;
                    i20 = 3;
                    if (C19806.f63586) {
                        str12 = str17;
                        i8 = 408;
                        str13 = strM7078;
                        String str20 = strValueOf;
                        packageInfo5 = packageInfo7;
                        str16 = str18;
                        str15 = strM82412;
                        sArr4 = sArr7;
                        str14 = str20;
                        int iM113010 = (ThreadFactoryC3888.m11306("᩷ۛ") ^ i13) * 61;
                        int i21 = i8;
                        int i22 = ((iM113010 ^ i12) * (-12573)) ^ 795217261;
                        i15 = iM113010 ^ 1728648094;
                        strM7078 = str13;
                        str17 = str12;
                        String str21 = str16;
                        i14 = i22;
                        i16 = i21;
                        packageInfo6 = packageInfo5;
                        strValueOf = str14;
                        sArr7 = sArr4;
                        strM82412 = str15;
                        str18 = str21;
                    } else {
                        int iM113011 = (ThreadFactoryC3888.m11306("ۧ᩺") ^ i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i15 = iM113011 ^ 1916162230;
                        packageInfo6 = packageInfo7;
                        i14 = ((iM113011 ^ i13) * 4897) ^ (-20101402);
                        i16 = 408;
                    }
                    break;
                case -1736312005:
                case 918296375:
                    strM9788 = C3286.m9788(f16037, 424, 2, i18);
                    sArr8 = f16037;
                    iM11308 = ThreadFactoryC3888.m11306("ۖۗ") ^ i13;
                    i9 = ((iM11308 ^ i12) * (-19023)) ^ (-285844070);
                    i10 = -75521674;
                    i15 = iM11308 ^ i10;
                    i14 = i9;
                    break;
                case -1581666164:
                case 1427624956:
                    str6 = strM7078;
                    String str22 = str18;
                    str7 = strM82412;
                    sArr2 = sArr7;
                    str8 = strValueOf;
                    packageInfo4 = packageInfo6;
                    i5 = i16;
                    sArr3 = sArr6;
                    str9 = str22;
                    str10 = strM7076;
                    strM82410 = C2704.m8249(str10, RunnableC1564.m5344(sArr3, 399, 3, i18), c16819.m39459());
                    if (C3660.f13403 >= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("۠ܽ") ^ i13;
                        str11 = strM82410;
                        i6 = ((iM11307 ^ i12) * (-25081)) ^ (-1672187261);
                        i7 = -372120630;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ܶ᩷") ^ i13) * 83;
                        str11 = strM82410;
                        i6 = ((iM11307 ^ i12) * 13377) ^ (-1467423490);
                        i7 = -773434689;
                    }
                    i15 = iM11307 ^ i7;
                    i14 = i6;
                    sArr6 = sArr3;
                    i16 = i5;
                    packageInfo6 = packageInfo4;
                    strValueOf = str8;
                    sArr7 = sArr2;
                    strM82412 = str7;
                    str18 = str9;
                    String str23 = str11;
                    strM7076 = str10;
                    strM7078 = str6;
                    str17 = str23;
                    break;
                case -1575925526:
                case -1400107830:
                    i16 = i16;
                    str17 = str17;
                    strM7078 = strM7078;
                    String str24 = str18;
                    strM82412 = C2704.m8249(str17, str24, c16819.f53838);
                    packageInfo3 = c16819.f53841;
                    strValueOf = String.valueOf(packageInfo3.versionName);
                    sArr7 = f16037;
                    if (C1148.f5161 <= 0) {
                        str18 = str24;
                        strM2424 = strM2424;
                        interfaceC6025 = interfaceC6025;
                        int iM450210 = C19806.m45029("ۘܶ") ^ i12;
                        PackageInfo packageInfo8 = packageInfo3;
                        i14 = ((iM450210 ^ i13) * (-8747)) ^ 2147073264;
                        i15 = iM450210 ^ (-721033917);
                        i16 = i16;
                        str18 = str18;
                        packageInfo6 = packageInfo8;
                        interfaceC6025 = interfaceC6025;
                        strM2424 = strM2424;
                    } else {
                        int iM450211 = (C19806.m45029("۠᩷") + i12) * 79;
                        i14 = ((iM450211 ^ i13) * 10929) ^ 1863039256;
                        i15 = iM450211 ^ (-432992629);
                        i16 = i16;
                        packageInfo6 = packageInfo3;
                        str18 = str24;
                    }
                    strM7078 = strM7078;
                    str17 = str17;
                    break;
                case -1427847447:
                case 904263879:
                    i18 = 50895;
                    iM11306 = C19806.m45029("᩸ۙ") ^ i13;
                    i14 = ((iM11306 ^ i12) * 18285) ^ 656042000;
                    i2 = -1852079953;
                    i15 = iM11306 ^ i2;
                    interfaceC6025 = interfaceC6025;
                    i16 = i16;
                    strM2424 = strM2424;
                    strM7078 = strM7078;
                    packageInfo6 = packageInfo6;
                    strValueOf = strValueOf;
                    str17 = str17;
                    sArr7 = sArr7;
                    strM82412 = strM82412;
                    str18 = str18;
                    break;
                case -1406427864:
                case 901154712:
                    str17 = str17;
                    str18 = str18;
                    strM82412 = strM82412;
                    sArr7 = sArr7;
                    strM7078 = strM7078;
                    strM2424 = strM2424;
                    strValueOf = strValueOf;
                    packageInfo6 = packageInfo6;
                    i16 = i16;
                    interfaceC6025 = interfaceC6025;
                    s = f16037[368];
                    i17 = s + 1;
                    if (!C0526.f2219) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺ᩸") + i12) * 49;
                        i14 = ((iM11306 ^ i13) * (-10483)) ^ 2116235543;
                        i2 = 631964366;
                        i15 = iM11306 ^ i2;
                        interfaceC6025 = interfaceC6025;
                        i16 = i16;
                        strM2424 = strM2424;
                        strM7078 = strM7078;
                        packageInfo6 = packageInfo6;
                        strValueOf = strValueOf;
                        str17 = str17;
                        sArr7 = sArr7;
                        strM82412 = strM82412;
                        str18 = str18;
                    } else {
                        packageInfo3 = packageInfo6;
                        strValueOf = strValueOf;
                        sArr7 = sArr7;
                        strM82412 = strM82412;
                        int iM450212 = C19806.m45029("ۘܶ") ^ i12;
                        PackageInfo packageInfo9 = packageInfo3;
                        i14 = ((iM450212 ^ i13) * (-8747)) ^ 2147073264;
                        i15 = iM450212 ^ (-721033917);
                        i16 = i16;
                        str18 = str18;
                        packageInfo6 = packageInfo9;
                        interfaceC6025 = interfaceC6025;
                        strM2424 = strM2424;
                        strM7078 = strM7078;
                        str17 = str17;
                    }
                    break;
                case -1391611061:
                case 637707652:
                    str17 = str17;
                    str18 = str18;
                    strM82412 = strM82412;
                    sArr7 = sArr7;
                    strM7078 = strM7078;
                    strValueOf = strValueOf;
                    packageInfo6 = packageInfo6;
                    i16 = i16;
                    short[] sArr11 = sArr5;
                    String strM8640 = C2871.m8640(sArr11, 388, 11, i18);
                    InterfaceC6025 interfaceC6026 = interfaceC6025;
                    strM2424 = strM2424;
                    strM7076 = C2332.m7076(interfaceC6026, strM2424, strM8640);
                    sArr6 = f16037;
                    if (C1025.f4800 < 0) {
                        int iM450213 = C19806.m45029("ۛ᩵") ^ i13;
                        interfaceC6025 = interfaceC6026;
                        i14 = ((iM450213 ^ i12) * (-9253)) ^ 607945844;
                        i15 = iM450213 ^ (-1105058740);
                        sArr5 = sArr11;
                        interfaceC6025 = interfaceC6025;
                        i16 = i16;
                        strM2424 = strM2424;
                        strM7078 = strM7078;
                        packageInfo6 = packageInfo6;
                        strValueOf = strValueOf;
                        str17 = str17;
                        sArr7 = sArr7;
                        strM82412 = strM82412;
                        str18 = str18;
                    } else {
                        interfaceC6025 = interfaceC6026;
                        sArr5 = sArr11;
                        packageInfo3 = packageInfo6;
                        strValueOf = strValueOf;
                        sArr7 = sArr7;
                        strM82412 = strM82412;
                        int iM450214 = C19806.m45029("ۘܶ") ^ i12;
                        PackageInfo packageInfo10 = packageInfo3;
                        i14 = ((iM450214 ^ i13) * (-8747)) ^ 2147073264;
                        i15 = iM450214 ^ (-721033917);
                        i16 = i16;
                        str18 = str18;
                        packageInfo6 = packageInfo10;
                        interfaceC6025 = interfaceC6025;
                        strM2424 = strM2424;
                        strM7078 = strM7078;
                        str17 = str17;
                    }
                    break;
                case -1218590700:
                case -1050436703:
                    i18 = 8578;
                    iM11306 = C19806.m45029("᩸ۙ") ^ i13;
                    i14 = ((iM11306 ^ i12) * 18285) ^ 656042000;
                    i2 = -1852079953;
                    i15 = iM11306 ^ i2;
                    interfaceC6025 = interfaceC6025;
                    i16 = i16;
                    strM2424 = strM2424;
                    strM7078 = strM7078;
                    packageInfo6 = packageInfo6;
                    strValueOf = strValueOf;
                    str17 = str17;
                    sArr7 = sArr7;
                    strM82412 = strM82412;
                    str18 = str18;
                    break;
                case -1172181443:
                case 2136134922:
                    strM82411 = C2704.m8249(str19, C3660.m10790(sArr10, i16, i20, i18), strM6684);
                    i19 = 200;
                    if (C1977.m6360(strM82411) > 200) {
                        iM11308 = (ThreadFactoryC3888.m11306("ۛۗ") ^ i12) * (-123);
                        i9 = ((iM11308 ^ i13) * 9179) ^ 1787757802;
                        i10 = 1002170350;
                    } else {
                        strM8164 = strM82411;
                        iM11308 = ThreadFactoryC3888.m11306("᩹᩹") ^ i13;
                        i9 = ((iM11308 ^ i12) * 14033) ^ 1466394305;
                        i10 = -542006972;
                    }
                    i15 = iM11308 ^ i10;
                    i14 = i9;
                    break;
                case -1071016866:
                case 489621481:
                    strM3406 = C0817.m3406(f16037, 411, 12, i18);
                    sArr9 = f16037;
                    if (C1460.m5050() == 0) {
                        iM11308 = ThreadFactoryC3888.m11306("֨ۧ") ^ i12;
                        i9 = ((iM11308 ^ i13) * (-30989)) ^ 1008772354;
                        i10 = 2088225449;
                        i15 = iM11308 ^ i10;
                        i14 = i9;
                    } else {
                        str17 = str17;
                        str18 = str18;
                        packageInfo3 = packageInfo6;
                        i16 = i16;
                        strM7078 = strM7078;
                        strM2424 = strM2424;
                        interfaceC6025 = interfaceC6025;
                        int iM450215 = C19806.m45029("ۘܶ") ^ i12;
                        PackageInfo packageInfo11 = packageInfo3;
                        i14 = ((iM450215 ^ i13) * (-8747)) ^ 2147073264;
                        i15 = iM450215 ^ (-721033917);
                        i16 = i16;
                        str18 = str18;
                        packageInfo6 = packageInfo11;
                        interfaceC6025 = interfaceC6025;
                        strM2424 = strM2424;
                        strM7078 = strM7078;
                        str17 = str17;
                    }
                    break;
                case -940492525:
                case -829985254:
                    strM7078 = C2332.m7078(strM8164, strM3406, C3286.m9788(sArr9, 423, 1, i18));
                    if (C2788.m8472() == 0) {
                        iM11308 = (i13 - ThreadFactoryC3888.m11306("᩻ۢ")) * (-115);
                        i9 = ((iM11308 ^ i12) * 4249) ^ (-1262813457);
                        i10 = -131603104;
                        i15 = iM11308 ^ i10;
                        i14 = i9;
                    } else {
                        str9 = str18;
                        str7 = strM82412;
                        sArr2 = sArr7;
                        sArr3 = sArr6;
                        str8 = strValueOf;
                        packageInfo4 = packageInfo6;
                        i5 = i16;
                        strM82410 = str17;
                        str6 = strM7078;
                        str10 = strM7076;
                        iM11307 = ThreadFactoryC3888.m11306("۠ܽ") ^ i13;
                        str11 = strM82410;
                        i6 = ((iM11307 ^ i12) * (-25081)) ^ (-1672187261);
                        i7 = -372120630;
                        i15 = iM11307 ^ i7;
                        i14 = i6;
                        sArr6 = sArr3;
                        i16 = i5;
                        packageInfo6 = packageInfo4;
                        strValueOf = str8;
                        sArr7 = sArr2;
                        strM82412 = str7;
                        str18 = str9;
                        String str25 = str11;
                        strM7076 = str10;
                        strM7078 = str6;
                        str17 = str25;
                    }
                    break;
                case -563173818:
                case 2027388313:
                    packageInfo = packageInfo6;
                    i = i16;
                    short[] sArr12 = sArr7;
                    String strM6164 = RunnableC1895.m6164(sArr12, 405, 3, i18);
                    str = strM82412;
                    sArr = sArr12;
                    str2 = strValueOf;
                    strM8249 = C2704.m8249(str, strM6164, str2);
                    if (C2704.f10408) {
                        int iM113012 = ThreadFactoryC3888.m11306("ܰ᩸") ^ i13;
                        i14 = ((iM113012 ^ i12) * (-13745)) ^ (-1317060599);
                        i15 = iM113012 ^ (-1981513738);
                        i16 = i;
                        packageInfo6 = packageInfo;
                        strValueOf = str2;
                        sArr7 = sArr;
                        strM82412 = str;
                        str19 = strM8249;
                    } else {
                        int iM450216 = (C19806.m45029("ۜܶ") + i12) * 21;
                        String str26 = str2;
                        int i23 = ((iM450216 ^ i13) * (-11811)) ^ 948994340;
                        i15 = iM450216 ^ 1518976211;
                        strValueOf = str26;
                        sArr7 = sArr;
                        strM82412 = str;
                        str19 = strM8249;
                        PackageInfo packageInfo12 = packageInfo;
                        i14 = i23;
                        i16 = i;
                        packageInfo6 = packageInfo12;
                    }
                    break;
                case -531724136:
                case 130712747:
                    C2477.m7593();
                    if (C1398.f5802 > 0) {
                        str3 = str17;
                        str18 = str18;
                        strM82412 = strM82412;
                        sArr7 = sArr7;
                        str4 = strM7078;
                        str5 = strValueOf;
                        packageInfo2 = packageInfo6;
                        i3 = i16;
                        iM45029 = C19806.m45029("ۙܽ") ^ i13;
                        i14 = ((iM45029 ^ i12) * 7531) ^ (-1199687225);
                        i4 = -1612242405;
                        i15 = iM45029 ^ i4;
                        strM7078 = str4;
                        i16 = i3;
                        str17 = str3;
                        packageInfo6 = packageInfo2;
                        strValueOf = str5;
                        sArr7 = sArr7;
                        strM82412 = strM82412;
                        str18 = str18;
                    } else {
                        str17 = str17;
                        str18 = str18;
                        packageInfo3 = packageInfo6;
                        i16 = i16;
                        strM7078 = strM7078;
                        strM2424 = strM2424;
                        interfaceC6025 = interfaceC6025;
                        int iM450217 = C19806.m45029("ۘܶ") ^ i12;
                        PackageInfo packageInfo13 = packageInfo3;
                        i14 = ((iM450217 ^ i13) * (-8747)) ^ 2147073264;
                        i15 = iM450217 ^ (-721033917);
                        i16 = i16;
                        str18 = str18;
                        packageInfo6 = packageInfo13;
                        interfaceC6025 = interfaceC6025;
                        strM2424 = strM2424;
                        strM7078 = strM7078;
                        str17 = str17;
                    }
                    break;
                case -454819443:
                case 1346362192:
                    return RunnableC0195.m1437(strM7078, strM9788, ThreadFactoryC3888.m11312(sArr8, 426, 1, i18));
                case -391001277:
                case -162904659:
                    C10634.m26820();
                    str17 = str17;
                    str18 = str18;
                    packageInfo3 = packageInfo6;
                    i16 = i16;
                    strM7078 = strM7078;
                    strM2424 = strM2424;
                    interfaceC6025 = interfaceC6025;
                    int iM450218 = C19806.m45029("ۘܶ") ^ i12;
                    PackageInfo packageInfo14 = packageInfo3;
                    i14 = ((iM450218 ^ i13) * (-8747)) ^ 2147073264;
                    i15 = iM450218 ^ (-721033917);
                    i16 = i16;
                    str18 = str18;
                    packageInfo6 = packageInfo14;
                    interfaceC6025 = interfaceC6025;
                    strM2424 = strM2424;
                    strM7078 = strM7078;
                    str17 = str17;
                    break;
                case -292765282:
                case 278279565:
                    str12 = str17;
                    str13 = strM7078;
                    PackageInfo packageInfo15 = packageInfo6;
                    int i24 = i16;
                    String str27 = strM82412;
                    sArr4 = sArr7;
                    str14 = strValueOf;
                    packageInfo5 = packageInfo15;
                    str15 = str27;
                    String strM6288 = C1937.m6288(f16037, 402, 3, i18);
                    if (C0797.f3386) {
                        str16 = strM6288;
                        i8 = i24;
                        int iM113013 = (ThreadFactoryC3888.m11306("᩷ۛ") ^ i13) * 61;
                        int i25 = i8;
                        int i26 = ((iM113013 ^ i12) * (-12573)) ^ 795217261;
                        i15 = iM113013 ^ 1728648094;
                        strM7078 = str13;
                        str17 = str12;
                        String str28 = str16;
                        i14 = i26;
                        i16 = i25;
                        packageInfo6 = packageInfo5;
                        strValueOf = str14;
                        sArr7 = sArr4;
                        strM82412 = str15;
                        str18 = str28;
                    } else {
                        int iM450219 = C19806.m45029("ۗܳ") ^ i12;
                        i15 = iM450219 ^ 511493498;
                        i14 = ((iM450219 ^ i13) * (-24823)) ^ 1197425146;
                        strM7078 = str13;
                        str17 = str12;
                        str18 = strM6288;
                        i16 = i24;
                        packageInfo6 = packageInfo5;
                        strValueOf = str14;
                        sArr7 = sArr4;
                        strM82412 = str15;
                    }
                    break;
                case -146132339:
                case 1849044477:
                    C7105.m18985();
                    if (!RunnableC1895.f7152) {
                        str17 = str17;
                        str18 = str18;
                        packageInfo3 = packageInfo6;
                        i16 = i16;
                        strM7078 = strM7078;
                        strM2424 = strM2424;
                        interfaceC6025 = interfaceC6025;
                        int iM4502110 = C19806.m45029("ۘܶ") ^ i12;
                        PackageInfo packageInfo16 = packageInfo3;
                        i14 = ((iM4502110 ^ i13) * (-8747)) ^ 2147073264;
                        i15 = iM4502110 ^ (-721033917);
                        i16 = i16;
                        str18 = str18;
                        packageInfo6 = packageInfo16;
                        interfaceC6025 = interfaceC6025;
                        strM2424 = strM2424;
                        strM7078 = strM7078;
                        str17 = str17;
                    } else {
                        str9 = str18;
                        str7 = strM82412;
                        sArr2 = sArr7;
                        sArr3 = sArr6;
                        str8 = strValueOf;
                        packageInfo4 = packageInfo6;
                        i5 = i16;
                        strM82410 = str17;
                        str6 = strM7078;
                        str10 = strM7076;
                        iM11307 = ThreadFactoryC3888.m11306("۠ܽ") ^ i13;
                        str11 = strM82410;
                        i6 = ((iM11307 ^ i12) * (-25081)) ^ (-1672187261);
                        i7 = -372120630;
                        i15 = iM11307 ^ i7;
                        i14 = i6;
                        sArr6 = sArr3;
                        i16 = i5;
                        packageInfo6 = packageInfo4;
                        strValueOf = str8;
                        sArr7 = sArr2;
                        strM82412 = str7;
                        str18 = str9;
                        String str29 = str11;
                        strM7076 = str10;
                        strM7078 = str6;
                        str17 = str29;
                    }
                    break;
                case 1039462142:
                case 1929816314:
                    strM8164 = C2642.m8164(strM82411, 0, i19);
                    iM11308 = ThreadFactoryC3888.m11306("᩹᩹") ^ i13;
                    i9 = ((iM11308 ^ i12) * 14033) ^ 1466394305;
                    i10 = -542006972;
                    i15 = iM11308 ^ i10;
                    i14 = i9;
                    break;
                case 1703443492:
                case 2017043363:
                    str17 = str17;
                    str18 = str18;
                    strM82412 = strM82412;
                    sArr7 = sArr7;
                    strM7078 = strM7078;
                    strM2424 = strM2424;
                    strValueOf = strValueOf;
                    packageInfo6 = packageInfo6;
                    i16 = i16;
                    interfaceC6025 = interfaceC6025;
                    if (((s * 2) + 1) - (i17 * i17) <= 0) {
                        iM11306 = C19806.m45029("۟ۢ") ^ i13;
                        i14 = ((iM11306 ^ i12) * 2057) ^ 6137416;
                        i2 = -1463391795;
                    } else {
                        iM11306 = (i12 - C19806.m45029("֫᩵")) * q.h;
                        i14 = ((iM11306 ^ i13) * 5457) ^ 1630526926;
                        i2 = 1798549277;
                    }
                    i15 = iM11306 ^ i2;
                    interfaceC6025 = interfaceC6025;
                    i16 = i16;
                    strM2424 = strM2424;
                    strM7078 = strM7078;
                    packageInfo6 = packageInfo6;
                    strValueOf = strValueOf;
                    str17 = str17;
                    sArr7 = sArr7;
                    strM82412 = strM82412;
                    str18 = str18;
                    break;
                default:
                    C0629.m2907();
                    if (!RunnableC1895.f7152) {
                        strM8249 = str19;
                        str = strM82412;
                        sArr = sArr7;
                        packageInfo = packageInfo6;
                        i = i16;
                        str2 = strValueOf;
                        int iM4502111 = (C19806.m45029("ۜܶ") + i12) * 21;
                        String str210 = str2;
                        int i27 = ((iM4502111 ^ i13) * (-11811)) ^ 948994340;
                        i15 = iM4502111 ^ 1518976211;
                        strValueOf = str210;
                        sArr7 = sArr;
                        strM82412 = str;
                        str19 = strM8249;
                        PackageInfo packageInfo17 = packageInfo;
                        i14 = i27;
                        i16 = i;
                        packageInfo6 = packageInfo17;
                    } else {
                        str17 = str17;
                        str18 = str18;
                        packageInfo3 = packageInfo6;
                        i16 = i16;
                        strM7078 = strM7078;
                        strM2424 = strM2424;
                        interfaceC6025 = interfaceC6025;
                        int iM4502112 = C19806.m45029("ۘܶ") ^ i12;
                        PackageInfo packageInfo18 = packageInfo3;
                        i14 = ((iM4502112 ^ i13) * (-8747)) ^ 2147073264;
                        i15 = iM4502112 ^ (-721033917);
                        i16 = i16;
                        str18 = str18;
                        packageInfo6 = packageInfo18;
                        interfaceC6025 = interfaceC6025;
                        strM2424 = strM2424;
                        strM7078 = strM7078;
                        str17 = str17;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12572(ViewOnClickListenerC4514 viewOnClickListenerC4514, C16819 c16819, DialogInterface dialogInterface, int i) {
        int iM45029;
        int i2;
        int i3;
        int i4;
        String str;
        int iM450210;
        int i5;
        int i6;
        int i7;
        int iM11306;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        String str2;
        int i13;
        ViewOnClickListenerC4514 viewOnClickListenerC4515 = viewOnClickListenerC4514;
        c16819 = c16819;
        int i14 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int i15 = C3535.f13026;
        int iM11307 = ThreadFactoryC3888.m11306("ۨܳ") ^ i15;
        int i16 = ((iM11307 ^ i14) * (-2361)) ^ 755223426;
        String strM37076 = null;
        String strM6241 = null;
        StringBuilder sbM8976 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i17 = iM11307 ^ (-962620801);
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        short s = 0;
        String strM12599 = null;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1028029642;
        String strM125910 = null;
        short[] sArr3 = null;
        int i26 = 0;
        String[] strArr = null;
        while (true) {
            i25 = i17 ^ (i16 & (((i25 ^ i14) * 6855) >> 31));
            switch (i25) {
                case -1922268673:
                case 2095443322:
                    if (i == 2) {
                        i4 = i18;
                        str = strM6241;
                        iM450210 = C19806.m45029("ۙۢ") ^ i15;
                        i5 = ((iM450210 ^ i14) * 32231) ^ (-43015091);
                        i6 = 1555741862;
                        i7 = iM450210 ^ i6;
                        strM6241 = str;
                        int i27 = i4;
                        i17 = i7;
                        i16 = i5;
                        i18 = i27;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۢ") ^ i15;
                        i2 = ((iM45029 ^ i14) * 2719) ^ (-877541784);
                        i3 = 1644216070;
                        i17 = iM45029 ^ i3;
                        i16 = i2;
                    }
                    break;
                case -1760518800:
                case 753322365:
                    str = strM6241;
                    sArr = f16037;
                    i21 = 5;
                    if (C3535.f13026 <= 0) {
                        i18 = 129;
                        iM450210 = C19806.m45029("֫ܿ") ^ i14;
                        i4 = i18;
                        i5 = ((iM450210 ^ i15) * 28989) ^ (-2084934243);
                        i6 = -1621073077;
                        i7 = iM450210 ^ i6;
                        strM6241 = str;
                        int i28 = i4;
                        i17 = i7;
                        i16 = i5;
                        i18 = i28;
                    } else {
                        int iM11308 = ThreadFactoryC3888.m11306("ۧۘ") ^ i15;
                        i17 = iM11308 ^ 452538694;
                        i16 = ((iM11308 ^ i14) * 30257) ^ 1141017151;
                        strM6241 = str;
                        i18 = 129;
                    }
                    break;
                case -1719700693:
                case -1458458600:
                    i18 = i18;
                    sArr3 = sArr3;
                    i24 = i24;
                    strM37076 = strM37076;
                    strM6241 = strM6241;
                    if (C2642.f10294 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩵") ^ i15;
                        i8 = ((iM11306 ^ i14) * 20061) ^ 749748074;
                        i9 = -114383110;
                        i12 = iM11306 ^ i9;
                        strM37076 = strM37076;
                        strM6241 = strM6241;
                        i24 = i24;
                        i18 = i18;
                        i17 = i12;
                        sArr3 = sArr3;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                        i16 = i8;
                        c16819 = c16819;
                    }
                    strM37076 = strM37076;
                    int iM450211 = C19806.m45029("ᩳ۟") ^ i14;
                    i8 = ((iM450211 ^ i15) * (-4961)) ^ 387415755;
                    i12 = iM450211 ^ (-1122837817);
                    strM6241 = strM6241;
                    i24 = i24;
                    i18 = i18;
                    i17 = i12;
                    sArr3 = sArr3;
                    viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    i16 = i8;
                    c16819 = c16819;
                    break;
                case -1672674873:
                case -758953350:
                    i26 = 40375;
                    iM11306 = C19806.m45029("ۨ᩹") ^ i14;
                    i8 = ((iM11306 ^ i15) * 15937) ^ (-264088056);
                    i9 = 1214756351;
                    i12 = iM11306 ^ i9;
                    strM37076 = strM37076;
                    strM6241 = strM6241;
                    i24 = i24;
                    i18 = i18;
                    i17 = i12;
                    sArr3 = sArr3;
                    viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    i16 = i8;
                    c16819 = c16819;
                    break;
                case -1632204247:
                case -702146516:
                    if (C0671.m3008() < 0) {
                        iM45029 = (C19806.m45029("ۖۚ") ^ i15) * 41;
                        i2 = ((iM45029 ^ i14) * (-5765)) ^ 513979765;
                        i3 = 564068606;
                        i17 = iM45029 ^ i3;
                        i16 = i2;
                    } else {
                        i18 = i18;
                        sArr3 = sArr3;
                        i24 = i24;
                        strM6241 = strM6241;
                        int iM450212 = C19806.m45029("ᩳ۟") ^ i14;
                        i8 = ((iM450212 ^ i15) * (-4961)) ^ 387415755;
                        i12 = iM450212 ^ (-1122837817);
                        strM6241 = strM6241;
                        i24 = i24;
                        i18 = i18;
                        i17 = i12;
                        sArr3 = sArr3;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                        i16 = i8;
                        c16819 = c16819;
                    }
                    break;
                case -1545100274:
                case -701081376:
                    i18 = i18;
                    sArr3 = sArr3;
                    i24 = i24;
                    strM37076 = strM37076;
                    strM6241 = strM6241;
                    short s2 = s;
                    if (((s2 * s2) + 33154564) - (s2 * 11516) >= 0) {
                        s = s2;
                        iM11306 = (i15 - C19806.m45029("۟ܺ")) * 31;
                        i8 = ((iM11306 ^ i14) * (-22507)) ^ (-413474712);
                        i9 = 1632986598;
                        i12 = iM11306 ^ i9;
                        strM37076 = strM37076;
                        strM6241 = strM6241;
                        i24 = i24;
                        i18 = i18;
                        i17 = i12;
                        sArr3 = sArr3;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                        i16 = i8;
                        c16819 = c16819;
                    } else {
                        int iM11309 = ThreadFactoryC3888.m11306("ۢܿ") ^ i14;
                        s = s2;
                        i10 = ((iM11309 ^ i15) * (-14869)) ^ 816199718;
                        i11 = iM11309 ^ (-720695095);
                        strM37076 = strM37076;
                        strM6241 = strM6241;
                        i24 = i24;
                        i18 = i18;
                        i17 = i11;
                        sArr3 = sArr3;
                        c16819 = c16819;
                        i16 = i10;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    }
                    break;
                case -1496460229:
                case 821860251:
                    i18 = i18;
                    sArr3 = sArr3;
                    i24 = i24;
                    strM37076 = strM37076;
                    strM6241 = strM6241;
                    s = f16037[115];
                    if (C1066.f4915 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۠᩵") ^ i14;
                        i8 = ((iM11306 ^ i15) * 2875) ^ 776338989;
                        i9 = -358513144;
                        i12 = iM11306 ^ i9;
                        strM37076 = strM37076;
                        strM6241 = strM6241;
                        i24 = i24;
                        i18 = i18;
                        i17 = i12;
                        sArr3 = sArr3;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                        i16 = i8;
                        c16819 = c16819;
                    }
                    strM37076 = strM37076;
                    int iM450213 = C19806.m45029("ᩳ۟") ^ i14;
                    i8 = ((iM450213 ^ i15) * (-4961)) ^ 387415755;
                    i12 = iM450213 ^ (-1122837817);
                    strM6241 = strM6241;
                    i24 = i24;
                    i18 = i18;
                    i17 = i12;
                    sArr3 = sArr3;
                    viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    i16 = i8;
                    c16819 = c16819;
                    break;
                case -1412762871:
                case 213339804:
                    C2332.m7081(new C2707(viewOnClickListenerC4515, c16819, C1189.m4364(m12582(), C0817.m3407(sbM8976)), i));
                    break;
                case -1221659368:
                case 2057042413:
                    if (!RunnableC1895.f7152) {
                        i4 = i18;
                        str2 = strM37076;
                        int iM450214 = (C19806.m45029("֡ܿ") + i14) * 17;
                        i16 = 815173310 ^ ((iM450214 ^ i15) * 975);
                        i13 = iM450214 ^ 1697649095;
                        strM37076 = str2;
                        i18 = i4;
                        i17 = i13;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    } else {
                        i18 = i18;
                        sArr3 = sArr3;
                        i24 = i24;
                        strM6241 = strM6241;
                        int iM450215 = C19806.m45029("ᩳ۟") ^ i14;
                        i8 = ((iM450215 ^ i15) * (-4961)) ^ 387415755;
                        i12 = iM450215 ^ (-1122837817);
                        strM6241 = strM6241;
                        i24 = i24;
                        i18 = i18;
                        i17 = i12;
                        sArr3 = sArr3;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                        i16 = i8;
                        c16819 = c16819;
                    }
                    break;
                case -1198544474:
                case 30457082:
                    C1460.m5050();
                    break;
                case -1039558130:
                case 488936474:
                    i4 = i18;
                    str = strM6241;
                    if (i != 1) {
                        iM450210 = (ThreadFactoryC3888.m11306("ۖᩴ") ^ i14) * 43;
                        i5 = ((iM450210 ^ i15) * 18297) ^ (-1273534603);
                        i6 = -1012628848;
                    } else {
                        iM450210 = C19806.m45029("ۙۢ") ^ i15;
                        i5 = ((iM450210 ^ i14) * 32231) ^ (-43015091);
                        i6 = 1555741862;
                    }
                    i7 = iM450210 ^ i6;
                    strM6241 = str;
                    int i29 = i4;
                    i17 = i7;
                    i16 = i5;
                    i18 = i29;
                    break;
                case -922261341:
                case -512324529:
                    C2332.m7081(new C13998(viewOnClickListenerC4515, c16819, C1668.m5585(m12582(), strM37076)));
                    break;
                case -916345000:
                case 827870651:
                    i18 = i18;
                    sArr3 = sArr3;
                    int i30 = i23;
                    int i31 = i24;
                    strM6241 = strM6241;
                    String strM2906 = C0629.m2906(sArr3, i30, i31, i26);
                    i24 = i31;
                    String str3 = strM12599;
                    strM37076 = C15489.m37076(str3, strM2906);
                    if (C0671.m3008() < 0) {
                        int iM113010 = ThreadFactoryC3888.m11306("ᩴܶ") ^ i15;
                        strM12599 = str3;
                        i10 = ((iM113010 ^ i14) * (-1421)) ^ 1640538726;
                        i11 = iM113010 ^ (-1763414018);
                        i23 = i30;
                        strM6241 = strM6241;
                        i24 = i24;
                        i18 = i18;
                        i17 = i11;
                        sArr3 = sArr3;
                        c16819 = c16819;
                        i16 = i10;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    } else {
                        strM12599 = str3;
                        i23 = i30;
                        int iM450216 = C19806.m45029("ᩳ۟") ^ i14;
                        i8 = ((iM450216 ^ i15) * (-4961)) ^ 387415755;
                        i12 = iM450216 ^ (-1122837817);
                        strM6241 = strM6241;
                        i24 = i24;
                        i18 = i18;
                        i17 = i12;
                        sArr3 = sArr3;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                        i16 = i8;
                        c16819 = c16819;
                    }
                    break;
                case -737612636:
                case 1959745778:
                    C1148.m4223(sbM8976, strArr[i20]);
                    if (C0216.f1393 == 0) {
                        iM45029 = (i14 - C19806.m45029("ۡܰ")) * 5;
                        i2 = ((iM45029 ^ i15) * 11995) ^ 1016906460;
                        i3 = -979941699;
                        i17 = iM45029 ^ i3;
                        i16 = i2;
                    } else {
                        i4 = i18;
                        str2 = strM37076;
                        int iM450217 = (C19806.m45029("֡ܿ") + i14) * 17;
                        i16 = 815173310 ^ ((iM450217 ^ i15) * 975);
                        i13 = iM450217 ^ 1697649095;
                        strM37076 = str2;
                        i18 = i4;
                        i17 = i13;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    }
                    break;
                case -382179543:
                case -44435078:
                    i26 = 1685;
                    iM11306 = C19806.m45029("ۨ᩹") ^ i14;
                    i8 = ((iM11306 ^ i15) * 15937) ^ (-264088056);
                    i9 = 1214756351;
                    i12 = iM11306 ^ i9;
                    strM37076 = strM37076;
                    strM6241 = strM6241;
                    i24 = i24;
                    i18 = i18;
                    i17 = i12;
                    sArr3 = sArr3;
                    viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    i16 = i8;
                    c16819 = c16819;
                    break;
                case -273885318:
                case 1159319944:
                    str = strM6241;
                    strArr = new String[]{str, C1148.m4230(sArr, i18, i21, i26)};
                    strM125910 = m12599(c16819);
                    sArr2 = f16037;
                    if (C0671.f2816 == 0) {
                        iM450210 = ThreadFactoryC3888.m11306("ܽۧ") ^ i15;
                        i4 = i18;
                        i5 = ((iM450210 ^ i14) * (-14829)) ^ 634593268;
                        i6 = 362561926;
                        i7 = iM450210 ^ i6;
                        strM6241 = str;
                        int i210 = i4;
                        i17 = i7;
                        i16 = i5;
                        i18 = i210;
                    } else {
                        i4 = i18;
                        strM6241 = str;
                        str2 = strM37076;
                        int iM450218 = (C19806.m45029("֡ܿ") + i14) * 17;
                        i16 = 815173310 ^ ((iM450218 ^ i15) * 975);
                        i13 = iM450218 ^ 1697649095;
                        strM37076 = str2;
                        i18 = i4;
                        i17 = i13;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    }
                    break;
                case -195613288:
                case -27758701:
                    C10634.m26820();
                    if (C0671.f2816 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۟ۡ") ^ i15;
                        i2 = ((iM45029 ^ i14) * 6935) ^ (-1053032537);
                        i3 = 1092184165;
                        i17 = iM45029 ^ i3;
                        i16 = i2;
                    } else {
                        i4 = i18;
                        str2 = strM37076;
                        int iM450219 = (C19806.m45029("֡ܿ") + i14) * 17;
                        i16 = 815173310 ^ ((iM450219 ^ i15) * 975);
                        i13 = iM450219 ^ 1697649095;
                        strM37076 = str2;
                        i18 = i4;
                        i17 = i13;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    }
                    break;
                case -15460655:
                case 1558190218:
                    i4 = i18;
                    str2 = strM37076;
                    String str4 = strM6241;
                    strM12599 = m12599(c16819);
                    sArr3 = f16037;
                    i23 = 116;
                    i24 = 9;
                    if (C1377.f5749) {
                        int iM450220 = (C19806.m45029("᩻ܺ") + i14) * 77;
                        i16 = (-163346652) ^ ((iM450220 ^ i15) * (-21));
                        i13 = iM450220 ^ 974956337;
                        strM37076 = str2;
                        strM6241 = str4;
                    } else {
                        strM6241 = str4;
                        int iM4502110 = (C19806.m45029("֡ܿ") + i14) * 17;
                        i16 = 815173310 ^ ((iM4502110 ^ i15) * 975);
                        i13 = iM4502110 ^ 1697649095;
                        strM37076 = str2;
                    }
                    i18 = i4;
                    i17 = i13;
                    viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    break;
                case 18974973:
                case 84447400:
                    i18 = i18;
                    sArr3 = sArr3;
                    i24 = i24;
                    strM37076 = strM37076;
                    strM6241 = strM6241;
                    dialogInterface.dismiss();
                    if (i != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۘ") ^ i14;
                        i8 = ((iM11306 ^ i15) * 30919) ^ (-1898073265);
                        i9 = 1415668424;
                    } else {
                        iM11306 = (C19806.m45029("᩺ܶ") ^ i15) * (-59);
                        i8 = ((iM11306 ^ i14) * (-19501)) ^ (-1343803345);
                        i9 = -1169344987;
                    }
                    i12 = iM11306 ^ i9;
                    strM37076 = strM37076;
                    strM6241 = strM6241;
                    i24 = i24;
                    i18 = i18;
                    i17 = i12;
                    sArr3 = sArr3;
                    viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    i16 = i8;
                    c16819 = c16819;
                    break;
                case 56253328:
                case 1828123710:
                    i4 = i18;
                    strM6241 = ViewGroupOnHierarchyChangeListenerC1916.m6241(f16037, q.h, 4, i26);
                    if (C1977.f7413 > 0) {
                        int iM450221 = (C19806.m45029("ۢۙ") ^ i14) * 79;
                        i5 = ((iM450221 ^ i15) * 11679) ^ 2001174352;
                        i7 = iM450221 ^ (-1334200095);
                        int i211 = i4;
                        i17 = i7;
                        i16 = i5;
                        i18 = i211;
                    } else {
                        str2 = strM37076;
                        int iM4502111 = (C19806.m45029("֡ܿ") + i14) * 17;
                        i16 = 815173310 ^ ((iM4502111 ^ i15) * 975);
                        i13 = iM4502111 ^ 1697649095;
                        strM37076 = str2;
                        i18 = i4;
                        i17 = i13;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    }
                    break;
                case 519671704:
                case 1352997341:
                    C7105.m18985();
                    i4 = i18;
                    str2 = strM37076;
                    int iM4502112 = (C19806.m45029("֡ܿ") + i14) * 17;
                    i16 = 815173310 ^ ((iM4502112 ^ i15) * 975);
                    i13 = iM4502112 ^ 1697649095;
                    strM37076 = str2;
                    i18 = i4;
                    i17 = i13;
                    viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    break;
                case 1038112787:
                case 2022456129:
                    break;
                case 1266815618:
                case 1923347070:
                    sbM8976 = C3012.m8976(strM125910, ViewTreeObserverOnPreDrawListenerC3327.m9869(sArr2, i22, i19, i26));
                    i20 = i - 1;
                    if (!RunnableC1564.f6300) {
                        iM45029 = C19806.m45029("ۚ۟") ^ i15;
                        i2 = ((iM45029 ^ i14) * 11303) ^ (-1569938231);
                        i3 = 724549544;
                        i17 = iM45029 ^ i3;
                        i16 = i2;
                    } else {
                        str = strM6241;
                        iM450210 = C19806.m45029("֫ܿ") ^ i14;
                        i4 = i18;
                        i5 = ((iM450210 ^ i15) * 28989) ^ (-2084934243);
                        i6 = -1621073077;
                        i7 = iM450210 ^ i6;
                        strM6241 = str;
                        int i212 = i4;
                        i17 = i7;
                        i16 = i5;
                        i18 = i212;
                    }
                    break;
                default:
                    i22 = 134;
                    i19 = 5;
                    if (C1066.m4023() > 0) {
                        iM45029 = C19806.m45029("۫ۚ") ^ i14;
                        i2 = ((iM45029 ^ i15) * (-22839)) ^ 1704818663;
                        i3 = 1004921506;
                        i17 = iM45029 ^ i3;
                        i16 = i2;
                    } else {
                        str = strM6241;
                        iM450210 = C19806.m45029("֫ܿ") ^ i14;
                        i4 = i18;
                        i5 = ((iM450210 ^ i15) * 28989) ^ (-2084934243);
                        i6 = -1621073077;
                        i7 = iM450210 ^ i6;
                        strM6241 = str;
                        int i213 = i4;
                        i17 = i7;
                        i16 = i5;
                        i18 = i213;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ea A[PHI: r2 r8 r9 r15
      0x00ea: PHI (r2v4 int) = (r2v3 int), (r2v2 int) binds: [B:30:0x00e8, B:26:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x00ea: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:30:0x00e8, B:26:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x00ea: PHI (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:30:0x00e8, B:26:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x00ea: PHI (r15v3 short[]) = (r15v2 short[]), (r15v4 short[]) binds: [B:30:0x00e8, B:26:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01e4 A[PHI: r3 r5 r13
      0x01e4: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:50:0x01e2, B:22:0x00a5, B:17:0x0084, B:15:0x0080, B:12:0x007a, B:8:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r5v3 int) = (r5v1 int), (r5v2 int), (r5v1 int), (r5v1 int), (r5v1 int), (r5v1 int) binds: [B:50:0x01e2, B:22:0x00a5, B:17:0x0084, B:15:0x0080, B:12:0x007a, B:8:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r13v4 short) = (r13v3 short), (r13v2 short), (r13v2 short), (r13v2 short), (r13v2 short), (r13v2 short) binds: [B:50:0x01e2, B:22:0x00a5, B:17:0x0084, B:15:0x0080, B:12:0x007a, B:8:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x025a A[PHI: r1 r6 r7 r12 r17
      0x025a: PHI (r1v3 l.᩻۠ۘ) = (r1v2 l.᩻۠ۘ), (r1v1 l.᩻۠ۘ), (r1v1 l.᩻۠ۘ), (r1v1 l.᩻۠ۘ) binds: [B:35:0x0121, B:62:0x0258, B:54:0x0218, B:12:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r6v8 java.lang.String[]) = (r6v3 java.lang.String[]), (r6v2 java.lang.String[]), (r6v2 java.lang.String[]), (r6v2 java.lang.String[]) binds: [B:35:0x0121, B:62:0x0258, B:54:0x0218, B:12:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r7v4 android.os.Bundle) = (r7v3 android.os.Bundle), (r7v2 android.os.Bundle), (r7v2 android.os.Bundle), (r7v2 android.os.Bundle) binds: [B:35:0x0121, B:62:0x0258, B:54:0x0218, B:12:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:35:0x0121, B:62:0x0258, B:54:0x0218, B:12:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r17v4 char) = (r17v2 char), (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:35:0x0121, B:62:0x0258, B:54:0x0218, B:12:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02aa A[PHI: r10 r16 r22
      0x02aa: PHI (r10v4 short) = (r10v2 short), (r10v2 short), (r10v3 short), (r10v2 short) binds: [B:70:0x02a8, B:66:0x028c, B:58:0x0239, B:15:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x02aa: PHI (r16v4 short[]) = (r16v2 short[]), (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:70:0x02a8, B:66:0x028c, B:58:0x0239, B:15:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x02aa: PHI (r22v5 short) = (r22v3 short), (r22v3 short), (r22v4 short), (r22v3 short) binds: [B:70:0x02a8, B:66:0x028c, B:58:0x0239, B:15:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12567(ViewOnClickListenerC4514 viewOnClickListenerC4514, EditText editText) {
        int iM45029;
        int i;
        int i2;
        C23566 c23566 = null;
        int iM450210 = 0;
        int i3 = C1937.f7317;
        int i4 = RunnableC0195.f1321;
        int iM11306 = (ThreadFactoryC3888.m11306("֨ᩳ") + i4) * 63;
        int i5 = ((iM11306 ^ i3) * 28497) ^ 1234160303;
        String[] strArr = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11306 ^ (-1161210018);
        int i7 = 0;
        String strM6674 = null;
        int i8 = 0;
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        char c = 0;
        int i12 = -1625761227;
        short s3 = 0;
        Bundle bundle = null;
        int i13 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * (-26393)) >> 31));
            switch (i12) {
                case -1949094798:
                case -1363130035:
                    iM450210 = C19806.m45029(AbstractC0464.m2308(sArr2, i8, i9, i11));
                    i13 = 2127898139;
                    if (C2704.f10408) {
                        iM45029 = (C19806.m45029("᩶᩻") + i4) * q.h;
                        i = ((iM45029 ^ i3) * 25403) ^ 1328177229;
                        i2 = 511855700;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨۬") ^ i4;
                        i = ((iM45029 ^ i3) * 18845) ^ 453370664;
                        i2 = 866355963;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1871254804:
                case -723321834:
                    C3722.m10894();
                    break;
                case -1852733614:
                case 970626388:
                    C1066.m4023();
                    iM45029 = ThreadFactoryC3888.m11306("֨۬") ^ i4;
                    i = ((iM45029 ^ i3) * 18845) ^ 453370664;
                    i2 = 866355963;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1823587576:
                case -685744904:
                    if (RunnableC1895.f7152) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵۬") ^ i4;
                        i = ((iM45029 ^ i3) * 27467) ^ 1821943045;
                        i2 = -1710458864;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨۬") ^ i4;
                        i = ((iM45029 ^ i3) * 18845) ^ 453370664;
                        i2 = 866355963;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1815125830:
                case -578908465:
                    s = sArr[c];
                    s3 = 13156;
                    if (C0278.m1789() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵۬") ^ i4;
                        i = ((iM45029 ^ i3) * 27467) ^ 1821943045;
                        i2 = -1710458864;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳܿ") + i4) * 123;
                        i = ((iM45029 ^ i3) * 19577) ^ 1500716693;
                        i2 = 1274634657;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1378160924:
                case -236841660:
                    sArr = f16037;
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵۬") ^ i4;
                        i = ((iM45029 ^ i3) * 27467) ^ 1821943045;
                        i2 = -1710458864;
                    } else {
                        iM45029 = C19806.m45029("ᩳۛ") ^ i3;
                        i = ((iM45029 ^ i4) * (-24557)) ^ (-1651917824);
                        i2 = 832800157;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1239917420:
                case 1022218616:
                    c23566 = viewOnClickListenerC4514.f16045;
                    bundle = null;
                    if (AbstractC0464.f2088 <= 0) {
                        strArr = null;
                        iM45029 = (i3 - C19806.m45029("ۧܶ")) * 101;
                        i = ((iM45029 ^ i4) * 30487) ^ 856235939;
                        i2 = -702329714;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM450211 = C19806.m45029("᩹᩵") ^ i3;
                        i5 = ((iM450211 ^ i4) * 10473) ^ 1512870248;
                        i6 = iM450211 ^ 1422145161;
                        strArr = null;
                    }
                    break;
                case -1082454792:
                case 2069997410:
                    i7 = 0;
                    if (CallableC1627.m5507() != 0) {
                        iM45029 = (C19806.m45029("᩻᩵") ^ i3) * 79;
                        i = ((iM45029 ^ i4) * (-21605)) ^ (-2024236798);
                        i2 = 363139031;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ۠") ^ i4;
                        i = ((iM45029 ^ i3) * (-10907)) ^ 901809579;
                        i2 = -1733016769;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -729748663:
                case 996233126:
                    sArr2 = f16037;
                    i8 = 14;
                    i9 = 3;
                    if (C3743.f13569) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۢ۟")) * 57;
                        i = ((iM45029 ^ i4) * 16291) ^ 256807350;
                        i2 = -771403011;
                    } else {
                        iM45029 = (C19806.m45029("᩻᩵") ^ i3) * 79;
                        i = ((iM45029 ^ i4) * (-21605)) ^ (-2024236798);
                        i2 = 363139031;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -710411986:
                case 1469527234:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (C1419.f5860 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨۬") ^ i4;
                        i = ((iM45029 ^ i3) * 18845) ^ 453370664;
                        i2 = 866355963;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗܽ") ^ i4;
                        i = ((iM45029 ^ i3) * (-2379)) ^ 229166274;
                        i2 = -1404102244;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -635647432:
                case 565730170:
                    c = '\r';
                    if (C2124.f7782 <= 0) {
                        iM45029 = (i3 - C19806.m45029("ۧܶ")) * 101;
                        i = ((iM45029 ^ i4) * 30487) ^ 856235939;
                        i2 = -702329714;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܳ") ^ i3;
                        i = ((iM45029 ^ i4) * (-10215)) ^ 607095038;
                        i2 = 918667487;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -557228145:
                case -385002771:
                    i11 = 62663;
                    iM45029 = (i4 - ThreadFactoryC3888.m11306("۟۠")) * (-19);
                    i = ((iM45029 ^ i3) * 12259) ^ 457012670;
                    i2 = -1286589645;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -440349396:
                case -350736324:
                    if (C7105.m18985()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵۬") ^ i4;
                        i = ((iM45029 ^ i3) * 27467) ^ 1821943045;
                        i2 = -1710458864;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۘۙ")) * 11;
                        i = ((iM45029 ^ i3) * (-18007)) ^ 1504474243;
                        i2 = -1476648350;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -432855342:
                case 1684101817:
                    String strM18991 = C7105.m18991(C2124.m6674(C3577.m10576(editText)));
                    if (C2249.m6911(strM18991)) {
                        int iM11307 = ThreadFactoryC3888.m11306("ۛܳ") ^ i3;
                        i5 = ((iM11307 ^ i4) * (-30003)) ^ (-866408281);
                        i6 = iM11307 ^ (-1786847802);
                    } else {
                        strM6674 = strM18991;
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ۬") ^ i3;
                        i = ((iM45029 ^ i4) * (-31417)) ^ 1465585158;
                        i2 = 1571230465;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    }
                    break;
                case -327260934:
                case 2126672659:
                    strM6674 = C2124.m6674(editText.getHint());
                    iM45029 = ThreadFactoryC3888.m11306("ᩴ۬") ^ i3;
                    i = ((iM45029 ^ i4) * (-31417)) ^ 1465585158;
                    i2 = 1571230465;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -223213148:
                case 944165145:
                    int i14 = s + s3;
                    i10 = i14 * i14;
                    if (C0797.m3359()) {
                        iM45029 = C19806.m45029("ۤۜ") ^ i4;
                        i = ((iM45029 ^ i3) * (-27551)) ^ (-670464016);
                        i2 = -1728535657;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۧܶ")) * 101;
                        i = ((iM45029 ^ i4) * 30487) ^ 856235939;
                        i2 = -702329714;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 224632778:
                case 992848316:
                    s2 = 52624;
                    if (C3535.m10431() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨۬") ^ i4;
                        i = ((iM45029 ^ i3) * 18845) ^ 453370664;
                        i2 = 866355963;
                    } else {
                        iM45029 = C19806.m45029("᩹ۤ") ^ i3;
                        i = ((iM45029 ^ i4) * (-12267)) ^ (-1806165064);
                        i2 = -1107827497;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 261756041:
                case 300917907:
                    if (C1066.f4915 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨۬") ^ i4;
                        i = ((iM45029 ^ i3) * 18845) ^ 453370664;
                        i2 = 866355963;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۧܶ")) * 101;
                        i = ((iM45029 ^ i4) * 30487) ^ 856235939;
                        i2 = -702329714;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 622791059:
                case 930759425:
                    i11 = 28707;
                    iM45029 = (i4 - ThreadFactoryC3888.m11306("۟۠")) * (-19);
                    i = ((iM45029 ^ i3) * 12259) ^ 457012670;
                    i2 = -1286589645;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 906766160:
                case 1447602737:
                    if ((s * s2) - i10 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺ᩷") ^ i3) * (-79);
                        i = ((iM45029 ^ i4) * 20421) ^ (-558803427);
                        i2 = 2008389905;
                    } else {
                        iM45029 = (i4 - C19806.m45029("᩹᩸")) * (-97);
                        i = ((iM45029 ^ i3) * 6673) ^ 722534739;
                        i2 = 871602883;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    c23566.m46684(i7, i13 ^ iM450210, strM6674, (String) null, strArr, bundle);
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 44801. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(android.view.MenuItem r59) {
        /*
            Method dump skipped, instruction units count: 4480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC4514.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0262 A[PHI: r4 r5
      0x0262: PHI (r4v4 l.֡ᩴۘ) = (r4v3 l.֡ᩴۘ), (r4v2 l.֡ᩴۘ), (r4v2 l.֡ᩴۘ), (r4v2 l.֡ᩴۘ), (r4v2 l.֡ᩴۘ), (r4v2 l.֡ᩴۘ) binds: [B:70:0x0260, B:66:0x0243, B:38:0x010e, B:18:0x0092, B:118:0x0262, B:116:0x0262] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r5v4 l.۠᩵ᩴ) = (r5v2 l.۠᩵ᩴ), (r5v3 l.۠᩵ᩴ), (r5v2 l.۠᩵ᩴ), (r5v2 l.۠᩵ᩴ), (r5v2 l.۠᩵ᩴ), (r5v2 l.۠᩵ᩴ) binds: [B:70:0x0260, B:66:0x0243, B:38:0x010e, B:18:0x0092, B:118:0x0262, B:116:0x0262] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0298 A[PHI: r3 r8 r12 r13
      0x0298: PHI (r3v4 java.util.ArrayList) = (r3v3 java.util.ArrayList), (r3v2 java.util.ArrayList), (r3v2 java.util.ArrayList), (r3v2 java.util.ArrayList) binds: [B:74:0x0296, B:59:0x01f5, B:34:0x00ea, B:26:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x0298: PHI (r8v4 l.֡ᩴۘ) = (r8v2 l.֡ᩴۘ), (r8v3 l.֡ᩴۘ), (r8v2 l.֡ᩴۘ), (r8v2 l.֡ᩴۘ) binds: [B:74:0x0296, B:59:0x01f5, B:34:0x00ea, B:26:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x0298: PHI (r12v4 java.util.concurrent.atomic.AtomicInteger) = 
      (r12v2 java.util.concurrent.atomic.AtomicInteger)
      (r12v2 java.util.concurrent.atomic.AtomicInteger)
      (r12v3 java.util.concurrent.atomic.AtomicInteger)
      (r12v2 java.util.concurrent.atomic.AtomicInteger)
     binds: [B:74:0x0296, B:59:0x01f5, B:34:0x00ea, B:26:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x0298: PHI (r13v3 l.ۢᩴۘ) = (r13v2 l.ۢᩴۘ), (r13v2 l.ۢᩴۘ), (r13v2 l.ۢᩴۘ), (r13v4 l.ۢᩴۘ) binds: [B:74:0x0296, B:59:0x01f5, B:34:0x00ea, B:26:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m12583(ViewOnClickListenerC4514 viewOnClickListenerC4514) {
        int iM11306;
        int i;
        int i2;
        int iM11307;
        int i3;
        int i4;
        ViewOnClickListenerC4514 viewOnClickListenerC4515 = viewOnClickListenerC4514;
        int i5 = C2124.f7782;
        int i6 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM45029 = C19806.m45029("ܶܺ") ^ i5;
        int i7 = ((iM45029 ^ i6) * (-10369)) ^ 1702459198;
        C8387 c8387 = null;
        C9764 c9764 = null;
        int i8 = iM45029 ^ 581599420;
        int i9 = -176124730;
        int i10 = 0;
        C0590 c0590 = null;
        AtomicInteger atomicInteger = null;
        ArrayList arrayList = null;
        C16819 c16819 = null;
        C16819 c168110 = null;
        InterfaceC13722 interfaceC13722ListIterator = null;
        C0590 c0591 = null;
        InterfaceC13722 interfaceC13722ListIterator2 = null;
        int i11 = 0;
        while (true) {
            i9 = i8 ^ (i7 & (((i9 ^ i6) * 379) >> 31));
            switch (i9) {
                case -2146115347:
                case 1730069639:
                    c9764 = new C9764(viewOnClickListenerC4515, arrayList);
                    if (C2124.m6673() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֫ᩳ") ^ i6;
                        i = ((iM11306 ^ i5) * (-21645)) ^ (-1250915850);
                        i2 = -1395352814;
                    } else {
                        iM11306 = C19806.m45029("᩷۬") ^ i6;
                        i = ((iM11306 ^ i5) * (-27841)) ^ 502362794;
                        i2 = -1306265047;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -2089447148:
                case -1785110639:
                    interfaceC13722ListIterator = c0591.f2562.listIterator(i11);
                    iM11306 = ThreadFactoryC3888.m11306("֫ᩴ") ^ i6;
                    i = ((iM11306 ^ i5) * 1135) ^ (-940846044);
                    i2 = -23716982;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -2028204040:
                case 979017177:
                    atomicInteger = viewOnClickListenerC4515.f16064;
                    if (C0278.f1572 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֫ᩳ") ^ i6;
                        i = ((iM11306 ^ i5) * (-21645)) ^ (-1250915850);
                        i2 = -1395352814;
                    } else {
                        iM11306 = (C19806.m45029("ܺۙ") ^ i6) * (-51);
                        i = ((iM11306 ^ i5) * 31133) ^ (-490324930);
                        i2 = 1001305982;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1958335258:
                case 1810653719:
                    c0590 = viewOnClickListenerC4515.f16044.f42057;
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("᩷ܳ")) * 45;
                        i = ((iM11306 ^ i6) * 26455) ^ 542168938;
                        i2 = 1647706465;
                    } else {
                        iM11306 = (C19806.m45029("ۗ֫") + i5) * (-59);
                        i = ((iM11306 ^ i6) * 19537) ^ (-847669717);
                        i2 = 741124151;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1549808714:
                case 1697704400:
                    C2249.m6903(viewOnClickListenerC4515.f16053);
                    if (C0526.m2437() >= 0) {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("᩷ܳ")) * 45;
                        i = ((iM11306 ^ i6) * 26455) ^ 542168938;
                        i2 = 1647706465;
                    } else {
                        iM11306 = C19806.m45029("ۖ᩻") ^ i5;
                        i = ((iM11306 ^ i6) * (-2217)) ^ 905687454;
                        i2 = 1304556983;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1380395862:
                case -895943580:
                    C3660.m10788(arrayList, c16819);
                    iM11306 = ThreadFactoryC3888.m11306("֫ᩴ") ^ i6;
                    i = ((iM11306 ^ i5) * 1135) ^ (-940846044);
                    i2 = -23716982;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1256788197:
                case -941844583:
                    c168110 = (C16819) C0278.m1776(interfaceC13722ListIterator2);
                    if (c168110.f53833) {
                        iM11306 = (i6 - C19806.m45029("֨ۗ")) * (-47);
                        i = ((iM11306 ^ i5) * (-2467)) ^ 774229872;
                        i2 = 1869052763;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩻") ^ i6;
                        i = ((iM11306 ^ i5) * 5943) ^ (-558877050);
                        i2 = -1953640735;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -997993465:
                case 232146061:
                    C3743.m10966();
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = C19806.m45029("۠᩵") ^ i5;
                        i = ((iM11306 ^ i6) * (-16985)) ^ 338787672;
                        i2 = -1284214338;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                    } else {
                        i4 = i10;
                        int iM450210 = C19806.m45029("ۙ۟") ^ i6;
                        i8 = iM450210 ^ 2060742388;
                        i10 = i4;
                        i7 = ((iM450210 ^ i5) * 11061) ^ (-1636042324);
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    }
                    break;
                case -990963680:
                case 41887431:
                    C1461.m5080();
                    if (!C2332.f8260) {
                        i4 = i10;
                        int iM450211 = C19806.m45029("ۙ۟") ^ i6;
                        i8 = iM450211 ^ 2060742388;
                        i10 = i4;
                        i7 = ((iM450211 ^ i5) * 11061) ^ (-1636042324);
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    } else {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("᩷ܳ")) * 45;
                        i = ((iM11306 ^ i6) * 26455) ^ 542168938;
                        i2 = 1647706465;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                    }
                    break;
                case -940448091:
                case -495038177:
                    break;
                case -938646174:
                case 1335218288:
                    c16819 = (C16819) C0216.m1584(interfaceC13722ListIterator);
                    if (c16819.f53833) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰᩳ") ^ i5;
                        i = ((iM11306 ^ i6) * (-32117)) ^ 1703132859;
                        i2 = -1123843284;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫ᩴ") ^ i6;
                        i = ((iM11306 ^ i5) * 1135) ^ (-940846044);
                        i2 = -23716982;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -896070557:
                case -800998846:
                    interfaceC13722ListIterator2 = c8387.listIterator(0);
                    i11 = 0;
                    iM11306 = ThreadFactoryC3888.m11306("۫᩻") ^ i6;
                    i = ((iM11306 ^ i5) * 5943) ^ (-558877050);
                    i2 = -1953640735;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -786986913:
                case 1875328686:
                    if (C3286.m9789(arrayList)) {
                        iM11306 = (C19806.m45029("ܰᩴ") ^ i6) * (-69);
                        i = ((iM11306 ^ i5) * 16239) ^ (-330827156);
                        i2 = 1573372964;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۚ") ^ i5;
                        i = ((iM11306 ^ i6) * (-15123)) ^ 2080352165;
                        i2 = -737898130;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -770074171:
                case 1429332083:
                    i10 = -1;
                    if (C2249.m6915() <= 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ܺ֨") + i6) * 57;
                        i7 = ((iM11307 ^ i5) * (-21851)) ^ 1834439667;
                        i3 = -1822145384;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ܰۛ") ^ i6;
                        i7 = ((iM11307 ^ i5) * 4055) ^ 608776533;
                        i3 = -151920014;
                    }
                    i8 = iM11307 ^ i3;
                    viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    break;
                case -674810570:
                case 846283039:
                    C3660.m10778(atomicInteger);
                    if (C1419.f5860 < 0) {
                        iM11306 = C19806.m45029("֡۫") ^ i5;
                        i = ((iM11306 ^ i6) * 23219) ^ 62343112;
                        i2 = -141569140;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                    } else {
                        i4 = i10;
                        int iM450212 = C19806.m45029("ۙ۟") ^ i6;
                        i8 = iM450212 ^ 2060742388;
                        i10 = i4;
                        i7 = ((iM450212 ^ i5) * 11061) ^ (-1636042324);
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    }
                    break;
                case -606691227:
                case 1765850155:
                    if (C3660.f13403 >= 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ܺ֨") + i6) * 57;
                        i7 = ((iM11307 ^ i5) * (-21851)) ^ 1834439667;
                        i3 = -1822145384;
                        i8 = iM11307 ^ i3;
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    } else {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("᩷ܳ")) * 45;
                        i = ((iM11306 ^ i6) * 26455) ^ 542168938;
                        i2 = 1647706465;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                    }
                    break;
                case -474889237:
                case 1121535692:
                    c8387 = c0590.f2562;
                    if (C1937.f7317 >= 0) {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("᩷ܳ")) * 45;
                        i = ((iM11306 ^ i6) * 26455) ^ 542168938;
                        i2 = 1647706465;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿᩴ") ^ i5;
                        i = ((iM11306 ^ i6) * (-6287)) ^ (-1532491848);
                        i2 = -1478834340;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -375702613:
                case 1603585044:
                    if (C0962.m3748(interfaceC13722ListIterator)) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨۢ") + i6) * 39;
                        i = ((iM11306 ^ i5) * (-1009)) ^ (-265669162);
                        i2 = 1333763477;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ᩴ") ^ i5;
                        i = ((iM11306 ^ i6) * 30079) ^ (-2093742676);
                        i2 = 408942138;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -117966282:
                case 321049803:
                    viewOnClickListenerC4515.f16047 = c9764;
                    viewOnClickListenerC4514.m12596();
                    break;
                case -65634852:
                case 2044104120:
                    arrayList = new ArrayList();
                    if (C2124.f7782 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֫ᩳ") ^ i6;
                        i = ((iM11306 ^ i5) * (-21645)) ^ (-1250915850);
                        i2 = -1395352814;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰ۬") ^ i6;
                        i = ((iM11306 ^ i5) * (-18071)) ^ (-1784862479);
                        i2 = -890334692;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case 309478243:
                case 700693833:
                    c0591 = viewOnClickListenerC4515.f16055.f42057;
                    if (C2249.f8050 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֫ᩳ") ^ i6;
                        i = ((iM11306 ^ i5) * (-21645)) ^ (-1250915850);
                        i2 = -1395352814;
                    } else {
                        iM11306 = C19806.m45029("ۙۤ") ^ i5;
                        i = ((iM11306 ^ i6) * 24891) ^ (-1623703736);
                        i2 = -503184719;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case 385274164:
                case 534252883:
                    C2249.m6905(arrayList, c168110);
                    iM11306 = ThreadFactoryC3888.m11306("۫᩻") ^ i6;
                    i = ((iM11306 ^ i5) * 5943) ^ (-558877050);
                    i2 = -1953640735;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case 1254997477:
                case 1746955544:
                    C0962.m3746();
                    iM11306 = (i5 - ThreadFactoryC3888.m11306("᩷ܳ")) * 45;
                    i = ((iM11306 ^ i6) * 26455) ^ 542168938;
                    i2 = 1647706465;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case 1266132330:
                case 1475547758:
                    i4 = i10;
                    viewOnClickListenerC4515.f16040 = i4;
                    if (RunnableC1606.f6488 < 0) {
                        int iM11308 = ThreadFactoryC3888.m11306("ۗ᩹") ^ i5;
                        i = ((iM11308 ^ i6) * 30837) ^ (-2095334094);
                        i8 = iM11308 ^ (-1953688235);
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                        i10 = i4;
                        i7 = i;
                    } else {
                        int iM450213 = C19806.m45029("ۙ۟") ^ i6;
                        i8 = iM450213 ^ 2060742388;
                        i10 = i4;
                        i7 = ((iM450213 ^ i5) * 11061) ^ (-1636042324);
                        viewOnClickListenerC4515 = viewOnClickListenerC4514;
                    }
                    break;
                case 1461075492:
                case 1743983842:
                    C1668.m5583();
                    break;
                default:
                    if (RunnableC1564.m5348(interfaceC13722ListIterator2)) {
                        iM11306 = C19806.m45029("ܺ᩻") ^ i5;
                        i = ((iM11306 ^ i6) * (-22907)) ^ (-58834381);
                        i2 = -1337464045;
                    } else {
                        iM11306 = C19806.m45029("ܿᩳ") ^ i6;
                        i = ((iM11306 ^ i5) * (-13179)) ^ 1874903394;
                        i2 = -1284461120;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:117:0x0467 A[PHI: r16 r20 r23
      0x0467: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:116:0x0465, B:108:0x0414, B:14:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0467: PHI (r20v29 java.lang.Object) = (r20v8 java.lang.Object), (r20v10 java.lang.Object), (r20v30 java.lang.Object) binds: [B:116:0x0465, B:108:0x0414, B:14:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0467: PHI (r23v20 int) = (r23v0 int), (r23v2 int), (r23v21 int) binds: [B:116:0x0465, B:108:0x0414, B:14:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0259 A[PHI: r2 r3 r20 r22 r23
      0x0259: PHI (r2v3 l.ۢᩴۘ) = (r2v2 l.ۢᩴۘ), (r2v4 l.ۢᩴۘ) binds: [B:65:0x0205, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r3v3 ??) = (r3v29 ??), (r3v4 ??) binds: [B:65:0x0205, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r20v42 java.lang.Object) = (r20v22 java.lang.Object), (r20v43 java.lang.Object) binds: [B:65:0x0205, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r22v17 short) = (r22v8 short), (r22v18 short) binds: [B:65:0x0205, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r23v33 int) = (r23v13 int), (r23v34 int) binds: [B:65:0x0205, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b8, code lost:
    
        if (l.RunnableC1564.f6300 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        if (l.C2871.f10837 < 0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String, l.ۢᩴۘ] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [l.ܽᩴۘ] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m12596() {
        /*
            Method dump skipped, instruction units count: 1436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC4514.m12596():void");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00da  */
    /* JADX WARN: Code duplicated, block: B:55:0x01d8 A[PHI: r3 r12
      0x01d8: PHI (r3v4 boolean) = (r3v2 boolean), (r3v3 boolean), (r3v2 boolean) binds: [B:54:0x01d6, B:19:0x0083, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r12v4 short) = (r12v3 short), (r12v2 short), (r12v2 short) binds: [B:54:0x01d6, B:19:0x0083, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0210 A[PHI: r5 r6 r11
      0x0210: PHI (r5v3 int) = (r5v2 int), (r5v4 int) binds: [B:58:0x020e, B:35:0x011d] A[DONT_GENERATE, DONT_INLINE]
      0x0210: PHI (r6v3 int) = (r6v2 int), (r6v4 int) binds: [B:58:0x020e, B:35:0x011d] A[DONT_GENERATE, DONT_INLINE]
      0x0210: PHI (r11v4 int) = (r11v3 int), (r11v2 int) binds: [B:58:0x020e, B:35:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0246 A[PHI: r2 r9 r10
      0x0246: PHI (r2v4 l.ۢᩴۘ) = (r2v2 l.ۢᩴۘ), (r2v3 l.ۢᩴۘ), (r2v2 l.ۢᩴۘ), (r2v2 l.ۢᩴۘ) binds: [B:62:0x0244, B:31:0x00fa, B:15:0x0071, B:13:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:62:0x0244, B:31:0x00fa, B:15:0x0071, B:13:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r10v4 short) = (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:62:0x0244, B:31:0x00fa, B:15:0x0071, B:13:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0279 A[PHI: r21
      0x0279: PHI (r21v5 char) = (r21v4 char), (r21v3 char) binds: [B:66:0x0277, B:10:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02ad A[PHI: r4 r7 r14 r15 r16
      0x02ad: PHI (r4v4 java.lang.String) = 
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v3 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
     binds: [B:70:0x02ab, B:43:0x0164, B:39:0x0141, B:13:0x006d, B:10:0x0064, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:70:0x02ab, B:43:0x0164, B:39:0x0141, B:13:0x006d, B:10:0x0064, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:70:0x02ab, B:43:0x0164, B:39:0x0141, B:13:0x006d, B:10:0x0064, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:70:0x02ab, B:43:0x0164, B:39:0x0141, B:13:0x006d, B:10:0x0064, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:70:0x02ab, B:43:0x0164, B:39:0x0141, B:13:0x006d, B:10:0x0064, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    private void m12604() {
        int iM45029;
        int i;
        int i2;
        int i3 = C0050.f912;
        int i4 = C1668.f6641;
        int iM11306 = ThreadFactoryC3888.m11306("ۤ֡") ^ i4;
        int i5 = ((iM11306 ^ i3) * 5529) ^ 1440887877;
        String strM9788 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11306 ^ 1872572049;
        C9764 c9764 = null;
        boolean z = false;
        int iM450210 = 0;
        int i7 = 0;
        int i8 = 0;
        short s = 0;
        short s2 = 0;
        int i9 = 0;
        short s3 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1572604665;
        char c = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * 9715) >> 31));
            switch (i12) {
                case -1589163669:
                case -613601904:
                    iM450210 = C19806.m45029(strM9788);
                    i7 = 2119802032;
                    if (C0050.f912 <= 0) {
                        iM45029 = C19806.m45029("᩵᩻") ^ i4;
                        i = ((iM45029 ^ i3) * (-4747)) ^ (-1663009367);
                        i2 = -1481180110;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۢ") + i3) * (-113);
                        i = ((iM45029 ^ i4) * 9283) ^ 548389271;
                        i2 = -1255147782;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1577976174:
                case -516184068:
                    this.f16057 = false;
                    z = true;
                    if (C0817.f3443) {
                        iM45029 = (C19806.m45029("ۖܽ") ^ i3) * q.h;
                        i = ((iM45029 ^ i4) * (-15479)) ^ (-22981841);
                        i2 = -1738675488;
                    } else {
                        iM45029 = (i3 - C19806.m45029("۬᩺")) * 89;
                        i = ((iM45029 ^ i4) * (-5883)) ^ 575794634;
                        i2 = 2088235777;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1548349696:
                case 818896395:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (i4 - C19806.m45029("᩸ۧ")) * 69;
                        i = ((iM45029 ^ i3) * 14847) ^ (-922629031);
                        i2 = -664075165;
                    } else {
                        iM45029 = (i3 - C19806.m45029("۬᩺")) * 89;
                        i = ((iM45029 ^ i4) * (-5883)) ^ 575794634;
                        i2 = 2088235777;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1512434148:
                case 101466380:
                    C0962.m3746();
                    if (C3577.m10565()) {
                        iM45029 = (i4 - C19806.m45029("ۜܿ")) * (-127);
                        i = ((iM45029 ^ i3) * 14351) ^ (-1161780414);
                        i2 = 1703099266;
                    } else {
                        iM45029 = (i4 - C19806.m45029("᩸ۧ")) * 69;
                        i = ((iM45029 ^ i3) * 14847) ^ (-922629031);
                        i2 = -664075165;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1510996816:
                case -860660652:
                    sArr2 = f16037;
                    i11 = 441;
                    i8 = 3;
                    if (C0050.f912 <= 0) {
                        iM45029 = (i4 - C19806.m45029("᩸ۧ")) * 69;
                        i = ((iM45029 ^ i3) * 14847) ^ (-922629031);
                        i2 = -664075165;
                    } else {
                        iM45029 = C19806.m45029("ۧܳ") ^ i3;
                        i = ((iM45029 ^ i4) * (-15343)) ^ (-1849014844);
                        i2 = 72908154;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1449505016:
                case -127965247:
                    int i13 = s + s2;
                    i9 = i13 * i13;
                    if (CallableC1627.f6528) {
                        iM45029 = (C19806.m45029("ۜ۫") ^ i3) * 15;
                        i = ((iM45029 ^ i4) * 18707) ^ (-2142376028);
                        i2 = 655630099;
                    } else {
                        iM45029 = C19806.m45029("᩵᩻") ^ i4;
                        i = ((iM45029 ^ i3) * (-4747)) ^ (-1663009367);
                        i2 = -1481180110;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1247735710:
                case -861183890:
                    if (i9 - (s * s3) >= 0) {
                        iM45029 = (C19806.m45029("ܺۖ") + i3) * 45;
                        i = ((iM45029 ^ i4) * (-23091)) ^ (-2102915699);
                        i2 = 1457234489;
                    } else {
                        iM45029 = C19806.m45029("᩹ܶ") ^ i4;
                        i = ((iM45029 ^ i3) * 12747) ^ (-1769791413);
                        i2 = -1805430898;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1074624194:
                case -974751507:
                    RunnableC1564.m5345();
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨ᩸") ^ i3;
                        i = ((iM45029 ^ i4) * (-26293)) ^ (-846348752);
                        i2 = 1892032299;
                    } else {
                        iM45029 = (i4 - C19806.m45029("᩸ۧ")) * 69;
                        i = ((iM45029 ^ i3) * 14847) ^ (-922629031);
                        i2 = -664075165;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -962331609:
                case 187286931:
                    C0050.m946();
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    iM45029 = ThreadFactoryC3888.m11306("ۨ᩸") ^ i3;
                    i = ((iM45029 ^ i4) * (-26293)) ^ (-846348752);
                    i2 = 1892032299;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -704665779:
                case 555304866:
                    C1668.m5582(iM450210 ^ i7);
                    c9764 = null;
                    if (C0671.f2816 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨ᩸") ^ i3;
                        i = ((iM45029 ^ i4) * (-26293)) ^ (-846348752);
                        i2 = 1892032299;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۚ") ^ i4;
                        i = ((iM45029 ^ i3) * 5927) ^ (-1905586910);
                        i2 = -1312485952;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -573244803:
                case 996326087:
                    c = 440;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (i4 - C19806.m45029("ۜܿ")) * (-127);
                        i = ((iM45029 ^ i3) * 14351) ^ (-1161780414);
                        i2 = 1703099266;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("֨ۖ")) * (-123);
                        i = ((iM45029 ^ i3) * 23365) ^ 244925429;
                        i2 = 94293875;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -119072461:
                case 478565551:
                    sArr = f16037;
                    if (C1189.f5284 <= 0) {
                        iM45029 = (i4 - C19806.m45029("᩸ۧ")) * 69;
                        i = ((iM45029 ^ i3) * 14847) ^ (-922629031);
                        i2 = -664075165;
                    } else {
                        iM45029 = C19806.m45029("ܽۜ") ^ i3;
                        i = ((iM45029 ^ i4) * 21003) ^ (-570818981);
                        i2 = 2001257499;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 5624071:
                case 650067270:
                    this.f16047 = c9764;
                    if (this.f16044.f42060 == 0) {
                        iM45029 = C19806.m45029("᩺ۖ") ^ i3;
                        i = ((iM45029 ^ i4) * (-28799)) ^ (-829012588);
                        i2 = 102235130;
                    } else {
                        iM45029 = (i4 - C19806.m45029("֡᩻")) * 55;
                        i = ((iM45029 ^ i3) * 1687) ^ (-1762317059);
                        i2 = -643501977;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 29057211:
                case 897450922:
                    i10 = 7096;
                    iM45029 = C19806.m45029("᩺ۨ") ^ i3;
                    i = ((iM45029 ^ i4) * (-17891)) ^ 2040650030;
                    i2 = -2137326055;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 52074700:
                case 1216713260:
                    i10 = 21788;
                    iM45029 = C19806.m45029("᩺ۨ") ^ i3;
                    i = ((iM45029 ^ i4) * (-17891)) ^ 2040650030;
                    i2 = -2137326055;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 252638237:
                case 1037637830:
                    s = sArr[c];
                    s2 = 17215;
                    if (C0671.f2816 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨ᩸") ^ i3;
                        i = ((iM45029 ^ i4) * (-26293)) ^ (-846348752);
                        i2 = 1892032299;
                    } else {
                        iM45029 = (C19806.m45029("᩵᩹") ^ i4) * (-115);
                        i = ((iM45029 ^ i3) * 17967) ^ 391411309;
                        i2 = 201554110;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 735346764:
                case 1022129752:
                    C1025.m3861();
                    break;
                case 998359793:
                case 1245600133:
                    if (this.f16055.f42060 == 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩷") ^ i4;
                        i = ((iM45029 ^ i3) * (-2905)) ^ 1816505609;
                        i2 = 1984037982;
                    } else {
                        iM45029 = (i4 - C19806.m45029("֡᩻")) * 55;
                        i = ((iM45029 ^ i3) * 1687) ^ (-1762317059);
                        i2 = -643501977;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1035726617:
                case 1385781268:
                    break;
                case 1100717810:
                case 1366162247:
                    s3 = 68860;
                    if (CallableC1627.f6528) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۖ۫")) * 37;
                        i = ((iM45029 ^ i3) * (-25135)) ^ (-730881363);
                        i2 = 672133724;
                    } else {
                        iM45029 = (i3 - C19806.m45029("۬᩺")) * 89;
                        i = ((iM45029 ^ i4) * (-5883)) ^ 575794634;
                        i2 = 2088235777;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1215445429:
                case 1901072673:
                    strM9788 = C3286.m9788(sArr2, i11, i8, i10);
                    if (C2704.m8255() <= 0) {
                        iM45029 = (i4 - C19806.m45029("᩸ۧ")) * 69;
                        i = ((iM45029 ^ i3) * 14847) ^ (-922629031);
                        i2 = -664075165;
                    } else {
                        iM45029 = (C19806.m45029("ۢۚ") + i4) * (-67);
                        i = ((iM45029 ^ i3) * 10497) ^ 336554659;
                        i2 = -2114502101;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    m12579(z);
                    m12584();
                    iM45029 = (i4 - C19806.m45029("֡᩻")) * 55;
                    i = ((iM45029 ^ i3) * 1687) ^ (-1762317059);
                    i2 = -643501977;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:92:0x08d3 A[PHI: r1 r4 r5 r6 r7 r10 r11 r15 r17 r18 r19 r20 r22 r26 r27 r29 r34 r35 r36
      0x08d3: PHI (r1v2 android.view.View) = 
      (r1v1 android.view.View)
      (r1v1 android.view.View)
      (r1v1 android.view.View)
      (r1v1 android.view.View)
      (r1v9 android.view.View)
     binds: [B:90:0x08a9, B:85:0x083a, B:72:0x06a5, B:11:0x00f8, B:6:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x08d3: PHI (r4v41 short[]) = (r4v8 short[]), (r4v10 short[]), (r4v25 short[]), (r37v1 short[]), (r4v46 short[]) binds: [B:90:0x08a9, B:85:0x083a, B:72:0x06a5, B:11:0x00f8, B:6:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x08d3: PHI (r5v5 android.content.pm.PackageInfo) = 
      (r5v2 android.content.pm.PackageInfo)
      (r5v4 android.content.pm.PackageInfo)
      (r5v2 android.content.pm.PackageInfo)
      (r5v2 android.content.pm.PackageInfo)
      (r5v2 android.content.pm.PackageInfo)
     binds: [B:90:0x08a9, B:85:0x083a, B:72:0x06a5, B:11:0x00f8, B:6:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x08d3: PHI (r6v30 int) = (r6v8 int), (r6v9 int), (r6v12 int), (r29v1 int), (r6v36 int) binds: [B:90:0x08a9, B:85:0x083a, B:72:0x06a5, B:11:0x00f8, B:6:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x08d3: PHI (r7v5 android.widget.TextView) = 
      (r7v1 android.widget.TextView)
      (r7v1 android.widget.TextView)
      (r7v4 android.widget.TextView)
      (r7v1 android.widget.TextView)
      (r7v1 android.widget.TextView)
     binds: [B:90:0x08a9, B:85:0x083a, B:72:0x06a5, B:11:0x00f8, B:6:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x08d3: PHI (r10v3 l.ܽᩴۘ) = (r10v2 l.ܽᩴۘ), (r10v2 l.ܽᩴۘ), (r10v2 l.ܽᩴۘ), (r10v2 l.ܽᩴۘ), (r10v8 l.ܽᩴۘ) binds: [B:90:0x08a9, B:85:0x083a, B:72:0x06a5, B:11:0x00f8, B:6:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x08d3: PHI (r11v5 android.widget.TextView) = 
      (r11v2 android.widget.TextView)
      (r11v2 android.widget.TextView)
      (r11v4 android.widget.TextView)
      (r11v2 android.widget.TextView)
      (r11v2 android.widget.TextView)
     binds: [B:90:0x08a9, B:85:0x083a, B:72:0x06a5, B:11:0x00f8, B:6:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x08d3: PHI (r15v26 int) = (r15v8 int), (r15v9 int), (r15v15 int), (r38v1 int), (r15v28 int) binds: [B:90:0x08a9, B:85:0x083a, B:72:0x06a5, B:11:0x00f8, B:6:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x08d3: PHI (r17v27 android.view.View) = 
      (r17v8 android.view.View)
      (r17v9 android.view.View)
      (r17v12 android.view.View)
      (r17v21 android.view.View)
      (r17v33 android.view.View)
     binds: [B:90:0x08a9, B:85:0x083a, B:72:0x06a5, B:11:0x00f8, B:6:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x08d3: PHI (r18v5 android.widget.TextView) = 
      (r18v4 android.widget.TextView)
      (r18v2 android.widget.TextView)
      (r18v2 android.widget.TextView)
      (r18v2 android.widget.TextView)
      (r18v2 android.widget.TextView)
     binds: [B:90:0x08a9, B:85:0x083a, B:72:0x06a5, B:11:0x00f8, B:6:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x08d3: PHI (r19v7 java.lang.String) = 
      (r19v6 java.lang.String)
      (r19v2 java.lang.String)
      (r19v2 java.lang.String)
      (r19v2 java.lang.String)
      (r19v2 java.lang.String)
     binds: [B:90:0x08a9, B:85:0x083a, B:72:0x06a5, B:11:0x00f8, B:6:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x08d3: PHI (r20v4 android.view.View) = 
      (r20v2 android.view.View)
      (r20v3 android.view.View)
      (r20v2 android.view.View)
      (r20v2 android.view.View)
      (r20v2 android.view.View)
     binds: [B:90:0x08a9, B:85:0x083a, B:72:0x06a5, B:11:0x00f8, B:6:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x08d3: PHI (r22v4 int) = (r22v2 int), (r22v2 int), (r22v3 int), (r22v2 int), (r22v2 int) binds: [B:90:0x08a9, B:85:0x083a, B:72:0x06a5, B:11:0x00f8, B:6:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x08d3: PHI (r26v19 android.widget.TextView) = 
      (r26v7 android.widget.TextView)
      (r26v8 android.widget.TextView)
      (r26v11 android.widget.TextView)
      (r26v16 android.widget.TextView)
      (r26v25 android.widget.TextView)
     binds: [B:90:0x08a9, B:85:0x083a, B:72:0x06a5, B:11:0x00f8, B:6:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x08d3: PHI (r27v19 java.lang.String) = 
      (r27v7 java.lang.String)
      (r27v8 java.lang.String)
      (r27v11 java.lang.String)
      (r27v16 java.lang.String)
      (r27v25 java.lang.String)
     binds: [B:90:0x08a9, B:85:0x083a, B:72:0x06a5, B:11:0x00f8, B:6:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x08d3: PHI (r29v23 java.lang.String) = 
      (r29v7 java.lang.String)
      (r29v8 java.lang.String)
      (r29v11 java.lang.String)
      (r29v18 java.lang.String)
      (r29v28 java.lang.String)
     binds: [B:90:0x08a9, B:85:0x083a, B:72:0x06a5, B:11:0x00f8, B:6:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x08d3: PHI (r34v28 android.widget.TextView) = 
      (r34v11 android.widget.TextView)
      (r34v13 android.widget.TextView)
      (r34v16 android.widget.TextView)
      (r34v24 android.widget.TextView)
      (r34v34 android.widget.TextView)
     binds: [B:90:0x08a9, B:85:0x083a, B:72:0x06a5, B:11:0x00f8, B:6:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x08d3: PHI (r35v22 l.۠ۡۜ) = (r35v5 l.۠ۡۜ), (r35v6 l.۠ۡۜ), (r35v9 l.۠ۡۜ), (r35v16 l.۠ۡۜ), (r35v26 l.۠ۡۜ) binds: [B:90:0x08a9, B:85:0x083a, B:72:0x06a5, B:11:0x00f8, B:6:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x08d3: PHI (r36v19 java.lang.String) = 
      (r36v7 java.lang.String)
      (r36v8 java.lang.String)
      (r36v11 java.lang.String)
      (r36v17 java.lang.String)
      (r36v23 java.lang.String)
     binds: [B:90:0x08a9, B:85:0x083a, B:72:0x06a5, B:11:0x00f8, B:6:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0132, code lost:
    
        if (l.C7105.f23796 < 0) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m12569(final l.ViewOnClickListenerC4514 r41, final l.ViewOnClickListenerC2001 r42) {
        /*
            Method dump skipped, instruction units count: 2712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC4514.m12569(l.ۙ۠ۘ, l.֫ᩴۘ):void");
    }

    /* JADX WARN: Code duplicated, block: B:77:0x02c7 A[PHI: r6
      0x02c7: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:76:0x02c5, B:56:0x01cc, B:12:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (l.C1977.f7413 <= 0) goto L15;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m12573(l.ViewOnClickListenerC4514 r17, l.C16819 r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC4514.m12573(l.ۙ۠ۘ, l.ܽᩴۘ, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0106, code lost:
    
        if (l.ViewGroupOnHierarchyChangeListenerC1916.f7262 != false) goto L13;
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
    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m12557() {
        /*
            Method dump skipped, instruction units count: 2058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC4514.m12557():void");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0066  */
    /* JADX WARN: Code duplicated, block: B:51:0x01bd A[PHI: r11
      0x01bd: PHI (r11v5 int) = (r11v3 int), (r11v2 int) binds: [B:50:0x01bb, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x022e A[PHI: r9 r10 r14 r15 r22
      0x022e: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:62:0x022c, B:54:0x01f0, B:35:0x0126, B:31:0x0108, B:15:0x0084, B:13:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x022e: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:62:0x022c, B:54:0x01f0, B:35:0x0126, B:31:0x0108, B:15:0x0084, B:13:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x022e: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:62:0x022c, B:54:0x01f0, B:35:0x0126, B:31:0x0108, B:15:0x0084, B:13:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x022e: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:62:0x022c, B:54:0x01f0, B:35:0x0126, B:31:0x0108, B:15:0x0084, B:13:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x022e: PHI (r22v5 short) = (r22v4 short), (r22v3 short), (r22v3 short), (r22v3 short), (r22v3 short), (r22v3 short) binds: [B:62:0x022c, B:54:0x01f0, B:35:0x0126, B:31:0x0108, B:15:0x0084, B:13:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x025f A[PHI: r3 r4 r5 r6 r8
      0x025f: PHI (r3v3 l.᩷۠ۚ) = (r3v2 l.᩷۠ۚ), (r3v2 l.᩷۠ۚ), (r3v4 l.᩷۠ۚ) binds: [B:66:0x025d, B:58:0x020f, B:23:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r4v3 short[]) = (r4v2 short[]), (r4v2 short[]), (r4v4 short[]) binds: [B:66:0x025d, B:58:0x020f, B:23:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v4 int) binds: [B:66:0x025d, B:58:0x020f, B:23:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:66:0x025d, B:58:0x020f, B:23:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:66:0x025d, B:58:0x020f, B:23:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0293 A[PHI: r1 r13 r16 r17
      0x0293: PHI (r1v4 l.ۛۧ᩺) = (r1v2 l.ۛۧ᩺), (r1v3 l.ۛۧ᩺), (r1v2 l.ۛۧ᩺), (r1v2 l.ۛۧ᩺) binds: [B:70:0x0291, B:39:0x0148, B:13:0x0080, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:70:0x0291, B:39:0x0148, B:13:0x0080, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:70:0x0291, B:39:0x0148, B:13:0x0080, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:70:0x0291, B:39:0x0148, B:13:0x0080, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m12582() {
        int iM11306;
        int i;
        int i2;
        int i3 = RunnableC0195.f1321;
        int i4 = C1461.f5957;
        int iM45029 = (C19806.m45029("ۚܶ") ^ i3) * (-117);
        int i5 = ((iM45029 ^ i4) * (-17351)) ^ 904204618;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM45029 ^ (-1941495261);
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        char c = 0;
        int i15 = 780765791;
        short s2 = 0;
        AbstractC20745 abstractC20745M29695 = null;
        String strM7076 = null;
        InterfaceC6025 interfaceC6025 = null;
        while (true) {
            i15 = i6 ^ (i5 & (((i15 ^ i4) * (-19235)) >> 31));
            switch (i15) {
                case -2123329645:
                case 1600382336:
                    i14 = 16;
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۖ") ^ i4;
                        i = ((iM11306 ^ i3) * (-8631)) ^ (-928764947);
                        i2 = -1515859703;
                    } else {
                        iM11306 = C19806.m45029("ܽۨ") ^ i3;
                        i = ((iM11306 ^ i4) * (-20321)) ^ (-640577569);
                        i2 = -189301109;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -2044140893:
                case -1740297659:
                    i12 = 29157;
                    iM11306 = (ThreadFactoryC3888.m11306("۟ۘ") + i4) * (-125);
                    i = ((iM11306 ^ i3) * 17007) ^ (-219989649);
                    i2 = 1308844847;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1813540282:
                case 659651098:
                    sArr = f16037;
                    c = 272;
                    if (C0526.f2219) {
                        iM11306 = C19806.m45029("᩶᩵") ^ i4;
                        i = ((iM11306 ^ i3) * (-16265)) ^ (-1563395560);
                        i2 = -1069811623;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧܺ") ^ i3) * (-29);
                        i = ((iM11306 ^ i4) * (-23721)) ^ (-1426488923);
                        i2 = 859803852;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1799423122:
                case -39197740:
                    i13 = 273;
                    if (C2642.f10294 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۖ") ^ i4;
                        i = ((iM11306 ^ i3) * (-8631)) ^ (-928764947);
                        i2 = -1515859703;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ۟") ^ i4;
                        i = ((iM11306 ^ i3) * 8301) ^ (-284030886);
                        i2 = 117834782;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1742279333:
                case 1932890845:
                    interfaceC6025 = ApplicationC0716.f2992;
                    sArr2 = f16037;
                    if (C0216.m1591() <= 0) {
                        iM11306 = C19806.m45029("᩶᩵") ^ i4;
                        i = ((iM11306 ^ i3) * (-16265)) ^ (-1563395560);
                        i2 = -1069811623;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ۢ") ^ i3;
                        i = ((iM11306 ^ i4) * 23597) ^ (-1267186415);
                        i2 = 929568506;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1738699963:
                case 765716196:
                    C3577.m10565();
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    iM11306 = ThreadFactoryC3888.m11306("ۧۖ") ^ i4;
                    i = ((iM11306 ^ i3) * (-8631)) ^ (-928764947);
                    i2 = -1515859703;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1668385195:
                case 1187275007:
                    return C3722.m10895(strM7076, new String[0]);
                case -1368684674:
                case 1667817885:
                    if (i8 - (i11 + i11) > 0) {
                        iM11306 = C19806.m45029("᩻ܰ") ^ i3;
                        i = ((iM11306 ^ i4) * (-28839)) ^ 22294907;
                        i2 = 999538691;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟֨") + i4) * (-29);
                        i = ((iM11306 ^ i3) * 25285) ^ 93334572;
                        i2 = -796258119;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1197721122:
                case 1869688031:
                    int i16 = s + s2;
                    i8 = i16 * i16;
                    if (RunnableC1895.f7152) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۙ") ^ i3;
                        i = ((iM11306 ^ i4) * 1015) ^ 242723601;
                        i2 = 1636190728;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ܳ᩺")) * (-91);
                        i = ((iM11306 ^ i3) * (-2531)) ^ 391828311;
                        i2 = 231706566;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1177085084:
                case 174761026:
                    abstractC20745M29695 = C11904.m29695();
                    sArr3 = f16037;
                    i7 = 289;
                    if (RunnableC1564.f6300) {
                        iM11306 = (i4 - C19806.m45029("ܳ᩺")) * (-91);
                        i = ((iM11306 ^ i3) * (-2531)) ^ 391828311;
                        i2 = 231706566;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽᩳ") ^ i4) * (-93);
                        i = ((iM11306 ^ i3) * 8953) ^ (-951599037);
                        i2 = 954201247;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1058097047:
                case 1466060691:
                    strM7076 = C2332.m7076(interfaceC6025, C1937.m6288(sArr2, i13, i14, i12), null);
                    if (strM7076 != null) {
                        iM11306 = (C19806.m45029("᩹ۤ") + i3) * (-31);
                        i = ((iM11306 ^ i4) * 3899) ^ (-1309839067);
                        i2 = 1853011681;
                    } else {
                        iM11306 = (C19806.m45029("᩵ۙ") + i3) * 53;
                        i = ((iM11306 ^ i4) * 9121) ^ (-724987514);
                        i2 = 1378323559;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1034716540:
                case 723555532:
                    i9 = s * s;
                    i10 = 26697889;
                    if (C3535.f13026 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۖ") ^ i4;
                        i = ((iM11306 ^ i3) * (-8631)) ^ (-928764947);
                        i2 = -1515859703;
                    } else {
                        iM11306 = C19806.m45029("ܶܺ") ^ i4;
                        i = ((iM11306 ^ i3) * 20845) ^ 1085162850;
                        i2 = 948069838;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -733963410:
                case 1651589136:
                    s2 = 5167;
                    if (C1148.f5161 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۖ") ^ i4;
                        i = ((iM11306 ^ i3) * (-8631)) ^ (-928764947);
                        i2 = -1515859703;
                    } else {
                        iM11306 = C19806.m45029("ܺۛ") ^ i4;
                        i = ((iM11306 ^ i3) * (-2655)) ^ 1858431408;
                        i2 = -520494436;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -606503200:
                case 55361647:
                    return C1668.m5585(abstractC20745M29695, CallableC1627.m5502(sArr3, i7, 4, i12));
                case -585052741:
                case -72530226:
                    if (C2704.f10408) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۖ") ^ i4;
                        i = ((iM11306 ^ i3) * (-8631)) ^ (-928764947);
                        i2 = -1515859703;
                    } else {
                        iM11306 = C19806.m45029("᩶᩵") ^ i4;
                        i = ((iM11306 ^ i3) * (-16265)) ^ (-1563395560);
                        i2 = -1069811623;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -322875968:
                case 457506531:
                    C1148.m4232();
                    if (C1977.f7413 <= 0) {
                        iM11306 = C19806.m45029("᩶᩵") ^ i4;
                        i = ((iM11306 ^ i3) * (-16265)) ^ (-1563395560);
                        i2 = -1069811623;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۢ᩵")) * 61;
                        i = ((iM11306 ^ i4) * 20693) ^ 907966826;
                        i2 = -233330098;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -37736347:
                case 1754102143:
                    C0962.m3746();
                    return null;
                case -26547985:
                case 1625800361:
                    i11 = i9 + i10;
                    if (C1875.f7103 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷۠") ^ i3;
                        i = ((iM11306 ^ i4) * 23371) ^ 1599756816;
                        i2 = 1326948570;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ᩸") ^ i3;
                        i = ((iM11306 ^ i4) * 321) ^ 1522886125;
                        i2 = 230599507;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 292128418:
                case 753217501:
                    i12 = 11990;
                    iM11306 = (ThreadFactoryC3888.m11306("۟ۘ") + i4) * (-125);
                    i = ((iM11306 ^ i3) * 17007) ^ (-219989649);
                    i2 = 1308844847;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 622032332:
                case 1138894572:
                    s = sArr[c];
                    if (C1066.f4915 <= 0) {
                        iM11306 = (i4 - C19806.m45029("ܳ᩺")) * (-91);
                        i = ((iM11306 ^ i3) * (-2531)) ^ 391828311;
                        i2 = 231706566;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۖ") ^ i4;
                        i = ((iM11306 ^ i3) * (-23247)) ^ (-201279007);
                        i2 = 974603916;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    C1875.m6086();
                    if (C1398.f5802 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ۢ᩵")) * 61;
                        i = ((iM11306 ^ i4) * 20693) ^ 907966826;
                        i2 = -233330098;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷۠") ^ i3;
                        i = ((iM11306 ^ i4) * 23371) ^ 1599756816;
                        i2 = 1326948570;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public void m12558() {
        C12586 c12586 = null;
        C0590 c0590 = null;
        boolean z = false;
        InterfaceC13722 interfaceC13722ListIterator = null;
        C0590 c0591 = null;
        InterfaceC13722 interfaceC13722ListIterator2 = null;
        C12586 c12587 = null;
        C0590 c0592 = null;
        C12586 c12588 = null;
        int i = 191285822;
        int i2 = C0278.f1572;
        int i3 = RunnableC1606.f6488;
        int iM45029 = (C19806.m45029("ܺۙ") ^ i2) * 87;
        int i4 = ((iM45029 ^ i3) * 11919) ^ (-242110953);
        int i5 = -516095579;
        while (true) {
            i = ((((i ^ i3) * 24375) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2084844497:
                case -1924481551:
                    C1398.m4901(c12588.f42057);
                    if (C3286.f12186) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺۟") ^ i3) * 41;
                        i4 = ((iM45029 ^ i2) * (-15933)) ^ (-1936900193);
                        i5 = 1895060688;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ۠") + i2) * 45;
                        i4 = ((iM45029 ^ i3) * 7955) ^ 495407753;
                        i5 = -4004003;
                    }
                    break;
                case -2056349395:
                case -743007696:
                    c0590 = c12586.f42057;
                    if (C1668.m5583()) {
                        iM45029 = (C19806.m45029("ۡۚ") ^ i2) * (-121);
                        i4 = ((iM45029 ^ i3) * 30909) ^ 753499127;
                        i5 = -1685157466;
                    } else {
                        iM45029 = (C19806.m45029("ۖ֫") + i3) * (-27);
                        i4 = ((iM45029 ^ i2) * 22993) ^ 460327395;
                        i5 = 487040011;
                    }
                    break;
                case -1982212908:
                case -865180767:
                    interfaceC13722ListIterator = c0590.f2562.listIterator(0);
                    z = false;
                    iM45029 = (i3 - C19806.m45029("᩶᩷")) * 49;
                    i4 = ((iM45029 ^ i2) * (-27759)) ^ 1735044747;
                    i5 = 318052250;
                    break;
                case -1924214173:
                case 475326723:
                    if (C0962.m3748(interfaceC13722ListIterator2)) {
                        iM45029 = (C19806.m45029("۠ۙ") + i2) * 71;
                        i4 = ((iM45029 ^ i3) * 1667) ^ 338500529;
                        i5 = 1203829974;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿܶ") + i3) * 79;
                        i4 = ((iM45029 ^ i2) * 9409) ^ 111975054;
                        i5 = 91035075;
                    }
                    break;
                case -1732458936:
                case -774833749:
                    this.f16057 = z;
                    if (C1148.f5161 <= 0) {
                        iM45029 = C19806.m45029("ۙۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 26729) ^ (-1061151794);
                        i5 = -2030475287;
                    } else {
                        iM45029 = (C19806.m45029("᩹ܺ") + i3) * (-7);
                        i4 = ((iM45029 ^ i2) * 16883) ^ 620826590;
                        i5 = -2076203280;
                    }
                    break;
                case -1686528300:
                case 251730238:
                    ((C16819) C0278.m1776(interfaceC13722ListIterator)).f53833 = z;
                    iM45029 = (i3 - C19806.m45029("᩶᩷")) * 49;
                    i4 = ((iM45029 ^ i2) * (-27759)) ^ 1735044747;
                    i5 = 318052250;
                    break;
                case -1457340278:
                case 1345782191:
                    C0671.m3008();
                    if (C3535.m10431() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛ۠") ^ i2) * (-59);
                        i4 = ((iM45029 ^ i3) * 11287) ^ 2033013972;
                        i5 = 1303994854;
                    } else {
                        iM45029 = C19806.m45029("ۙۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 26729) ^ (-1061151794);
                        i5 = -2030475287;
                    }
                    break;
                case -1108068962:
                case 934392463:
                    c12588 = this.f16055;
                    c12588.f42060 = z ? 1 : 0;
                    if (C19806.f63586) {
                        iM45029 = (C19806.m45029("ۖ֫") + i3) * (-27);
                        i4 = ((iM45029 ^ i2) * 22993) ^ 460327395;
                        i5 = 487040011;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("۬ۛ")) * (-61);
                        i4 = ((iM45029 ^ i2) * 10085) ^ (-1449792942);
                        i5 = 1418472458;
                    }
                    break;
                case -922883921:
                case 1811812214:
                    ((C16819) C0278.m1776(interfaceC13722ListIterator2)).f53833 = z;
                    iM45029 = ThreadFactoryC3888.m11306("֫ۘ") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-11021)) ^ 741059350;
                    i5 = -209483434;
                    break;
                case -885188374:
                case 1703706187:
                    if (C0817.f3443) {
                        iM45029 = (C19806.m45029("ۢܶ") ^ i2) * 7;
                        i4 = ((iM45029 ^ i3) * 31451) ^ (-533074702);
                        i5 = 502367637;
                    } else {
                        iM45029 = (C19806.m45029("ۖ֫") + i3) * (-27);
                        i4 = ((iM45029 ^ i2) * 22993) ^ 460327395;
                        i5 = 487040011;
                    }
                    break;
                case -720974412:
                case 1594039047:
                    c0592 = c12587.f42057;
                    if (C2871.f10837 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺۟") ^ i3) * 41;
                        i4 = ((iM45029 ^ i2) * (-15933)) ^ (-1936900193);
                        i5 = 1895060688;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ᩳۗ")) * (-21);
                        i4 = ((iM45029 ^ i2) * 15855) ^ (-309498238);
                        i5 = 664044266;
                    }
                    break;
                case -494792659:
                case -247198838:
                    c12586 = this.f16044;
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛ۠") ^ i2) * (-59);
                        i4 = ((iM45029 ^ i3) * 11287) ^ 2033013972;
                        i5 = 1303994854;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-28663)) ^ (-208687433);
                        i5 = -1973740086;
                    }
                    break;
                case -180495871:
                case 416408765:
                    m12579(z);
                    m12584();
                    break;
                case -178578435:
                case 1002424950:
                    if (RunnableC1564.m5348(interfaceC13722ListIterator)) {
                        iM45029 = (C19806.m45029("ܳۢ") + i2) * (-41);
                        i4 = ((iM45029 ^ i3) * 29837) ^ (-49442000);
                        i5 = -592313650;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-12145)) ^ 318656055;
                        i5 = -518698576;
                    }
                    break;
                case 110087618:
                case 569895082:
                    c12587 = this.f16044;
                    c12587.f42060 = z ? 1 : 0;
                    if (C19806.f63586) {
                        iM45029 = (C19806.m45029("ܰۢ") + i2) * (-5);
                        i4 = ((iM45029 ^ i3) * (-9251)) ^ 825683715;
                        i5 = 1053646133;
                    } else {
                        iM45029 = C19806.m45029("᩷ۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-3083)) ^ 1774499113;
                        i5 = 1115104045;
                    }
                    break;
                case 247621097:
                case 1654843516:
                    c0591 = this.f16055.f42057;
                    if (C0817.f3443) {
                        iM45029 = C19806.m45029("ܶܽ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 13755) ^ 562589319;
                        i5 = 884021644;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺۟") ^ i3) * 41;
                        i4 = ((iM45029 ^ i2) * (-15933)) ^ (-1936900193);
                        i5 = 1895060688;
                    }
                    break;
                case 350049510:
                case 2027443820:
                    C3535.m10431();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺۟") ^ i3) * 41;
                        i4 = ((iM45029 ^ i2) * (-15933)) ^ (-1936900193);
                        i5 = 1895060688;
                    } else {
                        iM45029 = (C19806.m45029("ܰۢ") + i2) * (-5);
                        i4 = ((iM45029 ^ i3) * (-9251)) ^ 825683715;
                        i5 = 1053646133;
                    }
                    break;
                case 435051989:
                case 1289988332:
                    RunnableC1564.m5345();
                    if (C3535.f13026 > 0) {
                        iM45029 = (C19806.m45029("ܰۢ") + i2) * (-5);
                        i4 = ((iM45029 ^ i3) * (-9251)) ^ 825683715;
                        i5 = 1053646133;
                    } else {
                        iM45029 = C19806.m45029("ۙۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 26729) ^ (-1061151794);
                        i5 = -2030475287;
                    }
                    break;
                case 545165480:
                case 1764649503:
                    C1148.m4232();
                    break;
                case 700906540:
                case 1843651075:
                    interfaceC13722ListIterator2 = c0591.f2562.listIterator(z ? 1 : 0);
                    iM45029 = ThreadFactoryC3888.m11306("֫ۘ") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-11021)) ^ 741059350;
                    i5 = -209483434;
                    break;
                case 1382363062:
                case 1899789114:
                    C2642.m8171();
                    C0526.m2437();
                    iM45029 = C19806.m45029("ۙۧ") ^ i3;
                    i4 = ((iM45029 ^ i2) * 26729) ^ (-1061151794);
                    i5 = -2030475287;
                    break;
                default:
                    C1398.m4901(c0592);
                    if (C0817.f3443) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ֨") ^ i2) * (-11);
                        i4 = ((iM45029 ^ i3) * (-29575)) ^ (-1247469134);
                        i5 = 103657405;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛ۠") ^ i2) * (-59);
                        i4 = ((iM45029 ^ i3) * 11287) ^ 2033013972;
                        i5 = 1303994854;
                    }
                    break;
            }
            return;
        }
    }
}
