package l;

/* JADX INFO: renamed from: l.۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC13231 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16960 f42290;

    public RunnableC13231(C16960 c16960) {
        this.f42290 = c16960;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9479 c9479 = this.f42290.f55410;
        if (c9479 != null) {
            c9479.m24863(true);
            c9479.requestLayout();
        }
    }
}
