package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.۟ܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC7587 extends Handler {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final WeakReference f25114;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f25115;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f25116;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f25117;

    public HandlerC7587(C12527 c12527) {
        super(Looper.getMainLooper());
        this.f25114 = new WeakReference(c12527);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C12527 c12527 = (C12527) this.f25114.get();
        if (c12527 != null) {
            c12527.m31125();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20107(long j) {
        this.f25116 = j;
        this.f25115 = true;
        removeMessages(0);
        if (this.f25117) {
            return;
        }
        sendEmptyMessageDelayed(0, j);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m20108() {
        if (!this.f25115 || this.f25117) {
            return;
        }
        removeMessages(0);
        sendEmptyMessageDelayed(0, this.f25116);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m20109() {
        this.f25117 = true;
        removeMessages(0);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m20105() {
        if (this.f25117) {
            this.f25117 = false;
            if (this.f25115) {
                removeMessages(0);
                sendEmptyMessageDelayed(0, this.f25116);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20106() {
        this.f25115 = false;
        this.f25117 = false;
        removeMessages(0);
    }
}
