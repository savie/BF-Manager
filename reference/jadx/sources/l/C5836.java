package l;

import java.net.ProtocolException;

/* JADX INFO: renamed from: l.ۛۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5836 implements InterfaceC8597 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14304 f19796;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f19797;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3220 f19798;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f19799;

    public C5836(C14304 c14304, long j) {
        this.f19796 = c14304;
        this.f19798 = new C3220(c14304.f46867.mo5902());
        this.f19797 = j;
    }

    @Override // l.InterfaceC8597
    /* JADX INFO: renamed from: ۜ */
    public final C20591 mo5902() {
        return this.f19798;
    }

    @Override // l.InterfaceC8597
    /* JADX INFO: renamed from: ۙ */
    public final void mo5901(C6043 c6043, long j) throws ProtocolException {
        if (this.f19799) {
            throw new IllegalStateException("closed");
        }
        long size = c6043.size();
        byte[] bArr = C0140.f1168;
        if (j < 0 || 0 > size || size < j) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (j > this.f19797) {
            throw new ProtocolException("expected " + this.f19797 + " bytes but received " + j);
        }
        this.f19796.f46867.mo5901(c6043, j);
        this.f19797 -= j;
    }

    @Override // l.InterfaceC8597, java.io.Flushable
    public final void flush() {
        if (this.f19799) {
            return;
        }
        this.f19796.f46867.flush();
    }

    @Override // l.InterfaceC8597, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws ProtocolException {
        if (this.f19799) {
            return;
        }
        this.f19799 = true;
        if (this.f19797 <= 0) {
            C3220 c3220 = this.f19798;
            C20591 c20591M9646 = c3220.m9646();
            c3220.m9652();
            c20591M9646.mo9648();
            c20591M9646.mo9653();
            this.f19796.f46866 = 3;
            return;
        }
        throw new ProtocolException("unexpected end of stream");
    }
}
