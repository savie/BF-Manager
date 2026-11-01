package l;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.ܺۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15900 extends C19427 {
    public static final C2762 h;
    public static final long i;
    public C20133 e;
    public volatile C20133 f;
    public volatile Thread g;
    public volatile int lockState;

    static {
        C2762 c2762 = C2762.b;
        h = c2762;
        i = c2762.h(C15900.class, "lockState");
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
    public C15900(C20133 c20133) {
        int i2;
        super(-2, null, null);
        this.f = c20133;
        C20133 c20134 = null;
        while (c20133 != null) {
            C20133 c20135 = (C20133) c20133.d;
            c20133.g = null;
            c20133.f = null;
            if (c20134 == null) {
                c20133.e = null;
                c20133.i = false;
            } else {
                Object obj = c20133.b;
                int i3 = c20133.a;
                C20133 c20136 = c20134;
                Class<?> clsC = null;
                while (true) {
                    Object obj2 = c20136.b;
                    int i4 = c20136.a;
                    if (i4 > i3) {
                        i2 = -1;
                    } else if (i4 < i3) {
                        i2 = 1;
                    } else if (clsC != null || (clsC = ConcurrentMapC13783.c(obj)) != null) {
                        int i5 = ConcurrentMapC13783.g;
                        int iCompareTo = (obj2 == null || obj2.getClass() != clsC) ? 0 : ((Comparable) obj).compareTo(obj2);
                        if (iCompareTo == 0) {
                            i2 = i(obj, obj2);
                        } else {
                            i2 = iCompareTo;
                        }
                    } else {
                        i2 = i(obj, obj2);
                    }
                    C20133 c20137 = i2 <= 0 ? c20136.f : c20136.g;
                    if (c20137 == null) {
                        break;
                    } else {
                        c20136 = c20137;
                    }
                }
                c20133.e = c20136;
                if (i2 <= 0) {
                    c20136.f = c20133;
                } else {
                    c20136.g = c20133;
                }
                c20133 = c(c20134, c20133);
            }
            c20134 = c20133;
            c20133 = c20135;
        }
        this.e = c20134;
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

    @Override // l.C19427
    public final C19427 a(int i2, Object obj) {
        Object obj2;
        Thread thread;
        C19427 c19427 = this.f;
        while (true) {
            C20133 c20133B = null;
            if (c19427 == null) {
                return null;
            }
            int i3 = this.lockState;
            if ((i3 & 3) != 0) {
                if (c19427.a == i2 && ((obj2 = c19427.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return c19427;
                }
                c19427 = c19427.d;
            } else if (h.c(this, i, i3, i3 + 4)) {
                try {
                    C20133 c20133 = this.e;
                    if (c20133 != null) {
                        c20133B = c20133.b(i2, obj, null);
                    }
                    return c20133B;
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
    public final C20133 e(int i2, Object obj, Object obj2) {
        int i3;
        C20133 c20133;
        C20133 c20134;
        C20133 c20133B;
        C20133 c20133B2;
        boolean z = false;
        C20133 c20135 = this.e;
        Class<?> clsC = null;
        while (c20135 != null) {
            int i4 = c20135.a;
            if (i4 > i2) {
                i3 = -1;
            } else if (i4 < i2) {
                i3 = 1;
            } else {
                Object obj3 = c20135.b;
                if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                    return c20135;
                }
                if (clsC != null || (clsC = ConcurrentMapC13783.c(obj)) != null) {
                    int i5 = ConcurrentMapC13783.g;
                    int iCompareTo = (obj3 == null || obj3.getClass() != clsC) ? 0 : ((Comparable) obj).compareTo(obj3);
                    if (iCompareTo == 0) {
                        if (!z) {
                            c20133 = c20135.f;
                            if (c20133 == null && (c20133B2 = c20133.b(i2, obj, clsC)) != null) {
                                return c20133B2;
                            }
                            c20134 = c20135.g;
                            if (c20134 == null && (c20133B = c20134.b(i2, obj, clsC)) != null) {
                                return c20133B;
                            }
                            z = true;
                        }
                        i3 = i(obj, obj3);
                    } else {
                        i3 = iCompareTo;
                    }
                } else {
                    if (!z) {
                        c20133 = c20135.f;
                        if (c20133 == null) {
                        }
                        c20134 = c20135.g;
                        if (c20134 == null) {
                        }
                        z = true;
                    }
                    i3 = i(obj, obj3);
                }
            }
            C20133 c20136 = i3 <= 0 ? c20135.f : c20135.g;
            if (c20136 == null) {
                C20133 c20137 = this.f;
                C20133 c20138 = new C20133(i2, obj, obj2, c20137, c20135);
                this.f = c20138;
                if (c20137 != null) {
                    c20137.h = c20138;
                }
                if (i3 <= 0) {
                    c20135.f = c20138;
                } else {
                    c20135.g = c20138;
                }
                if (!c20135.i) {
                    c20138.i = true;
                    return null;
                }
                d();
                try {
                    this.e = c(this.e, c20138);
                    return null;
                } finally {
                    this.lockState = 0;
                }
            }
            c20135 = c20136;
        }
        C20133 c20139 = new C20133(i2, obj, obj2, null, null);
        this.e = c20139;
        this.f = c20139;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x008b A[PHI: r0
      0x008b: PHI (r0v4 l.᩶ۧᩴ) = (r0v3 l.᩶ۧᩴ), (r0v12 l.᩶ۧᩴ) binds: [B:53:0x0087, B:49:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean f(C20133 c20133) {
        C20133 c20134;
        C20133 c20135;
        C20133 c20136 = (C20133) c20133.d;
        C20133 c20137 = c20133.h;
        if (c20137 == null) {
            this.f = c20136;
        } else {
            c20137.d = c20136;
        }
        if (c20136 != null) {
            c20136.h = c20137;
        }
        if (this.f == null) {
            this.e = null;
            return true;
        }
        C20133 c20133B = this.e;
        if (c20133B == null || c20133B.g == null || (c20134 = c20133B.f) == null || c20134.f == null) {
            return true;
        }
        d();
        try {
            C20133 c20138 = c20133.f;
            C20133 c20139 = c20133.g;
            if (c20138 != null && c20139 != null) {
                C20133 c201310 = c20139;
                while (true) {
                    C20133 c201311 = c201310.f;
                    if (c201311 == null) {
                        break;
                    }
                    c201310 = c201311;
                }
                boolean z = c201310.i;
                c201310.i = c20133.i;
                c20133.i = z;
                C20133 c201312 = c201310.g;
                C20133 c201313 = c20133.e;
                if (c201310 == c20139) {
                    c20133.e = c201310;
                    c201310.g = c20133;
                } else {
                    C20133 c201314 = c201310.e;
                    c20133.e = c201314;
                    if (c201314 != null) {
                        if (c201310 == c201314.f) {
                            c201314.f = c20133;
                        } else {
                            c201314.g = c20133;
                        }
                    }
                    c201310.g = c20139;
                    c20139.e = c201310;
                }
                c20133.f = null;
                c20133.g = c201312;
                if (c201312 != null) {
                    c201312.e = c20133;
                }
                c201310.f = c20138;
                c20138.e = c201310;
                c201310.e = c201313;
                if (c201313 == null) {
                    c20133B = c201310;
                } else if (c20133 == c201313.f) {
                    c201313.f = c201310;
                } else {
                    c201313.g = c201310;
                }
                if (c201312 != null) {
                    c20138 = c201312;
                } else {
                    c20138 = c20133;
                }
            } else if (c20138 == null) {
                if (c20139 != null) {
                    c20138 = c20139;
                } else {
                    c20138 = c20133;
                }
            }
            if (c20138 != c20133) {
                C20133 c201315 = c20133.e;
                c20138.e = c201315;
                if (c201315 == null) {
                    c20133B = c20138;
                } else if (c20133 == c201315.f) {
                    c201315.f = c20138;
                } else {
                    c201315.g = c20138;
                }
                c20133.e = null;
                c20133.g = null;
                c20133.f = null;
            }
            if (!c20133.i) {
                c20133B = b(c20133B, c20138);
            }
            this.e = c20133B;
            if (c20133 == c20138 && (c20135 = c20133.e) != null) {
                if (c20133 == c20135.f) {
                    c20135.f = null;
                } else if (c20133 == c20135.g) {
                    c20135.g = null;
                }
                c20133.e = null;
            }
            return false;
        } finally {
            this.lockState = 0;
        }
    }

    public static C20133 g(C20133 c20133, C20133 c20134) {
        C20133 c20135;
        if (c20134 != null && (c20135 = c20134.g) != null) {
            C20133 c20136 = c20135.f;
            c20134.g = c20136;
            if (c20136 != null) {
                c20136.e = c20134;
            }
            C20133 c20137 = c20134.e;
            c20135.e = c20137;
            if (c20137 == null) {
                c20135.i = false;
                c20133 = c20135;
            } else if (c20137.f == c20134) {
                c20137.f = c20135;
            } else {
                c20137.g = c20135;
            }
            c20135.f = c20134;
            c20134.e = c20135;
        }
        return c20133;
    }

    public static C20133 h(C20133 c20133, C20133 c20134) {
        C20133 c20135;
        if (c20134 != null && (c20135 = c20134.f) != null) {
            C20133 c20136 = c20135.g;
            c20134.f = c20136;
            if (c20136 != null) {
                c20136.e = c20134;
            }
            C20133 c20137 = c20134.e;
            c20135.e = c20137;
            if (c20137 == null) {
                c20135.i = false;
                c20133 = c20135;
            } else if (c20137.g == c20134) {
                c20137.g = c20135;
            } else {
                c20137.f = c20135;
            }
            c20135.g = c20134;
            c20134.e = c20135;
        }
        return c20133;
    }

    public static C20133 c(C20133 c20133, C20133 c20134) {
        C20133 c20135;
        c20134.i = true;
        while (true) {
            C20133 c20136 = c20134.e;
            if (c20136 == null) {
                c20134.i = false;
                return c20134;
            }
            if (!c20136.i || (c20135 = c20136.e) == null) {
                return c20133;
            }
            C20133 c20137 = c20135.f;
            if (c20136 == c20137) {
                C20133 c20138 = c20135.g;
                if (c20138 != null && c20138.i) {
                    c20138.i = false;
                    c20136.i = false;
                    c20135.i = true;
                    c20134 = c20135;
                } else {
                    if (c20134 == c20136.g) {
                        c20133 = g(c20133, c20136);
                        C20133 c20139 = c20136.e;
                        c20135 = c20139 == null ? null : c20139.e;
                        c20136 = c20139;
                        c20134 = c20136;
                    }
                    if (c20136 != null) {
                        c20136.i = false;
                        if (c20135 != null) {
                            c20135.i = true;
                            c20133 = h(c20133, c20135);
                        }
                    }
                }
            } else if (c20137 != null && c20137.i) {
                c20137.i = false;
                c20136.i = false;
                c20135.i = true;
                c20134 = c20135;
            } else {
                if (c20134 == c20136.f) {
                    c20133 = h(c20133, c20136);
                    C20133 c201310 = c20136.e;
                    c20135 = c201310 == null ? null : c201310.e;
                    c20136 = c201310;
                    c20134 = c20136;
                }
                if (c20136 != null) {
                    c20136.i = false;
                    if (c20135 != null) {
                        c20135.i = true;
                        c20133 = g(c20133, c20135);
                    }
                }
            }
        }
    }

    public static C20133 b(C20133 c20133, C20133 c20134) {
        while (c20134 != null && c20134 != c20133) {
            C20133 c20135 = c20134.e;
            if (c20135 == null) {
                c20134.i = false;
                return c20134;
            }
            if (c20134.i) {
                c20134.i = false;
                return c20133;
            }
            C20133 c20136 = c20135.f;
            if (c20136 == c20134) {
                C20133 c20137 = c20135.g;
                if (c20137 != null && c20137.i) {
                    c20137.i = false;
                    c20135.i = true;
                    c20133 = g(c20133, c20135);
                    c20135 = c20134.e;
                    c20137 = c20135 == null ? null : c20135.g;
                }
                if (c20137 != null) {
                    C20133 c20138 = c20137.f;
                    C20133 c20139 = c20137.g;
                    if ((c20139 == null || !c20139.i) && (c20138 == null || !c20138.i)) {
                        c20137.i = true;
                    } else {
                        if (c20139 == null || !c20139.i) {
                            if (c20138 != null) {
                                c20138.i = false;
                            }
                            c20137.i = true;
                            c20133 = h(c20133, c20137);
                            c20135 = c20134.e;
                            c20137 = c20135 != null ? c20135.g : null;
                        }
                        if (c20137 != null) {
                            c20137.i = c20135 == null ? false : c20135.i;
                            C20133 c201310 = c20137.g;
                            if (c201310 != null) {
                                c201310.i = false;
                            }
                        }
                        if (c20135 != null) {
                            c20135.i = false;
                            c20133 = g(c20133, c20135);
                        }
                        c20134 = c20133;
                        c20133 = c20134;
                    }
                }
                c20134 = c20135;
            } else {
                if (c20136 != null && c20136.i) {
                    c20136.i = false;
                    c20135.i = true;
                    c20133 = h(c20133, c20135);
                    c20135 = c20134.e;
                    c20136 = c20135 == null ? null : c20135.f;
                }
                if (c20136 != null) {
                    C20133 c201311 = c20136.f;
                    C20133 c201312 = c20136.g;
                    if ((c201311 == null || !c201311.i) && (c201312 == null || !c201312.i)) {
                        c20136.i = true;
                    } else {
                        if (c201311 == null || !c201311.i) {
                            if (c201312 != null) {
                                c201312.i = false;
                            }
                            c20136.i = true;
                            c20133 = g(c20133, c20136);
                            c20135 = c20134.e;
                            c20136 = c20135 != null ? c20135.f : null;
                        }
                        if (c20136 != null) {
                            c20136.i = c20135 == null ? false : c20135.i;
                            C20133 c201313 = c20136.f;
                            if (c201313 != null) {
                                c201313.i = false;
                            }
                        }
                        if (c20135 != null) {
                            c20135.i = false;
                            c20133 = h(c20133, c20135);
                        }
                        c20134 = c20133;
                        c20133 = c20134;
                    }
                }
                c20134 = c20135;
            }
        }
        return c20133;
    }
}
