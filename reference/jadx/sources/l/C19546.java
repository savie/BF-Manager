package l;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.᩵ܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: W144 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19546 extends Thread {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8963 f62819;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile C18840 f62820;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC20957 f62821;

    public C19546(C8963 c8963, InterfaceC20957 interfaceC20957) {
        this.f62819 = c8963;
        this.f62821 = interfaceC20957;
        setPriority(10);
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.f62819.f30701.countDown();
        while (true) {
            LockSupport.park();
            if (this.f62819.f30702) {
                return;
            }
            this.f62821.mo26267(this.f62820);
            this.f62819.f30700.decrementAndGet();
        }
    }
}
