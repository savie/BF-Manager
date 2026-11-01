package l;

/* JADX INFO: renamed from: l.۫᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 19TU */
/* JADX INFO: loaded from: classes4.dex */
public final class C12675 implements InterfaceC19731 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f42322;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f42323;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f42324;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f42325;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f42326;

    @Override // l.InterfaceC22553
    public final int getAttributes() {
        return 0;
    }

    @Override // l.InterfaceC20478
    public final int size() {
        return 22;
    }

    @Override // l.InterfaceC20436
    /* JADX INFO: renamed from: ܰ */
    public final byte mo3043() {
        return (byte) 5;
    }

    @Override // l.InterfaceC22553
    /* JADX INFO: renamed from: ᩻ */
    public final long mo10132() {
        return 0L;
    }

    @Override // l.InterfaceC22553
    public final long getSize() {
        return this.f42325;
    }

    @Override // l.InterfaceC7778
    /* JADX INFO: renamed from: ۙ */
    public final int mo1805(int i, int i2, byte[] bArr) {
        this.f42324 = C4850.m13547(i, bArr);
        this.f42325 = C4850.m13547(i + 8, bArr);
        this.f42323 = C4850.m13549(i + 16, bArr);
        int i3 = i + 21;
        this.f42326 = (bArr[i + 20] & 255) > 0;
        int i4 = i + 22;
        this.f42322 = (bArr[i3] & 255) > 0;
        return i4 - i;
    }

    @Override // l.InterfaceC20478
    /* JADX INFO: renamed from: ۙ */
    public final int mo1806(int i, byte[] bArr) {
        C4850.m13548(this.f42324, i, bArr);
        C4850.m13548(this.f42325, i + 8, bArr);
        C4850.m13550(this.f42323, i + 16, bArr);
        bArr[i + 20] = this.f42326 ? (byte) 1 : (byte) 0;
        bArr[i + 21] = this.f42322 ? (byte) 1 : (byte) 0;
        return (i + 22) - i;
    }

    public final String toString() {
        return new String("SmbQueryInfoStandard[allocationSize=" + this.f42324 + ",endOfFile=" + this.f42325 + ",numberOfLinks=" + this.f42323 + ",deletePending=" + this.f42326 + ",directory=" + this.f42322 + "]");
    }
}
