package l;

/* JADX INFO: renamed from: l.֫ۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5JX */
/* JADX INFO: loaded from: classes2.dex */
public final class C1574 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f6323;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m5377() {
        while (!this.f6323) {
            wait();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m5378() {
        boolean z = this.f6323;
        this.f6323 = true;
        if (!z) {
            notify();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m5379() {
        this.f6323 = false;
    }
}
