package l;

/* JADX INFO: renamed from: l.ܺ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5GW */
/* JADX INFO: loaded from: classes4.dex */
public final class C17103 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f55822;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f55823;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f55824;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Runnable f55825;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Runnable f55826;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Runnable f55827;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12628 f55828;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f55829;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m40266() {
        return (this.f55822 || this.f55824) ? false : true;
    }

    public C17103(C12628 c12628, Runnable runnable, Runnable runnable2) {
        this.f55828 = c12628;
        this.f55827 = runnable;
        this.f55825 = runnable2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40269() {
        Runnable runnable;
        synchronized (this) {
            if (this.f55822) {
                runnable = null;
            } else {
                this.f55822 = true;
                runnable = this.f55827;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m40267() {
        synchronized (this) {
            if (this.f55829) {
                return;
            }
            this.f55829 = true;
            Runnable runnable = this.f55826;
            this.f55826 = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40265(Runnable runnable) {
        synchronized (this) {
            if (!this.f55829) {
                Runnable runnable2 = this.f55826;
                if (runnable2 != null) {
                    runnable = new RunnableC25309(0, runnable2, runnable);
                }
                this.f55826 = runnable;
                runnable = null;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m40268() {
        synchronized (this) {
            if (this.f55823) {
                return;
            }
            this.f55823 = true;
            this.f55825.run();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m40267();
        synchronized (this) {
            if (this.f55824) {
                return;
            }
            this.f55824 = true;
            C12628.m31340(this.f55828, this);
        }
    }
}
