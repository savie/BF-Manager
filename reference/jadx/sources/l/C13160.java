package l;

/* JADX INFO: renamed from: l.۫ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I5JQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13160 extends AbstractC1778 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12964 f42084;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C25227 f42085;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f42086;

    public C13160(AbstractC12964 abstractC12964, C25227 c25227, String str) {
        this.f42084 = abstractC12964;
        this.f42085 = c25227;
        this.f42086 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32685() {
        AbstractC12964 abstractC12964 = this.f42084;
        abstractC12964.unregisterAdapterDataObserver(this);
        int iMo6797 = ((InterfaceC1974) abstractC12964).mo6797(this.f42086);
        if (iMo6797 != -1) {
            this.f42085.scrollToPosition(iMo6797);
        }
    }

    @Override // l.AbstractC1778
    public final void onChanged() {
        m32685();
    }

    @Override // l.AbstractC1778
    public final void onItemRangeChanged(int i, int i2) {
        m32685();
    }

    @Override // l.AbstractC1778
    public final void onItemRangeChanged(int i, int i2, Object obj) {
        m32685();
    }

    @Override // l.AbstractC1778
    public final void onItemRangeInserted(int i, int i2) {
        m32685();
    }

    @Override // l.AbstractC1778
    public final void onItemRangeRemoved(int i, int i2) {
        m32685();
    }

    @Override // l.AbstractC1778
    public final void onItemRangeMoved(int i, int i2, int i3) {
        m32685();
    }
}
