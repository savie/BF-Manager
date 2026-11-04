package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۡܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: C8OA */
/* JADX INFO: loaded from: classes4.dex */
public final class C9541 implements InterfaceC4565 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f30891;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 f30892;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7064 f30893;

    public C9541(InterfaceC24329 interfaceC24329) {
        this.f30892 = interfaceC24329;
        this.f30893 = C8555.m22963(interfaceC24329);
    }

    @Override // l.InterfaceC4565
    /* JADX INFO: renamed from: ۙ */
    public final void mo14341(long j, byte[] bArr, int i, int i2) throws IOException {
        this.f30893.mo14341(j, bArr, i, i2);
    }

    @Override // l.InterfaceC4565
    /* JADX INFO: renamed from: ۙ */
    public final void mo14340(long j, int i, byte[] bArr) throws IOException {
        this.f30893.mo14340(j, i, bArr);
    }

    @Override // l.InterfaceC4565
    public final long length() {
        return this.f30893.length();
    }

    @Override // l.InterfaceC4565
    public final void truncate(long j) throws IOException {
        this.f30893.truncate(j);
    }

    @Override // l.InterfaceC4565
    /* JADX INFO: renamed from: ܺ */
    public final void mo14343() throws IOException {
        this.f30893.mo14343();
    }

    @Override // l.InterfaceC4565
    /* JADX INFO: renamed from: ܶۙ */
    public final void mo14342() throws Throwable {
        this.f30893.mo14342();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        InterfaceC24329 interfaceC24329 = this.f30892;
        if (this.f30891) {
            return;
        }
        this.f30891 = true;
        try {
            this.f30893.close();
        } finally {
            C3445.deleteIfExists(interfaceC24329);
        }
    }
}
