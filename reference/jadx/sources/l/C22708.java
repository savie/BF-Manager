package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩸ۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6MO */
/* JADX INFO: loaded from: classes.dex */
public final class C22708 {

    /* JADX INFO: renamed from: ۖ᩻ۧ, reason: not valid java name and contains not printable characters */
    private static final short[] f73696 = {2112, 29518, 29544, 29551, 29556, 29561, 29563, 29550, 29567, 29566, 29498, 29545, 29567, 29545, 29545, 29555, 29557, 29556, 29498, 29566, 29567, 29548, 29555, 29561, 29567, 29498, 29558, 29555, 29545, 29550, 29523, 29556, 29548, 29563, 29558, 29555, 29566, 29498, 29545, 29567, 29545, 29545, 29555, 29557, 29556, 29498, 29561, 29557, 29551, 29556, 29550, 29523, 29556, 29548, 29563, 29558, 29555, 29566, 29498, 29561, 29551, 29544, 29544, 29567, 29556, 29550, 29498, 29545, 29567, 29545, 29545, 29555, 29557, 29556, 29523, 29556, 29548, 29563, 29558, 29555, 29566, 29498, 29545, 29567, 29545, 29545, 29555, 29557, 29556, 29498, 29566, 29567, 29548, 29555, 29561, 29567, 29472, 29498, 29555, 29556, 29566, 29567, 29538, 29479, 29494, 29498, 29555, 29566, 29479, 29494, 29498, 29565, 29567, 29556, 29567, 29544, 29563, 29550, 29555, 29557, 29556, 29479, 29494, 29498, 29567, 29566, 29555, 29550, 29555, 29557, 29556, 29479, 29494, 29498, 29558, 29567, 29565, 29563, 29561, 29539, 29479, 29494, 29498, 29558, 29563, 29545, 29550, 29513, 29567, 29567, 29556, 29479, 29494, 29498, 29561, 29551, 29544, 29544, 29567, 29556, 29550, 29479};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f73697;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f73698;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f73699;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f73700;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f73701;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f73702;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f73703;

    /* JADX WARN: Code duplicated, block: B:47:0x019c  */
    public C22708(long j, long j2, int i, boolean z, String str, long j3, boolean z2) {
        int iM2761;
        int i2;
        int i3;
        int iM2762;
        int i4;
        int i5;
        int i6 = 2108733142;
        int i7 = C3492.f12043;
        int i8 = C2375.f7641;
        int iM2763 = C0619.m2761("۫᩵") ^ i8;
        int i9 = ((iM2763 ^ i7) * 13929) ^ (-606728632);
        int i10 = iM2763 ^ (-140271586);
        while (true) {
            i6 = ((((i6 ^ i7) * 22321) >> 31) & i9) ^ i10;
            switch (i6) {
                case -2088909683:
                case -1399123409:
                    this.f73703 = j;
                    this.f73698 = j2;
                    if (C1826.f6190 <= 0) {
                        iM2762 = C0773.m3169("᩹᩵") ^ i8;
                        i4 = ((iM2762 ^ i7) * (-3321)) ^ (-1689032166);
                        i5 = 2084653495;
                    } else {
                        iM2762 = (C0619.m2761("ܰܰ") ^ i8) * (-9);
                        i4 = ((iM2762 ^ i7) * (-21099)) ^ (-508777878);
                        i5 = -1735301189;
                    }
                    i10 = iM2762 ^ i5;
                    i9 = i4;
                    break;
                case -1856404628:
                case -521546963:
                    if (C3779.f12953 <= 0) {
                        iM2761 = C0773.m3169("ᩳ۟") ^ i7;
                        i2 = ((iM2761 ^ i8) * 25565) ^ (-1961635716);
                        i3 = -131122427;
                    } else {
                        iM2761 = C0619.m2761("ۛܰ") ^ i8;
                        i2 = ((iM2761 ^ i7) * (-21105)) ^ 572658554;
                        i3 = -830540628;
                    }
                    i10 = iM2761 ^ i3;
                    i9 = i2;
                    break;
                case -1796695280:
                case -1492673610:
                    if (C3690.m11987()) {
                        iM2761 = (C0619.m2761("ۗ֫") ^ i8) * (-109);
                        i2 = ((iM2761 ^ i7) * 25023) ^ 321671378;
                        i3 = -399282879;
                    } else {
                        iM2761 = C0619.m2761("᩵ۤ") ^ i8;
                        i2 = ((iM2761 ^ i7) * (-2413)) ^ 1201139526;
                        i3 = -1007361720;
                    }
                    i10 = iM2761 ^ i3;
                    i9 = i2;
                    break;
                case -1679075092:
                case 1772518611:
                    C2287.m7745();
                    C3998.m12920();
                    iM2762 = C0773.m3169("᩹᩵") ^ i8;
                    i4 = ((iM2762 ^ i7) * (-3321)) ^ (-1689032166);
                    i5 = 2084653495;
                    i10 = iM2762 ^ i5;
                    i9 = i4;
                    break;
                case -1222029762:
                case 2105008597:
                    if (C1146.m4231()) {
                        iM2761 = (C0619.m2761("۟ۚ") ^ i7) * 3;
                        i2 = ((iM2761 ^ i8) * 10677) ^ (-952844543);
                        i3 = -364240360;
                    } else {
                        iM2761 = C0773.m3169("ᩳ۟") ^ i7;
                        i2 = ((iM2761 ^ i8) * 25565) ^ (-1961635716);
                        i3 = -131122427;
                    }
                    i10 = iM2761 ^ i3;
                    i9 = i2;
                    break;
                case -1164731404:
                case -777455826:
                    this.f73702 = i;
                    if (C3734.f12817 < 0) {
                        iM2761 = (C0773.m3169("ۗܿ") + i7) * 115;
                        i2 = ((iM2761 ^ i8) * 13843) ^ 1767138942;
                        i3 = 649182211;
                        i10 = iM2761 ^ i3;
                        i9 = i2;
                    } else {
                        iM2762 = C0773.m3169("᩹᩵") ^ i8;
                        i4 = ((iM2762 ^ i7) * (-3321)) ^ (-1689032166);
                        i5 = 2084653495;
                        i10 = iM2762 ^ i5;
                        i9 = i4;
                    }
                    break;
                case -1163871392:
                case -69080879:
                    if (C0862.f3233 == 0) {
                        iM2761 = C0619.m2761("ܺۢ") ^ i7;
                        i2 = ((iM2761 ^ i8) * 5987) ^ (-1580133202);
                        i3 = -2028019407;
                        i10 = iM2761 ^ i3;
                        i9 = i2;
                    } else {
                        iM2762 = C0773.m3169("᩹᩵") ^ i8;
                        i4 = ((iM2762 ^ i7) * (-3321)) ^ (-1689032166);
                        i5 = 2084653495;
                        i10 = iM2762 ^ i5;
                        i9 = i4;
                    }
                    break;
                case -1109590080:
                case 2092736004:
                    if (C3690.f12684 <= 0) {
                        iM2761 = (C0619.m2761("ۚۡ") ^ i7) * (-89);
                        i2 = ((iM2761 ^ i8) * (-1277)) ^ 1204713646;
                        i3 = 1724343153;
                    } else {
                        iM2761 = (i7 - C0619.m2761("ۨ۫")) * 51;
                        i2 = ((iM2761 ^ i8) * 8265) ^ (-1076147411);
                        i3 = 258948592;
                    }
                    i10 = iM2761 ^ i3;
                    i9 = i2;
                    break;
                case -1081468688:
                case -560245856:
                    this.f73700 = z;
                    if (C1343.f4799 != 0) {
                        iM2761 = (C0619.m2761("ۗ֫") ^ i8) * (-109);
                        i2 = ((iM2761 ^ i7) * 25023) ^ 321671378;
                        i3 = -399282879;
                        i10 = iM2761 ^ i3;
                        i9 = i2;
                    } else {
                        int iM2764 = (i8 - C0619.m2761("ۡ᩶")) * 75;
                        i10 = iM2764 ^ 2018105192;
                        i9 = ((iM2764 ^ i7) * 2695) ^ 1683535939;
                    }
                    break;
                case -714362122:
                case 500235046:
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0773.m3169("᩵᩷") ^ i8;
                        i2 = ((iM2761 ^ i7) * (-1887)) ^ 368662238;
                        i3 = -1701101326;
                        i10 = iM2761 ^ i3;
                        i9 = i2;
                    }
                    iM2761 = (C0619.m2761("ۚۡ") ^ i7) * (-89);
                    i2 = ((iM2761 ^ i8) * (-1277)) ^ 1204713646;
                    i3 = 1724343153;
                    i10 = iM2761 ^ i3;
                    i9 = i2;
                    break;
                case -297362903:
                case 1941523877:
                    C2310.m7813();
                    if (C23916.f77426 > 0) {
                        iM2761 = C0773.m3169("ᩳ۟") ^ i7;
                        i2 = ((iM2761 ^ i8) * 25565) ^ (-1961635716);
                        i3 = -131122427;
                        i10 = iM2761 ^ i3;
                        i9 = i2;
                    } else {
                        iM2762 = C0773.m3169("᩹᩵") ^ i8;
                        i4 = ((iM2762 ^ i7) * (-3321)) ^ (-1689032166);
                        i5 = 2084653495;
                        i10 = iM2762 ^ i5;
                        i9 = i4;
                    }
                    break;
                case -157677182:
                case -63749748:
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0773.m3169("᩵᩷") ^ i8;
                        i2 = ((iM2761 ^ i7) * (-1887)) ^ 368662238;
                        i3 = -1701101326;
                    } else {
                        iM2761 = C0619.m2761("֡᩺") ^ i7;
                        i2 = ((iM2761 ^ i8) * 23479) ^ 1234856376;
                        i3 = 1368963811;
                    }
                    i10 = iM2761 ^ i3;
                    i9 = i2;
                    break;
                case -103017916:
                case 1151767044:
                    this.f73699 = str;
                    this.f73701 = j3;
                    this.f73697 = z2;
                    return;
                case 144478930:
                case 205832572:
                    C0773.m3161();
                    RunnableC1848.m6360();
                    throw new RuntimeException();
                case 831512644:
                case 1114566355:
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0773.m3169("ᩳ۟") ^ i7;
                        i2 = ((iM2761 ^ i8) * 25565) ^ (-1961635716);
                        i3 = -131122427;
                    } else {
                        iM2761 = (C0619.m2761("᩶۠") + i8) * (-127);
                        i2 = ((iM2761 ^ i7) * 19729) ^ (-1066032181);
                        i3 = -1834975921;
                    }
                    i10 = iM2761 ^ i3;
                    i9 = i2;
                    break;
                default:
                    if (C13473.f42873 != 0) {
                        iM2761 = (C0619.m2761("ۚۡ") ^ i7) * (-89);
                        i2 = ((iM2761 ^ i8) * (-1277)) ^ 1204713646;
                        i3 = 1724343153;
                        i10 = iM2761 ^ i3;
                        i9 = i2;
                    } else {
                        iM2762 = C0773.m3169("᩹᩵") ^ i8;
                        i4 = ((iM2762 ^ i7) * (-3321)) ^ (-1689032166);
                        i5 = 2084653495;
                        i10 = iM2762 ^ i5;
                        i9 = i4;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m51188(C13778 c13778, int i) throws IOException {
        int i2;
        int i3;
        int iM33683;
        long j;
        int i4;
        long jM33684;
        long j2;
        int i5;
        HashSet hashSet;
        long j3;
        int i6;
        IndexOutOfBoundsException e;
        int i7;
        HashSet hashSet2;
        int i8;
        int i9;
        int i10;
        int i11;
        long j4;
        int i12;
        long j5;
        int i13;
        int i14;
        long j6;
        int iM2761;
        int i15;
        int i16;
        int i17;
        int i18;
        int iM2762;
        int i19;
        int i20;
        int i21;
        int iM3169;
        int i22;
        int i23;
        int iM2763;
        int i24;
        int i25;
        int i26;
        int i27;
        long j7;
        int i28;
        long j8;
        int i29;
        long j9;
        int iM31610;
        int i30;
        int i31;
        long j10;
        long j11;
        int i32;
        int iM31611;
        int i33;
        int i34;
        long j12;
        int i35;
        int iM2764;
        int i36;
        int i37;
        int iM31612;
        int i38;
        int i39;
        int iM31613;
        int i40;
        int i41;
        int i42 = C4282.f15546;
        int i43 = C3779.f12953;
        int iM2765 = (i42 - C0619.m2761("֡ۜ")) * 11;
        int i44 = ((iM2765 ^ i43) * 241) ^ 1753809801;
        IndexOutOfBoundsException indexOutOfBoundsException = null;
        long j13 = 0;
        String strM4049 = null;
        long jM33685 = 0;
        long j14 = 0;
        int i45 = iM2765 ^ (-359661918);
        HashSet hashSet3 = null;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        ArrayList arrayList = null;
        int i49 = 0;
        int i50 = 0;
        int iM33684 = 0;
        int i51 = 0;
        int i52 = 112979248;
        int i53 = 0;
        boolean zM3502 = false;
        int i54 = 0;
        long j15 = 0;
        int i55 = 0;
        while (true) {
            i52 = i45 ^ (i44 & (((i52 ^ i43) * (-4347)) >> 31));
            switch (i52) {
                case -2077497917:
                case 1449649491:
                    throw new IOException(C2354.m7980(f73696, 51, 23, i48));
                case -2060282791:
                case 2099788156:
                    i5 = i46;
                    i47 = i47;
                    i26 = i55;
                    i27 = i50;
                    iM33684 = iM33684;
                    j12 = j13;
                    i35 = i51;
                    j10 = j15;
                    i53 = i53;
                    if (!zM3502) {
                        i29 = i53;
                        j9 = jM33685;
                        j7 = j12;
                        i28 = i35;
                        j8 = j10;
                        iM31610 = C0773.m3169("ۛۙ") ^ i43;
                        i30 = ((iM31610 ^ i42) * 11467) ^ 850635135;
                        i31 = 415749196;
                        int i56 = iM31610 ^ i31;
                        jM33685 = j9;
                        i49 = i49;
                        i47 = i47;
                        j15 = j8;
                        i53 = i29;
                        i45 = i56;
                        i44 = i30;
                        i51 = i28;
                        hashSet3 = hashSet3;
                        j13 = j7;
                        i50 = i27;
                        iM33684 = iM33684;
                        i46 = i5;
                        i55 = i26;
                    } else {
                        iM31613 = C0773.m3169("ܶ۠") ^ i42;
                        i40 = ((iM31613 ^ i43) * (-11205)) ^ (-1336843379);
                        i41 = -937089616;
                        i45 = iM31613 ^ i41;
                        i50 = i27;
                        i53 = i53;
                        iM33684 = iM33684;
                        i44 = i40;
                        i47 = i47;
                        i46 = i5;
                        i55 = i26;
                        j13 = j12;
                        i51 = i35;
                        j15 = j10;
                    }
                    break;
                case -2037681747:
                case 178484593:
                    hashSet3 = hashSet3;
                    i17 = i46;
                    i47 = i47;
                    i18 = i49;
                    i55 = i55;
                    iM33684 = iM33684;
                    i53 = i53;
                    i50 = i50;
                    j13 = j13;
                    i51 = i51;
                    j15 = j15;
                    j3 = jM33685;
                    if (i17 < 1) {
                        i46 = i17;
                        i49 = i18;
                        indexOutOfBoundsException = indexOutOfBoundsException;
                        iM2761 = C0773.m3169("۟ۘ") ^ i43;
                        i15 = ((iM2761 ^ i42) * (-15937)) ^ (-996151431);
                        i16 = -1975335026;
                        int i57 = iM2761 ^ i16;
                        indexOutOfBoundsException = indexOutOfBoundsException;
                        i47 = i47;
                        i46 = i46;
                        i6 = i53;
                        i45 = i57;
                        i44 = i15;
                        hashSet3 = hashSet3;
                        i52 = i52;
                        int i58 = iM33684;
                        i55 = i55;
                        i49 = i49;
                        jM33685 = j3;
                        j15 = j15;
                        i51 = i51;
                        j13 = j13;
                        i50 = i50;
                        iM33684 = i58;
                        i53 = i6;
                    } else {
                        iM2762 = (i42 - C0619.m2761("ۧۗ")) * 35;
                        i19 = ((iM2762 ^ i43) * 3409) ^ 1815149108;
                        i20 = -1905029004;
                        int i59 = iM2762 ^ i20;
                        jM33685 = j3;
                        j15 = j15;
                        i51 = i51;
                        j13 = j13;
                        i50 = i50;
                        iM33684 = iM33684;
                        i53 = i53;
                        i45 = i59;
                        i44 = i19;
                        i55 = i55;
                        i46 = i17;
                        i49 = i18;
                        hashSet3 = hashSet3;
                        i47 = i47;
                    }
                    break;
                case -2035929799:
                case -35345384:
                    throw new IOException(C2375.m8069(f73696, 1, 29, i48), indexOutOfBoundsException);
                case -2010146917:
                case -553219774:
                    i5 = i46;
                    i47 = i47;
                    i26 = i55;
                    i27 = i50;
                    iM33684 = iM33684;
                    j11 = j13;
                    i28 = i51;
                    j10 = j15;
                    i32 = i53;
                    j9 = jM33685;
                    if (i28 < 1) {
                        hashSet3 = hashSet3;
                        i29 = i32;
                        i49 = i49;
                        j7 = j11;
                        j8 = j10;
                        iM31610 = C0773.m3169("ۛۙ") ^ i43;
                        i30 = ((iM31610 ^ i42) * 11467) ^ 850635135;
                        i31 = 415749196;
                        int i510 = iM31610 ^ i31;
                        jM33685 = j9;
                        i49 = i49;
                        i47 = i47;
                        j15 = j8;
                        i53 = i29;
                        i45 = i510;
                        i44 = i30;
                        i51 = i28;
                        hashSet3 = hashSet3;
                        j13 = j7;
                        i50 = i27;
                        iM33684 = iM33684;
                        i46 = i5;
                        i55 = i26;
                    } else {
                        iM31611 = (i43 - C0773.m3169("ܽۨ")) * 47;
                        i33 = ((iM31611 ^ i42) * (-16243)) ^ 1471427443;
                        i34 = -104636097;
                        i45 = iM31611 ^ i34;
                        i50 = i27;
                        i53 = i32;
                        iM33684 = iM33684;
                        i44 = i33;
                        i51 = i28;
                        jM33685 = j9;
                        i47 = i47;
                        i46 = i5;
                        i55 = i26;
                        j13 = j11;
                        j15 = j10;
                    }
                    break;
                case -1966351630:
                case 1026513471:
                    i5 = i46;
                    i47 = i47;
                    i26 = i55;
                    i27 = i50;
                    iM33684 = iM33684;
                    j12 = j13;
                    i35 = i51;
                    j10 = j15;
                    i53 = i53;
                    j9 = jM33685;
                    if (j9 < 0) {
                        i29 = i53;
                        j7 = j12;
                        i28 = i35;
                        j8 = j10;
                        iM31610 = C0773.m3169("ۛۙ") ^ i43;
                        i30 = ((iM31610 ^ i42) * 11467) ^ 850635135;
                        i31 = 415749196;
                        int i511 = iM31610 ^ i31;
                        jM33685 = j9;
                        i49 = i49;
                        i47 = i47;
                        j15 = j8;
                        i53 = i29;
                        i45 = i511;
                        i44 = i30;
                        i51 = i28;
                        hashSet3 = hashSet3;
                        j13 = j7;
                        i50 = i27;
                        iM33684 = iM33684;
                        i46 = i5;
                        i55 = i26;
                    } else {
                        iM31612 = (i43 - C0619.m2761("ᩴۙ")) * (-43);
                        i38 = ((iM31612 ^ i42) * 16701) ^ 339724309;
                        i39 = 798911583;
                        i45 = iM31612 ^ i39;
                        i50 = i27;
                        i53 = i53;
                        iM33684 = iM33684;
                        i44 = i38;
                        jM33685 = j9;
                        i47 = i47;
                        i46 = i5;
                        i55 = i26;
                        j13 = j12;
                        i51 = i35;
                        j15 = j10;
                    }
                    break;
                case -1958637952:
                case 1756580104:
                    j3 = jM33685;
                    i48 = 52875;
                    iM2761 = C0773.m3169("᩸᩻") ^ i42;
                    i15 = ((iM2761 ^ i43) * 16675) ^ 119780839;
                    i16 = -1015564946;
                    int i512 = iM2761 ^ i16;
                    indexOutOfBoundsException = indexOutOfBoundsException;
                    i47 = i47;
                    i46 = i46;
                    i6 = i53;
                    i45 = i512;
                    i44 = i15;
                    hashSet3 = hashSet3;
                    i52 = i52;
                    int i513 = iM33684;
                    i55 = i55;
                    i49 = i49;
                    jM33685 = j3;
                    j15 = j15;
                    i51 = i51;
                    j13 = j13;
                    i50 = i50;
                    iM33684 = i513;
                    i53 = i6;
                    break;
                case -1942520037:
                case -165694970:
                    hashSet3 = hashSet3;
                    i17 = i46;
                    i47 = i47;
                    i18 = i49;
                    i55 = i55;
                    int i60 = i50;
                    iM33684 = iM33684;
                    j13 = j13;
                    i51 = i51;
                    j15 = j15;
                    i53 = i53;
                    j3 = jM33685;
                    if (i17 > i) {
                        i50 = i60;
                        i46 = i17;
                        i49 = i18;
                        indexOutOfBoundsException = indexOutOfBoundsException;
                        iM2761 = C0773.m3169("۟ۘ") ^ i43;
                        i15 = ((iM2761 ^ i42) * (-15937)) ^ (-996151431);
                        i16 = -1975335026;
                        int i514 = iM2761 ^ i16;
                        indexOutOfBoundsException = indexOutOfBoundsException;
                        i47 = i47;
                        i46 = i46;
                        i6 = i53;
                        i45 = i514;
                        i44 = i15;
                        hashSet3 = hashSet3;
                        i52 = i52;
                        int i515 = iM33684;
                        i55 = i55;
                        i49 = i49;
                        jM33685 = j3;
                        j15 = j15;
                        i51 = i51;
                        j13 = j13;
                        i50 = i50;
                        iM33684 = i515;
                        i53 = i6;
                    } else {
                        iM2762 = C0619.m2761("ܳᩴ") ^ i43;
                        i50 = i60;
                        i19 = ((iM2762 ^ i42) * 24069) ^ (-914512797);
                        i20 = -1730929790;
                        int i516 = iM2762 ^ i20;
                        jM33685 = j3;
                        j15 = j15;
                        i51 = i51;
                        j13 = j13;
                        i50 = i50;
                        iM33684 = iM33684;
                        i53 = i53;
                        i45 = i516;
                        i44 = i19;
                        i55 = i55;
                        i46 = i17;
                        i49 = i18;
                        hashSet3 = hashSet3;
                        i47 = i47;
                    }
                    break;
                case -1886894340:
                case -1320371435:
                    HashSet hashSet4 = hashSet3;
                    i2 = i46;
                    i47 = i47;
                    i3 = i49;
                    i55 = i55;
                    iM33683 = i50;
                    iM33684 = iM33684;
                    j = j13;
                    i4 = i51;
                    jM33684 = j15;
                    i53 = i53;
                    j2 = jM33685;
                    try {
                        arrayList = new ArrayList(i2);
                        try {
                            HashSet hashSet5 = new HashSet();
                            int iM2766 = (i42 - C0619.m2761("ۙᩳ")) * (-97);
                            hashSet = hashSet5;
                            i44 = ((iM2766 ^ i43) * (-15555)) ^ (-398054986);
                            jM33685 = j2;
                            i53 = i53;
                            i45 = iM2766 ^ 1912480083;
                            j15 = jM33684;
                            i51 = i4;
                            j13 = j;
                            i50 = iM33683;
                            iM33684 = iM33684;
                            i46 = i2;
                            i55 = i55;
                            hashSet3 = hashSet;
                            i49 = i3;
                            i47 = i47;
                        } catch (IndexOutOfBoundsException e2) {
                            indexOutOfBoundsException = e2;
                            i5 = i2;
                            i49 = i3;
                            hashSet3 = null;
                            j6 = j;
                            i50 = iM33683;
                            jM33685 = j2;
                            j15 = jM33684;
                            i51 = i4;
                            j13 = j6;
                            int iM31614 = C0773.m3169("᩵۠") ^ i42;
                            i53 = i53;
                            i45 = iM31614 ^ (-649844730);
                            i44 = ((iM31614 ^ i43) * (-1707)) ^ (-1365780631);
                            iM33684 = iM33684;
                            i55 = i55;
                            i49 = i49;
                            jM33685 = jM33685;
                            i47 = i47;
                            i46 = i5;
                        }
                    } catch (IndexOutOfBoundsException e3) {
                        indexOutOfBoundsException = e3;
                        i5 = i2;
                        i49 = i3;
                        hashSet3 = hashSet4;
                        arrayList = null;
                    }
                    break;
                case -1731414532:
                case -1090128073:
                    i5 = i46;
                    i47 = i47;
                    i26 = i55;
                    i27 = i50;
                    iM33684 = iM33684;
                    j12 = j13;
                    i35 = i51;
                    j10 = j15;
                    i53 = i53;
                    j9 = jM33685;
                    if (i27 != i53) {
                        i29 = i53;
                        j7 = j12;
                        i28 = i35;
                        j8 = j10;
                        iM31610 = C0773.m3169("ۛۙ") ^ i43;
                        i30 = ((iM31610 ^ i42) * 11467) ^ 850635135;
                        i31 = 415749196;
                        int i517 = iM31610 ^ i31;
                        jM33685 = j9;
                        i49 = i49;
                        i47 = i47;
                        j15 = j8;
                        i53 = i29;
                        i45 = i517;
                        i44 = i30;
                        i51 = i28;
                        hashSet3 = hashSet3;
                        j13 = j7;
                        i50 = i27;
                        iM33684 = iM33684;
                        i46 = i5;
                        i55 = i26;
                    } else {
                        i53 = i53;
                        iM2764 = C0619.m2761("۟֨") ^ i43;
                        i36 = ((iM2764 ^ i42) * 21797) ^ 628011042;
                        i37 = 1795581733;
                        i45 = iM2764 ^ i37;
                        i50 = i27;
                        i44 = i36;
                        iM33684 = iM33684;
                        jM33685 = j9;
                        i47 = i47;
                        i46 = i5;
                        i55 = i26;
                        j13 = j12;
                        i51 = i35;
                        j15 = j10;
                    }
                    break;
                case -1545976479:
                case 766975390:
                    hashSet3 = hashSet3;
                    int i61 = i46;
                    i47 = i47;
                    int i62 = i49;
                    i55 = i55;
                    iM33684 = iM33684;
                    i53 = i53;
                    i50 = i50;
                    j13 = j13;
                    i51 = i51;
                    j15 = j15;
                    j3 = jM33685;
                    try {
                        i5 = i61;
                        i49 = i62;
                        throw new IOException(C3099.m10092(f73696, 30, 21, i48));
                    } catch (IndexOutOfBoundsException e4) {
                        e = e4;
                        i5 = i61;
                        i49 = i62;
                        indexOutOfBoundsException = e;
                        jM33685 = j3;
                        hashSet3 = hashSet3;
                        j15 = j15;
                        i51 = i51;
                        j13 = j13;
                        i50 = i50;
                        int iM31615 = C0773.m3169("᩵۠") ^ i42;
                        i53 = i53;
                        i45 = iM31615 ^ (-649844730);
                        i44 = ((iM31615 ^ i43) * (-1707)) ^ (-1365780631);
                        iM33684 = iM33684;
                        i55 = i55;
                        i49 = i49;
                        jM33685 = jM33685;
                        i47 = i47;
                        i46 = i5;
                    }
                    break;
                case -1352154812:
                case 828331556:
                    i5 = i46;
                    i47 = i47;
                    i7 = i55;
                    iM33683 = i50;
                    iM33684 = iM33684;
                    j = j13;
                    i4 = i51;
                    long j16 = j15;
                    i53 = i53;
                    j2 = jM33685;
                    try {
                        StringBuilder sb = new StringBuilder();
                        try {
                            hashSet2 = hashSet3;
                            try {
                                try {
                                    C1783.m6234(sb, C2023.m6966(f73696, 74, 30, i48));
                                    C3779.m12269(sb, i49);
                                    try {
                                        C3779.m12258(sb, C1564.m5510(f73696, IShizukuService.Stub.TRANSACTION_isHidden, 5, i48));
                                        jM33684 = j16;
                                        try {
                                            sb.append(jM33684);
                                            try {
                                                C1783.m6234(sb, C2966.m9670(f73696, 109, 13, i48));
                                                sb.append(j);
                                                C1783.m6234(sb, RunnableC1848.m6366(f73696, 122, 10, i48));
                                                C3779.m12269(sb, i4);
                                                C1783.m6234(sb, C3734.m12149(f73696, 132, 9, i48));
                                                C3779.m12269(sb, iM33683);
                                                C1783.m6234(sb, C0950.m3780(f73696, 141, 11, i48));
                                                sb.append(j2);
                                                C1783.m6234(sb, C2287.m7749(f73696, 152, 10, i48));
                                                C1783.m6237(sb, iM33684);
                                                throw new IOException(C2023.m6952(sb));
                                            } catch (IndexOutOfBoundsException e5) {
                                                e = e5;
                                                i53 = i53;
                                                i8 = i49;
                                                indexOutOfBoundsException = e;
                                                hashSet3 = hashSet2;
                                                i49 = i8;
                                                i55 = i7;
                                                j6 = j;
                                                i50 = iM33683;
                                                jM33685 = j2;
                                                j15 = jM33684;
                                                i51 = i4;
                                                j13 = j6;
                                                int iM31616 = C0773.m3169("᩵۠") ^ i42;
                                                i53 = i53;
                                                i45 = iM31616 ^ (-649844730);
                                                i44 = ((iM31616 ^ i43) * (-1707)) ^ (-1365780631);
                                                iM33684 = iM33684;
                                                i55 = i55;
                                                i49 = i49;
                                                jM33685 = jM33685;
                                                i47 = i47;
                                                i46 = i5;
                                            }
                                        } catch (IndexOutOfBoundsException e6) {
                                            e = e6;
                                            indexOutOfBoundsException = e;
                                            i49 = i49;
                                            hashSet3 = hashSet2;
                                            i55 = i7;
                                            j6 = j;
                                            i50 = iM33683;
                                            jM33685 = j2;
                                            j15 = jM33684;
                                            i51 = i4;
                                            j13 = j6;
                                            int iM31617 = C0773.m3169("᩵۠") ^ i42;
                                            i53 = i53;
                                            i45 = iM31617 ^ (-649844730);
                                            i44 = ((iM31617 ^ i43) * (-1707)) ^ (-1365780631);
                                            iM33684 = iM33684;
                                            i55 = i55;
                                            i49 = i49;
                                            jM33685 = jM33685;
                                            i47 = i47;
                                            i46 = i5;
                                        }
                                    } catch (IndexOutOfBoundsException e7) {
                                        e = e7;
                                        i53 = i53;
                                        i8 = i49;
                                        jM33684 = j16;
                                        indexOutOfBoundsException = e;
                                        hashSet3 = hashSet2;
                                        i49 = i8;
                                        i55 = i7;
                                        j6 = j;
                                        i50 = iM33683;
                                        jM33685 = j2;
                                        j15 = jM33684;
                                        i51 = i4;
                                        j13 = j6;
                                        int iM31618 = C0773.m3169("᩵۠") ^ i42;
                                        i53 = i53;
                                        i45 = iM31618 ^ (-649844730);
                                        i44 = ((iM31618 ^ i43) * (-1707)) ^ (-1365780631);
                                        iM33684 = iM33684;
                                        i55 = i55;
                                        i49 = i49;
                                        jM33685 = jM33685;
                                        i47 = i47;
                                        i46 = i5;
                                    }
                                } catch (IndexOutOfBoundsException e8) {
                                    e = e8;
                                    jM33684 = j16;
                                }
                            } catch (IndexOutOfBoundsException e9) {
                                e = e9;
                            }
                        } catch (IndexOutOfBoundsException e10) {
                            e = e10;
                            hashSet2 = hashSet3;
                        }
                    } catch (IndexOutOfBoundsException e11) {
                        i53 = i53;
                        jM33684 = j16;
                        indexOutOfBoundsException = e11;
                        i49 = i49;
                    }
                    break;
                case -1269064815:
                case -326730545:
                    i5 = i46;
                    i9 = i55;
                    i10 = i50;
                    i11 = iM33684;
                    j4 = j13;
                    i12 = i51;
                    j5 = j15;
                    i13 = i53;
                    i14 = 255;
                    if (i11 == 255) {
                        int iM31619 = (C0773.m3169("֫᩶") + i43) * 95;
                        i45 = iM31619 ^ 1353034318;
                        i53 = i13;
                        iM33684 = i11;
                        i44 = ((iM31619 ^ i42) * 9987) ^ 217597267;
                        i55 = i9;
                        j13 = j4;
                        i51 = i12;
                        j15 = j5;
                        i47 = 255;
                    } else {
                        i54 = i9;
                        int iM2767 = C0619.m2761("᩷ۢ") ^ i42;
                        i45 = iM2767 ^ (-679480358);
                        i53 = i13;
                        iM33684 = i11;
                        i55 = i9;
                        j13 = j4;
                        i51 = i12;
                        j15 = j5;
                        i47 = i14;
                        i44 = ((iM2767 ^ i43) * 8245) ^ (-851810927);
                    }
                    i50 = i10;
                    i46 = i5;
                    break;
                case -1153554275:
                case 2039387228:
                    hashSet3 = hashSet3;
                    i46 = i46;
                    i47 = i47;
                    i53 = i53;
                    indexOutOfBoundsException = indexOutOfBoundsException;
                    i50 = i50;
                    long j17 = jM33685;
                    i49 = i49;
                    i55 = i55;
                    iM33684 = iM33684;
                    j13 = j13;
                    i51 = i51;
                    j15 = j15;
                    j3 = j17;
                    short s = f73696[0];
                    if ((s * 9968) - ((s * s) + 24840256) > 0) {
                        iM2761 = C0773.m3169("᩹ۨ") ^ i42;
                        i15 = ((iM2761 ^ i43) * 20597) ^ 867289108;
                        i16 = 1276366226;
                    } else {
                        iM2761 = C0619.m2761("ܰۚ") ^ i43;
                        i15 = ((iM2761 ^ i42) * (-24567)) ^ 1966105702;
                        i16 = 1298831145;
                    }
                    int i518 = iM2761 ^ i16;
                    indexOutOfBoundsException = indexOutOfBoundsException;
                    i47 = i47;
                    i46 = i46;
                    i6 = i53;
                    i45 = i518;
                    i44 = i15;
                    hashSet3 = hashSet3;
                    i52 = i52;
                    int i519 = iM33684;
                    i55 = i55;
                    i49 = i49;
                    jM33685 = j3;
                    j15 = j15;
                    i51 = i51;
                    j13 = j13;
                    i50 = i50;
                    iM33684 = i519;
                    i53 = i6;
                    break;
                case -1071798468:
                case -246551046:
                    hashSet = hashSet3;
                    i2 = i46;
                    i47 = i47;
                    i3 = i49;
                    i55 = i55;
                    iM33683 = i50;
                    iM33684 = iM33684;
                    j = j13;
                    i4 = i51;
                    jM33684 = j15;
                    int i63 = i53;
                    long j18 = jM33685;
                    if (i3 < i2) {
                        iM3169 = C0773.m3169("ܶ᩵") ^ i42;
                        i22 = ((iM3169 ^ i43) * 32087) ^ (-1027521809);
                        i23 = -153337253;
                    } else {
                        iM3169 = (C0773.m3169("᩻֡") ^ i43) * (-115);
                        i22 = ((iM3169 ^ i42) * 7975) ^ 1038387517;
                        i23 = -1486370659;
                    }
                    int i64 = iM3169 ^ i23;
                    jM33685 = j18;
                    i53 = i63;
                    i45 = i64;
                    i44 = i22;
                    j15 = jM33684;
                    i51 = i4;
                    j13 = j;
                    i50 = iM33683;
                    iM33684 = iM33684;
                    i46 = i2;
                    i55 = i55;
                    hashSet3 = hashSet;
                    i49 = i3;
                    i47 = i47;
                    break;
                case -1061164590:
                case 789667901:
                    hashSet3 = hashSet3;
                    i46 = i46;
                    i47 = i47;
                    i53 = i53;
                    indexOutOfBoundsException = indexOutOfBoundsException;
                    i50 = i50;
                    long j19 = jM33685;
                    i49 = i49;
                    i55 = i55;
                    iM33684 = iM33684;
                    j13 = j13;
                    i51 = i51;
                    j15 = j15;
                    j3 = j19;
                    if (i <= 255) {
                        iM2761 = C0619.m2761("ۡۖ") ^ i43;
                        i15 = ((iM2761 ^ i42) * (-15941)) ^ (-1697103954);
                        i16 = 591130706;
                    } else {
                        iM2761 = C0773.m3169("۟ۘ") ^ i43;
                        i15 = ((iM2761 ^ i42) * (-15937)) ^ (-996151431);
                        i16 = -1975335026;
                    }
                    int i5110 = iM2761 ^ i16;
                    indexOutOfBoundsException = indexOutOfBoundsException;
                    i47 = i47;
                    i46 = i46;
                    i6 = i53;
                    i45 = i5110;
                    i44 = i15;
                    hashSet3 = hashSet3;
                    i52 = i52;
                    int i5111 = iM33684;
                    i55 = i55;
                    i49 = i49;
                    jM33685 = j3;
                    j15 = j15;
                    i51 = i51;
                    j13 = j13;
                    i50 = i50;
                    iM33684 = i5111;
                    i53 = i6;
                    break;
                case -996321477:
                case 1429814980:
                    i5 = i46;
                    i47 = i47;
                    i26 = i55;
                    i27 = i50;
                    iM33684 = iM33684;
                    j7 = j13;
                    i28 = i51;
                    j10 = j15;
                    int i65 = i53;
                    j9 = jM33685;
                    if (j7 > j14) {
                        int iM2768 = (C0619.m2761("᩸۠") ^ i42) * 53;
                        i45 = iM2768 ^ 1245570211;
                        i53 = i65;
                        i44 = ((iM2768 ^ i43) * (-18789)) ^ 1587791604;
                        i51 = i28;
                        jM33685 = j9;
                        i47 = i47;
                        j15 = j10;
                    } else {
                        hashSet3 = hashSet3;
                        i29 = i65;
                        i49 = i49;
                        j8 = j10;
                        iM31610 = C0773.m3169("ۛۙ") ^ i43;
                        i30 = ((iM31610 ^ i42) * 11467) ^ 850635135;
                        i31 = 415749196;
                        int i5112 = iM31610 ^ i31;
                        jM33685 = j9;
                        i49 = i49;
                        i47 = i47;
                        j15 = j8;
                        i53 = i29;
                        i45 = i5112;
                        i44 = i30;
                        i51 = i28;
                        hashSet3 = hashSet3;
                    }
                    j13 = j7;
                    i50 = i27;
                    iM33684 = iM33684;
                    i46 = i5;
                    i55 = i26;
                    break;
                case -873140944:
                case 1989575778:
                    hashSet3 = hashSet3;
                    i5 = i46;
                    i47 = i47;
                    i26 = i55;
                    i27 = i50;
                    iM33684 = iM33684;
                    j7 = j13;
                    i28 = i51;
                    j8 = j15;
                    i29 = i53;
                    j9 = jM33685;
                    i49 = i49;
                    j14 = 0;
                    if (j8 > 0) {
                        iM31610 = C0773.m3169("֡ܳ") ^ i42;
                        i30 = ((iM31610 ^ i43) * 15593) ^ 1664180998;
                        i31 = -532783716;
                    } else {
                        iM31610 = C0773.m3169("ۛۙ") ^ i43;
                        i30 = ((iM31610 ^ i42) * 11467) ^ 850635135;
                        i31 = 415749196;
                    }
                    int i5113 = iM31610 ^ i31;
                    jM33685 = j9;
                    i49 = i49;
                    i47 = i47;
                    j15 = j8;
                    i53 = i29;
                    i45 = i5113;
                    i44 = i30;
                    i51 = i28;
                    hashSet3 = hashSet3;
                    j13 = j7;
                    i50 = i27;
                    iM33684 = iM33684;
                    i46 = i5;
                    i55 = i26;
                    break;
                case -784019457:
                case -405322376:
                    hashSet3 = hashSet3;
                    i5 = i46;
                    i47 = i47;
                    i53 = i53;
                    IndexOutOfBoundsException indexOutOfBoundsException2 = indexOutOfBoundsException;
                    i50 = i50;
                    long j20 = jM33685;
                    i49 = i49;
                    i55 = i55;
                    iM33684 = iM33684;
                    j13 = j13;
                    i51 = i51;
                    j15 = j15;
                    j3 = j20;
                    try {
                        int iM33685 = c13778.m33683();
                        int iM31620 = (i43 - C0773.m3169("᩹ۗ")) * (-11);
                        indexOutOfBoundsException = indexOutOfBoundsException2;
                        i46 = iM33685;
                        i44 = ((iM31620 ^ i42) * (-25561)) ^ (-1675534828);
                        i47 = i47;
                        i6 = i53;
                        i45 = iM31620 ^ 428267813;
                        hashSet3 = hashSet3;
                        i52 = i52;
                        int i5114 = iM33684;
                        i55 = i55;
                        i49 = i49;
                        jM33685 = j3;
                        j15 = j15;
                        i51 = i51;
                        j13 = j13;
                        i50 = i50;
                        iM33684 = i5114;
                        i53 = i6;
                    } catch (IndexOutOfBoundsException e12) {
                        e = e12;
                        indexOutOfBoundsException = e;
                        jM33685 = j3;
                        hashSet3 = hashSet3;
                        j15 = j15;
                        i51 = i51;
                        j13 = j13;
                        i50 = i50;
                        int iM316110 = C0773.m3169("᩵۠") ^ i42;
                        i53 = i53;
                        i45 = iM316110 ^ (-649844730);
                        i44 = ((iM316110 ^ i43) * (-1707)) ^ (-1365780631);
                        iM33684 = iM33684;
                        i55 = i55;
                        i49 = i49;
                        jM33685 = jM33685;
                        i47 = i47;
                        i46 = i5;
                    }
                    break;
                case -686890061:
                case -397017235:
                    HashSet hashSet6 = hashSet3;
                    int i66 = i46;
                    int i67 = i47;
                    int i68 = i55;
                    int i69 = i50;
                    int i70 = iM33684;
                    long j21 = j13;
                    int i71 = i51;
                    long j22 = j15;
                    int i72 = i53;
                    long j23 = jM33685;
                    int i73 = i49;
                    if (i68 == 1) {
                        iM2763 = (C0619.m2761("᩵ۤ") + i42) * (-127);
                        i24 = ((iM2763 ^ i43) * 30481) ^ (-542066055);
                        i25 = 763268569;
                    } else {
                        iM2763 = C0619.m2761("ۡۢ") ^ i43;
                        i24 = ((iM2763 ^ i42) * (-5621)) ^ (-1463594362);
                        i25 = 2147442756;
                    }
                    int i74 = iM2763 ^ i25;
                    jM33685 = j23;
                    i47 = i67;
                    j15 = j22;
                    i51 = i71;
                    j13 = j21;
                    i50 = i69;
                    iM33684 = i70;
                    i46 = i66;
                    i55 = i68;
                    i49 = i73;
                    i53 = i72;
                    i45 = i74;
                    i44 = i24;
                    hashSet3 = hashSet6;
                    i52 = i52;
                    break;
                case -426261347:
                case -203458684:
                    try {
                        i5 = i46;
                        i26 = i55;
                        i27 = i50;
                        iM33684 = iM33684;
                        j12 = j13;
                        i35 = i51;
                        j10 = j15;
                        try {
                            C1519.m5406(arrayList, new C22708(j15, j13, i51, i50 == i47, strM4049, jM33685, iM33684 == i47));
                            iM31613 = (i42 - C0773.m3169("۟ܺ")) * 41;
                            i40 = ((iM31613 ^ i43) * 18293) ^ 718069475;
                            i41 = 861021163;
                            i45 = iM31613 ^ i41;
                            i50 = i27;
                            i53 = i53;
                            iM33684 = iM33684;
                            i44 = i40;
                            i47 = i47;
                            i46 = i5;
                            i55 = i26;
                            j13 = j12;
                            i51 = i35;
                            j15 = j10;
                        } catch (IndexOutOfBoundsException e13) {
                            indexOutOfBoundsException = e13;
                            i50 = i27;
                            j13 = j12;
                            i51 = i35;
                            j15 = j10;
                            i49 = i49;
                            i55 = i26;
                            int iM316111 = C0773.m3169("᩵۠") ^ i42;
                            i53 = i53;
                            i45 = iM316111 ^ (-649844730);
                            i44 = ((iM316111 ^ i43) * (-1707)) ^ (-1365780631);
                            iM33684 = iM33684;
                            i55 = i55;
                            i49 = i49;
                            jM33685 = jM33685;
                            i47 = i47;
                            i46 = i5;
                        }
                    } catch (IndexOutOfBoundsException e14) {
                        i5 = i46;
                        i47 = i47;
                        i26 = i55;
                        iM33684 = iM33684;
                        indexOutOfBoundsException = e14;
                    }
                    break;
                case -314280191:
                case 1313665134:
                    i49++;
                    i21 = i54;
                    int iM2769 = C0619.m2761("ۖ۠") ^ i42;
                    jM33685 = jM33685;
                    i53 = i53;
                    i45 = iM2769 ^ (-705787867);
                    i44 = ((iM2769 ^ i43) * 15641) ^ 1495022855;
                    j15 = j15;
                    i51 = i51;
                    j13 = j13;
                    i50 = i50;
                    iM33684 = iM33684;
                    i46 = i46;
                    i55 = i21;
                    hashSet3 = hashSet3;
                    i47 = i47;
                    break;
                case -212220566:
                case 1117709498:
                    i5 = i46;
                    i47 = i47;
                    i26 = i55;
                    i27 = i50;
                    iM33684 = iM33684;
                    j12 = j13;
                    i35 = i51;
                    j10 = j15;
                    i53 = i53;
                    j9 = jM33685;
                    if (iM33684 != 0) {
                        iM31612 = C0773.m3169("ۨۛ") ^ i42;
                        i38 = ((iM31612 ^ i43) * 997) ^ (-731731673);
                        i39 = 270494537;
                    } else {
                        iM31612 = (C0773.m3169("ᩳ᩻") ^ i42) * 119;
                        i38 = ((iM31612 ^ i43) * (-16359)) ^ 538680488;
                        i39 = 1006574372;
                    }
                    i45 = iM31612 ^ i39;
                    i50 = i27;
                    i53 = i53;
                    iM33684 = iM33684;
                    i44 = i38;
                    jM33685 = j9;
                    i47 = i47;
                    i46 = i5;
                    i55 = i26;
                    j13 = j12;
                    i51 = i35;
                    j15 = j10;
                    break;
                case -161890361:
                case 241832132:
                    i5 = i46;
                    i47 = i47;
                    i26 = i55;
                    i27 = i50;
                    iM33684 = iM33684;
                    j12 = j13;
                    i35 = i51;
                    j10 = j15;
                    j9 = jM33685;
                    i53 = 255;
                    if (i27 != 0) {
                        iM2764 = C0619.m2761("᩸֡") ^ i43;
                        i36 = ((iM2764 ^ i42) * 19505) ^ 1325160225;
                        i37 = -1319643421;
                    } else {
                        iM2764 = C0619.m2761("۟֨") ^ i43;
                        i36 = ((iM2764 ^ i42) * 21797) ^ 628011042;
                        i37 = 1795581733;
                    }
                    i45 = iM2764 ^ i37;
                    i50 = i27;
                    i44 = i36;
                    iM33684 = iM33684;
                    jM33685 = j9;
                    i47 = i47;
                    i46 = i5;
                    i55 = i26;
                    j13 = j12;
                    i51 = i35;
                    j15 = j10;
                    break;
                case -66451041:
                case 745374778:
                    i5 = i46;
                    i47 = i47;
                    i26 = i55;
                    i27 = i50;
                    iM33684 = iM33684;
                    j12 = j13;
                    i35 = i51;
                    j10 = j15;
                    i53 = i53;
                    zM3502 = C0862.m3502(hashSet3, C3690.m12001(j10));
                    iM31613 = (i43 - C0773.m3169("ᩴᩴ")) * (-57);
                    i40 = ((iM31613 ^ i42) * 13077) ^ 2119654718;
                    i41 = 954337571;
                    i45 = iM31613 ^ i41;
                    i50 = i27;
                    i53 = i53;
                    iM33684 = iM33684;
                    i44 = i40;
                    i47 = i47;
                    i46 = i5;
                    i55 = i26;
                    j13 = j12;
                    i51 = i35;
                    j15 = j10;
                    break;
                case -61381123:
                case 1056702390:
                    return arrayList;
                case 675957340:
                case 1064405681:
                    i54 = i55 + 1;
                    i5 = i46;
                    i14 = i47;
                    i9 = i55;
                    i10 = i50;
                    i11 = iM33684;
                    j4 = j13;
                    i12 = i51;
                    j5 = j15;
                    i13 = i53;
                    int iM27610 = C0619.m2761("᩷ۢ") ^ i42;
                    i45 = iM27610 ^ (-679480358);
                    i53 = i13;
                    iM33684 = i11;
                    i55 = i9;
                    j13 = j4;
                    i51 = i12;
                    j15 = j5;
                    i47 = i14;
                    i44 = ((iM27610 ^ i43) * 8245) ^ (-851810927);
                    i50 = i10;
                    i46 = i5;
                    break;
                case 884738223:
                case 1735568792:
                    i5 = i46;
                    i47 = i47;
                    i26 = i55;
                    i27 = i50;
                    iM33684 = iM33684;
                    j12 = j13;
                    i35 = i51;
                    j10 = j15;
                    i53 = i53;
                    if (iM33684 != i53) {
                        i29 = i53;
                        j9 = jM33685;
                        j7 = j12;
                        i28 = i35;
                        j8 = j10;
                        iM31610 = C0773.m3169("ۛۙ") ^ i43;
                        i30 = ((iM31610 ^ i42) * 11467) ^ 850635135;
                        i31 = 415749196;
                        int i5115 = iM31610 ^ i31;
                        jM33685 = j9;
                        i49 = i49;
                        i47 = i47;
                        j15 = j8;
                        i53 = i29;
                        i45 = i5115;
                        i44 = i30;
                        i51 = i28;
                        hashSet3 = hashSet3;
                        j13 = j7;
                        i50 = i27;
                        iM33684 = iM33684;
                        i46 = i5;
                        i55 = i26;
                    } else {
                        j9 = jM33685;
                        iM31612 = (C0773.m3169("ᩳ᩻") ^ i42) * 119;
                        i38 = ((iM31612 ^ i43) * (-16359)) ^ 538680488;
                        i39 = 1006574372;
                        i45 = iM31612 ^ i39;
                        i50 = i27;
                        i53 = i53;
                        iM33684 = iM33684;
                        i44 = i38;
                        jM33685 = j9;
                        i47 = i47;
                        i46 = i5;
                        i55 = i26;
                        j13 = j12;
                        i51 = i35;
                        j15 = j10;
                    }
                    break;
                case 1149104130:
                case 1693592501:
                    j3 = jM33685;
                    i48 = 29466;
                    iM2761 = C0773.m3169("᩸᩻") ^ i42;
                    i15 = ((iM2761 ^ i43) * 16675) ^ 119780839;
                    i16 = -1015564946;
                    int i5116 = iM2761 ^ i16;
                    indexOutOfBoundsException = indexOutOfBoundsException;
                    i47 = i47;
                    i46 = i46;
                    i6 = i53;
                    i45 = i5116;
                    i44 = i15;
                    hashSet3 = hashSet3;
                    i52 = i52;
                    int i5117 = iM33684;
                    i55 = i55;
                    i49 = i49;
                    jM33685 = j3;
                    j15 = j15;
                    i51 = i51;
                    j13 = j13;
                    i50 = i50;
                    iM33684 = i5117;
                    i53 = i6;
                    break;
                case 1527679770:
                case 2042778393:
                    i5 = i46;
                    i47 = i47;
                    i26 = i55;
                    i27 = i50;
                    iM33684 = iM33684;
                    j11 = j13;
                    j10 = j15;
                    i32 = i53;
                    j9 = jM33685;
                    i28 = i51;
                    if (i28 > 3) {
                        hashSet3 = hashSet3;
                        i29 = i32;
                        i49 = i49;
                        j7 = j11;
                        j8 = j10;
                        iM31610 = C0773.m3169("ۛۙ") ^ i43;
                        i30 = ((iM31610 ^ i42) * 11467) ^ 850635135;
                        i31 = 415749196;
                        int i5118 = iM31610 ^ i31;
                        jM33685 = j9;
                        i49 = i49;
                        i47 = i47;
                        j15 = j8;
                        i53 = i29;
                        i45 = i5118;
                        i44 = i30;
                        i51 = i28;
                        hashSet3 = hashSet3;
                        j13 = j7;
                        i50 = i27;
                        iM33684 = iM33684;
                        i46 = i5;
                        i55 = i26;
                    } else {
                        iM31611 = C0619.m2761("ۚ᩻") ^ i42;
                        i33 = ((iM31611 ^ i43) * (-23293)) ^ (-743994555);
                        i34 = -755306957;
                        i45 = iM31611 ^ i34;
                        i50 = i27;
                        i53 = i32;
                        iM33684 = iM33684;
                        i44 = i33;
                        i51 = i28;
                        jM33685 = j9;
                        i47 = i47;
                        i46 = i5;
                        i55 = i26;
                        j13 = j11;
                        j15 = j10;
                    }
                    break;
                case 1873882326:
                case 2027389639:
                    i21 = 0;
                    i49 = 0;
                    int iM27611 = C0619.m2761("ۖ۠") ^ i42;
                    jM33685 = jM33685;
                    i53 = i53;
                    i45 = iM27611 ^ (-705787867);
                    i44 = ((iM27611 ^ i43) * 15641) ^ 1495022855;
                    j15 = j15;
                    i51 = i51;
                    j13 = j13;
                    i50 = i50;
                    iM33684 = iM33684;
                    i46 = i46;
                    i55 = i21;
                    hashSet3 = hashSet3;
                    i47 = i47;
                    break;
                default:
                    hashSet2 = hashSet3;
                    i5 = i46;
                    i47 = i47;
                    i7 = i55;
                    iM33683 = i50;
                    iM33684 = iM33684;
                    j = j13;
                    i4 = i51;
                    jM33684 = j15;
                    i53 = i53;
                    j2 = jM33685;
                    i8 = i49;
                    try {
                        jM33684 = c13778.m33684();
                        long jM33686 = c13778.m33684();
                        try {
                            int iM33686 = c13778.m33683();
                            try {
                                iM33683 = c13778.m33683();
                                strM4049 = C1080.m4049(c13778);
                                jM33685 = c13778.m33684();
                                try {
                                    iM33684 = c13778.m33683();
                                    int iM27612 = (C0619.m2761("ܿۛ") + i43) * (-113);
                                    j15 = jM33684;
                                    i49 = i8;
                                    i55 = i7;
                                    i51 = iM33686;
                                    j13 = jM33686;
                                    hashSet3 = hashSet2;
                                    i53 = i53;
                                    i45 = iM27612 ^ 1756273758;
                                    i50 = iM33683;
                                    i44 = ((iM27612 ^ i42) * 27139) ^ (-1173475293);
                                } catch (IndexOutOfBoundsException e15) {
                                    indexOutOfBoundsException = e15;
                                    j15 = jM33684;
                                    i55 = i7;
                                    i51 = iM33686;
                                    j13 = jM33686;
                                    hashSet3 = hashSet2;
                                    i50 = iM33683;
                                    jM33685 = jM33685;
                                    i49 = i8;
                                    int iM316112 = C0773.m3169("᩵۠") ^ i42;
                                    i53 = i53;
                                    i45 = iM316112 ^ (-649844730);
                                    i44 = ((iM316112 ^ i43) * (-1707)) ^ (-1365780631);
                                    iM33684 = iM33684;
                                    i55 = i55;
                                    i49 = i49;
                                    jM33685 = jM33685;
                                }
                            } catch (IndexOutOfBoundsException e16) {
                                indexOutOfBoundsException = e16;
                                i49 = i8;
                                i55 = i7;
                                i50 = iM33683;
                                jM33685 = j2;
                                j15 = jM33684;
                                i51 = iM33686;
                                j13 = jM33686;
                                hashSet3 = hashSet2;
                            }
                        } catch (IndexOutOfBoundsException e17) {
                            indexOutOfBoundsException = e17;
                            hashSet3 = hashSet2;
                            i49 = i8;
                            i55 = i7;
                            j6 = jM33686;
                            i50 = iM33683;
                            jM33685 = j2;
                            j15 = jM33684;
                            i51 = i4;
                            j13 = j6;
                            int iM316113 = C0773.m3169("᩵۠") ^ i42;
                            i53 = i53;
                            i45 = iM316113 ^ (-649844730);
                            i44 = ((iM316113 ^ i43) * (-1707)) ^ (-1365780631);
                            iM33684 = iM33684;
                            i55 = i55;
                            i49 = i49;
                            jM33685 = jM33685;
                            i47 = i47;
                            i46 = i5;
                            break;
                        }
                    } catch (IndexOutOfBoundsException e18) {
                        e = e18;
                        indexOutOfBoundsException = e;
                        hashSet3 = hashSet2;
                        i49 = i8;
                        i55 = i7;
                        j6 = j;
                        i50 = iM33683;
                        jM33685 = j2;
                        j15 = jM33684;
                        i51 = i4;
                        j13 = j6;
                        int iM316114 = C0773.m3169("᩵۠") ^ i42;
                        i53 = i53;
                        i45 = iM316114 ^ (-649844730);
                        i44 = ((iM316114 ^ i43) * (-1707)) ^ (-1365780631);
                        iM33684 = iM33684;
                        i55 = i55;
                        i49 = i49;
                        jM33685 = jM33685;
                        i47 = i47;
                        i46 = i5;
                        break;
                    }
                    i47 = i47;
                    i46 = i5;
                    break;
            }
        }
    }
}
