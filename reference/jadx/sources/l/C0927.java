package l;

import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6PQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0927 extends C2555 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f3716 = new IdentityHashMap();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f3717;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f3718;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C23724[] f3719;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f3720;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f3721;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean[] f3722;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f3723;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C6572 f3724;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f3725;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f3726;

    /* JADX WARN: Code duplicated, block: B:114:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c5 A[LOOP:2: B:95:0x0183->B:117:0x01c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0164  */
    public C0927(C16233 c16233) {
        int i;
        int i2;
        int size = c16233.f52366.size();
        this.f3719 = new C23724[size];
        this.f3722 = new boolean[size];
        int i3 = 0;
        while (true) {
            C23724[] c23724Arr = this.f3719;
            if (i3 >= c23724Arr.length) {
                break;
            }
            c23724Arr[i3] = new C23724(c16233.m38343(i3), i3);
            i3++;
        }
        int i4 = -1;
        if (c16233 == C16781.f53714) {
            Iterator it = c16233.f52366.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                AbstractC12789 abstractC12789 = (AbstractC12789) it.next();
                if (abstractC12789.f7773 == 45 && (abstractC12789 instanceof C20196) && !abstractC12789.f42610 && abstractC12789.m6670() == 2) {
                    AbstractC2120 abstractC2120 = abstractC12789.m6671(0).f55272;
                    AbstractC2120 abstractC2121 = abstractC12789.m6671(1).f55272;
                    if ((abstractC2120 instanceof C15963) && abstractC2120.m6670() == 1 && (abstractC2121 instanceof C17022) && abstractC2121.m6670() == 1 && abstractC2121.m6671(0).f55272 == c16233.f52363[45]) {
                        AbstractC2120 abstractC2122 = abstractC2120.m6671(0).f55272;
                        if (abstractC2122.m6670() == 1) {
                            AbstractC17373 abstractC17373M6671 = abstractC2122.m6671(0);
                            if ((abstractC17373M6671 instanceof C23018) && ((C23018) abstractC17373M6671).f74808 == 46) {
                                i = abstractC12789.f42611;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        } else {
            i = -1;
            break;
        }
        this.f3726 = i;
        C16233 c16234 = C16781.f53714;
        if (c16233 != c16234) {
            i2 = -1;
        } else {
            AbstractC2120 abstractC2120M17813 = C6572.m17813(c16233.f52371[42]);
            if (abstractC2120M17813.m6670() == 1) {
                AbstractC17373 abstractC17373M6672 = abstractC2120M17813.m6671(0);
                if (abstractC17373M6672 instanceof C23018) {
                    C23018 c23018 = (C23018) abstractC17373M6672;
                    if (c23018.f74808 != 44) {
                        i2 = -1;
                    } else {
                        AbstractC2120 abstractC2120M17814 = C6572.m17813(c23018.f74809);
                        if (abstractC2120M17814 instanceof C20196) {
                            C20196 c20196 = (C20196) abstractC2120M17814;
                            if (c20196.f42610 || c20196.m6670() != 2) {
                                i2 = -1;
                            } else {
                                AbstractC2120 abstractC2123 = c20196.m6671(1).f55272;
                                AbstractC2120 abstractC2124 = c20196.m6671(0).f55272;
                                if (abstractC2124 instanceof C15963) {
                                    C15963 c15963 = (C15963) abstractC2124;
                                    if (c15963.m6670() == 2 && (abstractC2123 instanceof C17022) && abstractC2123.m6670() == 1 && abstractC2123.m6671(0).f55272 == c16233.f52363[42]) {
                                        AbstractC2120 abstractC2120M17815 = C6572.m17813(c15963.m6671(0).f55272);
                                        if (abstractC2120M17815.m6670() == 1) {
                                            AbstractC17373 abstractC17373M6673 = abstractC2120M17815.m6671(0);
                                            if (abstractC17373M6673 instanceof C23018) {
                                                C23018 c23019 = (C23018) abstractC17373M6673;
                                                if (c23019.f74808 != 43) {
                                                    i2 = -1;
                                                } else {
                                                    AbstractC2120 abstractC2120M17816 = C6572.m17813(c23019.f74809);
                                                    if (abstractC2120M17816.m6670() == 1) {
                                                        AbstractC17373 abstractC17373M6674 = abstractC2120M17816.m6671(0);
                                                        if (abstractC17373M6674 instanceof C23018) {
                                                            C23018 c230110 = (C23018) abstractC17373M6674;
                                                            if (c230110.f74808 == 44 && C6572.m17813(c230110.f74809) == c15963.f3382) {
                                                                i2 = c20196.f42611;
                                                            } else {
                                                                i2 = -1;
                                                            }
                                                        } else {
                                                            i2 = -1;
                                                        }
                                                    } else {
                                                        i2 = -1;
                                                    }
                                                }
                                            } else {
                                                i2 = -1;
                                            }
                                        } else {
                                            i2 = -1;
                                        }
                                    } else {
                                        i2 = -1;
                                    }
                                } else {
                                    i2 = -1;
                                }
                            }
                        } else {
                            i2 = -1;
                        }
                    }
                } else {
                    i2 = -1;
                }
            } else {
                i2 = -1;
            }
        }
        this.f3721 = i2;
        if (c16233 == c16234) {
            AbstractC2120 abstractC2120M17817 = C6572.m17813(c16233.f52371[72]);
            if (abstractC2120M17817 instanceof C2204) {
                C2204 c2204 = (C2204) abstractC2120M17817;
                if (c2204.m6670() == 3) {
                    int i5 = 0;
                    while (i5 < 3) {
                        AbstractC2120 abstractC2120M17818 = C6572.m17813(c2204.m6671(i5).f55272);
                        if (abstractC2120M17818.m6670() == 1) {
                            AbstractC17373 abstractC17373M6675 = abstractC2120M17818.m6671(0);
                            if (i5 < 2) {
                                if (abstractC17373M6675 instanceof C11378) {
                                    if (((C11378) abstractC17373M6675).f38368 == (i5 == 0 ? 93 : -1)) {
                                        if (C6572.m17813(abstractC17373M6675.f55272) != c2204.f3382) {
                                            i5++;
                                        }
                                    }
                                }
                            } else if ((abstractC17373M6675 instanceof C13846) && ((C13846) abstractC17373M6675).f45678 == 72) {
                                if (C6572.m17813(abstractC17373M6675.f55272) != c2204.f3382) {
                                    i5++;
                                }
                            }
                        }
                    }
                    i4 = c2204.f42611;
                }
            }
        }
        this.f3725 = i4;
        this.f3718 = m3676(c16233, 13, 2, false, 72, true);
        this.f3720 = m3676(c16233, 26, 37, true, -1, false);
        this.f3724 = C6572.m17812(c16233);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m3676(C16233 c16233, int i, int i2, boolean z, int i3, boolean z2) {
        if (c16233 == C16781.f53714) {
            int i4 = -1;
            for (AbstractC12789 abstractC12789 : c16233.f52366) {
                if (abstractC12789.f7773 == i && (abstractC12789 instanceof C2204)) {
                    C2204 c2204 = (C2204) abstractC12789;
                    if (c2204.m6670() == 2 && m3677(c2204, 0, i2, z) && m3677(c2204, 1, i3, z2)) {
                        if (i4 == -1) {
                            i4 = c2204.f42611;
                        }
                    }
                }
            }
            return i4;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0050 A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m3677(C2204 c2204, int i, int i2, boolean z) {
        AbstractC17373 abstractC17373M6671;
        C23018 c23018;
        AbstractC2120 abstractC2120M17813 = C6572.m17813(c2204.m6671(i).f55272);
        if (z) {
            if (abstractC2120M17813.m6670() == 1) {
                AbstractC17373 abstractC17373M6672 = abstractC2120M17813.m6671(0);
                if (abstractC17373M6672 instanceof C13846) {
                    C13846 c13846 = (C13846) abstractC17373M6672;
                    if (c13846.f45678 == c2204.f7773) {
                        abstractC2120M17813 = C6572.m17813(c13846.f55272);
                        if (i2 < 0) {
                            if (abstractC2120M17813 == c2204.f3382) {
                                return true;
                            }
                        } else if (abstractC2120M17813.m6670() == 1) {
                            abstractC17373M6671 = abstractC2120M17813.m6671(0);
                            if (abstractC17373M6671 instanceof C23018) {
                                c23018 = (C23018) abstractC17373M6671;
                                if (c23018.f74808 != i2) {
                                }
                            }
                        }
                    }
                }
            }
        } else if (i2 < 0) {
            if (abstractC2120M17813 == c2204.f3382) {
                return true;
            }
        } else if (abstractC2120M17813.m6670() == 1) {
            abstractC17373M6671 = abstractC2120M17813.m6671(0);
            if (abstractC17373M6671 instanceof C23018) {
                c23018 = (C23018) abstractC17373M6671;
                if (c23018.f74808 != i2 && C6572.m17813(c23018.f74809) == c2204.f3382) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m3678() {
        int i = 0;
        while (true) {
            C23724[] c23724Arr = this.f3719;
            if (i >= c23724Arr.length) {
                this.f10105.clear();
                this.f3716.clear();
                this.f3717 = 0;
                return;
            }
            c23724Arr[i] = new C23724(c23724Arr[i].f76773, i);
            i++;
        }
    }
}
