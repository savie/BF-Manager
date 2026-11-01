package l;

/* JADX INFO: renamed from: l.᩻ۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5K4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC23531 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C4479 f76196;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo8900();

    public AbstractRunnableC23531(C4479 c4479) {
        this.f76196 = c4479;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f76196.f15939.m52919()) {
                return;
            }
            mo8900();
        } catch (Throwable th) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }
}
