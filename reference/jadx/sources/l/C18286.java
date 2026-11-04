package l;

/* JADX INFO: renamed from: l.ܿۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3AO */
/* JADX INFO: loaded from: classes5.dex */
public final class C18286 implements InterfaceC13810 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0387 f59633;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C22411 f59634 = new C22411();

    public C18286(C0387 c0387) {
        this.f59633 = c0387;
    }

    @Override // l.InterfaceC13810
    /* JADX INFO: renamed from: ᩷ */
    public final long mo4186(C1879 c1879, long j) {
        synchronized (this.f59633.f1927) {
            if (this.f59633.f1929) {
                throw new IllegalStateException("closed");
            }
            while (true) {
                C0387 c0387 = this.f59633;
                C1879 c18710 = c0387.f1927;
                if (c18710.f6314 == 0) {
                    if (c0387.f1932) {
                        return -1L;
                    }
                    this.f59634.m50549(c18710);
                } else {
                    long jMo4186 = c18710.mo4186(c1879, 8192L);
                    this.f59633.f1927.notifyAll();
                    return jMo4186;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f59633.f1927) {
            C0387 c0387 = this.f59633;
            c0387.f1929 = true;
            c0387.f1927.notifyAll();
        }
    }

    @Override // l.InterfaceC13810
    /* JADX INFO: renamed from: ۧ */
    public final C22411 mo4181() {
        return this.f59634;
    }
}
