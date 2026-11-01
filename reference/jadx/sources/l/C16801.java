package l;

import java.net.ServerSocket;

/* JADX INFO: renamed from: l.ܽᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8538 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16801 extends Thread {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ServiceC7629 f53793;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ServerSocket f53794;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                C0572 c0572 = new C0572(this.f53794.accept(), new C20329());
                c0572.start();
                this.f53793.m20174(c0572);
            } catch (Exception unused) {
                return;
            }
        }
    }
}
