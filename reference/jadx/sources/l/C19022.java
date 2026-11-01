package l;

/* JADX INFO: renamed from: l.ᩴ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N70B */
/* JADX INFO: loaded from: classes4.dex */
public final class C19022 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f61539;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18316 f61540;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C15495 f61541;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f61542;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private synchronized void m43745(C18316 c18316) {
        long j = c18316.f58421;
        if (this.f61539 != j) {
            c18316.f58425 = true;
            return;
        }
        C18316 c18317 = this.f61540;
        if (c18317 != null) {
            c18317.f58425 = true;
            this.f61540 = null;
        }
        C15495 c15495 = this.f61541;
        c18316.f58427 = c15495 == null ? C7027.m18855() : c15495.f50483;
        C15495 c15496 = this.f61541;
        if (c15496 != null) {
            long unused = c15496.f50478;
        }
        c18316.getClass();
        this.f61542 = j;
        this.f61540 = c18316;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public synchronized void m43746(C18316 c18316) {
        c18316.f58425 = true;
        if (this.f61540 == c18316) {
            this.f61540 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C23256 m43749(C1900 c1900) {
        long j;
        j = 1 + this.f61539;
        this.f61539 = j;
        C13638.requireNonNull(c1900, "program");
        return new C23256(this, j, c1900, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C23256 m43750(C15495 c15495, C21033 c21033) {
        long j;
        if (c15495 != this.f61541) {
            throw new IllegalArgumentException("Base result is not the current published result");
        }
        if (c21033.m47422() != c15495.f50481.m17234()) {
            throw new IllegalArgumentException("Base result and change set lengths differ");
        }
        j = this.f61539 + 1;
        this.f61539 = j;
        return new C23256(this, j, c15495.f50480, c15495, c21033);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m43751() {
        long j = this.f61539 + 1;
        this.f61539 = j;
        this.f61542 = j;
        C18316 c18316 = this.f61540;
        if (c18316 != null) {
            c18316.f58425 = true;
            this.f61540 = null;
        }
        this.f61541 = null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m43753() {
        long j = this.f61539 + 1;
        this.f61539 = j;
        this.f61542 = j;
        C18316 c18316 = this.f61540;
        if (c18316 != null) {
            c18316.f58425 = true;
            this.f61540 = null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized C15495 m43754() {
        return this.f61541;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18316 m43747(C23256 c23256, C3329 c3329, long j, InterfaceC5614 interfaceC5614) {
        C23256.m51325(c23256, this, false);
        C18316 c18316 = new C18316(this, c23256.f75445, c3329, j, c23256.f75440, interfaceC5614, null, null);
        m43745(c18316);
        return c18316;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18316 m43748(C23256 c23256, C3329 c3329, long j, C19770 c19770) {
        C23256.m51325(c23256, this, true);
        C15495 c15495 = c23256.f75441;
        C18316 c18316 = new C18316(this, c15495.f50480, c3329, j, c23256.f75440, c19770, c15495, c23256.f75444);
        m43745(c18316);
        return c18316;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43752(C18316 c18316) {
        C15495 c15495;
        C13638.requireNonNull(c18316, "work");
        if (c18316.f58423 != this || (c15495 = c18316.f58426) == null) {
            return false;
        }
        if (Thread.currentThread().isInterrupted() || c18316.m42540()) {
            m43746(c18316);
            return false;
        }
        synchronized (this) {
            if (this.f61540 == c18316 && this.f61542 == c18316.f58421 && !c18316.f58425) {
                this.f61541 = c15495;
                this.f61540 = null;
                return true;
            }
            return false;
        }
    }
}
