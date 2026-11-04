package l;

/* JADX INFO: renamed from: l.ۖܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2784 extends AbstractFutureC13992 implements Runnable, InterfaceC7259 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public FutureC23690 f9173;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Runnable f9174;

    @Override // l.AbstractFutureC13992
    /* JADX INFO: renamed from: ᩸ */
    public final /* bridge */ /* synthetic */ Object mo4842() {
        return null;
    }

    @Override // l.AbstractFutureC13992
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo4841() {
        run();
        return false;
    }

    @Override // l.AbstractFutureC13992, java.lang.Runnable
    public final void run() {
        Runnable runnable;
        FutureC23690 futureC23690 = this.f9173;
        if (futureC23690 == null || (runnable = this.f9174) == null) {
            return;
        }
        this.f9173 = null;
        this.f9174 = null;
        if (futureC23690.f76816 == null) {
            try {
                runnable.run();
                futureC23690.m52944();
            } catch (Throwable th) {
                futureC23690.m52952(th);
            }
        }
        futureC23690.m52946();
    }
}
