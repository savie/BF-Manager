package l;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩹᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5GW */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC23817 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f77138;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f77139 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final WeakReference f77140;

    public HandlerC23817(C12628 c12628) {
        this.f77140 = new WeakReference(c12628);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m53143() {
        this.f77138 = false;
        removeMessages(0);
        sendEmptyMessageDelayed(0, 500L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53142() {
        removeMessages(0);
        this.f77138 = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C12628 c12628 = (C12628) this.f77140.get();
        if (c12628 == null) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            if (this.f77138) {
                return;
            }
            if (c12628.f40530.m36672()) {
                c12628.invalidate();
            }
            sendEmptyMessageDelayed(0, 500L);
            return;
        }
        if (i == 2) {
            C12628.m31344(c12628);
            return;
        }
        if (i != 3) {
            return;
        }
        int iUptimeMillis = (int) ((SystemClock.uptimeMillis() - c12628.f40518) - 1500);
        if (iUptimeMillis < 0) {
            int i2 = -iUptimeMillis;
            if (i2 < 1500) {
                removeMessages(3);
                sendEmptyMessageDelayed(3, i2);
            }
            this.f77139 = true;
            return;
        }
        if (iUptimeMillis < 300) {
            this.f77139 = true;
            c12628.invalidate();
            removeMessages(3);
            sendEmptyMessage(3);
            return;
        }
        if (this.f77139) {
            this.f77139 = false;
            c12628.invalidate();
        }
    }
}
