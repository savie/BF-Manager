package l;

/* JADX INFO: renamed from: l.֫ᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8D0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1992 extends Thread {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile boolean f7445 = true;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3403 f7446;

    public C1992(C3403 c3403) {
        this.f7446 = c3403;
        c3403.f12562.m40776();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6409() {
        this.f7445 = false;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C3403.f12552.fine("JSyn synthesis thread starting.");
        try {
            this.f7446.f12569 = new C11166();
            while (this.f7445) {
                this.f7446.f12569.getClass();
                System.nanoTime();
                C3403.m10088(this.f7446);
                this.f7446.m10100();
                this.f7446.f12569.m28100();
                if (this.f7446.m10103()) {
                    Thread.sleep(2L);
                }
            }
        } catch (Throwable unused) {
            try {
                this.f7445 = false;
            } catch (Throwable th) {
                C3403.f12552.info("JSyn synthesis thread in finally code.");
                throw th;
            }
        }
        C3403.f12552.info("JSyn synthesis thread in finally code.");
        C3403.f12552.fine("JSyn synthesis thread exiting.");
    }
}
