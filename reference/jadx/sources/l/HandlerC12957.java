package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.۬ۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: J5HS */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC12957 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f43066;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f43067;

    public HandlerC12957(C6606 c6606) {
        super(Looper.getMainLooper());
        this.f43067 = false;
        this.f43066 = new WeakReference(c6606);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C6606 c6606 = (C6606) this.f43066.get();
        if (c6606 == null) {
            return;
        }
        if (c6606.m17929()) {
            c6606.f22235 = SystemClock.uptimeMillis();
            removeMessages(0);
            sendEmptyMessageDelayed(0, 1500L);
            return;
        }
        int iUptimeMillis = (int) ((SystemClock.uptimeMillis() - c6606.f22235) - 1500);
        if (iUptimeMillis < 0) {
            int i = -iUptimeMillis;
            if (i < 1500) {
                removeMessages(0);
                sendEmptyMessageDelayed(0, i);
            }
            this.f43067 = true;
            return;
        }
        if (iUptimeMillis < 300) {
            this.f43067 = true;
            c6606.invalidate();
            removeMessages(0);
            sendEmptyMessage(0);
            return;
        }
        if (this.f43067) {
            this.f43067 = false;
            c6606.invalidate();
        }
    }
}
