package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܽ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8OA */
/* JADX INFO: loaded from: classes4.dex */
public final class C16860 implements InterfaceC11133 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 f53931;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f53932;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17482 f53933;

    public C16860(InterfaceC3800 interfaceC3800) {
        this.f53931 = interfaceC3800;
        this.f53933 = C12544.m31203(interfaceC3800);
    }

    @Override // l.InterfaceC11133
    /* JADX INFO: renamed from: ۙ */
    public final void mo17202(long j, byte[] bArr, int i, int i2) throws IOException {
        this.f53933.mo17202(j, bArr, i, i2);
    }

    @Override // l.InterfaceC11133
    /* JADX INFO: renamed from: ۙ */
    public final void mo17201(long j, int i, byte[] bArr) throws IOException {
        this.f53933.mo17201(j, i, bArr);
    }

    @Override // l.InterfaceC11133
    public final long length() {
        return this.f53933.length();
    }

    @Override // l.InterfaceC11133
    public final void truncate(long j) throws IOException {
        this.f53933.truncate(j);
    }

    @Override // l.InterfaceC11133
    /* JADX INFO: renamed from: ܶ */
    public final void mo17203() throws IOException {
        this.f53933.mo17203();
    }

    @Override // l.InterfaceC11133
    /* JADX INFO: renamed from: ᩳۙ */
    public final void mo17204() throws Throwable {
        this.f53933.mo17204();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        InterfaceC3800 interfaceC3800 = this.f53931;
        if (this.f53932) {
            return;
        }
        this.f53932 = true;
        try {
            this.f53933.close();
        } finally {
            C5212.deleteIfExists(interfaceC3800);
        }
    }
}
