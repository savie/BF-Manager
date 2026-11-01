package l;

/* JADX INFO: renamed from: l.۬᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes4.dex */
public final class C13341 extends AbstractC1345 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18279 f44252;

    @Override // l.AbstractC23219
    /* JADX INFO: renamed from: ۙ */
    public final void mo8403(AbstractC8774 abstractC8774, AbstractC8774 abstractC8775, boolean z) {
        C6656 c6656 = ((C16514) abstractC8774).f53042;
        C6656 c6657 = ((C16514) abstractC8775).f53042;
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
        return !(((C16514) abstractC8774).f53042.f22477.f30189 == -1);
    }

    @Override // l.AbstractC23219
    /* JADX INFO: renamed from: ܰ */
    public final C21825 mo8405(AbstractC8774 abstractC8774) {
        C16514 c16514 = (C16514) abstractC8774;
        C18279 c18279 = this.f44252;
        C16514 c16515 = (C16514) c18279.f58326.mo1921((AbstractC8774) c16514, (Object) null);
        C6656 c6656 = (C6656) this.f5675.f58326.mo1921((AbstractC8774) c16514.f53042, (Object) null);
        c6656.f22477 = null;
        c16515.f53042 = c6656;
        C5286 c5286 = c18279.f58327;
        c5286.m14629((InterfaceC12260) c16514.f53043);
        c16515.f53043 = c5286.m14617(0L, C21825.m48588());
        return C21825.of((Object) c16515);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13341(C18279 c18279) {
        super(c18279, EnumC18651.f60507);
        this.f44252 = c18279;
    }
}
