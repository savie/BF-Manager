package l;

/* JADX INFO: renamed from: l.᩹᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes.dex */
public final class C22513 extends AbstractC1345 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18279 f73474;

    @Override // l.AbstractC23219
    /* JADX INFO: renamed from: ۙ */
    public final void mo8403(AbstractC8774 abstractC8774, AbstractC8774 abstractC8775, boolean z) {
        C6656 c6656 = (C6656) abstractC8774;
        C6656 c6657 = (C6656) abstractC8775;
        if (z) {
            return;
        }
        C18279 c18279 = this.f5675;
        if (c18279.f58325.m52399(c6656.f30190, c6657.f30190)) {
            c18279.f58321.m48204(c6656, C9768.f32838);
        }
    }

    @Override // l.AbstractC23219
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8404(AbstractC8774 abstractC8774) {
        C6656 c6656 = (C6656) abstractC8774;
        if (c6656.f22475.f77448.f77452 != EnumC10477.f35879 || c6656.f22481 == null || c6656.f22477.f30189 == -1) {
            return false;
        }
        this.f73474.f58320.getClass();
        C13818 c13818 = new C13818();
        c13818.f45604 = null;
        c13818.f45605 = true;
        c13818.mo7248(c6656.f22481);
        return c13818.f45604 == null;
    }

    @Override // l.AbstractC23219
    /* JADX INFO: renamed from: ܰ */
    public final C21825 mo8405(AbstractC8774 abstractC8774) {
        C6656 c6656 = (C6656) this.f5675.f58326.mo1921(abstractC8774, (Object) null);
        c6656.f22477 = null;
        return C21825.of((Object) c6656);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22513(C18279 c18279) {
        super(c18279, EnumC18651.f60554);
        this.f73474 = c18279;
    }
}
