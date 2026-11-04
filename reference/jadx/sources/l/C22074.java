package l;

import android.view.View;
import com.google.android.material.slider.BaseSlider;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩷۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes.dex */
public final class C22074 extends C22248 {

    /* JADX INFO: renamed from: ֨ܺۡ, reason: not valid java name and contains not printable characters */
    private static final short[] f71168 = {6448, -25119, 23026, 21581, 6608, 17158, 17920, -16434, 9915, -5961, 12779, -12998};

    @Override // l.C22248, l.InterfaceC6656
    public final void onDrawerSlide(View view, float f) {
        int iM3792 = 0;
        short[] sArr = null;
        short s = 0;
        int i = 0;
        short s2 = 0;
        int i2 = 0;
        short[] sArr2 = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1624822764;
        int i6 = C0269.f1558;
        int i7 = C23916.f77426;
        int iM2761 = C0619.m2761("ۙܺ") ^ i7;
        int i8 = ((iM2761 ^ i6) * 31153) ^ 1135786883;
        int i9 = -1054762695;
        while (true) {
            i5 = ((((i5 ^ i6) * 6703) >> 31) & i8) ^ (iM2761 ^ i9);
            switch (i5) {
                case -2001049095:
                case -1935127949:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0619.m2761("ۗۨ") + i7) * (-113);
                        i8 = ((iM2761 ^ i6) * 1179) ^ 642438151;
                        i9 = 1715794398;
                    } else {
                        iM2761 = C0773.m3169("᩸ܰ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 207) ^ 1384185815;
                        i9 = -1284984242;
                    }
                    break;
                case -1883610001:
                case 1123112622:
                    C1564.m5509();
                    if (C3099.f10023 > 0) {
                        iM2761 = C0619.m2761("ᩴܰ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-19233)) ^ (-1353077601);
                        i9 = 238792263;
                    } else {
                        iM2761 = (C0619.m2761("ۗۨ") + i7) * (-113);
                        i8 = ((iM2761 ^ i6) * 1179) ^ 642438151;
                        i9 = 1715794398;
                    }
                    break;
                case -1844568069:
                case -1211188175:
                    AbstractC3624.m11755();
                    if (C1146.f4234 < 0) {
                        iM2761 = (C0619.m2761("ۗۨ") + i7) * (-113);
                        i8 = ((iM2761 ^ i6) * 1179) ^ 642438151;
                        i9 = 1715794398;
                    } else {
                        iM2761 = (C0619.m2761("᩺ᩴ") ^ i6) * (-31);
                        i8 = ((iM2761 ^ i7) * 12447) ^ 1203279437;
                        i9 = 1754050901;
                    }
                    break;
                case -1696725875:
                case -50694720:
                    i = s * 23356;
                    s2 = 5839;
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0619.m2761("ᩴܰ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-19233)) ^ (-1353077601);
                        i9 = 238792263;
                    } else {
                        iM2761 = C0619.m2761("۠ۤ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 9565) ^ 721927372;
                        i9 = -2066592283;
                    }
                    break;
                case -1674767895:
                case 1330764193:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0619.m2761("ܿۧ") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-26535)) ^ (-1581197672);
                        i9 = -1594090504;
                    } else {
                        iM2761 = C0619.m2761("ۡܰ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 31963) ^ (-1791192563);
                        i9 = 310553601;
                    }
                    break;
                case -1586068742:
                case 1796549354:
                    s = sArr[8];
                    if (C4282.m13644()) {
                        iM2761 = (C0773.m3169("ۜ۫") ^ i6) * (-7);
                        i8 = ((iM2761 ^ i7) * (-26899)) ^ (-1208806077);
                        i9 = 801776541;
                    } else {
                        iM2761 = C0619.m2761("ܿۧ") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-26535)) ^ (-1581197672);
                        i9 = -1594090504;
                    }
                    break;
                case -1548981566:
                case 1728284599:
                    AbstractC3624.m11755();
                    C1783.m6232();
                    iM2761 = (C0619.m2761("᩺ᩴ") ^ i6) * (-31);
                    i8 = ((iM2761 ^ i7) * 12447) ^ 1203279437;
                    i9 = 1754050901;
                    break;
                case -1341595543:
                case 131181580:
                    if (iM3792 == (C0619.m2761(C1321.m4861(sArr2, i3, i4, i2)) ^ 2122239085)) {
                        iM2761 = (C0619.m2761("ۛ᩻") + i7) * (-35);
                        i8 = ((iM2761 ^ i6) * (-7829)) ^ (-1647622092);
                        i9 = 764327660;
                    } else {
                        iM2761 = (C0773.m3169("ܳ֡") ^ i6) * 21;
                        i8 = ((iM2761 ^ i7) * 7201) ^ 1773656751;
                        i9 = 108263471;
                    }
                    break;
                case -1334471580:
                case 1711718796:
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0619.m2761("ܿۧ") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-26535)) ^ (-1581197672);
                        i9 = -1594090504;
                    } else {
                        iM2761 = (C0773.m3169("۟۬") + i6) * (-65);
                        i8 = ((iM2761 ^ i7) * (-20183)) ^ (-445266120);
                        i9 = 1920189063;
                    }
                    break;
                case -1237945886:
                case 736381326:
                    i2 = 28097;
                    iM2761 = C0773.m3169("ܺܺ") ^ i6;
                    i8 = ((iM2761 ^ i7) * 2903) ^ 125671860;
                    i9 = 312503663;
                    break;
                case -1104035209:
                case 743870850:
                    int i10 = s + s2;
                    if (i - (i10 * i10) <= 0) {
                        iM2761 = C0619.m2761("ܰۧ") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-8095)) ^ 2138623651;
                        i9 = 450155362;
                    } else {
                        iM2761 = C0619.m2761("۫᩷") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-26695)) ^ 1121535633;
                        i9 = 285731572;
                    }
                    break;
                case -953899753:
                case 898805450:
                    i2 = 46712;
                    iM2761 = C0773.m3169("ܺܺ") ^ i6;
                    i8 = ((iM2761 ^ i7) * 2903) ^ 125671860;
                    i9 = 312503663;
                    break;
                case -823173897:
                case 414201686:
                    i4 = 3;
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0619.m2761("ۗۨ") + i7) * (-113);
                        i8 = ((iM2761 ^ i6) * 1179) ^ 642438151;
                        i9 = 1715794398;
                    } else {
                        iM2761 = C0773.m3169("ۛᩴ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-2101)) ^ (-327486539);
                        i9 = 1026691427;
                    }
                    break;
                case -802534856:
                case 961361608:
                    sArr = f71168;
                    if (C11235.f35427 >= 0) {
                        iM2761 = (C0619.m2761("᩺ᩴ") ^ i6) * (-31);
                        i8 = ((iM2761 ^ i7) * 12447) ^ 1203279437;
                        i9 = 1754050901;
                    } else {
                        iM2761 = (C0619.m2761("֨ۚ") + i6) * 29;
                        i8 = ((iM2761 ^ i7) * 20423) ^ (-1761037747);
                        i9 = -94020137;
                    }
                    break;
                case -737758419:
                case -549170286:
                    super.onDrawerSlide(view, f);
                    iM2761 = (C0773.m3169("ܳ֡") ^ i6) * 21;
                    i8 = ((iM2761 ^ i7) * 7201) ^ 1773656751;
                    i9 = 108263471;
                    break;
                case -680027175:
                case 886818541:
                    if (C1564.f5401 > 0) {
                        iM2761 = (C0619.m2761("᩺ᩴ") ^ i6) * (-31);
                        i8 = ((iM2761 ^ i7) * 12447) ^ 1203279437;
                        i9 = 1754050901;
                    } else {
                        iM2761 = C0619.m2761("ۙ۟") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-8789)) ^ (-969239505);
                        i9 = -1735852280;
                    }
                    break;
                case -423901942:
                case 1354286774:
                    break;
                case -71167698:
                case 1136883493:
                    if (C3998.f13671 != 0) {
                        iM2761 = C0619.m2761("ᩴܰ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-19233)) ^ (-1353077601);
                        i9 = 238792263;
                    } else {
                        iM2761 = C0773.m3169("ۧۛ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-27875)) ^ (-21866143);
                        i9 = -1969874138;
                    }
                    break;
                case 772162512:
                case 2054180688:
                    C13473.m33144();
                    C0619.m2763();
                    break;
                case 1038488112:
                case 1318408395:
                    iM3792 = C0950.m3792(view);
                    sArr2 = f71168;
                    i3 = 9;
                    if (C13473.f42873 != 0) {
                        iM2761 = C0619.m2761("ᩴܰ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-19233)) ^ (-1353077601);
                        i9 = 238792263;
                    } else {
                        iM2761 = C0619.m2761("ܰܽ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-27577)) ^ (-2017164227);
                        i9 = -200480404;
                    }
                    break;
                default:
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0619.m2761("ᩴܰ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-19233)) ^ (-1353077601);
                        i9 = 238792263;
                    } else {
                        iM2761 = (C0619.m2761("ۗ᩸") + i7) * 13;
                        i8 = ((iM2761 ^ i6) * 27511) ^ 1165952476;
                        i9 = 767365395;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0079  */
    /* JADX WARN: Code duplicated, block: B:35:0x0119 A[PHI: r1 r11
      0x0119: PHI (r1v4 int) = (r1v3 int), (r1v2 int) binds: [B:34:0x0117, B:10:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r11v4 short[]) = (r11v3 short[]), (r11v2 short[]) binds: [B:34:0x0117, B:10:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x021d A[PHI: r3 r4 r5 r9
      0x021d: PHI (r3v4 char) = (r3v3 char), (r3v2 char), (r3v2 char), (r3v2 char) binds: [B:61:0x021b, B:57:0x01fe, B:45:0x019d, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x021d: PHI (r4v4 short) = (r4v2 short), (r4v3 short), (r4v2 short), (r4v2 short) binds: [B:61:0x021b, B:57:0x01fe, B:45:0x019d, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x021d: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:61:0x021b, B:57:0x01fe, B:45:0x019d, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x021d: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:61:0x021b, B:57:0x01fe, B:45:0x019d, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0268 A[PHI: r6 r7 r8 r12 r13 r18
      0x0268: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:69:0x0266, B:65:0x024b, B:53:0x01dd, B:49:0x01be, B:30:0x00f6, B:26:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:69:0x0266, B:65:0x024b, B:53:0x01dd, B:49:0x01be, B:30:0x00f6, B:26:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:69:0x0266, B:65:0x024b, B:53:0x01dd, B:49:0x01be, B:30:0x00f6, B:26:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:69:0x0266, B:65:0x024b, B:53:0x01dd, B:49:0x01be, B:30:0x00f6, B:26:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:69:0x0266, B:65:0x024b, B:53:0x01dd, B:49:0x01be, B:30:0x00f6, B:26:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r18v5 short[]) = (r18v3 short[]), (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:69:0x0266, B:65:0x024b, B:53:0x01dd, B:49:0x01be, B:30:0x00f6, B:26:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.C22248, l.InterfaceC6656
    public final void onDrawerClosed(View view) {
        int iM3169;
        int i;
        int i2;
        int i3 = C3734.f12817;
        int i4 = C2419.f7754;
        int iM31610 = (C0773.m3169("ۘۖ") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
        int i5 = ((iM31610 ^ i3) * 20103) ^ 2031471302;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM31610 ^ 1345817350;
        int iM13536 = 0;
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
        int i14 = 1637020555;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * 10455) >> 31));
            switch (i14) {
                case -1938812382:
                case 840157427:
                    sArr = f71168;
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0773.m3169("᩹᩻") ^ i4;
                        i = ((iM3169 ^ i3) * (-13057)) ^ (-578621314);
                        i2 = 467774831;
                    } else {
                        iM3169 = C0773.m3169("ᩴ۫") ^ i3;
                        i = ((iM3169 ^ i4) * (-14167)) ^ 1358877434;
                        i2 = -911018043;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1851876193:
                case 286530892:
                    i8 = i7 * i7;
                    i9 = s * s;
                    if (C0619.f2439) {
                        iM3169 = C0773.m3169("᩹᩻") ^ i4;
                        i = ((iM3169 ^ i3) * (-13057)) ^ (-578621314);
                        i2 = 467774831;
                    } else {
                        iM3169 = (C0773.m3169("ۜۤ") ^ i4) * (-71);
                        i = ((iM3169 ^ i3) * (-3743)) ^ (-1994306956);
                        i2 = 1751488209;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1763805224:
                case 607846712:
                    C20932.m47848();
                    if (C1343.f4799 == 0) {
                        iM3169 = C0773.m3169("֫۠") ^ i4;
                        i = ((iM3169 ^ i3) * (-101)) ^ 1337451824;
                        i2 = 356540683;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ܽ᩸")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM3169 ^ i3) * (-29767)) ^ (-1336426521);
                        i2 = -442049018;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1657334252:
                case -1265421658:
                    C3099.m10095();
                    C1080.m4050();
                    break;
                case -1604660737:
                case 1035389458:
                    break;
                case -1593788493:
                case -69202490:
                    super.onDrawerClosed(view);
                    iM3169 = C0773.m3169("ۖܰ") ^ i3;
                    i = ((iM3169 ^ i4) * 32481) ^ 1866579428;
                    i2 = -1465458767;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1297834840:
                case -1142025219:
                    C3690.m11987();
                    if (C2287.m7745() > 0) {
                        iM3169 = C0773.m3169("֫۠") ^ i4;
                        i = ((iM3169 ^ i3) * (-101)) ^ 1337451824;
                        i2 = 356540683;
                    } else {
                        iM3169 = C0619.m2761("᩵ۨ") ^ i3;
                        i = ((iM3169 ^ i4) * (-11789)) ^ (-1819838338);
                        i2 = 1518457394;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1227110837:
                case 14966507:
                    if (iM13536 == (C0619.m2761(C0269.m1785(sArr2, i12, i13, i11)) ^ 2101743006)) {
                        iM3169 = (i3 - C0773.m3169("ۘᩴ")) * 27;
                        i = ((iM3169 ^ i4) * 27427) ^ 986494298;
                        i2 = 1129098953;
                    } else {
                        iM3169 = C0773.m3169("ۖܰ") ^ i3;
                        i = ((iM3169 ^ i4) * 32481) ^ 1866579428;
                        i2 = -1465458767;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1217337531:
                case -159766998:
                    int i15 = i9 + i10;
                    if ((i15 + i15) - i8 >= 0) {
                        iM3169 = C0619.m2761("ᩳ۟") ^ i4;
                        i = ((iM3169 ^ i3) * (-32467)) ^ (-1445015940);
                        i2 = 1266274969;
                    } else {
                        iM3169 = C0773.m3169("ۢۖ") ^ i4;
                        i = ((iM3169 ^ i3) * 7437) ^ (-558039479);
                        i2 = 2063238051;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1196330562:
                case 1068040703:
                    if (C3690.m11987()) {
                        iM3169 = C0773.m3169("᩹᩻") ^ i4;
                        i = ((iM3169 ^ i3) * (-13057)) ^ (-578621314);
                        i2 = 467774831;
                    } else {
                        iM3169 = C0773.m3169("ܰۤ") ^ i4;
                        i = ((iM3169 ^ i3) * 8761) ^ (-416613154);
                        i2 = 67581468;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1022547489:
                case 419437424:
                    i11 = 1133;
                    iM3169 = C0619.m2761("ۧ֨") ^ i3;
                    i = ((iM3169 ^ i4) * (-11727)) ^ 428708464;
                    i2 = 1247258787;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -812505192:
                case -593574522:
                    C1826.m6301();
                    iM3169 = C0773.m3169("֫۠") ^ i4;
                    i = ((iM3169 ^ i3) * (-101)) ^ 1337451824;
                    i2 = 356540683;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -548946501:
                case 1046961209:
                    iM13536 = C4238.m13536(view);
                    sArr2 = f71168;
                    if (C2310.f7472 >= 0) {
                        iM3169 = (i4 - C0619.m2761("ܽ᩸")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM3169 ^ i3) * (-29767)) ^ (-1336426521);
                        i2 = -442049018;
                    } else {
                        iM3169 = (C0773.m3169("᩷ۧ") ^ i4) * 89;
                        i = ((iM3169 ^ i3) * 10169) ^ 804209947;
                        i2 = -2124394299;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -370769130:
                case 739421581:
                    i13 = 3;
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0773.m3169("᩹᩻") ^ i4;
                        i = ((iM3169 ^ i3) * (-13057)) ^ (-578621314);
                        i2 = 467774831;
                    } else {
                        iM3169 = C0619.m2761("ۜ᩵") ^ i4;
                        i = ((iM3169 ^ i3) * (-10003)) ^ 1209822786;
                        i2 = 1051519192;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -238328561:
                case 1979915023:
                    i12 = 1;
                    if (C2834.m9344() >= 0) {
                        iM3169 = C0773.m3169("᩹᩻") ^ i4;
                        i = ((iM3169 ^ i3) * (-13057)) ^ (-578621314);
                        i2 = 467774831;
                    } else {
                        iM3169 = C0773.m3169("ܺ۬") ^ i3;
                        i = ((iM3169 ^ i4) * 29675) ^ 1771137456;
                        i2 = 2096540509;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -225599971:
                case 1830609423:
                    i11 = 22620;
                    iM3169 = C0619.m2761("ۧ֨") ^ i3;
                    i = ((iM3169 ^ i4) * (-11727)) ^ 428708464;
                    i2 = 1247258787;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 489018903:
                case 1447249346:
                    i7 = s + s2;
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0773.m3169("᩹᩻") ^ i4;
                        i = ((iM3169 ^ i3) * (-13057)) ^ (-578621314);
                        i2 = 467774831;
                    } else {
                        iM3169 = (C0619.m2761("ۗܰ") + i3) * 83;
                        i = ((iM3169 ^ i4) * 8691) ^ (-1596460313);
                        i2 = -987462167;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1318215587:
                case 1722161980:
                    i10 = 281904100;
                    if (C2878.m9491() <= 0) {
                        iM3169 = C0619.m2761("᩵ۨ") ^ i3;
                        i = ((iM3169 ^ i4) * (-11789)) ^ (-1819838338);
                        i2 = 1518457394;
                    } else {
                        iM3169 = (C0619.m2761("ܽۗ") + i3) * (-111);
                        i = ((iM3169 ^ i4) * 11943) ^ (-1712427056);
                        i2 = -366805786;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1554056075:
                case 2000375573:
                    c = 0;
                    if (C0862.f3233 != 0) {
                        iM3169 = C0619.m2761("᩵ۨ") ^ i3;
                        i = ((iM3169 ^ i4) * (-11789)) ^ (-1819838338);
                        i2 = 1518457394;
                    } else {
                        iM3169 = (C0773.m3169("ۘۡ") + i4) * (-17);
                        i = ((iM3169 ^ i3) * (-15425)) ^ 1034174406;
                        i2 = -1873327464;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1809872159:
                case 2141900965:
                    s = sArr[c];
                    s2 = 16790;
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0619.m2761("᩵ۨ") ^ i3;
                        i = ((iM3169 ^ i4) * (-11789)) ^ (-1819838338);
                        i2 = 1518457394;
                    } else {
                        iM3169 = (C0619.m2761("ۤ᩷") ^ i3) * 45;
                        i = ((iM3169 ^ i4) * (-17059)) ^ (-1115163619);
                        i2 = 788452853;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (AbstractC0641.f2496 < 0) {
                        iM3169 = C0773.m3169("֫۠") ^ i4;
                        i = ((iM3169 ^ i3) * (-101)) ^ 1337451824;
                        i2 = 356540683;
                    } else {
                        iM3169 = C0773.m3169("ۨۖ") ^ i3;
                        i = ((iM3169 ^ i4) * (-15253)) ^ 1180219327;
                        i2 = 63858063;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0066  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ed A[PHI: r13
      0x00ed: PHI (r13v4 int) = (r13v3 int), (r13v2 int) binds: [B:30:0x00eb, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01eb A[PHI: r1 r5 r6 r11 r12
      0x01eb: PHI (r1v4 int) = (r1v2 int), (r1v3 int), (r1v2 int) binds: [B:56:0x01e9, B:38:0x013d, B:34:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x01eb: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:56:0x01e9, B:38:0x013d, B:34:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x01eb: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:56:0x01e9, B:38:0x013d, B:34:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x01eb: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:56:0x01e9, B:38:0x013d, B:34:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x01eb: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v4 int) binds: [B:56:0x01e9, B:38:0x013d, B:34:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x021c A[PHI: r4
      0x021c: PHI (r4v4 char) = (r4v3 char), (r4v2 char) binds: [B:60:0x021a, B:7:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0269 A[PHI: r2 r7 r8 r9 r18
      0x0269: PHI (r2v4 int) = (r2v2 int), (r2v2 int), (r2v2 int), (r2v2 int), (r2v3 int), (r2v2 int), (r2v2 int), (r2v2 int) binds: [B:68:0x0267, B:64:0x024b, B:52:0x01c8, B:48:0x01a7, B:26:0x00cd, B:16:0x007e, B:13:0x0062, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0269: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:68:0x0267, B:64:0x024b, B:52:0x01c8, B:48:0x01a7, B:26:0x00cd, B:16:0x007e, B:13:0x0062, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0269: PHI (r8v4 short) = (r8v2 short), (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:68:0x0267, B:64:0x024b, B:52:0x01c8, B:48:0x01a7, B:26:0x00cd, B:16:0x007e, B:13:0x0062, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0269: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:68:0x0267, B:64:0x024b, B:52:0x01c8, B:48:0x01a7, B:26:0x00cd, B:16:0x007e, B:13:0x0062, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0269: PHI (r18v5 short[]) = 
      (r18v3 short[])
      (r18v4 short[])
      (r18v3 short[])
      (r18v3 short[])
      (r18v3 short[])
      (r18v3 short[])
      (r18v3 short[])
      (r18v3 short[])
     binds: [B:68:0x0267, B:64:0x024b, B:52:0x01c8, B:48:0x01a7, B:26:0x00cd, B:16:0x007e, B:13:0x0062, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.C22248, l.InterfaceC6656
    public final void onDrawerOpened(View view) {
        int iM3169;
        int i;
        int i2;
        int i3 = C0773.f2792;
        int i4 = C4282.f15546;
        int iM2761 = (C0619.m2761("֫ۗ") ^ i3) * (-107);
        int i5 = ((iM2761 ^ i4) * 23397) ^ 1161668587;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2761 ^ 1826319327;
        int iM13536 = 0;
        int iM2762 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        short s3 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 967751516;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * (-24251)) >> 31));
            switch (i12) {
                case -2122066063:
                case -241014716:
                    c = 4;
                    if (C2966.f9654 >= 0) {
                        iM3169 = (i3 - C0619.m2761("ܺ۟")) * (-115);
                        i = ((iM3169 ^ i4) * (-20983)) ^ (-342382817);
                        i2 = -1362534343;
                    } else {
                        iM3169 = C0619.m2761("ܶ᩹") ^ i3;
                        i = ((iM3169 ^ i4) * (-20343)) ^ 952285588;
                        i2 = 1621823897;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2003473685:
                case -958428821:
                    i9 = 9748;
                    iM3169 = C0773.m3169("ۘ֫") ^ i3;
                    i = ((iM3169 ^ i4) * (-32185)) ^ 461992633;
                    i2 = 554656084;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1910963151:
                case 2068102486:
                    if (C1826.f6190 <= 0) {
                        iM3169 = (i4 - C0773.m3169("ۛ᩵")) * 37;
                        i = ((iM3169 ^ i3) * 19237) ^ (-186059098);
                        i2 = -1208558237;
                    } else {
                        iM3169 = (i4 - C0773.m3169("֡ۘ")) * (-103);
                        i = ((iM3169 ^ i3) * 30315) ^ (-2120880372);
                        i2 = -637214707;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1850842410:
                case 1822250298:
                    if (iM13536 == (2123212203 ^ iM2762)) {
                        iM3169 = (C0773.m3169("ۡܶ") ^ i3) * (-49);
                        i = ((iM3169 ^ i4) * (-15429)) ^ 1709452582;
                        i2 = -769740908;
                    } else {
                        iM3169 = (C0619.m2761("ۜᩴ") ^ i4) * (-99);
                        i = ((iM3169 ^ i3) * 20069) ^ (-12715678);
                        i2 = 1834459686;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1833492738:
                case -1791830003:
                    i8 = s + s3;
                    if (C4238.m13540() <= 0) {
                        iM3169 = (i4 - C0773.m3169("ۛ᩵")) * 37;
                        i = ((iM3169 ^ i3) * 19237) ^ (-186059098);
                        i2 = -1208558237;
                    } else {
                        iM3169 = (C0773.m3169("۠۠") + i3) * (-103);
                        i = ((iM3169 ^ i4) * (-4425)) ^ 1494258402;
                        i2 = -993945081;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1738279805:
                case 1777087938:
                    sArr = f71168;
                    if (C3779.f12953 <= 0) {
                        iM3169 = (i4 - C0773.m3169("ۛ᩵")) * 37;
                        i = ((iM3169 ^ i3) * 19237) ^ (-186059098);
                        i2 = -1208558237;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩸ۚ")) * (-97);
                        i = ((iM3169 ^ i4) * (-31683)) ^ (-882298135);
                        i2 = 313401192;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1674469781:
                case -1267943479:
                    if (C2310.f7472 < 0) {
                        iM3169 = (i4 - C0773.m3169("ۛ᩵")) * 37;
                        i = ((iM3169 ^ i3) * 19237) ^ (-186059098);
                        i2 = -1208558237;
                    } else {
                        iM3169 = (i4 - C0619.m2761("᩷ܶ")) * 123;
                        i = ((iM3169 ^ i3) * (-14881)) ^ 530837452;
                        i2 = -622349976;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1646232482:
                case 1402060846:
                    iM13536 = C4238.m13536(view);
                    sArr2 = f71168;
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0773.m3169("ۜܰ") ^ i4;
                        i = ((iM3169 ^ i3) * 25921) ^ (-2011527719);
                        i2 = 477685500;
                    } else {
                        iM3169 = C0773.m3169("ܿܰ") ^ i4;
                        i = ((iM3169 ^ i3) * 26785) ^ (-1457785116);
                        i2 = -974299704;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1352578245:
                case 771679437:
                    C2288.m7767();
                    if (C1343.f4799 == 0) {
                        iM3169 = (i4 - C0773.m3169("ۛ᩵")) * 37;
                        i = ((iM3169 ^ i3) * 19237) ^ (-186059098);
                        i2 = -1208558237;
                    } else {
                        iM3169 = C0773.m3169("۟ۙ") ^ i3;
                        i = ((iM3169 ^ i4) * (-17365)) ^ 1759872128;
                        i2 = -290505448;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1317521012:
                case 953909821:
                    if (C1519.f5300 < 0) {
                        iM3169 = (i4 - C0619.m2761("᩷ܶ")) * 123;
                        i = ((iM3169 ^ i3) * (-14881)) ^ 530837452;
                        i2 = -622349976;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܺ۟")) * (-115);
                        i = ((iM3169 ^ i4) * (-20983)) ^ (-342382817);
                        i2 = -1362534343;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1181767457:
                case 1445799981:
                    break;
                case -1176854981:
                case 1645652765:
                    iM2762 = C0619.m2761(RunnableC3646.m11809(sArr2, i10, i11, i9));
                    if (C11235.f35427 >= 0) {
                        iM3169 = (i4 - C0773.m3169("ۛ᩵")) * 37;
                        i = ((iM3169 ^ i3) * 19237) ^ (-186059098);
                        i2 = -1208558237;
                    } else {
                        iM3169 = (C0773.m3169("᩹᩸") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM3169 ^ i4) * 5335) ^ (-632007545);
                        i2 = -2063346270;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -650419100:
                case -58798460:
                    C3033.m9845();
                    break;
                case -574824848:
                case 1146768989:
                    super.onDrawerOpened(view);
                    iM3169 = (C0619.m2761("ۜᩴ") ^ i4) * (-99);
                    i = ((iM3169 ^ i3) * 20069) ^ (-12715678);
                    i2 = 1834459686;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -514980596:
                case 1506303845:
                    i10 = 5;
                    if (C2878.f9462) {
                        iM3169 = C0773.m3169("ۜܰ") ^ i4;
                        i = ((iM3169 ^ i3) * 25921) ^ (-2011527719);
                        i2 = 477685500;
                    } else {
                        iM3169 = (C0619.m2761("ᩳۗ") ^ i4) * (-119);
                        i = ((iM3169 ^ i3) * 19747) ^ (-1572289577);
                        i2 = -1074472336;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -399250898:
                case 1184174505:
                    i11 = 3;
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0773.m3169("۟ۙ") ^ i3;
                        i = ((iM3169 ^ i4) * (-17365)) ^ 1759872128;
                        i2 = -290505448;
                    } else {
                        iM3169 = C0619.m2761("ᩴۤ") ^ i3;
                        i = ((iM3169 ^ i4) * (-9845)) ^ (-531578526);
                        i2 = 277604676;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 196024979:
                case 1140365530:
                    C3998.m12920();
                    C2023.m6964();
                    iM3169 = (i4 - C0773.m3169("ۛ᩵")) * 37;
                    i = ((iM3169 ^ i3) * 19237) ^ (-186059098);
                    i2 = -1208558237;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 305500979:
                case 697135504:
                    s = sArr[c];
                    s2 = 15028;
                    if (C1783.f6087 <= 0) {
                        iM3169 = C0773.m3169("ۜܰ") ^ i4;
                        i = ((iM3169 ^ i3) * 25921) ^ (-2011527719);
                        i2 = 477685500;
                    } else {
                        iM3169 = (C0773.m3169("۠֫") ^ i4) * (-71);
                        i = ((iM3169 ^ i3) * (-19773)) ^ 1902851812;
                        i2 = -310264587;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 623208966:
                case 2120214440:
                    if (i7 - (i8 * i8) <= 0) {
                        iM3169 = C0619.m2761("ܿ᩹") ^ i3;
                        i = ((iM3169 ^ i4) * (-16547)) ^ (-1986919986);
                        i2 = -99882664;
                    } else {
                        iM3169 = (C0619.m2761("֫ܺ") + i4) * (-77);
                        i = ((iM3169 ^ i3) * 9959) ^ (-1528304828);
                        i2 = 2043948001;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 992936859:
                case 2114830314:
                    i7 = s * s2;
                    s3 = 3757;
                    if (C0619.f2439) {
                        iM3169 = (i4 - C0773.m3169("ۛ᩵")) * 37;
                        i = ((iM3169 ^ i3) * 19237) ^ (-186059098);
                        i2 = -1208558237;
                    } else {
                        iM3169 = (C0773.m3169("۬ۜ") + i4) * (-47);
                        i = ((iM3169 ^ i3) * (-22503)) ^ (-1126175185);
                        i2 = -789210216;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    i9 = 33611;
                    iM3169 = C0773.m3169("ۘ֫") ^ i3;
                    i = ((iM3169 ^ i4) * (-32185)) ^ 461992633;
                    i2 = 554656084;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }
}
