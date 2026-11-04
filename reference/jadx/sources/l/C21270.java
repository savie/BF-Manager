package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩶ۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3AO */
/* JADX INFO: loaded from: classes5.dex */
public final class C21270 implements InterfaceC7099 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0387 f67831;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C22411 f67832 = new C22411();

    public C21270(C0387 c0387) {
        this.f67831 = c0387;
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۙ */
    public final void mo6066(C1879 c1879, long j) {
        synchronized (this.f67831.f1927) {
            if (this.f67831.f1932) {
                throw new IllegalStateException("closed");
            }
            while (j > 0) {
                C0387 c0387 = this.f67831;
                if (c0387.f1929) {
                    throw new IOException("source is closed");
                }
                long j2 = c0387.f1931;
                C1879 c18710 = c0387.f1927;
                long j3 = j2 - c18710.f6314;
                if (j3 == 0) {
                    this.f67832.m50549(c18710);
                } else {
                    long jMin = Math.min(j3, j);
                    this.f67831.f1927.mo6066(c1879, jMin);
                    j -= jMin;
                    this.f67831.f1927.notifyAll();
                }
            }
        }
    }

    @Override // l.InterfaceC7099, java.io.Flushable
    public final void flush() {
        synchronized (this.f67831.f1927) {
            C0387 c0387 = this.f67831;
            if (c0387.f1932) {
                throw new IllegalStateException("closed");
            }
            if (c0387.f1929 && c0387.f1927.f6314 > 0) {
                throw new IOException("source is closed");
            }
        }
    }

    @Override // l.InterfaceC7099, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f67831.f1927) {
            C0387 c0387 = this.f67831;
            if (c0387.f1932) {
                return;
            }
            if (c0387.f1929 && c0387.f1927.f6314 > 0) {
                throw new IOException("source is closed");
            }
            c0387.f1932 = true;
            c0387.f1927.notifyAll();
        }
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۧ */
    public final C22411 mo6067() {
        return this.f67832;
    }
}
