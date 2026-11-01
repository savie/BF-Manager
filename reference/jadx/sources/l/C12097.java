package l;

/* JADX INFO: renamed from: l.۫֫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8459 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12097 extends C22220 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f40463;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC23903 f40464;

    @Override // l.C22220
    /* JADX INFO: renamed from: ܰ */
    public final void mo7248(AbstractC8774 abstractC8774) {
        if (abstractC8774 == null || this.f40464 == null) {
            return;
        }
        abstractC8774.mo1802(this);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3927(C6635 c6635) {
        if (C3128.m9471(c6635.f22412) == this.f40464) {
            this.f40463 = true;
        } else {
            super.mo3927(c6635);
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1265(C13007 c13007) {
        if (C3128.m9471(c13007.f43378) != this.f40464) {
            mo7248(c13007.f43378);
        } else {
            this.f40463 = true;
        }
    }
}
