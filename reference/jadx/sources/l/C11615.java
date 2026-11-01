package l;

/* JADX INFO: renamed from: l.ۨۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5GW */
/* JADX INFO: loaded from: classes3.dex */
public final class C11615 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Runnable f39014;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Runnable f39015;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f39016;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f39017;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Runnable f39018;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f39019;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C13026 f39020;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f39021;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m28948() {
        return (this.f39019 || this.f39017) ? false : true;
    }

    public C11615(C13026 c13026, Runnable runnable, Runnable runnable2) {
        this.f39020 = c13026;
        this.f39014 = runnable;
        this.f39015 = runnable2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m28949() {
        Runnable runnable;
        synchronized (this) {
            if (this.f39019) {
                runnable = null;
            } else {
                this.f39019 = true;
                runnable = this.f39014;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m28946() {
        synchronized (this) {
            if (this.f39021) {
                return;
            }
            this.f39021 = true;
            Runnable runnable = this.f39018;
            this.f39018 = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28947(Runnable runnable) {
        synchronized (this) {
            if (!this.f39021) {
                Runnable runnable2 = this.f39018;
                if (runnable2 != null) {
                    runnable = new RunnableC4493(1, runnable2, runnable);
                }
                this.f39018 = runnable;
                runnable = null;
            }
        }
        if (runnable != null) {
            ((RunnableC8087) runnable).run();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m28950() {
        synchronized (this) {
            if (this.f39016) {
                return;
            }
            this.f39016 = true;
            this.f39015.run();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m28946();
        synchronized (this) {
            if (this.f39017) {
                return;
            }
            this.f39017 = true;
            C13026.m32208(this.f39020, this);
        }
    }
}
