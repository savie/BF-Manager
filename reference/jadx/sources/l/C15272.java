package l;

/* JADX INFO: renamed from: l.ܳۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V743 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15272 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f49922;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C22732 f49923;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C5578 f49924;

    public C15272(C5578 c5578, C22732 c22732) {
        this.f49924 = c5578;
        this.f49923 = c22732;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m36636() {
        return this.f49923.f73774;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f49922) {
            return;
        }
        this.f49922 = true;
        C5578 c5578 = this.f49924;
        C22732 c22732 = this.f49923;
        synchronized (c5578) {
            int i = c22732.f73775;
            if (i <= 0) {
                throw new IllegalStateException("Preview page is not pinned");
            }
            c22732.f73775 = i - 1;
        }
    }
}
