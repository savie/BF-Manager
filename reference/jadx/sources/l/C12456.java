package l;

import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.۫ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T4F2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12456 implements InterfaceC8597 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C6043 f41529 = new C6043();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f41530;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11045 f41531;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f41532;

    public C12456(C11045 c11045) {
        this.f41531 = c11045;
    }

    @Override // l.InterfaceC8597
    /* JADX INFO: renamed from: ۙ */
    public final void mo5901(C6043 c6043, long j) throws IOException {
        C6043 c6044 = this.f41529;
        c6044.mo5901(c6043, j);
        while (c6044.size() >= 16384) {
            m30931(false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30931(boolean z) throws IOException {
        C11045 c11045;
        long jMin;
        C11045 c11046;
        synchronized (this.f41531) {
            this.f41531.f37518.m39092();
            while (true) {
                try {
                    c11045 = this.f41531;
                    if (c11045.f37511 > 0 || this.f41532 || this.f41530 || c11045.f37514 != null) {
                        break;
                    }
                    try {
                        c11045.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    this.f41531.f37518.m16599();
                    throw th;
                }
            }
            c11045.f37518.m16599();
            this.f41531.m27862();
            jMin = Math.min(this.f41531.f37511, this.f41529.size());
            c11046 = this.f41531;
            c11046.f37511 -= jMin;
        }
        c11046.f37518.m39092();
        try {
            C11045 c11047 = this.f41531;
            c11047.f37516.m45697(c11047.f37517, z && jMin == this.f41529.size(), this.f41529, jMin);
        } finally {
            this.f41531.f37518.m16599();
        }
    }

    @Override // l.InterfaceC8597, java.io.Flushable
    public final void flush() throws IOException {
        synchronized (this.f41531) {
            this.f41531.m27862();
        }
        while (this.f41529.size() > 0) {
            m30931(false);
            this.f41531.f37516.f65611.flush();
        }
    }

    @Override // l.InterfaceC8597
    /* JADX INFO: renamed from: ۜ */
    public final C20591 mo5902() {
        return this.f41531.f37518;
    }

    @Override // l.InterfaceC8597, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.f41531) {
            if (this.f41530) {
                return;
            }
            if (!this.f41531.f37515.f41532) {
                if (this.f41529.size() > 0) {
                    while (this.f41529.size() > 0) {
                        m30931(true);
                    }
                } else {
                    C11045 c11045 = this.f41531;
                    c11045.f37516.m45697(c11045.f37517, true, (C6043) null, 0L);
                }
            }
            synchronized (this.f41531) {
                this.f41530 = true;
            }
            this.f41531.f37516.f65611.flush();
            this.f41531.m27854();
        }
    }
}
