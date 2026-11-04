package l;

import java.net.ProtocolException;

/* JADX INFO: renamed from: l.֫ۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1705 implements InterfaceC7099 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C23508 f5845;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f5846;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16620 f5847;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f5848;

    public C1705(C16620 c16620, long j) {
        this.f5847 = c16620;
        this.f5845 = new C23508(c16620.f53744.mo6067());
        this.f5846 = j;
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22411 mo6067() {
        return this.f5845;
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6066(C1879 c1879, long j) throws ProtocolException {
        if (this.f5848) {
            throw new IllegalStateException("closed");
        }
        long size = c1879.size();
        byte[] bArr = C19822.f63715;
        if (j < 0 || 0 > size || size < j) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (j > this.f5846) {
            throw new ProtocolException("expected " + this.f5846 + " bytes but received " + j);
        }
        this.f5847.f53744.mo6066(c1879, j);
        this.f5846 -= j;
    }

    @Override // l.InterfaceC7099, java.io.Flushable
    public final void flush() {
        if (this.f5848) {
            return;
        }
        this.f5847.f53744.flush();
    }

    @Override // l.InterfaceC7099, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws ProtocolException {
        if (this.f5848) {
            return;
        }
        this.f5848 = true;
        if (this.f5846 <= 0) {
            C23508 c23508 = this.f5845;
            C22411 c22411M52696 = c23508.m52696();
            c23508.m52695();
            c22411M52696.mo50548();
            c22411M52696.mo50552();
            this.f5847.f53746 = 3;
            return;
        }
        throw new ProtocolException("unexpected end of stream");
    }
}
