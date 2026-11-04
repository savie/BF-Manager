package l;

/* JADX INFO: renamed from: l.᩷֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes.dex */
public final class C21726 extends AbstractC13630 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10537 f69325;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public EnumC4572 f69326;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21726(C10537 c10537, boolean z, C4192 c4192, C1083 c1083, boolean z2) {
        super(c10537.f33514, z, c4192, c1083);
        this.f69325 = c10537;
        this.f69326 = z2 ? EnumC4572.VARARG_MISMATCH : EnumC4572.ARG_MISMATCH;
    }

    @Override // l.AbstractC13630, l.InterfaceC1013
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3911(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, C1083 c1083) {
        C10537 c10537 = this.f69325;
        AbstractC22664 abstractC22664M8710 = c10537.f33513.m8710(abstractC22664);
        if (abstractC22664M8710.m51067(EnumC21172.UNDETVAR) && abstractC22665.mo40452()) {
            abstractC22665 = c10537.f33514.f71021.m55108(abstractC22665).f38067;
        }
        return super.mo3911(abstractC22664M8710, abstractC22665, c1083);
    }

    @Override // l.AbstractC13630, l.InterfaceC1013
    /* JADX INFO: renamed from: ۙ */
    public final void mo3910(InterfaceC5075 interfaceC5075, C17007 c17007) {
        this.f69325.m16158(interfaceC5075, this.f69326, this.f43279.f15335, c17007);
        throw null;
    }
}
