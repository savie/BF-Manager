package l;

/* JADX INFO: renamed from: l.᩺ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 89UN */
/* JADX INFO: loaded from: classes2.dex */
public final class C24348 extends AbstractC12108 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public int f78960;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f78961;

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩸ */
    public final int mo1472(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC12108, l.InterfaceC18315
    /* JADX INFO: renamed from: ۙ */
    public final void mo12767(InterfaceC21299 interfaceC21299) {
        if (mo12784()) {
            interfaceC21299.mo10336(m10302());
        }
        super.mo12767(interfaceC21299);
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ܺۙ */
    public final boolean mo10328() {
        return m10323() != -1073741802 && super.mo10328();
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1470(int i, byte[] bArr) throws C19061 {
        if (C0481.m2318(i, bArr) != 9) {
            throw new C19061("Structure size != 9");
        }
        this.f78960 = C0481.m2318(i + 2, bArr);
        int iM2318 = C0481.m2318(i + 4, bArr);
        int iM2319 = C0481.m2318(i + 6, bArr);
        int i2 = i + 8;
        int iM10327 = i2 - (m10327() + iM2318);
        this.f78961 = new byte[iM2319];
        System.arraycopy(bArr, m10327() + iM2318, this.f78961, 0, iM2319);
        return ((i2 + iM10327) + iM2319) - i;
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final boolean m54387() {
        return (this.f78960 & 3) != 0;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final int m54388() {
        return this.f78960;
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m54386() {
        return this.f78961;
    }
}
