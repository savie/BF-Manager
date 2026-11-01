package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.֡֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes3.dex */
public final class C0079 extends AbstractC9958 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Runnable f987;

    public C0079(Executor executor, FutureC12075 futureC12075, FutureC12075 futureC12076, Runnable runnable) {
        super(executor, futureC12075, futureC12076);
        this.f987 = runnable;
    }

    @Override // l.AbstractRunnableC17718
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 mo1013(int i) {
        Object obj;
        FutureC12075 futureC12075;
        Runnable runnable;
        Throwable th;
        FutureC12075 futureC12076 = this.f34027;
        if (futureC12076 != null && (obj = futureC12076.f40418) != null && (futureC12075 = this.f34029) != null && (runnable = this.f987) != null) {
            if (futureC12075.f40418 == null) {
                if ((obj instanceof C0784) && (th = ((C0784) obj).f3363) != null) {
                    futureC12075.m30020(obj, th);
                } else {
                    if (i <= 0) {
                        try {
                            if (!m25177()) {
                            }
                        } catch (Throwable th2) {
                            futureC12075.m30035(th2);
                        }
                    }
                    runnable.run();
                    futureC12075.m30029();
                }
            }
            this.f34027 = null;
            this.f34029 = null;
            this.f987 = null;
            return futureC12075.m30017(futureC12076, i);
        }
        return null;
    }
}
