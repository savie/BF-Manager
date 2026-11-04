package l;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֡ۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: O6OW */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0330 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7788 f1797;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C24132 f1798;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f1799;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CharSequence f1800;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f1801 = new AtomicInteger();

    public RunnableC0330(C7788 c7788, C24132 c24132, CharSequence charSequence, AbstractC22044 abstractC22044) {
        this.f1797 = c7788;
        this.f1798 = c24132;
        this.f1800 = charSequence;
        this.f1799 = abstractC22044;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2043() {
        try {
            C5261.f18540.execute(this);
        } catch (Error | RuntimeException e) {
            AtomicReference atomicReference = this.f1797.f25860;
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
            m2044();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m2044() {
        this.f1798.m54012();
        if (this.f1801.compareAndSet(0, 2)) {
            this.f1797.f25858.countDown();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.۟ۡ᩸] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public final void run() {
        final C7788 c7788 = this.f1797;
        AtomicInteger atomicInteger = this.f1801;
        if (atomicInteger.compareAndSet(0, 1)) {
            try {
                try {
                    this.f1798.m53893(this.f1799, new InterfaceC7509() { // from class: l.ܿۡ᩸
                        @Override // l.InterfaceC7509
                        /* JADX INFO: renamed from: ۫ */
                        public final boolean mo924() {
                            return c7788.m21177();
                        }
                    }, this.f1800);
                } finally {
                    atomicInteger.set(2);
                    c7788.f25858.countDown();
                }
            } catch (IOException | Error | RuntimeException e) {
                AtomicReference atomicReference = c7788.f25860;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
        }
    }
}
