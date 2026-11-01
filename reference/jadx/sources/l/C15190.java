package l;

/* JADX INFO: renamed from: l.ܶۧ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15190 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21539 f49580;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C21539 f49581;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f49582;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m36407(C21539 c21539) {
        this.f49581 = c21539;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21539 m36402() {
        C21539 c21539 = this.f49581;
        this.f49581 = null;
        return c21539;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m36403(C21539 c21539) {
        if (this.f49580 != null) {
            throw new IllegalStateException("HLS preview frame is already pending");
        }
        this.f49580 = c21539;
        this.f49582 = c21539.m48261();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36405(C21539 c21539) {
        C21539 c215310 = this.f49580;
        if (c215310 == null || c215310.m48261() != c21539.m48261()) {
            return false;
        }
        this.f49580 = null;
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m36409(C21539 c21539) {
        C21539 c215310 = this.f49581;
        return c215310 != null && c215310.m48261() > c21539.m48261();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m36408() {
        return this.f49580 != null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m36406() {
        return this.f49582;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36404() {
        this.f49581 = null;
        this.f49580 = null;
        this.f49582 = 0L;
    }
}
