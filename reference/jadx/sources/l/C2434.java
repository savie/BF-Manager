package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۖۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6PS */
/* JADX INFO: loaded from: classes2.dex */
public final class C2434 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9145 f7785;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8664 f7786;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f7787 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f7788 = new AtomicReference();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2698 f7789;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C5438 f7790;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f7791;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C15334 f7792;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int[] f7793;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f7794;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f7795;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final RunnableC7173 f7796;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6909 f7797;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f7798;

    public C2434(C2698 c2698, C6909 c6909, C15334 c15334, C5438 c5438, int i, C9145 c9145, boolean z, C8664 c8664, RunnableC7173 runnableC7173) {
        this.f7789 = c2698;
        this.f7797 = c6909;
        this.f7792 = c15334;
        this.f7790 = c5438;
        this.f7794 = i;
        this.f7795 = i;
        this.f7785 = c9145;
        this.f7798 = z;
        this.f7791 = c15334.getFloat(i);
        this.f7786 = c8664;
        this.f7796 = runnableC7173;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8208(int[] iArr) {
        this.f7793 = iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8207(Executor executor, int i) {
        int[] iArr = this.f7793;
        int size = iArr == null ? this.f7797.size() : iArr.length;
        int iMax = Math.max(1, (size / Math.max(1, i)) + 1);
        final int i2 = 0;
        while (i2 < size) {
            try {
                final int iMin = Math.min(iMax, size - i2) + i2;
                this.f7787.incrementAndGet();
                try {
                    executor.execute(new Runnable() { // from class: l.֨ۙᩴ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2434.m8204(this.f3482, i2, iMin);
                        }
                    });
                } catch (Error | RuntimeException e) {
                    AtomicReference atomicReference = this.f7788;
                    while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                    }
                    m8205();
                }
                i2 = iMin;
            } catch (Throwable th) {
                m8205();
                throw th;
            }
        }
        m8205();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8204(C2434 c2434, int i, int i2) {
        AtomicReference atomicReference;
        C9145 c9145;
        try {
            try {
                if (!c2434.f7786.getAsBoolean() && c2434.f7788.get() == null) {
                    C15508 c15508M33642 = c2434.f7789.f8576.m33642();
                    try {
                        c15508M33642.m37180(new RunnableC12066(1, c2434));
                        C15132 c15132 = new C15132(c15508M33642);
                        C18096 c18096M19181 = c2434.f7797.m19181();
                        while (i < i2) {
                            int[] iArr = c2434.f7793;
                            int i3 = iArr == null ? i : iArr[i];
                            if (!c2434.f7786.getAsBoolean() && c2434.f7788.get() == null) {
                                if (((i3 != c2434.f7794 && ((c9145 = c2434.f7785) == null || !c9145.m24282(i3))) || c2434.f7792.getFloat(i3) < 0.0f) && (!c2434.f7798 || c2434.f7792.getFloat(i3) < 0.0f)) {
                                    float fM34798 = c18096M19181.m42205(i3).m34798(c15132, c2434.f7790);
                                    if (c2434.f7786.getAsBoolean()) {
                                        c15508M33642.close();
                                        c2434.m8205();
                                        return;
                                    } else {
                                        c2434.f7792.mo25091(fM34798, i3);
                                        synchronized (c2434) {
                                            if (fM34798 > c2434.f7791) {
                                                c2434.f7791 = fM34798;
                                                c2434.f7795 = i3;
                                            }
                                        }
                                    }
                                }
                                i++;
                            }
                            c15508M33642.close();
                            c2434.m8205();
                            return;
                        }
                        c15508M33642.close();
                        c2434.m8205();
                        return;
                    } catch (Throwable th) {
                        try {
                            c15508M33642.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                c2434.m8205();
            } catch (Throwable th3) {
                c2434.m8205();
                throw th3;
            }
        } catch (Error e) {
            e = e;
            atomicReference = c2434.f7788;
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
            c2434.m8205();
        } catch (CancellationException unused) {
            c2434.m8205();
        } catch (RuntimeException e2) {
            e = e2;
            atomicReference = c2434.f7788;
            while (!atomicReference.compareAndSet(null, e)) {
            }
            c2434.m8205();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m8203(C2434 c2434) {
        if (c2434.f7786.getAsBoolean()) {
            throw new CancellationException();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m8205() {
        if (this.f7787.decrementAndGet() == 0) {
            this.f7796.run();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m8209() {
        return this.f7795;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Throwable m8206() {
        return (Throwable) this.f7788.get();
    }
}
