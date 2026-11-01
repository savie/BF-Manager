package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۘ᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: XA43 */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC4261 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f15389;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final WeakReference f15390;

    public HandlerC4261(C7084 c7084) {
        super(Looper.getMainLooper());
        this.f15389 = 1000L;
        this.f15390 = new WeakReference(c7084);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C7084 c7084 = (C7084) this.f15390.get();
        if (c7084 == null || c7084.getChildCount() == 0 || c7084.getVisibility() != 0) {
            return;
        }
        View childAt = c7084.getChildAt(0);
        int width = childAt.getWidth();
        int width2 = c7084.getWidth();
        if (width2 == 0 || width == 0) {
            sendMessageDelayed(obtainMessage(0, message.arg1, 0), 10L);
            return;
        }
        if (width < width2) {
            return;
        }
        if (message.arg1 == 0) {
            childAt.scrollTo(-width, 0);
            sendMessageDelayed(obtainMessage(0, 1, 0), 8L);
            this.f15389 = 1000L;
        } else {
            if (childAt.getScrollX() > width) {
                childAt.scrollTo(-width, 0);
                sendMessageDelayed(obtainMessage(0, 1, 0), this.f15389);
                long j = this.f15389;
                if (j < 32000) {
                    this.f15389 = j * 2;
                    return;
                }
                return;
            }
            childAt.scrollBy(1, 0);
            sendMessageDelayed(obtainMessage(0, 1, 0), 8L);
        }
    }
}
