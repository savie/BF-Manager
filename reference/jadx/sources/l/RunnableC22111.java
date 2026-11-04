package l;

/* JADX INFO: renamed from: l.᩷ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I5JQ */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC22111 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC5703 f71260;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f71261;

    public RunnableC22111(AbstractC5703 abstractC5703, String str) {
        this.f71260 = abstractC5703;
        this.f71261 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC5703 abstractC5703 = this.f71260;
        AbstractC12964 adapter = abstractC5703.f19696.getAdapter();
        if (!(adapter instanceof InterfaceC1974)) {
            if (adapter != 0) {
                throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
            }
            return;
        }
        String str = this.f71261;
        int iMo6797 = ((InterfaceC1974) adapter).mo6797(str);
        if (iMo6797 != -1) {
            abstractC5703.f19696.scrollToPosition(iMo6797);
        } else {
            adapter.registerAdapterDataObserver(new C13160(adapter, abstractC5703.f19696, str));
        }
    }
}
