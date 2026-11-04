package l;

/* JADX INFO: renamed from: l.ۤᩳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final class C11057 extends AbstractC1584 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24705 f34885;

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1766(Object obj, AbstractC22664 abstractC22664) {
        return AbstractC22664.f73590;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(C2832 c2832, Object obj) {
        boolean zMo40452 = c2832.f9333.mo40452();
        C24705 c24705 = this.f34885;
        if (zMo40452 || c24705.m55149(c2832.f9333, c24705.f79947.f48286)) {
            return c24705.m55081();
        }
        return new C2832(c24705.m55137(c2832.f9333), c2832.f73596);
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C10510 c10510, Object obj) {
        if (c10510.f33442 == null) {
            AbstractC22664 abstractC22664Mo12339 = ((C24550) c10510.f73596).mo12339();
            if (c10510.mo31586()) {
                abstractC22664Mo12339 = ((C10510) c10510.f73596.f38067).f33442;
            }
            if (c10510.f33442 == null) {
                C24705 c24705 = this.f34885;
                C14769 c14769Mo9323 = c24705.m55168(c10510).mo9323();
                C14769 c14769Mo9324 = c10510.f73596.f38067.mo9323();
                if (c10510.mo45003()) {
                    c10510.f33442 = c24705.m55173(abstractC22664Mo12339);
                } else if (c14769Mo9324.m35550()) {
                    c10510.f33442 = c24705.m55103(abstractC22664Mo12339, c14769Mo9324, c14769Mo9323);
                } else {
                    c10510.f33442 = abstractC22664Mo12339;
                }
            }
        }
        return c10510.f33442;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10772(C12748 c12748, Object obj) {
        return AbstractC22664.f73590;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1771(C17969 c17969, Object obj) {
        if (c17969.mo19992().m51067(EnumC21172.TYPEVAR) || (!c17969.mo19992().mo18914() && !c17969.mo19992().mo31586())) {
            return c17969.mo19992();
        }
        return this.f34885.m55137(c17969.mo19992());
    }

    public C11057(C24705 c24705) {
        this.f34885 = c24705;
    }
}
