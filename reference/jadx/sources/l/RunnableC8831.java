package l;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۡۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6OW */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8831 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final CharSequence f30356;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C6111 f30357;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f30358;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10242 f30359;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f30360 = new AtomicInteger();

    public RunnableC8831(C10242 c10242, C6111 c6111, CharSequence charSequence, AbstractC20745 abstractC20745) {
        this.f30359 = c10242;
        this.f30357 = c6111;
        this.f30356 = charSequence;
        this.f30358 = abstractC20745;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22964() {
        try {
            C4716.f16636.execute(this);
        } catch (Error | RuntimeException e) {
            AtomicReference atomicReference = this.f30359.f34935;
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
            m22965();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22965() {
        this.f30357.m17045();
        if (this.f30360.compareAndSet(0, 2)) {
            this.f30359.f34937.countDown();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.ۤۧۖ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public final void run() {
        final C10242 c10242 = this.f30359;
        AtomicInteger atomicInteger = this.f30360;
        if (atomicInteger.compareAndSet(0, 1)) {
            try {
                try {
                    this.f30357.m16846(this.f30358, new InterfaceC5614() { // from class: l.᩵ۧۖ
                        @Override // l.InterfaceC5614
                        /* JADX INFO: renamed from: ֨ */
                        public final boolean mo2357() {
                            return c10242.m26036();
                        }
                    }, this.f30356);
                } finally {
                    atomicInteger.set(2);
                    c10242.f34937.countDown();
                }
            } catch (IOException | Error | RuntimeException e) {
                AtomicReference atomicReference = c10242.f34935;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
        }
    }
}
