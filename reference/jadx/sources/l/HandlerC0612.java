package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.֡ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC0612 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f2423;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f2424;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f2425;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final WeakReference f2426;

    public HandlerC0612(C2849 c2849) {
        super(Looper.getMainLooper());
        this.f2426 = new WeakReference(c2849);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C2849 c2849 = (C2849) this.f2426.get();
        if (c2849 != null) {
            c2849.m9399();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2733(long j) {
        this.f2424 = j;
        this.f2423 = true;
        removeMessages(0);
        if (this.f2425) {
            return;
        }
        sendEmptyMessageDelayed(0, j);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m2734() {
        if (!this.f2423 || this.f2425) {
            return;
        }
        removeMessages(0);
        sendEmptyMessageDelayed(0, this.f2424);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m2735() {
        this.f2425 = true;
        removeMessages(0);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m2736() {
        if (this.f2425) {
            this.f2425 = false;
            if (this.f2423) {
                removeMessages(0);
                sendEmptyMessageDelayed(0, this.f2424);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2732() {
        this.f2423 = false;
        this.f2425 = false;
        removeMessages(0);
    }
}
