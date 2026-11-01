package l;

/* JADX INFO: renamed from: l.۠ܺܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5JQ */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8280 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16042 f28770;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f28771;

    public RunnableC8280(AbstractC16042 abstractC16042, String str) {
        this.f28770 = abstractC16042;
        this.f28771 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC16042 abstractC16042 = this.f28770;
        AbstractC0414 adapter = abstractC16042.f51926.getAdapter();
        if (!(adapter instanceof InterfaceC20275)) {
            if (adapter != 0) {
                throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
            }
            return;
        }
        String str = this.f28771;
        int iMo45772 = ((InterfaceC20275) adapter).mo45772(str);
        if (iMo45772 != -1) {
            abstractC16042.f51926.scrollToPosition(iMo45772);
        } else {
            adapter.registerAdapterDataObserver(new C20980(adapter, abstractC16042.f51926, str));
        }
    }
}
