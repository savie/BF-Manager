package l;

/* JADX INFO: renamed from: l.۬ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N70B */
/* JADX INFO: loaded from: classes4.dex */
public final class C13947 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7236 f44224;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C2761 f44225;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f44226;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f44227;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private synchronized void m33983(C7236 c7236) {
        long j = c7236.f23867;
        if (this.f44227 != j) {
            c7236.f23861 = true;
            return;
        }
        C7236 c7237 = this.f44224;
        if (c7237 != null) {
            c7237.f23861 = true;
            this.f44224 = null;
        }
        C2761 c2761 = this.f44225;
        c7236.f23864 = c2761 == null ? C1270.m4622() : c2761.f9136;
        C2761 c2762 = this.f44225;
        if (c2762 != null) {
            long unused = c2762.f9139;
        }
        c7236.getClass();
        this.f44226 = j;
        this.f44224 = c7236;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public synchronized void m33984(C7236 c7236) {
        c7236.f23861 = true;
        if (this.f44224 == c7236) {
            this.f44224 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C9472 m33987(C2761 c2761, C22528 c22528) {
        long j;
        if (c2761 != this.f44225) {
            throw new IllegalArgumentException("Base result is not the current published result");
        }
        if (c22528.m50762() != c2761.f9135.m55283()) {
            throw new IllegalArgumentException("Base result and change set lengths differ");
        }
        j = this.f44227 + 1;
        this.f44227 = j;
        return new C9472(this, j, c2761.f9137, c2761, c22528);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C9472 m33988(C20661 c20661) {
        long j;
        j = 1 + this.f44227;
        this.f44227 = j;
        C17359.requireNonNull(c20661, "program");
        return new C9472(this, j, c20661, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m33989() {
        long j = this.f44227 + 1;
        this.f44227 = j;
        this.f44226 = j;
        C7236 c7236 = this.f44224;
        if (c7236 != null) {
            c7236.f23861 = true;
            this.f44224 = null;
        }
        this.f44225 = null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized void m33991() {
        long j = this.f44227 + 1;
        this.f44227 = j;
        this.f44226 = j;
        C7236 c7236 = this.f44224;
        if (c7236 != null) {
            c7236.f23861 = true;
            this.f44224 = null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized C2761 m33992() {
        return this.f44225;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7236 m33985(C9472 c9472, C15508 c15508, long j, InterfaceC7509 interfaceC7509) {
        C9472.m24851(c9472, this, false);
        C7236 c7236 = new C7236(this, c9472.f30692, c15508, j, c9472.f30695, interfaceC7509, null, null);
        m33983(c7236);
        return c7236;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7236 m33986(C9472 c9472, C15508 c15508, long j, C19959 c19959) {
        C9472.m24851(c9472, this, true);
        C2761 c2761 = c9472.f30690;
        C7236 c7236 = new C7236(this, c2761.f9137, c15508, j, c9472.f30695, c19959, c2761, c9472.f30694);
        m33983(c7236);
        return c7236;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33990(C7236 c7236) {
        C2761 c2761;
        C17359.requireNonNull(c7236, "work");
        if (c7236.f23865 != this || (c2761 = c7236.f23866) == null) {
            return false;
        }
        if (Thread.currentThread().isInterrupted() || c7236.m19847()) {
            m33984(c7236);
            return false;
        }
        synchronized (this) {
            if (this.f44224 == c7236 && this.f44226 == c7236.f23867 && !c7236.f23861) {
                this.f44225 = c2761;
                this.f44224 = null;
                return true;
            }
            return false;
        }
    }
}
