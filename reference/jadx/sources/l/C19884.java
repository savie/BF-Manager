package l;

/* JADX INFO: renamed from: l.ᩴܳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04J6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19884 extends AbstractC2493 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24975 f63986;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f63987;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f63988;

    public C19884(C24975 c24975, int i) {
        this.f63986 = c24975;
        this.f63988 = i;
        C22122 c22122M55819 = c24975.m55819(8);
        if (c22122M55819 != null && i < c22122M55819.m50079()) {
            this.f63987 = (i * 8) + c22122M55819.m50081();
            return;
        }
        throw new C1854(null, "Method handle index out of bounds: %d", Integer.valueOf(i));
    }

    @Override // l.InterfaceC6813
    /* JADX INFO: renamed from: ۙ᩷ */
    public final int mo17433() {
        return this.f63986.m55818().m8721(this.f63987);
    }

    @Override // l.InterfaceC6813
    /* JADX INFO: renamed from: ۫᩷ */
    public final InterfaceC10824 mo17434() {
        C24975 c24975 = this.f63986;
        int iM8721 = c24975.m55818().m8721(this.f63987 + 4);
        switch (mo17433()) {
            case 0:
            case 1:
            case 2:
            case 3:
                return new C22868(c24975, iM8721);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return c24975.m55805(iM8721);
            default:
                throw new C23044(null, "Invalid method handle type: %d", Integer.valueOf(mo17433()));
        }
    }

    @Override // l.AbstractC13679, l.InterfaceC10824
    /* JADX INFO: renamed from: ᩴ */
    public final void mo6806() throws C22013 {
        int i = this.f63988;
        if (i >= 0) {
            C22122 c22122M55819 = this.f63986.m55819(8);
            if (i < (c22122M55819 == null ? 0 : c22122M55819.m50079())) {
                try {
                    mo17434();
                    return;
                } catch (C23044 e) {
                    throw new C22013(C13645.m33382(i, "methodhandle@"), e);
                }
            }
        }
        throw new C22013(C13645.m33382(i, "methodhandle@"));
    }
}
