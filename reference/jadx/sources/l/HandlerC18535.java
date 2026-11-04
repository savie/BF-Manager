package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.alipay.sdk.app.OpenAuthTask;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܿᩴ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 763M */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC18535 extends Handler implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f60231;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public volatile boolean f60232;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1382 f60233;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f60234;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long f60235;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0636 f60236;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC14805 f60237;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public IOException f60238;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Thread f60239;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f60240;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC18535(C1382 c1382, Looper looper, InterfaceC0636 interfaceC0636, InterfaceC14805 interfaceC14805, int i, long j) {
        super(looper);
        this.f60233 = c1382;
        this.f60236 = interfaceC0636;
        this.f60237 = interfaceC14805;
        this.f60231 = i;
        this.f60235 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43113(int i) throws IOException {
        IOException iOException = this.f60238;
        if (iOException != null && this.f60234 > i) {
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43114(long j) {
        C1382 c1382 = this.f60233;
        C20782.m47568(c1382.f4933 == null);
        c1382.f4933 = this;
        if (j > 0) {
            sendEmptyMessageDelayed(1, j);
        } else {
            m43112();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43115(boolean z) {
        this.f60232 = z;
        this.f60238 = null;
        if (hasMessages(1)) {
            this.f60240 = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                this.f60240 = true;
                this.f60236.mo2803();
                Thread thread = this.f60239;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.f60233.f4933 = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            InterfaceC14805 interfaceC14805 = this.f60237;
            interfaceC14805.getClass();
            interfaceC14805.mo6408(this.f60236, jElapsedRealtime, jElapsedRealtime - this.f60235, true);
            this.f60237 = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.f60240;
                this.f60239 = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.f60236.getClass().getSimpleName()));
                try {
                    this.f60236.mo2802();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f60239 = null;
                Thread.interrupted();
            }
            if (this.f60232) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.f60232) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (OutOfMemoryError e2) {
            if (this.f60232) {
                return;
            }
            C1896.m6516("OutOfMemory error loading stream", e2);
            obtainMessage(3, new C10330(e2)).sendToTarget();
        } catch (Error e3) {
            if (!this.f60232) {
                C1896.m6516("Unexpected error loading stream", e3);
                obtainMessage(4, e3).sendToTarget();
            }
            throw e3;
        } catch (Exception e4) {
            if (this.f60232) {
                return;
            }
            C1896.m6516("Unexpected exception loading stream", e4);
            obtainMessage(3, new C10330(e4)).sendToTarget();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long jMin;
        if (this.f60232) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            m43112();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.f60233.f4933 = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.f60235;
        InterfaceC14805 interfaceC14805 = this.f60237;
        interfaceC14805.getClass();
        if (this.f60240) {
            interfaceC14805.mo6408(this.f60236, jElapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                interfaceC14805.mo6406(this.f60236, jElapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                C1896.m6516("Unexpected exception handling load completed", e);
                this.f60233.f4934 = new C10330(e);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f60238 = iOException;
        int i3 = this.f60234 + 1;
        this.f60234 = i3;
        C21519 c21519Mo6404 = interfaceC14805.mo6404(this.f60236, jElapsedRealtime, j, iOException, i3);
        if (c21519Mo6404.f68759 == 3) {
            this.f60233.f4934 = this.f60238;
        } else if (c21519Mo6404.f68759 != 2) {
            if (c21519Mo6404.f68759 == 1) {
                this.f60234 = 1;
            }
            if (c21519Mo6404.f68758 != -9223372036854775807L) {
                jMin = c21519Mo6404.f68758;
            } else {
                jMin = Math.min((this.f60234 - 1) * 1000, OpenAuthTask.Duplex);
            }
            m43114(jMin);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43112() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.f60235;
        InterfaceC14805 interfaceC14805 = this.f60237;
        interfaceC14805.getClass();
        interfaceC14805.mo6407(this.f60236, jElapsedRealtime, j, this.f60234);
        this.f60238 = null;
        C1382 c1382 = this.f60233;
        InterfaceExecutorC22879 interfaceExecutorC22879 = c1382.f4935;
        HandlerC18535 handlerC18535 = c1382.f4933;
        handlerC18535.getClass();
        interfaceExecutorC22879.execute(handlerC18535);
    }
}
