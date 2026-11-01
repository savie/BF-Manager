package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.᩺ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1X4 */
/* JADX INFO: loaded from: classes.dex */
public final class C23065 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile boolean f74936 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6836 f74937;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Object f74938;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Exception f74939;

    public C23065(InterfaceC6836 interfaceC6836) {
        this.f74937 = interfaceC6836;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m51037() throws Exception {
        this.f74936 = true;
        this.f74939 = null;
        ServiceC15304.f49856.sendMessage(ServiceC15304.f49856.obtainMessage(0, this));
        while (this.f74936) {
            SystemClock.sleep(1L);
        }
        Exception exc = this.f74939;
        if (exc != null) {
            throw exc;
        }
        return this.f74938;
    }
}
