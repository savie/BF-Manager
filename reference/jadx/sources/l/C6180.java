package l;

/* JADX INFO: renamed from: l.ۛܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6180 extends C4748 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6761 f21050;

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C0309 c0309, Object obj) {
        if (c0309 instanceof C23594) {
            c0309 = (C23594) c0309;
            C23800 c23800 = this.f21050.f22802;
            C19003 c19003 = new C19003();
            C19003 c19004 = new C19003();
            for (AbstractC16579 abstractC16579 : c0309.f1658) {
                if (abstractC16579.mo1942()) {
                    c19003.m43725(abstractC16579.f53222.f77449.mo1943());
                }
                c19004.m43723(abstractC16579.f53222.f77449);
            }
            C23594 c23594M52442 = c23800.m52442(c19004.m43726());
            c23594M52442.f1659 = c19003.m43726();
            AbstractC0618 abstractC0618 = c23594M52442.f53222;
            abstractC0618.f77447 |= 512;
            c23800.m52385(abstractC0618);
        }
        return c0309;
    }

    public C6180(C6761 c6761) {
        this.f21050 = c6761;
    }
}
