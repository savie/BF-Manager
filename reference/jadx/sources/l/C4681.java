package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۙܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6R5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4681 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public RunnableC4970 f16556;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f16557;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public FutureC12075 f16558;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3001 f16559;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f16560;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f16561 = new Object();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f16562;

    public C4681(InterfaceC3001 interfaceC3001) {
        this.f16559 = interfaceC3001;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12983(boolean z) {
        synchronized (this.f16561) {
            try {
                if (z) {
                    if (this.f16562) {
                        throw new IllegalStateException("Text owner is closed");
                    }
                    this.f16557++;
                } else {
                    int i = this.f16557;
                    if (i == 0) {
                        throw new IllegalStateException("Unbalanced internal read-only state");
                    }
                    this.f16557 = i - 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m12978();
        m12977();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m12986() {
        return Thread.holdsLock(this.f16561) && this.f16560 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12984() {
        boolean z;
        synchronized (this.f16561) {
            z = !this.f16562 && this.f16557 == 0 && this.f16560 == 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m12979() {
        synchronized (this.f16561) {
            if (this.f16562) {
                return FutureC12075.m30003(new IllegalStateException("Text owner is closed"));
            }
            if (m12984()) {
                return FutureC12075.m30001(null);
            }
            if (this.f16558 == null) {
                this.f16558 = new FutureC12075();
            }
            return this.f16558.m30032((InterfaceC15954) new C9023());
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m12978() {
        synchronized (this.f16561) {
            if (this.f16558 != null && (this.f16562 || m12984())) {
                FutureC12075 futureC12075 = this.f16558;
                this.f16558 = null;
                boolean z = this.f16562;
                if (z) {
                    futureC12075.m30021((Throwable) new IllegalStateException("Text owner is closed"));
                } else {
                    futureC12075.m30019((Object) null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m12980(Object obj, Supplier supplier) {
        try {
            synchronized (this.f16561) {
                if (!this.f16562) {
                    this.f16560++;
                    try {
                        obj = supplier.get();
                        this.f16560--;
                    } catch (Throwable th) {
                        this.f16560--;
                        throw th;
                    }
                }
            }
            m12978();
            m12977();
            return obj;
        } catch (Throwable th2) {
            m12978();
            m12977();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m12981(C0179 c0179) {
        Object objM12980;
        synchronized (this.f16561) {
            objM12980 = null;
            if (this.f16557 == 0) {
                objM12980 = m12980(null, c0179);
            }
        }
        return objM12980;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12982(RunnableC4970 runnableC4970) {
        synchronized (this.f16561) {
            if (this.f16562) {
                return;
            }
            this.f16562 = true;
            this.f16556 = runnableC4970;
            m12978();
            m12977();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m12977() {
        synchronized (this.f16561) {
            if (this.f16557 == 0 && this.f16560 == 0) {
                RunnableC4970 runnableC4970 = this.f16556;
                this.f16556 = null;
                if (runnableC4970 != null) {
                    runnableC4970.run();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m12985() {
        synchronized (this.f16561) {
            this.f16562 = true;
        }
        m12978();
    }
}
