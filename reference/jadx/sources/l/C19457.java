package l;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ᩴ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A9YW */
/* JADX INFO: loaded from: classes5.dex */
public final class C19457 implements InterfaceC14981 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f62848 = C16980.m40037(C19457.class);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1337 f62849;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f62850 = new AtomicLong(1);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C22441 f62851;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        m44983();
    }

    public C19457(C1337 c1337, C22441 c22441) {
        this.f62849 = c1337;
        c22441.m50609();
        this.f62851 = c22441;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C8794 m44985() {
        return this.f62851.m50618();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m44976() {
        this.f62851.m50604(this.f62849, (InterfaceC7874) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44973(int i) {
        C8794 c8794M50618 = this.f62851.m50618();
        try {
            if (c8794M50618 != null) {
                C14014 c14014M23613 = c8794M50618.m23613();
                try {
                    boolean zMo11406 = c14014M23613.m34131().mo11406(i);
                    c14014M23613.m1095();
                    c8794M50618.m23611();
                    return zMo11406;
                } catch (Throwable th) {
                    try {
                        c14014M23613.m1095();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new C20728("Not connected");
        } catch (Throwable th3) {
            if (c8794M50618 != null) {
                try {
                    c8794M50618.m23611();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m44970() {
        return this.f62851.m50613();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5878 m44979() {
        return this.f62851.m50612();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long m44969() {
        return this.f62851.m50615();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18315 m44971(InterfaceC21299 interfaceC21299, InterfaceC18315 interfaceC18315, EnumC13269... enumC13269Arr) {
        return this.f62851.m50605(this.f62849, interfaceC21299, interfaceC18315, enumC13269Arr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44972() {
        if (this.f62850.incrementAndGet() == 1) {
            this.f62851.m50609();
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m44983() {
        long jDecrementAndGet = this.f62850.decrementAndGet();
        if (jDecrementAndGet == 0) {
            this.f62851.m50611();
        } else if (jDecrementAndGet < 0) {
            throw new C3640("Usage count dropped below zero");
        }
    }

    public final void finalize() {
        if (this.f62850.get() != 0) {
            f62848.mo13729("Tree handle was not properly released " + this.f62849.m4922());
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long m44980() {
        C8794 c8794M50618 = this.f62851.m50618();
        try {
            C14014 c14014M23613 = c8794M50618.m23613();
            try {
                InterfaceC8619 interfaceC8619M34131 = c14014M23613.m34131();
                if (!(interfaceC8619M34131 instanceof C5242)) {
                    c14014M23613.m1095();
                    c8794M50618.m23611();
                    return 0L;
                }
                long j = ((long) (((C5242) interfaceC8619M34131).m15750().f67490 * 1000)) * 60;
                c14014M23613.m1095();
                c8794M50618.m23611();
                return j;
            } catch (Throwable th) {
                try {
                    c14014M23613.m1095();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c8794M50618 != null) {
                try {
                    c8794M50618.m23611();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
        if (c8794M50618 != null) {
            c8794M50618.m23611();
        }
        throw th3;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m44975() {
        C8794 c8794M50618 = this.f62851.m50618();
        try {
            C14014 c14014M23613 = c8794M50618.m23613();
            try {
                InterfaceC8619 interfaceC8619M34131 = c14014M23613.m34131();
                if (!(interfaceC8619M34131 instanceof C5242)) {
                    c14014M23613.m1095();
                    c8794M50618.m23611();
                    return null;
                }
                String str = ((C5242) interfaceC8619M34131).m15750().f67483;
                c14014M23613.m1095();
                c8794M50618.m23611();
                return str;
            } catch (Throwable th) {
                try {
                    c14014M23613.m1095();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c8794M50618 != null) {
                try {
                    c8794M50618.m23611();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
        if (c8794M50618 != null) {
            c8794M50618.m23611();
        }
        throw th3;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m44982() {
        return this.f62851.m50614();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44974(InterfaceC14981 interfaceC14981) {
        if (!C1402.m5130(interfaceC14981)) {
            return false;
        }
        return this.f62851.m50610(((C19457) interfaceC14981).f62851);
    }

    public final int getSendBufferSize() {
        C8794 c8794M50618 = this.f62851.m50618();
        try {
            C14014 c14014M23613 = c8794M50618.m23613();
            try {
                int sendBufferSize = c14014M23613.m34131().getSendBufferSize();
                c14014M23613.m1095();
                c8794M50618.m23611();
                return sendBufferSize;
            } catch (Throwable th) {
                try {
                    c14014M23613.m1095();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c8794M50618 != null) {
                try {
                    c8794M50618.m23611();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m44981() {
        C8794 c8794M50618 = this.f62851.m50618();
        try {
            C14014 c14014M23613 = c8794M50618.m23613();
            try {
                int iMo11412 = c14014M23613.m34131().mo11412();
                c14014M23613.m1095();
                c8794M50618.m23611();
                return iMo11412;
            } catch (Throwable th) {
                try {
                    c14014M23613.m1095();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c8794M50618 != null) {
                try {
                    c8794M50618.m23611();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m44977() {
        C8794 c8794M50618 = this.f62851.m50618();
        try {
            C14014 c14014M23613 = c8794M50618.m23613();
            try {
                int iMo11405 = c14014M23613.m34131().mo11405();
                c14014M23613.m1095();
                c8794M50618.m23611();
                return iMo11405;
            } catch (Throwable th) {
                try {
                    c14014M23613.m1095();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c8794M50618 != null) {
                try {
                    c8794M50618.m23611();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m44984() {
        C8794 c8794M50618 = this.f62851.m50618();
        try {
            C14014 c14014M23613 = c8794M50618.m23613();
            try {
                boolean zMo11410 = c14014M23613.m34131().mo11410();
                c14014M23613.m1095();
                c8794M50618.m23611();
                return zMo11410;
            } catch (Throwable th) {
                try {
                    c14014M23613.m1095();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c8794M50618 != null) {
                try {
                    c8794M50618.m23611();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m44978() {
        try {
            C8794 c8794M50618 = this.f62851.m50618();
            try {
                C14014 c14014M23613 = c8794M50618.m23613();
                try {
                    boolean zM34133 = c14014M23613.m34133();
                    c14014M23613.m1095();
                    c8794M50618.m23611();
                    return zM34133;
                } catch (Throwable th) {
                    try {
                        c14014M23613.m1095();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (c8794M50618 != null) {
                    try {
                        c8794M50618.m23611();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (C20728 e) {
            f62848.mo13711("Failed to connect for determining SMB2 support", e);
            return false;
        }
    }
}
