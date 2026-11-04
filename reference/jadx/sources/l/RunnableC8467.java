package l;

/* JADX INFO: renamed from: l.۠ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8467 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f27738;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C25227 f27739;

    public RunnableC8467(C25227 c25227, int i) {
        this.f27738 = i;
        this.f27739 = c25227;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27739.smoothScrollToPosition(this.f27738);
    }
}
