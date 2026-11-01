package l;

import android.view.View;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۢ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1FQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9890 implements InterfaceC21692 {

    /* JADX INFO: renamed from: ᩹᩻᩶, reason: not valid java name and contains not printable characters */
    private static final short[] f33763 = {5880, -25719, -25682, -25680, -25713, -25708, -25699, -25619, -25716, -25682, -25675, -25677, -25682, -25675, -25688, -25691, -25719, -25682, -25680, -25615, -25688, -25667, -25682, -25669, -25671, -25688, -25618, -25628, -25716, -25682, -25675, -25677, -25682, -25675, -25688, -25691, -25719, -25682, -25680, -25720, -25667, -25682, -25669, -25671, -25688, -25618, -25628, -25719, -25682, -25680, -25720, -25667, -25682, -25669, -25671, -25688, -25618, -25628, -25713, -25708, -25699, -25619, -25720, -25667, -25682, -25669, -25671, -25688, -25618, -25628, -25711, -25720, -25614, -25667, -25684, -25673, -25684, -25682, -25675, -25677, -25682, -25675, -25688, -25691, -25719, -25682, -25680, -25687, -25682, -25680, -25670, -25675, -25680, -25671, -25681, -25676, -25667, -25619, -25686, -25671, -25682, -25681, -25675, -25677, -25678, -25707, -25678, -25670, -25677, -25686, -25671, -25682, -25681, -25675, -25677, -25678, -25710, -25667, -25679, -25671, 8616, -781, -832, -809, -810, -820, -822, -821, -794, -822, -831, -832, -810, -816, -813, -826, -781, -832, -809, -810, -820, -822, -821, -789, -828, -824, -832, -778, -818, -820, -811, -891, -816, -811, -831, -828, -815, -832, -781, -832, -809, -810, -820, -822, -821, -788, -821, -829, -822, -21390, -25482, -24398, -784, -809, -823, -792, -832, -815, -819, -822, -831, -831, -822, -814, -821, -823, -822, -828, -831, -778, -819, -822, -814, -778, -818, -820, -811, -815, -809, -816, -832, 27985, -24517, -24796, -821, -828, -826, -816, -825, -27295, 29866, 29628, -891, 31843, -28458, -22216, 25330, 28031, 26305, -26834, 28505, -22082, 7374, -4069, 13197, 16291};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f33764;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13188 f33765;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f33766;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f33767;

    @Override // l.InterfaceC21692
    /* JADX INFO: renamed from: ۙ */
    public final void mo22087(byte[] bArr) throws Throwable {
        Runnable runnable = null;
        Throwable th = null;
        int i = -1536620009;
        int i2 = C1977.f7413;
        int i3 = C2124.f7782;
        int iM11306 = ThreadFactoryC3888.m11306("ۗ֡") ^ i3;
        int i4 = ((iM11306 ^ i2) * 16549) ^ (-698458666);
        int i5 = 913438251;
        while (true) {
            i = ((((i ^ i2) * (-10587)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2108058642:
                case -841231643:
                    RunnableC1606.m5473();
                    C3535.m10431();
                    iM11306 = C19806.m45029("֨᩶") ^ i3;
                    i4 = ((iM11306 ^ i2) * 24205) ^ 1258764047;
                    i5 = -1095847474;
                    break;
                case -2012440846:
                case -95596842:
                    throw th;
                case -1952488759:
                case -919208437:
                    C0671.m3008();
                    return;
                case -1721467445:
                case 760953340:
                    runnable = this.f33766;
                    iM11306 = C19806.m45029("ܳ᩷") ^ i3;
                    i4 = ((iM11306 ^ i2) * 29065) ^ (-595701137);
                    i5 = -1262235545;
                    break;
                case -1586475405:
                case -674817266:
                    if (C0962.f3784) {
                        iM11306 = C19806.m45029("ܿ֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20687)) ^ (-1666716354);
                        i5 = 95296702;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11155)) ^ (-1984825899);
                        i5 = 1849331833;
                    }
                    break;
                case -1301054133:
                case -1164236637:
                    return;
                case -1275234249:
                case 950318758:
                    RunnableC3388.m10064();
                    if (!C2704.f10408) {
                        iM11306 = C19806.m45029("ۘ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22903)) ^ 1886088466;
                        i5 = -1612799489;
                    } else {
                        iM11306 = C19806.m45029("֨᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24205) ^ 1258764047;
                        i5 = -1095847474;
                    }
                    break;
                case -1269032621:
                case 766693933:
                    if (this.f33764) {
                        iM11306 = (C19806.m45029("ۖۡ") ^ i3) * 59;
                        i4 = ((iM11306 ^ i2) * 1833) ^ (-1260529600);
                        i5 = 415430322;
                    } else {
                        iM11306 = (C19806.m45029("ܿ۟") + i2) * (-109);
                        i4 = ((iM11306 ^ i3) * (-20305)) ^ 1046522496;
                        i5 = -1428259284;
                    }
                    break;
                case -1211103817:
                case 1010579014:
                    if (C1189.m4368() <= 0) {
                        iM11306 = C19806.m45029("ۘ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22903)) ^ 1886088466;
                        i5 = -1612799489;
                    } else {
                        iM11306 = C19806.m45029("ۢᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-9843)) ^ 1383743046;
                        i5 = 1515778293;
                    }
                    break;
                case -1176034464:
                case 1632255081:
                    C1977.m6365(runnable);
                    iM11306 = (C19806.m45029("ۖۡ") ^ i3) * 59;
                    i4 = ((iM11306 ^ i2) * 1833) ^ (-1260529600);
                    i5 = 415430322;
                    break;
                case -1017598008:
                case 1559951780:
                    try {
                        m25033(bArr);
                        iM11306 = ThreadFactoryC3888.m11306("ۚ᩸") ^ i2;
                        i4 = ((iM11306 ^ i3) * 22271) ^ (-1923068866);
                        i5 = 294452260;
                    } catch (Throwable th2) {
                        th = th2;
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۜ֡")) * (-111);
                        i4 = ((iM11306 ^ i3) * (-12167)) ^ 1040621050;
                        i5 = -609005828;
                    }
                    break;
                case -815466946:
                case -750856368:
                    if (C0629.f2722 <= 0) {
                        iM11306 = C19806.m45029("ܿ֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20687)) ^ (-1666716354);
                        i5 = 95296702;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗۜ") + i2) * 75;
                        i4 = ((iM11306 ^ i3) * 5303) ^ (-1544083021);
                        i5 = -135157581;
                    }
                    break;
                case -666387726:
                case -244336022:
                    if (C2249.m6915() <= 0) {
                        iM11306 = C19806.m45029("ܿ֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20687)) ^ (-1666716354);
                        i5 = 95296702;
                    } else {
                        iM11306 = C19806.m45029("ۘ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22903)) ^ 1886088466;
                        i5 = -1612799489;
                    }
                    break;
                case -613025504:
                case 140346016:
                    if (C2871.m8646()) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-3311)) ^ 1485205227;
                        i5 = 907879987;
                    } else {
                        iM11306 = C19806.m45029("֨᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24205) ^ 1258764047;
                        i5 = -1095847474;
                    }
                    break;
                case -479409719:
                case 93914120:
                    if (C1189.m4368() <= 0) {
                        iM11306 = C19806.m45029("ۢۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 28549) ^ 1295409514;
                        i5 = -1975321805;
                    } else {
                        iM11306 = C19806.m45029("ۛܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20409)) ^ 1724472182;
                        i5 = -285269896;
                    }
                    break;
                case -290256934:
                case 622430583:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = C19806.m45029("ۘ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22903)) ^ 1886088466;
                        i5 = -1612799489;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺ᩺") ^ i3) * 127;
                        i4 = ((iM11306 ^ i2) * 26717) ^ 172533616;
                        i5 = -2115644421;
                    }
                    break;
                case -267063696:
                case 38316347:
                    if (C0797.f3386) {
                        iM11306 = C19806.m45029("ۘ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22903)) ^ 1886088466;
                        i5 = -1612799489;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܶۛ")) * (-23);
                        i4 = ((iM11306 ^ i3) * 10157) ^ 973849421;
                        i5 = -1542813633;
                    }
                    break;
                case 196169364:
                case 1916108025:
                    C1875.m6086();
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = C19806.m45029("֨᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24205) ^ 1258764047;
                        i5 = -1095847474;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 13937) ^ (-1347394933);
                        i5 = 1329583512;
                    }
                    break;
                case 290869999:
                case 1133088638:
                    if (this.f33764) {
                        iM11306 = (C19806.m45029("۠ۖ") + i3) * 11;
                        i4 = ((iM11306 ^ i2) * 10591) ^ (-1657486087);
                        i5 = -1725751640;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵ܳ") + i2) * (-17);
                        i4 = ((iM11306 ^ i3) * (-14571)) ^ (-1823502546);
                        i5 = -448987006;
                    }
                    break;
                case 1099323963:
                case 1998121628:
                    if (RunnableC1564.f6300) {
                        iM11306 = C19806.m45029("ۘ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22903)) ^ 1886088466;
                        i5 = -1612799489;
                    } else {
                        iM11306 = C19806.m45029("ۚܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 23517) ^ (-200702576);
                        i5 = -1532654910;
                    }
                    break;
                case 1105897866:
                case 2020119941:
                    if (C1668.f6641 >= 0) {
                        iM11306 = C19806.m45029("֨᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24205) ^ 1258764047;
                        i5 = -1095847474;
                    } else {
                        iM11306 = C19806.m45029("֨ܿ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24075)) ^ 992454319;
                        i5 = 1418027771;
                    }
                    break;
                case 1475144267:
                case 1750374524:
                    C1977.m6365(runnable);
                    iM11306 = (C19806.m45029("۠ۖ") + i3) * 11;
                    i4 = ((iM11306 ^ i2) * 10591) ^ (-1657486087);
                    i5 = -1725751640;
                    break;
                default:
                    if (C3577.f13150 >= 0) {
                        iM11306 = C19806.m45029("֨᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24205) ^ 1258764047;
                        i5 = -1095847474;
                    } else {
                        iM11306 = (i2 - C19806.m45029("᩻᩻")) * (-45);
                        i4 = ((iM11306 ^ i3) * (-24637)) ^ 1901185432;
                        i5 = 2066433142;
                    }
                    break;
            }
        }
    }

    public C9890(C13188 c13188, Runnable runnable, boolean z) {
        int i = 585718325;
        int i2 = C1977.f7413;
        int i3 = C2788.f10625;
        int iM45029 = (i2 - C19806.m45029("۬ۛ")) * 29;
        int i4 = ((iM45029 ^ i3) * (-21083)) ^ 774925582;
        int i5 = 437700639;
        while (true) {
            i = ((((i ^ i3) * 5517) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1960184590:
                case -1200319991:
                    if (AbstractC0464.m2313() == 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 8607) ^ 1550875750;
                        i5 = -389022377;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۨ") ^ i3) * (-55);
                        i4 = ((iM45029 ^ i2) * 4779) ^ 760820489;
                        i5 = 1407843060;
                    }
                    break;
                case -1754158563:
                case -248849380:
                    if (C1398.f5802 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۨ") ^ i3) * (-55);
                        i4 = ((iM45029 ^ i2) * 4779) ^ 760820489;
                        i5 = 1407843060;
                    } else {
                        iM45029 = (C19806.m45029("ܿ᩷") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM45029 ^ i2) * 25783) ^ (-361443031);
                        i5 = -1181817319;
                    }
                    break;
                case -1161118522:
                case 717834425:
                    if (C1066.m4023() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۨ") ^ i3) * (-55);
                        i4 = ((iM45029 ^ i2) * 4779) ^ 760820489;
                        i5 = 1407843060;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * 24857) ^ (-257338331);
                        i5 = 972056747;
                    }
                    break;
                case -758383517:
                case 452936664:
                    if (C3577.f13150 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * 24857) ^ (-257338331);
                        i5 = 972056747;
                    } else {
                        iM45029 = (C19806.m45029("ܿ᩹") ^ i3) * 61;
                        i4 = ((iM45029 ^ i2) * (-1281)) ^ (-1379041402);
                        i5 = -1219531024;
                    }
                    break;
                case -422294536:
                case 1477804461:
                    if (C7105.f23796 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 8607) ^ 1550875750;
                        i5 = -389022377;
                    } else {
                        iM45029 = (C19806.m45029("۬᩵") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM45029 ^ i2) * (-16325)) ^ 1199250216;
                        i5 = -2113011986;
                    }
                    break;
                case -352508503:
                case 308814933:
                    this.f33767 = z;
                    return;
                case -319949951:
                case 255544960:
                    if (C3535.f13026 <= 0) {
                        iM45029 = (C19806.m45029("۬֨") ^ i3) * (-123);
                        i4 = ((iM45029 ^ i2) * 22595) ^ (-582342923);
                        i5 = -1054740145;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۙᩳ")) * (-111);
                        i4 = ((iM45029 ^ i3) * 13263) ^ 1613661701;
                        i5 = -125199241;
                    }
                    break;
                case -139825955:
                case 198303722:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (C7105.f23796 < 0) {
                        iM45029 = (C19806.m45029("ۙܽ") + i3) * 85;
                        i4 = ((iM45029 ^ i2) * (-2903)) ^ (-1396713555);
                        i5 = -2085277936;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۨ") ^ i3) * (-55);
                        i4 = ((iM45029 ^ i2) * 4779) ^ 760820489;
                        i5 = 1407843060;
                    }
                    break;
                case 31866612:
                case 1682066760:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (C19806.m45029("۬֨") ^ i3) * (-123);
                        i4 = ((iM45029 ^ i2) * 22595) ^ (-582342923);
                        i5 = -1054740145;
                    } else {
                        iM45029 = (C19806.m45029("۫ۗ") ^ i2) * (-21);
                        i4 = ((iM45029 ^ i3) * 18511) ^ (-1705946386);
                        i5 = -1351841231;
                    }
                    break;
                case 92855859:
                case 1513794087:
                    C0629.m2907();
                    C0797.m3359();
                    iM45029 = ThreadFactoryC3888.m11306("ܺ᩻") ^ i2;
                    i4 = ((iM45029 ^ i3) * 24857) ^ (-257338331);
                    i5 = 972056747;
                    break;
                case 240567280:
                case 696503225:
                    if (C0797.m3359()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-29637)) ^ (-1323833342);
                        i5 = 169027566;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * 24857) ^ (-257338331);
                        i5 = 972056747;
                    }
                    break;
                case 501323536:
                case 1811222446:
                    C0216.m1591();
                    C3660.m10791();
                    throw new RuntimeException();
                case 904302467:
                case 1352600190:
                    this.f33765 = c13188;
                    this.f33766 = runnable;
                    if (C2642.f10294 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۨ") ^ i3) * (-55);
                        i4 = ((iM45029 ^ i2) * 4779) ^ 760820489;
                        i5 = 1407843060;
                    } else {
                        iM45029 = C19806.m45029("ᩳܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 13211) ^ (-1967396708);
                        i5 = 982309326;
                    }
                    break;
                case 1324700524:
                case 1965542146:
                    if (C0278.m1789() <= 0) {
                        iM45029 = (C19806.m45029("ۙܽ") + i3) * 85;
                        i4 = ((iM45029 ^ i2) * (-2903)) ^ (-1396713555);
                        i5 = -2085277936;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-13937)) ^ 2007605173;
                        i5 = -525483482;
                    }
                    break;
                case 1753907046:
                case 1926430128:
                    if (C2332.f8260) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩸ۜ")) * (-3);
                        i4 = ((iM45029 ^ i2) * (-13681)) ^ (-1332432389);
                        i5 = 1886007898;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۨ") ^ i3) * (-55);
                        i4 = ((iM45029 ^ i2) * 4779) ^ 760820489;
                        i5 = 1407843060;
                    }
                    break;
                default:
                    if (C0526.m2437() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 8607) ^ 1550875750;
                        i5 = -389022377;
                    } else {
                        iM45029 = (C19806.m45029("۠ܰ") + i3) * 55;
                        i4 = ((iM45029 ^ i2) * (-23819)) ^ 1154700602;
                        i5 = -1832811422;
                    }
                    break;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 39041. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m25033(byte[] r50) {
        /*
            Method dump skipped, instruction units count: 3904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9890.m25033(byte[]):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25032(C9890 c9890, boolean z, String str, HashMap map, DialogInterfaceC19356 dialogInterfaceC19356, String str2, View view) {
        int iM11306;
        int i;
        int i2;
        int i3;
        int iM11307;
        int i4;
        int i5;
        int i6;
        String str3;
        String str4;
        int i7;
        int iM11308;
        int i8;
        int i9;
        int i10;
        String str5;
        String str6;
        String strM2308;
        String str7;
        short[] sArr;
        String str8;
        String str9;
        StringBuilder sb;
        int i11;
        int i12;
        String str10;
        String str11;
        int iM45029;
        int i13;
        int i14;
        int i15;
        int i16;
        String str12;
        String str13;
        String str14;
        int i17;
        String str15;
        AbstractC20745 abstractC20745M5585;
        String str16;
        String str17;
        String str18;
        short[] sArr2;
        int i18;
        String str19;
        int iM11309;
        int i19;
        int i20;
        String str20;
        String str21;
        String strM10056;
        int iM450210;
        int i21;
        int i22;
        int iM113010;
        int i23;
        int i24;
        String str22 = str;
        String strM3859 = null;
        AbstractC20745 abstractC20745 = null;
        boolean zM8474 = false;
        boolean zM5058 = false;
        short[] sArr3 = null;
        int i25 = -592774197;
        int i26 = C1977.f7413;
        int i27 = C1025.f4800;
        int iM450211 = C19806.m45029("۬ܺ") ^ i26;
        int i28 = ((iM450211 ^ i27) * (-509)) ^ (-1304933550);
        int i29 = iM450211 ^ (-271781754);
        String str23 = null;
        AbstractC20745 abstractC20746 = null;
        StringBuilder sb2 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        C10142 c10142 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        C13188 c13188 = null;
        String strM10790 = null;
        String strM3406 = null;
        short[] sArr6 = null;
        int i36 = 0;
        String str27 = null;
        String str28 = null;
        int i37 = 0;
        String strM9788 = null;
        String str29 = null;
        String strM8240 = null;
        short[] sArr7 = null;
        String str30 = null;
        while (true) {
            i25 = i29 ^ (i28 & (((i25 ^ i27) * (-5705)) >> 31));
            switch (i25) {
                case -2142623439:
                case -574212774:
                    int i38 = i34;
                    String str31 = str30;
                    String str32 = str25;
                    str3 = str26;
                    str4 = str27;
                    short[] sArr8 = sArr5;
                    i7 = i30;
                    String str33 = str29;
                    StringBuilder sb3 = sb2;
                    int i39 = i35;
                    C2477.m7603(view, false);
                    int i40 = C16737.m39261().targetSdkVersion;
                    strM3859 = C1025.m3859(f33763, 4, 4, i31);
                    if (i40 == 28) {
                        iM11308 = (i27 - C19806.m45029("ܺۘ")) * (-71);
                        i8 = ((iM11308 ^ i26) * 25899) ^ (-1077237819);
                        i9 = -854106300;
                    } else {
                        iM11308 = (i26 - ThreadFactoryC3888.m11306("֫۫")) * 33;
                        i8 = ((iM11308 ^ i27) * 21321) ^ (-1812353118);
                        i9 = 684763038;
                    }
                    i10 = iM11308 ^ i9;
                    i28 = i8;
                    i35 = i39;
                    sb2 = sb3;
                    str29 = str33;
                    str30 = str31;
                    sArr5 = sArr8;
                    str25 = str32;
                    i34 = i38;
                    str23 = "";
                    i30 = i7;
                    str27 = str4;
                    str26 = str3;
                    i29 = i10;
                    str22 = str;
                    break;
                case -2107209219:
                case 794160721:
                    if (C1419.f5860 >= 0) {
                        iM113010 = C19806.m45029("ۜۚ") ^ i26;
                        i23 = ((iM113010 ^ i27) * 23217) ^ (-36406781);
                        i24 = -1495488672;
                        i29 = iM113010 ^ i24;
                        i28 = i23;
                    } else {
                        str7 = str30;
                        str3 = str26;
                        str4 = str27;
                        sArr = sArr5;
                        i7 = i30;
                        str8 = str29;
                        str9 = str23;
                        sb = sb2;
                        i11 = i34;
                        i12 = i35;
                        str10 = str25;
                        str11 = strM3859;
                        iM45029 = (i26 - C19806.m45029("᩺ۢ")) * 17;
                        i13 = ((iM45029 ^ i27) * 32449) ^ (-564971432);
                        i14 = -78791350;
                        i10 = iM45029 ^ i14;
                        i28 = i13;
                        str25 = str10;
                        strM3859 = str11;
                        str29 = str8;
                        sArr5 = sArr;
                        i34 = i11;
                        i35 = i12;
                        str23 = str9;
                        str30 = str7;
                        sb2 = sb;
                        i30 = i7;
                        str27 = str4;
                        str26 = str3;
                        i29 = i10;
                        str22 = str;
                    }
                    break;
                case -2081198628:
                case 804051853:
                    C0629.m2907();
                    break;
                case -1989819690:
                case 2137135389:
                    RunnableC1564.m5345();
                    if (C2477.f9839 > 0) {
                        str7 = str30;
                        str3 = str26;
                        str4 = str27;
                        sArr = sArr5;
                        i7 = i30;
                        str8 = str29;
                        str9 = str23;
                        sb = sb2;
                        i11 = i34;
                        i12 = i35;
                        str10 = str25;
                        str11 = strM3859;
                        iM45029 = (i27 - ThreadFactoryC3888.m11306("ۖۤ")) * 71;
                        i13 = ((iM45029 ^ i26) * 13849) ^ (-1153849276);
                        i14 = 1865945758;
                        i10 = iM45029 ^ i14;
                        i28 = i13;
                        str25 = str10;
                        strM3859 = str11;
                        str29 = str8;
                        sArr5 = sArr;
                        i34 = i11;
                        i35 = i12;
                        str23 = str9;
                        str30 = str7;
                        sb2 = sb;
                        i30 = i7;
                        str27 = str4;
                        str26 = str3;
                        i29 = i10;
                        str22 = str;
                    } else {
                        str30 = str30;
                        str26 = str26;
                        str27 = str27;
                        sArr5 = sArr5;
                        i30 = i30;
                        str29 = str29;
                        strM9788 = strM9788;
                        str23 = str23;
                        int i41 = i35;
                        strM3859 = strM3859;
                        i3 = i34;
                        str25 = str25;
                        sb2 = sb2;
                        i35 = i41;
                        int iM450212 = C19806.m45029("ۚᩳ") ^ i27;
                        i28 = ((iM450212 ^ i26) * 23785) ^ 2065198515;
                        strM9788 = strM9788;
                        str23 = str23;
                        i30 = i30;
                        str29 = str29;
                        str30 = str30;
                        sArr5 = sArr5;
                        str27 = str27;
                        str26 = str26;
                        i29 = iM450212 ^ 1396864970;
                        str22 = str;
                        String str34 = str25;
                        i34 = i3;
                        strM3859 = strM3859;
                        i35 = i35;
                        sb2 = sb2;
                        str25 = str34;
                    }
                    break;
                case -1910102823:
                case 1727095958:
                    C3722.m10894();
                    if (C1937.f7317 >= 0) {
                        str20 = str26;
                        sArr5 = sArr5;
                        str21 = str29;
                        String str35 = str27;
                        i20 = i30;
                        strM10056 = str35;
                        iM450210 = ThreadFactoryC3888.m11306("ܰܳ") ^ i26;
                        i21 = ((iM450210 ^ i27) * (-28377)) ^ 2034009344;
                        i22 = 209072118;
                        int i42 = iM450210 ^ i22;
                        str26 = str20;
                        i29 = i42;
                        i28 = i21;
                        str29 = str21;
                        sArr5 = sArr5;
                        int i43 = i20;
                        str27 = strM10056;
                        i30 = i43;
                    } else {
                        str30 = str30;
                        str26 = str26;
                        str27 = str27;
                        sArr5 = sArr5;
                        i30 = i30;
                        str29 = str29;
                        strM9788 = strM9788;
                        str23 = str23;
                        int i44 = i35;
                        strM3859 = strM3859;
                        i3 = i34;
                        str25 = str25;
                        sb2 = sb2;
                        i35 = i44;
                        int iM450213 = C19806.m45029("ۚᩳ") ^ i27;
                        i28 = ((iM450213 ^ i26) * 23785) ^ 2065198515;
                        strM9788 = strM9788;
                        str23 = str23;
                        i30 = i30;
                        str29 = str29;
                        str30 = str30;
                        sArr5 = sArr5;
                        str27 = str27;
                        str26 = str26;
                        i29 = iM450213 ^ 1396864970;
                        str22 = str;
                        String str36 = str25;
                        i34 = i3;
                        strM3859 = strM3859;
                        i35 = i35;
                        sb2 = sb2;
                        str25 = str36;
                    }
                    break;
                case -1895842142:
                case 79735701:
                    if (!zM5058) {
                        str17 = str26;
                        str18 = str27;
                        sArr2 = sArr5;
                        i18 = i30;
                        str19 = str29;
                        iM11309 = (i26 - C19806.m45029("ۢۙ")) * (-111);
                        i28 = ((iM11309 ^ i27) * 15885) ^ 1855240879;
                        i19 = -927825343;
                        int i45 = iM11309 ^ i19;
                        str29 = str19;
                        sArr5 = sArr2;
                        String str37 = str17;
                        i29 = i45;
                        i30 = i18;
                        str27 = str18;
                        str26 = str37;
                    } else {
                        iM113010 = C19806.m45029("ۘ֫") ^ i27;
                        i23 = ((iM113010 ^ i26) * (-25005)) ^ 1246940930;
                        i24 = -266674556;
                        i29 = iM113010 ^ i24;
                        i28 = i23;
                    }
                    break;
                case -1584978881:
                case 1273855521:
                    if (C10634.f36300 >= 0) {
                        i20 = i30;
                        int iM113011 = (ThreadFactoryC3888.m11306("ۨۜ") ^ i27) * 83;
                        int i46 = ((iM113011 ^ i26) * (-28613)) ^ 753663786;
                        i29 = iM113011 ^ 93260384;
                        sArr5 = sArr5;
                        i30 = i20;
                        str27 = str27;
                        str26 = str26;
                        i28 = i46;
                        c10142 = null;
                    } else {
                        str7 = str30;
                        str3 = str26;
                        str4 = str27;
                        sArr = sArr5;
                        i7 = i30;
                        str8 = str29;
                        str9 = str23;
                        sb = sb2;
                        i11 = i34;
                        i12 = i35;
                        str10 = str25;
                        str11 = strM3859;
                        iM45029 = (i26 - C19806.m45029("᩺ۢ")) * 17;
                        i13 = ((iM45029 ^ i27) * 32449) ^ (-564971432);
                        i14 = -78791350;
                        i10 = iM45029 ^ i14;
                        i28 = i13;
                        str25 = str10;
                        strM3859 = str11;
                        str29 = str8;
                        sArr5 = sArr;
                        i34 = i11;
                        i35 = i12;
                        str23 = str9;
                        str30 = str7;
                        sb2 = sb;
                        i30 = i7;
                        str27 = str4;
                        str26 = str3;
                        i29 = i10;
                        str22 = str;
                    }
                    break;
                case -1488802340:
                case 1621354585:
                    str26 = str26;
                    sArr5 = sArr5;
                    String str38 = str27;
                    i20 = i30;
                    str27 = str38;
                    C13188.f43897 = new WeakReference(dialogInterfaceC19356);
                    int i47 = C20725.f67443;
                    if (C0216.m1591() > 0) {
                        c10142 = new C10142(C1192.class);
                        str20 = str26;
                        str21 = str29;
                        strM10056 = RunnableC3388.m10056(f33763, 76, 11, i31);
                        if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                            iM450210 = ThreadFactoryC3888.m11306("ܰܳ") ^ i26;
                            i21 = ((iM450210 ^ i27) * (-28377)) ^ 2034009344;
                            i22 = 209072118;
                        } else {
                            iM450210 = (C19806.m45029("ܿۤ") + i26) * 53;
                            i21 = ((iM450210 ^ i27) * (-9873)) ^ (-571031105);
                            i22 = -958694410;
                        }
                        int i48 = iM450210 ^ i22;
                        str26 = str20;
                        i29 = i48;
                        i28 = i21;
                        str29 = str21;
                        sArr5 = sArr5;
                        int i49 = i20;
                        str27 = strM10056;
                        i30 = i49;
                    } else {
                        int iM113012 = (ThreadFactoryC3888.m11306("ۨۜ") ^ i27) * 83;
                        int i410 = ((iM113012 ^ i26) * (-28613)) ^ 753663786;
                        i29 = iM113012 ^ 93260384;
                        sArr5 = sArr5;
                        i30 = i20;
                        str27 = str27;
                        str26 = str26;
                        i28 = i410;
                        c10142 = null;
                    }
                    break;
                case -1392574143:
                case 36009580:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        sArr5 = sArr5;
                        int iM450214 = C19806.m45029("۬ᩴ") ^ i27;
                        int i50 = i30;
                        int i51 = ((iM450214 ^ i26) * (-21047)) ^ (-1084312521);
                        i29 = iM450214 ^ (-1774698);
                        i28 = i51;
                        i30 = i50;
                        sArr5 = sArr5;
                    } else {
                        str30 = str30;
                        str26 = str26;
                        str27 = str27;
                        sArr5 = sArr5;
                        i30 = i30;
                        str29 = str29;
                        strM9788 = strM9788;
                        str23 = str23;
                        int i411 = i35;
                        strM3859 = strM3859;
                        i3 = i34;
                        str25 = str25;
                        sb2 = sb2;
                        i35 = i411;
                        int iM450215 = C19806.m45029("ۚᩳ") ^ i27;
                        i28 = ((iM450215 ^ i26) * 23785) ^ 2065198515;
                        strM9788 = strM9788;
                        str23 = str23;
                        i30 = i30;
                        str29 = str29;
                        str30 = str30;
                        sArr5 = sArr5;
                        str27 = str27;
                        str26 = str26;
                        i29 = iM450215 ^ 1396864970;
                        str22 = str;
                        String str39 = str25;
                        i34 = i3;
                        strM3859 = strM3859;
                        i35 = i35;
                        sb2 = sb2;
                        str25 = str39;
                    }
                    break;
                case -1314661671:
                case 1251699205:
                    str5 = str23;
                    str6 = strM3859;
                    String strM6685 = C2124.m6685(f33763, 47, 11, i31);
                    strM2308 = AbstractC0464.m2308(f33763, 58, 12, i31);
                    strM3406 = strM8240;
                    str25 = strM6685;
                    str28 = strM10790;
                    int iM450216 = (i27 - C19806.m45029("᩺ܺ")) * (-31);
                    int i52 = ((iM450216 ^ i26) * (-16191)) ^ 115743106;
                    i15 = iM450216 ^ (-1485453820);
                    i28 = i52;
                    i34 = i34;
                    strM3859 = str6;
                    str23 = str5;
                    str30 = strM2308;
                    i35 = i35;
                    str22 = str;
                    sb2 = sb2;
                    i30 = i30;
                    str27 = str27;
                    str26 = str26;
                    i29 = i15;
                    str29 = str29;
                    sArr5 = sArr5;
                    break;
                case -1212536912:
                case -494084041:
                    strM3859 = strM3859;
                    str30 = str30;
                    str25 = str25;
                    str26 = str26;
                    str27 = str27;
                    sArr5 = sArr5;
                    i30 = i30;
                    str29 = str29;
                    str23 = str23;
                    StringBuilder sb4 = sb2;
                    C1148.m4223(sb4, str22);
                    String str40 = str28;
                    C1148.m4223(sb4, str40);
                    sArr4 = f33763;
                    if (C1937.f7317 < 0) {
                        int iM450217 = (i27 - C19806.m45029("ۜۧ")) * 67;
                        sb2 = sb4;
                        str28 = str40;
                        i28 = ((iM450217 ^ i26) * (-20875)) ^ 32748820;
                        str25 = str25;
                        strM3859 = strM3859;
                        i30 = i30;
                        str29 = str29;
                        i34 = 72;
                        i35 = 4;
                        sArr5 = sArr5;
                        str27 = str27;
                        str26 = str26;
                        i29 = iM450217 ^ 1727181036;
                        str23 = str23;
                        str30 = str30;
                    } else {
                        sb2 = sb4;
                        str28 = str40;
                        strM9788 = strM9788;
                        i3 = 72;
                        i35 = 4;
                        int iM450218 = C19806.m45029("ۚᩳ") ^ i27;
                        i28 = ((iM450218 ^ i26) * 23785) ^ 2065198515;
                        strM9788 = strM9788;
                        str23 = str23;
                        i30 = i30;
                        str29 = str29;
                        str30 = str30;
                        sArr5 = sArr5;
                        str27 = str27;
                        str26 = str26;
                        i29 = iM450218 ^ 1396864970;
                        str22 = str;
                        String str310 = str25;
                        i34 = i3;
                        strM3859 = strM3859;
                        i35 = i35;
                        sb2 = sb2;
                        str25 = str310;
                    }
                    break;
                case -1204925815:
                case 1584616561:
                    C19806.m45024();
                    str30 = str30;
                    str26 = str26;
                    str27 = str27;
                    sArr5 = sArr5;
                    i30 = i30;
                    str29 = str29;
                    strM9788 = strM9788;
                    str23 = str23;
                    int i412 = i35;
                    strM3859 = strM3859;
                    i3 = i34;
                    str25 = str25;
                    sb2 = sb2;
                    i35 = i412;
                    int iM450219 = C19806.m45029("ۚᩳ") ^ i27;
                    i28 = ((iM450219 ^ i26) * 23785) ^ 2065198515;
                    strM9788 = strM9788;
                    str23 = str23;
                    i30 = i30;
                    str29 = str29;
                    str30 = str30;
                    sArr5 = sArr5;
                    str27 = str27;
                    str26 = str26;
                    i29 = iM450219 ^ 1396864970;
                    str22 = str;
                    String str311 = str25;
                    i34 = i3;
                    strM3859 = strM3859;
                    i35 = i35;
                    sb2 = sb2;
                    str25 = str311;
                    break;
                case -1166973702:
                case 824482715:
                    str5 = str23;
                    str6 = strM3859;
                    strM3406 = C0817.m3406(f33763, 8, 11, i31);
                    str25 = strM9788;
                    strM2308 = str6;
                    str28 = str5;
                    int iM4502110 = (i27 - C19806.m45029("᩺ܺ")) * (-31);
                    int i53 = ((iM4502110 ^ i26) * (-16191)) ^ 115743106;
                    i15 = iM4502110 ^ (-1485453820);
                    i28 = i53;
                    i34 = i34;
                    strM3859 = str6;
                    str23 = str5;
                    str30 = strM2308;
                    i35 = i35;
                    str22 = str;
                    sb2 = sb2;
                    i30 = i30;
                    str27 = str27;
                    str26 = str26;
                    i29 = i15;
                    str29 = str29;
                    sArr5 = sArr5;
                    break;
                case -1147398872:
                case 1899983844:
                    sArr5 = sArr5;
                    C1461.m5084(c10142, C1668.m5577(sArr5, i32, i36, i31), C0629.m2900(abstractC20745));
                    sArr7 = f33763;
                    i33 = 4;
                    if (C2249.m6915() <= 0) {
                        i30 = 94;
                        int iM4502111 = C19806.m45029("۬ᩴ") ^ i27;
                        int i54 = i30;
                        int i55 = ((iM4502111 ^ i26) * (-21047)) ^ (-1084312521);
                        i29 = iM4502111 ^ (-1774698);
                        i28 = i55;
                        i30 = i54;
                        sArr5 = sArr5;
                    } else {
                        int iM113013 = (ThreadFactoryC3888.m11306("ܰ֨") ^ i26) * 39;
                        int i56 = ((iM113013 ^ i27) * (-11587)) ^ 419321777;
                        i29 = iM113013 ^ 305600651;
                        i28 = i56;
                        sArr5 = sArr5;
                        i30 = 94;
                    }
                    break;
                case -1110855476:
                case 289728529:
                    str30 = str30;
                    str26 = str26;
                    str27 = str27;
                    sArr5 = sArr5;
                    i30 = i30;
                    str29 = str29;
                    strM9788 = strM9788;
                    str23 = str23;
                    i34 = i34;
                    str25 = str25;
                    sb2 = sb2;
                    i35 = i35;
                    strM3859 = strM3859;
                    sArr3 = f33763;
                    if (RunnableC3388.f12514 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ᩻") ^ i26) * (-25);
                        i = ((iM11306 ^ i27) * 27663) ^ (-1924193747);
                        i2 = 581279062;
                        i6 = iM11306 ^ i2;
                        i28 = i;
                        strM9788 = strM9788;
                        strM3859 = strM3859;
                        i30 = i30;
                        str29 = str29;
                        sArr5 = sArr5;
                        i35 = i35;
                        sb2 = sb2;
                        str27 = str27;
                        str26 = str26;
                        i29 = i6;
                        str25 = str25;
                        str22 = str;
                        i34 = i34;
                        str23 = str23;
                        str30 = str30;
                    } else {
                        i3 = i34;
                        int iM4502112 = C19806.m45029("ۚᩳ") ^ i27;
                        i28 = ((iM4502112 ^ i26) * 23785) ^ 2065198515;
                        strM9788 = strM9788;
                        str23 = str23;
                        i30 = i30;
                        str29 = str29;
                        str30 = str30;
                        sArr5 = sArr5;
                        str27 = str27;
                        str26 = str26;
                        i29 = iM4502112 ^ 1396864970;
                        str22 = str;
                        String str312 = str25;
                        i34 = i3;
                        strM3859 = strM3859;
                        i35 = i35;
                        sb2 = sb2;
                        str25 = str312;
                    }
                    break;
                case -1030505631:
                case 1826786799:
                    C1461.m5084(c10142, C0216.m1588(sArr7, i30, i33, i31), str29);
                    sArr6 = f33763;
                    if (C0216.f1393 != 0) {
                        i37 = 98;
                        i20 = i30;
                        int iM113014 = (ThreadFactoryC3888.m11306("ۨۜ") ^ i27) * 83;
                        int i413 = ((iM113014 ^ i26) * (-28613)) ^ 753663786;
                        i29 = iM113014 ^ 93260384;
                        sArr5 = sArr5;
                        i30 = i20;
                        str27 = str27;
                        str26 = str26;
                        i28 = i413;
                        c10142 = null;
                    } else {
                        int iM450220 = (C19806.m45029("ۜ᩺") + i27) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i29 = iM450220 ^ (-48401482);
                        i28 = ((iM450220 ^ i26) * (-29999)) ^ (-1244130693);
                        i37 = 98;
                    }
                    break;
                case -753101985:
                case 1903584736:
                    i31 = 39900;
                    iM11306 = (ThreadFactoryC3888.m11306("ۨ᩶") ^ i26) * 51;
                    i = ((iM11306 ^ i27) * (-32451)) ^ 29748119;
                    i2 = 1861849775;
                    i6 = iM11306 ^ i2;
                    i28 = i;
                    strM9788 = strM9788;
                    strM3859 = strM3859;
                    i30 = i30;
                    str29 = str29;
                    sArr5 = sArr5;
                    i35 = i35;
                    sb2 = sb2;
                    str27 = str27;
                    str26 = str26;
                    i29 = i6;
                    str25 = str25;
                    str22 = str;
                    i34 = i34;
                    str23 = str23;
                    str30 = str30;
                    break;
                case -739082899:
                case -110646873:
                    str7 = str30;
                    str3 = str26;
                    str4 = str27;
                    sArr = sArr5;
                    i7 = i30;
                    str8 = str29;
                    str9 = str23;
                    sb = sb2;
                    i11 = i34;
                    i12 = i35;
                    str10 = str25;
                    str11 = strM3859;
                    strM10790 = C3660.m10790(f33763, 19, 9, i31);
                    strM8240 = C2704.m8240(f33763, 28, 19, i31);
                    if (C1875.f7103 >= 0) {
                        iM45029 = (i26 - C19806.m45029("᩺ۢ")) * 17;
                        i13 = ((iM45029 ^ i27) * 32449) ^ (-564971432);
                        i14 = -78791350;
                    } else {
                        iM45029 = (C19806.m45029("֫ܳ") ^ i26) * (-59);
                        i13 = ((iM45029 ^ i27) * (-24273)) ^ 1366695777;
                        i14 = -1452464955;
                    }
                    i10 = iM45029 ^ i14;
                    i28 = i13;
                    str25 = str10;
                    strM3859 = str11;
                    str29 = str8;
                    sArr5 = sArr;
                    i34 = i11;
                    i35 = i12;
                    str23 = str9;
                    str30 = str7;
                    sb2 = sb;
                    i30 = i7;
                    str27 = str4;
                    str26 = str3;
                    i29 = i10;
                    str22 = str;
                    break;
                case -711726630:
                case -539134624:
                    str30 = str30;
                    str26 = str26;
                    str27 = str27;
                    sArr5 = sArr5;
                    i30 = i30;
                    str29 = str29;
                    strM9788 = strM9788;
                    str23 = str23;
                    i34 = i34;
                    str25 = str25;
                    sb2 = sb2;
                    i35 = i35;
                    strM3859 = strM3859;
                    short s = sArr3[0];
                    if ((s * 14882) - ((s * s) + 55368481) <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۢ") ^ i27;
                        i = ((iM11306 ^ i26) * 4383) ^ (-1563551553);
                        i2 = 61758683;
                    } else {
                        iM11306 = (C19806.m45029("ۖۛ") + i27) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM11306 ^ i26) * 19731) ^ (-1032173640);
                        i2 = -348139200;
                    }
                    i6 = iM11306 ^ i2;
                    i28 = i;
                    strM9788 = strM9788;
                    strM3859 = strM3859;
                    i30 = i30;
                    str29 = str29;
                    sArr5 = sArr5;
                    i35 = i35;
                    sb2 = sb2;
                    str27 = str27;
                    str26 = str26;
                    i29 = i6;
                    str25 = str25;
                    str22 = str;
                    i34 = i34;
                    str23 = str23;
                    str30 = str30;
                    break;
                case -484984744:
                case 12545409:
                    String str41 = str25;
                    String str42 = str27;
                    String str43 = (String) C2332.m7077(map, str41);
                    int i57 = i30;
                    String str44 = str30;
                    String str45 = (String) C2332.m7077(map, str44);
                    C15829.m37616();
                    int iM450221 = C19806.m45029("ۨ۠") ^ i27;
                    str30 = str44;
                    int i58 = ((iM450221 ^ i26) * (-27869)) ^ (-2126501153);
                    i29 = iM450221 ^ (-768479507);
                    i28 = i58;
                    sArr5 = sArr5;
                    i30 = i57;
                    str27 = str42;
                    str26 = str43;
                    str25 = str41;
                    str29 = str45;
                    str30 = str30;
                    break;
                case -325565636:
                case -187047526:
                    C0962.m3746();
                    if (!C1419.m4973()) {
                        str7 = str30;
                        str3 = str26;
                        str4 = str27;
                        sArr = sArr5;
                        i7 = i30;
                        str8 = str29;
                        str9 = str23;
                        sb = sb2;
                        i11 = i34;
                        i12 = i35;
                        str10 = str25;
                        str11 = strM3859;
                        iM45029 = (i26 - C19806.m45029("᩺ۢ")) * 17;
                        i13 = ((iM45029 ^ i27) * 32449) ^ (-564971432);
                        i14 = -78791350;
                        i10 = iM45029 ^ i14;
                        i28 = i13;
                        str25 = str10;
                        strM3859 = str11;
                        str29 = str8;
                        sArr5 = sArr;
                        i34 = i11;
                        i35 = i12;
                        str23 = str9;
                        str30 = str7;
                        sb2 = sb;
                        i30 = i7;
                        str27 = str4;
                        str26 = str3;
                        i29 = i10;
                        str22 = str;
                    } else {
                        str20 = str26;
                        sArr5 = sArr5;
                        str21 = str29;
                        String str313 = str27;
                        i20 = i30;
                        strM10056 = str313;
                        iM450210 = ThreadFactoryC3888.m11306("ܰܳ") ^ i26;
                        i21 = ((iM450210 ^ i27) * (-28377)) ^ 2034009344;
                        i22 = 209072118;
                        int i414 = iM450210 ^ i22;
                        str26 = str20;
                        i29 = i414;
                        i28 = i21;
                        str29 = str21;
                        sArr5 = sArr5;
                        int i415 = i20;
                        str27 = strM10056;
                        i30 = i415;
                    }
                    break;
                case -325057780:
                case 285281305:
                    str17 = str26;
                    str18 = str27;
                    sArr2 = sArr5;
                    i18 = i30;
                    str19 = str29;
                    if (zM8474) {
                        iM11309 = (C19806.m45029("ܽۡ") + i26) * (-103);
                        i28 = ((iM11309 ^ i27) * (-31393)) ^ 449847604;
                        i19 = -1155941899;
                    } else {
                        iM11309 = (i26 - C19806.m45029("ۢۙ")) * (-111);
                        i28 = ((iM11309 ^ i27) * 15885) ^ 1855240879;
                        i19 = -927825343;
                    }
                    int i416 = iM11309 ^ i19;
                    str29 = str19;
                    sArr5 = sArr2;
                    String str314 = str17;
                    i29 = i416;
                    i30 = i18;
                    str27 = str18;
                    str26 = str314;
                    break;
                case -256854407:
                case 1682050947:
                    MenuItemOnMenuItemClickListenerC3244.m9709(c10142, C3535.m10423(sArr6, i37, 11, i31), str2);
                    C1461.m5084(c10142, C3743.m10964(f33763, 109, 11, i31), str22);
                    c10142.m25763();
                    break;
                case -122999776:
                case 352001244:
                    i16 = i34;
                    str12 = str30;
                    str13 = str25;
                    str26 = str26;
                    str27 = str27;
                    sArr5 = sArr5;
                    i30 = i30;
                    str29 = str29;
                    int i59 = i35;
                    str14 = strM3859;
                    sb2 = sb2;
                    C2788.m8480(sb2, C1977.m6363(sArr4, i16, i59, i31));
                    i17 = i59;
                    str15 = str23;
                    abstractC20745M5585 = C1668.m5585(abstractC20746, C2124.m6674(sb2));
                    str16 = strM3406;
                    str24 = (String) C9735.getOrDefault(map, str16, str15);
                    if (!RunnableC1564.f6300) {
                        int iM450222 = C19806.m45029("ۙ۟") ^ i26;
                        strM3406 = str16;
                        int i60 = ((iM450222 ^ i27) * 16723) ^ (-1572121714);
                        i15 = iM450222 ^ (-1324155142);
                        i28 = i60;
                        str25 = str13;
                        strM3859 = str14;
                        i34 = i16;
                        abstractC20745 = abstractC20745M5585;
                        i35 = i17;
                        str23 = str15;
                        str30 = str12;
                        sb2 = sb2;
                        i30 = i30;
                        str27 = str27;
                        str26 = str26;
                        i29 = i15;
                        str29 = str29;
                        sArr5 = sArr5;
                    } else {
                        int iM113015 = ThreadFactoryC3888.m11306("ۢ᩻") ^ i26;
                        String str46 = str15;
                        i28 = ((iM113015 ^ i27) * 22803) ^ (-1673206584);
                        str25 = str13;
                        str29 = str29;
                        sArr5 = sArr5;
                        i34 = i16;
                        abstractC20745 = abstractC20745M5585;
                        str23 = str46;
                        str30 = str12;
                        int i61 = i17;
                        sb2 = sb2;
                        i30 = i30;
                        str27 = str27;
                        str26 = str26;
                        i29 = iM113015 ^ (-209562014);
                        strM3406 = str16;
                        strM3859 = str14;
                        i35 = i61;
                    }
                    break;
                case 41993946:
                case 1855409276:
                    str17 = str26;
                    str18 = str27;
                    sArr2 = sArr5;
                    i18 = i30;
                    str19 = str29;
                    try {
                        zM8474 = C2788.m8474(abstractC20745);
                        iM11309 = ThreadFactoryC3888.m11306("֫֡") ^ i27;
                        i28 = ((iM11309 ^ i26) * (-7733)) ^ 1130498282;
                        i19 = -1045410432;
                    } catch (Exception unused) {
                        iM11309 = (i26 - C19806.m45029("ۢۙ")) * (-111);
                        i28 = ((iM11309 ^ i27) * 15885) ^ 1855240879;
                        i19 = -927825343;
                    }
                    int i417 = iM11309 ^ i19;
                    str29 = str19;
                    sArr5 = sArr2;
                    String str315 = str17;
                    i29 = i417;
                    i30 = i18;
                    str27 = str18;
                    str26 = str315;
                    break;
                case 497178859:
                case 507351746:
                    i12 = i35;
                    str7 = str30;
                    str3 = str26;
                    str4 = str27;
                    sArr = sArr5;
                    i7 = i30;
                    str8 = str29;
                    str11 = strM3859;
                    str9 = str23;
                    int i62 = i34;
                    str10 = str25;
                    abstractC20746 = C11904.f39941;
                    i11 = i62;
                    sb = new StringBuilder(C1977.m6363(f33763, 70, 2, i31));
                    if (C2477.f9839 <= 0) {
                        iM45029 = (i27 - ThreadFactoryC3888.m11306("ۖۤ")) * 71;
                        i13 = ((iM45029 ^ i26) * 13849) ^ (-1153849276);
                        i14 = 1865945758;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۗ") ^ i26;
                        i13 = ((iM45029 ^ i27) * 6365) ^ (-1818680740);
                        i14 = -1333156113;
                    }
                    i10 = iM45029 ^ i14;
                    i28 = i13;
                    str25 = str10;
                    strM3859 = str11;
                    str29 = str8;
                    sArr5 = sArr;
                    i34 = i11;
                    i35 = i12;
                    str23 = str9;
                    str30 = str7;
                    sb2 = sb;
                    i30 = i7;
                    str27 = str4;
                    str26 = str3;
                    i29 = i10;
                    str22 = str;
                    break;
                case 548139928:
                case 1577201106:
                    try {
                        C3872.m11210(c13188.f43898, abstractC20745, C16737.m39293());
                        C2477.m7603(view, true);
                        iM113010 = (ThreadFactoryC3888.m11306("ۗ᩸") + i26) * (-65);
                        i23 = ((iM113010 ^ i27) * (-22915)) ^ 546674020;
                        i24 = 2014799808;
                        i29 = iM113010 ^ i24;
                        i28 = i23;
                    } catch (Exception unused2) {
                        str17 = str26;
                        str18 = str27;
                        sArr2 = sArr5;
                        i18 = i30;
                        str19 = str29;
                        iM11309 = (i26 - C19806.m45029("ۢۙ")) * (-111);
                        i28 = ((iM11309 ^ i27) * 15885) ^ 1855240879;
                        i19 = -927825343;
                        int i418 = iM11309 ^ i19;
                        str29 = str19;
                        sArr5 = sArr2;
                        String str316 = str17;
                        i29 = i418;
                        i30 = i18;
                        str27 = str18;
                        str26 = str316;
                    }
                    break;
                case 772643351:
                case 1126071596:
                    C1668.m5572(dialogInterfaceC19356);
                    C2704.m8241(c13188.f43898, (String) RunnableC0195.m1435(map, strM9788));
                    break;
                case 971844177:
                case 1774066027:
                    str30 = str30;
                    str26 = str26;
                    str27 = str27;
                    sArr5 = sArr5;
                    i30 = i30;
                    str29 = str29;
                    str23 = str23;
                    i34 = i34;
                    str25 = str25;
                    sb2 = sb2;
                    i35 = i35;
                    strM3859 = strM3859;
                    C13188 c13189 = c9890.f33765;
                    strM9788 = C3286.m9788(f33763, 1, 3, i31);
                    if (z) {
                        iM11307 = C19806.m45029("ۛܶ") ^ i26;
                        i4 = ((iM11307 ^ i27) * 31651) ^ 1451958971;
                        i5 = -1883016347;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۡۙ") ^ i27;
                        i4 = ((iM11307 ^ i26) * 11009) ^ (-1338359448);
                        i5 = -1817225733;
                    }
                    i6 = iM11307 ^ i5;
                    c13188 = c13189;
                    i28 = i4;
                    strM3859 = strM3859;
                    i30 = i30;
                    str29 = str29;
                    sArr5 = sArr5;
                    i35 = i35;
                    sb2 = sb2;
                    str27 = str27;
                    str26 = str26;
                    i29 = i6;
                    str25 = str25;
                    str22 = str;
                    i34 = i34;
                    str23 = str23;
                    str30 = str30;
                    break;
                case 1031991595:
                case 2129517402:
                    String str47 = str27;
                    str24 = str24;
                    C1461.m5084(c10142, str47, str24);
                    i30 = i30;
                    str26 = str26;
                    C1461.m5084(c10142, C1189.m4365(f33763, 87, 3, i31), str26);
                    sArr5 = f33763;
                    if (C0050.m946() <= 0) {
                        int iM450223 = C19806.m45029("ۘۤ") ^ i27;
                        i29 = iM450223 ^ (-2128923198);
                        i36 = 4;
                        i28 = ((iM450223 ^ i26) * 6609) ^ 1807805682;
                    } else {
                        int iM113016 = (ThreadFactoryC3888.m11306("᩶ۖ") ^ i27) * 9;
                        i29 = iM113016 ^ 662060163;
                        i28 = ((iM113016 ^ i26) * 22511) ^ (-708354015);
                        i36 = 4;
                    }
                    str27 = str47;
                    i32 = 90;
                    break;
                case 1148791421:
                case 2092907792:
                    zM5058 = C1460.m5058(str29, C3907.m11362(abstractC20745, strM3859));
                    iM113010 = (ThreadFactoryC3888.m11306("ܽۤ") ^ i27) * (-117);
                    i23 = ((iM113010 ^ i26) * (-17369)) ^ 1992127027;
                    i24 = -1680688819;
                    i29 = iM113010 ^ i24;
                    i28 = i23;
                    break;
                case 1370102273:
                case 1619299332:
                    if (C1148.f5161 <= 0) {
                        str12 = str30;
                        str26 = str26;
                        str27 = str27;
                        sArr5 = sArr5;
                        i30 = i30;
                        str29 = str29;
                        str15 = str23;
                        sb2 = sb2;
                        i17 = i35;
                        str14 = strM3859;
                        abstractC20745M5585 = abstractC20745;
                        str16 = strM3406;
                        i16 = i34;
                        str13 = str25;
                        int iM113017 = ThreadFactoryC3888.m11306("ۢ᩻") ^ i26;
                        String str48 = str15;
                        i28 = ((iM113017 ^ i27) * 22803) ^ (-1673206584);
                        str25 = str13;
                        str29 = str29;
                        sArr5 = sArr5;
                        i34 = i16;
                        abstractC20745 = abstractC20745M5585;
                        str23 = str48;
                        str30 = str12;
                        int i63 = i17;
                        sb2 = sb2;
                        i30 = i30;
                        str27 = str27;
                        str26 = str26;
                        i29 = iM113017 ^ (-209562014);
                        strM3406 = str16;
                        strM3859 = str14;
                        i35 = i63;
                    } else {
                        str20 = str26;
                        sArr5 = sArr5;
                        str21 = str29;
                        String str317 = str27;
                        i20 = i30;
                        strM10056 = str317;
                        iM450210 = ThreadFactoryC3888.m11306("ܰܳ") ^ i26;
                        i21 = ((iM450210 ^ i27) * (-28377)) ^ 2034009344;
                        i22 = 209072118;
                        int i419 = iM450210 ^ i22;
                        str26 = str20;
                        i29 = i419;
                        i28 = i21;
                        str29 = str21;
                        sArr5 = sArr5;
                        int i4110 = i20;
                        str27 = strM10056;
                        i30 = i4110;
                    }
                    break;
                case 1413551483:
                case 1662213819:
                    break;
                default:
                    i31 = 33158;
                    iM11306 = (ThreadFactoryC3888.m11306("ۨ᩶") ^ i26) * 51;
                    i = ((iM11306 ^ i27) * (-32451)) ^ 29748119;
                    i2 = 1861849775;
                    i6 = iM11306 ^ i2;
                    i28 = i;
                    strM9788 = strM9788;
                    strM3859 = strM3859;
                    i30 = i30;
                    str29 = str29;
                    sArr5 = sArr5;
                    i35 = i35;
                    sb2 = sb2;
                    str27 = str27;
                    str26 = str26;
                    i29 = i6;
                    str25 = str25;
                    str22 = str;
                    i34 = i34;
                    str23 = str23;
                    str30 = str30;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a3 A[PHI: r13
      0x00a3: PHI (r13v6 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:24:0x00a1, B:13:0x0061, B:10:0x005c, B:103:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x020b A[PHI: r5 r6
      0x020b: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:60:0x0209, B:15:0x0065, B:13:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x020b: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:60:0x0209, B:15:0x0065, B:13:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x023d A[PHI: r4 r8 r9
      0x023d: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char), (r4v2 char) binds: [B:64:0x023b, B:52:0x01ce, B:48:0x01ae, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x023d: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:64:0x023b, B:52:0x01ce, B:48:0x01ae, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x023d: PHI (r9v4 short) = (r9v2 short), (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:64:0x023b, B:52:0x01ce, B:48:0x01ae, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC21692
    /* JADX INFO: renamed from: ۙ */
    public final void mo22086(IOException iOException) {
        int iM45029;
        int i;
        int i2;
        int iM450210;
        int i3;
        short[] sArr;
        C9890 c9890 = this;
        int i4 = C1668.f6641;
        int i5 = C3660.f13403;
        int iM450211 = C19806.m45029("᩹ۗ") ^ i4;
        int i6 = ((iM450211 ^ i5) * (-13565)) ^ 344798946;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i7 = iM450211 ^ 1232437392;
        String strM4892 = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        short s3 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -657589142;
        while (true) {
            i13 = i7 ^ (i6 & (((i13 ^ i5) * 30357) >> 31));
            switch (i13) {
                case -2134388640:
                case -1349697292:
                    sArr3 = f33763;
                    i11 = 223;
                    if (!C3286.f12186) {
                        iM45029 = C19806.m45029("ۡۨ") ^ i4;
                        i = ((iM45029 ^ i5) * 22621) ^ (-237768659);
                        i2 = -1817862452;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                    } else {
                        iM450210 = C19806.m45029("ܶ۠") ^ i5;
                        i6 = ((iM450210 ^ i4) * 12213) ^ 361452011;
                        i3 = 1345763872;
                        i7 = iM450210 ^ i3;
                        c9890 = this;
                    }
                    break;
                case -2120038592:
                case 216469032:
                    C3577.m10565();
                    iM45029 = ThreadFactoryC3888.m11306("᩺ۤ") ^ i5;
                    i = ((iM45029 ^ i4) * 30237) ^ 539718721;
                    i2 = -1577630461;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
                case -2030487435:
                case -569616527:
                    if (CallableC1627.f6528) {
                        iM450210 = C19806.m45029("᩹ܺ") ^ i4;
                        i6 = ((iM450210 ^ i5) * 23637) ^ 591179399;
                        i3 = 1366703117;
                    } else {
                        iM450210 = C19806.m45029("ܶ۠") ^ i5;
                        i6 = ((iM450210 ^ i4) * 12213) ^ 361452011;
                        i3 = 1345763872;
                    }
                    i7 = iM450210 ^ i3;
                    c9890 = this;
                    break;
                case -2007384882:
                case -1427744594:
                    strM4892 = C1398.m4892(sArr3, i11, i12, i10);
                    if (C1460.m5050() == 0) {
                        iM45029 = C19806.m45029("ܽۚ") ^ i4;
                        i = ((iM45029 ^ i5) * 11411) ^ (-1386242197);
                        i2 = -197751691;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                    } else {
                        sArr = sArr2;
                        int iM11306 = ThreadFactoryC3888.m11306("۟᩸") ^ i4;
                        i7 = iM11306 ^ (-1856598572);
                        sArr2 = sArr;
                        i6 = ((iM11306 ^ i5) * 32119) ^ (-599449014);
                        c9890 = this;
                    }
                    break;
                case -1868069287:
                case -1776172571:
                    s3 = 1;
                    if (C1148.f5161 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۡ") ^ i4;
                        i = ((iM45029 ^ i5) * (-25679)) ^ 1835711998;
                        i2 = -296945089;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("֡۬")) * (-71);
                        i = ((iM45029 ^ i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE) ^ 727877708;
                        i2 = 868538283;
                    }
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
                case -1528658109:
                case -346852143:
                    break;
                case -1424403518:
                case 2033624000:
                    if (C1419.f5860 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ۤ") ^ i5;
                        i = ((iM45029 ^ i4) * 30237) ^ 539718721;
                        i2 = -1577630461;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۧܳ")) * (-79);
                        i = ((iM45029 ^ i4) * (-31857)) ^ 991187552;
                        i2 = -1339737177;
                    }
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
                case -1311969302:
                case 576684198:
                    c = 222;
                    if (C7105.m18985()) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۡ") ^ i4;
                        i = ((iM45029 ^ i5) * (-25679)) ^ 1835711998;
                        i2 = -296945089;
                    } else {
                        iM45029 = C19806.m45029("᩻ܰ") ^ i5;
                        i = ((iM45029 ^ i4) * (-21299)) ^ (-1059061402);
                        i2 = -43570866;
                    }
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
                case -1302305547:
                case 911892458:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    break;
                case -972035213:
                case 16903093:
                    sArr = f33763;
                    if (C1148.f5161 > 0) {
                        int iM11307 = (i5 - ThreadFactoryC3888.m11306("ᩳ᩶")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11307 ^ i4) * (-22485)) ^ 1024358937;
                        i7 = iM11307 ^ (-801598394);
                        c9890 = this;
                        sArr2 = sArr;
                        i6 = i;
                    } else {
                        int iM11308 = ThreadFactoryC3888.m11306("۟᩸") ^ i4;
                        i7 = iM11308 ^ (-1856598572);
                        sArr2 = sArr;
                        i6 = ((iM11308 ^ i5) * 32119) ^ (-599449014);
                        c9890 = this;
                    }
                    break;
                case -969634186:
                case 81768052:
                    i12 = 3;
                    if (C3286.m9798() <= 0) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۧܳ")) * (-79);
                        i = ((iM45029 ^ i4) * (-31857)) ^ 991187552;
                        i2 = -1339737177;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ֡") ^ i5) * 47;
                        i = ((iM45029 ^ i4) * (-31499)) ^ (-1362889456);
                        i2 = 1945162113;
                    }
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
                case -946307831:
                case 1478131020:
                    C1025.m3861();
                    if (C2124.f7782 > 0) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۧܳ")) * (-79);
                        i = ((iM45029 ^ i4) * (-31857)) ^ 991187552;
                        i2 = -1339737177;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۡ") ^ i4;
                        i = ((iM45029 ^ i5) * (-25679)) ^ 1835711998;
                        i2 = -296945089;
                    }
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
                case -824285377:
                case -66539372:
                    int i14 = s + s3;
                    if ((i14 * i14) - i9 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶۟") ^ i4;
                        i = ((iM45029 ^ i5) * (-17747)) ^ (-1856175142);
                        i2 = -777517641;
                    } else {
                        iM45029 = C19806.m45029("ܶܶ") ^ i5;
                        i = ((iM45029 ^ i4) * 17171) ^ (-347535230);
                        i2 = -1516065774;
                    }
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
                case 30480352:
                case 1899925192:
                    if (c9890.f33764) {
                        iM45029 = (i5 - C19806.m45029("۠ܰ")) * (-113);
                        i = ((iM45029 ^ i4) * 25049) ^ (-1994218712);
                        i2 = 1111288851;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡᩳ") ^ i4) * (-87);
                        i = ((iM45029 ^ i5) * 219) ^ (-2066032045);
                        i2 = -924902902;
                    }
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
                case 103583282:
                case 770639819:
                    if (C2642.m8171() != 0) {
                        iM450210 = C19806.m45029("ܶ۠") ^ i5;
                        i6 = ((iM450210 ^ i4) * 12213) ^ 361452011;
                        i3 = 1345763872;
                        i7 = iM450210 ^ i3;
                        c9890 = this;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۧܳ")) * (-79);
                        i = ((iM45029 ^ i4) * (-31857)) ^ 991187552;
                        i2 = -1339737177;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                    }
                    break;
                case 1037790949:
                case 1849588388:
                    i8 = s * s2;
                    if (C3535.f13026 > 0) {
                        iM45029 = C19806.m45029("᩻ᩴ") ^ i4;
                        i = ((iM45029 ^ i5) * (-10451)) ^ (-1154355673);
                        i2 = -301463116;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                    } else {
                        sArr = sArr2;
                        int iM11309 = ThreadFactoryC3888.m11306("۟᩸") ^ i4;
                        i7 = iM11309 ^ (-1856598572);
                        sArr2 = sArr;
                        i6 = ((iM11309 ^ i5) * 32119) ^ (-599449014);
                        c9890 = this;
                    }
                    break;
                case 1059083151:
                case 1665959895:
                    C1668.m5582(ThreadFactoryC3888.m11306(strM4892) ^ 2120589442);
                    iM45029 = ThreadFactoryC3888.m11306("ۢᩴ") ^ i4;
                    i = ((iM45029 ^ i5) * 10965) ^ 833049140;
                    i2 = 865633294;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
                case 1188155905:
                case 1407595594:
                    i10 = 29494;
                    iM45029 = (i5 - ThreadFactoryC3888.m11306("ܰۚ")) * 119;
                    i = ((iM45029 ^ i4) * 32245) ^ 1180216232;
                    i2 = -2141740033;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
                case 1297609151:
                case 1319275422:
                    C1977.m6365(c9890.f33766);
                    iM45029 = (i5 - C19806.m45029("۠ܰ")) * (-113);
                    i = ((iM45029 ^ i4) * 25049) ^ (-1994218712);
                    i2 = 1111288851;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
                case 1320713390:
                case 1616561492:
                    c9890.f33765.f43899 = false;
                    if (c9890.f33767) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢᩴ") ^ i4;
                        i = ((iM45029 ^ i5) * 10965) ^ 833049140;
                        i2 = 865633294;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ۠") ^ i5;
                        i = ((iM45029 ^ i4) * (-10021)) ^ (-1097670611);
                        i2 = 392768004;
                    }
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
                case 1673191476:
                case 2037492338:
                    i9 = i8 + 1;
                    if (C3577.f13150 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۡ") ^ i4;
                        i = ((iM45029 ^ i5) * (-25679)) ^ 1835711998;
                        i2 = -296945089;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۧ") ^ i5;
                        i = ((iM45029 ^ i4) * (-21997)) ^ (-682250265);
                        i2 = 118061919;
                    }
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
                case 1791636504:
                case 2075958411:
                    s = sArr2[c];
                    s2 = 2;
                    if (C3660.f13403 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ۤ") ^ i5;
                        i = ((iM45029 ^ i4) * 30237) ^ 539718721;
                        i2 = -1577630461;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚ֨") + i4) * (-107);
                        i = ((iM45029 ^ i5) * (-4719)) ^ (-1006455981);
                        i2 = -1048735979;
                    }
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
                default:
                    i10 = 44748;
                    iM45029 = (i5 - ThreadFactoryC3888.m11306("ܰۚ")) * 119;
                    i = ((iM45029 ^ i4) * 32245) ^ 1180216232;
                    i2 = -2141740033;
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
            }
            return;
        }
    }
}
