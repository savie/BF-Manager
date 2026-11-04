package l;

/* JADX INFO: renamed from: l.᩻ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S9Y4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24855 implements InterfaceC4145, InterfaceC20379, InterfaceC2149 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f80453;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f80454;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f80455;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f80456;

    @Override // l.InterfaceC4145
    /* JADX INFO: renamed from: ᩸ */
    public final long mo13272() {
        return this.f80454 * ((long) this.f80453) * ((long) this.f80456);
    }

    @Override // l.InterfaceC2149
    /* JADX INFO: renamed from: ۙ */
    public final int mo6138(int i, int i2, byte[] bArr) {
        this.f80454 = C0481.m2320(i, bArr);
        this.f80455 = C0481.m2320(i + 8, bArr);
        this.f80453 = C0481.m2322(i + 24, bArr);
        this.f80456 = C0481.m2322(i + 28, bArr);
        return (i + 32) - i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbInfoAllocation[alloc=");
        sb.append(this.f80454);
        sb.append(",free=");
        sb.append(this.f80455);
        sb.append(",sectPerAlloc=");
        sb.append(this.f80453);
        sb.append(",bytesPerSect=");
        return new String(C12669.m31437(this.f80456, "]", sb));
    }
}
