package l;

/* JADX INFO: renamed from: l.ۘ᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes3.dex */
public final class C4167 extends AbstractC23219 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18279 f15209;

    @Override // l.AbstractC23219
    /* JADX INFO: renamed from: ۙ */
    public final void mo8403(AbstractC8774 abstractC8774, AbstractC8774 abstractC8775, boolean z) {
        C15434 c15434 = (C15434) abstractC8774;
        if (z) {
            return;
        }
        this.f15209.f58321.m48204(c15434, C9768.f32855);
    }

    @Override // l.AbstractC23219
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8404(AbstractC8774 abstractC8774) {
        C21825 c21825 = ((C15434) abstractC8774).f50297;
        return c21825 != null && c21825.m48595();
    }

    @Override // l.AbstractC23219
    /* JADX INFO: renamed from: ܰ */
    public final C21825 mo8405(AbstractC8774 abstractC8774) {
        C15434 c15434 = (C15434) this.f15209.f58326.mo1921(abstractC8774, (Object) null);
        c15434.f50297 = C21825.m48588();
        return C21825.of((Object) c15434);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4167(C18279 c18279) {
        super(c18279, EnumC14047.METHOD, EnumC18651.f60539);
        this.f15209 = c18279;
    }
}
