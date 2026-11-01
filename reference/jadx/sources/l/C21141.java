package l;

/* JADX INFO: renamed from: l.᩷᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: S9Y4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21141 implements InterfaceC1903, InterfaceC17613, InterfaceC7778 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f68859;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f68860;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f68861;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f68862;

    @Override // l.InterfaceC1903
    /* JADX INFO: renamed from: ۖ */
    public final long mo6208() {
        return this.f68860 * ((long) this.f68861) * ((long) this.f68862);
    }

    @Override // l.InterfaceC7778
    /* JADX INFO: renamed from: ۙ */
    public final int mo1805(int i, int i2, byte[] bArr) {
        this.f68860 = C4850.m13547(i, bArr);
        this.f68859 = C4850.m13547(i + 8, bArr);
        this.f68861 = C4850.m13549(i + 24, bArr);
        this.f68862 = C4850.m13549(i + 28, bArr);
        return (i + 32) - i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbInfoAllocation[alloc=");
        sb.append(this.f68860);
        sb.append(",free=");
        sb.append(this.f68859);
        sb.append(",sectPerAlloc=");
        sb.append(this.f68861);
        sb.append(",bytesPerSect=");
        return new String(C12441.m30911(this.f68862, "]", sb));
    }
}
