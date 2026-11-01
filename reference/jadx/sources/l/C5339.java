package l;

/* JADX INFO: renamed from: l.ۚۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: P70P */
/* JADX INFO: loaded from: classes2.dex */
public final class C5339 implements AutoCloseable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f18443;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f18443) {
            return;
        }
        this.f18443 = true;
        if (C22273.f72788.decrementAndGet() >= 0) {
            return;
        }
        C22273.f72788.incrementAndGet();
        throw new IllegalStateException("Hex file channel count underflow");
    }
}
