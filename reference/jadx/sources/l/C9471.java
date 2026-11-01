package l;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongUnaryOperator;

/* JADX INFO: renamed from: l.ۢ۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes3.dex */
public final class C9471 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f32039;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10197 f32040;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f32042 = new AtomicLong();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f32041 = new AtomicLong();

    public C9471(long j, C10197 c10197) {
        this.f32039 = j;
        this.f32040 = c10197;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24250(final long j) {
        if (j > 0) {
            C13077.updateAndGet(this.f32042, new LongUnaryOperator() { // from class: l.ܳ۠᩹
                public /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
                    return C19095.$default$andThen(this, longUnaryOperator);
                }

                public /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
                    return C19095.$default$compose(this, longUnaryOperator);
                }

                @Override // java.util.function.LongUnaryOperator
                public final long applyAsLong(long j2) {
                    return C5567.m15375(j2, j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24251(long j, long j2) {
        this.f32041.set(0L);
        if (j == 0) {
            j2 = 1;
        }
        m24250(j2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m24254(final long j) {
        if (j > 0) {
            C13077.updateAndGet(this.f32041, new LongUnaryOperator() { // from class: l.֫۠᩹
                public /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
                    return C19095.$default$andThen(this, longUnaryOperator);
                }

                public /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
                    return C19095.$default$compose(this, longUnaryOperator);
                }

                @Override // java.util.function.LongUnaryOperator
                public final long applyAsLong(long j2) {
                    return C5567.m15375(j2, j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24249() {
        this.f32041.set(0L);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m24253() {
        this.f32041.set(0L);
        this.f32042.set(this.f32039);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m24252() {
        long jM15375 = C5567.m15375(this.f32042.get(), this.f32041.get());
        long j = this.f32039;
        this.f32040.m41578(Math.min(jM15375, j), j);
    }
}
