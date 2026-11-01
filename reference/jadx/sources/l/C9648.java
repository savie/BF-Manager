package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۢܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71K9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9648 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f32446;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7474 f32447;

    /* JADX WARN: Code duplicated, block: B:46:0x0112 A[PHI: r2
      0x0112: PHI (r2v5 java.util.concurrent.ExecutorService) = 
      (r2v4 java.util.concurrent.ExecutorService)
      (r2v3 java.util.concurrent.ExecutorService)
      (r2v3 java.util.concurrent.ExecutorService)
     binds: [B:45:0x0110, B:14:0x0046, B:8:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0144 A[PHI: r1 r4 r12
      0x0144: PHI (r1v7 int) = (r1v5 int), (r1v3 int), (r1v3 int) binds: [B:49:0x0142, B:41:0x00f1, B:8:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0144: PHI (r4v7 java.util.ArrayList) = (r4v3 java.util.ArrayList), (r4v4 java.util.ArrayList), (r4v3 java.util.ArrayList) binds: [B:49:0x0142, B:41:0x00f1, B:8:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0144: PHI (r12v6 l.۠᩻᩺) = (r12v1 l.۠᩻᩺), (r12v2 l.۠᩻᩺), (r12v1 l.۠᩻᩺) binds: [B:49:0x0142, B:41:0x00f1, B:8:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01b0 A[PHI: r11
      0x01b0: PHI (r11v9 l.۠᩺ۡ) = (r11v5 l.۠᩺ۡ), (r11v6 l.۠᩺ۡ), (r11v5 l.۠᩺ۡ), (r11v5 l.۠᩺ۡ), (r11v5 l.۠᩺ۡ) binds: [B:60:0x01ae, B:56:0x0194, B:16:0x004a, B:14:0x0046, B:11:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8485 m24543(final C4335 c4335) {
        int iM45029;
        int i;
        int i2 = 0;
        ExecutorService executorServiceNewFixedThreadPool = null;
        ArrayList arrayList = null;
        Iterator itM10563 = null;
        int i3 = -598924420;
        int i4 = C2249.f8050;
        int i5 = C2871.f10837;
        int iM11306 = (ThreadFactoryC3888.m11306("ۡ۟") + i5) * (-83);
        int i6 = ((iM11306 ^ i4) * (-3967)) ^ 204415084;
        int i7 = 628278409;
        while (true) {
            int i8 = iM11306 ^ i7;
            final C8485 c8485 = null;
            while (true) {
                final C8516 c8516 = null;
                while (true) {
                    i3 = ((((i3 ^ i4) * (-17259)) >> 31) & i6) ^ i8;
                    switch (i3) {
                        case -2104087469:
                        case -957215019:
                            C1025.m3853(c8516, new C12470(c4335));
                            itM10563 = C3577.m10563(arrayList);
                            iM45029 = C19806.m45029("ۜۛ") ^ i5;
                            i6 = ((iM45029 ^ i4) * (-16393)) ^ (-1183559318);
                            i = 649585338;
                            i8 = iM45029 ^ i;
                            break;
                        case -1921510153:
                        case -669286590:
                            C1398.m4895();
                            iM45029 = ThreadFactoryC3888.m11306("ۜܽ") ^ i5;
                            i6 = ((iM45029 ^ i4) * (-22847)) ^ 258680479;
                            i = -813709635;
                            i8 = iM45029 ^ i;
                            break;
                        case -1861114059:
                        case 1911136573:
                            ExecutorService executorService = C4716.f16632;
                            i2 = C5464.f18831;
                            if (ThreadFactoryC3888.m11300() <= 0) {
                                iM45029 = (ThreadFactoryC3888.m11306("֫֨") + i5) * (-115);
                                i6 = ((iM45029 ^ i4) * (-4649)) ^ (-1763923326);
                                i = -2128464939;
                            } else {
                                iM45029 = (ThreadFactoryC3888.m11306("ۗ᩺") + i4) * (-41);
                                i6 = ((iM45029 ^ i5) * 16143) ^ 444049987;
                                i = -1718865664;
                            }
                            i8 = iM45029 ^ i;
                            break;
                        case -1807275191:
                        case 1067178151:
                            if (C0962.m3748(itM10563)) {
                                iM45029 = C19806.m45029("ᩳۡ") ^ i4;
                                i6 = ((iM45029 ^ i5) * 23937) ^ 1965867781;
                                i = -1641629252;
                            } else {
                                iM45029 = (C19806.m45029("۫᩺") + i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                i6 = ((iM45029 ^ i4) * (-21481)) ^ 257520718;
                                i = 1983461852;
                            }
                            i8 = iM45029 ^ i;
                            break;
                        case -1233259714:
                        case 159207699:
                            executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(i2);
                            if (C1668.m5583()) {
                                iM45029 = ThreadFactoryC3888.m11306("ۗۜ") ^ i5;
                                i6 = ((iM45029 ^ i4) * 10171) ^ (-306366644);
                                i = 1780761872;
                            } else {
                                iM45029 = ThreadFactoryC3888.m11306("ᩳۢ") ^ i4;
                                i6 = ((iM45029 ^ i5) * 16773) ^ 1722840169;
                                i = 410719458;
                            }
                            i8 = iM45029 ^ i;
                            break;
                        case -1227772748:
                        case 485753216:
                            if (!C0629.m2907()) {
                            }
                            iM45029 = ThreadFactoryC3888.m11306("ۜܽ") ^ i5;
                            i6 = ((iM45029 ^ i4) * (-22847)) ^ 258680479;
                            i = -813709635;
                            i8 = iM45029 ^ i;
                            break;
                        case -1132114507:
                        case 1916428913:
                            C4716.m13052(executorServiceNewFixedThreadPool);
                            return c8485;
                        case -657158791:
                        case 457771863:
                            if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            }
                            arrayList = this.f32446;
                            int iM938 = C0050.m938(arrayList);
                            if (!C2332.f8260) {
                            }
                            long j = iM938;
                            if (C3535.m10431() > 0) {
                                c8516 = new C8516(j);
                                if (C0797.f3386) {
                                    iM45029 = (ThreadFactoryC3888.m11306("֫֨") + i5) * (-115);
                                    i6 = ((iM45029 ^ i4) * (-4649)) ^ (-1763923326);
                                    i = -2128464939;
                                } else {
                                    iM45029 = ThreadFactoryC3888.m11306("ܶ۬") ^ i4;
                                    i6 = ((iM45029 ^ i5) * 3305) ^ 1883279899;
                                    i = 1123392330;
                                }
                                i8 = iM45029 ^ i;
                            }
                            break;
                            break;
                            break;
                            break;
                        case -560965013:
                        case 231717898:
                            if (C2477.m7593() >= 0) {
                                iM45029 = ThreadFactoryC3888.m11306("ۜܽ") ^ i5;
                                i6 = ((iM45029 ^ i4) * (-22847)) ^ 258680479;
                                i = -813709635;
                            } else {
                                iM45029 = (i4 - C19806.m45029("۟֡")) * (-53);
                                i6 = ((iM45029 ^ i5) * 4609) ^ 228424185;
                                i = 461846845;
                            }
                            i8 = iM45029 ^ i;
                            break;
                        case 209669247:
                        case 1638053160:
                            ViewGroupOnHierarchyChangeListenerC1916.m6233();
                            if (C1189.m4368() > 0) {
                                iM45029 = ThreadFactoryC3888.m11306("ۜܽ") ^ i5;
                                i6 = ((iM45029 ^ i4) * (-22847)) ^ 258680479;
                                i = -813709635;
                            } else {
                                iM45029 = ThreadFactoryC3888.m11306("ᩳۢ") ^ i4;
                                i6 = ((iM45029 ^ i5) * 16773) ^ 1722840169;
                                i = 410719458;
                            }
                            i8 = iM45029 ^ i;
                            break;
                        case 254856397:
                        case 2106527696:
                            C1460.m5050();
                            return null;
                        case 498629045:
                        case 1581699613:
                            final InterfaceC22762 interfaceC22762 = (InterfaceC22762) C0278.m1776(itM10563);
                            if (C2477.f9839 > 0) {
                                executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: l.֫ܳۨ
                                    {
                                        int i9 = 2025822673;
                                        int i10 = C1148.f5161;
                                        int i11 = RunnableC0195.f1321;
                                        int iM11307 = (ThreadFactoryC3888.m11306("ۖܰ") ^ i10) * (-11);
                                        int i12 = ((iM11307 ^ i11) * 13467) ^ 1108039656;
                                        int i13 = 1933958718;
                                        while (true) {
                                            i9 = ((((i9 ^ i11) * (-28871)) >> 31) & i12) ^ (iM11307 ^ i13);
                                            switch (i9) {
                                                case -1969373368:
                                                case -162121811:
                                                    if (C3286.f12186) {
                                                        iM11307 = C19806.m45029("ۙۨ") ^ i10;
                                                        i12 = ((iM11307 ^ i11) * 5441) ^ 218273072;
                                                        i13 = 1454865012;
                                                    } else {
                                                        iM11307 = C19806.m45029("ܶۜ") ^ i10;
                                                        i12 = ((iM11307 ^ i11) * (-2301)) ^ (-87367992);
                                                        i13 = -983931500;
                                                    }
                                                    break;
                                                case -1625675999:
                                                case 1635525974:
                                                    if (C0817.m3399()) {
                                                        iM11307 = (C19806.m45029("۠ܺ") + i10) * (-113);
                                                        i12 = ((iM11307 ^ i11) * (-2861)) ^ (-802073158);
                                                        i13 = -135866572;
                                                    } else {
                                                        iM11307 = C19806.m45029("ۙۨ") ^ i10;
                                                        i12 = ((iM11307 ^ i11) * 5441) ^ 218273072;
                                                        i13 = 1454865012;
                                                    }
                                                    break;
                                                case -1486947718:
                                                case -1398675742:
                                                    if (C1025.f4800 >= 0) {
                                                        iM11307 = ThreadFactoryC3888.m11306("۫ᩴ") ^ i10;
                                                        i12 = ((iM11307 ^ i11) * 7765) ^ 1607276220;
                                                        i13 = -1358159970;
                                                    } else {
                                                        iM11307 = (ThreadFactoryC3888.m11306("ܶܳ") ^ i10) * (-29);
                                                        i12 = ((iM11307 ^ i11) * (-8793)) ^ (-1109181833);
                                                        i13 = -247885129;
                                                    }
                                                    break;
                                                case -1404295256:
                                                case -516544362:
                                                    if (C1937.m6279() >= 0) {
                                                        iM11307 = (ThreadFactoryC3888.m11306("᩹ۛ") ^ i11) * 3;
                                                        i12 = ((iM11307 ^ i10) * (-21667)) ^ (-1536533475);
                                                        i13 = -1771056226;
                                                    } else {
                                                        iM11307 = C19806.m45029("ۘۖ") ^ i10;
                                                        i12 = ((iM11307 ^ i11) * (-7387)) ^ 1186777897;
                                                        i13 = -992697879;
                                                    }
                                                    break;
                                                case -1168469196:
                                                case 2112559853:
                                                    C3660.m10791();
                                                    C1377.m4833();
                                                    throw new RuntimeException();
                                                case -1159078379:
                                                case -1149900885:
                                                    if (C1668.f6641 >= 0) {
                                                        iM11307 = (i11 - ThreadFactoryC3888.m11306("᩹ۖ")) * (-91);
                                                        i12 = ((iM11307 ^ i10) * 5029) ^ (-234223429);
                                                        i13 = -205512164;
                                                    } else {
                                                        iM11307 = ThreadFactoryC3888.m11306("ۗᩳ") ^ i11;
                                                        i12 = ((iM11307 ^ i10) * 19975) ^ 1958065990;
                                                        i13 = 1122177209;
                                                    }
                                                    break;
                                                case -1150867728:
                                                case -1102073749:
                                                    if (C1460.f5948 >= 0) {
                                                        iM11307 = (i11 - ThreadFactoryC3888.m11306("᩹ۖ")) * (-91);
                                                        i12 = ((iM11307 ^ i10) * 5029) ^ (-234223429);
                                                        i13 = -205512164;
                                                    } else {
                                                        iM11307 = (C19806.m45029("۫ۚ") ^ i11) * (-79);
                                                        i12 = ((iM11307 ^ i10) * (-9129)) ^ (-60110431);
                                                        i13 = 1854612900;
                                                    }
                                                    break;
                                                case -1022164478:
                                                case 725337740:
                                                    if (!C2704.f10408) {
                                                        iM11307 = (ThreadFactoryC3888.m11306("᩹ۛ") ^ i11) * 3;
                                                        i12 = ((iM11307 ^ i10) * (-21667)) ^ (-1536533475);
                                                        i13 = -1771056226;
                                                    } else {
                                                        iM11307 = C19806.m45029("ۙۨ") ^ i10;
                                                        i12 = ((iM11307 ^ i11) * 5441) ^ 218273072;
                                                        i13 = 1454865012;
                                                    }
                                                    break;
                                                case -770236459:
                                                case 1452580475:
                                                    if (C2788.f10625 >= 0) {
                                                        iM11307 = (i11 - ThreadFactoryC3888.m11306("᩹ۖ")) * (-91);
                                                        i12 = ((iM11307 ^ i10) * 5029) ^ (-234223429);
                                                        i13 = -205512164;
                                                    } else {
                                                        iM11307 = ThreadFactoryC3888.m11306("ܰۘ") ^ i11;
                                                        i12 = ((iM11307 ^ i10) * (-16235)) ^ (-1477965100);
                                                        i13 = 76269953;
                                                    }
                                                    break;
                                                case -267588321:
                                                case 798863089:
                                                    if (C2332.f8260) {
                                                        iM11307 = ThreadFactoryC3888.m11306("ۗ֨") ^ i11;
                                                        i12 = ((iM11307 ^ i10) * (-29915)) ^ (-383020082);
                                                        i13 = -1029100876;
                                                    } else {
                                                        iM11307 = (i11 - ThreadFactoryC3888.m11306("᩹ۖ")) * (-91);
                                                        i12 = ((iM11307 ^ i10) * 5029) ^ (-234223429);
                                                        i13 = -205512164;
                                                    }
                                                    break;
                                                case -238669467:
                                                case 2040157305:
                                                    if (C0671.f2816 != 0) {
                                                        iM11307 = C19806.m45029("ۙۨ") ^ i10;
                                                        i12 = ((iM11307 ^ i11) * 5441) ^ 218273072;
                                                        i13 = 1454865012;
                                                    } else {
                                                        iM11307 = (C19806.m45029("ۖ۫") + i11) * 49;
                                                        i12 = ((iM11307 ^ i10) * (-3883)) ^ 142708457;
                                                        i13 = 788018099;
                                                    }
                                                    break;
                                                case 216937172:
                                                case 533379064:
                                                    return;
                                                case 651935561:
                                                case 1928321819:
                                                    if (C0817.m3399()) {
                                                        iM11307 = (C19806.m45029("ۢܳ") ^ i10) * 119;
                                                        i12 = ((iM11307 ^ i11) * (-6611)) ^ 1388299760;
                                                        i13 = -1440277897;
                                                    } else {
                                                        iM11307 = (ThreadFactoryC3888.m11306("᩶ᩴ") ^ i11) * 45;
                                                        i12 = ((iM11307 ^ i10) * 20181) ^ 1678488680;
                                                        i13 = -410835163;
                                                    }
                                                    break;
                                                case 688192700:
                                                case 2123450327:
                                                    if (C0278.f1572 <= 0) {
                                                        iM11307 = ThreadFactoryC3888.m11306("۫ᩴ") ^ i10;
                                                        i12 = ((iM11307 ^ i11) * 7765) ^ 1607276220;
                                                        i13 = -1358159970;
                                                    } else {
                                                        iM11307 = (ThreadFactoryC3888.m11306("᩹ۛ") ^ i11) * 3;
                                                        i12 = ((iM11307 ^ i10) * (-21667)) ^ (-1536533475);
                                                        i13 = -1771056226;
                                                    }
                                                    break;
                                                case 937613298:
                                                case 1907435396:
                                                    C2704.m8255();
                                                    if (!C1977.m6356()) {
                                                        iM11307 = (ThreadFactoryC3888.m11306("᩹ۛ") ^ i11) * 3;
                                                        i12 = ((iM11307 ^ i10) * (-21667)) ^ (-1536533475);
                                                        i13 = -1771056226;
                                                    } else {
                                                        iM11307 = (ThreadFactoryC3888.m11306("᩶ᩴ") ^ i11) * 45;
                                                        i12 = ((iM11307 ^ i10) * 20181) ^ 1678488680;
                                                        i13 = -410835163;
                                                    }
                                                    break;
                                                default:
                                                    C7105.m18985();
                                                    C3660.m10791();
                                                    iM11307 = (ThreadFactoryC3888.m11306("᩹ۛ") ^ i11) * 3;
                                                    i12 = ((iM11307 ^ i10) * (-21667)) ^ (-1536533475);
                                                    i13 = -1771056226;
                                                    break;
                                            }
                                        }
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C4335 c4336 = null;
                                        int i9 = 0;
                                        C8516 c8517 = null;
                                        int i10 = 1755295312;
                                        int i11 = C2477.f9839;
                                        int i12 = C2871.f10837;
                                        int iM11307 = (ThreadFactoryC3888.m11306("۟ܶ") + i11) * (-61);
                                        int i13 = ((iM11307 ^ i12) * (-2919)) ^ (-406730727);
                                        int i14 = -98546424;
                                        while (true) {
                                            i10 = ((((i10 ^ i12) * 11981) >> 31) & i13) ^ (iM11307 ^ i14);
                                            switch (i10) {
                                                case -2041761871:
                                                case -846308717:
                                                    C0050.m946();
                                                    if (!C0526.f2219) {
                                                        iM11307 = ThreadFactoryC3888.m11306("᩶ܿ") ^ i12;
                                                        i13 = ((iM11307 ^ i11) * (-17659)) ^ 1005597107;
                                                        i14 = 7252584;
                                                    } else {
                                                        iM11307 = C19806.m45029("ܰ᩺") ^ i11;
                                                        i13 = ((iM11307 ^ i12) * 1263) ^ (-1325481841);
                                                        i14 = 974564066;
                                                    }
                                                    break;
                                                case -1937650458:
                                                case -1649336617:
                                                    i9 = 1;
                                                    c8517 = c8516;
                                                    if (C1461.f5957 <= 0) {
                                                        iM11307 = ThreadFactoryC3888.m11306("ᩳܽ") ^ i12;
                                                        i13 = ((iM11307 ^ i11) * 12759) ^ (-905304485);
                                                        i14 = -967530034;
                                                    } else {
                                                        iM11307 = ThreadFactoryC3888.m11306("ۚۙ") ^ i11;
                                                        i13 = ((iM11307 ^ i12) * (-32163)) ^ (-1383850641);
                                                        i14 = -602860012;
                                                    }
                                                    break;
                                                case -1909947889:
                                                case -386793122:
                                                    C10634.m26820();
                                                    C1025.m3861();
                                                    iM11307 = ThreadFactoryC3888.m11306("᩶ܿ") ^ i12;
                                                    i13 = ((iM11307 ^ i11) * (-17659)) ^ 1005597107;
                                                    i14 = 7252584;
                                                    break;
                                                case -1880939526:
                                                case 651698819:
                                                    if (C0050.m946() <= 0) {
                                                        iM11307 = C19806.m45029("ܰ᩺") ^ i11;
                                                        i13 = ((iM11307 ^ i12) * 1263) ^ (-1325481841);
                                                        i14 = 974564066;
                                                    } else {
                                                        iM11307 = ThreadFactoryC3888.m11306("ᩴۢ") ^ i11;
                                                        i13 = ((iM11307 ^ i12) * (-29299)) ^ (-1532403866);
                                                        i14 = -2009434528;
                                                    }
                                                    break;
                                                case -1407542005:
                                                case 599678682:
                                                    c8485.m22160(interfaceC22762);
                                                    iM11307 = ThreadFactoryC3888.m11306("ܰ۠") ^ i12;
                                                    i13 = ((iM11307 ^ i11) * (-23923)) ^ (-620141270);
                                                    i14 = -646047506;
                                                    break;
                                                case -1407136827:
                                                case 1576818787:
                                                    RunnableC3388.m10055(c8517, i9);
                                                    if (C1189.f5284 <= 0) {
                                                        iM11307 = ThreadFactoryC3888.m11306("۫۬") ^ i12;
                                                        i13 = ((iM11307 ^ i11) * (-26397)) ^ (-1276153717);
                                                        i14 = 2139002238;
                                                    } else {
                                                        iM11307 = (C19806.m45029("ۢۤ") + i12) * (-13);
                                                        i13 = ((iM11307 ^ i11) * (-21793)) ^ 170329549;
                                                        i14 = 1171866241;
                                                    }
                                                    break;
                                                case -1298300051:
                                                case -7525815:
                                                    C2124.m6673();
                                                    break;
                                                case -1103319769:
                                                case 566245973:
                                                    c4336 = c4335;
                                                    if (C0671.m3008() >= 0) {
                                                        iM11307 = ThreadFactoryC3888.m11306("۫۬") ^ i12;
                                                        i13 = ((iM11307 ^ i11) * (-26397)) ^ (-1276153717);
                                                        i14 = 2139002238;
                                                    } else {
                                                        iM11307 = ThreadFactoryC3888.m11306("᩻ۡ") ^ i12;
                                                        i13 = ((iM11307 ^ i11) * 8819) ^ (-290181163);
                                                        i14 = 1024461488;
                                                    }
                                                    break;
                                                case -1098867118:
                                                case 1804529618:
                                                    break;
                                                case -697558272:
                                                case -613809777:
                                                    if (C3722.f13525 <= 0) {
                                                        iM11307 = (i11 - C19806.m45029("᩹᩹")) * (-89);
                                                        i13 = ((iM11307 ^ i12) * (-31969)) ^ (-2089174909);
                                                        i14 = -387377092;
                                                    } else {
                                                        iM11307 = ThreadFactoryC3888.m11306("ܰ᩻") ^ i11;
                                                        i13 = ((iM11307 ^ i12) * 26863) ^ (-187442562);
                                                        i14 = 1144722661;
                                                    }
                                                    break;
                                                case -133674400:
                                                case 1454090778:
                                                    if (C1377.f5749) {
                                                        iM11307 = C19806.m45029("ܰ֨") ^ i11;
                                                        i13 = ((iM11307 ^ i12) * (-19423)) ^ (-1667997159);
                                                        i14 = 1481637403;
                                                    } else {
                                                        iM11307 = C19806.m45029("ܰ᩺") ^ i11;
                                                        i13 = ((iM11307 ^ i12) * 1263) ^ (-1325481841);
                                                        i14 = 974564066;
                                                    }
                                                    break;
                                                case 42982219:
                                                case 1957134440:
                                                    if (!C3286.f12186) {
                                                        iM11307 = (i11 - C19806.m45029("᩹᩹")) * (-89);
                                                        i13 = ((iM11307 ^ i12) * (-31969)) ^ (-2089174909);
                                                        i14 = -387377092;
                                                    } else {
                                                        iM11307 = ThreadFactoryC3888.m11306("᩶ܿ") ^ i12;
                                                        i13 = ((iM11307 ^ i11) * (-17659)) ^ 1005597107;
                                                        i14 = 7252584;
                                                    }
                                                    break;
                                                case 538484113:
                                                case 1244091718:
                                                    if (C1419.f5860 < 0) {
                                                        iM11307 = ThreadFactoryC3888.m11306("ᩳܽ") ^ i12;
                                                        i13 = ((iM11307 ^ i11) * 12759) ^ (-905304485);
                                                        i14 = -967530034;
                                                    } else {
                                                        iM11307 = ThreadFactoryC3888.m11306("᩶ܿ") ^ i12;
                                                        i13 = ((iM11307 ^ i11) * (-17659)) ^ 1005597107;
                                                        i14 = 7252584;
                                                    }
                                                    break;
                                                case 679353485:
                                                case 861029838:
                                                    if (C1419.f5860 >= 0) {
                                                        iM11307 = ThreadFactoryC3888.m11306("ᩳܽ") ^ i12;
                                                        i13 = ((iM11307 ^ i11) * 12759) ^ (-905304485);
                                                        i14 = -967530034;
                                                    } else {
                                                        iM11307 = (C19806.m45029("᩵ܿ") + i12) * (-67);
                                                        i13 = ((iM11307 ^ i11) * (-7067)) ^ (-1159966135);
                                                        i14 = 125631264;
                                                    }
                                                    break;
                                                case 758014910:
                                                case 1410036679:
                                                    if (RunnableC0195.f1321 >= 0) {
                                                        iM11307 = ThreadFactoryC3888.m11306("۫۬") ^ i12;
                                                        i13 = ((iM11307 ^ i11) * (-26397)) ^ (-1276153717);
                                                        i14 = 2139002238;
                                                    } else {
                                                        iM11307 = (i11 - ThreadFactoryC3888.m11306("۫֨")) * 57;
                                                        i13 = ((iM11307 ^ i12) * (-28291)) ^ 559543478;
                                                        i14 = -674672599;
                                                    }
                                                    break;
                                                case 762370208:
                                                case 1845568871:
                                                    if (C3286.f12186) {
                                                        iM11307 = ThreadFactoryC3888.m11306("۫۬") ^ i12;
                                                        i13 = ((iM11307 ^ i11) * (-26397)) ^ (-1276153717);
                                                        i14 = 2139002238;
                                                    } else {
                                                        iM11307 = (C19806.m45029("ۖۛ") + i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                        i13 = ((iM11307 ^ i11) * 8647) ^ 498885312;
                                                        i14 = -477423285;
                                                    }
                                                    break;
                                                case 873130816:
                                                case 1539055737:
                                                    if (ViewTreeObserverOnPreDrawListenerC3327.m9866(c4336)) {
                                                        iM11307 = ThreadFactoryC3888.m11306("ܰ۠") ^ i12;
                                                        i13 = ((iM11307 ^ i11) * (-23923)) ^ (-620141270);
                                                        i14 = -646047506;
                                                    } else {
                                                        iM11307 = (i11 - ThreadFactoryC3888.m11306("᩹ᩳ")) * 39;
                                                        i13 = ((iM11307 ^ i12) * 29791) ^ 44271217;
                                                        i14 = -1958338661;
                                                    }
                                                    break;
                                                default:
                                                    if (C2332.f8260) {
                                                        iM11307 = ThreadFactoryC3888.m11306("ۢۧ") ^ i12;
                                                        i13 = ((iM11307 ^ i11) * 3997) ^ (-963374492);
                                                        i14 = 1687999945;
                                                    } else {
                                                        iM11307 = ThreadFactoryC3888.m11306("۫۬") ^ i12;
                                                        i13 = ((iM11307 ^ i11) * (-26397)) ^ (-1276153717);
                                                        i14 = 2139002238;
                                                    }
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                });
                                iM45029 = C19806.m45029("ۜۛ") ^ i5;
                                i6 = ((iM45029 ^ i4) * (-16393)) ^ (-1183559318);
                                i = 649585338;
                                i8 = iM45029 ^ i;
                            }
                            break;
                        case 807034546:
                        case 1981844552:
                            if (C2788.m8472() == 0) {
                                c8485 = new C8485(this.f32447);
                                if (C3535.m10431() <= 0) {
                                    iM45029 = ThreadFactoryC3888.m11306("ۜܽ") ^ i5;
                                    i6 = ((iM45029 ^ i4) * (-22847)) ^ 258680479;
                                    i = -813709635;
                                } else {
                                    iM45029 = ThreadFactoryC3888.m11306("ܳ᩵") ^ i5;
                                    i6 = ((iM45029 ^ i4) * 29195) ^ 1437725891;
                                    i = 601967643;
                                }
                                i8 = iM45029 ^ i;
                            }
                            break;
                        default:
                            C3743.m10966();
                            if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                                iM45029 = ThreadFactoryC3888.m11306("ᩳۢ") ^ i4;
                                i6 = ((iM45029 ^ i5) * 16773) ^ 1722840169;
                                i = 410719458;
                            } else {
                                iM45029 = (ThreadFactoryC3888.m11306("֫֨") + i5) * (-115);
                                i6 = ((iM45029 ^ i4) * (-4649)) ^ (-1763923326);
                                i = -2128464939;
                            }
                            i8 = iM45029 ^ i;
                            break;
                    }
                }
                int iM450210 = C19806.m45029("ۡۛ") ^ i4;
                i6 = ((iM450210 ^ i5) * 14765) ^ 997841825;
                i8 = iM450210 ^ (-611605588);
            }
            iM11306 = C19806.m45029("ᩴۚ") ^ i4;
            i6 = ((iM11306 ^ i5) * 21617) ^ (-1800997278);
            i7 = -870373386;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8485 m24542() {
        int iM11306;
        int i;
        ExecutorService executorServiceNewFixedThreadPool = null;
        Iterator itM9863 = null;
        final InterfaceC22762 interfaceC22762 = null;
        int i2 = -833326889;
        int i3 = C0278.f1572;
        int i4 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM11307 = (ThreadFactoryC3888.m11306("᩵᩷") ^ i4) * 91;
        int i5 = ((iM11307 ^ i3) * (-17499)) ^ (-404814185);
        int i6 = -1001546669;
        while (true) {
            int i7 = iM11307 ^ i6;
            final C8485 c8485 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-22423)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2095713956:
                    case 2093817539:
                        C3535.m10431();
                        if (C2249.f8050 >= 0) {
                            iM11307 = C19806.m45029("ܿ᩸") ^ i3;
                            i5 = ((iM11307 ^ i4) * (-18401)) ^ 549589611;
                            i6 = 2055218644;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ܳ֫") ^ i4;
                        i5 = ((iM11306 ^ i3) * 8191) ^ 199819305;
                        i = 1018389729;
                        i7 = iM11306 ^ i;
                        break;
                    case -2067620985:
                    case -1218528693:
                        C1937.m6279();
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩵") ^ i3;
                        i5 = ((iM11306 ^ i4) * 28091) ^ 989675040;
                        i = 93414283;
                        i7 = iM11306 ^ i;
                        break;
                    case -1841877589:
                    case 539282326:
                        itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(this.f32446);
                        iM11306 = ThreadFactoryC3888.m11306("᩹᩻") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-24981)) ^ (-819519534);
                        i = 1136731618;
                        i7 = iM11306 ^ i;
                        break;
                    case -1457806474:
                    case -168424491:
                        if (C7105.m18985()) {
                            iM11306 = ThreadFactoryC3888.m11306("ܳ֫") ^ i4;
                            i5 = ((iM11306 ^ i3) * 8191) ^ 199819305;
                            i = 1018389729;
                        } else {
                            executorServiceNewFixedThreadPool.submit(new Callable() { // from class: l.ܳܳۨ
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return c8485.m22160(interfaceC22762);
                                }

                                {
                                    int i8 = 945140653;
                                    int i9 = RunnableC0195.f1321;
                                    int i10 = C2477.f9839;
                                    int iM45029 = C19806.m45029("֡֫") ^ i9;
                                    int i11 = ((iM45029 ^ i10) * 30159) ^ (-2123531661);
                                    int i12 = -1961561900;
                                    while (true) {
                                        i8 = ((((i8 ^ i10) * (-23111)) >> 31) & i11) ^ (iM45029 ^ i12);
                                        switch (i8) {
                                            case -2145149780:
                                            case 843647572:
                                                if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                                    iM45029 = C19806.m45029("ۚ֨") ^ i9;
                                                    i11 = ((iM45029 ^ i10) * (-1863)) ^ 195492294;
                                                    i12 = 1811817585;
                                                } else {
                                                    iM45029 = (i10 - ThreadFactoryC3888.m11306("۟֫")) * (-27);
                                                    i11 = ((iM45029 ^ i9) * (-23145)) ^ (-1897269373);
                                                    i12 = 1409718955;
                                                }
                                                break;
                                            case -2069154714:
                                            case -1271522015:
                                                C0797.m3359();
                                                if (C2788.m8472() != 0) {
                                                    iM45029 = (ThreadFactoryC3888.m11306("ۧ֡") + i9) * (-125);
                                                    i11 = ((iM45029 ^ i10) * (-25511)) ^ (-1499716398);
                                                    i12 = 534402122;
                                                } else {
                                                    iM45029 = (C19806.m45029("ۚۡ") + i9) * (-53);
                                                    i11 = ((iM45029 ^ i10) * 4539) ^ (-465091505);
                                                    i12 = -708838135;
                                                }
                                                break;
                                            case -1988252804:
                                            case 1746165221:
                                                if (C2788.f10625 >= 0) {
                                                    iM45029 = ThreadFactoryC3888.m11306("ۜܶ") ^ i10;
                                                    i11 = ((iM45029 ^ i9) * (-29409)) ^ (-739476634);
                                                    i12 = 1661999731;
                                                } else {
                                                    iM45029 = C19806.m45029("᩻ۗ") ^ i10;
                                                    i11 = ((iM45029 ^ i9) * (-23029)) ^ (-372365795);
                                                    i12 = -596229053;
                                                }
                                                break;
                                            case -1544298973:
                                            case -862488404:
                                                if (C3577.f13150 >= 0) {
                                                    iM45029 = (C19806.m45029("ۚۡ") + i9) * (-53);
                                                    i11 = ((iM45029 ^ i10) * 4539) ^ (-465091505);
                                                    i12 = -708838135;
                                                } else {
                                                    iM45029 = C19806.m45029("ᩳ᩸") ^ i10;
                                                    i11 = ((iM45029 ^ i9) * 26835) ^ (-784214758);
                                                    i12 = -1850243416;
                                                }
                                                break;
                                            case -1404798703:
                                            case -674045945:
                                                if (C7105.f23796 >= 0) {
                                                    iM45029 = (i10 - ThreadFactoryC3888.m11306("۟֫")) * (-27);
                                                    i11 = ((iM45029 ^ i9) * (-23145)) ^ (-1897269373);
                                                    i12 = 1409718955;
                                                } else {
                                                    iM45029 = C19806.m45029("֡᩵") ^ i9;
                                                    i11 = ((iM45029 ^ i10) * (-5351)) ^ (-1809005394);
                                                    i12 = 1866622475;
                                                }
                                                break;
                                            case -1053637097:
                                            case 820751368:
                                                C1398.m4895();
                                                throw new RuntimeException();
                                            case -936695764:
                                            case 1023144625:
                                                return;
                                            case -759658787:
                                            case 1569694402:
                                                if (ThreadFactoryC3888.f14547 <= 0) {
                                                    iM45029 = (C19806.m45029("ۚۡ") + i9) * (-53);
                                                    i11 = ((iM45029 ^ i10) * 4539) ^ (-465091505);
                                                    i12 = -708838135;
                                                } else {
                                                    iM45029 = (ThreadFactoryC3888.m11306("᩻ܳ") ^ i10) * 89;
                                                    i11 = ((iM45029 ^ i9) * (-1163)) ^ 2023989420;
                                                    i12 = -2025889875;
                                                }
                                                break;
                                            case -654165628:
                                            case 1201426489:
                                                if (AbstractC0464.f2088 <= 0) {
                                                    iM45029 = (C19806.m45029("ۚۡ") + i9) * (-53);
                                                    i11 = ((iM45029 ^ i10) * 4539) ^ (-465091505);
                                                    i12 = -708838135;
                                                } else {
                                                    iM45029 = (C19806.m45029("ۙۤ") ^ i9) * (-61);
                                                    i11 = ((iM45029 ^ i10) * (-20959)) ^ 1591104857;
                                                    i12 = 612584629;
                                                }
                                                break;
                                            case -511324637:
                                            case -257181903:
                                                if (ThreadFactoryC3888.f14547 <= 0) {
                                                    iM45029 = (ThreadFactoryC3888.m11306("ۧ֡") + i9) * (-125);
                                                    i11 = ((iM45029 ^ i10) * (-25511)) ^ (-1499716398);
                                                    i12 = 534402122;
                                                } else {
                                                    iM45029 = (C19806.m45029("ܰ֨") ^ i10) * (-5);
                                                    i11 = ((iM45029 ^ i9) * 16527) ^ 691632567;
                                                    i12 = 1327828926;
                                                }
                                                break;
                                            case -139222952:
                                            case 320980807:
                                                ThreadFactoryC3888.m11300();
                                                C0216.m1591();
                                                iM45029 = (C19806.m45029("ۚۡ") + i9) * (-53);
                                                i11 = ((iM45029 ^ i10) * 4539) ^ (-465091505);
                                                i12 = -708838135;
                                                break;
                                            case 504017351:
                                            case 683774637:
                                                if (C1377.f5749) {
                                                    iM45029 = (C19806.m45029("֡ۧ") + i10) * (-125);
                                                    i11 = ((iM45029 ^ i9) * (-23339)) ^ 1886179366;
                                                    i12 = 1881889477;
                                                } else {
                                                    iM45029 = (C19806.m45029("ܺܳ") ^ i10) * 123;
                                                    i11 = ((iM45029 ^ i9) * (-23675)) ^ (-572791599);
                                                    i12 = 1667020331;
                                                }
                                                break;
                                            case 535907085:
                                            case 2120321054:
                                                C0629.m2907();
                                                if (C1419.f5860 < 0) {
                                                    iM45029 = ThreadFactoryC3888.m11306("ۜܶ") ^ i10;
                                                    i11 = ((iM45029 ^ i9) * (-29409)) ^ (-739476634);
                                                    i12 = 1661999731;
                                                } else {
                                                    iM45029 = (C19806.m45029("ۚۡ") + i9) * (-53);
                                                    i11 = ((iM45029 ^ i10) * 4539) ^ (-465091505);
                                                    i12 = -708838135;
                                                }
                                                break;
                                            case 978168564:
                                            case 1896989104:
                                                if (C3660.f13403 >= 0) {
                                                    iM45029 = (i10 - ThreadFactoryC3888.m11306("۟֫")) * (-27);
                                                    i11 = ((iM45029 ^ i9) * (-23145)) ^ (-1897269373);
                                                    i12 = 1409718955;
                                                } else {
                                                    iM45029 = (ThreadFactoryC3888.m11306("ۜۖ") + i9) * (-85);
                                                    i11 = ((iM45029 ^ i10) * (-29363)) ^ (-864334892);
                                                    i12 = -240997622;
                                                }
                                                break;
                                            case 1261104733:
                                            case 2129514401:
                                                RunnableC1606.m5473();
                                                if (C7105.f23796 >= 0) {
                                                    iM45029 = (C19806.m45029("ܺܳ") ^ i10) * 123;
                                                    i11 = ((iM45029 ^ i9) * (-23675)) ^ (-572791599);
                                                    i12 = 1667020331;
                                                } else {
                                                    iM45029 = (ThreadFactoryC3888.m11306("ۧ֡") + i9) * (-125);
                                                    i11 = ((iM45029 ^ i10) * (-25511)) ^ (-1499716398);
                                                    i12 = 534402122;
                                                }
                                                break;
                                            default:
                                                if (C1460.m5050() != 0) {
                                                    iM45029 = ThreadFactoryC3888.m11306("ۜܶ") ^ i10;
                                                    i11 = ((iM45029 ^ i9) * (-29409)) ^ (-739476634);
                                                    i12 = 1661999731;
                                                } else {
                                                    iM45029 = ThreadFactoryC3888.m11306("۠᩻") ^ i9;
                                                    i11 = ((iM45029 ^ i10) * 8003) ^ 1396591542;
                                                    i12 = -1718054084;
                                                }
                                                break;
                                        }
                                    }
                                }
                            });
                            iM11306 = ThreadFactoryC3888.m11306("᩹᩻") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-24981)) ^ (-819519534);
                            i = 1136731618;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -1398543233:
                    case 2027479090:
                        executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C5464.f18831);
                        if (C1668.f6641 < 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ܰ۟") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-23299)) ^ 990954194;
                            i = 1768088490;
                            i7 = iM11306 ^ i;
                        } else {
                            iM11307 = (C19806.m45029("ۧ۟") ^ i3) * 31;
                            i5 = ((iM11307 ^ i4) * 763) ^ (-211155431);
                            i6 = 311552381;
                        }
                        break;
                    case -1358423977:
                    case 1979010474:
                        ViewTreeObserverOnPreDrawListenerC3327.m9874();
                        if (C2124.f7782 <= 0) {
                            iM11307 = C19806.m45029("ܿ᩸") ^ i3;
                            i5 = ((iM11307 ^ i4) * (-18401)) ^ 549589611;
                            i6 = 2055218644;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩵") ^ i3;
                        i5 = ((iM11306 ^ i4) * 28091) ^ 989675040;
                        i = 93414283;
                        i7 = iM11306 ^ i;
                        break;
                    case -981914786:
                    case 1930808405:
                        interfaceC22762 = (InterfaceC22762) C0278.m1776(itM9863);
                        if (C2642.f10294 <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("᩵᩵") ^ i3;
                            i5 = ((iM11306 ^ i4) * 28091) ^ 989675040;
                            i = 93414283;
                        } else {
                            iM11306 = (C19806.m45029("ܶ۟") ^ i3) * 65;
                            i5 = ((iM11306 ^ i4) * (-30361)) ^ 1678842632;
                            i = -764769288;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -805814728:
                    case 506374163:
                        if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                            if (!C0817.f3443) {
                                iM11307 = C19806.m45029("ܿ᩸") ^ i3;
                                i5 = ((iM11307 ^ i4) * (-18401)) ^ 549589611;
                                i6 = 2055218644;
                                break;
                            } else if (C3535.f13026 > 0 && !C0797.f3386 && !C3286.f12186) {
                                C7474 c7474 = this.f32447;
                                if (RunnableC1895.f7152) {
                                    c8485 = new C8485(c7474);
                                    ExecutorService executorService = C4716.f16632;
                                    if (C0629.f2722 > 0) {
                                        iM11306 = (ThreadFactoryC3888.m11306("ܺܿ") ^ i3) * q.h;
                                        i5 = ((iM11306 ^ i4) * (-11161)) ^ (-550405422);
                                        i = 458392744;
                                        i7 = iM11306 ^ i;
                                        break;
                                    }
                                }
                                iM11307 = (C19806.m45029("ۧ۟") ^ i3) * 31;
                                i5 = ((iM11307 ^ i4) * 763) ^ (-211155431);
                                i6 = 311552381;
                                break;
                            }
                        }
                        iM11307 = (i4 - C19806.m45029("ᩴۨ")) * (-127);
                        i5 = ((iM11307 ^ i3) * (-559)) ^ (-1903421388);
                        i6 = 599316632;
                        break;
                    case 176465747:
                    case 516677875:
                        if (C0962.m3748(itM9863)) {
                            iM11306 = (i4 - C19806.m45029("ۗۨ")) * (-59);
                            i5 = ((iM11306 ^ i3) * (-16925)) ^ (-1448045364);
                            i = -644333580;
                        } else {
                            iM11306 = (i3 - ThreadFactoryC3888.m11306("ܳ۫")) * (-19);
                            i5 = ((iM11306 ^ i4) * (-6249)) ^ 1476020556;
                            i = -1910357467;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 417672780:
                    case 597659952:
                        C0278.m1789();
                        return null;
                    case 1496199578:
                    case 1578733830:
                        C4716.m13052(executorServiceNewFixedThreadPool);
                        return c8485;
                    default:
                        if (C10634.m26820()) {
                            iM11307 = (i4 - C19806.m45029("ᩴۨ")) * (-127);
                            i5 = ((iM11307 ^ i3) * (-559)) ^ (-1903421388);
                            i6 = 599316632;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩵") ^ i3;
                        i5 = ((iM11306 ^ i4) * 28091) ^ 989675040;
                        i = 93414283;
                        i7 = iM11306 ^ i;
                        break;
                }
            }
        }
    }

    public C9648(C7474 c7474) {
        ArrayList arrayList = null;
        int i = 1356127972;
        int i2 = C3577.f13150;
        int i3 = RunnableC1606.f6488;
        int iM45029 = C19806.m45029("ۤۡ") ^ i2;
        int i4 = ((iM45029 ^ i3) * 21905) ^ (-1649487212);
        int i5 = 696358940;
        while (true) {
            i = ((((i ^ i3) * (-10203)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1878096735:
                case -1135676651:
                    if (C0216.f1393 != 0) {
                        iM45029 = C19806.m45029("ۖۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-17875)) ^ (-266956412);
                        i5 = 1001105657;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩷֡")) * (-27);
                        i4 = ((iM45029 ^ i2) * (-14045)) ^ 1566767631;
                        i5 = -1206458100;
                    }
                    break;
                case -1855387781:
                case -320922236:
                    if (CallableC1627.f6528) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۨ") + i3) * 71;
                        i4 = ((iM45029 ^ i2) * 18109) ^ (-1740420615);
                        i5 = -1412061863;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۛ۟")) * (-67);
                        i4 = ((iM45029 ^ i2) * (-25701)) ^ (-1847812148);
                        i5 = 103058589;
                    }
                    break;
                case -1587138440:
                case 893636185:
                    C2642.m8171();
                    throw new RuntimeException();
                case -1298139502:
                case 1666775437:
                    if (C3535.f13026 <= 0) {
                        iM45029 = (C19806.m45029("ۘ᩷") + i3) * q.h;
                        i4 = ((iM45029 ^ i2) * 29855) ^ 1987960379;
                        i5 = 1154635088;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ۚ") + i3) * 95;
                        i4 = ((iM45029 ^ i2) * (-3499)) ^ (-486307688);
                        i5 = 1796564781;
                    }
                    break;
                case -1286863310:
                case 553637360:
                    arrayList = new ArrayList();
                    if (C2871.f10837 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۛ۟")) * (-67);
                        i4 = ((iM45029 ^ i2) * (-25701)) ^ (-1847812148);
                        i5 = 103058589;
                    } else {
                        iM45029 = C19806.m45029("ܰ᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * 9857) ^ 1804836407;
                        i5 = -1090486317;
                    }
                    break;
                case -1034034463:
                case 371006242:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩳۧ")) * (-49);
                        i4 = ((iM45029 ^ i2) * 21417) ^ (-55764420);
                        i5 = 1874536889;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴ᩺") + i2) * (-63);
                        i4 = ((iM45029 ^ i3) * (-6743)) ^ (-352078602);
                        i5 = -2047565036;
                    }
                    break;
                case -820966536:
                case 1016642617:
                    C2788.m8472();
                    if (C0797.f3386) {
                        iM45029 = C19806.m45029("ۛۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-11731)) ^ (-605036390);
                        i5 = 1628100795;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩳۧ")) * (-49);
                        i4 = ((iM45029 ^ i2) * 21417) ^ (-55764420);
                        i5 = 1874536889;
                    }
                    break;
                case -707189065:
                case 1356288078:
                    if (C7105.f23796 >= 0) {
                        iM45029 = (C19806.m45029("ۘ᩷") + i3) * q.h;
                        i4 = ((iM45029 ^ i2) * 29855) ^ 1987960379;
                        i5 = 1154635088;
                    } else {
                        iM45029 = (i2 - C19806.m45029("۬ۖ")) * (-123);
                        i4 = ((iM45029 ^ i3) * 32135) ^ (-1898432221);
                        i5 = 537030050;
                    }
                    break;
                case -380656458:
                case -31653598:
                    if (C1025.f4800 >= 0) {
                        iM45029 = C19806.m45029("ۖۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-17875)) ^ (-266956412);
                        i5 = 1001105657;
                    } else {
                        iM45029 = (C19806.m45029("᩺۬") + i2) * 27;
                        i4 = ((iM45029 ^ i3) * (-19983)) ^ (-2140275056);
                        i5 = -1088268541;
                    }
                    break;
                case -206658616:
                case 1477066315:
                    C1977.m6356();
                    if (C1025.m3861() > 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩳۧ")) * (-49);
                        i4 = ((iM45029 ^ i2) * 21417) ^ (-55764420);
                        i5 = 1874536889;
                    } else {
                        iM45029 = C19806.m45029("ۖۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-17875)) ^ (-266956412);
                        i5 = 1001105657;
                    }
                    break;
                case -76844195:
                case -70827640:
                    C0526.m2437();
                    if (C0278.m1789() > 0) {
                        iM45029 = (C19806.m45029("ۘ᩷") + i3) * q.h;
                        i4 = ((iM45029 ^ i2) * 29855) ^ 1987960379;
                        i5 = 1154635088;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩳۧ")) * (-49);
                        i4 = ((iM45029 ^ i2) * 21417) ^ (-55764420);
                        i5 = 1874536889;
                    }
                    break;
                case 210083658:
                case 1213726362:
                    if (C1398.f5802 <= 0) {
                        iM45029 = (C19806.m45029("ۘ᩷") + i3) * q.h;
                        i4 = ((iM45029 ^ i2) * 29855) ^ 1987960379;
                        i5 = 1154635088;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܰ᩹")) * (-31);
                        i4 = ((iM45029 ^ i2) * 30813) ^ 1597135183;
                        i5 = -488230771;
                    }
                    break;
                case 221187134:
                case 1786756436:
                    if (C1377.f5749) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܶۗ")) * (-31);
                        i4 = ((iM45029 ^ i3) * (-32039)) ^ (-1321720498);
                        i5 = -1084367728;
                    } else {
                        iM45029 = C19806.m45029("ۖۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-17875)) ^ (-266956412);
                        i5 = 1001105657;
                    }
                    break;
                case 317999687:
                case 785139121:
                    this.f32446 = arrayList;
                    this.f32447 = c7474;
                    return;
                case 1242193918:
                case 2012547717:
                    C1937.m6279();
                    C2642.m8171();
                    iM45029 = C19806.m45029("ۖۨ") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-17875)) ^ (-266956412);
                    i5 = 1001105657;
                    break;
                default:
                    if (C3535.f13026 <= 0) {
                        iM45029 = (C19806.m45029("ۘ᩷") + i3) * q.h;
                        i4 = ((iM45029 ^ i2) * 29855) ^ 1987960379;
                        i5 = 1154635088;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩶ܶ")) * 29;
                        i4 = ((iM45029 ^ i3) * (-4107)) ^ 331631615;
                        i5 = 418136390;
                    }
                    break;
            }
        }
    }
}
