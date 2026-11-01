package l;

/* JADX INFO: renamed from: l.۬֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC12780 extends AbstractFutureC23009 implements Runnable, InterfaceC6429 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public FutureC12075 f42599;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public RunnableC19331 f42600;

    @Override // l.AbstractFutureC23009
    /* JADX INFO: renamed from: ۖ */
    public final /* bridge */ /* synthetic */ Object mo4167() {
        return null;
    }

    @Override // l.AbstractFutureC23009
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo4168() {
        run();
        return false;
    }

    @Override // l.AbstractFutureC23009, java.lang.Runnable
    public final void run() {
        RunnableC19331 runnableC19331;
        FutureC12075 futureC12075 = this.f42599;
        if (futureC12075 == null || (runnableC19331 = this.f42600) == null) {
            return;
        }
        this.f42599 = null;
        this.f42600 = null;
        if (futureC12075.f40418 == null) {
            try {
                runnableC19331.run();
                futureC12075.m30029();
            } catch (Throwable th) {
                futureC12075.m30035(th);
            }
        }
        futureC12075.m30037();
    }
}
