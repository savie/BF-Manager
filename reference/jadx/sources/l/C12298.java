package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6N1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12298 {

    /* JADX INFO: renamed from: ᩸᩷ۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f41122 = {2548, 20205, 20182, 20185, 20186, 20180, 20189, 20120, 20172, 20183, 20120, 20188, 20189, 20180, 20189, 20172, 20189, 20120, 20180, 20189, 20191, 20185, 20187, 20161, 20120, 20188, 20185, 20172, 20185, 20098, 20120, 2927, 29481, 29496, 29488, 29485, 29488, 29502, 29485, 29485, 29487, 29490, 29495, 29496, 29502, 29481, 29486, 29485, 29487, 29490, 29495, 29496, 29502, 29481, 29486, 29448, 29491, 29500, 29503, 29489, 29496, 29565, 29481, 29490, 29565, 29489, 29492, 29486, 29481, 29565, 29489, 29496, 29498, 29500, 29502, 29476, 29565, 29485, 29487, 29490, 29495, 29496, 29502, 29481, 29486, 29448, 29491, 29500, 29503, 29489, 29496, 29565, 29481, 29490, 29565, 29488, 29490, 29483, 29496, 29565, 29489, 29496, 29498, 29500, 29502, 29476, 29565, 29485, 29487, 29490, 29495, 29496, 29502, 29481, 29543, 29565};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m30550(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746) {
        short s = f41122[31];
        int i = ((s * s) + 16777216) - (s * 8192) < 0 ? 37840 : 29533;
        synchronized (C12298.class) {
            try {
                m30549(C1668.m5585(abstractC20745, C1461.m5070(f41122, 32, 4, i)));
                m30549(C1668.m5585(abstractC20745, C2249.m6918(f41122, 36, 3, i)));
                try {
                    AbstractC20745 abstractC20745M5585 = C1668.m5585(abstractC20746, RunnableC1606.m5481(f41122, 39, 8, i));
                    Iterator itM9705 = MenuItemOnMenuItemClickListenerC3244.m9705(C1668.m5585(abstractC20745, RunnableC1895.m6164(f41122, 47, 8, i)).mo33983(true));
                    while (RunnableC1564.m5348(itM9705)) {
                        AbstractC20745 abstractC20747 = (AbstractC20745) C0216.m1584(itM9705);
                        try {
                            if (C1419.m4974(abstractC20747)) {
                                if (!C3286.m9799(abstractC20745M5585) && !abstractC20745M5585.mo33987()) {
                                    return;
                                }
                                AbstractC20745 abstractC20745M5586 = C1668.m5585(abstractC20745M5585, C3743.m10959(abstractC20747));
                                if (!C1148.m4231(abstractC20745M5586)) {
                                    abstractC20747.mo24646(abstractC20745M5586);
                                }
                            }
                        } catch (Exception e) {
                            StringBuilder sb = new StringBuilder();
                            C2788.m8480(sb, ThreadFactoryC3888.m11312(f41122, 85, 31, i));
                            C2788.m8480(sb, C0629.m2900(abstractC20747));
                            C1668.m5578(C2124.m6674(sb), e);
                        }
                    }
                } catch (Exception e2) {
                    C1668.m5578(RunnableC1606.m5481(f41122, 55, 30, i), e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:53:0x0180  */
    /* JADX WARN: Code duplicated, block: B:61:0x01f3 A[PHI: r4 r7 r15
      0x01f3: PHI (r4v4 java.lang.StringBuilder) = (r4v2 java.lang.StringBuilder), (r4v3 java.lang.StringBuilder), (r4v2 java.lang.StringBuilder) binds: [B:60:0x01f1, B:48:0x014e, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:60:0x01f1, B:48:0x014e, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r15v4 short[]) = (r15v3 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:60:0x01f1, B:48:0x014e, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02a1 A[PHI: r11 r12
      0x02a1: PHI (r11v4 int) = (r11v3 int), (r11v2 int) binds: [B:75:0x029f, B:18:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x02a1: PHI (r12v4 int) = (r12v3 int), (r12v2 int) binds: [B:75:0x029f, B:18:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x02d7 A[PHI: r10 r13
      0x02d7: PHI (r10v4 int) = (r10v3 int), (r10v2 int) binds: [B:79:0x02d5, B:71:0x027e] A[DONT_GENERATE, DONT_INLINE]
      0x02d7: PHI (r13v3 int) = (r13v2 int), (r13v4 int) binds: [B:79:0x02d5, B:71:0x027e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x030d A[PHI: r9
      0x030d: PHI (r9v4 short) = (r9v3 short), (r9v2 short) binds: [B:83:0x030b, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x033f A[PHI: r5 r21
      0x033f: PHI (r5v4 java.lang.String) = (r5v2 java.lang.String), (r5v3 java.lang.String), (r5v2 java.lang.String) binds: [B:87:0x033d, B:44:0x0129, B:21:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x033f: PHI (r21v5 char) = (r21v4 char), (r21v3 char), (r21v3 char) binds: [B:87:0x033d, B:44:0x0129, B:21:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x0373  */
    /* JADX WARN: Code duplicated, block: B:94:0x039d A[PHI: r16
      0x039d: PHI (r16v3 short[]) = (r16v2 short[]), (r16v5 short[]) binds: [B:12:0x0066, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30549(AbstractC20745 abstractC20745) {
        int iM11306;
        int i;
        int i2;
        int i3 = C2249.f8050;
        int i4 = C1066.f4915;
        int iM45029 = C19806.m45029("᩵ܽ") ^ i3;
        int i5 = ((iM45029 ^ i4) * (-18289)) ^ 435687173;
        String strM2900 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM45029 ^ 1255906729;
        String strM5344 = null;
        boolean zM10052 = false;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 986728137;
        char c = 0;
        StringBuilder sb = null;
        Exception exc = null;
        boolean zM4231 = false;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * 19821) >> 31));
            switch (i13) {
                case -2139676982:
                case 1892541784:
                    strM5344 = RunnableC1564.m5344(sArr2, i7, 30, i12);
                    iM11306 = ThreadFactoryC3888.m11306("ۧۧ") ^ i3;
                    i = ((iM11306 ^ i4) * 28049) ^ 662215859;
                    i2 = -1516202510;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -2081019429:
                case -574602375:
                    C1668.m5583();
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM11306 = C19806.m45029("ᩳۧ") ^ i4;
                        i = ((iM11306 ^ i3) * 3015) ^ (-374087274);
                        i2 = 2117854516;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ֫") ^ i3;
                        i = ((iM11306 ^ i4) * 961) ^ (-364936356);
                        i2 = 619751521;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -2073335433:
                case -1291133358:
                    i9 = i8 * i8;
                    i10 = s * s;
                    if (C3577.f13150 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤ᩹") ^ i3) * (-29);
                        i = ((iM11306 ^ i4) * 30623) ^ 725712414;
                        i2 = -1019523996;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴ᩹") + i4) * (-61);
                        i = ((iM11306 ^ i3) * 4363) ^ (-2083661857);
                        i2 = -503546562;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1999415588:
                case 76705136:
                    int i14 = i10 + i11;
                    if (i9 - (i14 + i14) <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ۙ") ^ i3) * 109;
                        i = ((iM11306 ^ i4) * 28011) ^ 2017091342;
                        i2 = 1236285932;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫ۢ") ^ i4;
                        i = ((iM11306 ^ i3) * 5203) ^ 1528948972;
                        i2 = 1075771267;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1973977888:
                case -472801078:
                    i8 = s + 4424;
                    if (C3286.f12186) {
                        iM11306 = (C19806.m45029("֫᩵") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i4) * (-25869)) ^ (-42585098);
                        i2 = -972731757;
                    } else {
                        iM11306 = (C19806.m45029("۫֡") ^ i3) * 11;
                        i = ((iM11306 ^ i4) * (-17497)) ^ 1144734094;
                        i2 = -1070826172;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1929817830:
                case 1168401291:
                    s = sArr[c];
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩹") ^ i4;
                        i = ((iM11306 ^ i3) * (-141)) ^ (-748945823);
                        i2 = -2099586034;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬ۛ") ^ i3;
                        i = ((iM11306 ^ i4) * (-14993)) ^ 157203608;
                        i2 = 598879434;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1915409330:
                case -1098378593:
                    if (zM4231) {
                        iM11306 = C19806.m45029("ܿۜ") ^ i3;
                        i = ((iM11306 ^ i4) * 13325) ^ 1054171746;
                        i2 = 674522926;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۡ۬")) * (-43);
                        i = ((iM11306 ^ i3) * (-12273)) ^ (-1433890412);
                        i2 = 1444733561;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1853119814:
                case -412763196:
                    C0629.m2907();
                    if (C3743.f13569) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤ᩹") ^ i3) * (-29);
                        i = ((iM11306 ^ i4) * 30623) ^ 725712414;
                        i2 = -1019523996;
                    } else {
                        iM11306 = (C19806.m45029("ۘ᩵") + i3) * 95;
                        i = ((iM11306 ^ i4) * 5337) ^ (-424646232);
                        i2 = -1191999731;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1820764294:
                case 39637758:
                    sArr2 = f41122;
                    i7 = 1;
                    if (C3722.m10894() <= 0) {
                        iM11306 = (C19806.m45029("֡ۢ") + i3) * 109;
                        i = ((iM11306 ^ i4) * (-4411)) ^ (-1058722004);
                        i2 = -401388103;
                    } else {
                        iM11306 = (C19806.m45029("᩺ۜ") ^ i4) * (-29);
                        i = ((iM11306 ^ i3) * 1927) ^ (-1325562657);
                        i2 = 160906172;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1759507061:
                case 461698702:
                    AbstractC0464.m2313();
                    break;
                case -1728820076:
                case -141690550:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM11306 = (C19806.m45029("ۘ᩵") + i3) * 95;
                        i = ((iM11306 ^ i4) * 5337) ^ (-424646232);
                        i2 = -1191999731;
                    } else {
                        iM11306 = (i4 - C19806.m45029("᩶᩻")) * 55;
                        i = ((iM11306 ^ i3) * (-6047)) ^ 774144009;
                        i2 = 669707967;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1579512222:
                case -1080629306:
                    break;
                case -1563349165:
                case -460119909:
                    C0050.m946();
                    C0962.m3746();
                    iM11306 = C19806.m45029("ᩳۧ") ^ i4;
                    i = ((iM11306 ^ i3) * 3015) ^ (-374087274);
                    i2 = 2117854516;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1556511967:
                case 1883422734:
                    i12 = 20152;
                    iM11306 = ThreadFactoryC3888.m11306("᩻ۛ") ^ i3;
                    i = ((iM11306 ^ i4) * 3697) ^ (-791940171);
                    i2 = -1036208047;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1519795565:
                case -241374475:
                    if (C2788.m8472() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ֫") ^ i3;
                        i = ((iM11306 ^ i4) * 961) ^ (-364936356);
                        i2 = 619751521;
                    } else {
                        iM11306 = C19806.m45029("᩹ۡ") ^ i4;
                        i = ((iM11306 ^ i3) * 15541) ^ (-1045071542);
                        i2 = 469442347;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -933161503:
                case 1173844273:
                    if (C1189.m4368() <= 0) {
                        iM11306 = C19806.m45029("ᩳۧ") ^ i4;
                        i = ((iM11306 ^ i3) * 3015) ^ (-374087274);
                        i2 = 2117854516;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩹") ^ i4;
                        i = ((iM11306 ^ i3) * (-141)) ^ (-748945823);
                        i2 = -2099586034;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -733124257:
                case 1684851633:
                    if (zM10052) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۡ۬")) * (-43);
                        i = ((iM11306 ^ i3) * (-12273)) ^ (-1433890412);
                        i2 = 1444733561;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖᩳ") + i3) * (-127);
                        i = ((iM11306 ^ i4) * 18779) ^ (-829325977);
                        i2 = -1492894925;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -514549526:
                case 547100199:
                    i11 = 19571776;
                    if (C1398.f5802 <= 0) {
                        iM11306 = (C19806.m45029("֫᩵") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i4) * (-25869)) ^ (-42585098);
                        i2 = -972731757;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫֨") + i4) * 83;
                        i = ((iM11306 ^ i3) * (-19265)) ^ 2106073774;
                        i2 = 1956354765;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -452848326:
                case 7672317:
                    strM2900 = C0629.m2900(abstractC20745);
                    if (C0278.m1789() <= 0) {
                        iM11306 = (i4 - C19806.m45029("᩶᩻")) * 55;
                        i = ((iM11306 ^ i3) * (-6047)) ^ 774144009;
                        i2 = 669707967;
                    } else {
                        iM11306 = (C19806.m45029("֡ܺ") + i3) * (-69);
                        i = ((iM11306 ^ i4) * (-16701)) ^ 376283816;
                        i2 = 2077496302;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -396897988:
                case 239270418:
                    zM10052 = RunnableC3388.m10052(abstractC20745);
                    iM11306 = C19806.m45029("ᩳۗ") ^ i4;
                    i = ((iM11306 ^ i3) * 30355) ^ 1952483313;
                    i2 = 30660635;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -348998029:
                case 42314537:
                    C2249.m6915();
                    if (C3286.f12186) {
                        iM11306 = C19806.m45029("ᩳۧ") ^ i4;
                        i = ((iM11306 ^ i3) * 3015) ^ (-374087274);
                        i2 = 2117854516;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡᩹") ^ i4;
                        i = ((iM11306 ^ i3) * (-18871)) ^ 775363025;
                        i2 = 541823143;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -242072615:
                case -44296976:
                    C1398.m4895();
                    if (C3577.m10565()) {
                        iM11306 = C19806.m45029("ᩳۧ") ^ i4;
                        i = ((iM11306 ^ i3) * 3015) ^ (-374087274);
                        i2 = 2117854516;
                    } else {
                        iM11306 = (C19806.m45029("ۘ᩵") + i3) * 95;
                        i = ((iM11306 ^ i4) * 5337) ^ (-424646232);
                        i2 = -1191999731;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 120628732:
                case 1591607766:
                    C2788.m8480(sb, strM2900);
                    C1189.m4363(C2124.m6674(sb), exc);
                    break;
                case 631374778:
                case 1055832500:
                    i12 = 61194;
                    iM11306 = ThreadFactoryC3888.m11306("᩻ۛ") ^ i3;
                    i = ((iM11306 ^ i4) * 3697) ^ (-791940171);
                    i2 = -1036208047;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 692085503:
                case 1589584910:
                    try {
                        StringBuilder sb2 = new StringBuilder(strM5344);
                        C1148.m4223(sb2, ViewGroupOnHierarchyChangeListenerC1916.m6236(abstractC20745));
                        C0577.m2744(C2124.m6674(sb2));
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۡ۬")) * (-43);
                        i = ((iM11306 ^ i3) * (-12273)) ^ (-1433890412);
                        i2 = 1444733561;
                    } catch (Exception e) {
                        exc = e;
                        iM11306 = (ThreadFactoryC3888.m11306("֡۠") ^ i4) * (-85);
                        i = ((iM11306 ^ i3) * (-14303)) ^ 1410680666;
                        i2 = 294355084;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 703308599:
                case 1252886841:
                    sb = new StringBuilder(strM5344);
                    if (C1875.m6086() != 0) {
                        iM11306 = (C19806.m45029("֡ۢ") + i3) * 109;
                        i = ((iM11306 ^ i4) * (-4411)) ^ (-1058722004);
                        i2 = -401388103;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۛ") ^ i4;
                        i = ((iM11306 ^ i3) * (-6207)) ^ (-739315622);
                        i2 = 1707729743;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 770884582:
                case 1065011121:
                    C10634.m26820();
                    if (C1148.m4232() <= 0) {
                        iM11306 = C19806.m45029("ᩳۧ") ^ i4;
                        i = ((iM11306 ^ i3) * 3015) ^ (-374087274);
                        i2 = 2117854516;
                    } else {
                        iM11306 = (C19806.m45029("֡ۢ") + i3) * 109;
                        i = ((iM11306 ^ i4) * (-4411)) ^ (-1058722004);
                        i2 = -401388103;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1535029082:
                case 2118389197:
                    c = 0;
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i4 - C19806.m45029("᩶᩻")) * 55;
                        i = ((iM11306 ^ i3) * (-6047)) ^ 774144009;
                        i2 = 669707967;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ᩳ۫")) * (-79);
                        i = ((iM11306 ^ i3) * (-27405)) ^ (-1375946390);
                        i2 = 387387052;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1707284605:
                case 1851503807:
                    zM4231 = C1148.m4231(abstractC20745);
                    iM11306 = (C19806.m45029("ۗ᩺") ^ i3) * (-105);
                    i = ((iM11306 ^ i4) * (-8461)) ^ 93407935;
                    i2 = -1449239893;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    sArr = f41122;
                    if (C7105.f23796 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡᩹") ^ i4;
                        i = ((iM11306 ^ i3) * (-18871)) ^ 775363025;
                        i2 = 541823143;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶֡") ^ i3;
                        i = ((iM11306 ^ i4) * 30993) ^ 1244844780;
                        i2 = 838632049;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }
}
