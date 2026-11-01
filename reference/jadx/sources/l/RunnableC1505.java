package l;

/* JADX INFO: renamed from: l.֫֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6NL */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1505 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9268 f6080;

    public RunnableC1505(C9268 c9268) {
        this.f6080 = c9268;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9268 c9268 = this.f6080;
        if (c9268.f31497) {
            return;
        }
        if (c9268.m23806()) {
            c9268.f31500.postDelayed(this, 200L);
        } else {
            c9268.m23810();
        }
    }
}
