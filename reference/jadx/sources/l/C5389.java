package l;

/* JADX INFO: renamed from: l.ۚܰ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5389 extends AbstractC22967 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f18615;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f18616;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5389(C20145 c20145, C6966 c6966, AbstractC16579 abstractC16579, C21825 c21825, C21825 c21826, EnumC11678 enumC11678) {
        super(abstractC16579, enumC11678, c6966, c21825, c21826, c20145.f65436.f77632);
        this.f18616 = c20145;
        if (abstractC16579.mo1936()) {
            this.f35427 = new C0309(abstractC16579.mo1934(), (abstractC16579.f53222.m52725() && abstractC16579.mo1934().mo1936()) ? C21825.m48588() : abstractC16579.f53222.f77449.mo1938(), abstractC16579.f53222, abstractC16579.m39010());
            this.f18615 = true;
        }
    }

    @Override // l.AbstractC10329
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC23903 mo5434(C4603 c4603, EnumC11678 enumC11678) {
        AbstractC23903 abstractC23903M45538;
        boolean z = this.f18615;
        C20145 c20145 = this.f18616;
        if (z) {
            AbstractC16579 abstractC16579 = this.f35427;
            enumC11678.m29178();
            abstractC23903M45538 = c20145.m45507(c4603, abstractC16579, this.f35428, this.f35429, enumC11678.m29179());
        } else {
            AbstractC16579 abstractC165710 = this.f35427;
            enumC11678.m29178();
            abstractC23903M45538 = c20145.m45538(c4603, abstractC165710, this.f35430, this.f35428, this.f35429, enumC11678.m29179());
        }
        return c20145.m45552(c4603, this.f35427) ? new C3003(abstractC23903M45538, c20145) : abstractC23903M45538;
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ۙ */
    public final EnumC4143 mo5433(AbstractC23903 abstractC23903) {
        return this.f35427.mo1934().m39001(EnumC6617.NONE) ? EnumC4143.f15158 : EnumC4143.f15157;
    }
}
