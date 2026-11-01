package l;

/* JADX INFO: renamed from: l.ۙۛۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes3.dex */
public final class C4458 extends C15749 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16579 f15865;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11515 f15866;

    public C4458(C11515 c11515, AbstractC16579 abstractC16579) {
        this.f15866 = c11515;
        this.f15865 = abstractC16579;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3294(C11200 c11200) {
        AbstractC5930 abstractC5930 = c11200.f37914;
        if (abstractC5930 != null) {
            C11515 c11515 = this.f15866;
            AbstractC16579 abstractC16579 = c11515.f38709;
            try {
                c11515.f38709 = this.f15865;
                c11515.mo7248(abstractC5930);
            } finally {
                c11515.f38709 = abstractC16579;
            }
        }
    }
}
