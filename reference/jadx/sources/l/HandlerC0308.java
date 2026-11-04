package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.Selection;
import android.text.method.TextKeyListener;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.֡۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC0308 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f1653;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f1654;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f1655;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f1656;

    public HandlerC0308(C24132 c24132) {
        super(Looper.getMainLooper());
        this.f1656 = false;
        this.f1654 = false;
        this.f1653 = new WeakReference(c24132);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C24132 c24132 = (C24132) this.f1653.get();
        if (c24132 != null) {
            switch (message.what) {
                case 1:
                    if (!c24132.f78134) {
                        c24132.m53776(Selection.getSelectionEnd(c24132.f78058), false);
                    }
                    break;
                case 2:
                    c24132.m53956(-1);
                    break;
                case 3:
                    if (c24132.f78054) {
                        c24132.m53677();
                        this.f1656 = true;
                    } else {
                        int iUptimeMillis = (int) ((SystemClock.uptimeMillis() - c24132.f78028) - 1500);
                        if (iUptimeMillis < 0) {
                            int i = -iUptimeMillis;
                            if (i < 1500) {
                                removeMessages(3);
                                sendEmptyMessageDelayed(3, i);
                            }
                            this.f1656 = true;
                        } else if (iUptimeMillis < 300) {
                            this.f1656 = true;
                            c24132.invalidate();
                            removeMessages(3);
                            sendEmptyMessage(3);
                        } else if (this.f1656) {
                            this.f1656 = false;
                            c24132.invalidate();
                        }
                    }
                    break;
                case 4:
                    if (!this.f1655) {
                        c24132.invalidate();
                        sendEmptyMessageAtTime(4, SystemClock.uptimeMillis() + 500);
                        break;
                    }
                    break;
                case 5:
                    if (c24132.f78105) {
                        c24132.m53757();
                        this.f1654 = true;
                    } else {
                        int iUptimeMillis2 = (int) ((SystemClock.uptimeMillis() - c24132.f77982) - 1500);
                        if (iUptimeMillis2 < 0) {
                            int i2 = -iUptimeMillis2;
                            if (i2 < 1500) {
                                removeMessages(5);
                                sendEmptyMessageDelayed(5, i2);
                            }
                            this.f1654 = true;
                        } else if (iUptimeMillis2 < 300) {
                            this.f1654 = true;
                            c24132.invalidate();
                            removeMessages(5);
                            sendEmptyMessage(5);
                        } else if (this.f1654) {
                            this.f1654 = false;
                            c24132.invalidate();
                        }
                    }
                    break;
                case 6:
                    TextKeyListener textKeyListener = C24132.f77977;
                    c24132.invalidate();
                    InterfaceC14499 interfaceC14499 = c24132.f78066.f45791;
                    if (interfaceC14499 != null) {
                        interfaceC14499.mo7836();
                    }
                    break;
                case 7:
                    c24132.f78022.mo25235();
                    c24132.m53738();
                    break;
                case 8:
                    C24132.m53768(c24132);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1895() {
        if (this.f1655) {
            return;
        }
        removeMessages(4);
        this.f1655 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m1896() {
        this.f1655 = false;
        C24132 c24132 = (C24132) this.f1653.get();
        if (c24132 == null || this.f1655) {
            return;
        }
        c24132.invalidate();
        sendEmptyMessageAtTime(4, SystemClock.uptimeMillis() + 500);
    }
}
