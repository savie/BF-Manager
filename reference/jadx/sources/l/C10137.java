package l;

/* JADX INFO: renamed from: l.ۢ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C6PQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f32433;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f32434;

    public C10137(int i, int[] iArr) {
        this.f32434 = i;
        this.f32433 = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x008e A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10137 m26148(C11002 c11002) {
        if (c11002 != C1935.f6495) {
            return null;
        }
        AbstractC17715 abstractC17715M26150 = m26150(c11002.f34753[1]);
        if (!(abstractC17715M26150 instanceof C6529)) {
            return null;
        }
        C6529 c6529 = (C6529) abstractC17715M26150;
        int[] iArr = new int[c11002.f34753.length];
        for (int i = 0; i < c6529.m41477(); i++) {
            AbstractC17715 abstractC17715M26151 = m26150(c6529.m41478(i).f20405);
            if (abstractC17715M26151.m41477() == 1) {
                AbstractC5959 abstractC5959M41478 = abstractC17715M26151.m41478(0);
                if (abstractC5959M41478 instanceof C7976) {
                    C7976 c7976 = (C7976) abstractC5959M41478;
                    int i2 = c7976.f26511;
                    AbstractC17715 abstractC17715M26152 = m26150(c7976.f26510);
                    if (i2 == 70) {
                        if (abstractC17715M26152.m41477() == 1) {
                            AbstractC5959 abstractC5959M41479 = abstractC17715M26152.m41478(0);
                            if (abstractC5959M41479 instanceof C12494) {
                                C12494 c12494 = (C12494) abstractC5959M41479;
                                if (c12494.f40114 != 95) {
                                    continue;
                                } else {
                                    AbstractC17715 abstractC17715M26153 = m26150(c12494.f20405);
                                    if (abstractC17715M26153.m41477() == 1) {
                                        AbstractC5959 abstractC5959M414710 = abstractC17715M26153.m41478(0);
                                        if (abstractC5959M414710 instanceof C7976) {
                                            C7976 c7977 = (C7976) abstractC5959M414710;
                                            if (c7977.f26511 != 1) {
                                                continue;
                                            } else {
                                                abstractC17715M26152 = m26150(c7977.f26510);
                                                if (abstractC17715M26152 == c6529.f48134) {
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
                    } else if (abstractC17715M26152 == c6529.f48134) {
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
        return new C10137(c6529.f68398, iArr);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC17715 m26150(AbstractC17715 abstractC17715) {
        while (!(abstractC17715 instanceof C4291) && abstractC17715.m41477() == 1 && (abstractC17715.m41478(0) instanceof C0562)) {
            abstractC17715 = abstractC17715.m41478(0).f20405;
        }
        return abstractC17715;
    }
}
