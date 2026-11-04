package l;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.ۜ֫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6809 extends C9790 {
    public static final C23479 h;
    public static final long i;
    public C13520 e;
    public volatile C13520 f;
    public volatile Thread g;
    public volatile int lockState;

    static {
        C23479 c23479 = C23479.b;
        h = c23479;
        i = c23479.h(C6809.class, "lockState");
    }

    public static int i(Object obj, Object obj2) {
        int iCompareTo;
        if (obj == null || obj2 == null || (iCompareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) {
            return System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1;
        }
        return iCompareTo;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004b A[PHI: r6
      0x004b: PHI (r6v3 java.lang.Class<?>) = (r6v2 java.lang.Class<?>), (r6v4 java.lang.Class<?>) binds: [B:24:0x0049, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    public C6809(C13520 c13520) {
        int i2;
        super(-2, null, null);
        this.f = c13520;
        C13520 c13521 = null;
        while (c13520 != null) {
            C13520 c13522 = (C13520) c13520.d;
            c13520.g = null;
            c13520.f = null;
            if (c13521 == null) {
                c13520.e = null;
                c13520.i = false;
            } else {
                Object obj = c13520.b;
                int i3 = c13520.a;
                C13520 c13523 = c13521;
                Class<?> clsC = null;
                while (true) {
                    Object obj2 = c13523.b;
                    int i4 = c13523.a;
                    if (i4 > i3) {
                        i2 = -1;
                    } else if (i4 < i3) {
                        i2 = 1;
                    } else if (clsC != null || (clsC = ConcurrentMapC17249.c(obj)) != null) {
                        int i5 = ConcurrentMapC17249.g;
                        int iCompareTo = (obj2 == null || obj2.getClass() != clsC) ? 0 : ((Comparable) obj).compareTo(obj2);
                        if (iCompareTo == 0) {
                            i2 = i(obj, obj2);
                        } else {
                            i2 = iCompareTo;
                        }
                    } else {
                        i2 = i(obj, obj2);
                    }
                    C13520 c13524 = i2 <= 0 ? c13523.f : c13523.g;
                    if (c13524 == null) {
                        break;
                    } else {
                        c13523 = c13524;
                    }
                }
                c13520.e = c13523;
                if (i2 <= 0) {
                    c13523.f = c13520;
                } else {
                    c13523.g = c13520;
                }
                c13520 = c(c13521, c13520);
            }
            c13521 = c13520;
            c13520 = c13522;
        }
        this.e = c13521;
    }

    public final void d() {
        if (h.c(this, i, 0, 1)) {
            return;
        }
        boolean z = false;
        while (true) {
            int i2 = this.lockState;
            if ((i2 & (-3)) == 0) {
                if (h.c(this, i, i2, 1)) {
                    break;
                }
            } else if ((i2 & 2) == 0) {
                if (h.c(this, i, i2, i2 | 2)) {
                    this.g = Thread.currentThread();
                    z = true;
                }
            } else if (z) {
                LockSupport.park(this);
            }
        }
        if (z) {
            this.g = null;
        }
    }

    @Override // l.C9790
    public final C9790 a(int i2, Object obj) {
        Object obj2;
        Thread thread;
        C9790 c9790 = this.f;
        while (true) {
            C13520 c13520B = null;
            if (c9790 == null) {
                return null;
            }
            int i3 = this.lockState;
            if ((i3 & 3) != 0) {
                if (c9790.a == i2 && ((obj2 = c9790.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return c9790;
                }
                c9790 = c9790.d;
            } else if (h.c(this, i, i3, i3 + 4)) {
                try {
                    C13520 c13520 = this.e;
                    if (c13520 != null) {
                        c13520B = c13520.b(i2, obj, null);
                    }
                    return c13520B;
                } finally {
                    if (h.e(this, i) == 6 && (thread = this.g) != null) {
                        LockSupport.unpark(thread);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005a A[PHI: r2
      0x005a: PHI (r2v5 java.lang.Class<?>) = (r2v4 java.lang.Class<?>), (r2v6 java.lang.Class<?>) binds: [B:27:0x0058, B:19:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    public final C13520 e(int i2, Object obj, Object obj2) {
        int i3;
        C13520 c13520;
        C13520 c13521;
        C13520 c13520B;
        C13520 c13520B2;
        boolean z = false;
        C13520 c13522 = this.e;
        Class<?> clsC = null;
        while (c13522 != null) {
            int i4 = c13522.a;
            if (i4 > i2) {
                i3 = -1;
            } else if (i4 < i2) {
                i3 = 1;
            } else {
                Object obj3 = c13522.b;
                if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                    return c13522;
                }
                if (clsC != null || (clsC = ConcurrentMapC17249.c(obj)) != null) {
                    int i5 = ConcurrentMapC17249.g;
                    int iCompareTo = (obj3 == null || obj3.getClass() != clsC) ? 0 : ((Comparable) obj).compareTo(obj3);
                    if (iCompareTo == 0) {
                        if (!z) {
                            c13520 = c13522.f;
                            if (c13520 == null && (c13520B2 = c13520.b(i2, obj, clsC)) != null) {
                                return c13520B2;
                            }
                            c13521 = c13522.g;
                            if (c13521 == null && (c13520B = c13521.b(i2, obj, clsC)) != null) {
                                return c13520B;
                            }
                            z = true;
                        }
                        i3 = i(obj, obj3);
                    } else {
                        i3 = iCompareTo;
                    }
                } else {
                    if (!z) {
                        c13520 = c13522.f;
                        if (c13520 == null) {
                        }
                        c13521 = c13522.g;
                        if (c13521 == null) {
                        }
                        z = true;
                    }
                    i3 = i(obj, obj3);
                }
            }
            C13520 c13523 = i3 <= 0 ? c13522.f : c13522.g;
            if (c13523 == null) {
                C13520 c13524 = this.f;
                C13520 c13525 = new C13520(i2, obj, obj2, c13524, c13522);
                this.f = c13525;
                if (c13524 != null) {
                    c13524.h = c13525;
                }
                if (i3 <= 0) {
                    c13522.f = c13525;
                } else {
                    c13522.g = c13525;
                }
                if (!c13522.i) {
                    c13525.i = true;
                    return null;
                }
                d();
                try {
                    this.e = c(this.e, c13525);
                    return null;
                } finally {
                    this.lockState = 0;
                }
            }
            c13522 = c13523;
        }
        C13520 c13526 = new C13520(i2, obj, obj2, null, null);
        this.e = c13526;
        this.f = c13526;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x008b A[PHI: r0
      0x008b: PHI (r0v4 l.۬֫ۗ) = (r0v3 l.۬֫ۗ), (r0v12 l.۬֫ۗ) binds: [B:53:0x0087, B:49:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean f(C13520 c13520) {
        C13520 c13521;
        C13520 c13522;
        C13520 c13523 = (C13520) c13520.d;
        C13520 c13524 = c13520.h;
        if (c13524 == null) {
            this.f = c13523;
        } else {
            c13524.d = c13523;
        }
        if (c13523 != null) {
            c13523.h = c13524;
        }
        if (this.f == null) {
            this.e = null;
            return true;
        }
        C13520 c13520B = this.e;
        if (c13520B == null || c13520B.g == null || (c13521 = c13520B.f) == null || c13521.f == null) {
            return true;
        }
        d();
        try {
            C13520 c13525 = c13520.f;
            C13520 c13526 = c13520.g;
            if (c13525 != null && c13526 != null) {
                C13520 c13527 = c13526;
                while (true) {
                    C13520 c13528 = c13527.f;
                    if (c13528 == null) {
                        break;
                    }
                    c13527 = c13528;
                }
                boolean z = c13527.i;
                c13527.i = c13520.i;
                c13520.i = z;
                C13520 c13529 = c13527.g;
                C13520 c135210 = c13520.e;
                if (c13527 == c13526) {
                    c13520.e = c13527;
                    c13527.g = c13520;
                } else {
                    C13520 c135211 = c13527.e;
                    c13520.e = c135211;
                    if (c135211 != null) {
                        if (c13527 == c135211.f) {
                            c135211.f = c13520;
                        } else {
                            c135211.g = c13520;
                        }
                    }
                    c13527.g = c13526;
                    c13526.e = c13527;
                }
                c13520.f = null;
                c13520.g = c13529;
                if (c13529 != null) {
                    c13529.e = c13520;
                }
                c13527.f = c13525;
                c13525.e = c13527;
                c13527.e = c135210;
                if (c135210 == null) {
                    c13520B = c13527;
                } else if (c13520 == c135210.f) {
                    c135210.f = c13527;
                } else {
                    c135210.g = c13527;
                }
                if (c13529 != null) {
                    c13525 = c13529;
                } else {
                    c13525 = c13520;
                }
            } else if (c13525 == null) {
                if (c13526 != null) {
                    c13525 = c13526;
                } else {
                    c13525 = c13520;
                }
            }
            if (c13525 != c13520) {
                C13520 c135212 = c13520.e;
                c13525.e = c135212;
                if (c135212 == null) {
                    c13520B = c13525;
                } else if (c13520 == c135212.f) {
                    c135212.f = c13525;
                } else {
                    c135212.g = c13525;
                }
                c13520.e = null;
                c13520.g = null;
                c13520.f = null;
            }
            if (!c13520.i) {
                c13520B = b(c13520B, c13525);
            }
            this.e = c13520B;
            if (c13520 == c13525 && (c13522 = c13520.e) != null) {
                if (c13520 == c13522.f) {
                    c13522.f = null;
                } else if (c13520 == c13522.g) {
                    c13522.g = null;
                }
                c13520.e = null;
            }
            return false;
        } finally {
            this.lockState = 0;
        }
    }

    public static C13520 g(C13520 c13520, C13520 c13521) {
        C13520 c13522;
        if (c13521 != null && (c13522 = c13521.g) != null) {
            C13520 c13523 = c13522.f;
            c13521.g = c13523;
            if (c13523 != null) {
                c13523.e = c13521;
            }
            C13520 c13524 = c13521.e;
            c13522.e = c13524;
            if (c13524 == null) {
                c13522.i = false;
                c13520 = c13522;
            } else if (c13524.f == c13521) {
                c13524.f = c13522;
            } else {
                c13524.g = c13522;
            }
            c13522.f = c13521;
            c13521.e = c13522;
        }
        return c13520;
    }

    public static C13520 h(C13520 c13520, C13520 c13521) {
        C13520 c13522;
        if (c13521 != null && (c13522 = c13521.f) != null) {
            C13520 c13523 = c13522.g;
            c13521.f = c13523;
            if (c13523 != null) {
                c13523.e = c13521;
            }
            C13520 c13524 = c13521.e;
            c13522.e = c13524;
            if (c13524 == null) {
                c13522.i = false;
                c13520 = c13522;
            } else if (c13524.g == c13521) {
                c13524.g = c13522;
            } else {
                c13524.f = c13522;
            }
            c13522.g = c13521;
            c13521.e = c13522;
        }
        return c13520;
    }

    public static C13520 c(C13520 c13520, C13520 c13521) {
        C13520 c13522;
        c13521.i = true;
        while (true) {
            C13520 c13523 = c13521.e;
            if (c13523 == null) {
                c13521.i = false;
                return c13521;
            }
            if (!c13523.i || (c13522 = c13523.e) == null) {
                return c13520;
            }
            C13520 c13524 = c13522.f;
            if (c13523 == c13524) {
                C13520 c13525 = c13522.g;
                if (c13525 != null && c13525.i) {
                    c13525.i = false;
                    c13523.i = false;
                    c13522.i = true;
                    c13521 = c13522;
                } else {
                    if (c13521 == c13523.g) {
                        c13520 = g(c13520, c13523);
                        C13520 c13526 = c13523.e;
                        c13522 = c13526 == null ? null : c13526.e;
                        c13523 = c13526;
                        c13521 = c13523;
                    }
                    if (c13523 != null) {
                        c13523.i = false;
                        if (c13522 != null) {
                            c13522.i = true;
                            c13520 = h(c13520, c13522);
                        }
                    }
                }
            } else if (c13524 != null && c13524.i) {
                c13524.i = false;
                c13523.i = false;
                c13522.i = true;
                c13521 = c13522;
            } else {
                if (c13521 == c13523.f) {
                    c13520 = h(c13520, c13523);
                    C13520 c13527 = c13523.e;
                    c13522 = c13527 == null ? null : c13527.e;
                    c13523 = c13527;
                    c13521 = c13523;
                }
                if (c13523 != null) {
                    c13523.i = false;
                    if (c13522 != null) {
                        c13522.i = true;
                        c13520 = g(c13520, c13522);
                    }
                }
            }
        }
    }

    public static C13520 b(C13520 c13520, C13520 c13521) {
        while (c13521 != null && c13521 != c13520) {
            C13520 c13522 = c13521.e;
            if (c13522 == null) {
                c13521.i = false;
                return c13521;
            }
            if (c13521.i) {
                c13521.i = false;
                return c13520;
            }
            C13520 c13523 = c13522.f;
            if (c13523 == c13521) {
                C13520 c13524 = c13522.g;
                if (c13524 != null && c13524.i) {
                    c13524.i = false;
                    c13522.i = true;
                    c13520 = g(c13520, c13522);
                    c13522 = c13521.e;
                    c13524 = c13522 == null ? null : c13522.g;
                }
                if (c13524 != null) {
                    C13520 c13525 = c13524.f;
                    C13520 c13526 = c13524.g;
                    if ((c13526 == null || !c13526.i) && (c13525 == null || !c13525.i)) {
                        c13524.i = true;
                    } else {
                        if (c13526 == null || !c13526.i) {
                            if (c13525 != null) {
                                c13525.i = false;
                            }
                            c13524.i = true;
                            c13520 = h(c13520, c13524);
                            c13522 = c13521.e;
                            c13524 = c13522 != null ? c13522.g : null;
                        }
                        if (c13524 != null) {
                            c13524.i = c13522 == null ? false : c13522.i;
                            C13520 c13527 = c13524.g;
                            if (c13527 != null) {
                                c13527.i = false;
                            }
                        }
                        if (c13522 != null) {
                            c13522.i = false;
                            c13520 = g(c13520, c13522);
                        }
                        c13521 = c13520;
                        c13520 = c13521;
                    }
                }
                c13521 = c13522;
            } else {
                if (c13523 != null && c13523.i) {
                    c13523.i = false;
                    c13522.i = true;
                    c13520 = h(c13520, c13522);
                    c13522 = c13521.e;
                    c13523 = c13522 == null ? null : c13522.f;
                }
                if (c13523 != null) {
                    C13520 c13528 = c13523.f;
                    C13520 c13529 = c13523.g;
                    if ((c13528 == null || !c13528.i) && (c13529 == null || !c13529.i)) {
                        c13523.i = true;
                    } else {
                        if (c13528 == null || !c13528.i) {
                            if (c13529 != null) {
                                c13529.i = false;
                            }
                            c13523.i = true;
                            c13520 = g(c13520, c13523);
                            c13522 = c13521.e;
                            c13523 = c13522 != null ? c13522.f : null;
                        }
                        if (c13523 != null) {
                            c13523.i = c13522 == null ? false : c13522.i;
                            C13520 c135210 = c13523.f;
                            if (c135210 != null) {
                                c135210.i = false;
                            }
                        }
                        if (c13522 != null) {
                            c13522.i = false;
                            c13520 = h(c13520, c13522);
                        }
                        c13521 = c13520;
                        c13520 = c13521;
                    }
                }
                c13521 = c13522;
            }
        }
        return c13520;
    }
}
