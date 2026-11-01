package l;

/* JADX INFO: renamed from: l.ܺ۟ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C15791 extends AbstractC3877 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f51135;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC16579 m37547(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        if (abstractC165710.f53221 == C3794.f13674) {
            return abstractC16579;
        }
        switch (C14068.f46213[abstractC16579.mo1931().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return abstractC16579;
            default:
                return abstractC16579.mo1929(abstractC16579.f53221.m11038(EnumC0972.ANNOTATIONS));
        }
    }

    @Override // l.C4748, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(Object obj, AbstractC16579 abstractC16579) {
        return abstractC16579.mo9481() ? abstractC16579 : m37547(abstractC16579, abstractC16579);
    }

    @Override // l.AbstractC3877, l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4811(C0350 c0350, Object obj) {
        C23800 c23800 = this.f51135;
        return m37547(c23800.m52346(c23800.m52415(c0350), ((Boolean) obj).booleanValue()), (AbstractC16579) c0350);
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C22929 c22929, Object obj) {
        return m37547(this.f51135.m52346(c22929.mo18112(), ((Boolean) obj).booleanValue()), (AbstractC16579) c22929);
    }

    @Override // l.C4748, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16579 mo1767(Object obj, AbstractC16579 abstractC16579) {
        return abstractC16579.mo9481() ? abstractC16579 : m37547(abstractC16579, abstractC16579);
    }

    @Override // l.AbstractC3877, l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16579 mo4811(C0350 c0350, Object obj) {
        C23800 c23800 = this.f51135;
        return m37547(c23800.m52346(c23800.m52415(c0350), ((Boolean) obj).booleanValue()), (AbstractC16579) c0350);
    }

    @Override // l.AbstractC3877, l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC16579 mo1768(C0309 c0309, Boolean bool) {
        AbstractC16579 abstractC16579Mo50006 = c0309.f53222.mo50006(this.f51135);
        if (bool.booleanValue()) {
            return new C12305(abstractC16579Mo50006.mo1934(), C21825.m48588(), abstractC16579Mo50006.f53222, c0309.f53221.m11038(EnumC0972.ANNOTATIONS));
        }
        return m37547(abstractC16579Mo50006, (AbstractC16579) c0309);
    }

    public C15791(C23800 c23800) {
        this.f51135 = c23800;
    }
}
