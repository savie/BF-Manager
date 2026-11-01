package l;

/* JADX INFO: renamed from: l.᩸ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6PY */
/* JADX INFO: loaded from: classes4.dex */
public final class C21493 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f69842 = System.nanoTime();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48131() {
        if (Thread.currentThread().isInterrupted() || System.nanoTime() - this.f69842 > 5000000000L) {
            throw C8794.m22909(EnumC19377.LIMIT, "Formatting interrupted or time limit exceeded");
        }
    }
}
