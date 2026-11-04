package l;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.snackbar.SnackbarManager;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۚܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I5UN */
/* JADX INFO: loaded from: classes3.dex */
public class C5817 extends C10511 {

    /* JADX INFO: renamed from: ۛ֫ۙ, reason: not valid java name and contains not printable characters */
    private static final short[] f19999 = {6004, 13027, 13000, 12935, 13001, 13000, 13011, 12935, 13012, 13010, 13015, 13015, 13000, 13013, 13011};

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f20000 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f20001;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f20002;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f20003;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f20004;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f20005;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public Paint f20006;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f20007;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f20008;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C23073 f20009;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f20010;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f20011;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public long f20012;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public float f20013;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f20014;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f20015;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public View f20016;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f20017;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f20018;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC1778 f20019;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f20020;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f20021;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m16965(View view) {
        AbstractC12964 adapter = null;
        int i = 991567558;
        int i2 = C2288.f7433;
        int i3 = C4238.f15451;
        int iM2761 = (C0619.m2761("ܽۨ") + i2) * (-101);
        int i4 = ((iM2761 ^ i3) * (-30649)) ^ 219597090;
        int i5 = 1356274554;
        while (true) {
            i = ((((i ^ i3) * (-26255)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2122407510:
                case -1976922876:
                    C0269.m1775();
                    break;
                case -2106705160:
                case -15464366:
                    if (C2419.m8174() >= 0) {
                        iM2761 = C0619.m2761("ۙ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6597)) ^ 199096307;
                        i5 = -1440079163;
                    } else {
                        iM2761 = (C0619.m2761("ۚۧ") + i2) * 55;
                        i4 = ((iM2761 ^ i3) * (-14965)) ^ (-133255135);
                        i5 = 1695289631;
                    }
                    break;
                case -2045164467:
                case 2080593083:
                    if (C2354.m7983()) {
                        iM2761 = C0773.m3169("ۡ᩸") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-1995)) ^ 1781184642;
                        i5 = -1712632719;
                    } else {
                        iM2761 = C0619.m2761("ᩴܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24211)) ^ 974774701;
                        i5 = -1282481737;
                    }
                    break;
                case -2006022536:
                case -457555037:
                    if (C0773.f2792 <= 0) {
                        iM2761 = (C0619.m2761("۫ۡ") ^ i2) * (-11);
                        i4 = ((iM2761 ^ i3) * 22759) ^ (-598730365);
                        i5 = 1736857468;
                    } else {
                        iM2761 = C0619.m2761("ܽ֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-28049)) ^ 365101582;
                        i5 = -442714652;
                    }
                    break;
                case -1841103171:
                case -1030301348:
                    adapter = getAdapter();
                    if (adapter != null) {
                        iM2761 = (i2 - C0773.m3169("᩹۬")) * (-31);
                        i4 = ((iM2761 ^ i3) * 13433) ^ (-196838864);
                        i5 = 2105562058;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܶۡ")) * (-59);
                        i4 = ((iM2761 ^ i2) * 10103) ^ (-1495019482);
                        i5 = 51562009;
                    }
                    break;
                case -1663757821:
                case 605109979:
                    if (!C3099.m10095()) {
                        iM2761 = C0619.m2761("ᩴܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24211)) ^ 974774701;
                        i5 = -1282481737;
                    } else {
                        iM2761 = (C0619.m2761("ܽۛ") ^ i3) * 45;
                        i4 = ((iM2761 ^ i2) * (-2253)) ^ (-1628986740);
                        i5 = -1624246367;
                    }
                    break;
                case -1578559749:
                case 1133338234:
                    if (C2485.m8357() <= 0) {
                        iM2761 = C0773.m3169("֨᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-23119)) ^ 946349244;
                        i5 = -1834563038;
                    } else {
                        iM2761 = C0619.m2761("ۙ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6597)) ^ 199096307;
                        i5 = -1440079163;
                    }
                    break;
                case -1529371212:
                case -521616337:
                    this.f20019.onChanged();
                    break;
                case -1194378051:
                case 2061075353:
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0773.m3169("֨᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-23119)) ^ 946349244;
                        i5 = -1834563038;
                    } else {
                        iM2761 = (C0773.m3169("᩷ۗ") ^ i2) * 81;
                        i4 = ((iM2761 ^ i3) * 11887) ^ (-136010649);
                        i5 = -15489394;
                    }
                    break;
                case -1105718313:
                case 1709976770:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("֨᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-23119)) ^ 946349244;
                        i5 = -1834563038;
                    } else {
                        iM2761 = C0773.m3169("᩹ۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15979)) ^ (-229578490);
                        i5 = 573938724;
                    }
                    break;
                case -931603350:
                case 2025674875:
                    C0773.m3161();
                    iM2761 = (C0619.m2761("ܽۛ") ^ i3) * 45;
                    i4 = ((iM2761 ^ i2) * (-2253)) ^ (-1628986740);
                    i5 = -1624246367;
                    break;
                case -773849695:
                case -731653409:
                    C3033.m9845();
                    if (!C13473.m33144()) {
                        iM2761 = (C0619.m2761("ܽۛ") ^ i3) * 45;
                        i4 = ((iM2761 ^ i2) * (-2253)) ^ (-1628986740);
                        i5 = -1624246367;
                    } else {
                        iM2761 = C0619.m2761("ۙ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6597)) ^ 199096307;
                        i5 = -1440079163;
                    }
                    break;
                case -429458857:
                case -391773012:
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0619.m2761("ۙ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6597)) ^ 199096307;
                        i5 = -1440079163;
                    } else {
                        iM2761 = (C0619.m2761("᩻۟") ^ i2) * (-67);
                        i4 = ((iM2761 ^ i3) * (-11547)) ^ (-52628192);
                        i5 = -1372740464;
                    }
                    break;
                case -353884315:
                case 1416487049:
                    if (C2485.f7950 != 0) {
                        iM2761 = C0619.m2761("ᩴܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24211)) ^ 974774701;
                        i5 = -1282481737;
                    } else {
                        iM2761 = (i3 - C0773.m3169("֡᩶")) * (-93);
                        i4 = ((iM2761 ^ i2) * (-14351)) ^ 695386823;
                        i5 = -474702425;
                    }
                    break;
                case -200663327:
                case 1624725070:
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0619.m2761("ۙ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6597)) ^ 199096307;
                        i5 = -1440079163;
                    } else {
                        iM2761 = C0619.m2761("ᩳܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-9761)) ^ 404263170;
                        i5 = 1235226199;
                    }
                    break;
                case -71727973:
                case 1920922950:
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0619.m2761("ۙ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6597)) ^ 199096307;
                        i5 = -1440079163;
                    } else {
                        iM2761 = C0773.m3169("᩺ۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-26193)) ^ 1701389620;
                        i5 = 1119754345;
                    }
                    break;
                case 205545353:
                case 1255971881:
                    this.f20019 = new C13274(this, view);
                    iM2761 = C0773.m3169("۟᩹") ^ i3;
                    i4 = ((iM2761 ^ i2) * 30059) ^ 1170797883;
                    i5 = 1948322575;
                    break;
                case 1000880215:
                case 1395355337:
                    this.f20016 = view;
                    if (this.f20019 == null) {
                        iM2761 = (C0619.m2761("ܺ᩹") ^ i2) * 59;
                        i4 = ((iM2761 ^ i3) * 27919) ^ (-206289583);
                        i5 = -473666817;
                    } else {
                        iM2761 = C0773.m3169("۟᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * 30059) ^ 1170797883;
                        i5 = 1948322575;
                    }
                    break;
                case 1710301504:
                case 1918737275:
                    adapter.registerAdapterDataObserver(this.f20019);
                    iM2761 = (i3 - C0619.m2761("ܶۡ")) * (-59);
                    i4 = ((iM2761 ^ i2) * 10103) ^ (-1495019482);
                    i5 = 51562009;
                    break;
                default:
                    if (C1783.m6232()) {
                        iM2761 = (C0619.m2761("ۛ֫") ^ i3) * (-11);
                        i4 = ((iM2761 ^ i2) * 12649) ^ 1720836299;
                        i5 = -1065358406;
                    } else {
                        iM2761 = C0619.m2761("ۙ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6597)) ^ 199096307;
                        i5 = -1440079163;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m16964() {
        int iM4938 = 0;
        int i = 0;
        int iM8883 = 0;
        int iM9482 = 0;
        int i2 = 1396345770;
        int i3 = C2834.f9334;
        int i4 = RunnableC0334.f1808;
        int iM3169 = C0773.m3169("ܶۚ") ^ i3;
        int i5 = ((iM3169 ^ i4) * (-12831)) ^ 1033258906;
        int i6 = 240177214;
        while (true) {
            i2 = ((((i2 ^ i4) * (-28301)) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2087762561:
                case 889392308:
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0773.m3169("ۖۘ") ^ i4) * 91;
                        i5 = ((iM3169 ^ i3) * (-11759)) ^ (-669573990);
                        i6 = -1197580059;
                    } else {
                        iM3169 = (C0619.m2761("۫۟") ^ i3) * 27;
                        i5 = ((iM3169 ^ i4) * (-20225)) ^ (-1533287281);
                        i6 = -1612532585;
                    }
                    break;
                case -1833878517:
                case 1092191114:
                    iM4938 = C1343.m4938(this);
                    if (C1321.m4852()) {
                        iM3169 = (C0773.m3169("᩸ۘ") ^ i3) * 39;
                        i5 = ((iM3169 ^ i4) * (-3061)) ^ 1778935882;
                        i6 = 530847708;
                    } else {
                        iM3169 = (C0619.m2761("ܰۖ") + i3) * 13;
                        i5 = ((iM3169 ^ i4) * 22797) ^ 1077904401;
                        i6 = -1399634268;
                    }
                    break;
                case -1801740595:
                case -1650028740:
                    if (!C17202.m40372()) {
                        iM3169 = C0619.m2761("ۜۡ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 25321) ^ 633941410;
                        i6 = -378283505;
                    } else {
                        iM3169 = (C0619.m2761("ܰۖ") + i3) * 13;
                        i5 = ((iM3169 ^ i4) * 22797) ^ 1077904401;
                        i6 = -1399634268;
                    }
                    break;
                case -1659439160:
                case 1055331662:
                    iM9482 = C2878.m9482(C1343.m4949(this, 0));
                    if (iM9482 > i) {
                        iM3169 = (C0773.m3169("ܶ᩵") + i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM3169 ^ i3) * (-31441)) ^ (-392172322);
                        i6 = 2098092777;
                    } else {
                        iM8883 = iM4938;
                        iM3169 = C0619.m2761("ۡܽ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 28961) ^ (-27072536);
                        i6 = -2117822814;
                    }
                    break;
                case -1648795095:
                case -1017335429:
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0619.m2761("ܰۖ") + i3) * 13;
                        i5 = ((iM3169 ^ i4) * 22797) ^ 1077904401;
                        i6 = -1399634268;
                    } else {
                        iM3169 = C0773.m3169("ۧܶ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-10419)) ^ (-1461093817);
                        i6 = -1775510352;
                    }
                    break;
                case -1606246381:
                case 201304844:
                    if (C1542.m5459() >= 0) {
                        iM3169 = (i3 - C0619.m2761("ܿ۬")) * 61;
                        i5 = ((iM3169 ^ i4) * 19379) ^ 403333626;
                        i6 = 1353436036;
                    } else {
                        iM3169 = C0619.m2761("ۧ᩵") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-11013)) ^ 177269740;
                        i6 = 852009033;
                    }
                    break;
                case -1571949165:
                case 1985021771:
                    if (AbstractC0641.m2813() <= 0) {
                        iM3169 = (i4 - C0619.m2761("᩷ۛ")) * (-3);
                        i5 = ((iM3169 ^ i3) * (-20503)) ^ 1684951766;
                        i6 = -1016120733;
                    } else {
                        iM3169 = C0619.m2761("ۤ֡") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-11809)) ^ 544969481;
                        i6 = 268750354;
                    }
                    break;
                case -1569738630:
                case -177068833:
                    if (C3099.f10023 <= 0) {
                        iM3169 = (i3 - C0619.m2761("ܿ۬")) * 61;
                        i5 = ((iM3169 ^ i4) * 19379) ^ 403333626;
                        i6 = 1353436036;
                    } else {
                        iM3169 = (C0619.m2761("ܰۖ") + i3) * 13;
                        i5 = ((iM3169 ^ i4) * 22797) ^ 1077904401;
                        i6 = -1399634268;
                    }
                    break;
                case -1550516400:
                case 1969289575:
                    if (C0862.f3233 != 0) {
                        iM3169 = C0619.m2761("ۜۡ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 25321) ^ 633941410;
                        i6 = -378283505;
                    } else {
                        iM3169 = C0773.m3169("ܶۤ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-6231)) ^ (-1040939967);
                        i6 = 1139679210;
                    }
                    break;
                case -1547765966:
                case 506019020:
                    if (C0269.f1558 <= 0) {
                        iM3169 = (C0773.m3169("ۖۘ") ^ i4) * 91;
                        i5 = ((iM3169 ^ i3) * (-11759)) ^ (-669573990);
                        i6 = -1197580059;
                    } else {
                        iM3169 = C0619.m2761("۠ۛ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-18099)) ^ 796266847;
                        i6 = -1238343605;
                    }
                    break;
                case -1541638261:
                case -1009018708:
                    return this.f20015;
                case -1506102182:
                case -835253806:
                    C2702.m8876();
                    if (C4238.f15451 >= 0) {
                        iM3169 = (C0773.m3169("ۖۘ") ^ i4) * 91;
                        i5 = ((iM3169 ^ i3) * (-11759)) ^ (-669573990);
                        i6 = -1197580059;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܿ۬")) * 61;
                        i5 = ((iM3169 ^ i4) * 19379) ^ 403333626;
                        i6 = 1353436036;
                    }
                    break;
                case -1486390168:
                case 1598923007:
                    i = 1;
                    if (iM4938 >= 1) {
                        iM3169 = C0619.m2761("ܰ֨") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-3507)) ^ (-580190851);
                        i6 = 1907246310;
                    } else {
                        iM8883 = iM4938;
                        iM3169 = C0619.m2761("ۡܽ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 28961) ^ (-27072536);
                        i6 = -2117822814;
                    }
                    break;
                case -1414385792:
                case 1937948159:
                    this.f20015 = iM8883;
                    iM3169 = C0619.m2761("ۨ۠") ^ i3;
                    i5 = ((iM3169 ^ i4) * (-9613)) ^ (-973201950);
                    i6 = -1936526972;
                    break;
                case -1266961391:
                case -125475526:
                    if (iM8883 > this.f20015) {
                        iM3169 = (C0773.m3169("ܶ֫") ^ i4) * (-51);
                        i5 = ((iM3169 ^ i3) * (-19785)) ^ 385007601;
                        i6 = -513850702;
                    } else {
                        iM3169 = C0619.m2761("ۨ۠") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-9613)) ^ (-973201950);
                        i6 = -1936526972;
                    }
                    break;
                case -1259147661:
                case -899924063:
                    C0269.m1775();
                    iM3169 = (C0619.m2761("ܰۖ") + i3) * 13;
                    i5 = ((iM3169 ^ i4) * 22797) ^ 1077904401;
                    i6 = -1399634268;
                    break;
                case -1077775612:
                case -257893522:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (i3 - C0619.m2761("ܿ۬")) * 61;
                        i5 = ((iM3169 ^ i4) * 19379) ^ 403333626;
                        i6 = 1353436036;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩹ܿ")) * 5;
                        i5 = ((iM3169 ^ i4) * 4841) ^ 1479237211;
                        i6 = 803116704;
                    }
                    break;
                case -1008761713:
                case 424725231:
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0773.m3169("ۖۘ") ^ i4) * 91;
                        i5 = ((iM3169 ^ i3) * (-11759)) ^ (-669573990);
                        i6 = -1197580059;
                    } else {
                        iM3169 = C0619.m2761("۬ܶ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-905)) ^ 19292521;
                        i6 = -1075203212;
                    }
                    break;
                case -331354929:
                case 713132091:
                    iM8883 = C2702.m8883(iM4938, C1564.m5514(this) / iM9482);
                    iM3169 = C0619.m2761("ۡܽ") ^ i4;
                    i5 = ((iM3169 ^ i3) * 28961) ^ (-27072536);
                    i6 = -2117822814;
                    break;
                case 125284072:
                case 710221519:
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0619.m2761("ۜۡ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 25321) ^ 633941410;
                        i6 = -378283505;
                    } else {
                        iM3169 = C0773.m3169("ܿ֨") ^ i4;
                        i5 = ((iM3169 ^ i3) * 19407) ^ 1756435690;
                        i6 = -161440759;
                    }
                    break;
                default:
                    C17202.m40372();
                    C3779.m12264();
                    return 0;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5817(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        int i = -2103831205;
        int i2 = C3779.f12953;
        int i3 = RunnableC3055.f9898;
        int iM2761 = (i2 - C0619.m2761("ۚۖ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
        int i4 = ((iM2761 ^ i3) * 30353) ^ 891512726;
        int i5 = -626290274;
        while (true) {
            i = (iM2761 ^ i5) ^ (i4 & (((i ^ i3) * 12529) >> 31));
            switch (i) {
                case -2141056703:
                case -1018788017:
                    if (C2419.f7754 < 0) {
                        iM2761 = C0619.m2761("ۗۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 24469) ^ 740333211;
                        i5 = -1095318946;
                    } else {
                        iM2761 = C0773.m3169("ۙܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 5341) ^ 42822532;
                        i5 = -611366557;
                    }
                    break;
                case -1949530649:
                case 1420488503:
                    C2023.m6964();
                    C23916.m53419();
                    iM2761 = (C0619.m2761("ۖ۟") ^ i3) * q.h;
                    i4 = ((iM2761 ^ i2) * 22867) ^ 1239553392;
                    i5 = 744561569;
                    break;
                case -1774469511:
                case 1891879953:
                    return;
                case -1234977335:
                case 410340621:
                    C3077.m10041();
                    if (C2310.m7813() > 0) {
                        iM2761 = C0619.m2761("ۗۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 24469) ^ 740333211;
                        i5 = -1095318946;
                    } else {
                        iM2761 = (C0619.m2761("ۖ۟") ^ i3) * q.h;
                        i4 = ((iM2761 ^ i2) * 22867) ^ 1239553392;
                        i5 = 744561569;
                    }
                    break;
                case -1200618251:
                case 1671628088:
                    C0619.m2763();
                    throw new RuntimeException();
                case 295645953:
                case 831743329:
                    if (AbstractC3624.m11755() == 0) {
                        iM2761 = (C0619.m2761("ۖ۟") ^ i3) * q.h;
                        i4 = ((iM2761 ^ i2) * 22867) ^ 1239553392;
                        i5 = 744561569;
                    } else {
                        iM2761 = (C0619.m2761("ۚۘ") ^ i2) * 59;
                        i4 = ((iM2761 ^ i3) * 645) ^ 1435178760;
                        i5 = 541477393;
                    }
                    break;
                default:
                    if (C13473.f42873 != 0) {
                        iM2761 = (i2 - C0619.m2761("ۛۙ")) * 37;
                        i4 = ((iM2761 ^ i3) * (-6579)) ^ (-135041662);
                        i5 = -2105073287;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۗܽ")) * (-123);
                        i4 = ((iM2761 ^ i3) * (-18791)) ^ (-310254724);
                        i5 = -1844591671;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:52:0x01b8 A[PHI: r3 r4
      0x01b8: PHI (r3v46 boolean) = (r3v8 boolean), (r3v2 boolean), (r3v49 boolean), (r3v49 boolean) binds: [B:43:0x017b, B:9:0x003f, B:48:0x01a6, B:51:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x01b8: PHI (r4v6 android.util.DisplayMetrics) = 
      (r4v3 android.util.DisplayMetrics)
      (r4v2 android.util.DisplayMetrics)
      (r4v2 android.util.DisplayMetrics)
      (r4v2 android.util.DisplayMetrics)
     binds: [B:43:0x017b, B:9:0x003f, B:48:0x01a6, B:51:0x01b6] A[DONT_GENERATE, DONT_INLINE]] */
    public C5817(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        int iM3169;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        C23073 c23073;
        int i4;
        int i5;
        int iM2761;
        super(context, attributeSet, i);
        boolean z4 = false;
        C23073 c23074 = null;
        boolean z5 = false;
        DisplayMetrics displayMetrics = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        AbstractC3269 itemAnimator = null;
        long j = 0;
        int i6 = 998156778;
        int i7 = C1321.f4751;
        int i8 = C2310.f7472;
        int iM2762 = (C0619.m2761("ۜ᩸") ^ i7) * (-59);
        int i9 = ((iM2762 ^ i8) * (-29577)) ^ 1638624878;
        int i10 = 813024088;
        while (true) {
            int i11 = iM2762 ^ i10;
            while (true) {
                i6 = ((((i6 ^ i8) * 11463) >> 31) & i9) ^ i11;
                switch (i6) {
                    case -2118388964:
                    case -89763135:
                        this.f20009 = c23074;
                        z5 = false;
                        this.f20011 = false;
                        this.f20015 = z4 ? 1 : 0;
                        if (C11235.f35427 >= 0) {
                            int iM31610 = (C0773.m3169("ۛۘ") ^ i8) * 55;
                            z2 = z4 ? 1 : 0;
                            int i12 = ((iM31610 ^ i7) * 29079) ^ (-1456497045);
                            i11 = iM31610 ^ 902478532;
                            i9 = i12;
                        } else {
                            this.f20006 = new Paint();
                            this.f20003 = z4;
                            this.f20018 = 0;
                            if (C1783.m6232()) {
                                z2 = z4 ? 1 : 0;
                                int iM2763 = C0619.m2761("ۙ᩹") ^ i7;
                                i9 = ((iM2763 ^ i8) * (-7651)) ^ 1470321561;
                                i11 = iM2763 ^ (-747433800);
                            } else {
                                int iM31611 = (C0773.m3169("ۛۘ") ^ i8) * 55;
                                z2 = z4 ? 1 : 0;
                                int i13 = ((iM31611 ^ i7) * 29079) ^ (-1456497045);
                                i11 = iM31611 ^ 902478532;
                                i9 = i13;
                            }
                        }
                        z4 = z2;
                        break;
                    case -2107550433:
                    case 1074008192:
                        itemAnimator.m10766(j);
                        setMotionEventSplittingEnabled(z5);
                        this.f20021 = ViewConfiguration.get(context).getScaledTouchSlop();
                        return;
                    case -2107045956:
                    case 276966046:
                        C3033.m9845();
                        z = z5;
                        c23073 = c23074;
                        int iM31612 = (i8 - C0773.m3169("۠ܺ")) * 71;
                        i9 = ((iM31612 ^ i7) * (-17301)) ^ 1211205622;
                        i11 = iM31612 ^ 745444588;
                        c23074 = c23073;
                        z5 = z;
                        break;
                    case -1842190711:
                    case -1406440958:
                        this.f20008 = f3;
                        if (AbstractC0641.f2496 < 0) {
                            addOnScrollListener(new C15511(this));
                            super.setLayoutManager(new C12749(context));
                            if (C1564.m5509() <= 0) {
                                int iM31613 = (i7 - C0773.m3169("ۜ᩶")) * 51;
                                z = z5;
                                int i14 = ((iM31613 ^ i8) * 28773) ^ (-1927039335);
                                i11 = iM31613 ^ (-710886772);
                                i9 = i14;
                            } else {
                                z = z5;
                                iM3169 = (C0619.m2761("ܶ᩵") + i7) * 37;
                                i2 = ((iM3169 ^ i8) * (-4075)) ^ (-1947384435);
                                i3 = 1137926212;
                                i9 = i2;
                                i11 = iM3169 ^ i3;
                            }
                            z5 = z;
                        }
                        z = z5;
                        c23073 = c23074;
                        int iM31614 = (i8 - C0773.m3169("۠ܺ")) * 71;
                        i9 = ((iM31614 ^ i7) * (-17301)) ^ 1211205622;
                        i11 = iM31614 ^ 745444588;
                        c23074 = c23073;
                        z5 = z;
                        break;
                    case -1729774155:
                    case 1271569493:
                        C2023.m6964();
                        C3448.m11248();
                        throw new RuntimeException();
                    case -1700133708:
                    case -438019617:
                        C2354.m7983();
                        if (C2485.m8357() > 0) {
                            z2 = z4 ? 1 : 0;
                            z3 = z5;
                            iM2761 = (C0619.m2761("֡᩵") + i7) * 99;
                            i5 = ((iM2761 ^ i8) * 19695) ^ 1939960366;
                            i4 = 2112751731;
                            i11 = i4 ^ iM2761;
                            i9 = i5;
                            z5 = z3;
                            z4 = z2;
                        } else {
                            z = z5;
                            c23073 = c23074;
                            int iM31615 = (i8 - C0773.m3169("۠ܺ")) * 71;
                            i9 = ((iM31615 ^ i7) * (-17301)) ^ 1211205622;
                            i11 = iM31615 ^ 745444588;
                            c23074 = c23073;
                            z5 = z;
                        }
                        break;
                    case -1534188342:
                    case 498668102:
                        z = z5;
                        f = displayMetrics.density;
                        this.f20001 = -579373193;
                        f2 = 8.0f;
                        if (C2485.f7950 != 0) {
                            iM3169 = C0619.m2761("ۡ۬") ^ i8;
                            i2 = ((iM3169 ^ i7) * (-16779)) ^ 966917374;
                            i3 = -823534726;
                        } else {
                            iM3169 = (C0619.m2761("ۜܿ") ^ i8) * (-15);
                            i2 = ((iM3169 ^ i7) * 7471) ^ 1416704110;
                            i3 = 1675870817;
                        }
                        i9 = i2;
                        i11 = iM3169 ^ i3;
                        z5 = z;
                        break;
                    case -1432806629:
                    case 148778083:
                        z = z5;
                        this.f20014 = true;
                        c23073 = c23074;
                        this.f20012 = 0L;
                        if (C23916.f77426 <= 0) {
                            z4 = true;
                            int iM31616 = (i8 - C0773.m3169("۠ܺ")) * 71;
                            i9 = ((iM31616 ^ i7) * (-17301)) ^ 1211205622;
                            i11 = iM31616 ^ 745444588;
                            c23074 = c23073;
                            z5 = z;
                        } else {
                            int iM31617 = (i8 - C0773.m3169("ܺۧ")) * 69;
                            i11 = (-2101912972) ^ iM31617;
                            i9 = ((iM31617 ^ i7) * 13037) ^ (-1345647673);
                            c23074 = c23073;
                            z5 = z;
                            z4 = true;
                        }
                        break;
                    case -859371790:
                    case 824183320:
                        C2375.m8065();
                        if (!C2288.m7767()) {
                            int iM31618 = (i7 - C0773.m3169("ۜ᩶")) * 51;
                            z = z5;
                            int i15 = ((iM31618 ^ i8) * 28773) ^ (-1927039335);
                            i11 = iM31618 ^ (-710886772);
                            i9 = i15;
                            z5 = z;
                        } else {
                            z2 = z4 ? 1 : 0;
                            z3 = z5;
                            iM2761 = (C0619.m2761("֡᩵") + i7) * 99;
                            i5 = ((iM2761 ^ i8) * 19695) ^ 1939960366;
                            i4 = 2112751731;
                            i11 = i4 ^ iM2761;
                            i9 = i5;
                            z5 = z3;
                            z4 = z2;
                        }
                        break;
                    case -657660164:
                    case 1475284710:
                        itemAnimator = getItemAnimator();
                        j = 100;
                        itemAnimator.m10754(100L);
                        itemAnimator.m10769(100L);
                        itemAnimator.m10761(200L);
                        if (!C2878.f9462) {
                        }
                        z = z5;
                        c23073 = c23074;
                        int iM31619 = (i8 - C0773.m3169("۠ܺ")) * 71;
                        i9 = ((iM31619 ^ i7) * (-17301)) ^ 1211205622;
                        i11 = iM31619 ^ 745444588;
                        c23074 = c23073;
                        z5 = z;
                        break;
                    case -232104704:
                    case 1978343683:
                        z = z5;
                        displayMetrics = context.getResources().getDisplayMetrics();
                        if (!C1519.m5403()) {
                            z5 = z;
                            int iM316110 = (C0773.m3169("ۛۘ") ^ i8) * 55;
                            z2 = z4 ? 1 : 0;
                            int i16 = ((iM316110 ^ i7) * 29079) ^ (-1456497045);
                            i11 = iM316110 ^ 902478532;
                            i9 = i16;
                            z4 = z2;
                        } else {
                            iM3169 = C0773.m3169("ۚۙ") ^ i8;
                            i2 = ((iM3169 ^ i7) * 27165) ^ (-1800237371);
                            i3 = -880033248;
                            i9 = i2;
                            i11 = iM3169 ^ i3;
                            z5 = z;
                        }
                        break;
                    case 283510651:
                    case 1195631578:
                        z = z5;
                        this.f20017 = f * f2;
                        f3 = f * 48.0f;
                        if (C0487.f2131 > 0) {
                            iM3169 = C0619.m2761("ᩴᩴ") ^ i7;
                            i2 = ((iM3169 ^ i8) * (-2699)) ^ 231193217;
                            i3 = 179371001;
                            i9 = i2;
                            i11 = iM3169 ^ i3;
                            z5 = z;
                        }
                        c23073 = c23074;
                        int iM316111 = (i8 - C0773.m3169("۠ܺ")) * 71;
                        i9 = ((iM316111 ^ i7) * (-17301)) ^ 1211205622;
                        i11 = iM316111 ^ 745444588;
                        c23074 = c23073;
                        z5 = z;
                        break;
                    case 965315432:
                    case 2009723892:
                        z2 = z4 ? 1 : 0;
                        z3 = z5;
                        c23074 = new C23073(3);
                        if (C2878.m9491() <= 0) {
                            iM2761 = (C0619.m2761("֡᩵") + i7) * 99;
                            i5 = ((iM2761 ^ i8) * 19695) ^ 1939960366;
                            i4 = 2112751731;
                        } else {
                            iM2761 = (C0773.m3169("ۖۗ") + i7) * 85;
                            i5 = ((iM2761 ^ i8) * 23109) ^ 193071380;
                            i4 = -1414756563;
                        }
                        i11 = i4 ^ iM2761;
                        i9 = i5;
                        z5 = z3;
                        z4 = z2;
                        break;
                    default:
                        if (C3779.f12953 <= 0) {
                            int iM316112 = (C0773.m3169("ۛۘ") ^ i8) * 55;
                            z2 = z4 ? 1 : 0;
                            int i17 = ((iM316112 ^ i7) * 29079) ^ (-1456497045);
                            i11 = iM316112 ^ 902478532;
                            i9 = i17;
                            z4 = z2;
                        } else {
                            int iM316113 = (i7 - C0773.m3169("ۜ᩶")) * 51;
                            z = z5;
                            int i18 = ((iM316113 ^ i8) * 28773) ^ (-1927039335);
                            i11 = iM316113 ^ (-710886772);
                            i9 = i18;
                            z5 = z;
                        }
                        break;
                }
            }
            iM2762 = (i8 - C0773.m3169("ۚ᩹")) * 45;
            i9 = ((iM2762 ^ i7) * 32557) ^ (-65389814);
            i10 = -425324046;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m16971() {
        int i = -2050100555;
        int i2 = C2287.f7432;
        int i3 = C2702.f8586;
        int iM3169 = (C0773.m3169("۬ۧ") ^ i3) * (-39);
        int i4 = ((iM3169 ^ i2) * (-25751)) ^ (-945853577);
        int i5 = -1556127272;
        while (true) {
            i = ((((i ^ i2) * (-19683)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2019412489:
                case 1105242029:
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0773.m3169("ۨۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11683)) ^ 1638911742;
                        i5 = 475890391;
                    } else {
                        iM3169 = (C0773.m3169("ᩳᩳ") + i2) * 45;
                        i4 = ((iM3169 ^ i3) * 7077) ^ 273271410;
                        i5 = -1058068688;
                    }
                    break;
                case -1745408486:
                case 744795813:
                    if (this.f20007) {
                        iM3169 = C0619.m2761("֫᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * 5953) ^ 1597431098;
                        i5 = -392344426;
                    } else {
                        iM3169 = (C0773.m3169("ᩴܿ") + i2) * (-31);
                        i4 = ((iM3169 ^ i3) * 29587) ^ 2094752520;
                        i5 = -1627599786;
                    }
                    break;
                case -1672822745:
                case 93874757:
                    C11235.m28309();
                    if (C13473.f42873 != 0) {
                        iM3169 = (C0773.m3169("۟᩵") + i3) * (-51);
                        i4 = ((iM3169 ^ i2) * 32471) ^ 2041233080;
                        i5 = -972358158;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ܿ۬")) * (-99);
                        i4 = ((iM3169 ^ i3) * (-27391)) ^ (-1514108342);
                        i5 = -573263013;
                    }
                    break;
                case -1594662650:
                case 701293797:
                    if (this.f20020) {
                        iM3169 = C0773.m3169("ۨۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11055)) ^ (-1800220900);
                        i5 = -474503513;
                    } else {
                        iM3169 = (C0773.m3169("ᩴܿ") + i2) * (-31);
                        i4 = ((iM3169 ^ i3) * 29587) ^ 2094752520;
                        i5 = -1627599786;
                    }
                    break;
                case -1553986637:
                case 1181166170:
                    if (C2485.m8357() <= 0) {
                        iM3169 = (C0773.m3169("۟᩵") + i3) * (-51);
                        i4 = ((iM3169 ^ i2) * 32471) ^ 2041233080;
                        i5 = -972358158;
                    } else {
                        iM3169 = C0619.m2761("۟ܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-26049)) ^ (-612166073);
                        i5 = 688382412;
                    }
                    break;
                case -1427907241:
                case -571494739:
                    C20932.m47848();
                    C2419.m8174();
                    return false;
                case -1420859073:
                case 1159628704:
                    if (C1564.f5401 <= 0) {
                        iM3169 = C0773.m3169("ۨۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11683)) ^ 1638911742;
                        i5 = 475890391;
                    } else {
                        iM3169 = C0619.m2761("۬ᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 18557) ^ 1561247402;
                        i5 = -1287565547;
                    }
                    break;
                case -1414405610:
                case 1409968759:
                    if (RunnableC1848.f6235) {
                        iM3169 = (C0773.m3169("۟᩵") + i3) * (-51);
                        i4 = ((iM3169 ^ i2) * 32471) ^ 2041233080;
                        i5 = -972358158;
                    } else {
                        iM3169 = C0773.m3169("᩷۠") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-29519)) ^ 1718257026;
                        i5 = 506111268;
                    }
                    break;
                case -1262050393:
                case -723933274:
                    C3734.m12152();
                    iM3169 = (i2 - C0773.m3169("ܿ۬")) * (-99);
                    i4 = ((iM3169 ^ i3) * (-27391)) ^ (-1514108342);
                    i5 = -573263013;
                    break;
                case -960569550:
                case -498900350:
                    return false;
                case -743963974:
                case 1146399045:
                    if (this.f20014) {
                        iM3169 = C0773.m3169("ۘ᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-31681)) ^ (-887038166);
                        i5 = -543611080;
                    } else {
                        iM3169 = (C0773.m3169("ᩴܿ") + i2) * (-31);
                        i4 = ((iM3169 ^ i3) * 29587) ^ 2094752520;
                        i5 = -1627599786;
                    }
                    break;
                case -569913081:
                case 1692015643:
                    C3734.m12152();
                    if (C2419.f7754 >= 0) {
                        iM3169 = (C0773.m3169("۠ۧ") ^ i3) * (-61);
                        i4 = ((iM3169 ^ i2) * (-30217)) ^ 52594121;
                        i5 = 159213526;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ܿ۬")) * (-99);
                        i4 = ((iM3169 ^ i3) * (-27391)) ^ (-1514108342);
                        i5 = -573263013;
                    }
                    break;
                case -413619500:
                case 1147703302:
                    if (RunnableC3055.m9933() != 0) {
                        iM3169 = (C0773.m3169("ܽ۫") + i2) * 25;
                        i4 = ((iM3169 ^ i3) * (-14053)) ^ 2069153933;
                        i5 = 1549980792;
                    } else {
                        iM3169 = C0773.m3169("᩻ۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-5311)) ^ 982526353;
                        i5 = 594849399;
                    }
                    break;
                case 100916335:
                case 1447524817:
                    if (C11235.m28309() != 0) {
                        iM3169 = (i2 - C0773.m3169("ܿ۬")) * (-99);
                        i4 = ((iM3169 ^ i3) * (-27391)) ^ (-1514108342);
                        i5 = -573263013;
                    } else {
                        iM3169 = C0619.m2761("ۧۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 6829) ^ 995285485;
                        i5 = 727198713;
                    }
                    break;
                case 556696167:
                case 1931004774:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0773.m3169("ۨۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11683)) ^ 1638911742;
                        i5 = 475890391;
                    } else {
                        iM3169 = C0619.m2761("᩶᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * 9157) ^ 1485882338;
                        i5 = -1355480147;
                    }
                    break;
                case 861282331:
                case 2140229723:
                    if (C0487.m2356() >= 0) {
                        iM3169 = C0773.m3169("ۨۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11683)) ^ 1638911742;
                        i5 = 475890391;
                    } else {
                        iM3169 = C0619.m2761("᩻ۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-23193)) ^ 1635836012;
                        i5 = 1766022757;
                    }
                    break;
                case 905269207:
                case 1671488594:
                    return true;
                case 1471339768:
                case 1954842565:
                    C2485.m8357();
                    if (C2419.f7754 >= 0) {
                        iM3169 = (C0773.m3169("ܽ۫") + i2) * 25;
                        i4 = ((iM3169 ^ i3) * (-14053)) ^ 2069153933;
                        i5 = 1549980792;
                    } else {
                        iM3169 = (C0773.m3169("۠ۧ") ^ i3) * (-61);
                        i4 = ((iM3169 ^ i2) * (-30217)) ^ 52594121;
                        i5 = 159213526;
                    }
                    break;
                case 1634327118:
                case 1729140540:
                    if (C4238.m13540() <= 0) {
                        iM3169 = (C0773.m3169("ܽ۫") + i2) * 25;
                        i4 = ((iM3169 ^ i3) * (-14053)) ^ 2069153933;
                        i5 = 1549980792;
                    } else {
                        iM3169 = (C0773.m3169("ᩳ᩵") ^ i2) * (-31);
                        i4 = ((iM3169 ^ i3) * (-2961)) ^ 948137019;
                        i5 = 764784022;
                    }
                    break;
                default:
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0773.m3169("ۨۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11683)) ^ 1638911742;
                        i5 = 475890391;
                    } else {
                        iM3169 = C0619.m2761("᩺᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-32165)) ^ (-635018931);
                        i5 = -808477429;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m16967() {
        boolean z = false;
        int i = 792234331;
        int i2 = C0950.f3488;
        int i3 = C3448.f11240;
        int iM2761 = (i3 - C0619.m2761("ۡ᩹")) * 97;
        int i4 = ((iM2761 ^ i2) * 19425) ^ 216707543;
        int i5 = -1225136118;
        while (true) {
            i = ((((i ^ i2) * (-10203)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2044441711:
                case 290144856:
                    C2702.m8876();
                    if (!RunnableC3646.f12471) {
                        iM2761 = C0773.m3169("ۘᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 18189) ^ (-1135488359);
                        i5 = -2107710490;
                    } else {
                        iM2761 = C0773.m3169("᩶ۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16539)) ^ (-60288175);
                        i5 = -886496665;
                    }
                    break;
                case -1726271006:
                case 2124788072:
                    if (C2023.m6964() <= 0) {
                        iM2761 = (C0619.m2761("᩸۬") ^ i2) * 45;
                        i4 = ((iM2761 ^ i3) * (-19249)) ^ (-676862507);
                        i5 = -379005689;
                    } else {
                        iM2761 = (C0773.m3169("۫ܺ") + i3) * (-101);
                        i4 = ((iM2761 ^ i2) * (-10911)) ^ 1429845572;
                        i5 = 1839284278;
                    }
                    break;
                case -1564396401:
                case 36571308:
                    RunnableC3646.m11813();
                    iM2761 = C0773.m3169("ۘᩳ") ^ i2;
                    i4 = ((iM2761 ^ i3) * 18189) ^ (-1135488359);
                    i5 = -2107710490;
                    break;
                case -1496248816:
                case 1195346132:
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0773.m3169("᩶ۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16539)) ^ (-60288175);
                        i5 = -886496665;
                    } else {
                        iM2761 = C0619.m2761("ۧۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 20053) ^ (-1789772031);
                        i5 = -376505455;
                    }
                    break;
                case -1251193308:
                case -893503439:
                    z = false;
                    if (C1321.m4852()) {
                        iM2761 = C0773.m3169("۟ܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-13065)) ^ (-383217471);
                        i5 = -1776543192;
                    } else {
                        iM2761 = C0773.m3169("᩶ۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16539)) ^ (-60288175);
                        i5 = -886496665;
                    }
                    break;
                case -985683344:
                case 946053263:
                    break;
                case -739423097:
                case 528599252:
                    this.f20014 = z;
                    if (this.f20003) {
                        iM2761 = C0773.m3169("᩺ۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-9759)) ^ (-672651297);
                        i5 = 762654076;
                    } else {
                        iM2761 = (C0619.m2761("۟۠") ^ i2) * (-89);
                        i4 = ((iM2761 ^ i3) * 24267) ^ (-636425160);
                        i5 = 1109170950;
                    }
                    break;
                case -302030903:
                case -94923574:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (C0619.m2761("᩸۬") ^ i2) * 45;
                        i4 = ((iM2761 ^ i3) * (-19249)) ^ (-676862507);
                        i5 = -379005689;
                    } else {
                        iM2761 = C0773.m3169("֨ᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10467)) ^ (-987978072);
                        i5 = -1209245125;
                    }
                    break;
                case -214020254:
                case 1398254590:
                    if (C1783.f6087 <= 0) {
                        iM2761 = (C0619.m2761("᩸۬") ^ i2) * 45;
                        i4 = ((iM2761 ^ i3) * (-19249)) ^ (-676862507);
                        i5 = -379005689;
                    } else {
                        iM2761 = (C0773.m3169("ۗܿ") ^ i2) * 19;
                        i4 = ((iM2761 ^ i3) * 21681) ^ 416788985;
                        i5 = -337906965;
                    }
                    break;
                case -59192962:
                case 925916225:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0773.m3169("᩶ۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16539)) ^ (-60288175);
                        i5 = -886496665;
                    } else {
                        iM2761 = C0773.m3169("֫ᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 29939) ^ 416084517;
                        i5 = -1155605135;
                    }
                    break;
                case 360029009:
                case 1967186453:
                    C1321.m4852();
                    break;
                case 525378213:
                case 1824540275:
                    if (C3077.f9998) {
                        iM2761 = (i3 - C0619.m2761("ۡܽ")) * (-31);
                        i4 = ((iM2761 ^ i2) * (-10243)) ^ 874105621;
                        i5 = 1315876882;
                    } else {
                        iM2761 = C0773.m3169("ۘ۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * 1803) ^ (-1925935127);
                        i5 = -362320098;
                    }
                    break;
                case 549928412:
                case 1914031657:
                    if (C17202.m40372()) {
                        iM2761 = C0619.m2761("᩵ۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-20345)) ^ 928725116;
                        i5 = 1318816180;
                    } else {
                        iM2761 = C0773.m3169("ۘᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 18189) ^ (-1135488359);
                        i5 = -2107710490;
                    }
                    break;
                case 593733089:
                case 1153726626:
                    AbstractC0116.m1243();
                    if (C1321.f4751 < 0) {
                        iM2761 = C0773.m3169("ۘ۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * 1803) ^ (-1925935127);
                        i5 = -362320098;
                    } else {
                        iM2761 = C0773.m3169("ۘᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 18189) ^ (-1135488359);
                        i5 = -2107710490;
                    }
                    break;
                case 871196861:
                case 2077156730:
                    setVerticalScrollBarEnabled(true);
                    iM2761 = C0773.m3169("᩺ۤ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-9759)) ^ (-672651297);
                    i5 = 762654076;
                    break;
                case 1495307049:
                case 2119531194:
                    if (C1826.m6301() >= 0) {
                        iM2761 = C0773.m3169("ۘᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 18189) ^ (-1135488359);
                        i5 = -2107710490;
                    } else {
                        iM2761 = C0773.m3169("ۢۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 28549) ^ 1693598687;
                        i5 = -68481952;
                    }
                    break;
                case 2068753791:
                case 2097614632:
                    C2702.m8876();
                    if (AbstractC0116.f1064 > 0) {
                        iM2761 = C0773.m3169("᩶ۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16539)) ^ (-60288175);
                        i5 = -886496665;
                    } else {
                        iM2761 = C0619.m2761("᩸֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * 25927) ^ 149556319;
                        i5 = -2040271292;
                    }
                    break;
                default:
                    if (C1542.m5459() >= 0) {
                        iM2761 = (C0619.m2761("᩸۬") ^ i2) * 45;
                        i4 = ((iM2761 ^ i3) * (-19249)) ^ (-676862507);
                        i5 = -379005689;
                    } else {
                        iM2761 = C0773.m3169("᩺۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * 6737) ^ 1054617071;
                        i5 = 2060972611;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.C25227
    public final void setLayoutManager(AbstractC21169 abstractC21169) {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 2009908406;
        int i7 = C1826.f6190;
        int i8 = C0773.f2792;
        int iM2761 = (C0619.m2761("ۤ۫") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
        int i9 = ((iM2761 ^ i8) * (-25329)) ^ (-676515911);
        int i10 = -595408684;
        while (true) {
            i6 = ((((i6 ^ i8) * 30501) >> 31) & i9) ^ (iM2761 ^ i10);
            switch (i6) {
                case -2109255136:
                case -1019743721:
                    C3099.m10095();
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0619.m2761("ۙ۠") ^ i7;
                        i9 = ((iM2761 ^ i8) * 1129) ^ (-1646873655);
                        i10 = 454865166;
                    } else {
                        iM2761 = (i8 - C0619.m2761("۬ۢ")) * 65;
                        i9 = ((iM2761 ^ i7) * (-26391)) ^ 1967753988;
                        i10 = 1040568009;
                    }
                    break;
                case -2011149605:
                case 580939315:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (i7 - C0619.m2761("ۗ᩹")) * 33;
                        i9 = ((iM2761 ^ i8) * 11503) ^ 1070672468;
                        i10 = -1058021107;
                    } else {
                        iM2761 = (C0619.m2761("᩸ܿ") + i7) * (-47);
                        i9 = ((iM2761 ^ i8) * (-8337)) ^ 1603337429;
                        i10 = -721825102;
                    }
                    break;
                case -1674731777:
                case 842543144:
                    i2 = i * i;
                    i3 = s * s;
                    if (C3099.f10023 <= 0) {
                        iM2761 = (i8 - C0619.m2761("۬ۢ")) * 65;
                        i9 = ((iM2761 ^ i7) * (-26391)) ^ 1967753988;
                        i10 = 1040568009;
                    } else {
                        iM2761 = (C0619.m2761("ܺ᩺") + i7) * (-47);
                        i9 = ((iM2761 ^ i8) * (-18729)) ^ 696025439;
                        i10 = 1633412368;
                    }
                    break;
                case -1583004662:
                case 604088634:
                    C2485.m8357();
                    iM2761 = C0773.m3169("۬ۛ") ^ i8;
                    i9 = ((iM2761 ^ i7) * 8321) ^ 1958396175;
                    i10 = 755783808;
                    break;
                case -1381323332:
                case 1574148864:
                    sArr = f19999;
                    if (C3448.f11240 >= 0) {
                        iM2761 = (i7 - C0619.m2761("ۗ᩹")) * 33;
                        i9 = ((iM2761 ^ i8) * 11503) ^ 1070672468;
                        i10 = -1058021107;
                    } else {
                        iM2761 = C0619.m2761("۬᩶") ^ i8;
                        i9 = ((iM2761 ^ i7) * 28321) ^ (-658020560);
                        i10 = -2078523780;
                    }
                    break;
                case -1297971752:
                case 846771510:
                    short[] sArr2 = f19999;
                    if (C2419.f7754 < 0) {
                        if (C2287.f7432 < 0) {
                            throw new RuntimeException(C2702.m8881(sArr2, 1, 14, i5));
                        }
                        iM2761 = (i8 - C0619.m2761("۬ۢ")) * 65;
                        i9 = ((iM2761 ^ i7) * (-26391)) ^ 1967753988;
                        i10 = 1040568009;
                    } else {
                        iM2761 = C0773.m3169("۬ۛ") ^ i8;
                        i9 = ((iM2761 ^ i7) * 8321) ^ 1958396175;
                        i10 = 755783808;
                    }
                    break;
                case -1048374520:
                case 286736328:
                    if (RunnableC1848.f6235) {
                        iM2761 = (i8 - C0773.m3169("ۜܳ")) * 99;
                        i9 = ((iM2761 ^ i7) * (-26749)) ^ 683922372;
                        i10 = -793446634;
                    } else {
                        iM2761 = (i8 - C0619.m2761("۬ۢ")) * 65;
                        i9 = ((iM2761 ^ i7) * (-26391)) ^ 1967753988;
                        i10 = 1040568009;
                    }
                    break;
                case -994036458:
                case 2147047886:
                    C4238.m13540();
                    if (C2834.f9334 > 0) {
                        iM2761 = (i8 - C0619.m2761("۬ۢ")) * 65;
                        i9 = ((iM2761 ^ i7) * (-26391)) ^ 1967753988;
                        i10 = 1040568009;
                    } else {
                        iM2761 = C0773.m3169("۬ۛ") ^ i8;
                        i9 = ((iM2761 ^ i7) * 8321) ^ 1958396175;
                        i10 = 755783808;
                    }
                    break;
                case -456118847:
                case 1665036578:
                    i5 = 12967;
                    iM2761 = (i7 - C0619.m2761("ۗܿ")) * 75;
                    i9 = ((iM2761 ^ i8) * 13429) ^ (-41549438);
                    i10 = 1011315533;
                    break;
                case -369649450:
                case -14803665:
                    i = s + s2;
                    if (C3690.f12684 <= 0) {
                        iM2761 = (i7 - C0619.m2761("ۗ᩹")) * 33;
                        i9 = ((iM2761 ^ i8) * 11503) ^ 1070672468;
                        i10 = -1058021107;
                    } else {
                        iM2761 = (C0773.m3169("ۨᩳ") + i7) * (-7);
                        i9 = ((iM2761 ^ i8) * (-29799)) ^ (-585813244);
                        i10 = 260911306;
                    }
                    break;
                case -333251864:
                case 1603468614:
                    C0862.m3503();
                    return;
                case -159205409:
                case 1671203883:
                    c = 0;
                    if (C17202.f56030) {
                        iM2761 = C0773.m3169("ܽ۟") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-3279)) ^ 28494589;
                        i10 = 369291549;
                    } else {
                        iM2761 = C0619.m2761("ۙ۠") ^ i7;
                        i9 = ((iM2761 ^ i8) * 1129) ^ (-1646873655);
                        i10 = 454865166;
                    }
                    break;
                case 180955082:
                case 417766919:
                    i4 = 117137329;
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (i7 - C0619.m2761("ۗ᩹")) * 33;
                        i9 = ((iM2761 ^ i8) * 11503) ^ 1070672468;
                        i10 = -1058021107;
                    } else {
                        iM2761 = (C0773.m3169("ۘܺ") ^ i8) * (-7);
                        i9 = ((iM2761 ^ i7) * 13475) ^ (-1211508403);
                        i10 = -2088366695;
                    }
                    break;
                case 852120941:
                case 990514501:
                    i5 = 9858;
                    iM2761 = (i7 - C0619.m2761("ۗܿ")) * 75;
                    i9 = ((iM2761 ^ i8) * 13429) ^ (-41549438);
                    i10 = 1011315533;
                    break;
                case 1142051990:
                case 1743254506:
                    if (C1519.f5300 >= 0) {
                        iM2761 = (i7 - C0619.m2761("ۗ᩹")) * 33;
                        i9 = ((iM2761 ^ i8) * 11503) ^ 1070672468;
                        i10 = -1058021107;
                    } else {
                        iM2761 = (i8 - C0773.m3169("ۢܶ")) * (-121);
                        i9 = ((iM2761 ^ i7) * 16891) ^ (-1625517356);
                        i10 = -249474016;
                    }
                    break;
                case 1927751096:
                case 1991949577:
                    s = sArr[c];
                    s2 = 10823;
                    if (C3998.f13671 != 0) {
                        iM2761 = (i8 - C0619.m2761("۬ۢ")) * 65;
                        i9 = ((iM2761 ^ i7) * (-26391)) ^ 1967753988;
                        i10 = 1040568009;
                    } else {
                        iM2761 = (C0619.m2761("ۖᩳ") ^ i8) * (-49);
                        i9 = ((iM2761 ^ i7) * 14181) ^ 266685838;
                        i10 = -430799974;
                    }
                    break;
                default:
                    int i11 = i3 + i4;
                    if ((i11 + i11) - i2 >= 0) {
                        iM2761 = (i8 - C0619.m2761("ۡۛ")) * (-89);
                        i9 = ((iM2761 ^ i7) * (-29437)) ^ 406710249;
                        i10 = -1008418936;
                    } else {
                        iM2761 = C0619.m2761("֡ۨ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 16295) ^ 665762711;
                        i10 = 1445975021;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m16970(int i) {
        AbstractC21169 layoutManager = null;
        int i2 = -1389665968;
        int i3 = AbstractC0641.f2496;
        int i4 = C2419.f7754;
        int iM3169 = C0773.m3169("ۛۨ") ^ i4;
        int i5 = ((iM3169 ^ i3) * (-10909)) ^ 362303479;
        int i6 = 790060944;
        while (true) {
            i2 = ((((i2 ^ i3) * 3841) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2090196172:
                case -742386073:
                    RunnableC3646.m11813();
                    break;
                case -1843982567:
                case 1312349766:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0619.m2761("ᩴ᩻") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-5005)) ^ (-924253730);
                        i6 = 163379265;
                    } else {
                        iM3169 = C0619.m2761("֫᩺") ^ i4;
                        i5 = ((iM3169 ^ i3) * 4089) ^ 1632865886;
                        i6 = 488472828;
                    }
                    break;
                case -1788179623:
                case -481681768:
                    if (C3099.f10023 <= 0) {
                        iM3169 = (C0619.m2761("۟ۧ") ^ i3) * 35;
                        i5 = ((iM3169 ^ i4) * 11033) ^ (-1931021212);
                        i6 = -353580659;
                    } else {
                        iM3169 = C0773.m3169("֡֡") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-589)) ^ 745139934;
                        i6 = -365580344;
                    }
                    break;
                case -1759361372:
                case -1699547271:
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0619.m2761("ᩴ᩻") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-5005)) ^ (-924253730);
                        i6 = 163379265;
                    } else {
                        iM3169 = (C0773.m3169("᩵ۨ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM3169 ^ i4) * (-30647)) ^ (-1350508519);
                        i6 = 800065257;
                    }
                    break;
                case -1586831052:
                case 1648548450:
                    layoutManager = super.getLayoutManager();
                    if (C2702.f8586 <= 0) {
                        iM3169 = (C0619.m2761("۟ۧ") ^ i3) * 35;
                        i5 = ((iM3169 ^ i4) * 11033) ^ (-1931021212);
                        i6 = -353580659;
                    } else {
                        iM3169 = (C0773.m3169("֨ۤ") + i3) * 13;
                        i5 = ((iM3169 ^ i4) * (-2279)) ^ 776287166;
                        i6 = 1963475373;
                    }
                    break;
                case -1515044527:
                case 1688319094:
                    C1519.m5403();
                    if (C1783.f6087 <= 0) {
                        iM3169 = C0619.m2761("ۘ᩺") ^ i3;
                        i5 = ((iM3169 ^ i4) * 21259) ^ (-1455449729);
                        i6 = -288794669;
                    } else {
                        iM3169 = C0619.m2761("ᩴ᩻") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-5005)) ^ (-924253730);
                        i6 = 163379265;
                    }
                    break;
                case -1253242174:
                case -204449170:
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0619.m2761("ᩴ᩻") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-5005)) ^ (-924253730);
                        i6 = 163379265;
                    } else {
                        iM3169 = C0773.m3169("ܺ᩷") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-2139)) ^ 1634620599;
                        i6 = -54253117;
                    }
                    break;
                case -1227152613:
                case 1088801219:
                    if (C2288.f7433 <= 0) {
                        iM3169 = (C0619.m2761("۟ۧ") ^ i3) * 35;
                        i5 = ((iM3169 ^ i4) * 11033) ^ (-1931021212);
                        i6 = -353580659;
                    } else {
                        iM3169 = (C0619.m2761("ܿܽ") + i3) * 35;
                        i5 = ((iM3169 ^ i4) * 5511) ^ 474313353;
                        i6 = 1766079593;
                    }
                    break;
                case -1115772925:
                case 298148867:
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0619.m2761("ᩴ᩻") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-5005)) ^ (-924253730);
                        i6 = 163379265;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ᩴᩴ")) * 81;
                        i5 = ((iM3169 ^ i3) * (-5819)) ^ 1103733791;
                        i6 = -1989531781;
                    }
                    break;
                case -889660422:
                case 1317929430:
                    C2023.m6964();
                    C2419.m8174();
                    iM3169 = C0619.m2761("ᩴ᩻") ^ i3;
                    i5 = ((iM3169 ^ i4) * (-5005)) ^ (-924253730);
                    i6 = 163379265;
                    break;
                case -305860926:
                case 1980843596:
                    if (C0950.m3785() != 0) {
                        iM3169 = (C0619.m2761("۟ۧ") ^ i3) * 35;
                        i5 = ((iM3169 ^ i4) * 11033) ^ (-1931021212);
                        i6 = -353580659;
                    } else {
                        iM3169 = C0773.m3169("ۚۙ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 21809) ^ (-1225937703);
                        i6 = 1926259675;
                    }
                    break;
                case -89687698:
                case 920988192:
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0619.m2761("ᩴ᩻") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-5005)) ^ (-924253730);
                        i6 = 163379265;
                    } else {
                        iM3169 = C0773.m3169("۟᩻") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-29813)) ^ 1182213446;
                        i6 = -1730164984;
                    }
                    break;
                case -64566215:
                case 2045353979:
                    ((C0067) layoutManager).scrollToPositionWithOffset(i, 0);
                    break;
                case 279505406:
                case 1480424340:
                    if (RunnableC3646.m11813() != 0) {
                        iM3169 = C0619.m2761("ۘ᩺") ^ i3;
                        i5 = ((iM3169 ^ i4) * 21259) ^ (-1455449729);
                        i6 = -288794669;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۗ֨")) * (-13);
                        i5 = ((iM3169 ^ i4) * (-4547)) ^ (-1894002099);
                        i6 = 1172919208;
                    }
                    break;
                case 313589922:
                case 1679568003:
                    if (C1542.f5343 > 0) {
                        iM3169 = C0619.m2761("ᩴ᩻") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-5005)) ^ (-924253730);
                        i6 = 163379265;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۢ۠")) * 11;
                        i5 = ((iM3169 ^ i3) * (-9997)) ^ (-1743264786);
                        i6 = -1818895470;
                    }
                    break;
                default:
                    if (C3492.m11488()) {
                        iM3169 = (C0773.m3169("᩷ܰ") + i4) * (-97);
                        i5 = ((iM3169 ^ i3) * 5323) ^ 952916856;
                        i6 = -565947623;
                    } else {
                        iM3169 = C0619.m2761("ۘ᩺") ^ i3;
                        i5 = ((iM3169 ^ i4) * 21259) ^ (-1455449729);
                        i6 = -288794669;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.C25227
    public final void setAdapter(AbstractC12964 abstractC12964) {
        AbstractC1778 abstractC1778 = null;
        AbstractC12964 adapter = null;
        int i = 1183970161;
        int i2 = AbstractC0641.f2496;
        int i3 = C2702.f8586;
        int iM3169 = C0773.m3169("ܿܳ") ^ i3;
        int i4 = ((iM3169 ^ i2) * 23555) ^ (-1702604345);
        int i5 = -1833585993;
        while (true) {
            i = ((((i ^ i2) * 6017) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2118879254:
                case 908141363:
                    if (this.f20019 != null) {
                        iM3169 = (C0773.m3169("ܶۤ") ^ i3) * 101;
                        i4 = ((iM3169 ^ i2) * (-13701)) ^ (-1340297250);
                        i5 = 1541584826;
                    } else {
                        iM3169 = C0619.m2761("۠۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17153) ^ 109159049;
                        i5 = -1983563430;
                    }
                    break;
                case -1977455507:
                case 1045051329:
                    if (C2287.m7745() <= 0) {
                        iM3169 = (C0619.m2761("ۙۢ") ^ i3) * 65;
                        i4 = ((iM3169 ^ i2) * (-31497)) ^ (-491865802);
                        i5 = 1520475502;
                    } else {
                        iM3169 = C0619.m2761("۟ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-29131)) ^ (-117420646);
                        i5 = -1395970844;
                    }
                    break;
                case -1909999047:
                case -464306211:
                    adapter.unregisterAdapterDataObserver(this.f20019);
                    iM3169 = C0619.m2761("۠۟") ^ i2;
                    i4 = ((iM3169 ^ i3) * 17153) ^ 109159049;
                    i5 = -1983563430;
                    break;
                case -1895413242:
                case 758854424:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (i2 - C0619.m2761("ܺܰ")) * (-43);
                        i4 = ((iM3169 ^ i3) * 28845) ^ 593330242;
                        i5 = -1349671974;
                    } else {
                        iM3169 = (C0619.m2761("ۡ᩵") ^ i3) * 95;
                        i4 = ((iM3169 ^ i2) * 4965) ^ 1696419027;
                        i5 = -74105249;
                    }
                    break;
                case -1888952756:
                case 1516710779:
                    if (C3734.m12152() >= 0) {
                        iM3169 = (C0773.m3169("ܺۖ") + i2) * 93;
                        i4 = ((iM3169 ^ i3) * (-17613)) ^ (-794782049);
                        i5 = 307699277;
                    } else {
                        iM3169 = C0773.m3169("᩸ۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-10251)) ^ 1357016918;
                        i5 = 1419536854;
                    }
                    break;
                case -1819147130:
                case 457295015:
                    if (C23916.m53419() != 0) {
                        iM3169 = C0773.m3169("ܿ᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-25321)) ^ (-1965644313);
                        i5 = 1118177682;
                    } else {
                        iM3169 = C0619.m2761("ۧۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-28027)) ^ 723708815;
                        i5 = -1858277261;
                    }
                    break;
                case -1717645019:
                case -1304674948:
                    this.f20019.onChanged();
                    iM3169 = C0773.m3169("ۙᩴ") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-19589)) ^ 2039934293;
                    i5 = 1060008018;
                    break;
                case -1640932912:
                case -560094186:
                    abstractC12964.registerAdapterDataObserver(abstractC1778);
                    iM3169 = (i3 - C0773.m3169("ۡ᩸")) * (-31);
                    i4 = ((iM3169 ^ i2) * (-14983)) ^ (-784719866);
                    i5 = -1557125568;
                    break;
                case -1601976136:
                case -458942615:
                    if (C1080.m4050()) {
                        iM3169 = C0619.m2761("ۚᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 30009) ^ (-2026819133);
                        i5 = -1091240751;
                    } else {
                        iM3169 = C0773.m3169("ܿ᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-25321)) ^ (-1965644313);
                        i5 = 1118177682;
                    }
                    break;
                case -1551104154:
                case -856204412:
                    if (C2288.f7433 <= 0) {
                        iM3169 = (C0773.m3169("ܺۖ") + i2) * 93;
                        i4 = ((iM3169 ^ i3) * (-17613)) ^ (-794782049);
                        i5 = 307699277;
                    } else {
                        iM3169 = (C0773.m3169("ۜܶ") + i3) * 79;
                        i4 = ((iM3169 ^ i2) * (-6953)) ^ 1933649700;
                        i5 = -799066329;
                    }
                    break;
                case -1455081778:
                case 874612729:
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0773.m3169("ܿ᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-25321)) ^ (-1965644313);
                        i5 = 1118177682;
                    } else {
                        iM3169 = (C0773.m3169("ܶ۟") ^ i2) * 31;
                        i4 = ((iM3169 ^ i3) * 30047) ^ 939464953;
                        i5 = 1088337347;
                    }
                    break;
                case -1229596020:
                case 468302172:
                    if (C0773.m3161() != 0) {
                        iM3169 = (C0773.m3169("ܺۖ") + i2) * 93;
                        i4 = ((iM3169 ^ i3) * (-17613)) ^ (-794782049);
                        i5 = 307699277;
                    } else {
                        iM3169 = C0773.m3169("ۤܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 18251) ^ (-1375906844);
                        i5 = 2119112790;
                    }
                    break;
                case -930873248:
                case -146516346:
                    adapter = getAdapter();
                    if (adapter != null) {
                        iM3169 = (i2 - C0619.m2761("᩵۟")) * (-81);
                        i4 = ((iM3169 ^ i3) * 22255) ^ (-1406194824);
                        i5 = -1655273823;
                    } else {
                        iM3169 = C0619.m2761("۠۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17153) ^ 109159049;
                        i5 = -1983563430;
                    }
                    break;
                case -623136033:
                case -240518186:
                    if (RunnableC1848.f6235) {
                        iM3169 = (C0619.m2761("ۙۢ") ^ i3) * 65;
                        i4 = ((iM3169 ^ i2) * (-31497)) ^ (-491865802);
                        i5 = 1520475502;
                    } else {
                        iM3169 = C0773.m3169("ۗᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 12387) ^ (-1361509746);
                        i5 = 302588602;
                    }
                    break;
                case -565524652:
                case 1477149268:
                    if (C2310.f7472 >= 0) {
                        iM3169 = (C0619.m2761("ۙۢ") ^ i3) * 65;
                        i4 = ((iM3169 ^ i2) * (-31497)) ^ (-491865802);
                        i5 = 1520475502;
                    } else {
                        iM3169 = C0619.m2761("֫᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2125) ^ 524468867;
                        i5 = 1176634461;
                    }
                    break;
                case -441112209:
                case 51410775:
                    super.setAdapter(abstractC12964);
                    abstractC1778 = this.f20019;
                    if (abstractC1778 != null) {
                        iM3169 = (C0773.m3169("ܳۡ") + i2) * (-53);
                        i4 = ((iM3169 ^ i3) * 20915) ^ (-1947502883);
                        i5 = 639960861;
                    } else {
                        iM3169 = C0773.m3169("ۙᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-19589)) ^ 2039934293;
                        i5 = 1060008018;
                    }
                    break;
                case -368570956:
                case 1740460829:
                    if (abstractC12964 != null) {
                        iM3169 = C0773.m3169("᩸۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * 9969) ^ (-353075968);
                        i5 = 350746442;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۡ᩸")) * (-31);
                        i4 = ((iM3169 ^ i2) * (-14983)) ^ (-784719866);
                        i5 = -1557125568;
                    }
                    break;
                case -221235595:
                case 1830959018:
                    C4238.m13540();
                    C0619.m2763();
                    iM3169 = (C0619.m2761("ۙۢ") ^ i3) * 65;
                    i4 = ((iM3169 ^ i2) * (-31497)) ^ (-491865802);
                    i5 = 1520475502;
                    break;
                case 30082486:
                case 124386404:
                    C11235.m28309();
                    if (!C4282.m13644()) {
                        iM3169 = (C0619.m2761("ۙۢ") ^ i3) * 65;
                        i4 = ((iM3169 ^ i2) * (-31497)) ^ (-491865802);
                        i5 = 1520475502;
                    } else {
                        iM3169 = C0619.m2761("۬ܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 4043) ^ (-168892301);
                        i5 = 625741276;
                    }
                    break;
                case 180884786:
                case 2023755915:
                    if (C2834.f9334 > 0) {
                        iM3169 = (i2 - C0619.m2761("ܺܰ")) * (-43);
                        i4 = ((iM3169 ^ i3) * 28845) ^ 593330242;
                        i5 = -1349671974;
                    } else {
                        iM3169 = C0619.m2761("۬ܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 4043) ^ (-168892301);
                        i5 = 625741276;
                    }
                    break;
                case 792210615:
                case 2000714069:
                    break;
                case 2076973082:
                case 2109491355:
                    if (!C1343.m4943()) {
                        iM3169 = C0773.m3169("ܿ᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-25321)) ^ (-1965644313);
                        i5 = 1118177682;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ܺܰ")) * (-43);
                        i4 = ((iM3169 ^ i3) * 28845) ^ 593330242;
                        i5 = -1349671974;
                    }
                    break;
                default:
                    C0773.m3161();
                    break;
            }
            return;
        }
    }

    @Override // l.C25227
    public final C0067 getLayoutManager() {
        return (C0067) super.getLayoutManager();
    }

    @Override // l.C25227
    public final AbstractC21169 getLayoutManager() {
        return (C0067) super.getLayoutManager();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m16963() {
        return ((C0067) super.getLayoutManager()).findFirstVisibleItemPosition();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m16969() {
        return ((C0067) super.getLayoutManager()).findLastVisibleItemPosition();
    }

    @Override // l.C25227
    public final void scrollToPosition(int i) {
        AbstractC21169 layoutManager = null;
        int i2 = 1537977897;
        int i3 = C3690.f12684;
        int i4 = C3779.f12953;
        int iM2761 = (C0619.m2761("ۨܰ") ^ i3) * (-117);
        int i5 = ((iM2761 ^ i4) * 16057) ^ (-856921321);
        int i6 = -138637654;
        while (true) {
            i2 = ((((i2 ^ i4) * (-14489)) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -2079508807:
                case 1441090123:
                    if (C3448.m11248() != 0) {
                        iM2761 = (i4 - C0619.m2761("ܳ۟")) * 21;
                        i5 = ((iM2761 ^ i3) * 1315) ^ 1423187696;
                        i6 = -579939153;
                    } else {
                        iM2761 = (C0773.m3169("۫֫") + i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM2761 ^ i3) * (-32255)) ^ (-2057771807);
                        i6 = -1182548170;
                    }
                    break;
                case -1984143943:
                case -383148502:
                    if (C1519.m5403()) {
                        iM2761 = C0773.m3169("֫۠") ^ i4;
                        i5 = ((iM2761 ^ i3) * 22941) ^ (-69205623);
                        i6 = 1652801706;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܿܺ")) * (-37);
                        i5 = ((iM2761 ^ i4) * 30441) ^ (-939850893);
                        i6 = -827290353;
                    }
                    break;
                case -1753633743:
                case 699872984:
                    C1146.m4231();
                    if (!C2878.f9462) {
                        iM2761 = (i4 - C0619.m2761("ܳ۟")) * 21;
                        i5 = ((iM2761 ^ i3) * 1315) ^ 1423187696;
                        i6 = -579939153;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܿܺ")) * (-37);
                        i5 = ((iM2761 ^ i4) * 30441) ^ (-939850893);
                        i6 = -827290353;
                    }
                    break;
                case -1682011437:
                case 2005900590:
                    ((C0067) layoutManager).scrollToPosition(i);
                    break;
                case -1603207167:
                case 1027168061:
                    if (C3077.f9998) {
                        iM2761 = C0619.m2761("᩷ۙ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 31239) ^ 231976008;
                        i6 = 1347236257;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ۡۚ")) * (-9);
                        i5 = ((iM2761 ^ i3) * 21267) ^ 295292520;
                        i6 = 517289418;
                    }
                    break;
                case -1544975077:
                case -1190110884:
                    if (C3779.f12953 <= 0) {
                        iM2761 = (i4 - C0619.m2761("ۡۚ")) * (-9);
                        i5 = ((iM2761 ^ i3) * 21267) ^ 295292520;
                        i6 = 517289418;
                    } else {
                        iM2761 = C0619.m2761("ܺۤ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-13941)) ^ (-478335097);
                        i6 = -1608195483;
                    }
                    break;
                case -1297631418:
                case 1421325473:
                    if (!C3690.m11987()) {
                        iM2761 = (i3 - C0773.m3169("۬ۛ")) * (-103);
                        i5 = ((iM2761 ^ i4) * (-29239)) ^ (-1130759681);
                        i6 = -1012479706;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ۡۚ")) * (-9);
                        i5 = ((iM2761 ^ i3) * 21267) ^ 295292520;
                        i6 = 517289418;
                    }
                    break;
                case -1274894627:
                case -166335141:
                    C2878.m9491();
                    break;
                case -1165566088:
                case 645875383:
                    if (C4238.f15451 >= 0) {
                        iM2761 = (i3 - C0619.m2761("ܿܺ")) * (-37);
                        i5 = ((iM2761 ^ i4) * 30441) ^ (-939850893);
                        i6 = -827290353;
                    } else {
                        iM2761 = (i3 - C0619.m2761("֨ۨ")) * (-53);
                        i5 = ((iM2761 ^ i4) * 23001) ^ (-609405535);
                        i6 = 1411432315;
                    }
                    break;
                case -854249710:
                case -122272101:
                    if (C3448.f11240 >= 0) {
                        iM2761 = (i3 - C0773.m3169("۬ۛ")) * (-103);
                        i5 = ((iM2761 ^ i4) * (-29239)) ^ (-1130759681);
                        i6 = -1012479706;
                    } else {
                        iM2761 = (C0773.m3169("᩹ۘ") ^ i3) * (-115);
                        i5 = ((iM2761 ^ i4) * (-3185)) ^ 934458947;
                        i6 = -1031223244;
                    }
                    break;
                case -2532145:
                case 2071063591:
                    if (C2485.f7950 != 0) {
                        iM2761 = (i4 - C0619.m2761("ܳ۟")) * 21;
                        i5 = ((iM2761 ^ i3) * 1315) ^ 1423187696;
                        i6 = -579939153;
                    } else {
                        iM2761 = C0619.m2761("ܰۗ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-5725)) ^ 888083854;
                        i6 = 1173272459;
                    }
                    break;
                case 464631207:
                case 1876886319:
                    C3998.m12920();
                    iM2761 = (i4 - C0619.m2761("ܳ۟")) * 21;
                    i5 = ((iM2761 ^ i3) * 1315) ^ 1423187696;
                    i6 = -579939153;
                    break;
                case 670997063:
                case 1857899395:
                    if (C2878.f9462) {
                        iM2761 = (i4 - C0619.m2761("ۡۚ")) * (-9);
                        i5 = ((iM2761 ^ i3) * 21267) ^ 295292520;
                        i6 = 517289418;
                    } else {
                        iM2761 = (C0619.m2761("᩵ۤ") + i3) * 109;
                        i5 = ((iM2761 ^ i4) * 26105) ^ (-113749953);
                        i6 = -1692946168;
                    }
                    break;
                case 1260072713:
                case 2083575319:
                    layoutManager = super.getLayoutManager();
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0773.m3169("᩻ܽ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-3737)) ^ (-1227629237);
                        i6 = 2100089269;
                    } else {
                        iM2761 = C0773.m3169("᩻ۖ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-7789)) ^ 943978986;
                        i6 = 1233119221;
                    }
                    break;
                case 1819675418:
                case 1835735015:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0773.m3169("᩻ܽ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-3737)) ^ (-1227629237);
                        i6 = 2100089269;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ۤ֨")) * (-17);
                        i5 = ((iM2761 ^ i3) * (-11571)) ^ 2003952522;
                        i6 = -1669225745;
                    }
                    break;
                default:
                    RunnableC3055.m9933();
                    if (!C17202.m40372()) {
                        iM2761 = (i4 - C0619.m2761("ܳ۟")) * 21;
                        i5 = ((iM2761 ^ i3) * 1315) ^ 1423187696;
                        i6 = -579939153;
                    } else {
                        iM2761 = (i3 - C0773.m3169("۬ۛ")) * (-103);
                        i5 = ((iM2761 ^ i4) * (-29239)) ^ (-1130759681);
                        i6 = -1012479706;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m16966() {
        awakenScrollBars(SnackbarManager.SHORT_DURATION_MS);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0433 A[PHI: r3
      0x0433: PHI (r3v4 boolean) = 
      (r3v3 boolean)
      (r3v2 boolean)
      (r3v2 boolean)
      (r3v2 boolean)
      (r3v2 boolean)
      (r3v2 boolean)
      (r3v2 boolean)
      (r3v2 boolean)
     binds: [B:113:0x041b, B:106:0x03cd, B:89:0x031f, B:80:0x02a7, B:75:0x0274, B:63:0x01fe, B:60:0x01f8, B:39:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:122:0x047f A[PHI: r7
      0x047f: PHI (r7v4 float) = (r7v2 float), (r7v3 float), (r7v2 float), (r7v2 float), (r7v2 float) binds: [B:121:0x047d, B:92:0x033f, B:29:0x00cd, B:26:0x00b3, B:12:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0090  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c9 A[PHI: r10
      0x01c9: PHI (r10v4 float) = (r10v3 float), (r10v2 float) binds: [B:56:0x01c7, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0246 A[PHI: r8 r11
      0x0246: PHI (r8v4 float) = (r8v3 float), (r8v2 float), (r8v2 float), (r8v2 float) binds: [B:72:0x0244, B:52:0x01a1, B:23:0x00ab, B:19:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r11v4 float) = (r11v2 float), (r11v3 float), (r11v2 float), (r11v2 float) binds: [B:72:0x0244, B:52:0x01a1, B:23:0x00ab, B:19:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:97:0x0367 A[PHI: r9 r17
      0x0367: PHI (r9v5 float) = (r9v2 float), (r9v3 float), (r9v2 float), (r9v2 float) binds: [B:96:0x0365, B:68:0x0222, B:16:0x0087, B:36:0x00e9] A[DONT_GENERATE, DONT_INLINE]
      0x0367: PHI (r17v4 float) = (r17v2 float), (r17v2 float), (r17v2 float), (r17v7 float) binds: [B:96:0x0365, B:68:0x0222, B:16:0x0087, B:36:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.C25227, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iM3169;
        int i;
        int i2;
        int iM2761;
        int i3;
        int i4 = C3448.f11240;
        int i5 = C0950.f3488;
        int iM2762 = (i5 - C0619.m2761("ۨۨ")) * 47;
        int i6 = ((iM2762 ^ i4) * 18657) ^ 850123267;
        C23073 c23073 = null;
        int i7 = iM2762 ^ (-1330690484);
        boolean z = false;
        boolean z2 = false;
        int actionMasked = 0;
        float y = 0.0f;
        float f = 0.0f;
        float f2 = 0.0f;
        float x = 0.0f;
        float y2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        int i8 = 0;
        float f7 = 0.0f;
        int i9 = -1925007574;
        boolean zOnInterceptTouchEvent = false;
        while (true) {
            i9 = i7 ^ (i6 & (((i9 ^ i4) * 15555) >> 31));
            switch (i9) {
                case -2142373835:
                case 1408632410:
                    actionMasked = motionEvent.getActionMasked();
                    c23073 = this.f20009;
                    if (actionMasked != 0) {
                        iM3169 = C0773.m3169("۫᩹") ^ i4;
                        i = ((iM3169 ^ i5) * (-6961)) ^ 1840070289;
                        i2 = -1552109938;
                    } else {
                        iM3169 = (C0773.m3169("ۡ۬") + i5) * 35;
                        i = ((iM3169 ^ i4) * 14693) ^ 283503892;
                        i2 = 1609105423;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -2070464322:
                case -1423876968:
                    this.f20020 = z;
                    f = c23073.f74853;
                    if (C3077.m10041()) {
                        iM3169 = C0619.m2761("ܳ᩵") ^ i4;
                        i = ((iM3169 ^ i5) * 3479) ^ (-1196658821);
                        i2 = 764945057;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۖۙ")) * 91;
                        i = ((iM3169 ^ i5) * 16121) ^ 787079908;
                        i2 = -1178325145;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -2013014791:
                case 1029030691:
                    this.f20013 = f - f2;
                    return z;
                case -1816896148:
                case 657516916:
                    return z;
                case -1780512408:
                case -976502263:
                    this.f20004 = y;
                    if (c23073.m51987(this.f20010, y)) {
                        iM3169 = (i4 - C0773.m3169("ۧ֫")) * (-5);
                        i = ((iM3169 ^ i5) * 19163) ^ 708939380;
                        i2 = 649563889;
                    } else {
                        iM3169 = C0773.m3169("ۨۛ") ^ i4;
                        i = ((iM3169 ^ i5) * (-11845)) ^ (-194375838);
                        i2 = -932285067;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -1638083020:
                case -905158357:
                    if (this.f20007) {
                        iM3169 = C0773.m3169("᩹֡") ^ i5;
                        i = ((iM3169 ^ i4) * (-2513)) ^ 1267827185;
                        i2 = -992040386;
                    } else {
                        iM3169 = C0773.m3169("ۨۛ") ^ i4;
                        i = ((iM3169 ^ i5) * (-11845)) ^ (-194375838);
                        i2 = -932285067;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -1555873207:
                case 978780931:
                    f6 = (f4 * f4) + f5;
                    int i10 = this.f20021;
                    if (C0773.f2792 > 0) {
                        iM2761 = C0619.m2761("ۗ᩸") ^ i4;
                        i8 = i10;
                        i6 = ((iM2761 ^ i5) * 29013) ^ (-1934913103);
                        i3 = 1049122850;
                        i7 = iM2761 ^ i3;
                    } else {
                        i8 = i10;
                        iM3169 = C0773.m3169("ۢᩳ") ^ i5;
                        i = ((iM3169 ^ i4) * (-15119)) ^ 803458741;
                        i2 = 1129669063;
                        i7 = iM3169 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1300413945:
                case 637108883:
                    y2 = motionEvent.getY();
                    if (C0269.m1775() <= 0) {
                        iM3169 = C0619.m2761("ܳ᩵") ^ i4;
                        i = ((iM3169 ^ i5) * 3479) ^ (-1196658821);
                        i2 = 764945057;
                    } else {
                        iM3169 = (i5 - C0619.m2761("ۖ᩹")) * 63;
                        i = ((iM3169 ^ i4) * 19397) ^ 1635477571;
                        i2 = -284783582;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -1262671634:
                case -525161126:
                    this.f20005 = z2;
                    iM3169 = C0773.m3169("ۨۛ") ^ i4;
                    i = ((iM3169 ^ i5) * (-11845)) ^ (-194375838);
                    i2 = -932285067;
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -1258970977:
                case 1999766021:
                    this.f20013 = f7 - f3;
                    return z;
                case -1120170172:
                case 966186696:
                    if (actionMasked != 2) {
                        iM3169 = C0773.m3169("᩷۫") ^ i5;
                        i = ((iM3169 ^ i4) * 725) ^ 2143229402;
                        i2 = -1640158431;
                    } else {
                        iM3169 = C0773.m3169("ܺۗ") ^ i4;
                        i = ((iM3169 ^ i5) * 3237) ^ (-1013789513);
                        i2 = -272718412;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -1103533805:
                case -691992059:
                    if (f6 > i8 * i8) {
                        iM3169 = (C0773.m3169("᩷֡") + i5) * (-29);
                        i = ((iM3169 ^ i4) * (-15867)) ^ 641046963;
                        i2 = 374297168;
                    } else {
                        iM3169 = C0773.m3169("ۨۛ") ^ i4;
                        i = ((iM3169 ^ i5) * (-11845)) ^ (-194375838);
                        i2 = -932285067;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -1038532303:
                case 253719895:
                    x = motionEvent.getX() - this.f20010;
                    if (C1783.f6087 <= 0) {
                        iM3169 = (C0773.m3169("۠ܰ") ^ i5) * (-51);
                        i = ((iM3169 ^ i4) * (-647)) ^ 1207466457;
                        i2 = -1812471298;
                    } else {
                        iM3169 = C0773.m3169("ᩴۧ") ^ i4;
                        i = ((iM3169 ^ i5) * (-24677)) ^ (-821829417);
                        i2 = -843905850;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -1005815640:
                case -836636995:
                    if (C3448.m11248() != 0) {
                        iM3169 = C0619.m2761("ܶ֡") ^ i4;
                        i = ((iM3169 ^ i5) * 20579) ^ 1211651303;
                        i2 = -1949207850;
                    } else {
                        iM3169 = C0619.m2761("ۖ۫") ^ i4;
                        i = ((iM3169 ^ i5) * (-14647)) ^ (-435709498);
                        i2 = -1536208258;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -996325497:
                case 1192252162:
                    z = true;
                    if (this.f20020) {
                        iM3169 = (C0619.m2761("۬ۚ") ^ i5) * 115;
                        i = ((iM3169 ^ i4) * (-7053)) ^ 783843864;
                        i2 = -817748014;
                    } else {
                        iM3169 = (C0773.m3169("֫ۙ") + i4) * 59;
                        i = ((iM3169 ^ i5) * 713) ^ 2046813069;
                        i2 = 1370875045;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -976132187:
                case 1434360902:
                    C1080.m4050();
                    if (C0619.f2439) {
                        iM3169 = C0619.m2761("ܶ֡") ^ i4;
                        i = ((iM3169 ^ i5) * 20579) ^ 1211651303;
                        i2 = -1949207850;
                    } else {
                        iM3169 = (C0773.m3169("ܰᩴ") ^ i5) * (-125);
                        i = ((iM3169 ^ i4) * 11497) ^ 314694936;
                        i2 = 307330076;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -906150990:
                case -175370155:
                    this.f20005 = z2;
                    this.f20020 = z;
                    float f8 = c23073.f74853;
                    if (C3734.f12817 < 0) {
                        iM2761 = (C0619.m2761("᩸֡") ^ i4) * (-69);
                        f7 = f8;
                        i6 = ((iM2761 ^ i5) * (-1373)) ^ (-1990890703);
                        i3 = 349944176;
                        i7 = iM2761 ^ i3;
                    } else {
                        f7 = f8;
                        iM3169 = C0619.m2761("ۖ۫") ^ i4;
                        i = ((iM3169 ^ i5) * (-14647)) ^ (-435709498);
                        i2 = -1536208258;
                        i7 = iM3169 ^ i2;
                        i6 = i;
                    }
                    break;
                case -884143563:
                case 152405593:
                    if (actionMasked != 3) {
                        iM3169 = C0773.m3169("ۨۛ") ^ i4;
                        i = ((iM3169 ^ i5) * (-11845)) ^ (-194375838);
                        i2 = -932285067;
                    } else {
                        iM3169 = (C0619.m2761("᩹ۚ") ^ i5) * 63;
                        i = ((iM3169 ^ i4) * (-13701)) ^ (-557325373);
                        i2 = -743436087;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -729933766:
                case 1042784292:
                    if (C3099.m10095()) {
                        iM3169 = (C0773.m3169("ܰᩴ") ^ i5) * (-125);
                        i = ((iM3169 ^ i4) * 11497) ^ 314694936;
                        i2 = 307330076;
                    } else {
                        iM3169 = C0619.m2761("ۜۤ") ^ i4;
                        i = ((iM3169 ^ i5) * 4391) ^ (-264351909);
                        i2 = 742727558;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -660772775:
                case 935798404:
                    z2 = false;
                    if (this.f20014) {
                        iM3169 = C0773.m3169("۠᩺") ^ i5;
                        i = ((iM3169 ^ i4) * 2367) ^ (-2039694865);
                        i2 = 158838658;
                    } else {
                        iM3169 = C0773.m3169("ۨۛ") ^ i4;
                        i = ((iM3169 ^ i5) * (-11845)) ^ (-194375838);
                        i2 = -932285067;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -595999147:
                case 1989773251:
                    f3 = this.f20004;
                    f4 = y2 - f3;
                    f5 = x * x;
                    if (C2834.f9334 <= 0) {
                        iM3169 = (i5 - C0773.m3169("۟۬")) * 85;
                        i = ((iM3169 ^ i4) * 8993) ^ 516763781;
                        i2 = 1044330774;
                    } else {
                        iM3169 = C0773.m3169("ܿۙ") ^ i5;
                        i = ((iM3169 ^ i4) * (-7707)) ^ 1701209850;
                        i2 = -1384353195;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -550272388:
                case 69909649:
                    C3779.m12264();
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0619.m2761("ܶ֡") ^ i4;
                        i = ((iM3169 ^ i5) * 20579) ^ 1211651303;
                        i2 = -1949207850;
                    } else {
                        iM3169 = C0619.m2761("ܳ᩵") ^ i4;
                        i = ((iM3169 ^ i5) * 3479) ^ (-1196658821);
                        i2 = 764945057;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -305406968:
                case 651011386:
                    y = motionEvent.getY();
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0773.m3169("ܰᩴ") ^ i5) * (-125);
                        i = ((iM3169 ^ i4) * 11497) ^ 314694936;
                        i2 = 307330076;
                    } else {
                        iM3169 = (i5 - C0619.m2761("ܽۛ")) * q.h;
                        i = ((iM3169 ^ i4) * (-21735)) ^ 1901162353;
                        i2 = 169650239;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case -291760381:
                case 2115776256:
                    return z2;
                case -184901142:
                case 1192114833:
                    this.f20010 = motionEvent.getX();
                    if (C2878.m9491() <= 0) {
                        iM3169 = C0619.m2761("ۖ۫") ^ i4;
                        i = ((iM3169 ^ i5) * (-14647)) ^ (-435709498);
                        i2 = -1536208258;
                    } else {
                        iM3169 = C0773.m3169("ۗ᩷") ^ i4;
                        i = ((iM3169 ^ i5) * (-21637)) ^ (-1571117060);
                        i2 = -830146788;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case 48960903:
                case 673998038:
                    f2 = this.f20004;
                    if (C0773.m3161() != 0) {
                        iM3169 = C0619.m2761("ۖ۫") ^ i4;
                        i = ((iM3169 ^ i5) * (-14647)) ^ (-435709498);
                        i2 = -1536208258;
                    } else {
                        iM3169 = C0773.m3169("֡֡") ^ i5;
                        i = ((iM3169 ^ i4) * (-23561)) ^ (-1579858980);
                        i2 = -1434525393;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case 133693391:
                case 2015689579:
                    if (this.f20005) {
                        iM3169 = (C0773.m3169("֡᩶") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM3169 ^ i5) * (-4661)) ^ 1388289891;
                        i2 = 153118578;
                    } else {
                        iM3169 = C0773.m3169("ۨۛ") ^ i4;
                        i = ((iM3169 ^ i5) * (-11845)) ^ (-194375838);
                        i2 = -932285067;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case 240875250:
                case 1033627172:
                    C2485.m8357();
                    return false;
                case 252768253:
                case 392291733:
                    C23916.m53419();
                    if (C3077.f9998) {
                        iM3169 = C0773.m3169("ۢᩳ") ^ i5;
                        i = ((iM3169 ^ i4) * (-15119)) ^ 803458741;
                        i2 = 1129669063;
                    } else {
                        iM3169 = C0619.m2761("᩶۠") ^ i5;
                        i = ((iM3169 ^ i4) * 29961) ^ 208568397;
                        i2 = -1828580969;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case 263775487:
                case 1670916955:
                    C20932.m47848();
                    C20932.m47848();
                    iM3169 = (C0773.m3169("ܰᩴ") ^ i5) * (-125);
                    i = ((iM3169 ^ i4) * 11497) ^ 314694936;
                    i2 = 307330076;
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case 395541131:
                case 1261822662:
                    if (actionMasked != z) {
                        iM3169 = (C0773.m3169("᩺۬") + i4) * 11;
                        i = ((iM3169 ^ i5) * 18683) ^ 1141282560;
                        i2 = 1182082188;
                    } else {
                        iM3169 = (C0619.m2761("᩹ۚ") ^ i5) * 63;
                        i = ((iM3169 ^ i4) * (-13701)) ^ (-557325373);
                        i2 = -743436087;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case 539432224:
                case 910477601:
                    try {
                        zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
                        iM3169 = C0619.m2761("ܽۢ") ^ i4;
                        i = ((iM3169 ^ i5) * (-19169)) ^ 1079917167;
                        i2 = -1887588167;
                    } catch (Exception unused) {
                        iM3169 = (C0773.m3169("ۘ۬") + i4) * 61;
                        i = ((iM3169 ^ i5) * 13677) ^ (-1066168155);
                        i2 = -1218826159;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case 622749790:
                case 1828321534:
                    this.f20005 = z;
                    iM3169 = C0773.m3169("ۨۛ") ^ i4;
                    i = ((iM3169 ^ i5) * (-11845)) ^ (-194375838);
                    i2 = -932285067;
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case 911185933:
                case 1344541703:
                    if (c23073.m51988(this.f20010, this.f20004)) {
                        iM3169 = (i5 - C0619.m2761("ۗܶ")) * (-79);
                        i = ((iM3169 ^ i4) * 10351) ^ 554083699;
                        i2 = -582522781;
                    } else {
                        iM3169 = (C0773.m3169("۫ܶ") + i5) * 109;
                        i = ((iM3169 ^ i4) * (-21185)) ^ 1941542579;
                        i2 = 2029206229;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case 1572967972:
                case 1731521370:
                    return zOnInterceptTouchEvent;
                case 1720298737:
                case 1905772722:
                    if (C2702.f8586 > 0) {
                        iM3169 = C0619.m2761("ܳ᩵") ^ i4;
                        i = ((iM3169 ^ i5) * 3479) ^ (-1196658821);
                        i2 = 764945057;
                    } else {
                        iM3169 = C0619.m2761("᩶۠") ^ i5;
                        i = ((iM3169 ^ i4) * 29961) ^ 208568397;
                        i2 = -1828580969;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                case 1886959960:
                case 1961946153:
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0773.m3169("ܰᩴ") ^ i5) * (-125);
                        i = ((iM3169 ^ i4) * 11497) ^ 314694936;
                        i2 = 307330076;
                    } else {
                        iM3169 = C0773.m3169("ܿ᩷") ^ i5;
                        i = ((iM3169 ^ i4) * (-16223)) ^ (-347318185);
                        i2 = -801423818;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
                default:
                    RunnableC1848.m6360();
                    if (C13473.f42873 == 0) {
                        iM3169 = C0619.m2761("᩶۠") ^ i5;
                        i = ((iM3169 ^ i4) * 29961) ^ 208568397;
                        i2 = -1828580969;
                    } else {
                        iM3169 = (C0773.m3169("۠ܰ") ^ i5) * (-51);
                        i = ((iM3169 ^ i4) * (-647)) ^ 1207466457;
                        i2 = -1812471298;
                    }
                    i7 = iM3169 ^ i2;
                    i6 = i;
                    break;
            }
        }
    }

    @Override // l.C25227, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = -377035177;
        int i6 = AbstractC0116.f1064;
        int i7 = C3448.f11240;
        int iM2761 = (C0619.m2761("ۗۚ") + i7) * (-15);
        int i8 = ((iM2761 ^ i6) * (-24281)) ^ 1763992392;
        int i9 = -815453787;
        while (true) {
            i5 = ((((i5 ^ i6) * 22145) >> 31) & i8) ^ (iM2761 ^ i9);
            switch (i5) {
                case -2135637154:
                case -539787985:
                    if (C2702.m8876()) {
                        iM2761 = C0773.m3169("᩻ۗ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 11079) ^ 1445802897;
                        i9 = 447029657;
                    } else {
                        iM2761 = C0773.m3169("ܺۘ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 3765) ^ 789519178;
                        i9 = 721718516;
                    }
                    break;
                case -1479350463:
                case 1134200612:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0773.m3169("ܺۘ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 3765) ^ 789519178;
                        i9 = 721718516;
                    } else {
                        iM2761 = (i6 - C0773.m3169("۫ᩴ")) * 123;
                        i8 = ((iM2761 ^ i7) * (-17363)) ^ (-1792760984);
                        i9 = -2073592390;
                    }
                    break;
                case -1453401375:
                case 2096519822:
                    C3099.m10095();
                    if (!C3077.m10041()) {
                        iM2761 = C0773.m3169("ۢܿ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 7857) ^ 817560959;
                        i9 = 1781155543;
                    } else {
                        iM2761 = (C0619.m2761("ܽ۠") + i7) * (-59);
                        i8 = ((iM2761 ^ i6) * 4677) ^ (-2004898165);
                        i9 = 1854814816;
                    }
                    break;
                case -1426183809:
                case 1322398529:
                    if (C3099.f10023 <= 0) {
                        iM2761 = (C0619.m2761("ܽ۠") + i7) * (-59);
                        i8 = ((iM2761 ^ i6) * 4677) ^ (-2004898165);
                        i9 = 1854814816;
                    } else {
                        iM2761 = (C0773.m3169("ۛܿ") + i6) * (-93);
                        i8 = ((iM2761 ^ i7) * (-24983)) ^ 839361523;
                        i9 = -1007191132;
                    }
                    break;
                case -1396426916:
                case 1560629399:
                    if (C2023.f6737) {
                        iM2761 = C0619.m2761("ۧ֨") ^ i7;
                        i8 = ((iM2761 ^ i6) * 15251) ^ 861827598;
                        i9 = 1092074982;
                    } else {
                        iM2761 = C0773.m3169("᩵᩶") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-14135)) ^ (-828150803);
                        i9 = -1499938490;
                    }
                    break;
                case -1170733977:
                case 309678744:
                    if (C2702.f8586 <= 0) {
                        iM2761 = C0619.m2761("ۧ֨") ^ i7;
                        i8 = ((iM2761 ^ i6) * 15251) ^ 861827598;
                        i9 = 1092074982;
                    } else {
                        iM2761 = C0773.m3169("ۢܿ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 7857) ^ 817560959;
                        i9 = 1781155543;
                    }
                    break;
                case -853108241:
                case 844543965:
                    try {
                        super.onLayout(z, i, i2, i3, i4);
                        break;
                    } catch (Exception unused) {
                    }
                    iM2761 = C0773.m3169("ۢ֫") ^ i6;
                    i8 = ((iM2761 ^ i7) * 29365) ^ 532976669;
                    i9 = 374547583;
                    break;
                case -449586872:
                case 790271894:
                    if (AbstractC0641.f2496 < 0) {
                        iM2761 = (C0773.m3169("ۜۘ") ^ i7) * (-79);
                        i8 = ((iM2761 ^ i6) * (-5443)) ^ 1204715665;
                        i9 = 1127063842;
                    } else {
                        iM2761 = (C0619.m2761("ܽ۠") + i7) * (-59);
                        i8 = ((iM2761 ^ i6) * 4677) ^ (-2004898165);
                        i9 = 1854814816;
                    }
                    break;
                case -219175293:
                case 415593240:
                    if (C1826.f6190 <= 0) {
                        iM2761 = C0773.m3169("ܺۘ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 3765) ^ 789519178;
                        i9 = 721718516;
                    } else {
                        iM2761 = C0619.m2761("۟᩹") ^ i6;
                        i8 = ((iM2761 ^ i7) * 21173) ^ (-794220590);
                        i9 = -919041239;
                    }
                    break;
                case -209246498:
                case 1848928246:
                    C2023.m6964();
                    C4282.m13644();
                    iM2761 = (C0619.m2761("ܽ۠") + i7) * (-59);
                    i8 = ((iM2761 ^ i6) * 4677) ^ (-2004898165);
                    i9 = 1854814816;
                    break;
                case 56983624:
                case 2115458267:
                    if (RunnableC3646.m11813() != 0) {
                        iM2761 = C0773.m3169("ۢܿ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 7857) ^ 817560959;
                        i9 = 1781155543;
                    } else {
                        iM2761 = C0619.m2761("۫᩸") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-31215)) ^ (-687721993);
                        i9 = -1148128024;
                    }
                    break;
                case 285602744:
                case 307036874:
                    this.f20018 = 0;
                    break;
                case 381084821:
                case 2114950209:
                    if (C13473.f42873 != 0) {
                        iM2761 = C0619.m2761("ۧ֨") ^ i7;
                        i8 = ((iM2761 ^ i6) * 15251) ^ 861827598;
                        i9 = 1092074982;
                    } else {
                        iM2761 = C0619.m2761("ۖ۠") ^ i6;
                        i8 = ((iM2761 ^ i7) * 29513) ^ (-526491615);
                        i9 = -607298983;
                    }
                    break;
                case 764555029:
                case 1985764242:
                    if (C2354.f7599 >= 0) {
                        iM2761 = (C0773.m3169("ۜۘ") ^ i7) * (-79);
                        i8 = ((iM2761 ^ i6) * (-5443)) ^ 1204715665;
                        i9 = 1127063842;
                    } else {
                        iM2761 = (i7 - C0619.m2761("ܿۜ")) * 27;
                        i8 = ((iM2761 ^ i6) * (-29745)) ^ 1051234453;
                        i9 = 27389714;
                    }
                    break;
                case 845173692:
                case 1984762602:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0773.m3169("ܺۘ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 3765) ^ 789519178;
                        i9 = 721718516;
                    } else {
                        iM2761 = C0619.m2761("ۢ۬") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-18431)) ^ 332884439;
                        i9 = 1916959332;
                    }
                    break;
                case 1406777507:
                case 1675137587:
                    if (C0269.f1558 <= 0) {
                        iM2761 = (C0619.m2761("ܽ۠") + i7) * (-59);
                        i8 = ((iM2761 ^ i6) * 4677) ^ (-2004898165);
                        i9 = 1854814816;
                    } else {
                        iM2761 = C0619.m2761("۬ۡ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-31127)) ^ 1800340177;
                        i9 = -1643875527;
                    }
                    break;
                default:
                    C4238.m13540();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x05e4 A[PHI: r1 r2 r12 r33 r37 r38 r42 r43
      0x05e4: PHI (r1v83 boolean) = (r1v60 boolean), (r1v62 boolean), (r1v85 boolean) binds: [B:134:0x05cd, B:124:0x0560, B:100:0x0405] A[DONT_GENERATE, DONT_INLINE]
      0x05e4: PHI (r2v48 boolean) = (r2v35 boolean), (r2v38 boolean), (r2v54 boolean) binds: [B:134:0x05cd, B:124:0x0560, B:100:0x0405] A[DONT_GENERATE, DONT_INLINE]
      0x05e4: PHI (r12v4 float) = (r12v3 float), (r12v2 float), (r12v2 float) binds: [B:134:0x05cd, B:124:0x0560, B:100:0x0405] A[DONT_GENERATE, DONT_INLINE]
      0x05e4: PHI (r33v4 float) = (r33v3 float), (r33v2 float), (r33v2 float) binds: [B:134:0x05cd, B:124:0x0560, B:100:0x0405] A[DONT_GENERATE, DONT_INLINE]
      0x05e4: PHI (r37v44 int) = (r37v31 int), (r37v33 int), (r37v45 int) binds: [B:134:0x05cd, B:124:0x0560, B:100:0x0405] A[DONT_GENERATE, DONT_INLINE]
      0x05e4: PHI (r38v41 int) = (r38v30 int), (r38v32 int), (r38v42 int) binds: [B:134:0x05cd, B:124:0x0560, B:100:0x0405] A[DONT_GENERATE, DONT_INLINE]
      0x05e4: PHI (r42v39 float) = (r42v29 float), (r42v31 float), (r42v40 float) binds: [B:134:0x05cd, B:124:0x0560, B:100:0x0405] A[DONT_GENERATE, DONT_INLINE]
      0x05e4: PHI (r43v46 int) = (r43v31 int), (r43v33 int), (r43v49 int) binds: [B:134:0x05cd, B:124:0x0560, B:100:0x0405] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:186:0x0913 A[PHI: r2 r3 r4 r5 r24 r28 r31 r37 r38 r42 r43
      0x0913: PHI (r2v25 boolean) = (r2v5 boolean), (r2v6 boolean), (r2v26 boolean) binds: [B:184:0x08fc, B:179:0x08c6, B:5:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x0913: PHI (r3v19 int) = (r3v5 int), (r3v6 int), (r3v20 int) binds: [B:184:0x08fc, B:179:0x08c6, B:5:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x0913: PHI (r4v29 int) = (r4v12 int), (r4v13 int), (r4v30 int) binds: [B:184:0x08fc, B:179:0x08c6, B:5:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x0913: PHI (r5v20 int) = (r5v5 int), (r5v6 int), (r5v21 int) binds: [B:184:0x08fc, B:179:0x08c6, B:5:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x0913: PHI (r24v21 boolean) = (r24v3 boolean), (r24v4 boolean), (r24v22 boolean) binds: [B:184:0x08fc, B:179:0x08c6, B:5:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x0913: PHI (r28v20 int) = (r28v5 int), (r28v6 int), (r28v21 int) binds: [B:184:0x08fc, B:179:0x08c6, B:5:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x0913: PHI (r31v20 float) = (r31v5 float), (r31v6 float), (r31v21 float) binds: [B:184:0x08fc, B:179:0x08c6, B:5:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x0913: PHI (r37v21 int) = (r37v5 int), (r37v6 int), (r37v22 int) binds: [B:184:0x08fc, B:179:0x08c6, B:5:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x0913: PHI (r38v20 int) = (r38v4 int), (r38v5 int), (r38v21 int) binds: [B:184:0x08fc, B:179:0x08c6, B:5:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x0913: PHI (r42v19 float) = (r42v4 float), (r42v5 float), (r42v20 float) binds: [B:184:0x08fc, B:179:0x08c6, B:5:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x0913: PHI (r43v21 int) = (r43v5 int), (r43v6 int), (r43v22 int) binds: [B:184:0x08fc, B:179:0x08c6, B:5:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x010c  */
    /* JADX WARN: Code duplicated, block: B:45:0x01b1 A[PHI: r5 r8 r11 r14
      0x01b1: PHI (r5v34 float) = (r5v32 float), (r5v2 float), (r5v2 float), (r5v2 float), (r5v2 float) binds: [B:44:0x01af, B:27:0x0135, B:23:0x0126, B:249:0x01b1, B:7:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x01b1: PHI (r8v4 float) = (r8v3 float), (r8v2 float), (r8v2 float), (r8v2 float), (r8v2 float) binds: [B:44:0x01af, B:27:0x0135, B:23:0x0126, B:249:0x01b1, B:7:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x01b1: PHI (r11v4 float) = (r11v3 float), (r11v2 float), (r11v2 float), (r11v2 float), (r11v2 float) binds: [B:44:0x01af, B:27:0x0135, B:23:0x0126, B:249:0x01b1, B:7:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x01b1: PHI (r14v4 l.᩸᩷ܺ) = (r14v3 l.᩸᩷ܺ), (r14v2 l.᩸᩷ܺ), (r14v2 l.᩸᩷ܺ), (r14v2 l.᩸᩷ܺ), (r14v2 l.᩸᩷ܺ) binds: [B:44:0x01af, B:27:0x0135, B:23:0x0126, B:249:0x01b1, B:7:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0126, code lost:
    
        if (l.C2023.m6964() > 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0135, code lost:
    
        if (l.C1343.f4799 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0137, code lost:
    
        r42 = r2;
        r2 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0142, code lost:
    
        if (l.C2834.f9334 <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x015d, code lost:
    
        if (l.C11235.f35427 >= 0) goto L37;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r48) {
        /*
            Method dump skipped, instruction units count: 2760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5817.dispatchDraw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:108:0x03dc A[PHI: r29
      0x03dc: PHI (r29v35 float) = (r29v30 float), (r29v3 float) binds: [B:107:0x03da, B:35:0x011e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:149:0x05bd A[PHI: r24 r28
      0x05bd: PHI (r24v7 float) = (r24v2 float), (r24v2 float), (r24v4 float), (r24v2 float), (r24v2 float), (r24v2 float) binds: [B:147:0x05a4, B:141:0x057b, B:131:0x04fc, B:117:0x044c, B:111:0x0409, B:94:0x037b] A[DONT_GENERATE, DONT_INLINE]
      0x05bd: PHI (r28v24 float) = (r28v6 float), (r28v7 float), (r28v10 float), (r28v13 float), (r28v17 float), (r28v25 float) binds: [B:147:0x05a4, B:141:0x057b, B:131:0x04fc, B:117:0x044c, B:111:0x0409, B:94:0x037b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:33:0x0106  */
    /* JADX WARN: Code duplicated, block: B:38:0x0124  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c6 A[PHI: r2 r22
      0x01c6: PHI (r2v4 float) = (r2v2 float), (r2v3 float), (r2v2 float), (r2v2 float) binds: [B:50:0x0196, B:54:0x01c4, B:25:0x00f4, B:21:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r22v5 float) = (r22v3 float), (r22v2 float), (r22v2 float), (r22v2 float) binds: [B:50:0x0196, B:54:0x01c4, B:25:0x00f4, B:21:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0315 A[PHI: r11 r14 r15 r19 r20
      0x0315: PHI (r11v4 float) = (r11v2 float), (r11v3 float), (r11v2 float), (r11v2 float), (r11v2 float) binds: [B:65:0x0236, B:85:0x0313, B:73:0x028d, B:28:0x00f9, B:13:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x0315: PHI (r14v4 float) = (r14v2 float), (r14v2 float), (r14v3 float), (r14v2 float), (r14v2 float) binds: [B:65:0x0236, B:85:0x0313, B:73:0x028d, B:28:0x00f9, B:13:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x0315: PHI (r15v4 float) = (r15v2 float), (r15v2 float), (r15v3 float), (r15v2 float), (r15v2 float) binds: [B:65:0x0236, B:85:0x0313, B:73:0x028d, B:28:0x00f9, B:13:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x0315: PHI (r19v4 float) = (r19v3 float), (r19v2 float), (r19v2 float), (r19v2 float), (r19v2 float) binds: [B:65:0x0236, B:85:0x0313, B:73:0x028d, B:28:0x00f9, B:13:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x0315: PHI (r20v5 int) = (r20v3 int), (r20v2 int), (r20v2 int), (r20v2 int), (r20v2 int) binds: [B:65:0x0236, B:85:0x0313, B:73:0x028d, B:28:0x00f9, B:13:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0090, code lost:
    
        if (l.C11235.m28309() == 0) goto L23;
     */
    @Override // l.C25227, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instruction units count: 2004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5817.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m16968() {
        return this.f20011;
    }
}
