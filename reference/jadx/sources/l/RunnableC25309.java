package l;

/* JADX INFO: renamed from: l.᩻᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5GW */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC25309 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f81760;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f81761;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f81762;

    public /* synthetic */ RunnableC25309(int i, Object obj, Object obj2) {
        this.f81760 = i;
        this.f81762 = obj;
        this.f81761 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f81760) {
            case 0:
                Runnable runnable = (Runnable) this.f81762;
                Runnable runnable2 = (Runnable) this.f81761;
                try {
                    runnable.run();
                    return;
                } finally {
                    runnable2.run();
                }
            default:
                C20889.m47734((C20889) this.f81762, (Class) this.f81761);
                return;
        }
    }
}
