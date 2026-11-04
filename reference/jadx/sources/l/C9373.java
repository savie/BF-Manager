package l;

/* JADX INFO: renamed from: l.ۡ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9373 extends AbstractC5428 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f30447;

    public final String toString() {
        return "resolveMethodCheck";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m24686(final C3168 c3168, final AbstractC22664 abstractC22664, C2596 c2596) {
        if (abstractC22664.m51073(c2596.f8340)) {
            c2596.m8700(C14769.of((Object) abstractC22664), new InterfaceC10382() { // from class: l.ۢ۫ۘ
                @Override // l.InterfaceC10382
                /* JADX INFO: renamed from: ۙ */
                public final void mo2127(C2596 c2597) {
                    this.f32390.m24686(c3168, c2597.m8696(abstractC22664), c2597);
                }
            });
            return;
        }
        C22010 c22010 = this.f30447;
        if (c22010.m49790(c3168, c22010.f71021.m55132(abstractC22664), false)) {
            return;
        }
        C24550 c24550 = c3168.f10279.f26345;
        m16158(c3168.f10273, EnumC4572.INACCESSIBLE_VARARGS, c2596, abstractC22664, C10925.m27726(c24550), c24550);
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9373(C22010 c22010) {
        super(c22010);
        this.f30447 = c22010;
    }

    @Override // l.AbstractC5428, l.InterfaceC6919
    /* JADX INFO: renamed from: ۙ */
    public final void mo16157(C3168 c3168, C4192 c4192, C14769 c14769, C14769 c147610, C1083 c1083) {
        super.mo16157(c3168, c4192, c14769, c147610, c1083);
        if (c4192.f15333.m46507()) {
            EnumC16124 enumC16124 = c4192.f15331;
            EnumC16124 enumC16125 = EnumC16124.CHECK;
            C22010 c22010 = this.f30447;
            if (enumC16124 == enumC16125 || !c22010.f71037) {
                m24686(c3168, c22010.f71021.m55120((AbstractC22664) c147610.last()), c4192.f15335);
            }
        }
    }

    @Override // l.AbstractC5428
    /* JADX INFO: renamed from: ۙ */
    public final void mo16159(InterfaceC5075 interfaceC5075, boolean z, AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, C4192 c4192, C1083 c1083) {
        new C12029(this.f30447, abstractC22665, new C1171(this, !c4192.f15333.m46506(), c4192, c1083, z)).mo30220(interfaceC5075, abstractC22664);
    }

    @Override // l.AbstractC5428, l.InterfaceC6919
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6919 mo16156(C14769 c14769) {
        return new C14266(this.f30447, c14769);
    }
}
