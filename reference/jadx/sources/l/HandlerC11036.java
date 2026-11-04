package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۤܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J5HS */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC11036 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f34840;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f34841;

    public HandlerC11036(C19987 c19987) {
        super(Looper.getMainLooper());
        this.f34841 = false;
        this.f34840 = new WeakReference(c19987);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C19987 c19987 = (C19987) this.f34840.get();
        if (c19987 == null) {
            return;
        }
        if (c19987.m45939()) {
            c19987.f64219 = SystemClock.uptimeMillis();
            removeMessages(0);
            sendEmptyMessageDelayed(0, 1500L);
            return;
        }
        int iUptimeMillis = (int) ((SystemClock.uptimeMillis() - c19987.f64219) - 1500);
        if (iUptimeMillis < 0) {
            int i = -iUptimeMillis;
            if (i < 1500) {
                removeMessages(0);
                sendEmptyMessageDelayed(0, i);
            }
            this.f34841 = true;
            return;
        }
        if (iUptimeMillis < 300) {
            this.f34841 = true;
            c19987.invalidate();
            removeMessages(0);
            sendEmptyMessage(0);
            return;
        }
        if (this.f34841) {
            this.f34841 = false;
            c19987.invalidate();
        }
    }
}
