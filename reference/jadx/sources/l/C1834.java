package l;

import java.net.ServerSocket;

/* JADX INFO: renamed from: l.֫ۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8538 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1834 extends Thread {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ServiceC22717 f6212;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ServerSocket f6213;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                C5563 c5563 = new C5563(this.f6213.accept(), new C13020());
                c5563.start();
                this.f6212.m51239(c5563);
            } catch (Exception unused) {
                return;
            }
        }
    }
}
