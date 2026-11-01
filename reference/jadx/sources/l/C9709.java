package l;

/* JADX INFO: renamed from: l.ۢܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9709 extends C3357 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC5930 f32700;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6761 f32701;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f32702;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9709(C6761 c6761, AbstractC5930 abstractC5930, InterfaceC18195 interfaceC18195) {
        super(c6761, interfaceC18195);
        this.f32701 = c6761;
        this.f32700 = abstractC5930;
    }

    @Override // l.C3357, l.C10435, l.InterfaceC18195
    /* JADX INFO: renamed from: ۙ */
    public final void mo2545(InterfaceC12260 interfaceC12260, C11948 c11948) {
        if (this.f32702) {
            this.f35634.mo2545(interfaceC12260, this.f32701.f22831.m51910(C14707.f48089));
        } else {
            super.mo2545(interfaceC12260, c11948);
        }
    }

    @Override // l.C3357, l.C10435, l.InterfaceC18195
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2933(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, C10391 c10391) {
        if (abstractC165710.m39001(EnumC6617.VOID)) {
            this.f32702 = true;
            return C3128.m9449(this.f32700);
        }
        return super.mo2933(abstractC16579, abstractC165710, c10391);
    }
}
