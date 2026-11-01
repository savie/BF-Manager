package l;

/* JADX INFO: renamed from: l.ܶۗܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC14963 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f48862;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17492 f48863;

    public RunnableC14963(C17492 c17492, int i) {
        this.f48862 = i;
        this.f48863 = c17492;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48863.smoothScrollToPosition(this.f48862);
    }
}
