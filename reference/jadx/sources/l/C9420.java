package l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۡܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F77E */
/* JADX INFO: loaded from: classes3.dex */
public final class C9420 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f30560;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10166 f30561;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ExecutorService f30562;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f30563;

    public C9420(ExecutorService executorService, AtomicInteger atomicInteger, AtomicReference atomicReference, C0472 c0472) {
        this.f30562 = executorService;
        this.f30563 = atomicInteger;
        this.f30560 = atomicReference;
        this.f30561 = c0472;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24792(final InterfaceC1218 interfaceC1218) throws InterruptedException {
        while (true) {
            AtomicInteger atomicInteger = this.f30563;
            if (atomicInteger.get() > 500) {
                ((C0472) this.f30561).getClass();
                Thread.sleep(50L);
            } else {
                atomicInteger.incrementAndGet();
                try {
                    this.f30562.submit(new Runnable() { // from class: l.ᩳܰۤ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C9420.m24791(this.f61881, interfaceC1218);
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
    public static /* synthetic */ void m24791(C9420 c9420, InterfaceC1218 interfaceC1218) {
        c9420.f30563.decrementAndGet();
        try {
            interfaceC1218.run();
        } catch (Exception e) {
            AtomicReference atomicReference = c9420.f30560;
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
        }
    }
}
