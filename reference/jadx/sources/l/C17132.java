package l;

import android.content.SharedPreferences;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import moe.shizuku.server.IShizukuService;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܿۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z43S */
/* JADX INFO: loaded from: classes.dex */
public final class C17132 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C9186 f54637;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static ArrayList f54638;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 f54639;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C21445 f54640;

    /* JADX INFO: renamed from: ۟۫᩹, reason: not valid java name and contains not printable characters */
    private static final short[] f54641;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean f54642;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static ArrayList f54643;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final AtomicBoolean f54644;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static int f54645;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static native synchronized void m40015();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native List m40019();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native C11986 m40021(C11986 c11986, boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native void m40026(C2455 c2455, AbstractC20745 abstractC20745, AbstractC20745 abstractC20746, boolean z, boolean z2, InterfaceC12194 interfaceC12194);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static native synchronized void m40031();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static native List m40034();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40027(EnumC9493 enumC9493) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 475898287;
        int i5 = C0050.f912;
        int i6 = C1977.f7413;
        int iM45029 = C19806.m45029("ۤۛ") ^ i6;
        int i7 = ((iM45029 ^ i5) * 10149) ^ 1277959654;
        int i8 = -1928607566;
        while (true) {
            i4 = ((((i4 ^ i5) * (-9587)) >> 31) & i7) ^ (iM45029 ^ i8);
            switch (i4) {
                case -2032319185:
                case 1794294860:
                    if (C1668.m5583()) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۛ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 12407) ^ 1550062379;
                        i8 = -401709526;
                    } else {
                        iM45029 = C19806.m45029("᩵۟") ^ i6;
                        i7 = ((iM45029 ^ i5) * 4089) ^ (-34328077);
                        i8 = -1806013224;
                    }
                    break;
                case -1988327370:
                case -1480418916:
                    if (C0629.f2722 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۧ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-22249)) ^ (-891872592);
                        i8 = 1652848830;
                    } else {
                        iM45029 = C19806.m45029("ۘۙ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-22371)) ^ 2094978259;
                        i8 = -1780696103;
                    }
                    break;
                case -1793484102:
                case 783170130:
                    C1148.m4232();
                    if (C2871.f10837 < 0) {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ۙۗ")) * (-39);
                        i7 = ((iM45029 ^ i5) * 30107) ^ (-102031323);
                        i8 = -1544238623;
                    } else {
                        iM45029 = (C19806.m45029("۬ۜ") ^ i5) * (-75);
                        i7 = ((iM45029 ^ i6) * (-26101)) ^ 900526757;
                        i8 = 513963621;
                    }
                    break;
                case -1571355210:
                case -1321230710:
                    C19806.m45024();
                    break;
                case -1545276405:
                case -427958059:
                    C1148.m4232();
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = C19806.m45029("᩵۟") ^ i6;
                        i7 = ((iM45029 ^ i5) * 4089) ^ (-34328077);
                        i8 = -1806013224;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۧ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-22249)) ^ (-891872592);
                        i8 = 1652848830;
                    }
                    break;
                case -1541125638:
                case 31195101:
                    if (C10634.f36300 >= 0) {
                        iM45029 = C19806.m45029("᩵۟") ^ i6;
                        i7 = ((iM45029 ^ i5) * 4089) ^ (-34328077);
                        i8 = -1806013224;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬֡") ^ i5;
                        i7 = ((iM45029 ^ i6) * 20727) ^ 463523504;
                        i8 = 767761695;
                    }
                    break;
                case -1267875042:
                case 1940020035:
                    f54645 = i3;
                    if (RunnableC1895.f7152) {
                        iM45029 = (C19806.m45029("᩹ۙ") + i5) * (-81);
                        i7 = ((iM45029 ^ i6) * (-16759)) ^ (-1610959877);
                        i8 = 338029591;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۖ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-16329)) ^ (-898923168);
                        i8 = -236856102;
                    }
                    break;
                case -1149364629:
                case 1002206230:
                    if (C0817.m3399()) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠֡") + i5) * 31;
                        i7 = ((iM45029 ^ i6) * 5869) ^ 1908681426;
                        i8 = -1635678656;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ۙۗ")) * (-39);
                        i7 = ((iM45029 ^ i5) * 30107) ^ (-102031323);
                        i8 = -1544238623;
                    }
                    break;
                case -1060240392:
                case 178372300:
                    break;
                case -966997418:
                case -882249824:
                    C1025.m3861();
                    if (C7105.f23796 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۧ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-22249)) ^ (-891872592);
                        i8 = 1652848830;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ۙۗ")) * (-39);
                        i7 = ((iM45029 ^ i5) * 30107) ^ (-102031323);
                        i8 = -1544238623;
                    }
                    break;
                case -552695487:
                case 769795831:
                    if (enumC9493.m24320()) {
                        iM45029 = (C19806.m45029("᩺۠") + i6) * 77;
                        i7 = ((iM45029 ^ i5) * (-5451)) ^ (-1550236991);
                        i8 = 1818710618;
                    } else {
                        iM45029 = C19806.m45029("ۘܺ") ^ i5;
                        i7 = ((iM45029 ^ i6) * 22783) ^ (-2073776511);
                        i8 = -1598874768;
                    }
                    break;
                case -325494287:
                case -291165557:
                    i = f54645;
                    i2 = 1;
                    if (CallableC1627.f6528) {
                        iM45029 = C19806.m45029("ۘۛ") ^ i6;
                        i7 = ((iM45029 ^ i5) * 27457) ^ 1084818695;
                        i8 = -724040792;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۧ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-22249)) ^ (-891872592);
                        i8 = 1652848830;
                    }
                    break;
                case -271663696:
                case -245721158:
                    f54637.mo23641(C2788.m8476(i3));
                    iM45029 = (C19806.m45029("᩺۠") + i6) * 77;
                    i7 = ((iM45029 ^ i5) * (-5451)) ^ (-1550236991);
                    i8 = 1818710618;
                    break;
                case -189864059:
                case 582134679:
                    C3743.m10966();
                    iM45029 = (C19806.m45029("۬ۜ") ^ i5) * (-75);
                    i7 = ((iM45029 ^ i6) * (-26101)) ^ 900526757;
                    i8 = 513963621;
                    break;
                case 145186687:
                case 367114307:
                    i3 = i + i2;
                    if (C0050.f912 <= 0) {
                        iM45029 = C19806.m45029("᩵۟") ^ i6;
                        i7 = ((iM45029 ^ i5) * 4089) ^ (-34328077);
                        i8 = -1806013224;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽܺ") ^ i6;
                        i7 = ((iM45029 ^ i5) * 6363) ^ (-1751585149);
                        i8 = -429344505;
                    }
                    break;
                case 419312810:
                case 1190682532:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۧ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-22249)) ^ (-891872592);
                        i8 = 1652848830;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ᩷") + i6) * (-91);
                        i7 = ((iM45029 ^ i5) * (-32531)) ^ (-2095653935);
                        i8 = -334034135;
                    }
                    break;
                case 1642682569:
                case 1770701159:
                    if (C1937.m6279() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۧ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-22249)) ^ (-891872592);
                        i8 = 1652848830;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙܳ") ^ i6;
                        i7 = ((iM45029 ^ i5) * 8663) ^ (-604932779);
                        i8 = 352131418;
                    }
                    break;
                default:
                    if (RunnableC1895.f7152) {
                        iM45029 = (C19806.m45029("ᩴ۬") ^ i5) * (-125);
                        i7 = ((iM45029 ^ i6) * 30491) ^ (-1025078581);
                        i8 = -632626286;
                    } else {
                        iM45029 = (C19806.m45029("۬ۜ") ^ i5) * (-75);
                        i7 = ((iM45029 ^ i6) * (-26101)) ^ 900526757;
                        i8 = 513963621;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C11986 m40033(String str) {
        int iM11306;
        int i;
        C11986 c11986 = null;
        int i2 = 960058159;
        int i3 = ThreadFactoryC3888.f14547;
        int i4 = C0050.f912;
        int iM11307 = (ThreadFactoryC3888.m11306("ᩴ᩵") ^ i3) * (-59);
        int i5 = ((iM11307 ^ i4) * 32199) ^ (-1362638236);
        int i6 = -969121181;
        while (true) {
            int i7 = iM11307 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i4) * 4291) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2102103320:
                    case -826644717:
                        if (!C19806.m45024()) {
                            iM11307 = ThreadFactoryC3888.m11306("᩷ۚ") ^ i3;
                            i5 = ((iM11307 ^ i4) * (-1027)) ^ 1378219616;
                            i6 = -1769746991;
                            break;
                        }
                        iM11307 = ThreadFactoryC3888.m11306("֡ۡ") ^ i4;
                        i5 = ((iM11307 ^ i3) * 22215) ^ 59574338;
                        i6 = -1884441270;
                        break;
                    case -2009409222:
                    case 605954457:
                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                            iM11307 = (i3 - C19806.m45029("֡᩷")) * 7;
                            i5 = ((iM11307 ^ i4) * (-14737)) ^ 1914460467;
                            i6 = 1775508442;
                            break;
                        }
                        iM11307 = (ThreadFactoryC3888.m11306("᩻ܿ") + i3) * (-19);
                        i5 = ((iM11307 ^ i4) * 16725) ^ 753699397;
                        i6 = -1337192116;
                        break;
                    case -1915594721:
                    case 154445148:
                        if (C7105.f23796 < 0) {
                            iM11307 = C19806.m45029("᩻ܺ") ^ i4;
                            i5 = ((iM11307 ^ i3) * 20351) ^ (-1550499341);
                            i6 = -828516588;
                            break;
                        }
                        iM11307 = ThreadFactoryC3888.m11306("ۙܿ") ^ i4;
                        i5 = ((iM11307 ^ i3) * (-32601)) ^ 1596927619;
                        i6 = 1696071218;
                        break;
                    case -1689578975:
                    case -923750338:
                        if (C2871.m8642()) {
                            iM11306 = ThreadFactoryC3888.m11306("᩻֡") ^ i4;
                            i5 = ((iM11306 ^ i3) * 13721) ^ (-1452383995);
                            i = -677856555;
                        } else {
                            iM11306 = (i3 - ThreadFactoryC3888.m11306("֡ۨ")) * (-105);
                            i5 = ((iM11306 ^ i4) * (-29823)) ^ (-1057683070);
                            i = 1222685675;
                        }
                        i7 = iM11306 ^ i;
                        c11986 = null;
                        break;
                    case -1682892368:
                    case 574404428:
                        return (C11986) f54640.getOrDefault(str, c11986);
                    case -1058833258:
                    case 448298210:
                        if (C2332.m7079() > 0) {
                            iM11307 = (ThreadFactoryC3888.m11306("᩷ۙ") ^ i3) * (-107);
                            i5 = ((iM11307 ^ i4) * 22277) ^ 1189318360;
                            i6 = -1415845375;
                            break;
                        }
                        iM11307 = ThreadFactoryC3888.m11306("ۙܿ") ^ i4;
                        i5 = ((iM11307 ^ i3) * (-32601)) ^ 1596927619;
                        i6 = 1696071218;
                        break;
                        break;
                    case -1014523447:
                    case -314876550:
                        C2124.m6673();
                        if (RunnableC1606.f6488 >= 0) {
                            iM11307 = (ThreadFactoryC3888.m11306("᩻ܿ") + i3) * (-19);
                            i5 = ((iM11307 ^ i4) * 16725) ^ 753699397;
                            i6 = -1337192116;
                            break;
                            break;
                        }
                        iM11307 = ThreadFactoryC3888.m11306("ۙܿ") ^ i4;
                        i5 = ((iM11307 ^ i3) * (-32601)) ^ 1596927619;
                        i6 = 1696071218;
                        break;
                        break;
                    case -1010891446:
                    case 1418907663:
                        if (C1066.m4023() > 0) {
                            iM11307 = C19806.m45029("ۨۚ") ^ i4;
                            i5 = ((iM11307 ^ i3) * (-26007)) ^ (-207373885);
                            i6 = -1171642829;
                            break;
                        }
                        iM11307 = ThreadFactoryC3888.m11306("ۙܿ") ^ i4;
                        i5 = ((iM11307 ^ i3) * (-32601)) ^ 1596927619;
                        i6 = 1696071218;
                        break;
                        break;
                    case -1005836487:
                    case 1350311005:
                        if (C2249.f8050 < 0) {
                            iM11307 = C19806.m45029("ۛ᩸") ^ i4;
                            i5 = ((iM11307 ^ i3) * (-30623)) ^ 350164165;
                            i6 = -2066036960;
                            break;
                        }
                        iM11307 = C19806.m45029("ܰ᩶") ^ i4;
                        i5 = ((iM11307 ^ i3) * (-9419)) ^ 1849734902;
                        i6 = 1748255036;
                        break;
                    case -779167942:
                    case -26702904:
                        m40031();
                        if (!C0797.f3386) {
                            iM11307 = ThreadFactoryC3888.m11306("ۙܺ") ^ i3;
                            i5 = ((iM11307 ^ i4) * (-8269)) ^ 1240214551;
                            i6 = 49381770;
                            break;
                        }
                        iM11307 = (ThreadFactoryC3888.m11306("᩻ܿ") + i3) * (-19);
                        i5 = ((iM11307 ^ i4) * 16725) ^ 753699397;
                        i6 = -1337192116;
                        break;
                        break;
                    case -644450192:
                    case 1085785994:
                        return c11986;
                    case -167746782:
                    case 1516260220:
                        if (!C0629.m2907()) {
                            iM11307 = (i3 - C19806.m45029("֡᩷")) * 7;
                            i5 = ((iM11307 ^ i4) * (-14737)) ^ 1914460467;
                            i6 = 1775508442;
                            break;
                            break;
                        }
                        iM11307 = C19806.m45029("ۙۗ") ^ i4;
                        i5 = ((iM11307 ^ i3) * (-16171)) ^ 1511347377;
                        i6 = 561491514;
                        break;
                    case 288701028:
                    case 895966392:
                        if (!C0797.m3359()) {
                            iM11307 = ThreadFactoryC3888.m11306("ۙܿ") ^ i4;
                            i5 = ((iM11307 ^ i3) * (-32601)) ^ 1596927619;
                            i6 = 1696071218;
                            break;
                            break;
                        }
                        iM11307 = ThreadFactoryC3888.m11306("֡ۡ") ^ i4;
                        i5 = ((iM11307 ^ i3) * 22215) ^ 59574338;
                        i6 = -1884441270;
                        break;
                        break;
                    case 297607890:
                    case 1953004210:
                        if (C1461.f5957 > 0) {
                            iM11307 = C19806.m45029("ܽۜ") ^ i3;
                            i5 = ((iM11307 ^ i4) * (-5183)) ^ 1423697340;
                            i6 = -1838200318;
                            break;
                        }
                        iM11307 = ThreadFactoryC3888.m11306("ۙܿ") ^ i4;
                        i5 = ((iM11307 ^ i3) * (-32601)) ^ 1596927619;
                        i6 = 1696071218;
                        break;
                        break;
                    case 691911767:
                    case 937665939:
                        RunnableC1606.m5473();
                        C0278.m1789();
                        return null;
                    case 1309543871:
                    case 1816302006:
                        if (!C0526.f2219) {
                            iM11307 = ThreadFactoryC3888.m11306("ܳۚ") ^ i4;
                            i5 = ((iM11307 ^ i3) * 18775) ^ 1676293952;
                            i6 = 943850838;
                            break;
                        }
                        iM11307 = ThreadFactoryC3888.m11306("ۙܿ") ^ i4;
                        i5 = ((iM11307 ^ i3) * (-32601)) ^ 1596927619;
                        i6 = 1696071218;
                        break;
                        break;
                    case 1517113179:
                    case 1834872007:
                        if (C1066.m4023() > 0) {
                            iM11307 = ThreadFactoryC3888.m11306("ܺۛ") ^ i3;
                            i5 = ((iM11307 ^ i4) * 3773) ^ (-253311955);
                            i6 = -609143558;
                            break;
                        }
                        iM11307 = ThreadFactoryC3888.m11306("֡ۡ") ^ i4;
                        i5 = ((iM11307 ^ i3) * 22215) ^ 59574338;
                        i6 = -1884441270;
                        break;
                        break;
                    default:
                        MenuItemOnMenuItemClickListenerC3244.m9701();
                        RunnableC1606.m5473();
                        iM11307 = ThreadFactoryC3888.m11306("ۙܿ") ^ i4;
                        i5 = ((iM11307 ^ i3) * (-32601)) ^ 1596927619;
                        i6 = 1696071218;
                        break;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0094 A[PHI: r8
      0x0094: PHI (r8v8 l.ۡۚۘ) = (r8v7 l.ۡۚۘ), (r8v4 l.ۡۚۘ), (r8v4 l.ۡۚۘ), (r8v4 l.ۡۚۘ) binds: [B:29:0x0092, B:18:0x0058, B:15:0x0041, B:12:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0139 A[PHI: r2
      0x0139: PHI (r2v5 java.lang.Class<l.ܿۚۘ>) = 
      (r2v2 java.lang.Class<l.ܿۚۘ>)
      (r2v2 java.lang.Class<l.ܿۚۘ>)
      (r2v3 java.lang.Class<l.ܿۚۘ>)
      (r2v2 java.lang.Class<l.ܿۚۘ>)
     binds: [B:49:0x0137, B:41:0x00fd, B:22:0x0069, B:9:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0168  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40023(int i, int i2) {
        int iM45029;
        int i3;
        ArrayList arrayList = null;
        Class<C17132> cls = null;
        int i4 = 1026313652;
        int i5 = C7105.f23796;
        int i6 = C10634.f36300;
        int iM450210 = (i5 - C19806.m45029("ۗۨ")) * (-71);
        int i7 = ((iM450210 ^ i6) * (-26493)) ^ 1695336404;
        int i8 = -2105647014;
        while (true) {
            int i9 = iM450210 ^ i8;
            RunnableC8666 runnableC8666 = null;
            while (true) {
                i4 = ((((i4 ^ i6) * (-12371)) >> 31) & i7) ^ i9;
                switch (i4) {
                    case -2137150818:
                    case -1723724650:
                        C23520.m51798(i, i2, arrayList);
                        if (C1066.f4915 > 0) {
                            runnableC8666 = new RunnableC8666(0);
                            if (ThreadFactoryC3888.f14547 <= 0) {
                                iM45029 = (C19806.m45029("ܺ۬") ^ i6) * 35;
                                i7 = ((iM45029 ^ i5) * 13161) ^ 831798158;
                                i3 = -54492254;
                            } else {
                                iM45029 = C19806.m45029("֫֨") ^ i6;
                                i7 = ((iM45029 ^ i5) * 28907) ^ 149234050;
                                i3 = -534820605;
                            }
                            i9 = iM45029 ^ i3;
                        }
                        break;
                    case -2053885893:
                    case 652931765:
                        m40031();
                        if (C1875.m6086() != 0) {
                            iM45029 = (i6 - C19806.m45029("᩵ܿ")) * (-89);
                            i7 = ((iM45029 ^ i5) * (-24709)) ^ 388882974;
                            i3 = -492934271;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("᩻ۘ") + i5) * 123;
                            i7 = ((iM45029 ^ i6) * (-10887)) ^ (-582652806);
                            i3 = 1724345097;
                        }
                        i9 = iM45029 ^ i3;
                        break;
                    case -1986255856:
                    case -1586832870:
                        if (C7105.m18985()) {
                            iM45029 = C19806.m45029("ۤۖ") ^ i6;
                            i7 = ((iM45029 ^ i5) * (-2557)) ^ (-1854758020);
                            i3 = -61871233;
                        } else {
                            iM45029 = (i5 - ThreadFactoryC3888.m11306("ۤ۟")) * 45;
                            i7 = ((iM45029 ^ i6) * 13045) ^ 1680052386;
                            i3 = -1815790668;
                        }
                        i9 = iM45029 ^ i3;
                        break;
                    case -1890164456:
                    case -842340580:
                        C4716.m13051(runnableC8666, cls, 500L);
                        break;
                    case -1669686460:
                    case 1595605045:
                        cls = C17132.class;
                        if (C1025.f4800 >= 0) {
                            iM45029 = C19806.m45029("ۤۖ") ^ i6;
                            i7 = ((iM45029 ^ i5) * (-2557)) ^ (-1854758020);
                            i3 = -61871233;
                        } else {
                            iM45029 = C19806.m45029("᩺ۗ") ^ i5;
                            i7 = ((iM45029 ^ i6) * (-7315)) ^ (-245467295);
                            i3 = 1160843178;
                        }
                        i9 = iM45029 ^ i3;
                        break;
                    case -1081536942:
                    case 1224192376:
                        if (ThreadFactoryC3888.f14547 <= 0) {
                            iM45029 = C19806.m45029("ۤۖ") ^ i6;
                            i7 = ((iM45029 ^ i5) * (-2557)) ^ (-1854758020);
                            i3 = -61871233;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ۖ᩵") ^ i6;
                            i7 = ((iM45029 ^ i5) * (-9363)) ^ (-1396072975);
                            i3 = 982524431;
                        }
                        i9 = iM45029 ^ i3;
                        break;
                    case -1024715266:
                    case 1007270222:
                        C1460.m5050();
                        C3743.m10966();
                        iM45029 = (C19806.m45029("ܺ۬") ^ i6) * 35;
                        i7 = ((iM45029 ^ i5) * 13161) ^ 831798158;
                        i3 = -54492254;
                        i9 = iM45029 ^ i3;
                        break;
                    case -843950143:
                    case 366504979:
                        if (RunnableC1564.f6300) {
                            iM45029 = (i6 - C19806.m45029("᩵ܿ")) * (-89);
                            i7 = ((iM45029 ^ i5) * (-24709)) ^ 388882974;
                            i3 = -492934271;
                        } else {
                            iM45029 = C19806.m45029("ۤۖ") ^ i6;
                            i7 = ((iM45029 ^ i5) * (-2557)) ^ (-1854758020);
                            i3 = -61871233;
                        }
                        i9 = iM45029 ^ i3;
                        break;
                    case -480075035:
                    case -307510562:
                        if (C1148.m4232() <= 0) {
                            iM45029 = (i6 - C19806.m45029("᩵ܿ")) * (-89);
                            i7 = ((iM45029 ^ i5) * (-24709)) ^ 388882974;
                            i3 = -492934271;
                        } else {
                            iM45029 = (C19806.m45029("ۛۘ") + i5) * 13;
                            i7 = ((iM45029 ^ i6) * (-8627)) ^ 1269422785;
                            i3 = -826322164;
                        }
                        i9 = iM45029 ^ i3;
                        break;
                    case 12127248:
                    case 1140058025:
                        if (!C2871.m8646()) {
                        }
                        iM45029 = (i6 - C19806.m45029("۟᩷")) * 49;
                        i7 = ((iM45029 ^ i5) * 14987) ^ 2057463118;
                        i3 = -953037829;
                        i9 = iM45029 ^ i3;
                        break;
                        break;
                    case 140562688:
                    case 1493551725:
                        arrayList = f54638;
                        if (C2477.f9839 > 0) {
                            iM45029 = C19806.m45029("᩸᩵") ^ i5;
                            i7 = ((iM45029 ^ i6) * 11729) ^ 2140411137;
                            i3 = 1394939716;
                            i9 = iM45029 ^ i3;
                        }
                        break;
                    case 256067375:
                    case 1545042068:
                        if (!C7105.m18985()) {
                            iM45029 = C19806.m45029("۫ۘ") ^ i6;
                            i7 = ((iM45029 ^ i5) * 17757) ^ (-1382419330);
                            i3 = 1387258872;
                            i9 = iM45029 ^ i3;
                        }
                        break;
                    case 326948192:
                    case 2063437094:
                        C0526.m2437();
                        if (C0050.f912 <= 0) {
                            iM45029 = (C19806.m45029("ܺ۬") ^ i6) * 35;
                            i7 = ((iM45029 ^ i5) * 13161) ^ 831798158;
                            i3 = -54492254;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("۫֡") ^ i5;
                            i7 = ((iM45029 ^ i6) * 24905) ^ (-99603758);
                            i3 = -160616329;
                        }
                        i9 = iM45029 ^ i3;
                        break;
                    case 1129040742:
                    case 1236544440:
                        if (C1148.m4232() > 0) {
                            iM45029 = (C19806.m45029("ܺ۬") ^ i6) * 35;
                            i7 = ((iM45029 ^ i5) * 13161) ^ 831798158;
                            i3 = -54492254;
                        } else {
                            iM45029 = (i6 - C19806.m45029("᩵ܿ")) * (-89);
                            i7 = ((iM45029 ^ i5) * (-24709)) ^ 388882974;
                            i3 = -492934271;
                        }
                        i9 = iM45029 ^ i3;
                        break;
                    default:
                        C0817.m3399();
                        break;
                }
                return;
            }
            iM450210 = C19806.m45029("ܶ᩺") ^ i5;
            i7 = ((iM450210 ^ i6) * 17153) ^ 1933584530;
            i8 = -541277384;
        }
    }

    static {
        ApplicationC6132.m17119(138);
        f54641 = new short[]{3408, -20641, -20669, -20646, -20664, -20666, -20671, -20644, 652, -26380, -26392, -26383, -26397, -26387, -26390, -26453, 6431, 19736, 19715, 19740, 19739, 19715, 19741, 19738, 19715, 19741, 19738, 19715, 19740, 19733, 19715, 19741, 19733, 19715, 19740, 19732, 19740, 19741, 19740, 19740, 19740, 19743, 19740, 19743, 19809, 19740, 19742, 19740, 19737, 19740, 19736, 19740, 19739, 6796, 9622, -11689, -8620, 9693, 14364, 354, -30773, -30777, -30776, -30769, -30784, -30781, -30763, -30766, -30840, -30772, -30763, -30775, -30776, -1104, -12099, -342, -30804, 1903, -22760, 21476, 18336, -20815, -29010, -30168, -20281, -18601, -19386, -21283, -17452, -19225, -31619, 23530, 18173, -10149, -10192, -10195, -10183, -10143, -10195, -10118, -10175, -10195, -10150, -10145, -10147, -10149, -10192, -10195, -10183, -10143, -10195, -10118, -10175, -10195, -10150, -10145, -10194, -10147, -10198, -10149, -10192, -10195, -10183, -10143, -10195, -10118, -10175, -10195, -10150, -10145, -10147, 24015, 21623, -30097, 16901, 19992, 21157, 7692, 21919, 21936, 21945, 21949, 21934, 22012, 21944, 21949, 21928, 21949, 21990, 22012, 21946, 21941, 21936, 21945, 21935, 2023, 4484, 4515, 4542, 4537, 4524, 4513, 4513, 4516, 4515, 4522, 4579, 4579, 4579, 4589, 4526, 4514, 4521, 4520, 4579, 4519, 4524, 4543, 4513, 4516, 4527, 4542, 4578, 4579, 4519, 4524, 4539, 4524, 4542, 4543, 4526, 4578, 4526, 4514, 4512, 4541, 4516, 4513, 4520, 4524, 4542, 4542, 4520, 4537, 4542, 4578, 4579, 4512, 4537, 4513, 4542, 4543, 4526, 4513, 4516, 4527, 4542, 4526, 4513, 4524, 4542, 4542, 4520, 4542, 4542, 4543, 4526, 4579, 4519, 4524, 4543, 4497, 4527, 4524, 4515, 4521, 4543, 4514, 4516, 4521, 4497, 4579, 4542, 4536, 4541, 4541, 4514, 4543, 4537, 4497, 4579, 4524, 4515, 4515, 4514, 4537, 4524, 4537, 4516, 4514, 4515, 4497, 4579, 4524, 4515, 4521, 4543, 4514, 4516, 4521, 4533, 4579, 4524, 4515, 4515, 4514, 4537, 4524, 4537, 4516, 4514, 4515, 4579, 4497, 4527, 4480, 4505, 4509, 4513, 4536, 4522, 4516, 4515, 4494, 4514, 4515, 4537, 4520, 4533, 4537, 4497, 4527, 4509, 4513, 4536, 4522, 4516, 4515, 4494, 4514, 4515, 4537, 4520, 4533, 4537, 4526, 4514, 4521, 4520, 4498, 4541, 4524, 4537, 4526, 4517, 4541, 4513, 4536, 4522, 4516, 4515, 4579, 4512, 4537, 4541, 4523, 4516, 4513, 4520, 4542, 4484, 4515, 4542, 4537, 4524, 4513, 4513, 4589, 4523, 4524, 4516, 4513, 4579, 4589, 4581, 4480, 4514, 4539, 4520, 4589, 4521, 4516, 4543, 4580, 4510, 4536, 4526, 4526, 4520, 4542, 4542, 4523, 4536, 4513, 4589, 4516, 4515, 4542, 4537, 4524, 4513, 4513, 4524, 4537, 4516, 4514, 4515, 4579, 1422, 6907, 6887, 6910, 6892, 6882, 6885, 5454, -25314, -25306, -25308, -25291, -25326, -25303, -25312, -25293, -25308, -25307, -25327, -25293, -25308, -25305, -25308, -25293, -25308, -25297, -25310, -25308, -25294, -25239, -25233, -25233, -25233, -25240, 4147, 11454, 11442, 11449, 11448, 11454, 11442, 11449, 11448, 11394, 11437, 11452, 11433, 11454, 11445, 11437, 11441, 11432, 11450, 11444, 11443, 11507, 11440, 11433, 11437, 11408, 11417, 11496, 11517, 11454, 11445, 11452, 11443, 11450, 11448, 11449, 11495, 11517, 8521, 21234, 6918, -10854, -10847, -10842, -10847, -10820, -10821, -10834, -10845, -10845, -10763, -10769};
        AbstractC20745 abstractC20745 = null;
        String strM10790 = null;
        ArrayList arrayList = null;
        C9186 c9186 = null;
        short s = 0;
        short s2 = 0;
        int i = 0;
        int i2 = 0;
        short[] sArr = null;
        int i3 = 0;
        int i4 = -1468840218;
        int i5 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int i6 = C1977.f7413;
        int iM11306 = (i6 - ThreadFactoryC3888.m11306("ۧۜ")) * (-125);
        int i7 = ((iM11306 ^ i5) * (-7205)) ^ 928497112;
        int i8 = 543941357;
        while (true) {
            i4 = ((((i4 ^ i5) * (-10931)) >> 31) & i7) ^ (iM11306 ^ i8);
            switch (i4) {
                case -2076651541:
                case -1324132443:
                    if (!CallableC1627.f6528) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ܿ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 927) ^ (-1875642410);
                        i8 = 1374851122;
                    } else {
                        iM11306 = C19806.m45029("ۚ᩹") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-19279)) ^ 1157766851;
                        i8 = 1755207620;
                    }
                    break;
                case -1998283372:
                case 2019386205:
                    f54643 = arrayList;
                    f54640 = new C21445();
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = C19806.m45029("ۚ᩹") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-19279)) ^ 1157766851;
                        i8 = 1755207620;
                    } else {
                        iM11306 = C19806.m45029("ܶ᩺") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-14395)) ^ 372463990;
                        i8 = 1177384981;
                    }
                    break;
                case -1702216988:
                case -385307752:
                    C0526.m2437();
                    if (!C1377.f5749) {
                        iM11306 = (i5 - C19806.m45029("ۢ۬")) * 49;
                        i7 = ((iM11306 ^ i6) * (-26245)) ^ (-1021320307);
                        i8 = 1613277816;
                    } else {
                        iM11306 = C19806.m45029("ۚ᩹") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-19279)) ^ 1157766851;
                        i8 = 1755207620;
                    }
                    break;
                case -1497194242:
                case -104476045:
                    int i9 = (s * s) + 21316689;
                    if (i - (i9 + i9) <= 0) {
                        iM11306 = (i6 - C19806.m45029("᩷᩵")) * (-7);
                        i7 = ((iM11306 ^ i5) * 11897) ^ 535483554;
                        i8 = 1904373684;
                    } else {
                        iM11306 = C19806.m45029("ۡ᩻") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-3883)) ^ (-763877183);
                        i8 = 498444272;
                    }
                    break;
                case -1387238525:
                case -416311386:
                    f54638 = new ArrayList();
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚܽ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 14331) ^ (-1465888948);
                        i8 = -930120509;
                    } else {
                        iM11306 = C19806.m45029("᩵ܰ") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-30697)) ^ 1092544582;
                        i8 = 1698951557;
                    }
                    break;
                case -1334987070:
                case 615978841:
                    i2 = 44847;
                    iM11306 = (C19806.m45029("ۡ۠") + i5) * 29;
                    i7 = ((iM11306 ^ i6) * (-16199)) ^ (-628386896);
                    i8 = -116086073;
                    break;
                case -1224027450:
                case 1455466974:
                    f54645 = 0;
                    if (C3535.f13026 > 0) {
                        f54637 = new C9186(C2788.m8476(0));
                        c9186 = C3141.f11846;
                        if (C1668.m5583()) {
                            iM11306 = ThreadFactoryC3888.m11306("ۡ֨") ^ i6;
                            i7 = ((iM11306 ^ i5) * 11307) ^ 440411058;
                            i8 = 1799804326;
                        }
                        break;
                    }
                    iM11306 = C19806.m45029("ۚ᩹") ^ i5;
                    i7 = ((iM11306 ^ i6) * (-19279)) ^ 1157766851;
                    i8 = 1755207620;
                    break;
                case -1199293017:
                case 1859647182:
                    f54639 = C1189.m4364(abstractC20745, strM10790);
                    arrayList = new ArrayList();
                    if (C0216.f1393 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚܽ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 14331) ^ (-1465888948);
                        i8 = -930120509;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ֡") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-22871)) ^ 598593616;
                        i8 = 710416539;
                    }
                    break;
                case -1128833539:
                case -796925503:
                    i2 = 5718;
                    iM11306 = (C19806.m45029("ۡ۠") + i5) * 29;
                    i7 = ((iM11306 ^ i6) * (-16199)) ^ (-628386896);
                    i8 = -116086073;
                    break;
                case -1002319879:
                case 765420067:
                    abstractC20745 = C11904.f39938;
                    sArr = f54641;
                    i3 = 1;
                    if (C1937.m6279() >= 0) {
                        iM11306 = C19806.m45029("ۚ᩹") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-19279)) ^ 1157766851;
                        i8 = 1755207620;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ܽ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 4151) ^ 1794013717;
                        i8 = -1487755654;
                    }
                    break;
                case -912479060:
                case 1494133571:
                    C3286.m9798();
                    C2249.m6915();
                    throw new RuntimeException();
                case -865427707:
                case 557347411:
                    int i10 = s + s2;
                    i = i10 * i10;
                    if (AbstractC0464.m2313() != 0) {
                        iM11306 = (i5 - C19806.m45029("ۢ۬")) * 49;
                        i7 = ((iM11306 ^ i6) * (-26245)) ^ (-1021320307);
                        i8 = 1613277816;
                    } else {
                        iM11306 = C19806.m45029("ۘ᩶") ^ i6;
                        i7 = ((iM11306 ^ i5) * 30887) ^ 1592942678;
                        i8 = -1413439127;
                    }
                    break;
                case -741996448:
                case 674525478:
                    s = f54641[0];
                    s2 = 4617;
                    if (C2332.m7079() <= 0) {
                        iM11306 = (i5 - C19806.m45029("ۢ۬")) * 49;
                        i7 = ((iM11306 ^ i6) * (-26245)) ^ (-1021320307);
                        i8 = 1613277816;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ۧ") + i5) * 63;
                        i7 = ((iM11306 ^ i6) * (-19063)) ^ 2127795352;
                        i8 = 1814325087;
                    }
                    break;
                case -687283900:
                case 927291226:
                    f54642 = true;
                    f54644 = new AtomicBoolean();
                    if (CallableC1627.m5507() != 0) {
                        iM11306 = (i5 - C19806.m45029("ۢ۬")) * 49;
                        i7 = ((iM11306 ^ i6) * (-26245)) ^ (-1021320307);
                        i8 = 1613277816;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫᩷") + i5) * (-51);
                        i7 = ((iM11306 ^ i6) * (-14919)) ^ (-1984398797);
                        i8 = 1534033729;
                    }
                    break;
                case -178788416:
                case 879379230:
                    strM10790 = C3660.m10790(sArr, i3, 7, i2);
                    if (C3743.m10966() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ܿ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 927) ^ (-1875642410);
                        i8 = 1374851122;
                    } else {
                        iM11306 = C19806.m45029("ᩴۖ") ^ i5;
                        i7 = ((iM11306 ^ i6) * 14017) ^ (-502190344);
                        i8 = 428151538;
                    }
                    break;
                case 66335155:
                case 1842301423:
                    if (C2477.f9839 > 0) {
                        iM11306 = C19806.m45029("ۚ᩹") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-19279)) ^ 1157766851;
                        i8 = 1755207620;
                    } else {
                        iM11306 = C19806.m45029("᩺᩶") ^ i6;
                        i7 = ((iM11306 ^ i5) * 27683) ^ 1158728380;
                        i8 = -988448506;
                    }
                    break;
                case 930408683:
                case 960729797:
                    c9186.m44961((InterfaceC10597) new C7960());
                    return;
                default:
                    C2124.m6673();
                    iM11306 = C19806.m45029("ۚ᩹") ^ i5;
                    i7 = ((iM11306 ^ i6) * (-19279)) ^ 1157766851;
                    i8 = 1755207620;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m40037() {
        boolean z = false;
        AtomicBoolean atomicBoolean = null;
        boolean z2 = false;
        RuntimeException e = null;
        int i = -703572747;
        int i2 = C1419.f5860;
        int i3 = C1189.f5284;
        int iM45029 = C19806.m45029("᩹ᩳ") ^ i2;
        int i4 = ((iM45029 ^ i3) * 13581) ^ 983605059;
        int i5 = -1252019005;
        while (true) {
            i = ((((i ^ i3) * (-28335)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2100042850:
                case 1734665249:
                    if (C2788.f10625 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 23285) ^ (-183428975);
                        i5 = -1383914993;
                    } else {
                        iM45029 = C19806.m45029("ᩴᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-21673)) ^ 943533433;
                        i5 = -901001971;
                    }
                    break;
                case -2092096824:
                case 865777732:
                    if (C1025.f4800 < 0) {
                        iM45029 = C19806.m45029("֡᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 26701) ^ (-1731742394);
                        i5 = -1446564141;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨۬") ^ i2) * (-7);
                        i4 = ((iM45029 ^ i3) * (-5901)) ^ 1297975052;
                        i5 = -1340546541;
                    }
                    break;
                case -2053920749:
                case 1064824893:
                    if (C1025.f4800 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 23285) ^ (-183428975);
                        i5 = -1383914993;
                    } else {
                        iM45029 = (C19806.m45029("᩶ۗ") + i2) * 87;
                        i4 = ((iM45029 ^ i3) * (-8429)) ^ (-551525287);
                        i5 = 1907411538;
                    }
                    break;
                case -2009617286:
                case 1735349555:
                    if (C3286.f12186) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-16049)) ^ (-792212690);
                        i5 = -1296972131;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * 29511) ^ (-1760099855);
                        i5 = -1295770542;
                    }
                    break;
                case -1892672693:
                case -837591139:
                    if (C1419.m4973()) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨۬") ^ i2) * (-7);
                        i4 = ((iM45029 ^ i3) * (-5901)) ^ 1297975052;
                        i5 = -1340546541;
                    } else {
                        iM45029 = C19806.m45029("֫ۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-14613)) ^ (-1775204516);
                        i5 = 1328675985;
                    }
                    break;
                case -1880252709:
                case -1844086282:
                    if (C2642.f10294 <= 0) {
                        iM45029 = (i3 - C19806.m45029("ܰܳ")) * (-97);
                        i4 = ((iM45029 ^ i2) * (-30767)) ^ 302875364;
                        i5 = 1175462614;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ۬") ^ i2) * 61;
                        i4 = ((iM45029 ^ i3) * 18659) ^ 645550794;
                        i5 = -392221034;
                    }
                    break;
                case -1736300707:
                case 2022096348:
                    C0962.m3746();
                    RunnableC1606.m5473();
                    return;
                case -1485056719:
                case 956123270:
                    z2 = false;
                    if (atomicBoolean.compareAndSet(false, z)) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴۢ") + i2) * (-107);
                        i4 = ((iM45029 ^ i3) * (-18613)) ^ (-540043889);
                        i5 = -1488672021;
                    } else {
                        iM45029 = C19806.m45029("ۡۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 14505) ^ 309653244;
                        i5 = -1171977881;
                    }
                    break;
                case -1202661043:
                case 264760375:
                    if (RunnableC0195.m1431()) {
                        iM45029 = ThreadFactoryC3888.m11306("֡֡") ^ i3;
                        i4 = ((iM45029 ^ i2) * 20931) ^ (-909608760);
                        i5 = 388586274;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨۬") ^ i2) * (-7);
                        i4 = ((iM45029 ^ i3) * (-5901)) ^ 1297975052;
                        i5 = -1340546541;
                    }
                    break;
                case -908759593:
                case -645833701:
                    C1377.m4833();
                    iM45029 = (ThreadFactoryC3888.m11306("֨۬") ^ i2) * (-7);
                    i4 = ((iM45029 ^ i3) * (-5901)) ^ 1297975052;
                    i5 = -1340546541;
                    break;
                case -899453072:
                case 896067449:
                    return;
                case -338912513:
                case -20073678:
                    if (C1377.f5749) {
                        iM45029 = C19806.m45029("ܳ۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31137)) ^ (-701683596);
                        i5 = -5520666;
                    } else {
                        iM45029 = C19806.m45029("֡᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 26701) ^ (-1731742394);
                        i5 = -1446564141;
                    }
                    break;
                case -314249643:
                case -278821654:
                    return;
                case 393797806:
                case 1000677901:
                    if (C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-16049)) ^ (-792212690);
                        i5 = -1296972131;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 19069) ^ (-594378661);
                        i5 = 1519439403;
                    }
                    break;
                case 436752479:
                case 1018212857:
                    atomicBoolean.set(z2);
                    throw e;
                case 535333384:
                case 600010717:
                    if (C1460.f5948 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 23285) ^ (-183428975);
                        i5 = -1383914993;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ۨ") + i3) * 57;
                        i4 = ((iM45029 ^ i2) * 31427) ^ 733771289;
                        i5 = -1492360463;
                    }
                    break;
                case 884137004:
                case 1729177763:
                    if (C1460.f5948 < 0) {
                        iM45029 = (i3 - C19806.m45029("ܰܳ")) * (-97);
                        i4 = ((iM45029 ^ i2) * (-30767)) ^ 302875364;
                        i5 = 1175462614;
                    } else {
                        iM45029 = C19806.m45029("֡᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 26701) ^ (-1731742394);
                        i5 = -1446564141;
                    }
                    break;
                case 1258809215:
                case 2015621210:
                    if (!C3743.f13569) {
                        iM45029 = C19806.m45029("֡᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 26701) ^ (-1731742394);
                        i5 = -1446564141;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-16049)) ^ (-792212690);
                        i5 = -1296972131;
                    }
                    break;
                case 1404500221:
                case 1627189923:
                    z = true;
                    atomicBoolean = f54644;
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨۬") ^ i2) * (-7);
                        i4 = ((iM45029 ^ i3) * (-5901)) ^ 1297975052;
                        i5 = -1340546541;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܳ֫")) * (-103);
                        i4 = ((iM45029 ^ i2) * (-21667)) ^ (-2034231652);
                        i5 = -996161121;
                    }
                    break;
                default:
                    try {
                        C4716.f16635.execute(new RunnableC19249());
                        iM45029 = (ThreadFactoryC3888.m11306("ۨᩴ") ^ i3) * (-123);
                        i4 = ((iM45029 ^ i2) * 1141) ^ (-942903560);
                        i5 = -478217884;
                    } catch (RuntimeException e2) {
                        e = e2;
                        iM45029 = ThreadFactoryC3888.m11306("ۙܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 24679) ^ 7508354;
                        i5 = -384801804;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004f A[PHI: r3
      0x004f: PHI (r3v4 java.lang.StringBuilder) = 
      (r3v2 java.lang.StringBuilder)
      (r3v1 java.lang.StringBuilder)
      (r3v1 java.lang.StringBuilder)
      (r3v1 java.lang.StringBuilder)
     binds: [B:24:0x0085, B:16:0x005d, B:13:0x0058, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x01c6 A[PHI: r10 r17 r18
      0x01c6: PHI (r10v3 short) = (r10v2 short), (r10v1 short) binds: [B:53:0x01c4, B:38:0x0116] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r17v16 android.app.Application) = (r17v10 android.app.Application), (r17v17 android.app.Application) binds: [B:53:0x01c4, B:38:0x0116] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r18v2 android.content.SharedPreferences$Editor) = (r18v1 android.content.SharedPreferences$Editor), (r18v3 android.content.SharedPreferences$Editor) binds: [B:53:0x01c4, B:38:0x0116] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0219 A[PHI: r7 r8 r9 r17
      0x0219: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:58:0x01ff, B:6:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:58:0x01ff, B:6:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r9v3 int) = (r9v2 int), (r9v1 int) binds: [B:58:0x01ff, B:6:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r17v26 android.app.Application) = (r17v9 android.app.Application), (r17v27 android.app.Application) binds: [B:58:0x01ff, B:6:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02a3 A[PHI: r4 r6 r17
      0x02a3: PHI (r4v3 short[]) = (r4v2 short[]), (r4v1 short[]), (r4v1 short[]) binds: [B:72:0x02a1, B:64:0x024d, B:17:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x02a3: PHI (r6v3 short) = (r6v1 short), (r6v2 short), (r6v1 short) binds: [B:72:0x02a1, B:64:0x024d, B:17:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x02a3: PHI (r17v20 android.app.Application) = (r17v6 android.app.Application), (r17v8 android.app.Application), (r17v21 android.app.Application) binds: [B:72:0x02a1, B:64:0x024d, B:17:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (l.C2249.f8050 < 0) goto L17;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m40036(java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17132.m40036(java.lang.String):void");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m40032() {
        m40031();
        return f54645;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C9186 m40016() {
        m40031();
        return f54637;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00fe A[PHI: r2 r4 r13 r14
      0x00fe: PHI (r2v47 l.᩸۠) = (r2v31 l.᩸۠), (r2v1 l.᩸۠), (r2v1 l.᩸۠) binds: [B:35:0x00fc, B:27:0x00a5, B:83:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r4v5 l.᩷۠ۚ) = (r4v1 l.᩷۠ۚ), (r4v2 l.᩷۠ۚ), (r4v1 l.᩷۠ۚ) binds: [B:35:0x00fc, B:27:0x00a5, B:83:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r13v5 short[]) = (r13v1 short[]), (r13v2 short[]), (r13v1 short[]) binds: [B:35:0x00fc, B:27:0x00a5, B:83:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r14v5 int) = (r14v1 int), (r14v2 int), (r14v1 int) binds: [B:35:0x00fc, B:27:0x00a5, B:83:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        if (l.C3743.m10966() <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        r19 = r2;
        r22 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if (l.C1377.f5749 == false) goto L9;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m40024(java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17132.m40024(java.lang.String):void");
    }

    /* JADX WARN: Code duplicated, block: B:80:0x036f A[PHI: r1 r3 r5 r10 r15 r19 r20
      0x036f: PHI (r1v21 int) = (r1v7 int), (r1v11 int), (r1v22 int) binds: [B:79:0x036d, B:62:0x02a9, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x036f: PHI (r3v15 int) = (r3v3 int), (r3v7 int), (r3v16 int) binds: [B:79:0x036d, B:62:0x02a9, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x036f: PHI (r5v22 l.᩷۠ۚ) = (r5v6 l.᩷۠ۚ), (r5v10 l.᩷۠ۚ), (r5v23 l.᩷۠ۚ) binds: [B:79:0x036d, B:62:0x02a9, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x036f: PHI (r10v20 int) = (r10v6 int), (r10v10 int), (r10v21 int) binds: [B:79:0x036d, B:62:0x02a9, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x036f: PHI (r15v23 short[]) = (r15v9 short[]), (r15v13 short[]), (r15v24 short[]) binds: [B:79:0x036d, B:62:0x02a9, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x036f: PHI (r19v15 l.ۖۢ᩺) = (r19v4 l.ۖۢ᩺), (r19v8 l.ۖۢ᩺), (r19v16 l.ۖۢ᩺) binds: [B:79:0x036d, B:62:0x02a9, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x036f: PHI (r20v15 short) = (r20v4 short), (r20v8 short), (r20v16 short) binds: [B:79:0x036d, B:62:0x02a9, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x03a8 A[PHI: r1 r3 r5 r10 r15 r16 r19 r20
      0x03a8: PHI (r1v12 int) = (r1v5 int), (r1v6 int), (r1v10 int), (r1v13 int) binds: [B:11:0x0068, B:83:0x03a6, B:66:0x02d0, B:53:0x024c] A[DONT_GENERATE, DONT_INLINE]
      0x03a8: PHI (r3v8 int) = (r3v1 int), (r3v2 int), (r3v6 int), (r3v9 int) binds: [B:11:0x0068, B:83:0x03a6, B:66:0x02d0, B:53:0x024c] A[DONT_GENERATE, DONT_INLINE]
      0x03a8: PHI (r5v11 l.᩷۠ۚ) = (r5v4 l.᩷۠ۚ), (r5v5 l.᩷۠ۚ), (r5v9 l.᩷۠ۚ), (r5v12 l.᩷۠ۚ) binds: [B:11:0x0068, B:83:0x03a6, B:66:0x02d0, B:53:0x024c] A[DONT_GENERATE, DONT_INLINE]
      0x03a8: PHI (r10v11 int) = (r10v4 int), (r10v5 int), (r10v9 int), (r10v12 int) binds: [B:11:0x0068, B:83:0x03a6, B:66:0x02d0, B:53:0x024c] A[DONT_GENERATE, DONT_INLINE]
      0x03a8: PHI (r15v14 short[]) = (r15v7 short[]), (r15v8 short[]), (r15v12 short[]), (r15v15 short[]) binds: [B:11:0x0068, B:83:0x03a6, B:66:0x02d0, B:53:0x024c] A[DONT_GENERATE, DONT_INLINE]
      0x03a8: PHI (r16v2 int) = (r16v1 int), (r16v1 int), (r16v1 int), (r16v3 int) binds: [B:11:0x0068, B:83:0x03a6, B:66:0x02d0, B:53:0x024c] A[DONT_GENERATE, DONT_INLINE]
      0x03a8: PHI (r19v9 l.ۖۢ᩺) = (r19v2 l.ۖۢ᩺), (r19v3 l.ۖۢ᩺), (r19v7 l.ۖۢ᩺), (r19v10 l.ۖۢ᩺) binds: [B:11:0x0068, B:83:0x03a6, B:66:0x02d0, B:53:0x024c] A[DONT_GENERATE, DONT_INLINE]
      0x03a8: PHI (r20v9 short) = (r20v2 short), (r20v3 short), (r20v7 short), (r20v10 short) binds: [B:11:0x0068, B:83:0x03a6, B:66:0x02d0, B:53:0x024c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40028(AbstractC20745 abstractC20745, boolean z, boolean z2, InterfaceC12194 interfaceC12194) throws Throwable {
        AbstractC20745 abstractC20746;
        int i;
        int i2;
        C2455 c2455;
        short s;
        int i3;
        short[] sArr;
        int iM11306;
        int i4;
        int i5;
        AbstractC20745 abstractC20747;
        short s2;
        AbstractC20745 abstractC20748;
        int i6;
        C2455 c2456;
        short s3;
        int i7;
        short[] sArr2;
        int iM11307;
        int i8;
        int i9;
        int iM11308;
        int i10;
        int i11;
        int i12 = C1025.f4800;
        int i13 = C0050.f912;
        int iM11309 = ThreadFactoryC3888.m11306("ۨܳ") ^ i12;
        int i14 = ((iM11309 ^ i13) * (-26435)) ^ 1071861924;
        C2455 c2457 = null;
        C2455 c2458 = null;
        Throwable th = null;
        short[] sArr3 = null;
        int i15 = iM11309 ^ (-849269764);
        int i16 = 1509843274;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        short s4 = 0;
        int i20 = 0;
        C2455 c2459 = null;
        AbstractC20745 abstractC20745M4219 = null;
        AbstractC20745 abstractC20749 = null;
        while (true) {
            i16 = i15 ^ (i14 & (((i16 ^ i13) * 9715) >> 31));
            switch (i16) {
                case -2073806762:
                case -1731224749:
                    abstractC20746 = abstractC20749;
                    i = i17;
                    i2 = i19;
                    c2455 = c2457;
                    s = s4;
                    i3 = i18;
                    sArr = sArr3;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = C19806.m45029("ܿܰ") ^ i12;
                        i4 = ((iM11306 ^ i13) * 23123) ^ (-2126012960);
                        i5 = 1701042998;
                    } else {
                        iM11306 = C19806.m45029("ۛܳ") ^ i12;
                        i4 = ((iM11306 ^ i13) * (-5093)) ^ 1142372370;
                        i5 = 307063732;
                    }
                    int i21 = iM11306 ^ i5;
                    i19 = i2;
                    abstractC20749 = abstractC20746;
                    i18 = i3;
                    sArr3 = sArr;
                    c2457 = c2455;
                    s4 = s;
                    i15 = i21;
                    i14 = i4;
                    i17 = i;
                    break;
                case -1984346313:
                case -541887230:
                    abstractC20746 = abstractC20749;
                    i = i17;
                    i2 = i19;
                    c2455 = c2457;
                    s = s4;
                    i3 = i18;
                    sArr = sArr3;
                    if (C10634.f36300 < 0) {
                        iM11306 = C19806.m45029("۠۬") ^ i13;
                        i4 = ((iM11306 ^ i12) * 19601) ^ 1118047233;
                        i5 = -1792810677;
                        int i22 = iM11306 ^ i5;
                        i19 = i2;
                        abstractC20749 = abstractC20746;
                        i18 = i3;
                        sArr3 = sArr;
                        c2457 = c2455;
                        s4 = s;
                        i15 = i22;
                        i14 = i4;
                        i17 = i;
                    } else {
                        s2 = s;
                        iM11307 = (ThreadFactoryC3888.m11306("֫ۘ") ^ i12) * 65;
                        i8 = ((iM11307 ^ i13) * 15539) ^ (-488798096);
                        i9 = -552738215;
                        i19 = i2;
                        abstractC20749 = abstractC20746;
                        i15 = iM11307 ^ i9;
                        sArr3 = sArr;
                        i16 = i16;
                        s4 = s2;
                        i17 = i;
                        i14 = i8;
                        i18 = i3;
                        c2457 = c2455;
                    }
                    break;
                case -1915144173:
                case 805836321:
                    abstractC20748 = abstractC20749;
                    i = i17;
                    i6 = i19;
                    c2456 = c2457;
                    s3 = s4;
                    i7 = i18;
                    sArr2 = sArr3;
                    try {
                        try {
                            C2455 c24510 = new C2455(abstractC20745);
                            int iM113010 = ThreadFactoryC3888.m11306("᩺ܺ") ^ i13;
                            int i23 = ((iM113010 ^ i12) * 25639) ^ 2059168604;
                            i15 = iM113010 ^ 1130785949;
                            c2459 = c24510;
                            i19 = i6;
                            i14 = i23;
                            i18 = i7;
                            sArr3 = sArr2;
                            c2457 = c2456;
                            s4 = s3;
                            abstractC20749 = abstractC20748;
                            i17 = i;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            c2458 = c2456;
                            c2459 = null;
                            int iM113011 = (ThreadFactoryC3888.m11306("ܺۛ") + i12) * 15;
                            i19 = i6;
                            i17 = i;
                            i18 = i7;
                            sArr3 = sArr2;
                            i16 = i16;
                            c2457 = c2456;
                            s4 = s3;
                            abstractC20749 = abstractC20748;
                            i15 = iM113011 ^ 963365889;
                            i14 = ((iM113011 ^ i13) * (-8505)) ^ (-664918981);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    break;
                case -1806952369:
                case 51450705:
                    C1377.m4829(c2458);
                    RunnableC3388.m10052(abstractC20745M4219);
                    throw th;
                case -1248913651:
                case 816750445:
                    AbstractC20745 abstractC207410 = abstractC20749;
                    int i24 = i17;
                    int i25 = i18;
                    int i26 = i19;
                    short s5 = s4;
                    short[] sArr4 = sArr3;
                    abstractC20745M4219 = C1148.m4219(C1668.m5585(abstractC207410, C3535.m10423(sArr4, i25, i24, i26)));
                    int iM45029 = (C19806.m45029("᩹ۡ") + i12) * 49;
                    int i27 = ((iM45029 ^ i13) * 857) ^ 2003466902;
                    i19 = i26;
                    abstractC20749 = abstractC207410;
                    i15 = iM45029 ^ (-1029286266);
                    sArr3 = sArr4;
                    i16 = i16;
                    s4 = s5;
                    i17 = i24;
                    c2457 = null;
                    i14 = i27;
                    i18 = i25;
                    break;
                case -1244477400:
                case 1105090511:
                    C10634.m26820();
                    return;
                case -1023654717:
                case -591147699:
                    abstractC20746 = abstractC20749;
                    i = i17;
                    sArr = sArr3;
                    i2 = i19;
                    c2455 = c2457;
                    i3 = i18;
                    s2 = f54641[388];
                    if (C2332.m7079() <= 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("֫ۘ") ^ i12) * 65;
                        i8 = ((iM11307 ^ i13) * 15539) ^ (-488798096);
                        i9 = -552738215;
                    } else {
                        iM11307 = C19806.m45029("֫᩷") ^ i13;
                        i8 = ((iM11307 ^ i12) * 12995) ^ (-1349643636);
                        i9 = 1284082736;
                    }
                    i19 = i2;
                    abstractC20749 = abstractC20746;
                    i15 = iM11307 ^ i9;
                    sArr3 = sArr;
                    i16 = i16;
                    s4 = s2;
                    i17 = i;
                    i14 = i8;
                    i18 = i3;
                    c2457 = c2455;
                    break;
                case -969868040:
                case 571224219:
                    C0050.m946();
                    if (C3660.f13403 < 0) {
                        abstractC20746 = abstractC20749;
                        i = i17;
                        i2 = i19;
                        c2455 = c2457;
                        s = s4;
                        i3 = i18;
                        sArr = sArr3;
                        iM11306 = (ThreadFactoryC3888.m11306("۬᩻") ^ i13) * 59;
                        i4 = ((iM11306 ^ i12) * (-24333)) ^ 319225857;
                        i5 = 390024626;
                        int i28 = iM11306 ^ i5;
                        i19 = i2;
                        abstractC20749 = abstractC20746;
                        i18 = i3;
                        sArr3 = sArr;
                        c2457 = c2455;
                        s4 = s;
                        i15 = i28;
                        i14 = i4;
                        i17 = i;
                    } else {
                        abstractC20747 = abstractC20749;
                        i2 = i19;
                        c2455 = c2457;
                        s = s4;
                        iM11308 = ThreadFactoryC3888.m11306("ܿܳ") ^ i12;
                        i10 = ((iM11308 ^ i13) * (-7095)) ^ 187470729;
                        i11 = 759533149;
                        int i29 = iM11308 ^ i11;
                        i19 = i2;
                        i16 = i16;
                        c2457 = c2455;
                        s4 = s;
                        abstractC20749 = abstractC20747;
                        i14 = i10;
                        i15 = i29;
                    }
                    break;
                case -828969659:
                case -208292436:
                    if (!C0962.f3784) {
                        abstractC20746 = abstractC20749;
                        i = i17;
                        i2 = i19;
                        c2455 = c2457;
                        s = s4;
                        i3 = i18;
                        sArr = sArr3;
                        iM11306 = C19806.m45029("ܿܰ") ^ i12;
                        i4 = ((iM11306 ^ i13) * 23123) ^ (-2126012960);
                        i5 = 1701042998;
                        int i210 = iM11306 ^ i5;
                        i19 = i2;
                        abstractC20749 = abstractC20746;
                        i18 = i3;
                        sArr3 = sArr;
                        c2457 = c2455;
                        s4 = s;
                        i15 = i210;
                        i14 = i4;
                        i17 = i;
                    } else {
                        abstractC20747 = abstractC20749;
                        i2 = i19;
                        c2455 = c2457;
                        s = s4;
                        iM11308 = ThreadFactoryC3888.m11306("ܿܳ") ^ i12;
                        i10 = ((iM11308 ^ i13) * (-7095)) ^ 187470729;
                        i11 = 759533149;
                        int i211 = iM11308 ^ i11;
                        i19 = i2;
                        i16 = i16;
                        c2457 = c2455;
                        s4 = s;
                        abstractC20749 = abstractC20747;
                        i14 = i10;
                        i15 = i211;
                    }
                    break;
                case -825695632:
                case 1347906408:
                    i19 = 15599;
                    int iM450210 = C19806.m45029("ܺۧ") ^ i12;
                    i17 = i17;
                    i18 = i18;
                    sArr3 = sArr3;
                    i16 = i16;
                    c2457 = c2457;
                    s4 = s4;
                    i15 = iM450210 ^ (-146655454);
                    i14 = ((iM450210 ^ i13) * (-7569)) ^ 1609739652;
                    abstractC20749 = abstractC20749;
                    break;
                case -720276949:
                case 670246144:
                    i2 = i19;
                    c2455 = c2457;
                    s = s4;
                    abstractC20747 = C11904.f39938;
                    sArr3 = f54641;
                    i18 = 389;
                    i17 = 6;
                    if (C7105.f23796 >= 0) {
                        iM11308 = ThreadFactoryC3888.m11306("ܿܳ") ^ i12;
                        i10 = ((iM11308 ^ i13) * (-7095)) ^ 187470729;
                        i11 = 759533149;
                    } else {
                        iM11308 = (C19806.m45029("ۖ᩶") ^ i13) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i10 = ((iM11308 ^ i12) * 19461) ^ 448647380;
                        i11 = -1247974426;
                    }
                    int i212 = iM11308 ^ i11;
                    i19 = i2;
                    i16 = i16;
                    c2457 = c2455;
                    s4 = s;
                    abstractC20749 = abstractC20747;
                    i14 = i10;
                    i15 = i212;
                    break;
                case -703139880:
                case 125860057:
                    i19 = 6795;
                    int iM450211 = C19806.m45029("ܺۧ") ^ i12;
                    i17 = i17;
                    i18 = i18;
                    sArr3 = sArr3;
                    i16 = i16;
                    c2457 = c2457;
                    s4 = s4;
                    i15 = iM450211 ^ (-146655454);
                    i14 = ((iM450211 ^ i13) * (-7569)) ^ 1609739652;
                    abstractC20749 = abstractC20749;
                    break;
                case -653679452:
                case 2003401605:
                    abstractC20746 = abstractC20749;
                    i = i17;
                    i2 = i19;
                    c2455 = c2457;
                    s = s4;
                    i3 = i18;
                    sArr = sArr3;
                    if (C3535.f13026 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۚ") ^ i13) * 13;
                        i4 = ((iM11306 ^ i12) * (-29875)) ^ 1258251766;
                        i5 = 763952504;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖۙ") ^ i13) * 83;
                        i4 = ((iM11306 ^ i12) * 4189) ^ 2016771055;
                        i5 = -1012360388;
                    }
                    int i213 = iM11306 ^ i5;
                    i19 = i2;
                    abstractC20749 = abstractC20746;
                    i18 = i3;
                    sArr3 = sArr;
                    c2457 = c2455;
                    s4 = s;
                    i15 = i213;
                    i14 = i4;
                    i17 = i;
                    break;
                case -354683591:
                case -166031484:
                    C1377.m4829(c2459);
                    C0526.m2436(abstractC20745M4219);
                    return;
                case -34300602:
                case 1409257079:
                    C19806.m45024();
                    RunnableC3388.m10064();
                    abstractC20746 = abstractC20749;
                    i = i17;
                    i2 = i19;
                    c2455 = c2457;
                    s = s4;
                    i3 = i18;
                    sArr = sArr3;
                    iM11306 = C19806.m45029("ܿܰ") ^ i12;
                    i4 = ((iM11306 ^ i13) * 23123) ^ (-2126012960);
                    i5 = 1701042998;
                    int i214 = iM11306 ^ i5;
                    i19 = i2;
                    abstractC20749 = abstractC20746;
                    i18 = i3;
                    sArr3 = sArr;
                    c2457 = c2455;
                    s4 = s;
                    i15 = i214;
                    i14 = i4;
                    i17 = i;
                    break;
                case -23281206:
                case 1356180719:
                    abstractC20746 = abstractC20749;
                    i = i17;
                    i2 = i19;
                    c2455 = c2457;
                    s = s4;
                    i3 = i18;
                    sArr = sArr3;
                    if (C1066.m4023() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۬᩻") ^ i13) * 59;
                        i4 = ((iM11306 ^ i12) * (-24333)) ^ 319225857;
                        i5 = 390024626;
                    } else {
                        iM11306 = C19806.m45029("ۡ᩸") ^ i13;
                        i4 = ((iM11306 ^ i12) * (-2233)) ^ (-1994552620);
                        i5 = 78566559;
                    }
                    int i215 = iM11306 ^ i5;
                    i19 = i2;
                    abstractC20749 = abstractC20746;
                    i18 = i3;
                    sArr3 = sArr;
                    c2457 = c2455;
                    s4 = s;
                    i15 = i215;
                    i14 = i4;
                    i17 = i;
                    break;
                case 10739711:
                case 503576691:
                    abstractC20746 = abstractC20749;
                    i = i17;
                    i2 = i19;
                    c2455 = c2457;
                    s = s4;
                    i3 = i18;
                    sArr = sArr3;
                    i20 = (s * s) + 312052225;
                    if (C2332.f8260) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤۧ") ^ i12;
                        i4 = ((iM11306 ^ i13) * (-2097)) ^ 739399743;
                        i5 = -1652480927;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬᩻") ^ i13) * 59;
                        i4 = ((iM11306 ^ i12) * (-24333)) ^ 319225857;
                        i5 = 390024626;
                    }
                    int i216 = iM11306 ^ i5;
                    i19 = i2;
                    abstractC20749 = abstractC20746;
                    i18 = i3;
                    sArr3 = sArr;
                    c2457 = c2455;
                    s4 = s;
                    i15 = i216;
                    i14 = i4;
                    i17 = i;
                    break;
                case 256887166:
                case 790245270:
                    i = i17;
                    c2456 = c2457;
                    i7 = i18;
                    s3 = s4;
                    sArr2 = sArr3;
                    abstractC20748 = abstractC20749;
                    i6 = i19;
                    try {
                        m40026(c2459, abstractC20745, abstractC20745M4219, z, z2, interfaceC12194);
                        int iM450212 = C19806.m45029("᩷᩻") ^ i13;
                        i15 = (-1494080962) ^ iM450212;
                        i19 = i6;
                        i17 = i;
                        i14 = ((iM450212 ^ i12) * 1223) ^ 101944005;
                        i18 = i7;
                        sArr3 = sArr2;
                        i16 = i16;
                        c2457 = c2456;
                        s4 = s3;
                        abstractC20749 = abstractC20748;
                    } catch (Throwable th4) {
                        th = th4;
                        c2458 = c2459;
                        int iM113012 = (ThreadFactoryC3888.m11306("ܺۛ") + i12) * 15;
                        i19 = i6;
                        i17 = i;
                        i18 = i7;
                        sArr3 = sArr2;
                        i16 = i16;
                        c2457 = c2456;
                        s4 = s3;
                        abstractC20749 = abstractC20748;
                        i15 = iM113012 ^ 963365889;
                        i14 = ((iM113012 ^ i13) * (-8505)) ^ (-664918981);
                    }
                    break;
                case 500171384:
                case 2104768215:
                    abstractC20746 = abstractC20749;
                    i = i17;
                    i2 = i19;
                    c2455 = c2457;
                    s = s4;
                    i3 = i18;
                    sArr = sArr3;
                    if (C2249.f8050 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۠ᩴ") ^ i12;
                        i4 = ((iM11306 ^ i13) * 3555) ^ 1841376269;
                        i5 = -2140883020;
                        int i217 = iM11306 ^ i5;
                        i19 = i2;
                        abstractC20749 = abstractC20746;
                        i18 = i3;
                        sArr3 = sArr;
                        c2457 = c2455;
                        s4 = s;
                        i15 = i217;
                        i14 = i4;
                        i17 = i;
                    } else {
                        i17 = i;
                        abstractC20747 = abstractC20746;
                        i18 = i3;
                        sArr3 = sArr;
                        iM11308 = ThreadFactoryC3888.m11306("ܿܳ") ^ i12;
                        i10 = ((iM11308 ^ i13) * (-7095)) ^ 187470729;
                        i11 = 759533149;
                        int i218 = iM11308 ^ i11;
                        i19 = i2;
                        i16 = i16;
                        c2457 = c2455;
                        s4 = s;
                        abstractC20749 = abstractC20747;
                        i14 = i10;
                        i15 = i218;
                    }
                    break;
                case 907079138:
                case 1216651979:
                    abstractC20746 = abstractC20749;
                    i = i17;
                    i2 = i19;
                    c2455 = c2457;
                    s = s4;
                    i3 = i18;
                    sArr = sArr3;
                    if (C1189.f5284 <= 0) {
                        iM11306 = C19806.m45029("ܿܰ") ^ i12;
                        i4 = ((iM11306 ^ i13) * 23123) ^ (-2126012960);
                        i5 = 1701042998;
                    } else {
                        iM11306 = C19806.m45029("ۤۛ") ^ i12;
                        i4 = ((iM11306 ^ i13) * (-4605)) ^ (-1253008348);
                        i5 = 251813306;
                    }
                    int i219 = iM11306 ^ i5;
                    i19 = i2;
                    abstractC20749 = abstractC20746;
                    i18 = i3;
                    sArr3 = sArr;
                    c2457 = c2455;
                    s4 = s;
                    i15 = i219;
                    i14 = i4;
                    i17 = i;
                    break;
                case 1233637779:
                case 1294994477:
                    abstractC20746 = abstractC20749;
                    i = i17;
                    i2 = i19;
                    c2455 = c2457;
                    s = s4;
                    i3 = i18;
                    sArr = sArr3;
                    if (i20 - (35330 * s) >= 0) {
                        iM11306 = C19806.m45029("᩸ۜ") ^ i13;
                        i4 = ((iM11306 ^ i12) * (-533)) ^ 658688793;
                        i5 = 1269422686;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۜ") ^ i13;
                        i4 = ((iM11306 ^ i12) * 25461) ^ 1449404629;
                        i5 = 477965918;
                    }
                    int i2110 = iM11306 ^ i5;
                    i19 = i2;
                    abstractC20749 = abstractC20746;
                    i18 = i3;
                    sArr3 = sArr;
                    c2457 = c2455;
                    s4 = s;
                    i15 = i2110;
                    i14 = i4;
                    i17 = i;
                    break;
                case 1801914656:
                case 1914394716:
                    abstractC20746 = abstractC20749;
                    i = i17;
                    i2 = i19;
                    c2455 = c2457;
                    s = s4;
                    i3 = i18;
                    sArr = sArr3;
                    if (C1066.m4023() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۬᩻") ^ i13) * 59;
                        i4 = ((iM11306 ^ i12) * (-24333)) ^ 319225857;
                        i5 = 390024626;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸۬") + i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM11306 ^ i13) * (-11219)) ^ (-721816631);
                        i5 = -424986935;
                    }
                    int i2111 = iM11306 ^ i5;
                    i19 = i2;
                    abstractC20749 = abstractC20746;
                    i18 = i3;
                    sArr3 = sArr;
                    c2457 = c2455;
                    s4 = s;
                    i15 = i2111;
                    i14 = i4;
                    i17 = i;
                    break;
                default:
                    C1937.m6279();
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        abstractC20746 = abstractC20749;
                        i = i17;
                        i2 = i19;
                        c2455 = c2457;
                        s = s4;
                        i3 = i18;
                        sArr = sArr3;
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۚ") ^ i13) * 13;
                        i4 = ((iM11306 ^ i12) * (-29875)) ^ 1258251766;
                        i5 = 763952504;
                        int i2112 = iM11306 ^ i5;
                        i19 = i2;
                        abstractC20749 = abstractC20746;
                        i18 = i3;
                        sArr3 = sArr;
                        c2457 = c2455;
                        s4 = s;
                        i15 = i2112;
                        i14 = i4;
                        i17 = i;
                    }
                    abstractC20746 = abstractC20749;
                    i = i17;
                    i2 = i19;
                    c2455 = c2457;
                    s = s4;
                    i3 = i18;
                    sArr = sArr3;
                    iM11306 = C19806.m45029("ܿܰ") ^ i12;
                    i4 = ((iM11306 ^ i13) * 23123) ^ (-2126012960);
                    i5 = 1701042998;
                    int i2113 = iM11306 ^ i5;
                    i19 = i2;
                    abstractC20749 = abstractC20746;
                    i18 = i3;
                    sArr3 = sArr;
                    c2457 = c2455;
                    s4 = s;
                    i15 = i2113;
                    i14 = i4;
                    i17 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x04c3 A[PHI: r19 r25
      0x04c3: PHI (r19v4 int) = (r19v3 int), (r19v2 int) binds: [B:107:0x04c1, B:9:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x04c3: PHI (r25v5 short) = (r25v4 short), (r25v3 short) binds: [B:107:0x04c1, B:9:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:112:0x04f5 A[PHI: r5 r18
      0x04f5: PHI (r5v4 java.lang.Object[]) = (r5v2 java.lang.Object[]), (r5v3 java.lang.Object[]), (r5v2 java.lang.Object[]) binds: [B:111:0x04f3, B:53:0x01bc, B:19:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x04f5: PHI (r18v4 int) = (r18v3 int), (r18v2 int), (r18v2 int) binds: [B:111:0x04f3, B:53:0x01bc, B:19:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:116:0x0528 A[PHI: r6 r7 r20
      0x0528: PHI (r6v5 java.lang.Integer) = (r6v2 java.lang.Integer), (r6v3 java.lang.Integer), (r6v2 java.lang.Integer) binds: [B:115:0x0526, B:39:0x0132, B:6:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0528: PHI (r7v5 java.lang.Object[]) = (r7v2 java.lang.Object[]), (r7v3 java.lang.Object[]), (r7v2 java.lang.Object[]) binds: [B:115:0x0526, B:39:0x0132, B:6:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0528: PHI (r20v5 short) = (r20v3 short), (r20v2 short), (r20v2 short) binds: [B:115:0x0526, B:39:0x0132, B:6:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:120:0x055a A[PHI: r10 r11 r12 r13 r16 r17
      0x055a: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:119:0x0558, B:45:0x0162, B:35:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x055a: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:119:0x0558, B:45:0x0162, B:35:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x055a: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:119:0x0558, B:45:0x0162, B:35:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x055a: PHI (r13v3 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v4 short[]) binds: [B:119:0x0558, B:45:0x0162, B:35:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x055a: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:119:0x0558, B:45:0x0162, B:35:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x055a: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:119:0x0558, B:45:0x0162, B:35:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x007d  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d7 A[PHI: r8
      0x00d7: PHI (r8v4 int) = (r8v3 int), (r8v2 int) binds: [B:31:0x00d5, B:12:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0184 A[PHI: r9
      0x0184: PHI (r9v4 short[]) = (r9v3 short[]), (r9v2 short[]), (r9v2 short[]), (r9v2 short[]) binds: [B:49:0x0182, B:22:0x00a0, B:19:0x009a, B:15:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m40018(int i) {
        int iM11306;
        int i2;
        int i3;
        String strM6363;
        int i4 = RunnableC3388.f12514;
        int i5 = C1398.f5802;
        int iM45029 = (C19806.m45029("ۢ۟") ^ i5) * (-35);
        int i6 = ((iM45029 ^ i4) * (-15591)) ^ 1214570343;
        Object[] objArr = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i7 = iM45029 ^ (-2011813207);
        int i8 = 0;
        int iM11307 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        int i13 = 0;
        int i14 = 0;
        short s = 0;
        int i15 = 1847927380;
        short s2 = 0;
        Integer numM8476 = null;
        Object[] objArr2 = null;
        String str = null;
        char c2 = 0;
        while (true) {
            i15 = i7 ^ (i6 & (((i15 ^ i4) * (-1393)) >> 31));
            switch (i15) {
                case -2142496858:
                case 1352597214:
                    C2124.m6673();
                    return null;
                case -2124785189:
                case -1784843382:
                    strM6363 = C2871.m8640(f54641, 38, 2, i12);
                    str = strM6363;
                    iM11306 = (C19806.m45029("۠ۙ") + i4) * 31;
                    i2 = ((iM11306 ^ i5) * (-32089)) ^ 439399306;
                    i3 = 1643533744;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -2113430434:
                case -14994730:
                    C1461.m5080();
                    iM11306 = ThreadFactoryC3888.m11306("᩶ۨ") ^ i4;
                    i2 = ((iM11306 ^ i5) * 2025) ^ (-1573362296);
                    i3 = 508550443;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -1969472928:
                case 102925813:
                    strM6363 = C1066.m4040(f54641, 23, 3, i12);
                    str = strM6363;
                    iM11306 = (C19806.m45029("۠ۙ") + i4) * 31;
                    i2 = ((iM11306 ^ i5) * (-32089)) ^ 439399306;
                    i3 = 1643533744;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -1967061167:
                case -360507522:
                    strM6363 = C1977.m6363(f54641, 17, 3, i12);
                    str = strM6363;
                    iM11306 = (C19806.m45029("۠ۙ") + i4) * 31;
                    i2 = ((iM11306 ^ i5) * (-32089)) ^ 439399306;
                    i3 = 1643533744;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -1956656299:
                case -596175999:
                    strM6363 = ViewTreeObserverOnPreDrawListenerC3327.m9869(f54641, 42, 3, i12);
                    str = strM6363;
                    iM11306 = (C19806.m45029("۠ۙ") + i4) * 31;
                    i2 = ((iM11306 ^ i5) * (-32089)) ^ 439399306;
                    i3 = 1643533744;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -1923813169:
                case 1444435326:
                    switch (i) {
                        case 22:
                            iM11306 = C19806.m45029("۠ܺ") ^ i4;
                            i2 = ((iM11306 ^ i5) * 26711) ^ 2075582471;
                            i3 = 1954757275;
                            break;
                        case 23:
                            iM11306 = ThreadFactoryC3888.m11306("᩸ܶ") ^ i5;
                            i2 = ((iM11306 ^ i4) * 10969) ^ (-1252003898);
                            i3 = -297202162;
                            break;
                        case 24:
                            iM11306 = C19806.m45029("ܺ۫") ^ i4;
                            i2 = ((iM11306 ^ i5) * 16869) ^ (-720780662);
                            i3 = 345779502;
                            break;
                        case 25:
                            iM11306 = ThreadFactoryC3888.m11306("ۗܽ") ^ i5;
                            i2 = ((iM11306 ^ i4) * 7409) ^ (-921297);
                            i3 = 2124149867;
                            break;
                        case 26:
                            iM11306 = C19806.m45029("ۡ֨") ^ i4;
                            i2 = ((iM11306 ^ i5) * 14889) ^ (-485439730);
                            i3 = -1329966688;
                            break;
                        case 27:
                            iM11306 = (ThreadFactoryC3888.m11306("ܽ᩺") + i5) * 5;
                            i2 = ((iM11306 ^ i4) * (-21185)) ^ (-2056447088);
                            i3 = 140222993;
                            break;
                        case 28:
                            iM11306 = ThreadFactoryC3888.m11306("ᩴ᩶") ^ i4;
                            i2 = ((iM11306 ^ i5) * (-26157)) ^ 1594804699;
                            i3 = 602120920;
                            break;
                        case 29:
                            iM11306 = ThreadFactoryC3888.m11306("֡ܽ") ^ i5;
                            i2 = ((iM11306 ^ i4) * (-29749)) ^ (-2140035598);
                            i3 = 985959485;
                            break;
                        case 30:
                            iM11306 = ThreadFactoryC3888.m11306("ۙ֨") ^ i4;
                            i2 = ((iM11306 ^ i5) * (-10019)) ^ 307280904;
                            i3 = 526021003;
                            break;
                        case 31:
                            iM11306 = (C19806.m45029("᩻ۘ") + i5) * 127;
                            i2 = ((iM11306 ^ i4) * (-9039)) ^ (-636708802);
                            i3 = -1671644722;
                            break;
                        case 32:
                            iM11306 = C19806.m45029("ܿᩳ") ^ i4;
                            i2 = ((iM11306 ^ i5) * 3577) ^ 1657348210;
                            i3 = 1115101482;
                            break;
                        case 33:
                            iM11306 = (C19806.m45029("ۘ᩶") + i4) * (-101);
                            i2 = ((iM11306 ^ i5) * (-6311)) ^ 584975392;
                            i3 = -236886041;
                            break;
                        case 34:
                            iM11306 = C19806.m45029("ܶۙ") ^ i5;
                            i2 = ((iM11306 ^ i4) * (-4951)) ^ (-65852788);
                            i3 = -511694752;
                            break;
                        case 35:
                            iM11306 = (i5 - C19806.m45029("ܿۛ")) * 17;
                            i2 = ((iM11306 ^ i4) * 22569) ^ 2126094883;
                            i3 = -56707070;
                            break;
                        case 36:
                            iM11306 = ThreadFactoryC3888.m11306("֨ۢ") ^ i4;
                            i2 = ((iM11306 ^ i5) * (-14733)) ^ (-1610608385);
                            i3 = 2116383566;
                            break;
                        default:
                            iM11306 = ThreadFactoryC3888.m11306("ۗ֫") ^ i5;
                            i2 = ((iM11306 ^ i4) * 18315) ^ (-350883267);
                            i3 = -763625196;
                            break;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -1859907096:
                case 883526385:
                    return C0216.m1574(ThreadFactoryC3888.m11306(MenuItemOnMenuItemClickListenerC3244.m9715(sArr2, i9, i11, i12)) ^ 2118403584, objArr2);
                case -1810423703:
                case -449334423:
                    sArr = f54641;
                    c = 16;
                    if (C19806.f63586) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֡᩵")) * 77;
                        i2 = ((iM11306 ^ i5) * 27719) ^ (-1575410033);
                        i3 = -1617400908;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۙܺ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i2 = ((iM11306 ^ i5) * 31121) ^ (-1810914912);
                        i3 = -957499035;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -1796347039:
                case 1136770296:
                    i8 = 1;
                    c2 = 0;
                    if (str != null) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨۗ") ^ i5) * (-125);
                        i2 = ((iM11306 ^ i4) * (-22825)) ^ 1945408221;
                        i3 = 202544124;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ᩴ") ^ i5;
                        i2 = ((iM11306 ^ i4) * o.a.F) ^ 2051885011;
                        i3 = 175122903;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -1758180844:
                case -1440114410:
                    iM11307 = ThreadFactoryC3888.m11306(C0671.m3009(sArr3, i10, 3, i12));
                    if (C2124.f7782 <= 0) {
                        iM11306 = C19806.m45029("᩷ۨ") ^ i5;
                        i2 = ((iM11306 ^ i4) * 29299) ^ 1809789776;
                        i3 = 1844467066;
                    } else {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("֫ܳ")) * 43;
                        i2 = ((iM11306 ^ i4) * (-24959)) ^ 479961575;
                        i3 = -2129933142;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -1746221145:
                case 1110405323:
                    i12 = 19757;
                    iM11306 = ThreadFactoryC3888.m11306("۬᩷") ^ i5;
                    i2 = ((iM11306 ^ i4) * (-25339)) ^ (-1904055588);
                    i3 = 2098041224;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -1744503746:
                case 1349026366:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ۨ") ^ i4;
                        i2 = ((iM11306 ^ i5) * 2025) ^ (-1573362296);
                        i3 = 508550443;
                    } else {
                        iM11306 = C19806.m45029("۫ۡ") ^ i4;
                        i2 = ((iM11306 ^ i5) * (-25021)) ^ 2045877807;
                        i3 = -200247490;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -1742879950:
                case -1720053606:
                    strM6363 = null;
                    str = strM6363;
                    iM11306 = (C19806.m45029("۠ۙ") + i4) * 31;
                    i2 = ((iM11306 ^ i5) * (-32089)) ^ 439399306;
                    i3 = 1643533744;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -1669098329:
                case 865249224:
                    i13 = s * 2;
                    if (C2871.f10837 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܰ") ^ i5;
                        i2 = ((iM11306 ^ i4) * (-2721)) ^ 726508872;
                        i3 = 878692513;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨۬") ^ i4) * 63;
                        i2 = ((iM11306 ^ i5) * (-24973)) ^ (-1949663298);
                        i3 = 956508297;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -1277697686:
                case 1487084712:
                    strM6363 = C2788.m8470(f54641, 45, 2, i12);
                    str = strM6363;
                    iM11306 = (C19806.m45029("۠ۙ") + i4) * 31;
                    i2 = ((iM11306 ^ i5) * (-32089)) ^ 439399306;
                    i3 = 1643533744;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -1143839985:
                case 1189501910:
                    C0671.m3008();
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۢ") ^ i5;
                        i2 = ((iM11306 ^ i4) * 27439) ^ 1771697601;
                        i3 = -1458417946;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧۘ") + i4) * 69;
                        i2 = ((iM11306 ^ i5) * (-21629)) ^ (-623070473);
                        i3 = -1255332014;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -1116040147:
                case -106962702:
                    return C0278.m1786(2099561723 ^ iM11307, objArr);
                case -1109385755:
                case -852506498:
                    strM6363 = C2788.m8470(f54641, 35, 1, i12);
                    str = strM6363;
                    iM11306 = (C19806.m45029("۠ۙ") + i4) * 31;
                    i2 = ((iM11306 ^ i5) * (-32089)) ^ 439399306;
                    i3 = 1643533744;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -1038916646:
                case -619536820:
                    i14 = i13 + 1;
                    s2 = 1;
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11306 = C19806.m45029("۫ۡ") ^ i4;
                        i2 = ((iM11306 ^ i5) * (-25021)) ^ 2045877807;
                        i3 = -200247490;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖܰ") ^ i5;
                        i2 = ((iM11306 ^ i4) * (-5547)) ^ 1451638407;
                        i3 = -1012591607;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -983629747:
                case 914275095:
                    strM6363 = C2788.m8470(f54641, 20, 3, i12);
                    str = strM6363;
                    iM11306 = (C19806.m45029("۠ۙ") + i4) * 31;
                    i2 = ((iM11306 ^ i5) * (-32089)) ^ 439399306;
                    i3 = 1643533744;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -896140290:
                case -758242629:
                    strM6363 = C2124.m6685(f54641, 47, 2, i12);
                    str = strM6363;
                    iM11306 = (C19806.m45029("۠ۙ") + i4) * 31;
                    i2 = ((iM11306 ^ i5) * (-32089)) ^ 439399306;
                    i3 = 1643533744;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -885375720:
                case -94395958:
                    numM8476 = C2788.m8476(i);
                    objArr = new Object[2];
                    objArr[c2] = str;
                    if (C0962.f3784) {
                        iM11306 = C19806.m45029("ۢܶ") ^ i5;
                        i2 = ((iM11306 ^ i4) * 19589) ^ (-1623650002);
                        i3 = -1290726057;
                    } else {
                        iM11306 = C19806.m45029("ۚۛ") ^ i4;
                        i2 = ((iM11306 ^ i5) * 19967) ^ (-611255751);
                        i3 = -178165201;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -857410929:
                case 1616320808:
                    s = sArr[c];
                    if (C2704.f10408) {
                        iM11306 = C19806.m45029("֡ܺ") ^ i5;
                        i2 = ((iM11306 ^ i4) * 19167) ^ 1605493962;
                        i3 = 411510668;
                    } else {
                        iM11306 = C19806.m45029("ۢܶ") ^ i5;
                        i2 = ((iM11306 ^ i4) * 19589) ^ (-1623650002);
                        i3 = -1290726057;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -550152621:
                case 1014644608:
                    strM6363 = C3660.m10790(f54641, 32, 3, i12);
                    str = strM6363;
                    iM11306 = (C19806.m45029("۠ۙ") + i4) * 31;
                    i2 = ((iM11306 ^ i5) * (-32089)) ^ 439399306;
                    i3 = 1643533744;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -534432565:
                case 1016471516:
                    strM6363 = C0278.m1774(f54641, 51, 2, i12);
                    str = strM6363;
                    iM11306 = (C19806.m45029("۠ۙ") + i4) * 31;
                    i2 = ((iM11306 ^ i5) * (-32089)) ^ 439399306;
                    i3 = 1643533744;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -447741067:
                case 1651321191:
                    i12 = 63155;
                    iM11306 = ThreadFactoryC3888.m11306("۬᩷") ^ i5;
                    i2 = ((iM11306 ^ i4) * (-25339)) ^ (-1904055588);
                    i3 = 2098041224;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -391092065:
                case -42151288:
                    strM6363 = C1377.m4832(f54641, 40, 2, i12);
                    str = strM6363;
                    iM11306 = (C19806.m45029("۠ۙ") + i4) * 31;
                    i2 = ((iM11306 ^ i5) * (-32089)) ^ 439399306;
                    i3 = 1643533744;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -391054610:
                case -244900783:
                    int i16 = s + s2;
                    if ((i16 * i16) - i14 >= 0) {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ܰۢ")) * 39;
                        i2 = ((iM11306 ^ i4) * 1033) ^ 936369678;
                        i3 = -768128090;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺۨ") + i4) * (-107);
                        i2 = ((iM11306 ^ i5) * 25165) ^ 1945266894;
                        i3 = 275410116;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -110498467:
                case 1069179378:
                    if (i > 35) {
                        iM11306 = C19806.m45029("۟ۗ") ^ i4;
                        i2 = ((iM11306 ^ i5) * 26031) ^ 1001273820;
                        i3 = -2005440971;
                    } else {
                        iM11306 = C19806.m45029("ۗ۬") ^ i5;
                        i2 = ((iM11306 ^ i4) * (-30385)) ^ 291158737;
                        i3 = -1301282926;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case 83490715:
                case 783973112:
                    strM6363 = C1025.m3859(f54641, 29, 3, i12);
                    str = strM6363;
                    iM11306 = (C19806.m45029("۠ۙ") + i4) * 31;
                    i2 = ((iM11306 ^ i5) * (-32089)) ^ 439399306;
                    i3 = 1643533744;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case 179073045:
                case 1801535697:
                    objArr[i8] = numM8476;
                    sArr3 = f54641;
                    i10 = 56;
                    if (C0526.f2219) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֡᩵")) * 77;
                        i2 = ((iM11306 ^ i5) * 27719) ^ (-1575410033);
                        i3 = -1617400908;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠֫") ^ i4;
                        i2 = ((iM11306 ^ i5) * (-24271)) ^ (-273952197);
                        i3 = 154427744;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case 298912892:
                case 1531504612:
                    strM6363 = C2249.m6918(f54641, 36, 2, i12);
                    str = strM6363;
                    iM11306 = (C19806.m45029("۠ۙ") + i4) * 31;
                    i2 = ((iM11306 ^ i5) * (-32089)) ^ 439399306;
                    i3 = 1643533744;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case 346353724:
                case 627159575:
                    sArr2 = f54641;
                    if (C10634.f36300 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۢ") ^ i5;
                        i2 = ((iM11306 ^ i4) * 27439) ^ 1771697601;
                        i3 = -1458417946;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢܰ") + i4) * (-93);
                        i2 = ((iM11306 ^ i5) * (-29447)) ^ 1233343666;
                        i3 = -504615911;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case 376917074:
                case 858859976:
                    strM6363 = C0817.m3410(i - 20);
                    str = strM6363;
                    iM11306 = (C19806.m45029("۠ۙ") + i4) * 31;
                    i2 = ((iM11306 ^ i5) * (-32089)) ^ 439399306;
                    i3 = 1643533744;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case 524953321:
                case 2121317384:
                    if (C3660.f13403 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ۨ") ^ i4;
                        i2 = ((iM11306 ^ i5) * 2025) ^ (-1573362296);
                        i3 = 508550443;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۢ") ^ i5;
                        i2 = ((iM11306 ^ i4) * 27439) ^ 1771697601;
                        i3 = -1458417946;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case 549949075:
                case 581343982:
                    strM6363 = C1461.m5070(f54641, 49, 2, i12);
                    str = strM6363;
                    iM11306 = (C19806.m45029("۠ۙ") + i4) * 31;
                    i2 = ((iM11306 ^ i5) * (-32089)) ^ 439399306;
                    i3 = 1643533744;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case 560354006:
                case 1299522071:
                    objArr2 = new Object[i8];
                    objArr2[c2] = C2788.m8476(i);
                    if (C2332.f8260) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۛ") ^ i4;
                        i2 = ((iM11306 ^ i5) * (-22701)) ^ (-2043425131);
                        i3 = -1968751797;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܰ") ^ i5;
                        i2 = ((iM11306 ^ i4) * (-2721)) ^ 726508872;
                        i3 = 878692513;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case 592546690:
                case 614484082:
                    C0797.m3359();
                    if (C1875.f7103 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۢ") ^ i5;
                        i2 = ((iM11306 ^ i4) * 27439) ^ 1771697601;
                        i3 = -1458417946;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܰ") ^ i5;
                        i2 = ((iM11306 ^ i4) * (-2721)) ^ 726508872;
                        i3 = 878692513;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case 1124740548:
                case 1779456983:
                    AbstractC0464.m2313();
                    if (C1419.f5860 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧۘ") + i4) * 69;
                        i2 = ((iM11306 ^ i5) * (-21629)) ^ (-623070473);
                        i3 = -1255332014;
                    } else {
                        iM11306 = C19806.m45029("᩷ۨ") ^ i5;
                        i2 = ((iM11306 ^ i4) * 29299) ^ 1809789776;
                        i3 = 1844467066;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case 1435376336:
                case 1647921467:
                    strM6363 = RunnableC1606.m5481(f54641, 26, 3, i12);
                    str = strM6363;
                    iM11306 = (C19806.m45029("۠ۙ") + i4) * 31;
                    i2 = ((iM11306 ^ i5) * (-32089)) ^ 439399306;
                    i3 = 1643533744;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case 1556445318:
                case 2025071134:
                    i9 = 53;
                    i11 = 3;
                    if (C3577.f13150 >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֡᩵")) * 77;
                        i2 = ((iM11306 ^ i5) * 27719) ^ (-1575410033);
                        i3 = -1617400908;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ᩶") ^ i5) * (-59);
                        i2 = ((iM11306 ^ i4) * 6869) ^ 1982000000;
                        i3 = -2133690142;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                default:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧۘ") + i4) * 69;
                        i2 = ((iM11306 ^ i5) * (-21629)) ^ (-623070473);
                        i3 = -1255332014;
                    } else {
                        iM11306 = C19806.m45029("ۢܶ") ^ i5;
                        i2 = ((iM11306 ^ i4) * 19589) ^ (-1623650002);
                        i3 = -1290726057;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m40029(ArrayList arrayList) {
        Iterator itM9863 = null;
        String str = null;
        C21445 c21445 = null;
        Object obj = null;
        Object orDefault = null;
        int i = 1035797052;
        int i2 = C1398.f5802;
        int i3 = C10634.f36300;
        int iM11306 = (i3 - ThreadFactoryC3888.m11306("ܺ۟")) * (-41);
        int i4 = ((iM11306 ^ i2) * (-19751)) ^ (-1991650571);
        int i5 = -1233546687;
        while (true) {
            i = ((((i ^ i2) * (-19377)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2063054366:
                case -650140176:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (C1377.m4833() != 0) {
                        iM11306 = C19806.m45029("ۤۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24129) ^ (-1992524741);
                        i5 = 1900784857;
                    } else {
                        iM11306 = C19806.m45029("ۛܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 4043) ^ (-2090049483);
                        i5 = -99567763;
                    }
                    break;
                case -2017109186:
                case -318865861:
                    return true;
                case -1793473957:
                case -768775319:
                    if (C19806.f63586) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ۜ") ^ i2) * (-35);
                        i4 = ((iM11306 ^ i3) * 26193) ^ 1326356297;
                        i5 = 424079861;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿۡ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 1877) ^ 1737491353;
                        i5 = -2040168561;
                    }
                    break;
                case -1726761441:
                case -833647424:
                    C7105.m18985();
                    if (C2477.f9839 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙ᩷") + i3) * 83;
                        i4 = ((iM11306 ^ i2) * (-31173)) ^ 22099723;
                        i5 = 682719438;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ۜ") ^ i2) * (-35);
                        i4 = ((iM11306 ^ i3) * 26193) ^ 1326356297;
                        i5 = 424079861;
                    }
                    break;
                case -1385124368:
                case 1796634317:
                    if (C1377.m4833() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙ᩷") + i3) * 83;
                        i4 = ((iM11306 ^ i2) * (-31173)) ^ 22099723;
                        i5 = 682719438;
                    } else {
                        iM11306 = (i3 - C19806.m45029("۟ܰ")) * (-117);
                        i4 = ((iM11306 ^ i2) * 5001) ^ (-436604966);
                        i5 = -133256362;
                    }
                    break;
                case -1377941452:
                case 1298923967:
                    if (RunnableC1564.m5348(itM9863)) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("֨ۢ")) * 27;
                        i4 = ((iM11306 ^ i2) * (-25643)) ^ (-1523764902);
                        i5 = -665177293;
                    } else {
                        iM11306 = C19806.m45029("ۧ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 11093) ^ (-1463674135);
                        i5 = -734072371;
                    }
                    break;
                case -1270342023:
                case 1628945658:
                    orDefault = c21445.getOrDefault(str, obj);
                    if (RunnableC1895.f7152) {
                        iM11306 = (i3 - C19806.m45029("ܰۚ")) * (-109);
                        i4 = ((iM11306 ^ i2) * 12197) ^ 1721478416;
                        i5 = 336182631;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۘ᩺")) * 81;
                        i4 = ((iM11306 ^ i3) * 24839) ^ (-244891278);
                        i5 = 610458153;
                    }
                    break;
                case -1143745264:
                case 1865583754:
                    if (C0526.m2437() >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ۜ") ^ i2) * (-35);
                        i4 = ((iM11306 ^ i3) * 26193) ^ 1326356297;
                        i5 = 424079861;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-2959)) ^ (-277934703);
                        i5 = -997247832;
                    }
                    break;
                case -1085541708:
                case 503344642:
                    C11986 c11986 = (C11986) orDefault;
                    C3286.m9779(c11986);
                    if (c11986.m29842()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-6455)) ^ 1703913122;
                        i5 = -228056797;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰܶ") ^ i2) * (-71);
                        i4 = ((iM11306 ^ i3) * 7321) ^ (-415227699);
                        i5 = -1959301539;
                    }
                    break;
                case -999285940:
                case -47623144:
                    str = (String) C0216.m1584(itM9863);
                    if (MenuItemOnMenuItemClickListenerC3244.m9713(arrayList, str)) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-6455)) ^ 1703913122;
                        i5 = -228056797;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-25149)) ^ 482990872;
                        i5 = -1814358551;
                    }
                    break;
                case -967162235:
                case 1224509308:
                    C1025.m3861();
                    C10634.m26820();
                    iM11306 = (ThreadFactoryC3888.m11306("۟ۜ") ^ i2) * (-35);
                    i4 = ((iM11306 ^ i3) * 26193) ^ 1326356297;
                    i5 = 424079861;
                    break;
                case -788178606:
                case 1005932027:
                    C2871.m8646();
                    if (C1066.m4023() > 0) {
                        iM11306 = C19806.m45029("ۤۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24129) ^ (-1992524741);
                        i5 = 1900784857;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ۜ") ^ i2) * (-35);
                        i4 = ((iM11306 ^ i3) * 26193) ^ 1326356297;
                        i5 = 424079861;
                    }
                    break;
                case -568254517:
                case 163960801:
                    m40031();
                    if (C1461.f5957 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙ᩷") + i3) * 83;
                        i4 = ((iM11306 ^ i2) * (-31173)) ^ 22099723;
                        i5 = 682719438;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ۢ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-16765)) ^ (-1539704890);
                        i5 = 706610522;
                    }
                    break;
                case -417450493:
                case -401113530:
                    if (C2871.f10837 >= 0) {
                        iM11306 = C19806.m45029("ۤۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24129) ^ (-1992524741);
                        i5 = 1900784857;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11393)) ^ (-410852979);
                        i5 = 1143273352;
                    }
                    break;
                case -382018508:
                case 2072545272:
                    if (C2124.f7782 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ۜ") ^ i2) * (-35);
                        i4 = ((iM11306 ^ i3) * 26193) ^ 1326356297;
                        i5 = 424079861;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺۤ") ^ i2) * (-123);
                        i4 = ((iM11306 ^ i3) * 2755) ^ (-929326290);
                        i5 = 180523198;
                    }
                    break;
                case -13945761:
                case 1503411227:
                    return false;
                case 88506453:
                case 782739495:
                    C1066.m4023();
                    return false;
                case 381177822:
                case 752814045:
                    c21445 = f54640;
                    obj = null;
                    if (RunnableC1564.f6300) {
                        iM11306 = C19806.m45029("ۤۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24129) ^ (-1992524741);
                        i5 = 1900784857;
                    } else {
                        iM11306 = (C19806.m45029("֫ۛ") + i2) * (-9);
                        i4 = ((iM11306 ^ i3) * 8383) ^ (-1598843357);
                        i5 = 489493489;
                    }
                    break;
                case 784765192:
                case 1716039072:
                    if (C2871.m8642()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-9935)) ^ (-447775981);
                        i5 = -1042084297;
                    } else {
                        iM11306 = C19806.m45029("ۧ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 11093) ^ (-1463674135);
                        i5 = -734072371;
                    }
                    break;
                case 1147103403:
                case 1178665805:
                    if (C1419.f5860 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ۜ") ^ i2) * (-35);
                        i4 = ((iM11306 ^ i3) * 26193) ^ 1326356297;
                        i5 = 424079861;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤۜ") ^ i3) * (-99);
                        i4 = ((iM11306 ^ i2) * 16847) ^ (-667928210);
                        i5 = 262212015;
                    }
                    break;
                case 1259597352:
                case 1379397353:
                    if (C3743.f13569) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-26211)) ^ (-15536935);
                        i5 = -1023242143;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ۜ") ^ i2) * (-35);
                        i4 = ((iM11306 ^ i3) * 26193) ^ 1326356297;
                        i5 = 424079861;
                    }
                    break;
                default:
                    itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(f54638);
                    iM11306 = ThreadFactoryC3888.m11306("ۨ۟") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-6455)) ^ 1703913122;
                    i5 = -228056797;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static List m40035(ArrayList arrayList) {
        ArrayList arrayList2 = null;
        Iterator itM9863 = null;
        String str = null;
        C21445 c21445 = null;
        Object obj = null;
        Object orDefault = null;
        C11986 c11986 = null;
        int i = 2036258756;
        int i2 = C1066.f4915;
        int i3 = C0278.f1572;
        int iM45029 = (C19806.m45029("ۨ۟") + i3) * 9;
        int i4 = ((iM45029 ^ i2) * (-27379)) ^ 1504117076;
        int i5 = 1001814191;
        while (true) {
            i = ((((i ^ i2) * (-15915)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2051877686:
                case -884590032:
                    return Collections.EMPTY_LIST;
                case -1943732412:
                case 957237604:
                    arrayList2 = new ArrayList();
                    if (C3535.f13026 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹۠") ^ i2) * (-63);
                        i4 = ((iM45029 ^ i3) * 28165) ^ (-735172454);
                        i5 = -814958431;
                    } else {
                        iM45029 = C19806.m45029("ۚۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 4753) ^ (-218871612);
                        i5 = 133056698;
                    }
                    break;
                case -1816066126:
                case -700194140:
                    str = (String) C0278.m1776(itM9863);
                    if (arrayList.contains(str)) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 25829) ^ 1903206351;
                        i5 = 258550696;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷ܳ") + i2) * 79;
                        i4 = ((iM45029 ^ i3) * 27493) ^ 326936569;
                        i5 = -891646690;
                    }
                    break;
                case -1661126197:
                case -1244135447:
                    orDefault = c21445.getOrDefault(str, obj);
                    if (C0050.f912 <= 0) {
                        iM45029 = (i2 - C19806.m45029("ܳۨ")) * (-49);
                        i4 = ((iM45029 ^ i3) * 22371) ^ (-2003176652);
                        i5 = -953236940;
                    } else {
                        iM45029 = (C19806.m45029("᩵ܳ") ^ i3) * 47;
                        i4 = ((iM45029 ^ i2) * (-24577)) ^ (-2129746227);
                        i5 = -1962996771;
                    }
                    break;
                case -1562586377:
                case -121622530:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (i2 - C19806.m45029("ܳۨ")) * (-49);
                        i4 = ((iM45029 ^ i3) * 22371) ^ (-2003176652);
                        i5 = -953236940;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷ۜ") + i2) * (-95);
                        i4 = ((iM45029 ^ i3) * 30525) ^ 706832690;
                        i5 = 55369540;
                    }
                    break;
                case -1520066767:
                case 1435468675:
                    if (!C0962.f3784) {
                        iM45029 = C19806.m45029("ۡۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-453)) ^ 1322692496;
                        i5 = 370429473;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹۠") ^ i2) * (-63);
                        i4 = ((iM45029 ^ i3) * 28165) ^ (-735172454);
                        i5 = -814958431;
                    }
                    break;
                case -1500674156:
                case 982966280:
                    RunnableC1606.m5473();
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM45029 = C19806.m45029("ۡۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-453)) ^ 1322692496;
                        i5 = 370429473;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * 8629) ^ (-643497917);
                        i5 = -1068696302;
                    }
                    break;
                case -1396006136:
                case 1879387236:
                    c21445 = f54640;
                    obj = null;
                    if (C2871.f10837 >= 0) {
                        iM45029 = (i2 - C19806.m45029("ܳۨ")) * (-49);
                        i4 = ((iM45029 ^ i3) * 22371) ^ (-2003176652);
                        i5 = -953236940;
                    } else {
                        iM45029 = C19806.m45029("ۤ᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-21037)) ^ 1365524458;
                        i5 = -798284138;
                    }
                    break;
                case -1239149942:
                case 838407752:
                    if (RunnableC3388.m10064()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷᩷") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-15143)) ^ 824111674;
                        i5 = -165958074;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * 8629) ^ (-643497917);
                        i5 = -1068696302;
                    }
                    break;
                case -1234843509:
                case -583326979:
                    C3743.m10966();
                    return null;
                case -864008889:
                case 1074190787:
                    C10634.m26820();
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = C19806.m45029("۬ۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-8159)) ^ (-474883541);
                        i5 = -1206763226;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹۠") ^ i2) * (-63);
                        i4 = ((iM45029 ^ i3) * 28165) ^ (-735172454);
                        i5 = -814958431;
                    }
                    break;
                case -492217942:
                case 1615584128:
                    c11986 = (C11986) orDefault;
                    C3286.m9779(c11986);
                    if (c11986.m29842()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 25829) ^ 1903206351;
                        i5 = 258550696;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩹ۧ")) * 41;
                        i4 = ((iM45029 ^ i3) * 11413) ^ (-1932687306);
                        i5 = 458471847;
                    }
                    break;
                case -429387550:
                case 1372430663:
                    C3660.m10788(arrayList2, c11986);
                    iM45029 = ThreadFactoryC3888.m11306("᩹ᩳ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 25829) ^ 1903206351;
                    i5 = 258550696;
                    break;
                case -412568955:
                case -286244312:
                    return arrayList2;
                case -340297451:
                case 847289313:
                    m40031();
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17515) ^ 1519886370;
                        i5 = -359778114;
                    } else {
                        iM45029 = C19806.m45029("ۡۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-453)) ^ 1322692496;
                        i5 = 370429473;
                    }
                    break;
                case -332401091:
                case 1922762851:
                    if (C2871.m8642()) {
                        iM45029 = ThreadFactoryC3888.m11306("֨۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * 2859) ^ (-1128047030);
                        i5 = 611974196;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩳ֨")) * (-89);
                        i4 = ((iM45029 ^ i2) * (-2931)) ^ (-1774537302);
                        i5 = 167309262;
                    }
                    break;
                case -134622011:
                case 820676384:
                    if (C0629.f2722 <= 0) {
                        iM45029 = C19806.m45029("۬ۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-8159)) ^ (-474883541);
                        i5 = -1206763226;
                    } else {
                        iM45029 = (C19806.m45029("ۖᩳ") + i2) * (-23);
                        i4 = ((iM45029 ^ i3) * (-32297)) ^ 1511033781;
                        i5 = 2128481844;
                    }
                    break;
                case -91122880:
                case 984206408:
                    if (C3660.m10791() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹۠") ^ i2) * (-63);
                        i4 = ((iM45029 ^ i3) * 28165) ^ (-735172454);
                        i5 = -814958431;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-26949)) ^ 1519044559;
                        i5 = 1413861880;
                    }
                    break;
                case 191074652:
                case 2057350829:
                    C2332.m7079();
                    C0817.m3399();
                    iM45029 = ThreadFactoryC3888.m11306("ۤ۬") ^ i3;
                    i4 = ((iM45029 ^ i2) * 8629) ^ (-643497917);
                    i5 = -1068696302;
                    break;
                case 455628737:
                case 1052081879:
                    if (C3535.f13026 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * 8629) ^ (-643497917);
                        i5 = -1068696302;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 29419) ^ 1957154228;
                        i5 = -404337894;
                    }
                    break;
                case 1226508268:
                case 1792429532:
                    if (RunnableC1564.m5348(itM9863)) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ܽ") ^ i3) * (-113);
                        i4 = ((iM45029 ^ i2) * (-16021)) ^ 635259041;
                        i5 = 1819350329;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۘᩳ")) * (-35);
                        i4 = ((iM45029 ^ i2) * 28371) ^ (-149037989);
                        i5 = 371943988;
                    }
                    break;
                case 1390200201:
                case 1649588892:
                    itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(f54638);
                    iM45029 = ThreadFactoryC3888.m11306("᩹ᩳ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 25829) ^ 1903206351;
                    i5 = 258550696;
                    break;
                default:
                    if (C3535.m10431() <= 0) {
                        iM45029 = C19806.m45029("ۡۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-453)) ^ 1322692496;
                        i5 = 370429473;
                    } else {
                        iM45029 = C19806.m45029("ۢ֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-2031)) ^ 951561736;
                        i5 = -1986853460;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11986 m40022(AbstractC20745 abstractC20745) {
        return m40020(new C2455(abstractC20745));
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01f9 A[PHI: r2 r7
      0x01f9: PHI (r2v5 short[]) = (r2v3 short[]), (r2v2 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:64:0x01f7, B:19:0x0059, B:7:0x0037, B:93:0x01f9] A[DONT_GENERATE, DONT_INLINE]
      0x01f9: PHI (r7v5 short) = (r7v2 short), (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:64:0x01f7, B:19:0x0059, B:7:0x0037, B:93:0x01f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (l.C19806.f63586 != false) goto L15;
     */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.AbstractC20745 m40017(java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17132.m40017(java.lang.String):l.᩷۠ۚ");
    }

    /* JADX WARN: Code duplicated, block: B:68:0x02a2 A[PHI: r2 r6 r7 r8 r9 r10 r19 r20
      0x02a2: PHI (r2v3 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v4 java.lang.String)
     binds: [B:67:0x02a0, B:61:0x0254, B:57:0x0230, B:53:0x020c, B:34:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:67:0x02a0, B:61:0x0254, B:57:0x0230, B:53:0x020c, B:34:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:67:0x02a0, B:61:0x0254, B:57:0x0230, B:53:0x020c, B:34:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:67:0x02a0, B:61:0x0254, B:57:0x0230, B:53:0x020c, B:34:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:67:0x02a0, B:61:0x0254, B:57:0x0230, B:53:0x020c, B:34:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:67:0x02a0, B:61:0x0254, B:57:0x0230, B:53:0x020c, B:34:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r19v16 java.lang.StringBuilder) = 
      (r19v2 java.lang.StringBuilder)
      (r19v3 java.lang.StringBuilder)
      (r19v4 java.lang.StringBuilder)
      (r19v5 java.lang.StringBuilder)
      (r19v17 java.lang.StringBuilder)
     binds: [B:67:0x02a0, B:61:0x0254, B:57:0x0230, B:53:0x020c, B:34:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:67:0x02a0, B:61:0x0254, B:57:0x0230, B:53:0x020c, B:34:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences m40030(String str) {
        int iM11306;
        int i;
        int i2;
        int iM11307;
        int i3;
        int i4;
        int i5 = C2477.f9839;
        int i6 = C2788.f10625;
        int iM45029 = (C19806.m45029("ܶۘ") ^ i5) * (-55);
        int i7 = ((iM45029 ^ i6) * (-30947)) ^ (-665160025);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = iM45029 ^ 886306664;
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = -441083647;
        SharedPreferences sharedPreferences = null;
        String strM3407 = null;
        StringBuilder sbM8976 = null;
        while (true) {
            i16 = i8 ^ (i7 & (((i16 ^ i6) * (-7361)) >> 31));
            switch (i16) {
                case -2086046903:
                case -1494103887:
                    C2124.m6683(sbM8976, C19806.m45029(str));
                    strM3407 = C0817.m3407(sbM8976);
                    if (!C0962.f3784) {
                        iM11307 = ThreadFactoryC3888.m11306("ۤܶ") ^ i5;
                        i3 = ((iM11307 ^ i6) * 25677) ^ 115853092;
                        i4 = 1186156356;
                        i8 = iM11307 ^ i4;
                        i7 = i3;
                    } else {
                        sbM8976 = sbM8976;
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ᩺") + i6) * 101;
                        i = ((iM11306 ^ i5) * 20505) ^ (-1948655442);
                        i2 = 2012465522;
                        StringBuilder sb = sbM8976;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                        sbM8976 = sb;
                    }
                    break;
                case -1969509290:
                case 828011912:
                    sbM8976 = sbM8976;
                    int i17 = i11 + i12;
                    if (i10 - (i17 + i17) <= 0) {
                        iM11306 = (C19806.m45029("ۤۡ") ^ i5) * (-113);
                        i = ((iM11306 ^ i6) * 21359) ^ (-1774946359);
                        i2 = -980321812;
                    } else {
                        iM11306 = C19806.m45029("᩵ۧ") ^ i5;
                        i = ((iM11306 ^ i6) * (-12659)) ^ 516991805;
                        i2 = 2059882350;
                    }
                    StringBuilder sb2 = sbM8976;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    sbM8976 = sb2;
                    break;
                case -1352181134:
                case 1116054194:
                    sbM8976 = sbM8976;
                    s = sArr[c];
                    if (C3660.m10791() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ᩺") + i6) * 101;
                        i = ((iM11306 ^ i5) * 20505) ^ (-1948655442);
                        i2 = 2012465522;
                    } else {
                        iM11306 = C19806.m45029("ۧ᩸") ^ i5;
                        i = ((iM11306 ^ i6) * 6411) ^ 368306530;
                        i2 = -1584188421;
                    }
                    StringBuilder sb3 = sbM8976;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    sbM8976 = sb3;
                    break;
                case -1252474279:
                case -48119293:
                    sbM8976 = C3012.m8976(str, C0797.m3361(sArr2, i14, i15, i13));
                    if (C1977.m6356()) {
                        iM11306 = C19806.m45029("ۡܽ") ^ i5;
                        sbM8976 = sbM8976;
                        i = ((iM11306 ^ i6) * 25113) ^ (-258958439);
                        i2 = 1679932833;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚܽ") ^ i5;
                        sbM8976 = sbM8976;
                        i = ((iM11306 ^ i6) * 13207) ^ 1810175637;
                        i2 = -692054532;
                    }
                    StringBuilder sb4 = sbM8976;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    sbM8976 = sb4;
                    break;
                case -1133511439:
                case -989544131:
                    i13 = 40257;
                    iM11306 = (C19806.m45029("۠᩵") ^ i6) * (-69);
                    i = ((iM11306 ^ i5) * 18689) ^ 1072828513;
                    i2 = -1186698500;
                    StringBuilder sb5 = sbM8976;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    sbM8976 = sb5;
                    break;
                case -999003318:
                case 273871641:
                    C0526.m2437();
                    if (!C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ۙ") ^ i5;
                        sbM8976 = sbM8976;
                        i = ((iM11306 ^ i6) * 18835) ^ 414995992;
                        i2 = 930483102;
                        StringBuilder sb6 = sbM8976;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                        sbM8976 = sb6;
                    }
                    iM11306 = C19806.m45029("ۡܽ") ^ i5;
                    sbM8976 = sbM8976;
                    i = ((iM11306 ^ i6) * 25113) ^ (-258958439);
                    i2 = 1679932833;
                    StringBuilder sb7 = sbM8976;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    sbM8976 = sb7;
                    break;
                case -778357116:
                case -240829519:
                    sbM8976 = sbM8976;
                    sArr = f54641;
                    if (C1668.f6641 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ᩺") + i6) * 101;
                        i = ((iM11306 ^ i5) * 20505) ^ (-1948655442);
                        i2 = 2012465522;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩶") ^ i5;
                        i = ((iM11306 ^ i6) * 16833) ^ 520511638;
                        i2 = 841524797;
                    }
                    StringBuilder sb8 = sbM8976;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    sbM8976 = sb8;
                    break;
                case -777861788:
                case 772305957:
                    sbM8976 = sbM8976;
                    i9 = s + 13398;
                    if (C0817.m3399()) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۖ") ^ i6;
                        i = ((iM11306 ^ i5) * (-13177)) ^ (-1742387291);
                        i2 = 1011531015;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ᩺") + i6) * 101;
                        i = ((iM11306 ^ i5) * 20505) ^ (-1948655442);
                        i2 = 2012465522;
                    }
                    StringBuilder sb9 = sbM8976;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    sbM8976 = sb9;
                    break;
                case -375070209:
                case 1811787712:
                    sbM8976 = sbM8976;
                    i10 = i9 * i9;
                    i11 = s * s;
                    i12 = 179506404;
                    if (RunnableC3388.m10064()) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷۠") ^ i6;
                        i = ((iM11306 ^ i5) * (-7543)) ^ 1513215143;
                        i2 = -457726953;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ᩺") + i6) * 101;
                        i = ((iM11306 ^ i5) * 20505) ^ (-1948655442);
                        i2 = 2012465522;
                    }
                    StringBuilder sb10 = sbM8976;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    sbM8976 = sb10;
                    break;
                case -274924019:
                case 301631347:
                    sArr2 = f54641;
                    i14 = 396;
                    i15 = 1;
                    if (C7105.f23796 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ۙ") ^ i5;
                        sbM8976 = sbM8976;
                        i = ((iM11306 ^ i6) * 18835) ^ 414995992;
                        i2 = 930483102;
                    } else {
                        sbM8976 = sbM8976;
                        iM11306 = C19806.m45029("۠۟") ^ i6;
                        i = ((iM11306 ^ i5) * 28619) ^ 424248215;
                        i2 = 1622602608;
                    }
                    StringBuilder sb11 = sbM8976;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    sbM8976 = sb11;
                    break;
                case -70947386:
                case 1805689204:
                    sArr3 = f54641;
                    if (C1937.f7317 < 0) {
                        iM11307 = (i6 - C19806.m45029("᩷ۧ")) * 45;
                        i3 = ((iM11307 ^ i5) * (-11945)) ^ (-2086056672);
                        i4 = -496702889;
                        i8 = iM11307 ^ i4;
                        i7 = i3;
                    } else {
                        iM11306 = C19806.m45029("ۡܽ") ^ i5;
                        sbM8976 = sbM8976;
                        i = ((iM11306 ^ i6) * 25113) ^ (-258958439);
                        i2 = 1679932833;
                        StringBuilder sb12 = sbM8976;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                        sbM8976 = sb12;
                    }
                    break;
                case 183857810:
                case 750360461:
                    i13 = 14544;
                    iM11306 = (C19806.m45029("۠᩵") ^ i6) * (-69);
                    i = ((iM11306 ^ i5) * 18689) ^ 1072828513;
                    i2 = -1186698500;
                    StringBuilder sb13 = sbM8976;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    sbM8976 = sb13;
                    break;
                case 303702879:
                case 1514375721:
                    C2249.m6915();
                    if (C1398.m4895() <= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("۠ۜ") ^ i5;
                        i3 = ((iM11307 ^ i6) * 13843) ^ 1753744765;
                        i4 = 1167455879;
                        i8 = iM11307 ^ i4;
                        i7 = i3;
                    } else {
                        iM11306 = C19806.m45029("ۡܽ") ^ i5;
                        sbM8976 = sbM8976;
                        i = ((iM11306 ^ i6) * 25113) ^ (-258958439);
                        i2 = 1679932833;
                        StringBuilder sb14 = sbM8976;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                        sbM8976 = sb14;
                    }
                    break;
                case 336619315:
                case 1204109838:
                    C2249.m6915();
                    RunnableC1564.m5345();
                    return null;
                case 592989246:
                case 914527608:
                    sharedPreferences = C1377.m4826().getSharedPreferences(strM3407, 0);
                    if (C2332.f8260) {
                        iM11307 = (i6 - ThreadFactoryC3888.m11306("ۜܿ")) * (-27);
                        i3 = ((iM11307 ^ i5) * 28027) ^ (-1181586247);
                        i4 = -1809776231;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("۠ۜ") ^ i5;
                        i3 = ((iM11307 ^ i6) * 13843) ^ 1753744765;
                        i4 = 1167455879;
                    }
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    break;
                case 899951509:
                case 947410276:
                    C1461.m5080();
                    iM11306 = C19806.m45029("ۡܽ") ^ i5;
                    sbM8976 = sbM8976;
                    i = ((iM11306 ^ i6) * 25113) ^ (-258958439);
                    i2 = 1679932833;
                    StringBuilder sb15 = sbM8976;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    sbM8976 = sb15;
                    break;
                case 1195652691:
                case 1759401930:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (C1025.f4800 < 0) {
                        sbM8976 = sbM8976;
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("ۛ۟")) * 101;
                        i = ((iM11306 ^ i5) * (-8785)) ^ 798054874;
                        i2 = 1018142163;
                        StringBuilder sb16 = sbM8976;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                        sbM8976 = sb16;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("۠ۜ") ^ i5;
                        i3 = ((iM11307 ^ i6) * 13843) ^ 1753744765;
                        i4 = 1167455879;
                        i8 = iM11307 ^ i4;
                        i7 = i3;
                    }
                    break;
                case 1656306009:
                case 2013868249:
                    C1937.m6286(sharedPreferences, C1398.m4892(sArr3, 397, 25, i13));
                    return sharedPreferences;
                default:
                    sbM8976 = sbM8976;
                    c = 395;
                    if (C2332.f8260) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗ᩷") ^ i6;
                        i = ((iM11306 ^ i5) * (-16457)) ^ 525910344;
                        i2 = 2055822884;
                    } else {
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("ۛ۟")) * 101;
                        i = ((iM11306 ^ i5) * (-8785)) ^ 798054874;
                        i2 = 1018142163;
                    }
                    StringBuilder sb17 = sbM8976;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    sbM8976 = sb17;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40025(InterfaceC0903 interfaceC0903) {
        C3660.m10788(f54643, interfaceC0903);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m40038(String str) {
        int iM45029;
        int i;
        int i2;
        int iM11306;
        int i3;
        int i4;
        int i5;
        int iM450210;
        int i6;
        int i7;
        ArrayList arrayList = null;
        C11986 c11986 = null;
        ArrayList arrayList2 = null;
        int iM4837 = 0;
        int i8 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = 2006941037;
        int i14 = C1875.f7103;
        int i15 = C2871.f10837;
        int iM11307 = ThreadFactoryC3888.m11306("ᩴܿ") ^ i14;
        int i16 = ((iM11307 ^ i15) * 15029) ^ (-1068014270);
        int i17 = iM11307 ^ (-2081253383);
        StringBuilder sb = null;
        while (true) {
            int i18 = i17 ^ (i16 & (((i13 ^ i15) * (-12813)) >> 31));
            switch (i18) {
                case -2067496302:
                case 1768447389:
                    if (!CallableC1627.f6528) {
                        arrayList = arrayList;
                        i18 = i18;
                        int iM450211 = (C19806.m45029("ܺܰ") + i14) * (-119);
                        i3 = ((iM450211 ^ i15) * 11209) ^ 1972262210;
                        i5 = iM450211 ^ 89145406;
                        i13 = i18;
                        sb = null;
                        i17 = i5;
                        i16 = i3;
                        arrayList = arrayList;
                    } else {
                        iM45029 = C19806.m45029("ᩴۡ") ^ i14;
                        i18 = i18;
                        i = ((iM45029 ^ i15) * 1165) ^ 1363398714;
                        i2 = 463552791;
                        int i19 = i18;
                        i17 = iM45029 ^ i2;
                        i16 = i;
                        i13 = i19;
                    }
                    break;
                case -1926738990:
                case -1691279177:
                    i18 = i18;
                    c11986.m29817(false);
                    c11986.m29829();
                    iM45029 = C19806.m45029("ۢ᩵") ^ i14;
                    i = ((iM45029 ^ i15) * (-8093)) ^ 1752577083;
                    i2 = -1014907053;
                    int i110 = i18;
                    i17 = iM45029 ^ i2;
                    i16 = i;
                    i13 = i110;
                    break;
                case -1908112925:
                case -632715572:
                    i18 = i18;
                    arrayList = f54638;
                    if (C2332.m7079() > 0) {
                        iM45029 = (i15 - C19806.m45029("۫᩷")) * (-47);
                        i = ((iM45029 ^ i14) * 8449) ^ 276550958;
                        i2 = 977244590;
                        int i111 = i18;
                        i17 = iM45029 ^ i2;
                        i16 = i;
                        i13 = i111;
                    } else {
                        c11986 = c11986;
                        int iM450212 = (C19806.m45029("ܶ᩶") + i15) * 127;
                        i13 = i18;
                        sb = null;
                        i17 = iM450212 ^ (-1563837953);
                        i16 = ((iM450212 ^ i14) * 11953) ^ (-1776964808);
                        c11986 = c11986;
                    }
                    break;
                case -1513973180:
                case 196289292:
                    i12 = 16786;
                    iM11306 = (C19806.m45029("ۚۘ") + i14) * (-105);
                    i3 = ((iM11306 ^ i15) * 27045) ^ 201470523;
                    i4 = -408797860;
                    i5 = iM11306 ^ i4;
                    i13 = i18;
                    c11986 = c11986;
                    i17 = i5;
                    i16 = i3;
                    arrayList = arrayList;
                    break;
                case -1366024123:
                case 1114093032:
                    if (C2124.f7782 > 0) {
                        c11986 = c11986;
                        i18 = i18;
                        int iM450213 = (C19806.m45029("ܶ᩶") + i15) * 127;
                        i13 = i18;
                        sb = null;
                        i17 = iM450213 ^ (-1563837953);
                        i16 = ((iM450213 ^ i14) * 11953) ^ (-1776964808);
                        c11986 = c11986;
                    } else {
                        iM45029 = C19806.m45029("ᩴۡ") ^ i14;
                        i18 = i18;
                        i = ((iM45029 ^ i15) * 1165) ^ 1363398714;
                        i2 = 463552791;
                        int i112 = i18;
                        i17 = iM45029 ^ i2;
                        i16 = i;
                        i13 = i112;
                    }
                    break;
                case -1071443148:
                case -807269967:
                    i18 = i18;
                    C21157.m47599(C2124.m6674(sb));
                    m40036(str);
                    if (C1066.f4915 > 0) {
                        iM45029 = (C19806.m45029("֡ᩳ") + i14) * (-15);
                        i = ((iM45029 ^ i15) * (-8189)) ^ 1957340998;
                        i2 = -497183645;
                        int i113 = i18;
                        i17 = iM45029 ^ i2;
                        i16 = i;
                        i13 = i113;
                    } else {
                        arrayList = arrayList;
                        c11986 = c11986;
                        iM11306 = (ThreadFactoryC3888.m11306("۠᩷") + i15) * (-51);
                        i3 = ((iM11306 ^ i14) * (-5151)) ^ 366111934;
                        i4 = 995736685;
                        i5 = iM11306 ^ i4;
                        i13 = i18;
                        c11986 = c11986;
                        i17 = i5;
                        i16 = i3;
                        arrayList = arrayList;
                    }
                    break;
                case -1059056609:
                case -408134880:
                    break;
                case -820727917:
                case 216407765:
                    arrayList = arrayList;
                    c11986 = c11986;
                    i18 = i18;
                    i9 = s * s;
                    i10 = 82537225;
                    if (ThreadFactoryC3888.m11300() > 0) {
                        iM11306 = (C19806.m45029("ܶۡ") + i15) * 37;
                        i3 = ((iM11306 ^ i14) * (-20749)) ^ 1507560612;
                        i4 = -473957232;
                        i5 = iM11306 ^ i4;
                        i13 = i18;
                        c11986 = c11986;
                        i17 = i5;
                        i16 = i3;
                        arrayList = arrayList;
                    } else {
                        arrayList = arrayList;
                        int iM450214 = (C19806.m45029("ܶ᩶") + i15) * 127;
                        i13 = i18;
                        sb = null;
                        i17 = iM450214 ^ (-1563837953);
                        i16 = ((iM450214 ^ i14) * 11953) ^ (-1776964808);
                        c11986 = c11986;
                    }
                    break;
                case -782087153:
                case 1864842433:
                    i18 = i18;
                    m40031();
                    short[] sArr2 = f54641;
                    if (C2642.f10294 > 0) {
                        arrayList = arrayList;
                        if (C0278.m1789() <= 0) {
                            int iM450215 = (C19806.m45029("ܺܰ") + i14) * (-119);
                            i3 = ((iM450215 ^ i15) * 11209) ^ 1972262210;
                            i5 = iM450215 ^ 89145406;
                            i13 = i18;
                            sb = null;
                            i17 = i5;
                            i16 = i3;
                        } else {
                            C11986 c11987 = c11986;
                            StringBuilder sb2 = new StringBuilder(C1668.m5577(sArr2, 463, 11, i12));
                            C1148.m4223(sb2, str);
                            if (C1668.f6641 >= 0) {
                                iM450210 = (C19806.m45029("ܳۗ") + i14) * 7;
                                i6 = ((iM450210 ^ i15) * 20513) ^ 1400800180;
                                i7 = -359050939;
                            } else {
                                iM450210 = C19806.m45029("ۧۚ") ^ i15;
                                i6 = ((iM450210 ^ i14) * 16141) ^ 1270335951;
                                i7 = 1926487403;
                            }
                            int i20 = iM450210 ^ i7;
                            sb = sb2;
                            i16 = i6;
                            i13 = i18;
                            c11986 = c11987;
                            i17 = i20;
                        }
                        arrayList = arrayList;
                    } else {
                        c11986 = c11986;
                        int iM450216 = (C19806.m45029("ܶ᩶") + i15) * 127;
                        i13 = i18;
                        sb = null;
                        i17 = iM450216 ^ (-1563837953);
                        i16 = ((iM450216 ^ i14) * 11953) ^ (-1776964808);
                        c11986 = c11986;
                    }
                    break;
                case -650467535:
                case -258774953:
                    C7105.m18985();
                    C1398.m4895();
                    break;
                case -552039761:
                case 1757462303:
                    arrayList = arrayList;
                    c11986 = c11986;
                    i18 = i18;
                    sArr = f54641;
                    c = 462;
                    if (C1937.f7317 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۠᩷") + i15) * (-51);
                        i3 = ((iM11306 ^ i14) * (-5151)) ^ 366111934;
                        i4 = 995736685;
                    } else {
                        iM11306 = C19806.m45029("֨ۛ") ^ i15;
                        i3 = ((iM11306 ^ i14) * (-30779)) ^ 820330906;
                        i4 = 1448247741;
                    }
                    i5 = iM11306 ^ i4;
                    i13 = i18;
                    c11986 = c11986;
                    i17 = i5;
                    i16 = i3;
                    arrayList = arrayList;
                    break;
                case -459135742:
                case 1456290370:
                    arrayList = arrayList;
                    c11986 = c11986;
                    i18 = i18;
                    s = sArr[c];
                    if (RunnableC3388.f12514 < 0) {
                        iM11306 = C19806.m45029("֡֫") ^ i14;
                        i3 = ((iM11306 ^ i15) * (-12123)) ^ 1142231377;
                        i4 = 606406676;
                        i5 = iM11306 ^ i4;
                        i13 = i18;
                        c11986 = c11986;
                        i17 = i5;
                        i16 = i3;
                        arrayList = arrayList;
                    } else {
                        arrayList = arrayList;
                        int iM450217 = (C19806.m45029("ܶ᩶") + i15) * 127;
                        i13 = i18;
                        sb = null;
                        i17 = iM450217 ^ (-1563837953);
                        i16 = ((iM450217 ^ i14) * 11953) ^ (-1776964808);
                        c11986 = c11986;
                    }
                    break;
                case -150992014:
                case 692620836:
                    i18 = i18;
                    i8 = iM4837 - 1;
                    if (i8 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚ۫") ^ i14) * (-87);
                        i = ((iM45029 ^ i15) * 30221) ^ 508458849;
                        i2 = -2068192369;
                    } else {
                        iM45029 = (C19806.m45029("᩻ܰ") ^ i15) * 15;
                        i = ((iM45029 ^ i14) * 6229) ^ (-1594694179);
                        i2 = -1684807209;
                    }
                    int i114 = i18;
                    i17 = iM45029 ^ i2;
                    i16 = i;
                    i13 = i114;
                    break;
                case 40730290:
                case 2075991300:
                    ArrayList arrayList3 = f54643;
                    iM4837 = C1377.m4837(arrayList3);
                    arrayList2 = arrayList3;
                    iM45029 = (i14 - ThreadFactoryC3888.m11306("ۨ᩹")) * (-71);
                    i = ((iM45029 ^ i15) * (-24345)) ^ (-1912000378);
                    i2 = 849758286;
                    int i115 = i18;
                    i17 = iM45029 ^ i2;
                    i16 = i;
                    i13 = i115;
                    break;
                case 294323431:
                case 670449153:
                    i12 = 54735;
                    iM11306 = (C19806.m45029("ۚۘ") + i14) * (-105);
                    i3 = ((iM11306 ^ i15) * 27045) ^ 201470523;
                    i4 = -408797860;
                    i5 = iM11306 ^ i4;
                    i13 = i18;
                    c11986 = c11986;
                    i17 = i5;
                    i16 = i3;
                    arrayList = arrayList;
                    break;
                case 472334862:
                case 582482477:
                    i18 = i18;
                    arrayList.remove(str);
                    c11986 = (C11986) f54640.remove(str);
                    if (c11986 != null) {
                        iM45029 = (i15 - C19806.m45029("ܶ۟")) * (-97);
                        i = ((iM45029 ^ i14) * (-23275)) ^ (-1015668427);
                        i2 = -1471060470;
                    } else {
                        iM45029 = C19806.m45029("ۢ᩵") ^ i14;
                        i = ((iM45029 ^ i15) * (-8093)) ^ 1752577083;
                        i2 = -1014907053;
                    }
                    int i116 = i18;
                    i17 = iM45029 ^ i2;
                    i16 = i;
                    i13 = i116;
                    break;
                case 491631282:
                case 565219831:
                    arrayList = arrayList;
                    c11986 = c11986;
                    i18 = i18;
                    int i21 = s + s2;
                    if (i11 - (i21 * i21) < 0) {
                        iM11306 = (C19806.m45029("᩺᩷") + i15) * (-43);
                        i3 = ((iM11306 ^ i14) * 19599) ^ 348268856;
                        i4 = 1423706489;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷֡") ^ i14;
                        i3 = ((iM11306 ^ i15) * (-1469)) ^ (-972078937);
                        i4 = -859564122;
                    }
                    i5 = iM11306 ^ i4;
                    i13 = i18;
                    c11986 = c11986;
                    i17 = i5;
                    i16 = i3;
                    arrayList = arrayList;
                    break;
                case 682640173:
                case 954683520:
                    i18 = i18;
                    RunnableC3388.m10052(m40017(str));
                    m40015();
                    if (C1460.f5948 < 0) {
                        iM45029 = C19806.m45029("ۧ֡") ^ i15;
                        i = ((iM45029 ^ i14) * (-10207)) ^ 1042258349;
                        i2 = -1331841116;
                        int i117 = i18;
                        i17 = iM45029 ^ i2;
                        i16 = i;
                        i13 = i117;
                    } else {
                        c11986 = c11986;
                        int iM450218 = (C19806.m45029("ܶ᩶") + i15) * 127;
                        i13 = i18;
                        sb = null;
                        i17 = iM450218 ^ (-1563837953);
                        i16 = ((iM450218 ^ i14) * 11953) ^ (-1776964808);
                        c11986 = c11986;
                    }
                    break;
                case 952054781:
                case 1064044323:
                    arrayList = arrayList;
                    c11986 = c11986;
                    i18 = i18;
                    int i22 = i9 + i10;
                    i11 = i22 + i22;
                    s2 = 9085;
                    if (C2704.m8255() > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳ᩸") + i14) * 39;
                        i3 = ((iM11306 ^ i15) * (-11831)) ^ (-1675301305);
                        i4 = -907168308;
                        i5 = iM11306 ^ i4;
                        i13 = i18;
                        c11986 = c11986;
                        i17 = i5;
                        i16 = i3;
                        arrayList = arrayList;
                    } else {
                        arrayList = arrayList;
                        int iM450219 = (C19806.m45029("ܶ᩶") + i15) * 127;
                        i13 = i18;
                        sb = null;
                        i17 = iM450219 ^ (-1563837953);
                        i16 = ((iM450219 ^ i14) * 11953) ^ (-1776964808);
                        c11986 = c11986;
                    }
                    break;
                case 1013407934:
                case 1654992746:
                    RunnableC3388.m10064();
                    iM45029 = C19806.m45029("ᩴۡ") ^ i14;
                    i18 = i18;
                    i = ((iM45029 ^ i15) * 1165) ^ 1363398714;
                    i2 = 463552791;
                    int i118 = i18;
                    i17 = iM45029 ^ i2;
                    i16 = i;
                    i13 = i118;
                    break;
                case 1316861370:
                case 1734115467:
                    if (!RunnableC1564.f6300) {
                        iM45029 = C19806.m45029("ᩴۡ") ^ i14;
                        i18 = i18;
                        i = ((iM45029 ^ i15) * 1165) ^ 1363398714;
                        i2 = 463552791;
                        int i119 = i18;
                        i17 = iM45029 ^ i2;
                        i16 = i;
                        i13 = i119;
                    } else {
                        arrayList = arrayList;
                        c11986 = c11986;
                        i18 = i18;
                        iM11306 = (ThreadFactoryC3888.m11306("۠᩷") + i15) * (-51);
                        i3 = ((iM11306 ^ i14) * (-5151)) ^ 366111934;
                        i4 = 995736685;
                        i5 = iM11306 ^ i4;
                        i13 = i18;
                        c11986 = c11986;
                        i17 = i5;
                        i16 = i3;
                        arrayList = arrayList;
                    }
                    break;
                default:
                    ((InterfaceC0903) C1419.m4967(arrayList2, i8)).mo3084();
                    iM4837 = i8;
                    iM45029 = (i14 - ThreadFactoryC3888.m11306("ۨ᩹")) * (-71);
                    i = ((iM45029 ^ i15) * (-24345)) ^ (-1912000378);
                    i2 = 849758286;
                    int i1110 = i18;
                    i17 = iM45029 ^ i2;
                    i16 = i;
                    i13 = i1110;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:88:0x037e A[PHI: r2 r16 r17 r21 r23 r24
      0x037e: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v5 java.lang.String) binds: [B:9:0x0067, B:87:0x037c, B:62:0x023e] A[DONT_GENERATE, DONT_INLINE]
      0x037e: PHI (r16v4 short[]) = (r16v2 short[]), (r16v3 short[]), (r16v2 short[]) binds: [B:9:0x0067, B:87:0x037c, B:62:0x023e] A[DONT_GENERATE, DONT_INLINE]
      0x037e: PHI (r17v4 char) = (r17v2 char), (r17v3 char), (r17v2 char) binds: [B:9:0x0067, B:87:0x037c, B:62:0x023e] A[DONT_GENERATE, DONT_INLINE]
      0x037e: PHI (r21v18 l.ۨ᩹ۘ) = (r21v9 l.ۨ᩹ۘ), (r21v10 l.ۨ᩹ۘ), (r21v19 l.ۨ᩹ۘ) binds: [B:9:0x0067, B:87:0x037c, B:62:0x023e] A[DONT_GENERATE, DONT_INLINE]
      0x037e: PHI (r23v9 int) = (r23v1 int), (r23v2 int), (r23v10 int) binds: [B:9:0x0067, B:87:0x037c, B:62:0x023e] A[DONT_GENERATE, DONT_INLINE]
      0x037e: PHI (r24v8 int) = (r24v0 int), (r24v1 int), (r24v9 int) binds: [B:9:0x0067, B:87:0x037c, B:62:0x023e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11986 m40020(C2455 c2455) throws C4987 {
        int iM45029;
        int i;
        int i2;
        int iM450210;
        int i3;
        int i4;
        int iM11306;
        int i5;
        int iM11307;
        int i6;
        int i7;
        int i8 = C1875.f7103;
        int i9 = C0629.f2722;
        int iM450211 = (i8 - C19806.m45029("᩺ۜ")) * 43;
        int i10 = ((iM450211 ^ i9) * 24079) ^ 1164260872;
        C12107 c12107M6235 = null;
        short[] sArr = null;
        int i11 = iM450211 ^ 1038438968;
        String strM8240 = null;
        int i12 = 0;
        short s = 0;
        int i13 = 0;
        int i14 = 0;
        short s2 = 0;
        char c = 0;
        int i15 = 921544088;
        int i16 = 0;
        short[] sArr2 = null;
        String strM10056 = null;
        C11986 c11986M29800 = null;
        Exception exc = null;
        Object obj = null;
        int iM11308 = 0;
        while (true) {
            i15 = i11 ^ (i10 & (((i15 ^ i9) * 5107) >> 31));
            switch (i15) {
                case -2020223640:
                case 1236254093:
                    c11986M29800 = c11986M29800;
                    i14 = i14;
                    i16 = s * s;
                    i13 = 370254564;
                    if (C3577.f13150 >= 0) {
                        iM11306 = (i8 - ThreadFactoryC3888.m11306("᩷᩹")) * (-3);
                        i3 = ((iM11306 ^ i9) * (-29205)) ^ (-1229466702);
                        i5 = 66032652;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۧ") ^ i8;
                        i3 = ((iM11306 ^ i9) * 29637) ^ (-364238910);
                        i5 = -1766337017;
                    }
                    i7 = iM11306 ^ i5;
                    i14 = i14;
                    C11986 c11986 = c11986M29800;
                    i11 = i7;
                    i10 = i3;
                    c11986M29800 = c11986;
                    break;
                case -2003445080:
                case 1252154612:
                    c11986M29800 = c11986M29800;
                    i13 = i13;
                    i14 = i14;
                    iM11308 = 2127484054 ^ ThreadFactoryC3888.m11306(strM10056);
                    if (c12107M6235 != null) {
                        iM450210 = ThreadFactoryC3888.m11306("᩸֨") ^ i9;
                        i3 = ((iM450210 ^ i8) * (-15947)) ^ 918970564;
                        i4 = 1766239341;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("᩶ܰ") ^ i8;
                        i3 = ((iM450210 ^ i9) * (-3003)) ^ 726626641;
                        i4 = -622788768;
                    }
                    i7 = iM450210 ^ i4;
                    i13 = i13;
                    i14 = i14;
                    C11986 c11987 = c11986M29800;
                    i11 = i7;
                    i10 = i3;
                    c11986M29800 = c11987;
                    break;
                case -1987070717:
                case -1500107115:
                    if (RunnableC1606.f6488 < 0) {
                        iM45029 = C19806.m45029("᩷ۚ") ^ i9;
                        i = ((iM45029 ^ i8) * 18801) ^ 766050104;
                        i2 = -485336583;
                        i11 = iM45029 ^ i2;
                        i10 = i;
                    } else {
                        c11986M29800 = c11986M29800;
                        i13 = i13;
                        i14 = i14;
                        iM450210 = (i9 - ThreadFactoryC3888.m11306("ܳ֫")) * (-33);
                        i3 = ((iM450210 ^ i8) * (-11297)) ^ (-831419276);
                        i4 = 810219073;
                        i7 = iM450210 ^ i4;
                        i13 = i13;
                        i14 = i14;
                        C11986 c11988 = c11986M29800;
                        i11 = i7;
                        i10 = i3;
                        c11986M29800 = c11988;
                    }
                    break;
                case -1851668359:
                case 757305170:
                    i12 = 34726;
                    iM450210 = (i8 - ThreadFactoryC3888.m11306("۫֡")) * 15;
                    i3 = ((iM450210 ^ i9) * 24983) ^ (-1312482397);
                    i4 = -735201773;
                    i7 = iM450210 ^ i4;
                    i13 = i13;
                    i14 = i14;
                    C11986 c11989 = c11986M29800;
                    i11 = i7;
                    i10 = i3;
                    c11986M29800 = c11989;
                    break;
                case -1825611783:
                case 835901367:
                    throw new C4987(C1875.m6085(iM11308));
                case -1813197731:
                case -527561102:
                    c11986M29800 = c11986M29800;
                    i13 = i13;
                    i14 = i14;
                    int i17 = s + s2;
                    if (i14 - (i17 * i17) < 0) {
                        iM450210 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i9;
                        i3 = ((iM450210 ^ i8) * 23955) ^ 1083448104;
                        i4 = -1204445343;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("֡֫") ^ i8) * (-103);
                        i3 = ((iM450210 ^ i9) * (-3605)) ^ 1473278482;
                        i4 = -828092202;
                    }
                    i7 = iM450210 ^ i4;
                    i13 = i13;
                    i14 = i14;
                    C11986 c119810 = c11986M29800;
                    i11 = i7;
                    i10 = i3;
                    c11986M29800 = c119810;
                    break;
                case -1420200721:
                case 718757086:
                    i12 = 43053;
                    iM450210 = (i8 - ThreadFactoryC3888.m11306("۫֡")) * 15;
                    i3 = ((iM450210 ^ i9) * 24983) ^ (-1312482397);
                    i4 = -735201773;
                    i7 = iM450210 ^ i4;
                    i13 = i13;
                    i14 = i14;
                    C11986 c119811 = c11986M29800;
                    i11 = i7;
                    i10 = i3;
                    c11986M29800 = c119811;
                    break;
                case -1391663768:
                case 1625864456:
                    if (C3660.f13403 < 0) {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("ܿۤ")) * (-41);
                        i = ((iM45029 ^ i8) * 25947) ^ (-1489129265);
                        i2 = -442109139;
                        i11 = iM45029 ^ i2;
                        i10 = i;
                    } else {
                        c11986M29800 = c11986M29800;
                        i13 = i13;
                        i14 = i14;
                        iM450210 = (i9 - ThreadFactoryC3888.m11306("ܳ֫")) * (-33);
                        i3 = ((iM450210 ^ i8) * (-11297)) ^ (-831419276);
                        i4 = 810219073;
                        i7 = iM450210 ^ i4;
                        i13 = i13;
                        i14 = i14;
                        C11986 c119812 = c11986M29800;
                        i11 = i7;
                        i10 = i3;
                        c11986M29800 = c119812;
                    }
                    break;
                case -1326921268:
                case -260132226:
                    if (C1066.f4915 <= 0) {
                        c11986M29800 = c11986M29800;
                        i13 = i13;
                        iM11307 = C19806.m45029("ܺ۟") ^ i8;
                        i3 = ((iM11307 ^ i9) * 22777) ^ 1033828684;
                        i6 = -1948693440;
                        i7 = iM11307 ^ i6;
                        i13 = i13;
                        C11986 c119813 = c11986M29800;
                        i11 = i7;
                        i10 = i3;
                        c11986M29800 = c119813;
                    } else {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("ܿۤ")) * (-41);
                        i = ((iM45029 ^ i8) * 25947) ^ (-1489129265);
                        i2 = -442109139;
                        i11 = iM45029 ^ i2;
                        i10 = i;
                    }
                    break;
                case -1324028128:
                case 1468572163:
                    StringBuilder sb = new StringBuilder();
                    c11986M29800 = c11986M29800;
                    String strM6085 = C1875.m6085(iM11308);
                    if (C1377.m4833() == 0) {
                        C1148.m4223(sb, strM6085);
                        short[] sArr3 = f54641;
                        i13 = i13;
                        if (C1189.f5284 > 0) {
                            i14 = i14;
                            C2788.m8480(sb, C3722.m10901(sArr3, 76, 1, i12));
                            if (C0216.f1393 == 0) {
                                RunnableC1895.m6168(sb, exc);
                                throw new C4987(C0817.m3407(sb));
                            }
                            iM450210 = (i9 - ThreadFactoryC3888.m11306("ܳ֫")) * (-33);
                            i3 = ((iM450210 ^ i8) * (-11297)) ^ (-831419276);
                            i4 = 810219073;
                            i7 = iM450210 ^ i4;
                            i13 = i13;
                            i14 = i14;
                            C11986 c119814 = c11986M29800;
                            i11 = i7;
                            i10 = i3;
                            c11986M29800 = c119814;
                        }
                    } else {
                        i13 = i13;
                    }
                    i14 = i14;
                    iM450210 = (C19806.m45029("ܺ᩻") + i8) * (-23);
                    i3 = ((iM450210 ^ i9) * (-23269)) ^ 3812868;
                    i4 = 100903297;
                    i7 = iM450210 ^ i4;
                    i13 = i13;
                    i14 = i14;
                    C11986 c119815 = c11986M29800;
                    i11 = i7;
                    i10 = i3;
                    c11986M29800 = c119815;
                    break;
                case -1217936792:
                case -84084272:
                    c11986M29800 = c11986M29800;
                    i13 = i13;
                    i14 = i14;
                    try {
                        c11986M29800 = C11986.m29800(new JSONObject(new String(C2788.m8467(c2455, c12107M6235, obj), StandardCharsets.UTF_8)), c2455);
                        int iM11309 = (ThreadFactoryC3888.m11306("ܽܽ") ^ i8) * (-67);
                        i11 = iM11309 ^ (-1721749866);
                        i10 = ((iM11309 ^ i9) * 9403) ^ (-1884925824);
                        i13 = i13;
                        i14 = i14;
                    } catch (Exception e) {
                        exc = e;
                        iM450210 = (C19806.m45029("᩸᩷") ^ i9) * (-69);
                        i3 = ((iM450210 ^ i8) * 28755) ^ 586344575;
                        i4 = -1808664550;
                        i7 = iM450210 ^ i4;
                        i13 = i13;
                        i14 = i14;
                        C11986 c119816 = c11986M29800;
                        i11 = i7;
                        i10 = i3;
                        c11986M29800 = c119816;
                    }
                    break;
                case -1118430239:
                case 1377219418:
                    c11986M29800 = c11986M29800;
                    i13 = i13;
                    i14 = i14;
                    sArr2 = f54641;
                    c = ';';
                    if (C2871.m8646()) {
                        iM450210 = (i8 - C19806.m45029("ᩳ᩷")) * 85;
                        i3 = ((iM450210 ^ i9) * (-5471)) ^ 1747942167;
                        i4 = -886462840;
                    } else {
                        iM450210 = C19806.m45029("ᩳ᩹") ^ i9;
                        i3 = ((iM450210 ^ i8) * (-10449)) ^ (-1299389097);
                        i4 = -1696388191;
                    }
                    i7 = iM450210 ^ i4;
                    i13 = i13;
                    i14 = i14;
                    C11986 c119817 = c11986M29800;
                    i11 = i7;
                    i10 = i3;
                    c11986M29800 = c119817;
                    break;
                case -1101645341:
                case -607875959:
                    c11986M29800 = c11986M29800;
                    i13 = i13;
                    i14 = i14;
                    c12107M6235 = ViewGroupOnHierarchyChangeListenerC1916.m6235(c2455, strM8240);
                    sArr = f54641;
                    if (C7105.f23796 >= 0) {
                        iM450210 = (i9 - ThreadFactoryC3888.m11306("ܳ֫")) * (-33);
                        i3 = ((iM450210 ^ i8) * (-11297)) ^ (-831419276);
                        i4 = 810219073;
                    } else {
                        iM450210 = (i8 - ThreadFactoryC3888.m11306("ܿ֨")) * (-67);
                        i3 = ((iM450210 ^ i9) * 29757) ^ 1430632507;
                        i4 = 1728988468;
                    }
                    i7 = iM450210 ^ i4;
                    i13 = i13;
                    i14 = i14;
                    C11986 c119818 = c11986M29800;
                    i11 = i7;
                    i10 = i3;
                    c11986M29800 = c119818;
                    break;
                case -875566330:
                case 1324966101:
                    C2249.m6915();
                    C3660.m10791();
                    return null;
                case -662499233:
                case 1163586021:
                    C1189.m4368();
                    if (C1460.m5050() == 0) {
                        c11986M29800 = c11986M29800;
                        i13 = i13;
                        i14 = i14;
                        iM450210 = C19806.m45029("ᩳ᩹") ^ i9;
                        i3 = ((iM450210 ^ i8) * (-10449)) ^ (-1299389097);
                        i4 = -1696388191;
                        i7 = iM450210 ^ i4;
                        i13 = i13;
                        i14 = i14;
                        C11986 c119819 = c11986M29800;
                        i11 = i7;
                        i10 = i3;
                        c11986M29800 = c119819;
                    } else {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("ܿۤ")) * (-41);
                        i = ((iM45029 ^ i8) * 25947) ^ (-1489129265);
                        i2 = -442109139;
                        i11 = iM45029 ^ i2;
                        i10 = i;
                    }
                    break;
                case -585422923:
                case -275678405:
                    c11986M29800 = c11986M29800;
                    i13 = i13;
                    i14 = i14;
                    s = sArr2[c];
                    if (C1460.f5948 >= 0) {
                        iM450210 = (C19806.m45029("ܺ᩻") + i8) * (-23);
                        i3 = ((iM450210 ^ i9) * (-23269)) ^ 3812868;
                        i4 = 100903297;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ۡ۟") ^ i9;
                        i3 = ((iM450210 ^ i8) * 25407) ^ 1265544108;
                        i4 = -1795499598;
                    }
                    i7 = iM450210 ^ i4;
                    i13 = i13;
                    i14 = i14;
                    C11986 c1198110 = c11986M29800;
                    i11 = i7;
                    i10 = i3;
                    c11986M29800 = c1198110;
                    break;
                case -410444249:
                case 110712772:
                    C0526.m2437();
                    if (C3535.f13026 <= 0) {
                        c11986M29800 = c11986M29800;
                        i14 = i14;
                        iM11306 = (i8 - ThreadFactoryC3888.m11306("᩷᩹")) * (-3);
                        i3 = ((iM11306 ^ i9) * (-29205)) ^ (-1229466702);
                        i5 = 66032652;
                        i7 = iM11306 ^ i5;
                        i14 = i14;
                        C11986 c1198111 = c11986M29800;
                        i11 = i7;
                        i10 = i3;
                        c11986M29800 = c1198111;
                    }
                    c11986M29800 = c11986M29800;
                    i13 = i13;
                    i14 = i14;
                    iM450210 = (i9 - ThreadFactoryC3888.m11306("ܳ֫")) * (-33);
                    i3 = ((iM450210 ^ i8) * (-11297)) ^ (-831419276);
                    i4 = 810219073;
                    i7 = iM450210 ^ i4;
                    i13 = i13;
                    i14 = i14;
                    C11986 c1198112 = c11986M29800;
                    i11 = i7;
                    i10 = i3;
                    c11986M29800 = c1198112;
                    break;
                case -393409009:
                case 945420640:
                    return c11986M29800;
                case -58642927:
                case 2105942855:
                    c11986M29800 = c11986M29800;
                    i13 = i13;
                    int i18 = i16 + i13;
                    i14 = i18 + i18;
                    s2 = 19242;
                    if (C0671.f2816 != 0) {
                        iM11307 = C19806.m45029("ܺ۟") ^ i8;
                        i3 = ((iM11307 ^ i9) * 22777) ^ 1033828684;
                        i6 = -1948693440;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("᩹ᩴ") + i9) * (-37);
                        i3 = ((iM11307 ^ i8) * (-20233)) ^ (-231770249);
                        i6 = -791516489;
                    }
                    i7 = iM11307 ^ i6;
                    i13 = i13;
                    C11986 c1198113 = c11986M29800;
                    i11 = i7;
                    i10 = i3;
                    c11986M29800 = c1198113;
                    break;
                case 335476682:
                case 1276017010:
                    c11986M29800 = c11986M29800;
                    i13 = i13;
                    i14 = i14;
                    strM8240 = C2704.m8240(f54641, 60, 13, i12);
                    if (C19806.f63586) {
                        iM450210 = C19806.m45029("ᩳ᩹") ^ i9;
                        i3 = ((iM450210 ^ i8) * (-10449)) ^ (-1299389097);
                        i4 = -1696388191;
                    } else {
                        iM450210 = (C19806.m45029("ܳܰ") + i9) * 17;
                        i3 = ((iM450210 ^ i8) * 7381) ^ (-1036491098);
                        i4 = -1850169928;
                    }
                    i7 = iM450210 ^ i4;
                    i13 = i13;
                    i14 = i14;
                    C11986 c1198114 = c11986M29800;
                    i11 = i7;
                    i10 = i3;
                    c11986M29800 = c1198114;
                    break;
                case 359291872:
                case 956348939:
                    c11986M29800 = c11986M29800;
                    i13 = i13;
                    i14 = i14;
                    strM10056 = RunnableC3388.m10056(sArr, 73, 3, i12);
                    if (C3660.f13403 < 0) {
                        iM450210 = C19806.m45029("ۛۡ") ^ i9;
                        i3 = ((iM450210 ^ i8) * (-4359)) ^ 937680587;
                        i4 = -1678061302;
                        i7 = iM450210 ^ i4;
                        i13 = i13;
                        i14 = i14;
                        C11986 c1198115 = c11986M29800;
                        i11 = i7;
                        i10 = i3;
                        c11986M29800 = c1198115;
                    } else {
                        i14 = i14;
                        iM11307 = C19806.m45029("ܺ۟") ^ i8;
                        i3 = ((iM11307 ^ i9) * 22777) ^ 1033828684;
                        i6 = -1948693440;
                        i7 = iM11307 ^ i6;
                        i13 = i13;
                        C11986 c1198116 = c11986M29800;
                        i11 = i7;
                        i10 = i3;
                        c11986M29800 = c1198116;
                    }
                    break;
                case 922239664:
                case 2049590937:
                    c11986M29800 = c11986M29800;
                    i13 = i13;
                    i14 = i14;
                    obj = null;
                    iM450210 = C19806.m45029("ۛᩳ") ^ i8;
                    i3 = ((iM450210 ^ i9) * (-11199)) ^ (-1383096727);
                    i4 = 1549156157;
                    i7 = iM450210 ^ i4;
                    i13 = i13;
                    i14 = i14;
                    C11986 c1198117 = c11986M29800;
                    i11 = i7;
                    i10 = i3;
                    c11986M29800 = c1198117;
                    break;
                default:
                    ThreadFactoryC3888.m11300();
                    C1377.m4833();
                    c11986M29800 = c11986M29800;
                    i13 = i13;
                    i14 = i14;
                    iM450210 = (i9 - ThreadFactoryC3888.m11306("ܳ֫")) * (-33);
                    i3 = ((iM450210 ^ i8) * (-11297)) ^ (-831419276);
                    i4 = 810219073;
                    i7 = iM450210 ^ i4;
                    i13 = i13;
                    i14 = i14;
                    C11986 c1198118 = c11986M29800;
                    i11 = i7;
                    i10 = i3;
                    c11986M29800 = c1198118;
                    break;
            }
        }
    }
}
