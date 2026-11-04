package l;

/* JADX INFO: renamed from: l.ۘܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89DN */
/* JADX INFO: loaded from: classes3.dex */
public final class C4272 extends C24652 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f15525;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f15526;

    @Override // l.C24652
    /* JADX INFO: renamed from: ᩷ */
    public final void mo4684(C7453 c7453) throws C2013 {
        c7453.m56021(2);
        this.f15525 = c7453.m56020() & 255;
        c7453.m56021(1);
        this.f15526 = c7453.m56002();
        c7453.m56002();
        c7453.m56021(4);
        c7453.m56027(this.f15525);
        c7453.m56021(this.f15526);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m13613() {
        return this.f15526;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13615(int i, byte[] bArr, int i2, int i3) {
        m13612(i, i3, this.f15526);
        m13612(i2, i3, bArr.length);
        System.arraycopy(this.f16382.m56011(), this.f15525 + i, bArr, i2, i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte m13614(int i) {
        m13612(i, 1, this.f15526);
        return this.f16382.m56011()[this.f15525 + i];
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] m13616() {
        int i = this.f15526;
        byte[] bArr = new byte[i];
        m13615(0, bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13612(int i, int i2, int i3) {
        if (i < 0 || i2 < 0 || i > i3 - i2) {
            StringBuilder sbM5126 = C1402.m5126("offset=", i, ", length=", ", size=", i2);
            sbM5126.append(i3);
            throw new IndexOutOfBoundsException(sbM5126.toString());
        }
    }
}
