package l;

/* JADX INFO: renamed from: l.᩷ܺܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5JQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20980 extends AbstractC12410 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC0414 f68326;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17492 f68327;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f68328;

    public C20980(AbstractC0414 abstractC0414, C17492 c17492, String str) {
        this.f68326 = abstractC0414;
        this.f68327 = c17492;
        this.f68328 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47149() {
        AbstractC0414 abstractC0414 = this.f68326;
        abstractC0414.unregisterAdapterDataObserver(this);
        int iMo45772 = ((InterfaceC20275) abstractC0414).mo45772(this.f68328);
        if (iMo45772 != -1) {
            this.f68327.scrollToPosition(iMo45772);
        }
    }

    @Override // l.AbstractC12410
    public final void onChanged() {
        m47149();
    }

    @Override // l.AbstractC12410
    public final void onItemRangeChanged(int i, int i2) {
        m47149();
    }

    @Override // l.AbstractC12410
    public final void onItemRangeChanged(int i, int i2, Object obj) {
        m47149();
    }

    @Override // l.AbstractC12410
    public final void onItemRangeInserted(int i, int i2) {
        m47149();
    }

    @Override // l.AbstractC12410
    public final void onItemRangeRemoved(int i, int i2) {
        m47149();
    }

    @Override // l.AbstractC12410
    public final void onItemRangeMoved(int i, int i2, int i3) {
        m47149();
    }
}
