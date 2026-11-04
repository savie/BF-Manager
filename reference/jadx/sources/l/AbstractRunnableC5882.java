package l;

/* JADX INFO: renamed from: l.ۚ᩵᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: S5K4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC5882 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17311 f20165;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo17109();

    public AbstractRunnableC5882(C17311 c17311) {
        this.f20165 = c17311;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f20165.f56376.m56819()) {
                return;
            }
            mo17109();
        } catch (Throwable th) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }
}
