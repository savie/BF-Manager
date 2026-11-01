package l;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ᩳۤ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A9YW */
/* JADX INFO: loaded from: classes5.dex */
public final class C17987 implements InterfaceC18693 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f57522 = C13488.m32997(C17987.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AtomicLong f57523 = new AtomicLong(1);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C2464 f57524;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C21515 f57525;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        m41879();
    }

    public C17987(C2464 c2464, C21515 c21515) {
        this.f57524 = c2464;
        c21515.m48219();
        this.f57525 = c21515;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C1053 m41877() {
        return this.f57525.m48213();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m41867() {
        this.f57525.m48218(this.f57524, (InterfaceC11970) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41870(int i) {
        C1053 c1053M48213 = this.f57525.m48213();
        try {
            if (c1053M48213 != null) {
                C3875 c3875M3985 = c1053M48213.m3985();
                try {
                    boolean zMo11869 = c3875M3985.m11246().mo11869(i);
                    c3875M3985.m9589();
                    c1053M48213.m3984();
                    return zMo11869;
                } catch (Throwable th) {
                    try {
                        c3875M3985.m9589();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new C12303("Not connected");
        } catch (Throwable th3) {
            if (c1053M48213 != null) {
                try {
                    c1053M48213.m3984();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m41880() {
        return this.f57525.m48212();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC10601 m41882() {
        return this.f57525.m48222();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final long m41872() {
        return this.f57525.m48221();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4913 m41868(InterfaceC3314 interfaceC3314, InterfaceC4913 interfaceC4913, EnumC19358... enumC19358Arr) {
        return this.f57525.m48214(this.f57524, interfaceC3314, interfaceC4913, enumC19358Arr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41869() {
        if (this.f57523.incrementAndGet() == 1) {
            this.f57525.m48219();
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m41879() {
        long jDecrementAndGet = this.f57523.decrementAndGet();
        if (jDecrementAndGet == 0) {
            this.f57525.m48223();
        } else if (jDecrementAndGet < 0) {
            throw new C17655("Usage count dropped below zero");
        }
    }

    public final void finalize() {
        if (this.f57523.get() != 0) {
            f57522.mo12116("Tree handle was not properly released " + this.f57524.m7563());
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m41876() {
        C1053 c1053M48213 = this.f57525.m48213();
        try {
            C3875 c3875M3985 = c1053M48213.m3985();
            try {
                InterfaceC4207 interfaceC4207M11246 = c3875M3985.m11246();
                if (!(interfaceC4207M11246 instanceof C23154)) {
                    c3875M3985.m9589();
                    c1053M48213.m3984();
                    return 0L;
                }
                long j = ((long) (((C23154) interfaceC4207M11246).m51147().f33657 * 1000)) * 60;
                c3875M3985.m9589();
                c1053M48213.m3984();
                return j;
            } catch (Throwable th) {
                try {
                    c3875M3985.m9589();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c1053M48213 != null) {
                try {
                    c1053M48213.m3984();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
        if (c1053M48213 != null) {
            c1053M48213.m3984();
        }
        throw th3;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m41874() {
        C1053 c1053M48213 = this.f57525.m48213();
        try {
            C3875 c3875M3985 = c1053M48213.m3985();
            try {
                InterfaceC4207 interfaceC4207M11246 = c3875M3985.m11246();
                if (!(interfaceC4207M11246 instanceof C23154)) {
                    c3875M3985.m9589();
                    c1053M48213.m3984();
                    return null;
                }
                String str = ((C23154) interfaceC4207M11246).m51147().f33651;
                c3875M3985.m9589();
                c1053M48213.m3984();
                return str;
            } catch (Throwable th) {
                try {
                    c3875M3985.m9589();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c1053M48213 != null) {
                try {
                    c1053M48213.m3984();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
        if (c1053M48213 != null) {
            c1053M48213.m3984();
        }
        throw th3;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m41878() {
        return this.f57525.m48226();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41871(InterfaceC18693 interfaceC18693) {
        if (!C6009.m16315(interfaceC18693)) {
            return false;
        }
        return this.f57525.m48220(((C17987) interfaceC18693).f57525);
    }

    public final int getSendBufferSize() {
        C1053 c1053M48213 = this.f57525.m48213();
        try {
            C3875 c3875M3985 = c1053M48213.m3985();
            try {
                int sendBufferSize = c3875M3985.m11246().getSendBufferSize();
                c3875M3985.m9589();
                c1053M48213.m3984();
                return sendBufferSize;
            } catch (Throwable th) {
                try {
                    c3875M3985.m9589();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c1053M48213 != null) {
                try {
                    c1053M48213.m3984();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m41881() {
        C1053 c1053M48213 = this.f57525.m48213();
        try {
            C3875 c3875M3985 = c1053M48213.m3985();
            try {
                int iMo11871 = c3875M3985.m11246().mo11871();
                c3875M3985.m9589();
                c1053M48213.m3984();
                return iMo11871;
            } catch (Throwable th) {
                try {
                    c3875M3985.m9589();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c1053M48213 != null) {
                try {
                    c1053M48213.m3984();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m41866() {
        C1053 c1053M48213 = this.f57525.m48213();
        try {
            C3875 c3875M3985 = c1053M48213.m3985();
            try {
                int iMo11866 = c3875M3985.m11246().mo11866();
                c3875M3985.m9589();
                c1053M48213.m3984();
                return iMo11866;
            } catch (Throwable th) {
                try {
                    c3875M3985.m9589();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c1053M48213 != null) {
                try {
                    c1053M48213.m3984();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m41873() {
        C1053 c1053M48213 = this.f57525.m48213();
        try {
            C3875 c3875M3985 = c1053M48213.m3985();
            try {
                boolean zMo11872 = c3875M3985.m11246().mo11872();
                c3875M3985.m9589();
                c1053M48213.m3984();
                return zMo11872;
            } catch (Throwable th) {
                try {
                    c3875M3985.m9589();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c1053M48213 != null) {
                try {
                    c1053M48213.m3984();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m41875() {
        try {
            C1053 c1053M48213 = this.f57525.m48213();
            try {
                C3875 c3875M3985 = c1053M48213.m3985();
                try {
                    boolean zM11248 = c3875M3985.m11248();
                    c3875M3985.m9589();
                    c1053M48213.m3984();
                    return zM11248;
                } catch (Throwable th) {
                    try {
                        c3875M3985.m9589();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (c1053M48213 != null) {
                    try {
                        c1053M48213.m3984();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (C12303 e) {
            f57522.mo12120("Failed to connect for determining SMB2 support", (Exception) e);
            return false;
        }
    }
}
