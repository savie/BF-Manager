package l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۗܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F77E */
/* JADX INFO: loaded from: classes2.dex */
public final class C3338 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f12360;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f12361;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1927 f12362;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ExecutorService f12363;

    public C3338(ExecutorService executorService, AtomicInteger atomicInteger, AtomicReference atomicReference, C11101 c11101) {
        this.f12363 = executorService;
        this.f12360 = atomicInteger;
        this.f12361 = atomicReference;
        this.f12362 = c11101;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9938(final InterfaceC9690 interfaceC9690) throws InterruptedException {
        while (true) {
            AtomicInteger atomicInteger = this.f12360;
            if (atomicInteger.get() > 500) {
                ((C11101) this.f12362).getClass();
                Thread.sleep(50L);
            } else {
                atomicInteger.incrementAndGet();
                try {
                    this.f12363.submit(new Runnable() { // from class: l.ܳܺۨ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C3338.m9937(this.f47858, interfaceC9690);
                        }
                    });
                    return;
                } catch (Throwable th) {
                    atomicInteger.decrementAndGet();
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9937(C3338 c3338, InterfaceC9690 interfaceC9690) {
        c3338.f12360.decrementAndGet();
        try {
            interfaceC9690.run();
        } catch (Exception e) {
            AtomicReference atomicReference = c3338.f12361;
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
        }
    }
}
