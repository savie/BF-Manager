package l;

import android.os.AsyncTask;
import android.os.PowerManager;
import bin.mt.plus.R;
import com.google.android.material.slider.BaseSlider;
import java.util.concurrent.Executor;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۖۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4WQ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2432 {

    /* JADX INFO: renamed from: ۫᩷ۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f7776 = {9900, -24324, 24372, -22872, 6442, 22271, -17946, 21596};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Executor f7777 = AsyncTask.THREAD_POOL_EXECUTOR;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC8585 f7778;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f7779;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C13511 f7780;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C9889 f7781;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo1134();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo1135(Exception exc);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean mo8198() {
        return false;
    }

    /* JADX INFO: renamed from: ᩴ */
    public abstract void mo1136();

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo1137();

    /* JADX INFO: renamed from: ᩸ */
    public abstract void mo1138();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8191(AbstractActivityC17204 abstractActivityC17204, int i) {
        int i2 = -569542733;
        int i3 = C3734.f12817;
        int i4 = C3492.f12043;
        int iM2761 = C0619.m2761("֡ܽ") ^ i3;
        int i5 = ((iM2761 ^ i4) * 32237) ^ (-1499878503);
        int i6 = 1482197904;
        while (true) {
            i2 = ((((i2 ^ i4) * 11887) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -1909015044:
                case -1540597014:
                    C2419.m8174();
                    if (C2310.f7472 < 0) {
                        iM2761 = C0773.m3169("ۢ᩶") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-19043)) ^ (-1495910941);
                        i6 = 1712795690;
                    } else {
                        iM2761 = (C0773.m3169("ۙۘ") ^ i3) * 71;
                        i5 = ((iM2761 ^ i4) * (-14021)) ^ (-1563981558);
                        i6 = -1525407448;
                    }
                    break;
                case -1400104319:
                case 1114639651:
                    if (RunnableC1848.f6235) {
                        iM2761 = (C0619.m2761("ۛܳ") + i4) * (-111);
                        i5 = ((iM2761 ^ i3) * (-30249)) ^ 189845518;
                        i6 = -207709445;
                    } else {
                        iM2761 = C0619.m2761("ܶ᩶") ^ i3;
                        i5 = ((iM2761 ^ i4) * 20541) ^ 785690907;
                        i6 = -1582352992;
                    }
                    break;
                case -1136942977:
                case -753115239:
                    if (C3734.m12152() >= 0) {
                        iM2761 = (C0619.m2761("ۛܳ") + i4) * (-111);
                        i5 = ((iM2761 ^ i3) * (-30249)) ^ 189845518;
                        i6 = -207709445;
                    } else {
                        iM2761 = C0773.m3169("ᩳ᩷") ^ i4;
                        i5 = ((iM2761 ^ i3) * 31601) ^ (-1482996838);
                        i6 = -1063854687;
                    }
                    break;
                case -927474734:
                case 720744582:
                    if (C2878.f9462) {
                        iM2761 = C0619.m2761("ܳ۟") ^ i3;
                        i5 = ((iM2761 ^ i4) * 16497) ^ 1109083296;
                        i6 = -771053898;
                    } else {
                        iM2761 = C0619.m2761("ۖᩴ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 12365) ^ (-1601451740);
                        i6 = -1597868153;
                    }
                    break;
                case -920491824:
                case -850857835:
                    if (C3033.m9845() <= 0) {
                        iM2761 = (C0619.m2761("ۛܳ") + i4) * (-111);
                        i5 = ((iM2761 ^ i3) * (-30249)) ^ 189845518;
                        i6 = -207709445;
                    } else {
                        iM2761 = (C0773.m3169("᩻᩶") + i4) * (-119);
                        i5 = ((iM2761 ^ i3) * 18233) ^ (-1382507775);
                        i6 = 2120540310;
                    }
                    break;
                case -842380278:
                case 1341293790:
                    if (C3690.f12684 <= 0) {
                        iM2761 = (C0619.m2761("ۛܳ") + i4) * (-111);
                        i5 = ((iM2761 ^ i3) * (-30249)) ^ 189845518;
                        i6 = -207709445;
                    } else {
                        iM2761 = (C0773.m3169("᩹۬") ^ i4) * (-97);
                        i5 = ((iM2761 ^ i3) * 10243) ^ (-667093313);
                        i6 = -1016624025;
                    }
                    break;
                case -748482804:
                case -345551806:
                    if (C1321.m4852()) {
                        iM2761 = (C0619.m2761("ۧ֨") + i4) * 95;
                        i5 = ((iM2761 ^ i3) * (-15785)) ^ (-173804460);
                        i6 = -2128872696;
                    } else {
                        iM2761 = C0773.m3169("ۢ᩶") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-19043)) ^ (-1495910941);
                        i6 = 1712795690;
                    }
                    break;
                case -646281833:
                case 1031538651:
                    RunnableC0334.m2063();
                    iM2761 = C0619.m2761("ܳ۟") ^ i3;
                    i5 = ((iM2761 ^ i4) * 16497) ^ 1109083296;
                    i6 = -771053898;
                    break;
                case -372353954:
                case 1815201331:
                    if (C3448.m11248() == 0) {
                        C13511 c13511 = new C13511(abstractActivityC17204, i);
                        C4282.m13648(c13511);
                        this.f7780 = c13511;
                    }
                    iM2761 = (C0619.m2761("ۛܳ") + i4) * (-111);
                    i5 = ((iM2761 ^ i3) * (-30249)) ^ 189845518;
                    i6 = -207709445;
                    break;
                case -228450270:
                case 1998249945:
                    C20932.m47848();
                    if (C0487.m2356() >= 0) {
                        iM2761 = (C0773.m3169("ۤ᩵") + i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM2761 ^ i3) * (-1301)) ^ (-991358075);
                        i6 = -111551947;
                    } else {
                        iM2761 = C0619.m2761("ܳ۟") ^ i3;
                        i5 = ((iM2761 ^ i4) * 16497) ^ 1109083296;
                        i6 = -771053898;
                    }
                    break;
                case -217640633:
                case 1948411184:
                    C2354.m7983();
                    if (C3448.m11248() == 0) {
                        iM2761 = (C0773.m3169("ۙۘ") ^ i3) * 71;
                        i5 = ((iM2761 ^ i4) * (-14021)) ^ (-1563981558);
                        i6 = -1525407448;
                    } else {
                        iM2761 = (C0773.m3169("ۤ᩵") + i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM2761 ^ i3) * (-1301)) ^ (-991358075);
                        i6 = -111551947;
                    }
                    break;
                case -168077662:
                case 936074407:
                    if (C3033.m9845() <= 0) {
                        iM2761 = C0773.m3169("ۢ᩶") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-19043)) ^ (-1495910941);
                        i6 = 1712795690;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ܳ᩺")) * 65;
                        i5 = ((iM2761 ^ i3) * (-20491)) ^ 1061076739;
                        i6 = 1588391804;
                    }
                    break;
                case 902977376:
                case 1140238226:
                    if (C3448.m11248() != 0) {
                        iM2761 = (C0773.m3169("ۙۘ") ^ i3) * 71;
                        i5 = ((iM2761 ^ i4) * (-14021)) ^ (-1563981558);
                        i6 = -1525407448;
                    } else {
                        iM2761 = C0619.m2761("ᩳۤ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 28251) ^ 1152472382;
                        i6 = 1625858762;
                    }
                    break;
                case 1039491103:
                case 1192922627:
                    RunnableC0334.m2063();
                    AbstractC3624.m11755();
                    break;
                default:
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0773.m3169("ۙۘ") ^ i3) * 71;
                        i5 = ((iM2761 ^ i4) * (-14021)) ^ (-1563981558);
                        i6 = -1525407448;
                    } else {
                        iM2761 = C0619.m2761("᩶ܺ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-13137)) ^ (-227925462);
                        i6 = 1175431844;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.۠ۧۙ, l.ۢۙܺ, l.۬֨ᩴ] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m8196() {
        boolean z = false;
        AbstractC8585 abstractC8585 = null;
        ?? r2 = 0;
        C13511 c13511 = null;
        int i = 275075236;
        int i2 = C2419.f7754;
        int i3 = C2310.f7472;
        int iM2761 = (i2 - C0619.m2761("ᩴ֫")) * (-39);
        int i4 = ((iM2761 ^ i3) * 7201) ^ 1513452170;
        int i5 = 1211131898;
        while (true) {
            i = ((((i ^ i3) * (-16157)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2143187954:
                case -1046372487:
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0773.m3169("ۨ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 13883) ^ (-1368834710);
                        i5 = -1135857530;
                    } else {
                        iM2761 = (C0619.m2761("᩷ۨ") + i2) * (-23);
                        i4 = ((iM2761 ^ i3) * (-12337)) ^ 1305903261;
                        i5 = -30007217;
                    }
                    break;
                case -2126699101:
                case 1952922581:
                    this.f7779 = z;
                    if (C1321.m4852()) {
                        iM2761 = (C0773.m3169("ۜ۟") + i2) * 17;
                        i4 = ((iM2761 ^ i3) * (-25397)) ^ 1982074407;
                        i5 = 1476489487;
                    } else {
                        iM2761 = C0619.m2761("ܶ᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * 10591) ^ (-462252039);
                        i5 = 1881439654;
                    }
                    break;
                case -2003933953:
                case -606683450:
                    this.f7778 = r2;
                    this.f7781 = r2;
                    iM2761 = (C0773.m3169("۫ۖ") ^ i3) * (-115);
                    i4 = ((iM2761 ^ i2) * (-17805)) ^ (-1849230364);
                    i5 = -473196894;
                    break;
                case -1806584248:
                case -1129962947:
                    C2287.m7745();
                    if (C0269.f1558 > 0) {
                        iM2761 = C0773.m3169("ۨ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 13883) ^ (-1368834710);
                        i5 = -1135857530;
                    } else {
                        iM2761 = (C0619.m2761("֡ۘ") + i3) * 83;
                        i4 = ((iM2761 ^ i2) * 26145) ^ (-37636884);
                        i5 = 1426097853;
                    }
                    break;
                case -1620284770:
                case 1020779518:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0773.m3169("ۨ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 13883) ^ (-1368834710);
                        i5 = -1135857530;
                    } else {
                        iM2761 = C0773.m3169("ۤ۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * 11067) ^ (-2106483561);
                        i5 = -1692793922;
                    }
                    break;
                case -1563887659:
                case 2103255439:
                    break;
                case -1508471557:
                case 1377539531:
                    C2702.m8876();
                    if (C2966.f9654 < 0) {
                        iM2761 = C0619.m2761("ܺ᩸") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7385) ^ 2001689147;
                        i5 = 1448108914;
                    } else {
                        iM2761 = C0773.m3169("ۨ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 13883) ^ (-1368834710);
                        i5 = -1135857530;
                    }
                    break;
                case -924898205:
                case 1425470433:
                    if (RunnableC0334.m2063()) {
                        iM2761 = C0619.m2761("ܺ᩸") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7385) ^ 2001689147;
                        i5 = 1448108914;
                    } else {
                        iM2761 = (C0773.m3169("ۢ᩷") ^ i2) * 65;
                        i4 = ((iM2761 ^ i3) * (-239)) ^ (-959097464);
                        i5 = 1333160398;
                    }
                    break;
                case -795792360:
                case -567846778:
                    if (C11235.f35427 < 0) {
                        iM2761 = (C0619.m2761("֡ۘ") + i3) * 83;
                        i4 = ((iM2761 ^ i2) * 26145) ^ (-37636884);
                        i5 = 1426097853;
                    } else {
                        iM2761 = C0773.m3169("ۤ۫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 21925) ^ (-1710826415);
                        i5 = 1113809302;
                    }
                    break;
                case -774481643:
                case 876292815:
                    C2287.m7745();
                    C1343.m4943();
                    iM2761 = (C0619.m2761("֡ۘ") + i3) * 83;
                    i4 = ((iM2761 ^ i2) * 26145) ^ (-37636884);
                    i5 = 1426097853;
                    break;
                case -382423087:
                case 693215743:
                    if (AbstractC3624.m11755() != 0) {
                        iM2761 = C0619.m2761("ܺ᩸") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7385) ^ 2001689147;
                        i5 = 1448108914;
                    } else {
                        iM2761 = C0773.m3169("᩶᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-19289)) ^ (-785708960);
                        i5 = 1450232213;
                    }
                    break;
                case 107173195:
                case 193865695:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0619.m2761("ܺ᩸") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7385) ^ 2001689147;
                        i5 = 1448108914;
                    } else {
                        iM2761 = C0773.m3169("᩷ܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-25739)) ^ (-2062511042);
                        i5 = -595457548;
                    }
                    break;
                case 618808136:
                case 1486118796:
                    c13511 = this.f7780;
                    if (c13511 != null) {
                        iM2761 = (i2 - C0773.m3169("ܰܳ")) * 123;
                        i4 = ((iM2761 ^ i3) * (-30593)) ^ (-931866910);
                        i5 = -874184378;
                    } else {
                        iM2761 = C0619.m2761("ۡۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-24985)) ^ (-1534702558);
                        i5 = -1418725683;
                    }
                    break;
                case 661979053:
                case 1824353435:
                    C2310.m7813();
                    C2966.m9664();
                    break;
                case 1120233500:
                case 1533256599:
                    if (C11235.m28309() != 0) {
                        iM2761 = C0773.m3169("ۨ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 13883) ^ (-1368834710);
                        i5 = -1135857530;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۡܿ")) * (-61);
                        i4 = ((iM2761 ^ i2) * (-12237)) ^ (-1132900543);
                        i5 = -896528849;
                    }
                    break;
                case 1208163538:
                case 2121443417:
                    abstractC8585 = this.f7778;
                    r2 = 0;
                    r2 = 0;
                    if (abstractC8585 != null) {
                        iM2761 = (C0619.m2761("۫᩷") + i3) * (-25);
                        i4 = ((iM2761 ^ i2) * 30939) ^ 1161992799;
                        i5 = 1820362376;
                    } else {
                        iM2761 = (C0773.m3169("۫ۖ") ^ i3) * (-115);
                        i4 = ((iM2761 ^ i2) * (-17805)) ^ (-1849230364);
                        i5 = -473196894;
                    }
                    break;
                case 1298874629:
                case 1526626459:
                    C1564.m5521(c13511);
                    this.f7780 = r2;
                    iM2761 = C0619.m2761("ۡۜ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-24985)) ^ (-1534702558);
                    i5 = -1418725683;
                    break;
                case 1447892583:
                case 2038815691:
                    abstractC8585.mo23078(this.f7781);
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0619.m2761("ܺ᩸") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7385) ^ 2001689147;
                        i5 = 1448108914;
                    } else {
                        iM2761 = C0619.m2761("ᩴ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 29881) ^ 1202882736;
                        i5 = 16444407;
                    }
                    break;
                case 1902802537:
                case 2114922785:
                    z = false;
                    if (C2288.m7767()) {
                        iM2761 = C0619.m2761("ܶ᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * 10591) ^ (-462252039);
                        i5 = 1881439654;
                    } else {
                        iM2761 = (C0619.m2761("ۘۨ") ^ i3) * 51;
                        i4 = ((iM2761 ^ i2) * 24803) ^ (-1653813385);
                        i5 = -1434702912;
                    }
                    break;
                default:
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0619.m2761("ܶ᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * 10591) ^ (-462252039);
                        i5 = 1881439654;
                    } else {
                        iM2761 = C0619.m2761("ۡ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4311)) ^ 2007092823;
                        i5 = 155860675;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m8197() {
        Exception exc;
        int iM3169;
        int i;
        int i2;
        Runnable runnable;
        Exception exc2;
        int iM2761;
        int i3;
        int i4;
        int iM31610;
        int i5;
        int i6;
        final AbstractC2432 abstractC2432 = this;
        int i7 = C1564.f5401;
        int i8 = C0950.f3488;
        int iM2762 = C0619.m2761("֨ۙ") ^ i7;
        int i9 = ((iM2762 ^ i8) * (-3103)) ^ (-295955078);
        StackTraceElement[] stackTrace = null;
        int i10 = iM2762 ^ (-745183660);
        Runnable runnable2 = null;
        Thread thread = null;
        StringBuilder sb = null;
        int length = 0;
        char c = 0;
        int length2 = 0;
        char c2 = 0;
        int i11 = -1429413219;
        Exception exc3 = null;
        Throwable th = null;
        RuntimeException runtimeException = null;
        Throwable th2 = null;
        boolean zMo8198 = false;
        while (true) {
            i11 = i10 ^ (i9 & (((i11 ^ i8) * 28919) >> 31));
            switch (i11) {
                case -2143611187:
                case -772909909:
                    C0773.m3161();
                    RunnableC1848.m6360();
                    return;
                case -2075029353:
                case 1025245653:
                    length2 = stackTrace.length;
                    iM3169 = C0619.m2761("ᩴۤ") ^ i7;
                    i = ((iM3169 ^ i8) * 22145) ^ 972456463;
                    i2 = 2086568119;
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -2028877354:
                case -1384934984:
                    mo1138();
                    return;
                case -1899283015:
                case 1566016028:
                    RunnableC3646.m11798(sb, stackTrace[c]);
                    iM3169 = C0619.m2761("ܳۗ") ^ i7;
                    i = ((iM3169 ^ i8) * 13823) ^ 1639428391;
                    i2 = -20539616;
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -1823930905:
                case 1181241792:
                    exc = exc3;
                    if (C4238.m13540() > 0 && C1343.m4943()) {
                        if (C3033.f9831 < 0) {
                            if (C2878.f9462) {
                                iM2761 = C0619.m2761("᩷ᩳ") ^ i8;
                                i3 = ((iM2761 ^ i7) * (-16773)) ^ 1334356280;
                                i4 = -821932434;
                            } else if (C23916.f77426 > 0) {
                                if (RunnableC3055.f9898 < 0) {
                                    if (RunnableC3055.f9898 >= 0) {
                                        iM2761 = (i8 - C0773.m3169("֡ۢ")) * 43;
                                        i3 = ((iM2761 ^ i7) * (-13357)) ^ (-1821749711);
                                        i4 = 1548540596;
                                    } else if (C2834.f9334 > 0) {
                                        if (C20932.m47848() != 0) {
                                            iM2761 = (C0773.m3169("ۖ۫") ^ i8) * (-79);
                                            i3 = ((iM2761 ^ i7) * 28063) ^ 826839488;
                                            i4 = -2008192126;
                                        } else if (C2288.f7433 > 0) {
                                            runnable2 = new Runnable() { // from class: l.֡ۙܺ
                                                /* JADX WARN: Code duplicated, block: B:23:0x0078  */
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    final AbstractC2432 abstractC2433 = this.f1315;
                                                    abstractC2433.getClass();
                                                    PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) C21576.m49084().getSystemService("power")).newWakeLock(1, C21576.m49092().concat(":AsyncTask"));
                                                    wakeLockNewWakeLock.acquire();
                                                    try {
                                                        try {
                                                            abstractC2433.mo1136();
                                                            if (wakeLockNewWakeLock.isHeld()) {
                                                                wakeLockNewWakeLock.release();
                                                            }
                                                            C21576.m49068(new Runnable() { // from class: l.۟ۙܺ
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    AbstractC2432 abstractC2434 = abstractC2433;
                                                                    abstractC2434.getClass();
                                                                    try {
                                                                        try {
                                                                            abstractC2434.mo1134();
                                                                            abstractC2434.mo1138();
                                                                        } catch (Throwable th3) {
                                                                            abstractC2434.mo1138();
                                                                            throw th3;
                                                                        }
                                                                    } catch (Exception e) {
                                                                        abstractC2434.mo1135(e);
                                                                        abstractC2434.mo1138();
                                                                    } catch (OutOfMemoryError e2) {
                                                                        abstractC2434.mo1135(new Exception(C21576.m49088(R.string.MT_Protector), e2));
                                                                        abstractC2434.mo1138();
                                                                    } catch (Throwable th4) {
                                                                        abstractC2434.mo1135(new Exception(th4));
                                                                        abstractC2434.mo1138();
                                                                    }
                                                                }
                                                            });
                                                        } catch (Throwable th3) {
                                                            if (wakeLockNewWakeLock.isHeld()) {
                                                                wakeLockNewWakeLock.release();
                                                            }
                                                            throw th3;
                                                        }
                                                    } catch (Exception e) {
                                                        C21576.m49068(new Runnable() { // from class: l.ۡۙܺ
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                Exception exc4 = e;
                                                                AbstractC2432 abstractC2434 = abstractC2433;
                                                                abstractC2434.getClass();
                                                                try {
                                                                    abstractC2434.mo1135(exc4);
                                                                } finally {
                                                                    abstractC2434.mo1138();
                                                                }
                                                            }
                                                        });
                                                        if (wakeLockNewWakeLock.isHeld()) {
                                                            wakeLockNewWakeLock.release();
                                                        }
                                                    } catch (OutOfMemoryError e2) {
                                                        final Exception exc4 = new Exception(C21576.m49088(R.string.MT_Protector), e2);
                                                        C21576.m49068(new Runnable() { // from class: l.ۡۙܺ
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                Exception exc5 = exc4;
                                                                AbstractC2432 abstractC2434 = abstractC2433;
                                                                abstractC2434.getClass();
                                                                try {
                                                                    abstractC2434.mo1135(exc5);
                                                                } finally {
                                                                    abstractC2434.mo1138();
                                                                }
                                                            }
                                                        });
                                                        if (wakeLockNewWakeLock.isHeld()) {
                                                            wakeLockNewWakeLock.release();
                                                        }
                                                    } catch (Throwable th4) {
                                                        final Exception exc5 = new Exception(th4);
                                                        C21576.m49068(new Runnable() { // from class: l.ۡۙܺ
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                Exception exc6 = exc5;
                                                                AbstractC2432 abstractC2434 = abstractC2433;
                                                                abstractC2434.getClass();
                                                                try {
                                                                    abstractC2434.mo1135(exc6);
                                                                } finally {
                                                                    abstractC2434.mo1138();
                                                                }
                                                            }
                                                        });
                                                        if (wakeLockNewWakeLock.isHeld()) {
                                                            wakeLockNewWakeLock.release();
                                                        }
                                                    }
                                                }
                                            };
                                            int iM31611 = (C0773.m3169("᩶۠") ^ i7) * 79;
                                            i10 = iM31611 ^ 234900411;
                                            i9 = ((iM31611 ^ i8) * (-14631)) ^ (-639102555);
                                            exc3 = exc;
                                            abstractC2432 = this;
                                            break;
                                        }
                                    }
                                }
                                iM2761 = C0773.m3169("ۘᩴ") ^ i8;
                                i3 = ((iM2761 ^ i7) * (-15975)) ^ 504390549;
                                i4 = 709825430;
                            }
                            i10 = iM2761 ^ i4;
                            i9 = i3;
                            exc3 = exc;
                            runnable2 = null;
                            break;
                        }
                        iM2761 = C0619.m2761("ܶܽ") ^ i7;
                        i3 = ((iM2761 ^ i8) * 14331) ^ (-34089950);
                        i4 = 1265233168;
                        i10 = iM2761 ^ i4;
                        i9 = i3;
                        exc3 = exc;
                        runnable2 = null;
                        break;
                    }
                    iM2761 = (C0773.m3169("ᩴۛ") + i8) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i3 = ((iM2761 ^ i7) * 32733) ^ 1981026153;
                    i4 = 403145165;
                    i10 = iM2761 ^ i4;
                    i9 = i3;
                    exc3 = exc;
                    runnable2 = null;
                    break;
                case -1774654945:
                case 628607670:
                    mo1138();
                    return;
                case -1459473962:
                case 441337666:
                    Runnable runnable3 = runnable2;
                    Exception exc4 = exc3;
                    try {
                        mo1137();
                        int iM2763 = (i8 - C0619.m2761("ۙ۠")) * (-81);
                        exc3 = exc4;
                        runnable2 = runnable3;
                        i10 = iM2763 ^ 1829929643;
                        i9 = ((iM2763 ^ i7) * 18125) ^ (-1543925025);
                    } catch (Exception e) {
                        int iM31612 = (C0773.m3169("᩺ᩳ") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        exc3 = e;
                        i9 = ((iM31612 ^ i8) * 28123) ^ 1775954965;
                        runnable2 = runnable3;
                        i10 = iM31612 ^ 171331585;
                    }
                    abstractC2432 = this;
                    break;
                case -1428318384:
                case 878994227:
                    C17202.m40368(abstractC2432.f7777, runnable2);
                    iM3169 = (C0773.m3169("֡ۜ") + i7) * 49;
                    i = ((iM3169 ^ i8) * (-20775)) ^ (-1931885165);
                    i2 = -1047326453;
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -1418244918:
                case -571523444:
                    runnable = runnable2;
                    exc2 = exc3;
                    try {
                        zMo8198 = mo8198();
                        iM31610 = (C0773.m3169("֡᩹") + i8) * 81;
                        i5 = ((iM31610 ^ i7) * 6055) ^ (-254874283);
                        i6 = -830980148;
                    } catch (RuntimeException e2) {
                        runtimeException = e2;
                        iM31610 = C0773.m3169("۟᩻") ^ i8;
                        i5 = ((iM31610 ^ i7) * (-5067)) ^ 524728523;
                        i6 = -1950826954;
                    }
                    int i12 = iM31610 ^ i6;
                    exc3 = exc2;
                    Runnable runnable4 = runnable;
                    i10 = i12;
                    i9 = i5;
                    runnable2 = runnable4;
                    break;
                case -1230505819:
                case -643478524:
                    return;
                case -1117492442:
                case 259767672:
                    if (AbstractC3624.f12429 <= 0) {
                        exc = exc3;
                        iM2761 = C0619.m2761("ܶܽ") ^ i7;
                        i3 = ((iM2761 ^ i8) * 14331) ^ (-34089950);
                        i4 = 1265233168;
                        i10 = iM2761 ^ i4;
                        i9 = i3;
                        exc3 = exc;
                        runnable2 = null;
                    } else {
                        iM3169 = C0773.m3169("۫ᩳ") ^ i8;
                        i = ((iM3169 ^ i7) * (-5465)) ^ (-1541096831);
                        i2 = -661880778;
                        i10 = iM3169 ^ i2;
                        i9 = i;
                    }
                    break;
                case -1046377944:
                case 1581711093:
                    exc2 = exc3;
                    try {
                        abstractC2432.mo1135(exc2);
                        iM31610 = (i8 - C0773.m3169("᩻۠")) * 47;
                        runnable = runnable2;
                        i5 = ((iM31610 ^ i7) * (-6895)) ^ (-899305389);
                        i6 = 1448112886;
                        int i13 = iM31610 ^ i6;
                        exc3 = exc2;
                        Runnable runnable5 = runnable;
                        i10 = i13;
                        i9 = i5;
                        runnable2 = runnable5;
                    } catch (Throwable th3) {
                        Runnable runnable6 = runnable2;
                        int iM31613 = C0773.m3169("ۚۗ") ^ i8;
                        exc3 = exc2;
                        th2 = th3;
                        i9 = ((iM31613 ^ i7) * 13795) ^ 346331709;
                        i10 = iM31613 ^ (-1563585095);
                        runnable2 = runnable6;
                    }
                    break;
                case -935764245:
                case 1565127860:
                    try {
                        thread = new Thread(runnable2);
                        stackTrace = new Exception().getStackTrace();
                        try {
                            sb = new StringBuilder();
                            length = stackTrace.length;
                            iM3169 = (i8 - C0619.m2761("ۧ֨")) * 109;
                            i = ((iM3169 ^ i7) * 17671) ^ 1447945983;
                            i2 = 637710557;
                            i10 = iM3169 ^ i2;
                            i9 = i;
                        } catch (RuntimeException e3) {
                            runtimeException = e3;
                            runnable = runnable2;
                            exc2 = exc3;
                            sb = null;
                            iM31610 = C0773.m3169("۟᩻") ^ i8;
                            i5 = ((iM31610 ^ i7) * (-5067)) ^ 524728523;
                            i6 = -1950826954;
                            int i14 = iM31610 ^ i6;
                            exc3 = exc2;
                            Runnable runnable7 = runnable;
                            i10 = i14;
                            i9 = i5;
                            runnable2 = runnable7;
                        }
                    } catch (RuntimeException e4) {
                        runtimeException = e4;
                        runnable = runnable2;
                        exc2 = exc3;
                        thread = null;
                    }
                    break;
                case -927578949:
                case -836458134:
                    mo1138();
                    throw th;
                case -737288375:
                case 2066996722:
                    c = 1;
                    if (length > 1) {
                        iM3169 = (C0773.m3169("֡ۤ") ^ i8) * 3;
                        i = ((iM3169 ^ i7) * (-12203)) ^ (-344647533);
                        i2 = -1730745359;
                    } else {
                        iM3169 = C0619.m2761("ܳۗ") ^ i7;
                        i = ((iM3169 ^ i8) * 13823) ^ 1639428391;
                        i2 = -20539616;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -621053935:
                case 1709253404:
                    RunnableC3055.m9933();
                    exc = exc3;
                    iM2761 = (C0773.m3169("ۖ۫") ^ i8) * (-79);
                    i3 = ((iM2761 ^ i7) * 28063) ^ 826839488;
                    i4 = -2008192126;
                    i10 = iM2761 ^ i4;
                    i9 = i3;
                    exc3 = exc;
                    runnable2 = null;
                    break;
                case -552791830:
                case 1719172574:
                    return;
                case -385740308:
                case 1874184555:
                    if (C2310.f7472 < 0) {
                        iM3169 = C0773.m3169("᩷ۛ") ^ i7;
                        i = ((iM3169 ^ i8) * (-6457)) ^ (-553854160);
                        i2 = 527825387;
                    } else {
                        iM3169 = C0773.m3169("۫ᩳ") ^ i8;
                        i = ((iM3169 ^ i7) * (-5465)) ^ (-1541096831);
                        i2 = -661880778;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -322064275:
                case -190575900:
                    thread.setName(C1080.m4058(sb));
                    C2966.m9674(thread);
                    iM3169 = C0619.m2761("ܶۜ") ^ i7;
                    i = ((iM3169 ^ i8) * (-12719)) ^ (-581771011);
                    i2 = -1516628161;
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -286104190:
                case 947853485:
                    C1564.m5509();
                    if (C0269.f1558 <= 0) {
                        iM3169 = (i7 - C0773.m3169("ܿ֨")) * 15;
                        i = ((iM3169 ^ i8) * 28739) ^ 1048582109;
                        i2 = 1350880575;
                        i10 = iM3169 ^ i2;
                        i9 = i;
                    } else {
                        exc = exc3;
                        iM2761 = (C0773.m3169("ۖ۫") ^ i8) * (-79);
                        i3 = ((iM2761 ^ i7) * 28063) ^ 826839488;
                        i4 = -2008192126;
                        i10 = iM2761 ^ i4;
                        i9 = i3;
                        exc3 = exc;
                        runnable2 = null;
                    }
                    break;
                case -104922473:
                case 1479186078:
                    if (RunnableC1848.f6235) {
                        iM3169 = (i7 - C0773.m3169("ܿ֨")) * 15;
                        i = ((iM3169 ^ i8) * 28739) ^ 1048582109;
                        i2 = 1350880575;
                    } else {
                        iM3169 = C0619.m2761("ۧۢ") ^ i7;
                        i = ((iM3169 ^ i8) * 26249) ^ (-528259101);
                        i2 = 354612227;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case -12001485:
                case 904321192:
                    mo1138();
                    throw th2;
                case 65875286:
                case 1362994618:
                    try {
                        C1080.m4046(sb, ' ');
                        C1146.m4235(sb, stackTrace[c2]);
                        iM3169 = C0773.m3169("᩵ۖ") ^ i8;
                        i = ((iM3169 ^ i7) * 25115) ^ 1458055715;
                        i2 = 1670162377;
                        i10 = iM3169 ^ i2;
                        i9 = i;
                    } catch (RuntimeException e5) {
                        runtimeException = e5;
                        runnable = runnable2;
                        exc2 = exc3;
                        iM31610 = C0773.m3169("۟᩻") ^ i8;
                        i5 = ((iM31610 ^ i7) * (-5067)) ^ 524728523;
                        i6 = -1950826954;
                        int i15 = iM31610 ^ i6;
                        exc3 = exc2;
                        Runnable runnable8 = runnable;
                        i10 = i15;
                        i9 = i5;
                        runnable2 = runnable8;
                    }
                    break;
                case 113925108:
                case 777361172:
                    c2 = 2;
                    if (length2 > 2) {
                        iM3169 = (i7 - C0773.m3169("֫ܺ")) * 71;
                        i = ((iM3169 ^ i8) * (-15369)) ^ (-916673796);
                        i2 = -66981622;
                    } else {
                        iM3169 = C0773.m3169("᩵ۖ") ^ i8;
                        i = ((iM3169 ^ i7) * 25115) ^ 1458055715;
                        i2 = 1670162377;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case 165378258:
                case 1336403698:
                    if (C23916.f77426 <= 0) {
                        exc = exc3;
                        iM2761 = (i8 - C0773.m3169("֡ۢ")) * 43;
                        i3 = ((iM2761 ^ i7) * (-13357)) ^ (-1821749711);
                        i4 = 1548540596;
                        i10 = iM2761 ^ i4;
                        i9 = i3;
                        exc3 = exc;
                        runnable2 = null;
                    }
                    exc = exc3;
                    iM2761 = (C0773.m3169("ᩴۛ") + i8) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i3 = ((iM2761 ^ i7) * 32733) ^ 1981026153;
                    i4 = 403145165;
                    i10 = iM2761 ^ i4;
                    i9 = i3;
                    exc3 = exc;
                    runnable2 = null;
                    break;
                case 460465576:
                case 705909436:
                    if (zMo8198) {
                        iM3169 = (C0619.m2761("֫᩸") ^ i7) * (-53);
                        i = ((iM3169 ^ i8) * (-7809)) ^ (-667893563);
                        i2 = -1007022850;
                    } else {
                        iM3169 = C0773.m3169("۬ܶ") ^ i7;
                        i = ((iM3169 ^ i8) * 313) ^ 890615182;
                        i2 = 1324572490;
                    }
                    i10 = iM3169 ^ i2;
                    i9 = i;
                    break;
                case 479446886:
                case 2144114002:
                    try {
                        abstractC2432.mo1135(runtimeException);
                        iM3169 = (i7 - C0619.m2761("᩹ᩴ")) * (-19);
                        i = ((iM3169 ^ i8) * (-20941)) ^ 391353618;
                        i2 = 1267371776;
                        i10 = iM3169 ^ i2;
                        i9 = i;
                    } catch (Throwable th4) {
                        int iM31614 = C0773.m3169("ۚܳ") ^ i8;
                        i10 = iM31614 ^ 1604126990;
                        th = th4;
                        i9 = ((iM31614 ^ i7) * 32071) ^ 163597947;
                    }
                    break;
                case 838789732:
                case 1461016334:
                    if (AbstractC0116.f1064 <= 0) {
                        exc = exc3;
                        iM2761 = C0619.m2761("᩷ᩳ") ^ i8;
                        i3 = ((iM2761 ^ i7) * (-16773)) ^ 1334356280;
                        i4 = -821932434;
                        i10 = iM2761 ^ i4;
                        i9 = i3;
                        exc3 = exc;
                        runnable2 = null;
                    }
                    exc = exc3;
                    iM2761 = (C0773.m3169("ᩴۛ") + i8) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i3 = ((iM2761 ^ i7) * 32733) ^ 1981026153;
                    i4 = 403145165;
                    i10 = iM2761 ^ i4;
                    i9 = i3;
                    exc3 = exc;
                    runnable2 = null;
                    break;
                case 1320963098:
                case 2119988745:
                    if (C0487.f2131 > 0) {
                        exc = exc3;
                        iM2761 = (C0773.m3169("ᩴۛ") + i8) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM2761 ^ i7) * 32733) ^ 1981026153;
                        i4 = 403145165;
                        i10 = iM2761 ^ i4;
                        i9 = i3;
                        exc3 = exc;
                        runnable2 = null;
                    } else {
                        iM3169 = C0773.m3169("᩷ۛ") ^ i7;
                        i = ((iM3169 ^ i8) * (-6457)) ^ (-553854160);
                        i2 = 527825387;
                        i10 = iM3169 ^ i2;
                        i9 = i;
                    }
                    break;
                default:
                    C2702.m8876();
                    if (C0862.f3233 == 0) {
                        iM3169 = C0773.m3169("᩷ۛ") ^ i7;
                        i = ((iM3169 ^ i8) * (-6457)) ^ (-553854160);
                        i2 = 527825387;
                        i10 = iM3169 ^ i2;
                        i9 = i;
                    } else {
                        exc = exc3;
                        iM2761 = (C0773.m3169("ۖ۫") ^ i8) * (-79);
                        i3 = ((iM2761 ^ i7) * 28063) ^ 826839488;
                        i4 = -2008192126;
                        i10 = iM2761 ^ i4;
                        i9 = i3;
                        exc3 = exc;
                        runnable2 = null;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0219 A[PHI: r1 r2 r16 r17
      0x0219: PHI (r1v6 short[]) = (r1v4 short[]), (r1v1 short[]), (r1v1 short[]) binds: [B:61:0x0217, B:57:0x01fa, B:9:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r2v5 char) = (r2v1 char), (r2v3 char), (r2v1 char) binds: [B:61:0x0217, B:57:0x01fa, B:9:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r16v26 int) = (r16v7 int), (r16v8 int), (r16v27 int) binds: [B:61:0x0217, B:57:0x01fa, B:9:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r17v4 java.lang.String) = (r17v1 java.lang.String), (r17v1 java.lang.String), (r17v5 java.lang.String) binds: [B:61:0x0217, B:57:0x01fa, B:9:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x024c A[PHI: r3 r4 r5 r10 r11 r16
      0x024c: PHI (r3v3 short) = (r3v1 short), (r3v2 short), (r3v1 short), (r3v1 short) binds: [B:65:0x024a, B:53:0x01d8, B:49:0x01b6, B:30:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r4v3 short) = (r4v1 short), (r4v2 short), (r4v1 short), (r4v1 short) binds: [B:65:0x024a, B:53:0x01d8, B:49:0x01b6, B:30:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r5v3 int) = (r5v1 int), (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:65:0x024a, B:53:0x01d8, B:49:0x01b6, B:30:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r10v2 short[]) = (r10v1 short[]), (r10v1 short[]), (r10v1 short[]), (r10v3 short[]) binds: [B:65:0x024a, B:53:0x01d8, B:49:0x01b6, B:30:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r11v2 int) = (r11v1 int), (r11v1 int), (r11v1 int), (r11v3 int) binds: [B:65:0x024a, B:53:0x01d8, B:49:0x01b6, B:30:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r16v15 int) = (r16v6 int), (r16v9 int), (r16v10 int), (r16v16 int) binds: [B:65:0x024a, B:53:0x01d8, B:49:0x01b6, B:30:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (l.C2354.m7983() != false) goto L13;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8190(l.AbstractActivityC17204 r21) {
        /*
            Method dump skipped, instruction units count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC2432.m8190(l.ܽ֡֫):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8194(AbstractActivityC17204 abstractActivityC17204, C11555 c11555) {
        int i = 812528263;
        int i2 = C11235.f35427;
        int i3 = AbstractC3624.f12429;
        int iM3169 = C0773.m3169("ܿ֨") ^ i2;
        int i4 = ((iM3169 ^ i3) * 12729) ^ (-713619400);
        int i5 = -812929832;
        while (true) {
            i = ((((i ^ i3) * (-13647)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1945039558:
                case 1843499626:
                    if (!C2023.f6737) {
                        iM3169 = (C0773.m3169("ܽ۟") + i2) * (-93);
                        i4 = ((iM3169 ^ i3) * (-2799)) ^ (-804496696);
                        i5 = 1485016358;
                    } else {
                        iM3169 = (C0773.m3169("ۛۚ") + i2) * 53;
                        i4 = ((iM3169 ^ i3) * (-9773)) ^ 913766540;
                        i5 = 1774058245;
                    }
                    break;
                case -1871352673:
                case 1020437583:
                    if (C0619.f2439) {
                        iM3169 = (C0773.m3169("ܽ۟") + i2) * (-93);
                        i4 = ((iM3169 ^ i3) * (-2799)) ^ (-804496696);
                        i5 = 1485016358;
                    } else {
                        iM3169 = (C0773.m3169("ۢܶ") ^ i2) * (-117);
                        i4 = ((iM3169 ^ i3) * 1617) ^ 1076403203;
                        i5 = 473160863;
                    }
                    break;
                case -1609272618:
                case -873872178:
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0619.m2761("ᩴ᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * 1453) ^ (-1448631715);
                        i5 = -1493203789;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ܰ᩵")) * 7;
                        i4 = ((iM3169 ^ i3) * (-1597)) ^ (-137873671);
                        i5 = -1805780234;
                    }
                    break;
                case -1584888447:
                case -498614847:
                    if (C3492.f12043 <= 0) {
                        iM3169 = (C0773.m3169("۬᩻") ^ i3) * (-11);
                        i4 = ((iM3169 ^ i2) * 26163) ^ (-765098153);
                        i5 = -786035741;
                    } else {
                        iM3169 = (C0773.m3169("ᩴۢ") + i3) * (-65);
                        i4 = ((iM3169 ^ i2) * (-9311)) ^ (-1975555196);
                        i5 = 2082221958;
                    }
                    break;
                case -1347252650:
                case -317595144:
                    AbstractC0641.m2813();
                    iM3169 = (C0773.m3169("ۛۚ") + i2) * 53;
                    i4 = ((iM3169 ^ i3) * (-9773)) ^ 913766540;
                    i5 = 1774058245;
                    break;
                case -1335132987:
                case -146013360:
                    if (C2310.m7813() <= 0) {
                        iM3169 = (C0773.m3169("᩸ᩳ") + i3) * 41;
                        i4 = ((iM3169 ^ i2) * 29345) ^ 628195613;
                        i5 = 189510736;
                    } else {
                        iM3169 = C0773.m3169("ۜ۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-5245)) ^ 1553097;
                        i5 = -1836905481;
                    }
                    break;
                case -1153246657:
                case 69225325:
                    m8195(abstractActivityC17204, c11555, (RunnableC23979) null);
                    break;
                case -883871183:
                case 1798889465:
                    if (C1542.f5343 <= 0) {
                        iM3169 = (C0773.m3169("ۛۚ") + i2) * 53;
                        i4 = ((iM3169 ^ i3) * (-9773)) ^ 913766540;
                        i5 = 1774058245;
                    } else {
                        iM3169 = (C0619.m2761("ۨۡ") ^ i3) * (-79);
                        i4 = ((iM3169 ^ i2) * (-13085)) ^ 1710134100;
                        i5 = 1334564140;
                    }
                    break;
                case -647038018:
                case 292962208:
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0773.m3169("۬᩻") ^ i3) * (-11);
                        i4 = ((iM3169 ^ i2) * 26163) ^ (-765098153);
                        i5 = -786035741;
                    } else {
                        iM3169 = C0773.m3169("۫᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * 25569) ^ 1303843737;
                        i5 = 1504965002;
                    }
                    break;
                case -568630673:
                case 1883473246:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (C0773.m3169("۬᩻") ^ i3) * (-11);
                        i4 = ((iM3169 ^ i2) * 26163) ^ (-765098153);
                        i5 = -786035741;
                    } else {
                        iM3169 = C0619.m2761("᩵֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11727)) ^ (-499777638);
                        i5 = 698601661;
                    }
                    break;
                case -123621266:
                case 213390257:
                    if (C2023.f6737) {
                        iM3169 = (C0773.m3169("۬᩻") ^ i3) * (-11);
                        i4 = ((iM3169 ^ i2) * 26163) ^ (-765098153);
                        i5 = -786035741;
                    } else {
                        iM3169 = (C0619.m2761("᩵᩻") + i3) * 5;
                        i4 = ((iM3169 ^ i2) * (-3887)) ^ 921575652;
                        i5 = -1711941135;
                    }
                    break;
                case -67315036:
                case 227780772:
                    if (C2834.f9334 > 0) {
                        iM3169 = (C0773.m3169("᩸ᩳ") + i3) * 41;
                        i4 = ((iM3169 ^ i2) * 29345) ^ 628195613;
                        i5 = 189510736;
                    } else {
                        iM3169 = C0619.m2761("ᩴ᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * 1453) ^ (-1448631715);
                        i5 = -1493203789;
                    }
                    break;
                case 12578826:
                case 1808857049:
                    C1321.m4852();
                    AbstractC3624.m11755();
                    break;
                case 583540189:
                case 1223596217:
                    C3492.m11488();
                    if (!C1080.m4050()) {
                        iM3169 = C0619.m2761("ᩴ᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * 1453) ^ (-1448631715);
                        i5 = -1493203789;
                    } else {
                        iM3169 = (C0773.m3169("ۛۚ") + i2) * 53;
                        i4 = ((iM3169 ^ i3) * (-9773)) ^ 913766540;
                        i5 = 1774058245;
                    }
                    break;
                case 1567193541:
                case 1682448802:
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0773.m3169("ۛۚ") + i2) * 53;
                        i4 = ((iM3169 ^ i3) * (-9773)) ^ 913766540;
                        i5 = 1774058245;
                    } else {
                        iM3169 = C0619.m2761("᩸ۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 6695) ^ (-1197939603);
                        i5 = -1638327419;
                    }
                    break;
                default:
                    if (C2375.f7641 <= 0) {
                        iM3169 = (C0773.m3169("᩸ᩳ") + i3) * 41;
                        i4 = ((iM3169 ^ i2) * 29345) ^ 628195613;
                        i5 = 189510736;
                    } else {
                        iM3169 = C0773.m3169("ᩳۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-11495)) ^ 1459631685;
                        i5 = -1130229164;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v66, types: [l.ۢۙܺ, l.᩷᩻ۙ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8195(final AbstractActivityC17204 abstractActivityC17204, final C11555 c11555, final RunnableC23979 runnableC23979) {
        AbstractC8585 abstractC8585M29070 = 0;
        long j = 0;
        int i = -2100676939;
        int i2 = AbstractC3624.f12429;
        int i3 = C1783.f6087;
        int iM2761 = C0619.m2761("ۧ֡") ^ i2;
        int i4 = ((iM2761 ^ i3) * (-13115)) ^ (-1882236021);
        int i5 = -1413323559;
        while (true) {
            i = ((((i ^ i3) * (-10221)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2095100424:
                case 936009573:
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0773.m3169("ܽ᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * 32117) ^ 1421873772;
                        i5 = 1434315009;
                    } else {
                        iM2761 = (C0619.m2761("֡᩺") ^ i3) * 15;
                        i4 = ((iM2761 ^ i2) * 2771) ^ (-749884190);
                        i5 = -523275449;
                    }
                    break;
                case -1867947203:
                case -29316265:
                    this.f7779 = true;
                    j = 300;
                    if (C1564.m5509() <= 0) {
                        iM2761 = (C0619.m2761("ۖ֨") ^ i3) * (-5);
                        i4 = ((iM2761 ^ i2) * 17081) ^ (-2101201405);
                        i5 = -1581650685;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۚۖ")) * (-43);
                        i4 = ((iM2761 ^ i2) * 18611) ^ 1176066153;
                        i5 = -351495440;
                    }
                    break;
                case -1710472657:
                case -1426760453:
                    if (C2834.f9334 <= 0) {
                        iM2761 = (C0619.m2761("ܰܳ") ^ i3) * (-55);
                        i4 = ((iM2761 ^ i2) * (-4283)) ^ 1612803118;
                        i5 = -1918214235;
                    } else {
                        iM2761 = C0619.m2761("ۗۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-22541)) ^ 2056973047;
                        i5 = 497750710;
                    }
                    break;
                case -1616612999:
                case -902236767:
                    if (C4282.m13644()) {
                        iM2761 = (C0773.m3169("ܰ۠") ^ i3) * 95;
                        i4 = ((iM2761 ^ i2) * 2579) ^ (-42954282);
                        i5 = -1634411831;
                    } else {
                        iM2761 = (C0619.m2761("ܰܳ") ^ i3) * (-55);
                        i4 = ((iM2761 ^ i2) * (-4283)) ^ 1612803118;
                        i5 = -1918214235;
                    }
                    break;
                case -1600816957:
                case 1650170930:
                    C21576.m49062(j, new Runnable() { // from class: l.֨ۙܺ
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC2432 abstractC2432 = this.f3476;
                            if (abstractC2432.f7779 && c11555.m29071()) {
                                C13511 c13511 = new C13511(abstractActivityC17204, R.string.MT_Protector);
                                c13511.m33192();
                                abstractC2432.f7780 = c13511;
                                Runnable runnable = runnableC23979;
                                if (runnable != null) {
                                    runnable.run();
                                }
                            }
                        }
                    });
                    break;
                case -1454899035:
                case 2049620766:
                    abstractC8585M29070 = c11555.m29070();
                    this.f7778 = abstractC8585M29070;
                    if (abstractC8585M29070 != 0) {
                        iM2761 = (C0773.m3169("ۗۚ") + i2) * 63;
                        i4 = ((iM2761 ^ i3) * (-3159)) ^ (-1069729572);
                        i5 = -883669365;
                    } else {
                        iM2761 = C0619.m2761("۠ۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7185) ^ (-2102588801);
                        i5 = -1246930076;
                    }
                    break;
                case -1423931036:
                case 998971245:
                    if (C1146.f4234 >= 0) {
                        iM2761 = (C0619.m2761("֡᩺") ^ i3) * 15;
                        i4 = ((iM2761 ^ i2) * 2771) ^ (-749884190);
                        i5 = -523275449;
                    } else {
                        iM2761 = C0773.m3169("ۜ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-28795)) ^ (-807629810);
                        i5 = 343792297;
                    }
                    break;
                case -1297961879:
                case 1690821144:
                    ?? r6 = new InterfaceC5252() { // from class: l.ۢۙܺ
                        @Override // l.InterfaceC5252
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
                            if (enumC9330 == EnumC9330.ON_DESTROY) {
                                this.f31800.m8196();
                            }
                        }
                    };
                    this.f7781 = r6;
                    abstractC8585M29070.mo23077(r6);
                    iM2761 = C0619.m2761("۠ۙ") ^ i2;
                    i4 = ((iM2761 ^ i3) * 7185) ^ (-2102588801);
                    i5 = -1246930076;
                    break;
                case -1271100782:
                case -506362658:
                    C1826.m6301();
                    iM2761 = (C0619.m2761("֡᩺") ^ i3) * 15;
                    i4 = ((iM2761 ^ i2) * 2771) ^ (-749884190);
                    i5 = -523275449;
                    break;
                case -1176888154:
                case 1071541557:
                    C11235.m28309();
                    C3077.m10041();
                    break;
                case -1030919547:
                case -588293736:
                    break;
                case -589132518:
                case 759259919:
                    if (C3099.f10023 > 0) {
                        iM2761 = (C0619.m2761("ܰܳ") ^ i3) * (-55);
                        i4 = ((iM2761 ^ i2) * (-4283)) ^ 1612803118;
                        i5 = -1918214235;
                    } else {
                        iM2761 = (C0619.m2761("֡᩺") ^ i3) * 15;
                        i4 = ((iM2761 ^ i2) * 2771) ^ (-749884190);
                        i5 = -523275449;
                    }
                    break;
                case -533752695:
                case 1457343420:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0773.m3169("ܽ᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * 32117) ^ 1421873772;
                        i5 = 1434315009;
                    } else {
                        iM2761 = C0773.m3169("ᩴۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-28401)) ^ 949304100;
                        i5 = 1111701327;
                    }
                    break;
                case -516096996:
                case 1295126283:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0773.m3169("ܽ᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * 32117) ^ 1421873772;
                        i5 = 1434315009;
                    } else {
                        iM2761 = C0773.m3169("ۜ֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * 28231) ^ (-1837958887);
                        i5 = -523405086;
                    }
                    break;
                case -32347386:
                case 1692602109:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0619.m2761("ܽ᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10493)) ^ 1931323616;
                        i5 = -3056768;
                    } else {
                        iM2761 = C0619.m2761("᩹ܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-26711)) ^ (-928537074);
                        i5 = -2116622927;
                    }
                    break;
                case 162342507:
                case 1347558145:
                    if (C2878.f9462) {
                        iM2761 = (C0619.m2761("֡᩺") ^ i3) * 15;
                        i4 = ((iM2761 ^ i2) * 2771) ^ (-749884190);
                        i5 = -523275449;
                    } else {
                        iM2761 = (C0773.m3169("ۤ᩵") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2761 ^ i2) * 28309) ^ (-232152729);
                        i5 = -1639914814;
                    }
                    break;
                case 512768022:
                case 1838641583:
                    if (AbstractC0116.m1243() == 0) {
                        iM2761 = C0619.m2761("ܽ᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10493)) ^ 1931323616;
                        i5 = -3056768;
                    } else {
                        iM2761 = (C0619.m2761("֡᩺") ^ i3) * 15;
                        i4 = ((iM2761 ^ i2) * 2771) ^ (-749884190);
                        i5 = -523275449;
                    }
                    break;
                case 912396177:
                case 1470079393:
                    if (C1343.f4799 != 0) {
                        iM2761 = (C0619.m2761("ۖ֨") ^ i3) * (-5);
                        i4 = ((iM2761 ^ i2) * 17081) ^ (-2101201405);
                        i5 = -1581650685;
                    } else {
                        iM2761 = C0773.m3169("۬ۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-31373)) ^ (-540556392);
                        i5 = -1241539167;
                    }
                    break;
                case 1603280508:
                case 1894126173:
                    C0487.m2362(this);
                    if (c11555.m29071()) {
                        iM2761 = C0619.m2761("ۛ֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-15087)) ^ 705359735;
                        i5 = -478366877;
                    } else {
                        iM2761 = C0773.m3169("۠ۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22349) ^ (-1613441825);
                        i5 = -1763972200;
                    }
                    break;
                default:
                    if (C11235.f35427 >= 0) {
                        iM2761 = (C0619.m2761("֡᩺") ^ i3) * 15;
                        i4 = ((iM2761 ^ i2) * 2771) ^ (-749884190);
                        i5 = -523275449;
                    } else {
                        iM2761 = C0619.m2761("ۙۧ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 16211) ^ (-1976107583);
                        i5 = 117882323;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8192(AbstractActivityC17204 abstractActivityC17204, int i, int i2) {
        int i3 = -151994602;
        int i4 = C23916.f77426;
        int i5 = C11235.f35427;
        int iM3169 = (i4 - C0773.m3169("ᩴ֫")) * 69;
        int i6 = ((iM3169 ^ i5) * 18277) ^ 1675225713;
        int i7 = -677719415;
        while (true) {
            i3 = ((((i3 ^ i5) * 14983) >> 31) & i6) ^ (iM3169 ^ i7);
            switch (i3) {
                case -1924421630:
                case 436537957:
                    C1826.m6301();
                    if (RunnableC0334.f1808 > 0) {
                        iM3169 = (C0619.m2761("ᩴ۫") + i5) * (-103);
                        i6 = ((iM3169 ^ i4) * (-14963)) ^ (-1537851264);
                        i7 = 1391201860;
                    } else {
                        iM3169 = (C0619.m2761("ܽۘ") ^ i5) * 65;
                        i6 = ((iM3169 ^ i4) * 16569) ^ 157982106;
                        i7 = -28165849;
                    }
                    break;
                case -1797193945:
                case -1327227268:
                    if (C2419.f7754 >= 0) {
                        iM3169 = (C0773.m3169("۟֫") ^ i5) * 3;
                        i6 = ((iM3169 ^ i4) * 28007) ^ 1448491221;
                        i7 = -1565673587;
                    } else {
                        iM3169 = C0773.m3169("᩷ۨ") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-6323)) ^ (-122559514);
                        i7 = -394164726;
                    }
                    break;
                case -1690418259:
                case -829381249:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0619.m2761("ᩴ۫") + i5) * (-103);
                        i6 = ((iM3169 ^ i4) * (-14963)) ^ (-1537851264);
                        i7 = 1391201860;
                    } else {
                        iM3169 = C0773.m3169("ܶ᩵") ^ i5;
                        i6 = ((iM3169 ^ i4) * 15771) ^ 960617653;
                        i7 = -659782730;
                    }
                    break;
                case -1668272807:
                case -488020587:
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0619.m2761("᩶۫") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-18153)) ^ 1707100640;
                        i7 = 768517003;
                    } else {
                        iM3169 = C0773.m3169("ܽ᩵") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-325)) ^ 1290514365;
                        i7 = 936622809;
                    }
                    break;
                case -1575400938:
                case -1218670185:
                    if (C0269.f1558 > 0) {
                        iM3169 = C0619.m2761("᩶۫") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-18153)) ^ 1707100640;
                        i7 = 768517003;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ܶ۫")) * 47;
                        i6 = ((iM3169 ^ i5) * 17783) ^ 1952515102;
                        i7 = 2079534521;
                    }
                    break;
                case -1414247104:
                case 1121011476:
                    if (RunnableC0334.m2063()) {
                        iM3169 = (C0619.m2761("ᩴ۫") + i5) * (-103);
                        i6 = ((iM3169 ^ i4) * (-14963)) ^ (-1537851264);
                        i7 = 1391201860;
                    } else {
                        iM3169 = (C0773.m3169("᩸ۛ") ^ i5) * (-19);
                        i6 = ((iM3169 ^ i4) * 26843) ^ (-1609858635);
                        i7 = -54036084;
                    }
                    break;
                case -1268702026:
                case 1860536293:
                    C0269.m1775();
                    break;
                case -820683298:
                case 2053148175:
                    if (C1783.f6087 <= 0) {
                        iM3169 = C0619.m2761("᩶۫") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-18153)) ^ 1707100640;
                        i7 = 768517003;
                    } else {
                        iM3169 = C0773.m3169("ۚ۟") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-12027)) ^ 536865527;
                        i7 = 2016595911;
                    }
                    break;
                case -443868569:
                case -149825219:
                    if (C2419.f7754 >= 0) {
                        iM3169 = (C0773.m3169("۟֫") ^ i5) * 3;
                        i6 = ((iM3169 ^ i4) * 28007) ^ 1448491221;
                        i7 = -1565673587;
                    } else {
                        iM3169 = C0619.m2761("ۗ᩶") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-11975)) ^ 304411810;
                        i7 = 1859520877;
                    }
                    break;
                case -198385452:
                case 221254551:
                    if (C2375.f7641 <= 0) {
                        iM3169 = (C0773.m3169("۟֫") ^ i5) * 3;
                        i6 = ((iM3169 ^ i4) * 28007) ^ 1448491221;
                        i7 = -1565673587;
                    } else {
                        iM3169 = C0619.m2761("ۢۛ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 15755) ^ (-145257061);
                        i7 = -1579299838;
                    }
                    break;
                case 39469305:
                case 388942632:
                    if (!C1519.m5403()) {
                        iM3169 = (i4 - C0773.m3169("ܶ۫")) * 47;
                        i6 = ((iM3169 ^ i5) * 17783) ^ 1952515102;
                        i7 = 2079534521;
                    } else {
                        iM3169 = (C0619.m2761("ܽۘ") ^ i5) * 65;
                        i6 = ((iM3169 ^ i4) * 16569) ^ 157982106;
                        i7 = -28165849;
                    }
                    break;
                case 167521170:
                case 1851423688:
                    if (C3077.m10041()) {
                        iM3169 = (i4 - C0773.m3169("ܶ۫")) * 47;
                        i6 = ((iM3169 ^ i5) * 17783) ^ 1952515102;
                        i7 = 2079534521;
                    } else {
                        iM3169 = C0773.m3169("ܰܳ") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-30001)) ^ 1533429955;
                        i7 = 1879814338;
                    }
                    break;
                case 1246644509:
                case 1769260359:
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0619.m2761("ᩴ۫") + i5) * (-103);
                        i6 = ((iM3169 ^ i4) * (-14963)) ^ (-1537851264);
                        i7 = 1391201860;
                    } else {
                        iM3169 = C0619.m2761("֫۬") ^ i4;
                        i6 = ((iM3169 ^ i5) * 12421) ^ (-1110438881);
                        i7 = 1174406391;
                    }
                    break;
                case 1412805764:
                case 1496667443:
                    m8193(abstractActivityC17204, i, i2, null);
                    break;
                case 1611996336:
                case 2095309248:
                    if (C1826.f6190 <= 0) {
                        iM3169 = (i4 - C0773.m3169("ܶ۫")) * 47;
                        i6 = ((iM3169 ^ i5) * 17783) ^ 1952515102;
                        i7 = 2079534521;
                    } else {
                        iM3169 = (i5 - C0773.m3169("ܿ۬")) * 127;
                        i6 = ((iM3169 ^ i4) * 5213) ^ 817958984;
                        i7 = 1830848965;
                    }
                    break;
                default:
                    C3690.m11987();
                    C3779.m12264();
                    iM3169 = (i4 - C0773.m3169("ܶ۫")) * 47;
                    i6 = ((iM3169 ^ i5) * 17783) ^ 1952515102;
                    i7 = 2079534521;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8193(final AbstractActivityC17204 abstractActivityC17204, final int i, int i2, final Runnable runnable) {
        boolean z = false;
        int i3 = 1600142665;
        int i4 = C3690.f12684;
        int i5 = AbstractC0116.f1064;
        int iM2761 = C0619.m2761("֡ۛ") ^ i4;
        int i6 = ((iM2761 ^ i5) * 2505) ^ 1300047800;
        int i7 = -86515798;
        while (true) {
            i3 = ((((i3 ^ i5) * 18581) >> 31) & i6) ^ (iM2761 ^ i7);
            switch (i3) {
                case -2095085281:
                case 20046764:
                    C0950.m3785();
                    RunnableC3055.m9933();
                    break;
                case -2015246604:
                case -173093663:
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0773.m3169("᩸ۙ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 167) ^ (-2137295716);
                        i7 = 708542318;
                    } else {
                        iM2761 = C0619.m2761("ۖ᩶") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-4325)) ^ 77535655;
                        i7 = 1159605422;
                    }
                    break;
                case -1996637872:
                case -7638315:
                    if (C3734.f12817 >= 0) {
                        iM2761 = C0773.m3169("᩸ۙ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 167) ^ (-2137295716);
                        i7 = 708542318;
                    } else {
                        iM2761 = C0619.m2761("֨᩵") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-16627)) ^ 139384723;
                        i7 = -1187267337;
                    }
                    break;
                case -1417073670:
                case 1737895029:
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0619.m2761("۫ᩴ") + i5) * (-123);
                        i6 = ((iM2761 ^ i4) * (-6191)) ^ (-2047026534);
                        i7 = -390456441;
                    } else {
                        iM2761 = C0619.m2761("᩵ۙ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-8535)) ^ 1260648333;
                        i7 = -1190019952;
                    }
                    break;
                case -1121613690:
                case 104792008:
                    z = true;
                    if (C3448.m11248() != 0) {
                        iM2761 = C0773.m3169("᩸ۙ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 167) ^ (-2137295716);
                        i7 = 708542318;
                    } else {
                        iM2761 = (i4 - C0619.m2761("᩶ۗ")) * (-81);
                        i6 = ((iM2761 ^ i5) * 6509) ^ 1876981871;
                        i7 = 1990756579;
                    }
                    break;
                case -1004262512:
                case 271268894:
                    if (C2288.m7767()) {
                        iM2761 = C0773.m3169("᩸ۙ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 167) ^ (-2137295716);
                        i7 = 708542318;
                    } else {
                        iM2761 = C0773.m3169("᩺۟") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-8857)) ^ 890440576;
                        i7 = 260274980;
                    }
                    break;
                case -979636035:
                case 1919229073:
                    C0862.m3503();
                    if (C1826.m6301() < 0) {
                        iM2761 = (C0619.m2761("۫ᩴ") + i5) * (-123);
                        i6 = ((iM2761 ^ i4) * (-6191)) ^ (-2047026534);
                        i7 = -390456441;
                    } else {
                        iM2761 = C0773.m3169("ۧ֨") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-3369)) ^ 60258632;
                        i7 = 87016881;
                    }
                    break;
                case -771338252:
                case 1674575697:
                    if (C2966.m9664()) {
                        iM2761 = (i5 - C0773.m3169("۠᩻")) * 109;
                        i6 = ((iM2761 ^ i4) * 24317) ^ (-143431364);
                        i7 = 1061648088;
                    } else {
                        iM2761 = C0773.m3169("᩸ۙ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 167) ^ (-2137295716);
                        i7 = 708542318;
                    }
                    break;
                case -725511537:
                case 1180848918:
                    if (C17202.f56030) {
                        iM2761 = C0773.m3169("᩻ۙ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 27771) ^ 1536548555;
                        i7 = 1389307580;
                    } else {
                        iM2761 = (C0619.m2761("۫ᩴ") + i5) * (-123);
                        i6 = ((iM2761 ^ i4) * (-6191)) ^ (-2047026534);
                        i7 = -390456441;
                    }
                    break;
                case -689647475:
                case -334344898:
                    C3448.m11248();
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0773.m3169("ۧ֨") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-3369)) ^ 60258632;
                        i7 = 87016881;
                    } else {
                        iM2761 = (C0773.m3169("᩷ܳ") + i4) * 127;
                        i6 = ((iM2761 ^ i5) * 28077) ^ (-1518931807);
                        i7 = 1720871766;
                    }
                    break;
                case -472925525:
                case 1524263506:
                    C3690.m11987();
                    C2485.m8357();
                    iM2761 = C0773.m3169("ۧ֨") ^ i5;
                    i6 = ((iM2761 ^ i4) * (-3369)) ^ 60258632;
                    i7 = 87016881;
                    break;
                case -439681608:
                case 348849519:
                    C4238.m13540();
                    if (C17202.f56030) {
                        iM2761 = C0773.m3169("ۧ֨") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-3369)) ^ 60258632;
                        i7 = 87016881;
                    } else {
                        iM2761 = (C0773.m3169("ۤ᩻") + i4) * (-31);
                        i6 = ((iM2761 ^ i5) * (-24967)) ^ (-2142975617);
                        i7 = -1510608342;
                    }
                    break;
                case -50374045:
                case 1456660670:
                    if (C2023.f6737) {
                        iM2761 = (C0619.m2761("۫ᩴ") + i5) * (-123);
                        i6 = ((iM2761 ^ i4) * (-6191)) ^ (-2047026534);
                        i7 = -390456441;
                    } else {
                        iM2761 = C0773.m3169("۟ۨ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-23279)) ^ 1242235914;
                        i7 = -1787121293;
                    }
                    break;
                case 487783630:
                case 829620705:
                    if (C2702.f8586 <= 0) {
                        iM2761 = C0773.m3169("ۧ֨") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-3369)) ^ 60258632;
                        i7 = 87016881;
                    } else {
                        iM2761 = (C0619.m2761("ۙۨ") ^ i5) * (-67);
                        i6 = ((iM2761 ^ i4) * 27859) ^ 1854457340;
                        i7 = -1434864495;
                    }
                    break;
                case 1451883316:
                case 1621528306:
                    this.f7779 = z;
                    C21576.m49062(i2, new Runnable() { // from class: l.ᩳۙܺ
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC2432 abstractC2432 = this.f61199;
                            if (abstractC2432.f7779) {
                                C13511 c13511 = new C13511(abstractActivityC17204, i);
                                c13511.m33192();
                                abstractC2432.f7780 = c13511;
                                Runnable runnable2 = runnable;
                                if (runnable2 != null) {
                                    runnable2.run();
                                }
                            }
                        }
                    });
                    break;
                default:
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0773.m3169("ۧ֨") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-3369)) ^ 60258632;
                        i7 = 87016881;
                    } else {
                        iM2761 = (C0773.m3169("᩺ۗ") + i4) * (-93);
                        i6 = ((iM2761 ^ i5) * (-8989)) ^ (-440030716);
                        i7 = 1136355142;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0276 A[PHI: r1 r6 r7 r8 r16
      0x0276: PHI (r1v7 short[]) = (r1v1 short[]), (r1v2 short[]), (r1v1 short[]), (r1v1 short[]) binds: [B:63:0x0274, B:46:0x01b2, B:10:0x004c, B:27:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r6v4 short[]) = (r6v1 short[]), (r6v1 short[]), (r6v1 short[]), (r6v6 short[]) binds: [B:63:0x0274, B:46:0x01b2, B:10:0x004c, B:27:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r7v4 int) = (r7v1 int), (r7v1 int), (r7v1 int), (r7v6 int) binds: [B:63:0x0274, B:46:0x01b2, B:10:0x004c, B:27:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r8v4 int) = (r8v1 int), (r8v1 int), (r8v1 int), (r8v6 int) binds: [B:63:0x0274, B:46:0x01b2, B:10:0x004c, B:27:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r16v21 int) = (r16v1 int), (r16v5 int), (r16v14 int), (r16v22 int) binds: [B:63:0x0274, B:46:0x01b2, B:10:0x004c, B:27:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x02ac A[PHI: r16
      0x02ac: PHI (r16v13 int) = (r16v0 int), (r16v2 int), (r16v15 int) binds: [B:67:0x02aa, B:59:0x0251, B:11:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
    
        if (l.AbstractC0116.m1243() != 0) goto L14;
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8199(l.AbstractActivityC17204 r19, int r20) {
        /*
            Method dump skipped, instruction units count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC2432.m8199(l.ܽ֡֫, int):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8189(Executor executor) {
        this.f7777 = executor;
    }
}
