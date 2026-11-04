package l;

/* JADX INFO: renamed from: l.ۚۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J9WI */
/* JADX INFO: loaded from: classes3.dex */
public final class C5397 extends AbstractC1513 {

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public final C10682 f18889;

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۫ۙ */
    public final boolean mo12783() {
        return true;
    }

    @Override // l.AbstractC1513
    /* JADX INFO: renamed from: ᩷ */
    public final int mo5379(byte[] bArr) {
        return 0;
    }

    public C5397(InterfaceC5878 interfaceC5878) {
        super(interfaceC5878);
        this.f18889 = new C10682();
        m5380((byte) 16);
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final C10682 m16080() {
        return this.f18889;
    }

    @Override // l.AbstractC1513
    /* JADX INFO: renamed from: ᩷ */
    public final int mo5378(int i, int i2, byte[] bArr) {
        return (this.f18889.mo6138(i, i2, bArr) + i) - i;
    }

    @Override // l.AbstractC1513, l.AbstractC3971
    public final String toString() {
        return new String("Trans2GetDfsReferralResponse[" + super.toString() + ",buffer=" + this.f18889 + "]");
    }
}
