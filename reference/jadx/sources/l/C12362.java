package l;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.material.slider.BaseSlider;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۫ۧۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G668 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12362 {

    /* JADX INFO: renamed from: ܶۨ᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f41336 = {4691, -25993, -28280, -27263, 28368, -26889, -23576, 9868, 13712, 12899, -12024, 10875, 8239, -9565, 14707, -14507, 14915, -10909, 10444, -5255, 12282, 15499, 10914, 12963, -8263, 8523, -14451, -14989, -15685, 12011, -13146, -15919, 9686, 13361, -697, -11782, 16034, -12024, -15557, -14713, 8495, 3328, -28113, 32322, -22174, 6638, 28292, 16604, -28918, 19668, 26642, -24642, 19288, 16676, 31128, -25192, 18667, 30190, -26136, 18158, -29541, -29699, 19321, -30481, 31076, 25737, 26549, 4806};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC17295 f41337;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC12483 f41338;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f41339;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC21013 f41340;

    /* JADX WARN: Code duplicated, block: B:29:0x00d5 A[PHI: r5 r9
      0x00d5: PHI (r5v4 java.lang.String) = (r5v3 java.lang.String), (r5v2 java.lang.String) binds: [B:28:0x00d3, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r9v4 short[]) = (r9v3 short[]), (r9v2 short[]) binds: [B:28:0x00d3, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x021e A[PHI: r4 r6 r13 r18 r19 r20 r25
      0x021e: PHI (r4v4 boolean) = (r4v2 boolean), (r4v2 boolean), (r4v3 boolean), (r4v2 boolean) binds: [B:57:0x021c, B:53:0x01fc, B:40:0x014c, B:32:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v4 int) binds: [B:57:0x021c, B:53:0x01fc, B:40:0x014c, B:32:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:57:0x021c, B:53:0x01fc, B:40:0x014c, B:32:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r18v4 short) = (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:57:0x021c, B:53:0x01fc, B:40:0x014c, B:32:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r19v4 short) = (r19v3 short), (r19v2 short), (r19v2 short), (r19v2 short) binds: [B:57:0x021c, B:53:0x01fc, B:40:0x014c, B:32:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r20v4 int) = (r20v2 int), (r20v3 int), (r20v2 int), (r20v2 int) binds: [B:57:0x021c, B:53:0x01fc, B:40:0x014c, B:32:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r25v5 int) = (r25v3 int), (r25v4 int), (r25v3 int), (r25v3 int) binds: [B:57:0x021c, B:53:0x01fc, B:40:0x014c, B:32:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0251 A[PHI: r7 r8 r15 r17
      0x0251: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:61:0x024f, B:36:0x012d, B:18:0x008c, B:16:0x0088, B:89:0x0251] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:61:0x024f, B:36:0x012d, B:18:0x008c, B:16:0x0088, B:89:0x0251] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:61:0x024f, B:36:0x012d, B:18:0x008c, B:16:0x0088, B:89:0x0251] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:61:0x024f, B:36:0x012d, B:18:0x008c, B:16:0x0088, B:89:0x0251] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0283 A[PHI: r10 r11 r16
      0x0283: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:65:0x0281, B:24:0x00a9, B:16:0x0088, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0283: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:65:0x0281, B:24:0x00a9, B:16:0x0088, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0283: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:65:0x0281, B:24:0x00a9, B:16:0x0088, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30768(C12362 c12362, AbstractC20745 abstractC20745) {
        int iM45029;
        int i;
        int i2;
        int i3 = ThreadFactoryC3888.f14547;
        int i4 = C1066.f4915;
        int iM11306 = ThreadFactoryC3888.m11306("ۗۧ") ^ i3;
        int i5 = ((iM11306 ^ i4) * (-2147)) ^ (-1174859464);
        Object[] objArr = null;
        String strM3021 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM11306 ^ 1643366756;
        boolean z = false;
        int iM11307 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i13 = 0;
        int i14 = 230963643;
        int i15 = 0;
        String strM2900 = null;
        AbstractActivityC12483 abstractActivityC12483 = null;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i4) * 24145) >> 31));
            switch (i14) {
                case -1973642810:
                case -294191443:
                    strM3021 = C0671.m3021(abstractActivityC12483, 2122369258 ^ iM11307, objArr);
                    sArr3 = f41336;
                    if (C2249.m6915() <= 0) {
                        iM45029 = C19806.m45029("ۛۡ") ^ i4;
                        i = ((iM45029 ^ i3) * 5965) ^ 798626512;
                        i2 = -1647696769;
                    } else {
                        iM45029 = C19806.m45029("᩺᩸") ^ i4;
                        i = ((iM45029 ^ i3) * (-9125)) ^ (-229943275);
                        i2 = -1629521707;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1744285449:
                case 207613598:
                    abstractActivityC12483.m30997(C19806.m45029(C1419.m4969(sArr3, i9, i10, i12)) ^ 2099737596, strM3021, z);
                    break;
                case -1641346870:
                case 153330848:
                    c = 0;
                    if (C2642.f10294 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿܿ") ^ i3;
                        i = ((iM45029 ^ i4) * (-16113)) ^ 1811125940;
                        i2 = 1125591337;
                    } else {
                        iM45029 = (C19806.m45029("ۗᩳ") ^ i4) * 93;
                        i = ((iM45029 ^ i3) * (-14081)) ^ (-274907852);
                        i2 = 518529816;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1584586642:
                case -166427488:
                    i13 = s * s2;
                    i15 = s * s;
                    i11 = 314743081;
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢܺ") ^ i3;
                        i = ((iM45029 ^ i4) * 593) ^ 1459361845;
                        i2 = 523735189;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۢ") ^ i4;
                        i = ((iM45029 ^ i3) * (-9413)) ^ (-879408462);
                        i2 = 333625355;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1402310369:
                case 1985850282:
                    if (i13 - (i15 + i11) <= 0) {
                        iM45029 = (i3 - C19806.m45029("ۤۜ")) * 61;
                        i = ((iM45029 ^ i4) * (-21273)) ^ (-49328634);
                        i2 = 1928802096;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۨۤ")) * 75;
                        i = ((iM45029 ^ i3) * (-1623)) ^ (-2125414493);
                        i2 = -1624435141;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1175470084:
                case 1906132003:
                    z = false;
                    objArr[0] = strM2900;
                    if (C1875.f7103 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢܺ") ^ i3;
                        i = ((iM45029 ^ i4) * 593) ^ 1459361845;
                        i2 = 523735189;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ܽ᩵")) * (-35);
                        i = ((iM45029 ^ i3) * (-30227)) ^ 1288130358;
                        i2 = 568306464;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -411798164:
                case -317738636:
                    i12 = 64964;
                    iM45029 = (i4 - C19806.m45029("۫ܿ")) * (-13);
                    i = ((iM45029 ^ i3) * 25447) ^ 2050883422;
                    i2 = -1506066697;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -391822682:
                case 1333786899:
                    C1977.m6356();
                    iM45029 = ThreadFactoryC3888.m11306("ܿܿ") ^ i3;
                    i = ((iM45029 ^ i4) * (-16113)) ^ 1811125940;
                    i2 = 1125591337;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -344165742:
                case 524152276:
                    s = sArr[c];
                    s2 = 35482;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢܺ") ^ i3;
                        i = ((iM45029 ^ i4) * 593) ^ 1459361845;
                        i2 = 523735189;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩺ۚ")) * (-43);
                        i = ((iM45029 ^ i4) * 4943) ^ (-1855772408);
                        i2 = -597691046;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -196168929:
                case 1548682813:
                    if (C3743.m10966() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿܿ") ^ i3;
                        i = ((iM45029 ^ i4) * (-16113)) ^ 1811125940;
                        i2 = 1125591337;
                    } else {
                        iM45029 = C19806.m45029("۟֫") ^ i4;
                        i = ((iM45029 ^ i3) * 15335) ^ (-395495393);
                        i2 = 717425361;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -126429577:
                case 2045569851:
                    ThreadFactoryC3888.m11300();
                    if (!C1377.f5749) {
                        int iM11308 = ThreadFactoryC3888.m11306("֫ᩳ") ^ i3;
                        i5 = ((iM11308 ^ i4) * 13015) ^ (-1691222196);
                        i6 = iM11308 ^ 170673681;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿܿ") ^ i3;
                        i = ((iM45029 ^ i4) * (-16113)) ^ 1811125940;
                        i2 = 1125591337;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    }
                    break;
                case -77586811:
                case 1466398540:
                    i9 = 4;
                    i10 = 3;
                    if (C1875.f7103 >= 0) {
                        iM45029 = C19806.m45029("۟֫") ^ i4;
                        i = ((iM45029 ^ i3) * 15335) ^ (-395495393);
                        i2 = 717425361;
                    } else {
                        iM45029 = (C19806.m45029("᩷ܶ") ^ i4) * 23;
                        i = ((iM45029 ^ i3) * (-17051)) ^ 2023336486;
                        i2 = -1138564272;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 359941325:
                case 1722866799:
                    C2642.m8171();
                    break;
                case 917965406:
                case 2085735578:
                    sArr2 = f41336;
                    i7 = 1;
                    i8 = 3;
                    if (RunnableC1895.f7152) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ᩸") ^ i3;
                        i = ((iM45029 ^ i4) * 22305) ^ (-1096687833);
                        i2 = 288500231;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿܿ") ^ i3;
                        i = ((iM45029 ^ i4) * (-16113)) ^ 1811125940;
                        i2 = 1125591337;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 924811694:
                case 1230292489:
                    if (C1398.f5802 <= 0) {
                        iM45029 = C19806.m45029("۟֫") ^ i4;
                        i = ((iM45029 ^ i3) * 15335) ^ (-395495393);
                        i2 = 717425361;
                    } else {
                        iM45029 = C19806.m45029("ۛۡ") ^ i4;
                        i = ((iM45029 ^ i3) * 5965) ^ 798626512;
                        i2 = -1647696769;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 932223376:
                case 2058265050:
                    sArr = f41336;
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = C19806.m45029("۟֫") ^ i4;
                        i = ((iM45029 ^ i3) * 15335) ^ (-395495393);
                        i2 = 717425361;
                    } else {
                        iM45029 = C19806.m45029("᩹ۤ") ^ i3;
                        i = ((iM45029 ^ i4) * (-9101)) ^ (-778984071);
                        i2 = -934561467;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1196510974:
                case 1792524462:
                    iM11307 = ThreadFactoryC3888.m11306(C1419.m4969(sArr2, i7, i8, i12));
                    if (C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢܺ") ^ i3;
                        i = ((iM45029 ^ i4) * 593) ^ 1459361845;
                        i2 = 523735189;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖܰ") + i3) * (-43);
                        i = ((iM45029 ^ i4) * 1021) ^ 1457948499;
                        i2 = -142632400;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1391620957:
                case 1988924748:
                    i12 = 45774;
                    iM45029 = (i4 - C19806.m45029("۫ܿ")) * (-13);
                    i = ((iM45029 ^ i3) * 25447) ^ 2050883422;
                    i2 = -1506066697;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    abstractActivityC12483 = c12362.f41338;
                    strM2900 = C0629.m2900(abstractC20745);
                    objArr = new Object[1];
                    if (C2249.f8050 < 0) {
                        iM45029 = C19806.m45029("ۖ᩵") ^ i3;
                        i = ((iM45029 ^ i4) * 22933) ^ 448636678;
                        i2 = 670965880;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM11309 = ThreadFactoryC3888.m11306("֫ᩳ") ^ i3;
                        i5 = ((iM11309 ^ i4) * 13015) ^ (-1691222196);
                        i6 = iM11309 ^ 170673681;
                    }
                    break;
            }
            return;
        }
    }

    public C12362(AbstractActivityC12483 abstractActivityC12483, AbstractC20745 abstractC20745) {
        InterfaceC17295 interfaceC17295 = null;
        int i = 1639075671;
        int i2 = C7105.f23796;
        int i3 = C3722.f13525;
        int iM11306 = (ThreadFactoryC3888.m11306("ܺᩳ") ^ i2) * 109;
        int i4 = ((iM11306 ^ i3) * 27011) ^ (-1200831138);
        int i5 = 1468356275;
        while (true) {
            i = ((((i ^ i3) * 14147) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2113003615:
                case -1812767926:
                    this.f41338 = abstractActivityC12483;
                    this.f41339 = abstractC20745;
                    return;
                case -2061863825:
                case 972079623:
                    if (C3535.f13026 <= 0) {
                        iM11306 = C19806.m45029("۫ۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 24269) ^ 744047925;
                        i5 = -1720653585;
                    } else {
                        iM11306 = (C19806.m45029("ܺۛ") ^ i2) * 73;
                        i4 = ((iM11306 ^ i3) * (-10845)) ^ 1633232018;
                        i5 = -1114100048;
                    }
                    break;
                case -1911768085:
                case -48681181:
                    if (C2124.f7782 <= 0) {
                        iM11306 = (i2 - C19806.m45029("᩶᩹")) * 63;
                        i4 = ((iM11306 ^ i3) * (-15505)) ^ 1258050457;
                        i5 = -257193875;
                    } else {
                        iM11306 = (C19806.m45029("ܿܽ") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM11306 ^ i3) * 27121) ^ (-735228644);
                        i5 = -1511103014;
                    }
                    break;
                case -1596808819:
                case 1339316577:
                    this.f41337 = interfaceC17295;
                    if (C2788.f10625 >= 0) {
                        iM11306 = C19806.m45029("۫ۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 24269) ^ 744047925;
                        i5 = -1720653585;
                    } else {
                        iM11306 = (i2 - C19806.m45029("᩶۫")) * (-39);
                        i4 = ((iM11306 ^ i3) * (-27065)) ^ (-562733893);
                        i5 = -1455745717;
                    }
                    break;
                case -1453188755:
                case -1140638524:
                    if (C2477.f9839 <= 0) {
                        iM11306 = (i2 - C19806.m45029("᩶᩹")) * 63;
                        i4 = ((iM11306 ^ i3) * (-15505)) ^ 1258050457;
                        i5 = -257193875;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * 15893) ^ 133026828;
                        i5 = -77555673;
                    }
                    break;
                case -1055543356:
                case 1842792126:
                    C2871.m8646();
                    C1377.m4833();
                    throw new RuntimeException();
                case -1012524626:
                case 1366969345:
                    if (C3660.m10791() != 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩻ܺ")) * 11;
                        i4 = ((iM11306 ^ i2) * 28933) ^ (-101698620);
                        i5 = -241297481;
                    } else {
                        iM11306 = (C19806.m45029("ܺܺ") + i2) * (-25);
                        i4 = ((iM11306 ^ i3) * (-26405)) ^ (-1403532328);
                        i5 = -538030475;
                    }
                    break;
                case -802115560:
                case -568439931:
                    if (C2871.m8646()) {
                        iM11306 = (C19806.m45029("ۨ۬") + i3) * 19;
                        i4 = ((iM11306 ^ i2) * 6589) ^ 768702121;
                        i5 = -241283459;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩻ܺ")) * 11;
                        i4 = ((iM11306 ^ i2) * 28933) ^ (-101698620);
                        i5 = -241297481;
                    }
                    break;
                case -470591652:
                case 593685861:
                    if (RunnableC3388.m10064()) {
                        iM11306 = (C19806.m45029("۟ܰ") + i3) * (-103);
                        i4 = ((iM11306 ^ i2) * (-21203)) ^ 1380001760;
                        i5 = -1509247246;
                    } else {
                        iM11306 = (i2 - C19806.m45029("᩶᩹")) * 63;
                        i4 = ((iM11306 ^ i3) * (-15505)) ^ 1258050457;
                        i5 = -257193875;
                    }
                    break;
                case 187656974:
                case 695944752:
                    if (C1398.f5802 <= 0) {
                        iM11306 = (i2 - C19806.m45029("᩶᩹")) * 63;
                        i4 = ((iM11306 ^ i3) * (-15505)) ^ 1258050457;
                        i5 = -257193875;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۘۨ")) * (-73);
                        i4 = ((iM11306 ^ i2) * 16695) ^ (-2071456409);
                        i5 = -1051971187;
                    }
                    break;
                case 191005375:
                case 2069623085:
                    interfaceC17295 = new InterfaceC17295() { // from class: l.᩵ۧۚ
                        @Override // l.InterfaceC17295
                        public final void accept(Object obj) {
                            C12362.m30768(this.f62575, (AbstractC20745) obj);
                        }
                    };
                    if (C2332.f8260) {
                        iM11306 = C19806.m45029("᩸ۡ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-23569)) ^ 377346317;
                        i5 = 1661302571;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩵ۧ")) * 37;
                        i4 = ((iM11306 ^ i3) * (-5157)) ^ 1339782936;
                        i5 = -1349618954;
                    }
                    break;
                case 328788823:
                case 2075457300:
                    if (C0671.f2816 == 0) {
                        iM11306 = (i2 - C19806.m45029("᩶᩹")) * 63;
                        i4 = ((iM11306 ^ i3) * (-15505)) ^ 1258050457;
                        i5 = -257193875;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩵ۧ")) * 37;
                        i4 = ((iM11306 ^ i3) * (-5157)) ^ 1339782936;
                        i5 = -1349618954;
                    }
                    break;
                case 631931691:
                case 1571701324:
                    if (C0797.m3359()) {
                        iM11306 = (i3 - C19806.m45029("ۘۗ")) * 39;
                        i4 = ((iM11306 ^ i2) * 17877) ^ (-244245131);
                        i5 = -412915364;
                    } else {
                        iM11306 = (i2 - C19806.m45029("᩶᩹")) * 63;
                        i4 = ((iM11306 ^ i3) * (-15505)) ^ 1258050457;
                        i5 = -257193875;
                    }
                    break;
                case 899436700:
                case 1393844364:
                    if (C1066.f4915 > 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩻ܺ")) * 11;
                        i4 = ((iM11306 ^ i2) * 28933) ^ (-101698620);
                        i5 = -241297481;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("֨ᩳ")) * (-125);
                        i4 = ((iM11306 ^ i2) * (-4843)) ^ (-1948230679);
                        i5 = -1571182086;
                    }
                    break;
                case 1028332793:
                case 2020112306:
                    if (!CallableC1627.f6528) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩵ۧ")) * 37;
                        i4 = ((iM11306 ^ i3) * (-5157)) ^ 1339782936;
                        i5 = -1349618954;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩻ܺ")) * 11;
                        i4 = ((iM11306 ^ i2) * 28933) ^ (-101698620);
                        i5 = -241297481;
                    }
                    break;
                default:
                    C0962.m3746();
                    iM11306 = (i3 - ThreadFactoryC3888.m11306("᩻ܺ")) * 11;
                    i4 = ((iM11306 ^ i2) * 28933) ^ (-101698620);
                    i5 = -241297481;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30774(C6887 c6887) {
        this.f41337 = c6887;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 29381. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30773() {
        /*
            Method dump skipped, instruction units count: 2938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12362.m30773():void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30769(final C12362 c12362, final byte[] bArr, final byte[] bArr2) {
        int i;
        int iM11306;
        int i2;
        int i3;
        int i4;
        int iM45029;
        int i5;
        int i6;
        int i7;
        int i8;
        int iM450210;
        int i9;
        int i10;
        int i11;
        int iM450211;
        int i12;
        int i13;
        int iM11307;
        int i14;
        int i15;
        int iM11308;
        int i16;
        int i17;
        int i18;
        int i19;
        short[] sArr;
        int iM450212;
        int i20;
        int i21;
        int iM11309;
        int i22;
        int i23;
        boolean z = false;
        int i24 = 0;
        int i25 = 0;
        int i26 = 2108051165;
        int i27 = C1398.f5802;
        int i28 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM450213 = C19806.m45029("ܽܿ") ^ i28;
        int i29 = ((iM450213 ^ i27) * (-10317)) ^ (-1511252357);
        int i30 = iM450213 ^ (-956505106);
        RadioButton radioButton = null;
        final RadioButton[] radioButtonArr = null;
        RadioButton radioButton2 = null;
        RadioButton radioButton3 = null;
        RadioButton radioButton4 = null;
        final EditText editText = null;
        C8067 c8067M3751 = null;
        Object obj = null;
        String strM5047 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i31 = 0;
        int iM450214 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        char c = 0;
        int i35 = 0;
        int i36 = 0;
        int iM450215 = 0;
        int iM450216 = 0;
        int i37 = 0;
        int iM113010 = 0;
        int iM450217 = 0;
        char c2 = 0;
        int i38 = 0;
        int iM113011 = 0;
        short s = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        RadioButton radioButton5 = null;
        RadioButton radioButton6 = null;
        View.OnClickListener onClickListener = null;
        int iM113012 = 0;
        View viewM9787 = null;
        AbstractActivityC12483 abstractActivityC12483 = null;
        while (true) {
            i26 = i30 ^ (i29 & (((i26 ^ i27) * (-8961)) >> 31));
            switch (i26) {
                case -2143330894:
                case 1131076371:
                    i33 = 64046;
                    iM11307 = (C19806.m45029("ۛۜ") + i27) * 77;
                    i14 = ((iM11307 ^ i28) * (-10217)) ^ 2050462579;
                    i15 = -1472397830;
                    int i42 = iM11307 ^ i15;
                    i39 = i39;
                    i31 = i31;
                    iM450214 = iM450214;
                    sArr3 = sArr3;
                    i40 = i40;
                    i41 = i41;
                    sArr2 = sArr2;
                    i30 = i42;
                    i29 = i14;
                    radioButton4 = radioButton4;
                    editText = editText;
                    onClickListener = onClickListener;
                    abstractActivityC12483 = abstractActivityC12483;
                    break;
                case -2108741731:
                case -52388980:
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    short[] sArr7 = sArr3;
                    i31 = i31;
                    iM450214 = iM450214;
                    int i43 = i40;
                    i = i41;
                    sArr3 = sArr7;
                    String strM3017 = C0671.m3017(C19806.m45029(C1460.m5047(sArr7, i43, i, i33)) ^ 2098039967);
                    i40 = i43;
                    RadioButton radioButton7 = radioButton2;
                    RunnableC0195.m1428(radioButton7, strM3017);
                    radioButton3 = radioButtonArr[c];
                    if (C1189.f5284 > 0) {
                        iM11306 = (i27 - ThreadFactoryC3888.m11306("۫ۧ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        radioButton2 = radioButton7;
                        i2 = ((iM11306 ^ i28) * (-20887)) ^ 2129711440;
                        i3 = -1896534512;
                        i30 = iM11306 ^ i3;
                        i29 = i2;
                        i41 = i;
                        i31 = i31;
                        iM450214 = iM450214;
                        sArr3 = sArr3;
                        i40 = i40;
                        radioButton4 = radioButton4;
                        editText = editText;
                        onClickListener = onClickListener;
                    } else {
                        radioButton2 = radioButton7;
                        i41 = i;
                        i39 = i39;
                        iM11307 = ThreadFactoryC3888.m11306("ۚ۟") ^ i28;
                        i14 = ((iM11307 ^ i27) * (-26363)) ^ 1800273182;
                        i15 = -1566249988;
                        int i44 = iM11307 ^ i15;
                        i39 = i39;
                        i31 = i31;
                        iM450214 = iM450214;
                        sArr3 = sArr3;
                        i40 = i40;
                        i41 = i41;
                        sArr2 = sArr2;
                        i30 = i44;
                        i29 = i14;
                        radioButton4 = radioButton4;
                        editText = editText;
                        onClickListener = onClickListener;
                        abstractActivityC12483 = abstractActivityC12483;
                    }
                    break;
                case -1938354308:
                case -1302447249:
                    i8 = i41;
                    radioButton5 = (RadioButton) C2642.m8167(viewM9787, C19806.m45029(strM5047) ^ 2100059131);
                    sArr2 = f41336;
                    i39 = 14;
                    iM450210 = (i28 - C19806.m45029("᩵᩶")) * 7;
                    i9 = ((iM450210 ^ i27) * 1359) ^ (-1523996973);
                    i10 = 118462341;
                    i30 = iM450210 ^ i10;
                    i29 = i9;
                    i31 = i31;
                    iM450214 = iM450214;
                    sArr3 = sArr3;
                    i40 = i40;
                    i41 = i8;
                    radioButton4 = radioButton4;
                    editText = editText;
                    onClickListener = onClickListener;
                    break;
                case -1888213669:
                case 610142551:
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    i31 = i31;
                    iM450214 = iM450214;
                    iM450216 = C19806.m45029(MenuItemOnMenuItemClickListenerC3244.m9715(f41336, 23, 3, i33));
                    i37 = 2102665089;
                    if (C2249.m6915() > 0) {
                        iM45029 = (i28 - C19806.m45029("᩶ܳ")) * (-51);
                        i5 = ((iM45029 ^ i27) * 15889) ^ 2104229135;
                        i6 = 214545687;
                        i30 = iM45029 ^ i6;
                        i29 = i5;
                        i31 = i31;
                        iM450214 = iM450214;
                        radioButton4 = radioButton4;
                        editText = editText;
                        onClickListener = onClickListener;
                    } else {
                        sArr2 = sArr2;
                        i7 = i39;
                        sArr3 = sArr3;
                        i40 = i40;
                        i4 = i41;
                        iM450212 = ThreadFactoryC3888.m11306("᩺ۙ") ^ i28;
                        i16 = ((iM450212 ^ i27) * (-11585)) ^ 525159296;
                        i20 = -1809731487;
                        i18 = iM450212 ^ i20;
                        i39 = i7;
                        iM450214 = iM450214;
                        sArr3 = sArr3;
                        i40 = i40;
                        i41 = i4;
                        sArr2 = sArr2;
                        i30 = i18;
                        i29 = i16;
                        radioButton4 = radioButton4;
                        i31 = i31;
                        onClickListener = onClickListener;
                        editText = editText;
                    }
                    break;
                case -1871837774:
                case -786804979:
                    C10634.m26830(c8067M3751, ThreadFactoryC3888.m11306(C10634.m26821(sArr6, i34, 3, i33)) ^ 2122505360, obj);
                    iM11309 = (i28 - C19806.m45029("ܺ᩹")) * 89;
                    i22 = ((iM11309 ^ i27) * 24709) ^ (-520568690);
                    i23 = 1286777790;
                    i30 = iM11309 ^ i23;
                    i29 = i22;
                    break;
                case -1689905674:
                case -621046498:
                    AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    short[] sArr8 = sArr2;
                    short[] sArr9 = sArr3;
                    int i45 = i40;
                    int i46 = i41;
                    i31 = i31;
                    int i47 = iM450214;
                    int i48 = i39;
                    short s2 = s;
                    if ((i24 + i25) - (s2 * 248) < 0) {
                        iM11308 = (i28 - C19806.m45029("֨᩸")) * 27;
                        i16 = ((iM11308 ^ i27) * 26401) ^ 1702669825;
                        i17 = 2065456367;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("֨ܶ") ^ i27;
                        i16 = ((iM11308 ^ i28) * (-10471)) ^ (-303039755);
                        i17 = 343549844;
                    }
                    i18 = iM11308 ^ i17;
                    s = s2;
                    i39 = i48;
                    iM450214 = i47;
                    sArr3 = sArr9;
                    i40 = i45;
                    i41 = i46;
                    sArr2 = sArr8;
                    abstractActivityC12483 = abstractActivityC12484;
                    i30 = i18;
                    i29 = i16;
                    radioButton4 = radioButton4;
                    i31 = i31;
                    onClickListener = onClickListener;
                    editText = editText;
                    break;
                case -1551308020:
                case 500463237:
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    sArr3 = sArr3;
                    i40 = i40;
                    i31 = i31;
                    iM450214 = iM450214;
                    i = i41;
                    radioButton6 = (RadioButton) C2642.m8167(viewM9787, iM450215 ^ 2125477114);
                    i32 = 3;
                    if (!C2332.f8260) {
                        i4 = i;
                        i7 = i39;
                        iM450212 = ThreadFactoryC3888.m11306("᩺ۙ") ^ i28;
                        i16 = ((iM450212 ^ i27) * (-11585)) ^ 525159296;
                        i20 = -1809731487;
                        i18 = iM450212 ^ i20;
                        i39 = i7;
                        iM450214 = iM450214;
                        sArr3 = sArr3;
                        i40 = i40;
                        i41 = i4;
                        sArr2 = sArr2;
                        i30 = i18;
                        i29 = i16;
                        radioButton4 = radioButton4;
                        i31 = i31;
                        onClickListener = onClickListener;
                        editText = editText;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۤ") ^ i28;
                        i2 = ((iM11306 ^ i27) * (-28861)) ^ (-1920281514);
                        i3 = 1340784169;
                        i30 = iM11306 ^ i3;
                        i29 = i2;
                        i41 = i;
                        i31 = i31;
                        iM450214 = iM450214;
                        sArr3 = sArr3;
                        i40 = i40;
                        radioButton4 = radioButton4;
                        editText = editText;
                        onClickListener = onClickListener;
                    }
                    break;
                case -1325900283:
                case 1643701791:
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    sArr3 = sArr3;
                    i40 = i40;
                    i4 = i41;
                    i31 = i31;
                    iM450214 = iM450214;
                    sArr = sArr2;
                    i7 = i39;
                    iM113012 = ThreadFactoryC3888.m11306(C1460.m5047(sArr, i7, 3, i33)) ^ 2102454222;
                    if (C7105.f23796 >= 0) {
                        iM450212 = (C19806.m45029("֨ᩴ") + i27) * 87;
                        sArr2 = sArr;
                        i16 = ((iM450212 ^ i28) * 2001) ^ (-262608957);
                        i20 = 1376151974;
                    } else {
                        sArr2 = sArr;
                        iM450212 = (i27 - C19806.m45029("᩶ۘ")) * (-33);
                        i16 = ((iM450212 ^ i28) * (-14039)) ^ 1210954648;
                        i20 = -102036128;
                    }
                    i18 = iM450212 ^ i20;
                    i39 = i7;
                    iM450214 = iM450214;
                    sArr3 = sArr3;
                    i40 = i40;
                    i41 = i4;
                    sArr2 = sArr2;
                    i30 = i18;
                    i29 = i16;
                    radioButton4 = radioButton4;
                    i31 = i31;
                    onClickListener = onClickListener;
                    editText = editText;
                    break;
                case -1315635391:
                case 655247061:
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    sArr2 = sArr2;
                    sArr3 = sArr3;
                    i40 = i40;
                    i41 = i41;
                    i31 = i31;
                    iM450214 = iM450214;
                    i39 = i39;
                    viewM9787 = C3286.m9787(abstractActivityC12483, i35 ^ i36);
                    abstractActivityC12483 = abstractActivityC12483;
                    strM5047 = C1460.m5047(f41336, 11, 3, i33);
                    if (C1875.f7103 >= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ۚ۟") ^ i28;
                        i14 = ((iM11307 ^ i27) * (-26363)) ^ 1800273182;
                        i15 = -1566249988;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ۧ۠") ^ i27) * 101;
                        i14 = ((iM11307 ^ i28) * 369) ^ 1354038976;
                        i15 = 1308278875;
                    }
                    int i49 = iM11307 ^ i15;
                    i39 = i39;
                    i31 = i31;
                    iM450214 = iM450214;
                    sArr3 = sArr3;
                    i40 = i40;
                    i41 = i41;
                    sArr2 = sArr2;
                    i30 = i49;
                    i29 = i14;
                    radioButton4 = radioButton4;
                    editText = editText;
                    onClickListener = onClickListener;
                    abstractActivityC12483 = abstractActivityC12483;
                    break;
                case -1244602938:
                case 1148184913:
                    C19806.m45028(c8067M3751, z);
                    final DialogInterfaceC19356 dialogInterfaceC19356M5514 = CallableC1627.m5514(c8067M3751);
                    final EditText editText2 = editText;
                    C7105.m18993(C3535.m10425(dialogInterfaceC19356M5514), new View.OnClickListener() { // from class: l.᩷ۧۚ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) throws Throwable {
                            C12362.m30770(this.f67688, radioButtonArr, bArr, bArr2, dialogInterfaceC19356M5514, editText2);
                        }
                    });
                    break;
                case -1182240633:
                case 762523361:
                    C1189.m4368();
                    if (RunnableC1895.m6170() != 0) {
                        onClickListener = onClickListener;
                        iM450211 = C19806.m45029("ۡۢ") ^ i27;
                        i12 = ((iM450211 ^ i28) * 30381) ^ (-759857263);
                        i13 = 666656022;
                        i30 = iM450211 ^ i13;
                        i29 = i12;
                        onClickListener = onClickListener;
                    } else {
                        onClickListener = onClickListener;
                        editText = editText;
                        radioButton4 = radioButton4;
                        sArr3 = sArr3;
                        i40 = i40;
                        i4 = i41;
                        i31 = i31;
                        iM450214 = iM450214;
                        i7 = i39;
                        iM450212 = ThreadFactoryC3888.m11306("᩺ۙ") ^ i28;
                        i16 = ((iM450212 ^ i27) * (-11585)) ^ 525159296;
                        i20 = -1809731487;
                        i18 = iM450212 ^ i20;
                        i39 = i7;
                        iM450214 = iM450214;
                        sArr3 = sArr3;
                        i40 = i40;
                        i41 = i4;
                        sArr2 = sArr2;
                        i30 = i18;
                        i29 = i16;
                        radioButton4 = radioButton4;
                        i31 = i31;
                        onClickListener = onClickListener;
                        editText = editText;
                    }
                    break;
                case -1097716460:
                case 212448458:
                    if (C2704.m8255() <= 0) {
                        onClickListener = onClickListener;
                        editText = editText;
                        radioButton4 = radioButton4;
                        sArr3 = sArr3;
                        i40 = i40;
                        i4 = i41;
                        i31 = i31;
                        iM450214 = iM450214;
                        sArr = sArr2;
                        i7 = i39;
                        iM450212 = (C19806.m45029("֨ᩴ") + i27) * 87;
                        sArr2 = sArr;
                        i16 = ((iM450212 ^ i28) * 2001) ^ (-262608957);
                        i20 = 1376151974;
                        i18 = iM450212 ^ i20;
                        i39 = i7;
                        iM450214 = iM450214;
                        sArr3 = sArr3;
                        i40 = i40;
                        i41 = i4;
                        sArr2 = sArr2;
                        i30 = i18;
                        i29 = i16;
                        radioButton4 = radioButton4;
                        i31 = i31;
                        onClickListener = onClickListener;
                        editText = editText;
                    }
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    sArr3 = sArr3;
                    i40 = i40;
                    i4 = i41;
                    i31 = i31;
                    iM450214 = iM450214;
                    i7 = i39;
                    iM450212 = ThreadFactoryC3888.m11306("᩺ۙ") ^ i28;
                    i16 = ((iM450212 ^ i27) * (-11585)) ^ 525159296;
                    i20 = -1809731487;
                    i18 = iM450212 ^ i20;
                    i39 = i7;
                    iM450214 = iM450214;
                    sArr3 = sArr3;
                    i40 = i40;
                    i41 = i4;
                    sArr2 = sArr2;
                    i30 = i18;
                    i29 = i16;
                    radioButton4 = radioButton4;
                    i31 = i31;
                    onClickListener = onClickListener;
                    editText = editText;
                    break;
                case -1083197485:
                case 1622170963:
                    C7105.m18993(radioButtonArr[i31], onClickListener);
                    i21 = i31 + 1;
                    editText = editText;
                    int iM113013 = (ThreadFactoryC3888.m11306("ۙ֡") ^ i28) * 5;
                    i31 = i21;
                    i19 = ((iM113013 ^ i27) * 11883) ^ (-41359761);
                    i30 = iM113013 ^ 1834786013;
                    i29 = i19;
                    i31 = i31;
                    editText = editText;
                    break;
                case -968965144:
                case -286765863:
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    sArr3 = sArr3;
                    i40 = i40;
                    i31 = i31;
                    iM450214 = iM450214;
                    i = i41;
                    radioButtonArr = new RadioButton[i32];
                    z = false;
                    radioButtonArr[0] = radioButton5;
                    c = 1;
                    radioButtonArr[1] = radioButton;
                    c2 = 2;
                    iM11306 = C19806.m45029("ܽᩴ") ^ i28;
                    i2 = ((iM11306 ^ i27) * 17963) ^ 2627709;
                    i3 = 1183958489;
                    i30 = iM11306 ^ i3;
                    i29 = i2;
                    i41 = i;
                    i31 = i31;
                    iM450214 = iM450214;
                    sArr3 = sArr3;
                    i40 = i40;
                    radioButton4 = radioButton4;
                    editText = editText;
                    onClickListener = onClickListener;
                    break;
                case -759890194:
                case 848786648:
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    i31 = i31;
                    iM450214 = iM450214;
                    short[] sArr10 = sArr4;
                    int i50 = i38;
                    iM113011 = ThreadFactoryC3888.m11306(C2788.m8470(sArr10, i50, 3, i33)) ^ 2123408827;
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        sArr4 = sArr10;
                        i38 = i50;
                        sArr2 = sArr2;
                        i7 = i39;
                        sArr3 = sArr3;
                        i40 = i40;
                        i4 = i41;
                        iM450212 = ThreadFactoryC3888.m11306("᩺ۙ") ^ i28;
                        i16 = ((iM450212 ^ i27) * (-11585)) ^ 525159296;
                        i20 = -1809731487;
                        i18 = iM450212 ^ i20;
                        i39 = i7;
                        iM450214 = iM450214;
                        sArr3 = sArr3;
                        i40 = i40;
                        i41 = i4;
                        sArr2 = sArr2;
                        i30 = i18;
                        i29 = i16;
                        radioButton4 = radioButton4;
                        i31 = i31;
                        onClickListener = onClickListener;
                        editText = editText;
                    } else {
                        int iM113014 = (ThreadFactoryC3888.m11306("ۧ᩵") ^ i28) * 47;
                        sArr4 = sArr10;
                        i30 = iM113014 ^ 1458595402;
                        i29 = ((iM113014 ^ i27) * 17065) ^ (-997302900);
                        i38 = i50;
                        i31 = i31;
                        iM450214 = iM450214;
                        radioButton4 = radioButton4;
                        editText = editText;
                        onClickListener = onClickListener;
                    }
                    break;
                case -668833454:
                case -159415063:
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        onClickListener = onClickListener;
                        editText = editText;
                        radioButton4 = radioButton4;
                        sArr3 = sArr3;
                        i40 = i40;
                        i4 = i41;
                        i31 = i31;
                        iM450214 = iM450214;
                        i7 = i39;
                        iM450212 = ThreadFactoryC3888.m11306("᩺ۙ") ^ i28;
                        i16 = ((iM450212 ^ i27) * (-11585)) ^ 525159296;
                        i20 = -1809731487;
                        i18 = iM450212 ^ i20;
                        i39 = i7;
                        iM450214 = iM450214;
                        sArr3 = sArr3;
                        i40 = i40;
                        i41 = i4;
                        sArr2 = sArr2;
                        i30 = i18;
                        i29 = i16;
                        radioButton4 = radioButton4;
                        i31 = i31;
                        onClickListener = onClickListener;
                        editText = editText;
                    } else {
                        onClickListener = onClickListener;
                        editText = editText;
                        radioButton4 = radioButton4;
                        sArr3 = sArr3;
                        i40 = i40;
                        i41 = i41;
                        i31 = i31;
                        iM450214 = iM450214;
                        i39 = i39;
                        iM11307 = ThreadFactoryC3888.m11306("ۚ۟") ^ i28;
                        i14 = ((iM11307 ^ i27) * (-26363)) ^ 1800273182;
                        i15 = -1566249988;
                        int i410 = iM11307 ^ i15;
                        i39 = i39;
                        i31 = i31;
                        iM450214 = iM450214;
                        sArr3 = sArr3;
                        i40 = i40;
                        i41 = i41;
                        sArr2 = sArr2;
                        i30 = i410;
                        i29 = i14;
                        radioButton4 = radioButton4;
                        editText = editText;
                        onClickListener = onClickListener;
                        abstractActivityC12483 = abstractActivityC12483;
                    }
                    break;
                case -646425443:
                case 980715435:
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    C2332.m7086(radioButton4, C1875.m6085(iM113011));
                    i31 = i31;
                    iM450214 = iM450214;
                    iM113010 = ThreadFactoryC3888.m11306(C3722.m10901(f41336, 29, 3, i33));
                    iM45029 = C19806.m45029("ۘ۠") ^ i28;
                    i5 = ((iM45029 ^ i27) * (-24671)) ^ 1286558375;
                    i6 = -736067163;
                    i30 = iM45029 ^ i6;
                    i29 = i5;
                    i31 = i31;
                    iM450214 = iM450214;
                    radioButton4 = radioButton4;
                    editText = editText;
                    onClickListener = onClickListener;
                    break;
                case -532830020:
                case 267530393:
                    obj = null;
                    C1460.m5055(c8067M3751, iM450217 ^ 2128550695, null);
                    sArr6 = f41336;
                    i34 = 38;
                    if (!RunnableC1895.f7152) {
                        onClickListener = onClickListener;
                        editText = editText;
                        radioButton4 = radioButton4;
                        sArr3 = sArr3;
                        i40 = i40;
                        i41 = i41;
                        i31 = i31;
                        iM450214 = iM450214;
                        i39 = i39;
                        iM11307 = ThreadFactoryC3888.m11306("ۚ۟") ^ i28;
                        i14 = ((iM11307 ^ i27) * (-26363)) ^ 1800273182;
                        i15 = -1566249988;
                        int i411 = iM11307 ^ i15;
                        i39 = i39;
                        i31 = i31;
                        iM450214 = iM450214;
                        sArr3 = sArr3;
                        i40 = i40;
                        i41 = i41;
                        sArr2 = sArr2;
                        i30 = i411;
                        i29 = i14;
                        radioButton4 = radioButton4;
                        editText = editText;
                        onClickListener = onClickListener;
                        abstractActivityC12483 = abstractActivityC12483;
                    } else {
                        iM11309 = ThreadFactoryC3888.m11306("᩹ۧ") ^ i27;
                        i22 = ((iM11309 ^ i28) * 24633) ^ 160949275;
                        i23 = -1149760575;
                        i30 = iM11309 ^ i23;
                        i29 = i22;
                    }
                    break;
                case -504155291:
                case 708788245:
                    int i51 = iM450214;
                    int i52 = i31;
                    RadioButton radioButton8 = radioButton3;
                    RunnableC0195.m1428(radioButton8, C1875.m6085(iM450216 ^ i37));
                    RadioButton radioButton9 = radioButtonArr[c2];
                    sArr4 = f41336;
                    i38 = 26;
                    int iM113015 = (i27 - ThreadFactoryC3888.m11306("ܿ۟")) * (-11);
                    i11 = ((iM113015 ^ i28) * (-10781)) ^ 527985332;
                    i30 = iM113015 ^ 347591801;
                    radioButton3 = radioButton8;
                    i31 = i52;
                    iM450214 = i51;
                    radioButton4 = radioButton9;
                    i29 = i11;
                    editText = editText;
                    onClickListener = onClickListener;
                    break;
                case -409785671:
                case 1349751963:
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    i31 = i31;
                    iM450214 = iM450214;
                    radioButtonArr[c2] = radioButton6;
                    radioButton2 = radioButtonArr[z ? 1 : 0];
                    sArr3 = f41336;
                    i40 = 20;
                    i41 = 3;
                    if (C0962.m3746() >= 0) {
                        iM45029 = C19806.m45029("۠᩺") ^ i28;
                        i5 = ((iM45029 ^ i27) * (-23143)) ^ (-2052645578);
                        i6 = 411732650;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ۬") ^ i27;
                        i5 = ((iM45029 ^ i28) * (-8661)) ^ 2084300175;
                        i6 = -671779359;
                    }
                    i30 = iM45029 ^ i6;
                    i29 = i5;
                    i31 = i31;
                    iM450214 = iM450214;
                    radioButton4 = radioButton4;
                    editText = editText;
                    onClickListener = onClickListener;
                    break;
                case -338422084:
                case 1134146939:
                    c8067M3751 = C0962.m3751(abstractActivityC12483);
                    C1977.m6349(c8067M3751, viewM9787);
                    onClickListener = onClickListener;
                    iM450217 = C19806.m45029(C0797.m3361(f41336, 35, 3, i33));
                    iM450211 = ThreadFactoryC3888.m11306("᩸᩶") ^ i27;
                    i12 = ((iM450211 ^ i28) * (-4525)) ^ (-1156012935);
                    i13 = 618941338;
                    i30 = iM450211 ^ i13;
                    i29 = i12;
                    onClickListener = onClickListener;
                    break;
                case -309592949:
                case 1213292806:
                    onClickListener = onClickListener;
                    if (i31 < i32) {
                        iM450211 = ThreadFactoryC3888.m11306("֡᩶") ^ i27;
                        i12 = ((iM450211 ^ i28) * (-19193)) ^ 447251129;
                        i13 = -1803924773;
                    } else {
                        iM450211 = (ThreadFactoryC3888.m11306("ᩳ᩸") ^ i28) * (-43);
                        i12 = ((iM450211 ^ i27) * (-17861)) ^ 802376602;
                        i13 = 521241862;
                    }
                    i30 = iM450211 ^ i13;
                    i29 = i12;
                    onClickListener = onClickListener;
                    break;
                case -76800193:
                case 1965182746:
                    onClickListener = onClickListener;
                    editText = (EditText) C2642.m8167(viewM9787, iM113010 ^ 2099221067);
                    sArr5 = f41336;
                    if (C1377.f5749) {
                        iM450211 = (ThreadFactoryC3888.m11306("ۖܳ") + i27) * 93;
                        i12 = ((iM450211 ^ i28) * 1341) ^ (-687153328);
                        i13 = -2788991;
                    } else {
                        iM450211 = C19806.m45029("ۡۢ") ^ i27;
                        i12 = ((iM450211 ^ i28) * 30381) ^ (-759857263);
                        i13 = 666656022;
                    }
                    i30 = iM450211 ^ i13;
                    i29 = i12;
                    onClickListener = onClickListener;
                    break;
                case 32687698:
                case 1490110451:
                    iM450214 = 2129812230 ^ C19806.m45029(AbstractC0464.m2308(sArr5, 32, 3, i33));
                    int iM450218 = C19806.m45029("ۙ᩻") ^ i27;
                    i11 = ((iM450218 ^ i28) * 23397) ^ (-14017091);
                    i30 = iM450218 ^ 389580568;
                    i29 = i11;
                    editText = editText;
                    onClickListener = onClickListener;
                    break;
                case 61220110:
                case 1688143451:
                    C0278.m1789();
                    break;
                case 852070962:
                case 1009605671:
                    final TextView textView = (TextView) C3743.m10957(viewM9787, iM450214);
                    editText = editText;
                    onClickListener = new View.OnClickListener() { // from class: l.۟ۧۚ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            RadioButton[] radioButtonArr2 = radioButtonArr;
                            int length = radioButtonArr2.length;
                            int i53 = 0;
                            while (true) {
                                boolean z2 = true;
                                if (i53 >= length) {
                                    break;
                                }
                                RadioButton radioButton10 = radioButtonArr2[i53];
                                if (view != radioButton10) {
                                    z2 = false;
                                }
                                radioButton10.setChecked(z2);
                                i53++;
                            }
                            editText.setVisibility(view != radioButtonArr2[1] ? 8 : 0);
                            textView.setText((String) view.getTag());
                        }
                    };
                    i21 = 0;
                    int iM113016 = (ThreadFactoryC3888.m11306("ۙ֡") ^ i28) * 5;
                    i31 = i21;
                    i19 = ((iM113016 ^ i27) * 11883) ^ (-41359761);
                    i30 = iM113016 ^ 1834786013;
                    i29 = i19;
                    i31 = i31;
                    editText = editText;
                    break;
                case 891330121:
                case 1114482722:
                    AbstractC0464.m2313();
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    sArr3 = sArr3;
                    i40 = i40;
                    i41 = i41;
                    i31 = i31;
                    iM450214 = iM450214;
                    i39 = i39;
                    iM11307 = ThreadFactoryC3888.m11306("ۚ۟") ^ i28;
                    i14 = ((iM11307 ^ i27) * (-26363)) ^ 1800273182;
                    i15 = -1566249988;
                    int i412 = iM11307 ^ i15;
                    i39 = i39;
                    i31 = i31;
                    iM450214 = iM450214;
                    sArr3 = sArr3;
                    i40 = i40;
                    i41 = i41;
                    sArr2 = sArr2;
                    i30 = i412;
                    i29 = i14;
                    radioButton4 = radioButton4;
                    editText = editText;
                    onClickListener = onClickListener;
                    abstractActivityC12483 = abstractActivityC12483;
                    break;
                case 1064281319:
                case 1739066166:
                    i33 = 42061;
                    iM11307 = (C19806.m45029("ۛۜ") + i27) * 77;
                    i14 = ((iM11307 ^ i28) * (-10217)) ^ 2050462579;
                    i15 = -1472397830;
                    int i413 = iM11307 ^ i15;
                    i39 = i39;
                    i31 = i31;
                    iM450214 = iM450214;
                    sArr3 = sArr3;
                    i40 = i40;
                    i41 = i41;
                    sArr2 = sArr2;
                    i30 = i413;
                    i29 = i14;
                    radioButton4 = radioButton4;
                    editText = editText;
                    onClickListener = onClickListener;
                    abstractActivityC12483 = abstractActivityC12483;
                    break;
                case 1289565800:
                case 1570751676:
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    sArr2 = sArr2;
                    sArr3 = sArr3;
                    i40 = i40;
                    i4 = i41;
                    i31 = i31;
                    iM450214 = iM450214;
                    i7 = i39;
                    AbstractActivityC12483 abstractActivityC12485 = c12362.f41338;
                    int iM450219 = C19806.m45029(C3286.m9788(f41336, 8, 3, i33));
                    i36 = 2101031882;
                    if (C0278.f1572 > 0) {
                        int iM113017 = ThreadFactoryC3888.m11306("ۘۨ") ^ i28;
                        i19 = ((iM113017 ^ i27) * (-20999)) ^ 475002142;
                        i39 = i7;
                        iM450214 = iM450214;
                        sArr3 = sArr3;
                        i40 = i40;
                        i41 = i4;
                        sArr2 = sArr2;
                        i30 = iM113017 ^ (-2045998990);
                        radioButton4 = radioButton4;
                        abstractActivityC12483 = abstractActivityC12485;
                        onClickListener = onClickListener;
                        i35 = iM450219;
                        i29 = i19;
                        i31 = i31;
                        editText = editText;
                    } else {
                        abstractActivityC12483 = abstractActivityC12485;
                        i35 = iM450219;
                        iM450212 = ThreadFactoryC3888.m11306("᩺ۙ") ^ i28;
                        i16 = ((iM450212 ^ i27) * (-11585)) ^ 525159296;
                        i20 = -1809731487;
                        i18 = iM450212 ^ i20;
                        i39 = i7;
                        iM450214 = iM450214;
                        sArr3 = sArr3;
                        i40 = i40;
                        i41 = i4;
                        sArr2 = sArr2;
                        i30 = i18;
                        i29 = i16;
                        radioButton4 = radioButton4;
                        i31 = i31;
                        onClickListener = onClickListener;
                        editText = editText;
                    }
                    break;
                case 1744703995:
                case 2106495160:
                    abstractActivityC12483 = abstractActivityC12483;
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    sArr2 = sArr2;
                    sArr3 = sArr3;
                    i40 = i40;
                    i41 = i41;
                    i31 = i31;
                    iM450214 = iM450214;
                    i39 = i39;
                    s = f41336[7];
                    i24 = s * s;
                    i25 = 15376;
                    iM11307 = (ThreadFactoryC3888.m11306("ᩳܳ") ^ i28) * (-35);
                    i14 = ((iM11307 ^ i27) * 1261) ^ (-1881230010);
                    i15 = 1737536685;
                    int i414 = iM11307 ^ i15;
                    i39 = i39;
                    i31 = i31;
                    iM450214 = iM450214;
                    sArr3 = sArr3;
                    i40 = i40;
                    i41 = i41;
                    sArr2 = sArr2;
                    i30 = i414;
                    i29 = i14;
                    radioButton4 = radioButton4;
                    editText = editText;
                    onClickListener = onClickListener;
                    abstractActivityC12483 = abstractActivityC12483;
                    break;
                default:
                    radioButton = (RadioButton) C2642.m8167(viewM9787, iM113012);
                    i8 = i41;
                    iM450215 = C19806.m45029(C19806.m45020(f41336, 17, 3, i33));
                    iM450210 = C19806.m45029("ۗܳ") ^ i27;
                    i9 = ((iM450210 ^ i28) * (-12747)) ^ 1501994727;
                    i10 = 918657092;
                    i30 = iM450210 ^ i10;
                    i29 = i9;
                    i31 = i31;
                    iM450214 = iM450214;
                    sArr3 = sArr3;
                    i40 = i40;
                    i41 = i8;
                    radioButton4 = radioButton4;
                    editText = editText;
                    onClickListener = onClickListener;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0409 A[PHI: r17
      0x0409: PHI (r17v27 'e' java.lang.Exception) = 
      (r17v1 'e' java.lang.Exception)
      (r17v2 'e' java.lang.Exception)
      (r17v3 'e' java.lang.Exception)
      (r17v28 'e' java.lang.Exception)
     binds: [B:105:0x0407, B:101:0x03ea, B:97:0x03c7, B:19:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x011a A[PHI: r7
      0x011a: PHI (r7v7 int) = (r7v4 int), (r7v1 int), (r7v1 int), (r7v1 int) binds: [B:46:0x0118, B:21:0x0098, B:124:0x011a, B:123:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e7, code lost:
    
        if (l.C1025.f4800 >= 0) goto L29;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m30770(l.C12362 r19, android.widget.RadioButton[] r20, byte[] r21, byte[] r22, l.DialogInterfaceC19356 r23, android.widget.EditText r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12362.m30770(l.۫ۧۚ, android.widget.RadioButton[], byte[], byte[], l.᩵ۡۜ, android.widget.EditText):void");
    }
}
