package l;

/* JADX INFO: renamed from: l.ۢܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70P */
/* JADX INFO: loaded from: classes3.dex */
public final class C10192 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f32612;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f32612) {
            return;
        }
        this.f32612 = true;
        if (C1244.f4505.decrementAndGet() >= 0) {
            return;
        }
        C1244.f4505.incrementAndGet();
        throw new IllegalStateException("Hex file channel count underflow");
    }
}
