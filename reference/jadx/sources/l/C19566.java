package l;

/* JADX INFO: renamed from: l.᩵ܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C19566 extends AbstractC3877 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C21825 f62869;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C21825 f62870;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f62871;

    @Override // l.AbstractC3877, l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo9280(C10894 c10894, Object obj) {
        return m44664(c10894);
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C22929 c22929, Object obj) {
        C21825 c21825 = this.f62870;
        C21825 c21826 = this.f62869;
        while (c21825.m48595()) {
            if (!c22929.m39004((AbstractC16579) c21825.f70876)) {
                c21825 = c21825.f70877;
                c21826 = c21826.f70877;
            } else {
                return ((AbstractC16579) c21826.f70876).mo2035(c22929);
            }
        }
        return c22929;
    }

    @Override // l.AbstractC3877, l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ AbstractC16579 mo9280(C10894 c10894, Object obj) {
        return m44664(c10894);
    }

    @Override // l.AbstractC3877, l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC16579 mo1768(C0309 c0309, Void r5) {
        if (!c0309.mo12731()) {
            return super.mo1768(c0309, (Object) r5);
        }
        C23800 c23800 = this.f62871;
        AbstractC16579 abstractC16579M13122 = m13122(c23800.m52432(c0309));
        C21825 c21825M26295 = m26295(r5, c23800.m52439(c0309));
        return (abstractC16579M13122 == c23800.m52432(c0309) && c21825M26295 == c23800.m52439(c0309)) ? c0309 : c23800.m52442(c21825M26295.m48597(abstractC16579M13122));
    }

    @Override // l.AbstractC3877, l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC16579 mo4811(C0350 c0350, Void r3) {
        C0350 c0351 = (C0350) super.mo4811(c0350, (Object) r3);
        if (c0351 != c0350 && c0350.mo2036() && c0351.f1774.mo2036()) {
            c0351.f1774 = this.f62871.m52415(c0351.f1774);
        }
        return c0351;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10894 m44664(C10894 c10894) {
        C21825 c21825 = c10894.f37076;
        C21825 c21826 = this.f62869;
        boolean zM38997 = AbstractC16579.m38997(c21826, c21825);
        C23800 c23800 = this.f62871;
        if (zM38997) {
            C21825 c21825M52357 = c23800.m52357(c21825);
            c10894 = new C10894(c23800.m52371(c10894.f53121, c21825, c21825M52357), c21825M52357);
        }
        AbstractC16579 abstractC16579 = c10894.f53121;
        C21825 c21827 = c10894.f37076;
        C21825 c21825M52425 = c23800.m52425(c21827, this.f62870, c21826);
        AbstractC16579 abstractC16579M13122 = m13122(abstractC16579);
        if (c21825M52425 == c21827 && abstractC16579M13122 == abstractC16579) {
            return c10894;
        }
        if (c21825M52425 == c21827) {
            return new C18860(abstractC16579M13122, c21825M52425);
        }
        return new C8277(c23800.m52371(abstractC16579M13122, c21827, c21825M52425), c21825M52425);
    }

    public C19566(C23800 c23800, C21825 c21825, C21825 c21826) {
        this.f62871 = c23800;
        int iM48596 = c21825.m48596();
        int iM48597 = c21826.m48596();
        while (iM48596 > iM48597) {
            iM48596--;
            c21825 = c21825.f70877;
        }
        while (iM48596 < iM48597) {
            iM48597--;
            c21826 = c21826.f70877;
        }
        this.f62870 = c21825;
        this.f62869 = c21826;
    }
}
