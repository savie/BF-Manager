package l;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C7956 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C19143 f26435;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C21381 f26436;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f26437 = true;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f26438;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f26439;

    public C7956(C19143 c19143, long j, long j2, C21381 c21381) {
        this.f26435 = c19143;
        this.f26439 = j;
        this.f26438 = j2;
        this.f26436 = c21381;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m21658() {
        long j;
        synchronized (this.f26435) {
            m21655();
            j = this.f26438;
        }
        return j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m21662() {
        boolean z;
        synchronized (this.f26435) {
            z = this.f26437 && this.f26439 == this.f26435.f61958 && !this.f26435.f61946;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4908 m21659(InterfaceC7509 interfaceC7509) throws Throwable {
        C21381 c21381;
        synchronized (this.f26435) {
            m21655();
            c21381 = this.f26436;
        }
        InterfaceC7509 interfaceC7509M41888 = C17950.m41888(interfaceC7509);
        if (!interfaceC7509M41888.mo924()) {
            m21656();
            C4908 c4908 = null;
            try {
                C4908 c4909 = new C4908(this.f26435.f61944, this.f26439, this.f26438, c21381.f68092, c21381.f68095);
                try {
                    c4909.m15065();
                    m21656();
                    if (interfaceC7509M41888.mo924()) {
                        throw new C9446();
                    }
                    return c4909;
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    c4908 = c4909;
                    if (c4908 != null) {
                        try {
                            c4908.close();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    }
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Error e4) {
                e = e4;
            } catch (RuntimeException e5) {
                e = e5;
            }
        } else {
            throw new C9446();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7210 m21661(int i, int i2, InterfaceC7509 interfaceC7509) throws Throwable {
        C21381 c21381;
        synchronized (this.f26435) {
            m21655();
            C13921.m33904(this.f26436.m48614(), i, i2);
            c21381 = this.f26436;
        }
        InterfaceC7509 interfaceC7509M41888 = C17950.m41888(interfaceC7509);
        if (!interfaceC7509M41888.mo924()) {
            m21656();
            C7210 c7210 = null;
            try {
                C7210 c7211 = new C7210(this.f26435.f61944, this.f26439, this.f26438, C19143.m44345(C19606.m45215(c21381.f68092, i, i2), interfaceC7509M41888), C20767.m47486(c21381.f68095, i, i2));
                try {
                    c7211.m19801();
                    m21656();
                    if (interfaceC7509M41888.mo924()) {
                        throw new C9446();
                    }
                    return c7211;
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    c7210 = c7211;
                    if (c7210 != null) {
                        try {
                            c7210.close();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    }
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Error e4) {
                e = e4;
            } catch (RuntimeException e5) {
                e = e5;
            }
        } else {
            throw new C9446();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m21656() {
        synchronized (this.f26435) {
            m21655();
        }
        this.f26435.m44377();
        synchronized (this.f26435) {
            m21655();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7210 m21660(int i, int i2, File file, C20504 c20504) throws Throwable {
        C21381 c21381;
        Throwable th;
        C7210 c7210;
        synchronized (this.f26435) {
            m21655();
            C13921.m33904(this.f26436.m48614(), i, i2);
            if (i2 > 33554432) {
                throw new C13308();
            }
            c21381 = this.f26436;
        }
        InterfaceC7509 interfaceC7509M41888 = C17950.m41888(c20504);
        if (interfaceC7509M41888.mo924()) {
            throw new C9446();
        }
        C7210 c7211 = null;
        try {
            c7210 = new C7210(this.f26435.f61944, this.f26439, this.f26438, C19606.m45215(c21381.f68092, i, i2), C20767.m47486(c21381.f68095, i, i2));
            try {
                C7210 c7210M44289 = C19143.m44289(c7210, file, interfaceC7509M41888);
                c7211 = c7210M44289 != c7210 ? c7210 : null;
                try {
                    synchronized (this.f26435) {
                        m21655();
                    }
                    if (c7211 != null) {
                        c7211.close();
                    }
                    return c7210M44289;
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    c7210 = c7211;
                    c7211 = c7210M44289;
                    th = e;
                    if (c7211 != null) {
                        try {
                            c7211.close();
                        } catch (IOException e2) {
                            th.addSuppressed(e2);
                        }
                    }
                    if (c7210 == null) {
                        throw th;
                    }
                    try {
                        c7210.close();
                        throw th;
                    } catch (IOException e3) {
                        th.addSuppressed(e3);
                        throw th;
                    }
                }
            } catch (IOException e4) {
                e = e4;
            } catch (Error e5) {
                e = e5;
            } catch (RuntimeException e6) {
                e = e6;
            }
        } catch (IOException | Error | RuntimeException e7) {
            th = e7;
            c7210 = null;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m21655() {
        if (this.f26437) {
            long j = this.f26439;
            C19143 c19143 = this.f26435;
            if (j == c19143.f61958 && !c19143.f61946) {
                return;
            }
        }
        throw new IllegalStateException("VersionHandle is not active");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f26435) {
            if (this.f26437) {
                this.f26437 = false;
                this.f26435.f61955.remove(this);
                C19143.m44314(this.f26435.m44355());
            }
        }
    }
}
