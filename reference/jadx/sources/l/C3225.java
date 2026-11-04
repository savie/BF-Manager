package l;

/* JADX INFO: renamed from: l.ۗۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 19TU */
/* JADX INFO: loaded from: classes3.dex */
public final class C3225 implements InterfaceC12920 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f10520;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f10521;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f10522;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f10523;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f10524;

    @Override // l.InterfaceC1162
    public final int getAttributes() {
        return 0;
    }

    @Override // l.InterfaceC17064
    public final int size() {
        return 22;
    }

    @Override // l.InterfaceC1162
    /* JADX INFO: renamed from: ۡ */
    public final long mo4305() {
        return 0L;
    }

    @Override // l.InterfaceC17395
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte mo10574() {
        return (byte) 5;
    }

    @Override // l.InterfaceC1162
    public final long getSize() {
        return this.f10520;
    }

    @Override // l.InterfaceC2149
    /* JADX INFO: renamed from: ۙ */
    public final int mo6138(int i, int i2, byte[] bArr) {
        this.f10522 = C0481.m2320(i, bArr);
        this.f10520 = C0481.m2320(i + 8, bArr);
        this.f10521 = C0481.m2322(i + 16, bArr);
        int i3 = i + 21;
        this.f10524 = (bArr[i + 20] & 255) > 0;
        int i4 = i + 22;
        this.f10523 = (bArr[i3] & 255) > 0;
        return i4 - i;
    }

    @Override // l.InterfaceC17064
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo10573(int i, byte[] bArr) {
        C0481.m2321(this.f10522, i, bArr);
        C0481.m2321(this.f10520, i + 8, bArr);
        C0481.m2323(this.f10521, i + 16, bArr);
        bArr[i + 20] = this.f10524 ? (byte) 1 : (byte) 0;
        bArr[i + 21] = this.f10523 ? (byte) 1 : (byte) 0;
        return (i + 22) - i;
    }

    public final String toString() {
        return new String("SmbQueryInfoStandard[allocationSize=" + this.f10522 + ",endOfFile=" + this.f10520 + ",numberOfLinks=" + this.f10521 + ",deletePending=" + this.f10524 + ",directory=" + this.f10523 + "]");
    }
}
