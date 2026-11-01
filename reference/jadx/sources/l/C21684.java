package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩸ܺ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: H74N */
/* JADX INFO: loaded from: classes5.dex */
public final class C21684 implements InterfaceC3153 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3153 f70329;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C23096 f70330;

    public C21684(InterfaceC3153 interfaceC3153, C23096 c23096) {
        this.f70329 = interfaceC3153;
        this.f70330 = c23096;
    }

    @Override // l.InterfaceC3153
    public final long length() throws C15335 {
        try {
            return this.f70329.length();
        } catch (IOException e) {
            C23096.m51104(this.f70330);
            throw new C15335(e);
        }
    }

    @Override // l.InterfaceC3153
    /* JADX INFO: renamed from: ܰ */
    public final void mo9547(long j, byte[] bArr, int i, int i2) throws C15335 {
        try {
            this.f70329.mo9547(j, bArr, i, i2);
        } catch (IOException e) {
            C23096.m51104(this.f70330);
            throw new C15335(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f70329.close();
    }
}
