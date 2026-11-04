package l;

/* JADX INFO: renamed from: l.ܰۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 56UC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14521 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0352 f45676;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C4081 f45677;

    public C14521(C0352 c0352, C4081 c4081) {
        this.f45676 = c0352;
        this.f45677 = c4081;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5311 m35037() {
        C4081 c4081 = this.f45677;
        if (c4081 == null) {
            throw new IllegalStateException("Page lease is closed");
        }
        return c4081.f13925;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C10046 c10046;
        synchronized (this.f45676) {
            C4081 c4081 = this.f45677;
            c10046 = null;
            if (c4081 != null) {
                c4081.f13924--;
                C10046 c10047 = c4081.f13926.f26019;
                this.f45677 = null;
                this.f45676.notifyAll();
                c10046 = c10047;
            }
        }
        if (c10046 != null) {
            c10046.m25975();
        }
    }
}
