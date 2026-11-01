package l;

/* JADX INFO: renamed from: l.۫ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12187 implements InterfaceC8597 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C3220 f40784;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f40785;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14304 f40786;

    @Override // l.InterfaceC8597, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f40785) {
            return;
        }
        this.f40785 = true;
        this.f40786.f46867.mo16418("0\r\n\r\n");
        C3220 c3220 = this.f40784;
        C20591 c20591M9646 = c3220.m9646();
        c3220.m9652();
        c20591M9646.mo9648();
        c20591M9646.mo9653();
        this.f40786.f46866 = 3;
    }

    @Override // l.InterfaceC8597, java.io.Flushable
    public final synchronized void flush() {
        if (this.f40785) {
            return;
        }
        this.f40786.f46867.flush();
    }

    public C12187(C14304 c14304) {
        this.f40786 = c14304;
        this.f40784 = new C3220(c14304.f46867.mo5902());
    }

    @Override // l.InterfaceC8597
    /* JADX INFO: renamed from: ۜ */
    public final C20591 mo5902() {
        return this.f40784;
    }

    @Override // l.InterfaceC8597
    /* JADX INFO: renamed from: ۙ */
    public final void mo5901(C6043 c6043, long j) {
        InterfaceC10983 interfaceC10983 = this.f40786.f46867;
        if (this.f40785) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        interfaceC10983.mo16431(j);
        interfaceC10983.mo16418("\r\n");
        interfaceC10983.mo5901(c6043, j);
        interfaceC10983.mo16418("\r\n");
    }
}
