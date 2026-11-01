package l;

/* JADX INFO: renamed from: l.ܿ᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC17582 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6293 f55878;

    public /* synthetic */ RunnableC17582(C6293 c6293) {
        this.f55878 = c6293;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6293 c6293 = this.f55878;
        c6293.notifyItemRangeChanged(0, c6293.f21303.size());
    }
}
