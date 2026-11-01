package l;

/* JADX INFO: renamed from: l.֫ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06R7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1918 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3329 f7264;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f7265;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20388 f7266;

    public C1918(C3329 c3329, int i, int i2) {
        this.f7264 = c3329;
        this.f7266 = new C20388(c3329.f12324.m40840(), i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m6244() {
        this.f7264.m9887();
        if (this.f7265) {
            throw new IllegalStateException("Line cursor is closed");
        }
        return this.f7266.m46038();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f7265) {
            return;
        }
        this.f7265 = true;
        this.f7266.close();
    }
}
