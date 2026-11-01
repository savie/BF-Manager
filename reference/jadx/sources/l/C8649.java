package l;

/* JADX INFO: renamed from: l.ۡۙ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8649 extends AbstractC10766 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f29827;

    public final String toString() {
        return "resolveMethodCheck";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m22451(final C4603 c4603, final AbstractC16579 abstractC16579, C19524 c19524) {
        if (abstractC16579.m39005(c19524.f62771)) {
            c19524.m44595(C21825.of((Object) abstractC16579), new InterfaceC18383() { // from class: l.۠ۙ۟
                @Override // l.InterfaceC18383
                /* JADX INFO: renamed from: ۙ */
                public final void mo969(C19524 c19525) {
                    this.f26106.m22451(c4603, c19525.m44587(abstractC16579), c19525);
                }
            });
            return;
        }
        C20145 c20145 = this.f29827;
        if (c20145.m45554(c4603, c20145.f65444.m52402(abstractC16579), false)) {
            return;
        }
        C22492 c22492 = c4603.f16301.f30086;
        m27068(c4603.f16296, EnumC15974.INACCESSIBLE_VARARGS, c19524, abstractC16579, C16121.m38160(c22492), c22492);
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8649(C20145 c20145) {
        super(c20145);
        this.f29827 = c20145;
    }

    @Override // l.AbstractC10766, l.InterfaceC7506
    /* JADX INFO: renamed from: ۙ */
    public final void mo20004(C4603 c4603, C12926 c12926, C21825 c21825, C21825 c21826, C10391 c10391) {
        super.mo20004(c4603, c12926, c21825, c21826, c10391);
        if (c12926.f42957.m29179()) {
            EnumC9729 enumC9729 = c12926.f42954;
            EnumC9729 enumC97210 = EnumC9729.CHECK;
            C20145 c20145 = this.f29827;
            if (enumC9729 == enumC97210 || !c20145.f65445) {
                m22451(c4603, c20145.f65444.m52416((AbstractC16579) c21826.last()), c12926.f42956);
            }
        }
    }

    @Override // l.AbstractC10766
    /* JADX INFO: renamed from: ۙ */
    public final void mo2276(InterfaceC12260 interfaceC12260, boolean z, AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, C12926 c12926, C10391 c10391) {
        new C2504(this.f29827, abstractC165710, new C19232(this, !c12926.f42957.m29178(), c12926, c10391, z)).mo4137(interfaceC12260, abstractC16579);
    }

    @Override // l.AbstractC10766, l.InterfaceC7506
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7506 mo2275(C21825 c21825) {
        return new C13089(this.f29827, c21825);
    }
}
