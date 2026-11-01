package l;

/* JADX INFO: renamed from: l.᩶ܰ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20207 extends AbstractC20912 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public EnumC15974 f65570;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0450 f65571;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20207(C0450 c0450, boolean z, C12926 c12926, C10391 c10391, boolean z2) {
        super(c0450.f2066, z, c12926, c10391);
        this.f65571 = c0450;
        this.f65570 = z2 ? EnumC15974.VARARG_MISMATCH : EnumC15974.ARG_MISMATCH;
    }

    @Override // l.AbstractC20912, l.InterfaceC18195
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2933(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, C10391 c10391) {
        C0450 c0450 = this.f65571;
        AbstractC16579 abstractC16579M44602 = c0450.f2067.m44602(abstractC16579);
        if (abstractC16579M44602.m39001(EnumC6617.UNDETVAR) && abstractC165710.mo9481()) {
            abstractC165710 = c0450.f2066.f65444.m52383(abstractC165710).f77449;
        }
        return super.mo2933(abstractC16579M44602, abstractC165710, c10391);
    }

    @Override // l.AbstractC20912, l.InterfaceC18195
    /* JADX INFO: renamed from: ۙ */
    public final void mo2545(InterfaceC12260 interfaceC12260, C11948 c11948) {
        this.f65571.m27068(interfaceC12260, this.f65570, this.f67949.f42956, c11948);
        throw null;
    }
}
