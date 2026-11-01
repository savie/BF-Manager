package l;

/* JADX INFO: renamed from: l.ܰᩳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes4.dex */
public final class C13984 extends AbstractC23156 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f45980;

    @Override // l.AbstractC23156
    /* JADX INFO: renamed from: ۙ */
    public final void mo4166(InterfaceC6927 interfaceC6927) {
        interfaceC6927.mo7551(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C13984(AbstractC16579 abstractC16579, C23800 c23800) {
        AbstractC16579 abstractC16579M52402;
        if (abstractC16579.mo9481()) {
            abstractC16579M52402 = c23800.m52383(abstractC16579).f77449;
        } else {
            abstractC16579M52402 = c23800.m52402(abstractC16579);
        }
        super(new C0309(c23800.f76937.f14283.f53222, c23800.f76937.f14283.mo1934(), C21825.of((Object) abstractC16579M52402)));
        this.f45980 = abstractC16579;
    }

    @Override // l.InterfaceC11097
    public final String toString() {
        return this.f45980 + ".class";
    }

    @Override // l.AbstractC23156, l.InterfaceC11097
    /* JADX INFO: renamed from: ۙ */
    public final Object mo8225(InterfaceC23797 interfaceC23797) {
        return Boolean.FALSE;
    }
}
