package l;

/* JADX INFO: renamed from: l.ۢ֡۬, reason: contains not printable characters */
/* JADX INFO: compiled from: V743 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9236 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C14175 f31389;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f31390;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C4771 f31391;

    public C9236(C4771 c4771, C14175 c14175) {
        this.f31391 = c4771;
        this.f31389 = c14175;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m23753() {
        return this.f31389.f46524;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f31390) {
            return;
        }
        this.f31390 = true;
        C4771 c4771 = this.f31391;
        C14175 c14175 = this.f31389;
        synchronized (c4771) {
            int i = c14175.f46525;
            if (i <= 0) {
                throw new IllegalStateException("Preview page is not pinned");
            }
            c14175.f46525 = i - 1;
        }
    }
}
