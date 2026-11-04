package l;

/* JADX INFO: renamed from: l.᩻ܳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5ZX */
/* JADX INFO: loaded from: classes2.dex */
public final class C25106 extends AbstractC22081 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24975 f81190;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f81191;

    public C25106(C24975 c24975, int i) {
        this.f81190 = c24975;
        this.f81191 = i;
    }

    @Override // l.InterfaceC19775
    public final String getType() {
        return this.f81190.m55822(this.f81191);
    }

    @Override // l.AbstractC13679, l.InterfaceC10824
    /* JADX INFO: renamed from: ᩴ */
    public final void mo6806() throws C22013 {
        int i = this.f81191;
        if (i < 0 || i >= this.f81190.m55806()) {
            throw new C22013("type@" + i);
        }
    }
}
