package l;

/* JADX INFO: renamed from: l.ܺ֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8D0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16491 extends Thread {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f53459 = true;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15745 f53460;

    public C16491(C15745 c15745) {
        this.f53460 = c15745;
        c15745.f51208.m31591();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39126() {
        this.f53459 = false;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C15745.f51193.fine("JSyn synthesis thread starting.");
        try {
            this.f53460.f51211 = new C1576();
            while (this.f53459) {
                this.f53460.f51211.getClass();
                System.nanoTime();
                C15745.m37650(this.f53460);
                this.f53460.m37662();
                this.f53460.f51211.m5596();
                if (this.f53460.m37660()) {
                    Thread.sleep(2L);
                }
            }
        } catch (Throwable unused) {
            try {
                this.f53459 = false;
            } catch (Throwable th) {
                C15745.f51193.info("JSyn synthesis thread in finally code.");
                throw th;
            }
        }
        C15745.f51193.info("JSyn synthesis thread in finally code.");
        C15745.f51193.fine("JSyn synthesis thread exiting.");
    }
}
