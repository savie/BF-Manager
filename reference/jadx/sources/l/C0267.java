package l;

/* JADX INFO: renamed from: l.֡۟ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C0267 extends AbstractC6160 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f1553;

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo1767(Object obj, AbstractC16579 abstractC16579) {
        return C21825.m48588();
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo1768(C0309 c0309, Object obj) {
        if (c0309.f1658 == null) {
            C21825 c21825M50007 = ((C22492) c0309.f53222).m50007();
            if (c0309.f1658 == null) {
                C6171.m17173(c0309, c0309 != c0309.f53222.f77449);
                C21825 c21825Mo1943 = c0309.mo1943();
                C21825 c21825Mo1944 = c0309.f53222.f77449.mo1943();
                boolean zMo30563 = c0309.mo30563();
                C23800 c23800 = this.f1553;
                if (zMo30563) {
                    c0309.f1658 = c23800.m52411(c21825M50007);
                } else if (c21825Mo1944.m48595()) {
                    c0309.f1658 = c23800.m52380(c21825M50007, c21825Mo1944, c21825Mo1943);
                } else {
                    c0309.f1658 = c21825M50007;
                }
            }
        }
        return c0309.f1658;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo1769(C22929 c22929, Object obj) {
        if (c22929.mo18112().mo12731()) {
            return this.f1553.m52439(c22929.mo18112());
        }
        if (c22929.mo18112().mo16236()) {
            return C21825.of((Object) c22929.mo18112());
        }
        return C21825.m48588();
    }

    public C0267(C23800 c23800) {
        this.f1553 = c23800;
    }
}
