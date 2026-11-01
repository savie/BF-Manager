package l;

/* JADX INFO: renamed from: l.ۤ֨۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9957 extends C0309 {

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0429 f34025;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f34026;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9957(C0429 c0429, AbstractC16579 abstractC16579, C21825 c21825, C22492 c22492) {
        super(c22492, abstractC16579, c21825);
        this.f34025 = c0429;
        this.f34026 = false;
    }

    @Override // l.C0309, l.AbstractC16579
    /* JADX INFO: renamed from: ۛ */
    public final AbstractC16579 mo1934() {
        C23800 c23800 = this.f34025.f1976;
        if (!this.f34026) {
            this.f34026 = true;
            this.f53222.m52718();
            AbstractC16579 abstractC16579Mo1934 = this.f53222.f77449.mo1934();
            C14422 c14422 = AbstractC16579.f53219;
            if (abstractC16579Mo1934 != c14422) {
                C21825 c21825Mo1943 = super.mo1934().mo1943();
                C21825 c21825Mo1944 = abstractC16579Mo1934.mo1943();
                if (c21825Mo1944.m48596() != c21825Mo1943.m48596()) {
                    super.mo1927(c23800.m52402(abstractC16579Mo1934));
                } else {
                    super.mo1927(c23800.m52371(abstractC16579Mo1934, c21825Mo1944, c21825Mo1943));
                }
            } else {
                super.mo1927(c14422);
            }
        }
        return super.mo1934();
    }

    @Override // l.C0309
    /* JADX INFO: renamed from: ۖ */
    public final void mo1927(AbstractC16579 abstractC16579) {
        throw new UnsupportedOperationException();
    }
}
