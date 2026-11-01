package l;

/* JADX INFO: renamed from: l.ۙۤ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: F9W6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4581 extends C23592 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public C1718 f16234;

    @Override // l.C23592, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // l.C23592
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C5952 mo12725() {
        return this.f16234.m5719();
    }

    public C4581(C1718 c1718, C17987 c17987) {
        super(c1718.m5716(), c17987);
        this.f16234 = c1718;
    }

    @Override // l.C23592
    public final boolean isOpen() {
        return this.f16234.isOpen();
    }
}
