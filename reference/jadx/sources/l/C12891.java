package l;

/* JADX INFO: renamed from: l.۫ۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12891 implements InterfaceC7099 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f41235;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C23508 f41236;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16620 f41237;

    @Override // l.InterfaceC7099, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f41235) {
            return;
        }
        this.f41235 = true;
        this.f41237.f53744.mo6442("0\r\n\r\n");
        C23508 c23508 = this.f41236;
        C22411 c22411M52696 = c23508.m52696();
        c23508.m52695();
        c22411M52696.mo50548();
        c22411M52696.mo50552();
        this.f41237.f53746 = 3;
    }

    @Override // l.InterfaceC7099, java.io.Flushable
    public final synchronized void flush() {
        if (this.f41235) {
            return;
        }
        this.f41237.f53744.flush();
    }

    public C12891(C16620 c16620) {
        this.f41237 = c16620;
        this.f41236 = new C23508(c16620.f53744.mo6067());
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۧ */
    public final C22411 mo6067() {
        return this.f41236;
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۙ */
    public final void mo6066(C1879 c1879, long j) {
        InterfaceC11573 interfaceC11573 = this.f41237.f53744;
        if (this.f41235) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        interfaceC11573.mo6453(j);
        interfaceC11573.mo6442("\r\n");
        interfaceC11573.mo6066(c1879, j);
        interfaceC11573.mo6442("\r\n");
    }
}
