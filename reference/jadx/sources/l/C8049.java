package l;

/* JADX INFO: renamed from: l.۟ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F9W6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8049 extends C4320 {

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public C21474 f26675;

    @Override // l.C4320, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // l.C4320
    /* JADX INFO: renamed from: ۙ */
    public final synchronized C6558 mo13813() {
        return this.f26675.m48846();
    }

    public C8049(C21474 c21474, C19457 c19457) {
        super(c21474.m48849(), c19457);
        this.f26675 = c21474;
    }

    @Override // l.C4320
    public final boolean isOpen() {
        return this.f26675.isOpen();
    }
}
