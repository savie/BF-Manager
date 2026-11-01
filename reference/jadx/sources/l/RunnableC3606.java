package l;

/* JADX INFO: renamed from: l.ۘ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3606 extends AbstractFutureC23009 implements Runnable, InterfaceC6429 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public FutureC12075 f13260;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C17818 f13261;

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
        C17818 c17818;
        FutureC12075 futureC12075 = this.f13260;
        if (futureC12075 == null || (c17818 = this.f13261) == null) {
            return;
        }
        this.f13260 = null;
        this.f13261 = null;
        if (futureC12075.f40418 == null) {
            try {
                futureC12075.m30030(C10058.m25466(c17818.f56450, c17818.f56451));
            } catch (Throwable th) {
                futureC12075.m30035(th);
            }
        }
        futureC12075.m30037();
    }
}
