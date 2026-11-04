package l;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۠᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6R3 */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC8925 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f29116 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7434 f29117;

    public CallableC8925(C7434 c7434) {
        this.f29117 = c7434;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int andIncrement;
        C7434 c7434 = this.f29117;
        AtomicInteger atomicInteger = this.f29116;
        if (!atomicInteger.compareAndSet(0, 1)) {
            return null;
        }
        try {
            try {
                if (!C7434.m20374(c7434) && c7434.f24479.get() < c7434.f24475.size()) {
                    C15508 c15508 = (C15508) c7434.f24477.get();
                    try {
                        C19984 c19984M37176 = c15508.m37176();
                        while (!C7434.m20374(c7434) && (andIncrement = c7434.f24479.getAndIncrement()) < c7434.f24475.size()) {
                            c7434.f24476[andIncrement] = ((InterfaceC2959) c7434.f24475.get(andIncrement)).mo3042(c19984M37176);
                        }
                        c15508.close();
                    } catch (Throwable th) {
                        if (c15508 != null) {
                            try {
                                c15508.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                atomicInteger.set(2);
                c7434.f24478.countDown();
                return null;
            } catch (Throwable th3) {
                atomicInteger.set(2);
                c7434.f24478.countDown();
                throw th3;
            }
        } catch (Error | RuntimeException e) {
            c7434.f24474.set(true);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23833() {
        if (this.f29116.compareAndSet(0, 2)) {
            this.f29117.f24478.countDown();
        }
    }
}
