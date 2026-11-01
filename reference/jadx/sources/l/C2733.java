package l;

/* JADX INFO: renamed from: l.ۖ᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K9V6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2733 extends AbstractC23196 {
    @Override // l.AbstractC23196
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo8343(int i, byte[] bArr) {
        return 0;
    }

    public C2733(InterfaceC10601 interfaceC10601, C11907 c11907) {
        super(interfaceC10601);
        this.f75282 = c11907;
        this.f75283 = 32;
    }

    @Override // l.AbstractC23196
    public final String toString() {
        return new String(C22697.m50267(new StringBuilder("NameQueryRequest["), super.toString(), "]"));
    }

    @Override // l.AbstractC23196
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo8341(int i, byte[] bArr) {
        int iM29702 = this.f75282.m29702(i, bArr) + i;
        AbstractC23196.m51222(this.f75283, iM29702, bArr);
        AbstractC23196.m51222(this.f75281, iM29702 + 2, bArr);
        return (iM29702 + 4) - i;
    }

    @Override // l.AbstractC23196
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo8342(int i, byte[] bArr) {
        int iM29700 = this.f75282.m29700(i, bArr) + i;
        this.f75283 = AbstractC23196.m51223(iM29700, bArr);
        this.f75281 = AbstractC23196.m51223(iM29700 + 2, bArr);
        return (iM29700 + 4) - i;
    }
}
