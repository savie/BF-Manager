package l;

/* JADX INFO: renamed from: l.۬ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 59V3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13599 extends AbstractC12108 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public byte[] f43191;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f43192;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f43193;

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩸ */
    public final int mo1472(int i, byte[] bArr) {
        return 0;
    }

    public C13599(int i, InterfaceC5878 interfaceC5878, byte[] bArr) {
        super(interfaceC5878);
        this.f43191 = bArr;
        this.f43192 = i;
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final int m33334() {
        return this.f43193;
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1470(int i, byte[] bArr) throws C19061 {
        int iM2318 = C0481.m2318(i, bArr);
        if (iM2318 == 9) {
            return m10319(i, bArr);
        }
        if (iM2318 != 17) {
            throw new C19061("Expected structureSize = 17");
        }
        short s = bArr[i + 2];
        this.f43193 = C0481.m2322(i + 4, bArr);
        C0481.m2322(i + 8, bArr);
        int i2 = i + 16;
        int iM10327 = m10327() + s;
        int i3 = this.f43193;
        int i4 = this.f43192;
        int i5 = i3 + i4;
        byte[] bArr2 = this.f43191;
        if (i5 > bArr2.length) {
            throw new C19061("Buffer to small for read response");
        }
        System.arraycopy(bArr, iM10327, bArr2, i4, i3);
        return Math.max(i2, iM10327 + this.f43193) - i;
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ܺۙ */
    public final boolean mo10328() {
        return m10323() != -2147483643 && super.mo10328();
    }
}
