package l;

import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: F70U */
/* JADX INFO: loaded from: classes.dex */
public final class C23610 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f76495;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C1736 f76496;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f76497;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f76499;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f76500;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C23041 f76501;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Throwable f76502;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public EnumC10910 f76494 = EnumC10910.PENDING;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f76498 = Long.MIN_VALUE;

    public C23610(C1736 c1736, AbstractC20745 abstractC20745) {
        this.f76496 = c1736;
        this.f76500 = abstractC20745;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final BufferedOutputStream m52074() throws IOException {
        synchronized (C1736.class) {
            m52070();
        }
        C1736.m5760(this.f76500, "Hex pending state file is unsafe");
        return new BufferedOutputStream(this.f76500.mo33976(false));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52079(C23041 c23041) {
        synchronized (C1736.class) {
            m52070();
            if (this.f76501 != null) {
                throw new IllegalStateException("Hex checkpoint view is already installed");
            }
            this.f76501 = c23041;
            this.f76498 = c23041.m50976();
            this.f76497 = true;
            C1736.class.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52077(long j) {
        synchronized (C1736.class) {
            m52070();
            this.f76498 = j;
            this.f76497 = true;
            C1736.class.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m52083() {
        long j;
        synchronized (C1736.class) {
            if (!this.f76497) {
                throw new IllegalStateException("Hex checkpoint generation is unavailable");
            }
            j = this.f76498;
        }
        return j;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23041 m52084() {
        C23041 c23041;
        synchronized (C1736.class) {
            m52070();
            c23041 = this.f76501;
            if (c23041 == null) {
                throw new IOException("Hex checkpoint view is unavailable");
            }
            this.f76501 = null;
        }
        return c23041;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m52081() {
        synchronized (C1736.class) {
            m52070();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52080(boolean z) {
        synchronized (C1736.class) {
            m52070();
            if (!this.f76500.mo33971() || this.f76500.m46723()) {
                throw new IOException("Hex pending state file is unavailable");
            }
            if (!this.f76500.mo24646(this.f76496.f6862)) {
                throw new IOException("Unable to commit pending hex checkpoint");
            }
            C9735.remove(C1736.f6857, this.f76496.f6858, this);
            this.f76494 = EnumC10910.COMMITTED;
            C1736.class.notifyAll();
        }
        if (z) {
            C1736.m5761(this.f76496);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0061 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0016, B:11:0x001e, B:14:0x0024, B:22:0x0036, B:24:0x003a, B:31:0x004e, B:25:0x0040, B:32:0x005b, B:34:0x0061, B:36:0x0065, B:38:0x006a, B:37:0x0068, B:40:0x0070, B:42:0x0074, B:43:0x0077, B:44:0x007a, B:45:0x007f, B:30:0x004b, B:20:0x0031), top: B:52:0x0003, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0065 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0016, B:11:0x001e, B:14:0x0024, B:22:0x0036, B:24:0x003a, B:31:0x004e, B:25:0x0040, B:32:0x005b, B:34:0x0061, B:36:0x0065, B:38:0x006a, B:37:0x0068, B:40:0x0070, B:42:0x0074, B:43:0x0077, B:44:0x007a, B:45:0x007f, B:30:0x004b, B:20:0x0031), top: B:52:0x0003, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0068 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0016, B:11:0x001e, B:14:0x0024, B:22:0x0036, B:24:0x003a, B:31:0x004e, B:25:0x0040, B:32:0x005b, B:34:0x0061, B:36:0x0065, B:38:0x006a, B:37:0x0068, B:40:0x0070, B:42:0x0074, B:43:0x0077, B:44:0x007a, B:45:0x007f, B:30:0x004b, B:20:0x0031), top: B:52:0x0003, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0070 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0016, B:11:0x001e, B:14:0x0024, B:22:0x0036, B:24:0x003a, B:31:0x004e, B:25:0x0040, B:32:0x005b, B:34:0x0061, B:36:0x0065, B:38:0x006a, B:37:0x0068, B:40:0x0070, B:42:0x0074, B:43:0x0077, B:44:0x007a, B:45:0x007f, B:30:0x004b, B:20:0x0031), top: B:52:0x0003, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0074 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0016, B:11:0x001e, B:14:0x0024, B:22:0x0036, B:24:0x003a, B:31:0x004e, B:25:0x0040, B:32:0x005b, B:34:0x0061, B:36:0x0065, B:38:0x006a, B:37:0x0068, B:40:0x0070, B:42:0x0074, B:43:0x0077, B:44:0x007a, B:45:0x007f, B:30:0x004b, B:20:0x0031), top: B:52:0x0003, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0077 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0016, B:11:0x001e, B:14:0x0024, B:22:0x0036, B:24:0x003a, B:31:0x004e, B:25:0x0040, B:32:0x005b, B:34:0x0061, B:36:0x0065, B:38:0x006a, B:37:0x0068, B:40:0x0070, B:42:0x0074, B:43:0x0077, B:44:0x007a, B:45:0x007f, B:30:0x004b, B:20:0x0031), top: B:52:0x0003, inners: #2 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52078(Throwable th) {
        Throwable th2;
        EnumC10910 enumC10910;
        synchronized (C1736.class) {
            boolean z = C1736.f6857.get(this.f76496.f6858) == this;
            C23041 c23041 = this.f76501;
            IOException e = null;
            this.f76501 = null;
            if (c23041 != null) {
                try {
                    c23041.close();
                } catch (IOException e2) {
                    e = e2;
                }
            }
            e = null;
            try {
                C1736.m5765(this.f76500);
            } catch (IOException e3) {
                e = e3;
            }
            if (e == null) {
                e = e;
            } else if (e != null) {
                e.addSuppressed(e);
            }
            if (z) {
                try {
                    if (this.f76499) {
                        this.f76496.m5773();
                    } else {
                        this.f76496.m5771();
                    }
                } catch (IOException e4) {
                    if (e == null) {
                        e = e4;
                    } else {
                        e.addSuppressed(e4);
                    }
                }
                C9735.remove(C1736.f6857, this.f76496.f6858, this);
                if (this.f76494 == EnumC10910.PENDING) {
                    if (this.f76495) {
                        enumC10910 = EnumC10910.DISCARDED;
                    } else {
                        enumC10910 = EnumC10910.FAILED;
                    }
                    this.f76494 = enumC10910;
                    this.f76502 = th;
                }
                if (e != null) {
                    th2 = this.f76502;
                    if (th2 == null) {
                        this.f76502 = e;
                    } else {
                        th2.addSuppressed(e);
                    }
                }
                C1736.class.notifyAll();
            } else {
                if (this.f76494 == EnumC10910.PENDING) {
                    if (this.f76495) {
                        enumC10910 = EnumC10910.DISCARDED;
                    } else {
                        enumC10910 = EnumC10910.FAILED;
                    }
                    this.f76494 = enumC10910;
                    this.f76502 = th;
                }
                if (e != null) {
                    th2 = this.f76502;
                    if (th2 == null) {
                        this.f76502 = e;
                    } else {
                        th2.addSuppressed(e);
                    }
                }
                C1736.class.notifyAll();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC10910 m52076(InterfaceC5614 interfaceC5614) {
        EnumC10910 enumC10910;
        synchronized (C1736.class) {
            while (this.f76494 == EnumC10910.PENDING) {
                C1736.m5758(interfaceC5614);
                try {
                    C1736.class.wait(100L);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new IOException("Interrupted while waiting for hex checkpoint", e);
                }
            }
            C1736.m5758(interfaceC5614);
            enumC10910 = this.f76494;
        }
        return enumC10910;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IOException m52075() {
        IOException iOException;
        synchronized (C1736.class) {
            iOException = new IOException(this.f76494 == EnumC10910.DISCARDED ? "Hex checkpoint write was discarded" : "Hex checkpoint write failed");
            Throwable th = this.f76502;
            if (th != null) {
                iOException.initCause(th);
            }
        }
        return iOException;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m52082() {
        return this.f76494 == EnumC10910.PENDING && !this.f76495;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m52073(C23610 c23610) {
        if (c23610.f76494 == EnumC10910.PENDING) {
            c23610.f76494 = EnumC10910.SUPERSEDED;
            C23041 c23041 = c23610.f76501;
            IOException e = null;
            c23610.f76501 = null;
            if (c23041 != null) {
                try {
                    c23041.close();
                } catch (IOException e2) {
                    e = e2;
                }
            }
            if (e != null) {
                Throwable th = c23610.f76502;
                if (th == null) {
                    c23610.f76502 = e;
                } else {
                    th.addSuppressed(e);
                }
            }
            C1736.class.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52071(C23610 c23610, boolean z) {
        c23610.f76495 = true;
        c23610.f76499 = z | c23610.f76499;
        C23041 c23041 = c23610.f76501;
        IOException e = null;
        c23610.f76501 = null;
        if (c23041 != null) {
            try {
                c23041.close();
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e != null) {
            Throwable th = c23610.f76502;
            if (th == null) {
                c23610.f76502 = e;
            } else {
                th.addSuppressed(e);
            }
        }
        C1736.class.notifyAll();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m52070() throws IOException {
        if (this.f76494 != EnumC10910.PENDING || this.f76495 || C1736.f6857.get(this.f76496.f6858) != this) {
            throw new IOException("Hex checkpoint write was canceled");
        }
    }
}
