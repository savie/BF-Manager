package l;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.֨ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6R3 */
/* JADX INFO: loaded from: classes2.dex */
public final class CallableC1091 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f4979 = new AtomicInteger();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13087 f4980;

    public CallableC1091(C13087 c13087) {
        this.f4980 = c13087;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int andIncrement;
        C13087 c13087 = this.f4980;
        AtomicInteger atomicInteger = this.f4979;
        if (!atomicInteger.compareAndSet(0, 1)) {
            return null;
        }
        try {
            try {
                if (!C13087.m32302(c13087) && c13087.f43585.get() < c13087.f43584.size()) {
                    C3329 c3329 = (C3329) c13087.f43587.get();
                    try {
                        C9681 c9681M9888 = c3329.m9888();
                        while (!C13087.m32302(c13087) && (andIncrement = c13087.f43585.getAndIncrement()) < c13087.f43584.size()) {
                            c13087.f43591[andIncrement] = ((InterfaceC22259) c13087.f43584.get(andIncrement)).mo9751(c9681M9888);
                        }
                        c3329.close();
                    } catch (Throwable th) {
                        if (c3329 != null) {
                            try {
                                c3329.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                atomicInteger.set(2);
                c13087.f43590.countDown();
                return null;
            } catch (Throwable th3) {
                atomicInteger.set(2);
                c13087.f43590.countDown();
                throw th3;
            }
        } catch (Error | RuntimeException e) {
            c13087.f43588.set(true);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4091() {
        if (this.f4979.compareAndSet(0, 2)) {
            this.f4980.f43590.countDown();
        }
    }
}
