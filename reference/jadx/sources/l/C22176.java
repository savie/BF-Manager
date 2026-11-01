package l;

/* JADX INFO: renamed from: l.᩹ۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5JX */
/* JADX INFO: loaded from: classes.dex */
public final class C22176 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11593 f72535;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f72536;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m49195() {
        return this.f72536;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m49196() {
        while (!this.f72536) {
            this.f72535.getClass();
            wait();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m49198() {
        if (this.f72536) {
            return false;
        }
        this.f72536 = true;
        notifyAll();
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m49199() {
        this.f72536 = false;
    }

    public C22176() {
        this(InterfaceC11593.f38960);
    }

    public C22176(InterfaceC11593 interfaceC11593) {
        this.f72535 = interfaceC11593;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m49200() {
        boolean z = false;
        while (!this.f72536) {
            try {
                this.f72535.getClass();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m49197(long j) {
        try {
            if (j <= 0) {
                return this.f72536;
            }
            long jMo28888 = this.f72535.mo28888();
            long j2 = j + jMo28888;
            if (j2 < jMo28888) {
                m49200();
            } else {
                boolean z = false;
                while (!this.f72536 && jMo28888 < j2) {
                    try {
                        this.f72535.getClass();
                        wait(j2 - jMo28888);
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                    jMo28888 = this.f72535.mo28888();
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
            return this.f72536;
        } catch (Throwable th) {
            throw th;
        }
    }
}
