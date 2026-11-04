package l;

import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܺۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F70U */
/* JADX INFO: loaded from: classes4.dex */
public final class C16774 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16028 f54135;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f54136;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f54137;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f54138;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Throwable f54140;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C14053 f54142;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f54143;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public EnumC24980 f54139 = EnumC24980.PENDING;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f54141 = Long.MIN_VALUE;

    public C16774(C16028 c16028, AbstractC22044 abstractC22044) {
        this.f54135 = c16028;
        this.f54137 = abstractC22044;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final BufferedOutputStream m39608() throws IOException {
        synchronized (C16028.class) {
            m39596();
        }
        C16028.m38174(this.f54137, "Hex pending state file is unsafe");
        return new BufferedOutputStream(this.f54137.mo4289(false));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39602(C14053 c14053) {
        synchronized (C16028.class) {
            m39596();
            if (this.f54142 != null) {
                throw new IllegalStateException("Hex checkpoint view is already installed");
            }
            this.f54142 = c14053;
            this.f54141 = c14053.m34223();
            this.f54136 = true;
            C16028.class.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39600(long j) {
        synchronized (C16028.class) {
            m39596();
            this.f54141 = j;
            this.f54136 = true;
            C16028.class.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m39607() {
        long j;
        synchronized (C16028.class) {
            if (!this.f54136) {
                throw new IllegalStateException("Hex checkpoint generation is unavailable");
            }
            j = this.f54141;
        }
        return j;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14053 m39605() {
        C14053 c14053;
        synchronized (C16028.class) {
            m39596();
            c14053 = this.f54142;
            if (c14053 == null) {
                throw new IOException("Hex checkpoint view is unavailable");
            }
            this.f54142 = null;
        }
        return c14053;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m39606() {
        synchronized (C16028.class) {
            m39596();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39603(boolean z) {
        synchronized (C16028.class) {
            m39596();
            if (!this.f54137.mo4304() || this.f54137.m49860()) {
                throw new IOException("Hex pending state file is unavailable");
            }
            if (!this.f54137.mo4301(this.f54135.f51992)) {
                throw new IOException("Unable to commit pending hex checkpoint");
            }
            C11392.remove(C16028.f51990, this.f54135.f51993, this);
            this.f54139 = EnumC24980.COMMITTED;
            C16028.class.notifyAll();
        }
        if (z) {
            C16028.m38168(this.f54135);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0061 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0016, B:11:0x001e, B:14:0x0024, B:22:0x0036, B:24:0x003a, B:31:0x004e, B:25:0x0040, B:32:0x005b, B:34:0x0061, B:36:0x0065, B:38:0x006a, B:37:0x0068, B:40:0x0070, B:42:0x0074, B:43:0x0077, B:44:0x007a, B:45:0x007f, B:30:0x004b, B:20:0x0031), top: B:52:0x0003, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0065 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0016, B:11:0x001e, B:14:0x0024, B:22:0x0036, B:24:0x003a, B:31:0x004e, B:25:0x0040, B:32:0x005b, B:34:0x0061, B:36:0x0065, B:38:0x006a, B:37:0x0068, B:40:0x0070, B:42:0x0074, B:43:0x0077, B:44:0x007a, B:45:0x007f, B:30:0x004b, B:20:0x0031), top: B:52:0x0003, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0068 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0016, B:11:0x001e, B:14:0x0024, B:22:0x0036, B:24:0x003a, B:31:0x004e, B:25:0x0040, B:32:0x005b, B:34:0x0061, B:36:0x0065, B:38:0x006a, B:37:0x0068, B:40:0x0070, B:42:0x0074, B:43:0x0077, B:44:0x007a, B:45:0x007f, B:30:0x004b, B:20:0x0031), top: B:52:0x0003, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0070 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0016, B:11:0x001e, B:14:0x0024, B:22:0x0036, B:24:0x003a, B:31:0x004e, B:25:0x0040, B:32:0x005b, B:34:0x0061, B:36:0x0065, B:38:0x006a, B:37:0x0068, B:40:0x0070, B:42:0x0074, B:43:0x0077, B:44:0x007a, B:45:0x007f, B:30:0x004b, B:20:0x0031), top: B:52:0x0003, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0074 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0016, B:11:0x001e, B:14:0x0024, B:22:0x0036, B:24:0x003a, B:31:0x004e, B:25:0x0040, B:32:0x005b, B:34:0x0061, B:36:0x0065, B:38:0x006a, B:37:0x0068, B:40:0x0070, B:42:0x0074, B:43:0x0077, B:44:0x007a, B:45:0x007f, B:30:0x004b, B:20:0x0031), top: B:52:0x0003, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0077 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0016, B:11:0x001e, B:14:0x0024, B:22:0x0036, B:24:0x003a, B:31:0x004e, B:25:0x0040, B:32:0x005b, B:34:0x0061, B:36:0x0065, B:38:0x006a, B:37:0x0068, B:40:0x0070, B:42:0x0074, B:43:0x0077, B:44:0x007a, B:45:0x007f, B:30:0x004b, B:20:0x0031), top: B:52:0x0003, inners: #2 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39601(Throwable th) {
        Throwable th2;
        EnumC24980 enumC24980;
        synchronized (C16028.class) {
            boolean z = C16028.f51990.get(this.f54135.f51993) == this;
            C14053 c14053 = this.f54142;
            IOException e = null;
            this.f54142 = null;
            if (c14053 != null) {
                try {
                    c14053.close();
                } catch (IOException e2) {
                    e = e2;
                }
            }
            e = null;
            try {
                C16028.m38176(this.f54137);
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
                    if (this.f54138) {
                        this.f54135.m38165();
                    } else {
                        this.f54135.m38178();
                    }
                } catch (IOException e4) {
                    if (e == null) {
                        e = e4;
                    } else {
                        e.addSuppressed(e4);
                    }
                }
                C11392.remove(C16028.f51990, this.f54135.f51993, this);
                if (this.f54139 == EnumC24980.PENDING) {
                    if (this.f54143) {
                        enumC24980 = EnumC24980.DISCARDED;
                    } else {
                        enumC24980 = EnumC24980.FAILED;
                    }
                    this.f54139 = enumC24980;
                    this.f54140 = th;
                }
                if (e != null) {
                    th2 = this.f54140;
                    if (th2 == null) {
                        this.f54140 = e;
                    } else {
                        th2.addSuppressed(e);
                    }
                }
                C16028.class.notifyAll();
            } else {
                if (this.f54139 == EnumC24980.PENDING) {
                    if (this.f54143) {
                        enumC24980 = EnumC24980.DISCARDED;
                    } else {
                        enumC24980 = EnumC24980.FAILED;
                    }
                    this.f54139 = enumC24980;
                    this.f54140 = th;
                }
                if (e != null) {
                    th2 = this.f54140;
                    if (th2 == null) {
                        this.f54140 = e;
                    } else {
                        th2.addSuppressed(e);
                    }
                }
                C16028.class.notifyAll();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC24980 m39599(InterfaceC7509 interfaceC7509) {
        EnumC24980 enumC24980;
        synchronized (C16028.class) {
            while (this.f54139 == EnumC24980.PENDING) {
                C16028.m38158(interfaceC7509);
                try {
                    C16028.class.wait(100L);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new IOException("Interrupted while waiting for hex checkpoint", e);
                }
            }
            C16028.m38158(interfaceC7509);
            enumC24980 = this.f54139;
        }
        return enumC24980;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IOException m39598() {
        IOException iOException;
        synchronized (C16028.class) {
            iOException = new IOException(this.f54139 == EnumC24980.DISCARDED ? "Hex checkpoint write was discarded" : "Hex checkpoint write failed");
            Throwable th = this.f54140;
            if (th != null) {
                iOException.initCause(th);
            }
        }
        return iOException;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m39604() {
        return this.f54139 == EnumC24980.PENDING && !this.f54143;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m39597(C16774 c16774) {
        if (c16774.f54139 == EnumC24980.PENDING) {
            c16774.f54139 = EnumC24980.SUPERSEDED;
            C14053 c14053 = c16774.f54142;
            IOException e = null;
            c16774.f54142 = null;
            if (c14053 != null) {
                try {
                    c14053.close();
                } catch (IOException e2) {
                    e = e2;
                }
            }
            if (e != null) {
                Throwable th = c16774.f54140;
                if (th == null) {
                    c16774.f54140 = e;
                } else {
                    th.addSuppressed(e);
                }
            }
            C16028.class.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39594(C16774 c16774, boolean z) {
        c16774.f54143 = true;
        c16774.f54138 = z | c16774.f54138;
        C14053 c14053 = c16774.f54142;
        IOException e = null;
        c16774.f54142 = null;
        if (c14053 != null) {
            try {
                c14053.close();
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e != null) {
            Throwable th = c16774.f54140;
            if (th == null) {
                c16774.f54140 = e;
            } else {
                th.addSuppressed(e);
            }
        }
        C16028.class.notifyAll();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m39596() throws IOException {
        if (this.f54139 != EnumC24980.PENDING || this.f54143 || C16028.f51990.get(this.f54135.f51993) != this) {
            throw new IOException("Hex checkpoint write was canceled");
        }
    }
}
