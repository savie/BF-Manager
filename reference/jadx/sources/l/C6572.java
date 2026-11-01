package l;

/* JADX INFO: renamed from: l.ۜۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6PQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6572 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f22127;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f22128;

    public C6572(int i, int[] iArr) {
        this.f22128 = i;
        this.f22127 = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x008e A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6572 m17812(C16233 c16233) {
        if (c16233 != C16781.f53714) {
            return null;
        }
        AbstractC2120 abstractC2120M17813 = m17813(c16233.f52371[1]);
        if (!(abstractC2120M17813 instanceof C2204)) {
            return null;
        }
        C2204 c2204 = (C2204) abstractC2120M17813;
        int[] iArr = new int[c16233.f52371.length];
        for (int i = 0; i < c2204.m6670(); i++) {
            AbstractC2120 abstractC2120M17814 = m17813(c2204.m6671(i).f55272);
            if (abstractC2120M17814.m6670() == 1) {
                AbstractC17373 abstractC17373M6671 = abstractC2120M17814.m6671(0);
                if (abstractC17373M6671 instanceof C23018) {
                    C23018 c23018 = (C23018) abstractC17373M6671;
                    int i2 = c23018.f74808;
                    AbstractC2120 abstractC2120M17815 = m17813(c23018.f74809);
                    if (i2 == 70) {
                        if (abstractC2120M17815.m6670() == 1) {
                            AbstractC17373 abstractC17373M6672 = abstractC2120M17815.m6671(0);
                            if (abstractC17373M6672 instanceof C11378) {
                                C11378 c11378 = (C11378) abstractC17373M6672;
                                if (c11378.f38368 != 95) {
                                    continue;
                                } else {
                                    AbstractC2120 abstractC2120M17816 = m17813(c11378.f55272);
                                    if (abstractC2120M17816.m6670() == 1) {
                                        AbstractC17373 abstractC17373M6673 = abstractC2120M17816.m6671(0);
                                        if (abstractC17373M6673 instanceof C23018) {
                                            C23018 c23019 = (C23018) abstractC17373M6673;
                                            if (c23019.f74808 != 1) {
                                                continue;
                                            } else {
                                                abstractC2120M17815 = m17813(c23019.f74809);
                                                if (abstractC2120M17815 == c2204.f3382) {
                                                    continue;
                                                } else {
                                                    if (iArr[i2] != 0) {
                                                        return null;
                                                    }
                                                    iArr[i2] = i + 1;
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (abstractC2120M17815 == c2204.f3382) {
                        continue;
                    } else {
                        if (iArr[i2] != 0) {
                            return null;
                        }
                        iArr[i2] = i + 1;
                    }
                } else {
                    continue;
                }
            }
        }
        return new C6572(c2204.f42611, iArr);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC2120 m17813(AbstractC2120 abstractC2120) {
        while (!(abstractC2120 instanceof C21961) && abstractC2120.m6670() == 1 && (abstractC2120.m6671(0) instanceof C6438)) {
            abstractC2120 = abstractC2120.m6671(0).f55272;
        }
        return abstractC2120;
    }
}
