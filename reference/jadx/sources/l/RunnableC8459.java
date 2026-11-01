package l;

/* JADX INFO: renamed from: l.۠᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8459 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16386 f29356;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16386 f29357;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f29358;

    public RunnableC8459(C16386 c16386, C16386 c16387, boolean z, C21445 c21445) {
        this.f29356 = c16386;
        this.f29357 = c16387;
        this.f29358 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ComponentCallbacksC22654 componentCallbacksC22654M38571 = this.f29356.m38571();
        ComponentCallbacksC22654 componentCallbacksC22654M38572 = this.f29357.m38571();
        AbstractC14975 abstractC14975 = C2273.f8120;
        if (this.f29358) {
            componentCallbacksC22654M38572.getEnterTransitionCallback();
        } else {
            componentCallbacksC22654M38571.getEnterTransitionCallback();
        }
    }
}
