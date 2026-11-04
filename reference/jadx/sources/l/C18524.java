package l;

/* JADX INFO: renamed from: l.ܿᩴۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4MM */
/* JADX INFO: loaded from: classes5.dex */
public final class C18524 extends AbstractC19270 implements InterfaceC0100, InterfaceC21839 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC13679 f60219;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC13679 f60220;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final /* synthetic */ String mo1543() {
        throw null;
    }

    public C18524(C24975 c24975, EnumC22631 enumC22631, int i) {
        super(c24975, enumC22631, i);
        this.f60219 = null;
        this.f60220 = null;
    }

    @Override // l.InterfaceC0210
    /* JADX INFO: renamed from: ۚ */
    public final int mo1655() {
        return AbstractC17076.m40211(this.f62313.m55818().m8716(this.f62315 + 1));
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ᩴ */
    public final int mo7063() {
        return this.f62313.m55818().m8716(this.f62315 + 4) & 15;
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ᩸ */
    public final int mo7065() {
        return AbstractC17076.m40211(this.f62313.m55818().m8716(this.f62315 + 4));
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ۫ */
    public final int mo7061() {
        return this.f62313.m55818().m8716(this.f62315 + 5) & 15;
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ܳ */
    public final int mo7062() {
        return AbstractC17076.m40211(this.f62313.m55818().m8716(this.f62315 + 5));
    }

    @Override // l.InterfaceC16617
    /* JADX INFO: renamed from: ᩷ */
    public final int mo7064() {
        return this.f62313.m55818().m8716(this.f62315 + 1) & 15;
    }

    @Override // l.InterfaceC6177
    public final InterfaceC10824 getReference() {
        AbstractC13679 abstractC13679 = this.f60219;
        if (abstractC13679 != null) {
            return abstractC13679;
        }
        int i = this.f62314.f73513;
        C24975 c24975 = this.f62313;
        return AbstractC11902.m29783(c24975, i, c24975.m55818().m8721(this.f62315 + 2));
    }

    @Override // l.InterfaceC6177
    /* JADX INFO: renamed from: ᩵ */
    public final int mo2771() {
        return this.f62314.f73513;
    }

    @Override // l.InterfaceC11396
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10824 mo2769() {
        AbstractC13679 abstractC13679 = this.f60220;
        if (abstractC13679 != null) {
            return abstractC13679;
        }
        int i = this.f62314.f73510;
        C24975 c24975 = this.f62313;
        return AbstractC11902.m29783(c24975, i, c24975.m55818().m8721(this.f62315 + 6));
    }

    @Override // l.InterfaceC11396
    /* JADX INFO: renamed from: ᩺ */
    public final int mo2773() {
        return this.f62314.f73510;
    }

    @Override // l.InterfaceC21839
    /* JADX INFO: renamed from: ۙ */
    public final void mo2770(C8850 c8850) {
        this.f60219 = (AbstractC13679) c8850.m23714(getReference());
        this.f60220 = (AbstractC13679) c8850.m23714(mo2769());
    }
}
