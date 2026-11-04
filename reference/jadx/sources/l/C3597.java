package l;

/* JADX INFO: renamed from: l.ۗᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 92WK */
/* JADX INFO: loaded from: classes3.dex */
public final class C3597 extends AbstractC9980 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f12296 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12546 f12297;

    public C3597(AbstractC12546 abstractC12546) {
        this.f12297 = abstractC12546;
    }

    @Override // l.AbstractC9980
    public final void onScrollStateChanged(C25227 c25227, int i) {
        super.onScrollStateChanged(c25227, i);
        if (i == 0 && this.f12296) {
            this.f12296 = false;
            this.f12297.snapToTargetExistingView();
        }
    }

    @Override // l.AbstractC9980
    public final void onScrolled(C25227 c25227, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f12296 = true;
    }
}
