package l;

import android.os.Handler;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: DB1R */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC22940 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Handler f74568;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Callable f74569;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC17295 f74570;

    public RunnableC22940(Handler handler, Callable callable, InterfaceC17295 interfaceC17295) {
        this.f74569 = callable;
        this.f74570 = interfaceC17295;
        this.f74568 = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        try {
            objCall = ((CallableC3038) this.f74569).call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.f74568.post(new RunnableC6711(this.f74570, objCall));
    }
}
