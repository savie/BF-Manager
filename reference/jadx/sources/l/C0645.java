package l;

/* JADX INFO: renamed from: l.֡᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5JX */
/* JADX INFO: loaded from: classes2.dex */
public final class C0645 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14814 f2503;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f2504;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m2830() {
        while (!this.f2504) {
            this.f2503.getClass();
            wait();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized void m2832() {
        this.f2504 = false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m2833() {
        if (this.f2504) {
            return false;
        }
        this.f2504 = true;
        notifyAll();
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m2835() {
        return this.f2504;
    }

    public C0645() {
        this(InterfaceC14814.f48448);
    }

    public C0645(InterfaceC14814 interfaceC14814) {
        this.f2503 = interfaceC14814;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m2834() {
        boolean z = false;
        while (!this.f2504) {
            try {
                this.f2503.getClass();
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
    public final synchronized boolean m2831(long j) {
        try {
            if (j <= 0) {
                return this.f2504;
            }
            long jMo2210 = this.f2503.mo2210();
            long j2 = j + jMo2210;
            if (j2 < jMo2210) {
                m2834();
            } else {
                boolean z = false;
                while (!this.f2504 && jMo2210 < j2) {
                    try {
                        this.f2503.getClass();
                        wait(j2 - jMo2210);
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                    jMo2210 = this.f2503.mo2210();
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
            return this.f2504;
        } catch (Throwable th) {
            throw th;
        }
    }
}
