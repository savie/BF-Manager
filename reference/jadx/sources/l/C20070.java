package l;

/* JADX INFO: renamed from: l.ᩴ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A9YS */
/* JADX INFO: loaded from: classes5.dex */
public final class C20070 extends AbstractC5154 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f64524;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C22308 f64525;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte[] f64526;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C22308[] f64527;

    @Override // l.AbstractC5154
    /* JADX INFO: renamed from: ᩸ */
    public final int mo4459(int i, byte[] bArr) {
        return 0;
    }

    public C20070(InterfaceC5878 interfaceC5878, C22308 c22308) {
        super(interfaceC5878);
        this.f64525 = c22308;
        this.f17978 = new C19126(interfaceC5878);
        this.f64526 = new byte[6];
    }

    @Override // l.AbstractC5154
    /* JADX INFO: renamed from: ۙ */
    public final int mo4457(int i, byte[] bArr) {
        return m15573(i, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // l.AbstractC5154
    /* JADX INFO: renamed from: ᩷ */
    public final int mo4458(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = i2 * 18;
        ?? r5 = 1;
        int i4 = (this.f17982 - i3) - 1;
        int i5 = i + 1;
        this.f64524 = i2;
        System.arraycopy(bArr, i3 + i5, this.f64526, 0, 6);
        this.f64527 = new C22308[this.f64524];
        C22308 c22308 = this.f64525;
        String str = c22308.f72221.f61899;
        int i6 = 0;
        boolean z = false;
        int i7 = i5;
        while (i6 < this.f64524) {
            int i8 = i7 + 14;
            while (bArr[i8] == 32) {
                i8--;
            }
            InterfaceC5878 interfaceC5878 = this.f17969;
            String strM53450 = C23933.m53450(bArr, i7, (i8 - i7) + r5, interfaceC5878);
            int i9 = bArr[i7 + 15] & 255;
            byte b = bArr[i7 + 16];
            if (!z) {
                C19126 c19126 = c22308.f72221;
                if (c19126.f61898 == i9 && (c19126.m44256() || c22308.f72221.f61896.equals(strM53450))) {
                    if (c22308.f72221.m44256()) {
                        c22308.f72221 = new C19126(interfaceC5878, strM53450, i9, str);
                    }
                    c22308.f72223 = r5;
                    this.f64527[i6] = c22308;
                    z = true;
                } else {
                    this.f64527[i6] = new C22308(new C19126(interfaceC5878, strM53450, i9, str), c22308.f72220, 0);
                }
            } else {
                this.f64527[i6] = new C22308(new C19126(interfaceC5878, strM53450, i9, str), c22308.f72220, 0);
            }
            i7 += 18;
            i6++;
            r5 = 1;
        }
        int i10 = (i7 - i5) + i5;
        System.arraycopy(bArr, i10, new byte[i4], 0, i4);
        return (i10 + i4) - i;
    }

    @Override // l.AbstractC5154
    public final String toString() {
        return new String(C8947.m23910(new StringBuilder("NodeStatusResponse["), super.toString(), "]"));
    }
}
