package l;

/* JADX INFO: renamed from: l.ۙᩴۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4WJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5100 extends AbstractC19270 implements InterfaceC21729, InterfaceC21839 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC13679 f17801;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final /* synthetic */ String mo1543() {
        throw null;
    }

    public C5100(C24975 c24975, EnumC22631 enumC22631, int i) {
        super(c24975, enumC22631, i);
        this.f17801 = null;
    }

    @Override // l.InterfaceC12142
    /* JADX INFO: renamed from: ۙ */
    public final int mo1542() {
        return this.f62313.m55818().m8716(this.f62315 + 1);
    }

    @Override // l.InterfaceC6177
    public final InterfaceC10824 getReference() {
        AbstractC13679 abstractC13679 = this.f17801;
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

    @Override // l.InterfaceC21839
    /* JADX INFO: renamed from: ۙ */
    public final void mo2770(C8850 c8850) {
        this.f17801 = (AbstractC13679) c8850.m23714(getReference());
    }
}
