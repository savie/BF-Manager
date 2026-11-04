package l;

import java.util.HashSet;
import java.util.Random;

/* JADX INFO: renamed from: l.۬۟ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 760C */
/* JADX INFO: loaded from: classes4.dex */
public final class C13699 implements InterfaceC6988 {

    /* JADX INFO: renamed from: ۟ۤᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f43448 = {3022, 26728, 26731, 26730, 26733, 26732, 26735, 26734, 26721, 26720, 26723, 26722, 26725, 26724, 26727, 26726, 26745, 26744, 26747, 26746, 26749, 26748, 26751, 26750, 26737, 26736, 26739, 26696, 26699, 26698, 26701, 26700, 26703, 26702, 26689, 26688, 26691, 26690, 26693, 26692, 26695, 26694, 26713, 26712, 26715, 26714, 26717, 26716, 26719, 26718, 26705, 26704, 26707, 26681, 26680, 26683, 26682, 26685, 26684, 26687, 26686, 26673, 26672, 26710};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f43449;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f43450;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f43451;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f43452;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Random f43453;

    /* JADX WARN: Code duplicated, block: B:35:0x0151 A[PHI: r14 r15
      0x0151: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]) binds: [B:34:0x014f, B:11:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r15v4 int) = (r15v3 int), (r15v2 int) binds: [B:34:0x014f, B:11:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02e2 A[PHI: r3 r12 r22 r27 r28
      0x02e2: PHI (r3v3 java.util.Random) = 
      (r3v1 java.util.Random)
      (r3v2 java.util.Random)
      (r3v1 java.util.Random)
      (r3v1 java.util.Random)
      (r3v1 java.util.Random)
      (r3v1 java.util.Random)
     binds: [B:72:0x02e0, B:50:0x0219, B:21:0x00ae, B:14:0x008a, B:11:0x0084, B:7:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x02e2: PHI (r12v3 char) = (r12v1 char), (r12v1 char), (r12v2 char), (r12v1 char), (r12v1 char), (r12v1 char) binds: [B:72:0x02e0, B:50:0x0219, B:21:0x00ae, B:14:0x008a, B:11:0x0084, B:7:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x02e2: PHI (r22v4 short) = (r22v3 short), (r22v2 short), (r22v2 short), (r22v2 short), (r22v2 short), (r22v2 short) binds: [B:72:0x02e0, B:50:0x0219, B:21:0x00ae, B:14:0x008a, B:11:0x0084, B:7:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x02e2: PHI (r27v3 int) = (r27v1 int), (r27v2 int), (r27v1 int), (r27v1 int), (r27v1 int), (r27v1 int) binds: [B:72:0x02e0, B:50:0x0219, B:21:0x00ae, B:14:0x008a, B:11:0x0084, B:7:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x02e2: PHI (r28v24 int) = (r28v8 int), (r28v17 int), (r28v3 int), (r28v3 int), (r28v3 int), (r28v3 int) binds: [B:72:0x02e0, B:50:0x0219, B:21:0x00ae, B:14:0x008a, B:11:0x0084, B:7:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x0319 A[PHI: r6 r7 r16 r17 r18 r19 r20 r21 r26
      0x0319: PHI (r6v2 int) = (r6v1 int), (r6v1 int), (r6v1 int), (r6v3 int) binds: [B:76:0x0317, B:67:0x02be, B:63:0x0299, B:43:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x0319: PHI (r7v2 java.lang.StringBuilder) = 
      (r7v1 java.lang.StringBuilder)
      (r7v1 java.lang.StringBuilder)
      (r7v1 java.lang.StringBuilder)
      (r7v3 java.lang.StringBuilder)
     binds: [B:76:0x0317, B:67:0x02be, B:63:0x0299, B:43:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x0319: PHI (r16v3 int) = (r16v1 int), (r16v2 int), (r16v1 int), (r16v1 int) binds: [B:76:0x0317, B:67:0x02be, B:63:0x0299, B:43:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x0319: PHI (r17v3 int) = (r17v1 int), (r17v2 int), (r17v1 int), (r17v1 int) binds: [B:76:0x0317, B:67:0x02be, B:63:0x0299, B:43:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x0319: PHI (r18v3 int) = (r18v1 int), (r18v1 int), (r18v2 int), (r18v1 int) binds: [B:76:0x0317, B:67:0x02be, B:63:0x0299, B:43:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x0319: PHI (r19v3 short) = (r19v1 short), (r19v1 short), (r19v2 short), (r19v1 short) binds: [B:76:0x0317, B:67:0x02be, B:63:0x0299, B:43:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x0319: PHI (r20v4 short[]) = (r20v3 short[]), (r20v2 short[]), (r20v2 short[]), (r20v2 short[]) binds: [B:76:0x0317, B:67:0x02be, B:63:0x0299, B:43:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x0319: PHI (r21v4 char) = (r21v3 char), (r21v2 char), (r21v2 char), (r21v2 char) binds: [B:76:0x0317, B:67:0x02be, B:63:0x0299, B:43:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x0319: PHI (r26v17 int) = (r26v6 int), (r26v8 int), (r26v9 int), (r26v20 int) binds: [B:76:0x0317, B:67:0x02be, B:63:0x0299, B:43:0x01b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008a, code lost:
    
        if (l.C2288.f7433 > 0) goto L15;
     */
    @Override // l.InterfaceC6988
    /* JADX INFO: renamed from: ۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String mo15360() {
        /*
            Method dump skipped, instruction units count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13699.mo15360():java.lang.String");
    }

    public C13699() {
        Random random = null;
        int i = 0;
        int i2 = 1399086208;
        int i3 = C3033.f9831;
        int i4 = C1783.f6087;
        int iM2761 = C0619.m2761("۠ۛ") ^ i3;
        int i5 = ((iM2761 ^ i4) * (-2649)) ^ 231292876;
        int i6 = -691384145;
        while (true) {
            i2 = ((((i2 ^ i4) * 27109) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -2022655593:
                case 109802208:
                    if (C1783.f6087 > 0) {
                        iM2761 = C0619.m2761("ܿۧ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 1639) ^ (-1067259903);
                        i6 = 1274524028;
                    } else {
                        iM2761 = C0619.m2761("֡ۢ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 18967) ^ (-578409831);
                        i6 = -955848427;
                    }
                    break;
                case -1926089342:
                case 285380448:
                    C1146.m4231();
                    throw new RuntimeException();
                case -1540655778:
                case 1358525715:
                    if (C3734.m12152() >= 0) {
                        iM2761 = C0619.m2761("ۚ᩶") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-7671)) ^ 1632862070;
                        i6 = -1491036665;
                    } else {
                        iM2761 = C0619.m2761("֡ۢ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 18967) ^ (-578409831);
                        i6 = -955848427;
                    }
                    break;
                case -1310724563:
                case -883716420:
                    i = 3;
                    if (C3077.f9998) {
                        iM2761 = C0773.m3169("᩻۬") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-11217)) ^ (-481862168);
                        i6 = -1612862939;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ۜ۬")) * 99;
                        i5 = ((iM2761 ^ i3) * (-12399)) ^ 1622589231;
                        i6 = 914401509;
                    }
                    break;
                case -1203114873:
                case 1224498033:
                    C0619.m2763();
                    C2485.m8357();
                    iM2761 = C0619.m2761("֡ۢ") ^ i4;
                    i5 = ((iM2761 ^ i3) * 18967) ^ (-578409831);
                    i6 = -955848427;
                    break;
                case -937936631:
                case -706021374:
                    this.f43450 = i;
                    this.f43452 = 8;
                    return;
                case -665921012:
                case -125152541:
                    this.f43453 = random;
                    if (C17202.m40372()) {
                        iM2761 = C0619.m2761("ܿ֫") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-12207)) ^ (-690356838);
                        i6 = -1002163748;
                    } else {
                        iM2761 = C0773.m3169("᩷ۢ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 14233) ^ (-289390133);
                        i6 = 1564119276;
                    }
                    break;
                case -626780321:
                case 427729539:
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0619.m2761("֡ۢ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 18967) ^ (-578409831);
                        i6 = -955848427;
                    } else {
                        iM2761 = C0773.m3169("᩷᩵") ^ i4;
                        i5 = ((iM2761 ^ i3) * 1899) ^ 1183016111;
                        i6 = 888997442;
                    }
                    break;
                case -188011960:
                case 117578753:
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0619.m2761("ܿۧ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 1639) ^ (-1067259903);
                        i6 = 1274524028;
                    } else {
                        iM2761 = C0619.m2761("ۚ᩸") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-23977)) ^ 913480178;
                        i6 = -1869574025;
                    }
                    break;
                case 145441219:
                case 957786366:
                    random = new Random();
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0773.m3169("᩷ۢ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 14233) ^ (-289390133);
                        i6 = 1564119276;
                    } else {
                        iM2761 = C0619.m2761("ܿ۠") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-22703)) ^ 1776556964;
                        i6 = 454553187;
                    }
                    break;
                case 386777681:
                case 1187972133:
                    C4238.m13540();
                    if (!C0619.f2439) {
                        iM2761 = C0619.m2761("֡ۢ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 18967) ^ (-578409831);
                        i6 = -955848427;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ۜ۬")) * 99;
                        i5 = ((iM2761 ^ i3) * (-12399)) ^ 1622589231;
                        i6 = 914401509;
                    }
                    break;
                case 588937392:
                case 731444282:
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0619.m2761("ܿۧ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 1639) ^ (-1067259903);
                        i6 = 1274524028;
                    } else {
                        this.f43449 = new HashSet();
                        if (C1343.f4799 != 0) {
                            iM2761 = C0619.m2761("ۚ᩶") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-7671)) ^ 1632862070;
                            i6 = -1491036665;
                        } else {
                            iM2761 = C0619.m2761("ۘ᩹") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-29575)) ^ 1825039189;
                            i6 = 2011952087;
                        }
                    }
                    break;
                case 1038054528:
                case 1361821760:
                    if (C1542.m5459() >= 0) {
                        iM2761 = C0773.m3169("᩷ۢ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 14233) ^ (-289390133);
                        i6 = 1564119276;
                    } else {
                        this.f43451 = new StringBuilder();
                        if (C0773.f2792 <= 0) {
                            iM2761 = C0619.m2761("ܿۧ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 1639) ^ (-1067259903);
                            i6 = 1274524028;
                        } else {
                            iM2761 = C0619.m2761("ᩴۗ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 30873) ^ (-66876746);
                            i6 = 613193717;
                        }
                    }
                    break;
                default:
                    if (C2419.m8174() >= 0) {
                        iM2761 = C0619.m2761("֡ۢ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 18967) ^ (-578409831);
                        i6 = -955848427;
                    } else {
                        iM2761 = C0619.m2761("ܰܰ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-12611)) ^ 735694595;
                        i6 = 391550793;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m33488() {
        this.f43449.clear();
    }
}
