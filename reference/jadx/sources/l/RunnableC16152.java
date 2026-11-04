package l;

/* JADX INFO: renamed from: l.ܶܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC16152 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20981 f52441;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20981 f52442;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f52443;

    public RunnableC16152(C20981 c20981, C20981 c20982, boolean z, C14307 c14307) {
        this.f52442 = c20981;
        this.f52441 = c20982;
        this.f52443 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ComponentCallbacksC11612 componentCallbacksC11612M47964 = this.f52442.m47964();
        ComponentCallbacksC11612 componentCallbacksC11612M47965 = this.f52441.m47964();
        AbstractC11284 abstractC11284 = C21727.f69327;
        if (this.f52443) {
            componentCallbacksC11612M47965.getEnterTransitionCallback();
        } else {
            componentCallbacksC11612M47964.getEnterTransitionCallback();
        }
    }
}
