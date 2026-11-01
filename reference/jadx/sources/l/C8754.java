package l;

/* JADX INFO: renamed from: l.ۡ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B9ZO */
/* JADX INFO: loaded from: classes3.dex */
public final class C8754 implements InterfaceC20478 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int[] f30094;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f30095;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f30096;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f30097;

    public C8754(int i, byte[] bArr, int i2, int[] iArr) {
        this.f30095 = i;
        this.f30097 = bArr;
        this.f30096 = i2;
        this.f30094 = iArr;
    }

    @Override // l.InterfaceC20478
    /* JADX INFO: renamed from: ۙ */
    public final int mo1806(int i, byte[] bArr) {
        C4850.m13550(this.f30095, i, bArr);
        System.arraycopy(this.f30097, 0, bArr, i + 4, 16);
        C4850.m13546(this.f30096, i + 20, bArr);
        int[] iArr = this.f30094;
        C4850.m13546(iArr.length, i + 22, bArr);
        int i2 = i + 24;
        for (int i3 : iArr) {
            C4850.m13546(i3, i2, bArr);
            i2 += 2;
        }
        return i2 - i;
    }

    @Override // l.InterfaceC20478
    public final int size() {
        return (this.f30094.length * 2) + 24;
    }
}
