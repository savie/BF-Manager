package l;

/* JADX INFO: renamed from: l.᩻֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 68JC */
/* JADX INFO: loaded from: classes.dex */
public final class C24724 {
    /* JADX WARN: Code duplicated, block: B:53:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b7 A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m55203(C21287 c21287, C23232 c23232, int i, C11297 c11297) {
        int iM48516 = c21287.m48516();
        long jM48485 = c21287.m48485();
        long j = jM48485 >>> 16;
        if (j == i) {
            boolean z = (j & 1) == 1;
            int i2 = (int) ((jM48485 >> 12) & 15);
            int i3 = (int) ((jM48485 >> 8) & 15);
            int i4 = (int) (15 & (jM48485 >> 4));
            int i5 = (int) ((jM48485 >> 1) & 7);
            boolean z2 = (jM48485 & 1) == 1;
            if (i4 > 7 ? !(i4 > 10 || c23232.f75252 != 2) : i4 == c23232.f75252 - 1) {
                if ((i5 == 0 || i5 == c23232.f75258) && !z2) {
                    try {
                        long jM48508 = c21287.m48508();
                        if (!z) {
                            jM48508 *= (long) c23232.f75259;
                        }
                        c11297.f35612 = jM48508;
                        int iM55202 = m55202(i2, c21287);
                        if (iM55202 != -1 && iM55202 <= c23232.f75259) {
                            int i6 = c23232.f75249;
                            if (i3 == 0) {
                                if (c21287.m48493() == C7116.m19461(iM48516, c21287.m48516() - 1, c21287.m48497())) {
                                    return true;
                                }
                            } else if (i3 <= 11) {
                                if (i3 == c23232.f75253) {
                                    if (c21287.m48493() == C7116.m19461(iM48516, c21287.m48516() - 1, c21287.m48497())) {
                                        return true;
                                    }
                                }
                            } else if (i3 == 12) {
                                if (c21287.m48493() * 1000 == i6) {
                                    if (c21287.m48493() == C7116.m19461(iM48516, c21287.m48516() - 1, c21287.m48497())) {
                                        return true;
                                    }
                                }
                            } else if (i3 <= 14) {
                                int iM48494 = c21287.m48494();
                                if (i3 == 14) {
                                    iM48494 *= 10;
                                }
                                if (iM48494 == i6) {
                                    if (c21287.m48493() == C7116.m19461(iM48516, c21287.m48516() - 1, c21287.m48497())) {
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
    public static int m55202(int i, C21287 c21287) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return c21287.m48493() + 1;
            case 7:
                return c21287.m48494() + 1;
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
