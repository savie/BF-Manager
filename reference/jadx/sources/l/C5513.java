package l;

/* JADX INFO: renamed from: l.ۚᩳ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: K434 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5513 extends AbstractC6323 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C10143 f18925;

    public C5513(C22447 c22447) {
        super(c22447);
        this.f18925 = new C10143();
    }

    @Override // l.InterfaceC4518
    /* JADX INFO: renamed from: ۙ */
    public final void mo6627(AbstractC8774 abstractC8774, int i) {
        int i2 = this.f21357;
        if (i2 > i) {
            i = i2;
        }
        this.f18925.m25783(i, abstractC8774);
    }

    @Override // l.AbstractC6323
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC8774 mo6629(AbstractC8774 abstractC8774) {
        mo6627(abstractC8774, this.f21358.f73269.f65850);
        return abstractC8774;
    }

    @Override // l.AbstractC6323
    /* JADX INFO: renamed from: ۨ */
    public final AbstractC8774 mo6628(AbstractC8774 abstractC8774) {
        mo6627(abstractC8774, this.f21358.f73262.m48501().f65850);
        return abstractC8774;
    }

    @Override // l.InterfaceC4518
    /* JADX INFO: renamed from: ۙ */
    public final int mo6625(AbstractC8774 abstractC8774) {
        int iM25782 = this.f18925.m25782(abstractC8774);
        if (iM25782 == -1) {
            return -1;
        }
        return iM25782;
    }

    @Override // l.InterfaceC4518
    /* JADX INFO: renamed from: ۙ */
    public final int mo6626(AbstractC8774 abstractC8774, AbstractC8774 abstractC8775) {
        int iM25784 = this.f18925.m25784(abstractC8774);
        if (iM25784 == -1) {
            return -1;
        }
        mo6627(abstractC8775, iM25784);
        return iM25784;
    }
}
