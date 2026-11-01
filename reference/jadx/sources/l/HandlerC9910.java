package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.Selection;
import android.text.method.TextKeyListener;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۢ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC9910 extends Handler {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f33868;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f33869;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f33870;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f33871;

    public HandlerC9910(C6111 c6111) {
        super(Looper.getMainLooper());
        this.f33868 = false;
        this.f33870 = false;
        this.f33869 = new WeakReference(c6111);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C6111 c6111 = (C6111) this.f33869.get();
        if (c6111 != null) {
            switch (message.what) {
                case 1:
                    if (!c6111.f20725) {
                        c6111.m16629(Selection.getSelectionEnd(c6111.f20708), false);
                    }
                    break;
                case 2:
                    c6111.m16946(-1);
                    break;
                case 3:
                    if (c6111.f20827) {
                        c6111.m16787();
                        this.f33868 = true;
                    } else {
                        int iUptimeMillis = (int) ((SystemClock.uptimeMillis() - c6111.f20830) - 1500);
                        if (iUptimeMillis < 0) {
                            int i = -iUptimeMillis;
                            if (i < 1500) {
                                removeMessages(3);
                                sendEmptyMessageDelayed(3, i);
                            }
                            this.f33868 = true;
                        } else if (iUptimeMillis < 300) {
                            this.f33868 = true;
                            c6111.invalidate();
                            removeMessages(3);
                            sendEmptyMessage(3);
                        } else if (this.f33868) {
                            this.f33868 = false;
                            c6111.invalidate();
                        }
                    }
                    break;
                case 4:
                    if (!this.f33871) {
                        c6111.invalidate();
                        sendEmptyMessageAtTime(4, SystemClock.uptimeMillis() + 500);
                        break;
                    }
                    break;
                case 5:
                    if (c6111.f20754) {
                        c6111.m16703();
                        this.f33870 = true;
                    } else {
                        int iUptimeMillis2 = (int) ((SystemClock.uptimeMillis() - c6111.f20803) - 1500);
                        if (iUptimeMillis2 < 0) {
                            int i2 = -iUptimeMillis2;
                            if (i2 < 1500) {
                                removeMessages(5);
                                sendEmptyMessageDelayed(5, i2);
                            }
                            this.f33870 = true;
                        } else if (iUptimeMillis2 < 300) {
                            this.f33870 = true;
                            c6111.invalidate();
                            removeMessages(5);
                            sendEmptyMessage(5);
                        } else if (this.f33870) {
                            this.f33870 = false;
                            c6111.invalidate();
                        }
                    }
                    break;
                case 6:
                    TextKeyListener textKeyListener = C6111.f20699;
                    c6111.invalidate();
                    InterfaceC18708 interfaceC18708 = c6111.f20794.f6389;
                    if (interfaceC18708 != null) {
                        interfaceC18708.mo19404();
                    }
                    break;
                case 7:
                    c6111.f20764.mo14802();
                    c6111.m16633();
                    break;
                case 8:
                    C6111.m16754(c6111);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25110() {
        if (this.f33871) {
            return;
        }
        removeMessages(4);
        this.f33871 = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m25111() {
        this.f33871 = false;
        C6111 c6111 = (C6111) this.f33869.get();
        if (c6111 == null || this.f33871) {
            return;
        }
        c6111.invalidate();
        sendEmptyMessageAtTime(4, SystemClock.uptimeMillis() + 500);
    }
}
