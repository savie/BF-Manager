package l;

/* JADX INFO: renamed from: l.ۧܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29DP */
/* JADX INFO: loaded from: classes4.dex */
public final class C11043 extends AbstractC1869 {
    @Override // l.AbstractC1869, l.AbstractC16687
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6063(AbstractC7245 abstractC7245) {
        return (abstractC7245 instanceof C2597) && ((C1186) ((C2597) abstractC7245).m19360()).m4328() != 0;
    }

    @Override // l.AbstractC1869
    /* JADX INFO: renamed from: ۙ */
    public final void mo6062(C2597 c2597) throws C21317 {
        do {
            this.f53462.m39153(c2597);
            try {
                c2597 = c2597.mo8070();
            } catch (C17271 e) {
                throw new C21317("Missing compounded message data", e);
            }
        } while (c2597 != null);
    }
}
