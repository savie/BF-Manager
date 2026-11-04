package l;

/* JADX INFO: renamed from: l.ۗ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes2.dex */
public final class C3406 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C20560 f11067;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C20560 f11068;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f11069;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m11147(C20560 c20560) {
        this.f11068 = c20560;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20560 m11150() {
        C20560 c20560 = this.f11068;
        this.f11068 = null;
        return c20560;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m11151(C20560 c20560) {
        if (this.f11067 != null) {
            throw new IllegalStateException("HLS preview frame is already pending");
        }
        this.f11067 = c20560;
        this.f11069 = c20560.m47139();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11145(C20560 c20560) {
        C20560 c20561 = this.f11067;
        if (c20561 == null || c20561.m47139() != c20560.m47139()) {
            return false;
        }
        this.f11067 = null;
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m11149(C20560 c20560) {
        C20560 c20561 = this.f11068;
        return c20561 != null && c20561.m47139() > c20560.m47139();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m11148() {
        return this.f11067 != null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m11146() {
        return this.f11069;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11144() {
        this.f11068 = null;
        this.f11067 = null;
        this.f11069 = 0L;
    }
}
