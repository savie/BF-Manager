package l;

/* JADX INFO: renamed from: l.ۙܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N6PY */
/* JADX INFO: loaded from: classes2.dex */
public final class C5049 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f17472 = System.nanoTime();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15284() {
        if (Thread.currentThread().isInterrupted() || System.nanoTime() - this.f17472 > 5000000000L) {
            throw C15489.m37050(EnumC19965.LIMIT, "Formatting interrupted or time limit exceeded");
        }
    }
}
