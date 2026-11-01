package l;

/* JADX INFO: renamed from: l.ۖ۫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public class C2527 extends C22220 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6761 f10027;

    public C2527(C6761 c6761) {
        this.f10027 = c6761;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m7900(AbstractC8774 abstractC8774) {
        if (abstractC8774.f30190 == null) {
            if (abstractC8774.m22847(EnumC18651.f60478)) {
                abstractC8774.f30190 = m7901((C23195) abstractC8774);
            } else {
                abstractC8774.f30190 = this.f10027.f22806.f14247;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C13757 m7901(C23195 c23195) {
        AbstractC5930 abstractC5930;
        C3836 c3836 = this.f10027.f22806;
        AbstractC16579 abstractC16579 = c3836.f14247;
        if (c23195 != null && (abstractC5930 = c23195.f75266) != null && abstractC5930.m22847(EnumC18651.f60544) && ((C12611) c23195.f75266).f42127 == EnumC6617.VOID) {
            abstractC16579 = c3836.f14293;
        }
        return new C13757(C21825.m48588(), abstractC16579, C21825.m48588(), c3836.f14240);
    }

    @Override // l.C22220
    /* JADX INFO: renamed from: ܰ */
    public void mo7248(AbstractC8774 abstractC8774) {
        if (abstractC8774 == null) {
            return;
        }
        if (abstractC8774 instanceof AbstractC5930) {
            m7900(abstractC8774);
        }
        abstractC8774.mo1802(this);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1262(C3107 c3107) {
        if (c3107.f11716 == null) {
            c3107.f11716 = this.f10027.f22806.f14285;
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1268(C23570 c23570) {
        if (c23570.f76355 == null) {
            c23570.f76355 = this.f10027.f22806.f14285;
        }
        mo7248(c23570.f76357);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo1065(C8753 c8753) {
        m7900(c8753);
        if (c8753.f30086 == null) {
            c8753.f30086 = new C22492(0L, c8753.f30093, c8753.f30190, this.f10027.f22806.f14243);
        }
        super.mo1065(c8753);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3961(C23195 c23195) {
        m7900(c23195);
        if (c23195.f75263 == null) {
            c23195.f75263 = new C18258(0L, c23195.f75272, c23195.f30190, this.f10027.f22806.f14243);
        }
        super.mo3961(c23195);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3928(C6656 c6656) {
        m7900(c6656);
        C6263 c6263 = c6656.f22475;
        C6761 c6761 = this.f10027;
        if (c6263 == null) {
            C6263 c6264 = new C6263(0L, c6656.f22478, c6656.f30190, c6761.f22806.f14243);
            c6656.f22475 = c6264;
            c6264.f21228 = 0;
        }
        if (c6656.f22477 == null) {
            C5286 c5286 = c6761.f22794;
            c5286.f18294 = -1;
            c6656.f22477 = c5286.m14644();
        }
        super.mo3928(c6656);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3945(C15103 c15103) {
        m7900(c15103);
        m7900(c15103.f49323);
        C6656 c6656 = c15103.f49323;
        if (c6656.f22475 == null) {
            c6656.f22475 = new C5558(0L, c6656.f22478, c6656.f30190, this.f10027.f22806.f14243);
            c15103.f49323.f22475.f21228 = 0;
        }
        mo7248(c15103.f49323);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3932(C8378 c8378) {
        C6761 c6761 = this.f10027;
        C3836 c3836 = c6761.f22806;
        if (c8378.f29097 == null) {
            c8378.f29097 = new C18258(0L, c6761.f22815.f77632, m7901((C23195) null), c3836.f14243);
        }
        if (c8378.f29100 == null) {
            c8378.f29100 = c3836.f14247;
        }
        super.mo3932(c8378);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3927(C6635 c6635) {
        if (c6635.f35957 == null) {
            C6761 c6761 = this.f10027;
            c6635.f35957 = new C10498(c6761.f22815.f77594, m7901((C23195) null), -1, c6761.f22806.f14243);
        }
        super.mo3927(c6635);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1267(C22864 c22864) {
        if (c22864.f35957 == null) {
            C6761 c6761 = this.f10027;
            c22864.f35957 = new C10498(c6761.f22815.f77594, m7901((C23195) null), -1, c6761.f22806.f14243);
        }
        super.mo1267(c22864);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1265(C13007 c13007) {
        if (c13007.f35957 == null) {
            C6761 c6761 = this.f10027;
            c13007.f35957 = new C10498(c6761.f22815.f77594, m7901((C23195) null), -1, c6761.f22806.f14243);
        }
        mo7248(c13007.f43378);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3929(C6966 c6966) {
        super.mo3929(c6966);
        if (c6966.f23412 == null) {
            C6761 c6761 = this.f10027;
            c6966.f23412 = new C18258(0L, c6761.f22815.f77594, m7901((C23195) null), c6761.f22806.f14243);
        }
    }
}
