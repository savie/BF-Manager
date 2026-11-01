package l;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۚۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5GW */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC5264 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f18247;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f18248 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final WeakReference f18249;

    public HandlerC5264(C13026 c13026) {
        this.f18249 = new WeakReference(c13026);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m14547() {
        this.f18247 = false;
        removeMessages(0);
        sendEmptyMessageDelayed(0, 500L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14546() {
        removeMessages(0);
        this.f18247 = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C13026 c13026 = (C13026) this.f18249.get();
        if (c13026 == null) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            if (this.f18247) {
                return;
            }
            if (c13026.f43455.m38965()) {
                c13026.invalidate();
            }
            sendEmptyMessageDelayed(0, 500L);
            return;
        }
        if (i == 2) {
            C13026.m32217(c13026);
            return;
        }
        if (i != 3) {
            return;
        }
        int iUptimeMillis = (int) ((SystemClock.uptimeMillis() - c13026.f43445) - 1500);
        if (iUptimeMillis < 0) {
            int i2 = -iUptimeMillis;
            if (i2 < 1500) {
                removeMessages(3);
                sendEmptyMessageDelayed(3, i2);
            }
            this.f18248 = true;
            return;
        }
        if (iUptimeMillis < 300) {
            this.f18248 = true;
            c13026.invalidate();
            removeMessages(3);
            sendEmptyMessage(3);
            return;
        }
        if (this.f18248) {
            this.f18248 = false;
            c13026.invalidate();
        }
    }
}
