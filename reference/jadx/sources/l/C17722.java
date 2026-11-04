package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ܽܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes5.dex */
public final class C17722 extends AbstractC5790 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Runnable f58234;

    public C17722(Executor executor, FutureC23690 futureC23690, FutureC23690 futureC23691, Runnable runnable) {
        super(executor, futureC23690, futureC23691);
        this.f58234 = runnable;
    }

    @Override // l.AbstractRunnableC11009
    /* JADX INFO: renamed from: ۙ */
    public final FutureC23690 mo7115(int i) {
        Object obj;
        FutureC23690 futureC23690;
        Runnable runnable;
        Throwable th;
        FutureC23690 futureC23691 = this.f19885;
        if (futureC23691 != null && (obj = futureC23691.f76816) != null && (futureC23690 = this.f19886) != null && (runnable = this.f58234) != null) {
            if (futureC23690.f76816 == null) {
                if ((obj instanceof C9495) && (th = ((C9495) obj).f30768) != null) {
                    futureC23690.m52936(obj, th);
                } else {
                    if (i <= 0) {
                        try {
                            if (!m16889()) {
                            }
                        } catch (Throwable th2) {
                            futureC23690.m52952(th2);
                        }
                    }
                    runnable.run();
                    futureC23690.m52944();
                }
            }
            this.f19885 = null;
            this.f19886 = null;
            this.f58234 = null;
            return futureC23690.m52934(futureC23691, i);
        }
        return null;
    }
}
