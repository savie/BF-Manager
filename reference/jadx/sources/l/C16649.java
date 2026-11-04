package l;

/* JADX INFO: renamed from: l.ܺۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: EA1R */
/* JADX INFO: loaded from: classes5.dex */
public final class C16649 implements InterfaceC4145 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f53794;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f53795;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f53796;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f53797;

    @Override // l.InterfaceC4145
    /* JADX INFO: renamed from: ᩸ */
    public final long mo13272() {
        return this.f53795 * ((long) this.f53794) * ((long) this.f53797);
    }

    @Override // l.InterfaceC2149
    /* JADX INFO: renamed from: ۙ */
    public final int mo6138(int i, int i2, byte[] bArr) {
        this.f53795 = C0481.m2320(i, bArr);
        this.f53796 = C0481.m2320(i + 8, bArr);
        this.f53794 = C0481.m2322(i + 16, bArr);
        this.f53797 = C0481.m2322(i + 20, bArr);
        return (i + 24) - i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbInfoAllocation[alloc=");
        sb.append(this.f53795);
        sb.append(",free=");
        sb.append(this.f53796);
        sb.append(",sectPerAlloc=");
        sb.append(this.f53794);
        sb.append(",bytesPerSect=");
        return new String(C12669.m31437(this.f53797, "]", sb));
    }
}
