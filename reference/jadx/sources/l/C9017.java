package l;

/* JADX INFO: renamed from: l.ۡܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56UC */
/* JADX INFO: loaded from: classes3.dex */
public final class C9017 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C10428 f30815;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f30816 = true;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f30817;

    public C9017(C10428 c10428, long j) {
        this.f30815 = c10428;
        this.f30817 = j;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9017 m23346(long j) {
        synchronized (this.f30815) {
            if (!this.f30816) {
                throw new IllegalStateException("Workspace reservation is closed");
            }
        }
        return this.f30815.m26333(j);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f30815) {
            if (this.f30816) {
                this.f30816 = false;
                this.f30815.f35627 -= this.f30817;
                this.f30815.notifyAll();
            }
        }
    }
}
