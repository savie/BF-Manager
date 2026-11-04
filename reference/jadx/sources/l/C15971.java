package l;

/* JADX INFO: renamed from: l.ܶ۠᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15971 extends C23431 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f51848;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0310 f51849;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC22295 f51850;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15971(C0310 c0310, AbstractC22295 abstractC22295, InterfaceC1013 interfaceC1013) {
        super(c0310, interfaceC1013);
        this.f51849 = c0310;
        this.f51850 = abstractC22295;
    }

    @Override // l.C23431, l.C13690, l.InterfaceC1013
    /* JADX INFO: renamed from: ۙ */
    public final void mo3910(InterfaceC5075 interfaceC5075, C17007 c17007) {
        if (this.f51848) {
            this.f43432.mo3910(interfaceC5075, this.f51849.f1704.m45975(C19859.f63818));
        } else {
            super.mo3910(interfaceC5075, c17007);
        }
    }

    @Override // l.C23431, l.C13690, l.InterfaceC1013
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3911(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, C1083 c1083) {
        if (abstractC22665.m51067(EnumC21172.VOID)) {
            this.f51848 = true;
            return C11239.m28336(this.f51850);
        }
        return super.mo3911(abstractC22664, abstractC22665, c1083);
    }
}
