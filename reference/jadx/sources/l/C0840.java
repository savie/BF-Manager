package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֨ۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6PS */
/* JADX INFO: loaded from: classes2.dex */
public final class C0840 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C6585 f3469;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C3662 f3470;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C22008 f3471;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5261 f3472;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f3473;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C2438 f3474;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final RunnableC22195 f3477;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int[] f3478;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C10982 f3479;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f3480;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f3481;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean f3482;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f3476 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f3475 = new AtomicReference();

    public C0840(C2438 c2438, C3662 c3662, C10982 c10982, C6585 c6585, int i, C22008 c22008, boolean z, C5261 c5261, RunnableC22195 runnableC22195) {
        this.f3474 = c2438;
        this.f3470 = c3662;
        this.f3479 = c10982;
        this.f3469 = c6585;
        this.f3480 = i;
        this.f3473 = i;
        this.f3471 = c22008;
        this.f3482 = z;
        this.f3481 = c10982.getFloat(i);
        this.f3472 = c5261;
        this.f3477 = runnableC22195;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3447(int[] iArr) {
        this.f3478 = iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3446(Executor executor, int i) {
        int[] iArr = this.f3478;
        int size = iArr == null ? this.f3470.size() : iArr.length;
        int iMax = Math.max(1, (size / Math.max(1, i)) + 1);
        final int i2 = 0;
        while (i2 < size) {
            try {
                final int iMin = Math.min(iMax, size - i2) + i2;
                this.f3476.incrementAndGet();
                try {
                    executor.execute(new Runnable() { // from class: l.ۖۗۖ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0840.m3443(this.f8053, i2, iMin);
                        }
                    });
                } catch (Error | RuntimeException e) {
                    AtomicReference atomicReference = this.f3475;
                    while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                    }
                    m3444();
                }
                i2 = iMin;
            } catch (Throwable th) {
                m3444();
                throw th;
            }
        }
        m3444();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3443(final C0840 c0840, int i, int i2) {
        AtomicReference atomicReference;
        C22008 c22008;
        try {
            try {
                if (!c0840.f3472.getAsBoolean() && c0840.f3475.get() == null) {
                    C3329 c3329M30760 = ((C21489) c0840.f3474.f9752).m30760();
                    try {
                        c3329M30760.m9894(new Runnable() { // from class: l.ۚۗۖ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C0840.m3442(this.f17674);
                            }
                        });
                        C3762 c3762 = new C3762(c3329M30760);
                        C9496 c9496M10817 = c0840.f3470.m10817();
                        while (i < i2) {
                            int[] iArr = c0840.f3478;
                            int i3 = iArr == null ? i : iArr[i];
                            if (!c0840.f3472.getAsBoolean() && c0840.f3475.get() == null) {
                                if (((i3 != c0840.f3480 && ((c22008 = c0840.f3471) == null || !c22008.m48895(i3))) || c0840.f3479.getFloat(i3) < 0.0f) && (!c0840.f3482 || c0840.f3479.getFloat(i3) < 0.0f)) {
                                    float fM34707 = c9496M10817.m24325(i3).m34707(c3762, c0840.f3469);
                                    if (c0840.f3472.getAsBoolean()) {
                                        c3329M30760.close();
                                        c0840.m3444();
                                        return;
                                    } else {
                                        c0840.f3479.mo26064(fM34707, i3);
                                        synchronized (c0840) {
                                            if (fM34707 > c0840.f3481) {
                                                c0840.f3481 = fM34707;
                                                c0840.f3473 = i3;
                                            }
                                        }
                                    }
                                }
                                i++;
                            }
                            c3329M30760.close();
                            c0840.m3444();
                            return;
                        }
                        c3329M30760.close();
                        c0840.m3444();
                        return;
                    } catch (Throwable th) {
                        try {
                            c3329M30760.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                c0840.m3444();
            } catch (Throwable th3) {
                c0840.m3444();
                throw th3;
            }
        } catch (Error e) {
            e = e;
            atomicReference = c0840.f3475;
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
            c0840.m3444();
        } catch (CancellationException unused) {
            c0840.m3444();
        } catch (RuntimeException e2) {
            e = e2;
            atomicReference = c0840.f3475;
            while (!atomicReference.compareAndSet(null, e)) {
            }
            c0840.m3444();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3442(C0840 c0840) {
        if (c0840.f3472.getAsBoolean()) {
            throw new CancellationException();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m3444() {
        if (this.f3476.decrementAndGet() == 0) {
            this.f3477.run();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m3448() {
        return this.f3473;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Throwable m3445() {
        return (Throwable) this.f3475.get();
    }
}
