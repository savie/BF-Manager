package l;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.ۧܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W144 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11724 extends Thread {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile C5759 f37931;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25151 f37932;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC16199 f37933;

    public C11724(C25151 c25151, InterfaceC16199 interfaceC16199) {
        this.f37932 = c25151;
        this.f37933 = interfaceC16199;
        setPriority(10);
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.f37932.f81289.countDown();
        while (true) {
            LockSupport.park();
            if (this.f37932.f81292) {
                return;
            }
            this.f37933.mo38424(this.f37931);
            this.f37932.f81290.decrementAndGet();
        }
    }
}
