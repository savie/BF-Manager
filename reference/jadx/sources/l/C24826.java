package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes.dex */
public final class C24826 extends AbstractC15128 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f80303;

    @Override // l.AbstractC15128, l.InterfaceC13810
    /* JADX INFO: renamed from: ᩷ */
    public final long mo4186(C1879 c1879, long j) throws IOException {
        if (this.f49364) {
            throw new IllegalStateException("closed");
        }
        if (this.f80303) {
            return -1L;
        }
        long jMo4186 = super.mo4186(c1879, 8192L);
        if (jMo4186 != -1) {
            return jMo4186;
        }
        this.f80303 = true;
        m36402(true, null);
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f49364) {
            return;
        }
        if (!this.f80303) {
            m36402(false, null);
        }
        this.f49364 = true;
    }
}
