package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: VB94 */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC20235 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17997 f64938;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6065 f64939;

    public RunnableC20235(AbstractC17997 abstractC17997, C6065 c6065) {
        this.f64938 = abstractC17997;
        this.f64939 = c6065;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC17997 abstractC17997 = this.f64938;
        ArrayList arrayList = abstractC17997.f58946;
        C6065 c6065 = this.f64939;
        arrayList.remove(c6065);
        abstractC17997.f58944.remove(c6065);
    }
}
