package l;

/* JADX INFO: renamed from: l.۫᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13396 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f42689 = new byte[1048576];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C17125 f42690;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f42691;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC7509 f42692;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f42693;

    public C13396(C17125 c17125, InterfaceC7509 interfaceC7509) {
        this.f42690 = c17125;
        this.f42692 = interfaceC7509;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33031(int i) {
        int i2 = this.f42693;
        int i3 = i2 + 1;
        this.f42693 = i3;
        byte[] bArr = this.f42689;
        bArr[i2] = (byte) i;
        if (i3 == bArr.length) {
            m33029();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33032(int i, byte[] bArr) throws C9446 {
        int i2 = 0;
        while (i > 0) {
            byte[] bArr2 = this.f42689;
            int iMin = Math.min(i, bArr2.length - this.f42693);
            System.arraycopy(bArr, i2, bArr2, this.f42693, iMin);
            int i3 = this.f42693 + iMin;
            this.f42693 = i3;
            i2 += iMin;
            i -= iMin;
            if (i3 == bArr2.length) {
                m33029();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33030() throws C9446 {
        m33029();
        C17871.m41726(this.f42692);
        return this.f42691;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m33029() throws C9446 {
        if (this.f42693 == 0) {
            return;
        }
        C17871.m41726(this.f42692);
        int i = this.f42691;
        int i2 = this.f42693;
        if (i > Integer.MAX_VALUE - i2) {
            throw new C12562();
        }
        this.f42690.m40282(i2, this.f42689);
        this.f42691 += this.f42693;
        this.f42693 = 0;
    }
}
