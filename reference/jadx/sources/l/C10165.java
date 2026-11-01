package l;

/* JADX INFO: renamed from: l.ۤ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: OA16 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10165 implements InterfaceC7778 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f34731;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f34732;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f34733 = new byte[16];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f34734;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m25902() {
        return this.f34732;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final byte[] m25900() {
        return this.f34733;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m25903() {
        return this.f34731;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m25901() {
        return this.f34734;
    }

    @Override // l.InterfaceC7778
    /* JADX INFO: renamed from: ۙ */
    public final int mo1805(int i, int i2, byte[] bArr) {
        this.f34732 = C4850.m13549(i, bArr);
        System.arraycopy(bArr, i + 4, this.f34733, 0, 16);
        this.f34731 = C4850.m13545(i + 20, bArr);
        this.f34734 = C4850.m13545(i + 22, bArr);
        return (i + 24) - i;
    }
}
