package l;

/* JADX INFO: renamed from: l.֫ܿܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 92WK */
/* JADX INFO: loaded from: classes2.dex */
public final class C1969 extends AbstractC6909 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f7401 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3380 f7402;

    public C1969(AbstractC3380 abstractC3380) {
        this.f7402 = abstractC3380;
    }

    @Override // l.AbstractC6909
    public final void onScrollStateChanged(C17492 c17492, int i) {
        super.onScrollStateChanged(c17492, i);
        if (i == 0 && this.f7401) {
            this.f7401 = false;
            this.f7402.snapToTargetExistingView();
        }
    }

    @Override // l.AbstractC6909
    public final void onScrolled(C17492 c17492, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f7401 = true;
    }
}
