package l;

/* JADX INFO: renamed from: l.֡۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B6NL */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0461 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7919 f2072;

    public RunnableC0461(C7919 c7919) {
        this.f2072 = c7919;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7919 c7919 = this.f2072;
        if (c7919.f26306) {
            return;
        }
        if (c7919.m21464()) {
            c7919.f26304.postDelayed(this, 200L);
        } else {
            c7919.m21463();
        }
    }
}
