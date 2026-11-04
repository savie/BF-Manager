package l;

/* JADX INFO: renamed from: l.ܶ᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes5.dex */
public final class C16432 extends AbstractC21654 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f53314;

    @Override // l.AbstractC21654
    /* JADX INFO: renamed from: ۙ */
    public final void mo12192(InterfaceC14940 interfaceC14940) {
        interfaceC14940.mo18304(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C16432(AbstractC22664 abstractC22664, C24705 c24705) {
        AbstractC22664 abstractC22664M55132;
        if (abstractC22664.mo40452()) {
            abstractC22664M55132 = c24705.m55108(abstractC22664).f38067;
        } else {
            abstractC22664M55132 = c24705.m55132(abstractC22664);
        }
        super(new C10510(c24705.f79947.f48317.f73596, c24705.f79947.f48317.mo23449(), C14769.of((Object) abstractC22664M55132)));
        this.f53314 = abstractC22664;
    }

    @Override // l.InterfaceC19466
    public final String toString() {
        return this.f53314 + ".class";
    }

    @Override // l.AbstractC21654, l.InterfaceC19466
    /* JADX INFO: renamed from: ۙ */
    public final Object mo12191(InterfaceC14990 interfaceC14990) {
        return Boolean.FALSE;
    }
}
