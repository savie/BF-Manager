package l;

/* JADX INFO: renamed from: l.ۤۨۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87EI */
/* JADX INFO: loaded from: classes4.dex */
public final class C10270 extends AbstractC6741 {

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public short f35012;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public String f35013;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public short f35014;

    @Override // l.AbstractC6741, l.InterfaceC5144
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo9757() {
        return this.f22693;
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ܶ */
    public final String mo18230() {
        return C16236.m38348(EnumC20934.f68144, new StringBuilder(), ":");
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ۖ */
    public final void mo14101(int i, int i2) {
        mo14102(i, i2);
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ܰ */
    public final void mo14102(int i, int i2) {
        m18208(1);
        if (i == 0) {
            m18209(mo18230());
        }
        m18209(String.format(this.f35013, "line", Short.valueOf(this.f35012), Short.valueOf(this.f35014)));
    }
}
