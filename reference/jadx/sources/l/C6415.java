package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74N */
/* JADX INFO: loaded from: classes3.dex */
public final class C6415 implements InterfaceC1278 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1278 f21634;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20585 f21635;

    public C6415(InterfaceC1278 interfaceC1278, C20585 c20585) {
        this.f21634 = interfaceC1278;
        this.f21635 = c20585;
    }

    @Override // l.InterfaceC1278
    public final long length() throws C12380 {
        try {
            return this.f21634.length();
        } catch (IOException e) {
            C20585.m47177(this.f21635);
            throw new C12380(e);
        }
    }

    @Override // l.InterfaceC1278
    /* JADX INFO: renamed from: ᩷ */
    public final void mo4667(long j, byte[] bArr, int i, int i2) throws C12380 {
        try {
            this.f21634.mo4667(j, bArr, i, i2);
        } catch (IOException e) {
            C20585.m47177(this.f21635);
            throw new C12380(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f21634.close();
    }
}
