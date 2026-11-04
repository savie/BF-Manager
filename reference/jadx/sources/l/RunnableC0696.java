package l;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.֡᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0696 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19143 f2601;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f2602 = new AtomicBoolean();

    public RunnableC0696(C19143 c19143) {
        this.f2601 = c19143;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2602.compareAndSet(false, true)) {
            try {
                this.f2601.close();
            } catch (Throwable unused) {
            }
        }
    }
}
