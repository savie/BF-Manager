package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23476 extends AbstractC16420 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f76016;

    @Override // l.AbstractC16420, l.InterfaceC10008
    /* JADX INFO: renamed from: ܰ */
    public final long mo2293(C6043 c6043, long j) throws IOException {
        if (this.f52837) {
            throw new IllegalStateException("closed");
        }
        if (this.f76016) {
            return -1L;
        }
        long jMo2293 = super.mo2293(c6043, 8192L);
        if (jMo2293 != -1) {
            return jMo2293;
        }
        this.f76016 = true;
        m38677(true, null);
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f52837) {
            return;
        }
        if (!this.f76016) {
            m38677(false, null);
        }
        this.f52837 = true;
    }
}
