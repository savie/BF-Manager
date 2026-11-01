package l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: renamed from: l.᩹֨ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8TR */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerThreadC21957 extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Error f71245;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C0789 f71246;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public RunnableC3830 f71247;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public RuntimeException f71248;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Handler f71249;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0789 m48789(int i) {
        boolean z;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.f71249 = handler;
        this.f71247 = new RunnableC3830(handler);
        synchronized (this) {
            z = false;
            this.f71249.obtainMessage(1, i, 0).sendToTarget();
            while (this.f71246 == null && this.f71248 == null && this.f71245 == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f71248;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.f71245;
        if (error != null) {
            throw error;
        }
        C0789 c0789 = this.f71246;
        c0789.getClass();
        return c0789;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48790() {
        this.f71249.getClass();
        this.f71249.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    try {
                        try {
                            m48788(message.arg1);
                            synchronized (this) {
                                notify();
                            }
                            return true;
                        } catch (RuntimeException e) {
                            C0303.m1854("Failed to initialize placeholder surface", e);
                            this.f71248 = e;
                            synchronized (this) {
                                notify();
                            }
                        }
                    } catch (C21470 e2) {
                        C0303.m1854("Failed to initialize placeholder surface", e2);
                        this.f71248 = new IllegalStateException(e2);
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (Error e3) {
                    C0303.m1854("Failed to initialize placeholder surface", e3);
                    this.f71245 = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    this.f71247.getClass();
                    this.f71247.m11123();
                    quit();
                    return true;
                } catch (Throwable th) {
                    try {
                        C0303.m1854("Failed to release placeholder surface", th);
                        return true;
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m48788(int i) throws C21470 {
        this.f71247.getClass();
        this.f71247.m11122(i);
        this.f71246 = new C0789(this, this.f71247.m11121(), i != 0);
    }
}
