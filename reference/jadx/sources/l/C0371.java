package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֡ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6R5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0371 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public FutureC23690 f1895;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f1896;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public RunnableC3073 f1897;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f1898;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18270 f1899;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f1900 = new Object();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f1901;

    public C0371(InterfaceC18270 interfaceC18270) {
        this.f1899 = interfaceC18270;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2156(boolean z) {
        synchronized (this.f1900) {
            try {
                if (z) {
                    if (this.f1898) {
                        throw new IllegalStateException("Text owner is closed");
                    }
                    this.f1901++;
                } else {
                    int i = this.f1901;
                    if (i == 0) {
                        throw new IllegalStateException("Unbalanced internal read-only state");
                    }
                    this.f1901 = i - 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m2151();
        m2152();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m2159() {
        return Thread.holdsLock(this.f1900) && this.f1896 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m2157() {
        boolean z;
        synchronized (this.f1900) {
            z = !this.f1898 && this.f1901 == 0 && this.f1896 == 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m2160() {
        synchronized (this.f1900) {
            if (this.f1898) {
                return FutureC23690.m52919(new IllegalStateException("Text owner is closed"));
            }
            if (m2157()) {
                return FutureC23690.m52928(null);
            }
            if (this.f1895 == null) {
                this.f1895 = new FutureC23690();
            }
            return this.f1895.m52949((InterfaceC25138) new C2764(0));
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m2151() {
        synchronized (this.f1900) {
            if (this.f1895 != null && (this.f1898 || m2157())) {
                FutureC23690 futureC23690 = this.f1895;
                this.f1895 = null;
                boolean z = this.f1898;
                if (z) {
                    futureC23690.m52937((Throwable) new IllegalStateException("Text owner is closed"));
                } else {
                    futureC23690.m52935((Object) null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m2153(Object obj, Supplier supplier) {
        try {
            synchronized (this.f1900) {
                if (!this.f1898) {
                    this.f1896++;
                    try {
                        obj = supplier.get();
                        this.f1896--;
                    } catch (Throwable th) {
                        this.f1896--;
                        throw th;
                    }
                }
            }
            m2151();
            m2152();
            return obj;
        } catch (Throwable th2) {
            m2151();
            m2152();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m2154(C23492 c23492) {
        Object objM2153;
        synchronized (this.f1900) {
            objM2153 = null;
            if (this.f1901 == 0) {
                objM2153 = m2153(null, c23492);
            }
        }
        return objM2153;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2155(RunnableC3073 runnableC3073) {
        synchronized (this.f1900) {
            if (this.f1898) {
                return;
            }
            this.f1898 = true;
            this.f1897 = runnableC3073;
            m2151();
            m2152();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m2152() {
        synchronized (this.f1900) {
            if (this.f1901 == 0 && this.f1896 == 0) {
                RunnableC3073 runnableC3073 = this.f1897;
                this.f1897 = null;
                if (runnableC3073 != null) {
                    runnableC3073.run();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m2158() {
        synchronized (this.f1900) {
            this.f1898 = true;
        }
        m2151();
    }
}
