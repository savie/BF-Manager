package l;

/* JADX INFO: renamed from: l.ۤ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10726 implements InterfaceC20449 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25227 f34063;

    public C10726(C25227 c25227) {
        this.f34063 = c25227;
    }

    @Override // l.InterfaceC20449
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo27314(float f) {
        int i;
        int i2;
        C25227 c25227 = this.f34063;
        if (c25227.mLayout.canScrollVertically()) {
            i2 = (int) f;
            i = 0;
        } else {
            i = c25227.mLayout.canScrollHorizontally() ? (int) f : 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        c25227.stopScroll();
        return c25227.flingNoThresholdCheck(i, i2);
    }

    @Override // l.InterfaceC20449
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo27315() {
        this.f34063.stopScroll();
    }

    @Override // l.InterfaceC20449
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float mo27313() {
        float f;
        C25227 c25227 = this.f34063;
        if (c25227.mLayout.canScrollVertically()) {
            f = c25227.mScaledVerticalScrollFactor;
        } else {
            if (!c25227.mLayout.canScrollHorizontally()) {
                return 0.0f;
            }
            f = c25227.mScaledHorizontalScrollFactor;
        }
        return -f;
    }
}
