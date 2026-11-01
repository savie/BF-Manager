package l;

/* JADX INFO: renamed from: l.ۘۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L3AO */
/* JADX INFO: loaded from: classes2.dex */
public final class C3656 implements InterfaceC10008 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6479 f13393;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20591 f13394 = new C20591();

    public C3656(C6479 c6479) {
        this.f13393 = c6479;
    }

    @Override // l.InterfaceC10008
    /* JADX INFO: renamed from: ܰ */
    public final long mo2293(C6043 c6043, long j) {
        synchronized (this.f13393.f21862) {
            if (this.f13393.f21866) {
                throw new IllegalStateException("closed");
            }
            while (true) {
                C6479 c6479 = this.f13393;
                C6043 c6044 = c6479.f21862;
                if (c6044.f20522 == 0) {
                    if (c6479.f21861) {
                        return -1L;
                    }
                    this.f13394.m46454(c6044);
                } else {
                    long jMo2293 = c6044.mo2293(c6043, 8192L);
                    this.f13393.f21862.notifyAll();
                    return jMo2293;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f13393.f21862) {
            C6479 c6479 = this.f13393;
            c6479.f21866 = true;
            c6479.f21862.notifyAll();
        }
    }

    @Override // l.InterfaceC10008
    /* JADX INFO: renamed from: ۜ */
    public final C20591 mo2292() {
        return this.f13394;
    }
}
