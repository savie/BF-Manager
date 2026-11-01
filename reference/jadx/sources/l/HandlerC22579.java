package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.alipay.sdk.app.OpenAuthTask;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩹᩹ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 763M */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC22579 extends Handler implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public IOException f73592;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1411 f73593;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f73594;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f73595;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23285 f73596;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC2822 f73597;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f73598;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Thread f73599;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f73600;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f73601;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC22579(C23285 c23285, Looper looper, InterfaceC1411 interfaceC1411, InterfaceC2822 interfaceC2822, int i, long j) {
        super(looper);
        this.f73596 = c23285;
        this.f73593 = interfaceC1411;
        this.f73597 = interfaceC2822;
        this.f73598 = i;
        this.f73601 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50084(int i) {
        IOException iOException = this.f73592;
        if (iOException != null && this.f73595 > i) {
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50085(long j) {
        C23285 c23285 = this.f73596;
        C2023.m6510(c23285.f75526 == null);
        c23285.f75526 = this;
        if (j > 0) {
            sendEmptyMessageDelayed(1, j);
        } else {
            m50083();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50086(boolean z) {
        this.f73594 = z;
        this.f73592 = null;
        if (hasMessages(1)) {
            this.f73600 = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                this.f73600 = true;
                this.f73593.mo2335();
                Thread thread = this.f73599;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.f73596.f75526 = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            InterfaceC2822 interfaceC2822 = this.f73597;
            interfaceC2822.getClass();
            interfaceC2822.mo7688(this.f73593, jElapsedRealtime, jElapsedRealtime - this.f73601, true);
            this.f73597 = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.f73600;
                this.f73599 = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.f73593.getClass().getSimpleName()));
                try {
                    this.f73593.mo2330();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f73599 = null;
                Thread.interrupted();
            }
            if (this.f73594) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.f73594) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (OutOfMemoryError e2) {
            if (this.f73594) {
                return;
            }
            C0303.m1854("OutOfMemory error loading stream", e2);
            obtainMessage(3, new C7056(e2)).sendToTarget();
        } catch (Error e3) {
            if (!this.f73594) {
                C0303.m1854("Unexpected error loading stream", e3);
                obtainMessage(4, e3).sendToTarget();
            }
            throw e3;
        } catch (Exception e4) {
            if (this.f73594) {
                return;
            }
            C0303.m1854("Unexpected exception loading stream", e4);
            obtainMessage(3, new C7056(e4)).sendToTarget();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long jMin;
        if (this.f73594) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            m50083();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.f73596.f75526 = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.f73601;
        InterfaceC2822 interfaceC2822 = this.f73597;
        interfaceC2822.getClass();
        if (this.f73600) {
            interfaceC2822.mo7688(this.f73593, jElapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                interfaceC2822.mo7686(this.f73593, jElapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                C0303.m1854("Unexpected exception handling load completed", e);
                this.f73596.f75527 = new C7056(e);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f73592 = iOException;
        int i3 = this.f73595 + 1;
        this.f73595 = i3;
        C5645 c5645Mo7683 = interfaceC2822.mo7683(this.f73593, jElapsedRealtime, j, iOException, i3);
        if (c5645Mo7683.f19307 == 3) {
            this.f73596.f75527 = this.f73592;
        } else if (c5645Mo7683.f19307 != 2) {
            if (c5645Mo7683.f19307 == 1) {
                this.f73595 = 1;
            }
            if (c5645Mo7683.f19306 != -9223372036854775807L) {
                jMin = c5645Mo7683.f19306;
            } else {
                jMin = Math.min((this.f73595 - 1) * 1000, OpenAuthTask.Duplex);
            }
            m50085(jMin);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50083() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.f73601;
        InterfaceC2822 interfaceC2822 = this.f73597;
        interfaceC2822.getClass();
        interfaceC2822.mo7687(this.f73593, jElapsedRealtime, j, this.f73595);
        this.f73592 = null;
        C23285 c23285 = this.f73596;
        InterfaceExecutorC7762 interfaceExecutorC7762 = c23285.f75528;
        HandlerC22579 handlerC22579 = c23285.f75526;
        handlerC22579.getClass();
        interfaceExecutorC7762.execute(handlerC22579);
    }
}
