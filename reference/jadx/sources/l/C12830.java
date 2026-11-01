package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۬ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L3AO */
/* JADX INFO: loaded from: classes4.dex */
public final class C12830 implements InterfaceC8597 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6479 f42706;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20591 f42707 = new C20591();

    public C12830(C6479 c6479) {
        this.f42706 = c6479;
    }

    @Override // l.InterfaceC8597
    /* JADX INFO: renamed from: ۙ */
    public final void mo5901(C6043 c6043, long j) {
        synchronized (this.f42706.f21862) {
            if (this.f42706.f21861) {
                throw new IllegalStateException("closed");
            }
            while (j > 0) {
                C6479 c6479 = this.f42706;
                if (c6479.f21866) {
                    throw new IOException("source is closed");
                }
                long j2 = c6479.f21865;
                C6043 c6044 = c6479.f21862;
                long j3 = j2 - c6044.f20522;
                if (j3 == 0) {
                    this.f42707.m46454(c6044);
                } else {
                    long jMin = Math.min(j3, j);
                    this.f42706.f21862.mo5901(c6043, jMin);
                    j -= jMin;
                    this.f42706.f21862.notifyAll();
                }
            }
        }
    }

    @Override // l.InterfaceC8597, java.io.Flushable
    public final void flush() {
        synchronized (this.f42706.f21862) {
            C6479 c6479 = this.f42706;
            if (c6479.f21861) {
                throw new IllegalStateException("closed");
            }
            if (c6479.f21866 && c6479.f21862.f20522 > 0) {
                throw new IOException("source is closed");
            }
        }
    }

    @Override // l.InterfaceC8597, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f42706.f21862) {
            C6479 c6479 = this.f42706;
            if (c6479.f21861) {
                return;
            }
            if (c6479.f21866 && c6479.f21862.f20522 > 0) {
                throw new IOException("source is closed");
            }
            c6479.f21861 = true;
            c6479.f21862.notifyAll();
        }
    }

    @Override // l.InterfaceC8597
    /* JADX INFO: renamed from: ۜ */
    public final C20591 mo5902() {
        return this.f42707;
    }
}
