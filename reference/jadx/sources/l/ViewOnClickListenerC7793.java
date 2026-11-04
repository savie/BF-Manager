package l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۟ۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC7793 extends AbstractActivityC17204 implements InterfaceC17242, View.OnClickListener {

    /* JADX INFO: renamed from: ۖ᩷, reason: not valid java name and contains not printable characters */
    public static final int[] f25869;

    /* JADX INFO: renamed from: ۡۛᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f25870;

    /* JADX INFO: renamed from: ۡ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f25871 = 0;

    /* JADX INFO: renamed from: ֡᩷, reason: not valid java name and contains not printable characters */
    public C12267 f25872;

    /* JADX INFO: renamed from: ֨᩷, reason: not valid java name and contains not printable characters */
    public C15179 f25873;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public C23255 f25874;

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public C18234 f25875;

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public C7308 f25876;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f25877;

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public boolean f25878;

    /* JADX INFO: renamed from: ۟᩷, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f25879;

    /* JADX INFO: renamed from: ۢ᩷, reason: not valid java name and contains not printable characters */
    public C12267 f25880;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public C20956 f25881;

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f25882;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public int f25883;

    /* JADX INFO: renamed from: ܰ᩷, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f25884;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public int f25885;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public boolean f25886;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f25887;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public boolean f25888;

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public boolean f25889;

    /* JADX INFO: renamed from: ᩳ᩷, reason: not valid java name and contains not printable characters */
    public C0335 f25890;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f25891;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public boolean f25892;

    /* JADX INFO: renamed from: ᩶᩷, reason: not valid java name and contains not printable characters */
    public int f25893;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f25894;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public int f25895;

    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public MenuItem f25896;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f25897;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ void m21200(ViewOnClickListenerC7793 viewOnClickListenerC7793, C9829 c9829, C25227 c25227, AtomicInteger atomicInteger, int i) throws Throwable {
        int i2 = 460606577;
        int i3 = C0773.f2792;
        int i4 = RunnableC3055.f9898;
        int iM2761 = (C0619.m2761("ܶ۫") + i4) * (-19);
        int i5 = ((iM2761 ^ i3) * (-7727)) ^ 833554777;
        int i6 = -1953041659;
        while (true) {
            i2 = ((((i2 ^ i3) * (-25273)) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -2059509652:
                case -1298490129:
                    if (C2023.m6964() <= 0) {
                        iM2761 = (C0773.m3169("ܳ᩷") ^ i3) * (-73);
                        i5 = ((iM2761 ^ i4) * 7095) ^ 551323788;
                        i6 = 1335123248;
                    } else {
                        iM2761 = (C0773.m3169("ܽܰ") + i3) * 27;
                        i5 = ((iM2761 ^ i4) * 10217) ^ (-698162820);
                        i6 = 1309998048;
                    }
                    break;
                case -2034353199:
                case 1431438389:
                    if (C1321.m4852()) {
                        iM2761 = C0773.m3169("᩷ۨ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-2563)) ^ (-2108240921);
                        i6 = 1035127300;
                    } else {
                        iM2761 = (C0773.m3169("ܳ᩷") ^ i3) * (-73);
                        i5 = ((iM2761 ^ i4) * 7095) ^ 551323788;
                        i6 = 1335123248;
                    }
                    break;
                case -1934971834:
                case 2075435278:
                    if (C23916.f77426 <= 0) {
                        iM2761 = (C0619.m2761("ܳۧ") ^ i3) * 97;
                        i5 = ((iM2761 ^ i4) * 20977) ^ (-584377680);
                        i6 = 280311034;
                    } else {
                        iM2761 = C0619.m2761("ۘ᩺") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-3345)) ^ (-846890527);
                        i6 = -671578524;
                    }
                    break;
                case -1808768498:
                case 525954683:
                    C2354.m7983();
                    if (C1542.f5343 <= 0) {
                        iM2761 = (i4 - C0773.m3169("ܽᩴ")) * (-107);
                        i5 = ((iM2761 ^ i3) * (-12735)) ^ (-1265013791);
                        i6 = 228497615;
                    } else {
                        iM2761 = C0619.m2761("ܺۙ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 16569) ^ 1810562727;
                        i6 = -975314818;
                    }
                    break;
                case -1804298586:
                case -1436182384:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0619.m2761("ܺۙ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 16569) ^ 1810562727;
                        i6 = -975314818;
                    } else {
                        iM2761 = C0619.m2761("۬ۚ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-17073)) ^ (-1414159348);
                        i6 = -1745908196;
                    }
                    break;
                case -1802502048:
                case 801239333:
                    C1321.m4852();
                    iM2761 = (C0619.m2761("ܳۧ") ^ i3) * 97;
                    i5 = ((iM2761 ^ i4) * 20977) ^ (-584377680);
                    i6 = 280311034;
                    break;
                case -1382509373:
                case 133549877:
                    if (RunnableC3646.m11813() != 0) {
                        iM2761 = (C0619.m2761("ܳۧ") ^ i3) * 97;
                        i5 = ((iM2761 ^ i4) * 20977) ^ (-584377680);
                        i6 = 280311034;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩵֨")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM2761 ^ i4) * 4683) ^ (-1934741124);
                        i6 = -1240215414;
                    }
                    break;
                case -1342004190:
                case 1038393154:
                    if (C2287.f7432 >= 0) {
                        iM2761 = (i4 - C0773.m3169("ܽᩴ")) * (-107);
                        i5 = ((iM2761 ^ i3) * (-12735)) ^ (-1265013791);
                        i6 = 228497615;
                    } else {
                        iM2761 = C0773.m3169("ۖ֨") ^ i4;
                        i5 = ((iM2761 ^ i3) * 3119) ^ (-1315718425);
                        i6 = -303439581;
                    }
                    break;
                case -788160121:
                case 735312766:
                    C3998.m12920();
                    if (C3077.f9998) {
                        iM2761 = (C0773.m3169("᩻ܿ") + i3) * (-9);
                        i5 = ((iM2761 ^ i4) * (-9479)) ^ (-1880670783);
                        i6 = 371890226;
                    } else {
                        iM2761 = (C0619.m2761("ܳۧ") ^ i3) * 97;
                        i5 = ((iM2761 ^ i4) * 20977) ^ (-584377680);
                        i6 = 280311034;
                    }
                    break;
                case -782124706:
                case 2125402471:
                    C0950.m3785();
                    C3099.m10095();
                    break;
                case -676526383:
                case 1888864186:
                    viewOnClickListenerC7793.m21194(c9829, c25227, atomicInteger, i);
                    break;
                case -293978887:
                case 373443823:
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0619.m2761("ܺۙ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 16569) ^ 1810562727;
                        i6 = -975314818;
                    } else {
                        iM2761 = (C0619.m2761("ܳۧ") ^ i3) * 97;
                        i5 = ((iM2761 ^ i4) * 20977) ^ (-584377680);
                        i6 = 280311034;
                    }
                    break;
                case 148831960:
                case 1830579090:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("ܺۙ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 16569) ^ 1810562727;
                        i6 = -975314818;
                    } else {
                        iM2761 = C0619.m2761("ۛܶ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 30137) ^ 356225410;
                        i6 = 667723559;
                    }
                    break;
                case 341734784:
                case 516903221:
                    if (C2354.m7983()) {
                        iM2761 = C0773.m3169("ۧۡ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-3767)) ^ 757101863;
                        i6 = 153748861;
                    } else {
                        iM2761 = (C0773.m3169("ܳ᩷") ^ i3) * (-73);
                        i5 = ((iM2761 ^ i4) * 7095) ^ 551323788;
                        i6 = 1335123248;
                    }
                    break;
                case 585750871:
                case 2113119478:
                    if (C20932.f66974 <= 0) {
                        iM2761 = (i4 - C0773.m3169("ܽᩴ")) * (-107);
                        i5 = ((iM2761 ^ i3) * (-12735)) ^ (-1265013791);
                        i6 = 228497615;
                    } else {
                        iM2761 = (C0619.m2761("᩵᩺") ^ i3) * (-123);
                        i5 = ((iM2761 ^ i4) * 26083) ^ (-1341938517);
                        i6 = 1799972944;
                    }
                    break;
                default:
                    if (C2702.f8586 <= 0) {
                        iM2761 = (i4 - C0773.m3169("ܽᩴ")) * (-107);
                        i5 = ((iM2761 ^ i3) * (-12735)) ^ (-1265013791);
                        i6 = 228497615;
                    } else {
                        iM2761 = (C0619.m2761("᩸᩵") ^ i4) * 29;
                        i5 = ((iM2761 ^ i3) * (-15867)) ^ 609161158;
                        i6 = -1924727699;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private native void m21208(C15945 c15945, C9829 c9829, C9829 c98210);

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = 294072009;
        int i6 = RunnableC0334.f1808;
        int i7 = C1321.f4751;
        int iM2761 = C0619.m2761("᩸᩵") ^ i7;
        int i8 = ((iM2761 ^ i6) * 20765) ^ 1428825588;
        int i9 = 1876024443;
        while (true) {
            i5 = ((((i5 ^ i6) * 24617) >> 31) & i8) ^ (iM2761 ^ i9);
            switch (i5) {
                case -2142512752:
                case 1097069323:
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0619.m2761("֡ܿ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 16093) ^ 892563093;
                        i9 = 1973327004;
                    } else {
                        iM2761 = C0773.m3169("ۙۧ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 4679) ^ (-703434793);
                        i9 = 932299468;
                    }
                    break;
                case -2057527646:
                case -1804488192:
                    sArr2 = f25870;
                    i4 = 652;
                    if (C1542.m5459() >= 0) {
                        iM2761 = C0619.m2761("֡ܿ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 16093) ^ 892563093;
                        i9 = 1973327004;
                    } else {
                        iM2761 = C0773.m3169("ۘۜ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-30069)) ^ (-2087986158);
                        i9 = 866267915;
                    }
                    break;
                case -1913252226:
                case 959452207:
                    i3 = 9921;
                    iM2761 = (C0619.m2761("ܿ᩸") + i6) * 11;
                    i8 = ((iM2761 ^ i7) * 10271) ^ 556509311;
                    i9 = -904519078;
                    break;
                case -1861630311:
                case -659620360:
                    C0950.m3785();
                    iM2761 = (C0619.m2761("֫ᩴ") ^ i6) * (-81);
                    i8 = ((iM2761 ^ i7) * 7) ^ 843243433;
                    i9 = -1420021304;
                    break;
                case -1791346828:
                case 1872107254:
                    return RunnableC1848.m6366(sArr2, i4, 18, i3);
                case -1732844262:
                case -1469317064:
                    i = s * 2;
                    if (C11235.f35427 >= 0) {
                        iM2761 = (C0773.m3169("ܽܶ") ^ i7) * 53;
                        i8 = ((iM2761 ^ i6) * (-31021)) ^ 398975108;
                        i9 = 1021326785;
                    } else {
                        iM2761 = C0773.m3169("ۗ᩻") ^ i7;
                        i8 = ((iM2761 ^ i6) * 7729) ^ 1078622221;
                        i9 = 1529572608;
                    }
                    break;
                case -1569531659:
                case -1393211225:
                    if (C3077.f9998) {
                        iM2761 = C0619.m2761("ܿۘ") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-5381)) ^ (-1847157041);
                        i9 = -2109724390;
                    } else {
                        iM2761 = C0773.m3169("ۙۧ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 4679) ^ (-703434793);
                        i9 = 932299468;
                    }
                    break;
                case -1551677790:
                case -840323137:
                    i3 = 14184;
                    iM2761 = (C0619.m2761("ܿ᩸") + i6) * 11;
                    i8 = ((iM2761 ^ i7) * 10271) ^ 556509311;
                    i9 = -904519078;
                    break;
                case -1513457839:
                case -893505728:
                    if (C2878.m9491() <= 0) {
                        iM2761 = C0619.m2761("֡ܿ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 16093) ^ 892563093;
                        i9 = 1973327004;
                    } else {
                        iM2761 = C0773.m3169("᩷۟") ^ i7;
                        i8 = ((iM2761 ^ i6) * 29433) ^ 1017505614;
                        i9 = 175025300;
                    }
                    break;
                case -1372136372:
                case -917877251:
                    sArr = f25870;
                    if (C3448.f11240 >= 0) {
                        iM2761 = (i6 - C0773.m3169("ᩳۢ")) * 21;
                        i8 = ((iM2761 ^ i7) * (-23961)) ^ 942105503;
                        i9 = 1818180487;
                    } else {
                        iM2761 = (C0619.m2761("ᩴ᩵") + i6) * 81;
                        i8 = ((iM2761 ^ i7) * 20803) ^ 1130144907;
                        i9 = 288672446;
                    }
                    break;
                case -1208012628:
                case -84680036:
                    c = 651;
                    if (C0619.f2439) {
                        iM2761 = (C0773.m3169("ܽܶ") ^ i7) * 53;
                        i8 = ((iM2761 ^ i6) * (-31021)) ^ 398975108;
                        i9 = 1021326785;
                    } else {
                        iM2761 = (C0773.m3169("ۗ֨") ^ i6) * 77;
                        i8 = ((iM2761 ^ i7) * 15579) ^ (-85419629);
                        i9 = -236282111;
                    }
                    break;
                case -946552263:
                case -894184373:
                    s2 = 1;
                    if (C2023.m6964() <= 0) {
                        iM2761 = C0619.m2761("֡ܿ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 16093) ^ 892563093;
                        i9 = 1973327004;
                    } else {
                        iM2761 = C0773.m3169("ܰᩴ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-26711)) ^ (-1081560651);
                        i9 = 1444676792;
                    }
                    break;
                case -611024921:
                case 1587401019:
                    s = sArr[c];
                    if (C0269.f1558 <= 0) {
                        iM2761 = (i6 - C0773.m3169("ᩳۢ")) * 21;
                        i8 = ((iM2761 ^ i7) * (-23961)) ^ 942105503;
                        i9 = 1818180487;
                    } else {
                        iM2761 = (C0773.m3169("ۚۚ") + i7) * 21;
                        i8 = ((iM2761 ^ i6) * (-27677)) ^ (-633725206);
                        i9 = 49303919;
                    }
                    break;
                case -367556134:
                case 1075961837:
                    C1080.m4050();
                    if (C3099.f10023 <= 0) {
                        iM2761 = (i6 - C0773.m3169("ᩳۢ")) * 21;
                        i8 = ((iM2761 ^ i7) * (-23961)) ^ 942105503;
                        i9 = 1818180487;
                    } else {
                        iM2761 = (C0619.m2761("֫ᩴ") ^ i6) * (-81);
                        i8 = ((iM2761 ^ i7) * 7) ^ 843243433;
                        i9 = -1420021304;
                    }
                    break;
                case -38576897:
                case 1763667138:
                    i2 = i + 1;
                    if (C2966.f9654 >= 0) {
                        iM2761 = C0619.m2761("֡ܿ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 16093) ^ 892563093;
                        i9 = 1973327004;
                    } else {
                        iM2761 = C0773.m3169("֫۫") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-10303)) ^ (-1803443098);
                        i9 = -232027562;
                    }
                    break;
                case 69414791:
                case 122878053:
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0773.m3169("ۙۧ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 4679) ^ (-703434793);
                        i9 = 932299468;
                    } else {
                        iM2761 = (C0619.m2761("֫ᩴ") ^ i6) * (-81);
                        i8 = ((iM2761 ^ i7) * 7) ^ 843243433;
                        i9 = -1420021304;
                    }
                    break;
                case 254994588:
                case 1440510706:
                    C2878.m9491();
                    C2023.m6964();
                    return null;
                case 335527150:
                case 717814052:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (C0619.m2761("֫ᩴ") ^ i6) * (-81);
                        i8 = ((iM2761 ^ i7) * 7) ^ 843243433;
                        i9 = -1420021304;
                    } else {
                        iM2761 = (C0773.m3169("ۚܽ") ^ i7) * 55;
                        i8 = ((iM2761 ^ i6) * (-26463)) ^ 1970822422;
                        i9 = 1516840;
                    }
                    break;
                default:
                    int i10 = s + s2;
                    if (i2 - (i10 * i10) <= 0) {
                        iM2761 = (C0773.m3169("ܶܿ") + i6) * (-87);
                        i8 = ((iM2761 ^ i7) * 18209) ^ 812096978;
                        i9 = -2109608585;
                    } else {
                        iM2761 = (i7 - C0773.m3169("ۡ᩻")) * (-61);
                        i8 = ((iM2761 ^ i6) * (-8621)) ^ (-817679303);
                        i9 = -2145226564;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ void m21201(ViewOnClickListenerC7793 viewOnClickListenerC7793, C15945 c15945, C9829 c9829, C9829 c98210) {
        int i = 1694734181;
        int i2 = C3033.f9831;
        int i3 = C3690.f12684;
        int iM2761 = C0619.m2761("ۖ᩶") ^ i2;
        int i4 = ((iM2761 ^ i3) * (-20289)) ^ (-1857406072);
        int i5 = 2094065387;
        while (true) {
            i = ((((i ^ i3) * (-29701)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1937387151:
                case 186558036:
                    if (C4282.f15546 > 0) {
                        iM2761 = C0619.m2761("ۧۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 25669) ^ (-931485778);
                        i5 = -1998075739;
                    } else {
                        iM2761 = C0619.m2761("۫ܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 24157) ^ (-311004307);
                        i5 = 822275233;
                    }
                    break;
                case -1932414274:
                case -952827762:
                    if (C3077.f9998) {
                        iM2761 = (C0619.m2761("᩷ۢ") + i2) * (-29);
                        i4 = ((iM2761 ^ i3) * (-4069)) ^ (-352960455);
                        i5 = -1766225131;
                    } else {
                        iM2761 = C0619.m2761("ܺ۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * 785) ^ (-1508683823);
                        i5 = 1407513233;
                    }
                    break;
                case -1827919071:
                case 885179007:
                    if (C1146.f4234 >= 0) {
                        iM2761 = (i3 - C0619.m2761("۟֡")) * 43;
                        i4 = ((iM2761 ^ i2) * (-8837)) ^ 330433509;
                        i5 = -1716918338;
                    } else {
                        iM2761 = C0619.m2761("᩹ۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 8935) ^ (-1928919140);
                        i5 = 132150927;
                    }
                    break;
                case -1486407405:
                case 1731934191:
                    C3998.m12920();
                    iM2761 = C0619.m2761("۫ܰ") ^ i3;
                    i4 = ((iM2761 ^ i2) * 24157) ^ (-311004307);
                    i5 = 822275233;
                    break;
                case -1179617942:
                case 1830245635:
                    if (AbstractC3624.f12429 > 0) {
                        iM2761 = (i2 - C0773.m3169("ܶ᩷")) * (-109);
                        i4 = ((iM2761 ^ i3) * 12485) ^ (-1392912871);
                        i5 = -1348413640;
                    } else {
                        iM2761 = C0619.m2761("۫ܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 24157) ^ (-311004307);
                        i5 = 822275233;
                    }
                    break;
                case -942115133:
                case -398496089:
                    if (C2375.f7641 <= 0) {
                        iM2761 = (i3 - C0619.m2761("۟֡")) * 43;
                        i4 = ((iM2761 ^ i2) * (-8837)) ^ 330433509;
                        i5 = -1716918338;
                    } else {
                        iM2761 = C0773.m3169("۫᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * 11563) ^ 153713556;
                        i5 = 601135409;
                    }
                    break;
                case -909988693:
                case 1918034577:
                    if (C2288.m7767()) {
                        iM2761 = C0619.m2761("ܺ۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * 785) ^ (-1508683823);
                        i5 = 1407513233;
                    } else {
                        iM2761 = C0619.m2761("ۘܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 26831) ^ 1749804884;
                        i5 = 134862899;
                    }
                    break;
                case -405462841:
                case 124119359:
                    viewOnClickListenerC7793.m21208(c15945, c9829, c98210);
                    break;
                case 183739707:
                case 1619792037:
                    if (C2834.f9334 <= 0) {
                        iM2761 = (i2 - C0773.m3169("ܶ᩷")) * (-109);
                        i4 = ((iM2761 ^ i3) * 12485) ^ (-1392912871);
                        i5 = -1348413640;
                    } else {
                        iM2761 = C0773.m3169("ۢ᩶") ^ i3;
                        i4 = ((iM2761 ^ i2) * 5073) ^ 78634318;
                        i5 = -104419782;
                    }
                    break;
                case 267481188:
                case 1680100954:
                    C2310.m7813();
                    C2966.m9664();
                    break;
                case 489105598:
                case 1805671965:
                    if (C2966.m9664()) {
                        iM2761 = (C0773.m3169("᩹ۤ") ^ i2) * 7;
                        i4 = ((iM2761 ^ i3) * (-213)) ^ (-160538097);
                        i5 = -245336925;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ܶ᩷")) * (-109);
                        i4 = ((iM2761 ^ i3) * 12485) ^ (-1392912871);
                        i5 = -1348413640;
                    }
                    break;
                case 703734617:
                case 1799063951:
                    if (C2702.m8876()) {
                        iM2761 = C0773.m3169("ܽܰ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-8513)) ^ (-1463738631);
                        i5 = -1890528100;
                    } else {
                        iM2761 = C0619.m2761("۫ܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 24157) ^ (-311004307);
                        i5 = 822275233;
                    }
                    break;
                case 1108314646:
                case 1158395178:
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0619.m2761("ܺ۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * 785) ^ (-1508683823);
                        i5 = 1407513233;
                    } else {
                        iM2761 = C0619.m2761("ۚۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-23501)) ^ 1044888250;
                        i5 = -147769727;
                    }
                    break;
                case 1880069171:
                case 1891085949:
                    C1542.m5459();
                    if (C0487.f2131 > 0) {
                        iM2761 = (i3 - C0619.m2761("۟֡")) * 43;
                        i4 = ((iM2761 ^ i2) * (-8837)) ^ 330433509;
                        i5 = -1716918338;
                    } else {
                        iM2761 = C0619.m2761("ۧۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 25669) ^ (-931485778);
                        i5 = -1998075739;
                    }
                    break;
                case 2121915460:
                case 2140933350:
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0619.m2761("۫ܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 24157) ^ (-311004307);
                        i5 = 822275233;
                    } else {
                        iM2761 = C0773.m3169("ۙۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 8795) ^ (-1782551229);
                        i5 = -44167699;
                    }
                    break;
                default:
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0619.m2761("ۧۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 25669) ^ (-931485778);
                        i5 = -1998075739;
                    } else {
                        iM2761 = C0619.m2761("֡֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 26731) ^ (-1669307018);
                        i5 = 385996307;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0503 A[PHI: r7 r11 r13 r16 r18 r19 r20 r25
      0x0503: PHI (r7v3 l.ۢ֫ܺ) = (r7v2 l.ۢ֫ܺ), (r7v2 l.ۢ֫ܺ), (r7v2 l.ۢ֫ܺ), (r7v4 l.ۢ֫ܺ) binds: [B:124:0x0501, B:116:0x04ab, B:112:0x0485, B:59:0x0204] A[DONT_GENERATE, DONT_INLINE]
      0x0503: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:124:0x0501, B:116:0x04ab, B:112:0x0485, B:59:0x0204] A[DONT_GENERATE, DONT_INLINE]
      0x0503: PHI (r13v3 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v4 short[]) binds: [B:124:0x0501, B:116:0x04ab, B:112:0x0485, B:59:0x0204] A[DONT_GENERATE, DONT_INLINE]
      0x0503: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:124:0x0501, B:116:0x04ab, B:112:0x0485, B:59:0x0204] A[DONT_GENERATE, DONT_INLINE]
      0x0503: PHI (r18v4 int) = (r18v2 int), (r18v3 int), (r18v2 int), (r18v2 int) binds: [B:124:0x0501, B:116:0x04ab, B:112:0x0485, B:59:0x0204] A[DONT_GENERATE, DONT_INLINE]
      0x0503: PHI (r19v4 int) = (r19v2 int), (r19v2 int), (r19v3 int), (r19v2 int) binds: [B:124:0x0501, B:116:0x04ab, B:112:0x0485, B:59:0x0204] A[DONT_GENERATE, DONT_INLINE]
      0x0503: PHI (r20v4 short) = (r20v2 short), (r20v3 short), (r20v2 short), (r20v2 short) binds: [B:124:0x0501, B:116:0x04ab, B:112:0x0485, B:59:0x0204] A[DONT_GENERATE, DONT_INLINE]
      0x0503: PHI (r25v36 l.ۢ֫ܺ) = (r25v7 l.ۢ֫ܺ), (r25v9 l.ۢ֫ܺ), (r25v10 l.ۢ֫ܺ), (r25v39 l.ۢ֫ܺ) binds: [B:124:0x0501, B:116:0x04ab, B:112:0x0485, B:59:0x0204] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:97:0x03b6 A[PHI: r9 r10 r26
      0x03b6: PHI (r9v4 short[]) = (r9v3 short[]), (r9v2 short[]), (r9v2 short[]) binds: [B:96:0x03b4, B:93:0x0395, B:8:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x03b6: PHI (r10v5 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:96:0x03b4, B:93:0x0395, B:8:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x03b6: PHI (r26v41 l.ۢ֫ܺ) = (r26v20 l.ۢ֫ܺ), (r26v23 l.ۢ֫ܺ), (r26v3 l.ۢ֫ܺ) binds: [B:96:0x03b4, B:93:0x0395, B:8:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0089, code lost:
    
        if (l.C1146.f4234 < 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e0, code lost:
    
        if (l.C23916.m53419() == 0) goto L20;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m21207(l.C9829 r27) {
        /*
            Method dump skipped, instruction units count: 1650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC7793.m21207(l.ۢۖ᩹):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21198(ViewOnClickListenerC7793 viewOnClickListenerC7793, String str) {
        C23255 c23255 = null;
        C23255 c23256 = null;
        int i = -936236722;
        int i2 = AbstractC0116.f1064;
        int i3 = C4238.f15451;
        int iM2761 = (C0619.m2761("֡᩻") + i2) * (-9);
        int i4 = ((iM2761 ^ i3) * 5075) ^ 1337245001;
        int i5 = 2078537434;
        while (true) {
            i = ((((i ^ i3) * (-11783)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2047040651:
                case -1938376487:
                    if (C0950.m3785() != 0) {
                        iM2761 = (C0619.m2761("ۧۗ") + i2) * (-127);
                        i4 = ((iM2761 ^ i3) * (-3697)) ^ 876793865;
                        i5 = -1289336064;
                    } else {
                        iM2761 = C0619.m2761("۬ܺ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 5069) ^ (-584900880);
                        i5 = -845216688;
                    }
                    break;
                case -1806356094:
                case 2009555555:
                    C3448.m11248();
                    if (!C2023.f6737) {
                        iM2761 = (C0773.m3169("ᩴۨ") + i3) * 77;
                        i4 = ((iM2761 ^ i2) * (-15117)) ^ (-658038015);
                        i5 = -930324536;
                    } else {
                        iM2761 = (C0619.m2761("ܿ֡") + i3) * 59;
                        i4 = ((iM2761 ^ i2) * (-23901)) ^ 2117161236;
                        i5 = -1277876184;
                    }
                    break;
                case -1593707200:
                case 1935457920:
                    if (C4282.m13644()) {
                        iM2761 = C0773.m3169("᩺ۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 11023) ^ 470491955;
                        i5 = -181234773;
                    } else {
                        iM2761 = (C0773.m3169("ۧᩳ") ^ i2) * 47;
                        i4 = ((iM2761 ^ i3) * (-5237)) ^ 1280654295;
                        i5 = -1814451196;
                    }
                    break;
                case -1512204631:
                case 515480818:
                    if (C4238.f15451 >= 0) {
                        iM2761 = (C0619.m2761("ۧۗ") + i2) * (-127);
                        i4 = ((iM2761 ^ i3) * (-3697)) ^ 876793865;
                        i5 = -1289336064;
                    } else {
                        iM2761 = C0619.m2761("֫ۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-31509)) ^ 1282872515;
                        i5 = 1579101270;
                    }
                    break;
                case -1348140671:
                case 220529610:
                    C2310.m7813();
                    break;
                case -1206544286:
                case -29230723:
                    C0950.m3788(c23256, c23256.m54099());
                    iM2761 = C0773.m3169("ۜܰ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-22957)) ^ 1852162923;
                    i5 = -1064994644;
                    break;
                case -1113950676:
                case 336619703:
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0619.m2761("᩹᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10557)) ^ (-3372870);
                        i5 = -1874296030;
                    } else {
                        iM2761 = C0773.m3169("᩺۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * 9237) ^ (-1160560292);
                        i5 = -2115934868;
                    }
                    break;
                case -759033339:
                case 1890789615:
                    if (C2375.m8065() <= 0) {
                        iM2761 = C0619.m2761("᩹᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10557)) ^ (-3372870);
                        i5 = -1874296030;
                    } else {
                        iM2761 = C0619.m2761("ۖᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-25561)) ^ (-1997223306);
                        i5 = -1182505522;
                    }
                    break;
                case -159304399:
                case 889532128:
                    if (C2354.f7599 >= 0) {
                        iM2761 = (C0773.m3169("ᩴۨ") + i3) * 77;
                        i4 = ((iM2761 ^ i2) * (-15117)) ^ (-658038015);
                        i5 = -930324536;
                    } else {
                        iM2761 = (C0773.m3169("ܽ᩷") + i2) * 79;
                        i4 = ((iM2761 ^ i3) * 1709) ^ 1159760316;
                        i5 = -536862493;
                    }
                    break;
                case -97697962:
                case 1510041446:
                    c23255 = viewOnClickListenerC7793.f25874;
                    if (c23255 != null) {
                        iM2761 = C0773.m3169("ۢ֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-9021)) ^ 1734360981;
                        i5 = -1037186774;
                    } else {
                        iM2761 = C0773.m3169("ۜܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-22957)) ^ 1852162923;
                        i5 = -1064994644;
                    }
                    break;
                case 552540078:
                case 1192550284:
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0619.m2761("᩹᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10557)) ^ (-3372870);
                        i5 = -1874296030;
                    } else {
                        iM2761 = (C0773.m3169("ᩴۨ") + i3) * 77;
                        i4 = ((iM2761 ^ i2) * (-15117)) ^ (-658038015);
                        i5 = -930324536;
                    }
                    break;
                case 670488511:
                case 809465655:
                    if (C0773.f2792 <= 0) {
                        iM2761 = (C0619.m2761("ۧۗ") + i2) * (-127);
                        i4 = ((iM2761 ^ i3) * (-3697)) ^ 876793865;
                        i5 = -1289336064;
                    } else {
                        iM2761 = C0619.m2761("᩸֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * 2733) ^ (-920128538);
                        i5 = -972607505;
                    }
                    break;
                case 1050312561:
                case 1287766991:
                    if (C1826.f6190 <= 0) {
                        iM2761 = (C0773.m3169("ۧᩳ") ^ i2) * 47;
                        i4 = ((iM2761 ^ i3) * (-5237)) ^ 1280654295;
                        i5 = -1814451196;
                    } else {
                        iM2761 = (C0619.m2761("ܿ֡") + i3) * 59;
                        i4 = ((iM2761 ^ i2) * (-23901)) ^ 2117161236;
                        i5 = -1277876184;
                    }
                    break;
                case 1132893477:
                case 1874570232:
                    if (C1146.m4231()) {
                        iM2761 = C0773.m3169("ۚܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15297)) ^ 1116613567;
                        i5 = 602468767;
                    } else {
                        iM2761 = (C0773.m3169("ۧᩳ") ^ i2) * 47;
                        i4 = ((iM2761 ^ i3) * (-5237)) ^ 1280654295;
                        i5 = -1814451196;
                    }
                    break;
                case 1381836084:
                case 1698996848:
                    C2023.m6964();
                    C0773.m3161();
                    iM2761 = (C0619.m2761("ܿ֡") + i3) * 59;
                    i4 = ((iM2761 ^ i2) * (-23901)) ^ 2117161236;
                    i5 = -1277876184;
                    break;
                case 1558325207:
                case 1956261628:
                    C0269.m1786(c23255, str);
                    c23256 = viewOnClickListenerC7793.f25874;
                    if (C4238.f15451 >= 0) {
                        iM2761 = (C0619.m2761("ۧۗ") + i2) * (-127);
                        i4 = ((iM2761 ^ i3) * (-3697)) ^ 876793865;
                        i5 = -1289336064;
                    } else {
                        iM2761 = (C0773.m3169("۫ܳ") ^ i2) * 75;
                        i4 = ((iM2761 ^ i3) * 6825) ^ 51640994;
                        i5 = -1933115970;
                    }
                    break;
                case 1634312489:
                case 1983028817:
                    break;
                default:
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0619.m2761("ܿ֡") + i3) * 59;
                        i4 = ((iM2761 ^ i2) * (-23901)) ^ 2117161236;
                        i5 = -1277876184;
                    } else {
                        iM2761 = (C0619.m2761("ۗܽ") ^ i3) * (-103);
                        i4 = ((iM2761 ^ i2) * 9389) ^ (-145533666);
                        i5 = -1971094426;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01b7 A[PHI: r8 r12 r16
      0x01b7: PHI (r8v4 int) = (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:53:0x01b5, B:33:0x00e2, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x01b7: PHI (r12v4 int) = (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:53:0x01b5, B:33:0x00e2, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x01b7: PHI (r16v29 int) = (r16v9 int), (r16v16 int), (r16v30 int) binds: [B:53:0x01b5, B:33:0x00e2, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01ee A[PHI: r1 r6 r7 r16 r17
      0x01ee: PHI (r1v3 int) = (r1v1 int), (r1v2 int), (r1v1 int), (r1v1 int) binds: [B:57:0x01ec, B:29:0x00c4, B:25:0x009d, B:8:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x01ee: PHI (r6v3 int) = (r6v2 int), (r6v1 int), (r6v1 int), (r6v1 int) binds: [B:57:0x01ec, B:29:0x00c4, B:25:0x009d, B:8:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x01ee: PHI (r7v3 short) = (r7v2 short), (r7v1 short), (r7v1 short), (r7v1 short) binds: [B:57:0x01ec, B:29:0x00c4, B:25:0x009d, B:8:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x01ee: PHI (r16v26 int) = (r16v8 int), (r16v17 int), (r16v18 int), (r16v31 int) binds: [B:57:0x01ec, B:29:0x00c4, B:25:0x009d, B:8:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x01ee: PHI (r17v3 int) = (r17v1 int), (r17v1 int), (r17v2 int), (r17v1 int) binds: [B:57:0x01ec, B:29:0x00c4, B:25:0x009d, B:8:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0258 A[PHI: r3 r10 r11 r16
      0x0258: PHI (r3v3 char) = (r3v2 char), (r3v1 char), (r3v1 char) binds: [B:65:0x0256, B:37:0x0105, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r10v3 short[]) = (r10v1 short[]), (r10v2 short[]), (r10v1 short[]) binds: [B:65:0x0256, B:37:0x0105, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:65:0x0256, B:37:0x0105, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r16v23 int) = (r16v6 int), (r16v15 int), (r16v24 int) binds: [B:65:0x0256, B:37:0x0105, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x028a A[PHI: r2 r16
      0x028a: PHI (r2v3 short[]) = (r2v2 short[]), (r2v1 short[]), (r2v1 short[]) binds: [B:69:0x0288, B:21:0x0079, B:12:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r16v22 int) = (r16v5 int), (r16v19 int), (r16v25 int) binds: [B:69:0x0288, B:21:0x0079, B:12:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (l.C3779.m12264() == false) goto L11;
     */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m21216(l.ViewOnClickListenerC7793 r20) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC7793.m21216(l.۟ۢ֫):void");
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01de A[PHI: r8 r13
      0x01de: PHI (r8v7 l.ۗۢ֫) = (r8v3 l.ۗۢ֫), (r8v2 l.ۗۢ֫), (r8v2 l.ۗۢ֫) binds: [B:55:0x01dc, B:22:0x007a, B:106:0x01de] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r13v7 l.ܿۢ֫) = (r13v2 l.ܿۢ֫), (r13v3 l.ܿۢ֫), (r13v2 l.ܿۢ֫) binds: [B:55:0x01dc, B:22:0x007a, B:106:0x01de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m21243(ViewOnClickListenerC7793 viewOnClickListenerC7793) {
        int iM2761;
        int i;
        int iM2762;
        int i2;
        int i3;
        int i4;
        ViewOnClickListenerC7793 viewOnClickListenerC7794 = viewOnClickListenerC7793;
        int i5 = C2375.f7641;
        int i6 = C11235.f35427;
        int iM2763 = (i6 - C0619.m2761("۫᩸")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
        int i7 = ((iM2763 ^ i5) * 20575) ^ 668452849;
        C9829 c9829 = null;
        C18234 c18234 = null;
        int i8 = iM2763 ^ 1983471397;
        int i9 = 1847206757;
        int i10 = 0;
        C3318 c3318 = null;
        AtomicInteger atomicInteger = null;
        ArrayList arrayList = null;
        C20472 c20472 = null;
        C20472 c20473 = null;
        InterfaceC15970 interfaceC15970ListIterator = null;
        C3318 c3319 = null;
        InterfaceC15970 interfaceC15970ListIterator2 = null;
        int i11 = 0;
        while (true) {
            i9 = i8 ^ (i7 & (((i9 ^ i5) * 25653) >> 31));
            switch (i9) {
                case -2143648722:
                case 569618895:
                    c20472 = (C20472) C0950.m3796(interfaceC15970ListIterator);
                    if (c20472.f65591) {
                        iM2762 = (C0619.m2761("۠֨") + i5) * 59;
                        i2 = ((iM2762 ^ i6) * 25911) ^ (-1696326751);
                        i3 = -643812534;
                    } else {
                        iM2762 = (C0773.m3169("ܶ᩸") ^ i5) * 75;
                        i2 = ((iM2762 ^ i6) * (-13459)) ^ (-1425228969);
                        i3 = -288485548;
                    }
                    i8 = iM2762 ^ i3;
                    i7 = i2;
                    break;
                case -2077648837:
                case -1461831109:
                    C20932.m47848();
                    C2485.m8357();
                    break;
                case -2067021393:
                case -1464838877:
                    c3319 = viewOnClickListenerC7794.f25872.f39446;
                    if (RunnableC3646.m11813() != 0) {
                        iM2762 = C0773.m3169("ۙ۬") ^ i6;
                        i2 = ((iM2762 ^ i5) * (-12005)) ^ 1657636228;
                        i3 = -217414105;
                    } else {
                        iM2762 = (C0773.m3169("᩶᩵") + i5) * 13;
                        i2 = ((iM2762 ^ i6) * (-27839)) ^ (-956481197);
                        i3 = -1600353686;
                    }
                    i8 = iM2762 ^ i3;
                    i7 = i2;
                    break;
                case -1950186643:
                case 1340343218:
                    interfaceC15970ListIterator = c3319.f10826.listIterator(i11);
                    iM2762 = (C0773.m3169("ܶ᩸") ^ i5) * 75;
                    i2 = ((iM2762 ^ i6) * (-13459)) ^ (-1425228969);
                    i3 = -288485548;
                    i8 = iM2762 ^ i3;
                    i7 = i2;
                    break;
                case -1666063668:
                case 690789253:
                    if (C3099.m10097(arrayList)) {
                        iM2762 = C0773.m3169("ۨ᩵") ^ i6;
                        i2 = ((iM2762 ^ i5) * 26771) ^ (-123933839);
                        i3 = -809079245;
                    } else {
                        iM2762 = (i6 - C0773.m3169("ܰ۫")) * 127;
                        i2 = ((iM2762 ^ i5) * 31639) ^ (-1104891417);
                        i3 = 2041012569;
                    }
                    i8 = iM2762 ^ i3;
                    i7 = i2;
                    break;
                case -1575999892:
                case -1523065786:
                    viewOnClickListenerC7794.f25875 = c18234;
                    viewOnClickListenerC7793.m21220();
                    break;
                case -1537073218:
                case 863495019:
                    C1564.m5517(viewOnClickListenerC7794.f25887);
                    if (!C2878.f9462) {
                        iM2762 = C0619.m2761("ۡܺ") ^ i6;
                        i2 = ((iM2762 ^ i5) * (-12343)) ^ 2013235246;
                        i3 = 711494053;
                        i8 = iM2762 ^ i3;
                        i7 = i2;
                    } else {
                        i4 = i10;
                        int iM2764 = (C0619.m2761("۫ᩴ") + i5) * 87;
                        i8 = iM2764 ^ 870304885;
                        i10 = i4;
                        i7 = ((iM2764 ^ i6) * (-16885)) ^ 2042370078;
                        viewOnClickListenerC7794 = viewOnClickListenerC7793;
                    }
                    break;
                case -1303109757:
                case 1821882504:
                    i4 = i10;
                    viewOnClickListenerC7794.f25883 = i4;
                    if (C1080.f3865 < 0) {
                        int iM3169 = (C0773.m3169("ۛ᩵") ^ i5) * (-93);
                        i2 = ((iM3169 ^ i6) * 14665) ^ (-925812900);
                        i8 = iM3169 ^ 1888072304;
                        viewOnClickListenerC7794 = viewOnClickListenerC7793;
                        i10 = i4;
                        i7 = i2;
                    } else {
                        int iM2765 = (C0619.m2761("۫ᩴ") + i5) * 87;
                        i8 = iM2765 ^ 870304885;
                        i10 = i4;
                        i7 = ((iM2765 ^ i6) * (-16885)) ^ 2042370078;
                        viewOnClickListenerC7794 = viewOnClickListenerC7793;
                    }
                    break;
                case -1220911072:
                case -73085927:
                    arrayList = new ArrayList();
                    if (C13473.f42873 != 0) {
                        iM2762 = (i6 - C0619.m2761("ۧۡ")) * 19;
                        i2 = ((iM2762 ^ i5) * (-23573)) ^ (-694659829);
                        i3 = -1245265194;
                    } else {
                        iM2762 = (C0619.m2761("ۢ᩸") ^ i6) * (-3);
                        i2 = ((iM2762 ^ i5) * (-5715)) ^ (-2138722290);
                        i3 = 1445572906;
                    }
                    i8 = iM2762 ^ i3;
                    i7 = i2;
                    break;
                case -1198889336:
                case -23843246:
                    atomicInteger = viewOnClickListenerC7794.f25897;
                    if (C2310.f7472 < 0) {
                        iM2762 = (i5 - C0619.m2761("᩺᩻")) * 53;
                        i2 = ((iM2762 ^ i6) * 15093) ^ 819880017;
                        i3 = -1011855617;
                        i8 = iM2762 ^ i3;
                        i7 = i2;
                    } else {
                        iM2761 = C0619.m2761("ܶ᩶") ^ i5;
                        i7 = ((iM2761 ^ i6) * 18757) ^ (-320591028);
                        i = 27023279;
                        i8 = iM2761 ^ i;
                        viewOnClickListenerC7794 = viewOnClickListenerC7793;
                    }
                    break;
                case -829723287:
                case -524294777:
                    c9829 = c3318.f10826;
                    if (C2702.f8586 > 0) {
                        iM2762 = C0773.m3169("ۚۨ") ^ i6;
                        i2 = ((iM2762 ^ i5) * (-31751)) ^ 355595088;
                        i3 = -645900142;
                        i8 = iM2762 ^ i3;
                        i7 = i2;
                    } else {
                        i4 = i10;
                        int iM2766 = (C0619.m2761("۫ᩴ") + i5) * 87;
                        i8 = iM2766 ^ 870304885;
                        i10 = i4;
                        i7 = ((iM2766 ^ i6) * (-16885)) ^ 2042370078;
                        viewOnClickListenerC7794 = viewOnClickListenerC7793;
                    }
                    break;
                case -740011683:
                case 559588755:
                    if (C1826.m6317(interfaceC15970ListIterator)) {
                        iM2762 = C0773.m3169("ܳ᩺") ^ i5;
                        i2 = ((iM2762 ^ i6) * (-14775)) ^ 1476560059;
                        i3 = -186324496;
                    } else {
                        iM2762 = (i6 - C0773.m3169("ۘۚ")) * 45;
                        i2 = ((iM2762 ^ i5) * 3327) ^ 3513764;
                        i3 = 1294820518;
                    }
                    i8 = iM2762 ^ i3;
                    i7 = i2;
                    break;
                case -579804997:
                case 1967274454:
                    if (!C2023.f6737) {
                        i4 = i10;
                        int iM2767 = (C0619.m2761("۫ᩴ") + i5) * 87;
                        i8 = iM2767 ^ 870304885;
                        i10 = i4;
                        i7 = ((iM2767 ^ i6) * (-16885)) ^ 2042370078;
                        viewOnClickListenerC7794 = viewOnClickListenerC7793;
                    } else {
                        iM2762 = (i6 - C0773.m3169("۬ۚ")) * (-123);
                        i2 = ((iM2762 ^ i5) * 10515) ^ 1730837641;
                        i3 = 1835269392;
                        i8 = iM2762 ^ i3;
                        i7 = i2;
                    }
                    break;
                case -577483286:
                case 307948664:
                    if (C1826.m6317(interfaceC15970ListIterator2)) {
                        iM2762 = C0773.m3169("۟᩹") ^ i6;
                        i2 = ((iM2762 ^ i5) * (-11347)) ^ 1332923518;
                        i3 = 1614887894;
                    } else {
                        iM2762 = (C0773.m3169("ᩴ᩹") ^ i6) * (-21);
                        i2 = ((iM2762 ^ i5) * (-6527)) ^ (-1998912978);
                        i3 = 1529936120;
                    }
                    i8 = iM2762 ^ i3;
                    i7 = i2;
                    break;
                case -488101381:
                case 442980617:
                    RunnableC0334.m2054(arrayList, c20473);
                    iM2762 = (C0773.m3169("᩵֫") ^ i5) * 81;
                    i2 = ((iM2762 ^ i6) * 27739) ^ 856999291;
                    i3 = -394717145;
                    i8 = iM2762 ^ i3;
                    i7 = i2;
                    break;
                case -334367734:
                case -220915097:
                    C1564.m5517(atomicInteger);
                    if (C3492.f12043 <= 0) {
                        iM2762 = (i6 - C0773.m3169("۬ۚ")) * (-123);
                        i2 = ((iM2762 ^ i5) * 10515) ^ 1730837641;
                        i3 = 1835269392;
                    } else {
                        iM2762 = C0619.m2761("᩷᩶") ^ i6;
                        i2 = ((iM2762 ^ i5) * 22695) ^ 1261059906;
                        i3 = -1312114724;
                    }
                    i8 = iM2762 ^ i3;
                    i7 = i2;
                    break;
                case -224139272:
                case 1138015309:
                    c20473 = (C20472) C4238.m13529(interfaceC15970ListIterator2);
                    if (c20473.f65591) {
                        iM2762 = C0773.m3169("ۚۘ") ^ i5;
                        i2 = ((iM2762 ^ i6) * (-14799)) ^ (-1510473391);
                        i3 = -1774819652;
                    } else {
                        iM2762 = (C0773.m3169("᩵֫") ^ i5) * 81;
                        i2 = ((iM2762 ^ i6) * 27739) ^ 856999291;
                        i3 = -394717145;
                    }
                    i8 = iM2762 ^ i3;
                    i7 = i2;
                    break;
                case -7010215:
                case 293526352:
                    c3318 = viewOnClickListenerC7794.f25880.f39446;
                    if (!C2354.m7983()) {
                        iM2761 = C0619.m2761("ܶ᩶") ^ i5;
                        i7 = ((iM2761 ^ i6) * 18757) ^ (-320591028);
                        i = 27023279;
                        i8 = iM2761 ^ i;
                        viewOnClickListenerC7794 = viewOnClickListenerC7793;
                    } else {
                        iM2762 = (i5 - C0773.m3169("۬֨")) * (-45);
                        i2 = ((iM2762 ^ i6) * 25949) ^ 1492398857;
                        i3 = -1783007040;
                        i8 = iM2762 ^ i3;
                        i7 = i2;
                    }
                    break;
                case 407813102:
                case 1400875480:
                    if (C23916.f77426 > 0) {
                        iM2762 = C0773.m3169("ۙ۬") ^ i6;
                        i2 = ((iM2762 ^ i5) * (-12005)) ^ 1657636228;
                        i3 = -217414105;
                        i8 = iM2762 ^ i3;
                        i7 = i2;
                    } else {
                        i4 = i10;
                        int iM2768 = (C0619.m2761("۫ᩴ") + i5) * 87;
                        i8 = iM2768 ^ 870304885;
                        i10 = i4;
                        i7 = ((iM2768 ^ i6) * (-16885)) ^ 2042370078;
                        viewOnClickListenerC7794 = viewOnClickListenerC7793;
                    }
                    break;
                case 495392379:
                case 1562684906:
                    break;
                case 590072407:
                case 1142766027:
                    c18234 = new C18234(viewOnClickListenerC7794, arrayList);
                    if (C3690.f12684 <= 0) {
                        iM2762 = C0773.m3169("ۙ۬") ^ i6;
                        i2 = ((iM2762 ^ i5) * (-12005)) ^ 1657636228;
                        i3 = -217414105;
                    } else {
                        iM2762 = (C0773.m3169("᩻ۧ") + i5) * (-37);
                        i2 = ((iM2762 ^ i6) * 19369) ^ (-799154463);
                        i3 = -1186152341;
                    }
                    i8 = iM2762 ^ i3;
                    i7 = i2;
                    break;
                case 783449838:
                case 1642622528:
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0619.m2761("ܶ᩶") ^ i5;
                        i7 = ((iM2761 ^ i6) * 18757) ^ (-320591028);
                        i = 27023279;
                        i8 = iM2761 ^ i;
                        viewOnClickListenerC7794 = viewOnClickListenerC7793;
                    } else {
                        iM2762 = (i6 - C0773.m3169("۬ۚ")) * (-123);
                        i2 = ((iM2762 ^ i5) * 10515) ^ 1730837641;
                        i3 = 1835269392;
                        i8 = iM2762 ^ i3;
                        i7 = i2;
                    }
                    break;
                case 910943891:
                case 1264758920:
                    interfaceC15970ListIterator2 = c9829.listIterator(0);
                    i11 = 0;
                    iM2762 = (C0773.m3169("᩵֫") ^ i5) * 81;
                    i2 = ((iM2762 ^ i6) * 27739) ^ 856999291;
                    i3 = -394717145;
                    i8 = iM2762 ^ i3;
                    i7 = i2;
                    break;
                case 920555697:
                case 1837280137:
                    C1519.m5406(arrayList, c20472);
                    iM2762 = (C0773.m3169("ܶ᩸") ^ i5) * 75;
                    i2 = ((iM2762 ^ i6) * (-13459)) ^ (-1425228969);
                    i3 = -288485548;
                    i8 = iM2762 ^ i3;
                    i7 = i2;
                    break;
                case 1214079770:
                case 1615918353:
                    i10 = -1;
                    if (C20932.m47848() != 0) {
                        iM2761 = C0619.m2761("ܶ᩶") ^ i5;
                        i7 = ((iM2761 ^ i6) * 18757) ^ (-320591028);
                        i = 27023279;
                    } else {
                        iM2761 = (i6 - C0619.m2761("ܽۡ")) * (-31);
                        i7 = ((iM2761 ^ i5) * 6139) ^ 1242126584;
                        i = -2065443437;
                    }
                    i8 = iM2761 ^ i;
                    viewOnClickListenerC7794 = viewOnClickListenerC7793;
                    break;
                default:
                    C3734.m12152();
                    i4 = i10;
                    int iM2769 = (C0619.m2761("۫ᩴ") + i5) * 87;
                    i8 = iM2769 ^ 870304885;
                    i10 = i4;
                    i7 = ((iM2769 ^ i6) * (-16885)) ^ 2042370078;
                    viewOnClickListenerC7794 = viewOnClickListenerC7793;
                    break;
            }
            return;
        }
    }

    static {
        ApplicationC23172.m52091(79);
        f25870 = new short[]{7546, 20337, -19015, -29725, 4570, 27012, 27058, 27064, 27060, 27061, 27125, 27041, 27058, 27051, 27125, 27051, 27061, 27068, 27125, 27052, 27070, 27065, 27051, 27012, 27058, 27064, 27060, 27061, 9521, 32191, -27829, 24013, -27596, -26574, 24074, 24077, -32303, 20064, 29689, 30689, 27496, 45, 60, 62, 54, 60, 58, 56, 23581, 31905, -30730, 60, 51, 57, 47, 50, 52, 57, 115, 52, 51, 41, 56, 51, 41, 115, 60, 62, 41, 52, 50, 51, 115, 25, 24, 17, 24, 9, 24, 5162, 24185, 23076, -26577, 31425, 16838, 32360, 21051, -30321, -26387, -29578, 26666, 27129, 21530, -28302, -27292, -26222, -29414, 29464, -27563, -26949, -32454, 32507, 27644, 23774, 24663, 23600, 31702, 32423, 21308, 24847, 22023, -29243, 22417, 30658, -27106, 25149, 31356, -31408, 16727, 32256, -26898, 23668, 3632, 3615, 3605, 3587, 3614, 3608, 3605, 3678, 3605, 3600, 3589, 3600, 3678, -25764, 29820, 28240, 28615, 25542, 32088, 3665, 3648, 23715, 28103, 21756, 3665, 3651, -28461, 23337, 27108, 3632, 3615, 3605, 3587, 3614, 3608, 3605, 3678, 3614, 3603, 3603, 3678, -28017, -27348, 30155, -26317, 30677, -27043, 31918, 30673, 24456, 29872, 22112, 28586, -30267, 29917, 21891, -29506, 25314, 25545, 30777, 16569, 22586, 25511, -28427, 21086, 25267, -26477, 28631, 3604, 3600, 3604, 3586, 3591, 9027, -30579, -29825, 20251, 9837, -31084, -31095, -31099, -31101, -31088, -31086, -31099, -31058, -31088, -31103, -31078, -31058, -31102, -31074, -31101, -31099, -31058, -31085, -31096, -31084, -31095, -31099, -31101, -31088, -31086, -31099, -31058, -31088, -31103, -31078, -31058, -31102, -31074, -31101, -31099, -31058, -31101, -31084, -31097, -31084, -31101, -31102, -31084, 5189, -11986, -11931, -11936, -11915, -11936, 2905, -6835, -6832, -6820, -6822, -6839, -6837, -6820, -6793, -6839, -6824, -6845, -6793, -6824, -6839, -6820, -6848, -6839, -6824, -6845, -6821, 6025, -12729, 15771, -13355, 2849, 21316, 21333, 21335, 21343, 21333, 21331, 21329, 21333, 21338, 21328, 21318, 21339, 21341, 21328, 21274, 21341, 21338, 21312, 21329, 21338, 21312, 21274, 21333, 21335, 21312, 21341, 21339, 21338, 21274, 21360, 21361, 21368, 21361, 21344, 21361, 5769, -1849, 14448, 13431, -11117, -12184, 8810, 5325, 1182, 1155, 1167, 1161, 1178, 1176, 1167, 1188, 1178, 1163, 1168, 1188, 1163, 1178, 1167, 1167, 1182, 1161, 1173, 1152, 1210, 1205, 1158, 1188, 1152, 1210, 1197, 1158, 1237, 1178, 1163, 1168, 1184, 1217, 1191, 1191, 1236, 1233, 1220, 1223, 1221, 1241, 1159, 1190, 1188, 1191, 1160, 1243, 9399, -16424, -17571, -18593, -6722, -6722, -6722, 8929, -21790, -21788, -21769, -21768, -21787, -21766, -21769, -21790, -21761, -21767, -21768, -21809, -21769, -21766, -21786, -21762, -21769, 9793, 4693, 4680, 4676, 4674, 4689, 4691, 4676, 4719, 4689, 4672, 4699, 4719, 4675, 4703, 4674, 4676, 4719, 4690, 4681, 6879, 436, 425, 421, 419, 432, 434, 421, 398, 432, 417, 442, 398, 418, 446, 419, 421, 398, 419, 436, 423, 436, 419, 418, 436, 9850, -25507, -25509, -25528, -25529, -25510, -25531, -25528, -25507, -25536, -25530, -25529, -25488, 6276, -13944, -13587, -242, -5396, -13862, 11280, -15992, -2127, 13683, -11057, 10466, -3084, 8443, 8307, -9695, -9910, -13342, 14764, -8884, -3777, -15207, -5431, 12268, -15051, 15569, 14009, -11383, 3030, 22133, 16768, -22975, -29437, -23123, -29751, -20605, 17874, 23202, 19049, -30004, 20378, -20702, -23502, 21503, -23915, 22136, -30630, -16409, -29941, -31843, 23471, 18708, 19266, -32661, 17994, -18020, -24143, 18923, 16555, 8938, 9281, 2808, 11912, 57, 1778, 12256, 1581, 28167, -21609, -28042, 28203, 28431, 31562, 28610, -25192, -27174, 26904, -30204, -23603, -21829, 25429, -29352, -27543, 25466, -26271, -3834, -3813, -3817, -3823, -3838, -3840, -3817, -3780, -3838, -3821, -3832, -3780, -3824, -3828, -3823, -3817, -3780, -3823, -3834, -3819, -3834, -3823, -3824, -3834, 29006, -31617, 28596, -3834, -3813, -3817, -3823, -3838, -3840, -3817, -3780, -3838, -3821, -3832, -3780, -3824, -3828, -3823, -3817, -3780, -3839, -3814, -26584, 30507, 27825, -32552, 30023, -23376, 30804, 27151, -23029, -26972, 32306, -30807, 28400, -31687, -16550, -29050, -27843, 26452, -3838, -3821, -3832, -3824, -3816, -3806, -3795, -3810, -3780, -3816, -3806, -3787, -3810, -3763, -3838, -3821, -3832, -3834, -3813, -3817, -3823, -3838, -3840, -3817, -3780, -3838, -3821, -3832, -3780, -3821, -3838, -3817, -3817, -3834, -3823, -3827, -3834, -3838, -3834, -3824, -3819, 30114, 28935, -25872, -24485, 25216, 29664, 25900, -23759, 25562, -30758, -27829, 26893, 7761, 9860, 9913, 9909, 9907, 9888, 9890, 9909, 9856, 9905, 9905, 9856, 9890, 9909, 9896, 9911, 9896, 9909, 9912};
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -274736248;
        int i6 = RunnableC3055.f9898;
        int i7 = C1321.f4751;
        int iM3169 = C0773.m3169("ۚܺ") ^ i6;
        int i8 = ((iM3169 ^ i7) * 5481) ^ 306689478;
        int i9 = -210150245;
        while (true) {
            i5 = ((((i5 ^ i7) * (-21949)) >> 31) & i8) ^ (iM3169 ^ i9);
            switch (i5) {
                case -2109643982:
                case 315181887:
                    if (C17202.m40372()) {
                        iM3169 = C0619.m2761("ۜ᩻") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-13553)) ^ 1082745920;
                        i9 = 372738365;
                    } else {
                        iM3169 = (C0619.m2761("ۙۧ") + i6) * (-43);
                        i8 = ((iM3169 ^ i7) * 23235) ^ 1818467452;
                        i9 = 517813883;
                    }
                    break;
                case -2004956975:
                case -44996132:
                    if (RunnableC3055.f9898 < 0) {
                        iM3169 = (C0773.m3169("ܰۜ") + i7) * (-55);
                        i8 = ((iM3169 ^ i6) * (-6743)) ^ (-2050063916);
                        i9 = 840047664;
                    } else {
                        iM3169 = (i6 - C0773.m3169("֡᩸")) * 91;
                        i8 = ((iM3169 ^ i7) * 32699) ^ (-534397190);
                        i9 = -1533665325;
                    }
                    break;
                case -1958096789:
                case -940621696:
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0619.m2761("ۗ۟") + i7) * (-97);
                        i8 = ((iM3169 ^ i6) * (-175)) ^ 351879020;
                        i9 = 613200369;
                    } else {
                        iM3169 = C0619.m2761("ۧ۠") ^ i6;
                        i8 = ((iM3169 ^ i7) * 13695) ^ (-334965545);
                        i9 = -120233886;
                    }
                    break;
                case -1938409132:
                case 2091764679:
                    if (C1542.f5343 <= 0) {
                        iM3169 = (i6 - C0773.m3169("֡᩸")) * 91;
                        i8 = ((iM3169 ^ i7) * 32699) ^ (-534397190);
                        i9 = -1533665325;
                    } else {
                        iM3169 = (i7 - C0773.m3169("ۧ֫")) * (-47);
                        i8 = ((iM3169 ^ i6) * 21429) ^ 451311604;
                        i9 = -1376253177;
                    }
                    break;
                case -1668115508:
                case 356035386:
                    C1564.m5509();
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0619.m2761("ۙۧ") + i6) * (-43);
                        i8 = ((iM3169 ^ i7) * 23235) ^ 1818467452;
                        i9 = 517813883;
                    } else {
                        iM3169 = (C0619.m2761("ۗ۟") + i7) * (-97);
                        i8 = ((iM3169 ^ i6) * (-175)) ^ 351879020;
                        i9 = 613200369;
                    }
                    break;
                case -1330661031:
                case 239110969:
                    if (C0950.m3785() == 0) {
                        iM3169 = (C0619.m2761("ۤۙ") + i7) * 51;
                        i8 = ((iM3169 ^ i6) * (-21465)) ^ 2032833413;
                        i9 = 2050033456;
                    } else {
                        iM3169 = (C0773.m3169("ᩴ֡") + i6) * 39;
                        i8 = ((iM3169 ^ i7) * 22451) ^ 1775701609;
                        i9 = 580499110;
                    }
                    break;
                case -1048448471:
                case -78851700:
                    C3077.m10041();
                    throw new RuntimeException();
                case -332872167:
                case 1371830471:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0619.m2761("ۗ۟") + i7) * (-97);
                        i8 = ((iM3169 ^ i6) * (-175)) ^ 351879020;
                        i9 = 613200369;
                    } else {
                        iM3169 = (C0619.m2761("᩺ᩴ") + i6) * (-51);
                        i8 = ((iM3169 ^ i7) * 10623) ^ (-240406864);
                        i9 = 658252769;
                    }
                    break;
                case -319267899:
                case 366868567:
                    i3 = 0;
                    if (C1564.m5509() <= 0) {
                        iM3169 = (C0619.m2761("ۙۧ") + i6) * (-43);
                        i8 = ((iM3169 ^ i7) * 23235) ^ 1818467452;
                        i9 = 517813883;
                    } else {
                        iM3169 = (C0619.m2761("ܺ֫") + i7) * 15;
                        i8 = ((iM3169 ^ i6) * (-26605)) ^ (-1987225606);
                        i9 = -339205891;
                    }
                    break;
                case -221824344:
                case 115652783:
                    if (C2834.f9334 > 0) {
                        iM3169 = (C0619.m2761("ۗ۟") + i7) * (-97);
                        i8 = ((iM3169 ^ i6) * (-175)) ^ 351879020;
                        i9 = 613200369;
                    } else {
                        iM3169 = (i6 - C0773.m3169("֡᩸")) * 91;
                        i8 = ((iM3169 ^ i7) * 32699) ^ (-534397190);
                        i9 = -1533665325;
                    }
                    break;
                case 183203235:
                case 684371305:
                    i4 = 1;
                    if (C0269.f1558 <= 0) {
                        iM3169 = (C0773.m3169("ᩴ֡") + i6) * 39;
                        i8 = ((iM3169 ^ i7) * 22451) ^ 1775701609;
                        i9 = 580499110;
                    } else {
                        iM3169 = (C0773.m3169("ᩴۨ") ^ i6) * 63;
                        i8 = ((iM3169 ^ i7) * 22121) ^ (-1968733740);
                        i9 = -1254414757;
                    }
                    break;
                case 426078399:
                case 1096571278:
                    i = 4;
                    i2 = 3;
                    if (RunnableC3055.m9933() != 0) {
                        iM3169 = (C0773.m3169("ᩴ֡") + i6) * 39;
                        i8 = ((iM3169 ^ i7) * 22451) ^ 1775701609;
                        i9 = 580499110;
                    } else {
                        iM3169 = C0619.m2761("ۙ۟") ^ i6;
                        i8 = ((iM3169 ^ i7) * 5845) ^ 688284353;
                        i9 = -1112691490;
                    }
                    break;
                case 686336203:
                case 1025942140:
                    f25869 = new int[]{i3, i4, 2, i, i2};
                    return;
                case 1173023145:
                case 1251047392:
                    if (C2375.f7641 <= 0) {
                        iM3169 = (C0773.m3169("ᩴ֡") + i6) * 39;
                        i8 = ((iM3169 ^ i7) * 22451) ^ 1775701609;
                        i9 = 580499110;
                    } else {
                        iM3169 = (i6 - C0773.m3169("۠᩵")) * 77;
                        i8 = ((iM3169 ^ i7) * 425) ^ (-1132109110);
                        i9 = -2036975322;
                    }
                    break;
                case 1471250556:
                case 1763994416:
                    if (C1519.f5300 >= 0) {
                        iM3169 = (C0773.m3169("ᩴ֡") + i6) * 39;
                        i8 = ((iM3169 ^ i7) * 22451) ^ 1775701609;
                        i9 = 580499110;
                    } else {
                        iM3169 = (C0773.m3169("ۜ᩹") + i7) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i8 = ((iM3169 ^ i6) * (-3421)) ^ (-1318759542);
                        i9 = 1707931393;
                    }
                    break;
                default:
                    C1564.m5509();
                    C1542.m5459();
                    iM3169 = (C0619.m2761("ۗ۟") + i7) * (-97);
                    i8 = ((iM3169 ^ i6) * (-175)) ^ 351879020;
                    i9 = 613200369;
                    break;
            }
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC3409, l.ActivityC5577, android.app.Activity, l.InterfaceC24530
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = -588254175;
        int i3 = C1146.f4234;
        int i4 = AbstractC0116.f1064;
        int iM3169 = C0773.m3169("۬۫") ^ i3;
        int i5 = ((iM3169 ^ i4) * (-10349)) ^ 94119517;
        int i6 = 474305973;
        while (true) {
            i2 = ((((i2 ^ i4) * 22963) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2054108338:
                case -825218626:
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0773.m3169("ۢ᩻") ^ i3;
                        i5 = ((iM3169 ^ i4) * 17147) ^ 1043081332;
                        i6 = -1261720624;
                    } else {
                        iM3169 = (C0773.m3169("ܶܳ") + i4) * 77;
                        i5 = ((iM3169 ^ i3) * (-27983)) ^ 1566541678;
                        i6 = 1262243491;
                    }
                    break;
                case -1478857044:
                case -361347641:
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0773.m3169("ܶܳ") + i4) * 77;
                        i5 = ((iM3169 ^ i3) * (-27983)) ^ 1566541678;
                        i6 = 1262243491;
                    } else {
                        iM3169 = C0773.m3169("ۙ֡") ^ i4;
                        i5 = ((iM3169 ^ i3) * 21149) ^ 1382151587;
                        i6 = 542952318;
                    }
                    break;
                case -1446151836:
                case 128365083:
                    if (i == 23680) {
                        iM3169 = (C0619.m2761("ܽᩴ") + i4) * 59;
                        i5 = ((iM3169 ^ i3) * (-22595)) ^ (-692284026);
                        i6 = -343771083;
                    } else {
                        iM3169 = C0773.m3169("۠ᩳ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 10123) ^ (-1056667007);
                        i6 = -1802589472;
                    }
                    break;
                case -1405299000:
                case -1384108218:
                    if (C0950.m3785() != 0) {
                        iM3169 = (C0619.m2761("᩵ۙ") ^ i3) * 13;
                        i5 = ((iM3169 ^ i4) * 4653) ^ 1189497181;
                        i6 = 1746619308;
                    } else {
                        iM3169 = C0619.m2761("ۢ֡") ^ i4;
                        i5 = ((iM3169 ^ i3) * 7733) ^ 1609954952;
                        i6 = 133800068;
                    }
                    break;
                case -1201388414:
                case 78780939:
                    if (RunnableC3646.m11813() == 0) {
                        iM3169 = (i4 - C0773.m3169("ۜ᩶")) * 29;
                        i5 = ((iM3169 ^ i3) * (-4571)) ^ (-1988000614);
                        i6 = 1566218454;
                    } else {
                        iM3169 = (C0773.m3169("ܶܳ") + i4) * 77;
                        i5 = ((iM3169 ^ i3) * (-27983)) ^ 1566541678;
                        i6 = 1262243491;
                    }
                    break;
                case -1098479561:
                case 608366378:
                    if (RunnableC1848.f6235) {
                        iM3169 = (i4 - C0773.m3169("ۜ᩶")) * 29;
                        i5 = ((iM3169 ^ i3) * (-4571)) ^ (-1988000614);
                        i6 = 1566218454;
                    } else {
                        iM3169 = (C0773.m3169("ۤ᩶") + i3) * 65;
                        i5 = ((iM3169 ^ i4) * (-32127)) ^ (-79127613);
                        i6 = -1665777061;
                    }
                    break;
                case -273274799:
                case 1541155809:
                    if (C2878.f9462) {
                        iM3169 = (i4 - C0619.m2761("ۜۙ")) * (-11);
                        i5 = ((iM3169 ^ i3) * (-27255)) ^ (-1659426847);
                        i6 = 476360437;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۨܽ")) * (-85);
                        i5 = ((iM3169 ^ i3) * (-31083)) ^ (-1983071740);
                        i6 = -1504079914;
                    }
                    break;
                case -134424450:
                case 1751177985:
                    if (C2878.f9462) {
                        iM3169 = (i4 - C0619.m2761("ۜۙ")) * (-11);
                        i5 = ((iM3169 ^ i3) * (-27255)) ^ (-1659426847);
                        i6 = 476360437;
                    } else {
                        iM3169 = (C0773.m3169("ۢ᩷") + i3) * (-121);
                        i5 = ((iM3169 ^ i4) * 25799) ^ 760323867;
                        i6 = -583525466;
                    }
                    break;
                case 65505223:
                case 632539450:
                    if (C1519.m5403()) {
                        iM3169 = C0619.m2761("۫ܰ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-24881)) ^ 1211514065;
                        i6 = -904567994;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۜ᩶")) * 29;
                        i5 = ((iM3169 ^ i3) * (-4571)) ^ (-1988000614);
                        i6 = 1566218454;
                    }
                    break;
                case 417083860:
                case 854463429:
                    this.f25892 = false;
                    mo4897();
                    break;
                case 477437471:
                case 1799523801:
                    if (C2702.f8586 <= 0) {
                        iM3169 = (i4 - C0773.m3169("ۜ᩶")) * 29;
                        i5 = ((iM3169 ^ i3) * (-4571)) ^ (-1988000614);
                        i6 = 1566218454;
                    } else {
                        iM3169 = (C0619.m2761("ᩴۧ") + i3) * (-47);
                        i5 = ((iM3169 ^ i4) * (-28159)) ^ 1754379218;
                        i6 = 1936305858;
                    }
                    break;
                case 620174193:
                case 1430431391:
                    super.onRequestPermissionsResult(i, strArr, iArr);
                    break;
                case 708653196:
                case 966516398:
                    if (C1564.f5401 > 0) {
                        iM3169 = (C0619.m2761("᩵ۙ") ^ i3) * 13;
                        i5 = ((iM3169 ^ i4) * 4653) ^ 1189497181;
                        i6 = 1746619308;
                    } else {
                        iM3169 = (C0773.m3169("ܶܳ") + i4) * 77;
                        i5 = ((iM3169 ^ i3) * (-27983)) ^ 1566541678;
                        i6 = 1262243491;
                    }
                    break;
                case 734250519:
                case 1258892999:
                    if (C17202.f56030) {
                        iM3169 = C0773.m3169("ۖۜ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 19809) ^ 227118526;
                        i6 = 409680229;
                    } else {
                        iM3169 = (C0773.m3169("ܶܳ") + i4) * 77;
                        i5 = ((iM3169 ^ i3) * (-27983)) ^ 1566541678;
                        i6 = 1262243491;
                    }
                    break;
                case 1262540836:
                case 1404801359:
                    if (C4282.f15546 <= 0) {
                        iM3169 = (i4 - C0619.m2761("ۜۙ")) * (-11);
                        i5 = ((iM3169 ^ i3) * (-27255)) ^ (-1659426847);
                        i6 = 476360437;
                    } else {
                        iM3169 = C0773.m3169("ܿۢ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 14443) ^ 1249697487;
                        i6 = -341470624;
                    }
                    break;
                case 1356429983:
                case 1990981318:
                    C2287.m7745();
                    C3492.m11488();
                    break;
                case 1932688869:
                case 2053955809:
                    if (C0773.m3161() != 0) {
                        iM3169 = C0773.m3169("ۢ᩻") ^ i3;
                        i5 = ((iM3169 ^ i4) * 17147) ^ 1043081332;
                        i6 = -1261720624;
                    } else {
                        iM3169 = (C0619.m2761("ۗۨ") + i4) * 45;
                        i5 = ((iM3169 ^ i3) * 19517) ^ 1886193152;
                        i6 = -772158104;
                    }
                    break;
                default:
                    RunnableC0334.m2063();
                    iM3169 = (C0773.m3169("ܶܳ") + i4) * 77;
                    i5 = ((iM3169 ^ i3) * (-27983)) ^ 1566541678;
                    i6 = 1262243491;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21217(ViewOnClickListenerC7793 viewOnClickListenerC7793, int i) {
        int[] iArr = null;
        int i2 = 643524928;
        int i3 = C2375.f7641;
        int i4 = C1542.f5343;
        int iM3169 = C0773.m3169("۬᩸") ^ i3;
        int i5 = ((iM3169 ^ i4) * 30119) ^ (-224485855);
        int i6 = 2132327121;
        while (true) {
            i2 = ((((i2 ^ i4) * 25497) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2127607572:
                case -2010705039:
                    iArr = f25869;
                    if (C2288.f7433 <= 0) {
                        iM3169 = (C0773.m3169("ۜ۟") ^ i3) * (-77);
                        i5 = ((iM3169 ^ i4) * (-22927)) ^ 279313226;
                        i6 = -1039350066;
                    } else {
                        iM3169 = C0619.m2761("᩻۫") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-609)) ^ (-340891481);
                        i6 = -959557279;
                    }
                    break;
                case -2030841513:
                case -1525755374:
                    if (C2485.f7950 != 0) {
                        iM3169 = (C0619.m2761("ۤۙ") + i4) * (-75);
                        i5 = ((iM3169 ^ i3) * 15549) ^ (-158427143);
                        i6 = -20639551;
                    } else {
                        iM3169 = C0773.m3169("۟ۚ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-31413)) ^ (-774129431);
                        i6 = -1737268434;
                    }
                    break;
                case -1937482725:
                case -1521052493:
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0619.m2761("ۤۙ") + i4) * (-75);
                        i5 = ((iM3169 ^ i3) * 15549) ^ (-158427143);
                        i6 = -20639551;
                    } else {
                        iM3169 = (C0619.m2761("ۛ۟") + i3) * 83;
                        i5 = ((iM3169 ^ i4) * (-15885)) ^ (-2140191311);
                        i6 = 1285387824;
                    }
                    break;
                case -1725820516:
                case 675753389:
                    if (C3492.f12043 <= 0) {
                        iM3169 = (C0773.m3169("ۜ۟") ^ i3) * (-77);
                        i5 = ((iM3169 ^ i4) * (-22927)) ^ 279313226;
                        i6 = -1039350066;
                    } else {
                        iM3169 = (C0773.m3169("ܳܳ") + i3) * 49;
                        i5 = ((iM3169 ^ i4) * (-7657)) ^ 1337323289;
                        i6 = -315286006;
                    }
                    break;
                case -1406186738:
                case -587860276:
                    C2310.m7813();
                    if (C0950.m3785() == 0) {
                        iM3169 = (i3 - C0773.m3169("۫᩶")) * 77;
                        i5 = ((iM3169 ^ i4) * 27197) ^ (-1772015375);
                        i6 = 1732723498;
                    } else {
                        iM3169 = (C0619.m2761("ۤۙ") + i4) * (-75);
                        i5 = ((iM3169 ^ i3) * 15549) ^ (-158427143);
                        i6 = -20639551;
                    }
                    break;
                case -1307312440:
                case 2064065268:
                    viewOnClickListenerC7793.f25893 = iArr[i];
                    break;
                case -1275880061:
                case 2053099337:
                    if (C3448.m11248() != 0) {
                        iM3169 = (i3 - C0773.m3169("۫᩶")) * 77;
                        i5 = ((iM3169 ^ i4) * 27197) ^ (-1772015375);
                        i6 = 1732723498;
                    } else {
                        iM3169 = C0619.m2761("֫ᩳ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-7977)) ^ (-42583163);
                        i6 = 218955430;
                    }
                    break;
                case -1037166625:
                case 1106080412:
                    if (C2288.f7433 <= 0) {
                        iM3169 = (C0619.m2761("ۤۙ") + i4) * (-75);
                        i5 = ((iM3169 ^ i3) * 15549) ^ (-158427143);
                        i6 = -20639551;
                    } else {
                        iM3169 = C0773.m3169("۫ۨ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 10913) ^ 796913601;
                        i6 = 729585595;
                    }
                    break;
                case -1007637231:
                case 2128153620:
                    C3998.m12920();
                    C2702.m8876();
                    iM3169 = C0773.m3169("۫ۨ") ^ i3;
                    i5 = ((iM3169 ^ i4) * 10913) ^ 796913601;
                    i6 = 729585595;
                    break;
                case -324195188:
                case 810762495:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (C0773.m3169("ۘۙ") ^ i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM3169 ^ i3) * (-9887)) ^ 695325158;
                        i6 = -1087829999;
                    } else {
                        iM3169 = (C0619.m2761("ܿ֫") ^ i4) * (-47);
                        i5 = ((iM3169 ^ i3) * (-26895)) ^ 398841121;
                        i6 = 578773203;
                    }
                    break;
                case 186859076:
                case 493779768:
                    if (C0619.f2439) {
                        iM3169 = (C0619.m2761("ۤۙ") + i4) * (-75);
                        i5 = ((iM3169 ^ i3) * 15549) ^ (-158427143);
                        i6 = -20639551;
                    } else {
                        iM3169 = C0619.m2761("ܺ֫") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-14905)) ^ 1667661837;
                        i6 = -800902143;
                    }
                    break;
                case 197582756:
                case 667863946:
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0773.m3169("۫ۨ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 10913) ^ 796913601;
                        i6 = 729585595;
                    } else {
                        iM3169 = (C0619.m2761("ܽܶ") ^ i3) * 97;
                        i5 = ((iM3169 ^ i4) * (-28839)) ^ (-1154904944);
                        i6 = 1428659416;
                    }
                    break;
                case 289692808:
                case 455948032:
                    AbstractC3624.m11755();
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0773.m3169("ۘۙ") ^ i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM3169 ^ i3) * (-9887)) ^ 695325158;
                        i6 = -1087829999;
                    } else {
                        iM3169 = C0773.m3169("۫ۨ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 10913) ^ 796913601;
                        i6 = 729585595;
                    }
                    break;
                case 825053014:
                case 1604509343:
                    C1321.m4852();
                    break;
                case 1148056738:
                case 1359328732:
                    if (C2485.f7950 != 0) {
                        iM3169 = (C0773.m3169("ۘۙ") ^ i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM3169 ^ i3) * (-9887)) ^ 695325158;
                        i6 = -1087829999;
                    } else {
                        iM3169 = (i4 - C0619.m2761("۬֡")) * (-121);
                        i5 = ((iM3169 ^ i3) * (-5859)) ^ 292815133;
                        i6 = -197488045;
                    }
                    break;
                default:
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0619.m2761("ۤۙ") + i4) * (-75);
                        i5 = ((iM3169 ^ i3) * 15549) ^ (-158427143);
                        i6 = -20639551;
                    } else {
                        iM3169 = C0773.m3169("ᩴ᩷") ^ i4;
                        i5 = ((iM3169 ^ i3) * 23793) ^ (-1095601941);
                        i6 = -934427069;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x0158 A[PHI: r3 r5
      0x0158: PHI (r3v3 java.lang.Integer) = (r3v1 java.lang.Integer), (r3v2 java.lang.Integer), (r3v1 java.lang.Integer), (r3v1 java.lang.Integer) binds: [B:42:0x0156, B:32:0x00f9, B:12:0x006b, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0158: PHI (r5v3 java.lang.String) = (r5v2 java.lang.String), (r5v1 java.lang.String), (r5v1 java.lang.String), (r5v1 java.lang.String) binds: [B:42:0x0156, B:32:0x00f9, B:12:0x006b, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x018f A[PHI: r7 r14 r15
      0x018f: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:46:0x018d, B:14:0x006f, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r14v3 short[]) = (r14v2 short[]), (r14v1 short[]), (r14v1 short[]) binds: [B:46:0x018d, B:14:0x006f, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r15v3 int) = (r15v2 int), (r15v1 int), (r15v1 int) binds: [B:46:0x018d, B:14:0x006f, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x024c A[PHI: r2 r12 r19 r24
      0x024c: PHI (r2v4 int) = (r2v1 int), (r2v1 int), (r2v1 int), (r2v7 int) binds: [B:61:0x024a, B:9:0x0062, B:6:0x0059, B:37:0x011e] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r12v4 short) = (r12v2 short), (r12v1 short), (r12v1 short), (r12v1 short) binds: [B:61:0x024a, B:9:0x0062, B:6:0x0059, B:37:0x011e] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r19v5 int) = (r19v3 int), (r19v2 int), (r19v2 int), (r19v2 int) binds: [B:61:0x024a, B:9:0x0062, B:6:0x0059, B:37:0x011e] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r24v3 int) = (r24v1 int), (r24v1 int), (r24v1 int), (r24v5 int) binds: [B:61:0x024a, B:9:0x0062, B:6:0x0059, B:37:0x011e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0283 A[PHI: r4 r18 r25
      0x0283: PHI (r4v2 java.lang.Object[]) = (r4v1 java.lang.Object[]), (r4v3 java.lang.Object[]) binds: [B:65:0x0281, B:28:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x0283: PHI (r18v4 short) = (r18v3 short), (r18v2 short) binds: [B:65:0x0281, B:28:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x0283: PHI (r25v5 short) = (r25v4 short), (r25v3 short) binds: [B:65:0x0281, B:28:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x02b9 A[PHI: r6 r8 r10 r11 r16 r17
      0x02b9: PHI (r6v3 int) = (r6v1 int), (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:69:0x02b7, B:24:0x00b5, B:20:0x0094, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x02b9: PHI (r8v4 short[]) = (r8v2 short[]), (r8v3 short[]), (r8v2 short[]), (r8v2 short[]) binds: [B:69:0x02b7, B:24:0x00b5, B:20:0x0094, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x02b9: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:69:0x02b7, B:24:0x00b5, B:20:0x0094, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x02b9: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:69:0x02b7, B:24:0x00b5, B:20:0x0094, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x02b9: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:69:0x02b7, B:24:0x00b5, B:20:0x0094, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x02b9: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:69:0x02b7, B:24:0x00b5, B:20:0x0094, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public void m21229() {
        int iM2761;
        int i;
        int i2;
        int i3 = 0;
        Integer numM3159 = null;
        Object[] objArr = null;
        String strM6310 = null;
        int iM2762 = 0;
        short s = 0;
        int i4 = 0;
        short[] sArr = null;
        int i5 = 0;
        int i6 = 1829526342;
        int i7 = C2288.f7433;
        int i8 = C2702.f8586;
        int iM3169 = (C0773.m3169("۫ۨ") + i7) * (-47);
        int i9 = ((iM3169 ^ i8) * 11597) ^ (-1728753638);
        int i10 = iM3169 ^ (-568909595);
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        short s2 = 0;
        int i14 = 0;
        int i15 = 0;
        short s3 = 0;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i8) * (-15149)) >> 31));
            switch (i6) {
                case -2138835763:
                case -302517848:
                    int i16 = this.f25880.f39450;
                    i3 = this.f25872.f39450;
                    if (C2702.f8586 <= 0) {
                        i15 = i16;
                        iM2761 = (C0773.m3169("ܿ֡") ^ i8) * 83;
                        i = ((iM2761 ^ i7) * 13419) ^ (-1789785584);
                        i2 = 54057887;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                    } else {
                        int iM31610 = (i7 - C0773.m3169("ۡ۠")) * 99;
                        i9 = ((iM31610 ^ i8) * 15783) ^ 110156947;
                        i15 = i16;
                        i10 = iM31610 ^ 202095485;
                    }
                    break;
                case -2050974565:
                case -1955402885:
                    s3 = sArr2[c];
                    s2 = 5179;
                    if (C1826.f6190 <= 0) {
                        iM2761 = (C0773.m3169("ۘۛ") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2761 ^ i8) * (-15321)) ^ (-1795367335);
                        i2 = 356154205;
                    } else {
                        iM2761 = (i8 - C0619.m2761("۫ۖ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2761 ^ i7) * 17217) ^ (-585922813);
                        i2 = 691936409;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -1993868873:
                case -673067582:
                    if (this.f25886) {
                        iM2761 = C0619.m2761("᩹᩶") ^ i8;
                        i = ((iM2761 ^ i7) * (-12085)) ^ (-132912719);
                        i2 = -1516611319;
                    } else {
                        iM2761 = C0773.m3169("ܿ᩸") ^ i8;
                        i = ((iM2761 ^ i7) * 25849) ^ 719839097;
                        i2 = 1548815937;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -1834426840:
                case -1210348502:
                    C2419.m8174();
                    if (C3077.f9998) {
                        iM2761 = (C0773.m3169("ܿ֡") ^ i8) * 83;
                        i = ((iM2761 ^ i7) * 13419) ^ (-1789785584);
                        i2 = 54057887;
                    } else {
                        iM2761 = C0773.m3169("֨᩻") ^ i7;
                        i = ((iM2761 ^ i8) * (-10825)) ^ (-2048267831);
                        i2 = -1582957358;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -1562642011:
                case 339677924:
                    sArr = f25870;
                    i5 = 311;
                    i11 = 3;
                    if (C0269.m1775() <= 0) {
                        iM2761 = C0619.m2761("ۧۧ") ^ i8;
                        i = ((iM2761 ^ i7) * (-6491)) ^ 70552188;
                        i2 = 641082315;
                    } else {
                        iM2761 = C0773.m3169("᩶֡") ^ i7;
                        i = ((iM2761 ^ i8) * 29545) ^ (-967382405);
                        i2 = -1920002181;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -1325328330:
                case 1461915910:
                    setTitle(C0773.m3169(strM6310) ^ 2121926470);
                    break;
                case -1199067080:
                case 2022866629:
                    C1321.m4852();
                    if (C3033.f9831 < 0) {
                        iM2761 = C0619.m2761("ۧۧ") ^ i8;
                        i = ((iM2761 ^ i7) * (-6491)) ^ 70552188;
                        i2 = 641082315;
                    } else {
                        iM2761 = C0773.m3169("֨᩻") ^ i7;
                        i = ((iM2761 ^ i8) * (-10825)) ^ (-2048267831);
                        i2 = -1582957358;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -1108915266:
                case 159097735:
                    numM3159 = C0773.m3159(i15 + i3);
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0773.m3169("֨᩻") ^ i7;
                        i = ((iM2761 ^ i8) * (-10825)) ^ (-2048267831);
                        i2 = -1582957358;
                    } else {
                        iM2761 = C0619.m2761("ۗۧ") ^ i8;
                        i = ((iM2761 ^ i7) * 21553) ^ (-379329310);
                        i2 = 1879806414;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -1007218084:
                case 1564596011:
                    C2834.m9344();
                    C2375.m8065();
                    iM2761 = C0619.m2761("ۧۧ") ^ i8;
                    i = ((iM2761 ^ i7) * (-6491)) ^ 70552188;
                    i2 = 641082315;
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -917959217:
                case 1323375535:
                    iM2762 = C0619.m2761(C2023.m6966(sArr3, i12, i13, i4));
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0773.m3169("ᩳ᩷") ^ i8;
                        i = ((iM2761 ^ i7) * (-4839)) ^ 1305631231;
                        i2 = -624592912;
                    } else {
                        iM2761 = C0619.m2761("۬۬") ^ i7;
                        i = ((iM2761 ^ i8) * 9877) ^ 160967345;
                        i2 = -1343899394;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -843627997:
                case 1165367271:
                    setTitle(C13473.m33142(this, 2128176926 ^ iM2762, objArr));
                    break;
                case -569055006:
                case 1964158104:
                    i4 = 41475;
                    iM2761 = (C0773.m3169("ܽۙ") + i8) * 5;
                    i = ((iM2761 ^ i7) * (-7989)) ^ 1263815682;
                    i2 = -1110522086;
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -557382201:
                case 356316144:
                    int i17 = s3 + s2;
                    i14 = i17 * i17;
                    s = 20716;
                    if (C3492.f12043 <= 0) {
                        iM2761 = (C0773.m3169("ܿ֡") ^ i8) * 83;
                        i = ((iM2761 ^ i7) * 13419) ^ (-1789785584);
                        i2 = 54057887;
                    } else {
                        iM2761 = (C0619.m2761("᩵۠") + i8) * 17;
                        i = ((iM2761 ^ i7) * 4399) ^ 377363336;
                        i2 = -264857325;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -270661171:
                case 949239980:
                    strM6310 = C1826.m6310(sArr, i5, i11, i4);
                    if (C17202.m40372()) {
                        iM2761 = C0619.m2761("᩵֡") ^ i7;
                        i = ((iM2761 ^ i8) * 21743) ^ (-1990300621);
                        i2 = 896667543;
                    } else {
                        iM2761 = C0773.m3169("֨᩻") ^ i7;
                        i = ((iM2761 ^ i8) * (-10825)) ^ (-2048267831);
                        i2 = -1582957358;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case 282656938:
                case 1096921348:
                    sArr3 = f25870;
                    i12 = 314;
                    i13 = 3;
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0773.m3169("ᩳ᩷") ^ i8;
                        i = ((iM2761 ^ i7) * (-4839)) ^ 1305631231;
                        i2 = -624592912;
                    } else {
                        iM2761 = C0619.m2761("۬᩻") ^ i8;
                        i = ((iM2761 ^ i7) * (-2457)) ^ 602725538;
                        i2 = 110038300;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case 520673569:
                case 946187394:
                    objArr = new Object[]{numM3159};
                    if (C13473.f42873 != 0) {
                        iM2761 = (C0773.m3169("ۘۛ") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2761 ^ i8) * (-15321)) ^ (-1795367335);
                        i2 = 356154205;
                    } else {
                        iM2761 = C0773.m3169("ۢ֡") ^ i7;
                        i = ((iM2761 ^ i8) * 29855) ^ 647061772;
                        i2 = 590564518;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case 752156991:
                case 821545867:
                    sArr2 = f25870;
                    c = 310;
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0773.m3169("ᩳ᩷") ^ i8;
                        i = ((iM2761 ^ i7) * (-4839)) ^ 1305631231;
                        i2 = -624592912;
                    } else {
                        iM2761 = (C0619.m2761("ۘ᩵") + i7) * 87;
                        i = ((iM2761 ^ i8) * (-5037)) ^ (-1546876898);
                        i2 = -514941811;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case 1031862490:
                case 1067636260:
                    if (i14 - (s3 * s) >= 0) {
                        iM2761 = (i7 - C0773.m3169("۟ۘ")) * 97;
                        i = ((iM2761 ^ i8) * (-10809)) ^ (-361678478);
                        i2 = -1629915674;
                    } else {
                        iM2761 = C0773.m3169("ܽ۬") ^ i7;
                        i = ((iM2761 ^ i8) * (-8969)) ^ 1116916343;
                        i2 = 92390889;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case 1741882875:
                case 1865686894:
                    i4 = 24842;
                    iM2761 = (C0773.m3169("ܽۙ") + i8) * 5;
                    i = ((iM2761 ^ i7) * (-7989)) ^ 1263815682;
                    i2 = -1110522086;
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case 1851267223:
                case 2005491790:
                    C3998.m12920();
                    C2702.m8876();
                    break;
                default:
                    C3033.m9845();
                    if (C1080.f3865 < 0) {
                        iM2761 = (C0773.m3169("ܿ֡") ^ i8) * 83;
                        i = ((iM2761 ^ i7) * 13419) ^ (-1789785584);
                        i2 = 54057887;
                    } else {
                        iM2761 = C0773.m3169("ᩳ᩷") ^ i8;
                        i = ((iM2761 ^ i7) * (-4839)) ^ 1305631231;
                        i2 = -624592912;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21197(ViewOnClickListenerC7793 viewOnClickListenerC7793, long j, DialogInterfaceC8327 dialogInterfaceC8327) {
        int i = -2035274274;
        int i2 = C2354.f7599;
        int i3 = C2288.f7433;
        int iM3169 = C0773.m3169("ۧᩳ") ^ i3;
        int i4 = ((iM3169 ^ i2) * 10883) ^ 1411240758;
        int i5 = 130412877;
        while (true) {
            i = ((((i ^ i2) * 25647) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2144768026:
                case 176560274:
                    C25040.m55861(j);
                    if (viewOnClickListenerC7793.f25894 == dialogInterfaceC8327) {
                        iM3169 = C0773.m3169("ܶۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 7869) ^ 1757558128;
                        i5 = 2247586;
                    } else {
                        iM3169 = C0773.m3169("᩺֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15603) ^ 174994083;
                        i5 = 52477395;
                    }
                    break;
                case -2136667614:
                case -1324872455:
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0773.m3169("᩸᩺") ^ i3) * (-23);
                        i4 = ((iM3169 ^ i2) * (-9143)) ^ 869363423;
                        i5 = -1328863372;
                    } else {
                        iM3169 = C0773.m3169("֡۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 3617) ^ 1965097492;
                        i5 = 912644475;
                    }
                    break;
                case -1957903333:
                case 242284530:
                    AbstractC0116.m1243();
                    if (RunnableC1848.f6235) {
                        iM3169 = C0773.m3169("ۢ۬") ^ i2;
                        i4 = ((iM3169 ^ i3) * 21749) ^ (-1712061800);
                        i5 = 1079864061;
                    } else {
                        iM3169 = C0773.m3169("۫ᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32121) ^ (-253783048);
                        i5 = 1052629427;
                    }
                    break;
                case -1824289230:
                case -60882203:
                    break;
                case -1746190131:
                case -1196661865:
                    if (C3492.f12043 <= 0) {
                        iM3169 = (C0773.m3169("᩸᩺") ^ i3) * (-23);
                        i4 = ((iM3169 ^ i2) * (-9143)) ^ 869363423;
                        i5 = -1328863372;
                    } else {
                        iM3169 = (C0773.m3169("᩷ۤ") ^ i3) * (-107);
                        i4 = ((iM3169 ^ i2) * (-28977)) ^ 384329885;
                        i5 = 1180960372;
                    }
                    break;
                case -1704675325:
                case -1169400573:
                    C2310.m7813();
                    C0269.m1775();
                    iM3169 = C0773.m3169("۫ᩴ") ^ i2;
                    i4 = ((iM3169 ^ i3) * 32121) ^ (-253783048);
                    i5 = 1052629427;
                    break;
                case -1509595775:
                case 774722834:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0619.m2761("۟ܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32551) ^ (-1456810606);
                        i5 = 455872971;
                    } else {
                        iM3169 = C0619.m2761("ۙۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-30789)) ^ 1582557291;
                        i5 = -495217765;
                    }
                    break;
                case -1367522524:
                case -579689223:
                    if (C4238.m13540() <= 0) {
                        iM3169 = C0619.m2761("۟ܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32551) ^ (-1456810606);
                        i5 = 455872971;
                    } else {
                        iM3169 = C0619.m2761("۠᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-20485)) ^ 1579116290;
                        i5 = 1556948364;
                    }
                    break;
                case -1361239862:
                case 243277878:
                    C1080.m4050();
                    break;
                case -910981706:
                case 1651542673:
                    viewOnClickListenerC7793.f25894 = null;
                    iM3169 = C0773.m3169("᩺֫") ^ i2;
                    i4 = ((iM3169 ^ i3) * 15603) ^ 174994083;
                    i5 = 52477395;
                    break;
                case -904039831:
                case -790563714:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0619.m2761("۟ܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32551) ^ (-1456810606);
                        i5 = 455872971;
                    } else {
                        iM3169 = C0773.m3169("᩶ܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 963) ^ 568571466;
                        i5 = 684675450;
                    }
                    break;
                case -878716276:
                case -801259737:
                    C3998.m12920();
                    if (!C1080.m4050()) {
                        iM3169 = (C0773.m3169("᩸᩺") ^ i3) * (-23);
                        i4 = ((iM3169 ^ i2) * (-9143)) ^ 869363423;
                        i5 = -1328863372;
                    } else {
                        iM3169 = (C0773.m3169("ۢ֨") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM3169 ^ i2) * 7757) ^ 682011210;
                        i5 = -894644619;
                    }
                    break;
                case -298694781:
                case 309926194:
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0619.m2761("۟ܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32551) ^ (-1456810606);
                        i5 = 455872971;
                    } else {
                        iM3169 = C0619.m2761("ۖ֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * 24255) ^ 1535064033;
                        i5 = 560520418;
                    }
                    break;
                case 135611260:
                case 1050668359:
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0619.m2761("۟ܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32551) ^ (-1456810606);
                        i5 = 455872971;
                    } else {
                        iM3169 = C0619.m2761("ۙܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 6305) ^ 540397599;
                        i5 = -540934530;
                    }
                    break;
                case 195401370:
                case 1314130748:
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0773.m3169("ۢ֨") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM3169 ^ i2) * 7757) ^ 682011210;
                        i5 = -894644619;
                    } else {
                        iM3169 = (C0773.m3169("᩶ܺ") + i2) * (-7);
                        i4 = ((iM3169 ^ i3) * 28953) ^ (-1002936810);
                        i5 = -950768099;
                    }
                    break;
                case 1335962730:
                case 1990190748:
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0773.m3169("᩸᩺") ^ i3) * (-23);
                        i4 = ((iM3169 ^ i2) * (-9143)) ^ 869363423;
                        i5 = -1328863372;
                    } else {
                        iM3169 = C0773.m3169("ܶܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 15657) ^ 528907684;
                        i5 = 1881921711;
                    }
                    break;
                case 1704404604:
                case 2030347049:
                    if (C2419.f7754 >= 0) {
                        iM3169 = (C0773.m3169("᩸᩺") ^ i3) * (-23);
                        i4 = ((iM3169 ^ i2) * (-9143)) ^ 869363423;
                        i5 = -1328863372;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۘ᩸")) * 73;
                        i4 = ((iM3169 ^ i2) * 23889) ^ 1469224867;
                        i5 = 42777471;
                    }
                    break;
                default:
                    C0862.m3503();
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0773.m3169("᩸᩺") ^ i3) * (-23);
                        i4 = ((iM3169 ^ i2) * (-9143)) ^ 869363423;
                        i5 = -1328863372;
                    } else {
                        iM3169 = C0773.m3169("۫ᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32121) ^ (-253783048);
                        i5 = 1052629427;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5 A[PHI: r6
      0x00b5: PHI (r6v6 java.util.concurrent.atomic.AtomicInteger) = 
      (r6v5 java.util.concurrent.atomic.AtomicInteger)
      (r6v4 java.util.concurrent.atomic.AtomicInteger)
      (r6v4 java.util.concurrent.atomic.AtomicInteger)
     binds: [B:37:0x00b3, B:18:0x0047, B:16:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0142  */
    /* JADX WARN: Code duplicated, block: B:56:0x0174  */
    public ViewOnClickListenerC7793() {
        int iM2761;
        int i;
        int i2 = -1467887343;
        int i3 = C3099.f10023;
        int i4 = C1826.f6190;
        int iM3169 = (C0773.m3169("ᩳ֡") ^ i4) * (-43);
        int i5 = ((iM3169 ^ i3) * 13369) ^ (-635258858);
        int i6 = 153191372;
        while (true) {
            int i7 = iM3169 ^ i6;
            AtomicInteger atomicInteger = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-11151)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2121027274:
                    case 792623640:
                        if (C2023.m6964() > 0) {
                        }
                        iM2761 = (i3 - C0773.m3169("ۡ֨")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM2761 ^ i4) * 22449) ^ 1755307340;
                        i = 389787491;
                        i7 = iM2761 ^ i;
                        break;
                    case -2105527700:
                    case 948906186:
                        C13473.m33144();
                        throw new RuntimeException();
                    case -2023480213:
                    case 959898696:
                        if (C2834.f9334 <= 0) {
                            iM2761 = (C0773.m3169("֨ۨ") ^ i4) * (-9);
                            i5 = ((iM2761 ^ i3) * 13131) ^ (-967976509);
                            i = 1557149497;
                        } else {
                            iM2761 = (i3 - C0773.m3169("ܶܳ")) * (-33);
                            i5 = ((iM2761 ^ i4) * (-15703)) ^ 1531608628;
                            i = -1929044536;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1444192956:
                    case -445139512:
                        C3033.m9845();
                        iM2761 = C0773.m3169("᩵ܽ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-25779)) ^ 1692411155;
                        i = 1550393413;
                        i7 = iM2761 ^ i;
                        break;
                    case -566019346:
                    case 1934800654:
                        C11235.m28309();
                        if (C2023.m6964() > 0) {
                            iM2761 = (i3 - C0773.m3169("ۡ֨")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i5 = ((iM2761 ^ i4) * 22449) ^ 1755307340;
                            i = 389787491;
                        } else {
                            iM2761 = (i4 - C0619.m2761("ܶᩴ")) * q.h;
                            i5 = ((iM2761 ^ i3) * (-16459)) ^ 1040474915;
                            i = 1052586611;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -427658525:
                    case 1574779870:
                        if (C0487.f2131 > 0) {
                            atomicInteger = new AtomicInteger();
                            if (C2485.m8357() <= 0) {
                                iM2761 = C0773.m3169("᩵ܽ") ^ i4;
                                i5 = ((iM2761 ^ i3) * (-25779)) ^ 1692411155;
                                i = 1550393413;
                            } else {
                                iM2761 = (C0619.m2761("᩹ܿ") + i3) * 73;
                                i5 = ((iM2761 ^ i4) * 7477) ^ 1303531822;
                                i = 1724692723;
                            }
                            i7 = iM2761 ^ i;
                        }
                        break;
                    case -317066161:
                    case 674443820:
                        if (C1783.m6232()) {
                            this.f25882 = new AtomicInteger();
                            return;
                        }
                        iM2761 = (i4 - C0619.m2761("ܶᩴ")) * q.h;
                        i5 = ((iM2761 ^ i3) * (-16459)) ^ 1040474915;
                        i = 1052586611;
                        i7 = iM2761 ^ i;
                        break;
                    case -97578966:
                    case 960788951:
                        if (C2966.f9654 >= 0) {
                            iM2761 = (i4 - C0619.m2761("ܶᩴ")) * q.h;
                            i5 = ((iM2761 ^ i3) * (-16459)) ^ 1040474915;
                            i = 1052586611;
                        } else {
                            iM2761 = (C0773.m3169("ܺܽ") + i3) * 99;
                            i5 = ((iM2761 ^ i4) * 5791) ^ 951850611;
                            i = 1436004314;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 700059:
                    case 275672799:
                        if (C2878.f9462) {
                            iM2761 = (C0773.m3169("֨ۨ") ^ i4) * (-9);
                            i5 = ((iM2761 ^ i3) * 13131) ^ (-967976509);
                            i = 1557149497;
                        } else {
                            iM2761 = (C0773.m3169("ᩴ֡") ^ i4) * 17;
                            i5 = ((iM2761 ^ i3) * 8405) ^ (-518204383);
                            i = -1979525315;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 75350929:
                    case 811822404:
                        this.f25892 = true;
                        if (C2878.f9462) {
                            iM2761 = (i4 - C0619.m2761("ܶᩴ")) * q.h;
                            i5 = ((iM2761 ^ i3) * (-16459)) ^ 1040474915;
                            i = 1052586611;
                        } else {
                            iM2761 = (C0619.m2761("᩹۟") ^ i4) * 37;
                            i5 = ((iM2761 ^ i3) * 20479) ^ 1009378142;
                            i = 307958382;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 504041418:
                    case 2110616758:
                        if (C0862.f3233 != 0) {
                            iM2761 = C0773.m3169("᩵ܽ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-25779)) ^ 1692411155;
                            i = 1550393413;
                        } else {
                            iM2761 = (i3 - C0773.m3169("ۡ֨")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i5 = ((iM2761 ^ i4) * 22449) ^ 1755307340;
                            i = 389787491;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 1448688703:
                    case 1543415798:
                        this.f25887 = atomicInteger;
                        if (C3033.f9831 >= 0) {
                            iM2761 = (C0773.m3169("֨ۨ") ^ i4) * (-9);
                            i5 = ((iM2761 ^ i3) * 13131) ^ (-967976509);
                            i = 1557149497;
                        } else {
                            this.f25897 = new AtomicInteger();
                            if (C2966.f9654 >= 0) {
                                iM2761 = (i3 - C0773.m3169("ۡ֨")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                i5 = ((iM2761 ^ i4) * 22449) ^ 1755307340;
                                i = 389787491;
                            } else {
                                iM2761 = (i3 - C0773.m3169("ۗۢ")) * (-69);
                                i5 = ((iM2761 ^ i4) * 8113) ^ 2039973149;
                                i = 435046677;
                            }
                        }
                        i7 = iM2761 ^ i;
                        break;
                    default:
                        if (C13473.f42873 == 0) {
                            iM2761 = (C0619.m2761("ۙ֫") ^ i4) * 31;
                            i5 = ((iM2761 ^ i3) * 20909) ^ 516675316;
                            i = -782947736;
                            i7 = iM2761 ^ i;
                        }
                        break;
                }
            }
            iM3169 = C0619.m2761("᩷֫") ^ i3;
            i5 = ((iM3169 ^ i4) * 1389) ^ (-857899983);
            i6 = 721647516;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m21210(ViewOnClickListenerC7793 viewOnClickListenerC7793, int i, int i2, int i3, String str, String str2) {
        C3318 c3318 = null;
        int i4 = 1886479168;
        int i5 = C20932.f66974;
        int i6 = C2419.f7754;
        int iM3169 = C0773.m3169("ܶ۬") ^ i5;
        int i7 = ((iM3169 ^ i6) * 24769) ^ (-16778429);
        int i8 = 865551649;
        while (true) {
            i4 = ((((i4 ^ i6) * (-7397)) >> 31) & i7) ^ (iM3169 ^ i8);
            switch (i4) {
                case -1987789653:
                case 56585912:
                    if (C2702.f8586 <= 0) {
                        iM3169 = (C0773.m3169("ܺ۟") ^ i6) * 5;
                        i7 = ((iM3169 ^ i5) * (-13129)) ^ 1150015344;
                        i8 = -1556870443;
                    } else {
                        iM3169 = C0773.m3169("᩺ܺ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 7947) ^ 973417110;
                        i8 = -1017117467;
                    }
                    break;
                case -1956393732:
                case -525083189:
                    if (!C3998.m12914(str2, viewOnClickListenerC7793.f25872.f39446.f10828)) {
                        iM3169 = C0619.m2761("ۗ᩺") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-14703)) ^ 8444782;
                        i8 = -1776494199;
                    } else {
                        iM3169 = C0773.m3169("ۖۨ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 13385) ^ 714186801;
                        i8 = -1933385126;
                    }
                    break;
                case -1769892815:
                case -1179696123:
                    if (C1542.f5343 <= 0) {
                        iM3169 = (C0773.m3169("ܺ۟") ^ i6) * 5;
                        i7 = ((iM3169 ^ i5) * (-13129)) ^ 1150015344;
                        i8 = -1556870443;
                    } else {
                        iM3169 = C0619.m2761("֫ܰ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 3747) ^ 1758605293;
                        i8 = -1555512629;
                    }
                    break;
                case -1737215714:
                case -1628027121:
                    C0862.m3503();
                    if (C2485.f7950 == 0) {
                        iM3169 = C0773.m3169("ۧ۟") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-30315)) ^ (-47533521);
                        i8 = -376222314;
                    } else {
                        iM3169 = (i6 - C0619.m2761("ۛᩴ")) * 115;
                        i7 = ((iM3169 ^ i5) * (-19595)) ^ 842746921;
                        i8 = 1220122344;
                    }
                    break;
                case -1619910351:
                case 1596090126:
                    if (C0619.f2439) {
                        iM3169 = C0619.m2761("᩶ۨ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-30387)) ^ (-1907167132);
                        i8 = -678067240;
                    } else {
                        iM3169 = C0773.m3169("ۡ᩶") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-9557)) ^ 499046633;
                        i8 = 628876814;
                    }
                    break;
                case -1508970483:
                case 34020921:
                    return false;
                case -1131136194:
                case 765448798:
                    if (viewOnClickListenerC7793.f25872.f39446.f10824 == i3) {
                        iM3169 = (C0619.m2761("۠᩷") + i5) * (-41);
                        i7 = ((iM3169 ^ i6) * 9635) ^ (-2036176156);
                        i8 = 1139570706;
                    } else {
                        iM3169 = C0619.m2761("ۗ᩺") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-14703)) ^ 8444782;
                        i8 = -1776494199;
                    }
                    break;
                case -1127153777:
                case 631786157:
                    viewOnClickListenerC7793.m21238(0L);
                    return true;
                case -1092582084:
                case 98107851:
                    C20932.m47848();
                    C3998.m12920();
                    return false;
                case -1071151720:
                case 1726086038:
                    if (C1826.m6316(str, c3318.f10828)) {
                        iM3169 = C0619.m2761("᩵֨") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-8295)) ^ (-367475125);
                        i8 = -897831779;
                    } else {
                        iM3169 = C0619.m2761("ۗ᩺") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-14703)) ^ 8444782;
                        i8 = -1776494199;
                    }
                    break;
                case -957599460:
                case -769980593:
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0773.m3169("ۧ۟") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-30315)) ^ (-47533521);
                        i8 = -376222314;
                    } else {
                        iM3169 = (C0619.m2761("۫֨") + i6) * 81;
                        i7 = ((iM3169 ^ i5) * 31653) ^ 320467804;
                        i8 = 1934221647;
                    }
                    break;
                case -824673624:
                case 425421778:
                    if (C2375.m8065() <= 0) {
                        iM3169 = C0619.m2761("᩶ۨ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-30387)) ^ (-1907167132);
                        i8 = -678067240;
                    } else {
                        iM3169 = C0773.m3169("ۜ᩷") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-14405)) ^ 640175272;
                        i8 = 836266644;
                    }
                    break;
                case -674393176:
                case 1392839559:
                    if (i == C1519.m5400(viewOnClickListenerC7793.f25887)) {
                        iM3169 = (i6 - C0773.m3169("᩵ۙ")) * 21;
                        i7 = ((iM3169 ^ i5) * 2755) ^ 517270283;
                        i8 = 1121051417;
                    } else {
                        iM3169 = C0773.m3169("ۖۨ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 13385) ^ 714186801;
                        i8 = -1933385126;
                    }
                    break;
                case -582312983:
                case 263700798:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (C0773.m3169("ܺ۟") ^ i6) * 5;
                        i7 = ((iM3169 ^ i5) * (-13129)) ^ 1150015344;
                        i8 = -1556870443;
                    } else {
                        iM3169 = (i6 - C0773.m3169("᩵ۖ")) * 21;
                        i7 = ((iM3169 ^ i5) * 21877) ^ 1904294199;
                        i8 = 1653211834;
                    }
                    break;
                case -512902736:
                case 1804668436:
                    if (C2354.m7983()) {
                        iM3169 = (C0619.m2761("ۡۧ") + i6) * 77;
                        i7 = ((iM3169 ^ i5) * (-15011)) ^ (-1940297980);
                        i8 = 1169097434;
                    } else {
                        iM3169 = (i6 - C0619.m2761("ۛᩴ")) * 115;
                        i7 = ((iM3169 ^ i5) * (-19595)) ^ 842746921;
                        i8 = 1220122344;
                    }
                    break;
                case -284723220:
                case 157798398:
                    if (C1080.f3865 < 0) {
                        iM3169 = C0619.m2761("᩶ۨ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-30387)) ^ (-1907167132);
                        i8 = -678067240;
                    } else {
                        iM3169 = (i6 - C0619.m2761("ۛᩴ")) * 115;
                        i7 = ((iM3169 ^ i5) * (-19595)) ^ 842746921;
                        i8 = 1220122344;
                    }
                    break;
                case -44404625:
                case 553926994:
                    if (C0269.f1558 > 0) {
                        iM3169 = C0773.m3169("᩶᩵") ^ i5;
                        i7 = ((iM3169 ^ i6) * 10487) ^ (-847061823);
                        i8 = -1271283403;
                    } else {
                        iM3169 = (i6 - C0619.m2761("ۛᩴ")) * 115;
                        i7 = ((iM3169 ^ i5) * (-19595)) ^ 842746921;
                        i8 = 1220122344;
                    }
                    break;
                case 128609117:
                case 1935600615:
                    if (viewOnClickListenerC7793.m21234()) {
                        iM3169 = C0619.m2761("ۨ֡") ^ i6;
                        i7 = ((iM3169 ^ i5) * 29961) ^ (-540726619);
                        i8 = -350858442;
                    } else {
                        iM3169 = C0773.m3169("ۖۨ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 13385) ^ 714186801;
                        i8 = -1933385126;
                    }
                    break;
                case 217576478:
                case 1566572696:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0773.m3169("᩶᩵") ^ i5;
                        i7 = ((iM3169 ^ i6) * 10487) ^ (-847061823);
                        i8 = -1271283403;
                    } else {
                        iM3169 = C0619.m2761("ܶۚ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 22365) ^ 1985995131;
                        i8 = -878602415;
                    }
                    break;
                case 338177199:
                case 1239969578:
                    if (C3033.m9845() <= 0) {
                        iM3169 = C0773.m3169("ۧ۟") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-30315)) ^ (-47533521);
                        i8 = -376222314;
                    } else {
                        iM3169 = C0619.m2761("ۙ۠") ^ i5;
                        i7 = ((iM3169 ^ i6) * 29513) ^ 111584087;
                        i8 = 1978561708;
                    }
                    break;
                case 860091846:
                case 1667320069:
                    c3318 = viewOnClickListenerC7793.f25880.f39446;
                    if (c3318.f10824 == i2) {
                        iM3169 = (C0619.m2761("֡ۖ") ^ i6) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i7 = ((iM3169 ^ i5) * 12825) ^ (-1589391758);
                        i8 = 1021445721;
                    } else {
                        iM3169 = C0619.m2761("ۗ᩺") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-14703)) ^ 8444782;
                        i8 = -1776494199;
                    }
                    break;
                case 1028049756:
                case 1259665775:
                    if (C3033.m9845() <= 0) {
                        iM3169 = (i6 - C0619.m2761("ۛᩴ")) * 115;
                        i7 = ((iM3169 ^ i5) * (-19595)) ^ 842746921;
                        i8 = 1220122344;
                    } else {
                        iM3169 = C0773.m3169("۟۟") ^ i5;
                        i7 = ((iM3169 ^ i6) * 9159) ^ 958435994;
                        i8 = -333438343;
                    }
                    break;
                default:
                    C2702.m8876();
                    iM3169 = (i6 - C0619.m2761("ۛᩴ")) * 115;
                    i7 = ((iM3169 ^ i5) * (-19595)) ^ 842746921;
                    i8 = 1220122344;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0101 A[PHI: r2 r3
      0x0101: PHI (r2v4 l.ۗۢ֫) = (r2v3 l.ۗۢ֫), (r2v1 l.ۗۢ֫) binds: [B:37:0x00ff, B:29:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x0101: PHI (r3v3 l.ۗۢ֫) = (r3v2 l.ۗۢ֫), (r3v4 l.ۗۢ֫) binds: [B:37:0x00ff, B:29:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x01a5 A[PHI: r8
      0x01a5: PHI (r8v3 java.lang.String) = (r8v1 java.lang.String), (r8v2 java.lang.String), (r8v1 java.lang.String) binds: [B:53:0x01a3, B:21:0x0085, B:10:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01d3 A[PHI: r1 r4 r6 r7
      0x01d3: PHI (r1v5 l.ۨۢ֫) = (r1v1 l.ۨۢ֫), (r1v1 l.ۨۢ֫), (r1v3 l.ۨۢ֫), (r1v1 l.ۨۢ֫), (r1v1 l.ۨۢ֫), (r1v1 l.ۨۢ֫), (r1v1 l.ۨۢ֫), (r1v1 l.ۨۢ֫) binds: [B:57:0x01d1, B:45:0x0155, B:41:0x0133, B:25:0x00a3, B:13:0x0050, B:10:0x004a, B:7:0x003f, B:5:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x01d3: PHI (r4v6 int) = (r4v2 int), (r4v4 int), (r4v2 int), (r4v2 int), (r4v2 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:57:0x01d1, B:45:0x0155, B:41:0x0133, B:25:0x00a3, B:13:0x0050, B:10:0x004a, B:7:0x003f, B:5:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x01d3: PHI (r6v4 int) = (r6v1 int), (r6v1 int), (r6v1 int), (r6v2 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int) binds: [B:57:0x01d1, B:45:0x0155, B:41:0x0133, B:25:0x00a3, B:13:0x0050, B:10:0x004a, B:7:0x003f, B:5:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x01d3: PHI (r7v4 java.lang.String) = 
      (r7v1 java.lang.String)
      (r7v1 java.lang.String)
      (r7v1 java.lang.String)
      (r7v2 java.lang.String)
      (r7v1 java.lang.String)
      (r7v1 java.lang.String)
      (r7v1 java.lang.String)
      (r7v1 java.lang.String)
     binds: [B:57:0x01d1, B:45:0x0155, B:41:0x0133, B:25:0x00a3, B:13:0x0050, B:10:0x004a, B:7:0x003f, B:5:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0202 A[PHI: r0 r5
      0x0202: PHI (r0v5 l.ۨۢ֫) = (r0v2 l.ۨۢ֫), (r0v4 l.ۨۢ֫), (r0v2 l.ۨۢ֫) binds: [B:61:0x0200, B:33:0x00e1, B:7:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:61:0x0200, B:33:0x00e1, B:7:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m21238(long j) {
        int iM2761;
        int i;
        C12267 c12267 = null;
        C3318 c3318 = null;
        int i2 = 0;
        String str = null;
        String str2 = null;
        int i3 = -270011465;
        int i4 = C2354.f7599;
        int i5 = C3099.f10023;
        int iM3169 = (C0773.m3169("֫ۨ") + i4) * q.h;
        int i6 = ((iM3169 ^ i5) * (-29619)) ^ 1147469090;
        int i7 = iM3169 ^ 542903194;
        C12267 c12268 = null;
        C3318 c3319 = null;
        int iM5517 = 0;
        int i8 = 0;
        while (true) {
            i3 = ((((i3 ^ i5) * 11745) >> 31) & i6) ^ i7;
            switch (i3) {
                case -2108671343:
                case -343006587:
                    if (C1564.m5509() <= 0) {
                        iM2761 = C0773.m3169("᩷ᩳ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-31381)) ^ 318134669;
                        i = -2031968068;
                    } else {
                        iM2761 = (i5 - C0619.m2761("᩶۠")) * 21;
                        i6 = ((iM2761 ^ i4) * (-23317)) ^ (-884173694);
                        i = 117076194;
                    }
                    i7 = iM2761 ^ i;
                    break;
                case -1942055018:
                case 563540640:
                    C3734.m12152();
                    if (C3033.f9831 < 0) {
                        iM2761 = C0619.m2761("ۚۙ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 15623) ^ 1511858881;
                        i = 2043798717;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ܺ᩶")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM2761 ^ i5) * 8515) ^ (-139834488);
                        i = -1361869877;
                    }
                    i7 = iM2761 ^ i;
                    break;
                case -1890506211:
                case -350475083:
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0619.m2761("ۚۙ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 15623) ^ 1511858881;
                        i = 2043798717;
                    } else {
                        iM2761 = (i5 - C0773.m3169("᩺ۤ")) * (-33);
                        i6 = ((iM2761 ^ i4) * 23247) ^ 567795224;
                        i = 535322421;
                    }
                    i7 = iM2761 ^ i;
                    break;
                case -1691629055:
                case 1436706799:
                    C1321.m4852();
                    if (C2878.m9491() > 0) {
                        iM2761 = C0619.m2761("ۚۙ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 15623) ^ 1511858881;
                        i = 2043798717;
                    } else {
                        iM2761 = C0773.m3169("᩷ᩳ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-31381)) ^ 318134669;
                        i = -2031968068;
                    }
                    i7 = iM2761 ^ i;
                    break;
                case -1541340494:
                case -1003751324:
                    c3318 = c12267.f39446;
                    if (C1343.f4799 != 0) {
                        iM2761 = (i4 - C0619.m2761("۬᩺")) * (-19);
                        i6 = ((iM2761 ^ i5) * (-18719)) ^ (-371320726);
                        i = -993019444;
                    } else {
                        iM2761 = (i5 - C0773.m3169("۬۬")) * 89;
                        i6 = ((iM2761 ^ i4) * 3949) ^ 1052291432;
                        i = 403279016;
                    }
                    i7 = iM2761 ^ i;
                    break;
                case -1400529986:
                case 477098968:
                    i8 = c3318.f10824;
                    c12268 = this.f25872;
                    if (C2878.f9462) {
                        iM2761 = (i4 - C0773.m3169("ܺ᩶")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM2761 ^ i5) * 8515) ^ (-139834488);
                        i = -1361869877;
                    } else {
                        iM2761 = (C0619.m2761("ۜ᩻") + i4) * 127;
                        i6 = ((iM2761 ^ i5) * (-26773)) ^ 218219942;
                        i = -251442595;
                    }
                    i7 = iM2761 ^ i;
                    break;
                case -1015179530:
                case 323948556:
                    i2 = c3319.f10824;
                    str = c3318.f10828;
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0619.m2761("ۚۙ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 15623) ^ 1511858881;
                        i = 2043798717;
                    } else {
                        iM2761 = (i5 - C0773.m3169("֡᩺")) * (-75);
                        i6 = ((iM2761 ^ i4) * 23955) ^ 1540475874;
                        i = 155294181;
                    }
                    i7 = iM2761 ^ i;
                    break;
                case -989338536:
                case 946913902:
                    if (m21234()) {
                        iM2761 = (C0619.m2761("ܽܿ") ^ i4) * (-21);
                        i6 = ((iM2761 ^ i5) * (-9493)) ^ (-364790946);
                        i = -22577270;
                    } else {
                        iM2761 = C0619.m2761("ۤ֡") ^ i5;
                        i6 = ((iM2761 ^ i4) * 30847) ^ 881993503;
                        i = 1381047735;
                    }
                    i7 = iM2761 ^ i;
                    break;
                case -832896136:
                case -316413998:
                    c12267 = this.f25880;
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0619.m2761("ۚۙ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 15623) ^ 1511858881;
                        i = 2043798717;
                    } else {
                        iM2761 = (C0773.m3169("ۤܺ") ^ i5) * (-107);
                        i6 = ((iM2761 ^ i4) * (-3977)) ^ (-241559082);
                        i = -780008204;
                    }
                    i7 = iM2761 ^ i;
                    break;
                case -830877577:
                case 1360532620:
                    c3319 = c12268.f39446;
                    if (RunnableC1848.f6235) {
                        iM2761 = (i4 - C0619.m2761("۬᩺")) * (-19);
                        i6 = ((iM2761 ^ i5) * (-18719)) ^ (-371320726);
                        i = -993019444;
                    } else {
                        iM2761 = (C0619.m2761("۠ۛ") ^ i4) * 15;
                        i6 = ((iM2761 ^ i5) * (-13061)) ^ (-1928905781);
                        i = -1227767117;
                    }
                    i7 = iM2761 ^ i;
                    break;
                case -693433748:
                case 560983058:
                    iM5517 = C1564.m5517(this.f25887);
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0619.m2761("ۚۙ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 15623) ^ 1511858881;
                        i = 2043798717;
                    } else {
                        iM2761 = (C0773.m3169("ܿܳ") + i4) * 51;
                        i6 = ((iM2761 ^ i5) * (-23851)) ^ (-974705512);
                        i = 218830228;
                    }
                    i7 = iM2761 ^ i;
                    break;
                case -558689050:
                case 182388741:
                    if (C0862.f3233 != 0) {
                        iM2761 = C0619.m2761("ۚۙ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 15623) ^ 1511858881;
                        i = 2043798717;
                    } else {
                        iM2761 = (C0773.m3169("᩵ܿ") ^ i4) * 65;
                        i6 = ((iM2761 ^ i5) * 1525) ^ (-353926783);
                        i = 641996256;
                    }
                    i7 = iM2761 ^ i;
                    break;
                case -316207546:
                case 167984140:
                    break;
                case 69583521:
                case 1752089317:
                    C3448.m11245(new C24948(this, j, iM5517, i8, i2, str, str2));
                    break;
                case 380297812:
                case 1492364357:
                    str2 = c3319.f10828;
                    if (C3077.m10041()) {
                        iM2761 = C0773.m3169("᩷ᩳ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-31381)) ^ 318134669;
                        i = -2031968068;
                    } else {
                        iM2761 = C0773.m3169("۟ۧ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-23547)) ^ (-1904966478);
                        i = -1807413031;
                    }
                    i7 = iM2761 ^ i;
                    break;
                case 393099738:
                case 562283780:
                    C1519.m5403();
                    AbstractC0116.m1243();
                    break;
                case 1600249443:
                case 1643028082:
                    if (C2966.m9664()) {
                        iM2761 = (C0619.m2761("֨ۛ") ^ i4) * (-35);
                        i6 = ((iM2761 ^ i5) * 7503) ^ 830488759;
                        i = -1445339134;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ܺ᩶")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM2761 ^ i5) * 8515) ^ (-139834488);
                        i = -1361869877;
                    }
                    i7 = iM2761 ^ i;
                    break;
                default:
                    C0269.m1775();
                    iM2761 = C0619.m2761("ۚۙ") ^ i5;
                    i6 = ((iM2761 ^ i4) * 15623) ^ 1511858881;
                    i = 2043798717;
                    i7 = iM2761 ^ i;
                    break;
            }
            return;
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
    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public void m21249() {
        FloatingActionButton floatingActionButton;
        int i;
        int i2;
        FloatingActionButton floatingActionButton2;
        int i3;
        int iM3169;
        int i4;
        int i5;
        int i6;
        int i7;
        FloatingActionButton floatingActionButton3;
        int i8;
        FloatingActionButton floatingActionButton4;
        float[] fArr;
        int iM2761;
        int i9;
        int i10;
        FloatingActionButton floatingActionButton5;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        FloatingActionButton floatingActionButton6;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        float[] fArr2;
        int i11;
        short[] sArr;
        FloatingActionButton floatingActionButton7;
        int i12;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        int iM31610;
        int i13;
        int i14;
        int iM2762;
        int i15;
        int i16;
        int iM31611;
        int i17;
        int i18;
        ViewOnClickListenerC7793 viewOnClickListenerC7793 = this;
        boolean z = false;
        float f = 0.0f;
        int i19 = 0;
        float f2 = 0.0f;
        String strM5510 = null;
        ObjectAnimator objectAnimatorM6307 = null;
        int iM9482 = 0;
        float f3 = 0.0f;
        ObjectAnimator objectAnimatorM12917 = null;
        int iM5514 = 0;
        float f4 = 0.0f;
        ObjectAnimator objectAnimatorM12918 = null;
        int iM5515 = 0;
        ObjectAnimator objectAnimatorM6308 = null;
        AnimatorSet animatorSet = null;
        short s = 0;
        int i20 = 0;
        int i21 = -1899368201;
        int i22 = C3690.f12684;
        int i23 = C1542.f5343;
        int iM2763 = (C0619.m2761("ܿܿ") ^ i23) * 19;
        int i24 = ((iM2763 ^ i22) * (-28983)) ^ (-1484338831);
        int i25 = iM2763 ^ 710285134;
        float[] fArr3 = null;
        ViewGroup.MarginLayoutParams marginLayoutParams4 = null;
        FloatingActionButton floatingActionButton8 = null;
        float[] fArr4 = null;
        ViewGroup.MarginLayoutParams marginLayoutParams5 = null;
        short[] sArr2 = null;
        int i26 = 0;
        float f5 = 0.0f;
        int i27 = 0;
        int iM9483 = 0;
        int i28 = 0;
        int i29 = 0;
        float f6 = 0.0f;
        char c = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        FloatingActionButton floatingActionButton9 = null;
        FloatingActionButton floatingActionButton10 = null;
        ViewGroup.MarginLayoutParams marginLayoutParams6 = null;
        ViewGroup.MarginLayoutParams marginLayoutParams7 = null;
        FloatingActionButton floatingActionButton11 = null;
        FloatingActionButton floatingActionButton12 = null;
        while (true) {
            i21 = i25 ^ (i24 & (((i21 ^ i22) * (-15367)) >> 31));
            switch (i21) {
                case -2119772928:
                case 1621377594:
                    floatingActionButton3 = floatingActionButton10;
                    marginLayoutParams7 = marginLayoutParams7;
                    int i33 = i30;
                    sArr2 = sArr2;
                    i31 = i31;
                    int i34 = i32;
                    strM5510 = C1564.m5510(sArr2, i31, i34, i33);
                    i30 = i33;
                    FloatingActionButton floatingActionButton13 = floatingActionButton11;
                    i8 = i34;
                    fArr3 = fArr3;
                    objectAnimatorM6307 = C1826.m6307(floatingActionButton13, strM5510, fArr3);
                    floatingActionButton4 = floatingActionButton13;
                    marginLayoutParams4 = (ViewGroup.MarginLayoutParams) C3779.m12257(viewOnClickListenerC7793.f25884);
                    iM9482 = C2878.m9482(viewOnClickListenerC7793.f25884);
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0773.m3169("۫ۜ") ^ i23;
                        fArr = fArr3;
                        i9 = ((iM2761 ^ i22) * 26867) ^ (-850979426);
                        i10 = -1517562004;
                    } else {
                        fArr = fArr3;
                        iM2761 = (i22 - C0619.m2761("ۧܳ")) * 59;
                        i9 = ((iM2761 ^ i23) * (-32187)) ^ 996798131;
                        i10 = 1296914649;
                    }
                    sArr2 = sArr2;
                    i31 = i31;
                    i32 = i8;
                    floatingActionButton11 = floatingActionButton4;
                    floatingActionButton10 = floatingActionButton3;
                    i30 = i30;
                    fArr3 = fArr;
                    i25 = iM2761 ^ i10;
                    i24 = i9;
                    strM5510 = strM5510;
                    marginLayoutParams7 = marginLayoutParams7;
                    break;
                case -2093560858:
                case 1745344148:
                    floatingActionButton = floatingActionButton10;
                    marginLayoutParams7 = marginLayoutParams7;
                    marginLayoutParams6 = marginLayoutParams6;
                    i29 = i29;
                    fArr3 = fArr3;
                    i30 = i30;
                    sArr2 = sArr2;
                    floatingActionButton2 = floatingActionButton11;
                    i3 = i32;
                    viewOnClickListenerC7793.f25884.setVisibility(z ? 1 : 0);
                    viewOnClickListenerC7793.f25891.setVisibility(z ? 1 : 0);
                    viewOnClickListenerC7793.f25879.setVisibility(z ? 1 : 0);
                    FloatingActionButton floatingActionButton14 = viewOnClickListenerC7793.f25877;
                    if (!C1146.m4231()) {
                        floatingActionButton9 = floatingActionButton14;
                        iM3169 = (i23 - C0619.m2761("۫ۘ")) * (-45);
                        i2 = i29;
                        i4 = ((iM3169 ^ i22) * (-10859)) ^ (-1805318961);
                        i5 = 499537503;
                        i6 = iM3169 ^ i5;
                        sArr2 = sArr2;
                        i29 = i2;
                        i32 = i3;
                        floatingActionButton11 = floatingActionButton2;
                        floatingActionButton10 = floatingActionButton;
                        i30 = i30;
                        fArr3 = fArr3;
                        i25 = i6;
                        i24 = i4;
                        marginLayoutParams6 = marginLayoutParams6;
                        marginLayoutParams7 = marginLayoutParams7;
                    } else {
                        int iM2764 = (C0619.m2761("֡ۘ") + i23) * 99;
                        floatingActionButton9 = floatingActionButton14;
                        i24 = ((iM2764 ^ i22) * 6867) ^ (-1035412749);
                        i7 = iM2764 ^ 1187451726;
                        sArr2 = sArr2;
                        i29 = i29;
                        i32 = i3;
                        floatingActionButton11 = floatingActionButton2;
                        floatingActionButton10 = floatingActionButton;
                        i30 = i30;
                        fArr3 = fArr3;
                        i25 = i7;
                        marginLayoutParams6 = marginLayoutParams6;
                        marginLayoutParams7 = marginLayoutParams7;
                    }
                    break;
                case -2026794267:
                case 1195252413:
                    floatingActionButton5 = floatingActionButton10;
                    marginLayoutParams = marginLayoutParams7;
                    floatingActionButton12.setTranslationY(f5);
                    C2287.m7735(viewOnClickListenerC7793.f25879, f);
                    FloatingActionButton floatingActionButton15 = viewOnClickListenerC7793.f25879;
                    float[] fArr5 = new float[i19];
                    fArr5[z ? 1 : 0] = f5;
                    fArr5[c] = f2;
                    objectAnimatorM6308 = C1826.m6307(floatingActionButton15, strM5510, fArr5);
                    iM31611 = C0619.m2761("۟ۡ") ^ i22;
                    i17 = ((iM31611 ^ i23) * (-16599)) ^ 1391860745;
                    i18 = -960850359;
                    i25 = iM31611 ^ i18;
                    i24 = i17;
                    marginLayoutParams7 = marginLayoutParams;
                    floatingActionButton10 = floatingActionButton5;
                    break;
                case -1907002694:
                case -637242020:
                    i30 = 39977;
                    int iM2765 = (C0619.m2761("᩵ᩴ") + i22) * 65;
                    i4 = ((iM2765 ^ i23) * (-27881)) ^ 27156751;
                    i6 = iM2765 ^ 301751238;
                    sArr2 = sArr2;
                    i29 = i29;
                    i32 = i32;
                    floatingActionButton11 = floatingActionButton11;
                    floatingActionButton10 = floatingActionButton10;
                    fArr3 = fArr3;
                    i25 = i6;
                    i24 = i4;
                    marginLayoutParams6 = marginLayoutParams6;
                    marginLayoutParams7 = marginLayoutParams7;
                    break;
                case -1882003921:
                case 333800589:
                    floatingActionButton5 = floatingActionButton10;
                    marginLayoutParams7 = (ViewGroup.MarginLayoutParams) C1783.m6240(viewOnClickListenerC7793.f25891);
                    iM5514 = C1564.m5514(viewOnClickListenerC7793.f25891);
                    iM2762 = (i22 - C0773.m3169("ܺܿ")) * (-17);
                    i15 = ((iM2762 ^ i23) * (-29831)) ^ (-1365468933);
                    i16 = -1900239197;
                    i25 = iM2762 ^ i16;
                    i24 = i15;
                    floatingActionButton10 = floatingActionButton5;
                    break;
                case -1789192162:
                case -1273649284:
                    C2485.m8357();
                    if (C3099.f10023 > 0) {
                        floatingActionButton3 = floatingActionButton10;
                        marginLayoutParams7 = marginLayoutParams7;
                        floatingActionButton4 = floatingActionButton11;
                        i8 = i32;
                        iM2761 = C0773.m3169("۫ۜ") ^ i23;
                        fArr = fArr3;
                        i9 = ((iM2761 ^ i22) * 26867) ^ (-850979426);
                        i10 = -1517562004;
                        sArr2 = sArr2;
                        i31 = i31;
                        i32 = i8;
                        floatingActionButton11 = floatingActionButton4;
                        floatingActionButton10 = floatingActionButton3;
                        i30 = i30;
                        fArr3 = fArr;
                        i25 = iM2761 ^ i10;
                        i24 = i9;
                        strM5510 = strM5510;
                        marginLayoutParams7 = marginLayoutParams7;
                    } else {
                        floatingActionButton6 = floatingActionButton10;
                        marginLayoutParams2 = marginLayoutParams7;
                        marginLayoutParams3 = marginLayoutParams6;
                        fArr2 = fArr3;
                        i11 = i30;
                        sArr = sArr2;
                        floatingActionButton7 = floatingActionButton11;
                        i12 = i32;
                        iM31610 = (i22 - C0773.m3169("۬֫")) * 63;
                        i13 = ((iM31610 ^ i23) * (-12389)) ^ 1826779536;
                        i14 = -508899376;
                        int i35 = iM31610 ^ i14;
                        sArr2 = sArr;
                        marginLayoutParams6 = marginLayoutParams3;
                        i32 = i12;
                        floatingActionButton11 = floatingActionButton7;
                        floatingActionButton10 = floatingActionButton6;
                        marginLayoutParams7 = marginLayoutParams2;
                        i30 = i11;
                        fArr3 = fArr2;
                        i25 = i35;
                        i24 = i13;
                    }
                    break;
                case -1774706926:
                case 360022278:
                    floatingActionButton6 = floatingActionButton10;
                    marginLayoutParams2 = marginLayoutParams7;
                    fArr2 = fArr3;
                    i11 = i30;
                    sArr = sArr2;
                    floatingActionButton7 = floatingActionButton11;
                    i12 = i32;
                    marginLayoutParams3 = marginLayoutParams6;
                    i29 = iM9483 + i28 + marginLayoutParams3.bottomMargin;
                    if (C2878.m9491() <= 0) {
                        iM31610 = (i22 - C0773.m3169("۬֫")) * 63;
                        i13 = ((iM31610 ^ i23) * (-12389)) ^ 1826779536;
                        i14 = -508899376;
                    } else {
                        iM31610 = (C0773.m3169("ᩳۤ") + i23) * 79;
                        i13 = ((iM31610 ^ i22) * 29505) ^ (-71746598);
                        i14 = 1143262877;
                    }
                    int i36 = iM31610 ^ i14;
                    sArr2 = sArr;
                    marginLayoutParams6 = marginLayoutParams3;
                    i32 = i12;
                    floatingActionButton11 = floatingActionButton7;
                    floatingActionButton10 = floatingActionButton6;
                    marginLayoutParams7 = marginLayoutParams2;
                    i30 = i11;
                    fArr3 = fArr2;
                    i25 = i36;
                    i24 = i13;
                    break;
                case -1676923697:
                case 641454526:
                    C1542.m5459();
                    C4238.m13540();
                    break;
                case -1545098858:
                case 1391479611:
                    Animator[] animatorArr = new Animator[4];
                    animatorArr[z ? 1 : 0] = objectAnimatorM6307;
                    animatorArr[c] = objectAnimatorM12917;
                    animatorArr[i19] = objectAnimatorM12918;
                    animatorArr[3] = objectAnimatorM6308;
                    AnimatorSet animatorSet2 = animatorSet;
                    animatorSet2.playTogether(animatorArr);
                    int iM31612 = (i22 - C0773.m3169("ۨᩳ")) * (-29);
                    animatorSet = animatorSet2;
                    i13 = ((iM31612 ^ i23) * 11133) ^ (-2069044249);
                    i25 = iM31612 ^ (-1614041872);
                    i24 = i13;
                    break;
                case -1382110704:
                case 1531886195:
                    i30 = 25345;
                    int iM2766 = (C0619.m2761("᩵ᩴ") + i22) * 65;
                    i4 = ((iM2766 ^ i23) * (-27881)) ^ 27156751;
                    i6 = iM2766 ^ 301751238;
                    sArr2 = sArr2;
                    i29 = i29;
                    i32 = i32;
                    floatingActionButton11 = floatingActionButton11;
                    floatingActionButton10 = floatingActionButton10;
                    fArr3 = fArr3;
                    i25 = i6;
                    i24 = i4;
                    marginLayoutParams6 = marginLayoutParams6;
                    marginLayoutParams7 = marginLayoutParams7;
                    break;
                case -1270203837:
                case -312028039:
                    floatingActionButton = floatingActionButton10;
                    marginLayoutParams7 = marginLayoutParams7;
                    marginLayoutParams6 = marginLayoutParams6;
                    i2 = i29;
                    fArr3 = fArr3;
                    i30 = i30;
                    sArr2 = sArr2;
                    floatingActionButton2 = floatingActionButton11;
                    i3 = i32;
                    if (viewOnClickListenerC7793.f25886) {
                        iM3169 = (i23 - C0619.m2761("᩹۠")) * q.h;
                        i4 = ((iM3169 ^ i22) * (-3961)) ^ 18435548;
                        i5 = 1398328394;
                    } else {
                        iM3169 = (C0619.m2761("᩵ۖ") ^ i22) * (-57);
                        i4 = ((iM3169 ^ i23) * 28035) ^ (-1981933040);
                        i5 = 89502611;
                    }
                    i6 = iM3169 ^ i5;
                    sArr2 = sArr2;
                    i29 = i2;
                    i32 = i3;
                    floatingActionButton11 = floatingActionButton2;
                    floatingActionButton10 = floatingActionButton;
                    i30 = i30;
                    fArr3 = fArr3;
                    i25 = i6;
                    i24 = i4;
                    marginLayoutParams6 = marginLayoutParams6;
                    marginLayoutParams7 = marginLayoutParams7;
                    break;
                case -1016352062:
                case 418596839:
                    floatingActionButton5 = floatingActionButton10;
                    marginLayoutParams = marginLayoutParams7;
                    float f7 = i26;
                    viewOnClickListenerC7793.f25891.setTranslationY(f7);
                    C0862.m3504(viewOnClickListenerC7793.f25891, f);
                    floatingActionButton8 = viewOnClickListenerC7793.f25891;
                    fArr4 = new float[i19];
                    if (!C0619.m2763()) {
                        int iM2767 = C0619.m2761("ۡۤ") ^ i23;
                        i25 = iM2767 ^ 1874418689;
                        f4 = f7;
                        i24 = ((iM2767 ^ i22) * (-27915)) ^ 1997146556;
                        marginLayoutParams7 = marginLayoutParams;
                        floatingActionButton10 = floatingActionButton5;
                    } else {
                        f4 = f7;
                        marginLayoutParams7 = marginLayoutParams;
                        floatingActionButton = floatingActionButton5;
                        floatingActionButton2 = floatingActionButton11;
                        i3 = i32;
                        iM3169 = (i23 - C0619.m2761("۫ۘ")) * (-45);
                        i2 = i29;
                        i4 = ((iM3169 ^ i22) * (-10859)) ^ (-1805318961);
                        i5 = 499537503;
                        i6 = iM3169 ^ i5;
                        sArr2 = sArr2;
                        i29 = i2;
                        i32 = i3;
                        floatingActionButton11 = floatingActionButton2;
                        floatingActionButton10 = floatingActionButton;
                        i30 = i30;
                        fArr3 = fArr3;
                        i25 = i6;
                        i24 = i4;
                        marginLayoutParams6 = marginLayoutParams6;
                        marginLayoutParams7 = marginLayoutParams7;
                    }
                    break;
                case -1004463505:
                case 1095203631:
                    animatorSet.start();
                    viewOnClickListenerC7793.f25880.f39447.setEnabled(z);
                    viewOnClickListenerC7793.f25872.f39447.setEnabled(z);
                    break;
                case -862957787:
                case -548115834:
                    ViewGroup.MarginLayoutParams marginLayoutParams8 = marginLayoutParams4;
                    float f8 = iM9482 + marginLayoutParams8.topMargin + marginLayoutParams8.bottomMargin;
                    viewOnClickListenerC7793.f25884.setTranslationY(f8);
                    floatingActionButton10 = viewOnClickListenerC7793.f25884;
                    int iM31613 = (i23 - C0773.m3169("֡᩻")) * (-123);
                    marginLayoutParams4 = marginLayoutParams8;
                    i24 = ((iM31613 ^ i22) * 15533) ^ 1527144513;
                    i25 = iM31613 ^ (-916572099);
                    f3 = f8;
                    break;
                case -857818521:
                case -502416754:
                    floatingActionButton6 = floatingActionButton10;
                    marginLayoutParams2 = marginLayoutParams7;
                    fArr2 = fArr3;
                    i11 = i30;
                    sArr = sArr2;
                    i12 = i32;
                    int i37 = i29;
                    float f9 = i37;
                    viewOnClickListenerC7793.f25877.setTranslationY(f9);
                    f = 0.8f;
                    C2287.m7735(viewOnClickListenerC7793.f25877, 0.8f);
                    FloatingActionButton floatingActionButton16 = viewOnClickListenerC7793.f25877;
                    if (C1343.m4943()) {
                        int iM2768 = C0619.m2761("ܺۖ") ^ i22;
                        sArr2 = sArr;
                        f6 = f9;
                        i32 = i12;
                        floatingActionButton10 = floatingActionButton6;
                        marginLayoutParams7 = marginLayoutParams2;
                        i30 = i11;
                        fArr3 = fArr2;
                        floatingActionButton11 = floatingActionButton16;
                        i24 = ((iM2768 ^ i23) * (-3511)) ^ 48033092;
                        i25 = iM2768 ^ (-587030758);
                        f = 0.8f;
                        i29 = i37;
                    } else {
                        floatingActionButton7 = floatingActionButton16;
                        i29 = i37;
                        f6 = f9;
                        marginLayoutParams3 = marginLayoutParams6;
                        iM31610 = (i22 - C0773.m3169("۬֫")) * 63;
                        i13 = ((iM31610 ^ i23) * (-12389)) ^ 1826779536;
                        i14 = -508899376;
                        int i38 = iM31610 ^ i14;
                        sArr2 = sArr;
                        marginLayoutParams6 = marginLayoutParams3;
                        i32 = i12;
                        floatingActionButton11 = floatingActionButton7;
                        floatingActionButton10 = floatingActionButton6;
                        marginLayoutParams7 = marginLayoutParams2;
                        i30 = i11;
                        fArr3 = fArr2;
                        i25 = i38;
                        i24 = i13;
                    }
                    break;
                case -789508838:
                case 226296697:
                    C2419.m8174();
                    if (C13473.f42873 != 0) {
                        floatingActionButton = floatingActionButton10;
                        marginLayoutParams7 = marginLayoutParams7;
                        floatingActionButton2 = floatingActionButton11;
                        i3 = i32;
                        iM3169 = (i23 - C0619.m2761("۫ۘ")) * (-45);
                        i2 = i29;
                        i4 = ((iM3169 ^ i22) * (-10859)) ^ (-1805318961);
                        i5 = 499537503;
                        i6 = iM3169 ^ i5;
                        sArr2 = sArr2;
                        i29 = i2;
                        i32 = i3;
                        floatingActionButton11 = floatingActionButton2;
                        floatingActionButton10 = floatingActionButton;
                        i30 = i30;
                        fArr3 = fArr3;
                        i25 = i6;
                        i24 = i4;
                        marginLayoutParams6 = marginLayoutParams6;
                        marginLayoutParams7 = marginLayoutParams7;
                    }
                    floatingActionButton3 = floatingActionButton10;
                    marginLayoutParams7 = marginLayoutParams7;
                    floatingActionButton4 = floatingActionButton11;
                    i8 = i32;
                    iM2761 = C0773.m3169("۫ۜ") ^ i23;
                    fArr = fArr3;
                    i9 = ((iM2761 ^ i22) * 26867) ^ (-850979426);
                    i10 = -1517562004;
                    sArr2 = sArr2;
                    i31 = i31;
                    i32 = i8;
                    floatingActionButton11 = floatingActionButton4;
                    floatingActionButton10 = floatingActionButton3;
                    i30 = i30;
                    fArr3 = fArr;
                    i25 = iM2761 ^ i10;
                    i24 = i9;
                    strM5510 = strM5510;
                    marginLayoutParams7 = marginLayoutParams7;
                    break;
                case -743016260:
                case 1599382166:
                    floatingActionButton5 = floatingActionButton10;
                    i26 = iM5514 + marginLayoutParams7.topMargin + marginLayoutParams7.bottomMargin;
                    if (C1783.f6087 > 0) {
                        iM2762 = C0619.m2761("ܿ֡") ^ i22;
                        i15 = ((iM2762 ^ i23) * (-13153)) ^ 1567087767;
                        i16 = -40364576;
                        i25 = iM2762 ^ i16;
                        i24 = i15;
                        floatingActionButton10 = floatingActionButton5;
                    } else {
                        floatingActionButton6 = floatingActionButton5;
                        marginLayoutParams2 = marginLayoutParams7;
                        marginLayoutParams3 = marginLayoutParams6;
                        fArr2 = fArr3;
                        i11 = i30;
                        sArr = sArr2;
                        floatingActionButton7 = floatingActionButton11;
                        i12 = i32;
                        iM31610 = (i22 - C0773.m3169("۬֫")) * 63;
                        i13 = ((iM31610 ^ i23) * (-12389)) ^ 1826779536;
                        i14 = -508899376;
                        int i39 = iM31610 ^ i14;
                        sArr2 = sArr;
                        marginLayoutParams6 = marginLayoutParams3;
                        i32 = i12;
                        floatingActionButton11 = floatingActionButton7;
                        floatingActionButton10 = floatingActionButton6;
                        marginLayoutParams7 = marginLayoutParams2;
                        i30 = i11;
                        fArr3 = fArr2;
                        i25 = i39;
                        i24 = i13;
                    }
                    break;
                case -722147320:
                case -320157167:
                    C23916.m53419();
                    floatingActionButton6 = floatingActionButton10;
                    marginLayoutParams2 = marginLayoutParams7;
                    marginLayoutParams3 = marginLayoutParams6;
                    fArr2 = fArr3;
                    i11 = i30;
                    sArr = sArr2;
                    floatingActionButton7 = floatingActionButton11;
                    i12 = i32;
                    iM31610 = (i22 - C0773.m3169("۬֫")) * 63;
                    i13 = ((iM31610 ^ i23) * (-12389)) ^ 1826779536;
                    i14 = -508899376;
                    int i310 = iM31610 ^ i14;
                    sArr2 = sArr;
                    marginLayoutParams6 = marginLayoutParams3;
                    i32 = i12;
                    floatingActionButton11 = floatingActionButton7;
                    floatingActionButton10 = floatingActionButton6;
                    marginLayoutParams7 = marginLayoutParams2;
                    i30 = i11;
                    fArr3 = fArr2;
                    i25 = i310;
                    i24 = i13;
                    break;
                case -676746340:
                case -138291466:
                    floatingActionButton5 = floatingActionButton10;
                    marginLayoutParams = marginLayoutParams7;
                    int i40 = iM5515 + marginLayoutParams5.topMargin + marginLayoutParams5.bottomMargin;
                    floatingActionButton12 = viewOnClickListenerC7793.f25879;
                    f5 = i40;
                    if (!C3099.m10095()) {
                        iM31611 = C0619.m2761("᩸ܽ") ^ i23;
                        i17 = ((iM31611 ^ i22) * (-8681)) ^ (-1554114537);
                        i18 = -833394420;
                        i25 = iM31611 ^ i18;
                        i24 = i17;
                        marginLayoutParams7 = marginLayoutParams;
                        floatingActionButton10 = floatingActionButton5;
                    } else {
                        marginLayoutParams7 = marginLayoutParams;
                        iM2762 = C0619.m2761("۬ܺ") ^ i23;
                        i15 = ((iM2762 ^ i22) * (-10251)) ^ 600684553;
                        i16 = -1718611720;
                        i25 = iM2762 ^ i16;
                        i24 = i15;
                        floatingActionButton10 = floatingActionButton5;
                    }
                    break;
                case -616566647:
                case 651706382:
                    floatingActionButton5 = floatingActionButton10;
                    marginLayoutParams = marginLayoutParams7;
                    fArr4[z ? 1 : 0] = f4;
                    fArr4[c] = f2;
                    objectAnimatorM12918 = C3998.m12917(floatingActionButton8, strM5510, fArr4);
                    marginLayoutParams5 = (ViewGroup.MarginLayoutParams) C1783.m6240(viewOnClickListenerC7793.f25879);
                    iM5515 = C1564.m5514(viewOnClickListenerC7793.f25879);
                    iM31611 = C0773.m3169("ۡۨ") ^ i22;
                    i17 = ((iM31611 ^ i23) * (-3107)) ^ (-353088715);
                    i18 = -379963685;
                    i25 = iM31611 ^ i18;
                    i24 = i17;
                    marginLayoutParams7 = marginLayoutParams;
                    floatingActionButton10 = floatingActionButton5;
                    break;
                case -470730586:
                case -164069902:
                    i19 = 2;
                    float[] fArr6 = new float[2];
                    fArr6[z ? 1 : 0] = f6;
                    f2 = 0.0f;
                    fArr6[c] = 0.0f;
                    sArr2 = f25870;
                    i31 = 437;
                    i32 = 12;
                    int iM31614 = (C0773.m3169("᩺֡") ^ i23) * (-103);
                    i25 = iM31614 ^ (-125067565);
                    floatingActionButton11 = floatingActionButton11;
                    marginLayoutParams7 = marginLayoutParams7;
                    i30 = i30;
                    fArr3 = fArr6;
                    i24 = ((iM31614 ^ i22) * (-17881)) ^ (-622577537);
                    floatingActionButton10 = floatingActionButton10;
                    break;
                case -366969723:
                case -115248140:
                    marginLayoutParams7 = marginLayoutParams7;
                    marginLayoutParams6 = marginLayoutParams6;
                    viewOnClickListenerC7793.f25886 = true;
                    viewOnClickListenerC7793.f25883 = -1;
                    i27 = -2;
                    int iM31615 = (i23 - C0773.m3169("ᩴ᩺")) * 109;
                    i24 = ((iM31615 ^ i22) * (-18487)) ^ (-112083092);
                    i7 = iM31615 ^ 1984178693;
                    sArr2 = sArr2;
                    i29 = i29;
                    i32 = i32;
                    floatingActionButton11 = floatingActionButton11;
                    floatingActionButton10 = floatingActionButton10;
                    i30 = i30;
                    fArr3 = fArr3;
                    c = 1;
                    i25 = i7;
                    marginLayoutParams6 = marginLayoutParams6;
                    marginLayoutParams7 = marginLayoutParams7;
                    break;
                case -129430325:
                case 1473595164:
                    FloatingActionButton floatingActionButton17 = floatingActionButton10;
                    ViewGroup.MarginLayoutParams marginLayoutParams9 = marginLayoutParams7;
                    AnimatorSet duration = new AnimatorSet().setDuration(200L);
                    duration.setInterpolator(new DecelerateInterpolator());
                    if (C2287.m7745() <= 0) {
                        animatorSet = duration;
                        marginLayoutParams7 = marginLayoutParams9;
                        floatingActionButton3 = floatingActionButton17;
                        floatingActionButton4 = floatingActionButton11;
                        i8 = i32;
                        iM2761 = C0773.m3169("۫ۜ") ^ i23;
                        fArr = fArr3;
                        i9 = ((iM2761 ^ i22) * 26867) ^ (-850979426);
                        i10 = -1517562004;
                        sArr2 = sArr2;
                        i31 = i31;
                        i32 = i8;
                        floatingActionButton11 = floatingActionButton4;
                        floatingActionButton10 = floatingActionButton3;
                        i30 = i30;
                        fArr3 = fArr;
                        i25 = iM2761 ^ i10;
                        i24 = i9;
                        strM5510 = strM5510;
                        marginLayoutParams7 = marginLayoutParams7;
                    } else {
                        int iM31616 = C0773.m3169("۠ۧ") ^ i23;
                        int i41 = ((iM31616 ^ i22) * (-22043)) ^ (-919661126);
                        i25 = iM31616 ^ 462509840;
                        animatorSet = duration;
                        floatingActionButton10 = floatingActionButton17;
                        i24 = i41;
                        marginLayoutParams7 = marginLayoutParams9;
                    }
                    break;
                case 71190674:
                case 1087892716:
                    if (!C2966.m9664()) {
                        floatingActionButton = floatingActionButton10;
                        marginLayoutParams7 = marginLayoutParams7;
                        i = i27;
                        marginLayoutParams6 = marginLayoutParams6;
                        i2 = i29;
                        fArr3 = fArr3;
                        i30 = i30;
                        sArr2 = sArr2;
                        floatingActionButton2 = floatingActionButton11;
                        i3 = i32;
                        iM3169 = (C0619.m2761("ۙ۟") ^ i22) * 11;
                        i27 = i;
                        i4 = ((iM3169 ^ i23) * 19639) ^ (-1365794688);
                        i5 = 6424190;
                        i6 = iM3169 ^ i5;
                        sArr2 = sArr2;
                        i29 = i2;
                        i32 = i3;
                        floatingActionButton11 = floatingActionButton2;
                        floatingActionButton10 = floatingActionButton;
                        i30 = i30;
                        fArr3 = fArr3;
                        i25 = i6;
                        i24 = i4;
                        marginLayoutParams6 = marginLayoutParams6;
                        marginLayoutParams7 = marginLayoutParams7;
                    } else {
                        floatingActionButton6 = floatingActionButton10;
                        marginLayoutParams2 = marginLayoutParams7;
                        marginLayoutParams3 = marginLayoutParams6;
                        fArr2 = fArr3;
                        i11 = i30;
                        sArr = sArr2;
                        floatingActionButton7 = floatingActionButton11;
                        i12 = i32;
                        iM31610 = (i22 - C0773.m3169("۬֫")) * 63;
                        i13 = ((iM31610 ^ i23) * (-12389)) ^ 1826779536;
                        i14 = -508899376;
                        int i311 = iM31610 ^ i14;
                        sArr2 = sArr;
                        marginLayoutParams6 = marginLayoutParams3;
                        i32 = i12;
                        floatingActionButton11 = floatingActionButton7;
                        floatingActionButton10 = floatingActionButton6;
                        marginLayoutParams7 = marginLayoutParams2;
                        i30 = i11;
                        fArr3 = fArr2;
                        i25 = i311;
                        i24 = i13;
                    }
                    break;
                case 217604985:
                case 1265781163:
                    floatingActionButton = floatingActionButton10;
                    marginLayoutParams7 = marginLayoutParams7;
                    i = i27;
                    marginLayoutParams6 = marginLayoutParams6;
                    i2 = i29;
                    fArr3 = fArr3;
                    i30 = i30;
                    sArr2 = sArr2;
                    floatingActionButton2 = floatingActionButton11;
                    i3 = i32;
                    viewOnClickListenerC7793.f25895 = i;
                    z = false;
                    z = false;
                    viewOnClickListenerC7793.f25877.setVisibility(0);
                    if (C2288.m7767()) {
                        iM3169 = (C0619.m2761("ۙ۟") ^ i22) * 11;
                        i27 = i;
                        i4 = ((iM3169 ^ i23) * 19639) ^ (-1365794688);
                        i5 = 6424190;
                    } else {
                        i27 = i;
                        iM3169 = C0773.m3169("ۡ᩺") ^ i22;
                        i4 = ((iM3169 ^ i23) * 12221) ^ (-1035208557);
                        i5 = -1111136961;
                    }
                    i6 = iM3169 ^ i5;
                    sArr2 = sArr2;
                    i29 = i2;
                    i32 = i3;
                    floatingActionButton11 = floatingActionButton2;
                    floatingActionButton10 = floatingActionButton;
                    i30 = i30;
                    fArr3 = fArr3;
                    i25 = i6;
                    i24 = i4;
                    marginLayoutParams6 = marginLayoutParams6;
                    marginLayoutParams7 = marginLayoutParams7;
                    break;
                case 668230375:
                case 790636479:
                    marginLayoutParams7 = marginLayoutParams7;
                    ViewGroup.MarginLayoutParams marginLayoutParams10 = (ViewGroup.MarginLayoutParams) C1783.m6240(floatingActionButton9);
                    iM9483 = C2878.m9482(viewOnClickListenerC7793.f25877);
                    int i42 = marginLayoutParams10.topMargin;
                    int iM31617 = (C0773.m3169("ܶۗ") ^ i22) * 23;
                    i24 = ((iM31617 ^ i23) * 21105) ^ (-1549619425);
                    i29 = i29;
                    sArr2 = sArr2;
                    i32 = i32;
                    floatingActionButton11 = floatingActionButton11;
                    floatingActionButton10 = floatingActionButton10;
                    i30 = i30;
                    fArr3 = fArr3;
                    i25 = iM31617 ^ (-1299087343);
                    marginLayoutParams6 = marginLayoutParams10;
                    i28 = i42;
                    marginLayoutParams7 = marginLayoutParams7;
                    break;
                case 682108351:
                case 1688480263:
                    floatingActionButton = floatingActionButton10;
                    marginLayoutParams7 = marginLayoutParams7;
                    marginLayoutParams6 = marginLayoutParams6;
                    i2 = i29;
                    fArr3 = fArr3;
                    i30 = i30;
                    sArr2 = sArr2;
                    floatingActionButton2 = floatingActionButton11;
                    i3 = i32;
                    if (((s * s) + 70224400) - i20 >= 0) {
                        iM3169 = (i23 - C0619.m2761("᩹ۛ")) * 81;
                        i4 = ((iM3169 ^ i22) * (-4015)) ^ 391301676;
                        i5 = -320631658;
                    } else {
                        iM3169 = (C0773.m3169("᩸ۢ") + i23) * 93;
                        i4 = ((iM3169 ^ i22) * 18657) ^ 83115581;
                        i5 = 70373230;
                    }
                    i6 = iM3169 ^ i5;
                    sArr2 = sArr2;
                    i29 = i2;
                    i32 = i3;
                    floatingActionButton11 = floatingActionButton2;
                    floatingActionButton10 = floatingActionButton;
                    i30 = i30;
                    fArr3 = fArr3;
                    i25 = i6;
                    i24 = i4;
                    marginLayoutParams6 = marginLayoutParams6;
                    marginLayoutParams7 = marginLayoutParams7;
                    break;
                case 829226388:
                case 2000093895:
                    floatingActionButton5 = floatingActionButton10;
                    C0862.m3504(floatingActionButton5, f);
                    FloatingActionButton floatingActionButton18 = viewOnClickListenerC7793.f25884;
                    float[] fArr7 = new float[i19];
                    fArr7[z ? 1 : 0] = f3;
                    fArr7[c] = f2;
                    objectAnimatorM12917 = C3998.m12917(floatingActionButton18, strM5510, fArr7);
                    if (C0619.m2763()) {
                        iM2762 = C0619.m2761("۬ܺ") ^ i23;
                        i15 = ((iM2762 ^ i22) * (-10251)) ^ 600684553;
                        i16 = -1718611720;
                    } else {
                        iM2762 = (C0619.m2761("᩺֫") ^ i23) * 49;
                        i15 = ((iM2762 ^ i22) * (-563)) ^ (-149608661);
                        i16 = -2078077470;
                    }
                    i25 = iM2762 ^ i16;
                    i24 = i15;
                    floatingActionButton10 = floatingActionButton5;
                    break;
                case 883499135:
                case 1482941290:
                    marginLayoutParams7 = marginLayoutParams7;
                    marginLayoutParams6 = marginLayoutParams6;
                    int i43 = i29;
                    short s2 = f25870[436];
                    int iM2769 = (C0619.m2761("ۡ᩵") + i22) * 37;
                    s = s2;
                    i20 = s2 * 16760;
                    sArr2 = sArr2;
                    i32 = i32;
                    floatingActionButton11 = floatingActionButton11;
                    floatingActionButton10 = floatingActionButton10;
                    i30 = i30;
                    fArr3 = fArr3;
                    i24 = ((iM2769 ^ i23) * 31751) ^ (-1111701056);
                    i25 = iM2769 ^ 2112830947;
                    viewOnClickListenerC7793 = this;
                    i29 = i43;
                    marginLayoutParams6 = marginLayoutParams6;
                    marginLayoutParams7 = marginLayoutParams7;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x02c7 A[PHI: r5 r6 r34
      0x02c7: PHI (r5v5 android.view.View) = (r5v4 android.view.View), (r5v3 android.view.View) binds: [B:49:0x02c5, B:39:0x022b] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r6v4 boolean) = (r6v3 boolean), (r6v5 boolean) binds: [B:49:0x02c5, B:39:0x022b] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r34v47 short[]) = (r34v43 short[]), (r34v48 short[]) binds: [B:49:0x02c5, B:39:0x022b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0101, code lost:
    
        if (l.C1343.f4799 != 0) goto L16;
     */
    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r39) {
        /*
            Method dump skipped, instruction units count: 2220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC7793.onCreate(android.os.Bundle):void");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 44121. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(android.view.MenuItem r56) {
        /*
            Method dump skipped, instruction units count: 4412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC7793.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:110:0x0403 A[PHI: r11 r15 r20 r23
      0x0403: PHI (r11v8 short) = (r11v2 short), (r11v3 short), (r11v4 short), (r11v2 short) binds: [B:109:0x0401, B:97:0x039e, B:84:0x0308, B:10:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0403: PHI (r15v5 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:109:0x0401, B:97:0x039e, B:84:0x0308, B:10:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0403: PHI (r20v40 java.lang.Object) = (r20v16 java.lang.Object), (r20v19 java.lang.Object), (r20v22 java.lang.Object), (r20v41 java.lang.Object) binds: [B:109:0x0401, B:97:0x039e, B:84:0x0308, B:10:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0403: PHI (r23v25 int) = (r23v2 int), (r23v5 int), (r23v7 int), (r23v26 int) binds: [B:109:0x0401, B:97:0x039e, B:84:0x0308, B:10:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:114:0x0436 A[PHI: r20 r21 r23
      0x0436: PHI (r20v37 java.lang.Object) = (r20v15 java.lang.Object), (r20v17 java.lang.Object), (r20v18 java.lang.Object), (r20v38 java.lang.Object) binds: [B:113:0x0434, B:105:0x03e1, B:101:0x03c0, B:14:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x0436: PHI (r21v5 char) = (r21v3 char), (r21v3 char), (r21v4 char), (r21v3 char) binds: [B:113:0x0434, B:105:0x03e1, B:101:0x03c0, B:14:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x0436: PHI (r23v22 int) = (r23v1 int), (r23v3 int), (r23v4 int), (r23v23 int) binds: [B:113:0x0434, B:105:0x03e1, B:101:0x03c0, B:14:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0282 A[PHI: r2 r3 r20 r22 r23
      0x0282: PHI (r2v4 l.ܿۢ֫) = (r2v3 l.ܿۢ֫), (r2v2 l.ܿۢ֫) binds: [B:72:0x0269, B:63:0x021f] A[DONT_GENERATE, DONT_INLINE]
      0x0282: PHI (r3v4 ??) = (r3v3 ??), (r3v28 ??) binds: [B:72:0x0269, B:63:0x021f] A[DONT_GENERATE, DONT_INLINE]
      0x0282: PHI (r20v29 java.lang.Object) = (r20v27 java.lang.Object), (r20v30 java.lang.Object) binds: [B:72:0x0269, B:63:0x021f] A[DONT_GENERATE, DONT_INLINE]
      0x0282: PHI (r22v9 short) = (r22v7 short), (r22v10 short) binds: [B:72:0x0269, B:63:0x021f] A[DONT_GENERATE, DONT_INLINE]
      0x0282: PHI (r23v14 int) = (r23v12 int), (r23v15 int) binds: [B:72:0x0269, B:63:0x021f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c1, code lost:
    
        if (l.C0619.m2763() == false) goto L14;
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
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String, l.ܿۢ֫] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
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
    /* JADX WARN: Type inference failed for: r7v2, types: [l.᩵ۢ֫] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m21220() {
        /*
            Method dump skipped, instruction units count: 1440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC7793.m21220():void");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x017f A[PHI: r4 r7 r8 r11 r14 r15
      0x017f: PHI (r4v7 int) = (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:98:0x017f, B:37:0x017d, B:33:0x0159, B:16:0x00a7, B:121:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r7v5 java.lang.String[]) = 
      (r7v2 java.lang.String[])
      (r7v2 java.lang.String[])
      (r7v3 java.lang.String[])
      (r7v2 java.lang.String[])
      (r7v2 java.lang.String[])
     binds: [B:98:0x017f, B:37:0x017d, B:33:0x0159, B:16:0x00a7, B:121:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r8v5 java.lang.String) = 
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v3 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
     binds: [B:98:0x017f, B:37:0x017d, B:33:0x0159, B:16:0x00a7, B:121:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r11v5 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:98:0x017f, B:37:0x017d, B:33:0x0159, B:16:0x00a7, B:121:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r14v5 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:98:0x017f, B:37:0x017d, B:33:0x0159, B:16:0x00a7, B:121:0x017f] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r15v5 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:98:0x017f, B:37:0x017d, B:33:0x0159, B:16:0x00a7, B:121:0x017f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:76:0x036b A[PHI: r3 r5 r6 r12 r13 r17 r18 r19 r20 r21 r23
      0x036b: PHI (r3v20 java.lang.String) = (r3v10 java.lang.String), (r3v19 java.lang.String), (r3v21 java.lang.String) binds: [B:30:0x012b, B:75:0x0369, B:71:0x0343] A[DONT_GENERATE, DONT_INLINE]
      0x036b: PHI (r5v14 short[]) = (r5v8 short[]), (r5v13 short[]), (r5v15 short[]) binds: [B:30:0x012b, B:75:0x0369, B:71:0x0343] A[DONT_GENERATE, DONT_INLINE]
      0x036b: PHI (r6v6 java.lang.String) = (r6v5 java.lang.String), (r6v2 java.lang.String), (r6v2 java.lang.String) binds: [B:30:0x012b, B:75:0x0369, B:71:0x0343] A[DONT_GENERATE, DONT_INLINE]
      0x036b: PHI (r12v5 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:30:0x012b, B:75:0x0369, B:71:0x0343] A[DONT_GENERATE, DONT_INLINE]
      0x036b: PHI (r13v5 int) = (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:30:0x012b, B:75:0x0369, B:71:0x0343] A[DONT_GENERATE, DONT_INLINE]
      0x036b: PHI (r17v4 short) = (r17v2 short), (r17v3 short), (r17v2 short) binds: [B:30:0x012b, B:75:0x0369, B:71:0x0343] A[DONT_GENERATE, DONT_INLINE]
      0x036b: PHI (r18v4 short) = (r18v2 short), (r18v3 short), (r18v2 short) binds: [B:30:0x012b, B:75:0x0369, B:71:0x0343] A[DONT_GENERATE, DONT_INLINE]
      0x036b: PHI (r19v3 int) = (r19v2 int), (r19v2 int), (r19v4 int) binds: [B:30:0x012b, B:75:0x0369, B:71:0x0343] A[DONT_GENERATE, DONT_INLINE]
      0x036b: PHI (r20v3 int) = (r20v2 int), (r20v2 int), (r20v4 int) binds: [B:30:0x012b, B:75:0x0369, B:71:0x0343] A[DONT_GENERATE, DONT_INLINE]
      0x036b: PHI (r21v3 int) = (r21v2 int), (r21v2 int), (r21v4 int) binds: [B:30:0x012b, B:75:0x0369, B:71:0x0343] A[DONT_GENERATE, DONT_INLINE]
      0x036b: PHI (r23v7 int) = (r23v3 int), (r23v6 int), (r23v8 int) binds: [B:30:0x012b, B:75:0x0369, B:71:0x0343] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21202(ViewOnClickListenerC7793 viewOnClickListenerC7793, C20472 c20472, DialogInterface dialogInterface, int i) {
        int iM2761;
        int i2;
        int i3;
        int iM3169;
        int i4;
        int i5;
        int iM31610;
        int i6;
        int i7;
        int i8;
        String str;
        viewOnClickListenerC7793 = viewOnClickListenerC7793;
        C20472 c20473 = c20472;
        int i9 = AbstractC0641.f2496;
        int i10 = C2419.f7754;
        int iM2762 = (C0619.m2761("ܰᩴ") + i9) * 101;
        int i11 = ((iM2762 ^ i10) * 1201) ^ 1808602901;
        String strM34972 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i12 = iM2762 ^ (-1408287157);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        short s = 0;
        short s2 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        String strM21237 = null;
        int i21 = 0;
        int i22 = 0;
        int i23 = -1665515806;
        short[] sArr4 = null;
        StringBuilder sbM10405 = null;
        String strM21238 = null;
        String[] strArr = null;
        String strM2361 = null;
        while (true) {
            i23 = i12 ^ (i11 & (((i23 ^ i10) * (-9617)) >> 31));
            switch (i23) {
                case -2075076740:
                case 1636223928:
                    C2834.m9339(new C19243(viewOnClickListenerC7793, c20473, C0269.m1774(m21212(), C2023.m6952(sbM10405)), i));
                    break;
                case -1963546924:
                case -1295489375:
                    C3492.m11488();
                    if (!C0619.f2439) {
                        strM34972 = strM34972;
                        iM31610 = (i10 - C0773.m3169("ۜۖ")) * (-77);
                        i6 = ((iM31610 ^ i9) * 14671) ^ (-1544360878);
                        i7 = -101639222;
                        i12 = iM31610 ^ i7;
                        viewOnClickListenerC7793 = viewOnClickListenerC7793;
                        strM34972 = strM34972;
                        i11 = i6;
                        c20473 = c20472;
                    } else {
                        iM2761 = C0619.m2761("᩵ۢ") ^ i9;
                        i2 = ((iM2761 ^ i10) * (-10235)) ^ (-1092852901);
                        i3 = 304997390;
                        i12 = iM2761 ^ i3;
                        i11 = i2;
                    }
                    break;
                case -1917498563:
                case -1099390257:
                    AbstractC0641.m2813();
                    break;
                case -1839996006:
                case -428046137:
                    sArr = sArr;
                    i8 = i21;
                    int i24 = i22;
                    String strM53420 = C23916.m53420(sArr, i8, i24, i14);
                    i22 = i24;
                    str = strM21237;
                    strM34972 = C14483.m34972(str, strM53420);
                    if (C0862.f3233 == 0) {
                        strM21237 = str;
                        int iM31611 = C0773.m3169("۟۫") ^ i10;
                        i4 = ((iM31611 ^ i9) * 25899) ^ 435447863;
                        i12 = iM31611 ^ (-369538807);
                        i21 = i8;
                        i22 = i22;
                        i11 = i4;
                        sArr = sArr;
                        c20473 = c20472;
                    } else {
                        int iM31612 = (i10 - C0773.m3169("ᩴܰ")) * (-17);
                        strM21237 = str;
                        int i25 = ((iM31612 ^ i9) * 15363) ^ 947425811;
                        i12 = iM31612 ^ (-1857667943);
                        c20473 = c20472;
                        i21 = i8;
                        i22 = i22;
                        i11 = i25;
                        sArr = sArr;
                        viewOnClickListenerC7793 = viewOnClickListenerC7793;
                    }
                    break;
                case -1728361743:
                case -174338845:
                    if (C1783.f6087 <= 0) {
                        strM34972 = strM34972;
                        iM31610 = (i10 - C0773.m3169("ۜۖ")) * (-77);
                        i6 = ((iM31610 ^ i9) * 14671) ^ (-1544360878);
                        i7 = -101639222;
                        i12 = iM31610 ^ i7;
                        viewOnClickListenerC7793 = viewOnClickListenerC7793;
                        strM34972 = strM34972;
                        i11 = i6;
                        c20473 = c20472;
                    } else {
                        iM2761 = C0619.m2761("᩹֡") ^ i9;
                        i2 = ((iM2761 ^ i10) * (-20757)) ^ (-2027343902);
                        i3 = 883821941;
                        i12 = iM2761 ^ i3;
                        i11 = i2;
                    }
                    break;
                case -1681809183:
                case 1600677936:
                    i14 = 27099;
                    iM3169 = (i9 - C0773.m3169("᩵ۜ")) * 71;
                    i4 = ((iM3169 ^ i10) * 4899) ^ 1821630236;
                    i5 = -913050701;
                    i12 = iM3169 ^ i5;
                    strM34972 = strM34972;
                    i22 = i22;
                    i11 = i4;
                    sArr = sArr;
                    c20473 = c20472;
                    break;
                case -1417214377:
                case 1237632158:
                    sArr = sArr;
                    i22 = i22;
                    strM34972 = strM34972;
                    dialogInterface.dismiss();
                    if (i != 0) {
                        iM3169 = (i9 - C0773.m3169("۬ۙ")) * 75;
                        i4 = ((iM3169 ^ i10) * (-15949)) ^ 1151056025;
                        i5 = -1415547745;
                    } else {
                        iM3169 = C0773.m3169("ܰ۟") ^ i10;
                        i4 = ((iM3169 ^ i9) * (-15603)) ^ 807821885;
                        i5 = -1432948490;
                    }
                    i12 = iM3169 ^ i5;
                    strM34972 = strM34972;
                    i22 = i22;
                    i11 = i4;
                    sArr = sArr;
                    c20473 = c20472;
                    break;
                case -1325748362:
                case 231593722:
                    RunnableC1848.m6360();
                    if (C3033.f9831 >= 0) {
                        str = strM21237;
                        sArr = sArr;
                        i8 = i21;
                        i22 = i22;
                        int iM31613 = (i10 - C0773.m3169("ᩴܰ")) * (-17);
                        strM21237 = str;
                        int i26 = ((iM31613 ^ i9) * 15363) ^ 947425811;
                        i12 = iM31613 ^ (-1857667943);
                        c20473 = c20472;
                        i21 = i8;
                        i22 = i22;
                        i11 = i26;
                        sArr = sArr;
                        viewOnClickListenerC7793 = viewOnClickListenerC7793;
                    } else {
                        iM2761 = C0619.m2761("᩹֡") ^ i9;
                        i2 = ((iM2761 ^ i10) * (-20757)) ^ (-2027343902);
                        i3 = 883821941;
                        i12 = iM2761 ^ i3;
                        i11 = i2;
                    }
                    break;
                case -1270858801:
                case 1048806016:
                    i15 = 23;
                    i16 = 5;
                    if (C1826.f6190 > 0) {
                        iM2761 = C0773.m3169("ۖܽ") ^ i9;
                        i2 = ((iM2761 ^ i10) * (-1471)) ^ (-1119898545);
                        i3 = -294211137;
                        i12 = iM2761 ^ i3;
                        i11 = i2;
                    } else {
                        sArr = sArr;
                        i22 = i22;
                        strM34972 = strM34972;
                        iM3169 = C0773.m3169("۠ܺ") ^ i10;
                        i4 = ((iM3169 ^ i9) * 7485) ^ 840469103;
                        i5 = 42056452;
                        i12 = iM3169 ^ i5;
                        strM34972 = strM34972;
                        i22 = i22;
                        i11 = i4;
                        sArr = sArr;
                        c20473 = c20472;
                    }
                    break;
                case -1157000298:
                case 133331560:
                    if (i != 1) {
                        iM2761 = (C0773.m3169("۬۬") ^ i10) * (-37);
                        i2 = ((iM2761 ^ i9) * (-25611)) ^ 2054170095;
                        i3 = -1813726974;
                    } else {
                        iM2761 = C0773.m3169("ۡۙ") ^ i10;
                        i2 = ((iM2761 ^ i9) * (-13989)) ^ (-1707712786);
                        i3 = 902874475;
                    }
                    i12 = iM2761 ^ i3;
                    i11 = i2;
                    break;
                case -1113073415:
                case 602430519:
                    strM2361 = C0487.m2361(f25870, 14, 4, i14);
                    if (C1321.f4751 < 0) {
                        iM2761 = C0619.m2761("۠᩶") ^ i9;
                        i2 = ((iM2761 ^ i10) * (-5443)) ^ (-31597690);
                        i3 = 1453730881;
                        i12 = iM2761 ^ i3;
                        i11 = i2;
                    } else {
                        sArr = sArr;
                        i22 = i22;
                        strM34972 = strM34972;
                        iM3169 = C0773.m3169("۠ܺ") ^ i10;
                        i4 = ((iM3169 ^ i9) * 7485) ^ 840469103;
                        i5 = 42056452;
                        i12 = iM3169 ^ i5;
                        strM34972 = strM34972;
                        i22 = i22;
                        i11 = i4;
                        sArr = sArr;
                        c20473 = c20472;
                    }
                    break;
                case -1096467607:
                case 674778111:
                    strArr = new String[]{strM2361, C4238.m13530(sArr2, i17, i13, i14)};
                    strM21238 = m21237(c20472);
                    sArr3 = f25870;
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0619.m2761("᩹֡") ^ i9;
                        i2 = ((iM2761 ^ i10) * (-20757)) ^ (-2027343902);
                        i3 = 883821941;
                    } else {
                        iM2761 = (i9 - C0773.m3169("ܽۙ")) * (-95);
                        i2 = ((iM2761 ^ i10) * 21671) ^ 1854347307;
                        i3 = -816639559;
                    }
                    i12 = iM2761 ^ i3;
                    i11 = i2;
                    break;
                case -1026481772:
                case 1789509125:
                    sArr = sArr;
                    i22 = i22;
                    strM34972 = strM34972;
                    sArr4 = f25870;
                    if (!C0619.f2439) {
                        iM3169 = C0773.m3169("ܽ֨") ^ i9;
                        i4 = ((iM3169 ^ i10) * 16945) ^ 1460403887;
                        i5 = -347301107;
                        i12 = iM3169 ^ i5;
                        strM34972 = strM34972;
                        i22 = i22;
                        i11 = i4;
                        sArr = sArr;
                        c20473 = c20472;
                    } else {
                        i22 = i22;
                        sArr = sArr;
                        iM31610 = (i10 - C0773.m3169("ۜۖ")) * (-77);
                        i6 = ((iM31610 ^ i9) * 14671) ^ (-1544360878);
                        i7 = -101639222;
                        i12 = iM31610 ^ i7;
                        viewOnClickListenerC7793 = viewOnClickListenerC7793;
                        strM34972 = strM34972;
                        i11 = i6;
                        c20473 = c20472;
                    }
                    break;
                case -908899203:
                case -859882867:
                    sArr = sArr;
                    i22 = i22;
                    strM34972 = strM34972;
                    int i27 = s + s2;
                    i18 = i27 * i27;
                    i19 = s * s;
                    i20 = 70756;
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0773.m3169("۠ܺ") ^ i10;
                        i4 = ((iM3169 ^ i9) * 7485) ^ 840469103;
                        i5 = 42056452;
                    } else {
                        iM3169 = C0773.m3169("᩶ᩴ") ^ i9;
                        i4 = ((iM3169 ^ i10) * 16673) ^ 873179246;
                        i5 = -1526282494;
                    }
                    i12 = iM3169 ^ i5;
                    strM34972 = strM34972;
                    i22 = i22;
                    i11 = i4;
                    sArr = sArr;
                    c20473 = c20472;
                    break;
                case -718517364:
                case 286028751:
                    if (i != 2) {
                        iM2761 = (C0619.m2761("֨ܿ") + i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i2 = ((iM2761 ^ i10) * 4313) ^ (-1501430141);
                        i3 = -1799654669;
                    } else {
                        iM2761 = C0773.m3169("ۡۙ") ^ i10;
                        i2 = ((iM2761 ^ i9) * (-13989)) ^ (-1707712786);
                        i3 = 902874475;
                    }
                    i12 = iM2761 ^ i3;
                    i11 = i2;
                    break;
                case -678377707:
                case -596421083:
                    sArr2 = f25870;
                    i17 = 18;
                    i13 = 5;
                    if (C13473.m33144()) {
                        iM2761 = (i10 - C0619.m2761("ۖ۠")) * (-23);
                        i2 = ((iM2761 ^ i9) * (-5577)) ^ 353621288;
                        i3 = -1788276929;
                    } else {
                        iM2761 = C0619.m2761("᩹֡") ^ i9;
                        i2 = ((iM2761 ^ i10) * (-20757)) ^ (-2027343902);
                        i3 = 883821941;
                    }
                    i12 = iM2761 ^ i3;
                    i11 = i2;
                    break;
                case -343295356:
                case 1636717423:
                    C3448.m11245(new C0598(viewOnClickListenerC7793, c20473, C0269.m1774(m21212(), strM34972)));
                    break;
                case -277169864:
                case 1627727947:
                    C2419.m8174();
                    C2878.m9491();
                    iM2761 = C0619.m2761("᩹֡") ^ i9;
                    i2 = ((iM2761 ^ i10) * (-20757)) ^ (-2027343902);
                    i3 = 883821941;
                    i12 = iM2761 ^ i3;
                    i11 = i2;
                    break;
                case -193608766:
                case 1700665026:
                    break;
                case 41313850:
                case 1688469354:
                    sbM10405 = C3188.m10405(strM21238, AbstractC3624.m11769(sArr3, i15, i16, i14));
                    C3779.m12258(sbM10405, strArr[i - 1]);
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0619.m2761("᩵ۢ") ^ i9;
                        i2 = ((iM2761 ^ i10) * (-10235)) ^ (-1092852901);
                        i3 = 304997390;
                    } else {
                        iM2761 = (C0773.m3169("ۗ᩷") + i10) * (-57);
                        i2 = ((iM2761 ^ i9) * 24499) ^ 697427096;
                        i3 = 426777274;
                    }
                    i12 = iM2761 ^ i3;
                    i11 = i2;
                    break;
                case 585225427:
                case 1327856133:
                    strM34972 = strM34972;
                    strM21237 = m21237(c20472);
                    sArr = f25870;
                    i21 = 5;
                    i22 = 9;
                    if (C0950.f3488 >= 0) {
                        iM31610 = (i10 - C0773.m3169("ۜۖ")) * (-77);
                        i6 = ((iM31610 ^ i9) * 14671) ^ (-1544360878);
                        i7 = -101639222;
                    } else {
                        iM31610 = C0619.m2761("ܿۙ") ^ i9;
                        i6 = ((iM31610 ^ i10) * 24425) ^ 17187471;
                        i7 = 411472146;
                    }
                    i12 = iM31610 ^ i7;
                    viewOnClickListenerC7793 = viewOnClickListenerC7793;
                    strM34972 = strM34972;
                    i11 = i6;
                    c20473 = c20472;
                    break;
                case 625675686:
                case 802167886:
                    sArr = sArr;
                    i22 = i22;
                    strM34972 = strM34972;
                    int i28 = i19 + i20;
                    if ((i28 + i28) - i18 < 0) {
                        iM3169 = C0773.m3169("ۧۜ") ^ i10;
                        i4 = ((iM3169 ^ i9) * (-1067)) ^ (-41939466);
                        i5 = 423136045;
                    } else {
                        iM3169 = C0773.m3169("֫᩺") ^ i10;
                        i4 = ((iM3169 ^ i9) * 11539) ^ 55493540;
                        i5 = 330738500;
                    }
                    i12 = iM3169 ^ i5;
                    strM34972 = strM34972;
                    i22 = i22;
                    i11 = i4;
                    sArr = sArr;
                    c20473 = c20472;
                    break;
                case 1169676376:
                case 1637476596:
                    sArr = sArr;
                    i22 = i22;
                    strM34972 = strM34972;
                    s = sArr4[4];
                    s2 = 266;
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0773.m3169("۠ܺ") ^ i10;
                        i4 = ((iM3169 ^ i9) * 7485) ^ 840469103;
                        i5 = 42056452;
                    } else {
                        iM3169 = (i10 - C0619.m2761("۬۠")) * (-101);
                        i4 = ((iM3169 ^ i9) * 5615) ^ (-819541616);
                        i5 = -523546833;
                    }
                    i12 = iM3169 ^ i5;
                    strM34972 = strM34972;
                    i22 = i22;
                    i11 = i4;
                    sArr = sArr;
                    c20473 = c20472;
                    break;
                default:
                    i14 = 16954;
                    iM3169 = (i9 - C0773.m3169("᩵ۜ")) * 71;
                    i4 = ((iM3169 ^ i10) * 4899) ^ 1821630236;
                    i5 = -913050701;
                    i12 = iM3169 ^ i5;
                    strM34972 = strM34972;
                    i22 = i22;
                    i11 = i4;
                    sArr = sArr;
                    c20473 = c20472;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC3409, android.app.Activity
    public final void onResume() {
        int iM2761;
        int i;
        C0335 c0335 = null;
        long j = 0;
        boolean z = false;
        int i2 = -1470149692;
        int i3 = C2966.f9654;
        int i4 = C1519.f5300;
        int iM2762 = C0619.m2761("֫۟") ^ i4;
        int i5 = ((iM2762 ^ i3) * 30413) ^ 35653356;
        int i6 = 145345149;
        while (true) {
            int i7 = iM2762 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i3) * 879) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2005954030:
                    case 1733179882:
                        int i8 = 1;
                        if (C4282.f15546 > 0) {
                            C2419.m8178(new RunnableC24862(i8, c0335), j);
                            iM2762 = C0773.m3169("֫ܰ") ^ i3;
                            i5 = ((iM2762 ^ i4) * 15793) ^ 1182122946;
                            i6 = -37666476;
                        }
                        iM2762 = (C0619.m2761("ܿ֨") ^ i4) * 53;
                        i5 = ((iM2762 ^ i3) * (-5277)) ^ 804128303;
                        i6 = 521292728;
                    case -1832722318:
                    case -673714986:
                        super.onResume();
                        if (C1146.f4234 < 0) {
                            iM2762 = C0619.m2761("۬ܿ") ^ i4;
                            i5 = ((iM2762 ^ i3) * (-17801)) ^ 56041306;
                            i6 = -1509593242;
                        } else {
                            iM2762 = C0773.m3169("ܽ᩻") ^ i3;
                            i5 = ((iM2762 ^ i4) * 13153) ^ (-793025104);
                            i6 = -1763037378;
                        }
                        break;
                    case -1471739427:
                    case 1631464080:
                        if (!m21226()) {
                            iM2762 = C0773.m3169("᩺ۖ") ^ i4;
                            i5 = ((iM2762 ^ i3) * 6101) ^ 779894906;
                            i6 = 291987952;
                        } else {
                            iM2762 = C0773.m3169("ܶۢ") ^ i3;
                            i5 = ((iM2762 ^ i4) * 5519) ^ (-2002509622);
                            i6 = -1587635842;
                        }
                        break;
                    case -1398044821:
                    case 1010940625:
                        if (this.f25878) {
                            iM2761 = C0773.m3169("ۨ᩹") ^ i3;
                            i5 = ((iM2761 ^ i4) * 2045) ^ (-1278554639);
                            i = -1669640673;
                        } else {
                            iM2761 = C0619.m2761("֫ۛ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 20895) ^ 1467551879;
                            i = 1638202482;
                        }
                        i7 = iM2761 ^ i;
                        z = false;
                        break;
                    case -1091857379:
                    case 1698908060:
                        this.f25889 = z;
                        m21238(j);
                        iM2762 = (C0619.m2761("ᩳ۫") + i3) * 5;
                        i5 = ((iM2762 ^ i4) * (-32287)) ^ 490178171;
                        i6 = -497810386;
                        break;
                    case -1038874627:
                    case 164473727:
                        if (C1146.f4234 < 0) {
                            iM2762 = C0773.m3169("ܰ۟") ^ i3;
                            i5 = ((iM2762 ^ i4) * 23249) ^ 970856984;
                            i6 = 1778166273;
                        } else {
                            iM2762 = (C0619.m2761("ܿ֨") ^ i4) * 53;
                            i5 = ((iM2762 ^ i3) * (-5277)) ^ 804128303;
                            i6 = 521292728;
                        }
                        break;
                    case -837105069:
                    case -206110775:
                        int i9 = 0;
                        if (C1826.f6190 > 0) {
                            C3492.m11477(new RunnableC3581(i9, this), j);
                            iM2762 = C0773.m3169("ܶۢ") ^ i3;
                            i5 = ((iM2762 ^ i4) * 5519) ^ (-2002509622);
                            i6 = -1587635842;
                            break;
                        }
                        iM2762 = (C0619.m2761("ܿ֨") ^ i4) * 53;
                        i5 = ((iM2762 ^ i3) * (-5277)) ^ 804128303;
                        i6 = 521292728;
                        break;
                    case -813747356:
                    case 1343047617:
                        C0950.m3785();
                        if (!C17202.f56030) {
                            iM2762 = (C0619.m2761("ܿ֨") ^ i4) * 53;
                            i5 = ((iM2762 ^ i3) * (-5277)) ^ 804128303;
                            i6 = 521292728;
                            break;
                        }
                        iM2762 = C0773.m3169("ܽ᩻") ^ i3;
                        i5 = ((iM2762 ^ i4) * 13153) ^ (-793025104);
                        i6 = -1763037378;
                        break;
                    case -772816243:
                    case 2007307229:
                        if (!C3099.m10095()) {
                            iM2762 = (C0619.m2761("ܰۙ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i5 = ((iM2762 ^ i3) * (-13035)) ^ (-2052814718);
                            i6 = 1877073101;
                        } else {
                            iM2762 = C0619.m2761("ۛۧ") ^ i3;
                            i5 = ((iM2762 ^ i4) * 31819) ^ 1623638471;
                            i6 = 1738156686;
                        }
                        break;
                    case -706956938:
                    case 34581274:
                        this.f25890 = null;
                        if (!c0335.m2065()) {
                            iM2762 = C0619.m2761("ܶۤ") ^ i3;
                            i5 = ((iM2762 ^ i4) * (-19923)) ^ 156745554;
                            i6 = -95348153;
                        } else {
                            iM2762 = C0773.m3169("֫ܰ") ^ i3;
                            i5 = ((iM2762 ^ i4) * 15793) ^ 1182122946;
                            i6 = -37666476;
                        }
                        break;
                    case -441634530:
                    case 1513934294:
                        if (C3448.f11240 < 0) {
                            iM2762 = C0773.m3169("ܽ᩻") ^ i3;
                            i5 = ((iM2762 ^ i4) * 13153) ^ (-793025104);
                            i6 = -1763037378;
                            break;
                        }
                        iM2762 = (C0619.m2761("᩸᩵") ^ i4) * (-67);
                        i5 = ((iM2762 ^ i3) * (-10501)) ^ (-891962661);
                        i6 = -1207967707;
                        break;
                    case -390837483:
                    case 1853567953:
                        c0335 = this.f25890;
                        j = 200;
                        if (c0335 == null) {
                            iM2762 = C0773.m3169("֫ܰ") ^ i3;
                            i5 = ((iM2762 ^ i4) * 15793) ^ 1182122946;
                            i6 = -37666476;
                            break;
                        }
                        iM2762 = (i4 - C0773.m3169("ۘܶ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM2762 ^ i3) * (-24255)) ^ (-2023540634);
                        i6 = -1467966637;
                        break;
                    case -201652439:
                    case 551886186:
                        break;
                    case -190267131:
                    case 23362381:
                        this.f25878 = z;
                        this.f25889 = z;
                        mo4897();
                        break;
                    case -186414483:
                    case 1149481398:
                        if (C0862.f3233 == 0) {
                            iM2762 = (i4 - C0773.m3169("֡ۢ")) * 89;
                            i5 = ((iM2762 ^ i3) * (-27889)) ^ (-2134438142);
                            i6 = -172483278;
                        } else {
                            iM2762 = C0773.m3169("ܽ᩻") ^ i3;
                            i5 = ((iM2762 ^ i4) * 13153) ^ (-793025104);
                            i6 = -1763037378;
                        }
                        break;
                    case -177799584:
                    case 94870325:
                        if (C2375.f7641 > 0) {
                            iM2762 = C0619.m2761("۠ۧ") ^ i3;
                            i5 = ((iM2762 ^ i4) * (-25081)) ^ 2109918811;
                            i6 = -1006532667;
                        } else {
                            iM2762 = (C0619.m2761("ܿ֨") ^ i4) * 53;
                            i5 = ((iM2762 ^ i3) * (-5277)) ^ 804128303;
                            i6 = 521292728;
                        }
                        break;
                    case -91933663:
                    case 702640598:
                        if (C2375.f7641 <= 0) {
                            iM2762 = C0773.m3169("᩶ۢ") ^ i3;
                            i5 = ((iM2762 ^ i4) * (-9611)) ^ 637252021;
                            i6 = 1382272395;
                        } else {
                            iM2762 = (C0619.m2761("ܿ֨") ^ i4) * 53;
                            i5 = ((iM2762 ^ i3) * (-5277)) ^ 804128303;
                            i6 = 521292728;
                        }
                        break;
                    case 200609827:
                    case 1202279537:
                        C17202.m40372();
                        AbstractC0641.m2813();
                        iM2762 = (C0619.m2761("᩸᩵") ^ i4) * (-67);
                        i5 = ((iM2762 ^ i3) * (-10501)) ^ (-891962661);
                        i6 = -1207967707;
                        break;
                        break;
                    case 509675769:
                    case 1625174642:
                        if (this.f25875 == null) {
                            iM2762 = C0773.m3169("ܶۢ") ^ i3;
                            i5 = ((iM2762 ^ i4) * 5519) ^ (-2002509622);
                            i6 = -1587635842;
                            break;
                        }
                        iM2762 = C0619.m2761("᩻֡") ^ i4;
                        i5 = ((iM2762 ^ i3) * 20541) ^ 1563661151;
                        i6 = -1102872535;
                        break;
                    case 696350717:
                    case 1199114780:
                        if (!C3998.m12920()) {
                            iM2762 = C0619.m2761("ۛۧ") ^ i3;
                            i5 = ((iM2762 ^ i4) * 31819) ^ 1623638471;
                            i6 = 1738156686;
                            break;
                        }
                        iM2762 = C0773.m3169("᩵ۙ") ^ i3;
                        i5 = ((iM2762 ^ i4) * 27343) ^ (-381349300);
                        i6 = 1973990866;
                        break;
                    case 905007903:
                    case 1740514791:
                        C20932.m47848();
                        C0269.m1775();
                        break;
                    case 1245007369:
                    case 2038112906:
                        if (C0950.f3488 < 0) {
                            iM2762 = (i3 - C0619.m2761("᩵ᩳ")) * 67;
                            i5 = ((iM2762 ^ i4) * 2133) ^ 567153792;
                            i6 = -811799518;
                        } else {
                            iM2762 = C0773.m3169("ܽ᩻") ^ i3;
                            i5 = ((iM2762 ^ i4) * 13153) ^ (-793025104);
                            i6 = -1763037378;
                        }
                        break;
                    case 1495178753:
                    case 1560608647:
                        if (C0950.f3488 < 0) {
                            iM2762 = C0619.m2761("ۧۘ") ^ i4;
                            i5 = ((iM2762 ^ i3) * 6835) ^ (-1711746827);
                            i6 = -692852847;
                        } else {
                            iM2762 = C0773.m3169("ܽ᩻") ^ i3;
                            i5 = ((iM2762 ^ i4) * 13153) ^ (-793025104);
                            i6 = -1763037378;
                        }
                        break;
                    default:
                        if (!this.f25889) {
                            iM2762 = (C0619.m2761("ᩳ۫") + i3) * 5;
                            i5 = ((iM2762 ^ i4) * (-32287)) ^ 490178171;
                            i6 = -497810386;
                            break;
                            break;
                        }
                        iM2762 = C0773.m3169("ۨ᩻") ^ i4;
                        i5 = ((iM2762 ^ i3) * 23679) ^ (-565434992);
                        i6 = 1637217457;
                        break;
                }
                return;
            }
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onStop() {
        DialogInterfaceC8327 dialogInterfaceC8327 = null;
        AtomicInteger atomicInteger = null;
        int i = -1309134641;
        int i2 = C20932.f66974;
        int i3 = C1321.f4751;
        int iM3169 = C0773.m3169("ᩴܽ") ^ i3;
        int i4 = ((iM3169 ^ i2) * 539) ^ (-202133587);
        int i5 = -600329924;
        while (true) {
            i = ((((i ^ i2) * 10583) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1837017033:
                case 797965792:
                    C11235.m28311(dialogInterfaceC8327);
                    iM3169 = (C0619.m2761("֫ۜ") ^ i3) * (-113);
                    i4 = ((iM3169 ^ i2) * (-7357)) ^ 348306397;
                    i5 = 1807561652;
                    break;
                case -1640942871:
                case -1420915569:
                    super.onStop();
                    break;
                case -1622168269:
                case 2146862525:
                    if (C3690.m11987()) {
                        iM3169 = (i3 - C0773.m3169("ᩴܿ")) * 45;
                        i4 = ((iM3169 ^ i2) * 16819) ^ 1045580965;
                        i5 = 119400479;
                    } else {
                        iM3169 = (C0773.m3169("ۤ֫") ^ i2) * (-71);
                        i4 = ((iM3169 ^ i3) * 11061) ^ (-657499636);
                        i5 = -702229585;
                    }
                    break;
                case -1365235952:
                case 1810149264:
                    dialogInterfaceC8327 = this.f25894;
                    if (dialogInterfaceC8327 != null) {
                        iM3169 = (C0619.m2761("ۤۧ") + i2) * 35;
                        i4 = ((iM3169 ^ i3) * 25041) ^ (-207821146);
                        i5 = -118380035;
                    } else {
                        iM3169 = (C0619.m2761("֫ۜ") ^ i3) * (-113);
                        i4 = ((iM3169 ^ i2) * (-7357)) ^ 348306397;
                        i5 = 1807561652;
                    }
                    break;
                case -1295086940:
                case 1223546129:
                    if (C1343.f4799 != 0) {
                        iM3169 = (i3 - C0773.m3169("ᩴܿ")) * 45;
                        i4 = ((iM3169 ^ i2) * 16819) ^ 1045580965;
                        i5 = 119400479;
                    } else {
                        iM3169 = C0773.m3169("ۨۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 11559) ^ 362365491;
                        i5 = 236827287;
                    }
                    break;
                case -1288001389:
                case 390566992:
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0773.m3169("۟֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-13239)) ^ (-1481175379);
                        i5 = -1162026007;
                    } else {
                        iM3169 = C0619.m2761("ܳ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26659) ^ (-759159544);
                        i5 = 1069414324;
                    }
                    break;
                case -1283599796:
                case 1967849775:
                    C1564.m5517(atomicInteger);
                    C1564.m5517(this.f25897);
                    iM3169 = (i2 - C0619.m2761("ۗ᩹")) * (-61);
                    i4 = ((iM3169 ^ i3) * 21803) ^ (-194292224);
                    i5 = 1713603014;
                    break;
                case -815794036:
                case -146647395:
                    if (C1080.m4050()) {
                        iM3169 = (C0619.m2761("ۡ۫") ^ i3) * 77;
                        i4 = ((iM3169 ^ i2) * 27991) ^ (-298266965);
                        i5 = -1467852850;
                    } else {
                        iM3169 = (C0619.m2761("᩸֡") ^ i2) * (-21);
                        i4 = ((iM3169 ^ i3) * 25203) ^ 357984899;
                        i5 = 235994278;
                    }
                    break;
                case -678321019:
                case 1330656367:
                    C23916.m53419();
                    if (AbstractC0641.f2496 < 0) {
                        iM3169 = C0619.m2761("᩷֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * 23987) ^ 401041736;
                        i5 = 397507140;
                    } else {
                        iM3169 = C0619.m2761("ۢܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 18011) ^ (-1157950290);
                        i5 = -725414767;
                    }
                    break;
                case -647892680:
                case 1918570353:
                    C0950.m3785();
                    C2023.m6964();
                    break;
                case -602383226:
                case 486804482:
                    this.f25889 = true;
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0619.m2761("ۢܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 18011) ^ (-1157950290);
                        i5 = -725414767;
                    } else {
                        iM3169 = C0619.m2761("᩵ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 8493) ^ (-203671582);
                        i5 = 526343542;
                    }
                    break;
                case -432205691:
                case 1031702736:
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0773.m3169("۟֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-13239)) ^ (-1481175379);
                        i5 = -1162026007;
                    } else {
                        iM3169 = C0619.m2761("ۢܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 18011) ^ (-1157950290);
                        i5 = -725414767;
                    }
                    break;
                case -90534512:
                case 585906661:
                    if (C3690.m11997(dialogInterfaceC8327)) {
                        iM3169 = (C0773.m3169("֫ܶ") ^ i2) * (-45);
                        i4 = ((iM3169 ^ i3) * 1343) ^ (-1891841352);
                        i5 = -393437539;
                    } else {
                        iM3169 = (C0619.m2761("֫ۜ") ^ i3) * (-113);
                        i4 = ((iM3169 ^ i2) * (-7357)) ^ 348306397;
                        i5 = 1807561652;
                    }
                    break;
                case -68780884:
                case 1927408450:
                    C3492.m11488();
                    C2878.m9491();
                    iM3169 = C0619.m2761("ۢܽ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 18011) ^ (-1157950290);
                    i5 = -725414767;
                    break;
                case 359782716:
                case 1985359885:
                    if (C1826.f6190 <= 0) {
                        iM3169 = C0619.m2761("᩷֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * 23987) ^ 401041736;
                        i5 = 397507140;
                    } else {
                        iM3169 = (C0619.m2761("ۛܶ") ^ i3) * 27;
                        i4 = ((iM3169 ^ i2) * (-1983)) ^ (-972713110);
                        i5 = -1513694999;
                    }
                    break;
                case 472180283:
                case 1911228761:
                    if (C3779.f12953 <= 0) {
                        iM3169 = (C0619.m2761("᩸֡") ^ i2) * (-21);
                        i4 = ((iM3169 ^ i3) * 25203) ^ 357984899;
                        i5 = 235994278;
                    } else {
                        iM3169 = C0619.m2761("ۢܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 18011) ^ (-1157950290);
                        i5 = -725414767;
                    }
                    break;
                case 617719528:
                case 2043823431:
                    atomicInteger = this.f25887;
                    if (C3492.f12043 <= 0) {
                        iM3169 = (i3 - C0773.m3169("ᩴܿ")) * 45;
                        i4 = ((iM3169 ^ i2) * 16819) ^ 1045580965;
                        i5 = 119400479;
                    } else {
                        iM3169 = (i3 - C0619.m2761("֨ۘ")) * (-55);
                        i4 = ((iM3169 ^ i2) * 2945) ^ 1245883909;
                        i5 = 1074012620;
                    }
                    break;
                case 777088579:
                case 898674428:
                    if (C3690.m11987()) {
                        iM3169 = (i3 - C0773.m3169("ᩴܿ")) * 45;
                        i4 = ((iM3169 ^ i2) * 16819) ^ 1045580965;
                        i5 = 119400479;
                    } else {
                        iM3169 = C0773.m3169("ۖᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 18223) ^ 1705848913;
                        i5 = 2109010262;
                    }
                    break;
                case 911972806:
                case 936269993:
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0619.m2761("ۢܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 18011) ^ (-1157950290);
                        i5 = -725414767;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۤܺ")) * (-25);
                        i4 = ((iM3169 ^ i2) * (-29279)) ^ 91970707;
                        i5 = 166278983;
                    }
                    break;
                case 1467537294:
                case 1711533618:
                    if (C3492.m11488()) {
                        iM3169 = (i3 - C0619.m2761("ۢۡ")) * (-57);
                        i4 = ((iM3169 ^ i2) * (-5643)) ^ (-2127746277);
                        i5 = -1747860967;
                    } else {
                        iM3169 = C0773.m3169("۟֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-13239)) ^ (-1481175379);
                        i5 = -1162026007;
                    }
                    break;
                default:
                    if (isChangingConfigurations()) {
                        iM3169 = (i2 - C0619.m2761("ۗ᩹")) * (-61);
                        i4 = ((iM3169 ^ i3) * 21803) ^ (-194292224);
                        i5 = 1713603014;
                    } else {
                        iM3169 = C0619.m2761("᩺ܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-32161)) ^ (-369831874);
                        i5 = -847295721;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4064 m21193(ViewOnClickListenerC7793 viewOnClickListenerC7793, C9829 c9829, C9829 c98210, String str, String str2) {
        int i = -2032447368;
        int i2 = C20932.f66974;
        int i3 = C4238.f15451;
        int iM3169 = C0773.m3169("ۧ۟") ^ i3;
        int i4 = ((iM3169 ^ i2) * 15971) ^ (-1096450003);
        int i5 = 595775632;
        while (true) {
            i = ((((i ^ i2) * 31989) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2141005656:
                case 33551157:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0773.m3169("ۧۖ") + i3) * (-35);
                        i4 = ((iM3169 ^ i2) * 23511) ^ (-1753530344);
                        i5 = -705402644;
                    } else {
                        iM3169 = (C0773.m3169("᩷ܰ") + i2) * (-101);
                        i4 = ((iM3169 ^ i3) * (-19873)) ^ 1248442873;
                        i5 = -381700057;
                    }
                    break;
                case -2045993548:
                case 1581819236:
                    if (C2878.f9462) {
                        iM3169 = (C0773.m3169("ۧۖ") + i3) * (-35);
                        i4 = ((iM3169 ^ i2) * 23511) ^ (-1753530344);
                        i5 = -705402644;
                    } else {
                        iM3169 = (C0773.m3169("ܶ۬") ^ i3) * 53;
                        i4 = ((iM3169 ^ i2) * 32411) ^ (-1412053709);
                        i5 = -1417188378;
                    }
                    break;
                case -2027743820:
                case -1242306686:
                    C1343.m4943();
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0619.m2761("ۨ᩹") ^ i3) * 123;
                        i4 = ((iM3169 ^ i2) * 10113) ^ (-91914250);
                        i5 = -157141923;
                    } else {
                        iM3169 = (C0773.m3169("ܿܳ") ^ i2) * (-97);
                        i4 = ((iM3169 ^ i3) * (-5237)) ^ 1710306321;
                        i5 = -1214533333;
                    }
                    break;
                case -1843306836:
                case 893212775:
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0619.m2761("ۨ᩹") ^ i3) * 123;
                        i4 = ((iM3169 ^ i2) * 10113) ^ (-91914250);
                        i5 = -157141923;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ۖۨ")) * (-31);
                        i4 = ((iM3169 ^ i3) * 5117) ^ (-459124670);
                        i5 = -1895394761;
                    }
                    break;
                case -1791676063:
                case 2084286096:
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0773.m3169("ۧۖ") + i3) * (-35);
                        i4 = ((iM3169 ^ i2) * 23511) ^ (-1753530344);
                        i5 = -705402644;
                    } else {
                        iM3169 = (C0619.m2761("۠ۚ") ^ i2) * 19;
                        i4 = ((iM3169 ^ i3) * 28897) ^ 699111285;
                        i5 = -631889462;
                    }
                    break;
                case -1586824215:
                case -221128691:
                    if (C2834.f9334 <= 0) {
                        iM3169 = (C0619.m2761("ۨ᩹") ^ i3) * 123;
                        i4 = ((iM3169 ^ i2) * 10113) ^ (-91914250);
                        i5 = -157141923;
                    } else {
                        iM3169 = C0773.m3169("᩸ۛ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-10431)) ^ (-385888538);
                        i5 = -776693179;
                    }
                    break;
                case -1571436265:
                case 2134483812:
                    C1321.m4852();
                    C3077.m10041();
                    return null;
                case -1521786409:
                case 145551374:
                    if (C1080.f3865 >= 0) {
                        iM3169 = (C0773.m3169("᩺ۗ") ^ i3) * (-127);
                        i4 = ((iM3169 ^ i2) * (-26641)) ^ (-1411808631);
                        i5 = -611075840;
                    } else {
                        iM3169 = C0619.m2761("᩷ܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-1107)) ^ (-308931320);
                        i5 = -754268484;
                    }
                    break;
                case -953351113:
                case -786424844:
                    C1519.m5403();
                    iM3169 = (C0773.m3169("ܿܳ") ^ i2) * (-97);
                    i4 = ((iM3169 ^ i3) * (-5237)) ^ 1710306321;
                    i5 = -1214533333;
                    break;
                case -577196626:
                case 1022223157:
                    C2310.m7813();
                    if (C1826.m6301() < 0) {
                        iM3169 = C0619.m2761("ۙۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-5109)) ^ (-616673610);
                        i5 = -837228201;
                    } else {
                        iM3169 = (C0773.m3169("ۧۖ") + i3) * (-35);
                        i4 = ((iM3169 ^ i2) * 23511) ^ (-1753530344);
                        i5 = -705402644;
                    }
                    break;
                case -404934071:
                case 1453194608:
                    C6302 c6302M30643 = C12267.m30643(c9829, str);
                    C3734.m12155(viewOnClickListenerC7793.f25872);
                    return new C4064(c6302M30643, C12267.m30643(c98210, str2));
                case -143436889:
                case 1620946454:
                    if (RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("ۙۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-5109)) ^ (-616673610);
                        i5 = -837228201;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩶ۛ")) * 75;
                        i4 = ((iM3169 ^ i2) * (-4711)) ^ 521381834;
                        i5 = -1283338421;
                    }
                    break;
                case -104516193:
                case 1976445525:
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0619.m2761("ۨ᩹") ^ i3) * 123;
                        i4 = ((iM3169 ^ i2) * 10113) ^ (-91914250);
                        i5 = -157141923;
                    } else {
                        iM3169 = C0773.m3169("᩻᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-8379)) ^ 502012583;
                        i5 = 920038111;
                    }
                    break;
                case -75798109:
                case 1913257162:
                    C17202.m40369(viewOnClickListenerC7793.f25880);
                    if (C3448.f11240 >= 0) {
                        iM3169 = (C0773.m3169("᩺ۗ") ^ i3) * (-127);
                        i4 = ((iM3169 ^ i2) * (-26641)) ^ (-1411808631);
                        i5 = -611075840;
                    } else {
                        iM3169 = (C0773.m3169("ۤ۬") + i3) * (-53);
                        i4 = ((iM3169 ^ i2) * (-21035)) ^ 1090605967;
                        i5 = -868246510;
                    }
                    break;
                case 858395044:
                case 2140602701:
                    if (RunnableC3646.f12471) {
                        iM3169 = (C0619.m2761("ۨ᩹") ^ i3) * 123;
                        i4 = ((iM3169 ^ i2) * 10113) ^ (-91914250);
                        i5 = -157141923;
                    } else {
                        iM3169 = C0773.m3169("۠ۛ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 9985) ^ (-848429426);
                        i5 = -1105520932;
                    }
                    break;
                default:
                    C4238.m13540();
                    if (C13473.f42873 == 0) {
                        iM3169 = (C0773.m3169("ۧۖ") + i3) * (-35);
                        i4 = ((iM3169 ^ i2) * 23511) ^ (-1753530344);
                        i5 = -705402644;
                    } else {
                        iM3169 = (C0773.m3169("ܿܳ") ^ i2) * (-97);
                        i4 = ((iM3169 ^ i3) * (-5237)) ^ 1710306321;
                        i5 = -1214533333;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public boolean m21234() {
        C18234 c18234 = null;
        int i = 0;
        ViewOnClickListenerC7793 viewOnClickListenerC7793 = null;
        int i2 = -1995357261;
        int i3 = C1826.f6190;
        int i4 = C1542.f5343;
        int iM3169 = C0773.m3169("ۧᩳ") ^ i3;
        int i5 = ((iM3169 ^ i4) * 18503) ^ (-2028041435);
        int i6 = -463939313;
        while (true) {
            i2 = ((((i2 ^ i4) * (-16503)) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2135090556:
                case -956273936:
                    if (this.f25888) {
                        iM3169 = (i3 - C0619.m2761("ۧ֨")) * (-31);
                        i5 = ((iM3169 ^ i4) * 32199) ^ (-1819845877);
                        i6 = -1318546358;
                    } else {
                        iM3169 = C0619.m2761("᩶᩵") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-29159)) ^ 407703147;
                        i6 = -1927967771;
                    }
                    break;
                case -2083490190:
                case -589904572:
                    i = c18234.f59527;
                    viewOnClickListenerC7793 = c18234.f59528;
                    if (C3492.m11488()) {
                        iM3169 = (C0773.m3169("ܳܿ") + i3) * (-67);
                        i5 = ((iM3169 ^ i4) * (-10105)) ^ 944725786;
                        i6 = -758635381;
                    } else {
                        iM3169 = C0619.m2761("ۨ᩹") ^ i3;
                        i5 = ((iM3169 ^ i4) * 19077) ^ 1281552153;
                        i6 = -1158024;
                    }
                    break;
                case -2082285067:
                case 1019770880:
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0773.m3169("ۙᩳ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 17823) ^ 756125525;
                        i6 = -940299461;
                    } else {
                        iM3169 = C0773.m3169("᩵ۤ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-28965)) ^ (-59894775);
                        i6 = 1298666971;
                    }
                    break;
                case -1902836307:
                case 1132016855:
                    C0862.m3503();
                    if (C2878.f9462) {
                        iM3169 = C0619.m2761("ܽ᩺") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-1695)) ^ 31024590;
                        i6 = 765403582;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܺۙ")) * (-85);
                        i5 = ((iM3169 ^ i4) * (-12603)) ^ (-764211270);
                        i6 = -827902350;
                    }
                    break;
                case -1857271282:
                case 1411654519:
                    return true;
                case -1693739250:
                case 434420181:
                    C3448.m11248();
                    C2354.m7983();
                    return false;
                case -1680073189:
                case 1868686842:
                    if (i != C1519.m5400(viewOnClickListenerC7793.f25882)) {
                        iM3169 = C0773.m3169("֡ۚ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-5915)) ^ 1127920276;
                        i6 = 2035825518;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۧ֨")) * (-31);
                        i5 = ((iM3169 ^ i4) * 32199) ^ (-1819845877);
                        i6 = -1318546358;
                    }
                    break;
                case -1594518309:
                case 783709017:
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0773.m3169("ۙᩳ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 17823) ^ 756125525;
                        i6 = -940299461;
                    } else {
                        iM3169 = C0619.m2761("۟᩹") ^ i3;
                        i5 = ((iM3169 ^ i4) * 5149) ^ 1776442048;
                        i6 = 657741853;
                    }
                    break;
                case -1373536618:
                case 697179443:
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0773.m3169("ۙᩳ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 17823) ^ 756125525;
                        i6 = -940299461;
                    } else {
                        iM3169 = C0773.m3169("֨᩵") ^ i3;
                        i5 = ((iM3169 ^ i4) * 95) ^ 279737307;
                        i6 = 193208272;
                    }
                    break;
                case -1324306900:
                case 1416091633:
                    c18234 = this.f25875;
                    if (c18234 != null) {
                        iM3169 = C0773.m3169("ۚۧ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 17143) ^ (-1544350084);
                        i6 = -894341869;
                    } else {
                        iM3169 = C0773.m3169("֡ۚ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-5915)) ^ 1127920276;
                        i6 = 2035825518;
                    }
                    break;
                case -1016880170:
                case 1149404248:
                    if (C0862.m3503()) {
                        iM3169 = (i4 - C0773.m3169("۫ۘ")) * (-93);
                        i5 = ((iM3169 ^ i3) * 29247) ^ 239080083;
                        i6 = 1795550461;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܺۙ")) * (-85);
                        i5 = ((iM3169 ^ i4) * (-12603)) ^ (-764211270);
                        i6 = -827902350;
                    }
                    break;
                case -998832778:
                case 601477961:
                    if (this.f25886) {
                        iM3169 = (i3 - C0619.m2761("ۧ֨")) * (-31);
                        i5 = ((iM3169 ^ i4) * 32199) ^ (-1819845877);
                        i6 = -1318546358;
                    } else {
                        iM3169 = C0773.m3169("ᩴ᩻") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-2083)) ^ 1844561729;
                        i6 = -705244340;
                    }
                    break;
                case -986295492:
                case 439708650:
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0619.m2761("ۨ᩹") ^ i3;
                        i5 = ((iM3169 ^ i4) * 19077) ^ 1281552153;
                        i6 = -1158024;
                    } else {
                        iM3169 = (C0619.m2761("᩷ᩴ") + i4) * (-61);
                        i5 = ((iM3169 ^ i3) * 9839) ^ 1865711238;
                        i6 = -1403184766;
                    }
                    break;
                case -534635868:
                case 141701326:
                    if (C3448.f11240 < 0) {
                        iM3169 = (i3 - C0619.m2761("ܺۙ")) * (-85);
                        i5 = ((iM3169 ^ i4) * (-12603)) ^ (-764211270);
                        i6 = -827902350;
                    } else {
                        iM3169 = C0619.m2761("ۨ᩹") ^ i3;
                        i5 = ((iM3169 ^ i4) * 19077) ^ 1281552153;
                        i6 = -1158024;
                    }
                    break;
                case -362522084:
                case 1232791684:
                    C2287.m7745();
                    if (C3734.m12152() < 0) {
                        iM3169 = C0619.m2761("ۨ᩹") ^ i3;
                        i5 = ((iM3169 ^ i4) * 19077) ^ 1281552153;
                        i6 = -1158024;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۧ᩶")) * 83;
                        i5 = ((iM3169 ^ i3) * 17079) ^ (-2130646262);
                        i6 = 708919523;
                    }
                    break;
                case -110513520:
                case 1229536455:
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0773.m3169("ۙᩳ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 17823) ^ 756125525;
                        i6 = -940299461;
                    } else {
                        iM3169 = C0773.m3169("ۖۙ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 32331) ^ (-435629354);
                        i6 = -1484371214;
                    }
                    break;
                case -72667167:
                case 2033310668:
                    return false;
                case 109709008:
                case 1225259134:
                    if (C17202.m40372()) {
                        iM3169 = C0619.m2761("ۡܶ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 25031) ^ (-1462033820);
                        i6 = -1940435099;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܺۙ")) * (-85);
                        i5 = ((iM3169 ^ i4) * (-12603)) ^ (-764211270);
                        i6 = -827902350;
                    }
                    break;
                case 156457172:
                case 1318410794:
                    C2834.m9344();
                    C3448.m11248();
                    iM3169 = C0619.m2761("ۨ᩹") ^ i3;
                    i5 = ((iM3169 ^ i4) * 19077) ^ 1281552153;
                    i6 = -1158024;
                    break;
                case 599165973:
                case 809061915:
                    if (C3077.m10048(this)) {
                        iM3169 = (i3 - C0619.m2761("ۧ֨")) * (-31);
                        i5 = ((iM3169 ^ i4) * 32199) ^ (-1819845877);
                        i6 = -1318546358;
                    } else {
                        iM3169 = (C0773.m3169("ۙۖ") ^ i4) * 3;
                        i5 = ((iM3169 ^ i3) * 15357) ^ 266644972;
                        i6 = -287438429;
                    }
                    break;
                case 855463984:
                case 1775893880:
                    if (isDestroyed()) {
                        iM3169 = (i3 - C0619.m2761("ۧ֨")) * (-31);
                        i5 = ((iM3169 ^ i4) * 32199) ^ (-1819845877);
                        i6 = -1318546358;
                    } else {
                        iM3169 = (C0773.m3169("ۚ᩶") ^ i4) * (-59);
                        i5 = ((iM3169 ^ i3) * (-24655)) ^ 984431454;
                        i6 = -2015992642;
                    }
                    break;
                case 1137804416:
                case 1342622285:
                    if (C3690.f12684 <= 0) {
                        iM3169 = (i3 - C0619.m2761("ܺۙ")) * (-85);
                        i5 = ((iM3169 ^ i4) * (-12603)) ^ (-764211270);
                        i6 = -827902350;
                    } else {
                        iM3169 = C0773.m3169("۟᩻") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-6191)) ^ (-231924688);
                        i6 = -1341612608;
                    }
                    break;
                default:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0773.m3169("ۙᩳ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 17823) ^ 756125525;
                        i6 = -940299461;
                    } else {
                        iM3169 = C0773.m3169("᩻᩸") ^ i3;
                        i5 = ((iM3169 ^ i4) * 14065) ^ 824038296;
                        i6 = 1651276394;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m21240(ViewOnClickListenerC7793 viewOnClickListenerC7793, int i) throws Throwable {
        long j = 0;
        int i2 = -1722781551;
        int i3 = C2375.f7641;
        int i4 = AbstractC0116.f1064;
        int iM3169 = C0773.m3169("۟ۙ") ^ i3;
        int i5 = ((iM3169 ^ i4) * 22409) ^ 719334901;
        int i6 = 231807278;
        while (true) {
            i2 = ((((i2 ^ i4) * 9525) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2142723857:
                case 2031048333:
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0619.m2761("ۧ᩶") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-20399)) ^ 669210104;
                        i6 = 1151584338;
                    } else {
                        iM3169 = C0773.m3169("ۛۗ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 21243) ^ (-342128112);
                        i6 = 1681797840;
                    }
                    break;
                case -1998109802:
                case 1721383898:
                    j = 100;
                    iM3169 = (C0619.m2761("֨ۚ") ^ i3) * 25;
                    i5 = ((iM3169 ^ i4) * (-14171)) ^ (-463238915);
                    i6 = 769297915;
                    break;
                case -1846818642:
                case 971998279:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (C0619.m2761("᩵֨") ^ i4) * 41;
                        i5 = ((iM3169 ^ i3) * 25141) ^ 670992193;
                        i6 = 2101088859;
                    } else {
                        iM3169 = C0619.m2761("۬᩹") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-8685)) ^ (-342658577);
                        i6 = 2002343924;
                    }
                    break;
                case -1816147894:
                case -96991247:
                    if (C2023.f6737) {
                        iM3169 = (C0773.m3169("ۚ۬") ^ i3) * 33;
                        i5 = ((iM3169 ^ i4) * 2717) ^ (-186616753);
                        i6 = -721776546;
                    } else {
                        iM3169 = C0619.m2761("۫ۖ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 21631) ^ (-2099485029);
                        i6 = 1295109493;
                    }
                    break;
                case -1001216811:
                case -414753759:
                    RunnableC1848.m6360();
                    iM3169 = (C0619.m2761("᩵֨") ^ i4) * 41;
                    i5 = ((iM3169 ^ i3) * 25141) ^ 670992193;
                    i6 = 2101088859;
                    break;
                case -845184989:
                case 1612715056:
                    if (C13473.f42873 != 0) {
                        iM3169 = C0619.m2761("ۧ᩶") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-20399)) ^ 669210104;
                        i6 = 1151584338;
                    } else {
                        iM3169 = C0773.m3169("۬֫") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-25601)) ^ 883917113;
                        i6 = 1010101791;
                    }
                    break;
                case -705140836:
                case 704485515:
                    C1343.m4943();
                    break;
                case -433497506:
                case 1147917480:
                    try {
                        SystemClock.sleep(j);
                        C12267 c12267 = viewOnClickListenerC7793.f25880;
                        viewOnClickListenerC7793.m21194(c12267.f39446.f10826, c12267.f39451, viewOnClickListenerC7793.f25897, i);
                        break;
                    } catch (Exception unused) {
                    }
                    iM3169 = C0773.m3169("ᩳ۠") ^ i4;
                    i5 = ((iM3169 ^ i3) * 7859) ^ (-774703014);
                    i6 = 1161148536;
                    break;
                case 142864755:
                case 1745441924:
                    if (AbstractC0641.f2496 < 0) {
                        iM3169 = C0619.m2761("ۧ᩶") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-20399)) ^ 669210104;
                        i6 = 1151584338;
                    } else {
                        iM3169 = (C0773.m3169("ۚ۬") ^ i3) * 33;
                        i5 = ((iM3169 ^ i4) * 2717) ^ (-186616753);
                        i6 = -721776546;
                    }
                    break;
                case 303309420:
                case 531287241:
                    C2375.m8065();
                    if (!RunnableC1848.m6360()) {
                        iM3169 = (C0619.m2761("᩵֨") ^ i4) * 41;
                        i5 = ((iM3169 ^ i3) * 25141) ^ 670992193;
                        i6 = 2101088859;
                    } else {
                        iM3169 = (C0773.m3169("ۚ۬") ^ i3) * 33;
                        i5 = ((iM3169 ^ i4) * 2717) ^ (-186616753);
                        i6 = -721776546;
                    }
                    break;
                case 484869320:
                case 1514438559:
                    if (C2354.m7983()) {
                        iM3169 = C0619.m2761("֫ۛ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-11789)) ^ (-1992268031);
                        i6 = 1337289292;
                    } else {
                        iM3169 = C0773.m3169("᩶ᩴ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-18387)) ^ (-494029254);
                        i6 = 369725806;
                    }
                    break;
                case 645578628:
                case 1502153402:
                    if (C4282.f15546 <= 0) {
                        iM3169 = (C0619.m2761("᩵֨") ^ i4) * 41;
                        i5 = ((iM3169 ^ i3) * 25141) ^ 670992193;
                        i6 = 2101088859;
                    } else {
                        iM3169 = C0773.m3169("ۗۘ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 8523) ^ (-1724980005);
                        i6 = 418947989;
                    }
                    break;
                case 741887243:
                case 996886693:
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("ۜۘ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 30237) ^ (-121691902);
                        i6 = 211670963;
                    } else {
                        iM3169 = (C0619.m2761("ܿ᩵") + i3) * (-71);
                        i5 = ((iM3169 ^ i4) * (-6203)) ^ (-1836518669);
                        i6 = -2062367561;
                    }
                    break;
                case 750221771:
                case 1093173001:
                    break;
                case 813542468:
                case 1802864502:
                    if (C2288.f7433 > 0) {
                        iM3169 = C0773.m3169("᩶ᩴ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-18387)) ^ (-494029254);
                        i6 = 369725806;
                    } else {
                        iM3169 = (C0619.m2761("᩵֨") ^ i4) * 41;
                        i5 = ((iM3169 ^ i3) * 25141) ^ 670992193;
                        i6 = 2101088859;
                    }
                    break;
                case 879527270:
                case 1223337561:
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0773.m3169("ۚ۬") ^ i3) * 33;
                        i5 = ((iM3169 ^ i4) * 2717) ^ (-186616753);
                        i6 = -721776546;
                    } else {
                        iM3169 = C0619.m2761("֫ۙ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 191) ^ 1986090830;
                        i6 = -31044413;
                    }
                    break;
                case 1389685874:
                case 1934056261:
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0773.m3169("ۚ۬") ^ i3) * 33;
                        i5 = ((iM3169 ^ i4) * 2717) ^ (-186616753);
                        i6 = -721776546;
                    } else {
                        iM3169 = C0619.m2761("ᩳܺ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-18029)) ^ (-338141960);
                        i6 = 1386680538;
                    }
                    break;
                default:
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0773.m3169("ۜۘ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 30237) ^ (-121691902);
                        i6 = 211670963;
                    } else {
                        iM3169 = C0619.m2761("ᩴᩴ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 17397) ^ 276225093;
                        i6 = 1653049574;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x013c A[PHI: r9 r10
      0x013c: PHI (r9v4 l.ۨۢ֫) = (r9v3 l.ۨۢ֫), (r9v2 l.ۨۢ֫) binds: [B:36:0x013a, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r10v4 l.ۛۢ֫) = (r10v3 l.ۛۢ֫), (r10v2 l.ۛۢ֫) binds: [B:36:0x013a, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x026e A[PHI: r4 r8 r11 r12 r13 r18
      0x026e: PHI (r4v4 l.ۛۢ֫) = (r4v3 l.ۛۢ֫), (r4v2 l.ۛۢ֫), (r4v2 l.ۛۢ֫), (r4v2 l.ۛۢ֫), (r4v2 l.ۛۢ֫), (r4v2 l.ۛۢ֫) binds: [B:65:0x026c, B:44:0x0192, B:28:0x00f4, B:24:0x00cc, B:10:0x0059, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:65:0x026c, B:44:0x0192, B:28:0x00f4, B:24:0x00cc, B:10:0x0059, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r11v4 l.ۗۢ֫) = (r11v2 l.ۗۢ֫), (r11v2 l.ۗۢ֫), (r11v3 l.ۗۢ֫), (r11v2 l.ۗۢ֫), (r11v2 l.ۗۢ֫), (r11v2 l.ۗۢ֫) binds: [B:65:0x026c, B:44:0x0192, B:28:0x00f4, B:24:0x00cc, B:10:0x0059, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r12v4 l.ۢۖ᩹) = (r12v2 l.ۢۖ᩹), (r12v2 l.ۢۖ᩹), (r12v3 l.ۢۖ᩹), (r12v2 l.ۢۖ᩹), (r12v2 l.ۢۖ᩹), (r12v2 l.ۢۖ᩹) binds: [B:65:0x026c, B:44:0x0192, B:28:0x00f4, B:24:0x00cc, B:10:0x0059, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:65:0x026c, B:44:0x0192, B:28:0x00f4, B:24:0x00cc, B:10:0x0059, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r18v9 l.ۨۢ֫) = (r18v7 l.ۨۢ֫), (r18v3 l.ۨۢ֫), (r18v3 l.ۨۢ֫), (r18v3 l.ۨۢ֫), (r18v3 l.ۨۢ֫), (r18v3 l.ۨۢ֫) binds: [B:65:0x026c, B:44:0x0192, B:28:0x00f4, B:24:0x00cc, B:10:0x0059, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21199(ViewOnClickListenerC7793 viewOnClickListenerC7793, C4064 c4064) {
        C12267 c12267;
        int i;
        int iM3169;
        int i2;
        C12267 c12268;
        int i3;
        C3318 c3318;
        int i4;
        int iM2761;
        int i5;
        ViewOnClickListenerC7793 viewOnClickListenerC7794 = viewOnClickListenerC7793;
        int i6 = C3448.f11240;
        int i7 = C1080.f3865;
        int iM2762 = (C0619.m2761("ܳ֡") ^ i7) * (-33);
        int i8 = ((iM2762 ^ i6) * 22397) ^ 1842166167;
        ViewOnClickListenerC7793 viewOnClickListenerC7795 = null;
        C9829 c9829 = null;
        int i9 = iM2762 ^ 1443938319;
        int i10 = 0;
        int i11 = -2083970145;
        C12267 c12269 = null;
        C9829 c98210 = null;
        C3318 c3319 = null;
        C3318 c33110 = null;
        C6302 c6302 = null;
        C6302 c6303 = null;
        C12267 c122610 = null;
        int i12 = 0;
        while (true) {
            i11 = i9 ^ (i8 & (((i11 ^ i6) * (-10207)) >> 31));
            switch (i11) {
                case -1793786838:
                case -1339085869:
                    C11235.m28309();
                    break;
                case -1537741211:
                case 1936305560:
                    RunnableC1848.m6368(c33110);
                    c122610 = viewOnClickListenerC7794.f25872;
                    c6302 = c4064.f13876;
                    C3734.m12155(c122610);
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0619.m2761("ۗܳ") ^ i6;
                        i = ((iM3169 ^ i7) * (-11463)) ^ 59708100;
                        i2 = -983366023;
                    } else {
                        iM3169 = (C0619.m2761("֨ۛ") + i7) * 127;
                        i = ((iM3169 ^ i6) * (-4801)) ^ 632226738;
                        i2 = 1867943368;
                    }
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    break;
                case -1305152992:
                case -858958736:
                    c33110.f10823 = c98210;
                    c33110.f10828 = c6303.f21375;
                    viewOnClickListenerC7795 = c33110.f10825;
                    if (C0487.m2356() < 0) {
                        iM3169 = (C0773.m3169("ܶۗ") + i6) * (-91);
                        i = ((iM3169 ^ i7) * 1839) ^ 1062889827;
                        i2 = 1773482380;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                    } else {
                        c12268 = c12269;
                        iM2761 = C0619.m2761("ᩳۘ") ^ i6;
                        c3318 = c33110;
                        i4 = ((iM2761 ^ i7) * (-23583)) ^ 1309477647;
                        i3 = 878504234;
                        i5 = iM2761 ^ i3;
                        c12269 = c12268;
                        i8 = i4;
                        c33110 = c3318;
                        i9 = i5;
                    }
                    break;
                case -1285215311:
                case -721357389:
                    C3448.m11248();
                    C2419.m8174();
                    c12267 = c12269;
                    int iM31610 = (C0773.m3169("۟ۢ") + i6) * (-29);
                    C12267 c122611 = c12267;
                    i8 = ((iM31610 ^ i7) * (-11963)) ^ 1153337190;
                    i5 = iM31610 ^ 983057489;
                    c12269 = c122611;
                    i9 = i5;
                    break;
                case -1219949139:
                case -330271518:
                    c122610.f39450 = c6302.f21373;
                    if (C3492.f12043 > 0) {
                        iM3169 = C0619.m2761("ܽܽ") ^ i6;
                        i = ((iM3169 ^ i7) * 8125) ^ 1004413306;
                        i2 = -1197544179;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                    } else {
                        c12267 = c12269;
                        int iM31611 = (C0773.m3169("۟ۢ") + i6) * (-29);
                        C12267 c122612 = c12267;
                        i8 = ((iM31611 ^ i7) * (-11963)) ^ 1153337190;
                        i5 = iM31611 ^ 983057489;
                        c12269 = c122612;
                        i9 = i5;
                    }
                    break;
                case -1131673435:
                case 649501588:
                    c12267 = c12269;
                    C3734.m12155(c12267);
                    c12267.f39450 = c6303.f21373;
                    if (C11235.f35427 < 0) {
                        int iM2763 = C0619.m2761("ۨۢ") ^ i7;
                        i = ((iM2763 ^ i6) * 25593) ^ 1564361693;
                        c12269 = c12267;
                        i9 = iM2763 ^ (-60313722);
                        i8 = i;
                    } else {
                        int iM31612 = (C0773.m3169("۟ۢ") + i6) * (-29);
                        C12267 c122613 = c12267;
                        i8 = ((iM31612 ^ i7) * (-11963)) ^ 1153337190;
                        i5 = iM31612 ^ 983057489;
                        c12269 = c122613;
                        i9 = i5;
                    }
                    break;
                case -602509495:
                case 549171053:
                    if (C2375.f7641 <= 0) {
                        iM3169 = (i7 - C0773.m3169("ۛ᩺")) * 59;
                        i = ((iM3169 ^ i6) * (-22107)) ^ 796633739;
                        i2 = -176927202;
                    } else {
                        iM3169 = C0619.m2761("ۗܳ") ^ i6;
                        i = ((iM3169 ^ i7) * (-11463)) ^ 59708100;
                        i2 = -983366023;
                    }
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    break;
                case -506214123:
                case 1180913742:
                    C12267 c122614 = viewOnClickListenerC7794.f25880;
                    c6303 = c4064.f13877;
                    if (C3734.f12817 >= 0) {
                        c12269 = c122614;
                        iM3169 = (i7 - C0773.m3169("ۛ᩺")) * 59;
                        i = ((iM3169 ^ i6) * (-22107)) ^ 796633739;
                        i2 = -176927202;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                    } else {
                        int iM2764 = C0619.m2761("۬۠") ^ i6;
                        i9 = iM2764 ^ 1422223735;
                        c12269 = c122614;
                        i8 = ((iM2764 ^ i7) * 2875) ^ 1232841583;
                        viewOnClickListenerC7794 = viewOnClickListenerC7793;
                    }
                    break;
                case -185416704:
                case 1855973296:
                    c3319.f10824 = i10 + 1;
                    RunnableC1848.m6368(c3319);
                    if (viewOnClickListenerC7794.f25886) {
                        iM3169 = (C0773.m3169("ۗܿ") + i6) * (-115);
                        i = ((iM3169 ^ i7) * 4829) ^ 2047166422;
                        i2 = 1544952096;
                    } else {
                        iM3169 = C0773.m3169("ۨ۫") ^ i7;
                        i = ((iM3169 ^ i6) * (-16285)) ^ (-392804937);
                        i2 = -876294748;
                    }
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    break;
                case 50264097:
                case 611328696:
                    c3319.f10823 = c9829;
                    c3319.f10828 = c6302.f21375;
                    c3319.f10825.f25883 = i12;
                    i10 = c3319.f10824;
                    if (C2834.f9334 <= 0) {
                        iM3169 = (i7 - C0773.m3169("ۛ᩺")) * 59;
                        i = ((iM3169 ^ i6) * (-22107)) ^ 796633739;
                        i2 = -176927202;
                    } else {
                        iM3169 = (C0773.m3169("ۤۢ") + i6) * (-123);
                        i = ((iM3169 ^ i7) * (-18277)) ^ 1232102660;
                        i2 = -1864716364;
                    }
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    break;
                case 80559375:
                case 2140984009:
                    i12 = -1;
                    viewOnClickListenerC7795.f25883 = -1;
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (i7 - C0773.m3169("ۛ᩺")) * 59;
                        i = ((iM3169 ^ i6) * (-22107)) ^ 796633739;
                        i2 = -176927202;
                    } else {
                        iM3169 = (C0619.m2761("᩺ܰ") ^ i7) * 93;
                        i = ((iM3169 ^ i6) * (-6655)) ^ (-1616467132);
                        i2 = -1221760740;
                    }
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    break;
                case 83217146:
                case 87555838:
                    c33110.f10824++;
                    if (!C2023.f6737) {
                        iM3169 = (i6 - C0773.m3169("֫ۡ")) * (-17);
                        i = ((iM3169 ^ i7) * 32527) ^ (-1254639467);
                        i2 = -531679896;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                    } else {
                        c12268 = c12269;
                        iM2761 = C0619.m2761("ᩳۘ") ^ i6;
                        c3318 = c33110;
                        i4 = ((iM2761 ^ i7) * (-23583)) ^ 1309477647;
                        i3 = 878504234;
                        i5 = iM2761 ^ i3;
                        c12269 = c12268;
                        i8 = i4;
                        c33110 = c3318;
                        i9 = i5;
                    }
                    break;
                case 89858367:
                case 279070287:
                    break;
                case 392465863:
                case 1356314123:
                    c3319 = c122610.f39446;
                    C17202.m40369(c3319);
                    c3319.f10826 = c6302.f21374;
                    c9829 = c6302.f21376;
                    if (C3779.f12953 <= 0) {
                        iM3169 = (i7 - C0773.m3169("ۛ᩺")) * 59;
                        i = ((iM3169 ^ i6) * (-22107)) ^ 796633739;
                        i2 = -176927202;
                    } else {
                        iM3169 = (C0773.m3169("ۨ۟") + i7) * (-71);
                        i = ((iM3169 ^ i6) * 5493) ^ (-1106952596);
                        i2 = 34652063;
                    }
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    break;
                case 654386580:
                case 1898755933:
                    c12268 = c12269;
                    c33110 = c12268.f39446;
                    C3734.m12155(c33110);
                    c33110.f10826 = c6303.f21374;
                    c98210 = c6303.f21376;
                    if (C2878.m9491() <= 0) {
                        iM2761 = C0619.m2761("ᩳۘ") ^ i6;
                        c3318 = c33110;
                        i4 = ((iM2761 ^ i7) * (-23583)) ^ 1309477647;
                        i3 = 878504234;
                    } else {
                        iM2761 = C0773.m3169("۠֨") ^ i7;
                        c3318 = c33110;
                        i4 = ((iM2761 ^ i6) * 27749) ^ 1693387406;
                        i3 = 397138000;
                    }
                    i5 = iM2761 ^ i3;
                    c12269 = c12268;
                    i8 = i4;
                    c33110 = c3318;
                    i9 = i5;
                    break;
                case 757752291:
                case 930450245:
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0619.m2761("᩸ۡ") ^ i7) * (-29);
                        i = ((iM3169 ^ i6) * 14577) ^ 1244490615;
                        i2 = -1763200046;
                    } else {
                        iM3169 = (i7 - C0773.m3169("ۛ᩺")) * 59;
                        i = ((iM3169 ^ i6) * (-22107)) ^ 796633739;
                        i2 = -176927202;
                    }
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    break;
                case 825042607:
                case 1697299629:
                    if (AbstractC0116.f1064 > 0) {
                        iM3169 = (C0619.m2761("᩸ۡ") ^ i7) * (-29);
                        i = ((iM3169 ^ i6) * 14577) ^ 1244490615;
                        i2 = -1763200046;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                    } else {
                        c12267 = c12269;
                        int iM31613 = (C0773.m3169("۟ۢ") + i6) * (-29);
                        C12267 c122615 = c12267;
                        i8 = ((iM31613 ^ i7) * (-11963)) ^ 1153337190;
                        i5 = iM31613 ^ 983057489;
                        c12269 = c122615;
                        i9 = i5;
                    }
                    break;
                default:
                    viewOnClickListenerC7794.f25886 = false;
                    viewOnClickListenerC7794.m21241(false);
                    iM3169 = C0773.m3169("ۨ۫") ^ i7;
                    i = ((iM3169 ^ i6) * (-16285)) ^ (-392804937);
                    i2 = -876294748;
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC17242
    /* JADX INFO: renamed from: ۫ */
    public final void mo4897() {
        AtomicInteger atomicInteger = null;
        int iM5517 = 0;
        C3072 c3072 = null;
        boolean z = false;
        int i = 165100397;
        int i2 = C0773.f2792;
        int i3 = C2287.f7432;
        int iM3169 = C0773.m3169("ܿܶ") ^ i3;
        int i4 = ((iM3169 ^ i2) * 25085) ^ 364398280;
        int i5 = -1053211020;
        while (true) {
            i = ((((i ^ i2) * 4739) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1887187580:
                case -1574807687:
                    iM5517 = C1564.m5517(this.f25882);
                    if (C2419.f7754 >= 0) {
                        iM3169 = (C0773.m3169("ᩳ᩹") + i2) * 89;
                        i4 = ((iM3169 ^ i3) * 31447) ^ (-2107449106);
                        i5 = 879840939;
                    } else {
                        iM3169 = C0773.m3169("᩸ۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-10491)) ^ 1450281646;
                        i5 = -1196366735;
                    }
                    break;
                case -1803608643:
                case 1326754542:
                    z = false;
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0619.m2761("֡۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11923)) ^ (-2062844673);
                        i5 = -2031126280;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ܶ᩶")) * (-63);
                        i4 = ((iM3169 ^ i3) * 4925) ^ 2032656999;
                        i5 = -1963083328;
                    }
                    break;
                case -1615017375:
                case 2011156568:
                    this.f25872.f39447.m10021(z);
                    break;
                case -1367155025:
                case 1581857046:
                    C1564.m5517(this.f25887);
                    if (C2375.f7641 <= 0) {
                        iM3169 = (C0773.m3169("ᩳ᩹") + i2) * 89;
                        i4 = ((iM3169 ^ i3) * 31447) ^ (-2107449106);
                        i5 = 879840939;
                    } else {
                        iM3169 = C0619.m2761("ۤۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 267) ^ (-830061795);
                        i5 = 1758512211;
                    }
                    break;
                case -1117851947:
                case 912919292:
                    c3072 = this.f25880.f39447;
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (C0773.m3169("᩶ۖ") ^ i3) * (-111);
                        i4 = ((iM3169 ^ i2) * (-25135)) ^ 1786730425;
                        i5 = 131643522;
                    } else {
                        iM3169 = C0773.m3169("֨ۛ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24379) ^ 31959474;
                        i5 = 342373767;
                    }
                    break;
                case -980732825:
                case 178484950:
                    C2878.m9485(atomicInteger);
                    if (C0269.f1558 <= 0) {
                        iM3169 = (C0773.m3169("᩶ۖ") ^ i3) * (-111);
                        i4 = ((iM3169 ^ i2) * (-25135)) ^ 1786730425;
                        i5 = 131643522;
                    } else {
                        iM3169 = C0773.m3169("᩸ۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 31069) ^ 1536459668;
                        i5 = -1887815034;
                    }
                    break;
                case -832376583:
                case 1093549994:
                    if (this.f25886) {
                        iM3169 = C0773.m3169("ۡ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 9153) ^ 390702871;
                        i5 = 1156886091;
                    } else {
                        iM3169 = C0773.m3169("ܶܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 399) ^ (-213070017);
                        i5 = -602128196;
                    }
                    break;
                case -748578813:
                case -389577172:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (C0773.m3169("ᩳ᩹") + i2) * 89;
                        i4 = ((iM3169 ^ i3) * 31447) ^ (-2107449106);
                        i5 = 879840939;
                    } else {
                        iM3169 = C0619.m2761("ܶ֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-23829)) ^ (-470792321);
                        i5 = -1024172193;
                    }
                    break;
                case -549482882:
                case 1961563239:
                    C0950.m3785();
                    if (RunnableC3646.m11813() == 0) {
                        iM3169 = C0619.m2761("֡۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11923)) ^ (-2062844673);
                        i5 = -2031126280;
                    } else {
                        iM3169 = C0619.m2761("ᩳ᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-25215)) ^ 1409640074;
                        i5 = -1184073801;
                    }
                    break;
                case -339859381:
                case 258908139:
                    this.f25888 = true;
                    if (C4238.f15451 >= 0) {
                        iM3169 = (C0773.m3169("᩶ۖ") ^ i3) * (-111);
                        i4 = ((iM3169 ^ i2) * (-25135)) ^ 1786730425;
                        i5 = 131643522;
                    } else {
                        iM3169 = C0773.m3169("ۗۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 21097) ^ 1110944957;
                        i5 = -792922832;
                    }
                    break;
                case -296781156:
                case -130933664:
                    C1826.m6301();
                    if (C0269.f1558 <= 0) {
                        iM3169 = (i2 - C0619.m2761("᩹᩻")) * (-71);
                        i4 = ((iM3169 ^ i3) * 7397) ^ (-1684839737);
                        i5 = -372705807;
                    } else {
                        iM3169 = C0619.m2761("֡۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11923)) ^ (-2062844673);
                        i5 = -2031126280;
                    }
                    break;
                case -177879011:
                case 1122182244:
                    atomicInteger = this.f25897;
                    if (C3077.f9998) {
                        iM3169 = (C0619.m2761("ۘ᩷") ^ i2) * 99;
                        i4 = ((iM3169 ^ i3) * 18129) ^ 1052461930;
                        i5 = -1763761531;
                    } else {
                        iM3169 = C0619.m2761("֡۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11923)) ^ (-2062844673);
                        i5 = -2031126280;
                    }
                    break;
                case -169403116:
                case 964208603:
                    C3448.m11248();
                    C1321.m4852();
                    iM3169 = C0619.m2761("֡۠") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-11923)) ^ (-2062844673);
                    i5 = -2031126280;
                    break;
                case 288644242:
                case 1892998075:
                    AbstractC0641.m2813();
                    if (C1542.f5343 <= 0) {
                        iM3169 = (C0773.m3169("ᩳ᩹") + i2) * 89;
                        i4 = ((iM3169 ^ i3) * 31447) ^ (-2107449106);
                        i5 = 879840939;
                    } else {
                        iM3169 = (i2 - C0619.m2761("᩹᩻")) * (-71);
                        i4 = ((iM3169 ^ i3) * 7397) ^ (-1684839737);
                        i5 = -372705807;
                    }
                    break;
                case 300279218:
                case 950288663:
                    if (C1826.m6301() < 0) {
                        C2834.m9339(new C5556(this, iM5517));
                    }
                    iM3169 = C0619.m2761("֡۠") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-11923)) ^ (-2062844673);
                    i5 = -2031126280;
                    break;
                case 880760622:
                case 1103130025:
                    c3072.m10021(z);
                    if (C17202.m40372()) {
                        iM3169 = C0773.m3169("ܽܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 807) ^ 1703017842;
                        i5 = 531346421;
                    } else {
                        iM3169 = (C0773.m3169("ᩳ᩹") + i2) * 89;
                        i4 = ((iM3169 ^ i3) * 31447) ^ (-2107449106);
                        i5 = 879840939;
                    }
                    break;
                default:
                    C0487.m2356();
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m21209(List list, C9829 c9829) {
        int iM9336 = 0;
        boolean z = false;
        int i = 0;
        C20472 c20472 = null;
        C20472 c20473 = null;
        long j = 0;
        PackageInfo packageInfo = null;
        int i2 = 284958354;
        int i3 = C3448.f11240;
        int i4 = C0487.f2131;
        int iM3169 = C0773.m3169("ᩳۤ") ^ i4;
        int i5 = ((iM3169 ^ i3) * (-27493)) ^ 1230218649;
        int i6 = -657487984;
        while (true) {
            int i7 = iM3169 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i3) * 16105) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2102739524:
                    case 320520541:
                        C1146.m4231();
                        iM3169 = C0619.m2761("֡۫") ^ i3;
                        i5 = ((iM3169 ^ i4) * 18335) ^ (-910637802);
                        i6 = 232723029;
                        break;
                    case -1937537538:
                    case 580971295:
                        return z;
                    case -1860300479:
                    case -745536999:
                        if (c20472 == c20473) {
                            iM3169 = (i4 - C0619.m2761("᩺ᩳ")) * (-103);
                            i5 = ((iM3169 ^ i3) * 19943) ^ 369850560;
                            i6 = 1982122844;
                            break;
                        }
                        iM3169 = (C0773.m3169("ܿ᩸") ^ i3) * (-17);
                        i5 = ((iM3169 ^ i4) * (-22779)) ^ 568748428;
                        i6 = -1316825266;
                        break;
                    case -1822745195:
                    case 233102375:
                        if (c20473 != null) {
                            iM3169 = (C0619.m2761("۟۫") + i3) * (-77);
                            i5 = ((iM3169 ^ i4) * 18951) ^ 816877195;
                            i6 = 840463629;
                            break;
                        }
                        iM3169 = (C0773.m3169("֨᩵") ^ i3) * (-111);
                        i5 = ((iM3169 ^ i4) * (-20381)) ^ (-674920719);
                        i6 = -650639398;
                        break;
                    case -1728540476:
                    case -104998360:
                        if (i >= C2834.m9336(list)) {
                            iM3169 = (C0773.m3169("ۜܺ") ^ i4) * (-115);
                            i5 = ((iM3169 ^ i3) * 18849) ^ (-1872406873);
                            i6 = -1276655295;
                            break;
                        }
                        iM3169 = C0619.m2761("ܺۚ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-13001)) ^ 2044723955;
                        i6 = -90303821;
                        break;
                    case -1678210801:
                    case -1073717118:
                        c20473 = (C20472) c9829.get(i);
                        if (c20472 == null) {
                            iM3169 = (C0773.m3169("֨᩵") ^ i3) * (-111);
                            i5 = ((iM3169 ^ i4) * (-20381)) ^ (-674920719);
                            i6 = -650639398;
                            break;
                            break;
                        }
                        iM3169 = C0773.m3169("ᩳ᩸") ^ i3;
                        i5 = ((iM3169 ^ i4) * 8157) ^ 254689981;
                        i6 = -441569564;
                        break;
                    case -1659919498:
                    case -1618631572:
                        if (!C2702.m8876()) {
                            iM3169 = C0773.m3169("ۡۤ") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-20041)) ^ 1793720317;
                            i6 = -1069714329;
                            break;
                        }
                        iM3169 = (C0773.m3169("ۤ۠") + i3) * 91;
                        i5 = ((iM3169 ^ i4) * (-29145)) ^ (-2072019944);
                        i6 = 1121899228;
                        break;
                    case -1588605286:
                    case -682823844:
                        if (!C1783.m6232()) {
                            iM3169 = (C0773.m3169("ۤ۠") + i3) * 91;
                            i5 = ((iM3169 ^ i4) * (-29145)) ^ (-2072019944);
                            i6 = 1121899228;
                            break;
                            break;
                        }
                        iM3169 = (C0619.m2761("ۧۛ") + i4) * 47;
                        i5 = ((iM3169 ^ i3) * (-13927)) ^ (-604637888);
                        i6 = 843710481;
                        break;
                    case -1502655219:
                    case 929797617:
                        i = 0;
                        iM3169 = C0619.m2761("ۗ֡") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-29067)) ^ (-1002446392);
                        i6 = -1886843274;
                        break;
                    case -1408017993:
                    case 8685459:
                        if (j == packageInfo.lastUpdateTime) {
                            iM3169 = (i4 - C0619.m2761("᩺ᩳ")) * (-103);
                            i5 = ((iM3169 ^ i3) * 19943) ^ 369850560;
                            i6 = 1982122844;
                            break;
                            break;
                        }
                        iM3169 = (C0773.m3169("ܿ᩸") ^ i3) * (-17);
                        i5 = ((iM3169 ^ i4) * (-22779)) ^ 568748428;
                        i6 = -1316825266;
                        break;
                        break;
                    case -1356678067:
                    case 1119993217:
                        if (C4282.f15546 > 0) {
                            iM3169 = C0773.m3169("ۚ᩸") ^ i3;
                            i5 = ((iM3169 ^ i4) * 21203) ^ 1035487646;
                            i6 = -751790661;
                            break;
                        }
                        iM3169 = C0619.m2761("֡۫") ^ i3;
                        i5 = ((iM3169 ^ i4) * 18335) ^ (-910637802);
                        i6 = 232723029;
                        break;
                        break;
                    case -1347949504:
                    case -1005495729:
                        return true;
                    case -1225629407:
                    case 1088528991:
                        iM9336 = C2834.m9336(list);
                        if (C2287.f7432 < 0) {
                            iM3169 = C0773.m3169("ۘ᩶") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-26757)) ^ 25611241;
                            i6 = -921534750;
                            break;
                        }
                        iM3169 = (C0773.m3169("᩹᩺") ^ i3) * (-75);
                        i5 = ((iM3169 ^ i4) * 4769) ^ 170241617;
                        i6 = 1838088991;
                        break;
                    case -1214896869:
                    case -583342211:
                        packageInfo = c20473.f65594;
                        if (!C4282.m13644()) {
                            iM3169 = C0619.m2761("֡۫") ^ i3;
                            i5 = ((iM3169 ^ i4) * 18335) ^ (-910637802);
                            i6 = 232723029;
                            break;
                            break;
                        }
                        iM3169 = C0619.m2761("᩶֨") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-16259)) ^ 51183928;
                        i6 = 1146739939;
                        break;
                    case -1108386173:
                    case -992361509:
                        if (C2288.f7433 > 0) {
                            iM3169 = (i4 - C0619.m2761("۬۫")) * (-73);
                            i5 = ((iM3169 ^ i3) * 22675) ^ 199939496;
                            i6 = 493464529;
                            break;
                        }
                        iM3169 = (C0773.m3169("ۤ۠") + i3) * 91;
                        i5 = ((iM3169 ^ i4) * (-29145)) ^ (-2072019944);
                        i6 = 1121899228;
                        break;
                        break;
                    case -872161484:
                    case 316098805:
                        c20472 = (C20472) C3690.m11998(list, i);
                        if (C23916.f77426 > 0) {
                            iM3169 = C0773.m3169("᩹ۨ") ^ i4;
                            i5 = ((iM3169 ^ i3) * 26617) ^ 277434148;
                            i6 = -680387563;
                            break;
                        }
                        iM3169 = (C0773.m3169("ۤ۠") + i3) * 91;
                        i5 = ((iM3169 ^ i4) * (-29145)) ^ (-2072019944);
                        i6 = 1121899228;
                        break;
                        break;
                    case -816809049:
                    case 2143197253:
                        if (C2288.f7433 <= 0) {
                            iM3169 = (C0773.m3169("ۤ۠") + i3) * 91;
                            i5 = ((iM3169 ^ i4) * (-29145)) ^ (-2072019944);
                            i6 = 1121899228;
                            break;
                            break;
                        }
                        iM3169 = C0619.m2761("ܿᩳ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 17407) ^ 1900370871;
                        i6 = 74153297;
                        break;
                    case -809633191:
                    case -713222667:
                        if (C2288.f7433 > 0) {
                            iM3169 = (i4 - C0773.m3169("ܽ᩸")) * (-115);
                            i5 = ((iM3169 ^ i3) * (-9649)) ^ (-1348904758);
                            i6 = 595293235;
                            break;
                        }
                        iM3169 = C0773.m3169("ۡۤ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-20041)) ^ 1793720317;
                        i6 = -1069714329;
                        break;
                        break;
                    case -799359542:
                    case 1755783152:
                        if (C1783.f6087 > 0) {
                            iM3169 = C0619.m2761("ܿᩳ") ^ i4;
                            i5 = ((iM3169 ^ i3) * 17407) ^ 1900370871;
                            i6 = 74153297;
                            break;
                            break;
                        }
                        iM3169 = C0619.m2761("֡۫") ^ i3;
                        i5 = ((iM3169 ^ i4) * 18335) ^ (-910637802);
                        i6 = 232723029;
                        break;
                        break;
                    case -645669726:
                    case 1346408587:
                        j = c20472.f65594.lastUpdateTime;
                        if (!C17202.f56030) {
                            iM3169 = C0619.m2761("ܿᩳ") ^ i4;
                            i5 = ((iM3169 ^ i3) * 17407) ^ 1900370871;
                            i6 = 74153297;
                            break;
                            break;
                        }
                        iM3169 = (C0619.m2761("ۧۨ") ^ i4) * (-107);
                        i5 = ((iM3169 ^ i3) * (-8467)) ^ (-40822007);
                        i6 = -2078938122;
                        break;
                    case -563882140:
                    case 1085086445:
                        if (iM9336 != c9829.size()) {
                            z = false;
                            iM3169 = (C0773.m3169("ܿ᩸") ^ i3) * (-17);
                            i5 = ((iM3169 ^ i4) * (-22779)) ^ 568748428;
                            i6 = -1316825266;
                            break;
                        }
                        int iM2761 = C0619.m2761("ܽ֡") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-8595)) ^ (-1477104434);
                        i7 = iM2761 ^ 1311119279;
                        z = false;
                        break;
                    case -454717925:
                    case 908906972:
                        i++;
                        iM3169 = C0619.m2761("ۗ֡") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-29067)) ^ (-1002446392);
                        i6 = -1886843274;
                        break;
                        break;
                    case -443147367:
                    case 234561315:
                        C20932.m47848();
                        return false;
                    case 883830493:
                    case 1301825678:
                        if (C3448.f11240 < 0) {
                            iM3169 = C0773.m3169("ܰ᩻") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-32163)) ^ (-738738561);
                            i6 = -1465325646;
                            break;
                        }
                        iM3169 = C0773.m3169("ۡۤ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-20041)) ^ 1793720317;
                        i6 = -1069714329;
                        break;
                        break;
                    case 997836739:
                    case 1423167613:
                        if (C0950.m3785() == 0) {
                            iM3169 = C0773.m3169("ۤᩳ") ^ i4;
                            i5 = ((iM3169 ^ i3) * 11233) ^ (-1022386999);
                            i6 = -1432426092;
                            break;
                        }
                        iM3169 = C0773.m3169("ۡۤ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-20041)) ^ 1793720317;
                        i6 = -1069714329;
                        break;
                        break;
                    case 1542894762:
                    case 1985941777:
                        if (C11235.f35427 < 0) {
                            iM3169 = (i3 - C0773.m3169("ۙܺ")) * (-91);
                            i5 = ((iM3169 ^ i4) * (-16741)) ^ (-361217257);
                            i6 = 752241240;
                            break;
                        }
                        iM3169 = (C0773.m3169("᩹᩺") ^ i3) * (-75);
                        i5 = ((iM3169 ^ i4) * 4769) ^ 170241617;
                        i6 = 1838088991;
                        break;
                        break;
                    default:
                        if (!C2419.m8175(c20472.f65589, c20473.f65589)) {
                            iM3169 = (C0773.m3169("ܿ᩸") ^ i3) * (-17);
                            i5 = ((iM3169 ^ i4) * (-22779)) ^ 568748428;
                            i6 = -1316825266;
                            break;
                            break;
                        }
                        iM3169 = (C0773.m3169("ۗᩴ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM3169 ^ i3) * 14703) ^ 1306516902;
                        i6 = -1661143604;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x025a A[PHI: r6 r10 r13 r21
      0x025a: PHI (r6v2 l.ۨۢ֫) = (r6v1 l.ۨۢ֫), (r6v3 l.ۨۢ֫) binds: [B:66:0x0258, B:59:0x022a] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r10v3 java.lang.String) = (r10v2 java.lang.String), (r10v4 java.lang.String) binds: [B:66:0x0258, B:59:0x022a] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r13v4 l.ۢۖ᩹) = (r13v3 l.ۢۖ᩹), (r13v2 l.ۢۖ᩹) binds: [B:66:0x0258, B:59:0x022a] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r21v21 l.᩵ۢ֫) = (r21v20 l.᩵ۢ֫), (r21v22 l.᩵ۢ֫) binds: [B:66:0x0258, B:59:0x022a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C14504 m21231(ViewOnClickListenerC7793 viewOnClickListenerC7793) {
        int iM3169;
        int i;
        int i2;
        C20472 c20472;
        C9829 c9829;
        int iM31610;
        int i3;
        int i4;
        int iM2761;
        int i5;
        int i6;
        int i7;
        C20472 c20473;
        C12267 c12267 = null;
        int i8 = C1826.f6190;
        int i9 = C2354.f7599;
        int iM31611 = (C0773.m3169("ۛ֨") ^ i8) * 101;
        int i10 = ((iM31611 ^ i9) * (-16039)) ^ 351037083;
        String str = null;
        HashMap map = null;
        C20472 c20474 = null;
        C20472 c20475 = null;
        int i11 = iM31611 ^ 1431146312;
        int i12 = 0;
        C9829 c98210 = null;
        int i13 = 446632181;
        C9829 c98211 = null;
        String str2 = null;
        C9829 c98212 = null;
        InterfaceC15970 interfaceC15970ListIterator = null;
        InterfaceC15970 interfaceC15970ListIterator2 = null;
        C9829 c98213 = null;
        C9829 c98214 = null;
        C3318 c3318 = null;
        while (true) {
            i13 = i11 ^ (i10 & (((i13 ^ i9) * (-11641)) >> 31));
            switch (i13) {
                case -1962387743:
                case -1092725164:
                    c20472 = c20474;
                    int size = c98211.size();
                    if (!C2288.m7767()) {
                        c98213 = new C9829(size);
                        c9829 = c98211;
                        c98213.addAll(c9829);
                        c3318 = viewOnClickListenerC7793.f25872.f39446;
                        if (RunnableC0334.f1808 <= 0) {
                            iM31610 = (C0773.m3169("ۜۙ") ^ i8) * 73;
                            i3 = ((iM31610 ^ i9) * (-18411)) ^ (-846201878);
                            i4 = -357126346;
                        } else {
                            iM31610 = C0619.m2761("ܿ֡") ^ i9;
                            i3 = ((iM31610 ^ i8) * (-9649)) ^ 1087986270;
                            i4 = -1492155444;
                        }
                        int i14 = iM31610 ^ i4;
                        c98211 = c9829;
                        i10 = i3;
                        c20473 = c20472;
                        i11 = i14;
                        c20474 = c20473;
                    }
                    int iM31612 = C0773.m3169("ܺۡ") ^ i8;
                    i5 = ((iM31612 ^ i9) * 25281) ^ (-1725861038);
                    i7 = iM31612 ^ 868133102;
                    c98213 = null;
                    c98214 = null;
                    c20473 = c20472;
                    i11 = i7;
                    i10 = i5;
                    c20474 = c20473;
                    break;
                case -1913283703:
                case 1636188631:
                    interfaceC15970ListIterator2 = c98214.listIterator(i12);
                    iM3169 = (C0619.m2761("᩹ܳ") ^ i9) * 7;
                    i = ((iM3169 ^ i8) * (-17845)) ^ 196160778;
                    i2 = 352613943;
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case -1827336860:
                case -342762:
                    C1519.m5396(map, c20475.f65589, c20475);
                    iM3169 = (C0619.m2761("᩹ܳ") ^ i9) * 7;
                    i = ((iM3169 ^ i8) * (-17845)) ^ 196160778;
                    i2 = 352613943;
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case -1806827497:
                case -1270421548:
                    c20474 = (C20472) C0950.m3796(interfaceC15970ListIterator);
                    if (c20474 != null) {
                        iM3169 = C0619.m2761("۫ܺ") ^ i9;
                        i = ((iM3169 ^ i8) * 4405) ^ (-525482141);
                        i2 = -413824418;
                    } else {
                        iM3169 = (C0773.m3169("ܺۖ") + i9) * (-61);
                        i = ((iM3169 ^ i8) * (-22097)) ^ 2053576781;
                        i2 = -1309726339;
                    }
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case -1730976643:
                case 969982618:
                    C0950.m3785();
                    C0950.m3785();
                    return null;
                case -1678199814:
                case 253284275:
                    c20472 = c20474;
                    c9829 = viewOnClickListenerC7793.f25880.f39446.f10826;
                    if (C0773.f2792 > 0) {
                        iM31610 = C0773.m3169("᩸ܽ") ^ i8;
                        i3 = ((iM31610 ^ i9) * 2063) ^ (-1238259237);
                        i4 = -633840010;
                        int i15 = iM31610 ^ i4;
                        c98211 = c9829;
                        i10 = i3;
                        c20473 = c20472;
                        i11 = i15;
                        c20474 = c20473;
                    } else {
                        c98211 = c9829;
                        int iM2762 = (C0619.m2761("ۧܽ") + i9) * 29;
                        i5 = ((iM2762 ^ i8) * 29503) ^ 432471980;
                        i7 = iM2762 ^ 875262875;
                        c98210 = null;
                        c20473 = c20472;
                        i11 = i7;
                        i10 = i5;
                        c20474 = c20473;
                    }
                    break;
                case -1517890442:
                case 865492611:
                    if (C3779.f12953 <= 0) {
                        c20472 = c20474;
                        c9829 = c98211;
                        iM31610 = (C0773.m3169("ۜۙ") ^ i8) * 73;
                        i3 = ((iM31610 ^ i9) * (-18411)) ^ (-846201878);
                        i4 = -357126346;
                        int i16 = iM31610 ^ i4;
                        c98211 = c9829;
                        i10 = i3;
                        c20473 = c20472;
                        i11 = i16;
                        c20474 = c20473;
                    } else {
                        iM3169 = (C0619.m2761("᩸ۢ") + i9) * 115;
                        i = ((iM3169 ^ i8) * (-32495)) ^ (-342272546);
                        i2 = -448315692;
                        i11 = iM3169 ^ i2;
                        i10 = i;
                    }
                    break;
                case -1384564784:
                case -407759311:
                    if (C3998.m12923(interfaceC15970ListIterator2)) {
                        iM3169 = C0619.m2761("ᩴܺ") ^ i8;
                        i = ((iM3169 ^ i9) * 11779) ^ (-1998926634);
                        i2 = -1927914155;
                    } else {
                        iM3169 = (i8 - C0619.m2761("᩺ܺ")) * (-3);
                        i = ((iM3169 ^ i9) * (-16025)) ^ (-1315596930);
                        i2 = -2028721073;
                    }
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case -517398501:
                case 930049054:
                    c20472 = c20474;
                    C9829 c98215 = c3318.f10826;
                    int size2 = c98215.size();
                    if (AbstractC3624.f12429 <= 0) {
                        int iM31613 = C0773.m3169("ܺۡ") ^ i8;
                        i5 = ((iM31613 ^ i9) * 25281) ^ (-1725861038);
                        i7 = iM31613 ^ 868133102;
                        c98213 = null;
                        c98214 = null;
                    } else {
                        c98214 = new C9829(size2);
                        c98214.addAll(c98215);
                        if (C0269.f1558 <= 0) {
                            iM2761 = C0773.m3169("ܳ֫") ^ i8;
                            i5 = ((iM2761 ^ i9) * (-25091)) ^ 1967124230;
                            i6 = -1050475703;
                        } else {
                            iM2761 = (i9 - C0619.m2761("ܽۘ")) * 19;
                            i5 = ((iM2761 ^ i8) * 19737) ^ (-127699123);
                            i6 = 1441084926;
                        }
                        i7 = iM2761 ^ i6;
                    }
                    c20473 = c20472;
                    i11 = i7;
                    i10 = i5;
                    c20474 = c20473;
                    break;
                case -514769538:
                case 50038962:
                    map = new HashMap();
                    interfaceC15970ListIterator = c98213.listIterator(0);
                    i12 = 0;
                    iM3169 = (C0773.m3169("ܺۖ") + i9) * (-61);
                    i = ((iM3169 ^ i8) * (-22097)) ^ 2053576781;
                    i2 = -1309726339;
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case -487933519:
                case 1461449108:
                    c20472 = c20474;
                    str2 = viewOnClickListenerC7793.f25880.f39446.f10828;
                    c12267 = viewOnClickListenerC7793.f25872;
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0773.m3169("ܳ֫") ^ i8;
                        i5 = ((iM2761 ^ i9) * (-25091)) ^ 1967124230;
                        i6 = -1050475703;
                    } else {
                        iM2761 = C0619.m2761("ۖۚ") ^ i8;
                        i5 = ((iM2761 ^ i9) * 21237) ^ 977741746;
                        i6 = 1292239015;
                    }
                    i7 = iM2761 ^ i6;
                    c20473 = c20472;
                    i11 = i7;
                    i10 = i5;
                    c20474 = c20473;
                    break;
                case -172118151:
                case 702802308:
                    c20472 = c20474;
                    str = c12267.f39446.f10828;
                    C9829 c9829M30644 = C12267.m30644(c98213, str2);
                    int size3 = c9829M30644.size();
                    if (!RunnableC0334.m2063()) {
                        c98210 = new C9829(size3);
                        c98210.addAll(c9829M30644);
                        C17202.m40369(viewOnClickListenerC7793.f25872);
                        if (C0487.m2356() < 0) {
                            iM2761 = C0619.m2761("ۛۚ") ^ i9;
                            i5 = ((iM2761 ^ i8) * 13243) ^ 67495331;
                            i6 = -684769151;
                            i7 = iM2761 ^ i6;
                        }
                        c20473 = c20472;
                        i11 = i7;
                        i10 = i5;
                        c20474 = c20473;
                    }
                    int iM2763 = (C0619.m2761("ۧܽ") + i9) * 29;
                    i5 = ((iM2763 ^ i8) * 29503) ^ 432471980;
                    i7 = iM2763 ^ 875262875;
                    c98210 = null;
                    c20473 = c20472;
                    i11 = i7;
                    i10 = i5;
                    c20474 = c20473;
                    break;
                case 183240661:
                case 1196397134:
                    C9829 c9829M30645 = C12267.m30644(c98214, str);
                    c20472 = c20474;
                    C9829 c98216 = new C9829(c9829M30645.size());
                    c98216.addAll(c9829M30645);
                    if (C17202.m40372()) {
                        int iM2764 = C0619.m2761("ܿۚ") ^ i8;
                        i5 = ((iM2764 ^ i9) * 31177) ^ (-1589669984);
                        i7 = iM2764 ^ (-2051741214);
                        c98212 = c98216;
                    } else {
                        c98212 = c98216;
                        int iM31614 = C0773.m3169("ܺۡ") ^ i8;
                        i5 = ((iM31614 ^ i9) * 25281) ^ (-1725861038);
                        i7 = iM31614 ^ 868133102;
                        c98213 = null;
                        c98214 = null;
                    }
                    c20473 = c20472;
                    i11 = i7;
                    i10 = i5;
                    c20474 = c20473;
                    break;
                case 327601850:
                case 1999986273:
                    C1519.m5396(map, c20474.f65589, c20474);
                    iM3169 = (C0773.m3169("ܺۖ") + i9) * (-61);
                    i = ((iM3169 ^ i8) * (-22097)) ^ 2053576781;
                    i2 = -1309726339;
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case 337898343:
                case 1447965700:
                    int i17 = viewOnClickListenerC7793.f25880.f39446.f10824;
                    if (C4282.f15546 > 0) {
                        int i18 = viewOnClickListenerC7793.f25872.f39446.f10824;
                        return new C14504(str2, str, c98213, c98214, c98210, c98212, map);
                    }
                    c20472 = c20474;
                    int iM2765 = (C0619.m2761("ۧܽ") + i9) * 29;
                    i5 = ((iM2765 ^ i8) * 29503) ^ 432471980;
                    i7 = iM2765 ^ 875262875;
                    c98210 = null;
                    c20473 = c20472;
                    i11 = i7;
                    i10 = i5;
                    c20474 = c20473;
                    break;
                case 688496441:
                case 1083404825:
                    if (C1826.m6317(interfaceC15970ListIterator)) {
                        iM3169 = (i8 - C0773.m3169("ۘۡ")) * 7;
                        i = ((iM3169 ^ i9) * (-6097)) ^ 1705522973;
                        i2 = 1987611078;
                    } else {
                        iM3169 = (C0773.m3169("ܽ᩷") ^ i8) * (-113);
                        i = ((iM3169 ^ i9) * (-11675)) ^ 1991809265;
                        i2 = -77088870;
                    }
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case 792329436:
                case 1501961012:
                    C4238.m13540();
                    if (AbstractC0641.m2813() > 0) {
                        c20472 = c20474;
                        int iM2766 = (C0619.m2761("ۧܽ") + i9) * 29;
                        i5 = ((iM2766 ^ i8) * 29503) ^ 432471980;
                        i7 = iM2766 ^ 875262875;
                        c98210 = null;
                        c20473 = c20472;
                        i11 = i7;
                        i10 = i5;
                        c20474 = c20473;
                    } else {
                        iM3169 = (C0619.m2761("᩸ۢ") + i9) * 115;
                        i = ((iM3169 ^ i8) * (-32495)) ^ (-342272546);
                        i2 = -448315692;
                        i11 = iM3169 ^ i2;
                        i10 = i;
                    }
                    break;
                case 909049326:
                case 1859213301:
                    if (C4238.f15451 >= 0) {
                        c20472 = c20474;
                        int iM31615 = C0773.m3169("ܺۡ") ^ i8;
                        i5 = ((iM31615 ^ i9) * 25281) ^ (-1725861038);
                        i7 = iM31615 ^ 868133102;
                        c98213 = null;
                        c98214 = null;
                        c20473 = c20472;
                        i11 = i7;
                        i10 = i5;
                        c20474 = c20473;
                    } else {
                        iM3169 = (C0619.m2761("᩸ۢ") + i9) * 115;
                        i = ((iM3169 ^ i8) * (-32495)) ^ (-342272546);
                        i2 = -448315692;
                        i11 = iM3169 ^ i2;
                        i10 = i;
                    }
                    break;
                case 1465613806:
                case 1495295532:
                    C17202.m40372();
                    iM3169 = (C0619.m2761("᩸ۢ") + i9) * 115;
                    i = ((iM3169 ^ i8) * (-32495)) ^ (-342272546);
                    i2 = -448315692;
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                default:
                    c20475 = (C20472) C4238.m13529(interfaceC15970ListIterator2);
                    if (c20475 != null) {
                        iM3169 = (C0773.m3169("ۛܶ") + i9) * (-81);
                        i = ((iM3169 ^ i8) * (-31461)) ^ 1750152036;
                        i2 = -1035829727;
                    } else {
                        iM3169 = (C0619.m2761("᩹ܳ") ^ i9) * 7;
                        i = ((iM3169 ^ i8) * (-17845)) ^ 196160778;
                        i2 = 352613943;
                    }
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00eb A[PHI: r1 r8
      0x00eb: PHI (r1v4 int) = (r1v2 int), (r1v3 int), (r1v2 int), (r1v2 int) binds: [B:45:0x00e9, B:41:0x00cd, B:22:0x005b, B:37:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r8v10 java.lang.Thread) = (r8v4 java.lang.Thread), (r8v4 java.lang.Thread), (r8v4 java.lang.Thread), (r8v12 java.lang.Thread) binds: [B:45:0x00e9, B:41:0x00cd, B:22:0x005b, B:37:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0118  */
    /* JADX WARN: Code duplicated, block: B:54:0x0148 A[PHI: r0
      0x0148: PHI (r0v4 java.util.concurrent.atomic.AtomicInteger) = 
      (r0v3 java.util.concurrent.atomic.AtomicInteger)
      (r0v2 java.util.concurrent.atomic.AtomicInteger)
      (r0v2 java.util.concurrent.atomic.AtomicInteger)
     binds: [B:53:0x0146, B:28:0x006c, B:10:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static void m21214(ViewOnClickListenerC7793 viewOnClickListenerC7793) {
        int iM3169;
        int i;
        AtomicInteger atomicInteger = null;
        int iM9485 = 0;
        int i2 = 1427878176;
        int i3 = C23916.f77426;
        int i4 = C3734.f12817;
        int iM2761 = (i4 - C0619.m2761("ۤ᩵")) * 17;
        int i5 = ((iM2761 ^ i3) * (-13417)) ^ (-1030951412);
        int i6 = 711416046;
        while (true) {
            int i7 = iM2761 ^ i6;
            Thread thread = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-12451)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1932991724:
                    case 1375201:
                        if (C2310.f7472 >= 0) {
                            iM2761 = (C0619.m2761("֨ۤ") ^ i3) * 77;
                            i5 = ((iM2761 ^ i4) * 29835) ^ 4398235;
                            i6 = -1525112171;
                        } else {
                            iM2761 = C0773.m3169("ۘۚ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-18017)) ^ 567052109;
                            i6 = -1248399952;
                        }
                        break;
                    case -923538850:
                    case 118464826:
                        if (C3099.f10023 <= 0) {
                            iM3169 = (i3 - C0773.m3169("֡۬")) * (-107);
                            i5 = ((iM3169 ^ i4) * 32455) ^ (-703179506);
                            i = -1643413020;
                        } else {
                            iM3169 = C0773.m3169("ۨ᩸") ^ i3;
                            i5 = ((iM3169 ^ i4) * 16367) ^ (-1458257367);
                            i = -540384555;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -865431098:
                    case -464154664:
                        atomicInteger = viewOnClickListenerC7793.f25897;
                        if (C2023.f6737) {
                            iM3169 = C0619.m2761("ᩳ᩻") ^ i4;
                            i5 = ((iM3169 ^ i3) * 4995) ^ 1798732448;
                            i = 433808325;
                        } else {
                            iM3169 = C0773.m3169("ۗۚ") ^ i4;
                            i5 = ((iM3169 ^ i3) * 723) ^ (-11151005);
                            i = -380400413;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -823630411:
                    case 545716235:
                        C2354.m7983();
                        C1542.m5459();
                        iM3169 = (C0773.m3169("ܺۡ") ^ i4) * 5;
                        i5 = ((iM3169 ^ i3) * (-23093)) ^ (-1886572940);
                        i = 837343531;
                        i7 = iM3169 ^ i;
                        break;
                    case -659025667:
                    case 1352904265:
                        C1564.m5509();
                        break;
                    case -450248237:
                    case 1618507179:
                        iM9485 = C2878.m9485(atomicInteger);
                        if (AbstractC0641.f2496 >= 0) {
                            iM3169 = (i3 - C0773.m3169("֡۬")) * (-107);
                            i5 = ((iM3169 ^ i4) * 32455) ^ (-703179506);
                            i = -1643413020;
                        } else {
                            iM3169 = (i4 - C0619.m2761("ۖۤ")) * 13;
                            i5 = ((iM3169 ^ i3) * (-23679)) ^ 297014174;
                            i = -193075910;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -45324829:
                    case 1334938975:
                        if (C4238.f15451 < 0) {
                            iM3169 = (C0773.m3169("ܺۡ") ^ i4) * 5;
                            i5 = ((iM3169 ^ i3) * (-23093)) ^ (-1886572940);
                            i = 837343531;
                        } else {
                            iM3169 = C0619.m2761("ᩳ᩻") ^ i4;
                            i5 = ((iM3169 ^ i3) * 4995) ^ 1798732448;
                            i = 433808325;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case 328513207:
                    case 2062500869:
                        C11235.m28309();
                        if (C3998.f13671 != 0) {
                            iM2761 = C0773.m3169("ۘۚ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-18017)) ^ 567052109;
                            i6 = -1248399952;
                        }
                        iM3169 = (C0773.m3169("ܺۡ") ^ i4) * 5;
                        i5 = ((iM3169 ^ i3) * (-23093)) ^ (-1886572940);
                        i = 837343531;
                        i7 = iM3169 ^ i;
                        break;
                    case 687975434:
                    case 1124902578:
                        C3077.m10038(thread);
                        if (C1542.f5343 <= 0) {
                            iM3169 = (i3 - C0773.m3169("֡۬")) * (-107);
                            i5 = ((iM3169 ^ i4) * 32455) ^ (-703179506);
                            i = -1643413020;
                        } else if (C3448.f11240 >= 0) {
                            iM3169 = (C0773.m3169("ܺۡ") ^ i4) * 5;
                            i5 = ((iM3169 ^ i3) * (-23093)) ^ (-1886572940);
                            i = 837343531;
                        } else {
                            if (C1564.m5509() > 0) {
                                C3077.m10038(new Thread(new RunnableC12173(viewOnClickListenerC7793, iM9485, 1)));
                            }
                            iM3169 = C0619.m2761("ᩳ᩻") ^ i4;
                            i5 = ((iM3169 ^ i3) * 4995) ^ 1798732448;
                            i = 433808325;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case 1862632702:
                    case 2084804793:
                        if (C3779.f12953 <= 0) {
                            iM3169 = (C0773.m3169("ܺۡ") ^ i4) * 5;
                            i5 = ((iM3169 ^ i3) * (-23093)) ^ (-1886572940);
                            i = 837343531;
                        } else {
                            iM3169 = (C0773.m3169("ۖۢ") ^ i3) * (-31);
                            i5 = ((iM3169 ^ i4) * (-7415)) ^ (-1276586529);
                            i = -646054112;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    default:
                        if (C2375.f7641 > 0) {
                            RunnableC2090 runnableC2090 = new RunnableC2090(iM9485, 0, viewOnClickListenerC7793);
                            if (!RunnableC3646.f12471) {
                                thread = new Thread(runnableC2090);
                                if (C2287.f7432 >= 0) {
                                    iM3169 = (i3 - C0773.m3169("֡۬")) * (-107);
                                    i5 = ((iM3169 ^ i4) * 32455) ^ (-703179506);
                                    i = -1643413020;
                                } else {
                                    iM3169 = C0773.m3169("᩻᩶") ^ i3;
                                    i5 = ((iM3169 ^ i4) * 13677) ^ (-1357474340);
                                    i = 333557959;
                                }
                                i7 = iM3169 ^ i;
                            } else {
                                iM2761 = (C0619.m2761("֨ۤ") ^ i3) * 77;
                                i5 = ((iM2761 ^ i4) * 29835) ^ 4398235;
                                i6 = -1525112171;
                            }
                        } else {
                            iM2761 = C0773.m3169("ۘۚ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-18017)) ^ 567052109;
                            i6 = -1248399952;
                        }
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21196(ViewOnClickListenerC7793 viewOnClickListenerC7793, int i) {
        long j = 0;
        int i2 = 1237446152;
        int i3 = C0487.f2131;
        int i4 = C1080.f3865;
        int iM2761 = (C0619.m2761("ۙܳ") + i4) * (-19);
        int i5 = ((iM2761 ^ i3) * (-4691)) ^ (-1279347876);
        int i6 = -33260961;
        while (true) {
            i2 = ((((i2 ^ i3) * (-21105)) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -2082565864:
                case 48570540:
                    C0773.m3161();
                    C3690.m11987();
                    iM2761 = C0619.m2761("ۡ᩶") ^ i4;
                    i5 = ((iM2761 ^ i3) * 16029) ^ (-1236758864);
                    i6 = -556173458;
                    break;
                case -2022250921:
                case -1311956819:
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0619.m2761("ۡۨ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 6569) ^ 1325984156;
                        i6 = -289535038;
                    } else {
                        iM2761 = (C0773.m3169("᩷᩹") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM2761 ^ i4) * (-10277)) ^ 521152929;
                        i6 = 724474005;
                    }
                    break;
                case -1941992247:
                case -1434803069:
                    if (C2702.m8876()) {
                        iM2761 = (C0619.m2761("᩹᩻") ^ i4) * 21;
                        i5 = ((iM2761 ^ i3) * (-31869)) ^ (-1244655349);
                        i6 = -1467126459;
                    } else {
                        iM2761 = C0619.m2761("ۡ᩶") ^ i4;
                        i5 = ((iM2761 ^ i3) * 16029) ^ (-1236758864);
                        i6 = -556173458;
                    }
                    break;
                case -1711674776:
                case -1241572577:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0619.m2761("֨֫") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-20699)) ^ (-2063448661);
                        i6 = -1800445181;
                    } else {
                        iM2761 = C0773.m3169("᩹ۙ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-10799)) ^ 521207098;
                        i6 = -1689391023;
                    }
                    break;
                case -1649720381:
                case 1230190821:
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0773.m3169("۬֨") + i3) * (-61);
                        i5 = ((iM2761 ^ i4) * 14351) ^ (-1871035755);
                        i6 = -678368852;
                    } else {
                        iM2761 = C0773.m3169("ᩳ᩷") ^ i3;
                        i5 = ((iM2761 ^ i4) * 10775) ^ 1507059150;
                        i6 = -1205238022;
                    }
                    break;
                case -1352953978:
                case 1527428100:
                    if (C2966.m9664()) {
                        iM2761 = (C0619.m2761("۟᩹") ^ i4) * 109;
                        i5 = ((iM2761 ^ i3) * (-27213)) ^ (-311629552);
                        i6 = -686611880;
                    } else {
                        iM2761 = (C0773.m3169("۬֨") + i3) * (-61);
                        i5 = ((iM2761 ^ i4) * 14351) ^ (-1871035755);
                        i6 = -678368852;
                    }
                    break;
                case -1246719166:
                case 1472622807:
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0619.m2761("֨֫") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-20699)) ^ (-2063448661);
                        i6 = -1800445181;
                    } else {
                        iM2761 = (i4 - C0619.m2761("֡ۨ")) * (-63);
                        i5 = ((iM2761 ^ i3) * (-31607)) ^ 151610430;
                        i6 = 1013906942;
                    }
                    break;
                case -1101169328:
                case 614695145:
                    if (C1343.f4799 == 0) {
                        iM2761 = C0773.m3169("֡᩵") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-7145)) ^ (-1624406744);
                        i6 = -122459420;
                    } else {
                        iM2761 = C0619.m2761("֨֫") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-20699)) ^ (-2063448661);
                        i6 = -1800445181;
                    }
                    break;
                case -763190620:
                case 1331387379:
                    break;
                case 96456243:
                case 1237116626:
                    RunnableC3646.m11813();
                    break;
                case 110132876:
                case 601224440:
                    C4238.m13540();
                    if (C2485.f7950 != 0) {
                        iM2761 = C0619.m2761("֨֫") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-20699)) ^ (-2063448661);
                        i6 = -1800445181;
                    } else {
                        iM2761 = C0619.m2761("ۡ᩶") ^ i4;
                        i5 = ((iM2761 ^ i3) * 16029) ^ (-1236758864);
                        i6 = -556173458;
                    }
                    break;
                case 155619616:
                case 1033092287:
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0773.m3169("֡᩵") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-7145)) ^ (-1624406744);
                        i6 = -122459420;
                    } else {
                        iM2761 = (C0773.m3169("ۧ᩸") + i3) * 3;
                        i5 = ((iM2761 ^ i4) * (-28545)) ^ (-1632359502);
                        i6 = 81775261;
                    }
                    break;
                case 903381261:
                case 1946192254:
                    C3779.m12264();
                    if (!C1343.m4943()) {
                        iM2761 = (C0773.m3169("۬֨") + i3) * (-61);
                        i5 = ((iM2761 ^ i4) * 14351) ^ (-1871035755);
                        i6 = -678368852;
                    } else {
                        iM2761 = C0619.m2761("ۡ᩶") ^ i4;
                        i5 = ((iM2761 ^ i3) * 16029) ^ (-1236758864);
                        i6 = -556173458;
                    }
                    break;
                case 1108397207:
                case 2131244936:
                    try {
                        SystemClock.sleep(j);
                        C12267 c12267 = viewOnClickListenerC7793.f25872;
                        viewOnClickListenerC7793.m21194(c12267.f39446.f10826, c12267.f39451, viewOnClickListenerC7793.f25897, i);
                        break;
                    } catch (Exception unused) {
                    }
                    iM2761 = C0773.m3169("ܶ᩵") ^ i4;
                    i5 = ((iM2761 ^ i3) * (-363)) ^ 130026476;
                    i6 = 165940659;
                    break;
                case 1116302342:
                case 1311358649:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0619.m2761("ۡ᩶") ^ i4;
                        i5 = ((iM2761 ^ i3) * 16029) ^ (-1236758864);
                        i6 = -556173458;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩷ۛ")) * (-73);
                        i5 = ((iM2761 ^ i4) * (-10415)) ^ 789893566;
                        i6 = 800457818;
                    }
                    break;
                case 1215530188:
                case 2116592854:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0619.m2761("ۡۨ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 6569) ^ 1325984156;
                        i6 = -289535038;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ۢۖ")) * 87;
                        i5 = ((iM2761 ^ i3) * 29001) ^ (-1576069609);
                        i6 = -139646660;
                    }
                    break;
                case 1578834643:
                case 2027002384:
                    j = 100;
                    iM2761 = (C0773.m3169("ᩳۡ") + i3) * (-15);
                    i5 = ((iM2761 ^ i4) * 25077) ^ 559623001;
                    i6 = -551267314;
                    break;
                default:
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0619.m2761("֨֫") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-20699)) ^ (-2063448661);
                        i6 = -1800445181;
                    } else {
                        iM2761 = (i4 - C0773.m3169("᩺۫")) * (-77);
                        i5 = ((iM2761 ^ i3) * 3751) ^ (-72714015);
                        i6 = -1291980584;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0499 A[PHI: r4 r23
      0x0499: PHI (r4v49 java.util.concurrent.atomic.AtomicBoolean) = 
      (r4v30 java.util.concurrent.atomic.AtomicBoolean)
      (r4v32 java.util.concurrent.atomic.AtomicBoolean)
      (r4v50 java.util.concurrent.atomic.AtomicBoolean)
     binds: [B:133:0x0497, B:125:0x0452, B:18:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0499: PHI (r23v48 int) = (r23v22 int), (r23v24 int), (r23v49 int) binds: [B:133:0x0497, B:125:0x0452, B:18:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:142:0x050d A[PHI: r4 r23
      0x050d: PHI (r4v53 java.util.concurrent.atomic.AtomicBoolean) = 
      (r4v28 java.util.concurrent.atomic.AtomicBoolean)
      (r4v31 java.util.concurrent.atomic.AtomicBoolean)
      (r4v54 java.util.concurrent.atomic.AtomicBoolean)
     binds: [B:141:0x050b, B:129:0x0475, B:14:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x050d: PHI (r23v51 int) = (r23v20 int), (r23v23 int), (r23v52 int) binds: [B:141:0x050b, B:129:0x0475, B:14:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:154:0x05a0 A[PHI: r4 r23
      0x05a0: PHI (r4v55 java.util.concurrent.atomic.AtomicBoolean) = 
      (r4v25 java.util.concurrent.atomic.AtomicBoolean)
      (r4v26 java.util.concurrent.atomic.AtomicBoolean)
      (r4v62 java.util.concurrent.atomic.AtomicBoolean)
     binds: [B:153:0x059e, B:149:0x057c, B:11:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x05a0: PHI (r23v54 int) = (r23v17 int), (r23v18 int), (r23v61 int) binds: [B:153:0x059e, B:149:0x057c, B:11:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008c, code lost:
    
        if (l.AbstractC0116.m1243() == 0) goto L18;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m21194(java.util.List r30, l.C25227 r31, java.util.concurrent.atomic.AtomicInteger r32, int r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC7793.m21194(java.util.List, l.᩻ᩳ᩷, java.util.concurrent.atomic.AtomicInteger, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0139 A[PHI: r3 r8
      0x0139: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int) binds: [B:36:0x0137, B:32:0x0119, B:17:0x0085, B:15:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0139: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:36:0x0137, B:32:0x0119, B:17:0x0085, B:15:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01e5 A[PHI: r11 r12 r13
      0x01e5: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:51:0x01e3, B:15:0x0081, B:12:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:51:0x01e3, B:15:0x0081, B:12:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:51:0x01e3, B:15:0x0081, B:12:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int iM3169;
        int i;
        int i2;
        int iM2761;
        int i3;
        Menu menu2 = menu;
        int i4 = AbstractC0641.f2496;
        int i5 = C1519.f5300;
        int iM31610 = (C0773.m3169("ۙܿ") + i5) * 65;
        int i6 = ((iM31610 ^ i4) * (-2053)) ^ 431165286;
        String strM1785 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i7 = iM31610 ^ 1303452164;
        MenuInflater menuInflater = null;
        int iM31611 = 0;
        int iM31612 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        char c = 0;
        short s = 0;
        int i15 = -1127812108;
        int i16 = 0;
        while (true) {
            i15 = i7 ^ (i6 & (((i15 ^ i4) * (-31671)) >> 31));
            switch (i15) {
                case -2128587530:
                case -305116890:
                    i14 = 7511;
                    iM3169 = C0619.m2761("᩷᩸") ^ i5;
                    i = ((iM3169 ^ i4) * (-8777)) ^ 721680787;
                    i2 = -1472951313;
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -2047901932:
                case -627328317:
                    this.f25896 = RunnableC0334.m2062(menu2, iM31612 ^ i8);
                    return true;
                case -1947174503:
                case 880050959:
                    C1542.m5459();
                    if (C0862.m3503()) {
                        iM3169 = (C0773.m3169("۫֡") ^ i4) * 13;
                        i = ((iM3169 ^ i5) * (-1401)) ^ 2136518040;
                        i2 = 2107326826;
                    } else {
                        iM3169 = C0773.m3169("ۚܽ") ^ i4;
                        i = ((iM3169 ^ i5) * 13219) ^ 749914694;
                        i2 = -861983680;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -1943770819:
                case -1617763441:
                    iM31612 = C0773.m3169(strM1785);
                    if (C0773.m3161() != 0) {
                        i8 = 2127837679;
                        iM2761 = (C0619.m2761("۟᩶") ^ i4) * 19;
                        i6 = ((iM2761 ^ i5) * (-29545)) ^ (-321009198);
                        i3 = -217666866;
                        i7 = iM2761 ^ i3;
                        menu2 = menu;
                    } else {
                        int iM31613 = (C0773.m3169("᩹ۙ") ^ i5) * (-29);
                        i6 = ((iM31613 ^ i4) * 12855) ^ 1305083982;
                        i7 = iM31613 ^ 724366409;
                        i8 = 2127837679;
                    }
                    break;
                case -1864916666:
                case 1734351713:
                    strM1785 = C0269.m1785(sArr3, 512, 3, i14);
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0619.m2761("֫ᩴ") + i5) * (-117);
                        i6 = ((iM2761 ^ i4) * 27155) ^ 1768674422;
                        i3 = 727483812;
                        i7 = iM2761 ^ i3;
                        menu2 = menu;
                    } else {
                        int iM2762 = C0619.m2761("᩶ۖ") ^ i4;
                        i6 = ((iM2762 ^ i5) * (-11367)) ^ (-1916045289);
                        i7 = iM2762 ^ 356797789;
                    }
                    break;
                case -1743210802:
                case 1564653518:
                    iM31611 = C0773.m3169(C3448.m11252(sArr2, i9, i10, i14));
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0773.m3169("ۚܽ") ^ i4;
                        i = ((iM3169 ^ i5) * 13219) ^ 749914694;
                        i2 = -861983680;
                    } else {
                        iM3169 = C0619.m2761("֨֡") ^ i5;
                        i = ((iM3169 ^ i4) * (-3305)) ^ (-2017260653);
                        i2 = -310164388;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -1632562358:
                case -219461887:
                    sArr = f25870;
                    if (C3077.m10041()) {
                        iM2761 = (C0619.m2761("֫ᩴ") + i5) * (-117);
                        i6 = ((iM2761 ^ i4) * 27155) ^ 1768674422;
                        i3 = 727483812;
                    } else {
                        iM2761 = C0619.m2761("ۙ᩷") ^ i5;
                        i6 = ((iM2761 ^ i4) * 11169) ^ 831027450;
                        i3 = -2005198918;
                    }
                    i7 = iM2761 ^ i3;
                    menu2 = menu;
                    break;
                case -1555684771:
                case 1179279889:
                    AbstractC0116.m1243();
                    C3077.m10041();
                    return false;
                case -1537646804:
                case -1150643010:
                    i11 = i16 * i16;
                    i12 = s * s;
                    i13 = 188842564;
                    if (C17202.f56030) {
                        iM3169 = (i5 - C0619.m2761("᩻ܺ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM3169 ^ i4) * (-4359)) ^ (-2134719808);
                        i2 = 1373521117;
                    } else {
                        iM3169 = (C0773.m3169("۫֡") ^ i4) * 13;
                        i = ((iM3169 ^ i5) * (-1401)) ^ 2136518040;
                        i2 = 2107326826;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -1490651758:
                case 1459972411:
                    c = 508;
                    if (C17202.m40372()) {
                        iM2761 = C0773.m3169("ᩳۡ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 31565) ^ 1437064321;
                        i3 = -106839499;
                    } else {
                        iM2761 = (C0619.m2761("۟᩶") ^ i4) * 19;
                        i6 = ((iM2761 ^ i5) * (-29545)) ^ (-321009198);
                        i3 = -217666866;
                    }
                    i7 = iM2761 ^ i3;
                    menu2 = menu;
                    break;
                case -1359240117:
                case 1901036030:
                    C3734.m12152();
                    C2702.m8876();
                    iM3169 = C0773.m3169("ۚܽ") ^ i4;
                    i = ((iM3169 ^ i5) * 13219) ^ 749914694;
                    i2 = -861983680;
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -1106060295:
                case 1768556808:
                    i14 = 31494;
                    iM3169 = C0619.m2761("᩷᩸") ^ i5;
                    i = ((iM3169 ^ i4) * (-8777)) ^ 721680787;
                    i2 = -1472951313;
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -1092698863:
                case 1487655395:
                    if (C11235.f35427 < 0) {
                        iM2761 = (C0619.m2761("֫ᩴ") + i5) * (-117);
                        i6 = ((iM2761 ^ i4) * 27155) ^ 1768674422;
                        i3 = 727483812;
                        i7 = iM2761 ^ i3;
                        menu2 = menu;
                    } else {
                        iM3169 = (C0773.m3169("֨ۡ") + i5) * (-25);
                        i = ((iM3169 ^ i4) * 9387) ^ (-1628141656);
                        i2 = -1486723119;
                        i7 = iM3169 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1087253137:
                case 1937206537:
                    short s2 = sArr[c];
                    int i17 = s2 + 13742;
                    if (C1080.f3865 < 0) {
                        int iM2763 = C0619.m2761("ۘ᩹") ^ i4;
                        int i18 = ((iM2763 ^ i5) * 1183) ^ (-96001146);
                        i7 = iM2763 ^ 780936319;
                        s = s2;
                        i16 = i17;
                        i6 = i18;
                        menu2 = menu;
                    } else {
                        s = s2;
                        i16 = i17;
                        iM3169 = (C0773.m3169("֨ۡ") + i5) * (-25);
                        i = ((iM3169 ^ i4) * 9387) ^ (-1628141656);
                        i2 = -1486723119;
                        i7 = iM3169 ^ i2;
                        i6 = i;
                    }
                    break;
                case -986733697:
                case -189896963:
                    int i19 = i12 + i13;
                    if (i11 - (i19 + i19) > 0) {
                        iM3169 = C0773.m3169("ܽܰ") ^ i4;
                        i = ((iM3169 ^ i5) * 9385) ^ (-692210210);
                        i2 = 200615575;
                    } else {
                        iM3169 = C0619.m2761("ܿ֡") ^ i5;
                        i = ((iM3169 ^ i4) * 20171) ^ (-1713645932);
                        i2 = -1240170635;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -972802234:
                case 281190789:
                    i10 = 3;
                    if (C1146.m4231()) {
                        iM3169 = (C0619.m2761("ۤᩴ") + i4) * (-67);
                        i = ((iM3169 ^ i5) * (-3485)) ^ 664316591;
                        i2 = 834821044;
                    } else {
                        iM3169 = C0773.m3169("ۚܽ") ^ i4;
                        i = ((iM3169 ^ i5) * 13219) ^ 749914694;
                        i2 = -861983680;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -300322668:
                case -241751076:
                    C2485.m8357();
                    if (C1826.m6301() >= 0) {
                        iM3169 = (C0773.m3169("۫֡") ^ i4) * 13;
                        i = ((iM3169 ^ i5) * (-1401)) ^ 2136518040;
                        i2 = 2107326826;
                    } else {
                        iM3169 = (C0773.m3169("֨ۡ") + i5) * (-25);
                        i = ((iM3169 ^ i4) * 9387) ^ (-1628141656);
                        i2 = -1486723119;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case 1699484886:
                case 2001294641:
                    menuInflater = getMenuInflater();
                    sArr2 = f25870;
                    i9 = 509;
                    if (C1519.f5300 < 0) {
                        iM3169 = C0773.m3169("ܽܿ") ^ i4;
                        i = ((iM3169 ^ i5) * (-28103)) ^ (-515953036);
                        i2 = 1288783126;
                        i7 = iM3169 ^ i2;
                        i6 = i;
                    } else {
                        iM2761 = (C0619.m2761("֫ᩴ") + i5) * (-117);
                        i6 = ((iM2761 ^ i4) * 27155) ^ 1768674422;
                        i3 = 727483812;
                        i7 = iM2761 ^ i3;
                        menu2 = menu;
                    }
                    break;
                default:
                    menuInflater.inflate(2122108124 ^ iM31611, menu2);
                    sArr3 = f25870;
                    if (C20932.f66974 > 0) {
                        iM3169 = C0773.m3169("֨ۤ") ^ i5;
                        i = ((iM3169 ^ i4) * (-5115)) ^ (-1241770606);
                        i2 = -1205977758;
                        i7 = iM3169 ^ i2;
                        i6 = i;
                    } else {
                        iM2761 = (C0619.m2761("۟᩶") ^ i4) * 19;
                        i6 = ((iM2761 ^ i5) * (-29545)) ^ (-321009198);
                        i3 = -217666866;
                        i7 = iM2761 ^ i3;
                        menu2 = menu;
                    }
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
    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public void m21223() {
        C12267 c12267 = null;
        C3318 c3318 = null;
        boolean z = false;
        InterfaceC15970 interfaceC15970ListIterator = null;
        C3318 c3319 = null;
        InterfaceC15970 interfaceC15970ListIterator2 = null;
        C12267 c12268 = null;
        C3318 c33110 = null;
        C12267 c12269 = null;
        int i = -1591160759;
        int i2 = C2310.f7472;
        int i3 = C4282.f15546;
        int iM3169 = C0773.m3169("۠᩺") ^ i3;
        int i4 = ((iM3169 ^ i2) * 15513) ^ 1412627062;
        int i5 = -305160844;
        while (true) {
            i = ((((i ^ i2) * (-24203)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2033176701:
                case 1513898662:
                    interfaceC15970ListIterator = c3318.f10826.listIterator(0);
                    z = false;
                    iM3169 = C0773.m3169("֨۬") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-13943)) ^ (-1078430648);
                    i5 = 689306079;
                    break;
                case -2013911322:
                case -1285982821:
                    interfaceC15970ListIterator2 = c3319.f10826.listIterator(z ? 1 : 0);
                    iM3169 = (i3 - C0773.m3169("۟᩸")) * (-39);
                    i4 = ((iM3169 ^ i2) * 6213) ^ (-1421144832);
                    i5 = -2107636206;
                    break;
                case -2004451094:
                case -1035398272:
                    c3319 = this.f25872.f39446;
                    if (C4282.m13644()) {
                        iM3169 = (C0773.m3169("ܿ᩻") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM3169 ^ i2) * 14183) ^ 202268605;
                        i5 = -1261884542;
                    } else {
                        iM3169 = (C0773.m3169("᩶᩶") ^ i2) * (-117);
                        i4 = ((iM3169 ^ i3) * 15993) ^ (-1018084430);
                        i5 = -781280404;
                    }
                    break;
                case -1769702117:
                case -904549761:
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0619.m2761("֫ۨ") + i2) * 33;
                        i4 = ((iM3169 ^ i3) * 1419) ^ 1292733766;
                        i5 = 818106831;
                    } else {
                        iM3169 = (C0773.m3169("᩶ᩴ") + i3) * (-69);
                        i4 = ((iM3169 ^ i2) * (-17523)) ^ (-1831362666);
                        i5 = -262064937;
                    }
                    break;
                case -1757921941:
                case -915616261:
                    c12267 = this.f25880;
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0619.m2761("֫ۨ") + i2) * 33;
                        i4 = ((iM3169 ^ i3) * 1419) ^ 1292733766;
                        i5 = 818106831;
                    } else {
                        iM3169 = C0773.m3169("ۘܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 19627) ^ 990007363;
                        i5 = 1941380775;
                    }
                    break;
                case -1712706454:
                case -1623028893:
                    c12268 = this.f25880;
                    c12268.f39450 = z ? 1 : 0;
                    if (C3690.m11987()) {
                        iM3169 = (C0773.m3169("᩶᩶") ^ i2) * (-117);
                        i4 = ((iM3169 ^ i3) * 15993) ^ (-1018084430);
                        i5 = -781280404;
                    } else {
                        iM3169 = C0619.m2761("ᩳۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 13193) ^ (-273716926);
                        i5 = -910172413;
                    }
                    break;
                case -1506835857:
                case 1648160207:
                    m21241(z);
                    m21229();
                    break;
                case -1473079641:
                case -440144674:
                    c3318 = c12267.f39446;
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0773.m3169("᩶ᩴ") + i3) * (-69);
                        i4 = ((iM3169 ^ i2) * (-17523)) ^ (-1831362666);
                        i5 = -262064937;
                    } else {
                        iM3169 = (C0619.m2761("᩸ܿ") ^ i3) * 47;
                        i4 = ((iM3169 ^ i2) * (-25517)) ^ (-551274096);
                        i5 = 1067994381;
                    }
                    break;
                case -1404546695:
                case 681304254:
                    C23916.m53419();
                    if (C2878.f9462) {
                        iM3169 = (C0773.m3169("᩷ܶ") ^ i3) * 123;
                        i4 = ((iM3169 ^ i2) * (-21261)) ^ (-658113046);
                        i5 = 846264827;
                    } else {
                        iM3169 = (C0773.m3169("᩶ᩴ") + i3) * (-69);
                        i4 = ((iM3169 ^ i2) * (-17523)) ^ (-1831362666);
                        i5 = -262064937;
                    }
                    break;
                case -1399034526:
                case -748691763:
                    C3033.m9852(c12269.f39446);
                    if (C2288.f7433 <= 0) {
                        iM3169 = (C0773.m3169("᩶᩶") ^ i2) * (-117);
                        i4 = ((iM3169 ^ i3) * 15993) ^ (-1018084430);
                        i5 = -781280404;
                    } else {
                        iM3169 = C0619.m2761("۟᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 18545) ^ (-899268066);
                        i5 = -392038652;
                    }
                    break;
                case -1336426888:
                case -291998986:
                    C3492.m11488();
                    break;
                case -1171232366:
                case -175031488:
                    C4238.m13540();
                    iM3169 = (C0773.m3169("᩶ᩴ") + i3) * (-69);
                    i4 = ((iM3169 ^ i2) * (-17523)) ^ (-1831362666);
                    i5 = -262064937;
                    break;
                case -1155964137:
                case -380479186:
                    if (C3998.m12923(interfaceC15970ListIterator2)) {
                        iM3169 = (C0619.m2761("ۤ۫") ^ i2) * (-27);
                        i4 = ((iM3169 ^ i3) * 29173) ^ (-1417475829);
                        i5 = 799524341;
                    } else {
                        iM3169 = C0773.m3169("ۜ᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-20685)) ^ 1403411243;
                        i5 = 1339607081;
                    }
                    break;
                case -1069615879:
                case 425368840:
                    c12269 = this.f25872;
                    c12269.f39450 = z ? 1 : 0;
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0773.m3169("᩶᩶") ^ i2) * (-117);
                        i4 = ((iM3169 ^ i3) * 15993) ^ (-1018084430);
                        i5 = -781280404;
                    } else {
                        iM3169 = C0773.m3169("ܶᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-29965)) ^ 970889900;
                        i5 = 2058264518;
                    }
                    break;
                case -1056167829:
                case 183194835:
                    ((C20472) C4238.m13529(interfaceC15970ListIterator)).f65591 = z;
                    iM3169 = C0773.m3169("֨۬") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-13943)) ^ (-1078430648);
                    i5 = 689306079;
                    break;
                case -872241306:
                case -172672909:
                    this.f25886 = z;
                    if (C1519.m5403()) {
                        iM3169 = (C0773.m3169("֨ܳ") + i3) * (-13);
                        i4 = ((iM3169 ^ i2) * (-16923)) ^ 701215965;
                        i5 = 1100671791;
                    } else {
                        iM3169 = (C0619.m2761("֫ۨ") + i2) * 33;
                        i4 = ((iM3169 ^ i3) * 1419) ^ 1292733766;
                        i5 = 818106831;
                    }
                    break;
                case -641334327:
                case 872930458:
                    C3033.m9852(c33110);
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0619.m2761("۟ܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-17765)) ^ 1423590356;
                        i5 = 597945383;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ᩴۡ")) * (-79);
                        i4 = ((iM3169 ^ i3) * 14531) ^ 1720950298;
                        i5 = -19450972;
                    }
                    break;
                case -390762814:
                case -14203710:
                    if (C1826.m6317(interfaceC15970ListIterator)) {
                        iM3169 = C0773.m3169("۟᩵") ^ i2;
                        i4 = ((iM3169 ^ i3) * 6507) ^ 1598994310;
                        i5 = -589713156;
                    } else {
                        iM3169 = (C0773.m3169("ۚ֨") ^ i2) * 7;
                        i4 = ((iM3169 ^ i3) * 28187) ^ 919147862;
                        i5 = 422226657;
                    }
                    break;
                case -316712240:
                case 6551112:
                    c33110 = c12268.f39446;
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0773.m3169("᩶ᩴ") + i3) * (-69);
                        i4 = ((iM3169 ^ i2) * (-17523)) ^ (-1831362666);
                        i5 = -262064937;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۜ᩹")) * 41;
                        i4 = ((iM3169 ^ i2) * 1897) ^ (-749793510);
                        i5 = 131419505;
                    }
                    break;
                case 444289847:
                case 1191509603:
                    ((C20472) C4238.m13529(interfaceC15970ListIterator2)).f65591 = z;
                    iM3169 = (i3 - C0773.m3169("۟᩸")) * (-39);
                    i4 = ((iM3169 ^ i2) * 6213) ^ (-1421144832);
                    i5 = -2107636206;
                    break;
                case 1460959957:
                case 1479552815:
                    if (AbstractC0641.m2813() <= 0) {
                        iM3169 = (C0773.m3169("᩶᩶") ^ i2) * (-117);
                        i4 = ((iM3169 ^ i3) * 15993) ^ (-1018084430);
                        i5 = -781280404;
                    } else {
                        iM3169 = (C0619.m2761("۟ۗ") ^ i2) * 59;
                        i4 = ((iM3169 ^ i3) * (-28009)) ^ 1425332955;
                        i5 = -1200234139;
                    }
                    break;
                default:
                    if (C2834.m9344() >= 0) {
                        iM3169 = C0619.m2761("۟ܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-17765)) ^ 1423590356;
                        i5 = 597945383;
                    } else {
                        iM3169 = (C0773.m3169("᩶ᩴ") + i3) * (-69);
                        i4 = ((iM3169 ^ i2) * (-17523)) ^ (-1831362666);
                        i5 = -262064937;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m21237(C20472 c20472) {
        int iM2761;
        int i;
        String str;
        short[] sArr;
        String str2;
        short[] sArr2;
        String str3;
        int iM3169;
        int i2;
        int i3;
        String str4;
        String strM39284;
        int iM31610;
        int i4;
        int i5;
        int i6 = 1876375302;
        int i7 = C1542.f5343;
        int i8 = C2354.f7599;
        int iM2762 = C0619.m2761("ۛ֫") ^ i7;
        int i9 = ((iM2762 ^ i8) * (-4809)) ^ 1593251125;
        int i10 = iM2762 ^ 2098631074;
        String strM8877 = null;
        String str5 = null;
        String str6 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i11 = 0;
        InterfaceC9801 interfaceC9801 = null;
        short s = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        short s2 = 0;
        int i15 = 0;
        int i16 = 0;
        String strM9486 = null;
        long longVersionCode = 0;
        String strM2756 = null;
        String str7 = null;
        String strM2364 = null;
        String str8 = null;
        String strM1237 = null;
        String strM46976 = null;
        String strM10092 = null;
        int i17 = 0;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i8) * 14695) >> 31));
            switch (i6) {
                case -2144143619:
                case -86854838:
                    if (!C2023.f6737) {
                        int iM2763 = (C0619.m2761("ۙܿ") + i8) * 23;
                        i10 = iM2763 ^ (-872668022);
                        i9 = ((iM2763 ^ i7) * 9143) ^ 191482703;
                        sArr5 = sArr5;
                    } else {
                        strM2756 = strM2756;
                        sArr6 = sArr6;
                        interfaceC9801 = interfaceC9801;
                        str5 = str5;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        int iM2764 = C0619.m2761("۬᩹") ^ i8;
                        i9 = ((iM2764 ^ i7) * (-29275)) ^ (-2014149237);
                        i10 = iM2764 ^ 1094115072;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        str5 = str5;
                        strM2756 = strM2756;
                        sArr6 = sArr6;
                        interfaceC9801 = interfaceC9801;
                    }
                    break;
                case -2107859341:
                case -1449149324:
                    strM2364 = C0487.m2364(strM1237, strM10092, RunnableC0334.m2049(sArr5, 362, 1, i11));
                    if (C1783.f6087 > 0) {
                        iM31610 = (C0773.m3169("۬ۙ") ^ i8) * (-23);
                        i4 = ((iM31610 ^ i7) * 23649) ^ (-2010673254);
                        i5 = 1329501951;
                        i10 = iM31610 ^ i5;
                        i9 = i4;
                    } else {
                        str2 = strM2756;
                        interfaceC9801 = interfaceC9801;
                        str3 = strM9486;
                        str = str5;
                        sArr2 = sArr4;
                        sArr = sArr5;
                        iM3169 = (C0619.m2761("ܺ۟") + i8) * 99;
                        strM9486 = str3;
                        i2 = ((iM3169 ^ i7) * 7321) ^ (-87567892);
                        i3 = 1431178178;
                        i10 = iM3169 ^ i3;
                        i9 = i2;
                        sArr4 = sArr2;
                        sArr5 = sArr;
                        str5 = str;
                        strM2756 = str2;
                        interfaceC9801 = interfaceC9801;
                    }
                    break;
                case -2067674660:
                case 547906242:
                    str4 = str5;
                    strM39284 = C16602.m39284(str4, strM46976, str8, String.valueOf(str7), String.valueOf(longVersionCode));
                    if (C3077.m10045(strM39284) > 200) {
                        int iM31611 = (i7 - C0773.m3169("᩷ۡ")) * 23;
                        i10 = iM31611 ^ (-1875373122);
                        str5 = str4;
                        str6 = strM39284;
                        i9 = ((iM31611 ^ i8) * 32227) ^ 251350227;
                        i17 = 200;
                    } else {
                        strM1237 = strM39284;
                        i17 = 200;
                        int iM31612 = C0773.m3169("᩸ܽ") ^ i8;
                        i10 = iM31612 ^ (-943733027);
                        String str9 = strM39284;
                        i9 = ((iM31612 ^ i7) * 14991) ^ 1499894986;
                        sArr5 = sArr5;
                        str5 = str4;
                        str6 = str9;
                    }
                    break;
                case -1612860998:
                case 1979532495:
                    strM2756 = strM2756;
                    sArr6 = sArr6;
                    interfaceC9801 = interfaceC9801;
                    str5 = str5;
                    sArr3 = sArr3;
                    i15 = i15;
                    i16 = i16;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    if (Build.VERSION.SDK_INT >= 28) {
                        iM2761 = (C0773.m3169("ۙ᩻") ^ i8) * (-99);
                        i9 = ((iM2761 ^ i7) * (-6799)) ^ 1682124285;
                        i = -899424315;
                    } else {
                        iM2761 = (C0773.m3169("ۛ᩻") ^ i7) * 31;
                        i9 = ((iM2761 ^ i8) * 12687) ^ 156019558;
                        i = -1454482949;
                    }
                    i15 = i15;
                    i16 = i16;
                    sArr4 = sArr4;
                    strM2756 = strM2756;
                    sArr6 = sArr6;
                    sArr3 = sArr3;
                    i10 = iM2761 ^ i;
                    interfaceC9801 = interfaceC9801;
                    sArr5 = sArr5;
                    str5 = str5;
                    break;
                case -1371764223:
                case 1858654844:
                    strM2756 = strM2756;
                    sArr6 = sArr6;
                    interfaceC9801 = interfaceC9801;
                    str5 = str5;
                    sArr3 = sArr3;
                    i15 = i15;
                    i16 = i16;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    int i18 = i12 + i13;
                    i14 = i18 + i18;
                    s2 = 3581;
                    if (C1542.f5343 > 0) {
                        iM2761 = C0619.m2761("ۧۜ") ^ i8;
                        i9 = ((iM2761 ^ i7) * 17205) ^ 861013415;
                        i = 1661862578;
                        i15 = i15;
                        i16 = i16;
                        sArr4 = sArr4;
                        strM2756 = strM2756;
                        sArr6 = sArr6;
                        sArr3 = sArr3;
                        i10 = iM2761 ^ i;
                        interfaceC9801 = interfaceC9801;
                        sArr5 = sArr5;
                        str5 = str5;
                    } else {
                        i15 = i15;
                        i16 = i16;
                        sArr3 = sArr3;
                        int iM2765 = C0619.m2761("۬᩹") ^ i8;
                        i9 = ((iM2765 ^ i7) * (-29275)) ^ (-2014149237);
                        i10 = iM2765 ^ 1094115072;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        str5 = str5;
                        strM2756 = strM2756;
                        sArr6 = sArr6;
                        interfaceC9801 = interfaceC9801;
                    }
                    break;
                case -1354639065:
                case -585783469:
                    strM2756 = strM2756;
                    sArr6 = sArr6;
                    interfaceC9801 = interfaceC9801;
                    str5 = str5;
                    i15 = i15;
                    i16 = i16;
                    sArr5 = sArr5;
                    short[] sArr7 = sArr3;
                    strM9486 = C2878.m9486(sArr7, i15, i16, i11);
                    sArr4 = f25870;
                    if (C2834.f9334 > 0) {
                        int iM31613 = C0773.m3169("᩵ۛ") ^ i8;
                        i9 = ((iM31613 ^ i7) * 26953) ^ 1058147167;
                        i15 = i15;
                        i16 = i16;
                        sArr5 = sArr5;
                        str5 = str5;
                        strM2756 = strM2756;
                        sArr6 = sArr6;
                        sArr3 = sArr7;
                        i10 = iM31613 ^ (-1310642387);
                        interfaceC9801 = interfaceC9801;
                    } else {
                        sArr3 = sArr7;
                        int iM31614 = (C0773.m3169("ܰ۠") + i7) * 51;
                        i9 = ((iM31614 ^ i8) * (-20161)) ^ 1819414512;
                        i15 = i15;
                        i16 = i16;
                        interfaceC9801 = interfaceC9801;
                        strM2756 = strM2756;
                        sArr6 = sArr6;
                        sArr3 = sArr3;
                        i10 = iM31614 ^ (-660806762);
                        sArr5 = sArr5;
                        str5 = str5;
                    }
                    break;
                case -1234142248:
                case 197714517:
                    return C0487.m2364(strM2364, strM2756, C3448.m11252(sArr6, 365, 1, i11));
                case -797055307:
                case 1267396527:
                    longVersionCode = c20472.f65594.versionCode;
                    iM2761 = C0619.m2761("᩻ܽ") ^ i8;
                    i9 = ((iM2761 ^ i7) * 8813) ^ 714260933;
                    i = 1809626318;
                    i15 = i15;
                    i16 = i16;
                    sArr4 = sArr4;
                    strM2756 = strM2756;
                    sArr6 = sArr6;
                    sArr3 = sArr3;
                    i10 = iM2761 ^ i;
                    interfaceC9801 = interfaceC9801;
                    sArr5 = sArr5;
                    str5 = str5;
                    break;
                case -782882915:
                case 133604611:
                    C17202.m40372();
                    if (C4282.f15546 > 0) {
                        iM31610 = (C0773.m3169("ܶۨ") + i7) * 27;
                        i4 = ((iM31610 ^ i8) * (-15249)) ^ (-833177483);
                        i5 = -1427440750;
                        i10 = iM31610 ^ i5;
                        i9 = i4;
                    } else {
                        int iM2766 = (C0619.m2761("ۙܿ") + i8) * 23;
                        i10 = iM2766 ^ (-872668022);
                        i9 = ((iM2766 ^ i7) * 9143) ^ 191482703;
                        sArr5 = sArr5;
                    }
                    break;
                case -532196961:
                case 880249790:
                    strM2756 = strM2756;
                    sArr6 = sArr6;
                    interfaceC9801 = interfaceC9801;
                    str5 = str5;
                    sArr3 = sArr3;
                    i15 = i15;
                    i16 = i16;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    s = f25870[317];
                    if (!C3690.m11987()) {
                        iM2761 = (i8 - C0619.m2761("ۚ֫")) * (-39);
                        i9 = ((iM2761 ^ i7) * (-26753)) ^ (-857900115);
                        i = 1124239477;
                        i15 = i15;
                        i16 = i16;
                        sArr4 = sArr4;
                        strM2756 = strM2756;
                        sArr6 = sArr6;
                        sArr3 = sArr3;
                        i10 = iM2761 ^ i;
                        interfaceC9801 = interfaceC9801;
                        sArr5 = sArr5;
                        str5 = str5;
                    } else {
                        sArr4 = sArr4;
                        int iM31615 = (C0773.m3169("ܰ۠") + i7) * 51;
                        i9 = ((iM31615 ^ i8) * (-20161)) ^ 1819414512;
                        i15 = i15;
                        i16 = i16;
                        interfaceC9801 = interfaceC9801;
                        strM2756 = strM2756;
                        sArr6 = sArr6;
                        sArr3 = sArr3;
                        i10 = iM31615 ^ (-660806762);
                        sArr5 = sArr5;
                        str5 = str5;
                    }
                    break;
                case -521841521:
                case 813891444:
                    longVersionCode = c20472.f65594.getLongVersionCode();
                    iM2761 = C0619.m2761("᩻ܽ") ^ i8;
                    i9 = ((iM2761 ^ i7) * 8813) ^ 714260933;
                    i = 1809626318;
                    i15 = i15;
                    i16 = i16;
                    sArr4 = sArr4;
                    strM2756 = strM2756;
                    sArr6 = sArr6;
                    sArr3 = sArr3;
                    i10 = iM2761 ^ i;
                    interfaceC9801 = interfaceC9801;
                    sArr5 = sArr5;
                    str5 = str5;
                    break;
                case -315704363:
                case 1474098312:
                    strM10092 = C3099.m10092(f25870, 350, 12, i11);
                    sArr5 = f25870;
                    if (!C3077.f9998) {
                        int iM2767 = (C0619.m2761("ۙܿ") + i8) * 23;
                        i10 = iM2767 ^ (-872668022);
                        i9 = ((iM2767 ^ i7) * 9143) ^ 191482703;
                        sArr5 = sArr5;
                    } else {
                        iM31610 = C0773.m3169("ܳ֨") ^ i7;
                        i4 = ((iM31610 ^ i8) * 22931) ^ 800437836;
                        i5 = -885146998;
                        i10 = iM31610 ^ i5;
                        i9 = i4;
                    }
                    break;
                case -232077790:
                case -35667555:
                    i11 = 22858;
                    iM2761 = C0619.m2761("ۢ᩵") ^ i7;
                    i9 = ((iM2761 ^ i8) * 5349) ^ (-550963138);
                    i = 1016884016;
                    i15 = i15;
                    i16 = i16;
                    sArr4 = sArr4;
                    strM2756 = strM2756;
                    sArr6 = sArr6;
                    sArr3 = sArr3;
                    i10 = iM2761 ^ i;
                    interfaceC9801 = interfaceC9801;
                    sArr5 = sArr5;
                    str5 = str5;
                    break;
                case -210839561:
                case -168870931:
                    strM2756 = strM2756;
                    sArr6 = sArr6;
                    interfaceC9801 = interfaceC9801;
                    str5 = str5;
                    sArr3 = sArr3;
                    i15 = i15;
                    i16 = i16;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    int i19 = s + s2;
                    if ((i19 * i19) - i14 > 0) {
                        iM2761 = C0773.m3169("ۢᩴ") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-1455)) ^ (-1383885967);
                        i = 1649025120;
                    } else {
                        iM2761 = (C0619.m2761("ܳܶ") + i7) * 37;
                        i9 = ((iM2761 ^ i8) * (-4493)) ^ (-1882457492);
                        i = -231584512;
                    }
                    i15 = i15;
                    i16 = i16;
                    sArr4 = sArr4;
                    strM2756 = strM2756;
                    sArr6 = sArr6;
                    sArr3 = sArr3;
                    i10 = iM2761 ^ i;
                    interfaceC9801 = interfaceC9801;
                    sArr5 = sArr5;
                    str5 = str5;
                    break;
                case -194182409:
                case -66050883:
                    sArr5 = sArr5;
                    String strM39286 = C16602.m39286(strM8877);
                    strM46976 = c20472.m46976();
                    str8 = c20472.f65589;
                    str7 = c20472.f65594.versionName;
                    if (C11235.f35427 < 0) {
                        int iM2768 = C0619.m2761("᩷ۢ") ^ i7;
                        str5 = strM39286;
                        i10 = iM2768 ^ 1774885285;
                        i9 = ((iM2768 ^ i8) * 11257) ^ 918840353;
                        sArr5 = sArr5;
                        str5 = str5;
                    } else {
                        str5 = strM39286;
                        sArr5 = sArr5;
                        int iM2769 = (C0619.m2761("ۙܿ") + i8) * 23;
                        i10 = iM2769 ^ (-872668022);
                        i9 = ((iM2769 ^ i7) * 9143) ^ 191482703;
                        sArr5 = sArr5;
                    }
                    break;
                case -103838070:
                case 1115507666:
                    strM2756 = strM2756;
                    sArr6 = sArr6;
                    interfaceC9801 = interfaceC9801;
                    str5 = str5;
                    sArr3 = sArr3;
                    i15 = i15;
                    i16 = i16;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    i12 = s * s;
                    i13 = 12823561;
                    if (C0773.f2792 > 0) {
                        iM2761 = C0619.m2761("᩵ܰ") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-22893)) ^ 1404574936;
                        i = 665463051;
                        i15 = i15;
                        i16 = i16;
                        sArr4 = sArr4;
                        strM2756 = strM2756;
                        sArr6 = sArr6;
                        sArr3 = sArr3;
                        i10 = iM2761 ^ i;
                        interfaceC9801 = interfaceC9801;
                        sArr5 = sArr5;
                        str5 = str5;
                    } else {
                        i15 = i15;
                        i16 = i16;
                        sArr3 = sArr3;
                        int iM27610 = C0619.m2761("۬᩹") ^ i8;
                        i9 = ((iM27610 ^ i7) * (-29275)) ^ (-2014149237);
                        i10 = iM27610 ^ 1094115072;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        str5 = str5;
                        strM2756 = strM2756;
                        sArr6 = sArr6;
                        interfaceC9801 = interfaceC9801;
                    }
                    break;
                case -81044743:
                case 122020848:
                    strM1237 = AbstractC0116.m1237(str6, 0, i17);
                    strM39284 = str6;
                    str4 = str5;
                    int iM31616 = C0773.m3169("᩸ܽ") ^ i8;
                    i10 = iM31616 ^ (-943733027);
                    String str10 = strM39284;
                    i9 = ((iM31616 ^ i7) * 14991) ^ 1499894986;
                    sArr5 = sArr5;
                    str5 = str4;
                    str6 = str10;
                    break;
                case -71335556:
                case 466407679:
                    strM2756 = strM2756;
                    sArr6 = sArr6;
                    str5 = str5;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    InterfaceC9801 interfaceC9802 = ApplicationC17729.f58258;
                    sArr3 = f25870;
                    i15 = 318;
                    i16 = 19;
                    if (C2834.f9334 > 0) {
                        int iM27611 = C0619.m2761("᩹᩺") ^ i7;
                        i10 = iM27611 ^ (-433891798);
                        i9 = ((iM27611 ^ i8) * (-11679)) ^ (-1215253239);
                        sArr4 = sArr4;
                        strM2756 = strM2756;
                        sArr6 = sArr6;
                        interfaceC9801 = interfaceC9802;
                        sArr5 = sArr5;
                        str5 = str5;
                    } else {
                        interfaceC9801 = interfaceC9802;
                        int iM27612 = C0619.m2761("۬᩹") ^ i8;
                        i9 = ((iM27612 ^ i7) * (-29275)) ^ (-2014149237);
                        i10 = iM27612 ^ 1094115072;
                        sArr4 = sArr4;
                        sArr5 = sArr5;
                        str5 = str5;
                        strM2756 = strM2756;
                        sArr6 = sArr6;
                        interfaceC9801 = interfaceC9801;
                    }
                    break;
                case 167090158:
                case 562175419:
                    str = str5;
                    sArr = sArr5;
                    str2 = strM2756;
                    short[] sArr8 = sArr4;
                    String strM2361 = C0487.m2361(sArr8, 337, 13, i11);
                    interfaceC9801 = interfaceC9801;
                    sArr2 = sArr8;
                    str3 = strM9486;
                    strM8877 = C2702.m8877(interfaceC9801, str3, strM2361);
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0619.m2761("ܺ۟") + i8) * 99;
                        strM9486 = str3;
                        i2 = ((iM3169 ^ i7) * 7321) ^ (-87567892);
                        i3 = 1431178178;
                    } else {
                        strM9486 = str3;
                        iM3169 = (C0773.m3169("֫ۗ") ^ i7) * 115;
                        i2 = ((iM3169 ^ i8) * 17231) ^ (-1095494438);
                        i3 = 181955933;
                    }
                    i10 = iM3169 ^ i3;
                    i9 = i2;
                    sArr4 = sArr2;
                    sArr5 = sArr;
                    str5 = str;
                    strM2756 = str2;
                    interfaceC9801 = interfaceC9801;
                    break;
                case 314455822:
                case 1178331458:
                    C1542.m5459();
                    C3998.m12920();
                    return null;
                case 368846057:
                case 1215450042:
                    strM2756 = C0619.m2756(f25870, 363, 2, i11);
                    sArr6 = f25870;
                    if (!C3077.f9998) {
                        int iM27613 = (C0619.m2761("ۙܿ") + i8) * 23;
                        i10 = iM27613 ^ (-872668022);
                        i9 = ((iM27613 ^ i7) * 9143) ^ 191482703;
                        sArr5 = sArr5;
                    } else {
                        iM31610 = C0773.m3169("ᩴۛ") ^ i8;
                        i4 = ((iM31610 ^ i7) * (-29955)) ^ (-1509550238);
                        i5 = 638797999;
                        i10 = iM31610 ^ i5;
                        i9 = i4;
                    }
                    break;
                case 860401776:
                case 1916378565:
                    C3690.m11987();
                    strM2756 = strM2756;
                    sArr6 = sArr6;
                    interfaceC9801 = interfaceC9801;
                    str5 = str5;
                    sArr3 = sArr3;
                    i15 = i15;
                    i16 = i16;
                    sArr5 = sArr5;
                    int iM31617 = (C0773.m3169("ܰ۠") + i7) * 51;
                    i9 = ((iM31617 ^ i8) * (-20161)) ^ 1819414512;
                    i15 = i15;
                    i16 = i16;
                    interfaceC9801 = interfaceC9801;
                    strM2756 = strM2756;
                    sArr6 = sArr6;
                    sArr3 = sArr3;
                    i10 = iM31617 ^ (-660806762);
                    sArr5 = sArr5;
                    str5 = str5;
                    break;
                case 1768972203:
                case 2094248006:
                    i11 = 1275;
                    iM2761 = C0619.m2761("ۢ᩵") ^ i7;
                    i9 = ((iM2761 ^ i8) * 5349) ^ (-550963138);
                    i = 1016884016;
                    i15 = i15;
                    i16 = i16;
                    sArr4 = sArr4;
                    strM2756 = strM2756;
                    sArr6 = sArr6;
                    sArr3 = sArr3;
                    i10 = iM2761 ^ i;
                    interfaceC9801 = interfaceC9801;
                    sArr5 = sArr5;
                    str5 = str5;
                    break;
                default:
                    C0950.m3785();
                    if (C1783.f6087 <= 0) {
                        int iM27614 = (C0619.m2761("ۙܿ") + i8) * 23;
                        i10 = iM27614 ^ (-872668022);
                        i9 = ((iM27614 ^ i7) * 9143) ^ 191482703;
                        sArr5 = sArr5;
                    } else {
                        strM2756 = strM2756;
                        sArr6 = sArr6;
                        interfaceC9801 = interfaceC9801;
                        str5 = str5;
                        sArr3 = sArr3;
                        i15 = i15;
                        i16 = i16;
                        sArr5 = sArr5;
                        int iM31618 = (C0773.m3169("ܰ۠") + i7) * 51;
                        i9 = ((iM31618 ^ i8) * (-20161)) ^ 1819414512;
                        i15 = i15;
                        i16 = i16;
                        interfaceC9801 = interfaceC9801;
                        strM2756 = strM2756;
                        sArr6 = sArr6;
                        sArr3 = sArr3;
                        i10 = iM31618 ^ (-660806762);
                        sArr5 = sArr5;
                        str5 = str5;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:37:0x012b A[PHI: r2 r5 r6
      0x012b: PHI (r2v3 l.ܿۢ֫) = (r2v2 l.ܿۢ֫), (r2v4 l.ܿۢ֫) binds: [B:36:0x0129, B:32:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x012b: PHI (r5v4 int) = (r5v3 int), (r5v2 int) binds: [B:36:0x0129, B:32:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x012b: PHI (r6v4 int) = (r6v3 int), (r6v2 int) binds: [B:36:0x0129, B:32:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0181 A[PHI: r3 r7 r8 r15
      0x0181: PHI (r3v4 boolean) = (r3v2 boolean), (r3v3 boolean), (r3v2 boolean), (r3v2 boolean) binds: [B:44:0x017f, B:20:0x008c, B:13:0x006d, B:7:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0181: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:44:0x017f, B:20:0x008c, B:13:0x006d, B:7:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0181: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:44:0x017f, B:20:0x008c, B:13:0x006d, B:7:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0181: PHI (r15v4 short[]) = (r15v3 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:44:0x017f, B:20:0x008c, B:13:0x006d, B:7:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0240 A[PHI: r4 r10 r11 r12 r13 r22
      0x0240: PHI (r4v4 java.lang.String) = 
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v3 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
     binds: [B:62:0x023e, B:58:0x021f, B:54:0x0200, B:40:0x015f, B:15:0x0071, B:13:0x006d, B:10:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r10v4 short) = (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:62:0x023e, B:58:0x021f, B:54:0x0200, B:40:0x015f, B:15:0x0071, B:13:0x006d, B:10:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:62:0x023e, B:58:0x021f, B:54:0x0200, B:40:0x015f, B:15:0x0071, B:13:0x006d, B:10:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:62:0x023e, B:58:0x021f, B:54:0x0200, B:40:0x015f, B:15:0x0071, B:13:0x006d, B:10:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:62:0x023e, B:58:0x021f, B:54:0x0200, B:40:0x015f, B:15:0x0071, B:13:0x006d, B:10:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r22v5 short) = (r22v4 short), (r22v3 short), (r22v3 short), (r22v3 short), (r22v3 short), (r22v3 short), (r22v3 short) binds: [B:62:0x023e, B:58:0x021f, B:54:0x0200, B:40:0x015f, B:15:0x0071, B:13:0x006d, B:10:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0275 A[PHI: r17
      0x0275: PHI (r17v4 char) = (r17v3 char), (r17v2 char) binds: [B:66:0x0273, B:7:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02a9 A[PHI: r16
      0x02a9: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]) binds: [B:70:0x02a7, B:10:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    private void m21189() {
        int iM3169;
        int i;
        int i2;
        int i3 = C1519.f5300;
        int i4 = AbstractC0116.f1064;
        int iM2761 = C0619.m2761("ܺ᩹") ^ i4;
        int i5 = ((iM2761 ^ i3) * (-28821)) ^ 1239553554;
        String strM6310 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2761 ^ (-1406489021);
        C18234 c18234 = null;
        boolean z = false;
        int iM31610 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        int i14 = 166527387;
        short s2 = 0;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * (-11259)) >> 31));
            switch (i14) {
                case -1975508994:
                case 1413422335:
                    iM31610 = C0773.m3169(strM6310);
                    i7 = 2101506322;
                    if (C0619.f2439) {
                        iM3169 = C0619.m2761("ۛۨ") ^ i3;
                        i = ((iM3169 ^ i4) * 21361) ^ 1644229608;
                        i2 = 454374849;
                    } else {
                        iM3169 = (C0619.m2761("֡ۚ") ^ i3) * (-91);
                        i = ((iM3169 ^ i4) * 30947) ^ 1458812783;
                        i2 = -1563172562;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1898119488:
                case -1053597606:
                    RunnableC1848.m6360();
                    iM3169 = (i4 - C0773.m3169("ܶܿ")) * (-83);
                    i = ((iM3169 ^ i3) * (-5571)) ^ (-2127495721);
                    i2 = 384244408;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1795067916:
                case 1476086746:
                    if (C0773.m3161() != 0) {
                        iM3169 = (i4 - C0773.m3169("ܶܿ")) * (-83);
                        i = ((iM3169 ^ i3) * (-5571)) ^ (-2127495721);
                        i2 = 384244408;
                    } else {
                        iM3169 = (C0773.m3169("᩸᩺") + i3) * 81;
                        i = ((iM3169 ^ i4) * (-25073)) ^ 563139641;
                        i2 = 2032452555;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1786197273:
                case 972532057:
                    i13 = 23351;
                    iM3169 = C0619.m2761("ۗۢ") ^ i3;
                    i = ((iM3169 ^ i4) * 30849) ^ (-1850514316);
                    i2 = 191893583;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1768659851:
                case -999588205:
                    if (C2485.m8357() <= 0) {
                        iM3169 = (C0773.m3169("᩸᩺") + i3) * 81;
                        i = ((iM3169 ^ i4) * (-25073)) ^ 563139641;
                        i2 = 2032452555;
                    } else {
                        iM3169 = C0773.m3169("֫ܿ") ^ i3;
                        i = ((iM3169 ^ i4) * 17637) ^ 556745810;
                        i2 = 551661635;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1726037521:
                case 578663818:
                    if (this.f25872.f39450 == 0) {
                        iM3169 = C0619.m2761("ܶܳ") ^ i4;
                        i = ((iM3169 ^ i3) * (-28715)) ^ 585797974;
                        i2 = -260162497;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩺ۖ")) * (-25);
                        i = ((iM3169 ^ i4) * 23445) ^ 1182510589;
                        i2 = -1792052948;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1542974073:
                case -737256805:
                    sArr2 = f25870;
                    i8 = 1;
                    i9 = 3;
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (C0773.m3169("᩸᩺") + i3) * 81;
                        i = ((iM3169 ^ i4) * (-25073)) ^ 563139641;
                        i2 = 2032452555;
                    } else {
                        iM3169 = C0773.m3169("۠᩹") ^ i3;
                        i = ((iM3169 ^ i4) * (-32581)) ^ (-681535816);
                        i2 = 110673156;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1472943744:
                case -274729530:
                    sArr = f25870;
                    if (C0862.m3503()) {
                        iM3169 = C0773.m3169("۠᩺") ^ i3;
                        i = ((iM3169 ^ i4) * (-7005)) ^ (-1856549354);
                        i2 = 493936621;
                    } else {
                        iM3169 = C0619.m2761("۫֡") ^ i4;
                        i = ((iM3169 ^ i3) * 12601) ^ (-1736496381);
                        i2 = 1407543920;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1384145576:
                case 73109839:
                    if (i10 - (i11 + i12) > 0) {
                        iM3169 = C0773.m3169("ܰۢ") ^ i4;
                        i = ((iM3169 ^ i3) * 3393) ^ 907178703;
                        i2 = 1038725463;
                    } else {
                        iM3169 = C0773.m3169("ۢ۬") ^ i4;
                        i = ((iM3169 ^ i3) * 1255) ^ 975234727;
                        i2 = 547975575;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1238745339:
                case -70663786:
                    this.f25875 = c18234;
                    if (this.f25880.f39450 == 0) {
                        iM3169 = C0773.m3169("ۨܽ") ^ i4;
                        i = ((iM3169 ^ i3) * 21849) ^ (-466093053);
                        i2 = 644060515;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩺ۖ")) * (-25);
                        i = ((iM3169 ^ i4) * 23445) ^ 1182510589;
                        i2 = -1792052948;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1176777415:
                case -368104807:
                    break;
                case -1126591089:
                case 1349901488:
                    C0487.m2356();
                    RunnableC3646.m11813();
                    break;
                case -1063536995:
                case -236952597:
                    s2 = sArr[c];
                    s = 18412;
                    if (C2287.f7432 >= 0) {
                        iM3169 = (i4 - C0773.m3169("ܶܿ")) * (-83);
                        i = ((iM3169 ^ i3) * (-5571)) ^ (-2127495721);
                        i2 = 384244408;
                    } else {
                        iM3169 = (i4 - C0619.m2761("᩷ᩴ")) * 35;
                        i = ((iM3169 ^ i3) * (-31135)) ^ (-113862781);
                        i2 = -112942294;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1039228856:
                case 1935800245:
                    c = 0;
                    if (C2485.f7950 != 0) {
                        iM3169 = C0773.m3169("֫ܿ") ^ i3;
                        i = ((iM3169 ^ i4) * 17637) ^ 556745810;
                        i2 = 551661635;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۗܿ")) * (-69);
                        i = ((iM3169 ^ i3) * 32397) ^ 192177489;
                        i2 = 302044503;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -639188318:
                case -252420892:
                    strM6310 = C1826.m6310(sArr2, i8, i9, i13);
                    if (C0487.f2131 <= 0) {
                        iM3169 = (i4 - C0773.m3169("ܶܿ")) * (-83);
                        i = ((iM3169 ^ i3) * (-5571)) ^ (-2127495721);
                        i2 = 384244408;
                    } else {
                        iM3169 = C0773.m3169("ۖ᩻") ^ i4;
                        i = ((iM3169 ^ i3) * (-15861)) ^ (-749931037);
                        i2 = -1906439129;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -195025090:
                case 1062718206:
                    this.f25886 = false;
                    z = true;
                    if (C1146.m4231()) {
                        iM3169 = (C0773.m3169("᩻ۧ") ^ i3) * (-47);
                        i = ((iM3169 ^ i4) * 21443) ^ (-1879483666);
                        i2 = -209224865;
                    } else {
                        iM3169 = (C0773.m3169("᩸᩺") + i3) * 81;
                        i = ((iM3169 ^ i4) * (-25073)) ^ 563139641;
                        i2 = 2032452555;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -6318456:
                case 694108073:
                    if (C3998.f13671 == 0) {
                        iM3169 = (i4 - C0773.m3169("ܶܿ")) * (-83);
                        i = ((iM3169 ^ i3) * (-5571)) ^ (-2127495721);
                        i2 = 384244408;
                    } else {
                        iM3169 = C0619.m2761("۫֡") ^ i4;
                        i = ((iM3169 ^ i3) * 12601) ^ (-1736496381);
                        i2 = 1407543920;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 74061116:
                case 1089052687:
                    m21241(z);
                    m21229();
                    iM3169 = (i3 - C0773.m3169("᩺ۖ")) * (-25);
                    i = ((iM3169 ^ i4) * 23445) ^ 1182510589;
                    i2 = -1792052948;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 275694038:
                case 1988905815:
                    i10 = s2 * s;
                    i11 = s2 * s2;
                    if (C4282.f15546 <= 0) {
                        iM3169 = (i4 - C0773.m3169("ܶܿ")) * (-83);
                        i = ((iM3169 ^ i3) * (-5571)) ^ (-2127495721);
                        i2 = 384244408;
                    } else {
                        iM3169 = C0773.m3169("ۤۡ") ^ i3;
                        i = ((iM3169 ^ i4) * (-20267)) ^ 564421620;
                        i2 = -832724219;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 287567687:
                case 2136159461:
                    i12 = 84750436;
                    if (C1826.f6190 <= 0) {
                        iM3169 = (i4 - C0773.m3169("ܶܿ")) * (-83);
                        i = ((iM3169 ^ i3) * (-5571)) ^ (-2127495721);
                        i2 = 384244408;
                    } else {
                        iM3169 = C0619.m2761("ۙۧ") ^ i3;
                        i = ((iM3169 ^ i4) * 5351) ^ 732845580;
                        i2 = -618276258;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 754668944:
                case 2052279865:
                    C2966.m9668(iM31610 ^ i7);
                    c18234 = null;
                    if (C3033.m9845() <= 0) {
                        iM3169 = C0619.m2761("ۛۨ") ^ i3;
                        i = ((iM3169 ^ i4) * 21361) ^ 1644229608;
                        i2 = 454374849;
                    } else {
                        iM3169 = (C0619.m2761("֫֨") ^ i4) * 93;
                        i = ((iM3169 ^ i3) * (-12129)) ^ (-1360438995);
                        i2 = -919976264;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    i13 = 54737;
                    iM3169 = C0619.m2761("ۗۢ") ^ i3;
                    i = ((iM3169 ^ i4) * 30849) ^ (-1850514316);
                    i2 = 191893583;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01a1 A[PHI: r7 r8 r9 r12 r13
      0x01a1: PHI (r7v3 l.ۧۙ۫) = (r7v2 l.ۧۙ۫), (r7v1 l.ۧۙ۫), (r7v1 l.ۧۙ۫), (r7v1 l.ۧۙ۫), (r7v1 l.ۧۙ۫) binds: [B:47:0x019f, B:39:0x0157, B:31:0x0105, B:19:0x00b3, B:16:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r8v3 l.ۢۢᩴ) = (r8v2 l.ۢۢᩴ), (r8v1 l.ۢۢᩴ), (r8v1 l.ۢۢᩴ), (r8v1 l.ۢۢᩴ), (r8v1 l.ۢۢᩴ) binds: [B:47:0x019f, B:39:0x0157, B:31:0x0105, B:19:0x00b3, B:16:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r9v4 java.lang.String) = 
      (r9v1 java.lang.String)
      (r9v1 java.lang.String)
      (r9v3 java.lang.String)
      (r9v1 java.lang.String)
      (r9v1 java.lang.String)
     binds: [B:47:0x019f, B:39:0x0157, B:31:0x0105, B:19:0x00b3, B:16:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int), (r12v1 int), (r12v1 int) binds: [B:47:0x019f, B:39:0x0157, B:31:0x0105, B:19:0x00b3, B:16:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int), (r13v1 int), (r13v1 int) binds: [B:47:0x019f, B:39:0x0157, B:31:0x0105, B:19:0x00b3, B:16:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x03a5 A[PHI: r6 r10 r17 r19 r25
      0x03a5: PHI (r6v41 l.᩵ۢ֫) = (r6v23 l.᩵ۢ֫), (r6v35 l.᩵ۢ֫), (r6v42 l.᩵ۢ֫) binds: [B:36:0x012c, B:87:0x03a3, B:72:0x02e6] A[DONT_GENERATE, DONT_INLINE]
      0x03a5: PHI (r10v5 java.lang.Runnable) = (r10v2 java.lang.Runnable), (r10v1 java.lang.Runnable), (r10v1 java.lang.Runnable) binds: [B:36:0x012c, B:87:0x03a3, B:72:0x02e6] A[DONT_GENERATE, DONT_INLINE]
      0x03a5: PHI (r17v4 short) = (r17v1 short), (r17v2 short), (r17v1 short) binds: [B:36:0x012c, B:87:0x03a3, B:72:0x02e6] A[DONT_GENERATE, DONT_INLINE]
      0x03a5: PHI (r19v11 short) = (r19v2 short), (r19v5 short), (r19v2 short) binds: [B:36:0x012c, B:87:0x03a3, B:72:0x02e6] A[DONT_GENERATE, DONT_INLINE]
      0x03a5: PHI (r25v33 int) = (r25v17 int), (r25v27 int), (r25v34 int) binds: [B:36:0x012c, B:87:0x03a3, B:72:0x02e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007f, code lost:
    
        if (l.C3690.f12684 > 0) goto L10;
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m21239(l.ViewOnClickListenerC7793 r29) {
        /*
            Method dump skipped, instruction units count: 1252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC7793.m21239(l.۟ۢ֫):void");
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
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m21241(boolean z) {
        String str;
        AnimatorSet animatorSet;
        C12267 c12267;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        char c;
        float[] fArr;
        float[] fArr2;
        int iM2761;
        int i;
        int iM2762;
        int i2;
        int i3;
        int i4;
        String str2;
        AnimatorSet animatorSet2;
        int iM2763;
        int i5;
        String strM8881;
        int i6;
        FloatingActionButton floatingActionButton;
        String str3;
        AnimatorSet animatorSet3;
        C12267 c12268;
        FloatingActionButton floatingActionButton2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        char c2;
        int iM2764;
        float[] fArr3;
        int i7;
        int i8;
        int iM3169;
        int i9;
        int i10;
        FloatingActionButton floatingActionButton3;
        C12267 c12269;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        char c3;
        FloatingActionButton floatingActionButton4;
        float[] fArr4;
        int iM2765;
        int i11;
        int i12;
        String str4;
        float[] fArr5;
        int i13;
        ViewOnClickListenerC7793 viewOnClickListenerC7793 = this;
        int i14 = 0;
        int i15 = 0;
        int i16 = -616134206;
        int i17 = C1146.f4234;
        int i18 = C2419.f7754;
        int iM2766 = C0619.m2761("᩵ۜ") ^ i18;
        int i19 = ((iM2766 ^ i17) * (-17217)) ^ 1856749887;
        int i20 = iM2766 ^ 1675178779;
        String str5 = null;
        ViewGroup.MarginLayoutParams marginLayoutParams4 = null;
        FloatingActionButton floatingActionButton5 = null;
        FloatingActionButton floatingActionButton6 = null;
        String strM1785 = null;
        FloatingActionButton floatingActionButton7 = null;
        short[] sArr = null;
        AnimatorSet duration = null;
        char c4 = 0;
        int i21 = 0;
        char c5 = 0;
        int i22 = 0;
        float f = 0.0f;
        int iM9482 = 0;
        int iM5514 = 0;
        float f2 = 0.0f;
        int iM9483 = 0;
        int i23 = 0;
        int iM9484 = 0;
        int i24 = 0;
        short s = 0;
        float[] fArr6 = null;
        ObjectAnimator objectAnimatorM12917 = null;
        FloatingActionButton floatingActionButton8 = null;
        FloatingActionButton floatingActionButton9 = null;
        float[] fArr7 = null;
        float[] fArr8 = null;
        ObjectAnimator objectAnimatorM6307 = null;
        int i25 = 0;
        float f3 = 0.0f;
        ViewGroup.MarginLayoutParams marginLayoutParams5 = null;
        float[] fArr9 = null;
        ViewGroup.LayoutParams layoutParamsM6240 = null;
        ObjectAnimator objectAnimatorM12918 = null;
        boolean z2 = false;
        int i26 = 0;
        ObjectAnimator objectAnimatorM12919 = null;
        float[] fArr10 = null;
        int i27 = 0;
        float f4 = 0.0f;
        FloatingActionButton floatingActionButton10 = null;
        C12267 c122610 = null;
        ObjectAnimator objectAnimatorM129110 = null;
        ObjectAnimator objectAnimatorM6308 = null;
        ViewGroup.MarginLayoutParams marginLayoutParams6 = null;
        ObjectAnimator objectAnimatorM6309 = null;
        while (true) {
            i16 = i20 ^ (i19 & (((i16 ^ i17) * 29829) >> 31));
            switch (i16) {
                case -2087735980:
                case -205193257:
                    floatingActionButton3 = floatingActionButton5;
                    str4 = str5;
                    duration = duration;
                    c12269 = c122610;
                    marginLayoutParams3 = marginLayoutParams6;
                    c3 = c4;
                    float f5 = iM9484 + i24 + marginLayoutParams3.bottomMargin;
                    int iM2767 = C0619.m2761("ܶܿ") ^ i17;
                    i13 = ((iM2767 ^ i18) * (-30573)) ^ 1507374092;
                    i20 = iM2767 ^ 1106499010;
                    f3 = f5;
                    fArr7 = new float[i22];
                    c4 = c3;
                    marginLayoutParams6 = marginLayoutParams3;
                    c122610 = c12269;
                    floatingActionButton5 = floatingActionButton3;
                    AnimatorSet animatorSet4 = duration;
                    str5 = str4;
                    i19 = i13;
                    duration = animatorSet4;
                    break;
                case -1704200366:
                case 1733976440:
                    animatorSet2 = duration;
                    floatingActionButton5 = floatingActionButton5;
                    c12267 = c122610;
                    marginLayoutParams = marginLayoutParams6;
                    c = c4;
                    float[] fArr11 = fArr9;
                    i21 = i21;
                    marginLayoutParams4 = marginLayoutParams4;
                    floatingActionButton8 = floatingActionButton8;
                    fArr = fArr11;
                    float[] fArr12 = fArr10;
                    floatingActionButton9 = floatingActionButton9;
                    fArr2 = fArr12;
                    fArr6 = fArr6;
                    short[] sArr2 = sArr;
                    strM8881 = C2702.m8881(sArr2, 374, 12, i25);
                    if (C1826.f6190 > 0) {
                        int iM31610 = C0773.m3169("᩶۫") ^ i18;
                        i19 = ((iM31610 ^ i17) * 24349) ^ 1167882249;
                        sArr = sArr2;
                        c4 = c;
                        marginLayoutParams6 = marginLayoutParams;
                        c122610 = c12267;
                        floatingActionButton5 = floatingActionButton5;
                        i20 = iM31610 ^ 2048442782;
                        duration = animatorSet2;
                        str5 = strM8881;
                        fArr6 = fArr6;
                        FloatingActionButton floatingActionButton11 = floatingActionButton8;
                        marginLayoutParams4 = marginLayoutParams4;
                        i21 = i21;
                        fArr9 = fArr;
                        floatingActionButton8 = floatingActionButton11;
                        FloatingActionButton floatingActionButton12 = floatingActionButton9;
                        fArr10 = fArr2;
                        floatingActionButton9 = floatingActionButton12;
                    } else {
                        marginLayoutParams5 = marginLayoutParams5;
                        sArr = sArr2;
                        iM2763 = (i18 - C0773.m3169("ۢ᩹")) * (-39);
                        str2 = strM8881;
                        i19 = ((iM2763 ^ i17) * 16025) ^ (-1407484293);
                        i5 = -834992539;
                        sArr = sArr;
                        marginLayoutParams5 = marginLayoutParams5;
                        duration = animatorSet2;
                        str5 = str2;
                        fArr6 = fArr6;
                        i20 = iM2763 ^ i5;
                        c4 = c;
                        marginLayoutParams6 = marginLayoutParams;
                        c122610 = c12267;
                        floatingActionButton5 = floatingActionButton5;
                        FloatingActionButton floatingActionButton13 = floatingActionButton8;
                        marginLayoutParams4 = marginLayoutParams4;
                        i21 = i21;
                        fArr9 = fArr;
                        floatingActionButton8 = floatingActionButton13;
                        FloatingActionButton floatingActionButton14 = floatingActionButton9;
                        fArr10 = fArr2;
                        floatingActionButton9 = floatingActionButton14;
                    }
                    break;
                case -1492938495:
                case 107762709:
                    objectAnimatorM12918 = C3998.m12917(floatingActionButton6, strM1785, fArr8);
                    float[] fArr13 = new float[i22];
                    // fill-array-data instruction
                    fArr13[0] = 0.8f;
                    fArr13[1] = 0.0f;
                    objectAnimatorM6307 = C1826.m6307(viewOnClickListenerC7793.f25884, strM1785, fArr13);
                    floatingActionButton7 = viewOnClickListenerC7793.f25891;
                    if (RunnableC0334.f1808 > 0) {
                        iM3169 = (C0619.m2761("᩹ۙ") ^ i18) * (-5);
                        i9 = ((iM3169 ^ i17) * 31435) ^ 2002749;
                        i10 = 2069386321;
                        i20 = iM3169 ^ i10;
                        i19 = i9;
                    } else {
                        fArr6 = fArr6;
                        floatingActionButton5 = floatingActionButton5;
                        str5 = str5;
                        duration = duration;
                        c122610 = c122610;
                        marginLayoutParams6 = marginLayoutParams6;
                        c4 = c4;
                        marginLayoutParams5 = marginLayoutParams5;
                        sArr = sArr;
                        float[] fArr14 = fArr9;
                        i21 = i21;
                        marginLayoutParams4 = marginLayoutParams4;
                        floatingActionButton8 = floatingActionButton8;
                        fArr = fArr14;
                        float[] fArr15 = fArr10;
                        floatingActionButton9 = floatingActionButton9;
                        fArr2 = fArr15;
                        iM2761 = (C0619.m2761("᩵ۗ") + i17) * 39;
                        i19 = ((iM2761 ^ i18) * 12081) ^ (-850685446);
                        i = 642822014;
                        i4 = iM2761 ^ i;
                        sArr = sArr;
                        duration = duration;
                        marginLayoutParams5 = marginLayoutParams5;
                        str5 = str5;
                        c4 = c4;
                        fArr6 = fArr6;
                        i20 = i4;
                        marginLayoutParams6 = marginLayoutParams6;
                        c122610 = c122610;
                        viewOnClickListenerC7793 = this;
                        floatingActionButton5 = floatingActionButton5;
                        FloatingActionButton floatingActionButton15 = floatingActionButton8;
                        marginLayoutParams4 = marginLayoutParams4;
                        i21 = i21;
                        fArr9 = fArr;
                        floatingActionButton8 = floatingActionButton15;
                        FloatingActionButton floatingActionButton16 = floatingActionButton9;
                        fArr10 = fArr2;
                        floatingActionButton9 = floatingActionButton16;
                    }
                    break;
                case -1473299354:
                case 787433887:
                    float[] fArr16 = new float[i22];
                    // fill-array-data instruction
                    fArr16[0] = 0.8f;
                    fArr16[1] = 0.0f;
                    objectAnimatorM6308 = C1826.m6307(floatingActionButton7, strM1785, fArr16);
                    float[] fArr17 = new float[i22];
                    // fill-array-data instruction
                    fArr17[0] = 0.8f;
                    fArr17[1] = 0.0f;
                    objectAnimatorM129110 = C3998.m12917(viewOnClickListenerC7793.f25879, strM1785, fArr17);
                    iM3169 = (C0773.m3169("ۖ֡") ^ i17) * (-97);
                    i9 = ((iM3169 ^ i18) * 31101) ^ (-1459705175);
                    i10 = -798857741;
                    i20 = iM3169 ^ i10;
                    i19 = i9;
                    break;
                case -1381978729:
                case 748173690:
                    fArr6 = fArr6;
                    floatingActionButton5 = floatingActionButton5;
                    str2 = str5;
                    animatorSet2 = duration;
                    c12267 = c122610;
                    marginLayoutParams = marginLayoutParams6;
                    c = c4;
                    float[] fArr18 = fArr9;
                    i21 = i21;
                    marginLayoutParams4 = marginLayoutParams4;
                    floatingActionButton8 = floatingActionButton8;
                    fArr = fArr18;
                    float[] fArr19 = fArr10;
                    floatingActionButton9 = floatingActionButton9;
                    fArr2 = fArr19;
                    marginLayoutParams5 = marginLayoutParams5;
                    sArr = sArr;
                    float f6 = iM9482 + i27 + marginLayoutParams5.bottomMargin;
                    if (C3077.f9998) {
                        iM2763 = C0619.m2761("֡֫") ^ i18;
                        f2 = f6;
                        i19 = ((iM2763 ^ i17) * (-25627)) ^ 1750652455;
                        i5 = -1265790376;
                    } else {
                        f2 = f6;
                        strM8881 = str2;
                        iM2763 = (i18 - C0773.m3169("ۢ᩹")) * (-39);
                        str2 = strM8881;
                        i19 = ((iM2763 ^ i17) * 16025) ^ (-1407484293);
                        i5 = -834992539;
                    }
                    sArr = sArr;
                    marginLayoutParams5 = marginLayoutParams5;
                    duration = animatorSet2;
                    str5 = str2;
                    fArr6 = fArr6;
                    i20 = iM2763 ^ i5;
                    c4 = c;
                    marginLayoutParams6 = marginLayoutParams;
                    c122610 = c12267;
                    floatingActionButton5 = floatingActionButton5;
                    FloatingActionButton floatingActionButton17 = floatingActionButton8;
                    marginLayoutParams4 = marginLayoutParams4;
                    i21 = i21;
                    fArr9 = fArr;
                    floatingActionButton8 = floatingActionButton17;
                    FloatingActionButton floatingActionButton18 = floatingActionButton9;
                    fArr10 = fArr2;
                    floatingActionButton9 = floatingActionButton18;
                    break;
                case -1297991299:
                case 1190093977:
                    float[] fArr20 = fArr6;
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = marginLayoutParams4;
                    FloatingActionButton floatingActionButton19 = floatingActionButton8;
                    float[] fArr21 = fArr9;
                    floatingActionButton3 = floatingActionButton5;
                    String str6 = str5;
                    AnimatorSet animatorSet5 = duration;
                    c12269 = c122610;
                    ViewGroup.MarginLayoutParams marginLayoutParams8 = marginLayoutParams5;
                    marginLayoutParams3 = marginLayoutParams6;
                    short[] sArr3 = sArr;
                    c3 = c4;
                    float[] fArr22 = fArr10;
                    floatingActionButton4 = floatingActionButton9;
                    fArr4 = fArr22;
                    c5 = 0;
                    i22 = 2;
                    z2 = true;
                    if (z) {
                        iM2765 = (i18 - C0619.m2761("۫ۚ")) * 27;
                        i11 = ((iM2765 ^ i17) * 13215) ^ (-284875168);
                        i12 = 660649846;
                    } else {
                        iM2765 = C0619.m2761("ۢۘ") ^ i18;
                        i11 = ((iM2765 ^ i17) * (-20881)) ^ 1462884454;
                        i12 = -688613564;
                    }
                    int i28 = iM2765 ^ i12;
                    viewOnClickListenerC7793 = this;
                    sArr = sArr3;
                    fArr9 = fArr21;
                    marginLayoutParams5 = marginLayoutParams8;
                    floatingActionButton8 = floatingActionButton19;
                    duration = animatorSet5;
                    marginLayoutParams4 = marginLayoutParams7;
                    str5 = str6;
                    fArr6 = fArr20;
                    i21 = 4;
                    i20 = i28;
                    i19 = i11;
                    c4 = c3;
                    marginLayoutParams6 = marginLayoutParams3;
                    c122610 = c12269;
                    floatingActionButton5 = floatingActionButton3;
                    FloatingActionButton floatingActionButton20 = floatingActionButton4;
                    fArr10 = fArr4;
                    floatingActionButton9 = floatingActionButton20;
                    break;
                case -1244737028:
                case 1585679096:
                    float[] fArr23 = fArr6;
                    floatingActionButton5 = floatingActionButton5;
                    String str7 = str5;
                    AnimatorSet animatorSet6 = duration;
                    c12267 = c122610;
                    marginLayoutParams = marginLayoutParams6;
                    c = c4;
                    float[] fArr24 = fArr9;
                    i21 = i21;
                    marginLayoutParams4 = marginLayoutParams4;
                    floatingActionButton8 = floatingActionButton8;
                    fArr = fArr24;
                    float[] fArr25 = fArr10;
                    floatingActionButton9 = floatingActionButton9;
                    fArr2 = fArr25;
                    ViewGroup.MarginLayoutParams marginLayoutParams9 = (ViewGroup.MarginLayoutParams) C1783.m6240(viewOnClickListenerC7793.f25877);
                    FloatingActionButton floatingActionButton21 = viewOnClickListenerC7793.f25877;
                    iM9482 = C2878.m9482(floatingActionButton21);
                    int i29 = marginLayoutParams9.topMargin;
                    int iM31611 = (i17 - C0773.m3169("ۜᩴ")) * (-37);
                    floatingActionButton10 = floatingActionButton21;
                    sArr = sArr;
                    duration = animatorSet6;
                    marginLayoutParams5 = marginLayoutParams9;
                    str5 = str7;
                    fArr6 = fArr23;
                    i19 = ((iM31611 ^ i18) * (-25031)) ^ (-1595631255);
                    i20 = iM31611 ^ 1376764244;
                    viewOnClickListenerC7793 = this;
                    i27 = i29;
                    c4 = c;
                    marginLayoutParams6 = marginLayoutParams;
                    c122610 = c12267;
                    floatingActionButton5 = floatingActionButton5;
                    FloatingActionButton floatingActionButton110 = floatingActionButton8;
                    marginLayoutParams4 = marginLayoutParams4;
                    i21 = i21;
                    fArr9 = fArr;
                    floatingActionButton8 = floatingActionButton110;
                    FloatingActionButton floatingActionButton111 = floatingActionButton9;
                    fArr10 = fArr2;
                    floatingActionButton9 = floatingActionButton111;
                    break;
                case -1217281512:
                case -340932202:
                    fArr6 = fArr6;
                    floatingActionButton5 = floatingActionButton5;
                    str5 = str5;
                    duration = duration;
                    c122610 = c122610;
                    marginLayoutParams6 = marginLayoutParams6;
                    c4 = c4;
                    marginLayoutParams5 = marginLayoutParams5;
                    sArr = sArr;
                    float[] fArr26 = fArr9;
                    i21 = i21;
                    marginLayoutParams4 = marginLayoutParams4;
                    floatingActionButton8 = floatingActionButton8;
                    fArr = fArr26;
                    float[] fArr27 = fArr10;
                    floatingActionButton9 = floatingActionButton9;
                    fArr2 = fArr27;
                    s = f25870[373];
                    i14 = s * s;
                    i15 = 318051556;
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0619.m2761("᩵ۗ") + i17) * 39;
                        i19 = ((iM2761 ^ i18) * 12081) ^ (-850685446);
                        i = 642822014;
                    } else {
                        iM2761 = (C0619.m2761("ۖۚ") ^ i18) * 79;
                        i19 = ((iM2761 ^ i17) * (-28423)) ^ 1063129589;
                        i = 1140212191;
                    }
                    i4 = iM2761 ^ i;
                    sArr = sArr;
                    duration = duration;
                    marginLayoutParams5 = marginLayoutParams5;
                    str5 = str5;
                    c4 = c4;
                    fArr6 = fArr6;
                    i20 = i4;
                    marginLayoutParams6 = marginLayoutParams6;
                    c122610 = c122610;
                    viewOnClickListenerC7793 = this;
                    floatingActionButton5 = floatingActionButton5;
                    FloatingActionButton floatingActionButton112 = floatingActionButton8;
                    marginLayoutParams4 = marginLayoutParams4;
                    i21 = i21;
                    fArr9 = fArr;
                    floatingActionButton8 = floatingActionButton112;
                    FloatingActionButton floatingActionButton113 = floatingActionButton9;
                    fArr10 = fArr2;
                    floatingActionButton9 = floatingActionButton113;
                    break;
                case -1138651442:
                case -638546564:
                    c12267 = c122610;
                    marginLayoutParams = marginLayoutParams6;
                    strM8881 = str5;
                    animatorSet2 = duration;
                    c = c4;
                    FloatingActionButton floatingActionButton22 = viewOnClickListenerC7793.f25879;
                    iM9484 = C2878.m9482(floatingActionButton22);
                    int i30 = marginLayoutParams.topMargin;
                    if (C1564.f5401 <= 0) {
                        floatingActionButton5 = floatingActionButton22;
                        i24 = i30;
                        float[] fArr28 = fArr9;
                        i21 = i21;
                        marginLayoutParams4 = marginLayoutParams4;
                        floatingActionButton8 = floatingActionButton8;
                        fArr = fArr28;
                        float[] fArr29 = fArr10;
                        floatingActionButton9 = floatingActionButton9;
                        fArr2 = fArr29;
                        iM2763 = (i18 - C0773.m3169("ۢ᩹")) * (-39);
                        str2 = strM8881;
                        i19 = ((iM2763 ^ i17) * 16025) ^ (-1407484293);
                        i5 = -834992539;
                        sArr = sArr;
                        marginLayoutParams5 = marginLayoutParams5;
                        duration = animatorSet2;
                        str5 = str2;
                        fArr6 = fArr6;
                        i20 = iM2763 ^ i5;
                        c4 = c;
                        marginLayoutParams6 = marginLayoutParams;
                        c122610 = c12267;
                        floatingActionButton5 = floatingActionButton5;
                        FloatingActionButton floatingActionButton114 = floatingActionButton8;
                        marginLayoutParams4 = marginLayoutParams4;
                        i21 = i21;
                        fArr9 = fArr;
                        floatingActionButton8 = floatingActionButton114;
                        FloatingActionButton floatingActionButton115 = floatingActionButton9;
                        fArr10 = fArr2;
                        floatingActionButton9 = floatingActionButton115;
                    } else {
                        int iM2768 = (i18 - C0619.m2761("᩺ܶ")) * 91;
                        i20 = iM2768 ^ 48550958;
                        str5 = strM8881;
                        i19 = ((iM2768 ^ i17) * (-11617)) ^ 1197842699;
                        duration = animatorSet2;
                        i24 = i30;
                        c4 = c;
                        marginLayoutParams6 = marginLayoutParams;
                        c122610 = c12267;
                        floatingActionButton5 = floatingActionButton22;
                    }
                    break;
                case -995368734:
                case 991776046:
                    C3448.m11248();
                    floatingActionButton3 = floatingActionButton5;
                    str4 = str5;
                    c12269 = c122610;
                    marginLayoutParams3 = marginLayoutParams6;
                    c3 = c4;
                    fArr5 = fArr10;
                    floatingActionButton4 = floatingActionButton9;
                    int iM31612 = C0773.m3169("ۡ᩵") ^ i17;
                    fArr4 = fArr5;
                    i11 = ((iM31612 ^ i18) * (-32645)) ^ 1127520068;
                    i20 = iM31612 ^ 1051715397;
                    duration = duration;
                    str5 = str4;
                    i19 = i11;
                    c4 = c3;
                    marginLayoutParams6 = marginLayoutParams3;
                    c122610 = c12269;
                    floatingActionButton5 = floatingActionButton3;
                    FloatingActionButton floatingActionButton23 = floatingActionButton4;
                    fArr10 = fArr4;
                    floatingActionButton9 = floatingActionButton23;
                    break;
                case -819203754:
                case -242586359:
                    fArr7[c5] = f;
                    fArr7[z2 ? 1 : 0] = f3;
                    floatingActionButton3 = floatingActionButton5;
                    str4 = str5;
                    c12269 = c122610;
                    ObjectAnimator objectAnimatorM63010 = C1826.m6307(floatingActionButton3, str4, fArr7);
                    if (C2287.m7745() > 0) {
                        duration.setInterpolator(new AccelerateInterpolator());
                        Animator[] animatorArr = new Animator[i21];
                        animatorArr[c5] = objectAnimatorM12917;
                        animatorArr[z2 ? 1 : 0] = objectAnimatorM12919;
                        animatorArr[i22] = objectAnimatorM6309;
                        animatorArr[c4] = objectAnimatorM63010;
                        duration.playTogether(animatorArr);
                        int iM2769 = (C0619.m2761("ܳ֫") ^ i18) * 33;
                        duration = duration;
                        i13 = ((iM2769 ^ i17) * (-3569)) ^ (-686476803);
                        i20 = iM2769 ^ 2026200001;
                        c122610 = c12269;
                        floatingActionButton5 = floatingActionButton3;
                        AnimatorSet animatorSet7 = duration;
                        str5 = str4;
                        i19 = i13;
                        duration = animatorSet7;
                    } else {
                        marginLayoutParams3 = marginLayoutParams6;
                        c3 = c4;
                        fArr5 = fArr10;
                        floatingActionButton4 = floatingActionButton9;
                        int iM31613 = C0773.m3169("ۡ᩵") ^ i17;
                        fArr4 = fArr5;
                        i11 = ((iM31613 ^ i18) * (-32645)) ^ 1127520068;
                        i20 = iM31613 ^ 1051715397;
                        duration = duration;
                        str5 = str4;
                        i19 = i11;
                        c4 = c3;
                        marginLayoutParams6 = marginLayoutParams3;
                        c122610 = c12269;
                        floatingActionButton5 = floatingActionButton3;
                        FloatingActionButton floatingActionButton24 = floatingActionButton4;
                        fArr10 = fArr4;
                        floatingActionButton9 = floatingActionButton24;
                    }
                    break;
                case -755025334:
                case 552354603:
                    floatingActionButton5 = floatingActionButton5;
                    str = str5;
                    animatorSet = duration;
                    c12267 = c122610;
                    FloatingActionButton floatingActionButton25 = floatingActionButton8;
                    fArr = fArr9;
                    marginLayoutParams = marginLayoutParams6;
                    c = c4;
                    i21 = i21;
                    float[] fArr30 = fArr10;
                    floatingActionButton9 = floatingActionButton9;
                    fArr2 = fArr30;
                    marginLayoutParams4 = marginLayoutParams4;
                    floatingActionButton8 = floatingActionButton25;
                    iM5514 = C1564.m5514(floatingActionButton25) + marginLayoutParams4.topMargin;
                    int i31 = marginLayoutParams4.bottomMargin;
                    if (C2310.f7472 < 0) {
                        int iM31614 = C0773.m3169("۠᩷") ^ i18;
                        i26 = i31;
                        int i32 = ((iM31614 ^ i17) * (-139)) ^ (-1361901913);
                        i20 = iM31614 ^ (-2112268077);
                        c4 = c;
                        marginLayoutParams6 = marginLayoutParams;
                        c122610 = c12267;
                        floatingActionButton5 = floatingActionButton5;
                        str5 = str;
                        i19 = i32;
                        duration = animatorSet;
                        FloatingActionButton floatingActionButton116 = floatingActionButton8;
                        marginLayoutParams4 = marginLayoutParams4;
                        i21 = i21;
                        fArr9 = fArr;
                        floatingActionButton8 = floatingActionButton116;
                        FloatingActionButton floatingActionButton117 = floatingActionButton9;
                        fArr10 = fArr2;
                        floatingActionButton9 = floatingActionButton117;
                    } else {
                        i26 = i31;
                        int iM31615 = C0773.m3169("۬᩸") ^ i18;
                        i6 = ((iM31615 ^ i17) * (-10305)) ^ 1605614625;
                        i20 = iM31615 ^ 1732692377;
                        duration = animatorSet;
                        str5 = str;
                        i19 = i6;
                        c4 = c;
                        marginLayoutParams6 = marginLayoutParams;
                        c122610 = c12267;
                        floatingActionButton5 = floatingActionButton5;
                        FloatingActionButton floatingActionButton118 = floatingActionButton8;
                        marginLayoutParams4 = marginLayoutParams4;
                        i21 = i21;
                        fArr9 = fArr;
                        floatingActionButton8 = floatingActionButton118;
                        FloatingActionButton floatingActionButton119 = floatingActionButton9;
                        fArr10 = fArr2;
                        floatingActionButton9 = floatingActionButton119;
                    }
                    break;
                case -742723326:
                case 622307998:
                    floatingActionButton4 = floatingActionButton9;
                    floatingActionButton3 = floatingActionButton5;
                    str4 = str5;
                    duration = duration;
                    c12269 = c122610;
                    marginLayoutParams3 = marginLayoutParams6;
                    c3 = c4;
                    float f7 = iM9483 + i23;
                    fArr5 = new float[i22];
                    fArr5[c5] = f;
                    if (C2485.f7950 == 0) {
                        int iM27610 = (i18 - C0619.m2761("۬֨")) * (-33);
                        i13 = ((iM27610 ^ i17) * (-20559)) ^ (-670747243);
                        i20 = iM27610 ^ 532996970;
                        f4 = f7;
                        floatingActionButton9 = floatingActionButton4;
                        fArr10 = fArr5;
                        c4 = c3;
                        marginLayoutParams6 = marginLayoutParams3;
                        c122610 = c12269;
                        floatingActionButton5 = floatingActionButton3;
                        AnimatorSet animatorSet8 = duration;
                        str5 = str4;
                        i19 = i13;
                        duration = animatorSet8;
                    } else {
                        f4 = f7;
                        int iM31616 = C0773.m3169("ۡ᩵") ^ i17;
                        fArr4 = fArr5;
                        i11 = ((iM31616 ^ i18) * (-32645)) ^ 1127520068;
                        i20 = iM31616 ^ 1051715397;
                        duration = duration;
                        str5 = str4;
                        i19 = i11;
                        c4 = c3;
                        marginLayoutParams6 = marginLayoutParams3;
                        c122610 = c12269;
                        floatingActionButton5 = floatingActionButton3;
                        FloatingActionButton floatingActionButton26 = floatingActionButton4;
                        fArr10 = fArr4;
                        floatingActionButton9 = floatingActionButton26;
                    }
                    break;
                case -656005635:
                case 2003342232:
                    c3 = c4;
                    floatingActionButton3 = floatingActionButton5;
                    str4 = str5;
                    duration = duration;
                    c12269 = c122610;
                    fArr10[z2 ? 1 : 0] = f4;
                    FloatingActionButton floatingActionButton27 = floatingActionButton9;
                    fArr5 = fArr10;
                    objectAnimatorM6309 = C1826.m6307(floatingActionButton27, str4, fArr5);
                    marginLayoutParams3 = (ViewGroup.MarginLayoutParams) C1783.m6240(viewOnClickListenerC7793.f25879);
                    int iM31617 = (C0773.m3169("᩸᩹") ^ i17) * (-75);
                    floatingActionButton4 = floatingActionButton27;
                    i13 = ((iM31617 ^ i18) * 29845) ^ 1155366923;
                    i20 = iM31617 ^ (-266564911);
                    floatingActionButton9 = floatingActionButton4;
                    fArr10 = fArr5;
                    c4 = c3;
                    marginLayoutParams6 = marginLayoutParams3;
                    c122610 = c12269;
                    floatingActionButton5 = floatingActionButton3;
                    AnimatorSet animatorSet9 = duration;
                    str5 = str4;
                    i19 = i13;
                    duration = animatorSet9;
                    break;
                case -640406475:
                case 1023076344:
                    floatingActionButton5 = floatingActionButton5;
                    String str8 = str5;
                    AnimatorSet animatorSet10 = duration;
                    c12267 = c122610;
                    marginLayoutParams = marginLayoutParams6;
                    c = c4;
                    float[] fArr31 = fArr9;
                    i21 = i21;
                    marginLayoutParams4 = marginLayoutParams4;
                    floatingActionButton8 = floatingActionButton8;
                    fArr = fArr31;
                    float[] fArr32 = fArr10;
                    floatingActionButton9 = floatingActionButton9;
                    fArr2 = fArr32;
                    float[] fArr33 = new float[i22];
                    f = 0.0f;
                    fArr33[c5] = 0.0f;
                    fArr33[z2 ? 1 : 0] = f2;
                    sArr = f25870;
                    int iM31618 = (C0773.m3169("ܽᩴ") ^ i17) * 65;
                    i6 = ((iM31618 ^ i18) * (-29839)) ^ (-16773115);
                    i20 = iM31618 ^ 1418276167;
                    duration = animatorSet10;
                    str5 = str8;
                    fArr6 = fArr33;
                    i19 = i6;
                    c4 = c;
                    marginLayoutParams6 = marginLayoutParams;
                    c122610 = c12267;
                    floatingActionButton5 = floatingActionButton5;
                    FloatingActionButton floatingActionButton1110 = floatingActionButton8;
                    marginLayoutParams4 = marginLayoutParams4;
                    i21 = i21;
                    fArr9 = fArr;
                    floatingActionButton8 = floatingActionButton1110;
                    FloatingActionButton floatingActionButton1111 = floatingActionButton9;
                    fArr10 = fArr2;
                    floatingActionButton9 = floatingActionButton1111;
                    break;
                case -564293823:
                case -227787999:
                    float[] fArr34 = fArr9;
                    FloatingActionButton floatingActionButton28 = floatingActionButton5;
                    String str9 = str5;
                    AnimatorSet animatorSet11 = duration;
                    int i33 = i21;
                    C12267 c122611 = c122610;
                    FloatingActionButton floatingActionButton29 = floatingActionButton10;
                    ViewGroup.MarginLayoutParams marginLayoutParams10 = marginLayoutParams6;
                    char c6 = c4;
                    float[] fArr35 = fArr6;
                    float[] fArr36 = fArr10;
                    floatingActionButton9 = floatingActionButton9;
                    fArr2 = fArr36;
                    objectAnimatorM12917 = C3998.m12917(floatingActionButton29, str9, fArr35);
                    marginLayoutParams4 = (ViewGroup.MarginLayoutParams) C3779.m12257(viewOnClickListenerC7793.f25884);
                    FloatingActionButton floatingActionButton30 = viewOnClickListenerC7793.f25884;
                    int iM27611 = (C0619.m2761("᩻֨") + i17) * (-15);
                    i19 = ((iM27611 ^ i18) * (-16663)) ^ (-403874180);
                    i20 = iM27611 ^ 2051814869;
                    floatingActionButton10 = floatingActionButton29;
                    duration = animatorSet11;
                    str5 = str9;
                    fArr6 = fArr35;
                    c4 = c6;
                    marginLayoutParams6 = marginLayoutParams10;
                    c122610 = c122611;
                    floatingActionButton5 = floatingActionButton28;
                    floatingActionButton8 = floatingActionButton30;
                    i21 = i33;
                    fArr9 = fArr34;
                    FloatingActionButton floatingActionButton1112 = floatingActionButton9;
                    fArr10 = fArr2;
                    floatingActionButton9 = floatingActionButton1112;
                    break;
                case -476784642:
                case 576273104:
                    c122610.f39447.setEnabled(z2);
                    viewOnClickListenerC7793.f25872.f39447.setEnabled(z2);
                    break;
                case -414475427:
                case 95368221:
                    fArr = fArr9;
                    fArr2 = fArr10;
                    i25 = 57185;
                    iM2761 = C0619.m2761("ۚ᩻") ^ i17;
                    i19 = ((iM2761 ^ i18) * (-19867)) ^ 1873742600;
                    i = -1810009325;
                    i4 = iM2761 ^ i;
                    sArr = sArr;
                    duration = duration;
                    marginLayoutParams5 = marginLayoutParams5;
                    str5 = str5;
                    c4 = c4;
                    fArr6 = fArr6;
                    i20 = i4;
                    marginLayoutParams6 = marginLayoutParams6;
                    c122610 = c122610;
                    viewOnClickListenerC7793 = this;
                    floatingActionButton5 = floatingActionButton5;
                    FloatingActionButton floatingActionButton1113 = floatingActionButton8;
                    marginLayoutParams4 = marginLayoutParams4;
                    i21 = i21;
                    fArr9 = fArr;
                    floatingActionButton8 = floatingActionButton1113;
                    FloatingActionButton floatingActionButton1114 = floatingActionButton9;
                    fArr10 = fArr2;
                    floatingActionButton9 = floatingActionButton1114;
                    break;
                case -281937633:
                case 865277250:
                    C17202.m40372();
                    if (!C1343.m4943()) {
                        fArr6 = fArr6;
                        floatingActionButton5 = floatingActionButton5;
                        str5 = str5;
                        duration = duration;
                        c122610 = c122610;
                        marginLayoutParams6 = marginLayoutParams6;
                        c4 = c4;
                        marginLayoutParams5 = marginLayoutParams5;
                        sArr = sArr;
                        float[] fArr110 = fArr9;
                        i21 = i21;
                        marginLayoutParams4 = marginLayoutParams4;
                        floatingActionButton8 = floatingActionButton8;
                        fArr = fArr110;
                        float[] fArr111 = fArr10;
                        floatingActionButton9 = floatingActionButton9;
                        fArr2 = fArr111;
                        iM2761 = (C0619.m2761("᩵ۗ") + i17) * 39;
                        i19 = ((iM2761 ^ i18) * 12081) ^ (-850685446);
                        i = 642822014;
                        i4 = iM2761 ^ i;
                        sArr = sArr;
                        duration = duration;
                        marginLayoutParams5 = marginLayoutParams5;
                        str5 = str5;
                        c4 = c4;
                        fArr6 = fArr6;
                        i20 = i4;
                        marginLayoutParams6 = marginLayoutParams6;
                        c122610 = c122610;
                        viewOnClickListenerC7793 = this;
                        floatingActionButton5 = floatingActionButton5;
                        FloatingActionButton floatingActionButton1115 = floatingActionButton8;
                        marginLayoutParams4 = marginLayoutParams4;
                        i21 = i21;
                        fArr9 = fArr;
                        floatingActionButton8 = floatingActionButton1115;
                        FloatingActionButton floatingActionButton1116 = floatingActionButton9;
                        fArr10 = fArr2;
                        floatingActionButton9 = floatingActionButton1116;
                    } else {
                        floatingActionButton3 = floatingActionButton5;
                        str4 = str5;
                        c12269 = c122610;
                        marginLayoutParams3 = marginLayoutParams6;
                        c3 = c4;
                        fArr5 = fArr10;
                        floatingActionButton4 = floatingActionButton9;
                        int iM31619 = C0773.m3169("ۡ᩵") ^ i17;
                        fArr4 = fArr5;
                        i11 = ((iM31619 ^ i18) * (-32645)) ^ 1127520068;
                        i20 = iM31619 ^ 1051715397;
                        duration = duration;
                        str5 = str4;
                        i19 = i11;
                        c4 = c3;
                        marginLayoutParams6 = marginLayoutParams3;
                        c122610 = c12269;
                        floatingActionButton5 = floatingActionButton3;
                        FloatingActionButton floatingActionButton210 = floatingActionButton4;
                        fArr10 = fArr4;
                        floatingActionButton9 = floatingActionButton210;
                    }
                    break;
                case -274820013:
                case 1603994334:
                    duration.addListener(new C9546(viewOnClickListenerC7793));
                    duration.start();
                    c122610 = viewOnClickListenerC7793.f25880;
                    iM3169 = (C0773.m3169("ۗ۟") ^ i18) * 123;
                    i9 = ((iM3169 ^ i17) * 6105) ^ (-2147020838);
                    i10 = 1924071400;
                    i20 = iM3169 ^ i10;
                    i19 = i9;
                    break;
                case -242106140:
                case 6045668:
                    Animator[] animatorArr2 = new Animator[i21];
                    animatorArr2[c5] = objectAnimatorM12918;
                    animatorArr2[z2 ? 1 : 0] = objectAnimatorM6307;
                    animatorArr2[i22] = objectAnimatorM6308;
                    animatorArr2[c4] = objectAnimatorM129110;
                    duration.playTogether(animatorArr2);
                    floatingActionButton3 = floatingActionButton5;
                    str4 = str5;
                    c12269 = c122610;
                    int iM27612 = (C0619.m2761("ܳ֫") ^ i18) * 33;
                    duration = duration;
                    i13 = ((iM27612 ^ i17) * (-3569)) ^ (-686476803);
                    i20 = iM27612 ^ 2026200001;
                    c122610 = c12269;
                    floatingActionButton5 = floatingActionButton3;
                    AnimatorSet animatorSet12 = duration;
                    str5 = str4;
                    i19 = i13;
                    duration = animatorSet12;
                    break;
                case -127426719:
                case 768912900:
                    floatingActionButton = floatingActionButton5;
                    str3 = str5;
                    animatorSet3 = duration;
                    c12268 = c122610;
                    floatingActionButton2 = floatingActionButton8;
                    marginLayoutParams2 = marginLayoutParams6;
                    c2 = c4;
                    float[] fArr37 = fArr9;
                    float[] fArr38 = fArr10;
                    floatingActionButton9 = floatingActionButton9;
                    fArr2 = fArr38;
                    objectAnimatorM12919 = C3998.m12917(floatingActionButton2, str3, fArr37);
                    fArr3 = fArr37;
                    layoutParamsM6240 = C1783.m6240(viewOnClickListenerC7793.f25891);
                    if (C11235.f35427 >= 0) {
                        iM2764 = (i17 - C0619.m2761("֨֨")) * (-109);
                        i7 = ((iM2764 ^ i18) * (-25373)) ^ (-1230383120);
                        i8 = -647207144;
                    } else {
                        iM2764 = (C0619.m2761("᩶۬") + i18) * (-55);
                        i7 = ((iM2764 ^ i17) * (-13953)) ^ (-1681717142);
                        i8 = -1861373181;
                    }
                    i20 = iM2764 ^ i8;
                    c4 = c2;
                    marginLayoutParams6 = marginLayoutParams2;
                    c122610 = c12268;
                    floatingActionButton5 = floatingActionButton;
                    AnimatorSet animatorSet13 = animatorSet3;
                    str5 = str3;
                    i19 = i7;
                    i21 = i21;
                    fArr9 = fArr3;
                    floatingActionButton8 = floatingActionButton2;
                    duration = animatorSet13;
                    FloatingActionButton floatingActionButton1117 = floatingActionButton9;
                    fArr10 = fArr2;
                    floatingActionButton9 = floatingActionButton1117;
                    break;
                case -101658729:
                case 1016988099:
                    FloatingActionButton floatingActionButton31 = floatingActionButton5;
                    String str10 = str5;
                    AnimatorSet animatorSet14 = duration;
                    C12267 c122612 = c122610;
                    ViewGroup.MarginLayoutParams marginLayoutParams11 = marginLayoutParams6;
                    char c7 = c4;
                    ViewGroup.MarginLayoutParams marginLayoutParams12 = (ViewGroup.MarginLayoutParams) layoutParamsM6240;
                    FloatingActionButton floatingActionButton32 = viewOnClickListenerC7793.f25891;
                    iM9483 = C2878.m9482(floatingActionButton32) + marginLayoutParams12.topMargin;
                    int i34 = marginLayoutParams12.bottomMargin;
                    int iM31620 = C0773.m3169("۟ܳ") ^ i17;
                    int i35 = ((iM31620 ^ i18) * (-18633)) ^ 252881656;
                    i20 = iM31620 ^ 1673753396;
                    c4 = c7;
                    marginLayoutParams6 = marginLayoutParams11;
                    c122610 = c122612;
                    floatingActionButton5 = floatingActionButton31;
                    str5 = str10;
                    i19 = i35;
                    duration = animatorSet14;
                    floatingActionButton9 = floatingActionButton32;
                    i23 = i34;
                    fArr10 = fArr10;
                    break;
                case -69399586:
                case 632922676:
                    C1343.m4943();
                    if (C1826.f6190 > 0) {
                        floatingActionButton5 = floatingActionButton5;
                        str = str5;
                        animatorSet = duration;
                        c12267 = c122610;
                        marginLayoutParams = marginLayoutParams6;
                        c = c4;
                        float[] fArr39 = fArr9;
                        i21 = i21;
                        marginLayoutParams4 = marginLayoutParams4;
                        floatingActionButton8 = floatingActionButton8;
                        fArr = fArr39;
                        float[] fArr40 = fArr10;
                        floatingActionButton9 = floatingActionButton9;
                        fArr2 = fArr40;
                        int iM316110 = C0773.m3169("۬᩸") ^ i18;
                        i6 = ((iM316110 ^ i17) * (-10305)) ^ 1605614625;
                        i20 = iM316110 ^ 1732692377;
                        duration = animatorSet;
                        str5 = str;
                        i19 = i6;
                        c4 = c;
                        marginLayoutParams6 = marginLayoutParams;
                        c122610 = c12267;
                        floatingActionButton5 = floatingActionButton5;
                        FloatingActionButton floatingActionButton1118 = floatingActionButton8;
                        marginLayoutParams4 = marginLayoutParams4;
                        i21 = i21;
                        fArr9 = fArr;
                        floatingActionButton8 = floatingActionButton1118;
                        FloatingActionButton floatingActionButton1119 = floatingActionButton9;
                        fArr10 = fArr2;
                        floatingActionButton9 = floatingActionButton1119;
                    } else {
                        floatingActionButton3 = floatingActionButton5;
                        str4 = str5;
                        c12269 = c122610;
                        marginLayoutParams3 = marginLayoutParams6;
                        c3 = c4;
                        fArr5 = fArr10;
                        floatingActionButton4 = floatingActionButton9;
                        int iM316111 = C0773.m3169("ۡ᩵") ^ i17;
                        fArr4 = fArr5;
                        i11 = ((iM316111 ^ i18) * (-32645)) ^ 1127520068;
                        i20 = iM316111 ^ 1051715397;
                        duration = duration;
                        str5 = str4;
                        i19 = i11;
                        c4 = c3;
                        marginLayoutParams6 = marginLayoutParams3;
                        c122610 = c12269;
                        floatingActionButton5 = floatingActionButton3;
                        FloatingActionButton floatingActionButton211 = floatingActionButton4;
                        fArr10 = fArr4;
                        floatingActionButton9 = floatingActionButton211;
                    }
                    break;
                case -51443563:
                case 610583536:
                    float[] fArr41 = fArr9;
                    i21 = i21;
                    marginLayoutParams4 = marginLayoutParams4;
                    floatingActionButton8 = floatingActionButton8;
                    fArr = fArr41;
                    float[] fArr42 = fArr10;
                    floatingActionButton9 = floatingActionButton9;
                    fArr2 = fArr42;
                    duration = new AnimatorSet().setDuration(200L);
                    int iM31621 = C0773.m3169("ۡ۠") ^ i17;
                    marginLayoutParams6 = marginLayoutParams6;
                    sArr = sArr;
                    str5 = str5;
                    c122610 = c122610;
                    fArr6 = fArr6;
                    i20 = iM31621 ^ (-157882748);
                    marginLayoutParams5 = marginLayoutParams5;
                    floatingActionButton5 = floatingActionButton5;
                    c4 = 3;
                    i19 = ((iM31621 ^ i18) * (-29861)) ^ (-1671209399);
                    viewOnClickListenerC7793 = this;
                    FloatingActionButton floatingActionButton11110 = floatingActionButton8;
                    marginLayoutParams4 = marginLayoutParams4;
                    i21 = i21;
                    fArr9 = fArr;
                    floatingActionButton8 = floatingActionButton11110;
                    FloatingActionButton floatingActionButton11111 = floatingActionButton9;
                    fArr10 = fArr2;
                    floatingActionButton9 = floatingActionButton11111;
                    break;
                case 97283390:
                case 1555026762:
                    C13473.m33144();
                    if (C2834.f9334 <= 0) {
                        floatingActionButton5 = floatingActionButton5;
                        strM8881 = str5;
                        animatorSet2 = duration;
                        c12267 = c122610;
                        marginLayoutParams = marginLayoutParams6;
                        c = c4;
                        float[] fArr210 = fArr9;
                        i21 = i21;
                        marginLayoutParams4 = marginLayoutParams4;
                        floatingActionButton8 = floatingActionButton8;
                        fArr = fArr210;
                        float[] fArr211 = fArr10;
                        floatingActionButton9 = floatingActionButton9;
                        fArr2 = fArr211;
                        iM2763 = (i18 - C0773.m3169("ۢ᩹")) * (-39);
                        str2 = strM8881;
                        i19 = ((iM2763 ^ i17) * 16025) ^ (-1407484293);
                        i5 = -834992539;
                        sArr = sArr;
                        marginLayoutParams5 = marginLayoutParams5;
                        duration = animatorSet2;
                        str5 = str2;
                        fArr6 = fArr6;
                        i20 = iM2763 ^ i5;
                        c4 = c;
                        marginLayoutParams6 = marginLayoutParams;
                        c122610 = c12267;
                        floatingActionButton5 = floatingActionButton5;
                        FloatingActionButton floatingActionButton11112 = floatingActionButton8;
                        marginLayoutParams4 = marginLayoutParams4;
                        i21 = i21;
                        fArr9 = fArr;
                        floatingActionButton8 = floatingActionButton11112;
                        FloatingActionButton floatingActionButton11113 = floatingActionButton9;
                        fArr10 = fArr2;
                        floatingActionButton9 = floatingActionButton11113;
                    }
                    fArr6 = fArr6;
                    floatingActionButton5 = floatingActionButton5;
                    str5 = str5;
                    duration = duration;
                    c122610 = c122610;
                    marginLayoutParams6 = marginLayoutParams6;
                    c4 = c4;
                    marginLayoutParams5 = marginLayoutParams5;
                    sArr = sArr;
                    float[] fArr112 = fArr9;
                    i21 = i21;
                    marginLayoutParams4 = marginLayoutParams4;
                    floatingActionButton8 = floatingActionButton8;
                    fArr = fArr112;
                    float[] fArr113 = fArr10;
                    floatingActionButton9 = floatingActionButton9;
                    fArr2 = fArr113;
                    iM2761 = (C0619.m2761("᩵ۗ") + i17) * 39;
                    i19 = ((iM2761 ^ i18) * 12081) ^ (-850685446);
                    i = 642822014;
                    i4 = iM2761 ^ i;
                    sArr = sArr;
                    duration = duration;
                    marginLayoutParams5 = marginLayoutParams5;
                    str5 = str5;
                    c4 = c4;
                    fArr6 = fArr6;
                    i20 = i4;
                    marginLayoutParams6 = marginLayoutParams6;
                    c122610 = c122610;
                    viewOnClickListenerC7793 = this;
                    floatingActionButton5 = floatingActionButton5;
                    FloatingActionButton floatingActionButton11114 = floatingActionButton8;
                    marginLayoutParams4 = marginLayoutParams4;
                    i21 = i21;
                    fArr9 = fArr;
                    floatingActionButton8 = floatingActionButton11114;
                    FloatingActionButton floatingActionButton11115 = floatingActionButton9;
                    fArr10 = fArr2;
                    floatingActionButton9 = floatingActionButton11115;
                    break;
                case 146511784:
                case 1597451469:
                    fArr6 = fArr6;
                    floatingActionButton5 = floatingActionButton5;
                    str5 = str5;
                    duration = duration;
                    c122610 = c122610;
                    marginLayoutParams6 = marginLayoutParams6;
                    c4 = c4;
                    marginLayoutParams5 = marginLayoutParams5;
                    sArr = sArr;
                    float[] fArr43 = fArr9;
                    i21 = i21;
                    marginLayoutParams4 = marginLayoutParams4;
                    floatingActionButton8 = floatingActionButton8;
                    fArr = fArr43;
                    float[] fArr44 = fArr10;
                    floatingActionButton9 = floatingActionButton9;
                    fArr2 = fArr44;
                    int i36 = i14 + i15;
                    short s2 = s;
                    int i37 = s2 + 17834;
                    if ((i36 + i36) - (i37 * i37) >= 0) {
                        iM2762 = (C0773.m3169("ۢۗ") ^ i17) * (-53);
                        i2 = ((iM2762 ^ i18) * 8349) ^ 1339875568;
                        i3 = 1638074047;
                    } else {
                        iM2762 = (i18 - C0619.m2761("ᩴ᩻")) * 47;
                        i2 = ((iM2762 ^ i17) * 7833) ^ 965709111;
                        i3 = -366311728;
                    }
                    i4 = iM2762 ^ i3;
                    s = s2;
                    i19 = i2;
                    sArr = sArr;
                    duration = duration;
                    marginLayoutParams5 = marginLayoutParams5;
                    str5 = str5;
                    c4 = c4;
                    fArr6 = fArr6;
                    i20 = i4;
                    marginLayoutParams6 = marginLayoutParams6;
                    c122610 = c122610;
                    viewOnClickListenerC7793 = this;
                    floatingActionButton5 = floatingActionButton5;
                    FloatingActionButton floatingActionButton11116 = floatingActionButton8;
                    marginLayoutParams4 = marginLayoutParams4;
                    i21 = i21;
                    fArr9 = fArr;
                    floatingActionButton8 = floatingActionButton11116;
                    FloatingActionButton floatingActionButton11117 = floatingActionButton9;
                    fArr10 = fArr2;
                    floatingActionButton9 = floatingActionButton11117;
                    break;
                case 175011534:
                case 882143042:
                    floatingActionButton = floatingActionButton5;
                    str3 = str5;
                    animatorSet3 = duration;
                    c12268 = c122610;
                    floatingActionButton2 = floatingActionButton8;
                    marginLayoutParams2 = marginLayoutParams6;
                    c2 = c4;
                    float[] fArr45 = fArr10;
                    floatingActionButton9 = floatingActionButton9;
                    fArr2 = fArr45;
                    float[] fArr46 = new float[i22];
                    fArr46[c5] = f;
                    fArr46[z2 ? 1 : 0] = iM5514 + i26;
                    iM2764 = (C0619.m2761("ᩳ᩵") ^ i17) * (-111);
                    fArr3 = fArr46;
                    i7 = ((iM2764 ^ i18) * (-15067)) ^ 148432823;
                    i8 = 1455835236;
                    i20 = iM2764 ^ i8;
                    c4 = c2;
                    marginLayoutParams6 = marginLayoutParams2;
                    c122610 = c12268;
                    floatingActionButton5 = floatingActionButton;
                    AnimatorSet animatorSet15 = animatorSet3;
                    str5 = str3;
                    i19 = i7;
                    i21 = i21;
                    fArr9 = fArr3;
                    floatingActionButton8 = floatingActionButton2;
                    duration = animatorSet15;
                    FloatingActionButton floatingActionButton11118 = floatingActionButton9;
                    fArr10 = fArr2;
                    floatingActionButton9 = floatingActionButton11118;
                    break;
                case 393940002:
                case 1939177929:
                    fArr = fArr9;
                    fArr2 = fArr10;
                    i25 = 43670;
                    iM2761 = C0619.m2761("ۚ᩻") ^ i17;
                    i19 = ((iM2761 ^ i18) * (-19867)) ^ 1873742600;
                    i = -1810009325;
                    i4 = iM2761 ^ i;
                    sArr = sArr;
                    duration = duration;
                    marginLayoutParams5 = marginLayoutParams5;
                    str5 = str5;
                    c4 = c4;
                    fArr6 = fArr6;
                    i20 = i4;
                    marginLayoutParams6 = marginLayoutParams6;
                    c122610 = c122610;
                    viewOnClickListenerC7793 = this;
                    floatingActionButton5 = floatingActionButton5;
                    FloatingActionButton floatingActionButton11119 = floatingActionButton8;
                    marginLayoutParams4 = marginLayoutParams4;
                    i21 = i21;
                    fArr9 = fArr;
                    floatingActionButton8 = floatingActionButton11119;
                    FloatingActionButton floatingActionButton111110 = floatingActionButton9;
                    fArr10 = fArr2;
                    floatingActionButton9 = floatingActionButton111110;
                    break;
                case 396597898:
                case 1139451215:
                    floatingActionButton6 = viewOnClickListenerC7793.f25877;
                    fArr8 = new float[i22];
                    // fill-array-data instruction
                    fArr8[0] = 0.8f;
                    fArr8[1] = 0.0f;
                    strM1785 = C0269.m1785(f25870, 386, 5, i25);
                    if (C0950.f3488 < 0) {
                        iM3169 = (C0773.m3169("ۙᩴ") + i17) * 21;
                        i9 = ((iM3169 ^ i18) * (-13693)) ^ (-1857383243);
                        i10 = -586425728;
                        i20 = iM3169 ^ i10;
                        i19 = i9;
                    } else {
                        fArr6 = fArr6;
                        floatingActionButton5 = floatingActionButton5;
                        str5 = str5;
                        duration = duration;
                        c122610 = c122610;
                        marginLayoutParams6 = marginLayoutParams6;
                        c4 = c4;
                        marginLayoutParams5 = marginLayoutParams5;
                        sArr = sArr;
                        float[] fArr114 = fArr9;
                        i21 = i21;
                        marginLayoutParams4 = marginLayoutParams4;
                        floatingActionButton8 = floatingActionButton8;
                        fArr = fArr114;
                        float[] fArr115 = fArr10;
                        floatingActionButton9 = floatingActionButton9;
                        fArr2 = fArr115;
                        iM2761 = (C0619.m2761("᩵ۗ") + i17) * 39;
                        i19 = ((iM2761 ^ i18) * 12081) ^ (-850685446);
                        i = 642822014;
                        i4 = iM2761 ^ i;
                        sArr = sArr;
                        duration = duration;
                        marginLayoutParams5 = marginLayoutParams5;
                        str5 = str5;
                        c4 = c4;
                        fArr6 = fArr6;
                        i20 = i4;
                        marginLayoutParams6 = marginLayoutParams6;
                        c122610 = c122610;
                        viewOnClickListenerC7793 = this;
                        floatingActionButton5 = floatingActionButton5;
                        FloatingActionButton floatingActionButton111111 = floatingActionButton8;
                        marginLayoutParams4 = marginLayoutParams4;
                        i21 = i21;
                        fArr9 = fArr;
                        floatingActionButton8 = floatingActionButton111111;
                        FloatingActionButton floatingActionButton111112 = floatingActionButton9;
                        fArr10 = fArr2;
                        floatingActionButton9 = floatingActionButton111112;
                    }
                    break;
                default:
                    C2419.m8174();
                    C0619.m2763();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x006a  */
    /* JADX WARN: Code duplicated, block: B:51:0x01cf A[PHI: r13
      0x01cf: PHI (r13v4 short) = (r13v3 short), (r13v2 short) binds: [B:50:0x01cd, B:7:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0208 A[PHI: r2 r8 r9 r12 r15
      0x0208: PHI (r2v4 int) = (r2v2 int), (r2v3 int), (r2v2 int) binds: [B:54:0x0206, B:31:0x00f4, B:27:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:54:0x0206, B:31:0x00f4, B:27:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r9v3 int) = (r9v2 int), (r9v2 int), (r9v4 int) binds: [B:54:0x0206, B:31:0x00f4, B:27:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:54:0x0206, B:31:0x00f4, B:27:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r15v3 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v4 short[]) binds: [B:54:0x0206, B:31:0x00f4, B:27:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0279 A[PHI: r1 r3 r5 r6 r7 r10 r16 r22
      0x0279: PHI (r1v3 l.᩶֨֫) = (r1v2 l.᩶֨֫), (r1v1 l.᩶֨֫), (r1v1 l.᩶֨֫), (r1v1 l.᩶֨֫), (r1v1 l.᩶֨֫), (r1v1 l.᩶֨֫) binds: [B:36:0x0117, B:66:0x0277, B:58:0x023c, B:23:0x00b4, B:14:0x0084, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r3v4 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int) binds: [B:36:0x0117, B:66:0x0277, B:58:0x023c, B:23:0x00b4, B:14:0x0084, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r5v3 int) = (r5v1 int), (r5v1 int), (r5v1 int), (r5v2 int), (r5v1 int), (r5v1 int) binds: [B:36:0x0117, B:66:0x0277, B:58:0x023c, B:23:0x00b4, B:14:0x0084, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r6v8 java.lang.String[]) = 
      (r6v3 java.lang.String[])
      (r6v2 java.lang.String[])
      (r6v2 java.lang.String[])
      (r6v2 java.lang.String[])
      (r6v2 java.lang.String[])
      (r6v2 java.lang.String[])
     binds: [B:36:0x0117, B:66:0x0277, B:58:0x023c, B:23:0x00b4, B:14:0x0084, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r7v4 android.os.Bundle) = 
      (r7v3 android.os.Bundle)
      (r7v2 android.os.Bundle)
      (r7v2 android.os.Bundle)
      (r7v2 android.os.Bundle)
      (r7v2 android.os.Bundle)
      (r7v2 android.os.Bundle)
     binds: [B:36:0x0117, B:66:0x0277, B:58:0x023c, B:23:0x00b4, B:14:0x0084, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r10v4 short) = (r10v2 short), (r10v2 short), (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:36:0x0117, B:66:0x0277, B:58:0x023c, B:23:0x00b4, B:14:0x0084, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r16v4 short[]) = (r16v2 short[]), (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:36:0x0117, B:66:0x0277, B:58:0x023c, B:23:0x00b4, B:14:0x0084, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r22v5 int) = (r22v3 int), (r22v3 int), (r22v4 int), (r22v3 int), (r22v3 int), (r22v3 int) binds: [B:36:0x0117, B:66:0x0277, B:58:0x023c, B:23:0x00b4, B:14:0x0084, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02ab A[PHI: r17
      0x02ab: PHI (r17v4 char) = (r17v2 char), (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:70:0x02a9, B:62:0x025b, B:16:0x0088, B:14:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21205(ViewOnClickListenerC7793 viewOnClickListenerC7793, C23255 c23255) {
        int iM2761;
        int i;
        int i2;
        C20956 c20956 = null;
        int iM3169 = 0;
        int i3 = C1564.f5401;
        int i4 = C3734.f12817;
        int iM31610 = (i3 - C0773.m3169("ۗۗ")) * 67;
        int i5 = ((iM31610 ^ i4) * (-13097)) ^ (-497227597);
        String[] strArr = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM31610 ^ (-156392341);
        int i7 = 0;
        String strM4058 = null;
        int i8 = 0;
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        char c = 0;
        int i12 = -219874984;
        int i13 = 0;
        Bundle bundle = null;
        int i14 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * (-24301)) >> 31));
            switch (i12) {
                case -2132210104:
                case 1853418005:
                    strM4058 = C1080.m4058(c23255.m53958());
                    iM2761 = C0773.m3169("ۙܰ") ^ i4;
                    i = ((iM2761 ^ i3) * 2111) ^ (-193571336);
                    i2 = -371499053;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -2062694047:
                case -483693230:
                    if (RunnableC3646.f12471) {
                        iM2761 = C0773.m3169("ۗ᩺") ^ i4;
                        i = ((iM2761 ^ i3) * (-2845)) ^ 1367527579;
                        i2 = 434725003;
                    } else {
                        iM2761 = C0619.m2761("۠᩻") ^ i4;
                        i = ((iM2761 ^ i3) * 707) ^ (-1767230149);
                        i2 = 937994006;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1983532066:
                case -48982311:
                    s2 = 9054;
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0773.m3169("ܳ֨") ^ i3;
                        i = ((iM2761 ^ i4) * 21163) ^ (-1725178427);
                        i2 = 1618220186;
                    } else {
                        iM2761 = (C0619.m2761("ۛ᩷") + i3) * (-19);
                        i = ((iM2761 ^ i4) * 27983) ^ 1012613690;
                        i2 = 659752146;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1970150554:
                case 2120887613:
                    i10 = i13 + 20493729;
                    if (C2023.m6964() <= 0) {
                        iM2761 = C0773.m3169("ᩴ֫") ^ i4;
                        i = ((iM2761 ^ i3) * (-20653)) ^ 956565782;
                        i2 = 1465901463;
                    } else {
                        iM2761 = (C0773.m3169("ᩴۙ") ^ i4) * (-29);
                        i = ((iM2761 ^ i3) * (-5171)) ^ 996866364;
                        i2 = -1787239862;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1957874734:
                case -1351806043:
                    c = 195;
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0773.m3169("ۗ᩺") ^ i4;
                        i = ((iM2761 ^ i3) * (-2845)) ^ 1367527579;
                        i2 = 434725003;
                    } else {
                        iM2761 = C0619.m2761("ܺۛ") ^ i4;
                        i = ((iM2761 ^ i3) * 7769) ^ 1712541387;
                        i2 = 41376171;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1936191490:
                case -244154579:
                    if (C1343.f4799 != 0) {
                        iM2761 = C0773.m3169("ۗ᩺") ^ i4;
                        i = ((iM2761 ^ i3) * (-2845)) ^ 1367527579;
                        i2 = 434725003;
                    } else {
                        iM2761 = (C0619.m2761("ۖܶ") ^ i3) * 115;
                        i = ((iM2761 ^ i4) * (-5621)) ^ (-1858264952);
                        i2 = -1423273144;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1929822031:
                case -717905839:
                    C1826.m6301();
                    C3779.m12264();
                    break;
                case -1851572216:
                case 1010429009:
                    i7 = 0;
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0773.m3169("ᩴ֫") ^ i4;
                        i = ((iM2761 ^ i3) * (-20653)) ^ 956565782;
                        i2 = 1465901463;
                    } else {
                        iM2761 = C0773.m3169("۫֡") ^ i3;
                        i = ((iM2761 ^ i4) * (-15367)) ^ 1449610924;
                        i2 = -1266634670;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1801432487:
                case -1161444543:
                    AbstractC0641.m2813();
                    iM2761 = C0773.m3169("ۗ᩺") ^ i4;
                    i = ((iM2761 ^ i3) * (-2845)) ^ 1367527579;
                    i2 = 434725003;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1754828301:
                case -559250549:
                    s = sArr[c];
                    i13 = s * s;
                    if (RunnableC1848.f6235) {
                        iM2761 = (C0619.m2761("ۖܶ") ^ i3) * 115;
                        i = ((iM2761 ^ i4) * (-5621)) ^ (-1858264952);
                        i2 = -1423273144;
                    } else {
                        iM2761 = (C0773.m3169("ܽۧ") ^ i3) * (-91);
                        i = ((iM2761 ^ i4) * 6719) ^ 712983399;
                        i2 = -423533029;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1746639067:
                case -1301309949:
                    String strM6365 = RunnableC1848.m6365(C1080.m4058(AbstractC3624.m11756(c23255)));
                    if (C2878.m9480(strM6365)) {
                        int iM2762 = C0619.m2761("ۙ֫") ^ i3;
                        i5 = ((iM2762 ^ i4) * (-2349)) ^ (-201639371);
                        i6 = iM2762 ^ (-92391927);
                    } else {
                        strM4058 = strM6365;
                        iM2761 = C0773.m3169("ۙܰ") ^ i4;
                        i = ((iM2761 ^ i3) * 2111) ^ (-193571336);
                        i2 = -371499053;
                        i6 = iM2761 ^ i2;
                        i5 = i;
                    }
                    break;
                case -1734824976:
                case 13110233:
                    c20956.m37643(i7, i14 ^ iM3169, strM4058, (String) null, strArr, bundle);
                    break;
                case -1560771020:
                case -1212521604:
                    sArr = f25870;
                    if (C1519.f5300 >= 0) {
                        iM2761 = (C0619.m2761("ۖܶ") ^ i3) * 115;
                        i = ((iM2761 ^ i4) * (-5621)) ^ (-1858264952);
                        i2 = -1423273144;
                    } else {
                        iM2761 = (C0619.m2761("֫ۗ") ^ i3) * 101;
                        i = ((iM2761 ^ i4) * (-24327)) ^ 792280101;
                        i2 = -220694402;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1321529880:
                case 2012040031:
                    i11 = 28194;
                    iM2761 = C0619.m2761("ۢۧ") ^ i3;
                    i = ((iM2761 ^ i4) * (-24253)) ^ 415346059;
                    i2 = -923227147;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1187082043:
                case 1074933716:
                    iM3169 = C0773.m3169(C2878.m9486(sArr2, i8, i9, i11));
                    i14 = 2104799977;
                    if (C3448.m11248() != 0) {
                        iM2761 = (C0619.m2761("ۖܶ") ^ i3) * 115;
                        i = ((iM2761 ^ i4) * (-5621)) ^ (-1858264952);
                        i2 = -1423273144;
                    } else {
                        iM2761 = C0773.m3169("ᩳ᩶") ^ i3;
                        i = ((iM2761 ^ i4) * (-21583)) ^ 1048566960;
                        i2 = 2052891657;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1163653850:
                case 2093697565:
                    c20956 = viewOnClickListenerC7793.f25881;
                    bundle = null;
                    if (C2702.f8586 <= 0) {
                        strArr = null;
                        iM2761 = (C0619.m2761("ۖܶ") ^ i3) * 115;
                        i = ((iM2761 ^ i4) * (-5621)) ^ (-1858264952);
                        i2 = -1423273144;
                        i6 = iM2761 ^ i2;
                        i5 = i;
                    } else {
                        int iM2763 = (C0619.m2761("᩸ۚ") + i4) * 63;
                        i5 = ((iM2763 ^ i3) * (-3535)) ^ (-1741328017);
                        i6 = iM2763 ^ 1045249197;
                        strArr = null;
                    }
                    break;
                case -1040480303:
                case -749147251:
                    if (i10 - (s * s2) < 0) {
                        iM2761 = C0773.m3169("ܶ᩶") ^ i4;
                        i = ((iM2761 ^ i3) * 1425) ^ (-1781622243);
                        i2 = 606812497;
                    } else {
                        iM2761 = (C0773.m3169("۟ۛ") ^ i3) * 83;
                        i = ((iM2761 ^ i4) * (-9163)) ^ (-461453246);
                        i2 = -1525755556;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1035200871:
                case 669617608:
                    C0269.m1775();
                    if (C3492.f12043 <= 0) {
                        iM2761 = (i4 - C0619.m2761("۬ᩴ")) * (-53);
                        i = ((iM2761 ^ i3) * 3293) ^ 10626971;
                        i2 = -1355868763;
                    } else {
                        iM2761 = C0773.m3169("ܳ֨") ^ i3;
                        i = ((iM2761 ^ i4) * 21163) ^ (-1725178427);
                        i2 = 1618220186;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -837317129:
                case 238881127:
                    sArr2 = f25870;
                    i8 = 196;
                    i9 = 3;
                    if (C1564.m5509() <= 0) {
                        iM2761 = C0773.m3169("ᩴ֫") ^ i4;
                        i = ((iM2761 ^ i3) * (-20653)) ^ 956565782;
                        i2 = 1465901463;
                    } else {
                        iM2761 = C0773.m3169("ۘۡ") ^ i4;
                        i = ((iM2761 ^ i3) * 19085) ^ (-1018757962);
                        i2 = -721274268;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -53848116:
                case 451088892:
                    AbstractC0641.m2813();
                    if (C3033.f9831 < 0) {
                        iM2761 = (C0619.m2761("ۖܶ") ^ i3) * 115;
                        i = ((iM2761 ^ i4) * (-5621)) ^ (-1858264952);
                        i2 = -1423273144;
                    } else {
                        iM2761 = (i4 - C0619.m2761("۬ᩴ")) * (-53);
                        i = ((iM2761 ^ i3) * 3293) ^ 10626971;
                        i2 = -1355868763;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    i11 = 5659;
                    iM2761 = C0619.m2761("ۢۧ") ^ i3;
                    i = ((iM2761 ^ i4) * (-24253)) ^ 415346059;
                    i2 = -923227147;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0233 A[PHI: r11 r13 r14 r25
      0x0233: PHI (r11v8 l.ۗۢ֫) = (r11v3 l.ۗۢ֫), (r11v2 l.ۗۢ֫), (r11v2 l.ۗۢ֫), (r11v2 l.ۗۢ֫) binds: [B:59:0x021b, B:55:0x01ed, B:44:0x0159, B:5:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r13v8 l.ۗۢ֫) = (r13v2 l.ۗۢ֫), (r13v3 l.ۗۢ֫), (r13v2 l.ۗۢ֫), (r13v2 l.ۗۢ֫) binds: [B:59:0x021b, B:55:0x01ed, B:44:0x0159, B:5:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r14v50 l.ۗۢ֫) = (r14v21 l.ۗۢ֫), (r14v25 l.ۗۢ֫), (r14v31 l.ۗۢ֫), (r14v51 l.ۗۢ֫) binds: [B:59:0x021b, B:55:0x01ed, B:44:0x0159, B:5:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r25v56 l.ۨۢ֫) = (r25v26 l.ۨۢ֫), (r25v31 l.ۨۢ֫), (r25v39 l.ۨۢ֫), (r25v57 l.ۨۢ֫) binds: [B:59:0x021b, B:55:0x01ed, B:44:0x0159, B:5:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    private boolean m21226() {
        C3318 c3318;
        C9829 c9829;
        C12267 c12267;
        int i;
        int i2;
        C9829 c98210;
        C12267 c12268;
        int i3;
        int i4;
        int i5;
        int i6;
        C9829 c98211;
        int iM2761;
        int i7;
        int i8;
        int i9;
        C3318 c3319;
        int iM2762;
        int i10;
        int iM3169;
        int i11;
        int iM2763;
        int i12;
        int i13;
        int i14;
        int i15;
        C9829 c98212;
        int iM2764;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iM2765;
        int i21;
        C12267 c12269;
        int i22 = C2702.f8586;
        int i23 = C1321.f4751;
        int iM2766 = C0619.m2761("۫᩶") ^ i23;
        int i24 = ((iM2766 ^ i22) * 15813) ^ 1223905606;
        ArrayList arrayList = null;
        C20472 c20472 = null;
        C3318 c33110 = null;
        C12267 c122610 = null;
        C9829 c98213 = null;
        C12267 c122611 = null;
        C3318 c33111 = null;
        C3318 c33112 = null;
        int i25 = iM2766 ^ (-2110445498);
        int iIndexOf = 0;
        boolean z = false;
        boolean z2 = false;
        int iIndexOf2 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = -990624537;
        C9829 c98214 = null;
        C9829 c98215 = null;
        ViewOnClickListenerC7793 viewOnClickListenerC7793 = null;
        C3318 c33113 = null;
        C20472 c20473 = null;
        C18234 c18234 = null;
        while (true) {
            i28 = i25 ^ (i24 & (((i28 ^ i22) * (-29271)) >> 31));
            switch (i28) {
                case -2146480440:
                case 1483525220:
                    c3318 = c33113;
                    c12267 = c122610;
                    i = iIndexOf;
                    int i29 = i27;
                    c98212 = c98214;
                    i14 = i26;
                    if (i14 == RunnableC0334.m2051(viewOnClickListenerC7793.f25882)) {
                        iM2764 = C0619.m2761("᩶ܿ") ^ i22;
                        i15 = i29;
                        i16 = ((iM2764 ^ i23) * 27701) ^ (-747305679);
                        i17 = 527602373;
                    } else {
                        i15 = i29;
                        iM2764 = C0773.m3169("ܶۗ") ^ i22;
                        i16 = ((iM2764 ^ i23) * 25943) ^ (-1880654997);
                        i17 = 1898314850;
                    }
                    i18 = iM2764 ^ i17;
                    c98214 = c98212;
                    i27 = i15;
                    i26 = i14;
                    c33113 = c3318;
                    c12269 = c12267;
                    i25 = i18;
                    i24 = i16;
                    iIndexOf = i;
                    c122610 = c12269;
                    break;
                case -2143545813:
                case -1728395034:
                    c33113 = c33113;
                    C12267 c122612 = c122610;
                    C3318 c33114 = c122612.f39446;
                    c98213 = c33114.f10823;
                    if (c98213 == c33114.f10826) {
                        c12268 = c122612;
                        int iM2767 = (C0619.m2761("᩹ۤ") + i22) * (-113);
                        i7 = ((iM2767 ^ i23) * 6893) ^ 987620261;
                        i9 = iM2767 ^ (-1375506142);
                        c122610 = c12268;
                        i25 = i9;
                        i24 = i7;
                        c33113 = c33113;
                    } else {
                        int iM2768 = (C0619.m2761("ۙۛ") ^ i22) * 61;
                        c12268 = c122612;
                        i24 = ((iM2768 ^ i23) * (-16049)) ^ (-637337267);
                        i5 = iM2768 ^ 471336213;
                        c122610 = c12268;
                        i25 = i5;
                        c33113 = c33113;
                    }
                    break;
                case -2132313627:
                case -574774156:
                    c33113 = c33113;
                    C9829 c98216 = c98214;
                    c12268 = c122610;
                    i3 = iIndexOf;
                    i6 = i27;
                    if ((i6 & 129) != 0) {
                        c98211 = c98216;
                        iM2761 = C0773.m3169("ܺۢ") ^ i22;
                        i7 = ((iM2761 ^ i23) * 6689) ^ 1681548560;
                        i8 = -106893494;
                        i9 = iM2761 ^ i8;
                        c98214 = c98211;
                        i27 = i6;
                        iIndexOf = i3;
                        c122610 = c12268;
                        i25 = i9;
                        i24 = i7;
                        c33113 = c33113;
                    } else {
                        int iM31610 = (C0773.m3169("᩶ۛ") + i23) * (-59);
                        i24 = ((iM31610 ^ i22) * 423) ^ 1453888744;
                        i5 = iM31610 ^ 1658066613;
                        c98214 = c98216;
                        i27 = i6;
                        iIndexOf = i3;
                        c122610 = c12268;
                        i25 = i5;
                        c33113 = c33113;
                    }
                    break;
                case -2113952615:
                case -1025882333:
                    C13473.m33144();
                    iM2763 = (C0773.m3169("᩵ᩳ") ^ i23) * 33;
                    i12 = ((iM2763 ^ i22) * 5635) ^ (-850652324);
                    i13 = 72229681;
                    i25 = iM2763 ^ i13;
                    i24 = i12;
                    break;
                case -1970798515:
                case 737698354:
                    C17202.m40372();
                    if (C3734.m12152() >= 0) {
                        iM2763 = (C0619.m2761("ۗۡ") + i23) * (-93);
                        i12 = ((iM2763 ^ i22) * 4299) ^ (-1894159240);
                        i13 = -1469721309;
                        i25 = iM2763 ^ i13;
                        i24 = i12;
                    } else {
                        c33113 = c33113;
                        i4 = i26;
                        i2 = i27;
                        c98210 = c98214;
                        c12268 = c122610;
                        int iM31611 = C0773.m3169("֡ۧ") ^ i23;
                        int i30 = i4;
                        i24 = ((iM31611 ^ i22) * (-15887)) ^ 933815761;
                        c122610 = c12268;
                        i25 = iM31611 ^ (-791867853);
                        c33113 = c33113;
                        C9829 c98217 = c98210;
                        i27 = i2;
                        i26 = i30;
                        c98214 = c98217;
                    }
                    break;
                case -1954743970:
                case 855569351:
                    C2419.m8178(new RunnableC0284(2, this), 300L);
                    iM3169 = C0773.m3169("֨֫") ^ i22;
                    i7 = ((iM3169 ^ i23) * (-32405)) ^ (-2080085104);
                    i11 = 1114636635;
                    i9 = iM3169 ^ i11;
                    c122611 = c122611;
                    i25 = i9;
                    i24 = i7;
                    c33113 = c33113;
                    break;
                case -1827080896:
                case -969363015:
                    m21189();
                    return z;
                case -1415766901:
                case 169615172:
                    c33113 = c33113;
                    c122611 = c122611;
                    c33111 = this.f25872.f39446;
                    c33111.f10824 += z ? 1 : 0;
                    if (iIndexOf2 >= 0) {
                        iM3169 = (C0773.m3169("ᩴܳ") ^ i23) * 77;
                        i7 = ((iM3169 ^ i22) * (-2707)) ^ 554485860;
                        i11 = -1788596346;
                    } else {
                        iM3169 = (C0619.m2761("֨᩻") + i23) * (-59);
                        i7 = ((iM3169 ^ i22) * 8671) ^ (-1596356400);
                        i11 = 788779753;
                    }
                    i9 = iM3169 ^ i11;
                    c122611 = c122611;
                    i25 = i9;
                    i24 = i7;
                    c33113 = c33113;
                    break;
                case -1400266986:
                case 1374366097:
                    c33113 = c33113;
                    c98215.remove(c20472);
                    iM2762 = (i23 - C0773.m3169("᩻۟")) * 65;
                    i7 = ((iM2762 ^ i22) * (-23271)) ^ (-1917562491);
                    i10 = 1660758240;
                    i25 = iM2762 ^ i10;
                    i24 = i7;
                    c33113 = c33113;
                    break;
                case -1395617506:
                case 286677817:
                    m21189();
                    iM3169 = C0773.m3169("֨֫") ^ i22;
                    i7 = ((iM3169 ^ i23) * (-32405)) ^ (-2080085104);
                    i11 = 1114636635;
                    i9 = iM3169 ^ i11;
                    c122611 = c122611;
                    i25 = i9;
                    i24 = i7;
                    c33113 = c33113;
                    break;
                case -1380382675:
                case 1741307753:
                    c33113 = c33113;
                    c12268 = c122610;
                    i3 = iIndexOf;
                    i6 = i27;
                    c98211 = c98214;
                    z2 = false;
                    iM2761 = C0773.m3169("ۖۘ") ^ i22;
                    i7 = ((iM2761 ^ i23) * (-2101)) ^ 91530755;
                    i8 = -32194672;
                    i9 = iM2761 ^ i8;
                    c98214 = c98211;
                    i27 = i6;
                    iIndexOf = i3;
                    c122610 = c12268;
                    i25 = i9;
                    i24 = i7;
                    c33113 = c33113;
                    break;
                case -1368732335:
                case -966309389:
                    if (C2419.f7754 >= 0) {
                        iM2763 = C0619.m2761("ܿᩴ") ^ i22;
                        i12 = ((iM2763 ^ i23) * (-15107)) ^ (-1933378181);
                        i13 = 1731615839;
                        i25 = iM2763 ^ i13;
                        i24 = i12;
                    } else {
                        c33113 = c33113;
                        c122611 = c122611;
                        iM3169 = (C0773.m3169("ۧ۬") ^ i22) * (-93);
                        i7 = ((iM3169 ^ i23) * 18231) ^ 1748604426;
                        i11 = 772527154;
                        i9 = iM3169 ^ i11;
                        c122611 = c122611;
                        i25 = i9;
                        i24 = i7;
                        c33113 = c33113;
                    }
                    break;
                case -1346658493:
                case 2118380980:
                    C1542.m5459();
                    C3099.m10095();
                    return false;
                case -1311838690:
                case 899145985:
                    c3318 = c33113;
                    c12267 = c122610;
                    i = iIndexOf;
                    c9829 = this.f25872.f39446.f10823;
                    if (!C1519.m5403()) {
                        c98214 = c9829;
                        int iM2769 = (i22 - C0619.m2761("۬᩻")) * 51;
                        i16 = ((iM2769 ^ i23) * 15601) ^ (-2082444578);
                        i18 = iM2769 ^ (-1497374370);
                        c33113 = c3318;
                        c12269 = c12267;
                        i25 = i18;
                        i24 = i16;
                        iIndexOf = i;
                        c122610 = c12269;
                    } else {
                        iM2765 = C0619.m2761("ۙۙ") ^ i23;
                        i19 = ((iM2765 ^ i22) * (-12289)) ^ 337576611;
                        i21 = -1515157103;
                        i20 = iM2765 ^ i21;
                        c98214 = c9829;
                        i24 = i19;
                        c33113 = c3318;
                        c12269 = c12267;
                        i25 = i20;
                        iIndexOf = i;
                        c122610 = c12269;
                    }
                    break;
                case -1248450065:
                case 842899769:
                    c33113 = c33113;
                    c122611 = c122611;
                    this.f25883 = -1;
                    c20472.m46977(z2);
                    m21229();
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (C0773.m3169("ۧ۬") ^ i22) * (-93);
                        i7 = ((iM3169 ^ i23) * 18231) ^ 1748604426;
                        i11 = 772527154;
                    } else {
                        iM3169 = C0773.m3169("ܿۛ") ^ i22;
                        i7 = ((iM3169 ^ i23) * (-20387)) ^ (-1830775971);
                        i11 = 816107219;
                    }
                    i9 = iM3169 ^ i11;
                    c122611 = c122611;
                    i25 = i9;
                    i24 = i7;
                    c33113 = c33113;
                    break;
                case -1233485074:
                case 2094868506:
                    c33113 = c33113;
                    c12268 = c122610;
                    i3 = iIndexOf;
                    i6 = i27;
                    c98211 = c98214;
                    try {
                        C21576.m49057(c20472.f65589);
                        iM2761 = (C0619.m2761("ۡۚ") + i23) * (-3);
                        i7 = ((iM2761 ^ i22) * 11095) ^ (-565229927);
                        i8 = 40426842;
                    } catch (PackageManager.NameNotFoundException unused) {
                        iM2761 = C0773.m3169("ۖۤ") ^ i23;
                        i7 = ((iM2761 ^ i22) * 3731) ^ 1923834167;
                        i8 = 1698011046;
                    }
                    i9 = iM2761 ^ i8;
                    c98214 = c98211;
                    i27 = i6;
                    iIndexOf = i3;
                    c122610 = c12268;
                    i25 = i9;
                    i24 = i7;
                    c33113 = c33113;
                    break;
                case -1012035053:
                case 153532943:
                    c3318 = c33113;
                    C9829 c98218 = c98214;
                    c12267 = c122610;
                    i = iIndexOf;
                    int i31 = c20472.f65594.applicationInfo.flags;
                    if (AbstractC3624.f12429 > 0) {
                        int iM31612 = (C0773.m3169("ۜ۠") ^ i22) * q.h;
                        i19 = ((iM31612 ^ i23) * 7851) ^ (-428686096);
                        i20 = iM31612 ^ (-583786819);
                        c98214 = c98218;
                        i27 = i31;
                        i24 = i19;
                        c33113 = c3318;
                        c12269 = c12267;
                        i25 = i20;
                        iIndexOf = i;
                        c122610 = c12269;
                    } else {
                        c98214 = c98218;
                        i27 = i31;
                        int iM27610 = (i22 - C0619.m2761("۬᩻")) * 51;
                        i16 = ((iM27610 ^ i23) * 15601) ^ (-2082444578);
                        i18 = iM27610 ^ (-1497374370);
                        c33113 = c3318;
                        c12269 = c12267;
                        i25 = i18;
                        i24 = i16;
                        iIndexOf = i;
                        c122610 = c12269;
                    }
                    break;
                case -883440343:
                case 1216645563:
                    C3099.m10095();
                    if (C3998.f13671 == 0) {
                        c3318 = c33113;
                        c9829 = c98214;
                        c12267 = c122610;
                        i = iIndexOf;
                        iM2765 = C0619.m2761("ܳܽ") ^ i23;
                        i19 = ((iM2765 ^ i22) * 21975) ^ (-2015366188);
                        i21 = -1539868730;
                        i20 = iM2765 ^ i21;
                        c98214 = c9829;
                        i24 = i19;
                        c33113 = c3318;
                        c12269 = c12267;
                        i25 = i20;
                        iIndexOf = i;
                        c122610 = c12269;
                    } else {
                        c33113 = c33113;
                        c122611 = c122611;
                        iM3169 = (C0773.m3169("ۧ۬") ^ i22) * (-93);
                        i7 = ((iM3169 ^ i23) * 18231) ^ 1748604426;
                        i11 = 772527154;
                        i9 = iM3169 ^ i11;
                        c122611 = c122611;
                        i25 = i9;
                        i24 = i7;
                        c33113 = c33113;
                    }
                    break;
                case -876001195:
                case 1181256645:
                    c33113 = c33113;
                    c12268 = c122610;
                    i3 = iIndexOf;
                    i6 = i27;
                    c98211 = c98214;
                    if (c20472 == null) {
                        iM2761 = (C0619.m2761("ۙ۟") + i23) * 13;
                        i7 = ((iM2761 ^ i22) * 8787) ^ 85990650;
                        i8 = -422146195;
                    } else {
                        iM2761 = (C0773.m3169("֡᩶") + i22) * (-109);
                        i7 = ((iM2761 ^ i23) * 11501) ^ (-1796943428);
                        i8 = -2050438002;
                    }
                    i9 = iM2761 ^ i8;
                    c98214 = c98211;
                    i27 = i6;
                    iIndexOf = i3;
                    c122610 = c12268;
                    i25 = i9;
                    i24 = i7;
                    c33113 = c33113;
                    break;
                case -780516496:
                case 52989386:
                    c3318 = c33113;
                    c9829 = c98214;
                    c12267 = c122610;
                    i = iIndexOf;
                    iIndexOf2 = c9829.indexOf(c20472);
                    if (AbstractC3624.m11755() != 0) {
                        iM2765 = C0619.m2761("ܳܽ") ^ i23;
                        i19 = ((iM2765 ^ i22) * 21975) ^ (-2015366188);
                        i21 = -1539868730;
                    } else {
                        iM2765 = (C0773.m3169("۠ܿ") ^ i22) * 45;
                        i19 = ((iM2765 ^ i23) * 20001) ^ (-2146171434);
                        i21 = 1115981513;
                    }
                    i20 = iM2765 ^ i21;
                    c98214 = c9829;
                    i24 = i19;
                    c33113 = c3318;
                    c12269 = c12267;
                    i25 = i20;
                    iIndexOf = i;
                    c122610 = c12269;
                    break;
                case -767386516:
                case 637999781:
                    if (C3779.f12953 <= 0) {
                        iM2763 = C0773.m3169("ۚۖ") ^ i22;
                        i12 = ((iM2763 ^ i23) * 16823) ^ (-363710513);
                        i13 = -1911982733;
                        i25 = iM2763 ^ i13;
                        i24 = i12;
                    } else {
                        c33113 = c33113;
                        c122611 = c122611;
                        iM3169 = (C0773.m3169("ۧ۬") ^ i22) * (-93);
                        i7 = ((iM3169 ^ i23) * 18231) ^ 1748604426;
                        i11 = 772527154;
                        i9 = iM3169 ^ i11;
                        c122611 = c122611;
                        i25 = i9;
                        i24 = i7;
                        c33113 = c33113;
                    }
                    break;
                case -763836963:
                case 245743317:
                    c33113 = c33113;
                    c12268 = c122610;
                    i3 = iIndexOf;
                    i6 = i27;
                    c98211 = c98214;
                    c20472 = (C20472) C3690.m11990(arrayList, c18234.f59525);
                    iM2761 = (i22 - C0773.m3169("۟ᩴ")) * (-87);
                    i7 = ((iM2761 ^ i23) * (-11899)) ^ 284867236;
                    i8 = 617092122;
                    i9 = iM2761 ^ i8;
                    c98214 = c98211;
                    i27 = i6;
                    iIndexOf = i3;
                    c122610 = c12268;
                    i25 = i9;
                    i24 = i7;
                    c33113 = c33113;
                    break;
                case -716249395:
                case 1583117491:
                    c33113 = c33113;
                    c98213.remove(c20472);
                    c12268 = c122610;
                    int iM27611 = (C0619.m2761("᩹ۤ") + i22) * (-113);
                    i7 = ((iM27611 ^ i23) * 6893) ^ 987620261;
                    i9 = iM27611 ^ (-1375506142);
                    c122610 = c12268;
                    i25 = i9;
                    i24 = i7;
                    c33113 = c33113;
                    break;
                case -585163023:
                case 241374057:
                    if (!C13473.m33144()) {
                        iM2763 = (C0619.m2761("ۗۡ") + i23) * (-93);
                        i12 = ((iM2763 ^ i22) * 4299) ^ (-1894159240);
                        i13 = -1469721309;
                        i25 = iM2763 ^ i13;
                        i24 = i12;
                    } else {
                        c33113 = c33113;
                        c3319 = c33110;
                        int iM27612 = C0619.m2761("ۙ᩻") ^ i22;
                        c33110 = c3319;
                        i24 = ((iM27612 ^ i23) * (-10477)) ^ (-1787070688);
                        i25 = iM27612 ^ 1670802252;
                        c33113 = c33113;
                    }
                    break;
                case -574303412:
                case 615319510:
                    c3318 = c33113;
                    i14 = i26;
                    i15 = i27;
                    c98212 = c98214;
                    c12267 = c122610;
                    i = iIndexOf;
                    c18234 = this.f25875;
                    c20473 = null;
                    z = true;
                    z = true;
                    if (c18234 != null) {
                        iM2764 = C0619.m2761("ܿܽ") ^ i23;
                        i16 = ((iM2764 ^ i22) * (-16501)) ^ 1457814726;
                        i17 = -215645826;
                    } else {
                        iM2764 = C0773.m3169("ܶۗ") ^ i22;
                        i16 = ((iM2764 ^ i23) * 25943) ^ (-1880654997);
                        i17 = 1898314850;
                    }
                    i18 = iM2764 ^ i17;
                    c98214 = c98212;
                    i27 = i15;
                    i26 = i14;
                    c33113 = c3318;
                    c12269 = c12267;
                    i25 = i18;
                    i24 = i16;
                    iIndexOf = i;
                    c122610 = c12269;
                    break;
                case -262081785:
                case 794312950:
                    if (!C3077.f9998) {
                        c33113 = c33113;
                        i4 = i26;
                        i2 = i27;
                        c98210 = c98214;
                        c12268 = c122610;
                        int iM31613 = C0773.m3169("֡ۧ") ^ i23;
                        int i32 = i4;
                        i24 = ((iM31613 ^ i22) * (-15887)) ^ 933815761;
                        c122610 = c12268;
                        i25 = iM31613 ^ (-791867853);
                        c33113 = c33113;
                        C9829 c98219 = c98210;
                        i27 = i2;
                        i26 = i32;
                        c98214 = c98219;
                    } else {
                        iM2763 = (C0773.m3169("᩵ᩳ") ^ i23) * 33;
                        i12 = ((iM2763 ^ i22) * 5635) ^ (-850652324);
                        i13 = 72229681;
                        i25 = iM2763 ^ i13;
                        i24 = i12;
                    }
                    break;
                case -241102620:
                case -102498258:
                    c3318 = c33113;
                    c12267 = c122610;
                    i = iIndexOf;
                    C3318 c33115 = this.f25872.f39446;
                    if (!C3099.m10095()) {
                        int iM31614 = C0773.m3169("ܶ᩷") ^ i23;
                        i19 = ((iM31614 ^ i22) * (-25379)) ^ (-1823611988);
                        i20 = iM31614 ^ (-1411594659);
                        c33110 = c33115;
                        i24 = i19;
                        c33113 = c3318;
                        c12269 = c12267;
                        i25 = i20;
                        iIndexOf = i;
                        c122610 = c12269;
                    } else {
                        c33110 = c33115;
                        int iM27613 = (i22 - C0619.m2761("۬᩻")) * 51;
                        i16 = ((iM27613 ^ i23) * 15601) ^ (-2082444578);
                        i18 = iM27613 ^ (-1497374370);
                        c33113 = c3318;
                        c12269 = c12267;
                        i25 = i18;
                        i24 = i16;
                        iIndexOf = i;
                        c122610 = c12269;
                    }
                    break;
                case -120468587:
                case 22317241:
                    c33113 = c33113;
                    iIndexOf = this.f25880.f39446.f10823.indexOf(c20472);
                    if (C0950.f3488 < 0) {
                        iM2762 = (i22 - C0619.m2761("ۡۛ")) * 37;
                        i7 = ((iM2762 ^ i23) * (-6627)) ^ 824282031;
                        i10 = -1917760039;
                        i25 = iM2762 ^ i10;
                        i24 = i7;
                        c33113 = c33113;
                    } else {
                        i4 = i26;
                        i2 = i27;
                        c98210 = c98214;
                        c12268 = c122610;
                        int iM31615 = C0773.m3169("֡ۧ") ^ i23;
                        int i33 = i4;
                        i24 = ((iM31615 ^ i22) * (-15887)) ^ 933815761;
                        c122610 = c12268;
                        i25 = iM31615 ^ (-791867853);
                        c33113 = c33113;
                        C9829 c982110 = c98210;
                        i27 = i2;
                        i26 = i33;
                        c98214 = c982110;
                    }
                    break;
                case -94968909:
                case 42171633:
                    c33113 = this.f25880.f39446;
                    if (C11235.m28309() != 0) {
                        iM2763 = (C0773.m3169("᩵ᩳ") ^ i23) * 33;
                        i12 = ((iM2763 ^ i22) * 5635) ^ (-850652324);
                        i13 = 72229681;
                    } else {
                        iM2763 = (C0773.m3169("ۧۤ") ^ i23) * 39;
                        i12 = ((iM2763 ^ i22) * (-6949)) ^ (-842242638);
                        i13 = 1539843098;
                    }
                    i25 = iM2763 ^ i13;
                    i24 = i12;
                    break;
                case 45043415:
                case 741656904:
                    C1564.m5509();
                    if (C3779.f12953 > 0) {
                        iM2763 = C0773.m3169("۠ᩴ") ^ i23;
                        i12 = ((iM2763 ^ i22) * 30041) ^ 927319875;
                        i13 = -1459936378;
                        i25 = iM2763 ^ i13;
                        i24 = i12;
                    } else {
                        c33113 = c33113;
                        i4 = i26;
                        i2 = i27;
                        c98210 = c98214;
                        c12268 = c122610;
                        int iM31616 = C0773.m3169("֡ۧ") ^ i23;
                        int i34 = i4;
                        i24 = ((iM31616 ^ i22) * (-15887)) ^ 933815761;
                        c122610 = c12268;
                        i25 = iM31616 ^ (-791867853);
                        c33113 = c33113;
                        C9829 c982111 = c98210;
                        i27 = i2;
                        i26 = i34;
                        c98214 = c982111;
                    }
                    break;
                case 146617454:
                case 1985307694:
                    C1343.m4943();
                    if (RunnableC0334.f1808 > 0) {
                        c33113 = c33113;
                        c122611 = c122611;
                        iM3169 = (C0773.m3169("ۧ۬") ^ i22) * (-93);
                        i7 = ((iM3169 ^ i23) * 18231) ^ 1748604426;
                        i11 = 772527154;
                        i9 = iM3169 ^ i11;
                        c122611 = c122611;
                        i25 = i9;
                        i24 = i7;
                        c33113 = c33113;
                    } else {
                        iM2763 = (C0773.m3169("᩵ᩳ") ^ i23) * 33;
                        i12 = ((iM2763 ^ i22) * 5635) ^ (-850652324);
                        i13 = 72229681;
                        i25 = iM2763 ^ i13;
                        i24 = i12;
                    }
                    break;
                case 169759716:
                case 514014360:
                    return z;
                case 222618407:
                case 2029636709:
                    c33113 = c33113;
                    c3319 = c33110;
                    c3319.f10826.remove(c20472);
                    C12267 c122613 = this.f25872;
                    if (C2288.f7433 <= 0) {
                        c122610 = c122613;
                        int iM27614 = C0619.m2761("ۙ᩻") ^ i22;
                        c33110 = c3319;
                        i24 = ((iM27614 ^ i23) * (-10477)) ^ (-1787070688);
                        i25 = iM27614 ^ 1670802252;
                    } else {
                        c33110 = c3319;
                        int iM27615 = (C0619.m2761("᩵۟") + i22) * 21;
                        i25 = iM27615 ^ 1902169109;
                        i24 = ((iM27615 ^ i23) * (-9453)) ^ 906999250;
                        iIndexOf = iIndexOf;
                        c122610 = c122613;
                    }
                    c33113 = c33113;
                    break;
                case 223969464:
                case 608186804:
                    c33113 = c33113;
                    c122611 = c122611;
                    c33112.notifyItemRemoved(iIndexOf);
                    iM3169 = (C0619.m2761("֨᩻") + i23) * (-59);
                    i7 = ((iM3169 ^ i22) * 8671) ^ (-1596356400);
                    i11 = 788779753;
                    i9 = iM3169 ^ i11;
                    c122611 = c122611;
                    i25 = i9;
                    i24 = i7;
                    c33113 = c33113;
                    break;
                case 240783390:
                case 1721701583:
                    return z2;
                case 305925262:
                case 1438497243:
                    c33113 = c33113;
                    i2 = i27;
                    c98210 = c98214;
                    c12268 = c122610;
                    i3 = iIndexOf;
                    arrayList = c18234.f59526;
                    i4 = c18234.f59527;
                    ViewOnClickListenerC7793 viewOnClickListenerC7794 = c18234.f59528;
                    if (C3690.f12684 > 0) {
                        int iM31617 = (C0773.m3169("ܺܿ") + i23) * (-33);
                        i24 = ((iM31617 ^ i22) * (-18701)) ^ (-1653093480);
                        i5 = iM31617 ^ 102903688;
                        c98214 = c98210;
                        i27 = i2;
                        i26 = i4;
                        viewOnClickListenerC7793 = viewOnClickListenerC7794;
                        iIndexOf = i3;
                        c122610 = c12268;
                        i25 = i5;
                        c33113 = c33113;
                    } else {
                        viewOnClickListenerC7793 = viewOnClickListenerC7794;
                        iIndexOf = i3;
                        int iM31618 = C0773.m3169("֡ۧ") ^ i23;
                        int i35 = i4;
                        i24 = ((iM31618 ^ i22) * (-15887)) ^ 933815761;
                        c122610 = c12268;
                        i25 = iM31618 ^ (-791867853);
                        c33113 = c33113;
                        C9829 c982112 = c98210;
                        i27 = i2;
                        i26 = i35;
                        c98214 = c982112;
                    }
                    break;
                case 330218905:
                case 1445857016:
                    c33113 = c33113;
                    C3318 c33116 = c122611.f39446;
                    c98215 = c33116.f10823;
                    if (c98215 != c33116.f10826) {
                        iM2762 = (C0773.m3169("֡ܶ") + i22) * 75;
                        i7 = ((iM2762 ^ i23) * (-16697)) ^ 1631483175;
                        i10 = -1808089331;
                    } else {
                        iM2762 = (i23 - C0773.m3169("᩻۟")) * 65;
                        i7 = ((iM2762 ^ i22) * (-23271)) ^ (-1917562491);
                        i10 = 1660758240;
                    }
                    i25 = iM2762 ^ i10;
                    i24 = i7;
                    c33113 = c33113;
                    break;
                case 688109975:
                case 1515624641:
                    c33113 = c33113;
                    c122611 = c122611;
                    c33112 = this.f25880.f39446;
                    c33112.f10824 += z ? 1 : 0;
                    if (iIndexOf >= 0) {
                        iM3169 = (i23 - C0619.m2761("ۨ᩸")) * (-3);
                        i7 = ((iM3169 ^ i22) * (-6769)) ^ 755979553;
                        i11 = 23180167;
                    } else {
                        iM3169 = (C0619.m2761("֨᩻") + i23) * (-59);
                        i7 = ((iM3169 ^ i22) * 8671) ^ (-1596356400);
                        i11 = 788779753;
                    }
                    i9 = iM3169 ^ i11;
                    c122611 = c122611;
                    i25 = i9;
                    i24 = i7;
                    c33113 = c33113;
                    break;
                case 756133566:
                case 961281471:
                    this.f25875 = c20473;
                    return z;
                case 987802192:
                case 1820947088:
                    c33113 = c33113;
                    c33113.f10826.remove(c20472);
                    c122611 = this.f25880;
                    if (C2354.f7599 < 0) {
                        iM2762 = C0773.m3169("ۨۨ") ^ i23;
                        i7 = ((iM2762 ^ i22) * 16331) ^ 97818284;
                        i10 = -256506749;
                        i25 = iM2762 ^ i10;
                        i24 = i7;
                        c33113 = c33113;
                    } else {
                        c33113 = c33113;
                        iM2763 = (C0773.m3169("᩵ᩳ") ^ i23) * 33;
                        i12 = ((iM2763 ^ i22) * 5635) ^ (-850652324);
                        i13 = 72229681;
                        i25 = iM2763 ^ i13;
                        i24 = i12;
                    }
                    break;
                case 1139706785:
                case 2026556947:
                    c33113 = c33113;
                    c122611 = c122611;
                    int i36 = c18234.f59525 + (z ? 1 : 0);
                    c18234.f59525 = i36;
                    if (i36 < C2702.m8879(arrayList)) {
                        iM3169 = (i23 - C0619.m2761("ᩴ᩻")) * 85;
                        i7 = ((iM3169 ^ i22) * (-29345)) ^ (-1654907695);
                        i11 = 2102907587;
                    } else {
                        iM3169 = (C0619.m2761("۟ۘ") ^ i22) * 115;
                        i7 = ((iM3169 ^ i23) * 24569) ^ 1220364067;
                        i11 = -1735165338;
                    }
                    i9 = iM3169 ^ i11;
                    c122611 = c122611;
                    i25 = i9;
                    i24 = i7;
                    c33113 = c33113;
                    break;
                case 1383390439:
                case 1461669616:
                    c33113 = c33113;
                    c12268 = c122610;
                    i3 = iIndexOf;
                    i6 = i27;
                    c98211 = c98214;
                    if (c18234.f59525 < C2288.m7752(arrayList)) {
                        iM2761 = (C0619.m2761("ܽ᩸") ^ i23) * (-39);
                        i7 = ((iM2761 ^ i22) * (-23635)) ^ 1256486628;
                        i8 = -1871185291;
                    } else {
                        c20472 = c20473;
                        iM2761 = (i22 - C0773.m3169("۟ᩴ")) * (-87);
                        i7 = ((iM2761 ^ i23) * (-11899)) ^ 284867236;
                        i8 = 617092122;
                    }
                    i9 = iM2761 ^ i8;
                    c98214 = c98211;
                    i27 = i6;
                    iIndexOf = i3;
                    c122610 = c12268;
                    i25 = i9;
                    i24 = i7;
                    c33113 = c33113;
                    break;
                default:
                    c33113 = c33113;
                    c122611 = c122611;
                    c33111.notifyItemRemoved(iIndexOf2);
                    iM3169 = (C0619.m2761("֨᩻") + i23) * (-59);
                    i7 = ((iM3169 ^ i22) * 8671) ^ (-1596356400);
                    i11 = 788779753;
                    i9 = iM3169 ^ i11;
                    c122611 = c122611;
                    i25 = i9;
                    i24 = i7;
                    c33113 = c33113;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21204(final ViewOnClickListenerC7793 viewOnClickListenerC7793, final ViewOnClickListenerC21218 viewOnClickListenerC21218) {
        AbstractC22044 abstractC22044;
        int iM3169;
        int i;
        int i2;
        TextView textView;
        AbstractC22044 abstractC22045;
        String str;
        int i3;
        View view;
        short[] sArr;
        int iM31610;
        int i4;
        int i5;
        AbstractC22044 abstractC22046;
        AbstractC22044 abstractC22047;
        int iM31611;
        int i6;
        int i7;
        TextView textView2;
        int iM31612;
        int i8;
        int i9;
        String str2;
        int iM2761;
        int i10;
        int i11;
        int i12;
        int iM2762;
        int i13;
        View viewM2812 = null;
        TextView textView3 = null;
        int i14 = 235733477;
        int i15 = C11235.f35427;
        int i16 = C2375.f7641;
        int iM31613 = (C0773.m3169("ۨ֫") ^ i16) * 33;
        int i17 = ((iM31613 ^ i15) * 26769) ^ 230934569;
        int i18 = iM31613 ^ 1271127651;
        TextView textView4 = null;
        String str3 = null;
        AbstractC22044 abstractC22044M1774 = null;
        String strM11769 = null;
        String strM6310 = null;
        short[] sArr2 = null;
        int i19 = 0;
        int i20 = 0;
        int iM2763 = 0;
        int iM31614 = 0;
        int i21 = 0;
        String str4 = null;
        View viewM11246 = null;
        AbstractC22044 abstractC22048 = null;
        TextView textView5 = null;
        PackageInfo packageInfo = null;
        String str5 = null;
        String strM50718 = null;
        TextView textView6 = null;
        View viewM11247 = null;
        AbstractC22044 abstractC22044M7806 = null;
        final C20472 c20472 = null;
        int iM2764 = 0;
        while (true) {
            i14 = i18 ^ (i17 & (((i14 ^ i15) * (-10669)) >> 31));
            switch (i14) {
                case -2108248351:
                case 502164196:
                    textView5 = textView5;
                    abstractC22048 = abstractC22048;
                    abstractC22044M1774 = abstractC22044M1774;
                    str5 = str5;
                    sArr2 = sArr2;
                    i21 = i21;
                    viewM11247 = viewM11247;
                    C2878.m9483((TextView) C2834.m9333(viewM2812, C0619.m2761(C20932.m47853(f25870, 86, 3, i19)) ^ 2120319057), c20472.m46976());
                    textView6 = (TextView) C2834.m9333(viewM2812, C0773.m3169(C2966.m9670(f25870, 89, 3, i19)) ^ 2130634919);
                    String str6 = c20472.f65589;
                    if (C2485.f7950 != 0) {
                        str4 = str6;
                        iM31610 = (C0619.m2761("᩷۟") + i15) * 75;
                        i4 = ((iM31610 ^ i16) * (-12583)) ^ (-882829859);
                        i5 = -1735297649;
                        int i22 = iM31610 ^ i5;
                        i21 = i21;
                        sArr2 = sArr2;
                        abstractC22044M1774 = abstractC22044M1774;
                        textView5 = textView5;
                        i18 = i22;
                        i17 = i4;
                        str4 = str4;
                    } else {
                        int iM31615 = (C0773.m3169("ۚۧ") + i16) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i21 = i21;
                        sArr2 = sArr2;
                        abstractC22044M1774 = abstractC22044M1774;
                        textView5 = textView5;
                        str4 = str6;
                        i18 = iM31615 ^ 1200889427;
                        i17 = ((iM31615 ^ i15) * (-7075)) ^ (-1688861021);
                    }
                    viewM11247 = viewM11247;
                    abstractC22048 = abstractC22048;
                    str5 = str5;
                    break;
                case -1973048148:
                case -1175157025:
                    textView = textView5;
                    abstractC22048 = abstractC22048;
                    abstractC22045 = abstractC22044M1774;
                    str = str5;
                    view = viewM11247;
                    sArr = sArr2;
                    i3 = i21;
                    textView4 = (TextView) C2834.m9333(viewM2812, C0773.m3169(RunnableC3646.m11809(sArr, i3, 3, i19)) ^ 2126072715);
                    textView3 = (TextView) C3448.m11246(viewM2812, C0619.m2761(AbstractC0116.m1236(f25870, UMErrorCode.E_UM_BE_JSON_FAILED, 3, i19)) ^ 2119588560);
                    iM2763 = C0619.m2761(RunnableC1848.m6366(f25870, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 3, i19));
                    if (AbstractC0116.f1064 <= 0) {
                        iM2762 = C0619.m2761("᩷ܺ") ^ i15;
                        i = ((iM2762 ^ i16) * (-23769)) ^ (-764336806);
                        i13 = 420152793;
                    } else {
                        iM2762 = (C0773.m3169("ۖۧ") ^ i16) * 57;
                        i = ((iM2762 ^ i15) * (-27399)) ^ 78977471;
                        i13 = 1065335521;
                    }
                    int i23 = iM2762 ^ i13;
                    sArr2 = sArr;
                    i21 = i3;
                    viewM11247 = view;
                    abstractC22044M1774 = abstractC22045;
                    textView5 = textView;
                    i18 = i23;
                    str5 = str;
                    i17 = i;
                    abstractC22048 = abstractC22048;
                    break;
                case -1947595474:
                case -1370854442:
                    C17202.m40372();
                    if (C3998.m12920()) {
                        textView5 = textView5;
                        abstractC22048 = abstractC22048;
                        abstractC22044M1774 = abstractC22044M1774;
                        str5 = str5;
                        str4 = str4;
                        sArr2 = sArr2;
                        i21 = i21;
                        viewM11247 = viewM11247;
                        iM31610 = C0619.m2761("ܿۨ") ^ i16;
                        i4 = ((iM31610 ^ i15) * 23621) ^ (-1367237386);
                        i5 = -1972707190;
                        int i24 = iM31610 ^ i5;
                        i21 = i21;
                        sArr2 = sArr2;
                        abstractC22044M1774 = abstractC22044M1774;
                        textView5 = textView5;
                        i18 = i24;
                        i17 = i4;
                        str4 = str4;
                        viewM11247 = viewM11247;
                        abstractC22048 = abstractC22048;
                        str5 = str5;
                    }
                    textView5 = textView5;
                    abstractC22046 = abstractC22048;
                    abstractC22047 = abstractC22044M1774;
                    str5 = str5;
                    viewM11247 = viewM11247;
                    iM31611 = C0619.m2761("ܽۚ") ^ i16;
                    i6 = ((iM31611 ^ i15) * (-22303)) ^ (-551801334);
                    i7 = 1326387564;
                    int i25 = iM31611 ^ i7;
                    abstractC22044M1774 = abstractC22047;
                    abstractC22048 = abstractC22046;
                    textView5 = textView5;
                    i18 = i25;
                    i17 = i6;
                    viewM11247 = viewM11247;
                    str5 = str5;
                    break;
                case -1906316343:
                case -401135228:
                    textView5 = textView5;
                    abstractC22046 = abstractC22048;
                    abstractC22047 = abstractC22044M1774;
                    str5 = str5;
                    viewM11247 = viewM11247;
                    C1564.m5520((TextView) C3448.m11246(viewM2812, C0773.m3169(strM11769) ^ 2126058187), C3200.m10535(c20472.f65590));
                    C1564.m5520((TextView) C2834.m9333(viewM2812, C0773.m3169(C1542.m5471(f25870, IShizukuService.Stub.TRANSACTION_isHidden, 3, i19)) ^ 2125327311), C3200.m10535(c20472.f65586));
                    sArr2 = f25870;
                    i21 = IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    if (C0619.f2439) {
                        iM31611 = C0619.m2761("ܽۚ") ^ i16;
                        i6 = ((iM31611 ^ i15) * (-22303)) ^ (-551801334);
                        i7 = 1326387564;
                    } else {
                        iM31611 = C0773.m3169("۬֫") ^ i15;
                        i6 = ((iM31611 ^ i16) * 12699) ^ (-910303339);
                        i7 = 722889140;
                    }
                    int i26 = iM31611 ^ i7;
                    abstractC22044M1774 = abstractC22047;
                    abstractC22048 = abstractC22046;
                    textView5 = textView5;
                    i18 = i26;
                    i17 = i6;
                    viewM11247 = viewM11247;
                    str5 = str5;
                    break;
                case -1851387333:
                case 1400281379:
                    C2023.m6964();
                    if (C11235.m28309() != 0) {
                        abstractC22046 = abstractC22048;
                        abstractC22047 = abstractC22044M1774;
                        str2 = str5;
                        viewM11247 = viewM11247;
                        int iM31616 = (C0773.m3169("᩺۬") + i15) * 81;
                        int i27 = ((iM31616 ^ i16) * 13863) ^ (-611426717);
                        abstractC22044M1774 = abstractC22047;
                        abstractC22048 = abstractC22046;
                        i18 = iM31616 ^ 155955991;
                        viewM11247 = viewM11247;
                        str5 = str2;
                        i17 = i27;
                    } else {
                        textView5 = textView5;
                        abstractC22046 = abstractC22048;
                        abstractC22047 = abstractC22044M1774;
                        str5 = str5;
                        viewM11247 = viewM11247;
                        iM31611 = C0619.m2761("ܽۚ") ^ i16;
                        i6 = ((iM31611 ^ i15) * (-22303)) ^ (-551801334);
                        i7 = 1326387564;
                        int i28 = iM31611 ^ i7;
                        abstractC22044M1774 = abstractC22047;
                        abstractC22048 = abstractC22046;
                        textView5 = textView5;
                        i18 = i28;
                        i17 = i6;
                        viewM11247 = viewM11247;
                        str5 = str5;
                    }
                    break;
                case -1695319114:
                case 1682610995:
                    textView2 = textView5;
                    str5 = str5;
                    viewM11247 = viewM11247;
                    TextView textView7 = (TextView) C2834.m9333(viewM2812, iM31614 ^ 2125653067);
                    final String str7 = str3;
                    C23916.m53425(textView7, str7);
                    ViewOnClickListenerC15284.m36688(textView7);
                    C2375.m8070(textView7, new View.OnClickListener(viewOnClickListenerC7793) { // from class: l.֡۟֫

                        /* JADX INFO: renamed from: ۧܺۗ, reason: not valid java name and contains not printable characters */
                        private static final short[] f1561 = {7707, 27154, 27225, 27228, 27209, 27228};

                        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC7793 f1562;

                        {
                            int i29 = -1726445487;
                            int i30 = C23916.f77426;
                            int i31 = C1783.f6087;
                            int iM31617 = (C0773.m3169("۠᩸") ^ i30) * 127;
                            int i32 = ((iM31617 ^ i31) * (-4073)) ^ (-1630391590);
                            int i33 = -1370592333;
                            while (true) {
                                i29 = ((((i29 ^ i31) * (-27455)) >> 31) & i32) ^ (iM31617 ^ i33);
                                switch (i29) {
                                    case -2051018487:
                                    case -1876633294:
                                        C2966.m9664();
                                        if (C3734.f12817 < 0) {
                                            iM31617 = (C0619.m2761("᩸ۡ") ^ i30) * 69;
                                            i32 = ((iM31617 ^ i31) * 21169) ^ (-1000240394);
                                            i33 = 2129081648;
                                        } else {
                                            iM31617 = C0773.m3169("֨۠") ^ i31;
                                            i32 = ((iM31617 ^ i30) * (-2975)) ^ 730768092;
                                            i33 = -1401634351;
                                        }
                                        break;
                                    case -1733025471:
                                    case 1379071687:
                                        this.f1562 = viewOnClickListenerC7793;
                                        if (C0773.f2792 <= 0) {
                                            iM31617 = C0773.m3169("֨۠") ^ i31;
                                            i32 = ((iM31617 ^ i30) * (-2975)) ^ 730768092;
                                            i33 = -1401634351;
                                        } else {
                                            iM31617 = (C0619.m2761("ۨ֡") + i31) * (-123);
                                            i32 = ((iM31617 ^ i30) * 22489) ^ (-887261828);
                                            i33 = 982541424;
                                        }
                                        break;
                                    case -1681002194:
                                    case 2135059907:
                                        C3779.m12264();
                                        C1080.m4050();
                                        iM31617 = C0773.m3169("֨۠") ^ i31;
                                        i32 = ((iM31617 ^ i30) * (-2975)) ^ 730768092;
                                        i33 = -1401634351;
                                        break;
                                    case -1600423541:
                                    case -986806464:
                                        if (!C17202.f56030) {
                                            iM31617 = C0619.m2761("ۛܳ") ^ i30;
                                            i32 = ((iM31617 ^ i31) * 9463) ^ (-662512763);
                                            i33 = 1168238061;
                                        } else {
                                            iM31617 = C0773.m3169("֨۠") ^ i31;
                                            i32 = ((iM31617 ^ i30) * (-2975)) ^ 730768092;
                                            i33 = -1401634351;
                                        }
                                        break;
                                    case -1319988661:
                                    case 588500998:
                                        if (C1080.f3865 >= 0) {
                                            iM31617 = (i30 - C0619.m2761("ۚۛ")) * (-111);
                                            i32 = ((iM31617 ^ i31) * (-1795)) ^ 212144935;
                                            i33 = 213327530;
                                        } else {
                                            iM31617 = (C0619.m2761("᩵᩻") + i30) * (-51);
                                            i32 = ((iM31617 ^ i31) * (-28971)) ^ 694798136;
                                            i33 = -1199218275;
                                        }
                                        break;
                                    case -1123760164:
                                    case 1410707626:
                                        if (C2287.f7432 >= 0) {
                                            iM31617 = C0619.m2761("ۛܳ") ^ i30;
                                            i32 = ((iM31617 ^ i31) * 9463) ^ (-662512763);
                                            i33 = 1168238061;
                                        } else {
                                            iM31617 = C0619.m2761("ۙۖ") ^ i31;
                                            i32 = ((iM31617 ^ i30) * (-25955)) ^ (-1579195272);
                                            i33 = -2044546613;
                                        }
                                        break;
                                    case -890359388:
                                    case 2001164692:
                                        if (C2354.f7599 >= 0) {
                                            iM31617 = C0619.m2761("ۛܳ") ^ i30;
                                            i32 = ((iM31617 ^ i31) * 9463) ^ (-662512763);
                                            i33 = 1168238061;
                                        } else {
                                            iM31617 = C0773.m3169("۠᩺") ^ i30;
                                            i32 = ((iM31617 ^ i31) * 13395) ^ (-2074058888);
                                            i33 = -2014872624;
                                        }
                                        break;
                                    case -870972640:
                                    case 1564744945:
                                        if (C1783.m6232()) {
                                            iM31617 = C0619.m2761("᩷ۧ") ^ i30;
                                            i32 = ((iM31617 ^ i31) * 29543) ^ (-656003512);
                                            i33 = 834712018;
                                        } else {
                                            iM31617 = (i31 - C0773.m3169("᩶᩹")) * 17;
                                            i32 = ((iM31617 ^ i30) * (-15801)) ^ (-1140174648);
                                            i33 = 1761427306;
                                        }
                                        break;
                                    case -823720021:
                                    case -58142831:
                                        if (C1321.f4751 >= 0) {
                                            iM31617 = (C0619.m2761("᩸ۡ") ^ i30) * 69;
                                            i32 = ((iM31617 ^ i31) * 21169) ^ (-1000240394);
                                            i33 = 2129081648;
                                        } else {
                                            iM31617 = C0619.m2761("۫ᩴ") ^ i31;
                                            i32 = ((iM31617 ^ i30) * 32041) ^ (-1663987857);
                                            i33 = 1531447135;
                                        }
                                        break;
                                    case -810847728:
                                    case 1197233463:
                                        if (C20932.f66974 <= 0) {
                                            iM31617 = (C0619.m2761("᩸ۡ") ^ i30) * 69;
                                            i32 = ((iM31617 ^ i31) * 21169) ^ (-1000240394);
                                            i33 = 2129081648;
                                        } else {
                                            iM31617 = (C0773.m3169("۫ܳ") ^ i30) * 39;
                                            i32 = ((iM31617 ^ i31) * (-22215)) ^ 1821842260;
                                            i33 = -1880231194;
                                        }
                                        break;
                                    case -432005601:
                                    case 1792455067:
                                        RunnableC0334.m2063();
                                        C3077.m10041();
                                        throw new RuntimeException();
                                    case -36092450:
                                    case 293379648:
                                        if (RunnableC3646.m11813() != 0) {
                                            iM31617 = (C0619.m2761("᩸ۡ") ^ i30) * 69;
                                            i32 = ((iM31617 ^ i31) * 21169) ^ (-1000240394);
                                            i33 = 2129081648;
                                        } else {
                                            iM31617 = (C0773.m3169("ۙۤ") ^ i31) * 39;
                                            i32 = ((iM31617 ^ i30) * 14687) ^ (-1272276860);
                                            i33 = 156986012;
                                        }
                                        break;
                                    case 103339055:
                                    case 2071645583:
                                        if (C3998.f13671 == 0) {
                                            iM31617 = (i31 - C0773.m3169("᩶᩹")) * 17;
                                            i32 = ((iM31617 ^ i30) * (-15801)) ^ (-1140174648);
                                            i33 = 1761427306;
                                        } else {
                                            iM31617 = C0619.m2761("ۛܳ") ^ i30;
                                            i32 = ((iM31617 ^ i31) * 9463) ^ (-662512763);
                                            i33 = 1168238061;
                                        }
                                        break;
                                    case 238859794:
                                    case 1660412059:
                                        if (RunnableC3055.f9898 >= 0) {
                                            iM31617 = (i30 - C0619.m2761("ۚۛ")) * (-111);
                                            i32 = ((iM31617 ^ i31) * (-1795)) ^ 212144935;
                                            i33 = 213327530;
                                        } else {
                                            iM31617 = C0619.m2761("᩺ܶ") ^ i30;
                                            i32 = ((iM31617 ^ i31) * 10307) ^ 905808281;
                                            i33 = -1951204831;
                                        }
                                        break;
                                    case 1548884541:
                                    case 1588022028:
                                        return;
                                    default:
                                        if (C2288.f7433 <= 0) {
                                            iM31617 = (i30 - C0619.m2761("ۚۛ")) * (-111);
                                            i32 = ((iM31617 ^ i31) * (-1795)) ^ 212144935;
                                            i33 = 213327530;
                                        } else {
                                            iM31617 = C0773.m3169("۠᩻") ^ i31;
                                            i32 = ((iM31617 ^ i30) * 5397) ^ (-189303386);
                                            i33 = 345230689;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:43:0x0168 A[PHI: r2 r3
                          0x0168: PHI (r2v4 l.۟ۢ֫) = (r2v3 l.۟ۢ֫), (r2v2 l.۟ۢ֫) binds: [B:41:0x014e, B:36:0x010e] A[DONT_GENERATE, DONT_INLINE]
                          0x0168: PHI (r3v3 l.᩻᩶ᩴ) = (r3v2 l.᩻᩶ᩴ), (r3v4 l.᩻᩶ᩴ) binds: [B:41:0x014e, B:36:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:57:0x01f5 A[PHI: r8 r13 r14
                          0x01f5: PHI (r8v4 short[]) = (r8v2 short[]), (r8v2 short[]), (r8v3 short[]), (r8v2 short[]) binds: [B:56:0x01f3, B:52:0x01d6, B:26:0x00c1, B:109:0x01f5] A[DONT_GENERATE, DONT_INLINE]
                          0x01f5: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:56:0x01f3, B:52:0x01d6, B:26:0x00c1, B:109:0x01f5] A[DONT_GENERATE, DONT_INLINE]
                          0x01f5: PHI (r14v4 short) = (r14v2 short), (r14v3 short), (r14v2 short), (r14v2 short) binds: [B:56:0x01f3, B:52:0x01d6, B:26:0x00c1, B:109:0x01f5] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int iM2765;
                            int i29;
                            int i30;
                            String strM6952;
                            int iM31617;
                            int i31;
                            short[] sArr3;
                            ViewOnClickListenerC0270 viewOnClickListenerC0270 = this;
                            int i32 = -427192532;
                            int i33 = C2310.f7472;
                            int i34 = C1321.f4751;
                            int iM2766 = (C0619.m2761("ܿۘ") + i33) * 45;
                            int i35 = ((iM2766 ^ i34) * 1383) ^ 1923056302;
                            int i36 = iM2766 ^ (-588159878);
                            short[] sArr4 = null;
                            short[] sArr5 = null;
                            short s = 0;
                            short s2 = 0;
                            int i37 = 0;
                            int i38 = 0;
                            short s3 = 0;
                            int i39 = 0;
                            char c = 0;
                            String strM3166 = null;
                            String strM56469 = null;
                            StringBuilder sb = null;
                            String str8 = null;
                            C25291 c25291M40238 = null;
                            ViewOnClickListenerC7793 viewOnClickListenerC7794 = null;
                            while (true) {
                                i32 = i36 ^ (i35 & (((i32 ^ i34) * 8613) >> 31));
                                switch (i32) {
                                    case -1935617415:
                                    case 483719121:
                                        int i40 = s + s3;
                                        if (i38 - (i40 * i40) > 0) {
                                            iM2765 = (C0619.m2761("ܽܰ") + i34) * (-21);
                                            i29 = ((iM2765 ^ i33) * (-9655)) ^ 4887961;
                                            i30 = -506144711;
                                        } else {
                                            iM2765 = C0619.m2761("֨۫") ^ i33;
                                            i29 = ((iM2765 ^ i34) * (-4181)) ^ 1213477295;
                                            i30 = 1621410223;
                                        }
                                        i36 = iM2765 ^ i30;
                                        i35 = i29;
                                        break;
                                    case -1715307355:
                                    case -523457248:
                                        c = 0;
                                        if (RunnableC0334.f1808 > 0) {
                                            iM2765 = (i34 - C0773.m3169("᩺۠")) * 31;
                                            i29 = ((iM2765 ^ i33) * 22353) ^ 505381067;
                                            i30 = -199626588;
                                            i36 = iM2765 ^ i30;
                                            i35 = i29;
                                        } else {
                                            sArr3 = sArr4;
                                            int iM2767 = C0619.m2761("᩹ܰ") ^ i33;
                                            i36 = iM2767 ^ (-724713846);
                                            sArr4 = sArr3;
                                            i35 = ((iM2767 ^ i34) * (-9709)) ^ 1488631992;
                                            viewOnClickListenerC0270 = this;
                                        }
                                        break;
                                    case -1587142762:
                                    case -670620049:
                                        s = sArr4[c];
                                        s2 = 2;
                                        if (C1343.f4799 == 0) {
                                            iM2765 = C0773.m3169("᩺ܰ") ^ i33;
                                            i29 = ((iM2765 ^ i34) * (-12081)) ^ 1107025188;
                                            i30 = -1339759885;
                                            i36 = iM2765 ^ i30;
                                            i35 = i29;
                                        } else {
                                            sArr3 = sArr4;
                                            int iM2768 = C0619.m2761("᩹ܰ") ^ i33;
                                            i36 = iM2768 ^ (-724713846);
                                            sArr4 = sArr3;
                                            i35 = ((iM2768 ^ i34) * (-9709)) ^ 1488631992;
                                            viewOnClickListenerC0270 = this;
                                        }
                                        break;
                                    case -1507048144:
                                    case -617162467:
                                        C0487.m2356();
                                        C11235.m28309();
                                        sArr3 = sArr4;
                                        int iM2769 = C0619.m2761("᩹ܰ") ^ i33;
                                        i36 = iM2769 ^ (-724713846);
                                        sArr4 = sArr3;
                                        i35 = ((iM2769 ^ i34) * (-9709)) ^ 1488631992;
                                        viewOnClickListenerC0270 = this;
                                        break;
                                    case -1380698465:
                                    case 141246620:
                                        int i41 = ViewOnClickListenerC7793.f25871;
                                        viewOnClickListenerC7794 = viewOnClickListenerC0270.f1562;
                                        C17202.m40369(viewOnClickListenerC7794);
                                        if (C7756.m21096()) {
                                            iM2765 = C0619.m2761("ܺ۠") ^ i34;
                                            i29 = ((iM2765 ^ i33) * (-18951)) ^ (-1490349996);
                                            i30 = 1824668048;
                                        } else {
                                            iM2765 = (C0619.m2761("ܿ֨") ^ i33) * (-29);
                                            i29 = ((iM2765 ^ i34) * (-11301)) ^ (-203263940);
                                            i30 = 185083483;
                                        }
                                        i36 = iM2765 ^ i30;
                                        i35 = i29;
                                        break;
                                    case -1281975170:
                                    case -1221393557:
                                        c25291M40238 = C17085.m40238(c20472.f65589);
                                        if (c25291M40238 != null) {
                                            iM2765 = (C0619.m2761("ۚ۫") + i34) * (-109);
                                            i29 = ((iM2765 ^ i33) * 8025) ^ (-1973913133);
                                            i30 = 1504157064;
                                        } else {
                                            iM2765 = C0619.m2761("ܺ۠") ^ i34;
                                            i29 = ((iM2765 ^ i33) * (-18951)) ^ (-1490349996);
                                            i30 = 1824668048;
                                        }
                                        i36 = iM2765 ^ i30;
                                        i35 = i29;
                                        break;
                                    case -1263111197:
                                    case -824789727:
                                        i39 = 26900;
                                        iM2765 = C0619.m2761("ۙۢ") ^ i33;
                                        i29 = ((iM2765 ^ i34) * (-1517)) ^ (-979653166);
                                        i30 = 2072438511;
                                        i36 = iM2765 ^ i30;
                                        i35 = i29;
                                        break;
                                    case -1243163665:
                                    case 126039527:
                                        C3779.m12258(sb, strM3166);
                                        strM6952 = C2023.m6952(sb);
                                        str8 = strM6952;
                                        iM2765 = (C0773.m3169("ۛۤ") + i33) * 57;
                                        i29 = ((iM2765 ^ i34) * (-9855)) ^ (-325705476);
                                        i30 = -477922057;
                                        i36 = iM2765 ^ i30;
                                        i35 = i29;
                                        break;
                                    case -1231651659:
                                    case 260376785:
                                        i39 = 27197;
                                        iM2765 = C0619.m2761("ۙۢ") ^ i33;
                                        i29 = ((iM2765 ^ i34) * (-1517)) ^ (-979653166);
                                        i30 = 2072438511;
                                        i36 = iM2765 ^ i30;
                                        i35 = i29;
                                        break;
                                    case -1187674871:
                                    case 1599764815:
                                        strM3166 = C0773.m3166(sArr5, 1, 5, i39);
                                        if (C2288.f7433 <= 0) {
                                            iM2765 = (C0773.m3169("᩹᩶") + i33) * 25;
                                            i29 = ((iM2765 ^ i34) * 24343) ^ 1578016628;
                                            i30 = -685569370;
                                        } else {
                                            iM2765 = (C0619.m2761("ۡ᩺") + i34) * 127;
                                            i29 = ((iM2765 ^ i33) * 8013) ^ (-54811943);
                                            i30 = 329980195;
                                        }
                                        i36 = iM2765 ^ i30;
                                        i35 = i29;
                                        break;
                                    case -1127716137:
                                    case 539982401:
                                        s3 = 1;
                                        if (C0773.f2792 <= 0) {
                                            iM2765 = C0773.m3169("ۡۚ") ^ i34;
                                            i29 = ((iM2765 ^ i33) * (-11343)) ^ 2131217894;
                                            i30 = 2108611199;
                                        } else {
                                            iM2765 = C0619.m2761("᩻۬") ^ i34;
                                            i29 = ((iM2765 ^ i33) * 27425) ^ 491150075;
                                            i30 = -1169222789;
                                        }
                                        i36 = iM2765 ^ i30;
                                        i35 = i29;
                                        break;
                                    case -900071411:
                                    case -707074819:
                                        strM6952 = str7;
                                        str8 = strM6952;
                                        iM2765 = (C0773.m3169("ۛۤ") + i33) * 57;
                                        i29 = ((iM2765 ^ i34) * (-9855)) ^ (-325705476);
                                        i30 = -477922057;
                                        i36 = iM2765 ^ i30;
                                        i35 = i29;
                                        break;
                                    case 50105860:
                                    case 2025342867:
                                        C3033.m9845();
                                        break;
                                    case 131722859:
                                    case 1224663340:
                                        if (!C2878.f9462) {
                                            iM31617 = (i34 - C0773.m3169("ۚ᩻")) * (-99);
                                            i35 = ((iM31617 ^ i33) * 11125) ^ 149765628;
                                            i31 = -2005068189;
                                            i36 = iM31617 ^ i31;
                                            viewOnClickListenerC0270 = this;
                                        } else {
                                            iM2765 = (C0773.m3169("᩹᩶") + i33) * 25;
                                            i29 = ((iM2765 ^ i34) * 24343) ^ 1578016628;
                                            i30 = -685569370;
                                            i36 = iM2765 ^ i30;
                                            i35 = i29;
                                        }
                                        break;
                                    case 418381552:
                                    case 1389764037:
                                        Main.m93(viewOnClickListenerC7794, str8);
                                        break;
                                    case 451460575:
                                    case 1153145562:
                                        C3779.m12258(sb, strM56469);
                                        sArr5 = f1561;
                                        if (C0487.f2131 <= 0) {
                                            iM2765 = C0773.m3169("ۡۚ") ^ i34;
                                            i29 = ((iM2765 ^ i33) * (-11343)) ^ 2131217894;
                                            i30 = 2108611199;
                                        } else {
                                            iM2765 = C0773.m3169("᩸ܳ") ^ i33;
                                            i29 = ((iM2765 ^ i34) * 4577) ^ (-1473560001);
                                            i30 = 1862579691;
                                        }
                                        i36 = iM2765 ^ i30;
                                        i35 = i29;
                                        break;
                                    case 457237009:
                                    case 1401292874:
                                        C3099.m10095();
                                        if (C2834.f9334 <= 0) {
                                            iM2765 = (C0773.m3169("᩹᩶") + i33) * 25;
                                            i29 = ((iM2765 ^ i34) * 24343) ^ 1578016628;
                                            i30 = -685569370;
                                            i36 = iM2765 ^ i30;
                                            i35 = i29;
                                        } else {
                                            sArr3 = sArr4;
                                            int iM27610 = C0619.m2761("᩹ܰ") ^ i33;
                                            i36 = iM27610 ^ (-724713846);
                                            sArr4 = sArr3;
                                            i35 = ((iM27610 ^ i34) * (-9709)) ^ 1488631992;
                                            viewOnClickListenerC0270 = this;
                                        }
                                        break;
                                    case 463414036:
                                    case 1712706140:
                                        i37 = s * s2;
                                        if (C13473.f42873 != 0) {
                                            iM2765 = C0773.m3169("᩻ۧ") ^ i33;
                                            i29 = ((iM2765 ^ i34) * 32761) ^ (-1401520327);
                                            i30 = -773267714;
                                        } else {
                                            iM2765 = C0619.m2761("۫۫") ^ i34;
                                            i29 = ((iM2765 ^ i33) * 4673) ^ (-186773214);
                                            i30 = -1790139171;
                                        }
                                        i36 = iM2765 ^ i30;
                                        i35 = i29;
                                        break;
                                    case 869574342:
                                    case 1222134310:
                                        i38 = i37 + 1;
                                        if (C2966.f9654 >= 0) {
                                            iM2765 = C0773.m3169("ۡۚ") ^ i34;
                                            i29 = ((iM2765 ^ i33) * (-11343)) ^ 2131217894;
                                            i30 = 2108611199;
                                        } else {
                                            iM2765 = C0773.m3169("ۧ᩺") ^ i33;
                                            i29 = ((iM2765 ^ i34) * 5231) ^ (-1199897719);
                                            i30 = -165838485;
                                        }
                                        i36 = iM2765 ^ i30;
                                        i35 = i29;
                                        break;
                                    case 1008131872:
                                    case 1401397231:
                                        C13473.m33144();
                                        if (C2375.f7641 > 0) {
                                            iM2765 = C0773.m3169("ۡۚ") ^ i34;
                                            i29 = ((iM2765 ^ i33) * (-11343)) ^ 2131217894;
                                            i30 = 2108611199;
                                            i36 = iM2765 ^ i30;
                                            i35 = i29;
                                        } else {
                                            sArr3 = sArr4;
                                            int iM27611 = C0619.m2761("᩹ܰ") ^ i33;
                                            i36 = iM27611 ^ (-724713846);
                                            sArr4 = sArr3;
                                            i35 = ((iM27611 ^ i34) * (-9709)) ^ 1488631992;
                                            viewOnClickListenerC0270 = this;
                                        }
                                        break;
                                    case 1094962793:
                                    case 2047199888:
                                        if (C1519.f5300 >= 0) {
                                            iM31617 = (i34 - C0773.m3169("ۚ᩻")) * (-99);
                                            i35 = ((iM31617 ^ i33) * 11125) ^ 149765628;
                                            i31 = -2005068189;
                                        } else {
                                            iM31617 = C0773.m3169("᩻ܿ") ^ i34;
                                            i35 = ((iM31617 ^ i33) * 32363) ^ (-611148872);
                                            i31 = 1558115214;
                                        }
                                        i36 = iM31617 ^ i31;
                                        viewOnClickListenerC0270 = this;
                                        break;
                                    case 1227680428:
                                    case 1341913354:
                                        sb = new StringBuilder();
                                        strM56469 = c25291M40238.m56469();
                                        if (C2288.f7433 > 0) {
                                            iM2765 = (i34 - C0619.m2761("֡۬")) * (-15);
                                            i29 = ((iM2765 ^ i33) * 31581) ^ 916471936;
                                            i30 = 2041451466;
                                            i36 = iM2765 ^ i30;
                                            i35 = i29;
                                        } else {
                                            iM31617 = (i34 - C0773.m3169("ۚ᩻")) * (-99);
                                            i35 = ((iM31617 ^ i33) * 11125) ^ 149765628;
                                            i31 = -2005068189;
                                            i36 = iM31617 ^ i31;
                                            viewOnClickListenerC0270 = this;
                                        }
                                        break;
                                    default:
                                        sArr3 = f1561;
                                        if (C3033.f9831 < 0) {
                                            int iM31618 = (C0773.m3169("ܶ᩹") + i33) * 69;
                                            i29 = ((iM31618 ^ i34) * (-5885)) ^ 425282208;
                                            i36 = iM31618 ^ 1527569644;
                                            viewOnClickListenerC0270 = this;
                                            sArr4 = sArr3;
                                            i35 = i29;
                                        } else {
                                            int iM27612 = C0619.m2761("᩹ܰ") ^ i33;
                                            i36 = iM27612 ^ (-724713846);
                                            sArr4 = sArr3;
                                            i35 = ((iM27612 ^ i34) * (-9709)) ^ 1488631992;
                                            viewOnClickListenerC0270 = this;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    abstractC22048 = C6382.f21566;
                    StringBuilder sb = new StringBuilder(C3998.m12925(f25870, 122, 13, i19));
                    C3779.m12258(sb, packageInfo.packageName);
                    abstractC22044M1774 = C0269.m1774(abstractC22048, C2023.m6952(sb));
                    if (C2878.m9481(abstractC22044M1774)) {
                        iM31612 = C0773.m3169("ۤ֨") ^ i16;
                        i8 = ((iM31612 ^ i15) * 22265) ^ (-1486807576);
                        i9 = -1343955749;
                    } else {
                        iM31612 = (i15 - C0773.m3169("᩷ۨ")) * 57;
                        i8 = ((iM31612 ^ i16) * (-14135)) ^ (-132981471);
                        i9 = 12660876;
                    }
                    i18 = iM31612 ^ i9;
                    i17 = i8;
                    viewM11247 = viewM11247;
                    textView5 = textView2;
                    str5 = str5;
                    break;
                case -1652756773:
                case 2138625299:
                    abstractC22048 = abstractC22048;
                    abstractC22044M1774 = abstractC22044M1774;
                    str5 = str5;
                    C17202.m40369((C11762) C4013.m12986());
                    if (!C7756.m21109()) {
                        iM3169 = (C0773.m3169("ۜ֡") ^ i15) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM3169 ^ i16) * (-19973)) ^ 2084492418;
                        i2 = -2054070357;
                        int i29 = iM3169 ^ i2;
                        str5 = str5;
                        abstractC22044M1774 = abstractC22044M1774;
                        i18 = i29;
                        i17 = i;
                        abstractC22048 = abstractC22048;
                    } else {
                        viewM11247 = viewM11247;
                        abstractC22044 = abstractC22048;
                        iM2761 = C0773.m3169("᩷᩻") ^ i16;
                        i10 = ((iM2761 ^ i15) * (-10431)) ^ 772179450;
                        i11 = 137537818;
                        int i30 = iM2761 ^ i11;
                        abstractC22044M1774 = abstractC22044M1774;
                        i18 = i30;
                        i17 = i10;
                        abstractC22048 = abstractC22044;
                        viewM11247 = viewM11247;
                        str5 = str5;
                    }
                    break;
                case -1643599397:
                case 1333305509:
                    abstractC22044M1774 = abstractC22044M1774;
                    str5 = str5;
                    viewM11247 = viewM11247;
                    StringBuilder sb2 = new StringBuilder(C0619.m2756(f25870, 151, 12, i19));
                    C3779.m12258(sb2, packageInfo.packageName);
                    abstractC22044 = abstractC22048;
                    abstractC22044M7806 = C2310.m7806(abstractC22044, C1080.m4058(sb2));
                    if (C1564.m5506(abstractC22044M7806)) {
                        iM2761 = C0773.m3169("ۧۗ") ^ i15;
                        i10 = ((iM2761 ^ i16) * (-28611)) ^ 316930688;
                        i11 = -1444556081;
                    } else {
                        iM2761 = C0773.m3169("֡᩻") ^ i16;
                        i10 = ((iM2761 ^ i15) * 18089) ^ 2123133506;
                        i11 = 1369690530;
                    }
                    int i31 = iM2761 ^ i11;
                    abstractC22044M1774 = abstractC22044M1774;
                    i18 = i31;
                    i17 = i10;
                    abstractC22048 = abstractC22044;
                    viewM11247 = viewM11247;
                    str5 = str5;
                    break;
                case -1642458240:
                case 1476159784:
                    i12 = i20;
                    abstractC22048 = abstractC22048;
                    abstractC22044M1774 = abstractC22044M1774;
                    str5 = str5;
                    C1564.m5520(textView5, strM50718);
                    C2878.m9483((TextView) C2834.m9333(viewM2812, C0619.m2761(C3690.m11996(f25870, 178, 3, i19)) ^ 2129828985), C22482.m50718(packageInfo.lastUpdateTime));
                    C2878.m9483((TextView) C3448.m11246(viewM2812, C0619.m2761(C1343.m4939(f25870, 181, 3, i19)) ^ 2127553122), C2702.m8878(packageInfo.applicationInfo.uid));
                    if (C2310.m7813() > 0) {
                        int iM2765 = C0619.m2761("ܿܺ") ^ i15;
                        str5 = str5;
                        abstractC22044M1774 = abstractC22044M1774;
                        abstractC22048 = abstractC22048;
                        i18 = iM2765 ^ (-408909903);
                        i17 = ((iM2765 ^ i16) * 7913) ^ (-1235997563);
                        i20 = i12;
                    } else {
                        viewM11247 = viewM11247;
                        str4 = str4;
                        i20 = i12;
                        sArr2 = sArr2;
                        textView5 = textView5;
                        i21 = i21;
                        iM31610 = C0619.m2761("ܿۨ") ^ i16;
                        i4 = ((iM31610 ^ i15) * 23621) ^ (-1367237386);
                        i5 = -1972707190;
                        int i210 = iM31610 ^ i5;
                        i21 = i21;
                        sArr2 = sArr2;
                        abstractC22044M1774 = abstractC22044M1774;
                        textView5 = textView5;
                        i18 = i210;
                        i17 = i4;
                        str4 = str4;
                        viewM11247 = viewM11247;
                        abstractC22048 = abstractC22048;
                        str5 = str5;
                    }
                    break;
                case -1634910880:
                case -696960243:
                    i19 = 51097;
                    iM31610 = (C0619.m2761("᩺֫") + i16) * 41;
                    i4 = ((iM31610 ^ i15) * 4051) ^ 1141753410;
                    i5 = -499780375;
                    int i211 = iM31610 ^ i5;
                    i21 = i21;
                    sArr2 = sArr2;
                    abstractC22044M1774 = abstractC22044M1774;
                    textView5 = textView5;
                    i18 = i211;
                    i17 = i4;
                    str4 = str4;
                    viewM11247 = viewM11247;
                    abstractC22048 = abstractC22048;
                    str5 = str5;
                    break;
                case -1395742766:
                case -774017713:
                    i19 = 3697;
                    iM31610 = (C0619.m2761("᩺֫") + i16) * 41;
                    i4 = ((iM31610 ^ i15) * 4051) ^ 1141753410;
                    i5 = -499780375;
                    int i212 = iM31610 ^ i5;
                    i21 = i21;
                    sArr2 = sArr2;
                    abstractC22044M1774 = abstractC22044M1774;
                    textView5 = textView5;
                    i18 = i212;
                    i17 = i4;
                    str4 = str4;
                    viewM11247 = viewM11247;
                    abstractC22048 = abstractC22048;
                    str5 = str5;
                    break;
                case -1285289945:
                case -650504732:
                    abstractC22044M1774 = abstractC22044M1774;
                    str5 = str5;
                    viewM11247 = viewM11247;
                    abstractC22044 = abstractC22048;
                    if (Build.VERSION.SDK_INT >= 34) {
                        iM2761 = C0619.m2761("۫ۗ") ^ i15;
                        i10 = ((iM2761 ^ i16) * 13841) ^ (-372200007);
                        i11 = 262013123;
                    } else {
                        iM2761 = C0773.m3169("᩷᩻") ^ i16;
                        i10 = ((iM2761 ^ i15) * (-10431)) ^ 772179450;
                        i11 = 137537818;
                    }
                    int i32 = iM2761 ^ i11;
                    abstractC22044M1774 = abstractC22044M1774;
                    i18 = i32;
                    i17 = i10;
                    abstractC22048 = abstractC22044;
                    viewM11247 = viewM11247;
                    str5 = str5;
                    break;
                case -1098726485:
                case 1943245809:
                    C2288.m7767();
                    textView5 = textView5;
                    abstractC22046 = abstractC22048;
                    abstractC22047 = abstractC22044M1774;
                    str5 = str5;
                    viewM11247 = viewM11247;
                    iM31611 = C0619.m2761("ܽۚ") ^ i16;
                    i6 = ((iM31611 ^ i15) * (-22303)) ^ (-551801334);
                    i7 = 1326387564;
                    int i213 = iM31611 ^ i7;
                    abstractC22044M1774 = abstractC22047;
                    abstractC22048 = abstractC22046;
                    textView5 = textView5;
                    i18 = i213;
                    i17 = i6;
                    viewM11247 = viewM11247;
                    str5 = str5;
                    break;
                case -881954013:
                case 3706155:
                    if (!C0619.m2763()) {
                        textView = textView5;
                        abstractC22048 = abstractC22048;
                        abstractC22045 = abstractC22044M1774;
                        str = str5;
                        i3 = i21;
                        view = viewM11247;
                        sArr = sArr2;
                        iM2762 = C0619.m2761("᩷ܺ") ^ i15;
                        i = ((iM2762 ^ i16) * (-23769)) ^ (-764336806);
                        i13 = 420152793;
                        int i214 = iM2762 ^ i13;
                        sArr2 = sArr;
                        i21 = i3;
                        viewM11247 = view;
                        abstractC22044M1774 = abstractC22045;
                        textView5 = textView;
                        i18 = i214;
                        str5 = str;
                        i17 = i;
                        abstractC22048 = abstractC22048;
                    } else {
                        textView5 = textView5;
                        abstractC22048 = abstractC22048;
                        abstractC22044M1774 = abstractC22044M1774;
                        str5 = str5;
                        str4 = str4;
                        sArr2 = sArr2;
                        i21 = i21;
                        viewM11247 = viewM11247;
                        iM31610 = (C0619.m2761("᩷۟") + i15) * 75;
                        i4 = ((iM31610 ^ i16) * (-12583)) ^ (-882829859);
                        i5 = -1735297649;
                        int i215 = iM31610 ^ i5;
                        i21 = i21;
                        sArr2 = sArr2;
                        abstractC22044M1774 = abstractC22044M1774;
                        textView5 = textView5;
                        i18 = i215;
                        i17 = i4;
                        str4 = str4;
                        viewM11247 = viewM11247;
                        abstractC22048 = abstractC22048;
                        str5 = str5;
                    }
                    break;
                case -869151385:
                case -547906641:
                    abstractC22047 = abstractC22044M1774;
                    abstractC22046 = abstractC22048;
                    C2354.m7978((TextView) C3448.m11246(viewM2812, C0773.m3169(strM6310) ^ 2118735324), C1343.m4946(AbstractC0116.m1244(iM2764), C2966.m9670(f25870, 146, 2, i19)));
                    TextView textView8 = (TextView) C2834.m9333(viewM2812, C0619.m2761(AbstractC0116.m1236(f25870, 148, 3, i19)) ^ 2102671970);
                    final String strM11806 = RunnableC3646.m11806(abstractC22047);
                    C23916.m53425(textView8, strM11806);
                    ViewOnClickListenerC15284.m36688(textView8);
                    C11235.m28299(textView8, new View.OnClickListener(viewOnClickListenerC7793) { // from class: l.۟۟֫

                        /* JADX INFO: renamed from: ֫ۨܺ, reason: not valid java name and contains not printable characters */
                        private static final short[] f25461 = {8376, -27207, -27145, -27144, -27150, -27164, -27143, -27137, -27150, -27191, -27150, -27145, -27166, -27145};

                        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC7793 f25462;

                        {
                            int i33 = 527361222;
                            int i34 = C3690.f12684;
                            int i35 = C2354.f7599;
                            int iM31617 = C0773.m3169("ۨ۟") ^ i35;
                            int i36 = ((iM31617 ^ i34) * (-28719)) ^ (-1370503445);
                            int i37 = 776921818;
                            while (true) {
                                i33 = ((((i33 ^ i34) * 8661) >> 31) & i36) ^ (iM31617 ^ i37);
                                switch (i33) {
                                    case -1925434057:
                                    case 289876367:
                                        C3998.m12920();
                                        if (AbstractC3624.f12429 <= 0) {
                                            iM31617 = C0773.m3169("᩵ܺ") ^ i35;
                                            i36 = ((iM31617 ^ i34) * (-7211)) ^ (-1688732558);
                                            i37 = -502366852;
                                        } else {
                                            iM31617 = C0773.m3169("۫۬") ^ i34;
                                            i36 = ((iM31617 ^ i35) * (-9569)) ^ 846162882;
                                            i37 = -711447042;
                                        }
                                        break;
                                    case -1692739855:
                                    case -138744328:
                                        return;
                                    case -1672419724:
                                    case -1445564597:
                                        if (C11235.f35427 >= 0) {
                                            iM31617 = C0773.m3169("᩵ܺ") ^ i35;
                                            i36 = ((iM31617 ^ i34) * (-7211)) ^ (-1688732558);
                                            i37 = -502366852;
                                        } else {
                                            iM31617 = C0619.m2761("ۡܶ") ^ i34;
                                            i36 = ((iM31617 ^ i35) * (-31953)) ^ 1549195418;
                                            i37 = -622366128;
                                        }
                                        break;
                                    case -1628591478:
                                    case -41087263:
                                        if (C1783.f6087 <= 0) {
                                            iM31617 = C0773.m3169("᩵ܺ") ^ i35;
                                            i36 = ((iM31617 ^ i34) * (-7211)) ^ (-1688732558);
                                            i37 = -502366852;
                                        } else {
                                            iM31617 = (C0619.m2761("᩹ܺ") ^ i34) * (-31);
                                            i36 = ((iM31617 ^ i35) * 5013) ^ (-1545357608);
                                            i37 = 403890502;
                                        }
                                        break;
                                    case -1566935890:
                                    case 2095291212:
                                        if (C13473.f42873 != 0) {
                                            iM31617 = C0619.m2761("۟ۧ") ^ i34;
                                            i36 = ((iM31617 ^ i35) * (-18589)) ^ 1815806202;
                                            i37 = -909172629;
                                        } else {
                                            iM31617 = C0619.m2761("ᩳܽ") ^ i35;
                                            i36 = ((iM31617 ^ i34) * (-30163)) ^ 1969085019;
                                            i37 = 1742331714;
                                        }
                                        break;
                                    case -1104267331:
                                    case 1917137889:
                                        this.f25462 = viewOnClickListenerC7793;
                                        if (C2310.f7472 >= 0) {
                                            iM31617 = C0773.m3169("ܽ᩻") ^ i35;
                                            i36 = ((iM31617 ^ i34) * (-18579)) ^ (-1433179571);
                                            i37 = 2147076301;
                                        } else {
                                            iM31617 = C0773.m3169("᩵᩸") ^ i34;
                                            i36 = ((iM31617 ^ i35) * 11185) ^ 557597367;
                                            i37 = 478256471;
                                        }
                                        break;
                                    case -709287626:
                                    case 998634268:
                                        if (C1146.m4231()) {
                                            iM31617 = (i35 - C0773.m3169("᩷᩸")) * (-43);
                                            i36 = ((iM31617 ^ i34) * 10369) ^ 2131006020;
                                            i37 = 1773849552;
                                        } else {
                                            iM31617 = C0619.m2761("۟ۧ") ^ i34;
                                            i36 = ((iM31617 ^ i35) * (-18589)) ^ 1815806202;
                                            i37 = -909172629;
                                        }
                                        break;
                                    case -468390075:
                                    case 1171350708:
                                        if (C3734.f12817 >= 0) {
                                            iM31617 = C0773.m3169("۫۬") ^ i34;
                                            i36 = ((iM31617 ^ i35) * (-9569)) ^ 846162882;
                                            i37 = -711447042;
                                        } else {
                                            iM31617 = C0773.m3169("֡ۡ") ^ i35;
                                            i36 = ((iM31617 ^ i34) * 20327) ^ (-1951739749);
                                            i37 = 1844294161;
                                        }
                                        break;
                                    case -345263617:
                                    case 1551009074:
                                        C2419.m8174();
                                        C2485.m8357();
                                        throw new RuntimeException();
                                    case -275170429:
                                    case 1914302040:
                                        if (C2966.f9654 < 0) {
                                            iM31617 = (i34 - C0619.m2761("ۧܶ")) * 77;
                                            i36 = ((iM31617 ^ i35) * (-3945)) ^ (-2082096333);
                                            i37 = 1674844042;
                                        } else {
                                            iM31617 = C0773.m3169("᩵ܺ") ^ i35;
                                            i36 = ((iM31617 ^ i34) * (-7211)) ^ (-1688732558);
                                            i37 = -502366852;
                                        }
                                        break;
                                    case -181948335:
                                    case -147014941:
                                        if (C1519.f5300 < 0) {
                                            iM31617 = C0773.m3169("ܽ᩻") ^ i35;
                                            i36 = ((iM31617 ^ i34) * (-18579)) ^ (-1433179571);
                                            i37 = 2147076301;
                                        } else {
                                            iM31617 = C0773.m3169("۫۬") ^ i34;
                                            i36 = ((iM31617 ^ i35) * (-9569)) ^ 846162882;
                                            i37 = -711447042;
                                        }
                                        break;
                                    case 124854998:
                                    case 1224581817:
                                        if (C0269.f1558 <= 0) {
                                            iM31617 = C0773.m3169("ܽ᩻") ^ i35;
                                            i36 = ((iM31617 ^ i34) * (-18579)) ^ (-1433179571);
                                            i37 = 2147076301;
                                        } else {
                                            iM31617 = (C0773.m3169("᩺ۛ") ^ i34) * (-95);
                                            i36 = ((iM31617 ^ i35) * (-22373)) ^ (-574628599);
                                            i37 = -668866259;
                                        }
                                        break;
                                    case 127820691:
                                    case 1543275454:
                                        if (C3779.f12953 <= 0) {
                                            iM31617 = C0619.m2761("۟ۧ") ^ i34;
                                            i36 = ((iM31617 ^ i35) * (-18589)) ^ 1815806202;
                                            i37 = -909172629;
                                        } else {
                                            iM31617 = C0773.m3169("᩻ܰ") ^ i35;
                                            i36 = ((iM31617 ^ i34) * (-8351)) ^ (-903461462);
                                            i37 = -1760422061;
                                        }
                                        break;
                                    case 136509954:
                                    case 1919766409:
                                        RunnableC0334.m2063();
                                        C3099.m10095();
                                        iM31617 = C0773.m3169("۫۬") ^ i34;
                                        i36 = ((iM31617 ^ i35) * (-9569)) ^ 846162882;
                                        i37 = -711447042;
                                        break;
                                    case 1271182266:
                                    case 2029243175:
                                        if (C0773.f2792 <= 0) {
                                            iM31617 = (i34 - C0619.m2761("ۧܶ")) * 77;
                                            i36 = ((iM31617 ^ i35) * (-3945)) ^ (-2082096333);
                                            i37 = 1674844042;
                                        } else {
                                            iM31617 = C0619.m2761("ܰ᩸") ^ i34;
                                            i36 = ((iM31617 ^ i35) * (-15793)) ^ 1189849061;
                                            i37 = 1695497110;
                                        }
                                        break;
                                    default:
                                        if (C0862.m3503()) {
                                            iM31617 = (i35 - C0773.m3169("ۜᩳ")) * (-107);
                                            i36 = ((iM31617 ^ i34) * 6257) ^ 781638039;
                                            i37 = -1816519567;
                                        } else {
                                            iM31617 = C0619.m2761("۟ۧ") ^ i34;
                                            i36 = ((iM31617 ^ i35) * (-18589)) ^ 1815806202;
                                            i37 = -909172629;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:42:0x0163 A[PHI: r3
                          0x0163: PHI (r3v3 l.᩻᩶ᩴ) = (r3v2 l.᩻᩶ᩴ), (r3v4 l.᩻᩶ᩴ) binds: [B:40:0x014b, B:35:0x0113] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:60:0x0216 A[PHI: r2 r8 r12 r13
                          0x0216: PHI (r2v4 l.۟ۢ֫) = (r2v2 l.۟ۢ֫), (r2v3 l.۟ۢ֫), (r2v2 l.۟ۢ֫), (r2v2 l.۟ۢ֫), (r2v2 l.۟ۢ֫), (r2v2 l.۟ۢ֫) binds: [B:59:0x0214, B:44:0x017f, B:28:0x00d3, B:19:0x0091, B:9:0x0060, B:107:0x0216] A[DONT_GENERATE, DONT_INLINE]
                          0x0216: PHI (r8v4 short[]) = (r8v2 short[]), (r8v2 short[]), (r8v3 short[]), (r8v2 short[]), (r8v2 short[]), (r8v2 short[]) binds: [B:59:0x0214, B:44:0x017f, B:28:0x00d3, B:19:0x0091, B:9:0x0060, B:107:0x0216] A[DONT_GENERATE, DONT_INLINE]
                          0x0216: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:59:0x0214, B:44:0x017f, B:28:0x00d3, B:19:0x0091, B:9:0x0060, B:107:0x0216] A[DONT_GENERATE, DONT_INLINE]
                          0x0216: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:59:0x0214, B:44:0x017f, B:28:0x00d3, B:19:0x0091, B:9:0x0060, B:107:0x0216] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:68:0x0268 A[PHI: r10 r11 r20
                          0x0268: PHI (r10v3 short) = (r10v2 short), (r10v4 short) binds: [B:67:0x0266, B:63:0x0248] A[DONT_GENERATE, DONT_INLINE]
                          0x0268: PHI (r11v3 short) = (r11v2 short), (r11v4 short) binds: [B:67:0x0266, B:63:0x0248] A[DONT_GENERATE, DONT_INLINE]
                          0x0268: PHI (r20v5 char) = (r20v4 char), (r20v3 char) binds: [B:67:0x0266, B:63:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code restructure failed: missing block: B:13:0x007e, code lost:
                        
                            if (l.C2287.f7432 < 0) goto L78;
                         */
                        @Override // android.view.View.OnClickListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onClick(android.view.View r22) {
                            /*
                                Method dump skipped, instruction units count: 956
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC7728.onClick(android.view.View):void");
                        }
                    });
                    iM31611 = (C0773.m3169("ᩳۢ") + i16) * (-85);
                    i6 = ((iM31611 ^ i15) * (-20199)) ^ 1251837970;
                    i7 = 2122223037;
                    int i216 = iM31611 ^ i7;
                    abstractC22044M1774 = abstractC22047;
                    abstractC22048 = abstractC22046;
                    textView5 = textView5;
                    i18 = i216;
                    i17 = i6;
                    viewM11247 = viewM11247;
                    str5 = str5;
                    break;
                case -860734870:
                case 973093257:
                    TextView textView9 = textView5;
                    viewM11247 = C3448.m11246(viewM2812, iM2763 ^ 2127675333);
                    ViewOnClickListenerC15284.m36686(textView4);
                    i20 = 8;
                    C13473.m33140(C3448.m11246(viewM2812, C0773.m3169(C0950.m3780(f25870, 116, 3, i19)) ^ 2127481088), 8);
                    String str8 = packageInfo.applicationInfo.dataDir;
                    iM31614 = C0773.m3169(C2288.m7761(f25870, 119, 3, i19));
                    int iM31617 = C0773.m3169("ۤᩳ") ^ i15;
                    str3 = str8;
                    str5 = str5;
                    i17 = ((iM31617 ^ i16) * (-7735)) ^ (-2006275273);
                    abstractC22044M1774 = abstractC22044M1774;
                    abstractC22048 = abstractC22048;
                    i18 = iM31617 ^ 135379181;
                    textView5 = textView9;
                    break;
                case -775948850:
                case 90278860:
                    i12 = i20;
                    abstractC22046 = abstractC22048;
                    abstractC22047 = abstractC22044M1774;
                    str2 = packageInfo.applicationInfo.sourceDir;
                    TextView textView10 = (TextView) C3448.m11246(viewM2812, C0773.m3169(AbstractC0641.m2820(f25870, 172, 3, i19)) ^ 2128468510);
                    C23916.m53425(textView10, str2);
                    ViewOnClickListenerC15284.m36688(textView10);
                    C2375.m8070(textView10, new ViewOnClickListenerC7330(viewOnClickListenerC7793, str2));
                    textView5 = (TextView) C3448.m11246(viewM2812, C0773.m3169(C2702.m8881(f25870, HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, 3, i19)) ^ 2097587058);
                    strM50718 = C22482.m50718(packageInfo.firstInstallTime);
                    if (C13473.f42873 == 0) {
                        int iM2766 = (C0619.m2761("ۡۢ") ^ i16) * (-67);
                        str5 = str2;
                        i17 = ((iM2766 ^ i15) * 27311) ^ (-960831428);
                        abstractC22044M1774 = abstractC22047;
                        abstractC22048 = abstractC22046;
                        i18 = iM2766 ^ 1043298768;
                        i20 = i12;
                    } else {
                        viewM11247 = viewM11247;
                        i20 = i12;
                        int iM31618 = (C0773.m3169("᩺۬") + i15) * 81;
                        int i217 = ((iM31618 ^ i16) * 13863) ^ (-611426717);
                        abstractC22044M1774 = abstractC22047;
                        abstractC22048 = abstractC22046;
                        i18 = iM31618 ^ 155955991;
                        viewM11247 = viewM11247;
                        str5 = str2;
                        i17 = i217;
                    }
                    break;
                case -626871524:
                case 1114760953:
                    textView5 = textView5;
                    abstractC22048 = abstractC22048;
                    abstractC22044M1774 = abstractC22044M1774;
                    str5 = str5;
                    str4 = str4;
                    i21 = i21;
                    viewM11247 = viewM11247;
                    C1564.m5520(textView6, str4);
                    TextView textView11 = (TextView) C2834.m9333(viewM2812, C0619.m2761(C1564.m5510(f25870, 92, 3, i19)) ^ 2121092820);
                    packageInfo = c20472.f65594;
                    C1564.m5520(textView11, String.valueOf(packageInfo.versionName));
                    sArr2 = sArr2;
                    viewM11246 = C3448.m11246(viewM2812, C0773.m3169(C2419.m8166(f25870, 95, 3, i19)) ^ 2101384267);
                    if (C2419.f7754 >= 0) {
                        iM31610 = C0619.m2761("ܿۨ") ^ i16;
                        i4 = ((iM31610 ^ i15) * 23621) ^ (-1367237386);
                        i5 = -1972707190;
                    } else {
                        iM31610 = (C0619.m2761("ۡ۟") ^ i15) * 95;
                        i4 = ((iM31610 ^ i16) * 27013) ^ (-826844211);
                        i5 = -986816487;
                    }
                    int i218 = iM31610 ^ i5;
                    i21 = i21;
                    sArr2 = sArr2;
                    abstractC22044M1774 = abstractC22044M1774;
                    textView5 = textView5;
                    i18 = i218;
                    i17 = i4;
                    str4 = str4;
                    viewM11247 = viewM11247;
                    abstractC22048 = abstractC22048;
                    str5 = str5;
                    break;
                case -616918042:
                case 1056687663:
                    textView5 = textView5;
                    abstractC22046 = abstractC22048;
                    abstractC22047 = abstractC22044M1774;
                    str5 = str5;
                    viewM11247 = viewM11247;
                    TextView textView12 = (TextView) C2834.m9333(viewM2812, C0773.m3169(C3099.m10092(f25870, 135, 3, i19)) ^ 2100634598);
                    iM2764 = C0619.m2761(C0269.m1785(f25870, 138, 3, i19)) ^ 2121173678;
                    C2354.m7978(textView12, C1343.m4946(AbstractC0116.m1244(iM2764), C1519.m5399(f25870, 141, 2, i19)));
                    strM6310 = C1826.m6310(f25870, 143, 3, i19);
                    if (C0862.f3233 == 0) {
                        iM31611 = C0773.m3169("ۜ᩵") ^ i15;
                        i6 = ((iM31611 ^ i16) * (-14023)) ^ 1552855388;
                        i7 = 1590890794;
                        int i219 = iM31611 ^ i7;
                        abstractC22044M1774 = abstractC22047;
                        abstractC22048 = abstractC22046;
                        textView5 = textView5;
                        i18 = i219;
                        i17 = i6;
                        viewM11247 = viewM11247;
                        str5 = str5;
                    } else {
                        str2 = str5;
                        textView5 = textView5;
                        int iM31619 = (C0773.m3169("᩺۬") + i15) * 81;
                        int i2110 = ((iM31619 ^ i16) * 13863) ^ (-611426717);
                        abstractC22044M1774 = abstractC22047;
                        abstractC22048 = abstractC22046;
                        i18 = iM31619 ^ 155955991;
                        viewM11247 = viewM11247;
                        str5 = str2;
                        i17 = i2110;
                    }
                    break;
                case -544513652:
                case 628985121:
                    i20 = i20;
                    C13473.m33140(C3448.m11246(viewM2812, C0619.m2761(C1564.m5510(f25870, 166, 3, i19)) ^ 2102207539), i20);
                    iM3169 = (C0773.m3169("֡ܽ") ^ i16) * 71;
                    i = ((iM3169 ^ i15) * (-19729)) ^ 307308699;
                    i2 = 1828378223;
                    int i220 = iM3169 ^ i2;
                    str5 = str5;
                    abstractC22044M1774 = abstractC22044M1774;
                    i18 = i220;
                    i17 = i;
                    abstractC22048 = abstractC22048;
                    break;
                case -447917128:
                case -21720198:
                    if (!RunnableC0334.m2063()) {
                        abstractC22046 = abstractC22048;
                        abstractC22047 = abstractC22044M1774;
                        str2 = str5;
                        viewM11247 = viewM11247;
                        int iM316110 = (C0773.m3169("᩺۬") + i15) * 81;
                        int i2111 = ((iM316110 ^ i16) * 13863) ^ (-611426717);
                        abstractC22044M1774 = abstractC22047;
                        abstractC22048 = abstractC22046;
                        i18 = iM316110 ^ 155955991;
                        viewM11247 = viewM11247;
                        str5 = str2;
                        i17 = i2111;
                    } else {
                        textView5 = textView5;
                        abstractC22048 = abstractC22048;
                        abstractC22044M1774 = abstractC22044M1774;
                        str5 = str5;
                        str4 = str4;
                        sArr2 = sArr2;
                        i21 = i21;
                        viewM11247 = viewM11247;
                        iM31610 = (C0619.m2761("᩷۟") + i15) * 75;
                        i4 = ((iM31610 ^ i16) * (-12583)) ^ (-882829859);
                        i5 = -1735297649;
                        int i2112 = iM31610 ^ i5;
                        i21 = i21;
                        sArr2 = sArr2;
                        abstractC22044M1774 = abstractC22044M1774;
                        textView5 = textView5;
                        i18 = i2112;
                        i17 = i4;
                        str4 = str4;
                        viewM11247 = viewM11247;
                        abstractC22048 = abstractC22048;
                        str5 = str5;
                    }
                    break;
                case -439740869:
                case 1512036243:
                    textView5 = textView5;
                    abstractC22048 = abstractC22048;
                    abstractC22044M1774 = abstractC22044M1774;
                    str5 = str5;
                    str4 = str4;
                    sArr2 = sArr2;
                    i21 = i21;
                    viewM11247 = viewM11247;
                    c20472 = viewOnClickListenerC21218.f67718;
                    viewM2812 = AbstractC0641.m2812(viewOnClickListenerC7793, C0619.m2761(C3690.m11996(f25870, 80, 3, i19)) ^ 2117745351);
                    ImageView imageView = (ImageView) C3448.m11246(viewM2812, C0773.m3169(RunnableC3646.m11809(f25870, 83, 3, i19)) ^ 2127175012);
                    imageView.setImageDrawable(c20472.f65587);
                    C2375.m8070(imageView, new View.OnClickListener(viewOnClickListenerC7793) { // from class: l.ܿ۟֫

                        /* JADX INFO: renamed from: ۡ᩶ۖ, reason: not valid java name and contains not printable characters */
                        private static final short[] f59396 = {9589, 4349, 15457, -8256, -12232, -16066, 9042, -13295, 4570, -9491, 6428, 5475, -9586};

                        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC7793 f59397;

                        {
                            int i33 = 830660924;
                            int i34 = C1826.f6190;
                            int i35 = C1519.f5300;
                            int iM2767 = (i35 - C0619.m2761("֨۫")) * (-109);
                            int i36 = ((iM2767 ^ i34) * 26259) ^ (-1572615873);
                            int i37 = -441005362;
                            while (true) {
                                i33 = ((((i33 ^ i34) * 2007) >> 31) & i36) ^ (iM2767 ^ i37);
                                switch (i33) {
                                    case -2040315745:
                                    case -1151056898:
                                        C2485.m8357();
                                        RunnableC3055.m9933();
                                        throw new RuntimeException();
                                    case -2000508578:
                                    case 42574433:
                                        if (C2023.f6737) {
                                            iM2767 = C0773.m3169("۠ܺ") ^ i35;
                                            i36 = ((iM2767 ^ i34) * (-18235)) ^ (-1614050197);
                                            i37 = 1495076090;
                                        } else {
                                            iM2767 = (C0619.m2761("᩻ۚ") ^ i35) * 51;
                                            i36 = ((iM2767 ^ i34) * (-8995)) ^ (-388020110);
                                            i37 = 732414163;
                                        }
                                        break;
                                    case -1673809695:
                                    case 1624028796:
                                        C3690.m11987();
                                        C2834.m9344();
                                        iM2767 = C0773.m3169("۠ܺ") ^ i35;
                                        i36 = ((iM2767 ^ i34) * (-18235)) ^ (-1614050197);
                                        i37 = 1495076090;
                                        break;
                                    case -1381045677:
                                    case -145828918:
                                        if (C13473.f42873 != 0) {
                                            iM2767 = (i34 - C0773.m3169("۬ۜ")) * 75;
                                            i36 = ((iM2767 ^ i35) * (-24479)) ^ (-477434262);
                                            i37 = -1355854785;
                                        } else {
                                            iM2767 = C0773.m3169("۫ᩴ") ^ i34;
                                            i36 = ((iM2767 ^ i35) * 2977) ^ (-204804635);
                                            i37 = 925970029;
                                        }
                                        break;
                                    case -1211742773:
                                    case -241598244:
                                        if (RunnableC1848.m6360()) {
                                            iM2767 = C0773.m3169("۠ܺ") ^ i35;
                                            i36 = ((iM2767 ^ i34) * (-18235)) ^ (-1614050197);
                                            i37 = 1495076090;
                                        } else {
                                            iM2767 = C0619.m2761("ۨۖ") ^ i34;
                                            i36 = ((iM2767 ^ i35) * 27109) ^ 319748721;
                                            i37 = 1718373736;
                                        }
                                        break;
                                    case -1151011004:
                                    case 2090052768:
                                        if (C3448.f11240 >= 0) {
                                            iM2767 = (i34 - C0773.m3169("۠ۘ")) * (-57);
                                            i36 = ((iM2767 ^ i35) * 3949) ^ 658224931;
                                            i37 = -370877003;
                                        } else {
                                            iM2767 = (C0773.m3169("ۤܳ") ^ i35) * (-105);
                                            i36 = ((iM2767 ^ i34) * 27833) ^ (-749827067);
                                            i37 = 1168276623;
                                        }
                                        break;
                                    case -798244712:
                                    case -63654520:
                                        if (C20932.m47848() != 0) {
                                            iM2767 = (C0773.m3169("۟᩷") ^ i35) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i36 = ((iM2767 ^ i34) * (-22805)) ^ 1187513188;
                                            i37 = 1275595939;
                                        } else {
                                            iM2767 = (i34 - C0773.m3169("۬ۜ")) * 75;
                                            i36 = ((iM2767 ^ i35) * (-24479)) ^ (-477434262);
                                            i37 = -1355854785;
                                        }
                                        break;
                                    case -673725148:
                                    case 1582488007:
                                        return;
                                    case -604622012:
                                    case 1590940457:
                                        if (C2419.f7754 >= 0) {
                                            iM2767 = C0773.m3169("ᩳܰ") ^ i35;
                                            i36 = ((iM2767 ^ i34) * 4023) ^ 660064963;
                                            i37 = 253127610;
                                        } else {
                                            iM2767 = (C0619.m2761("ۚ۬") + i35) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i36 = ((iM2767 ^ i34) * 1591) ^ 25975245;
                                            i37 = 1324032857;
                                        }
                                        break;
                                    case -420857668:
                                    case 126163824:
                                        if (C1343.f4799 != 0) {
                                            iM2767 = (i34 - C0773.m3169("۬ۜ")) * 75;
                                            i36 = ((iM2767 ^ i35) * (-24479)) ^ (-477434262);
                                            i37 = -1355854785;
                                        } else {
                                            iM2767 = C0773.m3169("۠ܺ") ^ i35;
                                            i36 = ((iM2767 ^ i34) * (-18235)) ^ (-1614050197);
                                            i37 = 1495076090;
                                        }
                                        break;
                                    case 157051991:
                                    case 1406463331:
                                        if (C3492.f12043 <= 0) {
                                            iM2767 = (C0773.m3169("۟᩷") ^ i35) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i36 = ((iM2767 ^ i34) * (-22805)) ^ 1187513188;
                                            i37 = 1275595939;
                                        } else {
                                            iM2767 = (C0619.m2761("֫֨") + i35) * (-33);
                                            i36 = ((iM2767 ^ i34) * 817) ^ (-940845350);
                                            i37 = 27908638;
                                        }
                                        break;
                                    case 277875999:
                                    case 390576869:
                                        if (RunnableC1848.f6235) {
                                            iM2767 = C0773.m3169("ᩳܰ") ^ i35;
                                            i36 = ((iM2767 ^ i34) * 4023) ^ 660064963;
                                            i37 = 253127610;
                                        } else {
                                            iM2767 = (C0619.m2761("᩻᩵") + i34) * 79;
                                            i36 = ((iM2767 ^ i35) * (-779)) ^ 1613016595;
                                            i37 = -199801813;
                                        }
                                        break;
                                    case 566892770:
                                    case 1081093930:
                                        if (!C3077.m10041()) {
                                            iM2767 = C0773.m3169("۠ܺ") ^ i35;
                                            i36 = ((iM2767 ^ i34) * (-18235)) ^ (-1614050197);
                                            i37 = 1495076090;
                                        } else {
                                            iM2767 = (i34 - C0773.m3169("۠ۘ")) * (-57);
                                            i36 = ((iM2767 ^ i35) * 3949) ^ 658224931;
                                            i37 = -370877003;
                                        }
                                        break;
                                    case 825351418:
                                    case 1431053491:
                                        if (RunnableC1848.f6235) {
                                            iM2767 = (i34 - C0773.m3169("۠ۘ")) * (-57);
                                            i36 = ((iM2767 ^ i35) * 3949) ^ 658224931;
                                            i37 = -370877003;
                                        } else {
                                            iM2767 = C0773.m3169("ۨᩴ") ^ i34;
                                            i36 = ((iM2767 ^ i35) * 24841) ^ (-1258317296);
                                            i37 = -545180625;
                                        }
                                        break;
                                    case 1444927263:
                                    case 1809254940:
                                        if (C3099.f10023 <= 0) {
                                            iM2767 = C0773.m3169("۠ܺ") ^ i35;
                                            i36 = ((iM2767 ^ i34) * (-18235)) ^ (-1614050197);
                                            i37 = 1495076090;
                                        } else {
                                            iM2767 = C0619.m2761("ۢ۠") ^ i35;
                                            i36 = ((iM2767 ^ i34) * (-13883)) ^ (-1334786839);
                                            i37 = 1756891594;
                                        }
                                        break;
                                    default:
                                        this.f59397 = viewOnClickListenerC7793;
                                        if (C4282.f15546 <= 0) {
                                            iM2767 = (i34 - C0773.m3169("۬ۜ")) * 75;
                                            i36 = ((iM2767 ^ i35) * (-24479)) ^ (-477434262);
                                            i37 = -1355854785;
                                        } else {
                                            iM2767 = (C0619.m2761("ۢۛ") ^ i34) * 11;
                                            i36 = ((iM2767 ^ i35) * 23401) ^ 714690384;
                                            i37 = 187866531;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:19:0x00a1  */
                        /* JADX WARN: Code duplicated, block: B:40:0x0183 A[PHI: r5 r10 r11
                          0x0183: PHI (r5v4 java.lang.String) = (r5v3 java.lang.String), (r5v2 java.lang.String), (r5v2 java.lang.String) binds: [B:39:0x0181, B:20:0x00b9, B:17:0x009d] A[DONT_GENERATE, DONT_INLINE]
                          0x0183: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:39:0x0181, B:20:0x00b9, B:17:0x009d] A[DONT_GENERATE, DONT_INLINE]
                          0x0183: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:39:0x0181, B:20:0x00b9, B:17:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:48:0x020c A[PHI: r2 r3 r9 r12 r13 r22 r23 r28
                          0x020c: PHI (r2v6 l.۟ۢ֫) = (r2v2 l.۟ۢ֫), (r2v3 l.۟ۢ֫), (r2v2 l.۟ۢ֫), (r2v2 l.۟ۢ֫) binds: [B:96:0x020c, B:47:0x020a, B:30:0x010d, B:14:0x0098] A[DONT_GENERATE, DONT_INLINE]
                          0x020c: PHI (r3v5 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:96:0x020c, B:47:0x020a, B:30:0x010d, B:14:0x0098] A[DONT_GENERATE, DONT_INLINE]
                          0x020c: PHI (r9v5 l.ۖۖۧ) = (r9v2 l.ۖۖۧ), (r9v2 l.ۖۖۧ), (r9v3 l.ۖۖۧ), (r9v2 l.ۖۖۧ) binds: [B:96:0x020c, B:47:0x020a, B:30:0x010d, B:14:0x0098] A[DONT_GENERATE, DONT_INLINE]
                          0x020c: PHI (r12v5 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:96:0x020c, B:47:0x020a, B:30:0x010d, B:14:0x0098] A[DONT_GENERATE, DONT_INLINE]
                          0x020c: PHI (r13v5 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:96:0x020c, B:47:0x020a, B:30:0x010d, B:14:0x0098] A[DONT_GENERATE, DONT_INLINE]
                          0x020c: PHI (r22v5 short[]) = (r22v2 short[]), (r22v3 short[]), (r22v2 short[]), (r22v2 short[]) binds: [B:96:0x020c, B:47:0x020a, B:30:0x010d, B:14:0x0098] A[DONT_GENERATE, DONT_INLINE]
                          0x020c: PHI (r23v5 int) = (r23v2 int), (r23v3 int), (r23v2 int), (r23v2 int) binds: [B:96:0x020c, B:47:0x020a, B:30:0x010d, B:14:0x0098] A[DONT_GENERATE, DONT_INLINE]
                          0x020c: PHI (r28v6 int) = (r28v3 int), (r28v4 int), (r28v3 int), (r28v3 int) binds: [B:96:0x020c, B:47:0x020a, B:30:0x010d, B:14:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            short[] sArr3;
                            int i33;
                            int iM2767;
                            int i34;
                            int i35;
                            short s;
                            short[] sArr4;
                            int i36;
                            short[] sArr5;
                            int iM31620;
                            int i37;
                            int i38;
                            int iM31621;
                            int i39;
                            ViewOnClickListenerC7793 viewOnClickListenerC7794;
                            ViewOnClickListenerC18169 viewOnClickListenerC18169 = this;
                            int i40 = 74533295;
                            int i41 = C1321.f4751;
                            int i42 = C20932.f66974;
                            int iM31622 = C0773.m3169("֡ᩳ") ^ i41;
                            int i43 = ((iM31622 ^ i42) * 14715) ^ (-708849996);
                            int i44 = iM31622 ^ 601326157;
                            String strM6246 = null;
                            String strM12271 = null;
                            C2361 c2361M3794 = null;
                            short[] sArr6 = null;
                            short[] sArr7 = null;
                            short[] sArr8 = null;
                            short s2 = 0;
                            final ViewOnClickListenerC7793 viewOnClickListenerC7795 = null;
                            int i45 = 0;
                            int i46 = 0;
                            int i47 = 0;
                            int i48 = 0;
                            short s3 = 0;
                            int i49 = 0;
                            int iM2768 = 0;
                            int i50 = 0;
                            int i51 = 0;
                            int i52 = 0;
                            CharSequence[] charSequenceArr = null;
                            short[] sArr9 = null;
                            int i53 = 0;
                            String strM6247 = null;
                            int iM2769 = 0;
                            while (true) {
                                i40 = i44 ^ (i43 & (((i40 ^ i42) * (-31647)) >> 31));
                                switch (i40) {
                                    case -2058381884:
                                    case 41979316:
                                        sArr4 = sArr9;
                                        i36 = i51;
                                        int i54 = i53;
                                        viewOnClickListenerC7795 = viewOnClickListenerC7795;
                                        i49 = i49;
                                        sArr5 = sArr6;
                                        i53 = i54;
                                        s = f59396[0];
                                        s3 = 14858;
                                        if (RunnableC0334.m2063()) {
                                            iM31620 = C0773.m3169("֨᩸") ^ i42;
                                            s2 = s;
                                            i37 = ((iM31620 ^ i41) * 28097) ^ 1739321411;
                                            i38 = 1065916647;
                                        } else {
                                            iM31620 = C0773.m3169("֨ܺ") ^ i41;
                                            s2 = s;
                                            i37 = ((iM31620 ^ i42) * 25149) ^ 362612207;
                                            i38 = -900489958;
                                        }
                                        int i55 = iM31620 ^ i38;
                                        i51 = i36;
                                        sArr9 = sArr4;
                                        i44 = i55;
                                        i43 = i37;
                                        viewOnClickListenerC18169 = this;
                                        short[] sArr10 = sArr5;
                                        i49 = i49;
                                        viewOnClickListenerC7795 = viewOnClickListenerC7795;
                                        i53 = i53;
                                        sArr6 = sArr10;
                                        break;
                                    case -1944678530:
                                    case -1533242172:
                                        strM12271 = C3779.m12271(viewOnClickListenerC7795, i45);
                                        sArr7 = f59396;
                                        i46 = 7;
                                        if (C3033.f9831 >= 0) {
                                            iM2767 = (C0619.m2761("֫֫") ^ i42) * (-53);
                                            i34 = ((iM2767 ^ i41) * (-17397)) ^ (-1971262149);
                                            i35 = -467730419;
                                        } else {
                                            iM2767 = (C0773.m3169("ܺۗ") + i42) * (-75);
                                            i34 = ((iM2767 ^ i41) * (-11733)) ^ 722511844;
                                            i35 = -1864502359;
                                        }
                                        i44 = iM2767 ^ i35;
                                        i43 = i34;
                                        break;
                                    case -1704301085:
                                    case -1219847492:
                                        short[] sArr11 = sArr9;
                                        i33 = i51;
                                        int i56 = i52;
                                        int iM31623 = C0773.m3169(C0487.m2361(sArr11, i33, i56, i48)) ^ 2099446761;
                                        if (C13473.m33144()) {
                                            int iM31624 = C0773.m3169("ۗܺ") ^ i41;
                                            i43 = ((iM31624 ^ i42) * 22075) ^ (-52906443);
                                            i52 = i56;
                                            i45 = iM31623;
                                            sArr9 = sArr11;
                                            i44 = iM31624 ^ 713984838;
                                            i51 = i33;
                                        } else {
                                            sArr3 = sArr11;
                                            i52 = i56;
                                            i45 = iM31623;
                                            viewOnClickListenerC7794 = viewOnClickListenerC7795;
                                            int iM27610 = (C0619.m2761("ۤۘ") + i41) * 43;
                                            i51 = i33;
                                            sArr9 = sArr3;
                                            i44 = iM27610 ^ 816162592;
                                            i43 = ((iM27610 ^ i42) * 26621) ^ 907485142;
                                            viewOnClickListenerC7795 = viewOnClickListenerC7794;
                                            i53 = i53;
                                            viewOnClickListenerC18169 = this;
                                        }
                                        break;
                                    case -1669693601:
                                    case 356817330:
                                        C2878.m9491();
                                        if (C11235.f35427 >= 0) {
                                            sArr3 = sArr9;
                                            i33 = i51;
                                            viewOnClickListenerC7794 = viewOnClickListenerC7795;
                                            int iM27611 = (C0619.m2761("ۤۘ") + i41) * 43;
                                            i51 = i33;
                                            sArr9 = sArr3;
                                            i44 = iM27611 ^ 816162592;
                                            i43 = ((iM27611 ^ i42) * 26621) ^ 907485142;
                                            viewOnClickListenerC7795 = viewOnClickListenerC7794;
                                            i53 = i53;
                                            viewOnClickListenerC18169 = this;
                                        } else {
                                            iM2767 = C0619.m2761("ۘۖ") ^ i41;
                                            i34 = ((iM2767 ^ i42) * 2551) ^ (-972849072);
                                            i35 = -679996254;
                                            i44 = iM2767 ^ i35;
                                            i43 = i34;
                                        }
                                        break;
                                    case -1636294216:
                                    case 836135410:
                                        final C20472 c20473 = c20472;
                                        c2361M3794.m8013(charSequenceArr, -1, new DialogInterface.OnClickListener() { // from class: l.ۙᩳ֫
                                            {
                                                int i57 = -860003532;
                                                int i58 = C3492.f12043;
                                                int i59 = C2966.f9654;
                                                int iM31625 = C0773.m3169("֡۬") ^ i59;
                                                int i60 = ((iM31625 ^ i58) * 28801) ^ 1872486137;
                                                int i61 = 1853865534;
                                                while (true) {
                                                    i57 = ((((i57 ^ i58) * 12681) >> 31) & i60) ^ (iM31625 ^ i61);
                                                    switch (i57) {
                                                        case -1956300489:
                                                        case 874316448:
                                                            C0487.m2356();
                                                            iM31625 = C0773.m3169("۠ۡ") ^ i59;
                                                            i60 = ((iM31625 ^ i58) * 5501) ^ (-1393964804);
                                                            i61 = -323468196;
                                                            break;
                                                        case -1935870354:
                                                        case -360596343:
                                                            if (C1080.m4050()) {
                                                                iM31625 = C0773.m3169("֨۠") ^ i58;
                                                                i60 = ((iM31625 ^ i59) * (-4523)) ^ (-1802842305);
                                                                i61 = -306326596;
                                                            } else {
                                                                iM31625 = (C0619.m2761("֨֡") + i59) * 75;
                                                                i60 = ((iM31625 ^ i58) * 16049) ^ 398997087;
                                                                i61 = 927268853;
                                                            }
                                                            break;
                                                        case -1759445314:
                                                        case 1725524150:
                                                            if (C0773.f2792 <= 0) {
                                                                iM31625 = C0619.m2761("ܳۧ") ^ i58;
                                                                i60 = ((iM31625 ^ i59) * (-9247)) ^ 1141941052;
                                                                i61 = -1024595796;
                                                            } else {
                                                                iM31625 = C0773.m3169("ۘۗ") ^ i58;
                                                                i60 = ((iM31625 ^ i59) * 25583) ^ 1871594178;
                                                                i61 = -596327934;
                                                            }
                                                            break;
                                                        case -1202715730:
                                                        case -342082471:
                                                            if (RunnableC0334.f1808 <= 0) {
                                                                iM31625 = C0619.m2761("ܳۧ") ^ i58;
                                                                i60 = ((iM31625 ^ i59) * (-9247)) ^ 1141941052;
                                                                i61 = -1024595796;
                                                            } else {
                                                                iM31625 = (C0773.m3169("ۗܿ") ^ i58) * (-9);
                                                                i60 = ((iM31625 ^ i59) * (-14287)) ^ (-717606252);
                                                                i61 = -1837584682;
                                                            }
                                                            break;
                                                        case -1189446219:
                                                        case -429452672:
                                                            if (C0862.m3503()) {
                                                                iM31625 = (C0773.m3169("۫ۡ") ^ i59) * 53;
                                                                i60 = ((iM31625 ^ i58) * (-18419)) ^ 1173951704;
                                                                i61 = -508985745;
                                                            } else {
                                                                iM31625 = C0773.m3169("۫ܳ") ^ i58;
                                                                i60 = ((iM31625 ^ i59) * 13089) ^ 2104858535;
                                                                i61 = -249337730;
                                                            }
                                                            break;
                                                        case -1109504293:
                                                        case 933689293:
                                                            if (C1080.m4050()) {
                                                                iM31625 = (C0773.m3169("ۢ֫") + i59) * (-67);
                                                                i60 = ((iM31625 ^ i58) * (-5799)) ^ (-2039484488);
                                                                i61 = 1500485417;
                                                            } else {
                                                                iM31625 = C0773.m3169("۠ۡ") ^ i59;
                                                                i60 = ((iM31625 ^ i58) * 5501) ^ (-1393964804);
                                                                i61 = -323468196;
                                                            }
                                                            break;
                                                        case -944661362:
                                                        case -211759466:
                                                            if (C0773.m3161() != 0) {
                                                                iM31625 = (C0619.m2761("֨֡") + i59) * 75;
                                                                i60 = ((iM31625 ^ i58) * 16049) ^ 398997087;
                                                                i61 = 927268853;
                                                            } else {
                                                                iM31625 = C0773.m3169("ܰۢ") ^ i58;
                                                                i60 = ((iM31625 ^ i59) * (-24567)) ^ (-1916101047);
                                                                i61 = 299096058;
                                                            }
                                                            break;
                                                        case -813530060:
                                                        case 436549197:
                                                            if (C3448.f11240 >= 0) {
                                                                iM31625 = C0619.m2761("ܳۧ") ^ i58;
                                                                i60 = ((iM31625 ^ i59) * (-9247)) ^ 1141941052;
                                                                i61 = -1024595796;
                                                            } else {
                                                                iM31625 = (i59 - C0619.m2761("ܿ᩺")) * (-95);
                                                                i60 = ((iM31625 ^ i58) * (-28667)) ^ 598085122;
                                                                i61 = 1024343494;
                                                            }
                                                            break;
                                                        case -794979664:
                                                        case 36023937:
                                                            if (C3690.f12684 <= 0) {
                                                                iM31625 = C0619.m2761("᩸ۘ") ^ i58;
                                                                i60 = ((iM31625 ^ i59) * (-13339)) ^ (-298701499);
                                                                i61 = 669558025;
                                                            } else {
                                                                iM31625 = (C0619.m2761("۫ۧ") + i59) * (-23);
                                                                i60 = ((iM31625 ^ i58) * (-5749)) ^ (-415337157);
                                                                i61 = -1044462456;
                                                            }
                                                            break;
                                                        case -786722191:
                                                        case 1205506579:
                                                            if (C1519.f5300 < 0) {
                                                                iM31625 = C0773.m3169("۫ܳ") ^ i58;
                                                                i60 = ((iM31625 ^ i59) * 13089) ^ 2104858535;
                                                                i61 = -249337730;
                                                            } else {
                                                                iM31625 = (C0619.m2761("֨֡") + i59) * 75;
                                                                i60 = ((iM31625 ^ i58) * 16049) ^ 398997087;
                                                                i61 = 927268853;
                                                            }
                                                            break;
                                                        case -567291231:
                                                        case 760859457:
                                                            return;
                                                        case -489346785:
                                                        case 1848041562:
                                                            C0269.m1775();
                                                            if (C2023.m6964() <= 0) {
                                                                iM31625 = (C0619.m2761("֨֡") + i59) * 75;
                                                                i60 = ((iM31625 ^ i58) * 16049) ^ 398997087;
                                                                i61 = 927268853;
                                                            } else {
                                                                iM31625 = C0773.m3169("۠ۡ") ^ i59;
                                                                i60 = ((iM31625 ^ i58) * 5501) ^ (-1393964804);
                                                                i61 = -323468196;
                                                            }
                                                            break;
                                                        case -28575411:
                                                        case 1780208104:
                                                            if (C1080.f3865 >= 0) {
                                                                iM31625 = C0619.m2761("᩸ۘ") ^ i58;
                                                                i60 = ((iM31625 ^ i59) * (-13339)) ^ (-298701499);
                                                                i61 = 669558025;
                                                            } else {
                                                                iM31625 = C0773.m3169("ܿᩳ") ^ i59;
                                                                i60 = ((iM31625 ^ i58) * 18191) ^ 2020273717;
                                                                i61 = 625950073;
                                                            }
                                                            break;
                                                        case 598711487:
                                                        case 1119144558:
                                                            if (C1343.f4799 != 0) {
                                                                iM31625 = C0773.m3169("۫ܳ") ^ i58;
                                                                i60 = ((iM31625 ^ i59) * 13089) ^ 2104858535;
                                                                i61 = -249337730;
                                                            } else {
                                                                iM31625 = C0773.m3169("᩻۟") ^ i58;
                                                                i60 = ((iM31625 ^ i59) * (-28325)) ^ (-1509854164);
                                                                i61 = -1372853802;
                                                            }
                                                            break;
                                                        case 1070009057:
                                                        case 1138658163:
                                                            if (!RunnableC3646.f12471) {
                                                                iM31625 = C0619.m2761("᩸ۘ") ^ i58;
                                                                i60 = ((iM31625 ^ i59) * (-13339)) ^ (-298701499);
                                                                i61 = 669558025;
                                                            } else {
                                                                iM31625 = C0773.m3169("۠ۡ") ^ i59;
                                                                i60 = ((iM31625 ^ i58) * 5501) ^ (-1393964804);
                                                                i61 = -323468196;
                                                            }
                                                            break;
                                                        default:
                                                            C0950.m3785();
                                                            RunnableC0334.m2063();
                                                            throw new RuntimeException();
                                                    }
                                                }
                                            }

                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i57) {
                                                int i58 = 1651138094;
                                                int i59 = C2419.f7754;
                                                int i60 = C3492.f12043;
                                                int iM27612 = C0619.m2761("ᩳ۠") ^ i60;
                                                int i61 = ((iM27612 ^ i59) * 1975) ^ (-1652174055);
                                                int i62 = -1785537097;
                                                while (true) {
                                                    i58 = ((((i58 ^ i59) * (-4931)) >> 31) & i61) ^ (iM27612 ^ i62);
                                                    switch (i58) {
                                                        case -2040038477:
                                                        case -1594998744:
                                                            if (C1080.m4050()) {
                                                                iM27612 = (C0619.m2761("֡ۨ") ^ i60) * (-29);
                                                                i61 = ((iM27612 ^ i59) * 3201) ^ (-586225644);
                                                                i62 = 630824107;
                                                            } else {
                                                                iM27612 = (i59 - C0773.m3169("ܰ֫")) * 15;
                                                                i61 = ((iM27612 ^ i60) * 14767) ^ (-285816803);
                                                                i62 = -1466398962;
                                                            }
                                                            break;
                                                        case -1879333127:
                                                        case 1730599521:
                                                            C11235.m28309();
                                                            C2966.m9664();
                                                            break;
                                                        case -1736123423:
                                                        case -1384852171:
                                                            if (C2966.f9654 >= 0) {
                                                                iM27612 = C0773.m3169("ܰۢ") ^ i60;
                                                                i61 = ((iM27612 ^ i59) * 7871) ^ (-818932348);
                                                                i62 = 2142439897;
                                                            } else {
                                                                iM27612 = C0619.m2761("ۨ᩶") ^ i59;
                                                                i61 = ((iM27612 ^ i60) * (-3471)) ^ (-277499069);
                                                                i62 = -2079365730;
                                                            }
                                                            break;
                                                        case -1713754300:
                                                        case -478797193:
                                                            if (RunnableC0334.f1808 <= 0) {
                                                                iM27612 = (C0619.m2761("ۢ֫") ^ i59) * (-99);
                                                                i61 = ((iM27612 ^ i60) * (-12475)) ^ 915736233;
                                                                i62 = -2139586446;
                                                            } else {
                                                                iM27612 = (C0773.m3169("֡֫") ^ i60) * (-93);
                                                                i61 = ((iM27612 ^ i59) * 18733) ^ 1731913605;
                                                                i62 = 1976096646;
                                                            }
                                                            break;
                                                        case -1711252247:
                                                        case 1816490146:
                                                            if (C1146.f4234 >= 0) {
                                                                iM27612 = (i59 - C0773.m3169("ܰ֫")) * 15;
                                                                i61 = ((iM27612 ^ i60) * 14767) ^ (-285816803);
                                                                i62 = -1466398962;
                                                            } else {
                                                                iM27612 = C0773.m3169("֨ۙ") ^ i60;
                                                                i61 = ((iM27612 ^ i59) * 18997) ^ 1462357506;
                                                                i62 = 1959850137;
                                                            }
                                                            break;
                                                        case -1668842738:
                                                        case 412649932:
                                                            if (C2287.m7745() <= 0) {
                                                                iM27612 = C0773.m3169("ܰۢ") ^ i60;
                                                                i61 = ((iM27612 ^ i59) * 7871) ^ (-818932348);
                                                                i62 = 2142439897;
                                                            } else {
                                                                iM27612 = C0619.m2761("ۘ۟") ^ i59;
                                                                i61 = ((iM27612 ^ i60) * (-19431)) ^ (-393889850);
                                                                i62 = -2212070;
                                                            }
                                                            break;
                                                        case -1533847382:
                                                        case 1450079471:
                                                            C3690.m11987();
                                                            C1783.m6232();
                                                            iM27612 = C0773.m3169("֨ۙ") ^ i60;
                                                            i61 = ((iM27612 ^ i59) * 18997) ^ 1462357506;
                                                            i62 = 1959850137;
                                                            break;
                                                        case -1446288870:
                                                        case -1182253275:
                                                            C1321.m4852();
                                                            if (C2834.f9334 > 0) {
                                                                iM27612 = C0773.m3169("ܰۢ") ^ i60;
                                                                i61 = ((iM27612 ^ i59) * 7871) ^ (-818932348);
                                                                i62 = 2142439897;
                                                            } else {
                                                                iM27612 = C0773.m3169("֨ۙ") ^ i60;
                                                                i61 = ((iM27612 ^ i59) * 18997) ^ 1462357506;
                                                                i62 = 1959850137;
                                                            }
                                                            break;
                                                        case -1442906097:
                                                        case -1121434756:
                                                            if (C3492.m11488()) {
                                                                iM27612 = (C0773.m3169("ۛܿ") ^ i59) * (-11);
                                                                i61 = ((iM27612 ^ i60) * 13803) ^ 2012113525;
                                                                i62 = 1328666849;
                                                            } else {
                                                                iM27612 = (i59 - C0773.m3169("ܰ֫")) * 15;
                                                                i61 = ((iM27612 ^ i60) * 14767) ^ (-285816803);
                                                                i62 = -1466398962;
                                                            }
                                                            break;
                                                        case -1372399948:
                                                        case 611270255:
                                                            if (C2485.m8357() <= 0) {
                                                                iM27612 = (C0619.m2761("ۢ֫") ^ i59) * (-99);
                                                                i61 = ((iM27612 ^ i60) * (-12475)) ^ 915736233;
                                                                i62 = -2139586446;
                                                            } else {
                                                                iM27612 = (i59 - C0773.m3169("ܰ֫")) * 15;
                                                                i61 = ((iM27612 ^ i60) * 14767) ^ (-285816803);
                                                                i62 = -1466398962;
                                                            }
                                                            break;
                                                        case -1256064499:
                                                        case -899943921:
                                                            if (C0269.m1775() <= 0) {
                                                                iM27612 = (i59 - C0773.m3169("ܰ֫")) * 15;
                                                                i61 = ((iM27612 ^ i60) * 14767) ^ (-285816803);
                                                                i62 = -1466398962;
                                                            } else {
                                                                iM27612 = C0619.m2761("ۙ᩷") ^ i60;
                                                                i61 = ((iM27612 ^ i59) * 2801) ^ (-230841873);
                                                                i62 = -1888417415;
                                                            }
                                                            break;
                                                        case -928144286:
                                                        case 1981198898:
                                                            ViewOnClickListenerC7793.m21202(viewOnClickListenerC7795, c20473, dialogInterface, i57);
                                                            break;
                                                        case -81487145:
                                                        case 1842349639:
                                                            if (C2419.f7754 >= 0) {
                                                                iM27612 = (C0619.m2761("ۢ֫") ^ i59) * (-99);
                                                                i61 = ((iM27612 ^ i60) * (-12475)) ^ 915736233;
                                                                i62 = -2139586446;
                                                            } else {
                                                                iM27612 = C0773.m3169("ܳܶ") ^ i59;
                                                                i61 = ((iM27612 ^ i60) * (-24563)) ^ 1170640275;
                                                                i62 = 296552621;
                                                            }
                                                            break;
                                                        case 209212570:
                                                        case 1873897124:
                                                            if (C0773.f2792 <= 0) {
                                                                iM27612 = (C0619.m2761("᩶ۗ") + i60) * (-95);
                                                                i61 = ((iM27612 ^ i59) * 10193) ^ (-973849733);
                                                                i62 = 947533470;
                                                            } else {
                                                                iM27612 = C0619.m2761("۬ۨ") ^ i60;
                                                                i61 = ((iM27612 ^ i59) * (-30947)) ^ 2094695248;
                                                                i62 = -1173798470;
                                                            }
                                                            break;
                                                        case 400829796:
                                                        case 1417666141:
                                                            if (C1542.f5343 <= 0) {
                                                                iM27612 = (C0619.m2761("᩶ۗ") + i60) * (-95);
                                                                i61 = ((iM27612 ^ i59) * 10193) ^ (-973849733);
                                                                i62 = 947533470;
                                                            } else {
                                                                iM27612 = (C0619.m2761("᩺۟") ^ i59) * (-113);
                                                                i61 = ((iM27612 ^ i60) * 9485) ^ 304038328;
                                                                i62 = -1303698573;
                                                            }
                                                            break;
                                                        default:
                                                            if (C1826.f6190 <= 0) {
                                                                iM27612 = (C0619.m2761("᩶ۗ") + i60) * (-95);
                                                                i61 = ((iM27612 ^ i59) * 10193) ^ (-973849733);
                                                                i62 = 947533470;
                                                            } else {
                                                                iM27612 = (i60 - C0773.m3169("ܳ۬")) * 25;
                                                                i61 = ((iM27612 ^ i59) * 8125) ^ 1399701099;
                                                                i62 = -1501492883;
                                                            }
                                                            break;
                                                    }
                                                    return;
                                                }
                                            }
                                        });
                                        C1321.m4860(c2361M3794);
                                        break;
                                    case -1453449046:
                                    case 102859178:
                                        C2485.m8345(c2361M3794, C0773.m3169(RunnableC0334.m2049(sArr8, i47, 3, i48)) ^ 2118610881);
                                        if (C2375.f7641 > 0) {
                                            iM2767 = (C0619.m2761("ۤۙ") ^ i41) * (-63);
                                            i34 = ((iM2767 ^ i42) * (-14115)) ^ (-587754443);
                                            i35 = 826365564;
                                            i44 = iM2767 ^ i35;
                                            i43 = i34;
                                        } else {
                                            s = s2;
                                            sArr4 = sArr9;
                                            i36 = i51;
                                            int i57 = i53;
                                            viewOnClickListenerC7795 = viewOnClickListenerC7795;
                                            i49 = i49;
                                            sArr5 = sArr6;
                                            i53 = i57;
                                            iM31620 = C0773.m3169("֨᩸") ^ i42;
                                            s2 = s;
                                            i37 = ((iM31620 ^ i41) * 28097) ^ 1739321411;
                                            i38 = 1065916647;
                                            int i58 = iM31620 ^ i38;
                                            i51 = i36;
                                            sArr9 = sArr4;
                                            i44 = i58;
                                            i43 = i37;
                                            viewOnClickListenerC18169 = this;
                                            short[] sArr12 = sArr5;
                                            i49 = i49;
                                            viewOnClickListenerC7795 = viewOnClickListenerC7795;
                                            i53 = i53;
                                            sArr6 = sArr12;
                                        }
                                        break;
                                    case -1398587488:
                                    case 1825305843:
                                        sArr9 = sArr9;
                                        i51 = i51;
                                        int i59 = i53;
                                        viewOnClickListenerC7795 = viewOnClickListenerC7795;
                                        i49 = i49;
                                        sArr5 = sArr6;
                                        i53 = i59;
                                        int i60 = s2 + s3;
                                        if ((i60 * i60) - (59432 * s2) < 0) {
                                            iM31621 = C0619.m2761("ۘܳ") ^ i42;
                                            i43 = ((iM31621 ^ i41) * (-6099)) ^ 2122841591;
                                            i39 = 1297337340;
                                        } else {
                                            iM31621 = C0773.m3169("ܽۗ") ^ i42;
                                            i43 = ((iM31621 ^ i41) * 17661) ^ 1797235232;
                                            i39 = 1915448512;
                                        }
                                        int i61 = iM31621 ^ i39;
                                        i51 = i51;
                                        sArr9 = sArr9;
                                        i44 = i61;
                                        viewOnClickListenerC18169 = this;
                                        short[] sArr13 = sArr5;
                                        i49 = i49;
                                        viewOnClickListenerC7795 = viewOnClickListenerC7795;
                                        i53 = i53;
                                        sArr6 = sArr13;
                                        break;
                                    case -1378502848:
                                    case 1600442991:
                                        int i62 = i53;
                                        short[] sArr14 = sArr6;
                                        sArr4 = sArr9;
                                        i36 = i51;
                                        viewOnClickListenerC7795 = viewOnClickListenerC7795;
                                        i49 = i49;
                                        iM2768 = C0619.m2761(C3033.m9847(sArr14, i62, i49, i48));
                                        i50 = 2119264187;
                                        if (C3734.f12817 < 0) {
                                            int iM31625 = C0773.m3169("ᩳܿ") ^ i42;
                                            int i63 = ((iM31625 ^ i41) * 26353) ^ 1961014124;
                                            i51 = i36;
                                            sArr9 = sArr4;
                                            i44 = iM31625 ^ (-1738607655);
                                            i49 = i49;
                                            viewOnClickListenerC7795 = viewOnClickListenerC7795;
                                            i53 = i62;
                                            sArr6 = sArr14;
                                            i43 = i63;
                                            viewOnClickListenerC18169 = this;
                                        } else {
                                            i53 = i62;
                                            sArr5 = sArr14;
                                            s = s2;
                                            iM31620 = C0773.m3169("֨᩸") ^ i42;
                                            s2 = s;
                                            i37 = ((iM31620 ^ i41) * 28097) ^ 1739321411;
                                            i38 = 1065916647;
                                            int i510 = iM31620 ^ i38;
                                            i51 = i36;
                                            sArr9 = sArr4;
                                            i44 = i510;
                                            i43 = i37;
                                            viewOnClickListenerC18169 = this;
                                            short[] sArr15 = sArr5;
                                            i49 = i49;
                                            viewOnClickListenerC7795 = viewOnClickListenerC7795;
                                            i53 = i53;
                                            sArr6 = sArr15;
                                        }
                                        break;
                                    case -1365203756:
                                    case 1738528802:
                                        i48 = 52198;
                                        iM31621 = (i41 - C0619.m2761("ᩳ᩸")) * (-121);
                                        sArr5 = sArr6;
                                        i43 = ((iM31621 ^ i42) * 12685) ^ (-83455333);
                                        i39 = 416935905;
                                        int i64 = iM31621 ^ i39;
                                        i51 = i51;
                                        sArr9 = sArr9;
                                        i44 = i64;
                                        viewOnClickListenerC18169 = this;
                                        short[] sArr16 = sArr5;
                                        i49 = i49;
                                        viewOnClickListenerC7795 = viewOnClickListenerC7795;
                                        i53 = i53;
                                        sArr6 = sArr16;
                                        break;
                                    case -1299120016:
                                    case 530542254:
                                        viewOnClickListenerC7795 = viewOnClickListenerC18169.f59397;
                                        strM6246 = C1783.m6246(viewOnClickListenerC7795, iM2768 ^ i50);
                                        sArr9 = f59396;
                                        i51 = 4;
                                        i52 = 3;
                                        if (AbstractC0116.f1064 <= 0) {
                                            iM2767 = C0619.m2761("ۘۖ") ^ i41;
                                            i34 = ((iM2767 ^ i42) * 2551) ^ (-972849072);
                                            i35 = -679996254;
                                        } else {
                                            iM2767 = C0619.m2761("ۤۧ") ^ i42;
                                            i34 = ((iM2767 ^ i41) * 5917) ^ (-1362903178);
                                            i35 = -1331267099;
                                        }
                                        i44 = iM2767 ^ i35;
                                        i43 = i34;
                                        break;
                                    case -1093712397:
                                    case 1536656251:
                                        viewOnClickListenerC7794 = viewOnClickListenerC7795;
                                        sArr3 = sArr9;
                                        i33 = i51;
                                        int i65 = ViewOnClickListenerC7793.f25871;
                                        sArr6 = f59396;
                                        i53 = 1;
                                        i49 = 3;
                                        if (C2834.m9344() >= 0) {
                                            int iM27612 = (C0619.m2761("ۤۘ") + i41) * 43;
                                            i51 = i33;
                                            sArr9 = sArr3;
                                            i44 = iM27612 ^ 816162592;
                                            i43 = ((iM27612 ^ i42) * 26621) ^ 907485142;
                                            viewOnClickListenerC7795 = viewOnClickListenerC7794;
                                            i53 = i53;
                                            viewOnClickListenerC18169 = this;
                                        } else {
                                            int iM27613 = C0619.m2761("ۚ᩻") ^ i41;
                                            viewOnClickListenerC18169 = this;
                                            i51 = i33;
                                            sArr9 = sArr3;
                                            i44 = iM27613 ^ 189630170;
                                            i43 = ((iM27613 ^ i42) * 18507) ^ (-263925446);
                                            viewOnClickListenerC7795 = viewOnClickListenerC7794;
                                            i53 = 1;
                                        }
                                        break;
                                    case -944312422:
                                    case -450336635:
                                        RunnableC3055.m9933();
                                        break;
                                    case -881379835:
                                    case 476961523:
                                        C13473.m33144();
                                        if (C0862.f3233 == 0) {
                                            iM2767 = (C0619.m2761("۫ܽ") + i42) * (-13);
                                            i34 = ((iM2767 ^ i41) * 24211) ^ (-2086971517);
                                            i35 = -303095968;
                                        } else {
                                            iM2767 = C0619.m2761("ۘۖ") ^ i41;
                                            i34 = ((iM2767 ^ i42) * 2551) ^ (-972849072);
                                            i35 = -679996254;
                                        }
                                        i44 = iM2767 ^ i35;
                                        i43 = i34;
                                        break;
                                    case -793376996:
                                    case 1046581333:
                                        C3099.m10095();
                                        iM2767 = (C0619.m2761("֫֫") ^ i42) * (-53);
                                        i34 = ((iM2767 ^ i41) * (-17397)) ^ (-1971262149);
                                        i35 = -467730419;
                                        i44 = iM2767 ^ i35;
                                        i43 = i34;
                                        break;
                                    case -689612169:
                                    case 1910509863:
                                        if (C20932.f66974 <= 0) {
                                            iM2767 = (C0619.m2761("֫֫") ^ i42) * (-53);
                                            i34 = ((iM2767 ^ i41) * (-17397)) ^ (-1971262149);
                                            i35 = -467730419;
                                        } else {
                                            iM2767 = (C0619.m2761("۫ܽ") + i42) * (-13);
                                            i34 = ((iM2767 ^ i41) * 24211) ^ (-2086971517);
                                            i35 = -303095968;
                                        }
                                        i44 = iM2767 ^ i35;
                                        i43 = i34;
                                        break;
                                    case -446665245:
                                    case 201060156:
                                        iM2769 = 2098077548 ^ C0619.m2761(C1564.m5510(sArr7, i46, 3, i48));
                                        if (RunnableC0334.f1808 > 0) {
                                            iM2767 = (C0773.m3169("֨ۜ") + i41) * (-99);
                                            i34 = ((iM2767 ^ i42) * (-31867)) ^ 1182536081;
                                            i35 = -668301395;
                                            i44 = iM2767 ^ i35;
                                            i43 = i34;
                                        } else {
                                            s = s2;
                                            sArr4 = sArr9;
                                            i36 = i51;
                                            int i511 = i53;
                                            viewOnClickListenerC7795 = viewOnClickListenerC7795;
                                            i49 = i49;
                                            sArr5 = sArr6;
                                            i53 = i511;
                                            iM31620 = C0773.m3169("֨᩸") ^ i42;
                                            s2 = s;
                                            i37 = ((iM31620 ^ i41) * 28097) ^ 1739321411;
                                            i38 = 1065916647;
                                            int i512 = iM31620 ^ i38;
                                            i51 = i36;
                                            sArr9 = sArr4;
                                            i44 = i512;
                                            i43 = i37;
                                            viewOnClickListenerC18169 = this;
                                            short[] sArr17 = sArr5;
                                            i49 = i49;
                                            viewOnClickListenerC7795 = viewOnClickListenerC7795;
                                            i53 = i53;
                                            sArr6 = sArr17;
                                        }
                                        break;
                                    case 203350251:
                                    case 1491551103:
                                        i48 = 16653;
                                        iM31621 = (i41 - C0619.m2761("ᩳ᩸")) * (-121);
                                        sArr5 = sArr6;
                                        i43 = ((iM31621 ^ i42) * 12685) ^ (-83455333);
                                        i39 = 416935905;
                                        int i66 = iM31621 ^ i39;
                                        i51 = i51;
                                        sArr9 = sArr9;
                                        i44 = i66;
                                        viewOnClickListenerC18169 = this;
                                        short[] sArr18 = sArr5;
                                        i49 = i49;
                                        viewOnClickListenerC7795 = viewOnClickListenerC7795;
                                        i53 = i53;
                                        sArr6 = sArr18;
                                        break;
                                    case 539290831:
                                    case 1146942246:
                                        charSequenceArr[2] = strM6247;
                                        c2361M3794 = C0950.m3794(viewOnClickListenerC7795);
                                        sArr8 = f59396;
                                        i47 = 10;
                                        if (C3690.m11987()) {
                                            iM2767 = C0619.m2761("ۘۖ") ^ i41;
                                            i34 = ((iM2767 ^ i42) * 2551) ^ (-972849072);
                                            i35 = -679996254;
                                        } else {
                                            iM2767 = C0619.m2761("ᩴᩳ") ^ i42;
                                            i34 = ((iM2767 ^ i41) * (-4803)) ^ 1515479485;
                                            i35 = 753796944;
                                        }
                                        i44 = iM2767 ^ i35;
                                        i43 = i34;
                                        break;
                                    default:
                                        strM6247 = C1783.m6246(viewOnClickListenerC7795, iM2769);
                                        charSequenceArr = new CharSequence[3];
                                        charSequenceArr[0] = strM6246;
                                        charSequenceArr[1] = strM12271;
                                        if (!C3779.m12264()) {
                                            sArr3 = sArr9;
                                            i33 = i51;
                                            viewOnClickListenerC7794 = viewOnClickListenerC7795;
                                            int iM27614 = (C0619.m2761("ۤۘ") + i41) * 43;
                                            i51 = i33;
                                            sArr9 = sArr3;
                                            i44 = iM27614 ^ 816162592;
                                            i43 = ((iM27614 ^ i42) * 26621) ^ 907485142;
                                            viewOnClickListenerC7795 = viewOnClickListenerC7794;
                                            i53 = i53;
                                            viewOnClickListenerC18169 = this;
                                        } else {
                                            iM2767 = C0619.m2761("᩺ܶ") ^ i41;
                                            i34 = ((iM2767 ^ i42) * (-19791)) ^ 480562827;
                                            i35 = -490268767;
                                            i44 = iM2767 ^ i35;
                                            i43 = i34;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    if (C2023.f6737) {
                        iM31610 = (C0619.m2761("᩷۟") + i15) * 75;
                        i4 = ((iM31610 ^ i16) * (-12583)) ^ (-882829859);
                        i5 = -1735297649;
                    } else {
                        iM31610 = C0619.m2761("ۜ᩸") ^ i15;
                        i4 = ((iM31610 ^ i16) * (-6271)) ^ (-1091873868);
                        i5 = -1894992212;
                    }
                    int i2113 = iM31610 ^ i5;
                    i21 = i21;
                    sArr2 = sArr2;
                    abstractC22044M1774 = abstractC22044M1774;
                    textView5 = textView5;
                    i18 = i2113;
                    i17 = i4;
                    str4 = str4;
                    viewM11247 = viewM11247;
                    abstractC22048 = abstractC22048;
                    str5 = str5;
                    break;
                case 461115753:
                case 1192799343:
                    textView = textView5;
                    abstractC22048 = abstractC22048;
                    abstractC22045 = abstractC22044M1774;
                    str = str5;
                    i3 = i21;
                    view = viewM11247;
                    sArr = sArr2;
                    C2878.m9483((TextView) viewM11246, C2702.m8878(packageInfo.versionCode));
                    C1564.m5520((TextView) C3448.m11246(viewM2812, C0773.m3169(AbstractC0641.m2820(f25870, 98, 3, i19)) ^ 2103424414), C8311.m22390(c20472.f65583));
                    strM11769 = AbstractC3624.m11769(f25870, 101, 3, i19);
                    if (C11235.f35427 >= 0) {
                        iM2762 = C0619.m2761("᩶۫") ^ i16;
                        i = ((iM2762 ^ i15) * (-1673)) ^ (-2128996064);
                        i13 = -1078731665;
                    } else {
                        iM2762 = (C0619.m2761("ۡۨ") ^ i16) * (-49);
                        i = ((iM2762 ^ i15) * (-15483)) ^ 1873499619;
                        i13 = 1231228806;
                    }
                    int i2114 = iM2762 ^ i13;
                    sArr2 = sArr;
                    i21 = i3;
                    viewM11247 = view;
                    abstractC22044M1774 = abstractC22045;
                    textView5 = textView;
                    i18 = i2114;
                    str5 = str;
                    i17 = i;
                    abstractC22048 = abstractC22048;
                    break;
                case 990330187:
                case 1338907778:
                    int i33 = i20;
                    TextView textView13 = (TextView) C2834.m9333(viewM2812, C0773.m3169(C1321.m4861(f25870, 169, 3, i19)) ^ 2125743958);
                    String strM4220 = C1146.m4220(abstractC22044M7806);
                    C23916.m53425(textView13, strM4220);
                    ViewOnClickListenerC15284.m36688(textView13);
                    C11235.m28299(textView13, new ViewOnClickListenerC22090(1, viewOnClickListenerC7793, strM4220));
                    i20 = i33;
                    iM3169 = (C0773.m3169("֡ܽ") ^ i16) * 71;
                    i = ((iM3169 ^ i15) * (-19729)) ^ 307308699;
                    i2 = 1828378223;
                    int i221 = iM3169 ^ i2;
                    str5 = str5;
                    abstractC22044M1774 = abstractC22044M1774;
                    i18 = i221;
                    i17 = i;
                    abstractC22048 = abstractC22048;
                    break;
                case 1003577896:
                case 1076068914:
                    C1826.m6301();
                    RunnableC1848.m6360();
                    break;
                case 1533778073:
                case 1565722430:
                    textView5 = textView5;
                    abstractC22048 = abstractC22048;
                    abstractC22044M1774 = abstractC22044M1774;
                    str5 = str5;
                    str4 = str4;
                    sArr2 = sArr2;
                    i21 = i21;
                    viewM11247 = viewM11247;
                    short s = f25870[79];
                    int i34 = s + 10267;
                    if ((i34 * i34) - (s * 41068) >= 0) {
                        iM31610 = C0619.m2761("᩹۠") ^ i16;
                        i4 = ((iM31610 ^ i15) * (-1531)) ^ 2088884687;
                        i5 = -669841364;
                    } else {
                        iM31610 = (i15 - C0773.m3169("᩶ۜ")) * 37;
                        i4 = ((iM31610 ^ i16) * 2963) ^ 2013238624;
                        i5 = -1531649082;
                    }
                    int i2115 = iM31610 ^ i5;
                    i21 = i21;
                    sArr2 = sArr2;
                    abstractC22044M1774 = abstractC22044M1774;
                    textView5 = textView5;
                    i18 = i2115;
                    i17 = i4;
                    str4 = str4;
                    viewM11247 = viewM11247;
                    abstractC22048 = abstractC22048;
                    str5 = str5;
                    break;
                case 1600490589:
                case 1967280958:
                    int i35 = DialogInterfaceC8327.f27315;
                    C2361 c2361 = new C2361(viewOnClickListenerC7793);
                    C4282.m13657(c2361, viewM2812);
                    abstractC22045 = abstractC22044M1774;
                    abstractC22048 = abstractC22048;
                    int i36 = i20;
                    C2419.m8168(c2361, C0619.m2761(C3734.m12149(f25870, 184, 3, i19)) ^ 2126372325, new DialogInterface.OnClickListener(viewOnClickListenerC7793) { // from class: l.ᩳ۟֫

                        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC7793 f61369;

                        {
                            int i37 = -731282859;
                            int i38 = C1080.f3865;
                            int i39 = AbstractC0116.f1064;
                            int iM2767 = (C0619.m2761("᩷ܽ") + i38) * (-81);
                            int i40 = ((iM2767 ^ i39) * 25529) ^ 1185597073;
                            int i41 = 1154121265;
                            while (true) {
                                i37 = ((((i37 ^ i39) * 6509) >> 31) & i40) ^ (iM2767 ^ i41);
                                switch (i37) {
                                    case -2112388557:
                                    case 1922737547:
                                        if (C2834.f9334 <= 0) {
                                            iM2767 = C0773.m3169("ᩳ۫") ^ i39;
                                            i40 = ((iM2767 ^ i38) * (-7725)) ^ 1655184824;
                                            i41 = 1083307202;
                                        } else {
                                            iM2767 = C0773.m3169("ۤ᩺") ^ i39;
                                            i40 = ((iM2767 ^ i38) * (-1029)) ^ 1222893340;
                                            i41 = -2020972597;
                                        }
                                        break;
                                    case -2110351563:
                                    case -162180204:
                                        if (C1826.m6301() >= 0) {
                                            iM2767 = C0773.m3169("ᩳ۫") ^ i39;
                                            i40 = ((iM2767 ^ i38) * (-7725)) ^ 1655184824;
                                            i41 = 1083307202;
                                        } else {
                                            iM2767 = C0773.m3169("ۨۤ") ^ i38;
                                            i40 = ((iM2767 ^ i39) * 12685) ^ 191896411;
                                            i41 = 314750794;
                                        }
                                        break;
                                    case -2087425439:
                                    case 172923595:
                                        if (C0269.f1558 <= 0) {
                                            iM2767 = C0773.m3169("ᩳ۫") ^ i39;
                                            i40 = ((iM2767 ^ i38) * (-7725)) ^ 1655184824;
                                            i41 = 1083307202;
                                        } else {
                                            iM2767 = C0773.m3169("֫ۚ") ^ i39;
                                            i40 = ((iM2767 ^ i38) * 10175) ^ (-365125135);
                                            i41 = 435527430;
                                        }
                                        break;
                                    case -1684519121:
                                    case -841631579:
                                        C17202.m40372();
                                        if (RunnableC3055.f9898 < 0) {
                                            iM2767 = (C0619.m2761("֫۬") ^ i39) * 71;
                                            i40 = ((iM2767 ^ i38) * 20219) ^ (-1252816829);
                                            i41 = 1604936524;
                                        } else {
                                            iM2767 = (i38 - C0773.m3169("ܿۧ")) * 101;
                                            i40 = ((iM2767 ^ i39) * (-3657)) ^ 1628028839;
                                            i41 = 733105988;
                                        }
                                        break;
                                    case -1531527260:
                                    case 761800903:
                                        C1826.m6301();
                                        C13473.m33144();
                                        throw new RuntimeException();
                                    case -1481337030:
                                    case 1621876357:
                                        C0487.m2356();
                                        if (C3998.f13671 != 0) {
                                            iM2767 = C0773.m3169("ᩳ۫") ^ i39;
                                            i40 = ((iM2767 ^ i38) * (-7725)) ^ 1655184824;
                                            i41 = 1083307202;
                                        } else {
                                            iM2767 = (i38 - C0773.m3169("ܿۧ")) * 101;
                                            i40 = ((iM2767 ^ i39) * (-3657)) ^ 1628028839;
                                            i41 = 733105988;
                                        }
                                        break;
                                    case -1363172100:
                                    case 706158624:
                                        if (C2878.m9491() <= 0) {
                                            iM2767 = C0773.m3169("ܺۖ") ^ i38;
                                            i40 = ((iM2767 ^ i39) * 31177) ^ 72865858;
                                            i41 = 1090451227;
                                        } else {
                                            iM2767 = C0773.m3169("ۧ֨") ^ i39;
                                            i40 = ((iM2767 ^ i38) * (-8241)) ^ 1793186018;
                                            i41 = 1341964384;
                                        }
                                        break;
                                    case -1123936069:
                                    case -368869563:
                                        if (C3998.m12920()) {
                                            iM2767 = C0773.m3169("᩷ۗ") ^ i38;
                                            i40 = ((iM2767 ^ i39) * 689) ^ 267190645;
                                            i41 = 1498675869;
                                        } else {
                                            iM2767 = C0773.m3169("ܺۖ") ^ i38;
                                            i40 = ((iM2767 ^ i39) * 31177) ^ 72865858;
                                            i41 = 1090451227;
                                        }
                                        break;
                                    case -911983266:
                                    case -426432115:
                                        if (C2702.f8586 <= 0) {
                                            iM2767 = C0773.m3169("ܺۖ") ^ i38;
                                            i40 = ((iM2767 ^ i39) * 31177) ^ 72865858;
                                            i41 = 1090451227;
                                        } else {
                                            iM2767 = C0619.m2761("ۙۧ") ^ i39;
                                            i40 = ((iM2767 ^ i38) * 30231) ^ (-1073830235);
                                            i41 = 1341222165;
                                        }
                                        break;
                                    case -682434781:
                                    case -469214708:
                                        this.f61369 = viewOnClickListenerC7793;
                                        if (RunnableC1848.f6235) {
                                            iM2767 = (i38 - C0773.m3169("ܿۧ")) * 101;
                                            i40 = ((iM2767 ^ i39) * (-3657)) ^ 1628028839;
                                            i41 = 733105988;
                                        } else {
                                            iM2767 = C0773.m3169("᩻ۘ") ^ i38;
                                            i40 = ((iM2767 ^ i39) * (-4513)) ^ (-1174216533);
                                            i41 = -244167307;
                                        }
                                        break;
                                    case -483637355:
                                    case 2077210183:
                                        if (C2702.f8586 > 0) {
                                            iM2767 = C0773.m3169("ᩳ۫") ^ i39;
                                            i40 = ((iM2767 ^ i38) * (-7725)) ^ 1655184824;
                                            i41 = 1083307202;
                                        } else {
                                            iM2767 = (i38 - C0773.m3169("ܿۙ")) * 15;
                                            i40 = ((iM2767 ^ i39) * 7297) ^ 1325670513;
                                            i41 = -1168483849;
                                        }
                                        break;
                                    case -251799903:
                                    case 501994549:
                                        if (C2834.m9344() >= 0) {
                                            iM2767 = (C0619.m2761("֫۬") ^ i39) * 71;
                                            i40 = ((iM2767 ^ i38) * 20219) ^ (-1252816829);
                                            i41 = 1604936524;
                                        } else {
                                            iM2767 = C0619.m2761("֨ۡ") ^ i38;
                                            i40 = ((iM2767 ^ i39) * (-25623)) ^ 736536369;
                                            i41 = -1178442466;
                                        }
                                        break;
                                    case 438119546:
                                    case 1150038950:
                                        C4238.m13540();
                                        iM2767 = (i38 - C0773.m3169("ܿۧ")) * 101;
                                        i40 = ((iM2767 ^ i39) * (-3657)) ^ 1628028839;
                                        i41 = 733105988;
                                        break;
                                    case 1240786379:
                                    case 1654949327:
                                        if (C4238.f15451 >= 0) {
                                            iM2767 = (i38 - C0773.m3169("ܿۧ")) * 101;
                                            i40 = ((iM2767 ^ i39) * (-3657)) ^ 1628028839;
                                            i41 = 733105988;
                                        } else {
                                            iM2767 = (C0619.m2761("᩷ܳ") + i39) * (-95);
                                            i40 = ((iM2767 ^ i38) * (-25037)) ^ (-1976612114);
                                            i41 = -1655716067;
                                        }
                                        break;
                                    case 1273973639:
                                    case 1673247700:
                                        return;
                                    default:
                                        if (C1826.m6301() >= 0) {
                                            iM2767 = C0773.m3169("ᩳ۫") ^ i39;
                                            i40 = ((iM2767 ^ i38) * (-7725)) ^ 1655184824;
                                            i41 = 1083307202;
                                        } else {
                                            iM2767 = C0773.m3169("᩺ۢ") ^ i38;
                                            i40 = ((iM2767 ^ i39) * (-20613)) ^ (-1208759636);
                                            i41 = 1500704627;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i37) {
                            ViewOnClickListenerC21218 viewOnClickListenerC21219 = null;
                            int i38 = 529279191;
                            int i39 = C3734.f12817;
                            int i40 = AbstractC0116.f1064;
                            int iM31620 = (C0773.m3169("᩺᩺") ^ i39) * (-31);
                            int i41 = ((iM31620 ^ i40) * (-21481)) ^ 1581999859;
                            int i42 = -807615827;
                            while (true) {
                                i38 = ((((i38 ^ i40) * (-25757)) >> 31) & i41) ^ (iM31620 ^ i42);
                                switch (i38) {
                                    case -2103464232:
                                    case -1275738192:
                                        if (C1826.f6190 <= 0) {
                                            iM31620 = (i40 - C0773.m3169("ۧۚ")) * (-75);
                                            i41 = ((iM31620 ^ i39) * 30379) ^ (-1499776201);
                                            i42 = 1234040616;
                                        } else {
                                            iM31620 = (i40 - C0619.m2761("ۧ۠")) * (-77);
                                            i41 = ((iM31620 ^ i39) * (-23431)) ^ 143302186;
                                            i42 = 1715464621;
                                        }
                                        break;
                                    case -2103333739:
                                    case -81922546:
                                        RunnableC1848.m6360();
                                        C2287.m7745();
                                        break;
                                    case -2087958967:
                                    case -275030401:
                                        if (C1826.m6301() >= 0) {
                                            iM31620 = (i40 - C0773.m3169("ۧۤ")) * 27;
                                            i41 = ((iM31620 ^ i39) * (-4869)) ^ 2145778380;
                                            i42 = -488974494;
                                        } else {
                                            iM31620 = (C0619.m2761("ۨ֫") ^ i39) * 29;
                                            i41 = ((iM31620 ^ i40) * (-9905)) ^ 2082654029;
                                            i42 = -1981752066;
                                        }
                                        break;
                                    case -2026642424:
                                    case 370103781:
                                        int i43 = ViewOnClickListenerC7793.f25871;
                                        viewOnClickListenerC21219 = viewOnClickListenerC21218;
                                        if (C2419.f7754 >= 0) {
                                            iM31620 = C0773.m3169("᩵ܺ") ^ i40;
                                            i41 = ((iM31620 ^ i39) * 27783) ^ (-2082993819);
                                            i42 = -1291074697;
                                        } else {
                                            iM31620 = (C0773.m3169("᩻ۜ") + i39) * (-95);
                                            i41 = ((iM31620 ^ i40) * 19607) ^ (-753761771);
                                            i42 = -718892307;
                                        }
                                        break;
                                    case -1913151257:
                                    case 2048505855:
                                        C0862.m3503();
                                        iM31620 = (i40 - C0773.m3169("ۧۚ")) * (-75);
                                        i41 = ((iM31620 ^ i39) * 30379) ^ (-1499776201);
                                        i42 = 1234040616;
                                        break;
                                    case -1665731519:
                                    case 1786301303:
                                        if (AbstractC0116.f1064 <= 0) {
                                            iM31620 = (i40 - C0773.m3169("ۧۤ")) * 27;
                                            i41 = ((iM31620 ^ i39) * (-4869)) ^ 2145778380;
                                            i42 = -488974494;
                                        } else {
                                            iM31620 = (i40 - C0773.m3169("ۧۚ")) * (-75);
                                            i41 = ((iM31620 ^ i39) * 30379) ^ (-1499776201);
                                            i42 = 1234040616;
                                        }
                                        break;
                                    case -1529875948:
                                    case 285065534:
                                        if (C0619.m2763()) {
                                            iM31620 = (i40 - C0773.m3169("ۧۤ")) * 27;
                                            i41 = ((iM31620 ^ i39) * (-4869)) ^ 2145778380;
                                            i42 = -488974494;
                                        } else {
                                            iM31620 = C0773.m3169("֫᩺") ^ i40;
                                            i41 = ((iM31620 ^ i39) * 985) ^ 1317776044;
                                            i42 = -343578132;
                                        }
                                        break;
                                    case -1223293522:
                                    case -911612309:
                                        if (C3690.f12684 <= 0) {
                                            iM31620 = C0773.m3169("ᩳ֡") ^ i39;
                                            i41 = ((iM31620 ^ i40) * (-16353)) ^ 1994373718;
                                            i42 = -2048519486;
                                        } else {
                                            iM31620 = (i40 - C0773.m3169("ۧۤ")) * 27;
                                            i41 = ((iM31620 ^ i39) * (-4869)) ^ 2145778380;
                                            i42 = -488974494;
                                        }
                                        break;
                                    case -978284856:
                                    case 2025229911:
                                        C20472 c20473 = viewOnClickListenerC21219.f67718;
                                        ViewOnClickListenerC7793 viewOnClickListenerC7794 = this.f61369;
                                        if (C4238.f15451 < 0) {
                                            C2834.m9339(new C12530(viewOnClickListenerC7794, c20473));
                                        }
                                        iM31620 = C0773.m3169("ᩳ֡") ^ i39;
                                        i41 = ((iM31620 ^ i40) * (-16353)) ^ 1994373718;
                                        i42 = -2048519486;
                                        break;
                                    case -899814813:
                                    case 1920716368:
                                        if (C2878.m9491() <= 0) {
                                            iM31620 = (i40 - C0773.m3169("ۧۤ")) * 27;
                                            i41 = ((iM31620 ^ i39) * (-4869)) ^ 2145778380;
                                            i42 = -488974494;
                                        } else {
                                            iM31620 = C0619.m2761("ۛۛ") ^ i40;
                                            i41 = ((iM31620 ^ i39) * (-32095)) ^ (-351821479);
                                            i42 = 1760930935;
                                        }
                                        break;
                                    case -226281666:
                                    case 836143296:
                                        if (C2878.f9462) {
                                            iM31620 = C0773.m3169("᩵ܺ") ^ i40;
                                            i41 = ((iM31620 ^ i39) * 27783) ^ (-2082993819);
                                            i42 = -1291074697;
                                        } else {
                                            iM31620 = (C0619.m2761("ۤ᩵") ^ i39) * (-65);
                                            i41 = ((iM31620 ^ i40) * (-27813)) ^ 1589399359;
                                            i42 = -323093189;
                                        }
                                        break;
                                    case 284550645:
                                    case 735828342:
                                        C2966.m9664();
                                        if (C0487.f2131 <= 0) {
                                            iM31620 = (i40 - C0773.m3169("ۧۚ")) * (-75);
                                            i41 = ((iM31620 ^ i39) * 30379) ^ (-1499776201);
                                            i42 = 1234040616;
                                        } else {
                                            iM31620 = (i39 - C0773.m3169("ۨ᩹")) * (-43);
                                            i41 = ((iM31620 ^ i40) * (-21595)) ^ (-556839822);
                                            i42 = 1793284873;
                                        }
                                        break;
                                    case 431737235:
                                    case 1798484524:
                                        if (RunnableC3055.m9933() != 0) {
                                            iM31620 = C0773.m3169("᩵ܺ") ^ i40;
                                            i41 = ((iM31620 ^ i39) * 27783) ^ (-2082993819);
                                            i42 = -1291074697;
                                        } else {
                                            iM31620 = C0773.m3169("ۚۖ") ^ i40;
                                            i41 = ((iM31620 ^ i39) * (-26933)) ^ 436155597;
                                            i42 = -157478466;
                                        }
                                        break;
                                    case 1678924407:
                                    case 1827375787:
                                        if (C2310.f7472 >= 0) {
                                            iM31620 = C0773.m3169("ᩳ֡") ^ i39;
                                            i41 = ((iM31620 ^ i40) * (-16353)) ^ 1994373718;
                                            i42 = -2048519486;
                                        } else {
                                            iM31620 = C0619.m2761("ۢۚ") ^ i39;
                                            i41 = ((iM31620 ^ i40) * 7467) ^ (-1616860718);
                                            i42 = 304346761;
                                        }
                                        break;
                                    default:
                                        if (C3734.f12817 >= 0) {
                                            iM31620 = C0773.m3169("ᩳ֡") ^ i39;
                                            i41 = ((iM31620 ^ i40) * (-16353)) ^ 1994373718;
                                            i42 = -2048519486;
                                        } else {
                                            iM31620 = C0619.m2761("ۚ᩻") ^ i39;
                                            i41 = ((iM31620 ^ i40) * 28227) ^ 1800823748;
                                            i42 = 395284096;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    C11235.m28307(c2361, C0773.m3169(RunnableC3055.m9937(f25870, 187, 3, i19)) ^ 2126048436, null);
                    final DialogInterfaceC8327 dialogInterfaceC8327M4860 = C1321.m4860(c2361);
                    viewOnClickListenerC7793.f25894 = dialogInterfaceC8327M4860;
                    final long jM55859 = C25040.m55859(str5);
                    if (C4238.f15451 < 0) {
                        dialogInterfaceC8327M4860.m22426(new DialogInterface.OnDismissListener(viewOnClickListenerC7793) { // from class: l.ۢ۟֫

                            /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                            public final /* synthetic */ ViewOnClickListenerC7793 f32022;

                            {
                                int i37 = 1215380944;
                                int i38 = AbstractC0116.f1064;
                                int i39 = C23916.f77426;
                                int iM31620 = C0773.m3169("᩻ۢ") ^ i39;
                                int i40 = ((iM31620 ^ i38) * 22031) ^ 819839115;
                                int i41 = -1325365309;
                                while (true) {
                                    i37 = ((((i37 ^ i38) * 1469) >> 31) & i40) ^ (iM31620 ^ i41);
                                    switch (i37) {
                                        case -1986927346:
                                        case 168698023:
                                            if (C3492.m11488()) {
                                                iM31620 = C0773.m3169("ܺ᩸") ^ i38;
                                                i40 = ((iM31620 ^ i39) * (-1279)) ^ 1979367573;
                                                i41 = -30692345;
                                            } else {
                                                iM31620 = (i38 - C0773.m3169("ܽۗ")) * (-111);
                                                i40 = ((iM31620 ^ i39) * 24827) ^ (-2081029315);
                                                i41 = 1343344383;
                                            }
                                            break;
                                        case -1948192878:
                                        case -1938470406:
                                            this.f32022 = viewOnClickListenerC7793;
                                            if (AbstractC3624.m11755() != 0) {
                                                iM31620 = (i38 - C0773.m3169("᩺ۖ")) * (-3);
                                                i40 = ((iM31620 ^ i39) * (-26551)) ^ 2045963098;
                                                i41 = -1796737757;
                                            } else {
                                                iM31620 = (C0619.m2761("᩶ۨ") ^ i38) * (-97);
                                                i40 = ((iM31620 ^ i39) * (-15015)) ^ (-1058932015);
                                                i41 = 24392441;
                                            }
                                            break;
                                        case -1369735975:
                                        case 1935702400:
                                            if (C2419.m8174() >= 0) {
                                                iM31620 = C0773.m3169("ܳ᩷") ^ i39;
                                                i40 = ((iM31620 ^ i38) * 11117) ^ 759608862;
                                                i41 = -2035358394;
                                            } else {
                                                iM31620 = (i38 - C0619.m2761("᩵ۖ")) * 5;
                                                i40 = ((iM31620 ^ i39) * (-25545)) ^ (-272296749);
                                                i41 = 1916687918;
                                            }
                                            break;
                                        case -1135784076:
                                        case -828844004:
                                            C0619.m2763();
                                            RunnableC3055.m9933();
                                            throw new RuntimeException();
                                        case -1087725090:
                                        case 1065903905:
                                            if (C2375.f7641 <= 0) {
                                                iM31620 = (i38 - C0773.m3169("᩺ۖ")) * (-3);
                                                i40 = ((iM31620 ^ i39) * (-26551)) ^ 2045963098;
                                                i41 = -1796737757;
                                            } else {
                                                iM31620 = (C0773.m3169("ۧ᩻") ^ i39) * 21;
                                                i40 = ((iM31620 ^ i38) * 31247) ^ 636642708;
                                                i41 = -1006078487;
                                            }
                                            break;
                                        case -594956236:
                                        case 158224869:
                                            C11235.m28309();
                                            if (C20932.m47848() == 0) {
                                                iM31620 = (i38 - C0773.m3169("᩺ۖ")) * (-3);
                                                i40 = ((iM31620 ^ i39) * (-26551)) ^ 2045963098;
                                                i41 = -1796737757;
                                            } else {
                                                iM31620 = C0773.m3169("ܳ᩷") ^ i39;
                                                i40 = ((iM31620 ^ i38) * 11117) ^ 759608862;
                                                i41 = -2035358394;
                                            }
                                            break;
                                        case -561241364:
                                        case 1586411377:
                                            if (C2023.m6964() > 0) {
                                                iM31620 = (i38 - C0773.m3169("᩺ۖ")) * (-3);
                                                i40 = ((iM31620 ^ i39) * (-26551)) ^ 2045963098;
                                                i41 = -1796737757;
                                            } else {
                                                iM31620 = C0619.m2761("ۢۚ") ^ i38;
                                                i40 = ((iM31620 ^ i39) * 32479) ^ 1225578623;
                                                i41 = -661155408;
                                            }
                                            break;
                                        case -380116962:
                                        case 1908668107:
                                            if (C13473.f42873 != 0) {
                                                iM31620 = (i38 - C0773.m3169("ܽۗ")) * (-111);
                                                i40 = ((iM31620 ^ i39) * 24827) ^ (-2081029315);
                                                i41 = 1343344383;
                                            } else {
                                                iM31620 = (i39 - C0773.m3169("᩸֡")) * 91;
                                                i40 = ((iM31620 ^ i38) * (-371)) ^ 1675568797;
                                                i41 = -1991199131;
                                            }
                                            break;
                                        case -300253505:
                                        case 1732988035:
                                            C2702.m8876();
                                            C3779.m12264();
                                            iM31620 = C0773.m3169("ܳ᩷") ^ i39;
                                            i40 = ((iM31620 ^ i38) * 11117) ^ 759608862;
                                            i41 = -2035358394;
                                            break;
                                        case 216734792:
                                        case 1134906605:
                                            if (C3077.f9998) {
                                                iM31620 = C0619.m2761("۬ܶ") ^ i39;
                                                i40 = ((iM31620 ^ i38) * (-14611)) ^ 1744585673;
                                                i41 = 820883195;
                                            } else {
                                                iM31620 = (i38 - C0773.m3169("᩺ۖ")) * (-3);
                                                i40 = ((iM31620 ^ i39) * (-26551)) ^ 2045963098;
                                                i41 = -1796737757;
                                            }
                                            break;
                                        case 279184483:
                                        case 1678873309:
                                            if (C2419.f7754 >= 0) {
                                                iM31620 = (C0619.m2761("ᩳۙ") + i39) * (-119);
                                                i40 = ((iM31620 ^ i38) * 953) ^ (-976187619);
                                                i41 = 1080029648;
                                            } else {
                                                iM31620 = C0773.m3169("ᩴ᩶") ^ i38;
                                                i40 = ((iM31620 ^ i39) * (-22965)) ^ (-1761701475);
                                                i41 = 150384502;
                                            }
                                            break;
                                        case 378291610:
                                        case 1521123030:
                                            if (C3779.f12953 <= 0) {
                                                iM31620 = C0773.m3169("ܳ᩷") ^ i39;
                                                i40 = ((iM31620 ^ i38) * 11117) ^ 759608862;
                                                i41 = -2035358394;
                                            } else {
                                                iM31620 = (i39 - C0773.m3169("᩹ܺ")) * q.h;
                                                i40 = ((iM31620 ^ i38) * 30065) ^ (-1212418604);
                                                i41 = -871634207;
                                            }
                                            break;
                                        case 1066686429:
                                        case 1723112329:
                                            if (C2966.f9654 >= 0) {
                                                iM31620 = (i38 - C0773.m3169("ܽۗ")) * (-111);
                                                i40 = ((iM31620 ^ i39) * 24827) ^ (-2081029315);
                                                i41 = 1343344383;
                                            } else {
                                                iM31620 = C0773.m3169("ۡܿ") ^ i39;
                                                i40 = ((iM31620 ^ i38) * (-30307)) ^ 1374214011;
                                                i41 = 90958025;
                                            }
                                            break;
                                        case 1096776860:
                                        case 1726346077:
                                            if (C1826.m6301() >= 0) {
                                                iM31620 = (C0619.m2761("ᩳۙ") + i39) * (-119);
                                                i40 = ((iM31620 ^ i38) * 953) ^ (-976187619);
                                                i41 = 1080029648;
                                            } else {
                                                iM31620 = (i38 - C0773.m3169("᩺ۖ")) * (-3);
                                                i40 = ((iM31620 ^ i39) * (-26551)) ^ 2045963098;
                                                i41 = -1796737757;
                                            }
                                            break;
                                        case 1297073888:
                                        case 1694089178:
                                            if (C3998.f13671 != 0) {
                                                iM31620 = C0773.m3169("ܳ᩷") ^ i39;
                                                i40 = ((iM31620 ^ i38) * 11117) ^ 759608862;
                                                i41 = -2035358394;
                                            } else {
                                                iM31620 = C0619.m2761("۬ۡ") ^ i38;
                                                i40 = ((iM31620 ^ i39) * (-4915)) ^ (-271070113);
                                                i41 = 311584083;
                                            }
                                            break;
                                        default:
                                            return;
                                    }
                                }
                            }

                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                long j = 0;
                                int i37 = -1974842503;
                                int i38 = C3033.f9831;
                                int i39 = C20932.f66974;
                                int iM2767 = (C0619.m2761("۫ۜ") ^ i39) * (-103);
                                int i40 = ((iM2767 ^ i38) * 8861) ^ (-1781206663);
                                int i41 = 998317668;
                                while (true) {
                                    i37 = ((((i37 ^ i38) * 10217) >> 31) & i40) ^ (iM2767 ^ i41);
                                    switch (i37) {
                                        case -2104605212:
                                        case 690160147:
                                            if (C0487.f2131 <= 0) {
                                                iM2767 = C0619.m2761("֨ۛ") ^ i39;
                                                i40 = ((iM2767 ^ i38) * (-10783)) ^ 1078379371;
                                                i41 = 68513941;
                                            } else {
                                                iM2767 = (C0773.m3169("֨ۙ") ^ i38) * (-11);
                                                i40 = ((iM2767 ^ i39) * (-19029)) ^ 119827161;
                                                i41 = -449323293;
                                            }
                                            break;
                                        case -1730616413:
                                        case -1708645738:
                                            if (C2023.f6737) {
                                                iM2767 = (C0773.m3169("֨ۙ") ^ i38) * (-11);
                                                i40 = ((iM2767 ^ i39) * (-19029)) ^ 119827161;
                                                i41 = -449323293;
                                            } else {
                                                iM2767 = C0619.m2761("ܺۗ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * 32611) ^ 1733952454;
                                                i41 = 1417390801;
                                            }
                                            break;
                                        case -1656689811:
                                        case 169077079:
                                            if (C1783.f6087 <= 0) {
                                                iM2767 = (C0773.m3169("֨ۙ") ^ i38) * (-11);
                                                i40 = ((iM2767 ^ i39) * (-19029)) ^ 119827161;
                                                i41 = -449323293;
                                            } else {
                                                iM2767 = (i38 - C0773.m3169("ۙ᩶")) * 59;
                                                i40 = ((iM2767 ^ i39) * 13323) ^ 154450095;
                                                i41 = 1212295240;
                                            }
                                            break;
                                        case -1146654810:
                                        case -253944074:
                                            if (C1321.m4852()) {
                                                iM2767 = C0773.m3169("ܺۛ") ^ i39;
                                                i40 = ((iM2767 ^ i38) * 1293) ^ 1736248977;
                                                i41 = 1968308377;
                                            } else {
                                                iM2767 = C0773.m3169("ܶ֫") ^ i38;
                                                i40 = ((iM2767 ^ i39) * (-32089)) ^ 1395816864;
                                                i41 = -388764001;
                                            }
                                            break;
                                        case -1118139105:
                                        case 1363805858:
                                            if (C2288.f7433 <= 0) {
                                                iM2767 = C0619.m2761("֨ۛ") ^ i39;
                                                i40 = ((iM2767 ^ i38) * (-10783)) ^ 1078379371;
                                                i41 = 68513941;
                                            } else {
                                                iM2767 = C0773.m3169("۬֫") ^ i39;
                                                i40 = ((iM2767 ^ i38) * (-32087)) ^ 510310565;
                                                i41 = -1307248871;
                                            }
                                            break;
                                        case -832546061:
                                        case 640010987:
                                            if (C17202.f56030) {
                                                iM2767 = C0773.m3169("ۖܿ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * 20573) ^ 1467046834;
                                                i41 = -905570777;
                                            } else {
                                                iM2767 = (C0773.m3169("֨ۙ") ^ i38) * (-11);
                                                i40 = ((iM2767 ^ i39) * (-19029)) ^ 119827161;
                                                i41 = -449323293;
                                            }
                                            break;
                                        case -725347764:
                                        case 1200615254:
                                            if (C0950.f3488 >= 0) {
                                                iM2767 = C0619.m2761("᩺ۙ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * (-3231)) ^ 21259591;
                                                i41 = 1834048977;
                                            } else {
                                                iM2767 = (C0619.m2761("ۢᩳ") ^ i39) * 65;
                                                i40 = ((iM2767 ^ i38) * (-16103)) ^ (-1731733901);
                                                i41 = 1620013387;
                                            }
                                            break;
                                        case -683088072:
                                        case 635104932:
                                            j = jM55859;
                                            if (RunnableC1848.m6360()) {
                                                iM2767 = C0773.m3169("ܶ֫") ^ i38;
                                                i40 = ((iM2767 ^ i39) * (-32089)) ^ 1395816864;
                                                i41 = -388764001;
                                            } else {
                                                iM2767 = C0619.m2761("ۖ᩶") ^ i39;
                                                i40 = ((iM2767 ^ i38) * 9895) ^ (-813036755);
                                                i41 = 621811202;
                                            }
                                            break;
                                        case -223004842:
                                        case 118433792:
                                            C1542.m5459();
                                            if (!C13473.m33144()) {
                                                iM2767 = (i39 - C0619.m2761("ۘᩳ")) * 9;
                                                i40 = ((iM2767 ^ i38) * 19657) ^ 362993197;
                                                i41 = -1951255611;
                                            } else {
                                                iM2767 = (C0773.m3169("֨ۙ") ^ i38) * (-11);
                                                i40 = ((iM2767 ^ i39) * (-19029)) ^ 119827161;
                                                i41 = -449323293;
                                            }
                                            break;
                                        case -60675632:
                                        case 1726843599:
                                            if (C23916.f77426 <= 0) {
                                                iM2767 = (i39 - C0619.m2761("ۘᩳ")) * 9;
                                                i40 = ((iM2767 ^ i38) * 19657) ^ 362993197;
                                                i41 = -1951255611;
                                            } else {
                                                iM2767 = (C0619.m2761("᩺᩹") + i39) * (-73);
                                                i40 = ((iM2767 ^ i38) * (-13195)) ^ (-1035256044);
                                                i41 = 1474941553;
                                            }
                                            break;
                                        case 177773311:
                                        case 1334822850:
                                            C2485.m8357();
                                            if (C3448.f11240 >= 0) {
                                                iM2767 = C0619.m2761("᩺ۙ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * (-3231)) ^ 21259591;
                                                i41 = 1834048977;
                                            } else {
                                                iM2767 = (C0773.m3169("֨ۙ") ^ i38) * (-11);
                                                i40 = ((iM2767 ^ i39) * (-19029)) ^ 119827161;
                                                i41 = -449323293;
                                            }
                                            break;
                                        case 266088679:
                                        case 778767171:
                                            ViewOnClickListenerC7793.m21197(this.f32022, j, dialogInterfaceC8327M4860);
                                            break;
                                        case 488762580:
                                        case 785976867:
                                            C0619.m2763();
                                            iM2767 = (C0773.m3169("֨ۙ") ^ i38) * (-11);
                                            i40 = ((iM2767 ^ i39) * (-19029)) ^ 119827161;
                                            i41 = -449323293;
                                            break;
                                        case 1420971188:
                                        case 1878131243:
                                            C4282.m13644();
                                            C1146.m4231();
                                            break;
                                        case 1604202237:
                                        case 1794545946:
                                            if (C3492.m11488()) {
                                                iM2767 = C0619.m2761("֨ۘ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * (-20329)) ^ (-137843375);
                                                i41 = -906403983;
                                            } else {
                                                iM2767 = (i39 - C0619.m2761("ۘᩳ")) * 9;
                                                i40 = ((iM2767 ^ i38) * 19657) ^ 362993197;
                                                i41 = -1951255611;
                                            }
                                            break;
                                        default:
                                            if (C1146.m4231()) {
                                                iM2767 = (C0773.m3169("᩺֡") + i38) * 77;
                                                i40 = ((iM2767 ^ i39) * (-16555)) ^ 275440738;
                                                i41 = 1637917771;
                                            } else {
                                                iM2767 = C0619.m2761("᩺ۙ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * (-3231)) ^ 21259591;
                                                i41 = 1834048977;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        });
                        C17202.m40368(C5261.f18540, new RunnableC1016(str5, dialogInterfaceC8327M4860, textView4));
                        C17494.m41003(textView3, viewM11247, C1321.m4846(packageInfo.applicationInfo.sourceDir, new String[0]), viewOnClickListenerC7793, C0950.m3781(ApplicationC17729.f58258, C2878.m9486(f25870, 190, 5, i19), false), null, new InterfaceC7509() { // from class: l.ۡ۟֫
                            @Override // l.InterfaceC7509
                            /* JADX INFO: renamed from: ۫ */
                            public final boolean mo924() {
                                DialogInterfaceC8327 dialogInterfaceC8327 = null;
                                int i37 = 785707383;
                                int i38 = C3448.f11240;
                                int i39 = C3779.f12953;
                                int iM2767 = C0619.m2761("۬᩺") ^ i39;
                                int i40 = ((iM2767 ^ i38) * (-14627)) ^ (-795026937);
                                int i41 = 1743237061;
                                while (true) {
                                    i37 = ((((i37 ^ i38) * (-30705)) >> 31) & i40) ^ (iM2767 ^ i41);
                                    switch (i37) {
                                        case -2035348277:
                                        case 1790773957:
                                            if (C0269.m1775() <= 0) {
                                                iM2767 = (C0773.m3169("᩶۫") ^ i39) * (-93);
                                                i40 = ((iM2767 ^ i38) * 3259) ^ 1273967056;
                                                i41 = 1218056465;
                                            } else {
                                                iM2767 = (C0619.m2761("֡ۨ") ^ i38) * (-77);
                                                i40 = ((iM2767 ^ i39) * (-10169)) ^ 806350017;
                                                i41 = 1383494174;
                                            }
                                            break;
                                        case -1884850045:
                                        case -1606389056:
                                            if (C0269.f1558 <= 0) {
                                                iM2767 = (C0773.m3169("ۘۢ") + i39) * (-107);
                                                i40 = ((iM2767 ^ i38) * (-13049)) ^ (-1128078229);
                                                i41 = -1255053578;
                                            } else {
                                                iM2767 = (i38 - C0619.m2761("ۗۙ")) * (-47);
                                                i40 = ((iM2767 ^ i39) * (-21339)) ^ 1655985891;
                                                i41 = 184580988;
                                            }
                                            break;
                                        case -1441303048:
                                        case -166334051:
                                            if (C4238.f15451 < 0) {
                                                iM2767 = (C0773.m3169("ܳۜ") + i38) * (-127);
                                                i40 = ((iM2767 ^ i39) * (-31561)) ^ (-212772514);
                                                i41 = -226042188;
                                            } else {
                                                iM2767 = C0773.m3169("ܰᩳ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * (-19749)) ^ 1141304501;
                                                i41 = -1789589857;
                                            }
                                            break;
                                        case -1403130729:
                                        case 700862390:
                                            AbstractC3624.m11755();
                                            C2485.m8357();
                                            iM2767 = C0773.m3169("ܰᩳ") ^ i38;
                                            i40 = ((iM2767 ^ i39) * (-19749)) ^ 1141304501;
                                            i41 = -1789589857;
                                            break;
                                        case -1352607648:
                                        case 1930716470:
                                            if (C1826.f6190 <= 0) {
                                                iM2767 = C0773.m3169("᩵ۜ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * 17895) ^ (-661364733);
                                                i41 = -1545777926;
                                            } else {
                                                iM2767 = (C0773.m3169("۟ۡ") ^ i39) * 95;
                                                i40 = ((iM2767 ^ i38) * (-10389)) ^ (-1347453920);
                                                i41 = -382238617;
                                            }
                                            break;
                                        case -744502715:
                                        case 710249474:
                                            if (C0619.f2439) {
                                                iM2767 = (C0773.m3169("᩶۫") ^ i39) * (-93);
                                                i40 = ((iM2767 ^ i38) * 3259) ^ 1273967056;
                                                i41 = 1218056465;
                                            } else {
                                                iM2767 = (C0773.m3169("ܶܰ") + i39) * (-101);
                                                i40 = ((iM2767 ^ i38) * (-19989)) ^ (-545735269);
                                                i41 = 1766456476;
                                            }
                                            break;
                                        case -737774971:
                                        case -4179252:
                                            if (C3033.f9831 >= 0) {
                                                iM2767 = C0773.m3169("᩵ۜ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * 17895) ^ (-661364733);
                                                i41 = -1545777926;
                                            } else {
                                                iM2767 = (i39 - C0619.m2761("ܺۨ")) * (-87);
                                                i40 = ((iM2767 ^ i38) * (-30223)) ^ (-1325267955);
                                                i41 = 2110282568;
                                            }
                                            break;
                                        case -689111903:
                                        case 1369372280:
                                            if (C2023.f6737) {
                                                iM2767 = C0773.m3169("ܰᩳ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * (-19749)) ^ 1141304501;
                                                i41 = -1789589857;
                                            } else {
                                                iM2767 = C0619.m2761("ۖ᩺") ^ i39;
                                                i40 = ((iM2767 ^ i38) * 30531) ^ 1258517240;
                                                i41 = 1795583013;
                                            }
                                            break;
                                        case -619727703:
                                        case 760663745:
                                            dialogInterfaceC8327 = dialogInterfaceC8327M4860;
                                            if (C0862.m3503()) {
                                                iM2767 = C0619.m2761("ۙ۟") ^ i39;
                                                i40 = ((iM2767 ^ i38) * (-19089)) ^ (-842621271);
                                                i41 = 310480753;
                                            } else {
                                                iM2767 = C0773.m3169("᩵ۜ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * 17895) ^ (-661364733);
                                                i41 = -1545777926;
                                            }
                                            break;
                                        case -385080433:
                                        case 1887331053:
                                            if (C3690.f12684 <= 0) {
                                                iM2767 = (C0773.m3169("ܳۜ") + i38) * (-127);
                                                i40 = ((iM2767 ^ i39) * (-31561)) ^ (-212772514);
                                                i41 = -226042188;
                                            } else {
                                                iM2767 = C0619.m2761("᩸᩵") ^ i38;
                                                i40 = ((iM2767 ^ i39) * (-28621)) ^ (-2019488545);
                                                i41 = -988005222;
                                            }
                                            break;
                                        case -270981805:
                                        case 1117707127:
                                            if (C0619.m2763()) {
                                                iM2767 = (C0773.m3169("ܳۜ") + i38) * (-127);
                                                i40 = ((iM2767 ^ i39) * (-31561)) ^ (-212772514);
                                                i41 = -226042188;
                                            } else {
                                                iM2767 = (i38 - C0773.m3169("ܽۤ")) * 19;
                                                i40 = ((iM2767 ^ i39) * (-27679)) ^ 2027191949;
                                                i41 = -1845031315;
                                            }
                                            break;
                                        case -21946598:
                                        case 813667739:
                                            C0619.m2763();
                                            if (!C2878.f9462) {
                                                iM2767 = C0773.m3169("ܰᩳ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * (-19749)) ^ 1141304501;
                                                i41 = -1789589857;
                                            } else {
                                                iM2767 = (C0773.m3169("ۘۢ") + i39) * (-107);
                                                i40 = ((iM2767 ^ i38) * (-13049)) ^ (-1128078229);
                                                i41 = -1255053578;
                                            }
                                            break;
                                        case 675685913:
                                        case 1268239195:
                                            if (C1519.f5300 >= 0) {
                                                iM2767 = (C0773.m3169("᩶۫") ^ i39) * (-93);
                                                i40 = ((iM2767 ^ i38) * 3259) ^ 1273967056;
                                                i41 = 1218056465;
                                            } else {
                                                iM2767 = C0773.m3169("ܰᩳ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * (-19749)) ^ 1141304501;
                                                i41 = -1789589857;
                                            }
                                            break;
                                        case 771879246:
                                        case 2099004282:
                                            C2485.m8357();
                                            return false;
                                        case 1316947965:
                                        case 1815141788:
                                            int i42 = ViewOnClickListenerC7793.f25871;
                                            if (C20932.m47848() != 0) {
                                                iM2767 = (C0773.m3169("᩶۫") ^ i39) * (-93);
                                                i40 = ((iM2767 ^ i38) * 3259) ^ 1273967056;
                                                i41 = 1218056465;
                                            } else {
                                                iM2767 = (C0619.m2761("᩸᩺") ^ i38) * 71;
                                                i40 = ((iM2767 ^ i39) * (-7637)) ^ (-148881623);
                                                i41 = 1184636542;
                                            }
                                            break;
                                        default:
                                            return !C1542.m5465(dialogInterfaceC8327);
                                    }
                                }
                            }
                        }, null);
                        C2375.m8070(C0269.m1782(dialogInterfaceC8327M4860), new View.OnClickListener(viewOnClickListenerC7793) { // from class: l.ۖ۟֫

                            /* JADX INFO: renamed from: ܽܿۤ, reason: not valid java name and contains not printable characters */
                            private static final short[] f8020 = {3121, -31102, 27357, 29141, -31817, 28883, 26216, 30449, 27683, 30471};

                            /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                            public final /* synthetic */ ViewOnClickListenerC7793 f8022;

                            {
                                int i37 = -193989105;
                                int i38 = C1826.f6190;
                                int i39 = AbstractC0116.f1064;
                                int iM2767 = (i39 - C0619.m2761("ᩴۚ")) * (-91);
                                int i40 = ((iM2767 ^ i38) * (-29739)) ^ 1259502798;
                                int i41 = -738313668;
                                while (true) {
                                    i37 = ((((i37 ^ i38) * 16801) >> 31) & i40) ^ (iM2767 ^ i41);
                                    switch (i37) {
                                        case -1590438994:
                                        case 713787021:
                                            if (AbstractC0641.f2496 >= 0) {
                                                iM2767 = C0619.m2761("᩷ᩳ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * 9623) ^ (-506532918);
                                                i41 = 2114911141;
                                            } else {
                                                iM2767 = (C0619.m2761("ܺܳ") ^ i39) * 55;
                                                i40 = ((iM2767 ^ i38) * (-26681)) ^ (-1023418685);
                                                i41 = 1475761684;
                                            }
                                            break;
                                        case -1369606394:
                                        case -1351242912:
                                            if (C0773.f2792 <= 0) {
                                                iM2767 = C0619.m2761("᩻۫") ^ i39;
                                                i40 = ((iM2767 ^ i38) * (-9479)) ^ (-868542230);
                                                i41 = -122645706;
                                            } else {
                                                iM2767 = C0773.m3169("֫ᩳ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * (-13285)) ^ (-1917920310);
                                                i41 = 1037337452;
                                            }
                                            break;
                                        case -1249778553:
                                        case -206293144:
                                            if (C2287.f7432 >= 0) {
                                                iM2767 = C0619.m2761("᩷ᩳ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * 9623) ^ (-506532918);
                                                i41 = 2114911141;
                                            } else {
                                                iM2767 = (i39 - C0773.m3169("ۛܳ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                i40 = ((iM2767 ^ i38) * (-21625)) ^ (-1004450436);
                                                i41 = -2026474455;
                                            }
                                            break;
                                        case -1237804693:
                                        case 1592318934:
                                            if (C17202.f56030) {
                                                iM2767 = C0773.m3169("ۧܿ") ^ i39;
                                                i40 = ((iM2767 ^ i38) * 24537) ^ (-294233880);
                                                i41 = 1096989964;
                                            } else {
                                                iM2767 = C0619.m2761("᩷ᩳ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * 9623) ^ (-506532918);
                                                i41 = 2114911141;
                                            }
                                            break;
                                        case -965874847:
                                        case 1507821522:
                                            this.f8022 = viewOnClickListenerC7793;
                                            if (C4238.f15451 >= 0) {
                                                iM2767 = C0619.m2761("᩷ᩳ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * 9623) ^ (-506532918);
                                                i41 = 2114911141;
                                            } else {
                                                iM2767 = (C0619.m2761("ۛ᩹") + i38) * 27;
                                                i40 = ((iM2767 ^ i39) * 15121) ^ 235488403;
                                                i41 = 1632846690;
                                            }
                                            break;
                                        case -904925557:
                                        case 1165794696:
                                            return;
                                        case -736244527:
                                        case 1372387007:
                                            if (C4238.m13540() <= 0) {
                                                iM2767 = C0619.m2761("᩷ᩳ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * 9623) ^ (-506532918);
                                                i41 = 2114911141;
                                            } else {
                                                iM2767 = C0773.m3169("ۘ֫") ^ i38;
                                                i40 = ((iM2767 ^ i39) * 24141) ^ 775534089;
                                                i41 = 518775151;
                                            }
                                            break;
                                        case -728215177:
                                        case -223848853:
                                            AbstractC0641.m2813();
                                            if (C0487.f2131 <= 0) {
                                                iM2767 = C0619.m2761("᩻۫") ^ i39;
                                                i40 = ((iM2767 ^ i38) * (-9479)) ^ (-868542230);
                                                i41 = -122645706;
                                            } else {
                                                iM2767 = C0619.m2761("ᩴۗ") ^ i39;
                                                i40 = ((iM2767 ^ i38) * (-9183)) ^ 2089121758;
                                                i41 = -1419219905;
                                            }
                                            break;
                                        case -436125707:
                                        case 451446430:
                                            if (C1542.m5459() >= 0) {
                                                iM2767 = C0619.m2761("᩻۫") ^ i39;
                                                i40 = ((iM2767 ^ i38) * (-9479)) ^ (-868542230);
                                                i41 = -122645706;
                                            } else {
                                                iM2767 = C0619.m2761("ۚۜ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * (-30795)) ^ (-1027793231);
                                                i41 = -1773289778;
                                            }
                                            break;
                                        case -384975544:
                                        case 1496414883:
                                            C0487.m2356();
                                            throw new RuntimeException();
                                        case -55749286:
                                        case 1830977411:
                                            C2966.m9664();
                                            C13473.m33144();
                                            iM2767 = C0773.m3169("֫ᩳ") ^ i38;
                                            i40 = ((iM2767 ^ i39) * (-13285)) ^ (-1917920310);
                                            i41 = 1037337452;
                                            break;
                                        case 169721530:
                                        case 2047740763:
                                            if (C3448.f11240 >= 0) {
                                                iM2767 = C0619.m2761("᩻۫") ^ i39;
                                                i40 = ((iM2767 ^ i38) * (-9479)) ^ (-868542230);
                                                i41 = -122645706;
                                            } else {
                                                iM2767 = C0773.m3169("᩶ۢ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * 30609) ^ 749014084;
                                                i41 = -975840411;
                                            }
                                            break;
                                        case 593658344:
                                        case 1742686988:
                                            if (C2310.f7472 >= 0) {
                                                iM2767 = C0773.m3169("֫ᩳ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * (-13285)) ^ (-1917920310);
                                                i41 = 1037337452;
                                            } else {
                                                iM2767 = C0773.m3169("ۘᩴ") ^ i39;
                                                i40 = ((iM2767 ^ i38) * (-16285)) ^ 1027266203;
                                                i41 = 1439884703;
                                            }
                                            break;
                                        case 1526133252:
                                        case 1857621551:
                                            if (C17202.f56030) {
                                                iM2767 = C0619.m2761("֨ۗ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * (-19459)) ^ (-577018855);
                                                i41 = 973954590;
                                            } else {
                                                iM2767 = C0619.m2761("᩷ᩳ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * 9623) ^ (-506532918);
                                                i41 = 2114911141;
                                            }
                                            break;
                                        case 1963485133:
                                        case 2059782180:
                                            if (AbstractC0116.f1064 <= 0) {
                                                iM2767 = C0619.m2761("᩻۫") ^ i39;
                                                i40 = ((iM2767 ^ i38) * (-9479)) ^ (-868542230);
                                                i41 = -122645706;
                                            } else {
                                                iM2767 = C0773.m3169("ۙܰ") ^ i38;
                                                i40 = ((iM2767 ^ i39) * 16641) ^ 353680647;
                                                i41 = 173860543;
                                            }
                                            break;
                                        default:
                                            if (AbstractC3624.f12429 <= 0) {
                                                iM2767 = C0619.m2761("᩻۫") ^ i39;
                                                i40 = ((iM2767 ^ i38) * (-9479)) ^ (-868542230);
                                                i41 = -122645706;
                                            } else {
                                                iM2767 = C0619.m2761("ܺ᩷") ^ i39;
                                                i40 = ((iM2767 ^ i38) * 8771) ^ (-99189994);
                                                i41 = 662472233;
                                            }
                                            break;
                                    }
                                }
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int iM2767;
                                int i37;
                                int i38;
                                short s2;
                                int iM31620;
                                int i39;
                                int i40;
                                int i41;
                                int iM31621;
                                int i42;
                                int i43;
                                int iM31622;
                                int i44;
                                int i45;
                                int i46;
                                ViewOnClickListenerC2507 viewOnClickListenerC2507 = this;
                                final ViewOnClickListenerC7793 viewOnClickListenerC7794 = null;
                                int i47 = 0;
                                C9898 c9898M42995 = null;
                                String strM3500 = null;
                                int iM2768 = 0;
                                int iM31623 = 0;
                                int i48 = 0;
                                int i49 = 0;
                                int i50 = 0;
                                short[] sArr3 = null;
                                int i51 = -1706928009;
                                int i52 = AbstractC0116.f1064;
                                int i53 = C1146.f4234;
                                int iM2769 = C0619.m2761("ۛ᩹") ^ i53;
                                int i54 = ((iM2769 ^ i52) * (-30667)) ^ (-1162190233);
                                int i55 = iM2769 ^ 2010566642;
                                int i56 = 0;
                                C18452 c18452 = null;
                                char c = 0;
                                short s3 = 0;
                                int i57 = 0;
                                short[] sArr4 = null;
                                short[] sArr5 = null;
                                while (true) {
                                    i51 = i55 ^ (i54 & (((i51 ^ i52) * 23029) >> 31));
                                    switch (i51) {
                                        case -2020110556:
                                        case 1879350181:
                                            C0773.m3161();
                                            iM31623 = iM31623;
                                            s2 = s3;
                                            iM31620 = (i52 - C0773.m3169("ۨ۫")) * 65;
                                            i39 = ((iM31620 ^ i53) * 32613) ^ 93213719;
                                            i40 = 1378222414;
                                            i41 = iM31620 ^ i40;
                                            i54 = i39;
                                            s3 = s2;
                                            iM31623 = iM31623;
                                            i55 = i41;
                                            viewOnClickListenerC2507 = this;
                                            break;
                                        case -1966309998:
                                        case -663092862:
                                            iM31623 = iM31623;
                                            int i58 = ViewOnClickListenerC7793.f25871;
                                            viewOnClickListenerC7794 = viewOnClickListenerC2507.f8022;
                                            i47 = 0;
                                            if (C3099.f10023 > 0) {
                                                c18452 = new C18452(viewOnClickListenerC7794, view2, 0);
                                                c9898M42995 = c18452.m42995();
                                                if (C1783.f6087 > 0) {
                                                    iM31621 = (C0773.m3169("ۛ᩺") ^ i52) * (-13);
                                                    i42 = ((iM31621 ^ i53) * (-12691)) ^ (-1167580952);
                                                    i43 = 823843224;
                                                    i54 = i42;
                                                    i46 = iM31623;
                                                    i55 = iM31621 ^ i43;
                                                    iM31623 = i46;
                                                } else {
                                                    s2 = s3;
                                                    iM31620 = (i52 - C0773.m3169("ۨ۫")) * 65;
                                                    i39 = ((iM31620 ^ i53) * 32613) ^ 93213719;
                                                    i40 = 1378222414;
                                                    i41 = iM31620 ^ i40;
                                                    i54 = i39;
                                                    s3 = s2;
                                                    iM31623 = iM31623;
                                                    i55 = i41;
                                                    viewOnClickListenerC2507 = this;
                                                }
                                            } else {
                                                int iM27610 = C0619.m2761("۫ۘ") ^ i52;
                                                int i59 = ((iM27610 ^ i53) * 3609) ^ (-1720879117);
                                                i41 = iM27610 ^ 1863661932;
                                                i54 = i59;
                                                iM31623 = iM31623;
                                                c18452 = null;
                                                i55 = i41;
                                                viewOnClickListenerC2507 = this;
                                            }
                                            break;
                                        case -1875254487:
                                        case -944799986:
                                            iM31623 = iM31623;
                                            s2 = s3;
                                            sArr4 = f8020;
                                            c = 0;
                                            if (C3690.f12684 <= 0) {
                                                iM31620 = (i52 - C0773.m3169("ۨ۫")) * 65;
                                                i39 = ((iM31620 ^ i53) * 32613) ^ 93213719;
                                                i40 = 1378222414;
                                            } else {
                                                iM31620 = C0773.m3169("۬᩵") ^ i52;
                                                i39 = ((iM31620 ^ i53) * (-2805)) ^ (-604291760);
                                                i40 = -1127881736;
                                            }
                                            i41 = iM31620 ^ i40;
                                            i54 = i39;
                                            s3 = s2;
                                            iM31623 = iM31623;
                                            i55 = i41;
                                            viewOnClickListenerC2507 = this;
                                            break;
                                        case -1849326969:
                                        case 1786208609:
                                            int i60 = iM31623 ^ i48;
                                            C0950.m3793(c9898M42995, i47, i60, i47, i60);
                                            final C20472 c20473 = c20472;
                                            iM31623 = iM31623;
                                            final ViewOnClickListenerC21218 viewOnClickListenerC21219 = viewOnClickListenerC21218;
                                            if (C1826.m6301() < 0) {
                                                final DialogInterfaceC8327 dialogInterfaceC8327 = dialogInterfaceC8327M4860;
                                                c18452.m42994(new InterfaceC21436() { // from class: l.᩷ᩳ֫
                                                    {
                                                        int i61 = -1114204580;
                                                        int i62 = AbstractC3624.f12429;
                                                        int i63 = C23916.f77426;
                                                        int iM31624 = (C0773.m3169("ۜ֨") + i63) * (-7);
                                                        int i64 = ((iM31624 ^ i62) * 12727) ^ 2046880554;
                                                        int i65 = -519063224;
                                                        while (true) {
                                                            i61 = ((((i61 ^ i62) * 28629) >> 31) & i64) ^ (iM31624 ^ i65);
                                                            switch (i61) {
                                                                case -2100492390:
                                                                case 759218328:
                                                                    if (AbstractC0116.f1064 <= 0) {
                                                                        iM31624 = (i62 - C0619.m2761("ܰᩴ")) * (-41);
                                                                        i64 = ((iM31624 ^ i63) * 26095) ^ (-1047073237);
                                                                        i65 = -1776702538;
                                                                    } else {
                                                                        iM31624 = C0773.m3169("᩸᩸") ^ i62;
                                                                        i64 = ((iM31624 ^ i63) * 15897) ^ (-914901063);
                                                                        i65 = -1177293017;
                                                                    }
                                                                    break;
                                                                case -1749900299:
                                                                case -1388106629:
                                                                    if (C3734.f12817 >= 0) {
                                                                        iM31624 = C0619.m2761("۠ۢ") ^ i62;
                                                                        i64 = ((iM31624 ^ i63) * (-9641)) ^ (-1283863155);
                                                                        i65 = 402125559;
                                                                    } else {
                                                                        iM31624 = C0619.m2761("᩷᩶") ^ i63;
                                                                        i64 = ((iM31624 ^ i62) * (-26659)) ^ 557078679;
                                                                        i65 = 625251070;
                                                                    }
                                                                    break;
                                                                case -1697223782:
                                                                case 1848068171:
                                                                    if (C20932.f66974 <= 0) {
                                                                        iM31624 = C0773.m3169("ۙ۫") ^ i63;
                                                                        i64 = ((iM31624 ^ i62) * (-17787)) ^ (-1745496714);
                                                                        i65 = 2029699103;
                                                                    } else {
                                                                        iM31624 = (C0619.m2761("۬ۖ") + i63) * 115;
                                                                        i64 = ((iM31624 ^ i62) * (-10031)) ^ 2085713951;
                                                                        i65 = 1619600837;
                                                                    }
                                                                    break;
                                                                case -1331947981:
                                                                case 1093813052:
                                                                    C2375.m8065();
                                                                    if (C20932.f66974 <= 0) {
                                                                        iM31624 = C0619.m2761("۠ۢ") ^ i62;
                                                                        i64 = ((iM31624 ^ i63) * (-9641)) ^ (-1283863155);
                                                                        i65 = 402125559;
                                                                    } else {
                                                                        iM31624 = C0773.m3169("ۙ۫") ^ i63;
                                                                        i64 = ((iM31624 ^ i62) * (-17787)) ^ (-1745496714);
                                                                        i65 = 2029699103;
                                                                    }
                                                                    break;
                                                                case -1098572215:
                                                                case -132398344:
                                                                    C2702.m8876();
                                                                    C2419.m8174();
                                                                    throw new RuntimeException();
                                                                case -987325644:
                                                                case 863487560:
                                                                    return;
                                                                case -789565632:
                                                                case 1545209151:
                                                                    if (C1826.f6190 <= 0) {
                                                                        iM31624 = (C0619.m2761("۫᩵") ^ i63) * 87;
                                                                        i64 = ((iM31624 ^ i62) * (-13929)) ^ (-1421593804);
                                                                        i65 = 1961503565;
                                                                    } else {
                                                                        iM31624 = C0773.m3169("ۙ۫") ^ i63;
                                                                        i64 = ((iM31624 ^ i62) * (-17787)) ^ (-1745496714);
                                                                        i65 = 2029699103;
                                                                    }
                                                                    break;
                                                                case -609950820:
                                                                case 1478803075:
                                                                    if (C0487.m2356() >= 0) {
                                                                        iM31624 = (i62 - C0619.m2761("ܰᩴ")) * (-41);
                                                                        i64 = ((iM31624 ^ i63) * 26095) ^ (-1047073237);
                                                                        i65 = -1776702538;
                                                                    } else {
                                                                        iM31624 = C0773.m3169("ܿᩴ") ^ i63;
                                                                        i64 = ((iM31624 ^ i62) * (-13731)) ^ (-188410119);
                                                                        i65 = 160722635;
                                                                    }
                                                                    break;
                                                                case -230847507:
                                                                case 116954024:
                                                                    if (C3077.f9998) {
                                                                        iM31624 = (C0619.m2761("ۛ᩹") + i63) * (-59);
                                                                        i64 = ((iM31624 ^ i62) * (-23961)) ^ 187670867;
                                                                        i65 = 54783919;
                                                                    } else {
                                                                        iM31624 = (i62 - C0619.m2761("ܰᩴ")) * (-41);
                                                                        i64 = ((iM31624 ^ i63) * 26095) ^ (-1047073237);
                                                                        i65 = -1776702538;
                                                                    }
                                                                    break;
                                                                case -15971520:
                                                                case 1501030723:
                                                                    if (C0862.f3233 != 0) {
                                                                        iM31624 = (C0619.m2761("۫᩵") ^ i63) * 87;
                                                                        i64 = ((iM31624 ^ i62) * (-13929)) ^ (-1421593804);
                                                                        i65 = 1961503565;
                                                                    } else {
                                                                        iM31624 = C0773.m3169("᩷ᩴ") ^ i62;
                                                                        i64 = ((iM31624 ^ i63) * (-21113)) ^ 1874486409;
                                                                        i65 = -597899550;
                                                                    }
                                                                    break;
                                                                case 54190640:
                                                                case 336275141:
                                                                    if (C3734.f12817 >= 0) {
                                                                        iM31624 = C0773.m3169("ۙ۫") ^ i63;
                                                                        i64 = ((iM31624 ^ i62) * (-17787)) ^ (-1745496714);
                                                                        i65 = 2029699103;
                                                                    } else {
                                                                        iM31624 = C0619.m2761("᩷᩸") ^ i62;
                                                                        i64 = ((iM31624 ^ i63) * (-16285)) ^ 542564928;
                                                                        i65 = 1585596398;
                                                                    }
                                                                    break;
                                                                case 329024311:
                                                                case 530878391:
                                                                    if (C0269.f1558 <= 0) {
                                                                        iM31624 = C0619.m2761("۠ۢ") ^ i62;
                                                                        i64 = ((iM31624 ^ i63) * (-9641)) ^ (-1283863155);
                                                                        i65 = 402125559;
                                                                    } else {
                                                                        iM31624 = (C0619.m2761("۫ܳ") ^ i62) * (-13);
                                                                        i64 = ((iM31624 ^ i63) * 1755) ^ 1802659887;
                                                                        i65 = -11624806;
                                                                    }
                                                                    break;
                                                                case 359408325:
                                                                case 1599482770:
                                                                    if (C1542.f5343 <= 0) {
                                                                        iM31624 = (i62 - C0619.m2761("ܰᩴ")) * (-41);
                                                                        i64 = ((iM31624 ^ i63) * 26095) ^ (-1047073237);
                                                                        i65 = -1776702538;
                                                                    } else {
                                                                        iM31624 = C0773.m3169("ۚ᩶") ^ i62;
                                                                        i64 = ((iM31624 ^ i63) * 30643) ^ (-775496070);
                                                                        i65 = 512040576;
                                                                    }
                                                                    break;
                                                                case 1108953275:
                                                                case 1845905899:
                                                                    C2354.m7983();
                                                                    C3998.m12920();
                                                                    iM31624 = C0773.m3169("ᩳ᩵") ^ i62;
                                                                    i64 = ((iM31624 ^ i63) * 24895) ^ (-1789719565);
                                                                    i65 = -177505311;
                                                                    break;
                                                                case 1789636927:
                                                                case 2008458345:
                                                                    if (C3033.m9845() > 0) {
                                                                        iM31624 = C0773.m3169("ۙ۫") ^ i63;
                                                                        i64 = ((iM31624 ^ i62) * (-17787)) ^ (-1745496714);
                                                                        i65 = 2029699103;
                                                                    } else {
                                                                        iM31624 = C0773.m3169("ᩳ᩵") ^ i62;
                                                                        i64 = ((iM31624 ^ i63) * 24895) ^ (-1789719565);
                                                                        i65 = -177505311;
                                                                    }
                                                                    break;
                                                                default:
                                                                    if (C2702.f8586 <= 0) {
                                                                        iM31624 = C0619.m2761("۠ۢ") ^ i62;
                                                                        i64 = ((iM31624 ^ i63) * (-9641)) ^ (-1283863155);
                                                                        i65 = 402125559;
                                                                    } else {
                                                                        iM31624 = C0619.m2761("ᩳܳ") ^ i63;
                                                                        i64 = ((iM31624 ^ i62) * (-21953)) ^ (-68398713);
                                                                        i65 = -974380042;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    }

                                                    @Override // l.InterfaceC21436
                                                    public final boolean onMenuItemClick(MenuItem menuItem) {
                                                        ViewOnClickListenerC21218 viewOnClickListenerC212110 = null;
                                                        DialogInterfaceC8327 dialogInterfaceC8328 = null;
                                                        ViewOnClickListenerC7793 viewOnClickListenerC7795 = null;
                                                        C20472 c20474 = null;
                                                        int i61 = -1768724725;
                                                        int i62 = C2834.f9334;
                                                        int i63 = C1542.f5343;
                                                        int iM27611 = (C0619.m2761("۠᩸") + i63) * 75;
                                                        int i64 = ((iM27611 ^ i62) * (-23621)) ^ 653363732;
                                                        int i65 = 1344388739;
                                                        while (true) {
                                                            i61 = ((((i61 ^ i62) * (-20537)) >> 31) & i64) ^ (iM27611 ^ i65);
                                                            switch (i61) {
                                                                case -2145926036:
                                                                case -168667681:
                                                                    if (C3448.f11240 >= 0) {
                                                                        iM27611 = C0619.m2761("ܿۘ") ^ i62;
                                                                        i64 = ((iM27611 ^ i63) * 15121) ^ 1054433435;
                                                                        i65 = -325132857;
                                                                    } else {
                                                                        iM27611 = C0773.m3169("ܿ᩵") ^ i62;
                                                                        i64 = ((iM27611 ^ i63) * (-3693)) ^ 42262670;
                                                                        i65 = -1118165568;
                                                                    }
                                                                    break;
                                                                case -2073366728:
                                                                case 2055846234:
                                                                    AbstractC0116.m1243();
                                                                    return false;
                                                                case -1766467824:
                                                                case -562825581:
                                                                    dialogInterfaceC8328 = dialogInterfaceC8327;
                                                                    if (RunnableC1848.f6235) {
                                                                        iM27611 = C0619.m2761("ܿۘ") ^ i62;
                                                                        i64 = ((iM27611 ^ i63) * 15121) ^ 1054433435;
                                                                        i65 = -325132857;
                                                                    } else {
                                                                        iM27611 = C0619.m2761("۟֡") ^ i63;
                                                                        i64 = ((iM27611 ^ i62) * 31813) ^ 2101367984;
                                                                        i65 = 553363564;
                                                                    }
                                                                    break;
                                                                case -1750156368:
                                                                case 1796297545:
                                                                    if (AbstractC0116.f1064 > 0) {
                                                                        iM27611 = C0773.m3169("ᩴ᩵") ^ i62;
                                                                        i64 = ((iM27611 ^ i63) * 8003) ^ 661119701;
                                                                        i65 = -887090071;
                                                                    } else {
                                                                        iM27611 = (C0619.m2761("֡ܺ") ^ i63) * (-65);
                                                                        i64 = ((iM27611 ^ i62) * 1795) ^ (-952892293);
                                                                        i65 = 912961970;
                                                                    }
                                                                    break;
                                                                case -1546154130:
                                                                case 1601736224:
                                                                    if (C23916.f77426 <= 0) {
                                                                        iM27611 = C0619.m2761("ᩳܽ") ^ i63;
                                                                        i64 = ((iM27611 ^ i62) * 17917) ^ 1571906064;
                                                                        i65 = -283541519;
                                                                    } else {
                                                                        iM27611 = (C0619.m2761("ۨܺ") + i62) * (-17);
                                                                        i64 = ((iM27611 ^ i63) * 26237) ^ 1412853171;
                                                                        i65 = 732070158;
                                                                    }
                                                                    break;
                                                                case -1529749956:
                                                                case -725582448:
                                                                    if (C1146.f4234 >= 0) {
                                                                        iM27611 = C0619.m2761("ܿۘ") ^ i62;
                                                                        i64 = ((iM27611 ^ i63) * 15121) ^ 1054433435;
                                                                        i65 = -325132857;
                                                                    } else {
                                                                        iM27611 = (C0619.m2761("ᩳ֨") + i62) * 115;
                                                                        i64 = ((iM27611 ^ i63) * (-22403)) ^ 1779715102;
                                                                        i65 = -920830182;
                                                                    }
                                                                    break;
                                                                case -1501854473:
                                                                case 1053192601:
                                                                    C13473.m33144();
                                                                    C3448.m11248();
                                                                    iM27611 = C0773.m3169("ᩴ᩵") ^ i62;
                                                                    i64 = ((iM27611 ^ i63) * 8003) ^ 661119701;
                                                                    i65 = -887090071;
                                                                    break;
                                                                case -1072750829:
                                                                case 1747686553:
                                                                    if (AbstractC3624.f12429 <= 0) {
                                                                        iM27611 = C0619.m2761("ᩳܽ") ^ i63;
                                                                        i64 = ((iM27611 ^ i62) * 17917) ^ 1571906064;
                                                                        i65 = -283541519;
                                                                    } else {
                                                                        iM27611 = C0773.m3169("ᩴ᩵") ^ i62;
                                                                        i64 = ((iM27611 ^ i63) * 8003) ^ 661119701;
                                                                        i65 = -887090071;
                                                                    }
                                                                    break;
                                                                case -911628476:
                                                                case 1929338433:
                                                                    ViewOnClickListenerC7793.m21203(viewOnClickListenerC7795, c20474, viewOnClickListenerC212110, dialogInterfaceC8328, menuItem);
                                                                    return true;
                                                                case -662842922:
                                                                case -233608442:
                                                                    if (C1321.f4751 >= 0) {
                                                                        iM27611 = C0619.m2761("ᩳܽ") ^ i63;
                                                                        i64 = ((iM27611 ^ i62) * 17917) ^ 1571906064;
                                                                        i65 = -283541519;
                                                                    } else {
                                                                        iM27611 = (C0773.m3169("ۢ֨") ^ i63) * (-67);
                                                                        i64 = ((iM27611 ^ i62) * (-135)) ^ (-1026313012);
                                                                        i65 = 785719578;
                                                                    }
                                                                    break;
                                                                case -553037659:
                                                                case 492989645:
                                                                    if (C3077.f9998) {
                                                                        iM27611 = (C0773.m3169("ܰܽ") ^ i63) * 29;
                                                                        i64 = ((iM27611 ^ i62) * (-20077)) ^ 230168100;
                                                                        i65 = -1510800286;
                                                                    } else {
                                                                        iM27611 = C0619.m2761("ᩳܽ") ^ i63;
                                                                        i64 = ((iM27611 ^ i62) * 17917) ^ 1571906064;
                                                                        i65 = -283541519;
                                                                    }
                                                                    break;
                                                                case 306760879:
                                                                case 801685743:
                                                                    if (C20932.f66974 <= 0) {
                                                                        iM27611 = C0773.m3169("ᩴ᩵") ^ i62;
                                                                        i64 = ((iM27611 ^ i63) * 8003) ^ 661119701;
                                                                        i65 = -887090071;
                                                                    } else {
                                                                        iM27611 = C0619.m2761("ܰ֡") ^ i62;
                                                                        i64 = ((iM27611 ^ i63) * 29067) ^ (-2110949145);
                                                                        i65 = 1378565484;
                                                                    }
                                                                    break;
                                                                case 639339601:
                                                                case 967688506:
                                                                    viewOnClickListenerC212110 = viewOnClickListenerC21219;
                                                                    if (C1343.f4799 != 0) {
                                                                        iM27611 = C0619.m2761("ܿۘ") ^ i62;
                                                                        i64 = ((iM27611 ^ i63) * 15121) ^ 1054433435;
                                                                        i65 = -325132857;
                                                                    } else {
                                                                        iM27611 = (i63 - C0619.m2761("ᩴܺ")) * 93;
                                                                        i64 = ((iM27611 ^ i62) * (-16731)) ^ 685562645;
                                                                        i65 = 836997278;
                                                                    }
                                                                    break;
                                                                case 876882812:
                                                                case 1452455237:
                                                                    if (C2354.m7983()) {
                                                                        iM27611 = C0773.m3169("᩻ۜ") ^ i62;
                                                                        i64 = ((iM27611 ^ i63) * (-10649)) ^ 2132817376;
                                                                        i65 = 1994870571;
                                                                    } else {
                                                                        iM27611 = C0619.m2761("ܿۘ") ^ i62;
                                                                        i64 = ((iM27611 ^ i63) * 15121) ^ 1054433435;
                                                                        i65 = -325132857;
                                                                    }
                                                                    break;
                                                                case 1228024324:
                                                                case 1771746018:
                                                                    viewOnClickListenerC7795 = viewOnClickListenerC7794;
                                                                    c20474 = c20473;
                                                                    if (C2966.f9654 >= 0) {
                                                                        iM27611 = C0619.m2761("ᩳܽ") ^ i63;
                                                                        i64 = ((iM27611 ^ i62) * 17917) ^ 1571906064;
                                                                        i65 = -283541519;
                                                                    } else {
                                                                        iM27611 = C0773.m3169("ۡ᩻") ^ i62;
                                                                        i64 = ((iM27611 ^ i63) * 4863) ^ 1176268479;
                                                                        i65 = 1035338795;
                                                                    }
                                                                    break;
                                                                default:
                                                                    if (C3448.f11240 >= 0) {
                                                                        iM27611 = C0773.m3169("ᩴ᩵") ^ i62;
                                                                        i64 = ((iM27611 ^ i63) * 8003) ^ 661119701;
                                                                        i65 = -887090071;
                                                                    } else {
                                                                        iM27611 = C0773.m3169("֡᩺") ^ i63;
                                                                        i64 = ((iM27611 ^ i62) * (-25289)) ^ (-508162369);
                                                                        i65 = -1650363067;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                });
                                                c18452.mo21878();
                                            }
                                            int iM27611 = C0619.m2761("۫ۘ") ^ i52;
                                            int i510 = ((iM27611 ^ i53) * 3609) ^ (-1720879117);
                                            i41 = iM27611 ^ 1863661932;
                                            i54 = i510;
                                            iM31623 = iM31623;
                                            c18452 = null;
                                            i55 = i41;
                                            viewOnClickListenerC2507 = this;
                                            break;
                                        case -1805638745:
                                        case 1501581239:
                                            C0862.m3503();
                                            RunnableC1848.m6360();
                                            break;
                                        case -1709976181:
                                        case 569732547:
                                            AbstractC0116.m1243();
                                            if (C3033.f9831 >= 0) {
                                                iM31623 = iM31623;
                                                iM31622 = (i53 - C0619.m2761("ۛۨ")) * 9;
                                                i44 = ((iM31622 ^ i52) * (-24069)) ^ (-1683252742);
                                                i45 = -1280632807;
                                                i46 = iM31623;
                                                i55 = iM31622 ^ i45;
                                                i54 = i44;
                                                iM31623 = i46;
                                            } else {
                                                iM31623 = iM31623;
                                                s2 = s3;
                                                iM31620 = (i52 - C0773.m3169("ۨ۫")) * 65;
                                                i39 = ((iM31620 ^ i53) * 32613) ^ 93213719;
                                                i40 = 1378222414;
                                                i41 = iM31620 ^ i40;
                                                i54 = i39;
                                                s3 = s2;
                                                iM31623 = iM31623;
                                                i55 = i41;
                                                viewOnClickListenerC2507 = this;
                                            }
                                            break;
                                        case -1589033450:
                                        case -77341695:
                                            iM31623 = iM31623;
                                            strM3500 = C0862.m3500(f8020, 1, 3, i50);
                                            if (C0950.f3488 < 0) {
                                                iM31622 = C0619.m2761("ۡܿ") ^ i53;
                                                i44 = ((iM31622 ^ i52) * 3835) ^ 707547330;
                                                i45 = 28213865;
                                                i46 = iM31623;
                                                i55 = iM31622 ^ i45;
                                                i54 = i44;
                                                iM31623 = i46;
                                            } else {
                                                iM31623 = iM31623;
                                                iM2767 = C0619.m2761("ܶ᩶") ^ i52;
                                                i37 = ((iM2767 ^ i53) * (-10433)) ^ 1676222346;
                                                i38 = 636185215;
                                                i55 = iM2767 ^ i38;
                                                i54 = i37;
                                            }
                                            break;
                                        case -1517239275:
                                        case -374879904:
                                            iM31623 = iM31623;
                                            int i61 = 2122707413 ^ iM2768;
                                            C4238.m13541(c9898M42995, i47, i61, i47, i61);
                                            sArr5 = f8020;
                                            i56 = 7;
                                            if (C2419.f7754 < 0) {
                                                iM31622 = (C0619.m2761("ܺ֡") ^ i53) * 9;
                                                i44 = ((iM31622 ^ i52) * 1187) ^ (-1102776532);
                                                i45 = -1687265312;
                                                i46 = iM31623;
                                                i55 = iM31622 ^ i45;
                                                i54 = i44;
                                                iM31623 = i46;
                                            } else {
                                                s2 = s3;
                                                iM31620 = (i52 - C0773.m3169("ۨ۫")) * 65;
                                                i39 = ((iM31620 ^ i53) * 32613) ^ 93213719;
                                                i40 = 1378222414;
                                                i41 = iM31620 ^ i40;
                                                i54 = i39;
                                                s3 = s2;
                                                iM31623 = iM31623;
                                                i55 = i41;
                                                viewOnClickListenerC2507 = this;
                                            }
                                            break;
                                        case -1356216531:
                                        case 1072458482:
                                            iM31623 = C0773.m3169(C20932.m47853(sArr5, i56, 3, i50));
                                            i48 = 2099953705;
                                            if (C17202.f56030) {
                                                iM2767 = (i53 - C0773.m3169("֫ܿ")) * (-125);
                                                i37 = ((iM2767 ^ i52) * (-13855)) ^ 459710256;
                                                i38 = -1084158133;
                                            } else {
                                                iM2767 = C0619.m2761("ܶ᩶") ^ i52;
                                                i37 = ((iM2767 ^ i53) * (-10433)) ^ 1676222346;
                                                i38 = 636185215;
                                            }
                                            i55 = iM2767 ^ i38;
                                            i54 = i37;
                                            break;
                                        case -1311309803:
                                        case 294490519:
                                            iM31623 = iM31623;
                                            int iM27612 = C0619.m2761(strM3500) ^ 2123481938;
                                            C0950.m3793(c9898M42995, i47, iM27612, i47, iM27612);
                                            sArr3 = f8020;
                                            if (C2485.m8357() <= 0) {
                                                iM31622 = (i53 - C0619.m2761("ۛۨ")) * 9;
                                                i44 = ((iM31622 ^ i52) * (-24069)) ^ (-1683252742);
                                                i45 = -1280632807;
                                            } else {
                                                iM31622 = C0773.m3169("ۤۜ") ^ i52;
                                                i44 = ((iM31622 ^ i53) * 15483) ^ (-1464282380);
                                                i45 = 1416176237;
                                            }
                                            i46 = iM31623;
                                            i55 = iM31622 ^ i45;
                                            i54 = i44;
                                            iM31623 = i46;
                                            break;
                                        case -1251294763:
                                        case 1795889565:
                                            RunnableC3055.m9933();
                                            if (C2702.f8586 > 0) {
                                                iM2767 = (C0619.m2761("۫ۗ") ^ i53) * (-31);
                                                i37 = ((iM2767 ^ i52) * (-22887)) ^ 1147781192;
                                                i38 = 1536619382;
                                                i55 = iM2767 ^ i38;
                                                i54 = i37;
                                            } else {
                                                iM31623 = iM31623;
                                                s2 = s3;
                                                iM31620 = (i52 - C0773.m3169("ۨ۫")) * 65;
                                                i39 = ((iM31620 ^ i53) * 32613) ^ 93213719;
                                                i40 = 1378222414;
                                                i41 = iM31620 ^ i40;
                                                i54 = i39;
                                                s3 = s2;
                                                iM31623 = iM31623;
                                                i55 = i41;
                                                viewOnClickListenerC2507 = this;
                                            }
                                            break;
                                        case -1193545907:
                                        case 750936768:
                                            iM31623 = iM31623;
                                            s3 = sArr4[c];
                                            i57 = s3 * s3;
                                            i49 = 188732644;
                                            if (C17202.f56030) {
                                                int iM31624 = C0773.m3169("۬ܺ") ^ i53;
                                                int i62 = ((iM31624 ^ i52) * 16905) ^ 219003084;
                                                i41 = iM31624 ^ (-1825146446);
                                                i54 = i62;
                                                iM31623 = iM31623;
                                            } else {
                                                int iM27613 = C0619.m2761("۫ۘ") ^ i52;
                                                int i511 = ((iM27613 ^ i53) * 3609) ^ (-1720879117);
                                                i41 = iM27613 ^ 1863661932;
                                                i54 = i511;
                                                iM31623 = iM31623;
                                                c18452 = null;
                                            }
                                            i55 = i41;
                                            viewOnClickListenerC2507 = this;
                                            break;
                                        case -85988616:
                                        case 1442572114:
                                            C2834.m9344();
                                            if (AbstractC0116.m1243() == 0) {
                                                iM2767 = C0619.m2761("ܶ᩶") ^ i52;
                                                i37 = ((iM2767 ^ i53) * (-10433)) ^ 1676222346;
                                                i38 = 636185215;
                                                i55 = iM2767 ^ i38;
                                                i54 = i37;
                                            } else {
                                                iM31623 = iM31623;
                                                s2 = s3;
                                                iM31620 = (i52 - C0773.m3169("ۨ۫")) * 65;
                                                i39 = ((iM31620 ^ i53) * 32613) ^ 93213719;
                                                i40 = 1378222414;
                                                i41 = iM31620 ^ i40;
                                                i54 = i39;
                                                s3 = s2;
                                                iM31623 = iM31623;
                                                i55 = i41;
                                                viewOnClickListenerC2507 = this;
                                            }
                                            break;
                                        case 392371583:
                                        case 1349977001:
                                            iM31623 = iM31623;
                                            iM2768 = C0619.m2761(AbstractC3624.m11769(sArr3, 4, 3, i50));
                                            if (!C2878.f9462) {
                                                iM31622 = (i52 - C0773.m3169("ᩳۖ")) * (-13);
                                                i44 = ((iM31622 ^ i53) * (-26795)) ^ 1508713208;
                                                i45 = 590401595;
                                                i46 = iM31623;
                                                i55 = iM31622 ^ i45;
                                                i54 = i44;
                                                iM31623 = i46;
                                            } else {
                                                int iM27614 = C0619.m2761("۫ۘ") ^ i52;
                                                int i512 = ((iM27614 ^ i53) * 3609) ^ (-1720879117);
                                                i41 = iM27614 ^ 1863661932;
                                                i54 = i512;
                                                iM31623 = iM31623;
                                                c18452 = null;
                                                i55 = i41;
                                                viewOnClickListenerC2507 = this;
                                            }
                                            break;
                                        case 1211758541:
                                        case 1409462267:
                                            i50 = 58379;
                                            iM31621 = (i53 - C0619.m2761("ܽۤ")) * 43;
                                            i42 = ((iM31621 ^ i52) * 11419) ^ 102046951;
                                            i43 = 787975419;
                                            i54 = i42;
                                            i46 = iM31623;
                                            i55 = iM31621 ^ i43;
                                            iM31623 = i46;
                                            break;
                                        case 1483713119:
                                        case 1510775496:
                                            i50 = 48402;
                                            iM31621 = (i53 - C0619.m2761("ܽۤ")) * 43;
                                            i42 = ((iM31621 ^ i52) * 11419) ^ 102046951;
                                            i43 = 787975419;
                                            i54 = i42;
                                            i46 = iM31623;
                                            i55 = iM31621 ^ i43;
                                            iM31623 = i46;
                                            break;
                                        default:
                                            iM31623 = iM31623;
                                            int i63 = i57 + i49;
                                            s2 = s3;
                                            int i64 = s2 + 13738;
                                            if ((i63 + i63) - (i64 * i64) >= 0) {
                                                iM31620 = (C0773.m3169("᩶ۘ") + i53) * (-117);
                                                i39 = ((iM31620 ^ i52) * (-22347)) ^ (-9390906);
                                                i40 = 51162487;
                                            } else {
                                                iM31620 = C0619.m2761("᩸ܳ") ^ i52;
                                                i39 = ((iM31620 ^ i53) * 32413) ^ 652247430;
                                                i40 = 1551002712;
                                            }
                                            i41 = iM31620 ^ i40;
                                            i54 = i39;
                                            s3 = s2;
                                            iM31623 = iM31623;
                                            i55 = i41;
                                            viewOnClickListenerC2507 = this;
                                            break;
                                    }
                                    return;
                                }
                            }
                        });
                    } else {
                        str = str5;
                        i20 = i36;
                        view = viewM11247;
                        textView = textView5;
                        sArr = sArr2;
                        i3 = i21;
                        iM2762 = C0619.m2761("᩷ܺ") ^ i15;
                        i = ((iM2762 ^ i16) * (-23769)) ^ (-764336806);
                        i13 = 420152793;
                        int i2116 = iM2762 ^ i13;
                        sArr2 = sArr;
                        i21 = i3;
                        viewM11247 = view;
                        abstractC22044M1774 = abstractC22045;
                        textView5 = textView;
                        i18 = i2116;
                        str5 = str;
                        i17 = i;
                        abstractC22048 = abstractC22048;
                    }
                    break;
                case 1797315956:
                case 2096067463:
                    abstractC22046 = abstractC22048;
                    abstractC22047 = abstractC22044M1774;
                    C2485.m8358(C3448.m11246(viewM2812, C0773.m3169(C2023.m6966(f25870, 163, 3, i19)) ^ 2104140941), i20);
                    iM31611 = (C0773.m3169("ᩳۢ") + i16) * (-85);
                    i6 = ((iM31611 ^ i15) * (-20199)) ^ 1251837970;
                    i7 = 2122223037;
                    int i2117 = iM31611 ^ i7;
                    abstractC22044M1774 = abstractC22047;
                    abstractC22048 = abstractC22046;
                    textView5 = textView5;
                    i18 = i2117;
                    i17 = i6;
                    viewM11247 = viewM11247;
                    str5 = str5;
                    break;
                default:
                    int i37 = i20;
                    AbstractC22044 abstractC22049 = abstractC22048;
                    abstractC22044M1774 = abstractC22044M1774;
                    str5 = str5;
                    viewM11247 = viewM11247;
                    if ((packageInfo.applicationInfo.flags & 129) != 0) {
                        abstractC22044 = abstractC22049;
                        i20 = i37;
                        iM2761 = C0773.m3169("᩷᩻") ^ i16;
                        i10 = ((iM2761 ^ i15) * (-10431)) ^ 772179450;
                        i11 = 137537818;
                        int i38 = iM2761 ^ i11;
                        abstractC22044M1774 = abstractC22044M1774;
                        i18 = i38;
                        i17 = i10;
                        abstractC22048 = abstractC22044;
                        viewM11247 = viewM11247;
                        str5 = str5;
                    } else {
                        abstractC22044M1774 = abstractC22044M1774;
                        abstractC22048 = abstractC22049;
                        i20 = i37;
                        textView2 = textView5;
                        iM31612 = C0773.m3169("ۤ֨") ^ i16;
                        i8 = ((iM31612 ^ i15) * 22265) ^ (-1486807576);
                        i9 = -1343955749;
                        i18 = iM31612 ^ i9;
                        i17 = i8;
                        viewM11247 = viewM11247;
                        textView5 = textView2;
                        str5 = str5;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x041f A[PHI: r12 r26 r27 r28 r29
      0x041f: PHI (r12v4 java.lang.String) = (r12v2 java.lang.String), (r12v3 java.lang.String), (r12v2 java.lang.String) binds: [B:103:0x041d, B:84:0x02fa, B:26:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x041f: PHI (r26v48 java.lang.String) = (r26v36 java.lang.String), (r26v44 java.lang.String), (r26v49 java.lang.String) binds: [B:103:0x041d, B:84:0x02fa, B:26:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x041f: PHI (r27v5 java.lang.String) = (r27v4 java.lang.String), (r27v3 java.lang.String), (r27v3 java.lang.String) binds: [B:103:0x041d, B:84:0x02fa, B:26:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x041f: PHI (r28v27 java.lang.String) = (r28v17 java.lang.String), (r28v23 java.lang.String), (r28v28 java.lang.String) binds: [B:103:0x041d, B:84:0x02fa, B:26:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x041f: PHI (r29v23 java.lang.String) = (r29v13 java.lang.String), (r29v19 java.lang.String), (r29v24 java.lang.String) binds: [B:103:0x041d, B:84:0x02fa, B:26:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b9, code lost:
    
        if (l.C3734.f12817 >= 0) goto L14;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m21203(l.ViewOnClickListenerC7793 r30, l.C20472 r31, l.ViewOnClickListenerC21218 r32, l.DialogInterfaceC8327 r33, android.view.MenuItem r34) {
        /*
            Method dump skipped, instruction units count: 1918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC7793.m21203(l.۟ۢ֫, l.᩵ۢ֫, l.᩶ۢ֫, l.۠ۖۧ, android.view.MenuItem):void");
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0240 A[PHI: r3 r4 r5 r8 r15 r22
      0x0240: PHI (r3v3 l.᩷ۨᩴ) = (r3v2 l.᩷ۨᩴ), (r3v2 l.᩷ۨᩴ), (r3v2 l.᩷ۨᩴ), (r3v4 l.᩷ۨᩴ) binds: [B:63:0x023e, B:59:0x021f, B:35:0x012c, B:27:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r4v3 short[]) = (r4v2 short[]), (r4v2 short[]), (r4v2 short[]), (r4v4 short[]) binds: [B:63:0x023e, B:59:0x021f, B:35:0x012c, B:27:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v4 int) binds: [B:63:0x023e, B:59:0x021f, B:35:0x012c, B:27:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:63:0x023e, B:59:0x021f, B:35:0x012c, B:27:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:63:0x023e, B:59:0x021f, B:35:0x012c, B:27:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r22v5 int) = (r22v4 int), (r22v3 int), (r22v3 int), (r22v3 int) binds: [B:63:0x023e, B:59:0x021f, B:35:0x012c, B:27:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0275 A[PHI: r1 r6 r11 r13
      0x0275: PHI (r1v4 l.ۢ֫ܺ) = (r1v2 l.ۢ֫ܺ), (r1v3 l.ۢ֫ܺ), (r1v2 l.ۢ֫ܺ), (r1v2 l.ۢ֫ܺ), (r1v2 l.ۢ֫ܺ), (r1v2 l.ۢ֫ܺ) binds: [B:67:0x0273, B:43:0x0172, B:19:0x00a6, B:16:0x008c, B:13:0x0083, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:67:0x0273, B:43:0x0172, B:19:0x00a6, B:16:0x008c, B:13:0x0083, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v5 int) binds: [B:67:0x0273, B:43:0x0172, B:19:0x00a6, B:16:0x008c, B:13:0x0083, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:67:0x0273, B:43:0x0172, B:19:0x00a6, B:16:0x008c, B:13:0x0083, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02ab A[PHI: r9 r10 r14 r16 r17
      0x02ab: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:71:0x02a9, B:55:0x01fc, B:39:0x014e, B:13:0x0083, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x02ab: PHI (r10v4 short) = (r10v2 short), (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:71:0x02a9, B:55:0x01fc, B:39:0x014e, B:13:0x0083, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x02ab: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:71:0x02a9, B:55:0x01fc, B:39:0x014e, B:13:0x0083, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x02ab: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:71:0x02a9, B:55:0x01fc, B:39:0x014e, B:13:0x0083, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x02ab: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:71:0x02a9, B:55:0x01fc, B:39:0x014e, B:13:0x0083, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m21212() {
        int iM3169;
        int i;
        int i2;
        int i3 = AbstractC0641.f2496;
        int i4 = RunnableC0334.f1808;
        int iM31610 = C0773.m3169("۫᩵") ^ i3;
        int i5 = ((iM31610 ^ i4) * (-30633)) ^ 1980687885;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM31610 ^ (-711564843);
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        int i14 = -1136664583;
        int i15 = 0;
        AbstractC22044 abstractC22044M18134 = null;
        String strM8877 = null;
        InterfaceC9801 interfaceC9801 = null;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i4) * (-12675)) >> 31));
            switch (i14) {
                case -2146544823:
                case -408786621:
                    i8 = i15 + 138062500;
                    if (C4238.m13540() <= 0) {
                        iM3169 = (C0619.m2761("᩸۠") + i3) * 101;
                        i = ((iM3169 ^ i4) * 18909) ^ 753387605;
                        i2 = -1605541785;
                    } else {
                        iM3169 = (C0619.m2761("ۚ᩸") + i3) * 123;
                        i = ((iM3169 ^ i4) * (-29969)) ^ 1614954137;
                        i2 = -1740853030;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2092771851:
                case 1500692235:
                    s = sArr[c];
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0619.m2761("ۤ۠") ^ i4;
                        i = ((iM3169 ^ i3) * 3583) ^ 697251416;
                        i2 = 458625494;
                    } else {
                        iM3169 = (C0619.m2761("ܽᩳ") + i4) * (-77);
                        i = ((iM3169 ^ i3) * 22031) ^ 551059835;
                        i2 = 436262499;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2019511286:
                case -668473503:
                    i12 = 250;
                    if (C2287.m7745() <= 0) {
                        iM3169 = C0619.m2761("ۢ۬") ^ i3;
                        i = ((iM3169 ^ i4) * 9163) ^ (-1908630281);
                        i2 = 966427312;
                    } else {
                        iM3169 = (C0619.m2761("ۨᩴ") ^ i3) * (-99);
                        i = ((iM3169 ^ i4) * (-3709)) ^ 1314648027;
                        i2 = 312310317;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1988229760:
                case 443209880:
                    interfaceC9801 = ApplicationC17729.f58258;
                    sArr2 = f25870;
                    if (RunnableC0334.m2063()) {
                        iM3169 = C0619.m2761("ۤ۠") ^ i4;
                        i = ((iM3169 ^ i3) * 3583) ^ 697251416;
                        i2 = 458625494;
                    } else {
                        iM3169 = (C0619.m2761("ۨܳ") ^ i3) * 45;
                        i = ((iM3169 ^ i4) * (-21007)) ^ (-1363390783);
                        i2 = -522355569;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1741385481:
                case -238310493:
                    if ((i10 * i10) - i9 <= 0) {
                        iM3169 = C0619.m2761("ܿۨ") ^ i3;
                        i = ((iM3169 ^ i4) * 24621) ^ (-1596394215);
                        i2 = 1386285416;
                    } else {
                        iM3169 = C0773.m3169("ᩳۡ") ^ i4;
                        i = ((iM3169 ^ i3) * (-13623)) ^ 1785990922;
                        i2 = -378159958;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1725660867:
                case 1000515446:
                    RunnableC0334.m2063();
                    C3033.m9845();
                    iM3169 = C0619.m2761("ۤ۠") ^ i4;
                    i = ((iM3169 ^ i3) * 3583) ^ 697251416;
                    i2 = 458625494;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1702646174:
                case 757956394:
                    i9 = i8 + i8;
                    s2 = 11750;
                    if (RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("ۢ۬") ^ i3;
                        i = ((iM3169 ^ i4) * 9163) ^ (-1908630281);
                        i2 = 966427312;
                    } else {
                        iM3169 = C0773.m3169("ۡᩴ") ^ i3;
                        i = ((iM3169 ^ i4) * 12839) ^ (-20974532);
                        i2 = -936475157;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1569544173:
                case 2120056916:
                    return C0269.m1774(abstractC22044M18134, C1146.m4222(sArr3, i7, 4, i11));
                case -1529519510:
                case -590776149:
                    i11 = 32257;
                    iM3169 = C0619.m2761("ܽۧ") ^ i4;
                    i = ((iM3169 ^ i3) * 21897) ^ 1136423863;
                    i2 = 802537757;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1286616312:
                case 1573361570:
                    C3099.m10095();
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0619.m2761("ۤ۠") ^ i4;
                        i = ((iM3169 ^ i3) * 3583) ^ 697251416;
                        i2 = 458625494;
                    } else {
                        iM3169 = C0619.m2761("ۡۙ") ^ i4;
                        i = ((iM3169 ^ i3) * (-17507)) ^ 59997946;
                        i2 = -1399086102;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1252257775:
                case -870977769:
                    return C3099.m10081(strM8877, new String[0]);
                case -967506529:
                case 1539855342:
                    strM8877 = C2702.m8877(interfaceC9801, C1783.m6233(sArr2, i12, i13, i11), null);
                    if (strM8877 != null) {
                        iM3169 = (i3 - C0619.m2761("ۤ᩸")) * 73;
                        i = ((iM3169 ^ i4) * 27023) ^ (-1686675447);
                        i2 = 603937887;
                    } else {
                        iM3169 = (C0619.m2761("ܺۜ") + i3) * 95;
                        i = ((iM3169 ^ i4) * 30675) ^ (-1617524444);
                        i2 = -1065661159;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -822853828:
                case 771019364:
                    i15 = s * s;
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0619.m2761("᩸۠") + i3) * 101;
                        i = ((iM3169 ^ i4) * 18909) ^ 753387605;
                        i2 = -1605541785;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۢۜ")) * q.h;
                        i = ((iM3169 ^ i3) * 513) ^ (-1495734471);
                        i2 = -638481534;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -663454957:
                case -489507410:
                    i11 = 58664;
                    iM3169 = C0619.m2761("ܽۧ") ^ i4;
                    i = ((iM3169 ^ i3) * 21897) ^ 1136423863;
                    i2 = 802537757;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -366581674:
                case 168409810:
                    C11235.m28309();
                    if (C2288.m7767()) {
                        iM3169 = C0619.m2761("ۢ۬") ^ i3;
                        i = ((iM3169 ^ i4) * 9163) ^ (-1908630281);
                        i2 = 966427312;
                    } else {
                        iM3169 = C0619.m2761("ۤ۠") ^ i4;
                        i = ((iM3169 ^ i3) * 3583) ^ 697251416;
                        i2 = 458625494;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 301781890:
                case 787034981:
                    C4238.m13540();
                    return null;
                case 426079689:
                case 1741158629:
                    C3998.m12920();
                    if (C1343.f4799 == 0) {
                        iM3169 = C0619.m2761("ۢ۬") ^ i3;
                        i = ((iM3169 ^ i4) * 9163) ^ (-1908630281);
                        i2 = 966427312;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۙ᩷")) * 95;
                        i = ((iM3169 ^ i3) * (-13599)) ^ (-1861281383);
                        i2 = -68203363;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 645442731:
                case 1575271019:
                    i13 = 16;
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (C0619.m2761("᩸۠") + i3) * 101;
                        i = ((iM3169 ^ i4) * 18909) ^ 753387605;
                        i2 = -1605541785;
                    } else {
                        iM3169 = (C0619.m2761("᩻᩶") + i4) * (-73);
                        i = ((iM3169 ^ i3) * 23643) ^ 780935629;
                        i2 = -259594776;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1029950673:
                case 1598227661:
                    sArr = f25870;
                    c = 249;
                    if (RunnableC0334.m2063()) {
                        iM3169 = C0619.m2761("ۢ۬") ^ i3;
                        i = ((iM3169 ^ i4) * 9163) ^ (-1908630281);
                        i2 = 966427312;
                    } else {
                        iM3169 = C0773.m3169("֫۬") ^ i3;
                        i = ((iM3169 ^ i4) * (-28093)) ^ (-141648598);
                        i2 = -743990184;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1172512693:
                case 2074119176:
                    abstractC22044M18134 = C6382.m18134();
                    sArr3 = f25870;
                    i7 = 266;
                    if (C1519.m5403()) {
                        iM3169 = (C0773.m3169("ۙۤ") + i4) * 71;
                        i = ((iM3169 ^ i3) * 19629) ^ (-941292653);
                        i2 = -1776159742;
                    } else {
                        iM3169 = (C0619.m2761("᩸۠") + i3) * 101;
                        i = ((iM3169 ^ i4) * 18909) ^ 753387605;
                        i2 = -1605541785;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    i10 = s + s2;
                    if (C0862.f3233 != 0) {
                        iM3169 = C0619.m2761("ۤ۠") ^ i4;
                        i = ((iM3169 ^ i3) * 3583) ^ 697251416;
                        i2 = 458625494;
                    } else {
                        iM3169 = C0619.m2761("ۙۢ") ^ i4;
                        i = ((iM3169 ^ i3) * (-3917)) ^ 1164502696;
                        i2 = -998994363;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ac A[PHI: r2 r3
      0x00ac: PHI (r2v4 int) = (r2v3 int), (r2v2 int) binds: [B:24:0x0094, B:19:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r3v4 int) = (r3v3 int), (r3v2 int) binds: [B:24:0x0094, B:19:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ea A[PHI: r14
      0x00ea: PHI (r14v4 int) = (r14v3 int), (r14v2 int) binds: [B:32:0x00e8, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01d5 A[PHI: r1 r8 r13
      0x01d5: PHI (r1v3 l.ۢ֫ܺ) = (r1v2 l.ۢ֫ܺ), (r1v4 l.ۢ֫ܺ) binds: [B:55:0x01d3, B:36:0x011e] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r8v4 int) = (r8v3 int), (r8v2 int) binds: [B:55:0x01d3, B:36:0x011e] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r13v3 short[]) = (r13v2 short[]), (r13v4 short[]) binds: [B:55:0x01d3, B:36:0x011e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0226 A[PHI: r6 r9 r10 r15
      0x0226: PHI (r6v5 short) = (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:63:0x0224, B:51:0x01b3, B:28:0x00c8, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r9v5 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:63:0x0224, B:51:0x01b3, B:28:0x00c8, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r10v5 short) = (r10v2 short), (r10v3 short), (r10v2 short), (r10v2 short) binds: [B:63:0x0224, B:51:0x01b3, B:28:0x00c8, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r15v5 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:63:0x0224, B:51:0x01b3, B:28:0x00c8, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0259 A[PHI: r7 r11
      0x0259: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:67:0x0257, B:59:0x0207, B:47:0x0193, B:14:0x0065, B:12:0x0061, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:67:0x0257, B:59:0x0207, B:47:0x0193, B:14:0x0065, B:12:0x0061, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0291 A[PHI: r5 r20
      0x0291: PHI (r5v4 char) = (r5v3 char), (r5v2 char), (r5v2 char) binds: [B:71:0x028f, B:12:0x0061, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:71:0x028f, B:12:0x0061, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static int m21242() {
        int iM3169;
        int i;
        int i2;
        int i3 = C1542.f5343;
        int i4 = C1519.f5300;
        int iM31610 = (C0773.m3169("۬֡") ^ i3) * 79;
        int i5 = ((iM31610 ^ i4) * 31869) ^ 1969394679;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM31610 ^ 533948316;
        InterfaceC9801 interfaceC9801 = null;
        int i7 = 0;
        int i8 = 0;
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = -1177514351;
        while (true) {
            i16 = i6 ^ (i5 & (((i16 ^ i4) * 3435) >> 31));
            switch (i16) {
                case -2052257154:
                case -1646472087:
                    i13 = 4656;
                    iM3169 = (i4 - C0619.m2761("ۤۚ")) * (-45);
                    i = ((iM3169 ^ i3) * (-12177)) ^ 73127178;
                    i2 = -1228317727;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2010276151:
                case 3030602:
                    interfaceC9801 = ApplicationC17729.f58258;
                    sArr2 = f25870;
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0773.m3169("֫᩷") ^ i3;
                        i = ((iM3169 ^ i4) * (-30041)) ^ (-781707723);
                        i2 = -458954122;
                    } else {
                        iM3169 = C0619.m2761("᩺ܺ") ^ i3;
                        i = ((iM3169 ^ i4) * 9229) ^ 1936504794;
                        i2 = -1024704212;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1953579776:
                case 1715872301:
                    i14 = 392;
                    if (C2834.f9334 <= 0) {
                        iM3169 = (i4 - C0619.m2761("ۜᩴ")) * 69;
                        i = ((iM3169 ^ i3) * 26283) ^ (-173071092);
                        i2 = -1287272263;
                    } else {
                        iM3169 = C0619.m2761("۟ܺ") ^ i4;
                        i = ((iM3169 ^ i3) * (-9899)) ^ 992947751;
                        i2 = -1248835363;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1932443738:
                case 1902419141:
                    if (i8 > 4) {
                        iM3169 = (i3 - C0773.m3169("᩻ۚ")) * 79;
                        i = ((iM3169 ^ i4) * (-929)) ^ (-1834897956);
                        i2 = 1255805866;
                    } else {
                        iM3169 = C0773.m3169("ۤۙ") ^ i4;
                        i = ((iM3169 ^ i3) * (-13287)) ^ (-922949653);
                        i2 = -1245765733;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1885755590:
                case 1132630483:
                    if (C1564.f5401 > 0) {
                        iM3169 = (C0773.m3169("ۖۛ") + i4) * (-45);
                        i = ((iM3169 ^ i3) * 13187) ^ (-1018383580);
                        i2 = -525721903;
                    } else {
                        iM3169 = C0619.m2761("ۗ᩸") ^ i3;
                        i = ((iM3169 ^ i4) * 13621) ^ 807653807;
                        i2 = -1689544966;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1879100202:
                case -1056210224:
                    if (C2419.f7754 >= 0) {
                        iM3169 = (C0773.m3169("ۖۛ") + i4) * (-45);
                        i = ((iM3169 ^ i3) * 13187) ^ (-1018383580);
                        i2 = -525721903;
                    } else {
                        iM3169 = (C0619.m2761("ۤۡ") + i4) * 59;
                        i = ((iM3169 ^ i3) * (-19555)) ^ (-409531140);
                        i2 = -1474296849;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1876100279:
                case 838287099:
                    i12 = s + s2;
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0773.m3169("ۖۛ") + i4) * (-45);
                        i = ((iM3169 ^ i3) * 13187) ^ (-1018383580);
                        i2 = -525721903;
                    } else {
                        iM3169 = C0773.m3169("֨ۖ") ^ i4;
                        i = ((iM3169 ^ i3) * (-7989)) ^ 1351519595;
                        i2 = 923893636;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1708135080:
                case -612061480:
                    C4238.m13540();
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0619.m2761("ۗ᩸") ^ i3;
                        i = ((iM3169 ^ i4) * 13621) ^ 807653807;
                        i2 = -1689544966;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۜᩴ")) * 69;
                        i = ((iM3169 ^ i3) * 26283) ^ (-173071092);
                        i2 = -1287272263;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1521194722:
                case 1346665007:
                    i10 = i9 + 14212900;
                    if (C1783.f6087 <= 0) {
                        iM3169 = C0773.m3169("֫᩷") ^ i3;
                        i = ((iM3169 ^ i4) * (-30041)) ^ (-781707723);
                        i2 = -458954122;
                    } else {
                        iM3169 = (C0619.m2761("᩻۬") ^ i3) * 101;
                        i = ((iM3169 ^ i4) * (-20365)) ^ (-1709296843);
                        i2 = 1377201005;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1508179524:
                case 2057988707:
                    i11 = i10 + i10;
                    s2 = 3770;
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0773.m3169("۟ۘ") + i3) * 81;
                        i = ((iM3169 ^ i4) * 28401) ^ 1865869962;
                        i2 = -474483891;
                    } else {
                        iM3169 = C0619.m2761("ۡ᩵") ^ i4;
                        i = ((iM3169 ^ i3) * 29667) ^ (-1058720857);
                        i2 = 1330808002;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1235081567:
                case -395355755:
                    if (i11 - (i12 * i12) < 0) {
                        iM3169 = (C0773.m3169("ۜۚ") + i3) * 63;
                        i = ((iM3169 ^ i4) * 19923) ^ 45128857;
                        i2 = -425982781;
                    } else {
                        iM3169 = C0773.m3169("ۡܰ") ^ i3;
                        i = ((iM3169 ^ i4) * 32535) ^ 1006042419;
                        i2 = -725759958;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1185798945:
                case 712903867:
                    s = sArr[c];
                    if (C2310.f7472 >= 0) {
                        iM3169 = (C0773.m3169("۟ۘ") + i3) * 81;
                        i = ((iM3169 ^ i4) * 28401) ^ 1865869962;
                        i2 = -474483891;
                    } else {
                        iM3169 = (C0619.m2761("ۜ᩹") ^ i3) * (-51);
                        i = ((iM3169 ^ i4) * (-15121)) ^ 789063467;
                        i2 = 757840329;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1155216341:
                case 76656308:
                    sArr = f25870;
                    c = 391;
                    if (RunnableC3055.m9933() != 0) {
                        iM3169 = C0619.m2761("ۗ᩸") ^ i3;
                        i = ((iM3169 ^ i4) * 13621) ^ 807653807;
                        i2 = -1689544966;
                    } else {
                        iM3169 = (C0773.m3169("ܰ᩺") + i3) * 43;
                        i = ((iM3169 ^ i4) * 17983) ^ 1827824725;
                        i2 = -1835097086;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1145848679:
                case 1445998237:
                    C1321.m4852();
                    return 0;
                case -1090971257:
                case -371701227:
                    i13 = 60414;
                    iM3169 = (i4 - C0619.m2761("ۤۚ")) * (-45);
                    i = ((iM3169 ^ i3) * (-12177)) ^ 73127178;
                    i2 = -1228317727;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -768952233:
                case 1158662082:
                    C0862.m3503();
                    iM3169 = (C0773.m3169("ۖۛ") + i4) * (-45);
                    i = ((iM3169 ^ i3) * 13187) ^ (-1018383580);
                    i2 = -525721903;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -708527634:
                case 318734658:
                    i7 = 3;
                    i8 = interfaceC9801.getInt(C3779.m12266(sArr2, i14, i15, i13), 3);
                    if (i8 >= 0) {
                        iM3169 = C0773.m3169("᩵֨") ^ i3;
                        i = ((iM3169 ^ i4) * 29767) ^ 2088367907;
                        i2 = 939943226;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩻ۚ")) * 79;
                        i = ((iM3169 ^ i4) * (-929)) ^ (-1834897956);
                        i2 = 1255805866;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -491632180:
                case 1791054801:
                    return i8;
                case -286208503:
                case 256065329:
                    return i7;
                case 29292289:
                case 1283989748:
                    i9 = s * s;
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0773.m3169("ۖۛ") + i4) * (-45);
                        i = ((iM3169 ^ i3) * 13187) ^ (-1018383580);
                        i2 = -525721903;
                    } else {
                        iM3169 = C0773.m3169("ᩴ᩶") ^ i4;
                        i = ((iM3169 ^ i3) * (-3573)) ^ 479817994;
                        i2 = 2049554339;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1541299126:
                case 1793983705:
                    i15 = 19;
                    if (C0269.f1558 <= 0) {
                        iM3169 = (C0773.m3169("۟ۘ") + i3) * 81;
                        i = ((iM3169 ^ i4) * 28401) ^ 1865869962;
                        i2 = -474483891;
                    } else {
                        iM3169 = (i4 - C0773.m3169("᩹ۘ")) * 45;
                        i = ((iM3169 ^ i3) * (-16441)) ^ 1462482648;
                        i2 = -1654039506;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (C2702.m8876()) {
                        iM3169 = (C0773.m3169("ۖۛ") + i4) * (-45);
                        i = ((iM3169 ^ i3) * 13187) ^ (-1018383580);
                        i2 = -525721903;
                    } else {
                        iM3169 = (C0773.m3169("۟ۘ") + i3) * 81;
                        i = ((iM3169 ^ i4) * 28401) ^ 1865869962;
                        i2 = -474483891;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cf A[PHI: r1 r11 r12
      0x00cf: PHI (r1v3 l.ۢ֫ܺ) = (r1v2 l.ۢ֫ܺ), (r1v2 l.ۢ֫ܺ), (r1v5 l.ۢ֫ܺ) binds: [B:28:0x00b7, B:9:0x0054, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r11v3 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v5 short[]) binds: [B:28:0x00b7, B:9:0x0054, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:28:0x00b7, B:9:0x0054, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0173 A[PHI: r7 r8 r13
      0x0173: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:45:0x0171, B:24:0x009a, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:45:0x0171, B:24:0x009a, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:45:0x0171, B:24:0x009a, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0200 A[PHI: r5
      0x0200: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:61:0x01fe, B:53:0x01c7, B:18:0x0082, B:15:0x0067, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0230 A[PHI: r3 r4 r6 r9 r18
      0x0230: PHI (r3v4 char) = (r3v3 char), (r3v2 char), (r3v2 char), (r3v2 char) binds: [B:65:0x022e, B:57:0x01e5, B:49:0x01a7, B:41:0x0151] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r4v4 short) = (r4v2 short), (r4v3 short), (r4v2 short), (r4v2 short) binds: [B:65:0x022e, B:57:0x01e5, B:49:0x01a7, B:41:0x0151] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:65:0x022e, B:57:0x01e5, B:49:0x01a7, B:41:0x0151] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r9v3 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v4 int) binds: [B:65:0x022e, B:57:0x01e5, B:49:0x01a7, B:41:0x0151] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:65:0x022e, B:57:0x01e5, B:49:0x01a7, B:41:0x0151] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m21245() {
        int iM2761;
        int i;
        int i2;
        int i3 = AbstractC3624.f12429;
        int i4 = C2375.f7641;
        int iM3169 = C0773.m3169("ۡۤ") ^ i3;
        int i5 = ((iM3169 ^ i4) * (-19317)) ^ (-1677241015);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM3169 ^ 482701496;
        InterfaceC9801 interfaceC9801 = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1698023720;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i4) * (-5543)) >> 31));
            switch (i14) {
                case -2020859934:
                case 1355529703:
                    s2 = 12126;
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0619.m2761("ܳۚ") ^ i3;
                        i = ((iM2761 ^ i4) * (-10067)) ^ 1243629361;
                        i2 = 2104266774;
                    } else {
                        iM2761 = (C0773.m3169("ܿܶ") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2761 ^ i4) * 5895) ^ 80782828;
                        i2 = 2097901217;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1841404308:
                case -1636952300:
                    int i15 = s + s2;
                    i7 = i15 * i15;
                    if (RunnableC1848.m6360()) {
                        iM2761 = (C0619.m2761("᩹۠") + i4) * (-7);
                        i = ((iM2761 ^ i3) * 26373) ^ 995327131;
                        i2 = 134237779;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ܶۖ")) * 123;
                        i = ((iM2761 ^ i3) * (-8241)) ^ (-690965952);
                        i2 = 814925036;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1749517171:
                case 615220450:
                    i10 = i8 + i9;
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0619.m2761("᩹۠") + i4) * (-7);
                        i = ((iM2761 ^ i3) * 26373) ^ 995327131;
                        i2 = 134237779;
                    } else {
                        iM2761 = C0619.m2761("ۚۘ") ^ i4;
                        i = ((iM2761 ^ i3) * 5009) ^ (-315430879);
                        i2 = 1785765799;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1097789147:
                case 2028217330:
                    s = sArr[c];
                    if (C1321.f4751 >= 0) {
                        iM2761 = (C0619.m2761("᩹۠") + i4) * (-7);
                        i = ((iM2761 ^ i3) * 26373) ^ 995327131;
                        i2 = 134237779;
                    } else {
                        iM2761 = C0619.m2761("ۗ᩵") ^ i4;
                        i = ((iM2761 ^ i3) * 16449) ^ 926721800;
                        i2 = 605407200;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -998793944:
                case 1462273873:
                    sArr = f25870;
                    c = 411;
                    if (C23916.f77426 <= 0) {
                        iM2761 = (C0619.m2761("᩹۠") + i4) * (-7);
                        i = ((iM2761 ^ i3) * 26373) ^ 995327131;
                        i2 = 134237779;
                    } else {
                        iM2761 = C0619.m2761("ۧۜ") ^ i3;
                        i = ((iM2761 ^ i4) * 1417) ^ (-1567478144);
                        i2 = 441167554;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -976019885:
                case 1032245818:
                    if (C2419.f7754 < 0) {
                        iM2761 = C0619.m2761("ܳۚ") ^ i3;
                        i = ((iM2761 ^ i4) * (-10067)) ^ 1243629361;
                        i2 = 2104266774;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܿۡ")) * 71;
                        i = ((iM2761 ^ i4) * (-29583)) ^ 176809695;
                        i2 = -285244219;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -945513422:
                case 1370427359:
                    C3690.m11987();
                    if (C3734.f12817 >= 0) {
                        iM2761 = C0619.m2761("ܳۚ") ^ i3;
                        i = ((iM2761 ^ i4) * (-10067)) ^ 1243629361;
                        i2 = 2104266774;
                    } else {
                        iM2761 = (C0619.m2761("֡۫") + i3) * (-57);
                        i = ((iM2761 ^ i4) * (-9851)) ^ (-477881178);
                        i2 = 171848948;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -754031538:
                case 914447835:
                    AbstractC0641.m2813();
                    return false;
                case -617845720:
                case 370172655:
                    i8 = s * s;
                    i9 = 147039876;
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0619.m2761("ۘۚ") ^ i4;
                        i = ((iM2761 ^ i3) * 1429) ^ 1609204712;
                        i2 = 628179108;
                    } else {
                        iM2761 = (C0773.m3169("ۚۜ") ^ i3) * (-125);
                        i = ((iM2761 ^ i4) * (-18899)) ^ (-297829662);
                        i2 = 2070540565;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -528913603:
                case 65569299:
                    C2354.m7983();
                    if (C11235.m28309() != 0) {
                        iM2761 = (C0619.m2761("֡۫") + i3) * (-57);
                        i = ((iM2761 ^ i4) * (-9851)) ^ (-477881178);
                        i2 = 171848948;
                    } else {
                        iM2761 = C0619.m2761("ۘۚ") ^ i4;
                        i = ((iM2761 ^ i3) * 1429) ^ 1609204712;
                        i2 = 628179108;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -512321639:
                case 5304514:
                    return C4238.m13535(interfaceC9801, C2310.m7803(sArr2, i12, i13, i11), false);
                case -166963987:
                case 592843105:
                    i12 = 412;
                    if (C23916.f77426 <= 0) {
                        iM2761 = (i3 - C0773.m3169("ܿۡ")) * 71;
                        i = ((iM2761 ^ i4) * (-29583)) ^ 176809695;
                        i2 = -285244219;
                    } else {
                        iM2761 = C0773.m3169("ۨ֨") ^ i3;
                        i = ((iM2761 ^ i4) * 26071) ^ 601476654;
                        i2 = 1526823062;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 283936924:
                case 1778384167:
                    i13 = 24;
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0619.m2761("ۘۚ") ^ i4;
                        i = ((iM2761 ^ i3) * 1429) ^ 1609204712;
                        i2 = 628179108;
                    } else {
                        iM2761 = C0773.m3169("ܰᩳ") ^ i4;
                        i = ((iM2761 ^ i3) * (-21387)) ^ (-301019925);
                        i2 = -1784087901;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 305590168:
                case 351801815:
                    C0487.m2356();
                    iM2761 = C0619.m2761("ܳۚ") ^ i3;
                    i = ((iM2761 ^ i4) * (-10067)) ^ 1243629361;
                    i2 = 2104266774;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 514773216:
                case 1863209500:
                    if ((i10 + i10) - i7 < 0) {
                        iM2761 = C0773.m3169("᩹ۜ") ^ i4;
                        i = ((iM2761 ^ i3) * (-17577)) ^ 676904298;
                        i2 = 204060236;
                    } else {
                        iM2761 = (C0619.m2761("ۧ᩷") + i3) * 31;
                        i = ((iM2761 ^ i4) * 17355) ^ (-473361085);
                        i2 = 245609156;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 541415627:
                case 1369856477:
                    if (C2023.f6737) {
                        iM2761 = C0619.m2761("ܳۚ") ^ i3;
                        i = ((iM2761 ^ i4) * (-10067)) ^ 1243629361;
                        i2 = 2104266774;
                    } else {
                        iM2761 = C0619.m2761("ܳᩳ") ^ i4;
                        i = ((iM2761 ^ i3) * (-29183)) ^ (-1349786940);
                        i2 = -900760324;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 897013900:
                case 2029263286:
                    i11 = 849;
                    iM2761 = (C0619.m2761("ۖۘ") ^ i3) * 45;
                    i = ((iM2761 ^ i4) * (-4223)) ^ 681359121;
                    i2 = 247798465;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 954079796:
                case 1064753602:
                    i11 = 465;
                    iM2761 = (C0619.m2761("ۖۘ") ^ i3) * 45;
                    i = ((iM2761 ^ i4) * (-4223)) ^ 681359121;
                    i2 = 247798465;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    interfaceC9801 = ApplicationC17729.f58258;
                    sArr2 = f25870;
                    if (C13473.f42873 != 0) {
                        iM2761 = (i3 - C0773.m3169("ܿۡ")) * 71;
                        i = ((iM2761 ^ i4) * (-29583)) ^ 176809695;
                        i2 = -285244219;
                    } else {
                        iM2761 = C0773.m3169("ܰۗ") ^ i4;
                        i = ((iM2761 ^ i3) * (-24211)) ^ 255175432;
                        i2 = -2100157133;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 21761. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r37) {
        /*
            Method dump skipped, instruction units count: 2176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC7793.onClick(android.view.View):void");
    }
}
