package l;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۜۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: J5HS */
/* JADX INFO: loaded from: classes2.dex */
public class C6606 extends ListView {

    /* JADX INFO: renamed from: ۘܿᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f22229 = {346, -22782, -22770, -22772, -22705, -22782, -22784, -22772, -22780, -22771, -22705, -22765, -22764, -22769, -22763, -22776, -22772, -22780, -22705, -22737, -22784, -22763, -22776, -22761, -22780, -22748, -22769, -22778, -22776, -22769, -22780, -22772, -22763, -22759, -22705, -22737, -22784, -22763, -22776, -22761, -22780, -22746, -22764, -22784, -22765, -22779};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f22230;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public AbsListView.OnScrollListener f22231;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f22232;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f22233;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f22234;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public long f22235;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C22398 f22236;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f22237;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f22238;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public boolean f22239;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f22240;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f22241;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final HandlerC12957 f22242;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f22243;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f22244;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f22245;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f22246;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f22247;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public View.OnTouchListener f22248;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f22249;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C17381 f22250;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f22251;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public boolean f22252;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final DataSetObserver f22253;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public float f22254;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public AdapterView.OnItemLongClickListener f22255;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f22256;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f22257;

    static {
        boolean z = false;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1734438430;
        int i5 = C1668.f6641;
        int i6 = C0278.f1572;
        int iM45029 = (C19806.m45029("ۤ᩸") ^ i6) * 19;
        int i7 = ((iM45029 ^ i5) * 30035) ^ 1492206646;
        int i8 = -5358502;
        while (true) {
            i4 = ((((i4 ^ i5) * (-523)) >> 31) & i7) ^ (iM45029 ^ i8);
            switch (i4) {
                case -2087546824:
                case 91865619:
                    if (C0671.f2816 != 0) {
                        iM45029 = (C19806.m45029("ۛܰ") + i6) * 83;
                        i7 = ((iM45029 ^ i5) * 26481) ^ 214547156;
                        i8 = -1611503305;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿܿ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-9149)) ^ (-1125321742);
                        i8 = -1563396410;
                    }
                    break;
                case -2029594142:
                case 1411691798:
                    if (i - (i2 * i2) <= 0) {
                        iM45029 = C19806.m45029("ܶۢ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-6847)) ^ (-1590305259);
                        i8 = 1833335516;
                    } else {
                        iM45029 = (C19806.m45029("᩻᩷") ^ i6) * (-7);
                        i7 = ((iM45029 ^ i5) * (-261)) ^ 421389608;
                        i8 = -1775538366;
                    }
                    break;
                case -2023983673:
                case -800510509:
                    sArr = f22229;
                    c = 0;
                    if (C1977.f7413 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܽ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-13721)) ^ (-1628143176);
                        i8 = -1264115546;
                    } else {
                        iM45029 = C19806.m45029("᩺۬") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-31129)) ^ (-722301591);
                        i8 = -414100238;
                    }
                    break;
                case -1774731002:
                case -1742020504:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܽ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-13721)) ^ (-1628143176);
                        i8 = -1264115546;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤܿ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 9905) ^ 1134546380;
                        i8 = -518894621;
                    }
                    break;
                case -1514762648:
                case -766936827:
                    try {
                        Class.forName(C3577.m10571(f22229, 1, 30, i3));
                        C21506.f69876 = z;
                        break;
                    } catch (Exception unused) {
                    }
                    iM45029 = (ThreadFactoryC3888.m11306("᩶ᩳ") + i5) * (-61);
                    i7 = ((iM45029 ^ i6) * 17495) ^ (-579319976);
                    i8 = 291266182;
                    break;
                case -1476754143:
                case -1387888355:
                    i3 = 11408;
                    iM45029 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i5;
                    i7 = ((iM45029 ^ i6) * 4577) ^ 831300546;
                    i8 = -1008730600;
                    break;
                case -1445783449:
                case 1544291341:
                    C1419.m4973();
                    iM45029 = (ThreadFactoryC3888.m11306("ܳۧ") ^ i5) * (-67);
                    i7 = ((iM45029 ^ i6) * (-23279)) ^ (-999266318);
                    i8 = -1274781541;
                    break;
                case -1149872431:
                case -402636853:
                    i2 = s + 16611;
                    if (C19806.m45024()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶܿ") + i5) * (-33);
                        i7 = ((iM45029 ^ i6) * (-5367)) ^ (-938469709);
                        i8 = 1699642878;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("۠᩹")) * (-85);
                        i7 = ((iM45029 ^ i6) * 21335) ^ 2093113255;
                        i8 = 863511776;
                    }
                    break;
                case -991871858:
                case -284467964:
                    C2332.m7079();
                    throw new RuntimeException();
                case -989646845:
                case 900365753:
                    if (C3660.f13403 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܽ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-13721)) ^ (-1628143176);
                        i8 = -1264115546;
                    } else {
                        iM45029 = C19806.m45029("᩶ۚ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-3495)) ^ (-1941933600);
                        i8 = 1367036328;
                    }
                    break;
                case -837769012:
                case 417868303:
                    if (!C2332.f8260) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۧ") ^ i5) * (-67);
                        i7 = ((iM45029 ^ i6) * (-23279)) ^ (-999266318);
                        i8 = -1274781541;
                    } else {
                        iM45029 = (C19806.m45029("ۛܰ") + i6) * 83;
                        i7 = ((iM45029 ^ i5) * 26481) ^ 214547156;
                        i8 = -1611503305;
                    }
                    break;
                case -649922217:
                case 299220899:
                    if (C1419.f5860 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶܿ") + i5) * (-33);
                        i7 = ((iM45029 ^ i6) * (-5367)) ^ (-938469709);
                        i8 = 1699642878;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸۟") ^ i6;
                        i7 = ((iM45029 ^ i5) * 22267) ^ (-1789749176);
                        i8 = -109656727;
                    }
                    break;
                case -618817408:
                case 216072091:
                    i = 66444 * s;
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶۠") ^ i5) * (-123);
                        i7 = ((iM45029 ^ i6) * (-21271)) ^ 824197597;
                        i8 = 547190278;
                    } else {
                        iM45029 = C19806.m45029("ۨܳ") ^ i6;
                        i7 = ((iM45029 ^ i5) * 18215) ^ (-496748705);
                        i8 = -176692761;
                    }
                    break;
                case -568972432:
                case 1881703391:
                    if (RunnableC1564.m5345()) {
                        iM45029 = (C19806.m45029("ۛܰ") + i6) * 83;
                        i7 = ((iM45029 ^ i5) * 26481) ^ 214547156;
                        i8 = -1611503305;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩵") ^ i6;
                        i7 = ((iM45029 ^ i5) * 13693) ^ 1880625002;
                        i8 = 1908102037;
                    }
                    break;
                case -469566103:
                case 648512708:
                    s = sArr[c];
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶۠") ^ i5) * (-123);
                        i7 = ((iM45029 ^ i6) * (-21271)) ^ 824197597;
                        i8 = 547190278;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩵") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-21689)) ^ 652864112;
                        i8 = -1684346303;
                    }
                    break;
                case -441130167:
                case -45752374:
                    return;
                case -163218258:
                case -96702417:
                    i3 = 42849;
                    iM45029 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i5;
                    i7 = ((iM45029 ^ i6) * 4577) ^ 831300546;
                    i8 = -1008730600;
                    break;
                case -156996318:
                case 474464870:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("֫᩵")) * (-65);
                        i7 = ((iM45029 ^ i5) * 11175) ^ 1887748650;
                        i8 = 483497963;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۨ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-7649)) ^ (-846976652);
                        i8 = 11058766;
                    }
                    break;
                case -138967662:
                case 17029599:
                    try {
                        Class.forName(RunnableC1606.m5481(f22229, 31, 15, i3));
                        C21506.f69876 = z;
                        break;
                    } catch (Exception unused2) {
                    }
                    iM45029 = (C19806.m45029("᩸ܶ") ^ i6) * (-89);
                    i7 = ((iM45029 ^ i5) * (-29319)) ^ (-1404298477);
                    i8 = 1071506245;
                    break;
                case -83506535:
                case 501180411:
                    C1377.m4833();
                    if (C2477.f9839 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܽ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-13721)) ^ (-1628143176);
                        i8 = -1264115546;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۧ") ^ i5) * (-67);
                        i7 = ((iM45029 ^ i6) * (-23279)) ^ (-999266318);
                        i8 = -1274781541;
                    }
                    break;
                case 96227632:
                case 1825357638:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("֫᩵")) * (-65);
                        i7 = ((iM45029 ^ i5) * 11175) ^ 1887748650;
                        i8 = 483497963;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("᩺ᩴ")) * 37;
                        i7 = ((iM45029 ^ i5) * 21491) ^ (-647726511);
                        i8 = 1153484946;
                    }
                    break;
                case 305086243:
                case 1592902060:
                    if (!C1377.f5749) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܽ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-13721)) ^ (-1628143176);
                        i8 = -1264115546;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶܿ") + i5) * (-33);
                        i7 = ((iM45029 ^ i6) * (-5367)) ^ (-938469709);
                        i8 = 1699642878;
                    }
                    break;
                case 906119293:
                case 1420175821:
                    z = true;
                    iM45029 = (ThreadFactoryC3888.m11306("֡ܽ") ^ i6) * (-15);
                    i7 = ((iM45029 ^ i5) * (-7715)) ^ 131315465;
                    i8 = -1749733330;
                    break;
                case 1564490584:
                case 1986558887:
                    C0216.m1591();
                    if (C3660.m10791() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۨ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-7649)) ^ (-846976652);
                        i8 = 11058766;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۧ") ^ i5) * (-67);
                        i7 = ((iM45029 ^ i6) * (-23279)) ^ (-999266318);
                        i8 = -1274781541;
                    }
                    break;
                default:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۨ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-7649)) ^ (-846976652);
                        i8 = 11058766;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ܳ֨")) * (-27);
                        i7 = ((iM45029 ^ i5) * (-991)) ^ (-103149487);
                        i8 = 1036533709;
                    }
                    break;
            }
        }
    }

    @Override // android.widget.ListView, android.widget.AdapterView
    public final void setSelection(int i) {
        int i2 = -2062688910;
        int i3 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int i4 = C1189.f5284;
        int iM11306 = ThreadFactoryC3888.m11306("᩷ܶ") ^ i4;
        int i5 = ((iM11306 ^ i3) * (-31625)) ^ 1800136607;
        int i6 = -1223397369;
        while (true) {
            i2 = ((((i2 ^ i3) * 26063) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -1926106774:
                case 1796682399:
                    if (C2477.f9839 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ۬") ^ i4) * 23;
                        i5 = ((iM11306 ^ i3) * 5419) ^ 469195205;
                        i6 = 752823100;
                    } else {
                        iM11306 = (C19806.m45029("ۨۤ") ^ i3) * (-109);
                        i5 = ((iM11306 ^ i4) * (-8141)) ^ (-599339299);
                        i6 = -1896321636;
                    }
                    break;
                case -1759496438:
                case 1794898658:
                    super.setSelection(i);
                    if (C2871.f10837 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘۘ") + i4) * (-69);
                        i5 = ((iM11306 ^ i3) * 3239) ^ 48664383;
                        i6 = -1089784018;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ۬") ^ i3;
                        i5 = ((iM11306 ^ i4) * 31119) ^ (-391698821);
                        i6 = -1853903607;
                    }
                    break;
                case -1752006822:
                case -666613875:
                    if (C1189.m4368() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨۠") ^ i3;
                        i5 = ((iM11306 ^ i4) * 32395) ^ (-1394967785);
                        i6 = 520718896;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܶ᩵")) * (-39);
                        i5 = ((iM11306 ^ i3) * (-2115)) ^ (-145174378);
                        i6 = -939447235;
                    }
                    break;
                case -1357006655:
                case 892456534:
                    if (C2788.m8472() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘۘ") + i4) * (-69);
                        i5 = ((iM11306 ^ i3) * 3239) ^ 48664383;
                        i6 = -1089784018;
                    } else {
                        iM11306 = C19806.m45029("᩷ۗ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-22137)) ^ (-1083476087);
                        i6 = 1962390846;
                    }
                    break;
                case -1160848261:
                case -647724350:
                    if (C1377.f5749) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ۨ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-21809)) ^ (-788635473);
                        i6 = 448691036;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ۬") ^ i4) * 23;
                        i5 = ((iM11306 ^ i3) * 5419) ^ 469195205;
                        i6 = 752823100;
                    }
                    break;
                case -1106564673:
                case 913583234:
                    RunnableC3388.m10064();
                    C1025.m3861();
                    iM11306 = (i4 - ThreadFactoryC3888.m11306("ܶ᩵")) * (-39);
                    i5 = ((iM11306 ^ i3) * (-2115)) ^ (-145174378);
                    i6 = -939447235;
                    break;
                case -950931031:
                case 814984617:
                    if (C2788.f10625 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘۘ") + i4) * (-69);
                        i5 = ((iM11306 ^ i3) * 3239) ^ 48664383;
                        i6 = -1089784018;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۘ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 19485) ^ 513247963;
                        i6 = -2071949286;
                    }
                    break;
                case -705258551:
                case 1672332842:
                    if (C0671.m3008() >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܶ᩵")) * (-39);
                        i5 = ((iM11306 ^ i3) * (-2115)) ^ (-145174378);
                        i6 = -939447235;
                    } else {
                        iM11306 = (C19806.m45029("ۤ۬") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM11306 ^ i4) * (-10459)) ^ (-1210436070);
                        i6 = -251691170;
                    }
                    break;
                case -695523827:
                case -357670503:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܶ᩵")) * (-39);
                        i5 = ((iM11306 ^ i3) * (-2115)) ^ (-145174378);
                        i6 = -939447235;
                    } else {
                        iM11306 = (C19806.m45029("ۡ۬") ^ i4) * q.h;
                        i5 = ((iM11306 ^ i3) * (-32163)) ^ (-561651608);
                        i6 = 1754334921;
                    }
                    break;
                case -200630904:
                case 761173087:
                    C3535.m10431();
                    C2788.m8472();
                    break;
                case -188298167:
                case 285034566:
                    if (C2332.f8260) {
                        iM11306 = (i3 - C19806.m45029("᩻ۨ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM11306 ^ i4) * (-53)) ^ 1489847636;
                        i6 = 424175256;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘۘ") + i4) * (-69);
                        i5 = ((iM11306 ^ i3) * 3239) ^ 48664383;
                        i6 = -1089784018;
                    }
                    break;
                case -187841117:
                case 813522632:
                    this.f22240 = false;
                    break;
                case -171518658:
                case 62914277:
                    C2642.m8171();
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ۬") ^ i4) * 23;
                        i5 = ((iM11306 ^ i3) * 5419) ^ 469195205;
                        i6 = 752823100;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨۠") ^ i3;
                        i5 = ((iM11306 ^ i4) * 32395) ^ (-1394967785);
                        i6 = 520718896;
                    }
                    break;
                case -14145907:
                case 1367400752:
                    if (RunnableC1564.f6300) {
                        iM11306 = ThreadFactoryC3888.m11306("֨۠") ^ i3;
                        i5 = ((iM11306 ^ i4) * 32395) ^ (-1394967785);
                        i6 = 520718896;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬᩹") + i4) * 21;
                        i5 = ((iM11306 ^ i3) * 22189) ^ (-10559375);
                        i6 = 481317163;
                    }
                    break;
                case 693198141:
                case 1042012801:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ۬") ^ i4) * 23;
                        i5 = ((iM11306 ^ i3) * 5419) ^ 469195205;
                        i6 = 752823100;
                    } else {
                        iM11306 = C19806.m45029("ۘ۬") ^ i4;
                        i5 = ((iM11306 ^ i3) * 18783) ^ (-1215786311);
                        i6 = -547628572;
                    }
                    break;
                default:
                    C1460.m5050();
                    if (C7105.f23796 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨۠") ^ i3;
                        i5 = ((iM11306 ^ i4) * 32395) ^ (-1394967785);
                        i6 = 520718896;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("֨ۘ")) * (-95);
                        i5 = ((iM11306 ^ i4) * (-5933)) ^ 2088508085;
                        i6 = -1741042838;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = -843914331;
        int i6 = C0278.f1572;
        int i7 = C2124.f7782;
        int iM45029 = C19806.m45029("ۜ֨") ^ i7;
        int i8 = ((iM45029 ^ i6) * (-7493)) ^ (-886361904);
        int i9 = 169026895;
        while (true) {
            i5 = ((((i5 ^ i6) * 23369) >> 31) & i8) ^ (iM45029 ^ i9);
            switch (i5) {
                case -2007557230:
                case -996957236:
                    if (C1377.f5749) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸۫") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-12951)) ^ 1448851965;
                        i9 = 669803668;
                    } else {
                        iM45029 = (C19806.m45029("ۨ۟") + i6) * 13;
                        i8 = ((iM45029 ^ i7) * (-9057)) ^ 2048511548;
                        i9 = 1551809263;
                    }
                    break;
                case -2007342602:
                case -1567586527:
                    if (C2332.f8260) {
                        iM45029 = C19806.m45029("᩹ۛ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 32517) ^ 697273009;
                        i9 = -709526040;
                    } else {
                        iM45029 = (C19806.m45029("ۨ۟") + i6) * 13;
                        i8 = ((iM45029 ^ i7) * (-9057)) ^ 2048511548;
                        i9 = 1551809263;
                    }
                    break;
                case -1916500362:
                case -1574059935:
                    if (RunnableC1564.f6300) {
                        iM45029 = C19806.m45029("ۚܳ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-7769)) ^ 1881725910;
                        i9 = -2105780385;
                    } else {
                        iM45029 = C19806.m45029("ۙۧ") ^ i6;
                        i8 = ((iM45029 ^ i7) * 15469) ^ (-934521294);
                        i9 = -433704933;
                    }
                    break;
                case -1797190937:
                case -69816876:
                    break;
                case -1518495800:
                case -169407795:
                    C2704.m8255();
                    C3286.m9798();
                    iM45029 = C19806.m45029("᩺ܳ") ^ i6;
                    i8 = ((iM45029 ^ i7) * 11789) ^ 1225556358;
                    i9 = 49422804;
                    break;
                case -1379494960:
                case -143682079:
                    if (C0797.f3386) {
                        iM45029 = C19806.m45029("ۚܳ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-7769)) ^ 1881725910;
                        i9 = -2105780385;
                    } else {
                        iM45029 = (C19806.m45029("ۜ᩹") ^ i7) * (-25);
                        i8 = ((iM45029 ^ i6) * 25465) ^ 1931451274;
                        i9 = 674078585;
                    }
                    break;
                case -1101199597:
                case -855131032:
                    if (C0050.f912 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶᩷") ^ i6) * (-113);
                        i8 = ((iM45029 ^ i7) * 7083) ^ 484519946;
                        i9 = 147205211;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙܽ") ^ i6;
                        i8 = ((iM45029 ^ i7) * 31681) ^ 50920498;
                        i9 = 19599271;
                    }
                    break;
                case -1063736017:
                case 1887063003:
                    if (C1066.m4023() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶᩷") ^ i6) * (-113);
                        i8 = ((iM45029 ^ i7) * 7083) ^ 484519946;
                        i9 = 147205211;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗۗ") + i7) * (-117);
                        i8 = ((iM45029 ^ i6) * (-10999)) ^ (-1868458567);
                        i9 = 1020795882;
                    }
                    break;
                case -786369096:
                case 2106095880:
                    if (C1377.f5749) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ۠") ^ i7) * (-35);
                        i8 = ((iM45029 ^ i6) * (-16489)) ^ (-1591140642);
                        i9 = 1757745964;
                    } else {
                        iM45029 = C19806.m45029("ۚܳ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-7769)) ^ 1881725910;
                        i9 = -2105780385;
                    }
                    break;
                case -723391651:
                case 528881994:
                    C0671.m3008();
                    break;
                case -663685340:
                case 1767878515:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = C19806.m45029("᩺ܳ") ^ i6;
                        i8 = ((iM45029 ^ i7) * 11789) ^ 1225556358;
                        i9 = 49422804;
                    } else {
                        iM45029 = C19806.m45029("ۚ۟") ^ i6;
                        i8 = ((iM45029 ^ i7) * 26311) ^ 528390728;
                        i9 = 963541057;
                    }
                    break;
                case -542759814:
                case -78518190:
                    if (C1875.m6086() != 0) {
                        iM45029 = C19806.m45029("᩺ܳ") ^ i6;
                        i8 = ((iM45029 ^ i7) * 11789) ^ 1225556358;
                        i9 = 49422804;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨ۠") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-405)) ^ 1760865832;
                        i9 = 132190504;
                    }
                    break;
                case 88742214:
                case 594075177:
                    RunnableC1895.m6170();
                    if (C0671.m3008() >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶᩷") ^ i6) * (-113);
                        i8 = ((iM45029 ^ i7) * 7083) ^ 484519946;
                        i9 = 147205211;
                    } else {
                        iM45029 = C19806.m45029("ۚܳ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-7769)) ^ 1881725910;
                        i9 = -2105780385;
                    }
                    break;
                case 475846468:
                case 848899998:
                    if (C3722.f13525 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶᩷") ^ i6) * (-113);
                        i8 = ((iM45029 ^ i7) * 7083) ^ 484519946;
                        i9 = 147205211;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۜ") + i6) * (-39);
                        i8 = ((iM45029 ^ i7) * 27649) ^ (-500013974);
                        i9 = 182526272;
                    }
                    break;
                case 526101926:
                case 1349835244:
                    super.onLayout(z, i, i2, i3, i4);
                    if (z) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺۠") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-10913)) ^ 1942105270;
                        i9 = 650020473;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۖ") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i8 = ((iM45029 ^ i6) * 15067) ^ 1311824015;
                        i9 = -1956418444;
                    }
                    break;
                case 568544504:
                case 1003142840:
                    this.f22247 = 1;
                    iM45029 = (ThreadFactoryC3888.m11306("ۘۖ") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i8 = ((iM45029 ^ i6) * 15067) ^ 1311824015;
                    i9 = -1956418444;
                    break;
                case 1503465340:
                case 2046763939:
                    C1189.m4368();
                    if (C1977.f7413 <= 0) {
                        iM45029 = C19806.m45029("ۚܳ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-7769)) ^ 1881725910;
                        i9 = -2105780385;
                    } else {
                        iM45029 = C19806.m45029("᩺ܳ") ^ i6;
                        i8 = ((iM45029 ^ i7) * 11789) ^ 1225556358;
                        i9 = 49422804;
                    }
                    break;
                default:
                    if (C3577.f13150 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶᩷") ^ i6) * (-113);
                        i8 = ((iM45029 ^ i7) * 7083) ^ 484519946;
                        i9 = 147205211;
                    } else {
                        iM45029 = C19806.m45029("ۤۙ") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-15565)) ^ (-1222741339);
                        i9 = -1793014656;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m17934() {
        int i = 523887592;
        int i2 = C2249.f8050;
        int i3 = C1668.f6641;
        int iM11306 = (ThreadFactoryC3888.m11306("ۚ᩻") + i2) * (-27);
        int i4 = ((iM11306 ^ i3) * 663) ^ 2109333299;
        int i5 = -110256983;
        while (true) {
            i = ((((i ^ i3) * 29437) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2031220627:
                case -1094313389:
                    if (C0050.f912 <= 0) {
                        iM11306 = (i3 - C19806.m45029("۟ܺ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i2) * (-1601)) ^ (-442440991);
                        i5 = 923932035;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 6479) ^ (-978908394);
                        i5 = -887267698;
                    }
                    break;
                case -1958454862:
                case 717312694:
                    C3722.m10894();
                    if (!C2704.f10408) {
                        iM11306 = (i3 - C19806.m45029("۟ܺ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i2) * (-1601)) ^ (-442440991);
                        i5 = 923932035;
                    } else {
                        iM11306 = C19806.m45029("᩷ᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-4827)) ^ (-1596420083);
                        i5 = 1676345307;
                    }
                    break;
                case -1924506118:
                case 1489153678:
                    if (C2704.f10408) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖۧ") + i3) * 91;
                        i4 = ((iM11306 ^ i2) * 1917) ^ 2111966596;
                        i5 = -2027235801;
                    } else {
                        iM11306 = C19806.m45029("ۘۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-32113)) ^ (-326427716);
                        i5 = -1524200042;
                    }
                    break;
                case -1898683450:
                case 2092859233:
                    if (C1377.m4833() != 0) {
                        iM11306 = C19806.m45029("ܽܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-15497)) ^ 1851605683;
                        i5 = -1781391114;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-26975)) ^ (-1644397032);
                        i5 = -121382176;
                    }
                    break;
                case -1786069275:
                case -1551179671:
                    if (!C0797.f3386) {
                        iM11306 = C19806.m45029("ܽܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-15497)) ^ 1851605683;
                        i5 = -1781391114;
                    } else {
                        iM11306 = C19806.m45029("ۘۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-32113)) ^ (-326427716);
                        i5 = -1524200042;
                    }
                    break;
                case -1712928041:
                case 1887659165:
                    if (this.f22252) {
                        iM11306 = C19806.m45029("᩶ᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-23421)) ^ (-1529439178);
                        i5 = -1774491537;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("֡ܿ")) * 3;
                        i4 = ((iM11306 ^ i2) * (-11823)) ^ (-1362925171);
                        i5 = 798333185;
                    }
                    break;
                case -1346817317:
                case 1699022342:
                    C3660.m10791();
                    C10634.m26820();
                    return false;
                case -1174292813:
                case -336385625:
                    C0278.m1789();
                    if (C1398.m4895() > 0) {
                        iM11306 = C19806.m45029("᩷ᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-4827)) ^ (-1596420083);
                        i5 = 1676345307;
                    } else {
                        iM11306 = C19806.m45029("ܽܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-15497)) ^ 1851605683;
                        i5 = -1781391114;
                    }
                    break;
                case -1038246951:
                case 1550281040:
                    if (C0629.f2722 <= 0) {
                        iM11306 = C19806.m45029("ܽܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-15497)) ^ 1851605683;
                        i5 = -1781391114;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧۚ") ^ i2) * 61;
                        i4 = ((iM11306 ^ i3) * 3859) ^ (-77849251);
                        i5 = -1887802558;
                    }
                    break;
                case -846953213:
                case 1234942635:
                    if (m17929()) {
                        iM11306 = C19806.m45029("᩶ᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-23421)) ^ (-1529439178);
                        i5 = -1774491537;
                    } else {
                        iM11306 = (C19806.m45029("֫ۤ") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM11306 ^ i3) * (-3085)) ^ 708679375;
                        i5 = -237374993;
                    }
                    break;
                case -406020121:
                case 950030355:
                    if (C1419.f5860 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ᩻") ^ i2;
                        i4 = ((iM11306 ^ i3) * 23419) ^ 2015413969;
                        i5 = -358421306;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-2431)) ^ (-880942936);
                        i5 = -1721538870;
                    }
                    break;
                case -369410654:
                case 645751715:
                    return false;
                case 21154381:
                case 1187938844:
                    return true;
                case 236540401:
                case 548010253:
                    if (C3660.m10791() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ᩻") ^ i2;
                        i4 = ((iM11306 ^ i3) * 23419) ^ 2015413969;
                        i5 = -358421306;
                    } else {
                        iM11306 = (C19806.m45029("ۨܳ") ^ i2) * (-97);
                        i4 = ((iM11306 ^ i3) * 1425) ^ (-1260922661);
                        i5 = 1406950647;
                    }
                    break;
                case 914274518:
                case 1816927552:
                    if (C0817.m3399()) {
                        iM11306 = (C19806.m45029("֨ۙ") + i2) * 99;
                        i4 = ((iM11306 ^ i3) * (-17325)) ^ 931411219;
                        i5 = -664213325;
                    } else {
                        iM11306 = C19806.m45029("ۘۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-32113)) ^ (-326427716);
                        i5 = -1524200042;
                    }
                    break;
                case 1275112249:
                case 2054236115:
                    if (C0278.m1789() <= 0) {
                        iM11306 = C19806.m45029("ܽܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-15497)) ^ 1851605683;
                        i5 = -1781391114;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-17455)) ^ (-614427475);
                        i5 = -475569497;
                    }
                    break;
                case 1607807735:
                case 1867237424:
                    if (C2704.f10408) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۧۡ")) * (-91);
                        i4 = ((iM11306 ^ i2) * (-22753)) ^ (-1406383219);
                        i5 = 1528961944;
                    } else {
                        iM11306 = (i3 - C19806.m45029("۟ܺ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i2) * (-1601)) ^ (-442440991);
                        i5 = 923932035;
                    }
                    break;
                case 1960755552:
                case 1982236389:
                    if (C0797.f3386) {
                        iM11306 = C19806.m45029("ۘۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-32113)) ^ (-326427716);
                        i5 = -1524200042;
                    } else {
                        iM11306 = (C19806.m45029("ܿ᩵") + i2) * 79;
                        i4 = ((iM11306 ^ i3) * 1771) ^ 1676025674;
                        i5 = 851411019;
                    }
                    break;
                default:
                    C0050.m946();
                    RunnableC3388.m10064();
                    iM11306 = C19806.m45029("ۘۗ") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-32113)) ^ (-326427716);
                    i5 = -1524200042;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m17931() {
        int iM6173 = 0;
        int i = 0;
        int iM3867 = 0;
        int iM10956 = 0;
        int i2 = 2092845468;
        int i3 = C0629.f2722;
        int i4 = C1875.f7103;
        int iM11306 = ThreadFactoryC3888.m11306("۠ۧ") ^ i3;
        int i5 = ((iM11306 ^ i4) * (-15355)) ^ 588435492;
        int i6 = -2120388141;
        while (true) {
            i2 = ((((i2 ^ i4) * 8547) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2111651191:
                case 1824648943:
                    iM10956 = C3743.m10956(ViewTreeObserverOnPreDrawListenerC3327.m9872(this, 0));
                    if (iM10956 > i) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ᩴ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 31547) ^ (-174801064);
                        i6 = -435961014;
                    } else {
                        iM3867 = iM6173;
                        iM11306 = ThreadFactoryC3888.m11306("᩻᩻") ^ i4;
                        i5 = ((iM11306 ^ i3) * 15475) ^ 868111817;
                        i6 = -1169321854;
                    }
                    break;
                case -2065826313:
                case 33513154:
                    if (C0278.f1572 <= 0) {
                        iM11306 = (i4 - C19806.m45029("ܽܳ")) * (-11);
                        i5 = ((iM11306 ^ i3) * (-28635)) ^ (-1183584147);
                        i6 = -875018684;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤ۟") + i3) * 21;
                        i5 = ((iM11306 ^ i4) * 30425) ^ (-843210819);
                        i6 = 541805852;
                    }
                    break;
                case -1829602032:
                case 2073589778:
                    iM6173 = RunnableC1895.m6173(this);
                    if (C1377.f5749) {
                        iM11306 = ThreadFactoryC3888.m11306("۠֫") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-20691)) ^ (-680532139);
                        i6 = 1179532568;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۢ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-25569)) ^ (-1495799305);
                        i6 = 954095897;
                    }
                    break;
                case -1663122285:
                case -1230081731:
                    if (C0526.f2219) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۧ") + i3) * 7;
                        i5 = ((iM11306 ^ i4) * 4503) ^ 450736867;
                        i6 = -1715063295;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֫ۜ")) * (-43);
                        i5 = ((iM11306 ^ i3) * (-8417)) ^ 1181146957;
                        i6 = 2132738702;
                    }
                    break;
                case -1200260297:
                case -152406500:
                    i = 1;
                    if (iM6173 >= 1) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙ۟") + i3) * (-71);
                        i5 = ((iM11306 ^ i4) * (-9981)) ^ 2134100035;
                        i6 = -150881035;
                    } else {
                        iM3867 = iM6173;
                        iM11306 = ThreadFactoryC3888.m11306("᩻᩻") ^ i4;
                        i5 = ((iM11306 ^ i3) * 15475) ^ 868111817;
                        i6 = -1169321854;
                    }
                    break;
                case -1179763665:
                case 2079217172:
                    if (RunnableC1895.f7152) {
                        iM11306 = C19806.m45029("۟ܺ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-8241)) ^ (-1615821810);
                        i6 = 1209008686;
                    } else {
                        iM11306 = (C19806.m45029("۟᩵") ^ i3) * (-15);
                        i5 = ((iM11306 ^ i4) * (-1307)) ^ (-2136967861);
                        i6 = 1026703393;
                    }
                    break;
                case -977633959:
                case 116535613:
                    this.f22247 = iM3867;
                    iM11306 = (ThreadFactoryC3888.m11306("ۘܺ") + i4) * (-81);
                    i5 = ((iM11306 ^ i3) * 17599) ^ (-846070396);
                    i6 = -141498516;
                    break;
                case -938419060:
                case 221355609:
                    iM3867 = C1025.m3867(iM6173, C2642.m8169(this) / iM10956);
                    iM11306 = ThreadFactoryC3888.m11306("᩻᩻") ^ i4;
                    i5 = ((iM11306 ^ i3) * 15475) ^ 868111817;
                    i6 = -1169321854;
                    break;
                case -853661723:
                case -667781866:
                    if (RunnableC1564.m5345()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۢ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-25569)) ^ (-1495799305);
                        i6 = 954095897;
                    } else {
                        iM11306 = C19806.m45029("۫ۤ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-11903)) ^ (-19481814);
                        i6 = -2079204502;
                    }
                    break;
                case -694296413:
                case -515308365:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    C0797.m3359();
                    iM11306 = (ThreadFactoryC3888.m11306("ۙۧ") + i3) * 7;
                    i5 = ((iM11306 ^ i4) * 4503) ^ 450736867;
                    i6 = -1715063295;
                    break;
                case -607601292:
                case 1387834463:
                    if (C1066.f4915 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۢ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-25569)) ^ (-1495799305);
                        i6 = 954095897;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۛۨ")) * 33;
                        i5 = ((iM11306 ^ i3) * 11539) ^ (-1078360073);
                        i6 = 718870100;
                    }
                    break;
                case -591856419:
                case 733041367:
                    if (C2788.f10625 >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩸᩹")) * 9;
                        i5 = ((iM11306 ^ i3) * 27889) ^ (-523791218);
                        i6 = 1665144504;
                    } else {
                        iM11306 = (C19806.m45029("۟᩵") ^ i3) * (-15);
                        i5 = ((iM11306 ^ i4) * (-1307)) ^ (-2136967861);
                        i6 = 1026703393;
                    }
                    break;
                case -560589032:
                case 507575934:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۧ") + i3) * 7;
                        i5 = ((iM11306 ^ i4) * 4503) ^ 450736867;
                        i6 = -1715063295;
                    } else {
                        iM11306 = C19806.m45029("ۧ۟") ^ i3;
                        i5 = ((iM11306 ^ i4) * 17613) ^ (-152684978);
                        i6 = -563008519;
                    }
                    break;
                case -237250967:
                case 299009439:
                    C0817.m3399();
                    return 0;
                case 313253490:
                case 668728500:
                    C0629.m2907();
                    if (C2249.f8050 < 0) {
                        iM11306 = (C19806.m45029("۟᩵") ^ i3) * (-15);
                        i5 = ((iM11306 ^ i4) * (-1307)) ^ (-2136967861);
                        i6 = 1026703393;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۧ") + i3) * 7;
                        i5 = ((iM11306 ^ i4) * 4503) ^ 450736867;
                        i6 = -1715063295;
                    }
                    break;
                case 471440781:
                case 1367329871:
                    if (iM3867 > this.f22247) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۟ܰ")) * 23;
                        i5 = ((iM11306 ^ i4) * 22677) ^ (-1910340068);
                        i6 = 2068677740;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘܺ") + i4) * (-81);
                        i5 = ((iM11306 ^ i3) * 17599) ^ (-846070396);
                        i6 = -141498516;
                    }
                    break;
                case 792091975:
                case 1792986857:
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۢ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-25569)) ^ (-1495799305);
                        i6 = 954095897;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩸᩹")) * 9;
                        i5 = ((iM11306 ^ i3) * 27889) ^ (-523791218);
                        i6 = 1665144504;
                    }
                    break;
                case 1309984900:
                case 1864373662:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (i4 - C19806.m45029("ܽܳ")) * (-11);
                        i5 = ((iM11306 ^ i3) * (-28635)) ^ (-1183584147);
                        i6 = -875018684;
                    } else {
                        iM11306 = (C19806.m45029("ᩴ᩺") + i3) * (-93);
                        i5 = ((iM11306 ^ i4) * (-8191)) ^ (-459915112);
                        i6 = 887431018;
                    }
                    break;
                case 1428240151:
                case 1612771128:
                    if (C2249.f8050 >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩸᩹")) * 9;
                        i5 = ((iM11306 ^ i3) * 27889) ^ (-523791218);
                        i6 = 1665144504;
                    } else {
                        iM11306 = C19806.m45029("ۗܿ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 3781) ^ (-2056473085);
                        i6 = -177129829;
                    }
                    break;
                case 1654897453:
                case 2068999570:
                    return this.f22247;
                default:
                    if (C2642.f10294 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۧ") + i3) * 7;
                        i5 = ((iM11306 ^ i4) * 4503) ^ 450736867;
                        i6 = -1715063295;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ܶ᩺")) * 17;
                        i5 = ((iM11306 ^ i3) * (-18477)) ^ (-1334730199);
                        i6 = 49246378;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean m17929() {
        long jM9790 = 0;
        long j = 0;
        long j2 = 0;
        int i = -1797484737;
        int i2 = C1398.f5802;
        int i3 = C2124.f7782;
        int iM45029 = (C19806.m45029("ۙܳ") + i3) * 63;
        int i4 = ((iM45029 ^ i2) * 29491) ^ 629170564;
        int i5 = -2132332889;
        while (true) {
            i = ((((i ^ i2) * (-17353)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1899747570:
                case -1192029523:
                    return true;
                case -1707039891:
                case -626137762:
                    if (C0216.f1393 != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۘ") + i2) * 15;
                        i4 = ((iM45029 ^ i3) * 8629) ^ (-1880784097);
                        i5 = 1732807146;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 15031) ^ (-1293264397);
                        i5 = 388985880;
                    }
                    break;
                case -1457875965:
                case -908851738:
                    if (C2249.m6915() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩺") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3307) ^ 27700198;
                        i5 = -712987123;
                    } else {
                        iM45029 = C19806.m45029("۟ۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-29557)) ^ (-1179594588);
                        i5 = -1585922386;
                    }
                    break;
                case -1401835198:
                case -1073169201:
                    if (AbstractC0464.m2313() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۘ") + i2) * 15;
                        i4 = ((iM45029 ^ i3) * 8629) ^ (-1880784097);
                        i5 = 1732807146;
                    } else {
                        iM45029 = C19806.m45029("ܽۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-25221)) ^ (-1712307374);
                        i5 = 1325893777;
                    }
                    break;
                case -1393357462:
                case -274935524:
                    if (this.f22240) {
                        iM45029 = (i2 - C19806.m45029("᩶ܶ")) * (-75);
                        i4 = ((iM45029 ^ i3) * (-467)) ^ 1408803049;
                        i5 = 760810146;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ۬") + i3) * (-65);
                        i4 = ((iM45029 ^ i2) * 1391) ^ (-11522219);
                        i5 = 1774381237;
                    }
                    break;
                case -1361138238:
                case 1736634344:
                    if (C3286.f12186) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩺") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3307) ^ 27700198;
                        i5 = -712987123;
                    } else {
                        iM45029 = C19806.m45029("᩸۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-25191)) ^ 458251297;
                        i5 = -62249926;
                    }
                    break;
                case -1310786372:
                case 530056728:
                    C0526.m2437();
                    if (C1398.f5802 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۘ") + i2) * 15;
                        i4 = ((iM45029 ^ i3) * 8629) ^ (-1880784097);
                        i5 = 1732807146;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۛܺ")) * (-9);
                        i4 = ((iM45029 ^ i3) * (-13217)) ^ 1036988959;
                        i5 = -948997483;
                    }
                    break;
                case -1155030713:
                case -216771361:
                    C0671.m3008();
                    if (C0278.f1572 > 0) {
                        iM45029 = (C19806.m45029("ܿ᩸") + i3) * (-51);
                        i4 = ((iM45029 ^ i2) * 4181) ^ 283298786;
                        i5 = 660627226;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩺") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3307) ^ 27700198;
                        i5 = -712987123;
                    }
                    break;
                case -1133000056:
                case 1289918403:
                    jM9790 = C3286.m9790();
                    j = this.f22234;
                    if (C10634.f36300 >= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۛܺ")) * (-9);
                        i4 = ((iM45029 ^ i3) * (-13217)) ^ 1036988959;
                        i5 = -948997483;
                    } else {
                        iM45029 = C19806.m45029("ۜܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 32109) ^ 1868113646;
                        i5 = -901100025;
                    }
                    break;
                case -1030408186:
                case -517592773:
                    if (!C0526.f2219) {
                        iM45029 = (C19806.m45029("ܿ᩸") + i3) * (-51);
                        i4 = ((iM45029 ^ i2) * 4181) ^ 283298786;
                        i5 = 660627226;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۛܺ")) * (-9);
                        i4 = ((iM45029 ^ i3) * (-13217)) ^ 1036988959;
                        i5 = -948997483;
                    }
                    break;
                case -930598524:
                case -386943323:
                    return false;
                case -858876796:
                case 949807581:
                    if (C2704.m8255() <= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۛܺ")) * (-9);
                        i4 = ((iM45029 ^ i3) * (-13217)) ^ 1036988959;
                        i5 = -948997483;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-13447)) ^ (-1193830717);
                        i5 = 1284825362;
                    }
                    break;
                case -713408193:
                case -689708217:
                    if (C1066.m4023() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩺") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3307) ^ 27700198;
                        i5 = -712987123;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۙ۬")) * (-111);
                        i4 = ((iM45029 ^ i3) * (-11943)) ^ 1007718538;
                        i5 = -932445945;
                    }
                    break;
                case -681825613:
                case 1488992544:
                    if (C0216.f1393 != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۘ") + i2) * 15;
                        i4 = ((iM45029 ^ i3) * 8629) ^ (-1880784097);
                        i5 = 1732807146;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶᩹") + i3) * (-29);
                        i4 = ((iM45029 ^ i2) * 11745) ^ 1943460242;
                        i5 = -635735895;
                    }
                    break;
                case -533700282:
                case 1010474126:
                    j2 = jM9790 - j;
                    if (C1419.m4973()) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۙ") ^ i3) * 67;
                        i4 = ((iM45029 ^ i2) * 19293) ^ 943486139;
                        i5 = 1378979918;
                    } else {
                        iM45029 = (C19806.m45029("۠۫") + i3) * 101;
                        i4 = ((iM45029 ^ i2) * (-12259)) ^ (-807248706);
                        i5 = 1948204632;
                    }
                    break;
                case -513826771:
                case 2138895822:
                    if (C0526.f2219) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۙ") ^ i3) * 67;
                        i4 = ((iM45029 ^ i2) * 19293) ^ 943486139;
                        i5 = 1378979918;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܿۡ")) * 87;
                        i4 = ((iM45029 ^ i2) * (-6039)) ^ (-144976305);
                        i5 = 167399885;
                    }
                    break;
                case -23669584:
                case 1629486148:
                    C3286.m9798();
                    C0797.m3359();
                    return false;
                case 869602351:
                case 1152224502:
                    if (j2 < 500) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۙ") ^ i3) * 37;
                        i4 = ((iM45029 ^ i2) * 8247) ^ 1961384902;
                        i5 = -242800877;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ۬") + i3) * (-65);
                        i4 = ((iM45029 ^ i2) * 1391) ^ (-11522219);
                        i5 = 1774381237;
                    }
                    break;
                default:
                    C1398.m4895();
                    iM45029 = ThreadFactoryC3888.m11306("᩺᩺") ^ i2;
                    i4 = ((iM45029 ^ i3) * 3307) ^ 27700198;
                    i5 = -712987123;
                    break;
            }
        }
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        ListAdapter adapter = null;
        DataSetObserver dataSetObserver = null;
        int i = -430805696;
        int i2 = C1460.f5948;
        int i3 = C2249.f8050;
        int iM11306 = (i3 - ThreadFactoryC3888.m11306("᩹᩷")) * (-61);
        int i4 = ((iM11306 ^ i2) * (-13539)) ^ (-172993333);
        int i5 = -484655334;
        while (true) {
            i = ((((i ^ i2) * 32523) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1999919669:
                case 1147447652:
                    C2249.m6915();
                    if (C0050.f912 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵ۛ") ^ i2) * 25;
                        i4 = ((iM11306 ^ i3) * 25487) ^ 52414646;
                        i5 = 98588643;
                    } else {
                        iM11306 = C19806.m45029("᩷ۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-7189)) ^ 696765886;
                        i5 = -1984405144;
                    }
                    break;
                case -1948813052:
                case -265236437:
                    adapter = getAdapter();
                    dataSetObserver = this.f22253;
                    if (adapter != null) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۛ֨")) * (-119);
                        i4 = ((iM11306 ^ i3) * 29847) ^ (-1745293764);
                        i5 = -284380307;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ᩹") ^ i3) * (-31);
                        i4 = ((iM11306 ^ i2) * (-13831)) ^ (-1226517916);
                        i5 = -476420613;
                    }
                    break;
                case -1857256780:
                case 608930065:
                    if (C0797.m3359()) {
                        iM11306 = C19806.m45029("᩺᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * 28515) ^ 1713558225;
                        i5 = -173546354;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ᩴۧ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i3) * 31407) ^ (-453263794);
                        i5 = 2003909152;
                    }
                    break;
                case -1680090499:
                case 1493391318:
                    if (C1460.m5050() != 0) {
                        iM11306 = C19806.m45029("᩷ۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-7189)) ^ 696765886;
                        i5 = -1984405144;
                    } else {
                        iM11306 = (C19806.m45029("ۤ᩶") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM11306 ^ i2) * (-233)) ^ 550886351;
                        i5 = 523790357;
                    }
                    break;
                case -1612413784:
                case -509691605:
                    if (C1025.f4800 >= 0) {
                        iM11306 = C19806.m45029("᩷ۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-7189)) ^ 696765886;
                        i5 = -1984405144;
                    } else {
                        iM11306 = (C19806.m45029("᩸ܽ") ^ i3) * (-77);
                        i4 = ((iM11306 ^ i2) * (-25009)) ^ (-807330697);
                        i5 = 1138267419;
                    }
                    break;
                case -1576189687:
                case -1089877489:
                    listAdapter.registerDataSetObserver(dataSetObserver);
                    iM11306 = (i3 - C19806.m45029("۬ۡ")) * 69;
                    i4 = ((iM11306 ^ i2) * 4495) ^ 646696708;
                    i5 = 1992708767;
                    break;
                case -1415187798:
                case 1629978565:
                    if (C2642.f10294 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵ۛ") ^ i2) * 25;
                        i4 = ((iM11306 ^ i3) * 25487) ^ 52414646;
                        i5 = 98588643;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۖ֨")) * 97;
                        i4 = ((iM11306 ^ i3) * (-2617)) ^ 33097234;
                        i5 = 2061574424;
                    }
                    break;
                case -1404104451:
                case 490826901:
                    break;
                case -1005246887:
                case 910335302:
                    if (C0216.f1393 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-28813)) ^ 1325261491;
                        i5 = -242599606;
                    } else {
                        iM11306 = (C19806.m45029("ۡ᩷") ^ i2) * 95;
                        i4 = ((iM11306 ^ i3) * 21489) ^ (-168050180);
                        i5 = 1001771688;
                    }
                    break;
                case -971679559:
                case -57109541:
                    C0629.m2907();
                    C1025.m3861();
                    iM11306 = C19806.m45029("᩷ۧ") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-7189)) ^ 696765886;
                    i5 = -1984405144;
                    break;
                case -905720407:
                case 374303731:
                    if (C0526.f2219) {
                        iM11306 = (i2 - C19806.m45029("ᩴۧ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i3) * 31407) ^ (-453263794);
                        i5 = 2003909152;
                    } else {
                        iM11306 = (C19806.m45029("۠ܺ") + i2) * 45;
                        i4 = ((iM11306 ^ i3) * (-22913)) ^ 1484441194;
                        i5 = -2084051283;
                    }
                    break;
                case -849402775:
                case 1349624821:
                    super.setAdapter(listAdapter);
                    if (listAdapter != null) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22285)) ^ 1337782370;
                        i5 = 1528802156;
                    } else {
                        iM11306 = (i3 - C19806.m45029("۬ۡ")) * 69;
                        i4 = ((iM11306 ^ i2) * 4495) ^ 646696708;
                        i5 = 1992708767;
                    }
                    break;
                case -771111790:
                case 383905852:
                    adapter.unregisterDataSetObserver(dataSetObserver);
                    iM11306 = (ThreadFactoryC3888.m11306("ۘ᩹") ^ i3) * (-31);
                    i4 = ((iM11306 ^ i2) * (-13831)) ^ (-1226517916);
                    i5 = -476420613;
                    break;
                case -728605861:
                case 902298335:
                    if (RunnableC3388.m10064()) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 17043) ^ (-732327182);
                        i5 = 74879632;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-28813)) ^ 1325261491;
                        i5 = -242599606;
                    }
                    break;
                case -284697605:
                case 837410330:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (C1460.f5948 >= 0) {
                        iM11306 = (i2 - C19806.m45029("ᩴۧ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i3) * 31407) ^ (-453263794);
                        i5 = 2003909152;
                    } else {
                        iM11306 = C19806.m45029("᩷ۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-7189)) ^ 696765886;
                        i5 = -1984405144;
                    }
                    break;
                case -265339904:
                case 732091754:
                    if (C3535.f13026 <= 0) {
                        iM11306 = (i2 - C19806.m45029("ᩴۧ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i3) * 31407) ^ (-453263794);
                        i5 = 2003909152;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("֨᩶")) * 43;
                        i4 = ((iM11306 ^ i3) * 9383) ^ 677804836;
                        i5 = 1810695913;
                    }
                    break;
                case 383195324:
                case 1573757539:
                    if (C1189.f5284 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-28813)) ^ 1325261491;
                        i5 = -242599606;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۜ᩶")) * (-67);
                        i4 = ((iM11306 ^ i3) * 31299) ^ 1001310270;
                        i5 = 191254825;
                    }
                    break;
                case 593888372:
                case 1140836563:
                    C1460.m5050();
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-28813)) ^ 1325261491;
                        i5 = -242599606;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ᩴۧ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i3) * 31407) ^ (-453263794);
                        i5 = 2003909152;
                    }
                    break;
                case 1148733362:
                case 1161806853:
                    if (C0526.f2219) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹۠") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-4731)) ^ (-760648327);
                        i5 = -1603201195;
                    } else {
                        iM11306 = C19806.m45029("۟᩷") ^ i3;
                        i4 = ((iM11306 ^ i2) * 7953) ^ (-437854818);
                        i5 = 1270138643;
                    }
                    break;
                default:
                    C0817.m3399();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6606(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        int i = 1218251712;
        int i2 = C2788.f10625;
        int i3 = C2124.f7782;
        int iM45029 = (C19806.m45029("᩵ܰ") + i3) * (-39);
        int i4 = ((iM45029 ^ i2) * 29625) ^ (-1212030923);
        int i5 = -2074725083;
        while (true) {
            i = (iM45029 ^ i5) ^ (i4 & (((i ^ i2) * (-29051)) >> 31));
            switch (i) {
                case -2061737545:
                case 1369051945:
                    C3286.m9798();
                    RunnableC1564.m5345();
                    throw new RuntimeException();
                case -1953064719:
                case 1240797742:
                    if (!RunnableC3388.m10064()) {
                        iM45029 = C19806.m45029("᩵۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * 15063) ^ 1729588168;
                        i5 = 1358089875;
                    }
                    break;
                case -254004214:
                case 1794478001:
                    if (RunnableC3388.f12514 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ܳ") ^ i3) * 43;
                        i4 = ((iM45029 ^ i2) * 8603) ^ 1877927091;
                        i5 = 1599258876;
                    }
                    break;
                case 441239988:
                case 1300764771:
                    C1148.m4232();
                    break;
                case 462521030:
                case 1116126291:
                    if (C10634.f36300 >= 0) {
                        iM45029 = (i2 - C19806.m45029("᩷᩶")) * (-3);
                        i4 = ((iM45029 ^ i3) * 14097) ^ (-390922069);
                        i5 = 348693418;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 25747) ^ 1933060292;
                        i5 = -1635567801;
                        continue;
                    }
                    break;
                case 1265434898:
                case 2049823788:
                    return;
                default:
                    C7105.m18985();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * 25285) ^ 88530640;
                        i5 = 974169582;
                    }
                    break;
            }
            iM45029 = ThreadFactoryC3888.m11306("۟ۛ") ^ i3;
            i4 = ((iM45029 ^ i2) * (-15381)) ^ (-1040862603);
            i5 = 637619966;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m17935() {
        return this.f22252;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6606(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        long j = 0;
        boolean z = false;
        C0961 c0961 = null;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 39491699;
        int i3 = ThreadFactoryC3888.f14547;
        int i4 = C2871.f10837;
        int iM45029 = (i3 - C19806.m45029("᩸ۙ")) * 33;
        int i5 = ((iM45029 ^ i4) * 9423) ^ 1439130623;
        int i6 = -1795684881;
        while (true) {
            i2 = (iM45029 ^ i6) ^ (i5 & (((i2 ^ i4) * (-5317)) >> 31));
            switch (i2) {
                case -2055722969:
                case -181500020:
                    C1419.m4973();
                    iM45029 = ThreadFactoryC3888.m11306("ۧ᩵") ^ i3;
                    i5 = ((iM45029 ^ i4) * (-30295)) ^ (-1772778651);
                    i6 = 156974424;
                    break;
                case -2037412184:
                case 437474161:
                    this.f22247 = z2 ? 1 : 0;
                    setHorizontalScrollBarEnabled(z);
                    setVerticalScrollBarEnabled(z);
                    if (Build.VERSION.SDK_INT >= 26) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("֨ۢ")) * 83;
                        i5 = ((iM45029 ^ i3) * (-11693)) ^ (-1077234605);
                        i6 = -1117114014;
                    } else {
                        iM45029 = (C19806.m45029("۬ܰ") ^ i3) * (-55);
                        i5 = ((iM45029 ^ i4) * 129) ^ (-2128275110);
                        i6 = 1773619837;
                    }
                    break;
                case -1981861068:
                case 654679569:
                    C2124.m6673();
                    if (C1668.f6641 >= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۘ֡")) * (-53);
                        i5 = ((iM45029 ^ i3) * 25065) ^ 1252636082;
                        i6 = -1100207234;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۧ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-12475)) ^ (-1308348119);
                        i6 = 360946593;
                    }
                    break;
                case -1900504431:
                case -147166967:
                    this.f22253 = c0961;
                    z2 = true;
                    z2 = true;
                    if (C2788.f10625 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۧ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-12475)) ^ (-1308348119);
                        i6 = 360946593;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۡ۬")) * 57;
                        i5 = ((iM45029 ^ i3) * 24347) ^ 686048086;
                        i6 = 1372362033;
                    }
                    break;
                case -1763665535:
                case 1597523762:
                    C1148.m4232();
                    throw new RuntimeException();
                case -1691591517:
                case 959230646:
                    z = false;
                    this.f22240 = false;
                    if (C2642.f10294 <= 0) {
                        iM45029 = C19806.m45029("۠᩷") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-25187)) ^ (-1987724250);
                        i6 = -541305177;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܳܰ")) * (-95);
                        i5 = ((iM45029 ^ i4) * (-4813)) ^ 899770943;
                        i6 = 1217186408;
                    }
                    break;
                case -1485613614:
                case 2128726504:
                    C3535.m10431();
                    if (C0216.f1393 != 0) {
                        iM45029 = (i3 - C19806.m45029("ܶܿ")) * (-113);
                        i5 = ((iM45029 ^ i4) * (-3079)) ^ (-1316511974);
                        i6 = 727414137;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ᩵") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-30295)) ^ (-1772778651);
                        i6 = 156974424;
                    }
                    break;
                case -1480443664:
                case 851135734:
                    this.f22232 = 964130679;
                    f2 = 8.0f;
                    if (C2704.f10408) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻֡") ^ i4) * (-101);
                        i5 = ((iM45029 ^ i3) * 5353) ^ 1564529007;
                        i6 = 1008584353;
                    } else {
                        iM45029 = C19806.m45029("۠᩷") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-25187)) ^ (-1987724250);
                        i6 = -541305177;
                    }
                    break;
                case -1449232064:
                case 1242895583:
                    C3722.m10894();
                    if (C1668.f6641 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۧ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-12475)) ^ (-1308348119);
                        i6 = 360946593;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܶܿ")) * (-113);
                        i5 = ((iM45029 ^ i4) * (-3079)) ^ (-1316511974);
                        i6 = 727414137;
                    }
                    break;
                case -1175875729:
                case -318113055:
                    this.f22230 = j;
                    c0961 = new C0961(this);
                    if (C0962.m3746() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۧ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-12475)) ^ (-1308348119);
                        i6 = 360946593;
                    } else {
                        iM45029 = (C19806.m45029("᩻᩷") + i4) * (-19);
                        i5 = ((iM45029 ^ i3) * 7099) ^ (-215345252);
                        i6 = 962011481;
                    }
                    break;
                case -1091510284:
                case 250819825:
                    setDefaultFocusHighlightEnabled(z);
                    iM45029 = (C19806.m45029("۬ܰ") ^ i3) * (-55);
                    i5 = ((iM45029 ^ i4) * 129) ^ (-2128275110);
                    i6 = 1773619837;
                    break;
                case -1042395446:
                case 624866025:
                    this.f22241 = -579373193;
                    if (C3535.f13026 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۧ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-12475)) ^ (-1308348119);
                        i6 = 360946593;
                    } else {
                        iM45029 = C19806.m45029("ۜ᩹") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-13053)) ^ (-643906631);
                        i6 = 355648865;
                    }
                    break;
                case -1008605398:
                case -410632201:
                    setSelector(new C3783(this));
                    iM45029 = (C19806.m45029("֡ۙ") ^ i3) * 27;
                    i5 = ((iM45029 ^ i4) * 4607) ^ 814487086;
                    i6 = 502225491;
                    break;
                case -975334918:
                case 1129752798:
                    super.setFastScrollEnabled(z);
                    if (isInEditMode()) {
                        iM45029 = (C19806.m45029("֡ۙ") ^ i3) * 27;
                        i5 = ((iM45029 ^ i4) * 4607) ^ 814487086;
                        i6 = 502225491;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۧ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 30281) ^ 250749916;
                        i6 = 1433848586;
                    }
                    break;
                case -707138045:
                case -500750986:
                    this.f22233 = z2;
                    iM45029 = ThreadFactoryC3888.m11306("ᩳܳ") ^ i3;
                    i5 = ((iM45029 ^ i4) * (-22935)) ^ 1665218252;
                    i6 = -1816321826;
                    break;
                case -549806767:
                case 1169736476:
                    this.f22257 = f3;
                    this.f22256 = ViewConfiguration.get(context).getScaledTouchSlop();
                    return;
                case -308227839:
                case 26801383:
                    f = context.getResources().getDisplayMetrics().density;
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (i3 - C19806.m45029("ܶܿ")) * (-113);
                        i5 = ((iM45029 ^ i4) * (-3079)) ^ (-1316511974);
                        i6 = 727414137;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳܿ") + i3) * (-115);
                        i5 = ((iM45029 ^ i4) * 6567) ^ (-927149241);
                        i6 = -301259334;
                    }
                    break;
                case 134978778:
                case 1510797999:
                    this.f22246 = f * f2;
                    f3 = f * 48.0f;
                    if (C10634.f36300 >= 0) {
                        iM45029 = C19806.m45029("۠᩷") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-25187)) ^ (-1987724250);
                        i6 = -541305177;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖۨ") ^ i3) * (-33);
                        i5 = ((iM45029 ^ i4) * 14893) ^ 759401507;
                        i6 = -1735764106;
                    }
                    break;
                case 421490621:
                case 1984539563:
                    super.setOnScrollListener(new C22129(this));
                    if (super.isFastScrollEnabled()) {
                        iM45029 = (C19806.m45029("۠᩵") ^ i4) * (-41);
                        i5 = ((iM45029 ^ i3) * (-29277)) ^ 1601608100;
                        i6 = -1254075511;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳܳ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-22935)) ^ 1665218252;
                        i6 = -1816321826;
                    }
                    break;
                case 513723037:
                case 1109560658:
                    this.f22242 = new HandlerC12957(this);
                    if (C1875.f7103 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۧ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-12475)) ^ (-1308348119);
                        i6 = 360946593;
                    } else {
                        iM45029 = C19806.m45029("֨ۙ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-5775)) ^ 163966652;
                        i6 = -1948510709;
                    }
                    break;
                default:
                    j = 0;
                    this.f22235 = 0L;
                    if (C1668.f6641 >= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۘ֡")) * (-53);
                        i5 = ((iM45029 ^ i3) * 25065) ^ 1252636082;
                        i6 = -1100207234;
                    } else {
                        this.f22236 = new C22398(3);
                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ۨۧ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-12475)) ^ (-1308348119);
                            i6 = 360946593;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("᩶ۧ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-19503)) ^ 1147880134;
                            i6 = 1224637352;
                        }
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m17916(C6606 c6606) {
        long j = 0;
        boolean z = false;
        long j2 = 0;
        int i = 87553481;
        int i2 = AbstractC0464.f2088;
        int i3 = C7105.f23796;
        int iM11306 = ThreadFactoryC3888.m11306("ۛ᩵") ^ i3;
        int i4 = ((iM11306 ^ i2) * 11389) ^ (-1568099999);
        int i5 = 110411890;
        while (true) {
            i = ((((i ^ i2) * 10783) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2066761004:
                case -310012136:
                    if (C3535.f13026 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ܿ֡")) * 11;
                        i4 = ((iM11306 ^ i2) * 23121) ^ (-1159331058);
                        i5 = -1013993969;
                    } else {
                        iM11306 = (C19806.m45029("۫ܳ") ^ i2) * 71;
                        i4 = ((iM11306 ^ i3) * (-16153)) ^ 2055982425;
                        i5 = -453518373;
                    }
                    break;
                case -1964060133:
                case 800975651:
                    if (C3286.f12186) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13327) ^ (-1685928948);
                        i5 = 1165050799;
                    } else {
                        iM11306 = C19806.m45029("ۛۛ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 14897) ^ 1349109877;
                        i5 = -1665973085;
                    }
                    break;
                case -1944834441:
                case -358762572:
                    RunnableC1564.m5345();
                    if (C1977.f7413 <= 0) {
                        iM11306 = (C19806.m45029("ᩳ۟") ^ i3) * (-17);
                        i4 = ((iM11306 ^ i2) * (-25115)) ^ 1217285335;
                        i5 = -1897146048;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13327) ^ (-1685928948);
                        i5 = 1165050799;
                    }
                    break;
                case -1668109532:
                case 734834016:
                    if (C3722.f13525 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13327) ^ (-1685928948);
                        i5 = 1165050799;
                    } else {
                        iM11306 = C19806.m45029("ۛܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 24661) ^ 1645266001;
                        i5 = -127401661;
                    }
                    break;
                case -1609929253:
                case 330260553:
                    if (C0050.f912 <= 0) {
                        iM11306 = (C19806.m45029("ᩳ۟") ^ i3) * (-17);
                        i4 = ((iM11306 ^ i2) * (-25115)) ^ 1217285335;
                        i5 = -1897146048;
                    } else {
                        iM11306 = (C19806.m45029("ܺۜ") + i3) * 43;
                        i4 = ((iM11306 ^ i2) * (-5061)) ^ (-1576761128);
                        i5 = 2077142031;
                    }
                    break;
                case -1599027248:
                case -1530572457:
                    if (C1461.f5957 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ܿ֡")) * 11;
                        i4 = ((iM11306 ^ i2) * 23121) ^ (-1159331058);
                        i5 = -1013993969;
                    } else {
                        iM11306 = C19806.m45029("۫۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-10001)) ^ (-54657060);
                        i5 = -438738088;
                    }
                    break;
                case -1528634196:
                case -75064118:
                    if (C1025.f4800 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13327) ^ (-1685928948);
                        i5 = 1165050799;
                    } else {
                        iM11306 = C19806.m45029("ܺۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24911) ^ 47375814;
                        i5 = 1655759034;
                    }
                    break;
                case -1316501988:
                case 1870218705:
                    if (C1419.m4972() > j) {
                        iM11306 = C19806.m45029("ۜۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 16441) ^ 1439650510;
                        i5 = -113993183;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩶ۨ")) * (-119);
                        i4 = ((iM11306 ^ i3) * (-10525)) ^ (-51970285);
                        i5 = -1806066784;
                    }
                    break;
                case -1303584310:
                case 2057016425:
                    C1977.m6356();
                    if (C1066.f4915 > 0) {
                        iM11306 = (i3 - C19806.m45029("ܿ֡")) * 11;
                        i4 = ((iM11306 ^ i2) * 23121) ^ (-1159331058);
                        i5 = -1013993969;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13327) ^ (-1685928948);
                        i5 = 1165050799;
                    }
                    break;
                case -1102376456:
                case 2143615677:
                    return false;
                case -992925468:
                case -930452359:
                    if (C2477.f9839 <= 0) {
                        iM11306 = C19806.m45029("ۤۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 31011) ^ (-1931224638);
                        i5 = -730446381;
                    } else {
                        iM11306 = C19806.m45029("ۨ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27341)) ^ (-901190500);
                        i5 = -509074545;
                    }
                    break;
                case -856654937:
                case 961880300:
                    j = c6606.f22230;
                    if (C7105.m18985()) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13327) ^ (-1685928948);
                        i5 = 1165050799;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳ۫") ^ i2) * (-57);
                        i4 = ((iM11306 ^ i3) * (-14175)) ^ (-222690031);
                        i5 = -223662295;
                    }
                    break;
                case -564817720:
                case 30034093:
                    C2249.m6915();
                    C3722.m10894();
                    iM11306 = ThreadFactoryC3888.m11306("ܳۚ") ^ i2;
                    i4 = ((iM11306 ^ i3) * 13327) ^ (-1685928948);
                    i5 = 1165050799;
                    break;
                case 155024321:
                case 1740396146:
                    if (C19806.f63586) {
                        iM11306 = (i3 - C19806.m45029("᩵۠")) * (-69);
                        i4 = ((iM11306 ^ i2) * (-24239)) ^ (-1010374024);
                        i5 = -1046538874;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14349)) ^ 287677497;
                        i5 = 1854245742;
                    }
                    break;
                case 427677727:
                case 1923324056:
                    return z;
                case 487789199:
                case 1102880354:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    C1937.m6279();
                    return false;
                case 860886128:
                case 2002718200:
                    c6606.f22230 = j2;
                    return z;
                case 1069571238:
                case 1909090848:
                    if (!C0817.f3443) {
                        iM11306 = C19806.m45029("ۤۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 31011) ^ (-1931224638);
                        i5 = -730446381;
                    } else {
                        iM11306 = (C19806.m45029("ᩳ۟") ^ i3) * (-17);
                        i4 = ((iM11306 ^ i2) * (-25115)) ^ 1217285335;
                        i5 = -1897146048;
                    }
                    break;
                case 1418208855:
                case 1519197627:
                    j2 = 0;
                    if (j == 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-27867)) ^ 54314876;
                        i5 = 717330728;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۙ֨")) * (-119);
                        i4 = ((iM11306 ^ i2) * 8259) ^ (-1123548360);
                        i5 = 1514566492;
                    }
                    break;
                default:
                    z = true;
                    if (C0629.f2722 <= 0) {
                        iM11306 = (i3 - C19806.m45029("᩵۠")) * (-69);
                        i4 = ((iM11306 ^ i2) * (-24239)) ^ (-1010374024);
                        i5 = -1046538874;
                    } else {
                        iM11306 = C19806.m45029("᩺᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * 25631) ^ (-396025772);
                        i5 = 216653360;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m17925(C6606 c6606) {
        long jM4972 = 0;
        long j = 0;
        int i = -386888849;
        int i2 = C3660.f13403;
        int i3 = RunnableC3388.f12514;
        int iM11306 = (i2 - ThreadFactoryC3888.m11306("ۙۢ")) * (-35);
        int i4 = ((iM11306 ^ i3) * 11007) ^ 251300442;
        int i5 = -1070092158;
        while (true) {
            i = ((((i ^ i3) * 25461) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2094702041:
                case -79576346:
                    if (C0797.f3386) {
                        iM11306 = C19806.m45029("ۡ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17425)) ^ (-679868123);
                        i5 = -374264571;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤ֡") + i2) * (-53);
                        i4 = ((iM11306 ^ i3) * (-16799)) ^ (-1581447315);
                        i5 = 1281549428;
                    }
                    break;
                case -2089274584:
                case 1774865767:
                    if (C0216.m1591() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬ܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 26479) ^ (-535145418);
                        i5 = -397101148;
                    } else {
                        iM11306 = C19806.m45029("ᩴ᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-29791)) ^ (-2069390349);
                        i5 = -1149952833;
                    }
                    break;
                case -2089231632:
                case 207192985:
                    jM4972 = C1419.m4972();
                    if (C0817.f3443) {
                        iM11306 = (i3 - C19806.m45029("᩷᩷")) * 23;
                        i4 = ((iM11306 ^ i2) * (-27005)) ^ 939305595;
                        i5 = 1054613677;
                    } else {
                        iM11306 = (C19806.m45029("ۗܿ") ^ i2) * (-57);
                        i4 = ((iM11306 ^ i3) * 26155) ^ (-2099346525);
                        i5 = -531459245;
                    }
                    break;
                case -1989291791:
                case 2116014189:
                    C2788.m8472();
                    C10634.m26820();
                    break;
                case -1870158891:
                case 774291395:
                    C19806.m45024();
                    C1419.m4973();
                    iM11306 = C19806.m45029("ۡ۬") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-17425)) ^ (-679868123);
                    i5 = -374264571;
                    break;
                case -1829803749:
                case -631717666:
                    if (C1419.f5860 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬ܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 26479) ^ (-535145418);
                        i5 = -397101148;
                    } else {
                        iM11306 = C19806.m45029("᩺ۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 12803) ^ (-1849982814);
                        i5 = 1917949744;
                    }
                    break;
                case -1507537277:
                case 2147109686:
                    if (!RunnableC1895.f7152) {
                        iM11306 = C19806.m45029("᩺ۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 12803) ^ (-1849982814);
                        i5 = 1917949744;
                    } else {
                        iM11306 = C19806.m45029("۟֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-7783)) ^ 191089720;
                        i5 = -1339648802;
                    }
                    break;
                case -1053131962:
                case -727228940:
                    if (C0629.f2722 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬ܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 26479) ^ (-535145418);
                        i5 = -397101148;
                    } else {
                        iM11306 = C19806.m45029("ۗܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30869) ^ 1066269941;
                        i5 = -1596246343;
                    }
                    break;
                case -330146514:
                case 1760047515:
                    C2704.m8255();
                    if (!C0629.m2907()) {
                        iM11306 = C19806.m45029("۟֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-7783)) ^ 191089720;
                        i5 = -1339648802;
                    } else {
                        iM11306 = C19806.m45029("ۡ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17425)) ^ (-679868123);
                        i5 = -374264571;
                    }
                    break;
                case 61086984:
                case 1929972572:
                    if (RunnableC1895.f7152) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘܰ") + i3) * (-65);
                        i4 = ((iM11306 ^ i2) * 7091) ^ 86949087;
                        i5 = 449523663;
                    } else {
                        iM11306 = C19806.m45029("ۡ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17425)) ^ (-679868123);
                        i5 = -374264571;
                    }
                    break;
                case 253067940:
                case 1920115201:
                    if (C1419.f5860 >= 0) {
                        iM11306 = C19806.m45029("ۡ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17425)) ^ (-679868123);
                        i5 = -374264571;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ܽܿ")) * (-67);
                        i4 = ((iM11306 ^ i3) * (-24109)) ^ 1502236041;
                        i5 = -825107979;
                    }
                    break;
                case 348080723:
                case 752382847:
                    if (C3286.f12186) {
                        iM11306 = C19806.m45029("۟֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-7783)) ^ 191089720;
                        i5 = -1339648802;
                    } else {
                        iM11306 = C19806.m45029("ܰܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 7413) ^ 985157733;
                        i5 = -745030483;
                    }
                    break;
                case 647171039:
                case 1301785375:
                    if (C19806.m45024()) {
                        iM11306 = C19806.m45029("᩺ۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 12803) ^ (-1849982814);
                        i5 = 1917949744;
                    } else {
                        iM11306 = C19806.m45029("ۨᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-26153)) ^ 1447247429;
                        i5 = -480673677;
                    }
                    break;
                case 930467013:
                case 1059614799:
                    j = 500;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (C19806.m45029("ۗܿ") ^ i2) * (-57);
                        i4 = ((iM11306 ^ i3) * 26155) ^ (-2099346525);
                        i5 = -531459245;
                    } else {
                        iM11306 = (C19806.m45029("ۚ᩸") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i2) * 2729) ^ 1015543022;
                        i5 = 585380076;
                    }
                    break;
                case 959090965:
                case 2103017792:
                    if (C1977.f7413 <= 0) {
                        iM11306 = (C19806.m45029("ۗܿ") ^ i2) * (-57);
                        i4 = ((iM11306 ^ i3) * 26155) ^ (-2099346525);
                        i5 = -531459245;
                    } else {
                        iM11306 = (C19806.m45029("᩶ۜ") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM11306 ^ i3) * (-14567)) ^ 1910719956;
                        i5 = 2069177699;
                    }
                    break;
                default:
                    c6606.f22230 = jM4972 + j;
                    break;
            }
            return;
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public final void layoutChildren() {
        int i = 1594431686;
        int i2 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int i3 = C2642.f10294;
        int iM45029 = C19806.m45029("ۚۧ") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-53)) ^ (-390334275);
        int i5 = -4073006;
        while (true) {
            i = ((((i ^ i2) * (-3637)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2064871572:
                case 51548708:
                    if (C1025.f4800 >= 0) {
                        iM45029 = (i3 - C19806.m45029("᩷ۚ")) * 123;
                        i4 = ((iM45029 ^ i2) * 20477) ^ 1832079807;
                        i5 = 843707454;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚۢ") + i3) * (-77);
                        i4 = ((iM45029 ^ i2) * (-19129)) ^ 2012756132;
                        i5 = -1574722295;
                    }
                    break;
                case -2023924374:
                case 477082771:
                    C0526.m2437();
                    if (C1460.f5948 < 0) {
                        iM45029 = C19806.m45029("ܺۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-18991)) ^ 1401608028;
                        i5 = 910586121;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۖ֡")) * 15;
                        i4 = ((iM45029 ^ i3) * 31811) ^ 1186562570;
                        i5 = -2077636064;
                    }
                    break;
                case -1821586582:
                case -697698968:
                    try {
                        super.layoutChildren();
                        break;
                    } catch (Throwable unused) {
                    }
                    iM45029 = C19806.m45029("ܿ֨") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-14779)) ^ (-1340345413);
                    i5 = 688950811;
                    break;
                case -1789458662:
                case 1616291265:
                    break;
                case -1595212143:
                case -285991075:
                    if (C7105.f23796 >= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۖ֡")) * 15;
                        i4 = ((iM45029 ^ i3) * 31811) ^ 1186562570;
                        i5 = -2077636064;
                    } else {
                        iM45029 = (C19806.m45029("֨ܳ") ^ i2) * 81;
                        i4 = ((iM45029 ^ i3) * 3323) ^ 1676970083;
                        i5 = -1787593190;
                    }
                    break;
                case -1311413887:
                case -1025610826:
                    if (C0797.m3359()) {
                        iM45029 = ThreadFactoryC3888.m11306("֨֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-19775)) ^ 1228729253;
                        i5 = 2027251107;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-32241)) ^ 1110534776;
                        i5 = 1724402064;
                    }
                    break;
                case -1177211116:
                case -818903464:
                    C1977.m6356();
                    iM45029 = ThreadFactoryC3888.m11306("ۤۖ") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-24981)) ^ 1707287346;
                    i5 = -909857721;
                    break;
                case -1170240382:
                case 611420727:
                    if (C2704.f10408) {
                        iM45029 = C19806.m45029("ۛ֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10215) ^ (-1702694060);
                        i5 = 1247053210;
                    } else {
                        iM45029 = C19806.m45029("ܺۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-18991)) ^ 1401608028;
                        i5 = 910586121;
                    }
                    break;
                case -878983880:
                case -539368721:
                    if (C2788.f10625 >= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۖ֡")) * 15;
                        i4 = ((iM45029 ^ i3) * 31811) ^ 1186562570;
                        i5 = -2077636064;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۤۤ")) * (-39);
                        i4 = ((iM45029 ^ i3) * (-23019)) ^ (-488413982);
                        i5 = -633291816;
                    }
                    break;
                case -698414577:
                case 954079156:
                    C1066.m4023();
                    C2704.m8255();
                    break;
                case -530941787:
                case 214562004:
                    if (C3743.f13569) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢۙ") + i2) * (-33);
                        i4 = ((iM45029 ^ i3) * 28177) ^ 612968645;
                        i5 = 1865875715;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۖ֡")) * 15;
                        i4 = ((iM45029 ^ i3) * 31811) ^ 1186562570;
                        i5 = -2077636064;
                    }
                    break;
                case -487318027:
                case 1920421564:
                    if (C1189.m4368() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-32241)) ^ 1110534776;
                        i5 = 1724402064;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳۚ") ^ i3) * 33;
                        i4 = ((iM45029 ^ i2) * (-19873)) ^ (-1563101691);
                        i5 = -797045973;
                    }
                    break;
                case -472457408:
                case 1231343339:
                    if (C1148.f5161 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-32241)) ^ 1110534776;
                        i5 = 1724402064;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ۠") + i3) * (-91);
                        i4 = ((iM45029 ^ i2) * 23381) ^ 541168592;
                        i5 = 1669853870;
                    }
                    break;
                case 119262612:
                case 202964419:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-32241)) ^ 1110534776;
                        i5 = 1724402064;
                    } else {
                        iM45029 = C19806.m45029("ۗ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * 21739) ^ 460638650;
                        i5 = -1929945135;
                    }
                    break;
                case 702410196:
                case 1770699814:
                    C0050.m946();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۖ֡")) * 15;
                        i4 = ((iM45029 ^ i3) * 31811) ^ 1186562570;
                        i5 = -2077636064;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-24981)) ^ 1707287346;
                        i5 = -909857721;
                    }
                    break;
                case 831724848:
                case 1566602748:
                    if (C0797.f3386) {
                        iM45029 = C19806.m45029("ܺۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-18991)) ^ 1401608028;
                        i5 = 910586121;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫ᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-11979)) ^ (-251063829);
                        i5 = -62040685;
                    }
                    break;
                default:
                    C3722.m10894();
                    if (C1937.f7317 < 0) {
                        iM45029 = (i3 - C19806.m45029("᩷ۚ")) * 123;
                        i4 = ((iM45029 ^ i2) * 20477) ^ 1832079807;
                        i5 = 843707454;
                    } else {
                        iM45029 = C19806.m45029("ܺۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-18991)) ^ 1401608028;
                        i5 = 910586121;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m17930() {
        this.f22232 = 0;
    }

    @Override // android.widget.AbsListView
    public final boolean isFastScrollEnabled() {
        return this.f22233;
    }

    @Override // android.widget.AbsListView
    public final void setFastScrollEnabled(boolean z) {
        this.f22233 = z;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m17915(MotionEvent motionEvent) {
        int actionMasked = 0;
        int i = 2019467380;
        int i2 = C1461.f5957;
        int i3 = C0278.f1572;
        int iM11306 = ThreadFactoryC3888.m11306("᩷֨") ^ i3;
        int i4 = ((iM11306 ^ i2) * 32001) ^ (-1695950115);
        int i5 = 1586971668;
        while (true) {
            i = ((((i ^ i2) * 3957) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2013166438:
                case -1286824787:
                    if (actionMasked == 3) {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ۢ") + i2) * (-51);
                        i4 = ((iM11306 ^ i3) * 20155) ^ 1436735368;
                        i5 = 963194314;
                    } else {
                        iM11306 = (C19806.m45029("ۜ᩺") ^ i2) * 43;
                        i4 = ((iM11306 ^ i3) * 16231) ^ 585219089;
                        i5 = -1770833979;
                    }
                    break;
                case -1915266118:
                case 669388110:
                    if (C3577.f13150 >= 0) {
                        iM11306 = C19806.m45029("ۙܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-27565)) ^ (-1272190449);
                        i5 = 2118520262;
                    } else {
                        iM11306 = (C19806.m45029("۟᩺") + i3) * (-19);
                        i4 = ((iM11306 ^ i2) * (-25667)) ^ (-1842042013);
                        i5 = -1237715471;
                    }
                    break;
                case -1911778014:
                case -1282861044:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֫ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-13661)) ^ (-1359713956);
                        i5 = -1341498637;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۢ᩹")) * 43;
                        i4 = ((iM11306 ^ i2) * 8543) ^ 1009723219;
                        i5 = -2103459088;
                    }
                    break;
                case -1853863437:
                case 1708965584:
                    if (RunnableC1895.f7152) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴ᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-30765)) ^ 909857013;
                        i5 = 1003878070;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-13661)) ^ (-1359713956);
                        i5 = -1341498637;
                    }
                    break;
                case -1713674621:
                case 1332302458:
                    break;
                case -1433231343:
                case 391485933:
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = ThreadFactoryC3888.m11306("֫ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-13661)) ^ (-1359713956);
                        i5 = -1341498637;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 31375) ^ 785033894;
                        i5 = -422129758;
                    }
                    break;
                case -1384255720:
                case 293868444:
                    C3535.m10431();
                    iM11306 = ThreadFactoryC3888.m11306("ۧۗ") ^ i2;
                    i4 = ((iM11306 ^ i3) * 31375) ^ 785033894;
                    i5 = -422129758;
                    break;
                case -1103486993:
                case 498133881:
                    if (C0216.f1393 != 0) {
                        iM11306 = C19806.m45029("ܺ֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-26189)) ^ 93894193;
                        i5 = -1691793352;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ۠") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-13349)) ^ (-1155763503);
                        i5 = 823235682;
                    }
                    break;
                case -1095553327:
                case 87053659:
                    C2788.m8472();
                    C1419.m4973();
                    break;
                case -1018392534:
                case 1933015508:
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 31375) ^ 785033894;
                        i5 = -422129758;
                    } else {
                        iM11306 = C19806.m45029("ۛᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5775) ^ (-1902100360);
                        i5 = 170030194;
                    }
                    break;
                case -765697955:
                case 1713441995:
                    actionMasked = motionEvent.getActionMasked();
                    if (actionMasked != 0) {
                        iM11306 = (C19806.m45029("۬֡") + i3) * (-107);
                        i4 = ((iM11306 ^ i2) * 32205) ^ 636101306;
                        i5 = 1521783773;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ۢ") + i2) * (-51);
                        i4 = ((iM11306 ^ i3) * 20155) ^ 1436735368;
                        i5 = 963194314;
                    }
                    break;
                case -497685522:
                case 1769230284:
                    if (C0817.f3443) {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ܳ") ^ i2) * (-55);
                        i4 = ((iM11306 ^ i3) * 1075) ^ 1104719644;
                        i5 = 489240435;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 31375) ^ 785033894;
                        i5 = -422129758;
                    }
                    break;
                case -326002872:
                case -196011503:
                    if (actionMasked != 1) {
                        iM11306 = (C19806.m45029("֡ܿ") ^ i3) * (-61);
                        i4 = ((iM11306 ^ i2) * 5415) ^ 1048561775;
                        i5 = 1920527057;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ۢ") + i2) * (-51);
                        i4 = ((iM11306 ^ i3) * 20155) ^ 1436735368;
                        i5 = 963194314;
                    }
                    break;
                case -86500874:
                case 1672709520:
                    if (C3722.f13525 <= 0) {
                        iM11306 = C19806.m45029("ܺ֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-26189)) ^ 93894193;
                        i5 = -1691793352;
                    } else {
                        iM11306 = C19806.m45029("᩸ۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 7887) ^ 2103186476;
                        i5 = -709796491;
                    }
                    break;
                case -27230838:
                case 639888355:
                    C2871.m8646();
                    if (C1025.f4800 >= 0) {
                        iM11306 = C19806.m45029("ܺ֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-26189)) ^ 93894193;
                        i5 = -1691793352;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-13661)) ^ (-1359713956);
                        i5 = -1341498637;
                    }
                    break;
                case 291612141:
                case 751978064:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֫ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-13661)) ^ (-1359713956);
                        i5 = -1341498637;
                    } else {
                        iM11306 = C19806.m45029("ۤۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-26423)) ^ 2075797148;
                        i5 = 2024497460;
                    }
                    break;
                case 1138982242:
                case 1298637418:
                    if (C2642.f10294 <= 0) {
                        iM11306 = C19806.m45029("ۛᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5775) ^ (-1902100360);
                        i5 = 170030194;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-4037)) ^ (-2142921323);
                        i5 = -336805142;
                    }
                    break;
                case 1524218878:
                case 1681011159:
                    this.f22237 = false;
                    break;
                case 1525127454:
                case 1883933632:
                    if (C1461.f5957 <= 0) {
                        iM11306 = C19806.m45029("ܺ֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-26189)) ^ 93894193;
                        i5 = -1691793352;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡ᩺") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-28325)) ^ (-950947591);
                        i5 = -1555172559;
                    }
                    break;
                default:
                    if (C0216.m1591() <= 0) {
                        iM11306 = C19806.m45029("ۙܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-27565)) ^ (-1272190449);
                        i5 = 2118520262;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ۢ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 20915) ^ (-1876028103);
                        i5 = 202743074;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m17923() {
        C22398 c22398 = null;
        float f = 0.0f;
        int count = 0;
        int iM6173 = 0;
        float f2 = 0.0f;
        int iM17931 = 0;
        float f3 = 0.0f;
        int i = 8905453;
        int i2 = AbstractC0464.f2088;
        int i3 = RunnableC3388.f12514;
        int iM45029 = (i2 - C19806.m45029("ۧᩳ")) * 81;
        int i4 = ((iM45029 ^ i3) * (-26325)) ^ (-154070508);
        int i5 = -1999126646;
        while (true) {
            i = ((((i ^ i3) * 18999) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2006031490:
                case 1387637422:
                    if (C1460.f5948 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶ᩸") ^ i3) * 61;
                        i4 = ((iM45029 ^ i2) * 28301) ^ (-1301343909);
                        i5 = 145050054;
                    } else {
                        iM45029 = (C19806.m45029("ܰۗ") ^ i3) * (-99);
                        i4 = ((iM45029 ^ i2) * (-30557)) ^ (-457388595);
                        i5 = -853882957;
                    }
                    break;
                case -1956932357:
                case 685964555:
                    if (f > c22398.f73109) {
                        iM45029 = ThreadFactoryC3888.m11306("۫᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 31323) ^ (-912259346);
                        i5 = -240265066;
                    } else {
                        iM45029 = C19806.m45029("ۢ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-5935)) ^ 757756346;
                        i5 = 1276622452;
                    }
                    break;
                case -1931933502:
                case -1364752945:
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺܺ") ^ i3) * (-123);
                        i4 = ((iM45029 ^ i2) * 7395) ^ (-1646904162);
                        i5 = 1429214267;
                    } else {
                        iM45029 = C19806.m45029("ۡܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 8057) ^ 1353575736;
                        i5 = 1291832029;
                    }
                    break;
                case -1855291221:
                case -327949463:
                    if (C7105.f23796 >= 0) {
                        iM45029 = C19806.m45029("ۡܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 8057) ^ 1353575736;
                        i5 = 1291832029;
                    } else {
                        iM45029 = C19806.m45029("ۡ᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * 9905) ^ 361379154;
                        i5 = 181924403;
                    }
                    break;
                case -1846893437:
                case 296419955:
                    if (CallableC1627.f6528) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۜ") + i3) * 29;
                        i4 = ((iM45029 ^ i2) * (-12887)) ^ (-485439013);
                        i5 = 855428822;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺܺ") ^ i3) * (-123);
                        i4 = ((iM45029 ^ i2) * 7395) ^ (-1646904162);
                        i5 = 1429214267;
                    }
                    break;
                case -1712852034:
                case -1198287933:
                    if (!this.f22244) {
                        iM45029 = C19806.m45029("ۢ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-5935)) ^ 757756346;
                        i5 = 1276622452;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢܽ") ^ i2) * 21;
                        i4 = ((iM45029 ^ i3) * (-1737)) ^ (-902465930);
                        i5 = -256976854;
                    }
                    break;
                case -1707108151:
                case 469929971:
                    if (this.f22252) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳᩴ") ^ i2) * (-9);
                        i4 = ((iM45029 ^ i3) * 31219) ^ (-1309612083);
                        i5 = 1084468009;
                    } else {
                        iM45029 = (C19806.m45029("ܳ۬") + i3) * (-43);
                        i4 = ((iM45029 ^ i2) * 17133) ^ (-1651266732);
                        i5 = -1208699419;
                    }
                    break;
                case -1626901686:
                case -1536374367:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (C0962.m3746() >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶ᩸") ^ i3) * 61;
                        i4 = ((iM45029 ^ i2) * 28301) ^ (-1301343909);
                        i5 = 145050054;
                    } else {
                        iM45029 = C19806.m45029("ᩴ᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10471) ^ (-402831453);
                        i5 = -1310028433;
                    }
                    break;
                case -1540843933:
                case 1934305313:
                    if (this.f22245) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢܽ") ^ i2) * 21;
                        i4 = ((iM45029 ^ i3) * (-1737)) ^ (-902465930);
                        i5 = -256976854;
                    } else {
                        iM45029 = (C19806.m45029("ۧܳ") + i3) * (-21);
                        i4 = ((iM45029 ^ i2) * (-19443)) ^ (-1695782018);
                        i5 = -764063205;
                    }
                    break;
                case -1418617511:
                case 1619522199:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶ᩸") ^ i3) * 61;
                        i4 = ((iM45029 ^ i2) * 28301) ^ (-1301343909);
                        i5 = 145050054;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩻֡")) * (-9);
                        i4 = ((iM45029 ^ i3) * (-4881)) ^ 646446952;
                        i5 = 1968061140;
                    }
                    break;
                case -1366540012:
                case -835645713:
                    C0526.m2437();
                    C1148.m4232();
                    return false;
                case -1329852858:
                case 1279701349:
                    return true;
                case -1035728035:
                case -835041734:
                    f2 = count;
                    iM17931 = m17931();
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = C19806.m45029("ۤ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-24397)) ^ 156818491;
                        i5 = -75846096;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۗ֨")) * (-103);
                        i4 = ((iM45029 ^ i2) * 13509) ^ 249898823;
                        i5 = 2005198070;
                    }
                    break;
                case -916926534:
                case -729425113:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = C19806.m45029("ۤ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-24397)) ^ 156818491;
                        i5 = -75846096;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۡۘ")) * q.h;
                        i4 = ((iM45029 ^ i3) * (-32169)) ^ 1373865851;
                        i5 = -1230145925;
                    }
                    break;
                case -788622684:
                case 1702527987:
                    C0797.m3359();
                    if (C0278.m1789() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-24189)) ^ (-696777461);
                        i5 = -66149698;
                    } else {
                        iM45029 = C19806.m45029("ۡܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 8057) ^ 1353575736;
                        i5 = 1291832029;
                    }
                    break;
                case -770201582:
                case 1234423737:
                    return false;
                case -754981097:
                case 923789098:
                    RunnableC1606.m5473();
                    if (C0216.f1393 != 0) {
                        iM45029 = C19806.m45029("ᩴ᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10471) ^ (-402831453);
                        i5 = -1310028433;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳۗ") + i2) * 37;
                        i4 = ((iM45029 ^ i3) * 29979) ^ (-1406309549);
                        i5 = -477900502;
                    }
                    break;
                case -702829865:
                case -214777219:
                    if (f2 / f3 <= 3.5f) {
                        iM45029 = C19806.m45029("ۢ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-5935)) ^ 757756346;
                        i5 = 1276622452;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳᩴ") ^ i2) * (-9);
                        i4 = ((iM45029 ^ i3) * 31219) ^ (-1309612083);
                        i5 = 1084468009;
                    }
                    break;
                case -640521979:
                case 2109741203:
                    if (C0050.f912 <= 0) {
                        iM45029 = C19806.m45029("ۤ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-24397)) ^ 156818491;
                        i5 = -75846096;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۤܺ")) * 109;
                        i4 = ((iM45029 ^ i3) * (-16731)) ^ 2082508067;
                        i5 = -1948456058;
                    }
                    break;
                case -609266526:
                case 283452122:
                    if (this.f22252) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢܽ") ^ i2) * 21;
                        i4 = ((iM45029 ^ i3) * (-1737)) ^ (-902465930);
                        i5 = -256976854;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻֫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 15069) ^ 2033549973;
                        i5 = 646994156;
                    }
                    break;
                case -425036214:
                case 1086646080:
                    C1419.m4973();
                    if (C3577.f13150 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳۗ") + i2) * 37;
                        i4 = ((iM45029 ^ i3) * 29979) ^ (-1406309549);
                        i5 = -477900502;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-24041)) ^ (-36415624);
                        i5 = -152163106;
                    }
                    break;
                case -410130590:
                case 1279911282:
                    count = getCount();
                    iM6173 = RunnableC1895.m6173(this);
                    if (iM6173 > 0) {
                        iM45029 = C19806.m45029("᩷ۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-20163)) ^ (-435195661);
                        i5 = 1682482920;
                    } else {
                        iM45029 = C19806.m45029("ۢ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-5935)) ^ 757756346;
                        i5 = 1276622452;
                    }
                    break;
                case -376736563:
                case 614787397:
                    C0526.m2437();
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺܺ") ^ i3) * (-123);
                        i4 = ((iM45029 ^ i2) * 7395) ^ (-1646904162);
                        i5 = 1429214267;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-24041)) ^ (-36415624);
                        i5 = -152163106;
                    }
                    break;
                case -124424087:
                case 2117623457:
                    if (this.f22233) {
                        iM45029 = ThreadFactoryC3888.m11306("۫ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 8795) ^ 183752740;
                        i5 = -1521054921;
                    } else {
                        iM45029 = C19806.m45029("ۢ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-5935)) ^ 757756346;
                        i5 = 1276622452;
                    }
                    break;
                case -46866106:
                case 1786349400:
                    c22398 = this.f22236;
                    f = c22398.f73105;
                    if (C2642.f10294 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-24189)) ^ (-696777461);
                        i5 = -66149698;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-13883)) ^ (-1007327036);
                        i5 = -473932642;
                    }
                    break;
                case 443725480:
                case 1856420850:
                    f3 = iM17931;
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = C19806.m45029("ۤ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-24397)) ^ 156818491;
                        i5 = -75846096;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۜ᩵")) * 97;
                        i4 = ((iM45029 ^ i3) * 1299) ^ 842027593;
                        i5 = -1908535501;
                    }
                    break;
                case 572596434:
                case 712318971:
                    if (C2871.f10837 >= 0) {
                        iM45029 = C19806.m45029("ᩴ᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10471) ^ (-402831453);
                        i5 = -1310028433;
                    } else {
                        iM45029 = (C19806.m45029("ۜۖ") + i3) * (-65);
                        i4 = ((iM45029 ^ i2) * (-5793)) ^ (-700069970);
                        i5 = 1257994718;
                    }
                    break;
                case 624437213:
                case 1595465750:
                    C3286.m9798();
                    C3286.m9798();
                    iM45029 = ThreadFactoryC3888.m11306("ۗۤ") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-24041)) ^ (-36415624);
                    i5 = -152163106;
                    break;
                case 906382693:
                case 1873664454:
                    if (c22398.f73106 > c22398.f73107) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-19297)) ^ (-295259270);
                        i5 = -1075025269;
                    } else {
                        iM45029 = C19806.m45029("ۢ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-5935)) ^ 757756346;
                        i5 = 1276622452;
                    }
                    break;
                default:
                    if (count - iM6173 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 23271) ^ (-1044280343);
                        i5 = -2113845791;
                    } else {
                        iM45029 = C19806.m45029("ۢ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-5935)) ^ 757756346;
                        i5 = 1276622452;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m17926(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = null;
        Iterator itM10563 = null;
        int i = -456324295;
        int i2 = RunnableC0195.f1321;
        int i3 = C2642.f10294;
        int iM45029 = C19806.m45029("ۛ֫") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-20981)) ^ (-1245518109);
        int i5 = -594315207;
        while (true) {
            i = ((((i ^ i2) * (-10127)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2084786941:
                case -1022830541:
                    if (C0050.f912 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-21033)) ^ (-8278507);
                        i5 = 758883956;
                    } else {
                        iM45029 = (C19806.m45029("ܿۨ") ^ i2) * 91;
                        i4 = ((iM45029 ^ i3) * 6271) ^ 219831701;
                        i5 = 1222411884;
                    }
                    break;
                case -1992552542:
                case -1634063797:
                    if (this.f22251 == null) {
                        iM45029 = C19806.m45029("᩵ۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 5175) ^ 1267223053;
                        i5 = -116677243;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-3107)) ^ 1792570719;
                        i5 = 23129634;
                    }
                    break;
                case -1807400017:
                case -1526201491:
                    if (isEnabled()) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ᩴۘ")) * (-7);
                        i4 = ((iM45029 ^ i3) * (-22969)) ^ 1427172402;
                        i5 = 201437269;
                    } else {
                        iM45029 = C19806.m45029("᩵ۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 5175) ^ 1267223053;
                        i5 = -116677243;
                    }
                    break;
                case -1609850924:
                case 388702892:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫֫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-2125)) ^ 1367808330;
                        i5 = -1291486242;
                    } else {
                        iM45029 = C19806.m45029("ۘ᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * 20877) ^ 474753392;
                        i5 = -774604387;
                    }
                    break;
                case -1565138064:
                case 1539398375:
                    onTouchListener = this.f22248;
                    if (onTouchListener != null) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܺۤ")) * (-3);
                        i4 = ((iM45029 ^ i2) * (-32167)) ^ (-16299130);
                        i5 = -2038893615;
                    } else {
                        iM45029 = C19806.m45029("ۨ֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * 28123) ^ 2032978215;
                        i5 = 934875779;
                    }
                    break;
                case -1471623870:
                case -833622727:
                    if (C1460.m5050() != 0) {
                        iM45029 = C19806.m45029("ۘۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 22309) ^ 870999600;
                        i5 = -581199924;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫ۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12637) ^ 651746485;
                        i5 = 408587643;
                    }
                    break;
                case -1447606378:
                case 1664004712:
                    C3743.m10966();
                    if (!C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("۫֫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-2125)) ^ 1367808330;
                        i5 = -1291486242;
                    } else {
                        iM45029 = C19806.m45029("ۘۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 22309) ^ 870999600;
                        i5 = -581199924;
                    }
                    break;
                case -1398874684:
                case 368850565:
                    if (C2249.m6915() <= 0) {
                        iM45029 = C19806.m45029("ۘۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 22309) ^ 870999600;
                        i5 = -581199924;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ᩺") ^ i2;
                        i4 = ((iM45029 ^ i3) * 17519) ^ 1382361637;
                        i5 = 1488501076;
                    }
                    break;
                case -1317403195:
                case 376123626:
                    if (C1460.f5948 >= 0) {
                        iM45029 = C19806.m45029("ۘۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 22309) ^ 870999600;
                        i5 = -581199924;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("֡᩸")) * 39;
                        i4 = ((iM45029 ^ i3) * (-8313)) ^ (-816747979);
                        i5 = -320770920;
                    }
                    break;
                case -1148221831:
                case -243432556:
                    if (C2642.f10294 <= 0) {
                        iM45029 = C19806.m45029("᩷᩺") ^ i2;
                        i4 = ((iM45029 ^ i3) * 24027) ^ (-1418388496);
                        i5 = -1057477928;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬ܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-17049)) ^ (-1476627294);
                        i5 = 1763333912;
                    }
                    break;
                case -1027590411:
                case 281417879:
                    C1668.m5583();
                    iM45029 = ThreadFactoryC3888.m11306("ܺ᩺") ^ i2;
                    i4 = ((iM45029 ^ i3) * 17519) ^ 1382361637;
                    i5 = 1488501076;
                    break;
                case -892380008:
                case 1459567596:
                    if (C2477.f9839 <= 0) {
                        iM45029 = C19806.m45029("᩷᩺") ^ i2;
                        i4 = ((iM45029 ^ i3) * 24027) ^ (-1418388496);
                        i5 = -1057477928;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("۫۬")) * (-21);
                        i4 = ((iM45029 ^ i2) * 19643) ^ 342871668;
                        i5 = 230397804;
                    }
                    break;
                case -785746729:
                case 673362688:
                    itM10563 = C3577.m10563(this.f22251);
                    iM45029 = C19806.m45029("ۜܰ") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-15961)) ^ (-823901785);
                    i5 = -1265512645;
                    break;
                case -603640667:
                case -76704377:
                    C0817.m3399();
                    RunnableC0195.m1431();
                    return false;
                case -595471604:
                case 659076545:
                    onTouchListener.onTouch(this, motionEvent);
                    iM45029 = C19806.m45029("ۨ֡") ^ i3;
                    i4 = ((iM45029 ^ i2) * 28123) ^ 2032978215;
                    i5 = 934875779;
                    break;
                case -426515266:
                case 694421995:
                    return false;
                case -382161909:
                case 214401965:
                    if (C0962.f3784) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-21033)) ^ (-8278507);
                        i5 = 758883956;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-10461)) ^ 1624991158;
                        i5 = -1948450816;
                    }
                    break;
                case -359855033:
                case 1788150344:
                    if (((View.OnTouchListener) C0216.m1584(itM10563)).onTouch(this, motionEvent)) {
                        iM45029 = C19806.m45029("ᩴ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-29287)) ^ 1727022028;
                        i5 = 1962453361;
                    } else {
                        iM45029 = C19806.m45029("ۜܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-15961)) ^ (-823901785);
                        i5 = -1265512645;
                    }
                    break;
                case -265893861:
                case 429155740:
                    if (C0278.m1789() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ᩺") ^ i2;
                        i4 = ((iM45029 ^ i3) * 17519) ^ 1382361637;
                        i5 = 1488501076;
                    } else {
                        iM45029 = (C19806.m45029("ۚ᩺") + i2) * 99;
                        i4 = ((iM45029 ^ i3) * 7153) ^ (-1181799435);
                        i5 = 1355399444;
                    }
                    break;
                case 144191140:
                case 849359864:
                    if (C3660.f13403 >= 0) {
                        iM45029 = C19806.m45029("᩷᩺") ^ i2;
                        i4 = ((iM45029 ^ i3) * 24027) ^ (-1418388496);
                        i5 = -1057477928;
                    } else {
                        iM45029 = C19806.m45029("ۘۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 22309) ^ 870999600;
                        i5 = -581199924;
                    }
                    break;
                case 390382268:
                case 1578637904:
                    if (C0962.m3748(itM10563)) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬֡") ^ i2) * (-111);
                        i4 = ((iM45029 ^ i3) * (-32235)) ^ (-1812885085);
                        i5 = -1674215538;
                    } else {
                        iM45029 = C19806.m45029("᩵ۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 5175) ^ 1267223053;
                        i5 = -116677243;
                    }
                    break;
                case 432921659:
                case 1947483666:
                    if (RunnableC1564.f6300) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-21033)) ^ (-8278507);
                        i5 = 758883956;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨᩻") ^ i3) * (-87);
                        i4 = ((iM45029 ^ i2) * (-31361)) ^ 15302662;
                        i5 = -501332987;
                    }
                    break;
                case 1395554571:
                case 1709880671:
                    if (C2871.f10837 >= 0) {
                        iM45029 = C19806.m45029("ۘۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 22309) ^ 870999600;
                        i5 = -581199924;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗܺ") + i3) * (-11);
                        i4 = ((iM45029 ^ i2) * (-30841)) ^ 684946865;
                        i5 = 355620452;
                    }
                    break;
                default:
                    return true;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int iM45029;
        int i;
        int actionMasked = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        float x = 0.0f;
        float y = 0.0f;
        boolean zOnTouchEvent = false;
        int i3 = -842833051;
        int i4 = C1668.f6641;
        int i5 = C2249.f8050;
        int iM11306 = ThreadFactoryC3888.m11306("ۖۤ") ^ i5;
        int i6 = ((iM11306 ^ i4) * (-6945)) ^ (-229162264);
        int i7 = -1715221953;
        while (true) {
            int i8 = iM11306 ^ i7;
            while (true) {
                i3 = ((((i3 ^ i4) * (-10565)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2101298605:
                    case 127239640:
                        if (!m17926(motionEvent)) {
                            iM11306 = ThreadFactoryC3888.m11306("ܰ᩵") ^ i5;
                            i6 = ((iM11306 ^ i4) * 21401) ^ (-1711354613);
                            i7 = 1642675041;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("᩶ܿ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 21191) ^ 898662751;
                        i7 = 1107688401;
                        break;
                    case -2005640948:
                    case -637263387:
                        return zOnTouchEvent;
                    case -2004147637:
                    case -1305683473:
                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۙܶ") ^ i4;
                            i6 = ((iM11306 ^ i5) * 29479) ^ (-1309299790);
                            i7 = -74704390;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("֡ۢ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-23163)) ^ 414955572;
                        i7 = -884995124;
                        break;
                    case -1925676454:
                    case 720390527:
                        if (!C0629.m2907()) {
                            iM11306 = (C19806.m45029("ۘ۠") ^ i5) * 69;
                            i6 = ((iM11306 ^ i4) * 7753) ^ (-273731267);
                            i7 = 1654271890;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ۨ᩻") ^ i5;
                        i6 = ((iM11306 ^ i4) * 7041) ^ (-72973522);
                        i7 = -94072418;
                        break;
                    case -1733277054:
                    case -318042367:
                        if (actionMasked == z2) {
                            iM11306 = (i5 - ThreadFactoryC3888.m11306("᩺᩶")) * 11;
                            i6 = ((iM11306 ^ i4) * 16585) ^ (-42112127);
                            i7 = 712007790;
                            break;
                        }
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩻֨")) * (-127);
                        i6 = ((iM11306 ^ i5) * 24619) ^ 1201806128;
                        i7 = 606070857;
                        break;
                    case -1584753845:
                    case 118808941:
                        this.f22239 = z2;
                        m17918(motionEvent);
                        return z2;
                    case -1442316489:
                    case 1082187883:
                        if (!C19806.f63586) {
                            iM11306 = C19806.m45029("ۚ֫") ^ i4;
                            i6 = ((iM11306 ^ i5) * 9061) ^ 1222194696;
                            i7 = -1138689938;
                            break;
                        }
                        iM11306 = C19806.m45029("֨ܰ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-4737)) ^ 2069927434;
                        i7 = 937378355;
                        break;
                    case -1246083539:
                    case 727371488:
                        C0216.m1591();
                        MenuItemOnMenuItemClickListenerC3244.m9701();
                        return false;
                    case -1202822575:
                    case -900360112:
                        C3660.m10791();
                        iM11306 = C19806.m45029("ۚ֫") ^ i4;
                        i6 = ((iM11306 ^ i5) * 9061) ^ 1222194696;
                        i7 = -1138689938;
                        break;
                        break;
                    case -1138678668:
                    case 1503674782:
                        if (C1066.f4915 > 0) {
                            iM11306 = C19806.m45029("ۨܿ") ^ i4;
                            i6 = ((iM11306 ^ i5) * 22093) ^ 517138206;
                            i7 = 440578962;
                            break;
                        }
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴܽ") + i5) * 75;
                        i6 = ((iM11306 ^ i4) * (-21545)) ^ 1331275544;
                        i7 = 1733602219;
                        break;
                    case -1120339239:
                    case 1774752884:
                        if (!this.f22237) {
                            iM11306 = ThreadFactoryC3888.m11306("ۚ᩷") ^ i4;
                            i6 = ((iM11306 ^ i5) * 29335) ^ (-430984004);
                            i7 = -276758685;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ۚۚ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 2917) ^ 30693107;
                        i7 = 761824558;
                        break;
                    case -1011284777:
                    case -898605226:
                        z = false;
                        z2 = true;
                        if (actionMasked != 0) {
                            iM11306 = (C19806.m45029("ۨܰ") + i5) * 59;
                            i6 = ((iM11306 ^ i4) * (-19947)) ^ (-42769375);
                            i7 = 340377112;
                            break;
                        }
                        iM11306 = (ThreadFactoryC3888.m11306("֫ۙ") + i4) * q.h;
                        i6 = ((iM11306 ^ i5) * 13687) ^ 119722316;
                        i7 = -1247203825;
                        break;
                    case -969471108:
                    case 122542667:
                        C1148.m4232();
                        if (C2871.f10837 < 0) {
                            iM11306 = C19806.m45029("᩵ۧ") ^ i5;
                            i6 = ((iM11306 ^ i4) * 13309) ^ 1994062275;
                            i7 = 606749878;
                            break;
                        }
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ֨") ^ i4) * 41;
                        i6 = ((iM11306 ^ i5) * 31711) ^ 1981103447;
                        i7 = 710634283;
                        break;
                    case -964313856:
                    case 1123517174:
                        m17915(motionEvent);
                        this.f22239 = z;
                        if (!m17923()) {
                            iM11306 = ThreadFactoryC3888.m11306("ۚ᩷") ^ i4;
                            i6 = ((iM11306 ^ i5) * 29335) ^ (-430984004);
                            i7 = -276758685;
                            break;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("۫ᩴ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-18165)) ^ 2029817445;
                        i7 = 636282797;
                        break;
                    case -912703336:
                    case -400918555:
                        actionMasked = motionEvent.getActionMasked();
                        if (C7105.f23796 < 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۘ֨") ^ i4;
                            i6 = ((iM11306 ^ i5) * 11365) ^ (-1275897055);
                            i7 = 1422078360;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("֡ۢ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-23163)) ^ 414955572;
                        i7 = -884995124;
                        break;
                        break;
                    case -863599534:
                    case -464900405:
                        if (!C0962.f3784) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۗ֨") ^ i4) * 41;
                            i6 = ((iM11306 ^ i5) * 31711) ^ 1981103447;
                            i7 = 710634283;
                            break;
                            break;
                        }
                        iM11306 = C19806.m45029("ۚ֫") ^ i4;
                        i6 = ((iM11306 ^ i5) * 9061) ^ 1222194696;
                        i7 = -1138689938;
                        break;
                        break;
                    case -849940683:
                    case 658741931:
                        zOnTouchEvent = onTouchEvent(motionEvent);
                        if (actionMasked == z2) {
                            iM11306 = ThreadFactoryC3888.m11306("ۗ᩷") ^ i5;
                            i6 = ((iM11306 ^ i4) * 30289) ^ (-1405757536);
                            i7 = 1033347126;
                            break;
                        }
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۤۤ")) * (-9);
                        i6 = ((iM11306 ^ i5) * (-26587)) ^ 156367544;
                        i7 = 1666773713;
                        break;
                    case -806511560:
                    case 2006243550:
                        if (actionMasked != i2) {
                            iM11306 = C19806.m45029("ᩴܿ") ^ i5;
                            i6 = ((iM11306 ^ i4) * (-28055)) ^ 25989210;
                            i7 = 1209283368;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ۗ᩷") ^ i5;
                        i6 = ((iM11306 ^ i4) * 30289) ^ (-1405757536);
                        i7 = 1033347126;
                        break;
                        break;
                    case -732043369:
                    case -713282361:
                        return z2;
                    case -716244138:
                    case -138631724:
                        if (C7105.f23796 >= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("֫ۡ") + i4) * 93;
                            i6 = ((iM11306 ^ i5) * 32609) ^ (-687732174);
                            i7 = 600528788;
                            break;
                        }
                        iM11306 = (C19806.m45029("ۘ۠") ^ i5) * 69;
                        i6 = ((iM11306 ^ i4) * 7753) ^ (-273731267);
                        i7 = 1654271890;
                        break;
                        break;
                    case -640273548:
                    case 1114061054:
                        if (!C1668.m5583()) {
                            iM11306 = (ThreadFactoryC3888.m11306("ᩴܽ") + i5) * 75;
                            i6 = ((iM11306 ^ i4) * (-21545)) ^ 1331275544;
                            i7 = 1733602219;
                            break;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("۬ۘ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-30627)) ^ (-1620193327);
                        i7 = 1591964011;
                        break;
                    case -614329606:
                    case 661326169:
                        if (!this.f22236.m49672(x, y)) {
                            iM11306 = ThreadFactoryC3888.m11306("ۚ᩷") ^ i4;
                            i6 = ((iM11306 ^ i5) * 29335) ^ (-430984004);
                            i7 = -276758685;
                            break;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۚ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-25711)) ^ 1536358478;
                        i7 = 1117835321;
                        break;
                    case -460239762:
                    case 1206359107:
                        if (C1419.f5860 < 0) {
                            iM11306 = C19806.m45029("ۢ᩵") ^ i5;
                            i6 = ((iM11306 ^ i4) * (-27161)) ^ 2031659008;
                            i7 = -1096695778;
                            break;
                        }
                        iM11306 = C19806.m45029("ۚ֫") ^ i4;
                        i6 = ((iM11306 ^ i5) * 9061) ^ 1222194696;
                        i7 = -1138689938;
                        break;
                        break;
                    case -443595221:
                    case 617064797:
                        x = motionEvent.getX();
                        y = motionEvent.getY();
                        if (C10634.f36300 < 0) {
                            iM11306 = (i4 - ThreadFactoryC3888.m11306("᩵ܰ")) * (-73);
                            i6 = ((iM11306 ^ i5) * 15353) ^ 286123256;
                            i7 = -373982523;
                            break;
                        }
                        iM11306 = C19806.m45029("֨ܰ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-4737)) ^ 2069927434;
                        i7 = 937378355;
                        break;
                        break;
                    case -34332711:
                    case 1790496265:
                        this.f22239 = z;
                        return zOnTouchEvent;
                    case -8306341:
                    case 1224001172:
                        if (actionMasked != i2) {
                            iM11306 = ThreadFactoryC3888.m11306("᩶ܿ") ^ i4;
                            i6 = ((iM11306 ^ i5) * 21191) ^ 898662751;
                            i7 = 1107688401;
                            break;
                            break;
                        }
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("᩺᩶")) * 11;
                        i6 = ((iM11306 ^ i4) * 16585) ^ (-42112127);
                        i7 = 712007790;
                        break;
                        break;
                    case 90090039:
                    case 2126675618:
                        if (!RunnableC1895.f7152) {
                            iM11306 = C19806.m45029("֨ܰ") ^ i5;
                            i6 = ((iM11306 ^ i4) * (-4737)) ^ 2069927434;
                            i7 = 937378355;
                            break;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("֨ܺ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-1597)) ^ 863172140;
                        i7 = -2113609981;
                        break;
                    case 348124842:
                    case 962564675:
                        if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            iM11306 = (ThreadFactoryC3888.m11306("᩻۠") + i4) * 51;
                            i6 = ((iM11306 ^ i5) * (-32101)) ^ (-41792499);
                            i7 = -2077887269;
                            break;
                        }
                        iM11306 = C19806.m45029("֨ܰ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-4737)) ^ 2069927434;
                        i7 = 937378355;
                        break;
                        break;
                    case 494142035:
                    case 1547326002:
                        if (!RunnableC1895.f7152) {
                            iM11306 = C19806.m45029("ۚ֫") ^ i4;
                            i6 = ((iM11306 ^ i5) * 9061) ^ 1222194696;
                            i7 = -1138689938;
                            break;
                            break;
                        }
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴܽ") + i5) * 75;
                        i6 = ((iM11306 ^ i4) * (-21545)) ^ 1331275544;
                        i7 = 1733602219;
                        break;
                        break;
                    case 598992520:
                    case 1668176026:
                        this.f22239 = z;
                        return z2;
                    case 606150101:
                    case 1816922505:
                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                            iM11306 = C19806.m45029("ۢۖ") ^ i4;
                            i6 = ((iM11306 ^ i5) * (-31217)) ^ (-1063287989);
                            i7 = 1364016087;
                            break;
                        }
                        iM11306 = (C19806.m45029("ۘ۠") ^ i5) * 69;
                        i6 = ((iM11306 ^ i4) * 7753) ^ (-273731267);
                        i7 = 1654271890;
                        break;
                        break;
                    case 742124473:
                    case 1966489925:
                        if (!m17926(motionEvent)) {
                            iM11306 = (i4 - C19806.m45029("ۧ֡")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i6 = ((iM11306 ^ i5) * (-24581)) ^ (-934697764);
                            i7 = -140564356;
                            break;
                        }
                        iM11306 = (i4 - C19806.m45029("ܰۤ")) * 27;
                        i6 = ((iM11306 ^ i5) * 1103) ^ (-659771014);
                        i7 = -1756535412;
                        break;
                    case 944721942:
                    case 2029714721:
                        return super.dispatchTouchEvent(motionEvent);
                    case 973549666:
                    case 1330175151:
                        if (C1398.m4895() > 0) {
                            iM11306 = (i5 - C19806.m45029("ܽۗ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i6 = ((iM11306 ^ i4) * 6873) ^ 324454222;
                            i7 = 1499216010;
                            break;
                        }
                        iM11306 = (C19806.m45029("ۘ۠") ^ i5) * 69;
                        i6 = ((iM11306 ^ i4) * 7753) ^ (-273731267);
                        i7 = 1654271890;
                        break;
                        break;
                    case 1018728256:
                    case 1850767455:
                        m17915(motionEvent);
                        return z2;
                    case 1130330677:
                    case 1783956622:
                        if (this.f22239) {
                            iM45029 = (i5 - C19806.m45029("ܳ᩷")) * 33;
                            i6 = ((iM45029 ^ i4) * (-9331)) ^ 1046860504;
                            i = -526992750;
                        } else {
                            iM45029 = C19806.m45029("ۘۤ") ^ i5;
                            i6 = ((iM45029 ^ i4) * 22235) ^ (-542920903);
                            i = -1448403433;
                        }
                        i8 = iM45029 ^ i;
                        i2 = 3;
                        break;
                    case 1376402728:
                    case 1982706304:
                        if (actionMasked != i2) {
                            iM11306 = ThreadFactoryC3888.m11306("᩶ܿ") ^ i4;
                            i6 = ((iM11306 ^ i5) * 21191) ^ 898662751;
                            i7 = 1107688401;
                            break;
                            break;
                        }
                        iM11306 = C19806.m45029("ܰۙ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-5467)) ^ (-1251740337);
                        i7 = -1261834306;
                        break;
                    case 1556845197:
                    case 1758064501:
                        if (!C0526.f2219) {
                            iM11306 = C19806.m45029("ۚ֫") ^ i4;
                            i6 = ((iM11306 ^ i5) * 9061) ^ 1222194696;
                            i7 = -1138689938;
                            break;
                            break;
                        }
                        iM11306 = (C19806.m45029("ۘ۠") ^ i5) * 69;
                        i6 = ((iM11306 ^ i4) * 7753) ^ (-273731267);
                        i7 = 1654271890;
                        break;
                        break;
                    case 1855184709:
                    case 2138390021:
                        if (actionMasked == z2) {
                            iM11306 = C19806.m45029("ܰۙ") ^ i4;
                            i6 = ((iM11306 ^ i5) * (-5467)) ^ (-1251740337);
                            i7 = -1261834306;
                            break;
                            break;
                        }
                        iM11306 = (ThreadFactoryC3888.m11306("᩹۬") + i5) * (-113);
                        i6 = ((iM11306 ^ i4) * 12701) ^ 625457589;
                        i7 = 1687580830;
                        break;
                    default:
                        if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                            iM11306 = ThreadFactoryC3888.m11306("֨۠") ^ i4;
                            i6 = ((iM11306 ^ i5) * 3871) ^ (-1596981995);
                            i7 = -794964252;
                            break;
                        }
                        iM11306 = (ThreadFactoryC3888.m11306("᩻۠") + i4) * 51;
                        i6 = ((iM11306 ^ i5) * (-32101)) ^ (-41792499);
                        i7 = -2077887269;
                        break;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:154:0x081e A[PHI: r3 r5 r9 r11 r12 r13 r14 r16 r23 r37 r39 r40
      0x081e: PHI (r3v45 int) = (r3v34 int), (r3v39 int), (r3v46 int) binds: [B:152:0x0807, B:144:0x07a4, B:121:0x0626] A[DONT_GENERATE, DONT_INLINE]
      0x081e: PHI (r5v4 float) = (r5v3 float), (r5v2 float), (r5v2 float) binds: [B:152:0x0807, B:144:0x07a4, B:121:0x0626] A[DONT_GENERATE, DONT_INLINE]
      0x081e: PHI (r9v73 int) = (r9v63 int), (r9v67 int), (r9v74 int) binds: [B:152:0x0807, B:144:0x07a4, B:121:0x0626] A[DONT_GENERATE, DONT_INLINE]
      0x081e: PHI (r11v88 int) = (r11v78 int), (r11v82 int), (r11v89 int) binds: [B:152:0x0807, B:144:0x07a4, B:121:0x0626] A[DONT_GENERATE, DONT_INLINE]
      0x081e: PHI (r12v81 int) = (r12v70 int), (r12v75 int), (r12v82 int) binds: [B:152:0x0807, B:144:0x07a4, B:121:0x0626] A[DONT_GENERATE, DONT_INLINE]
      0x081e: PHI (r13v82 boolean) = (r13v65 boolean), (r13v72 boolean), (r13v84 boolean) binds: [B:152:0x0807, B:144:0x07a4, B:121:0x0626] A[DONT_GENERATE, DONT_INLINE]
      0x081e: PHI (r14v52 float) = (r14v39 float), (r14v44 float), (r14v53 float) binds: [B:152:0x0807, B:144:0x07a4, B:121:0x0626] A[DONT_GENERATE, DONT_INLINE]
      0x081e: PHI (r16v46 int) = (r16v34 int), (r16v39 int), (r16v47 int) binds: [B:152:0x0807, B:144:0x07a4, B:121:0x0626] A[DONT_GENERATE, DONT_INLINE]
      0x081e: PHI (r23v4 float) = (r23v3 float), (r23v2 float), (r23v2 float) binds: [B:152:0x0807, B:144:0x07a4, B:121:0x0626] A[DONT_GENERATE, DONT_INLINE]
      0x081e: PHI (r37v50 int) = (r37v39 int), (r37v44 int), (r37v51 int) binds: [B:152:0x0807, B:144:0x07a4, B:121:0x0626] A[DONT_GENERATE, DONT_INLINE]
      0x081e: PHI (r39v37 float) = (r39v27 float), (r39v31 float), (r39v38 float) binds: [B:152:0x0807, B:144:0x07a4, B:121:0x0626] A[DONT_GENERATE, DONT_INLINE]
      0x081e: PHI (r40v38 l.᩹ܺ᩺) = (r40v30 l.᩹ܺ᩺), (r40v32 l.᩹ܺ᩺), (r40v39 l.᩹ܺ᩺) binds: [B:152:0x0807, B:144:0x07a4, B:121:0x0626] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x019a A[PHI: r37
      0x019a: PHI (r37v76 int) = (r37v19 int), (r37v73 int), (r37v75 int), (r37v77 int) binds: [B:196:0x019a, B:39:0x0195, B:36:0x017d, B:29:0x0155] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.AbsListView, android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        boolean z;
        int i3;
        float f;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int iM11306;
        int i10;
        int i11;
        int i12;
        Paint paint;
        int iM45029;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z2;
        int i18;
        int iM450210;
        int i19;
        int i20;
        int i21;
        int iM450211;
        int i22;
        int i23;
        int iM11307;
        int i24;
        int i25;
        C22398 c22398;
        int iM11308;
        int i26;
        int i27;
        int iM450212;
        int i28;
        int i29;
        C22398 c22399;
        int i30;
        boolean z3;
        int iM11309;
        int i31;
        int i32;
        int i33;
        int i34;
        int iM450213;
        int i35;
        int i36;
        int i37 = C3722.f13525;
        int i38 = C0278.f1572;
        int iM113010 = (ThreadFactoryC3888.m11306("֫ۤ") ^ i37) * 17;
        int i39 = ((iM113010 ^ i38) * 16813) ^ (-1847327032);
        C22398 c223910 = null;
        Paint paint2 = null;
        int i40 = iM113010 ^ 2146350097;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        int count = 0;
        int i41 = 0;
        float fM1785 = 0.0f;
        int firstVisiblePosition = 0;
        int i42 = 0;
        int iM8169 = 0;
        int iM3363 = 0;
        int i43 = 503188082;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        int i48 = 0;
        int i49 = 0;
        int i50 = 0;
        int i51 = 0;
        boolean z4 = false;
        float f12 = 0.0f;
        float f13 = 0.0f;
        int i52 = 0;
        int iM17931 = 0;
        int i53 = 0;
        while (true) {
            int i54 = i40 ^ (i39 & (((i43 ^ i38) * (-19823)) >> 31));
            switch (i54) {
                case -2137321760:
                case 1538248749:
                    i54 = i54;
                    if (C2788.f10625 >= 0) {
                        iM450213 = (i38 - C19806.m45029("ۧܽ")) * (-39);
                        i35 = ((iM450213 ^ i37) * (-22641)) ^ (-921749217);
                        i36 = 711542832;
                    } else {
                        iM450213 = C19806.m45029("ᩳ۟") ^ i37;
                        i35 = ((iM450213 ^ i38) * (-15165)) ^ 878259542;
                        i36 = -1534871862;
                    }
                    int i55 = iM450213 ^ i36;
                    i43 = i54;
                    i40 = i55;
                    i39 = i35;
                    break;
                case -2114012196:
                case -505343335:
                    i54 = i54;
                    C2124.m6673();
                    iM450213 = (i38 - C19806.m45029("ۧܽ")) * (-39);
                    i35 = ((iM450213 ^ i37) * (-22641)) ^ (-921749217);
                    i36 = 711542832;
                    int i56 = iM450213 ^ i36;
                    i43 = i54;
                    i40 = i56;
                    i39 = i35;
                    break;
                case -2062735018:
                case 360190333:
                    i34 = C20368.f65970;
                    i48 = i34;
                    iM450210 = C19806.m45029("۠ۡ") ^ i37;
                    i19 = ((iM450210 ^ i38) * (-19201)) ^ (-1150052032);
                    i20 = -1452586231;
                    i21 = iM450210 ^ i20;
                    iM3363 = iM3363;
                    i42 = i42;
                    i39 = i19;
                    i43 = i54;
                    c223910 = c223910;
                    iM8169 = iM8169;
                    i40 = i21;
                    fM1785 = fM1785;
                    break;
                case -2016853893:
                case 1204311983:
                    i54 = i54;
                    c223910 = c223910;
                    fM1785 = fM1785;
                    i42 = i42;
                    i = iM8169;
                    i2 = iM3363;
                    z2 = z4;
                    i18 = i52;
                    i3 = i53;
                    f = f3;
                    f9 = 0.0f;
                    f5 = 1.0f;
                    if (this.f22252) {
                        f6 = f5;
                        iM450212 = C19806.m45029("֨᩻") ^ i37;
                        i28 = ((iM450212 ^ i38) * 23385) ^ 1930145457;
                        i29 = -772728949;
                    } else {
                        iM450212 = C19806.m45029("ۢ᩶") ^ i38;
                        i28 = ((iM450212 ^ i37) * (-16129)) ^ (-1025741105);
                        i29 = 729278507;
                    }
                    i32 = iM450212 ^ i29;
                    i53 = i3;
                    i52 = i18;
                    z4 = z2;
                    i42 = i42;
                    iM8169 = i;
                    fM1785 = fM1785;
                    c223910 = c223910;
                    i33 = i54;
                    i40 = i32;
                    i39 = i28;
                    f3 = f;
                    iM3363 = i2;
                    i43 = i33;
                    break;
                case -1994723196:
                case 312034222:
                    i54 = i54;
                    c223910 = c223910;
                    fM1785 = fM1785;
                    i42 = i42;
                    int i57 = iM8169;
                    int i58 = iM3363;
                    int i59 = iM17931;
                    if (count / i59 <= 3.5f) {
                        i2 = i58;
                        iM17931 = i59;
                        z2 = z4;
                        i18 = i52;
                        i3 = i53;
                        i = i57;
                        f = f3;
                        iM450212 = ThreadFactoryC3888.m11306("ۤۢ") ^ i37;
                        i28 = ((iM450212 ^ i38) * 2735) ^ 523377859;
                        i29 = -2065681268;
                        i32 = iM450212 ^ i29;
                        i53 = i3;
                        i52 = i18;
                        z4 = z2;
                        i42 = i42;
                        iM8169 = i;
                        fM1785 = fM1785;
                        c223910 = c223910;
                        i33 = i54;
                        i40 = i32;
                        i39 = i28;
                        f3 = f;
                        iM3363 = i2;
                        i43 = i33;
                    } else {
                        iM17931 = i59;
                        i16 = i52;
                        i17 = i53;
                        iM8169 = i57;
                        iM3363 = i58;
                        iM11307 = (ThreadFactoryC3888.m11306("ۜۧ") + i37) * (-83);
                        i24 = ((iM11307 ^ i38) * 5083) ^ 1784878363;
                        i25 = 1878887826;
                        int i60 = iM11307 ^ i25;
                        i53 = i17;
                        i52 = i16;
                        i43 = i54;
                        i40 = i60;
                        i42 = i42;
                        i39 = i24;
                        fM1785 = fM1785;
                        c223910 = c223910;
                    }
                    break;
                case -1944739630:
                case -677299498:
                    i54 = i54;
                    c223910 = c223910;
                    fM1785 = fM1785;
                    i42 = i42;
                    iM8169 = iM8169;
                    iM3363 = iM3363;
                    i49 = i48 & i45;
                    i50 = i48 >>> 24;
                    i51 = 255;
                    if (C0629.f2722 > 0) {
                        iM450210 = (i37 - C19806.m45029("ܳ۬")) * (-29);
                        i19 = ((iM450210 ^ i38) * 8207) ^ (-2135226018);
                        i20 = -969598877;
                        i21 = iM450210 ^ i20;
                        iM3363 = iM3363;
                        i42 = i42;
                        i39 = i19;
                        i43 = i54;
                        c223910 = c223910;
                        iM8169 = iM8169;
                        i40 = i21;
                        fM1785 = fM1785;
                    } else {
                        i4 = i53;
                        i = iM8169;
                        iM450211 = (i38 - ThreadFactoryC3888.m11306("ۘۡ")) * (-69);
                        i22 = ((iM450211 ^ i37) * (-28149)) ^ (-1828912398);
                        i23 = -335400465;
                        i12 = iM450211 ^ i23;
                        iM3363 = iM3363;
                        i53 = i4;
                        i39 = i22;
                        i43 = i54;
                        iM8169 = i;
                        i40 = i12;
                        fM1785 = fM1785;
                        i42 = i42;
                        c223910 = c223910;
                    }
                    break;
                case -1911848202:
                case -1249474749:
                    i54 = i54;
                    c223910 = c223910;
                    fM1785 = fM1785;
                    i42 = i42;
                    i = iM8169;
                    i2 = iM3363;
                    z = z4;
                    i3 = i53;
                    f = f3;
                    int iM4972 = (int) (C1419.m4972() - this.f22235);
                    if (iM4972 < 0) {
                        i52 = iM4972;
                        i42 = i42;
                        int iM113011 = ThreadFactoryC3888.m11306("᩵ܿ") ^ i38;
                        i28 = ((iM113011 ^ i37) * (-9067)) ^ (-907484580);
                        i32 = iM113011 ^ (-1845329171);
                        i53 = i3;
                        z4 = z;
                        c223910 = c223910;
                        iM8169 = i;
                        fM1785 = fM1785;
                        i33 = i54;
                        i40 = i32;
                        i39 = i28;
                        f3 = f;
                        iM3363 = i2;
                        i43 = i33;
                    } else {
                        int iM113012 = ThreadFactoryC3888.m11306("ۛۖ") ^ i37;
                        i52 = iM4972;
                        i53 = i3;
                        z4 = z;
                        f3 = f;
                        iM3363 = i2;
                        i43 = i54;
                        i40 = iM113012 ^ (-1770793749);
                        iM8169 = i;
                        i39 = ((iM113012 ^ i38) * 24161) ^ 1023785074;
                        fM1785 = fM1785;
                        i42 = i42;
                        c223910 = c223910;
                    }
                    break;
                case -1895075315:
                case -191895166:
                    i54 = i54;
                    c223910 = c223910;
                    fM1785 = fM1785;
                    i42 = i42;
                    i = iM8169;
                    i2 = iM3363;
                    z2 = z4;
                    i18 = i52;
                    i3 = i53;
                    f = f3;
                    if (f6 > f9) {
                        iM450212 = (C19806.m45029("᩻۫") ^ i37) * (-51);
                        i28 = ((iM450212 ^ i38) * (-24755)) ^ (-462752795);
                        i29 = -1179902797;
                        i32 = iM450212 ^ i29;
                        i53 = i3;
                        i52 = i18;
                        z4 = z2;
                        i42 = i42;
                        iM8169 = i;
                        fM1785 = fM1785;
                        c223910 = c223910;
                        i33 = i54;
                        i40 = i32;
                        i39 = i28;
                        f3 = f;
                        iM3363 = i2;
                        i43 = i33;
                    } else {
                        z4 = z2;
                        c22398 = c223910;
                        iM11308 = C19806.m45029("۫᩸") ^ i37;
                        i26 = ((iM11308 ^ i38) * 22729) ^ (-818206200);
                        i27 = -523342194;
                        int i61 = iM11308 ^ i27;
                        i53 = i3;
                        i52 = i18;
                        i42 = i42;
                        c223910 = c22398;
                        f3 = f;
                        iM3363 = i2;
                        i43 = i54;
                        i40 = i61;
                        i39 = i26;
                        iM8169 = i;
                        fM1785 = fM1785;
                    }
                    break;
                case -1890064566:
                case -1204732973:
                    i54 = i54;
                    c223910 = c223910;
                    fM1785 = fM1785;
                    i42 = i42;
                    i = iM8169;
                    iM3363 = iM3363;
                    i4 = i53;
                    this.f22245 = true;
                    int i62 = this.f22232;
                    i45 = 16777215;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        int iM450214 = C19806.m45029("ۡ᩸") ^ i37;
                        i5 = ((iM450214 ^ i38) * 1819) ^ 774809292;
                        i6 = iM450214 ^ 1202209420;
                        i53 = i4;
                        i44 = i62;
                        i43 = i54;
                        i42 = i42;
                        i40 = i6;
                        c223910 = c223910;
                        iM8169 = i;
                        fM1785 = fM1785;
                        int i63 = i5;
                        iM3363 = iM3363;
                        i39 = i63;
                    } else {
                        i44 = i62;
                        iM450211 = C19806.m45029("ܺۖ") ^ i38;
                        i22 = ((iM450211 ^ i37) * 22171) ^ (-508942218);
                        i23 = -1645417637;
                        i12 = iM450211 ^ i23;
                        iM3363 = iM3363;
                        i53 = i4;
                        i39 = i22;
                        i43 = i54;
                        iM8169 = i;
                        i40 = i12;
                        fM1785 = fM1785;
                        i42 = i42;
                        c223910 = c223910;
                    }
                    break;
                case -1888044320:
                case 1967039647:
                    i54 = i54;
                    c223910 = c223910;
                    fM1785 = fM1785;
                    i42 = i42;
                    i = iM8169;
                    i18 = i52;
                    i3 = i53;
                    f6 = 0.0f;
                    i2 = iM3363;
                    f = f3;
                    z2 = z4;
                    iM450212 = C19806.m45029("֨᩻") ^ i37;
                    i28 = ((iM450212 ^ i38) * 23385) ^ 1930145457;
                    i29 = -772728949;
                    i32 = iM450212 ^ i29;
                    i53 = i3;
                    i52 = i18;
                    z4 = z2;
                    i42 = i42;
                    iM8169 = i;
                    fM1785 = fM1785;
                    c223910 = c223910;
                    i33 = i54;
                    i40 = i32;
                    i39 = i28;
                    f3 = f;
                    iM3363 = i2;
                    i43 = i33;
                    break;
                case -1696170274:
                case 1070551864:
                    C2704.m8255();
                    if (C2332.f8260) {
                        int iM113013 = ThreadFactoryC3888.m11306("֫۬") ^ i38;
                        i39 = ((iM113013 ^ i37) * (-6051)) ^ 1890329545;
                        i43 = i54;
                        i40 = iM113013 ^ 1385830701;
                    } else {
                        i54 = i54;
                        c223910 = c223910;
                        fM1785 = fM1785;
                        i42 = i42;
                        i = iM8169;
                        iM3363 = iM3363;
                        i4 = i53;
                        iM450211 = (i38 - ThreadFactoryC3888.m11306("ۘۡ")) * (-69);
                        i22 = ((iM450211 ^ i37) * (-28149)) ^ (-1828912398);
                        i23 = -335400465;
                        i12 = iM450211 ^ i23;
                        iM3363 = iM3363;
                        i53 = i4;
                        i39 = i22;
                        i43 = i54;
                        iM8169 = i;
                        i40 = i12;
                        fM1785 = fM1785;
                        i42 = i42;
                        c223910 = c223910;
                    }
                    break;
                case -1691810498:
                case -663595481:
                    i54 = i54;
                    c223910 = c223910;
                    fM1785 = fM1785;
                    i42 = i42;
                    i = iM8169;
                    iM3363 = iM3363;
                    i4 = i53;
                    int i64 = (int) ((i4 & 255) * f6);
                    if (C3722.m10894() > 0) {
                        int iM450215 = (C19806.m45029("֨ܳ") ^ i38) * 47;
                        i5 = ((iM450215 ^ i37) * (-16833)) ^ (-102411253);
                        i6 = iM450215 ^ 941925758;
                        i53 = i4;
                        i47 = i64;
                        i43 = i54;
                        i42 = i42;
                        i40 = i6;
                        c223910 = c223910;
                        iM8169 = i;
                        fM1785 = fM1785;
                        int i65 = i5;
                        iM3363 = iM3363;
                        i39 = i65;
                    } else {
                        i47 = i64;
                        iM450211 = (i38 - ThreadFactoryC3888.m11306("ۘۡ")) * (-69);
                        i22 = ((iM450211 ^ i37) * (-28149)) ^ (-1828912398);
                        i23 = -335400465;
                        i12 = iM450211 ^ i23;
                        iM3363 = iM3363;
                        i53 = i4;
                        i39 = i22;
                        i43 = i54;
                        iM8169 = i;
                        i40 = i12;
                        fM1785 = fM1785;
                        i42 = i42;
                        c223910 = c223910;
                    }
                    break;
                case -1583423704:
                case 259094694:
                    c22399 = c223910;
                    i30 = iM8169;
                    z3 = z4;
                    this.f22245 = z3;
                    c22399.m49668();
                    int iM450216 = C19806.m45029("ܺ۟") ^ i37;
                    i2 = iM3363;
                    i39 = ((iM450216 ^ i38) * 30165) ^ (-549646508);
                    i53 = i53;
                    i52 = i52;
                    z4 = z3;
                    i42 = i42;
                    iM8169 = i30;
                    fM1785 = fM1785;
                    c223910 = c22399;
                    i33 = i54;
                    i40 = iM450216 ^ 323552179;
                    iM3363 = i2;
                    i43 = i33;
                    break;
                case -1507844993:
                case -1122379462:
                    i54 = i54;
                    c223910 = c223910;
                    fM1785 = fM1785;
                    i42 = i42;
                    i = iM8169;
                    iM3363 = iM3363;
                    i18 = i52;
                    i3 = i53;
                    if (i41 <= 0) {
                        i2 = iM3363;
                        f = f3;
                        z2 = z4;
                        iM450212 = ThreadFactoryC3888.m11306("ۤۢ") ^ i37;
                        i28 = ((iM450212 ^ i38) * 2735) ^ 523377859;
                        i29 = -2065681268;
                        i32 = iM450212 ^ i29;
                        i53 = i3;
                        i52 = i18;
                        z4 = z2;
                        i42 = i42;
                        iM8169 = i;
                        fM1785 = fM1785;
                        c223910 = c223910;
                        i33 = i54;
                        i40 = i32;
                        i39 = i28;
                        f3 = f;
                        iM3363 = i2;
                        i43 = i33;
                    } else {
                        iM11309 = (i38 - ThreadFactoryC3888.m11306("ۘܽ")) * (-49);
                        i5 = ((iM11309 ^ i37) * (-31577)) ^ (-1879847997);
                        i31 = -372532316;
                        i6 = iM11309 ^ i31;
                        i53 = i3;
                        i52 = i18;
                        i43 = i54;
                        i42 = i42;
                        i40 = i6;
                        c223910 = c223910;
                        iM8169 = i;
                        fM1785 = fM1785;
                        int i66 = i5;
                        iM3363 = iM3363;
                        i39 = i66;
                    }
                    break;
                case -1452710215:
                case 1237587451:
                    C0216.m1591();
                    C0278.m1789();
                    break;
                case -1372903488:
                case 905970840:
                    i54 = i54;
                    c223910 = c223910;
                    fM1785 = fM1785;
                    i42 = i42;
                    i = iM8169;
                    i2 = iM3363;
                    z2 = z4;
                    i18 = i52;
                    i3 = i53;
                    f = f3;
                    if (m17929()) {
                        f6 = f5;
                        iM450212 = C19806.m45029("֨᩻") ^ i37;
                        i28 = ((iM450212 ^ i38) * 23385) ^ 1930145457;
                        i29 = -772728949;
                    } else {
                        iM450212 = ThreadFactoryC3888.m11306("ۗܶ") ^ i38;
                        i28 = ((iM450212 ^ i37) * (-15049)) ^ (-2073920677);
                        i29 = -1460576485;
                    }
                    i32 = iM450212 ^ i29;
                    i53 = i3;
                    i52 = i18;
                    z4 = z2;
                    i42 = i42;
                    iM8169 = i;
                    fM1785 = fM1785;
                    c223910 = c223910;
                    i33 = i54;
                    i40 = i32;
                    i39 = i28;
                    f3 = f;
                    iM3363 = i2;
                    i43 = i33;
                    break;
                case -1329666707:
                case -325092180:
                    i54 = i54;
                    c223910 = c223910;
                    f2 = fM1785;
                    i7 = i42;
                    int i67 = iM8169;
                    i9 = iM3363;
                    paint2.setColor(i49 | (((int) f3) << 24));
                    float f14 = this.f22257;
                    if (C1148.f5161 <= 0) {
                        f12 = f14;
                        i8 = i67;
                        iM11306 = C19806.m45029("֡۟") ^ i37;
                        i10 = ((iM11306 ^ i38) * (-15801)) ^ (-1744361965);
                        i11 = 447861180;
                        i15 = iM11306 ^ i11;
                        iM3363 = i9;
                        iM8169 = i8;
                        i39 = i10;
                        i43 = i54;
                        fM1785 = f2;
                    } else {
                        int iM450217 = C19806.m45029("ܺᩳ") ^ i37;
                        int i68 = ((iM450217 ^ i38) * (-5007)) ^ (-1928048558);
                        i15 = iM450217 ^ 1672979133;
                        iM3363 = i9;
                        f12 = f14;
                        i39 = i68;
                        i43 = i54;
                        fM1785 = f2;
                        iM8169 = i67;
                    }
                    i42 = i7;
                    i40 = i15;
                    c223910 = c223910;
                    break;
                case -1290979222:
                case 1876089406:
                    i54 = i54;
                    c223910 = c223910;
                    fM1785 = fM1785;
                    i42 = i42;
                    i = iM8169;
                    iM3363 = iM3363;
                    i18 = i52;
                    i3 = i53;
                    if (i18 > 1500) {
                        iM11309 = C19806.m45029("֡֨") ^ i37;
                        i5 = ((iM11309 ^ i38) * 5265) ^ 2002757724;
                        i31 = 4789944;
                        i6 = iM11309 ^ i31;
                        i53 = i3;
                        i52 = i18;
                        i43 = i54;
                        i42 = i42;
                        i40 = i6;
                        c223910 = c223910;
                        iM8169 = i;
                        fM1785 = fM1785;
                        int i69 = i5;
                        iM3363 = iM3363;
                        i39 = i69;
                    } else {
                        i2 = iM3363;
                        f = f3;
                        z2 = z4;
                        f6 = f5;
                        iM450212 = C19806.m45029("֨᩻") ^ i37;
                        i28 = ((iM450212 ^ i38) * 23385) ^ 1930145457;
                        i29 = -772728949;
                        i32 = iM450212 ^ i29;
                        i53 = i3;
                        i52 = i18;
                        z4 = z2;
                        i42 = i42;
                        iM8169 = i;
                        fM1785 = fM1785;
                        c223910 = c223910;
                        i33 = i54;
                        i40 = i32;
                        i39 = i28;
                        f3 = f;
                        iM3363 = i2;
                        i43 = i33;
                    }
                    break;
                case -1189695732:
                case -210822448:
                    i54 = i54;
                    c223910 = c223910;
                    fM1785 = fM1785;
                    i42 = i42;
                    i = iM8169;
                    iM3363 = iM3363;
                    i3 = i53;
                    postInvalidateOnAnimation();
                    i18 = i52;
                    iM11309 = (C19806.m45029("۠᩷") ^ i38) * 53;
                    i5 = ((iM11309 ^ i37) * 32527) ^ 2025722543;
                    i31 = 735691903;
                    i6 = iM11309 ^ i31;
                    i53 = i3;
                    i52 = i18;
                    i43 = i54;
                    i42 = i42;
                    i40 = i6;
                    c223910 = c223910;
                    iM8169 = i;
                    fM1785 = fM1785;
                    int i610 = i5;
                    iM3363 = iM3363;
                    i39 = i610;
                    break;
                case -1142651165:
                case 1690292069:
                    i54 = i54;
                    c223910 = c223910;
                    fM1785 = fM1785;
                    i42 = i42;
                    int i70 = iM8169;
                    f6 = f5 - (i42 / 300.0f);
                    i2 = iM3363;
                    f = f3;
                    z2 = z4;
                    i18 = i52;
                    i3 = i53;
                    i = i70;
                    iM450212 = C19806.m45029("֨᩻") ^ i37;
                    i28 = ((iM450212 ^ i38) * 23385) ^ 1930145457;
                    i29 = -772728949;
                    i32 = iM450212 ^ i29;
                    i53 = i3;
                    i52 = i18;
                    z4 = z2;
                    i42 = i42;
                    iM8169 = i;
                    fM1785 = fM1785;
                    c223910 = c223910;
                    i33 = i54;
                    i40 = i32;
                    i39 = i28;
                    f3 = f;
                    iM3363 = i2;
                    i43 = i33;
                    break;
                case -1058522910:
                case 1004661779:
                    i54 = i54;
                    c223910 = c223910;
                    fM1785 = fM1785;
                    i42 = i42;
                    i = iM8169;
                    iM3363 = iM3363;
                    Paint paint3 = paint2;
                    float f15 = this.f22246;
                    f8 = f15 * f6;
                    if (C1668.f6641 >= 0) {
                        f7 = f15;
                        i4 = i53;
                        paint2 = paint3;
                        iM450211 = C19806.m45029("ܺۖ") ^ i38;
                        i22 = ((iM450211 ^ i37) * 22171) ^ (-508942218);
                        i23 = -1645417637;
                        i12 = iM450211 ^ i23;
                        iM3363 = iM3363;
                        i53 = i4;
                        i39 = i22;
                        i43 = i54;
                    } else {
                        int iM113014 = (ThreadFactoryC3888.m11306("ۖ᩵") ^ i37) * 9;
                        int i71 = ((iM113014 ^ i38) * (-10867)) ^ 187218122;
                        i12 = iM113014 ^ 1801796335;
                        iM3363 = iM3363;
                        f7 = f15;
                        i39 = i71;
                        i43 = i54;
                        paint2 = paint3;
                    }
                    iM8169 = i;
                    i40 = i12;
                    fM1785 = fM1785;
                    i42 = i42;
                    c223910 = c223910;
                    break;
                case -978277959:
                case 1370300769:
                    this.f22245 = z4;
                    c223910.m49668();
                    break;
                case -865445091:
                case 566445253:
                    i54 = i54;
                    if (!C0817.f3443) {
                        c223910 = c223910;
                        fM1785 = fM1785;
                        i42 = i42;
                        i = iM8169;
                        iM3363 = iM3363;
                        i4 = i53;
                        iM450211 = C19806.m45029("ܺۖ") ^ i38;
                        i22 = ((iM450211 ^ i37) * 22171) ^ (-508942218);
                        i23 = -1645417637;
                        i12 = iM450211 ^ i23;
                        iM3363 = iM3363;
                        i53 = i4;
                        i39 = i22;
                        i43 = i54;
                        iM8169 = i;
                        i40 = i12;
                        fM1785 = fM1785;
                        i42 = i42;
                        c223910 = c223910;
                    } else {
                        iM450213 = ThreadFactoryC3888.m11306("ܳ۟") ^ i37;
                        i35 = ((iM450213 ^ i38) * (-11437)) ^ 1751853130;
                        i36 = -891897891;
                        int i510 = iM450213 ^ i36;
                        i43 = i54;
                        i40 = i510;
                        i39 = i35;
                    }
                    break;
                case -738588190:
                case 116958528:
                    i54 = i54;
                    c223910 = c223910;
                    fM1785 = fM1785;
                    i42 = i42;
                    iM8169 = iM8169;
                    iM3363 = iM3363;
                    f3 = (i50 & i51) * f6;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM450210 = (C19806.m45029("ܰᩴ") + i37) * 73;
                        i19 = ((iM450210 ^ i38) * 11923) ^ (-1854913080);
                        i20 = -645825078;
                    } else {
                        iM450210 = (i38 - ThreadFactoryC3888.m11306("۫ۜ")) * (-71);
                        i19 = ((iM450210 ^ i37) * (-7695)) ^ (-524724803);
                        i20 = 1686473355;
                    }
                    i21 = iM450210 ^ i20;
                    iM3363 = iM3363;
                    i42 = i42;
                    i39 = i19;
                    i43 = i54;
                    c223910 = c223910;
                    iM8169 = iM8169;
                    i40 = i21;
                    fM1785 = fM1785;
                    break;
                case -484102331:
                case -203519385:
                    i54 = i54;
                    C0962.m3746();
                    if (C1977.f7413 <= 0) {
                        c223910 = c223910;
                        f2 = fM1785;
                        i7 = i42;
                        i8 = iM8169;
                        i9 = iM3363;
                        iM11306 = (ThreadFactoryC3888.m11306("ܺᩴ") + i37) * (-33);
                        i10 = ((iM11306 ^ i38) * (-28449)) ^ 577302157;
                        i11 = 190433257;
                        i15 = iM11306 ^ i11;
                        iM3363 = i9;
                        iM8169 = i8;
                        i39 = i10;
                        i43 = i54;
                        fM1785 = f2;
                        i42 = i7;
                        i40 = i15;
                        c223910 = c223910;
                    } else {
                        iM450213 = C19806.m45029("ᩳ۟") ^ i37;
                        i35 = ((iM450213 ^ i38) * (-15165)) ^ 878259542;
                        i36 = -1534871862;
                        int i511 = iM450213 ^ i36;
                        i43 = i54;
                        i40 = i511;
                        i39 = i35;
                    }
                    break;
                case -274176501:
                case -152732638:
                    i54 = i54;
                    C1875.m6086();
                    if (C2124.f7782 > 0) {
                        iM450213 = (i38 - C19806.m45029("ۧܽ")) * (-39);
                        i35 = ((iM450213 ^ i37) * (-22641)) ^ (-921749217);
                        i36 = 711542832;
                    } else {
                        iM450213 = (ThreadFactoryC3888.m11306("֫ۨ") + i38) * (-37);
                        i35 = ((iM450213 ^ i37) * 30035) ^ (-875449647);
                        i36 = -1395686876;
                    }
                    int i512 = iM450213 ^ i36;
                    i43 = i54;
                    i40 = i512;
                    i39 = i35;
                    break;
                case -262530964:
                case 1387303560:
                    i54 = i54;
                    c223910 = c223910;
                    i7 = i42;
                    int i72 = iM8169;
                    i9 = iM3363;
                    paint = paint2;
                    fM1785 = C0278.m1785(i41, firstVisiblePosition) * f13;
                    if (C0278.f1572 > 0) {
                        int iM450218 = C19806.m45029("ܽ᩵") ^ i37;
                        int i73 = ((iM450218 ^ i38) * (-27563)) ^ (-212646213);
                        i15 = iM450218 ^ (-738407641);
                        iM3363 = i9;
                        i39 = i73;
                        i43 = i54;
                        iM8169 = i72;
                        paint2 = paint;
                        i42 = i7;
                        i40 = i15;
                        c223910 = c223910;
                    } else {
                        f2 = fM1785;
                        i8 = i72;
                        paint2 = paint;
                        iM11306 = (ThreadFactoryC3888.m11306("ܺᩴ") + i37) * (-33);
                        i10 = ((iM11306 ^ i38) * (-28449)) ^ 577302157;
                        i11 = 190433257;
                        i15 = iM11306 ^ i11;
                        iM3363 = i9;
                        iM8169 = i8;
                        i39 = i10;
                        i43 = i54;
                        fM1785 = f2;
                        i42 = i7;
                        i40 = i15;
                        c223910 = c223910;
                    }
                    break;
                case -242132946:
                case 42475874:
                    i54 = i54;
                    fM1785 = fM1785;
                    i42 = i42;
                    i = iM8169;
                    i2 = iM3363;
                    i18 = i52;
                    i3 = i53;
                    f = f3;
                    super.draw(canvas);
                    boolean z5 = this.f22233;
                    z4 = false;
                    c22398 = this.f22236;
                    if (z5) {
                        iM11308 = ThreadFactoryC3888.m11306("۠ۢ") ^ i38;
                        i26 = ((iM11308 ^ i37) * 28481) ^ 1181744811;
                        i27 = -1698783458;
                    } else {
                        iM11308 = C19806.m45029("۫᩸") ^ i37;
                        i26 = ((iM11308 ^ i38) * 22729) ^ (-818206200);
                        i27 = -523342194;
                    }
                    int i611 = iM11308 ^ i27;
                    i53 = i3;
                    i52 = i18;
                    i42 = i42;
                    c223910 = c22398;
                    f3 = f;
                    iM3363 = i2;
                    i43 = i54;
                    i40 = i611;
                    i39 = i26;
                    iM8169 = i;
                    fM1785 = fM1785;
                    break;
                case -196811040:
                case 909628044:
                    i54 = i54;
                    c223910 = c223910;
                    fM1785 = fM1785;
                    i42 = i42;
                    i = iM8169;
                    iM3363 = iM3363;
                    i18 = i52;
                    i3 = i53;
                    if (this.f22245) {
                        iM11309 = ThreadFactoryC3888.m11306("ᩴ᩸") ^ i38;
                        i5 = ((iM11309 ^ i37) * 23129) ^ 1625633293;
                        i31 = -1537023249;
                    } else {
                        iM11309 = (C19806.m45029("۠᩷") ^ i38) * 53;
                        i5 = ((iM11309 ^ i37) * 32527) ^ 2025722543;
                        i31 = 735691903;
                    }
                    i6 = iM11309 ^ i31;
                    i53 = i3;
                    i52 = i18;
                    i43 = i54;
                    i42 = i42;
                    i40 = i6;
                    c223910 = c223910;
                    iM8169 = i;
                    fM1785 = fM1785;
                    int i612 = i5;
                    iM3363 = iM3363;
                    i39 = i612;
                    break;
                case -159250907:
                case 2113907479:
                    float f16 = (int) fM1785;
                    float f17 = f16 + f12;
                    c223910.m49669(f4 - f7, f16, f4, f17);
                    c22399 = c223910;
                    int i74 = iM8169;
                    Paint paint4 = paint2;
                    canvas.drawRect(f10, f16, f4, f17, paint4);
                    z3 = z4;
                    i30 = i74;
                    paint2 = paint4;
                    int iM450219 = C19806.m45029("ܺ۟") ^ i37;
                    i2 = iM3363;
                    i39 = ((iM450219 ^ i38) * 30165) ^ (-549646508);
                    i53 = i53;
                    i52 = i52;
                    z4 = z3;
                    i42 = i42;
                    iM8169 = i30;
                    fM1785 = fM1785;
                    c223910 = c22399;
                    i33 = i54;
                    i40 = iM450219 ^ 323552179;
                    iM3363 = i2;
                    i43 = i33;
                    break;
                case 52112027:
                case 293445448:
                    i54 = i54;
                    C2704.m8255();
                    if (C3722.f13525 > 0) {
                        c223910 = c223910;
                        fM1785 = fM1785;
                        i42 = i42;
                        i = iM8169;
                        iM3363 = iM3363;
                        i4 = i53;
                        iM450211 = C19806.m45029("ܺۖ") ^ i38;
                        i22 = ((iM450211 ^ i37) * 22171) ^ (-508942218);
                        i23 = -1645417637;
                        i12 = iM450211 ^ i23;
                        iM3363 = iM3363;
                        i53 = i4;
                        i39 = i22;
                        i43 = i54;
                        iM8169 = i;
                        i40 = i12;
                        fM1785 = fM1785;
                        i42 = i42;
                        c223910 = c223910;
                    } else {
                        iM450213 = (i38 - C19806.m45029("ۧܽ")) * (-39);
                        i35 = ((iM450213 ^ i37) * (-22641)) ^ (-921749217);
                        i36 = 711542832;
                        int i513 = iM450213 ^ i36;
                        i43 = i54;
                        i40 = i513;
                        i39 = i35;
                    }
                    break;
                case 129613565:
                case 544367952:
                    i34 = this.f22241;
                    i48 = i34;
                    iM450210 = C19806.m45029("۠ۡ") ^ i37;
                    i19 = ((iM450210 ^ i38) * (-19201)) ^ (-1150052032);
                    i20 = -1452586231;
                    i21 = iM450210 ^ i20;
                    iM3363 = iM3363;
                    i42 = i42;
                    i39 = i19;
                    i43 = i54;
                    c223910 = c223910;
                    iM8169 = iM8169;
                    i40 = i21;
                    fM1785 = fM1785;
                    break;
                case 613003335:
                case 1757707332:
                    i54 = i54;
                    if (C1977.f7413 > 0) {
                        c223910 = c223910;
                        fM1785 = fM1785;
                        i42 = i42;
                        i = iM8169;
                        iM3363 = iM3363;
                        i4 = i53;
                        iM450211 = (i38 - ThreadFactoryC3888.m11306("ۘۡ")) * (-69);
                        i22 = ((iM450211 ^ i37) * (-28149)) ^ (-1828912398);
                        i23 = -335400465;
                        i12 = iM450211 ^ i23;
                        iM3363 = iM3363;
                        i53 = i4;
                        i39 = i22;
                        i43 = i54;
                        iM8169 = i;
                        i40 = i12;
                        fM1785 = fM1785;
                        i42 = i42;
                        c223910 = c223910;
                    } else {
                        iM450213 = ThreadFactoryC3888.m11306("ܳ۟") ^ i37;
                        i35 = ((iM450213 ^ i38) * (-11437)) ^ 1751853130;
                        i36 = -891897891;
                        int i514 = iM450213 ^ i36;
                        i43 = i54;
                        i40 = i514;
                        i39 = i35;
                    }
                    break;
                case 624399685:
                case 688251427:
                    i54 = i54;
                    c223910 = c223910;
                    fM1785 = fM1785;
                    i = iM8169;
                    iM3363 = iM3363;
                    i3 = i53;
                    i18 = i52;
                    i42 = i18 - 1500;
                    if (i42 >= 300) {
                        i2 = iM3363;
                        f = f3;
                        i52 = i18;
                        z = z4;
                        i42 = i42;
                        int iM113015 = ThreadFactoryC3888.m11306("᩵ܿ") ^ i38;
                        i28 = ((iM113015 ^ i37) * (-9067)) ^ (-907484580);
                        i32 = iM113015 ^ (-1845329171);
                        i53 = i3;
                        z4 = z;
                        c223910 = c223910;
                        iM8169 = i;
                        fM1785 = fM1785;
                        i33 = i54;
                        i40 = i32;
                        i39 = i28;
                        f3 = f;
                        iM3363 = i2;
                        i43 = i33;
                    } else {
                        iM11309 = ThreadFactoryC3888.m11306("᩹ᩳ") ^ i38;
                        i5 = ((iM11309 ^ i37) * (-21165)) ^ 437631907;
                        i31 = 2043380504;
                        i6 = iM11309 ^ i31;
                        i53 = i3;
                        i52 = i18;
                        i43 = i54;
                        i42 = i42;
                        i40 = i6;
                        c223910 = c223910;
                        iM8169 = i;
                        fM1785 = fM1785;
                        int i613 = i5;
                        iM3363 = iM3363;
                        i39 = i613;
                    }
                    break;
                case 652978997:
                case 834307761:
                    i54 = i54;
                    c223910 = c223910;
                    fM1785 = fM1785;
                    i42 = i42;
                    i = iM8169;
                    i2 = iM3363;
                    z2 = z4;
                    i18 = i52;
                    i3 = i53;
                    f = f3;
                    count = getCount();
                    int iM10898 = C3722.m10898(this);
                    i41 = count - iM10898;
                    iM17931 = m17931();
                    if (iM10898 > 0) {
                        iM450212 = (C19806.m45029("ܿۛ") ^ i38) * 7;
                        i28 = ((iM450212 ^ i37) * (-30785)) ^ (-1844308068);
                        i29 = 1751589058;
                    } else {
                        iM450212 = ThreadFactoryC3888.m11306("ۤۢ") ^ i37;
                        i28 = ((iM450212 ^ i38) * 2735) ^ 523377859;
                        i29 = -2065681268;
                    }
                    i32 = iM450212 ^ i29;
                    i53 = i3;
                    i52 = i18;
                    z4 = z2;
                    i42 = i42;
                    iM8169 = i;
                    fM1785 = fM1785;
                    c223910 = c223910;
                    i33 = i54;
                    i40 = i32;
                    i39 = i28;
                    f3 = f;
                    iM3363 = i2;
                    i43 = i33;
                    break;
                case 839764431:
                case 1246222678:
                    break;
                case 871484360:
                case 1187606302:
                    i54 = i54;
                    c223910 = c223910;
                    fM1785 = fM1785;
                    i42 = i42;
                    int i75 = iM8169;
                    iM3363 = iM3363;
                    Paint paint5 = paint2;
                    f13 = (f11 - f12) / i41;
                    firstVisiblePosition = getFirstVisiblePosition();
                    if (!RunnableC1895.f7152) {
                        i4 = i53;
                        i = i75;
                        paint2 = paint5;
                        iM450211 = (i38 - ThreadFactoryC3888.m11306("ۘۡ")) * (-69);
                        i22 = ((iM450211 ^ i37) * (-28149)) ^ (-1828912398);
                        i23 = -335400465;
                        i12 = iM450211 ^ i23;
                        iM3363 = iM3363;
                        i53 = i4;
                        i39 = i22;
                        i43 = i54;
                        iM8169 = i;
                        i40 = i12;
                        fM1785 = fM1785;
                        i42 = i42;
                        c223910 = c223910;
                    } else {
                        int iM450220 = (i38 - C19806.m45029("ۘᩴ")) * 71;
                        int i76 = ((iM450220 ^ i37) * (-7887)) ^ (-196420605);
                        i21 = iM450220 ^ (-605692895);
                        iM3363 = iM3363;
                        i42 = i42;
                        i39 = i76;
                        i43 = i54;
                        c223910 = c223910;
                        iM8169 = i75;
                        paint2 = paint5;
                        i40 = i21;
                        fM1785 = fM1785;
                    }
                    break;
                case 974167874:
                case 1514784970:
                    c223910 = c223910;
                    float f18 = fM1785;
                    i7 = i42;
                    int i77 = iM8169;
                    int i78 = iM3363;
                    f4 = i78;
                    f10 = f4 - f8;
                    f11 = i77;
                    paint = paint2;
                    canvas.drawRect(f10, 0.0f, f4, f11, paint);
                    if (this.f22252) {
                        iM45029 = C19806.m45029("۫ۧ") ^ i38;
                        i13 = ((iM45029 ^ i37) * (-30451)) ^ (-1396936378);
                        i14 = -1736771731;
                    } else {
                        iM45029 = (C19806.m45029("ۛۡ") + i37) * (-65);
                        i13 = ((iM45029 ^ i38) * 4573) ^ 817869190;
                        i14 = 2097521213;
                    }
                    i15 = iM45029 ^ i14;
                    iM3363 = i78;
                    iM8169 = i77;
                    i39 = i13;
                    i43 = i54;
                    fM1785 = f18;
                    paint2 = paint;
                    i42 = i7;
                    i40 = i15;
                    c223910 = c223910;
                    break;
                case 1207970574:
                case 1340976363:
                    i54 = i54;
                    if (C2704.m8255() > 0) {
                        c223910 = c223910;
                        fM1785 = fM1785;
                        i42 = i42;
                        iM8169 = iM8169;
                        iM3363 = iM3363;
                        iM450210 = (C19806.m45029("ܰᩴ") + i37) * 73;
                        i19 = ((iM450210 ^ i38) * 11923) ^ (-1854913080);
                        i20 = -645825078;
                        i21 = iM450210 ^ i20;
                        iM3363 = iM3363;
                        i42 = i42;
                        i39 = i19;
                        i43 = i54;
                        c223910 = c223910;
                        iM8169 = iM8169;
                        i40 = i21;
                        fM1785 = fM1785;
                    } else {
                        iM450213 = ThreadFactoryC3888.m11306("ܳ۟") ^ i37;
                        i35 = ((iM450213 ^ i38) * (-11437)) ^ 1751853130;
                        i36 = -891897891;
                        int i515 = iM450213 ^ i36;
                        i43 = i54;
                        i40 = i515;
                        i39 = i35;
                    }
                    break;
                case 1356776234:
                case 1605558995:
                    i54 = i54;
                    c223910 = c223910;
                    f2 = fM1785;
                    i7 = i42;
                    i8 = iM8169;
                    i9 = iM3363;
                    paint2.setColor((i47 << 24) | i46);
                    if (C2477.f9839 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺᩴ") + i37) * (-33);
                        i10 = ((iM11306 ^ i38) * (-28449)) ^ 577302157;
                        i11 = 190433257;
                    } else {
                        iM11306 = (C19806.m45029("᩹᩻") ^ i37) * (-57);
                        i10 = ((iM11306 ^ i38) * 14335) ^ 720298144;
                        i11 = -1661862693;
                    }
                    i15 = iM11306 ^ i11;
                    iM3363 = i9;
                    iM8169 = i8;
                    i39 = i10;
                    i43 = i54;
                    fM1785 = f2;
                    i42 = i7;
                    i40 = i15;
                    c223910 = c223910;
                    break;
                case 1658231521:
                case 1660902435:
                    i54 = i54;
                    c223910 = c223910;
                    f2 = fM1785;
                    i7 = i42;
                    i8 = iM8169;
                    i9 = iM3363;
                    i46 = i44 & i45;
                    i53 = i44 >>> 24;
                    if (C0671.m3008() >= 0) {
                        iM11306 = C19806.m45029("֡۟") ^ i37;
                        i10 = ((iM11306 ^ i38) * (-15801)) ^ (-1744361965);
                        i11 = 447861180;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖᩳ") ^ i38;
                        i10 = ((iM11306 ^ i37) * (-15033)) ^ 101795641;
                        i11 = -2040600572;
                    }
                    i15 = iM11306 ^ i11;
                    iM3363 = i9;
                    iM8169 = i8;
                    i39 = i10;
                    i43 = i54;
                    fM1785 = f2;
                    i42 = i7;
                    i40 = i15;
                    c223910 = c223910;
                    break;
                default:
                    i54 = i54;
                    c223910 = c223910;
                    fM1785 = fM1785;
                    i42 = i42;
                    i16 = i52;
                    i17 = i53;
                    paint2 = new Paint();
                    iM3363 = C0797.m3363(this);
                    iM8169 = C2642.m8169(this);
                    if (this.f22252) {
                        iM11307 = (ThreadFactoryC3888.m11306("ۜۧ") + i37) * (-83);
                        i24 = ((iM11307 ^ i38) * 5083) ^ 1784878363;
                        i25 = 1878887826;
                    } else {
                        iM11307 = (i38 - C19806.m45029("ܽܽ")) * (-105);
                        i24 = ((iM11307 ^ i37) * (-5655)) ^ 957078041;
                        i25 = 1670671333;
                    }
                    int i614 = iM11307 ^ i25;
                    i53 = i17;
                    i52 = i16;
                    i43 = i54;
                    i40 = i614;
                    i42 = i42;
                    i39 = i24;
                    fM1785 = fM1785;
                    c223910 = c223910;
                    break;
            }
            return;
        }
    }

    @Override // android.widget.AdapterView
    public final void setOnItemLongClickListener(AdapterView.OnItemLongClickListener onItemLongClickListener) {
        int i = 1609392613;
        int i2 = C1148.f5161;
        int i3 = C2871.f10837;
        int iM11306 = ThreadFactoryC3888.m11306("ۤܰ") ^ i3;
        int i4 = ((iM11306 ^ i2) * 12597) ^ (-58574708);
        int i5 = -6894918;
        while (true) {
            i = ((((i ^ i2) * 14837) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2140697379:
                case -1979472533:
                    super.setOnItemLongClickListener(null);
                    break;
                case -2116979600:
                case 1366033271:
                    this.f22255 = onItemLongClickListener;
                    if (onItemLongClickListener == null) {
                        iM11306 = C19806.m45029("᩻ۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 16271) ^ (-1985656870);
                        i5 = 848602606;
                    } else {
                        iM11306 = C19806.m45029("᩻ۡ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-24499)) ^ 1378489160;
                        i5 = 1915549289;
                    }
                    break;
                case -1903191865:
                case 1810694025:
                    if (C7105.f23796 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-2837)) ^ 988293462;
                        i5 = -1070201961;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۢ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-13805)) ^ 1262244330;
                        i5 = 209302850;
                    }
                    break;
                case -1856292792:
                case -115284618:
                    if (C2249.m6915() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-2837)) ^ 988293462;
                        i5 = -1070201961;
                    } else {
                        iM11306 = (C19806.m45029("۠᩸") ^ i2) * (-121);
                        i4 = ((iM11306 ^ i3) * 29329) ^ (-125881135);
                        i5 = -533500600;
                    }
                    break;
                case -1642956979:
                case -1129872914:
                    if (C0526.f2219) {
                        iM11306 = C19806.m45029("֫֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22337)) ^ (-1803667035);
                        i5 = -712631952;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ܽۧ")) * 29;
                        i4 = ((iM11306 ^ i3) * (-2945)) ^ 346725948;
                        i5 = 643525822;
                    }
                    break;
                case -1439305225:
                case -108523929:
                    if (!C1977.m6356()) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۗ") + i3) * (-37);
                        i4 = ((iM11306 ^ i2) * 27037) ^ (-1813496435);
                        i5 = 1660977283;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-2837)) ^ 988293462;
                        i5 = -1070201961;
                    }
                    break;
                case -1406171207:
                case 1104491664:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM11306 = (i2 - C19806.m45029("ܿ۫")) * 67;
                        i4 = ((iM11306 ^ i3) * 16003) ^ 577437305;
                        i5 = 1961325940;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶܿ") + i2) * (-125);
                        i4 = ((iM11306 ^ i3) * (-16153)) ^ 1524458841;
                        i5 = 2098600485;
                    }
                    break;
                case -1183627483:
                case 1143196849:
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11306 = (i2 - C19806.m45029("ܿ۫")) * 67;
                        i4 = ((iM11306 ^ i3) * 16003) ^ 577437305;
                        i5 = 1961325940;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰۘ") ^ i3) * (-45);
                        i4 = ((iM11306 ^ i2) * (-23627)) ^ 1343350887;
                        i5 = -1011736297;
                    }
                    break;
                case -922173016:
                case -638817227:
                    C1377.m4833();
                    C0817.m3399();
                    iM11306 = ThreadFactoryC3888.m11306("ۨۨ") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-2837)) ^ 988293462;
                    i5 = -1070201961;
                    break;
                case -916646889:
                case 15368856:
                    if (RunnableC1895.f7152) {
                        iM11306 = C19806.m45029("ۜ֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-5521)) ^ (-2038120914);
                        i5 = 1179622972;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۗ") + i3) * (-37);
                        i4 = ((iM11306 ^ i2) * 27037) ^ (-1813496435);
                        i5 = 1660977283;
                    }
                    break;
                case -820724983:
                case 228364360:
                    super.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l.ۖۜ᩺
                        @Override // android.widget.AdapterView.OnItemLongClickListener
                        public final boolean onItemLongClick(AdapterView adapterView, View view, int i6, long j) {
                            return C6606.m17922(this.f8392, adapterView, view, i6, j);
                        }
                    });
                    break;
                case -731883902:
                case -707153722:
                    if (RunnableC1564.f6300) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-2837)) ^ 988293462;
                        i5 = -1070201961;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-517)) ^ (-1087254298);
                        i5 = -1306899308;
                    }
                    break;
                case -542853915:
                case 1298531578:
                    if (C2249.f8050 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۗ") + i3) * (-37);
                        i4 = ((iM11306 ^ i2) * 27037) ^ (-1813496435);
                        i5 = 1660977283;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("۠ܳ")) * (-65);
                        i4 = ((iM11306 ^ i3) * 22755) ^ 1962270958;
                        i5 = -129898779;
                    }
                    break;
                case -495090613:
                case 525569189:
                    C3286.m9798();
                    if (C0671.f2816 == 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶܿ") + i2) * (-125);
                        i4 = ((iM11306 ^ i3) * (-16153)) ^ 1524458841;
                        i5 = 2098600485;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-2837)) ^ 988293462;
                        i5 = -1070201961;
                    }
                    break;
                case -188786955:
                case 1128288809:
                    if (C2124.m6673() <= 0) {
                        iM11306 = (i2 - C19806.m45029("ܿ۫")) * 67;
                        i4 = ((iM11306 ^ i3) * 16003) ^ 577437305;
                        i5 = 1961325940;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۤۢ")) * (-23);
                        i4 = ((iM11306 ^ i3) * (-20427)) ^ (-1521534401);
                        i5 = 2144778983;
                    }
                    break;
                case -183409957:
                case 1209446331:
                    if (C1189.f5284 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-2837)) ^ 988293462;
                        i5 = -1070201961;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24591)) ^ (-284006500);
                        i5 = 240429094;
                    }
                    break;
                case 168067444:
                case 1925631003:
                    C0797.m3359();
                    C2124.m6673();
                    break;
                default:
                    if (RunnableC1895.f7152) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ۬") + i2) * (-21);
                        i4 = ((iM11306 ^ i3) * (-16241)) ^ 1004159408;
                        i5 = 1406978182;
                    } else {
                        iM11306 = C19806.m45029("֫֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22337)) ^ (-1803667035);
                        i5 = -712631952;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.ViewParent
    public final boolean showContextMenuForChild(View view) {
        boolean zShowContextMenuForChild = false;
        int i = -1302825261;
        int i2 = C2871.f10837;
        int i3 = C3535.f13026;
        int iM11306 = (ThreadFactoryC3888.m11306("ۘ۫") ^ i3) * 127;
        int i4 = ((iM11306 ^ i2) * (-26127)) ^ (-38716850);
        int i5 = -2114552171;
        while (true) {
            i = ((((i ^ i2) * 26349) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2028268991:
                case -733814808:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    C1189.m4368();
                    return false;
                case -1988095304:
                case -927595824:
                    if (C2704.f10408) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-9103)) ^ (-899332208);
                        i5 = -1048863880;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ܽ") + i2) * 55;
                        i4 = ((iM11306 ^ i3) * 17209) ^ 1992072801;
                        i5 = -157277098;
                    }
                    break;
                case -1634165540:
                case -1567658524:
                    if (C0050.m946() <= 0) {
                        iM11306 = (C19806.m45029("᩵ܺ") ^ i3) * (-93);
                        i4 = ((iM11306 ^ i2) * 17649) ^ 1391075883;
                        i5 = -888231348;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩶ۙ")) * (-29);
                        i4 = ((iM11306 ^ i2) * (-16069)) ^ 432945886;
                        i5 = 661873154;
                    }
                    break;
                case -1595174681:
                case 1894553549:
                    if (C2788.f10625 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10933)) ^ (-900273460);
                        i5 = -236403038;
                    } else {
                        iM11306 = C19806.m45029("֡۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * 25153) ^ 1173843964;
                        i5 = -1633478463;
                    }
                    break;
                case -1483901408:
                case -558293271:
                    C2871.m8646();
                    if (C1937.f7317 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10933)) ^ (-900273460);
                        i5 = -236403038;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22405)) ^ 639570789;
                        i5 = 1682395567;
                    }
                    break;
                case -1438251136:
                case 75858294:
                    if (CallableC1627.f6528) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩵ᩳ")) * (-121);
                        i4 = ((iM11306 ^ i3) * (-20519)) ^ (-427415466);
                        i5 = 1538406457;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ܽ") + i2) * 55;
                        i4 = ((iM11306 ^ i3) * 17209) ^ 1992072801;
                        i5 = -157277098;
                    }
                    break;
                case -1410320543:
                case -1227716624:
                    if (C1398.f5802 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ܽ") + i2) * 55;
                        i4 = ((iM11306 ^ i3) * 17209) ^ 1992072801;
                        i5 = -157277098;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5509) ^ 1806532328;
                        i5 = 789549083;
                    }
                    break;
                case -1167751368:
                case -464486918:
                    this.f22244 = false;
                    iM11306 = (C19806.m45029("ܿ֡") + i3) * 41;
                    i4 = ((iM11306 ^ i2) * 25707) ^ 249216112;
                    i5 = 801040002;
                    break;
                case -998046472:
                case 900029627:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶᩻") + i3) * 93;
                        i4 = ((iM11306 ^ i2) * 21163) ^ (-766778367);
                        i5 = 185625149;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۛܺ")) * (-119);
                        i4 = ((iM11306 ^ i3) * 6955) ^ (-94610838);
                        i5 = -2020503831;
                    }
                    break;
                case -511122718:
                case 1144595147:
                    C1419.m4973();
                    if (C2704.m8255() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22405)) ^ 639570789;
                        i5 = 1682395567;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ܽ") + i2) * 55;
                        i4 = ((iM11306 ^ i3) * 17209) ^ 1992072801;
                        i5 = -157277098;
                    }
                    break;
                case -448243422:
                case 743685926:
                    if (C2332.f8260) {
                        iM11306 = C19806.m45029("ܽ֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * 8999) ^ (-2112059517);
                        i5 = -1574798694;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22405)) ^ 639570789;
                        i5 = 1682395567;
                    }
                    break;
                case -37576575:
                case 388305667:
                    if (C0216.m1591() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22405)) ^ 639570789;
                        i5 = 1682395567;
                    } else {
                        iM11306 = (i2 - C19806.m45029("֡᩵")) * (-39);
                        i4 = ((iM11306 ^ i3) * (-30713)) ^ (-729260007);
                        i5 = 873192288;
                    }
                    break;
                case 291823713:
                case 1418997463:
                    if (RunnableC1895.f7152) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۤ") + i2) * 45;
                        i4 = ((iM11306 ^ i3) * (-15253)) ^ 1683660058;
                        i5 = -1038731122;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡ܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-10933)) ^ (-900273460);
                        i5 = -236403038;
                    }
                    break;
                case 545287419:
                case 1125671324:
                    if (C0671.f2816 != 0) {
                        iM11306 = (C19806.m45029("᩵ܺ") ^ i3) * (-93);
                        i4 = ((iM11306 ^ i2) * 17649) ^ 1391075883;
                        i5 = -888231348;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22405)) ^ 639570789;
                        i5 = 1682395567;
                    }
                    break;
                case 643701432:
                case 1432094812:
                    zShowContextMenuForChild = super.showContextMenuForChild(view);
                    if (zShowContextMenuForChild) {
                        iM11306 = (C19806.m45029("֡ܽ") + i2) * (-3);
                        i4 = ((iM11306 ^ i3) * 1723) ^ 2139550056;
                        i5 = -1769793445;
                    } else {
                        iM11306 = (C19806.m45029("ܿ֡") + i3) * 41;
                        i4 = ((iM11306 ^ i2) * 25707) ^ 249216112;
                        i5 = 801040002;
                    }
                    break;
                case 1000835687:
                case 1012517550:
                    C2704.m8255();
                    C0216.m1591();
                    iM11306 = (ThreadFactoryC3888.m11306("֨ܽ") + i2) * 55;
                    i4 = ((iM11306 ^ i3) * 17209) ^ 1992072801;
                    i5 = -157277098;
                    break;
                case 1153416300:
                case 1957717771:
                    return zShowContextMenuForChild;
                default:
                    this.f22237 = true;
                    if (RunnableC1895.f7152) {
                        iM11306 = C19806.m45029("ۨ᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-11689)) ^ (-689455335);
                        i5 = -444249175;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶᩻") + i3) * 93;
                        i4 = ((iM11306 ^ i2) * 21163) ^ (-766778367);
                        i5 = 185625149;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m17928(MotionEvent motionEvent) {
        boolean z = false;
        int iM10898 = 0;
        int i = 0;
        MotionEvent motionEventObtain = null;
        int actionIndex = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -29573138;
        int i6 = C2477.f9839;
        int i7 = C3660.f13403;
        int iM45029 = (C19806.m45029("ܳۡ") + i7) * (-95);
        int i8 = ((iM45029 ^ i6) * 1125) ^ 117572581;
        int i9 = -1397256244;
        while (true) {
            i5 = ((((i5 ^ i6) * (-32569)) >> 31) & i8) ^ (iM45029 ^ i9);
            switch (i5) {
                case -2064085407:
                case 1314633519:
                    C3577.m10566(this, i).setPressed(z);
                    if (C1148.f5161 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ᩷") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-26197)) ^ (-1721875522);
                        i9 = -589919973;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("۫ۨ")) * (-37);
                        i8 = ((iM45029 ^ i7) * (-11329)) ^ 233567956;
                        i9 = -1281957740;
                    }
                    break;
                case -1707330731:
                case 1375891474:
                    motionEventObtain = MotionEvent.obtain(motionEvent);
                    actionIndex = motionEvent.getActionIndex();
                    if (C3743.f13569) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨֫") ^ i7) * 7;
                        i8 = ((iM45029 ^ i6) * 5163) ^ 1634417966;
                        i9 = 183666717;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻᩷") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-13359)) ^ 658681385;
                        i9 = -610442923;
                    }
                    break;
                case -1414584089:
                case 941244687:
                    if (C3535.m10431() > 0) {
                        iM45029 = C19806.m45029("᩵۫") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-8697)) ^ 4214336;
                        i9 = 1624247320;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙᩴ") + i6) * (-93);
                        i8 = ((iM45029 ^ i7) * 5931) ^ (-1291301827);
                        i9 = 754943597;
                    }
                    break;
                case -1146771632:
                case 532519136:
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    break;
                case -1074614295:
                case 1266173670:
                    C1461.m5080();
                    break;
                case -981981309:
                case 287721462:
                    C2704.m8255();
                    C0216.m1591();
                    iM45029 = ThreadFactoryC3888.m11306("ۙ᩷") ^ i7;
                    i8 = ((iM45029 ^ i6) * (-26197)) ^ (-1721875522);
                    i9 = -589919973;
                    break;
                case -845963316:
                case 953572906:
                    C2642.m8171();
                    if (C3722.f13525 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙᩴ") + i6) * (-93);
                        i8 = ((iM45029 ^ i7) * 5931) ^ (-1291301827);
                        i9 = 754943597;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ᩷") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-26197)) ^ (-1721875522);
                        i9 = -589919973;
                    }
                    break;
                case -217989047:
                case 791971293:
                    i2 = 8;
                    if (C3577.m10565()) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶᩳ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-25703)) ^ 1801423171;
                        i9 = -1629249635;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻᩷") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-13359)) ^ 658681385;
                        i9 = -610442923;
                    }
                    break;
                case -142797235:
                case 1850649360:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (C10634.m26820()) {
                        iM45029 = C19806.m45029("ۗۧ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 2519) ^ (-771502083);
                        i9 = 1513972863;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙᩴ") + i6) * (-93);
                        i8 = ((iM45029 ^ i7) * 5931) ^ (-1291301827);
                        i9 = 754943597;
                    }
                    break;
                case -133005970:
                case 1616179505:
                    if (i < iM10898) {
                        iM45029 = (C19806.m45029("ۨܳ") + i6) * 11;
                        i8 = ((iM45029 ^ i7) * 30131) ^ (-707455010);
                        i9 = -1669367460;
                    } else {
                        iM45029 = (i6 - C19806.m45029("ۧۛ")) * 45;
                        i8 = ((iM45029 ^ i7) * (-18401)) ^ 1730324744;
                        i9 = 575362503;
                    }
                    break;
                case -2489788:
                case 146194825:
                    motionEventObtain.setAction(i3 | i4);
                    if (C0278.f1572 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ᩷") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-26197)) ^ (-1721875522);
                        i9 = -589919973;
                    } else {
                        iM45029 = C19806.m45029("ᩴᩳ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 14009) ^ (-96273550);
                        i9 = 738773100;
                    }
                    break;
                case 20016808:
                case 1268362491:
                    z = false;
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ᩷") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-26197)) ^ (-1721875522);
                        i9 = -589919973;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ܰ") + i6) * 77;
                        i8 = ((iM45029 ^ i7) * 9821) ^ (-1832203733);
                        i9 = -1974046622;
                    }
                    break;
                case 105358755:
                case 131781269:
                    if (RunnableC0195.m1431()) {
                        iM45029 = (C19806.m45029("ۖܳ") ^ i6) * 97;
                        i8 = ((iM45029 ^ i7) * 18613) ^ 840226776;
                        i9 = -1457443267;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ᩷") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-26197)) ^ (-1721875522);
                        i9 = -589919973;
                    }
                    break;
                case 156059427:
                case 969180080:
                    i3 = actionIndex << i2;
                    i4 = 3;
                    if (C0278.f1572 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻᩷") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-13359)) ^ 658681385;
                        i9 = -610442923;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤܽ") ^ i6;
                        i8 = ((iM45029 ^ i7) * 27885) ^ 442268073;
                        i9 = 2022120382;
                    }
                    break;
                case 421686779:
                case 1297211654:
                    if (C0629.f2722 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙᩴ") + i6) * (-93);
                        i8 = ((iM45029 ^ i7) * 5931) ^ (-1291301827);
                        i9 = 754943597;
                    } else {
                        iM45029 = C19806.m45029("ۗᩳ") ^ i6;
                        i8 = ((iM45029 ^ i7) * 4521) ^ (-2055312177);
                        i9 = 2011904519;
                    }
                    break;
                case 448513853:
                case 919702243:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙᩴ") + i6) * (-93);
                        i8 = ((iM45029 ^ i7) * 5931) ^ (-1291301827);
                        i9 = 754943597;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤᩴ") + i7) * 21;
                        i8 = ((iM45029 ^ i6) * (-31331)) ^ 417242816;
                        i9 = 1753089588;
                    }
                    break;
                case 734279470:
                case 802533478:
                    cancelLongPress();
                    if (RunnableC1895.m6170() != 0) {
                        iM45029 = C19806.m45029("᩵۫") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-8697)) ^ 4214336;
                        i9 = 1624247320;
                    } else {
                        iM45029 = C19806.m45029("᩶ۗ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-26809)) ^ 2118040711;
                        i9 = -600525159;
                    }
                    break;
                case 1804273395:
                case 2057248415:
                    i++;
                    iM45029 = ThreadFactoryC3888.m11306("۟᩺") ^ i7;
                    i8 = ((iM45029 ^ i6) * 9923) ^ (-1094503587);
                    i9 = 1874637654;
                    break;
                default:
                    setPressed(z);
                    iM10898 = C3722.m10898(this);
                    i = 0;
                    iM45029 = ThreadFactoryC3888.m11306("۟᩺") ^ i7;
                    i8 = ((iM45029 ^ i6) * 9923) ^ (-1094503587);
                    i9 = 1874637654;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17918(MotionEvent motionEvent) {
        float x = 0.0f;
        boolean z = false;
        boolean z2 = false;
        C17381 c17381 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 414802801;
        int i2 = C2642.f10294;
        int i3 = C0278.f1572;
        int iM11306 = ThreadFactoryC3888.m11306("֡᩶") ^ i3;
        int i4 = ((iM11306 ^ i2) * (-30643)) ^ 1625696809;
        int i5 = -1104085377;
        while (true) {
            i = ((((i ^ i2) * 23613) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2049809486:
                case -1233256063:
                    this.f22249 = x;
                    if (C0526.f2219) {
                        iM11306 = (C19806.m45029("ܿܰ") + i2) * 71;
                        i4 = ((iM11306 ^ i3) * (-19995)) ^ 500110357;
                        i5 = 1964034523;
                    } else {
                        iM11306 = (i2 - C19806.m45029("֨᩹")) * (-107);
                        i4 = ((iM11306 ^ i3) * (-1489)) ^ 755711233;
                        i5 = -1682434077;
                    }
                    break;
                case -1555614227:
                case 776712268:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22653)) ^ 1755731524;
                        i5 = 465736110;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤۚ") + i3) * (-37);
                        i4 = ((iM11306 ^ i2) * 31661) ^ (-214934173);
                        i5 = 403726921;
                    }
                    break;
                case -1514354874:
                case 780982260:
                    x = motionEvent.getX();
                    if (C3577.m10565()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-16679)) ^ 1261520886;
                        i5 = -1444569045;
                    } else {
                        iM11306 = C19806.m45029("ܳ᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-8947)) ^ 1416447604;
                        i5 = -410778778;
                    }
                    break;
                case -1320159018:
                case 1978043921:
                    C2788.m8472();
                    if (!C1377.f5749) {
                        iM11306 = (C19806.m45029("ܺ۫") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11306 ^ i3) * (-11475)) ^ 1458746798;
                        i5 = 1207428884;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 24917) ^ (-903803969);
                        i5 = 1993109421;
                    }
                    break;
                case -1203056717:
                case 878527991:
                    break;
                case -1038587668:
                case -216655864:
                    this.f22235 = C3286.m9790();
                    if (C2704.m8255() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22653)) ^ 1755731524;
                        i5 = 465736110;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 1639) ^ 475127990;
                        i5 = 1610328874;
                    }
                    break;
                case -991059289:
                case 430643047:
                    this.f22254 = f - f2;
                    if (C0526.m2437() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 24917) ^ (-903803969);
                        i5 = 1993109421;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-2791)) ^ 814532403;
                        i5 = -295559075;
                    }
                    break;
                case -678902064:
                case -408720510:
                    z2 = true;
                    z2 = true;
                    this.f22252 = true;
                    c17381 = this.f22250;
                    if (c17381 != null) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۘ᩸")) * (-77);
                        i4 = ((iM11306 ^ i2) * (-25239)) ^ 267471595;
                        i5 = 2115814844;
                    } else {
                        iM11306 = (C19806.m45029("ܳ۫") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i3) * (-26425)) ^ 582502801;
                        i5 = -302412370;
                    }
                    break;
                case -497737114:
                case 735756124:
                    f2 = this.f22243;
                    if (AbstractC0464.m2313() != 0) {
                        iM11306 = (C19806.m45029("ܺ۫") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11306 ^ i3) * (-11475)) ^ 1458746798;
                        i5 = 1207428884;
                    } else {
                        iM11306 = C19806.m45029("ܽ᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * 27167) ^ (-1805687143);
                        i5 = -613014969;
                    }
                    break;
                case -449363395:
                case 1080035990:
                    C19806.m45017(this);
                    if (getParent() != null) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܶܽ")) * (-111);
                        i4 = ((iM11306 ^ i2) * 22445) ^ 756013636;
                        i5 = 910700251;
                    } else {
                        iM11306 = C19806.m45029("ᩴۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 6253) ^ 573494491;
                        i5 = 734332203;
                    }
                    break;
                case -353117506:
                case 450497548:
                    f = this.f22236.f73107;
                    if (C1977.m6356()) {
                        iM11306 = (C19806.m45029("ܿܰ") + i2) * 71;
                        i4 = ((iM11306 ^ i3) * (-19995)) ^ 500110357;
                        i5 = 1964034523;
                    } else {
                        iM11306 = C19806.m45029("۫᩷") ^ i3;
                        i4 = ((iM11306 ^ i2) * 20847) ^ (-709940859);
                        i5 = -14495251;
                    }
                    break;
                case -208725231:
                case 1117127813:
                    C1189.m4368();
                    C1066.m4023();
                    break;
                case -84674142:
                case 2126605616:
                    C3535.m10431();
                    iM11306 = (C19806.m45029("ܺ۫") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i4 = ((iM11306 ^ i3) * (-11475)) ^ 1458746798;
                    i5 = 1207428884;
                    break;
                case 30369481:
                case 1767123351:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() == 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22653)) ^ 1755731524;
                        i5 = 465736110;
                    } else {
                        iM11306 = (C19806.m45029("ܺ۫") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11306 ^ i3) * (-11475)) ^ 1458746798;
                        i5 = 1207428884;
                    }
                    break;
                case 112634367:
                case 1011299962:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM11306 = C19806.m45029("ܳ᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-8947)) ^ 1416447604;
                        i5 = -410778778;
                    } else {
                        iM11306 = (C19806.m45029("ܺ۫") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11306 ^ i3) * (-11475)) ^ 1458746798;
                        i5 = 1207428884;
                    }
                    break;
                case 260159611:
                case 922507309:
                    getParent().requestDisallowInterceptTouchEvent(z2);
                    iM11306 = C19806.m45029("ᩴۚ") ^ i2;
                    i4 = ((iM11306 ^ i3) * 6253) ^ 573494491;
                    i5 = 734332203;
                    break;
                case 451554713:
                case 1373656062:
                    this.f22243 = motionEvent.getY();
                    if (RunnableC1895.f7152) {
                        iM11306 = C19806.m45029("ۚܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-31123)) ^ 2006719138;
                        i5 = 1855259591;
                    } else {
                        iM11306 = (C19806.m45029("ܿܰ") + i2) * 71;
                        i4 = ((iM11306 ^ i3) * (-19995)) ^ 500110357;
                        i5 = 1964034523;
                    }
                    break;
                case 1118049989:
                case 1567032729:
                    c17381.m40478(z2 ? 1 : 0, this.f22238);
                    iM11306 = (C19806.m45029("ܳ۫") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i4 = ((iM11306 ^ i3) * (-26425)) ^ 582502801;
                    i5 = -302412370;
                    break;
                case 1944247097:
                case 2102469871:
                    m17928(motionEvent);
                    z = false;
                    if (C0050.f912 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 24917) ^ (-903803969);
                        i5 = 1993109421;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ۢ") ^ i2) * 83;
                        i4 = ((iM11306 ^ i3) * (-8409)) ^ (-1365058920);
                        i5 = -1142484982;
                    }
                    break;
                default:
                    this.f22244 = z;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (C19806.m45029("ܿܰ") + i2) * 71;
                        i4 = ((iM11306 ^ i3) * (-19995)) ^ 500110357;
                        i5 = 1964034523;
                    } else {
                        iM11306 = C19806.m45029("᩶۠") ^ i3;
                        i4 = ((iM11306 ^ i2) * 13699) ^ 958007479;
                        i5 = -86551601;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.ViewParent
    public final boolean showContextMenuForChild(View view, float f, float f2) {
        boolean zShowContextMenuForChild = false;
        int i = 196221102;
        int i2 = C1461.f5957;
        int i3 = C10634.f36300;
        int iM11306 = ThreadFactoryC3888.m11306("᩹ۨ") ^ i3;
        int i4 = ((iM11306 ^ i2) * (-16171)) ^ 1578524455;
        int i5 = -1847414748;
        while (true) {
            i = ((((i ^ i2) * (-19577)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1935064465:
                case -1342231929:
                    zShowContextMenuForChild = super.showContextMenuForChild(view, f, f2);
                    if (zShowContextMenuForChild) {
                        iM11306 = ThreadFactoryC3888.m11306("֨֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-1971)) ^ 305653903;
                        i5 = 985765262;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * 20983) ^ (-228540469);
                        i5 = 46342455;
                    }
                    break;
                case -1851725828:
                case 1792996229:
                    C0671.m3008();
                    if (C1668.f6641 < 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۙ᩺")) * 19;
                        i4 = ((iM11306 ^ i2) * (-5317)) ^ 1915883732;
                        i5 = -166287834;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۧ᩺")) * (-97);
                        i4 = ((iM11306 ^ i3) * (-23833)) ^ 1300780266;
                        i5 = -869605771;
                    }
                    break;
                case -1803239682:
                case 294820102:
                    if (C1066.f4915 <= 0) {
                        iM11306 = (C19806.m45029("ᩴ۫") + i2) * 27;
                        i4 = ((iM11306 ^ i3) * (-8343)) ^ 377549681;
                        i5 = 678509764;
                    } else {
                        iM11306 = (i2 - C19806.m45029("᩶᩸")) * 63;
                        i4 = ((iM11306 ^ i3) * 27183) ^ (-242013717);
                        i5 = -69261543;
                    }
                    break;
                case -1625508402:
                case 935042374:
                    if (C3722.f13525 <= 0) {
                        iM11306 = (C19806.m45029("ᩴ۫") + i2) * 27;
                        i4 = ((iM11306 ^ i3) * (-8343)) ^ 377549681;
                        i5 = 678509764;
                    } else {
                        iM11306 = C19806.m45029("ۘ֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 26297) ^ (-239686379);
                        i5 = 2034120040;
                    }
                    break;
                case -1540256991:
                case 1002892870:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (C19806.m45029("ᩴ۫") + i2) * 27;
                        i4 = ((iM11306 ^ i3) * (-8343)) ^ 377549681;
                        i5 = 678509764;
                    } else {
                        iM11306 = (C19806.m45029("֫᩶") ^ i3) * 47;
                        i4 = ((iM11306 ^ i2) * 28869) ^ 590605511;
                        i5 = -1653819473;
                    }
                    break;
                case -1363646890:
                case 2071299322:
                    if (C1148.f5161 <= 0) {
                        iM11306 = (i2 - C19806.m45029("᩸ܳ")) * 95;
                        i4 = ((iM11306 ^ i3) * (-9209)) ^ 1230573035;
                        i5 = -319083263;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩻۬")) * 115;
                        i4 = ((iM11306 ^ i2) * (-22183)) ^ (-1389745540);
                        i5 = -1491634517;
                    }
                    break;
                case -1275820753:
                case 2081115297:
                    if (C3577.f13150 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩻۬")) * 115;
                        i4 = ((iM11306 ^ i2) * (-22183)) ^ (-1389745540);
                        i5 = -1491634517;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠ܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-1593)) ^ (-1313289173);
                        i5 = -1365853904;
                    }
                    break;
                case -1237625356:
                case 786790336:
                    if (C3722.f13525 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۙ᩺")) * 19;
                        i4 = ((iM11306 ^ i2) * (-5317)) ^ 1915883732;
                        i5 = -166287834;
                    } else {
                        iM11306 = C19806.m45029("᩷ۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 27799) ^ (-1780149447);
                        i5 = -2000922094;
                    }
                    break;
                case -1114699629:
                case -1111026542:
                    return zShowContextMenuForChild;
                case -778559850:
                case 1562639087:
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۙ᩺")) * 19;
                        i4 = ((iM11306 ^ i2) * (-5317)) ^ 1915883732;
                        i5 = -166287834;
                    } else {
                        iM11306 = C19806.m45029("ܶܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 18443) ^ (-1006563779);
                        i5 = 36802834;
                    }
                    break;
                case -724212035:
                case 1668196479:
                    if (C2704.f10408) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22805)) ^ (-1305178324);
                        i5 = -500702733;
                    } else {
                        iM11306 = (C19806.m45029("ᩴ۫") + i2) * 27;
                        i4 = ((iM11306 ^ i3) * (-8343)) ^ 377549681;
                        i5 = 678509764;
                    }
                    break;
                case -629954284:
                case 1515473521:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (C19806.m45029("֨ᩴ") ^ i2) * 95;
                        i4 = ((iM11306 ^ i3) * (-5445)) ^ 762122544;
                        i5 = 2116104222;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۙ᩺")) * 19;
                        i4 = ((iM11306 ^ i2) * (-5317)) ^ 1915883732;
                        i5 = -166287834;
                    }
                    break;
                case -614750792:
                case 440590947:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    C2871.m8646();
                    iM11306 = (i2 - C19806.m45029("ۧ᩺")) * (-97);
                    i4 = ((iM11306 ^ i3) * (-23833)) ^ 1300780266;
                    i5 = -869605771;
                    break;
                case -63618074:
                case 1654922452:
                    this.f22237 = true;
                    this.f22244 = false;
                    iM11306 = ThreadFactoryC3888.m11306("֨᩶") ^ i3;
                    i4 = ((iM11306 ^ i2) * 20983) ^ (-228540469);
                    i5 = 46342455;
                    break;
                case 185244520:
                case 185602652:
                    if (C2871.f10837 >= 0) {
                        iM11306 = (i2 - C19806.m45029("᩸ܳ")) * 95;
                        i4 = ((iM11306 ^ i3) * (-9209)) ^ 1230573035;
                        i5 = -319083263;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20031)) ^ 1375685352;
                        i5 = 1808966068;
                    }
                    break;
                case 484393943:
                case 547723289:
                    C1937.m6279();
                    if (!C0797.f3386) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۙ᩺")) * 19;
                        i4 = ((iM11306 ^ i2) * (-5317)) ^ 1915883732;
                        i5 = -166287834;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩻۬")) * 115;
                        i4 = ((iM11306 ^ i2) * (-22183)) ^ (-1389745540);
                        i5 = -1491634517;
                    }
                    break;
                case 559665432:
                case 875057550:
                    if (C0962.f3784) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۙ᩺")) * 19;
                        i4 = ((iM11306 ^ i2) * (-5317)) ^ 1915883732;
                        i5 = -166287834;
                    } else {
                        iM11306 = C19806.m45029("᩻ۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 28885) ^ (-755557779);
                        i5 = 1400247362;
                    }
                    break;
                default:
                    C2642.m8171();
                    return false;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 25321. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r35) {
        /*
            Method dump skipped, instruction units count: 2532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6606.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m17922(C6606 c6606, AdapterView adapterView, View view, int i, long j) {
        AdapterView.OnItemLongClickListener onItemLongClickListener = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 1491856154;
        int i3 = C1025.f4800;
        int i4 = C1461.f5957;
        int iM45029 = (C19806.m45029("֨ᩴ") ^ i3) * (-33);
        int i5 = ((iM45029 ^ i4) * 20239) ^ (-1314463267);
        int i6 = -2076870426;
        while (true) {
            i2 = ((((i2 ^ i4) * (-24189)) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2086618185:
                case -629623313:
                    C2642.m8171();
                    RunnableC1564.m5345();
                    iM45029 = ThreadFactoryC3888.m11306("ۛ᩹") ^ i3;
                    i5 = ((iM45029 ^ i4) * 17495) ^ 2098703689;
                    i6 = -874722147;
                    break;
                case -1973862260:
                case 29621641:
                    if (C3535.f13026 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽۘ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-27681)) ^ (-582939489);
                        i6 = 71134014;
                    } else {
                        iM45029 = C19806.m45029("᩵֫") ^ i3;
                        i5 = ((iM45029 ^ i4) * 27407) ^ 1564936902;
                        i6 = -830397765;
                    }
                    break;
                case -1659741573:
                case 372722948:
                    if (C1937.m6279() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ᩹") ^ i3;
                        i5 = ((iM45029 ^ i4) * 17495) ^ 2098703689;
                        i6 = -874722147;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷ۖ") + i3) * 63;
                        i5 = ((iM45029 ^ i4) * 24419) ^ 1410971164;
                        i6 = -2132048199;
                    }
                    break;
                case -1456880000:
                case 1997312060:
                    return z3;
                case -1143381890:
                case -443533777:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ᩴ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-18795)) ^ 82877055;
                        i6 = 1799377353;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۨ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-2541)) ^ (-2091065763);
                        i6 = -812857330;
                    }
                    break;
                case -1125760645:
                case 460183212:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    C3660.m10791();
                    return false;
                case -1085307596:
                case 1748766233:
                    z3 = false;
                    iM45029 = (C19806.m45029("ܳۛ") ^ i4) * (-53);
                    i5 = ((iM45029 ^ i3) * 11697) ^ (-1876042798);
                    i6 = 2144408438;
                    break;
                case -905446705:
                case 546897278:
                    if (onItemLongClickListener.onItemLongClick(adapterView, view, i, j)) {
                        iM45029 = (C19806.m45029("ܿᩴ") ^ i3) * (-87);
                        i5 = ((iM45029 ^ i4) * 12507) ^ 1305665167;
                        i6 = 706402453;
                    } else {
                        iM45029 = C19806.m45029("ۙ֫") ^ i3;
                        i5 = ((iM45029 ^ i4) * 29515) ^ (-1897639065);
                        i6 = -1198709980;
                    }
                    break;
                case -896313065:
                case 732406420:
                    C3286.m9798();
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽۘ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-27681)) ^ (-582939489);
                        i6 = 71134014;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ᩹") ^ i3;
                        i5 = ((iM45029 ^ i4) * 17495) ^ 2098703689;
                        i6 = -874722147;
                    }
                    break;
                case -864299939:
                case -202265766:
                    if (C1025.f4800 >= 0) {
                        iM45029 = C19806.m45029("᩹ۤ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 2567) ^ (-867151406);
                        i6 = 1942070460;
                    } else {
                        iM45029 = (C19806.m45029("ܺᩴ") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM45029 ^ i3) * (-28297)) ^ 2093399285;
                        i6 = 1230235597;
                    }
                    break;
                case -851929361:
                case -704170165:
                    if (z3) {
                        iM45029 = (C19806.m45029("ᩳܿ") ^ i3) * 7;
                        i5 = ((iM45029 ^ i4) * 23087) ^ (-1324530161);
                        i6 = 1147980464;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗۚ") + i4) * (-33);
                        i5 = ((iM45029 ^ i3) * (-16141)) ^ 158147507;
                        i6 = -304462202;
                    }
                    break;
                case -791402852:
                case -728991542:
                    if (!C3286.f12186) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ᩹") ^ i3;
                        i5 = ((iM45029 ^ i4) * 17495) ^ 2098703689;
                        i6 = -874722147;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("᩸۠")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM45029 ^ i3) * (-17671)) ^ (-349839108);
                        i6 = -2132654148;
                    }
                    break;
                case -595765813:
                case -409990652:
                    if (C19806.m45024()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ᩹") ^ i3;
                        i5 = ((iM45029 ^ i4) * 17495) ^ 2098703689;
                        i6 = -874722147;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۙ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 28481) ^ (-344032758);
                        i6 = 1504049929;
                    }
                    break;
                case -594523635:
                case 1296271248:
                    if (C1377.f5749) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩺ۚ")) * 115;
                        i5 = ((iM45029 ^ i4) * 13845) ^ (-1801069133);
                        i6 = -760097433;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽۘ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-27681)) ^ (-582939489);
                        i6 = 71134014;
                    }
                    break;
                case -259037819:
                case -37779968:
                    c6606.f22237 = z2;
                    c6606.f22244 = z;
                    iM45029 = (ThreadFactoryC3888.m11306("ۗۚ") + i4) * (-33);
                    i5 = ((iM45029 ^ i3) * (-16141)) ^ 158147507;
                    i6 = -304462202;
                    break;
                case -231670081:
                case 1050255433:
                    if (C3743.m10966() <= 0) {
                        iM45029 = C19806.m45029("᩹ۤ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 2567) ^ (-867151406);
                        i6 = 1942070460;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۙ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 23639) ^ 601198956;
                        i6 = -1809984865;
                    }
                    break;
                case 87047554:
                case 506720162:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ᩴ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-18795)) ^ 82877055;
                        i6 = 1799377353;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙܿ") + i4) * 61;
                        i5 = ((iM45029 ^ i3) * 17593) ^ 572150133;
                        i6 = 34911531;
                    }
                    break;
                case 179702879:
                case 1825367418:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("᩸۠")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM45029 ^ i3) * (-17671)) ^ (-349839108);
                        i6 = -2132654148;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ۠") ^ i3) * (-113);
                        i5 = ((iM45029 ^ i4) * 2207) ^ 1010557337;
                        i6 = 333874221;
                    }
                    break;
                case 306662382:
                case 1583281057:
                    if (C1398.f5802 <= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("᩸۠")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM45029 ^ i3) * (-17671)) ^ (-349839108);
                        i6 = -2132654148;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۛ") ^ i4) * 23;
                        i5 = ((iM45029 ^ i3) * (-5009)) ^ 1494207656;
                        i6 = 766998617;
                    }
                    break;
                case 858103138:
                case 2095246633:
                    C0629.m2907();
                    if (!C3286.f12186) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("᩸۠")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM45029 ^ i3) * (-17671)) ^ (-349839108);
                        i6 = -2132654148;
                    } else {
                        iM45029 = C19806.m45029("᩹ۤ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 2567) ^ (-867151406);
                        i6 = 1942070460;
                    }
                    break;
                case 969491583:
                case 2002924419:
                    z3 = true;
                    iM45029 = (C19806.m45029("ܳۛ") ^ i4) * (-53);
                    i5 = ((iM45029 ^ i3) * 11697) ^ (-1876042798);
                    i6 = 2144408438;
                    break;
                default:
                    onItemLongClickListener = c6606.f22255;
                    z = false;
                    z2 = true;
                    if (onItemLongClickListener != null) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ۬") ^ i4) * 19;
                        i5 = ((iM45029 ^ i3) * (-20685)) ^ (-240073920);
                        i6 = 1166591307;
                    } else {
                        iM45029 = C19806.m45029("ۙ֫") ^ i3;
                        i5 = ((iM45029 ^ i4) * 29515) ^ (-1897639065);
                        i6 = -1198709980;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17933(C17381 c17381) {
        int i = 772798417;
        int i2 = C2788.f10625;
        int i3 = C1189.f5284;
        int iM45029 = C19806.m45029("ۘۡ") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-16137)) ^ 1382325546;
        int i5 = 1884620956;
        while (true) {
            i = ((((i ^ i2) * (-4017)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2008970438:
                case -997456764:
                    if (RunnableC1564.f6300) {
                        iM45029 = C19806.m45029("ܶۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 31213) ^ (-1310394369);
                        i5 = -414871576;
                    } else {
                        iM45029 = (C19806.m45029("ᩴۢ") ^ i2) * (-81);
                        i4 = ((iM45029 ^ i3) * (-10173)) ^ (-362149964);
                        i5 = -990811078;
                    }
                    break;
                case -1959759246:
                case 261576301:
                    if (C0278.m1789() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12443) ^ (-1110580993);
                        i5 = -1979465237;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 23013) ^ 466697557;
                        i5 = -936460577;
                    }
                    break;
                case -1869947099:
                case 1609437658:
                    C2642.m8171();
                    if (C1668.f6641 < 0) {
                        iM45029 = C19806.m45029("ܶۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 31213) ^ (-1310394369);
                        i5 = -414871576;
                    } else {
                        iM45029 = (C19806.m45029("ۜۡ") ^ i3) * 77;
                        i4 = ((iM45029 ^ i2) * 567) ^ (-262729034);
                        i5 = 2116151689;
                    }
                    break;
                case -1741085522:
                case 850101087:
                    C1066.m4023();
                    iM45029 = (C19806.m45029("ۜۡ") ^ i3) * 77;
                    i4 = ((iM45029 ^ i2) * 567) ^ (-262729034);
                    i5 = 2116151689;
                    break;
                case -1737384030:
                case 203497644:
                    if (C0671.m3008() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12443) ^ (-1110580993);
                        i5 = -1979465237;
                    } else {
                        iM45029 = (C19806.m45029("ܳۖ") ^ i3) * 95;
                        i4 = ((iM45029 ^ i2) * (-17947)) ^ (-1414951893);
                        i5 = 1956353625;
                    }
                    break;
                case -1601987525:
                case -558589184:
                    if (C1937.m6279() >= 0) {
                        iM45029 = C19806.m45029("ܶۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 31213) ^ (-1310394369);
                        i5 = -414871576;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ۡ") + i2) * (-77);
                        i4 = ((iM45029 ^ i3) * (-21157)) ^ 525261962;
                        i5 = -1493977738;
                    }
                    break;
                case -1200930948:
                case 1762184832:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܽۧ")) * 79;
                        i4 = ((iM45029 ^ i3) * 4569) ^ (-1526634737);
                        i5 = -817223473;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۗۨ")) * 71;
                        i4 = ((iM45029 ^ i2) * (-22607)) ^ (-831535996);
                        i5 = 758262191;
                    }
                    break;
                case -1156937043:
                case 1859722981:
                    C0050.m946();
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    break;
                case -1106290595:
                case 1887232802:
                    if (C2332.f8260) {
                        iM45029 = C19806.m45029("ۙ۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * 8991) ^ 1447781650;
                        i5 = 291648865;
                    } else {
                        iM45029 = (C19806.m45029("ۜۡ") ^ i3) * 77;
                        i4 = ((iM45029 ^ i2) * 567) ^ (-262729034);
                        i5 = 2116151689;
                    }
                    break;
                case -885444357:
                case 2130771145:
                    if (!RunnableC1564.f6300) {
                        iM45029 = C19806.m45029("ܶۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 31213) ^ (-1310394369);
                        i5 = -414871576;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡᩸") + i3) * 49;
                        i4 = ((iM45029 ^ i2) * 10493) ^ 170944841;
                        i5 = 427621039;
                    }
                    break;
                case -635736355:
                case 240305007:
                    if (C3286.m9798() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12443) ^ (-1110580993);
                        i5 = -1979465237;
                    } else {
                        iM45029 = C19806.m45029("ۘۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 20927) ^ 2035498002;
                        i5 = -640740999;
                    }
                    break;
                case -561536809:
                case 1812766276:
                    if (RunnableC1564.f6300) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܽۧ")) * 79;
                        i4 = ((iM45029 ^ i3) * 4569) ^ (-1526634737);
                        i5 = -817223473;
                    } else {
                        iM45029 = (C19806.m45029("᩻ۜ") + i2) * (-21);
                        i4 = ((iM45029 ^ i3) * 26019) ^ (-1221135937);
                        i5 = -744404570;
                    }
                    break;
                case -522947028:
                case 1272228:
                    if (RunnableC0195.m1431()) {
                        iM45029 = C19806.m45029("᩻ۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-1741)) ^ (-1622849340);
                        i5 = -833955374;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡᩸") + i3) * 49;
                        i4 = ((iM45029 ^ i2) * 10493) ^ 170944841;
                        i5 = 427621039;
                    }
                    break;
                case 1277874:
                case 1238833967:
                    this.f22250 = c17381;
                    if (C2871.m8646()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ᩹") ^ i3) * (-37);
                        i4 = ((iM45029 ^ i2) * 197) ^ 1152304409;
                        i5 = 1638070350;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܽۧ")) * 79;
                        i4 = ((iM45029 ^ i3) * 4569) ^ (-1526634737);
                        i5 = -817223473;
                    }
                    break;
                case 1436276168:
                case 1691148295:
                    if (C1398.m4895() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12443) ^ (-1110580993);
                        i5 = -1979465237;
                    } else {
                        iM45029 = (C19806.m45029("ۜۡ") ^ i3) * 77;
                        i4 = ((iM45029 ^ i2) * 567) ^ (-262729034);
                        i5 = 2116151689;
                    }
                    break;
                default:
                    this.f22238 = 8388613;
                    break;
            }
            return;
        }
    }

    @Override // android.widget.AbsListView
    public final void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.f22231 = onScrollListener;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x04b6 A[PHI: r3 r20
      0x04b6: PHI (r3v71 int) = (r3v45 int), (r3v48 int), (r3v72 int) binds: [B:127:0x04b4, B:106:0x03e3, B:21:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x04b6: PHI (r20v50 float) = (r20v26 float), (r20v29 float), (r20v51 float) binds: [B:127:0x04b4, B:106:0x03e3, B:21:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01b1 A[PHI: r11 r12 r13 r14
      0x01b1: PHI (r11v3 float) = (r11v2 float), (r11v2 float), (r11v4 float) binds: [B:52:0x0196, B:36:0x00f4, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01b1: PHI (r12v3 float) = (r12v2 float), (r12v2 float), (r12v4 float) binds: [B:52:0x0196, B:36:0x00f4, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01b1: PHI (r13v4 float) = (r13v3 float), (r13v2 float), (r13v2 float) binds: [B:52:0x0196, B:36:0x00f4, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01b1: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:52:0x0196, B:36:0x00f4, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0237 A[PHI: r5 r7 r8 r10
      0x0237: PHI (r5v10 float) = (r5v2 float), (r5v2 float), (r5v9 float), (r5v2 float) binds: [B:66:0x0235, B:58:0x01e3, B:40:0x0116, B:13:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r7v4 float) = (r7v3 float), (r7v2 float), (r7v2 float), (r7v2 float) binds: [B:66:0x0235, B:58:0x01e3, B:40:0x0116, B:13:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r8v4 float) = (r8v3 float), (r8v2 float), (r8v2 float), (r8v2 float) binds: [B:66:0x0235, B:58:0x01e3, B:40:0x0116, B:13:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r10v4 float) = (r10v2 float), (r10v3 float), (r10v2 float), (r10v2 float) binds: [B:66:0x0235, B:58:0x01e3, B:40:0x0116, B:13:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.AbsListView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iM11306;
        int i;
        int i2;
        int iM11307;
        int i3;
        float f;
        int i4;
        int iM11308;
        int i5;
        int i6;
        float f2;
        int i7 = C0050.f912;
        int i8 = C3722.f13525;
        int iM45029 = C19806.m45029("۬ۢ") ^ i8;
        int i9 = ((iM45029 ^ i7) * (-12177)) ^ 1623434330;
        C22398 c22398 = null;
        C17381 c17381 = null;
        int i10 = iM45029 ^ (-1024974981);
        boolean z = false;
        float f3 = 0.0f;
        boolean z2 = false;
        float x = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float y = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        int i11 = 0;
        float y2 = 0.0f;
        int i12 = 2020716250;
        int actionMasked = 0;
        while (true) {
            i12 = i10 ^ (i9 & (((i12 ^ i7) * 12071) >> 31));
            switch (i12) {
                case -2067977273:
                case -685006520:
                    if (C2788.f10625 >= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("᩸ܺ") ^ i7;
                        i = ((iM11307 ^ i8) * 32507) ^ 301234366;
                        i3 = 120393420;
                        i10 = iM11307 ^ i3;
                        i9 = i;
                    } else {
                        f = f3;
                        i4 = actionMasked;
                        iM11308 = ThreadFactoryC3888.m11306("ۖܺ") ^ i8;
                        i5 = ((iM11308 ^ i7) * (-5805)) ^ (-2135704980);
                        i6 = 1128015410;
                        int i13 = iM11308 ^ i6;
                        actionMasked = i4;
                        f2 = f;
                        i10 = i13;
                        i9 = i5;
                        f3 = f2;
                    }
                    break;
                case -2056900737:
                case -2027365572:
                    this.f22254 = f3;
                    if (C1419.f5860 >= 0) {
                        iM11307 = C19806.m45029("᩹ۤ") ^ i8;
                        i = ((iM11307 ^ i7) * (-5097)) ^ (-39109609);
                        i3 = 1655335213;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ܰۤ") ^ i7;
                        i = ((iM11307 ^ i8) * 18259) ^ 880924697;
                        i3 = 570907503;
                    }
                    i10 = iM11307 ^ i3;
                    i9 = i;
                    break;
                case -2016748502:
                case 2070266981:
                    RunnableC1895.m6170();
                    C1025.m3861();
                    f = f3;
                    i4 = actionMasked;
                    iM11308 = ThreadFactoryC3888.m11306("ۙۚ") ^ i8;
                    i5 = ((iM11308 ^ i7) * 24679) ^ 1679510699;
                    i6 = -129634907;
                    int i14 = iM11308 ^ i6;
                    actionMasked = i4;
                    f2 = f;
                    i10 = i14;
                    i9 = i5;
                    f3 = f2;
                    break;
                case -1961715541:
                case 798987120:
                    f = f3;
                    i4 = actionMasked;
                    this.f22244 = z;
                    iM11308 = (i8 - ThreadFactoryC3888.m11306("ᩴ᩻")) * 43;
                    i5 = ((iM11308 ^ i7) * 21965) ^ 273897011;
                    i6 = 379277889;
                    int i15 = iM11308 ^ i6;
                    actionMasked = i4;
                    f2 = f;
                    i10 = i15;
                    i9 = i5;
                    f3 = f2;
                    break;
                case -1944977524:
                case -1576637177:
                    f = f3;
                    float f9 = y2;
                    i4 = actionMasked;
                    this.f22243 = f9;
                    if (c22398.m49671(this.f22249, f9)) {
                        int iM450210 = C19806.m45029("᩹ۛ") ^ i8;
                        y2 = f9;
                        i9 = ((iM450210 ^ i7) * (-15359)) ^ (-96107152);
                        actionMasked = i4;
                        f2 = f;
                        i10 = iM450210 ^ 647282059;
                    } else {
                        y2 = f9;
                        iM11308 = (i8 - ThreadFactoryC3888.m11306("ᩴ᩻")) * 43;
                        i5 = ((iM11308 ^ i7) * 21965) ^ 273897011;
                        i6 = 379277889;
                        int i16 = iM11308 ^ i6;
                        actionMasked = i4;
                        f2 = f;
                        i10 = i16;
                        i9 = i5;
                    }
                    f3 = f2;
                    break;
                case -1941935639:
                case 1564369584:
                    return super.onInterceptTouchEvent(motionEvent);
                case -1918964560:
                case -221175927:
                    f8 = (f6 * f6) + f7;
                    i11 = this.f22256;
                    if (RunnableC3388.f12514 >= 0) {
                        iM11307 = C19806.m45029("᩹ۤ") ^ i8;
                        i = ((iM11307 ^ i7) * (-5097)) ^ (-39109609);
                        i3 = 1655335213;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ۡ۬") ^ i8) * 81;
                        i = ((iM11307 ^ i7) * (-18989)) ^ (-621946510);
                        i3 = -247488093;
                    }
                    i10 = iM11307 ^ i3;
                    i9 = i;
                    break;
                case -1869736875:
                case -777020516:
                    f = f3;
                    i4 = actionMasked;
                    if (m17923()) {
                        iM11308 = C19806.m45029("ۡ᩷") ^ i8;
                        i5 = ((iM11308 ^ i7) * (-7789)) ^ 1349467904;
                        i6 = -666743649;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("ۧܺ") ^ i7) * 29;
                        i5 = ((iM11308 ^ i8) * 28391) ^ (-631941734);
                        i6 = -529839203;
                    }
                    int i17 = iM11308 ^ i6;
                    actionMasked = i4;
                    f2 = f;
                    i10 = i17;
                    i9 = i5;
                    f3 = f2;
                    break;
                case -1704727326:
                case 1150049139:
                    return z;
                case -1657940011:
                case 1825136843:
                    if (C0278.f1572 > 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ۡܽ") ^ i7;
                        i = ((iM11307 ^ i8) * (-29323)) ^ 1742057478;
                        i3 = -929599912;
                        i10 = iM11307 ^ i3;
                        i9 = i;
                    } else {
                        f = f3;
                        i4 = actionMasked;
                        iM11308 = ThreadFactoryC3888.m11306("ۙۚ") ^ i8;
                        i5 = ((iM11308 ^ i7) * 24679) ^ 1679510699;
                        i6 = -129634907;
                        int i18 = iM11308 ^ i6;
                        actionMasked = i4;
                        f2 = f;
                        i10 = i18;
                        i9 = i5;
                        f3 = f2;
                    }
                    break;
                case -1245425315:
                case -583335586:
                    AbstractC0464.m2313();
                    C2788.m8472();
                    return false;
                case -1124827328:
                case 1916092307:
                    f = f3;
                    i4 = actionMasked;
                    this.f22249 = motionEvent.getX();
                    if (C1937.f7317 >= 0) {
                        iM11308 = ThreadFactoryC3888.m11306("ۖܺ") ^ i8;
                        i5 = ((iM11308 ^ i7) * (-5805)) ^ (-2135704980);
                        i6 = 1128015410;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("ۛۘ") ^ i8;
                        i5 = ((iM11308 ^ i7) * (-23279)) ^ 157785173;
                        i6 = -162011131;
                    }
                    int i19 = iM11308 ^ i6;
                    actionMasked = i4;
                    f2 = f;
                    i10 = i19;
                    i9 = i5;
                    f3 = f2;
                    break;
                case -1119661186:
                case -1025167752:
                    i4 = actionMasked;
                    if (this.f22244) {
                        iM11308 = (C19806.m45029("ۨᩳ") ^ i8) * (-5);
                        f = f3;
                        i5 = ((iM11308 ^ i7) * (-4627)) ^ (-1676750846);
                        i6 = 146837066;
                    } else {
                        f = f3;
                        iM11308 = (i8 - ThreadFactoryC3888.m11306("ᩴ᩻")) * 43;
                        i5 = ((iM11308 ^ i7) * 21965) ^ 273897011;
                        i6 = 379277889;
                    }
                    int i110 = iM11308 ^ i6;
                    actionMasked = i4;
                    f2 = f;
                    i10 = i110;
                    i9 = i5;
                    f3 = f2;
                    break;
                case -1067587595:
                case 995920045:
                    i4 = actionMasked;
                    if (i4 == 3) {
                        f = f3;
                        iM11308 = C19806.m45029("ۤۛ") ^ i7;
                        i5 = ((iM11308 ^ i8) * (-17451)) ^ 1684587489;
                        i6 = -1591167810;
                        int i111 = iM11308 ^ i6;
                        actionMasked = i4;
                        f2 = f;
                        i10 = i111;
                        i9 = i5;
                        f3 = f2;
                    }
                    f = f3;
                    iM11308 = (i8 - ThreadFactoryC3888.m11306("ᩴ᩻")) * 43;
                    i5 = ((iM11308 ^ i7) * 21965) ^ 273897011;
                    i6 = 379277889;
                    int i112 = iM11308 ^ i6;
                    actionMasked = i4;
                    f2 = f;
                    i10 = i112;
                    i9 = i5;
                    f3 = f2;
                    break;
                case -995101349:
                case -347931062:
                    y = motionEvent.getY();
                    if (RunnableC3388.f12514 >= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("᩵ۗ") ^ i8;
                        i = ((iM11307 ^ i7) * 8427) ^ 1474947639;
                        i3 = -1202660595;
                    } else {
                        iM11307 = (i8 - ThreadFactoryC3888.m11306("ۧܰ")) * 31;
                        i = ((iM11307 ^ i7) * 14323) ^ (-1330178393);
                        i3 = -167378553;
                    }
                    i10 = iM11307 ^ i3;
                    i9 = i;
                    break;
                case -968443575:
                case 343932481:
                    f = f3;
                    i4 = actionMasked;
                    z = true;
                    z = true;
                    if (this.f22252) {
                        iM11308 = C19806.m45029("۠ܰ") ^ i7;
                        i5 = ((iM11308 ^ i8) * (-29937)) ^ 1296498870;
                        i6 = 145104576;
                    } else {
                        iM11308 = (i8 - C19806.m45029("ۘ᩸")) * 99;
                        i5 = ((iM11308 ^ i7) * 6729) ^ (-2082927108);
                        i6 = -268614341;
                    }
                    int i113 = iM11308 ^ i6;
                    actionMasked = i4;
                    f2 = f;
                    i10 = i113;
                    i9 = i5;
                    f3 = f2;
                    break;
                case -910769193:
                case 777022826:
                    C3535.m10431();
                    if (C0278.f1572 > 0) {
                        iM11307 = ThreadFactoryC3888.m11306("᩸ܺ") ^ i7;
                        i = ((iM11307 ^ i8) * 32507) ^ 301234366;
                        i3 = 120393420;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("᩵ۗ") ^ i8;
                        i = ((iM11307 ^ i7) * 8427) ^ 1474947639;
                        i3 = -1202660595;
                    }
                    i10 = iM11307 ^ i3;
                    i9 = i;
                    break;
                case -773125451:
                case 559235924:
                    f = f3;
                    i4 = actionMasked;
                    if (i4 != 2) {
                        iM11308 = (ThreadFactoryC3888.m11306("ۨۜ") + i7) * 31;
                        i5 = ((iM11308 ^ i8) * 17405) ^ 244154335;
                        i6 = -115440644;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("ۛ᩶") ^ i7;
                        i5 = ((iM11308 ^ i8) * 23195) ^ 459347056;
                        i6 = -1899013792;
                    }
                    int i114 = iM11308 ^ i6;
                    actionMasked = i4;
                    f2 = f;
                    i10 = i114;
                    i9 = i5;
                    f3 = f2;
                    break;
                case -752286590:
                case 581937011:
                    f = f3;
                    i4 = actionMasked;
                    y2 = motionEvent.getY();
                    if (C1460.f5948 >= 0) {
                        iM11308 = ThreadFactoryC3888.m11306("ۙۚ") ^ i8;
                        i5 = ((iM11308 ^ i7) * 24679) ^ 1679510699;
                        i6 = -129634907;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("ۜܶ") ^ i7) * 25;
                        i5 = ((iM11308 ^ i8) * 18341) ^ 126070748;
                        i6 = -63862755;
                    }
                    int i115 = iM11308 ^ i6;
                    actionMasked = i4;
                    f2 = f;
                    i10 = i115;
                    i9 = i5;
                    f3 = f2;
                    break;
                case -572234090:
                case 1848452920:
                    ThreadFactoryC3888.m11314(this);
                    getParent().requestDisallowInterceptTouchEvent(z);
                    return z;
                case -490272868:
                case -406116490:
                    this.f22244 = z2;
                    this.f22252 = z;
                    m17928(motionEvent);
                    c17381 = this.f22250;
                    if (c17381 != null) {
                        iM11307 = (C19806.m45029("֡ܶ") + i8) * (-25);
                        i = ((iM11307 ^ i7) * (-32169)) ^ 1994289193;
                        i3 = 726513761;
                    } else {
                        iM11307 = C19806.m45029("᩷᩻") ^ i8;
                        i = ((iM11307 ^ i7) * (-31203)) ^ 1982339245;
                        i3 = 2036076094;
                    }
                    i10 = iM11307 ^ i3;
                    i9 = i;
                    break;
                case -409537065:
                case 1386905292:
                    f = f3;
                    i4 = actionMasked;
                    if (C2704.m8255() <= 0) {
                        iM11308 = ThreadFactoryC3888.m11306("ۖܺ") ^ i8;
                        i5 = ((iM11308 ^ i7) * (-5805)) ^ (-2135704980);
                        i6 = 1128015410;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("֨ۤ") ^ i7) * (-91);
                        i5 = ((iM11308 ^ i8) * 25621) ^ 671473917;
                        i6 = 726024946;
                    }
                    int i116 = iM11308 ^ i6;
                    actionMasked = i4;
                    f2 = f;
                    i10 = i116;
                    i9 = i5;
                    f3 = f2;
                    break;
                case -366805010:
                case -46361357:
                    float f10 = f3;
                    actionMasked = motionEvent.getActionMasked();
                    c22398 = this.f22236;
                    if (actionMasked != 0) {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("ᩴܽ")) * (-45);
                        i = ((iM11306 ^ i8) * (-4595)) ^ (-424399063);
                        i2 = -1911373195;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨᩶") ^ i8) * (-17);
                        i = ((iM11306 ^ i7) * 20071) ^ (-1858281446);
                        i2 = -257679553;
                    }
                    int i20 = iM11306 ^ i2;
                    f3 = f10;
                    i10 = i20;
                    i9 = i;
                    break;
                case -364053813:
                case 1279694113:
                    x = motionEvent.getX();
                    f4 = this.f22249;
                    if (C0629.f2722 <= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("᩵ۗ") ^ i8;
                        i = ((iM11307 ^ i7) * 8427) ^ 1474947639;
                        i3 = -1202660595;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۤۧ") ^ i7;
                        i = ((iM11307 ^ i8) * (-3851)) ^ (-1193096019);
                        i3 = 1392346504;
                    }
                    i10 = iM11307 ^ i3;
                    i9 = i;
                    break;
                case -318574294:
                case 1763583533:
                    f = f3;
                    i4 = actionMasked;
                    this.f22244 = z2;
                    iM11308 = (i8 - ThreadFactoryC3888.m11306("ᩴ᩻")) * 43;
                    i5 = ((iM11308 ^ i7) * 21965) ^ 273897011;
                    i6 = 379277889;
                    int i117 = iM11308 ^ i6;
                    actionMasked = i4;
                    f2 = f;
                    i10 = i117;
                    i9 = i5;
                    f3 = f2;
                    break;
                case 65647059:
                case 462681368:
                    f = f3;
                    i4 = actionMasked;
                    if (c22398.m49672(this.f22249, this.f22243)) {
                        iM11308 = (C19806.m45029("ܳۖ") + i8) * (-93);
                        i5 = ((iM11308 ^ i7) * (-19473)) ^ 606742613;
                        i6 = 1442693338;
                    } else {
                        iM11308 = (i8 - C19806.m45029("᩷ܰ")) * (-79);
                        i5 = ((iM11308 ^ i7) * 14085) ^ (-1508204671);
                        i6 = 1083421825;
                    }
                    int i118 = iM11308 ^ i6;
                    actionMasked = i4;
                    f2 = f;
                    i10 = i118;
                    i9 = i5;
                    f3 = f2;
                    break;
                case 319200411:
                case 397614102:
                    f = f3;
                    i4 = actionMasked;
                    z2 = false;
                    if (i4 != z) {
                        iM11308 = ThreadFactoryC3888.m11306("᩻֨") ^ i7;
                        i5 = ((iM11308 ^ i8) * 63) ^ 473158061;
                        i6 = 1836900410;
                    } else {
                        iM11308 = C19806.m45029("ۤۛ") ^ i7;
                        i5 = ((iM11308 ^ i8) * (-17451)) ^ 1684587489;
                        i6 = -1591167810;
                    }
                    int i119 = iM11308 ^ i6;
                    actionMasked = i4;
                    f2 = f;
                    i10 = i119;
                    i9 = i5;
                    f3 = f2;
                    break;
                case 517456104:
                case 546512967:
                    f5 = x - f4;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ܶ᩶") ^ i7;
                        i = ((iM11307 ^ i8) * 19353) ^ 1421611358;
                        i3 = 927967110;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ᩴ֫") ^ i8;
                        i = ((iM11307 ^ i7) * 18807) ^ (-570164717);
                        i3 = -506266826;
                    }
                    i10 = iM11307 ^ i3;
                    i9 = i;
                    break;
                case 626054037:
                case 1205298556:
                    RunnableC3388.m10064();
                    if (!RunnableC3388.m10064()) {
                        f = f3;
                        i4 = actionMasked;
                        iM11308 = ThreadFactoryC3888.m11306("ۙۚ") ^ i8;
                        i5 = ((iM11308 ^ i7) * 24679) ^ 1679510699;
                        i6 = -129634907;
                        int i1110 = iM11308 ^ i6;
                        actionMasked = i4;
                        f2 = f;
                        i10 = i1110;
                        i9 = i5;
                        f3 = f2;
                    } else {
                        iM11307 = C19806.m45029("᩵ᩴ") ^ i7;
                        i = ((iM11307 ^ i8) * (-10035)) ^ 1201822291;
                        i3 = 1652144662;
                        i10 = iM11307 ^ i3;
                        i9 = i;
                    }
                    break;
                case 667044004:
                case 1545697024:
                    f3 = c22398.f73107 - this.f22243;
                    if (C2249.f8050 >= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("᩵ۗ") ^ i8;
                        i = ((iM11307 ^ i7) * 8427) ^ 1474947639;
                        i3 = -1202660595;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ۘ᩵") + i7) * (-47);
                        i = ((iM11307 ^ i8) * (-30409)) ^ (-830076395);
                        i3 = -2123898881;
                    }
                    i10 = iM11307 ^ i3;
                    i9 = i;
                    break;
                case 712701462:
                case 739706594:
                    if (f8 <= i11 * i11) {
                        f = f3;
                        i4 = actionMasked;
                        iM11308 = (i8 - ThreadFactoryC3888.m11306("ᩴ᩻")) * 43;
                        i5 = ((iM11308 ^ i7) * 21965) ^ 273897011;
                        i6 = 379277889;
                        int i1111 = iM11308 ^ i6;
                        actionMasked = i4;
                        f2 = f;
                        i10 = i1111;
                        i9 = i5;
                        f3 = f2;
                    } else {
                        iM11307 = C19806.m45029("ܳ᩸") ^ i7;
                        i = ((iM11307 ^ i8) * 29147) ^ 1356787358;
                        i3 = -1411299536;
                        i10 = iM11307 ^ i3;
                        i9 = i;
                    }
                    break;
                case 765175633:
                case 1084391437:
                    return super.onInterceptTouchEvent(motionEvent);
                case 892331629:
                case 1001100628:
                    m17918(motionEvent);
                    this.f22239 = z;
                    return z;
                case 1044464458:
                case 1258597613:
                    if (!RunnableC1564.f6300) {
                        iM11307 = ThreadFactoryC3888.m11306("ܶ᩶") ^ i7;
                        i = ((iM11307 ^ i8) * 19353) ^ 1421611358;
                        i3 = 927967110;
                        i10 = iM11307 ^ i3;
                        i9 = i;
                    } else {
                        f = f3;
                        i4 = actionMasked;
                        iM11308 = ThreadFactoryC3888.m11306("ۖܺ") ^ i8;
                        i5 = ((iM11308 ^ i7) * (-5805)) ^ (-2135704980);
                        i6 = 1128015410;
                        int i1112 = iM11308 ^ i6;
                        actionMasked = i4;
                        f2 = f;
                        i10 = i1112;
                        i9 = i5;
                        f3 = f2;
                    }
                    break;
                case 1126738631:
                case 2111272296:
                    c17381.m40478(z ? 1 : 0, this.f22238);
                    iM11307 = C19806.m45029("᩷᩻") ^ i8;
                    i = ((iM11307 ^ i7) * (-31203)) ^ 1982339245;
                    i3 = 2036076094;
                    i10 = iM11307 ^ i3;
                    i9 = i;
                    break;
                case 1715653324:
                case 1764568519:
                    if (C1189.f5284 <= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ܶ᩶") ^ i7;
                        i = ((iM11307 ^ i8) * 19353) ^ 1421611358;
                        i3 = 927967110;
                        i10 = iM11307 ^ i3;
                        i9 = i;
                    } else {
                        f = f3;
                        i4 = actionMasked;
                        iM11308 = ThreadFactoryC3888.m11306("ۙۚ") ^ i8;
                        i5 = ((iM11308 ^ i7) * 24679) ^ 1679510699;
                        i6 = -129634907;
                        int i1113 = iM11308 ^ i6;
                        actionMasked = i4;
                        f2 = f;
                        i10 = i1113;
                        i9 = i5;
                        f3 = f2;
                    }
                    break;
                default:
                    f6 = y - this.f22243;
                    f7 = f5 * f5;
                    if (C0278.m1789() <= 0) {
                        iM11307 = C19806.m45029("᩹ۤ") ^ i8;
                        i = ((iM11307 ^ i7) * (-5097)) ^ (-39109609);
                        i3 = 1655335213;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("۬᩵") ^ i7;
                        i = ((iM11307 ^ i8) * 16035) ^ 9029801;
                        i3 = -1045134246;
                    }
                    i10 = iM11307 ^ i3;
                    i9 = i;
                    break;
            }
        }
    }

    @Override // android.view.View
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f22248 = onTouchListener;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17932(View.OnTouchListener onTouchListener) {
        ArrayList arrayList = null;
        int i = 1422313256;
        int i2 = C1066.f4915;
        int i3 = AbstractC0464.f2088;
        int iM11306 = ThreadFactoryC3888.m11306("ۘۧ") ^ i2;
        int i4 = ((iM11306 ^ i3) * (-6817)) ^ 1743612985;
        int i5 = -974481371;
        while (true) {
            i = ((((i ^ i3) * 29619) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1604949436:
                case 1133925511:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = C19806.m45029("ۖ۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14421)) ^ 1053520103;
                        i5 = 240239315;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-19237)) ^ (-897435448);
                        i5 = 1986814589;
                    }
                    break;
                case -1602745922:
                case 1680499647:
                    if (C3660.f13403 >= 0) {
                        iM11306 = (i2 - C19806.m45029("ۜۘ")) * 61;
                        i4 = ((iM11306 ^ i3) * 27189) ^ 188681630;
                        i5 = -86403916;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ܰ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 15185) ^ 903831614;
                        i5 = 797243966;
                    }
                    break;
                case -1287405401:
                case 1245187937:
                    if (C1461.m5080()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚܿ") + i2) * (-55);
                        i4 = ((iM11306 ^ i3) * (-31795)) ^ (-573740796);
                        i5 = 671262292;
                    } else {
                        iM11306 = C19806.m45029("ۘ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-6237)) ^ 680961777;
                        i5 = 307511866;
                    }
                    break;
                case -1094143760:
                case 1446227746:
                    C0216.m1591();
                    C0962.m3746();
                    iM11306 = (i2 - C19806.m45029("ۜۘ")) * 61;
                    i4 = ((iM11306 ^ i3) * 27189) ^ 188681630;
                    i5 = -86403916;
                    break;
                case -948435426:
                case 313795505:
                    C0962.m3746();
                    RunnableC3388.m10064();
                    break;
                case -852938921:
                case 1245064397:
                    if (C1461.f5957 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸۠") ^ i3;
                        i4 = ((iM11306 ^ i2) * 4605) ^ (-1219199666);
                        i5 = 992909881;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۤᩴ")) * 5;
                        i4 = ((iM11306 ^ i3) * 6555) ^ (-1603626781);
                        i5 = 698890844;
                    }
                    break;
                case -721410934:
                case -467152510:
                    if (this.f22251 == null) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ۙ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 23321) ^ (-130874775);
                        i5 = 1378066283;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 25753) ^ (-715331185);
                        i5 = 899883482;
                    }
                    break;
                case -471102608:
                case 836237038:
                    C1875.m6086();
                    if (!C0797.m3359()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚܿ") + i2) * (-55);
                        i4 = ((iM11306 ^ i3) * (-31795)) ^ (-573740796);
                        i5 = 671262292;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸۠") ^ i3;
                        i4 = ((iM11306 ^ i2) * 4605) ^ (-1219199666);
                        i5 = 992909881;
                    }
                    break;
                case -213843382:
                case -27619135:
                    if (C2332.m7079() <= 0) {
                        iM11306 = C19806.m45029("ۖ۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14421)) ^ 1053520103;
                        i5 = 240239315;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۢ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-13559)) ^ 1226357084;
                        i5 = 1164108631;
                    }
                    break;
                case -156320661:
                case 511525116:
                    if (C1875.f7103 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸۠") ^ i3;
                        i4 = ((iM11306 ^ i2) * 4605) ^ (-1219199666);
                        i5 = 992909881;
                    } else {
                        iM11306 = C19806.m45029("۠ۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-3353)) ^ (-1495620036);
                        i5 = -1506214882;
                    }
                    break;
                case -81991085:
                case 772664895:
                    if (CallableC1627.m5507() != 0) {
                        iM11306 = C19806.m45029("ۖ۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14421)) ^ 1053520103;
                        i5 = 240239315;
                    } else {
                        iM11306 = C19806.m45029("ۙܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-3769)) ^ (-899832756);
                        i5 = -1827516799;
                    }
                    break;
                case 135793061:
                case 1666127478:
                    if (C0216.f1393 == 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚܿ") + i2) * (-55);
                        i4 = ((iM11306 ^ i3) * (-31795)) ^ (-573740796);
                        i5 = 671262292;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۜۘ")) * 61;
                        i4 = ((iM11306 ^ i3) * 27189) ^ 188681630;
                        i5 = -86403916;
                    }
                    break;
                case 150910906:
                case 1344025200:
                    C3660.m10788(this.f22251, onTouchListener);
                    break;
                case 172102604:
                case 652390916:
                    arrayList = new ArrayList();
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸۠") ^ i3;
                        i4 = ((iM11306 ^ i2) * 4605) ^ (-1219199666);
                        i5 = 992909881;
                    } else {
                        iM11306 = (i2 - C19806.m45029("۠ܽ")) * 101;
                        i4 = ((iM11306 ^ i3) * 2081) ^ (-44847430);
                        i5 = -1310013253;
                    }
                    break;
                case 207703743:
                case 1895775719:
                    if (C2642.m8171() == 0) {
                        iM11306 = C19806.m45029("ۖ۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14421)) ^ 1053520103;
                        i5 = 240239315;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۜۘ")) * 61;
                        i4 = ((iM11306 ^ i3) * 27189) ^ 188681630;
                        i5 = -86403916;
                    }
                    break;
                case 353924054:
                case 458130219:
                    super.setOnTouchListener(new View.OnTouchListener() { // from class: l.ۚۜ᩺
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            return C6606.m17921(this.f18011, view, motionEvent);
                        }
                    });
                    iM11306 = ThreadFactoryC3888.m11306("ᩳۗ") ^ i2;
                    i4 = ((iM11306 ^ i3) * 25753) ^ (-715331185);
                    i5 = 899883482;
                    break;
                case 551451651:
                case 1202280532:
                    if (C1461.m5080()) {
                        iM11306 = (i2 - C19806.m45029("ۜۘ")) * 61;
                        i4 = ((iM11306 ^ i3) * 27189) ^ 188681630;
                        i5 = -86403916;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺ᩸") + i3) * (-67);
                        i4 = ((iM11306 ^ i2) * 9725) ^ (-1403243070);
                        i5 = -1178410386;
                    }
                    break;
                default:
                    this.f22251 = arrayList;
                    if (C2642.m8171() != 0) {
                        iM11306 = C19806.m45029("ܶ᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * 7743) ^ (-1689835608);
                        i5 = 1416308099;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۚ") + i3) * 5;
                        i4 = ((iM11306 ^ i2) * (-1675)) ^ (-2135738019);
                        i5 = -1393977960;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m17921(C6606 c6606, View view, MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = null;
        Iterator itM9863 = null;
        int i = 1386661125;
        int i2 = C3577.f13150;
        int i3 = C3535.f13026;
        int iM11306 = (i3 - ThreadFactoryC3888.m11306("֫ۢ")) * (-31);
        int i4 = ((iM11306 ^ i2) * 13713) ^ (-669650964);
        int i5 = -343917204;
        while (true) {
            i = ((((i ^ i2) * (-4873)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2085180324:
                case -96269231:
                    if (((View.OnTouchListener) C0278.m1776(itM9863)).onTouch(view, motionEvent)) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ᩴ۬")) * (-55);
                        i4 = ((iM11306 ^ i3) * 20323) ^ 684059494;
                        i5 = -908060736;
                    } else {
                        iM11306 = (C19806.m45029("۠ۖ") + i3) * (-5);
                        i4 = ((iM11306 ^ i2) * 28557) ^ (-969605321);
                        i5 = 252769284;
                    }
                    break;
                case -2044980348:
                case -588211853:
                    if (C3577.f13150 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-16221)) ^ 906216360;
                        i5 = -935074690;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("۬ܽ")) * 93;
                        i4 = ((iM11306 ^ i3) * (-4277)) ^ 867697948;
                        i5 = 1260423405;
                    }
                    break;
                case -2005997084:
                case 723046147:
                    if (C7105.f23796 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ܰ") + i2) * (-109);
                        i4 = ((iM11306 ^ i3) * (-15947)) ^ (-1640728501);
                        i5 = 1443393260;
                    } else {
                        iM11306 = C19806.m45029("ܽܶ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-30299)) ^ (-958624891);
                        i5 = 458845557;
                    }
                    break;
                case -1720257848:
                case 1127371783:
                    C2332.m7079();
                    if (C1066.m4023() > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖ֨") ^ i3) * 47;
                        i4 = ((iM11306 ^ i2) * (-14669)) ^ (-2086400440);
                        i5 = -1480993177;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-16221)) ^ 906216360;
                        i5 = -935074690;
                    }
                    break;
                case -1621903784:
                case 533033277:
                    C1398.m4895();
                    return false;
                case -1583081161:
                case 53031741:
                    if (C3722.m10894() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖ֨") ^ i3) * 47;
                        i4 = ((iM11306 ^ i2) * (-14669)) ^ (-2086400440);
                        i5 = -1480993177;
                    } else {
                        iM11306 = C19806.m45029("᩶ܿ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14215)) ^ (-995713779);
                        i5 = -1098117935;
                    }
                    break;
                case -1412654304:
                case 848951302:
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ܰ") + i2) * (-109);
                        i4 = ((iM11306 ^ i3) * (-15947)) ^ (-1640728501);
                        i5 = 1443393260;
                    } else {
                        iM11306 = C19806.m45029("᩺֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * 7231) ^ (-818219351);
                        i5 = -2095866110;
                    }
                    break;
                case -1391580436:
                case 1403632456:
                    if (C1460.f5948 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ܰ") + i2) * (-109);
                        i4 = ((iM11306 ^ i3) * (-15947)) ^ (-1640728501);
                        i5 = 1443393260;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ܺۘ")) * 39;
                        i4 = ((iM11306 ^ i3) * (-10969)) ^ (-994407204);
                        i5 = 1692175953;
                    }
                    break;
                case -1383028709:
                case 72758395:
                    if (C1937.f7317 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-16221)) ^ 906216360;
                        i5 = -935074690;
                    } else {
                        iM11306 = C19806.m45029("֫ۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14797)) ^ 1748244412;
                        i5 = -1061995320;
                    }
                    break;
                case -943815652:
                case 2002783191:
                    if (C1025.f4800 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ܰ") + i2) * (-109);
                        i4 = ((iM11306 ^ i3) * (-15947)) ^ (-1640728501);
                        i5 = 1443393260;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ܺ۬")) * (-73);
                        i4 = ((iM11306 ^ i2) * 19901) ^ 1619133756;
                        i5 = -84341405;
                    }
                    break;
                case -512816313:
                case 911373399:
                    if (C7105.m18985()) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ܰ") + i2) * (-109);
                        i4 = ((iM11306 ^ i3) * (-15947)) ^ (-1640728501);
                        i5 = 1443393260;
                    } else {
                        iM11306 = C19806.m45029("᩸ܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-3391)) ^ 150300475;
                        i5 = -977253548;
                    }
                    break;
                case -465094463:
                case 1545986903:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖ֨") ^ i3) * 47;
                        i4 = ((iM11306 ^ i2) * (-14669)) ^ (-2086400440);
                        i5 = -1480993177;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-25909)) ^ (-1251270106);
                        i5 = -198411661;
                    }
                    break;
                case -112077838:
                case 1884716020:
                    return false;
                case 89544135:
                case 1356755925:
                    onTouchListener.onTouch(view, motionEvent);
                    iM11306 = C19806.m45029("ۖ۬") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-20239)) ^ 913247683;
                    i5 = -338876035;
                    break;
                case 188331281:
                case 2004384947:
                    return true;
                case 255791580:
                case 1039397508:
                    if (C2124.f7782 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺۬") + i2) * 75;
                        i4 = ((iM11306 ^ i3) * 7225) ^ 1272302152;
                        i5 = 1598217996;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-16221)) ^ 906216360;
                        i5 = -935074690;
                    }
                    break;
                case 468216001:
                case 1895870968:
                    itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(c6606.f22251);
                    iM11306 = (C19806.m45029("۠ۖ") + i3) * (-5);
                    i4 = ((iM11306 ^ i2) * 28557) ^ (-969605321);
                    i5 = 252769284;
                    break;
                case 797602707:
                case 1487496272:
                    if (C0962.m3748(itM9863)) {
                        iM11306 = (C19806.m45029("۠ۜ") + i3) * (-49);
                        i4 = ((iM11306 ^ i2) * 19077) ^ 1733230995;
                        i5 = 643616393;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۨܺ")) * (-23);
                        i4 = ((iM11306 ^ i3) * (-7451)) ^ 1179627528;
                        i5 = -286048485;
                    }
                    break;
                case 1153021683:
                case 1636245055:
                    if (C19806.f63586) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-16221)) ^ 906216360;
                        i5 = -935074690;
                    } else {
                        iM11306 = (C19806.m45029("ۤᩴ") + i2) * 41;
                        i4 = ((iM11306 ^ i3) * (-8251)) ^ 1270340062;
                        i5 = -936434970;
                    }
                    break;
                case 1207899403:
                case 1385069070:
                    C2871.m8646();
                    C0216.m1591();
                    iM11306 = C19806.m45029("֫ۚ") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-14797)) ^ 1748244412;
                    i5 = -1061995320;
                    break;
                case 1594766012:
                case 2012506288:
                    if (C1025.f4800 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺۬") + i2) * 75;
                        i4 = ((iM11306 ^ i3) * 7225) ^ 1272302152;
                        i5 = 1598217996;
                    } else {
                        iM11306 = C19806.m45029("ᩴۛ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 14525) ^ 172802473;
                        i5 = 2122924149;
                    }
                    break;
                default:
                    onTouchListener = c6606.f22248;
                    if (onTouchListener != null) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳܿ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-3049)) ^ (-563110478);
                        i5 = 1521832692;
                    } else {
                        iM11306 = C19806.m45029("ۖ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-20239)) ^ 913247683;
                        i5 = -338876035;
                    }
                    break;
            }
        }
    }
}
