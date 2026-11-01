package l;

/* JADX INFO: renamed from: l.᩶۟ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C20024 extends AbstractC6160 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f64127;

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(Object obj, AbstractC16579 abstractC16579) {
        return AbstractC16579.f53219;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C0309 c0309, Object obj) {
        if (c0309.f1654 == null) {
            AbstractC16579 abstractC16579Mo49995 = ((C22492) c0309.f53222).mo49995();
            if (c0309.mo16236()) {
                abstractC16579Mo49995 = ((C0309) c0309.f53222.f77449).f1654;
            }
            if (c0309.f1654 == null) {
                C23800 c23800 = this.f64127;
                C21825 c21825Mo1943 = c23800.m52359(c0309).mo1943();
                C21825 c21825Mo1944 = c0309.f53222.f77449.mo1943();
                if (c0309.mo30563()) {
                    c0309.f1654 = c23800.m52444(abstractC16579Mo49995);
                } else if (c21825Mo1944.m48595()) {
                    c0309.f1654 = c23800.m52371(abstractC16579Mo49995, c21825Mo1944, c21825Mo1943);
                } else {
                    c0309.f1654 = abstractC16579Mo49995;
                }
            }
        }
        return c0309.f1654;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4812(C5954 c5954, Object obj) {
        return AbstractC16579.f53219;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6580(C8777 c8777, Object obj) {
        boolean zMo9481 = c8777.f30194.mo9481();
        C23800 c23800 = this.f64127;
        if (zMo9481 || c23800.m52399(c8777.f30194, c23800.f76937.f14275)) {
            return c23800.m52349();
        }
        return new C8777(c23800.m52432(c8777.f30194), c8777.f53222);
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C22929 c22929, Object obj) {
        if (c22929.mo18112().m39001(EnumC6617.TYPEVAR) || (!c22929.mo18112().mo12731() && !c22929.mo18112().mo16236())) {
            return c22929.mo18112();
        }
        return this.f64127.m52432(c22929.mo18112());
    }

    public C20024(C23800 c23800) {
        this.f64127 = c23800;
    }
}
