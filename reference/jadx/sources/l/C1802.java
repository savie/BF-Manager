package l;

/* JADX INFO: renamed from: l.֫۠᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1802 extends C23475 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0310 f6148;

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C10510 c10510, Object obj) {
        if (c10510 instanceof C1562) {
            c10510 = (C1562) c10510;
            C24705 c24705 = this.f6148.f1670;
            C18499 c18499 = new C18499();
            C18499 c184910 = new C18499();
            for (AbstractC22664 abstractC22664 : c10510.f33437) {
                if (abstractC22664.mo9330()) {
                    c18499.m43090(abstractC22664.f73596.f38067.mo9323());
                }
                c184910.m43089(abstractC22664.f73596.f38067);
            }
            C1562 c1562M55138 = c24705.m55138(c184910.m43093());
            c1562M55138.f33441 = c18499.m43093();
            AbstractC22970 abstractC22970 = c1562M55138.f73596;
            abstractC22970.f38071 |= 512;
            c24705.m55092(abstractC22970);
        }
        return c10510;
    }

    public C1802(C0310 c0310) {
        this.f6148 = c0310;
    }
}
