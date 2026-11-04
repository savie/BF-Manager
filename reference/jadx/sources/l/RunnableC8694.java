package l;

/* JADX INFO: renamed from: l.۠ܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8694 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ComponentCallbacksC11612 f28354;

    public RunnableC8694(ComponentCallbacksC11612 componentCallbacksC11612) {
        this.f28354 = componentCallbacksC11612;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28354.callStartTransitionListener(false);
    }
}
