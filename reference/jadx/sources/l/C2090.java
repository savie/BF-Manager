package l;

/* JADX INFO: renamed from: l.֫᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: VA0B */
/* JADX INFO: loaded from: classes2.dex */
public final class C2090 implements InterfaceC20478, InterfaceC7778 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f7720;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f7721;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f7722;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f7723;

    public C2090(boolean z) {
        this.f7723 = z;
    }

    @Override // l.InterfaceC7778
    /* JADX INFO: renamed from: ۙ */
    public final int mo1805(int i, int i2, byte[] bArr) {
        if (this.f7723) {
            this.f7722 = C4850.m13545(i, bArr);
            this.f7721 = (C4850.m13549(i + 4, bArr) << 32) | C4850.m13549(i + 8, bArr);
            this.f7720 = C4850.m13549(i + 16, bArr) | (C4850.m13549(i + 12, bArr) << 32);
            return 20;
        }
        this.f7722 = C4850.m13545(i, bArr);
        this.f7721 = C4850.m13549(i + 2, bArr);
        this.f7720 = C4850.m13549(i + 6, bArr);
        return 10;
    }

    @Override // l.InterfaceC20478
    /* JADX INFO: renamed from: ۙ */
    public final int mo1806(int i, byte[] bArr) {
        if (this.f7723) {
            C4850.m13546(this.f7722, i, bArr);
            C4850.m13550(this.f7721 >> 32, i + 4, bArr);
            C4850.m13550(this.f7721, i + 8, bArr);
            C4850.m13550(this.f7720 >> 32, i + 12, bArr);
            C4850.m13550(this.f7720, i + 16, bArr);
            return 20;
        }
        C4850.m13546(this.f7722, i, bArr);
        C4850.m13550(this.f7721, i + 2, bArr);
        C4850.m13550(this.f7720, i + 6, bArr);
        return 10;
    }

    @Override // l.InterfaceC20478
    public final int size() {
        return this.f7723 ? 20 : 10;
    }
}
