package l;

/* JADX INFO: renamed from: l.ۨۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I9WL */
/* JADX INFO: loaded from: classes4.dex */
public final class C12174 implements InterfaceC4145 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f39153;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f39154;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f39155;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f39156;

    @Override // l.InterfaceC4145
    /* JADX INFO: renamed from: ᩸ */
    public final long mo13272() {
        return this.f39154 * ((long) this.f39153) * ((long) this.f39156);
    }

    @Override // l.InterfaceC2149
    /* JADX INFO: renamed from: ۙ */
    public final int mo6138(int i, int i2, byte[] bArr) {
        this.f39153 = C0481.m2322(i + 4, bArr);
        this.f39154 = C0481.m2322(i + 8, bArr);
        this.f39155 = C0481.m2322(i + 12, bArr);
        this.f39156 = C0481.m2318(i + 16, bArr);
        return (i + 20) - i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbInfoAllocation[alloc=");
        sb.append(this.f39154);
        sb.append(",free=");
        sb.append(this.f39155);
        sb.append(",sectPerAlloc=");
        sb.append(this.f39153);
        sb.append(",bytesPerSect=");
        return new String(C12669.m31437(this.f39156, "]", sb));
    }
}
