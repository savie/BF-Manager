package l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: renamed from: l.ܿܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: N8TR */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerThreadC18403 extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public RuntimeException f59956;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C0504 f59957;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public RunnableC10339 f59958;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Error f59959;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Handler f59960;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0504 m42916(int i) {
        boolean z;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.f59960 = handler;
        this.f59958 = new RunnableC10339(handler);
        synchronized (this) {
            z = false;
            this.f59960.obtainMessage(1, i, 0).sendToTarget();
            while (this.f59957 == null && this.f59956 == null && this.f59959 == null) {
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
        RuntimeException runtimeException = this.f59956;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.f59959;
        if (error != null) {
            throw error;
        }
        C0504 c0504 = this.f59957;
        c0504.getClass();
        return c0504;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42917() {
        this.f59960.getClass();
        this.f59960.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    try {
                        try {
                            m42915(message.arg1);
                            synchronized (this) {
                                notify();
                            }
                            return true;
                        } catch (RuntimeException e) {
                            C1896.m6516("Failed to initialize placeholder surface", e);
                            this.f59956 = e;
                            synchronized (this) {
                                notify();
                            }
                        }
                    } catch (Error e2) {
                        C1896.m6516("Failed to initialize placeholder surface", e2);
                        this.f59959 = e2;
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (C8848 e3) {
                    C1896.m6516("Failed to initialize placeholder surface", e3);
                    this.f59956 = new IllegalStateException(e3);
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    this.f59958.getClass();
                    this.f59958.m26608();
                    quit();
                    return true;
                } catch (Throwable th) {
                    try {
                        C1896.m6516("Failed to release placeholder surface", th);
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m42915(int i) throws C8848 {
        this.f59958.getClass();
        this.f59958.m26607(i);
        this.f59957 = new C0504(this, this.f59958.m26606(), i != 0);
    }
}
