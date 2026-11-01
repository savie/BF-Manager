package l;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.۠ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8087 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C2516 f28337;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f28338 = new AtomicBoolean();

    public RunnableC8087(C2516 c2516) {
        this.f28337 = c2516;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f28338.compareAndSet(false, true)) {
            try {
                this.f28337.close();
            } catch (Throwable unused) {
            }
        }
    }
}
