package l;

import bin.mt.plus.Features;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩹᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C72N */
/* JADX INFO: loaded from: classes.dex */
public final class C22551 extends AbstractC19901 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C22551 f73529;

    /* JADX INFO: renamed from: ܰ᩷ᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f73530 = {6257, -24472, -24453, -24450, -24453, -24472, -24449, -24536, -24523, -24453, -24471, -24471, -24449, -24466, -24471, -24523, -24532, -24472, -24453, -24450, -24453, -24472, -24449, -24536, -24457, -24466, -24521, -24472, -24453, -24450, -24453, -24472, -24449, -24536, -24458, -24461, -24456, -24457, -24466, -24521, -24472, -24453, -24450, -24453, -24472, -24449, -24536, -24524, -24471, -24459, 8253, -11020, -11084, -11078, -11053, -11078, -11080, -11020, -11084, -11078, -11027, -11010, -11039, -11031, -11027, -11026, -11035, -11103, -11014, -11077, -11027, -11027, -11010, -11039, -11078, -11080, -11103, -11014, -11084, -11027, -11077, -11031, -11031, -11074, -11077, -11031, -11032, -11032, -11080, -11079, -11077, -11078, -11027, -11074, -11078, -11032, -11077, -11077, -11080, -11074, -11074, -11079, -11083, -11080, -11026, -11078, -11073, -11073, -11080, -11083, -11074, -11084, -11031, -11079, -11030, -11027, -11026, -11083, -11026, -11074, -11076, -11027, -11083, -11032, -11077, -11080, -11083, -11025, -11078, -11032, -11031, -11031, -11032, -11031, -11031, -11030, -11083, -11078, -11077, -11075, -11027, -11073, -11083, -11079, -11074, -11027, -11083, -11025, -11077, -11073, -11077, -11032, -11031, -11083, -11025, -11031, -11032, -11079, -11083, -11032, -11077, -11027, -11032, -11080, -11080, -11083, -11076, -11077, -11031, -11025, -11077, -11084, -11026, -11080, -11025, -11026, -11084, -11083, -11031, -11084, -11084, -11025, -11079, -11083, -11084, -11075, -11078, -11031, -11031, -11076, -11032, -11084, -11030, -11075, -11078, -11079, -11032, -11076, -11026, -11031, -11074, -11032, -11078, -11074, -11026, -11073, -11032, -11032, -11031, -11078, -11079, -11025, -11031, -11078, -11076, -11084, -11031, -11027, -11025, -11032, -11080, -11030, -11078, -11031, -11073, -11084, -11025, -11077, -11084, -11084, -11073, -11078, -11076, -11025, -11074, -11084, -11027, -11080, -11030, -11079, -11027, -11026, -11078, -11084, -11026, -11080, -11080, -11025, -11079, -11077, -11025, -11079, -11078, -11027, -11026, -11074, -11080, -11078, -11074, -11083, -11025, -11083, -11080, -11083, -11032, -11030, -11026, -11030, -11073, -11075, -11084, -11032, -11030, -11077, -11031, -11031, -11075, -11084, -11026, -11083, -11074, -11080, -11027, -11032, -11074, -11077, -11080, -11073, -11076, -11030, -11083, -11073, -11032, -11084, -11030, -11078, -11084, -11074, -11032, -11074, -11027, -11027, -11031, -11027, -11031, -11079, -11027, -11026, -11080, -11025, -11084, -11027, -11079, -11078, -11073, -11078, -11030, -11032, -11032, -11079, -11073, -11032, -11026, -11032, -11078, -11079, -11026, -11031, -11084, -11026, -11078, -11032, -11032, -11076, -11032, -11077};

    /* JADX WARN: Code duplicated, block: B:60:0x0193 A[PHI: r2 r3
      0x0193: PHI (r2v3 int) = (r2v2 int), (r2v2 int), (r2v2 int), (r2v2 int), (r2v4 int) binds: [B:59:0x0191, B:53:0x016c, B:45:0x0123, B:14:0x0062, B:10:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r3v3 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v2 int), (r3v4 int) binds: [B:59:0x0191, B:53:0x016c, B:45:0x0123, B:14:0x0062, B:10:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01a8 A[PHI: r4 r5
      0x01a8: PHI (r4v3 int) = (r4v2 int), (r4v4 int) binds: [B:59:0x0191, B:38:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x01a8: PHI (r5v3 int) = (r5v2 int), (r5v4 int) binds: [B:59:0x0191, B:38:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x01cf A[PHI: r0 r1
      0x01cf: PHI (r0v10 short) = (r0v7 short), (r0v4 short), (r0v4 short) binds: [B:42:0x010b, B:34:0x00ca, B:7:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r1v6 short) = (r1v2 short), (r1v3 short), (r1v2 short) binds: [B:42:0x010b, B:34:0x00ca, B:7:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        short s = 0;
        short s2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1274563314;
        int i7 = C2124.f7782;
        int i8 = C1875.f7103;
        int iM11306 = ThreadFactoryC3888.m11306("۫ᩳ") ^ i8;
        int i9 = ((iM11306 ^ i7) * (-2793)) ^ 1601559954;
        int i10 = 76850449;
        while (true) {
            while (true) {
                i6 = ((((i6 ^ i7) * 21569) >> 31) & i9) ^ (iM11306 ^ i10);
                switch (i6) {
                    case -1763869622:
                    case 1373752751:
                        C0962.m3746();
                        if (RunnableC3388.f12514 < 0) {
                            iM11306 = (C19806.m45029("ܶܿ") ^ i7) * 119;
                            i9 = ((iM11306 ^ i8) * 14193) ^ 1929615150;
                            i10 = 1959475780;
                        } else {
                            iM11306 = C19806.m45029("֡ܽ") ^ i7;
                            i9 = ((iM11306 ^ i8) * 27419) ^ 443144536;
                            i10 = -1649726824;
                        }
                        break;
                    case -1735864735:
                    case 1248085854:
                        i5 = 54563;
                        iM11306 = (i8 - C19806.m45029("᩻ۨ")) * (-55);
                        i9 = ((iM11306 ^ i7) * 14171) ^ 494705803;
                        i10 = -1941712518;
                        break;
                    case -1054571978:
                    case 1175576793:
                        i5 = 40986;
                        iM11306 = (i8 - C19806.m45029("᩻ۨ")) * (-55);
                        i9 = ((iM11306 ^ i7) * 14171) ^ 494705803;
                        i10 = -1941712518;
                        break;
                    case -890448097:
                    case 2134747358:
                        C1025.m3861();
                        if (C1875.f7103 >= 0) {
                        }
                        iM11306 = (C19806.m45029("ܶܿ") ^ i7) * 119;
                        i9 = ((iM11306 ^ i8) * 14193) ^ 1929615150;
                        i10 = 1959475780;
                        break;
                    case -554999657:
                    case -302858134:
                        C0817.m3399();
                        C1148.m4232();
                        throw new RuntimeException();
                    case -546083510:
                    case 1998881941:
                        if (i3 - (i4 * i4) <= 0) {
                            iM11306 = C19806.m45029("᩷ۘ") ^ i8;
                            i9 = ((iM11306 ^ i7) * 27845) ^ (-1553438420);
                            i10 = -1390163915;
                        } else {
                            iM11306 = (i7 - C19806.m45029("ᩴᩴ")) * (-25);
                            i9 = ((iM11306 ^ i8) * (-17327)) ^ (-1307298305);
                            i10 = 407295027;
                        }
                        break;
                    case -365946577:
                    case 1359315145:
                        C2477.m7593();
                        MenuItemOnMenuItemClickListenerC3244.m9701();
                        iM11306 = (C19806.m45029("ܶܿ") ^ i7) * 119;
                        i9 = ((iM11306 ^ i8) * 14193) ^ 1929615150;
                        i10 = 1959475780;
                        break;
                    case -274381228:
                    case 1881430980:
                        s = f73530[0];
                        if (C3743.f13569) {
                            iM11306 = C19806.m45029("᩻ۛ") ^ i7;
                            i9 = ((iM11306 ^ i8) * 26379) ^ (-1057993838);
                            i10 = -2040784866;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("֫ۛ") ^ i8;
                            i9 = ((iM11306 ^ i7) * 12091) ^ (-495159117);
                            i10 = 568160802;
                        }
                        break;
                    case -255295720:
                    case 1329376163:
                        i3 = i + i2;
                        i4 = s + 1;
                        if (C1066.f4915 <= 0) {
                            iM11306 = C19806.m45029("֡ܽ") ^ i7;
                            i9 = ((iM11306 ^ i8) * 27419) ^ 443144536;
                            i10 = -1649726824;
                        } else {
                            iM11306 = (C19806.m45029("ܳ᩷") + i7) * 81;
                            i9 = ((iM11306 ^ i8) * (-8789)) ^ 323115897;
                            i10 = -1348410678;
                        }
                        break;
                    case -238770731:
                    case 826369573:
                        s2 = 2;
                        if (C0962.f3784) {
                            iM11306 = ThreadFactoryC3888.m11306("֫ۛ") ^ i8;
                            i9 = ((iM11306 ^ i7) * 12091) ^ (-495159117);
                            i10 = 568160802;
                        } else {
                            iM11306 = (C19806.m45029("۬ۡ") + i8) * (-83);
                            i9 = ((iM11306 ^ i7) * 17483) ^ (-1536060182);
                            i10 = -1601174022;
                        }
                        break;
                    case -177909862:
                    case 898337688:
                        short[] sArr = f73530;
                        if (C1875.f7103 < 0) {
                            String strM5481 = RunnableC1606.m5481(sArr, 1, 7, i5);
                            short[] sArr2 = f73530;
                            if (C0629.f2722 > 0) {
                                String strM1774 = C0278.m1774(sArr2, 8, 9, i5);
                                short[] sArr3 = f73530;
                                if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                }
                                if (C10634.f36300 < 0) {
                                    String strM11312 = ThreadFactoryC3888.m11312(sArr3, 17, 7, i5);
                                    short[] sArr4 = f73530;
                                    if (C1937.f7317 >= 0) {
                                    }
                                    String strM5482 = RunnableC1606.m5481(sArr4, 24, 10, i5);
                                    short[] sArr5 = f73530;
                                    if (C10634.f36300 < 0) {
                                        f73529 = new C22551(strM11312, strM5482, C0671.m3009(sArr5, 34, 16, i5), strM5481, strM1774);
                                        return;
                                    }
                                }
                                iM11306 = ThreadFactoryC3888.m11306("ۨ᩶") ^ i7;
                                i9 = ((iM11306 ^ i8) * 165) ^ (-143331757);
                                i10 = 694770310;
                                break;
                                break;
                            }
                        } else {
                            iM11306 = (C19806.m45029("ܶܿ") ^ i7) * 119;
                            i9 = ((iM11306 ^ i8) * 14193) ^ 1929615150;
                            i10 = 1959475780;
                        }
                        break;
                    case 494110577:
                    case 509531136:
                        i = s * s2;
                        i2 = 1;
                        if (C1977.f7413 <= 0) {
                            iM11306 = (C19806.m45029("ܶܿ") ^ i7) * 119;
                            i9 = ((iM11306 ^ i8) * 14193) ^ 1929615150;
                            i10 = 1959475780;
                        } else {
                            iM11306 = (i8 - C19806.m45029("ۘ۫")) * (-3);
                            i9 = ((iM11306 ^ i7) * 23075) ^ (-1839704720);
                            i10 = -827905750;
                        }
                        break;
                    default:
                        if (C0671.f2816 != 0) {
                        }
                        iM11306 = ThreadFactoryC3888.m11306("֫ۛ") ^ i8;
                        i9 = ((iM11306 ^ i7) * 12091) ^ (-495159117);
                        i10 = 568160802;
                        break;
                }
            }
            iM11306 = C19806.m45029("᩻ᩴ") ^ i8;
            i9 = ((iM11306 ^ i7) * (-19705)) ^ (-151324644);
            i10 = 2112823486;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m50066() {
        f73529.m45171();
    }

    @Override // l.AbstractC19901
    /* JADX INFO: renamed from: ۙ */
    public final RuntimeException mo45169(String str, Throwable th) {
        int i = -519510332;
        int i2 = C10634.f36300;
        int i3 = C1025.f4800;
        int iM45029 = C19806.m45029("ܽ֫") ^ i2;
        int i4 = ((iM45029 ^ i3) * 31805) ^ 1251513362;
        int i5 = 540880553;
        while (true) {
            i = ((((i ^ i3) * (-13271)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1494425224:
                case 1457922404:
                    if (C3577.f13150 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۙ") ^ i3) * (-15);
                        i4 = ((iM45029 ^ i2) * (-24649)) ^ 1317668203;
                        i5 = -1408419407;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9655)) ^ 1838421852;
                        i5 = -56626993;
                    }
                    break;
                case -904109711:
                case 1775680034:
                    C0278.m1789();
                    if (C3660.f13403 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-2877)) ^ 1613375415;
                        i5 = -1805424738;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ᩶") ^ i3) * (-85);
                        i4 = ((iM45029 ^ i2) * (-29395)) ^ 63029298;
                        i5 = -1705638082;
                    }
                    break;
                case -895865126:
                case 140664927:
                    if (C1025.f4800 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ᩶") ^ i3) * (-85);
                        i4 = ((iM45029 ^ i2) * (-29395)) ^ 63029298;
                        i5 = -1705638082;
                    } else {
                        iM45029 = (C19806.m45029("ۘ᩻") + i2) * 45;
                        i4 = ((iM45029 ^ i3) * 20595) ^ 2123906570;
                        i5 = -1592888655;
                    }
                    break;
                case -813080618:
                case 889463751:
                    if (C1025.m3861() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-10603)) ^ (-2092677741);
                        i5 = -690914003;
                    } else {
                        iM45029 = (C19806.m45029("۟ۡ") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM45029 ^ i2) * (-18411)) ^ (-1549873660);
                        i5 = 623022123;
                    }
                    break;
                case -622930124:
                case 728187110:
                    C3722.m10894();
                    iM45029 = (ThreadFactoryC3888.m11306("ۙ᩶") ^ i3) * (-85);
                    i4 = ((iM45029 ^ i2) * (-29395)) ^ 63029298;
                    i5 = -1705638082;
                    break;
                case -515058500:
                case 1134049252:
                    if (C3660.f13403 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۙ") ^ i3) * (-15);
                        i4 = ((iM45029 ^ i2) * (-24649)) ^ 1317668203;
                        i5 = -1408419407;
                    } else {
                        iM45029 = C19806.m45029("ۤ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * 7921) ^ 424673380;
                        i5 = -887263870;
                    }
                    break;
                case -482407878:
                case -105091985:
                    if (C0797.f3386) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ᩶") ^ i3) * (-85);
                        i4 = ((iM45029 ^ i2) * (-29395)) ^ 63029298;
                        i5 = -1705638082;
                    } else {
                        iM45029 = C19806.m45029("֡ۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 23971) ^ 1982544456;
                        i5 = -1258693216;
                    }
                    break;
                case -40206335:
                case 1771236722:
                    if (!C3743.f13569) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ᩶") ^ i3) * (-85);
                        i4 = ((iM45029 ^ i2) * (-29395)) ^ 63029298;
                        i5 = -1705638082;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-10603)) ^ (-2092677741);
                        i5 = -690914003;
                    }
                    break;
                case 78500612:
                case 530557392:
                    if (C7105.f23796 >= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("֫ܰ")) * (-105);
                        i4 = ((iM45029 ^ i3) * (-20975)) ^ 598925220;
                        i5 = -1131823360;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺ۟") ^ i2) * 53;
                        i4 = ((iM45029 ^ i3) * 3847) ^ (-1165369654);
                        i5 = 1919226633;
                    }
                    break;
                case 115805176:
                case 2094612451:
                    return new C7028(str, th);
                case 464274737:
                case 2078468621:
                    if (C3660.f13403 >= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("֫ܰ")) * (-105);
                        i4 = ((iM45029 ^ i3) * (-20975)) ^ 598925220;
                        i5 = -1131823360;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12997)) ^ (-94597274);
                        i5 = -1008917109;
                    }
                    break;
                case 464962314:
                case 1889789883:
                    C1977.m6356();
                    if (C0629.f2722 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۙ") ^ i3) * (-15);
                        i4 = ((iM45029 ^ i2) * (-24649)) ^ 1317668203;
                        i5 = -1408419407;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-2877)) ^ 1613375415;
                        i5 = -1805424738;
                    }
                    break;
                case 500438435:
                case 795098904:
                    C2124.m6673();
                    CallableC1627.m5507();
                    return null;
                case 886742729:
                case 1682480184:
                    if (RunnableC1564.f6300) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ᩶") ^ i3) * (-85);
                        i4 = ((iM45029 ^ i2) * (-29395)) ^ 63029298;
                        i5 = -1705638082;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 10023) ^ 1276029955;
                        i5 = -2041105594;
                    }
                    break;
                case 1532005709:
                case 1700637368:
                    if (C2332.f8260) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۚۘ")) * 61;
                        i4 = ((iM45029 ^ i3) * (-15919)) ^ 106403795;
                        i5 = 1231145315;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-2877)) ^ 1613375415;
                        i5 = -1805424738;
                    }
                    break;
                default:
                    if (C1189.f5284 <= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("֫ܰ")) * (-105);
                        i4 = ((iM45029 ^ i3) * (-20975)) ^ 598925220;
                        i5 = -1131823360;
                    } else {
                        iM45029 = (i3 - C19806.m45029("۠֡")) * 37;
                        i4 = ((iM45029 ^ i2) * 3059) ^ (-1833231998);
                        i5 = 1288007358;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC19901
    /* JADX INFO: renamed from: ܰ */
    public final String mo45173() {
        return Features.getABI();
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0438 A[PHI: r16 r20 r22
      0x0438: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:119:0x0436, B:115:0x0419, B:45:0x010c, B:30:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x0438: PHI (r20v30 short) = (r20v5 short), (r20v6 short), (r20v28 short), (r20v31 short) binds: [B:119:0x0436, B:115:0x0419, B:45:0x010c, B:30:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x0438: PHI (r22v5 char) = (r22v3 char), (r22v4 char), (r22v3 char), (r22v3 char) binds: [B:119:0x0436, B:115:0x0419, B:45:0x010c, B:30:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
    
        if (l.C2704.f10408 != false) goto L26;
     */
    @Override // l.AbstractC19901
    /* JADX INFO: renamed from: ܰ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C15668 mo45174(java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 1408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22551.mo45174(java.lang.String):l.ܺۗ۬");
    }

    @Override // l.AbstractC19901
    /* JADX INFO: renamed from: ۙ */
    public final String mo45170(String str) {
        return C1355.m4781(str);
    }
}
