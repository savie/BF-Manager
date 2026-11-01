package l;

/* JADX INFO: renamed from: l.ۘۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3877 extends C10394 {
    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public AbstractC16579 mo1768(C0309 c0309, Object obj) {
        AbstractC16579 abstractC16579Mo1934 = c0309.mo1934();
        AbstractC16579 abstractC16579 = (AbstractC16579) abstractC16579Mo1934.mo1928(this, obj);
        C21825 c21825Mo1938 = c0309.mo1938();
        C21825 c21825M26295 = m26295(obj, c21825Mo1938);
        return (abstractC16579 == abstractC16579Mo1934 && c21825M26295 == c21825Mo1938) ? c0309 : new C5289(abstractC16579, c21825M26295, c0309.f53222, c0309.f53221);
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public AbstractC16579 mo4811(C0350 c0350, Object obj) {
        AbstractC16579 abstractC16579 = c0350.f1774;
        if (abstractC16579 != null) {
            abstractC16579 = (AbstractC16579) m20360(obj, abstractC16579);
        }
        AbstractC16579 abstractC165710 = abstractC16579;
        return abstractC165710 == c0350.f1774 ? c0350 : new C22223(abstractC165710, c0350.f1776, c0350.f53222, c0350.f1775, c0350.f53221);
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public C8777 mo6580(C8777 c8777, Object obj) {
        AbstractC16579 abstractC16579 = c8777.f30194;
        AbstractC16579 abstractC165710 = (AbstractC16579) abstractC16579.mo1928(this, obj);
        return abstractC165710 == abstractC16579 ? c8777 : new C1055(abstractC165710, c8777.f53222, c8777.f53221);
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public C13757 mo6581(C13757 c13757, Object obj) {
        C21825 c21825 = c13757.f45367;
        AbstractC16579 abstractC16579 = c13757.f45368;
        C21825 c21826 = c13757.f45366;
        C21825 c21825M26295 = m26295(obj, c21825);
        AbstractC16579 abstractC165710 = (AbstractC16579) abstractC16579.mo1928(this, obj);
        C21825 c21825M26296 = m26295(obj, c21826);
        return (c21825M26295 == c21825 && abstractC165710 == abstractC16579 && c21825M26296 == c21826) ? c13757 : new C13051(c21825M26295, abstractC165710, c21825M26296, c13757.f53222);
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public AbstractC16579 mo9280(C10894 c10894, Object obj) {
        return (AbstractC16579) c10894.f53121.mo1928(this, obj);
    }
}
