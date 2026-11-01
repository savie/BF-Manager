package l;

/* JADX INFO: renamed from: l.ܺ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: EA1R */
/* JADX INFO: loaded from: classes5.dex */
public final class C16203 implements InterfaceC1903 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f52306;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f52307;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f52308;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f52309;

    @Override // l.InterfaceC1903
    /* JADX INFO: renamed from: ۖ */
    public final long mo6208() {
        return this.f52307 * ((long) this.f52308) * ((long) this.f52309);
    }

    @Override // l.InterfaceC7778
    /* JADX INFO: renamed from: ۙ */
    public final int mo1805(int i, int i2, byte[] bArr) {
        this.f52307 = C4850.m13547(i, bArr);
        this.f52306 = C4850.m13547(i + 8, bArr);
        this.f52308 = C4850.m13549(i + 16, bArr);
        this.f52309 = C4850.m13549(i + 20, bArr);
        return (i + 24) - i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbInfoAllocation[alloc=");
        sb.append(this.f52307);
        sb.append(",free=");
        sb.append(this.f52306);
        sb.append(",sectPerAlloc=");
        sb.append(this.f52308);
        sb.append(",bytesPerSect=");
        return new String(C12441.m30911(this.f52309, "]", sb));
    }
}
