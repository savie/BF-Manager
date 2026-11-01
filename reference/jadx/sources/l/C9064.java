package l;

/* JADX INFO: renamed from: l.ۡᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: J9WI */
/* JADX INFO: loaded from: classes4.dex */
public final class C9064 extends AbstractC5535 {

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public final C21847 f30916;

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo23399() {
        return true;
    }

    @Override // l.AbstractC5535
    /* JADX INFO: renamed from: ܰ */
    public final int mo2803(byte[] bArr) {
        return 0;
    }

    public C9064(InterfaceC10601 interfaceC10601) {
        super(interfaceC10601);
        this.f30916 = new C21847();
        m15236((byte) 16);
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final C21847 m23400() {
        return this.f30916;
    }

    @Override // l.AbstractC5535
    /* JADX INFO: renamed from: ܰ */
    public final int mo2802(int i, int i2, byte[] bArr) {
        return (this.f30916.mo1805(i, i2, bArr) + i) - i;
    }

    @Override // l.AbstractC5535, l.AbstractC14792
    public final String toString() {
        return new String("Trans2GetDfsReferralResponse[" + super.toString() + ",buffer=" + this.f30916 + "]");
    }
}
