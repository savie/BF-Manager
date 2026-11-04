package l;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongUnaryOperator;

/* JADX INFO: renamed from: l.۟֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes3.dex */
public final class C7519 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16269 f24840;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f24843;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AtomicLong f24842 = new AtomicLong();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f24841 = new AtomicLong();

    public C7519(long j, C16269 c16269) {
        this.f24843 = j;
        this.f24840 = c16269;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20578(final long j) {
        if (j > 0) {
            C6063.updateAndGet(this.f24842, new LongUnaryOperator() { // from class: l.ܿ֡ܳ
                public /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
                    return C7838.$default$andThen(this, longUnaryOperator);
                }

                public /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
                    return C7838.$default$compose(this, longUnaryOperator);
                }

                @Override // java.util.function.LongUnaryOperator
                public final long applyAsLong(long j2) {
                    return C8265.m22299(j2, j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20579(long j, long j2) {
        this.f24841.set(0L);
        if (j == 0) {
            j2 = 1;
        }
        m20578(j2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m20582(final long j) {
        if (j > 0) {
            C6063.updateAndGet(this.f24841, new LongUnaryOperator() { // from class: l.֡֡ܳ
                public /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
                    return C7838.$default$andThen(this, longUnaryOperator);
                }

                public /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
                    return C7838.$default$compose(this, longUnaryOperator);
                }

                @Override // java.util.function.LongUnaryOperator
                public final long applyAsLong(long j2) {
                    return C8265.m22299(j2, j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20577() {
        this.f24841.set(0L);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m20581() {
        this.f24841.set(0L);
        this.f24842.set(this.f24843);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m20580() {
        long jM22299 = C8265.m22299(this.f24842.get(), this.f24841.get());
        long j = this.f24843;
        this.f24840.m43862(Math.min(jM22299, j), j);
    }
}
