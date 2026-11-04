package l;

/* JADX INFO: renamed from: l.ۛ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 39YC */
/* JADX INFO: loaded from: classes3.dex */
public final class C6734 extends AbstractC6209 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f22442;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f22443;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public byte[] f22444;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public long f22445;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public int f22446;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f22447;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public int f22448;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public int f22449;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f22450;

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۤ */
    public final int mo1722(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1725(int i, byte[] bArr) {
        return 0;
    }

    public C6734(InterfaceC5878 interfaceC5878) {
        super(interfaceC5878, (byte) 47, (AbstractC3971) null);
    }

    public C6734(InterfaceC5878 interfaceC5878, int i, long j, int i2, byte[] bArr, int i3, int i4) {
        super(interfaceC5878, (byte) 47, (AbstractC3971) null);
        this.f22448 = i;
        this.f22445 = j;
        this.f22446 = i2;
        this.f22444 = bArr;
        this.f22442 = i3;
        this.f22447 = i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18827(int i, long j, int i2, byte[] bArr, int i3, int i4) {
        this.f22448 = i;
        this.f22445 = j;
        this.f22446 = i2;
        this.f22444 = bArr;
        this.f22442 = i3;
        this.f22447 = i4;
        this.f13583 = null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18828(int i) {
        this.f22443 = i;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۫ */
    public final int mo1723(int i, byte[] bArr) {
        int i2 = this.f13597;
        int i3 = (i - i2) + 26;
        this.f22450 = i3;
        int i4 = (i3 - i2) % 4;
        this.f22449 = i4;
        int i5 = i4 == 0 ? 0 : 4 - i4;
        this.f22449 = i5;
        this.f22450 = i3 + i5;
        C0481.m2319(this.f22448, i, bArr);
        C0481.m2323(this.f22445, i + 2, bArr);
        int i6 = i + 6;
        int i7 = 0;
        while (i7 < 4) {
            bArr[i6] = -1;
            i7++;
            i6++;
        }
        C0481.m2319(this.f22443, i6, bArr);
        C0481.m2319(this.f22446, i6 + 2, bArr);
        bArr[i6 + 4] = 0;
        bArr[i6 + 5] = 0;
        C0481.m2319(this.f22447, i6 + 6, bArr);
        C0481.m2319(this.f22450, i6 + 8, bArr);
        C0481.m2323(this.f22445 >> 32, i6 + 10, bArr);
        return (i6 + 14) - i;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩴ */
    public final int mo1724(int i, byte[] bArr) {
        int i2 = i;
        while (true) {
            int i3 = this.f22449;
            this.f22449 = i3 - 1;
            if (i3 > 0) {
                bArr[i2] = -18;
                i2++;
            } else {
                System.arraycopy(this.f22444, this.f22442, bArr, i2, this.f22447);
                return (i2 + this.f22447) - i;
            }
        }
    }

    @Override // l.AbstractC6209, l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComWriteAndX[");
        sb.append(super.toString());
        sb.append(",fid=");
        sb.append(this.f22448);
        sb.append(",offset=");
        sb.append(this.f22445);
        sb.append(",writeMode=");
        sb.append(this.f22443);
        sb.append(",remaining=");
        sb.append(this.f22446);
        sb.append(",dataLength=");
        sb.append(this.f22447);
        sb.append(",dataOffset=");
        return new String(C12669.m31437(this.f22450, "]", sb));
    }
}
