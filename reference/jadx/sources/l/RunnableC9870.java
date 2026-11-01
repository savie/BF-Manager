package l;

/* JADX INFO: renamed from: l.ۢ᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9870 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ComponentCallbacksC22654 f33712;

    public RunnableC9870(ComponentCallbacksC22654 componentCallbacksC22654) {
        this.f33712 = componentCallbacksC22654;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33712.callStartTransitionListener(false);
    }
}
