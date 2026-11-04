package l;

import bin.mt.plus.Features;

/* JADX INFO: renamed from: l.ۜۤ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 713E */
/* JADX INFO: loaded from: classes3.dex */
public final class C7078 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f23322;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f23323;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f23324;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f23325;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f23326;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f23327;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f23328;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f23329;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f23330;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f23331;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f23332;

    public C7078(AbstractC22044 abstractC22044, String str) {
        this.f23323 = abstractC22044;
        this.f23324 = str;
        this.f23331 = abstractC22044.mo4281();
        this.f23322 = abstractC22044.mo4285();
        this.f23326 = abstractC22044.mo4286();
        this.f23329 = abstractC22044.m49860();
        this.f23328 = abstractC22044.mo2954();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19414() {
        AbstractC22044 abstractC22044 = this.f23323;
        try {
            if (abstractC22044.mo19981()) {
                C21694 c21694M19978 = abstractC22044.mo19983().m19978();
                this.f23327 = c21694M19978.m49237();
                this.f23332 = Features.m45(c21694M19978.m49242());
                this.f23330 = Features.m45(c21694M19978.m49233());
                this.f23325 = true;
                return;
            }
            if (abstractC22044 instanceof C0678) {
                C18577 c18577M2947 = ((C0678) abstractC22044).m2947();
                this.f23327 = c18577M2947.m43155();
                this.f23332 = Features.m45(c18577M2947.m43154());
                this.f23330 = Features.m45(c18577M2947.m43152());
                this.f23325 = true;
                return;
            }
            if (abstractC22044.mo49854()) {
                return;
            }
            C21694 c21694M34906 = C14453.m34906(abstractC22044.mo4294());
            this.f23327 = c21694M34906.m49237();
            this.f23332 = Features.m45(c21694M34906.m49242());
            this.f23330 = Features.m45(c21694M34906.m49233());
            this.f23325 = true;
        } catch (Exception unused) {
        }
    }
}
