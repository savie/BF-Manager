package l;

/* JADX INFO: renamed from: l.ܶ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K434 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16415 extends AbstractC11194 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9966 f53263;

    public C16415(C23875 c23875) {
        super(c23875);
        this.f53263 = new C9966();
    }

    @Override // l.InterfaceC1960
    /* JADX INFO: renamed from: ۙ */
    public final void mo6745(AbstractC8036 abstractC8036, int i) {
        int i2 = this.f35322;
        if (i2 > i) {
            i = i2;
        }
        this.f53263.m25801(i, abstractC8036);
    }

    @Override // l.AbstractC11194
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC8036 mo28235(AbstractC8036 abstractC8036) {
        mo6745(abstractC8036, this.f35323.f77298.f29213);
        return abstractC8036;
    }

    @Override // l.AbstractC11194
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC8036 mo28234(AbstractC8036 abstractC8036) {
        mo6745(abstractC8036, this.f35323.f77288.m35906().f29213);
        return abstractC8036;
    }

    @Override // l.InterfaceC1960
    /* JADX INFO: renamed from: ۙ */
    public final int mo6743(AbstractC8036 abstractC8036) {
        int iM25800 = this.f53263.m25800(abstractC8036);
        if (iM25800 == -1) {
            return -1;
        }
        return iM25800;
    }

    @Override // l.InterfaceC1960
    /* JADX INFO: renamed from: ۙ */
    public final int mo6744(AbstractC8036 abstractC8036, AbstractC8036 abstractC8037) {
        int iM25802 = this.f53263.m25802(abstractC8036);
        if (iM25802 == -1) {
            return -1;
        }
        mo6745(abstractC8037, iM25802);
        return iM25802;
    }
}
