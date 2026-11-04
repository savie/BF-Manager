package l;

/* JADX INFO: renamed from: l.ۧܳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 65VW */
/* JADX INFO: loaded from: classes4.dex */
public final class C11679 extends AbstractC4927 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24975 f37834;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f37835;

    public C11679(C24975 c24975, int i) {
        this.f37834 = c24975;
        this.f37835 = i;
    }

    @Override // l.InterfaceC22759
    public final String getString() {
        return this.f37834.m55782(this.f37835);
    }

    @Override // l.AbstractC13679, l.InterfaceC10824
    /* JADX INFO: renamed from: ᩴ */
    public final void mo6806() throws C22013 {
        int i = this.f37835;
        if (i < 0 || i >= this.f37834.m55808()) {
            throw new C22013("string@" + i);
        }
    }
}
