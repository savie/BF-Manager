package l;

/* JADX INFO: renamed from: l.ܳۘܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8SL */
/* JADX INFO: loaded from: classes4.dex */
public class C14279 implements InterfaceC7222 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7222 f46800;

    public C14279(InterfaceC7222 interfaceC7222) {
        this.f46800 = interfaceC7222;
    }

    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) {
        return this.f46800.read(bArr, i, i2);
    }

    @Override // l.InterfaceC7222
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19212(boolean z, int i, int i2, byte[] bArr) {
        return this.f46800.mo19212(z, 0, i2, bArr);
    }

    @Override // l.InterfaceC7222
    public final void readFully(byte[] bArr, int i, int i2) {
        this.f46800.readFully(bArr, i, i2);
    }

    @Override // l.InterfaceC7222
    /* JADX INFO: renamed from: ܰ */
    public final int mo19215(int i) {
        return this.f46800.mo19215(i);
    }

    @Override // l.InterfaceC7222
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19211(int i, boolean z) {
        return this.f46800.mo19211(i, true);
    }

    @Override // l.InterfaceC7222
    /* JADX INFO: renamed from: ۨ */
    public final void mo19214(int i) {
        this.f46800.mo19214(i);
    }

    @Override // l.InterfaceC7222
    /* JADX INFO: renamed from: ܰ */
    public final int mo19216(int i, int i2, byte[] bArr) {
        return this.f46800.mo19216(i, i2, bArr);
    }

    @Override // l.InterfaceC7222
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo19219(boolean z, int i, int i2, byte[] bArr) {
        return this.f46800.mo19219(z, i, i2, bArr);
    }

    @Override // l.InterfaceC7222
    /* JADX INFO: renamed from: ۙ */
    public final void mo19210(int i, int i2, byte[] bArr) {
        this.f46800.mo19210(i, i2, bArr);
    }

    @Override // l.InterfaceC7222
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo19218(int i, boolean z) {
        return this.f46800.mo19218(i, true);
    }

    @Override // l.InterfaceC7222
    /* JADX INFO: renamed from: ۙ */
    public final void mo19209(int i) {
        this.f46800.mo19209(i);
    }

    @Override // l.InterfaceC7222
    /* JADX INFO: renamed from: ܰ */
    public final void mo19217() {
        this.f46800.mo19217();
    }

    @Override // l.InterfaceC7222
    /* JADX INFO: renamed from: ۨ */
    public long mo19213() {
        return this.f46800.mo19213();
    }

    @Override // l.InterfaceC7222
    public long getPosition() {
        return this.f46800.getPosition();
    }

    @Override // l.InterfaceC7222
    public long getLength() {
        return this.f46800.getLength();
    }
}
