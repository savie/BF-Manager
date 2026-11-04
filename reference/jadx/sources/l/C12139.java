package l;

/* JADX INFO: renamed from: l.ۨۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12139 extends AbstractC0097 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f39040;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f39041;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12139(C22010 c22010, C12598 c12598, AbstractC22664 abstractC22664, C14769 c14769, C14769 c147610, EnumC20234 enumC20234) {
        super(abstractC22664, enumC20234, c12598, c14769, c147610, c22010.f71026.f49865);
        this.f39040 = c22010;
        if (abstractC22664.mo9328()) {
            this.f27563 = new C10510(abstractC22664.mo23449(), (abstractC22664.f73596.m29589() && abstractC22664.mo23449().mo9328()) ? C14769.m35543() : abstractC22664.f73596.f38067.mo15882(), abstractC22664.f73596, abstractC22664.m51069());
            this.f39041 = true;
        }
    }

    @Override // l.AbstractC8410
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11781 mo22607(C3168 c3168, EnumC20234 enumC20234) {
        AbstractC11781 abstractC11781M49770;
        boolean z = this.f39041;
        C22010 c22010 = this.f39040;
        if (z) {
            AbstractC22664 abstractC22664 = this.f27563;
            enumC20234.m46506();
            abstractC11781M49770 = c22010.m49745(c3168, abstractC22664, this.f27559, this.f27561, enumC20234.m46507());
        } else {
            AbstractC22664 abstractC22665 = this.f27563;
            enumC20234.m46506();
            abstractC11781M49770 = c22010.m49770(c3168, abstractC22665, this.f27560, this.f27559, this.f27561, enumC20234.m46507());
        }
        return c22010.m49788(c3168, this.f27563) ? new C17360(abstractC11781M49770, c22010) : abstractC11781M49770;
    }

    @Override // l.AbstractC0097
    /* JADX INFO: renamed from: ۙ */
    public final EnumC20803 mo1199(AbstractC11781 abstractC11781) {
        return this.f27563.mo23449().m51067(EnumC21172.NONE) ? EnumC20803.f66615 : EnumC20803.f66618;
    }
}
