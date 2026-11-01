package l;

/* JADX INFO: renamed from: l.ۛۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5799 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f19680;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f19681;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6587 f19682;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4470 f19683;

    public /* synthetic */ RunnableC5799(RunnableC17088 runnableC17088, InterfaceC4470 interfaceC4470, Object obj, C6587 c6587) {
        this.f19681 = runnableC17088;
        this.f19683 = interfaceC4470;
        this.f19680 = obj;
        this.f19682 = c6587;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f19681;
        if (runnable != null) {
            runnable.run();
        }
        C6587 c6587 = this.f19682;
        Object obj = this.f19680;
        RunnableC22296 runnableC22296 = new RunnableC22296(1, c6587, obj);
        ((C7999) this.f19683).getClass();
        C4716.m13050(obj, 120000L, runnableC22296);
    }
}
