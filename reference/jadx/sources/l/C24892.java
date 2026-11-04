package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻۟۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 47G4 */
/* JADX INFO: loaded from: classes.dex */
public final class C24892 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f80534;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f80535;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Throwable f80537;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f80538;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f80540;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C5500 f80541;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f80542;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public volatile EnumC16686 f80536 = EnumC16686.UNKNOWN;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object f80539 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC16686 m55425() {
        return this.f80536;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m55426() {
        synchronized (this.f80539) {
            this.f80536 = EnumC16686.UNKNOWN;
            this.f80541 = null;
            this.f80537 = null;
            this.f80540++;
            this.f80538 = false;
            this.f80534 = 0L;
            this.f80539.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11465 m55424(C6246 c6246, C24146 c24146) {
        Throwable th;
        C5500 c5500M17874;
        boolean z;
        while (c24146.f78158.m43940(c24146.f78159)) {
            EnumC16686 enumC16686 = this.f80536;
            EnumC16686 enumC16687 = EnumC16686.UNKNOWN;
            if (enumC16686 != enumC16687) {
                return new C11465(enumC16686, false);
            }
            synchronized (this.f80539) {
                if (!c24146.f78158.m43940(c24146.f78159)) {
                    return new C11465(enumC16687, true);
                }
                EnumC16686 enumC16688 = this.f80536;
                if (enumC16688 != enumC16687) {
                    return new C11465(enumC16688, false);
                }
                if (this.f80538) {
                    long j = this.f80534;
                    while (this.f80538 && this.f80534 == j) {
                        try {
                            this.f80539.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new IOException("Interrupted while waiting for SMB protocol probing", e);
                        }
                    }
                    if (!c24146.f78158.m43940(c24146.f78159)) {
                        return new C11465(EnumC16686.UNKNOWN, true);
                    }
                    EnumC16686 enumC16689 = this.f80536;
                    EnumC16686 enumC166810 = EnumC16686.UNKNOWN;
                    if (enumC16689 != enumC166810) {
                        return new C11465(enumC16689, false);
                    }
                    C5500 c5500 = this.f80541;
                    if (c5500 != null && this.f80535 == j) {
                        if (c5500.m16327() != null) {
                            m55423(this.f80541.m16327());
                            throw null;
                        }
                        if (this.f80541.m16328() != enumC166810) {
                            return new C11465(this.f80541.m16328(), false);
                        }
                    }
                    Throwable th2 = this.f80537;
                    if (th2 != null && this.f80542 == j) {
                        m55423(th2);
                        throw null;
                    }
                    return new C11465(enumC166810, true);
                }
                this.f80538 = true;
                long j2 = this.f80540 + 1;
                this.f80540 = j2;
                this.f80534 = j2;
                try {
                    c5500M17874 = c6246.m17874();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                    c5500M17874 = null;
                }
                synchronized (this.f80539) {
                    z = this.f80540 != j2;
                    if (!z) {
                        this.f80541 = c5500M17874;
                        this.f80535 = j2;
                        this.f80537 = th;
                        this.f80542 = j2;
                        if (th == null && c5500M17874 != null && c5500M17874.m16328() != EnumC16686.UNKNOWN) {
                            this.f80536 = c5500M17874.m16328();
                        }
                    }
                    if (this.f80534 == j2) {
                        this.f80538 = false;
                        this.f80534 = 0L;
                    }
                    this.f80539.notifyAll();
                }
                if (z) {
                    return new C11465(EnumC16686.UNKNOWN, true);
                }
                if (th != null) {
                    m55423(th);
                    throw null;
                }
                if (c5500M17874.m16327() != null) {
                    m55423(c5500M17874.m16327());
                    throw null;
                }
                if (c5500M17874.m16328() != EnumC16686.UNKNOWN) {
                    return new C11465(c5500M17874.m16328(), false);
                }
            }
        }
        return new C11465(EnumC16686.UNKNOWN, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55423(Throwable th) throws IOException {
        if (th instanceof IOException) {
            IOException iOException = (IOException) th;
            C22327.m50389(iOException);
            throw iOException;
        }
        if (th instanceof RuntimeException) {
            RuntimeException runtimeException = (RuntimeException) th;
            C22327.m50389(runtimeException);
            throw runtimeException;
        }
        if (th instanceof Error) {
            Error error = (Error) th;
            C22327.m50389(error);
            throw error;
        }
        throw new IOException("SMB protocol probing failed", th);
    }
}
