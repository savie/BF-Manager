package l;

import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C6PQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C0443 extends C6485 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f2014;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean[] f2015;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f2016;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f2017;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f2018 = new IdentityHashMap();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f2019;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C10137 f2020;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C25351[] f2021;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f2022;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f2023;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f2024;

    /* JADX WARN: Code duplicated, block: B:114:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c5 A[LOOP:2: B:95:0x0183->B:117:0x01c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0164  */
    public C0443(C11002 c11002) {
        int i;
        int i2;
        int size = c11002.f34749.size();
        this.f2021 = new C25351[size];
        this.f2015 = new boolean[size];
        int i3 = 0;
        while (true) {
            C25351[] c25351Arr = this.f2021;
            if (i3 >= c25351Arr.length) {
                break;
            }
            c25351Arr[i3] = new C25351(c11002.m27846(i3), i3);
            i3++;
        }
        int i4 = -1;
        if (c11002 == C1935.f6495) {
            Iterator it = c11002.f34749.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                AbstractC21445 abstractC21445 = (AbstractC21445) it.next();
                if (abstractC21445.f58211 == 45 && (abstractC21445 instanceof C23113) && !abstractC21445.f68397 && abstractC21445.m41477() == 2) {
                    AbstractC17715 abstractC17715 = abstractC21445.m41478(0).f20405;
                    AbstractC17715 abstractC17716 = abstractC21445.m41478(1).f20405;
                    if ((abstractC17715 instanceof C11178) && abstractC17715.m41477() == 1 && (abstractC17716 instanceof C5739) && abstractC17716.m41477() == 1 && abstractC17716.m41478(0).f20405 == c11002.f34752[45]) {
                        AbstractC17715 abstractC17717 = abstractC17715.m41478(0).f20405;
                        if (abstractC17717.m41477() == 1) {
                            AbstractC5959 abstractC5959M41478 = abstractC17717.m41478(0);
                            if ((abstractC5959M41478 instanceof C7976) && ((C7976) abstractC5959M41478).f26511 == 46) {
                                i = abstractC21445.f68398;
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
        this.f2024 = i;
        C11002 c11003 = C1935.f6495;
        if (c11002 != c11003) {
            i2 = -1;
        } else {
            AbstractC17715 abstractC17715M26150 = C10137.m26150(c11002.f34753[42]);
            if (abstractC17715M26150.m41477() == 1) {
                AbstractC5959 abstractC5959M41479 = abstractC17715M26150.m41478(0);
                if (abstractC5959M41479 instanceof C7976) {
                    C7976 c7976 = (C7976) abstractC5959M41479;
                    if (c7976.f26511 != 44) {
                        i2 = -1;
                    } else {
                        AbstractC17715 abstractC17715M26151 = C10137.m26150(c7976.f26510);
                        if (abstractC17715M26151 instanceof C23113) {
                            C23113 c23113 = (C23113) abstractC17715M26151;
                            if (c23113.f68397 || c23113.m41477() != 2) {
                                i2 = -1;
                            } else {
                                AbstractC17715 abstractC17718 = c23113.m41478(1).f20405;
                                AbstractC17715 abstractC17719 = c23113.m41478(0).f20405;
                                if (abstractC17719 instanceof C11178) {
                                    C11178 c11178 = (C11178) abstractC17719;
                                    if (c11178.m41477() == 2 && (abstractC17718 instanceof C5739) && abstractC17718.m41477() == 1 && abstractC17718.m41478(0).f20405 == c11002.f34752[42]) {
                                        AbstractC17715 abstractC17715M26152 = C10137.m26150(c11178.m41478(0).f20405);
                                        if (abstractC17715M26152.m41477() == 1) {
                                            AbstractC5959 abstractC5959M414710 = abstractC17715M26152.m41478(0);
                                            if (abstractC5959M414710 instanceof C7976) {
                                                C7976 c7977 = (C7976) abstractC5959M414710;
                                                if (c7977.f26511 != 43) {
                                                    i2 = -1;
                                                } else {
                                                    AbstractC17715 abstractC17715M26153 = C10137.m26150(c7977.f26510);
                                                    if (abstractC17715M26153.m41477() == 1) {
                                                        AbstractC5959 abstractC5959M414711 = abstractC17715M26153.m41478(0);
                                                        if (abstractC5959M414711 instanceof C7976) {
                                                            C7976 c7978 = (C7976) abstractC5959M414711;
                                                            if (c7978.f26511 == 44 && C10137.m26150(c7978.f26510) == c11178.f48134) {
                                                                i2 = c23113.f68398;
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
        this.f2016 = i2;
        if (c11002 == c11003) {
            AbstractC17715 abstractC17715M26154 = C10137.m26150(c11002.f34753[72]);
            if (abstractC17715M26154 instanceof C6529) {
                C6529 c6529 = (C6529) abstractC17715M26154;
                if (c6529.m41477() == 3) {
                    int i5 = 0;
                    while (i5 < 3) {
                        AbstractC17715 abstractC17715M26155 = C10137.m26150(c6529.m41478(i5).f20405);
                        if (abstractC17715M26155.m41477() == 1) {
                            AbstractC5959 abstractC5959M414712 = abstractC17715M26155.m41478(0);
                            if (i5 < 2) {
                                if (abstractC5959M414712 instanceof C12494) {
                                    if (((C12494) abstractC5959M414712).f40114 == (i5 == 0 ? 93 : -1)) {
                                        if (C10137.m26150(abstractC5959M414712.f20405) != c6529.f48134) {
                                            i5++;
                                        }
                                    }
                                }
                            } else if ((abstractC5959M414712 instanceof C20655) && ((C20655) abstractC5959M414712).f66240 == 72) {
                                if (C10137.m26150(abstractC5959M414712.f20405) != c6529.f48134) {
                                    i5++;
                                }
                            }
                        }
                    }
                    i4 = c6529.f68398;
                }
            }
        }
        this.f2019 = i4;
        this.f2014 = m2259(c11002, 13, 2, false, 72, true);
        this.f2017 = m2259(c11002, 26, 37, true, -1, false);
        this.f2020 = C10137.m26148(c11002);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m2259(C11002 c11002, int i, int i2, boolean z, int i3, boolean z2) {
        if (c11002 == C1935.f6495) {
            int i4 = -1;
            for (AbstractC21445 abstractC21445 : c11002.f34749) {
                if (abstractC21445.f58211 == i && (abstractC21445 instanceof C6529)) {
                    C6529 c6529 = (C6529) abstractC21445;
                    if (c6529.m41477() == 2 && m2260(c6529, 0, i2, z) && m2260(c6529, 1, i3, z2)) {
                        if (i4 == -1) {
                            i4 = c6529.f68398;
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
    public static boolean m2260(C6529 c6529, int i, int i2, boolean z) {
        AbstractC5959 abstractC5959M41478;
        C7976 c7976;
        AbstractC17715 abstractC17715M26150 = C10137.m26150(c6529.m41478(i).f20405);
        if (z) {
            if (abstractC17715M26150.m41477() == 1) {
                AbstractC5959 abstractC5959M41479 = abstractC17715M26150.m41478(0);
                if (abstractC5959M41479 instanceof C20655) {
                    C20655 c20655 = (C20655) abstractC5959M41479;
                    if (c20655.f66240 == c6529.f58211) {
                        abstractC17715M26150 = C10137.m26150(c20655.f20405);
                        if (i2 < 0) {
                            if (abstractC17715M26150 == c6529.f48134) {
                                return true;
                            }
                        } else if (abstractC17715M26150.m41477() == 1) {
                            abstractC5959M41478 = abstractC17715M26150.m41478(0);
                            if (abstractC5959M41478 instanceof C7976) {
                                c7976 = (C7976) abstractC5959M41478;
                                if (c7976.f26511 != i2) {
                                }
                            }
                        }
                    }
                }
            }
        } else if (i2 < 0) {
            if (abstractC17715M26150 == c6529.f48134) {
                return true;
            }
        } else if (abstractC17715M26150.m41477() == 1) {
            abstractC5959M41478 = abstractC17715M26150.m41478(0);
            if (abstractC5959M41478 instanceof C7976) {
                c7976 = (C7976) abstractC5959M41478;
                if (c7976.f26511 != i2 && C10137.m26150(c7976.f26510) == c6529.f48134) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m2261() {
        int i = 0;
        while (true) {
            C25351[] c25351Arr = this.f2021;
            if (i >= c25351Arr.length) {
                this.f21801.clear();
                this.f2018.clear();
                this.f2023 = 0;
                return;
            }
            c25351Arr[i] = new C25351(c25351Arr[i].f81858, i);
            i++;
        }
    }
}
