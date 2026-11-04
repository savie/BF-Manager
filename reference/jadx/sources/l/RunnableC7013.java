package l;

/* JADX INFO: renamed from: l.ۜ۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7013 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13724 f23144;

    public /* synthetic */ RunnableC7013(C13724 c13724) {
        this.f23144 = c13724;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C13724 c13724 = this.f23144;
        c13724.notifyItemRangeChanged(0, c13724.f43573.size());
    }
}
