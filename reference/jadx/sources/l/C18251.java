package l;

/* JADX INFO: renamed from: l.ܿۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 56UC */
/* JADX INFO: loaded from: classes4.dex */
public final class C18251 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f59570 = true;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C0352 f59571;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f59572;

    public C18251(C0352 c0352, long j) {
        this.f59571 = c0352;
        this.f59572 = j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18251 m42404(long j) {
        synchronized (this.f59571) {
            if (!this.f59570) {
                throw new IllegalStateException("Workspace reservation is closed");
            }
        }
        return this.f59571.m2112(j);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f59571) {
            if (this.f59570) {
                this.f59570 = false;
                this.f59571.f1854 -= this.f59572;
                this.f59571.notifyAll();
            }
        }
    }
}
