package l;

/* JADX INFO: renamed from: l.۫ۘܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68JC */
/* JADX INFO: loaded from: classes3.dex */
public final class C12162 {
    /* JADX WARN: Code duplicated, block: B:53:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b7 A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30250(C2460 c2460, C23451 c23451, int i, C16395 c16395) {
        int iM7500 = c2460.m7500();
        long jM7532 = c2460.m7532();
        long j = jM7532 >>> 16;
        if (j == i) {
            boolean z = (j & 1) == 1;
            int i2 = (int) ((jM7532 >> 12) & 15);
            int i3 = (int) ((jM7532 >> 8) & 15);
            int i4 = (int) (15 & (jM7532 >> 4));
            int i5 = (int) ((jM7532 >> 1) & 7);
            boolean z2 = (jM7532 & 1) == 1;
            if (i4 > 7 ? !(i4 > 10 || c23451.f75954 != 2) : i4 == c23451.f75954 - 1) {
                if ((i5 == 0 || i5 == c23451.f75956) && !z2) {
                    try {
                        long jM7527 = c2460.m7527();
                        if (!z) {
                            jM7527 *= (long) c23451.f75949;
                        }
                        c16395.f52757 = jM7527;
                        int iM30249 = m30249(i2, c2460);
                        if (iM30249 != -1 && iM30249 <= c23451.f75949) {
                            int i6 = c23451.f75950;
                            if (i3 == 0) {
                                if (c2460.m7516() == C17983.m41814(iM7500, c2460.m7500() - 1, c2460.m7518())) {
                                    return true;
                                }
                            } else if (i3 <= 11) {
                                if (i3 == c23451.f75953) {
                                    if (c2460.m7516() == C17983.m41814(iM7500, c2460.m7500() - 1, c2460.m7518())) {
                                        return true;
                                    }
                                }
                            } else if (i3 == 12) {
                                if (c2460.m7516() * 1000 == i6) {
                                    if (c2460.m7516() == C17983.m41814(iM7500, c2460.m7500() - 1, c2460.m7518())) {
                                        return true;
                                    }
                                }
                            } else if (i3 <= 14) {
                                int iM7519 = c2460.m7519();
                                if (i3 == 14) {
                                    iM7519 *= 10;
                                }
                                if (iM7519 == i6) {
                                    if (c2460.m7516() == C17983.m41814(iM7500, c2460.m7500() - 1, c2460.m7518())) {
                                        return true;
                                    }
                                }
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m30249(int i, C2460 c2460) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return c2460.m7516() + 1;
            case 7:
                return c2460.m7519() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
