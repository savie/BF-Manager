package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.ۚܺ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K1X4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5770 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13227 f19825;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Object f19826;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Exception f19827;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f19828 = false;

    public C5770(InterfaceC13227 interfaceC13227) {
        this.f19825 = interfaceC13227;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m16851() throws Exception {
        this.f19828 = true;
        this.f19827 = null;
        ServiceC2041.f6788.sendMessage(ServiceC2041.f6788.obtainMessage(0, this));
        while (this.f19828) {
            SystemClock.sleep(1L);
        }
        Exception exc = this.f19827;
        if (exc != null) {
            throw exc;
        }
        return this.f19826;
    }
}
