package l;

/* JADX INFO: renamed from: l.۠ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8750 extends AbstractFutureC13992 implements Runnable, InterfaceC7259 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public FutureC23690 f28454;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C19762 f28455;

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
        C19762 c19762;
        FutureC23690 futureC23690 = this.f28454;
        if (futureC23690 == null || (c19762 = this.f28455) == null) {
            return;
        }
        this.f28454 = null;
        this.f28455 = null;
        if (futureC23690.f76816 == null) {
            try {
                futureC23690.m52945(C1863.m6393(c19762.f63608, c19762.f63609));
            } catch (Throwable th) {
                futureC23690.m52952(th);
            }
        }
        futureC23690.m52946();
    }
}
