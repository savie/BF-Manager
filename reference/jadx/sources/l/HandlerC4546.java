package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۙ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: XA43 */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC4546 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f16155;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final WeakReference f16156;

    public HandlerC4546(C21700 c21700) {
        super(Looper.getMainLooper());
        this.f16155 = 1000L;
        this.f16156 = new WeakReference(c21700);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C21700 c21700 = (C21700) this.f16156.get();
        if (c21700 == null || c21700.getChildCount() == 0 || c21700.getVisibility() != 0) {
            return;
        }
        View childAt = c21700.getChildAt(0);
        int width = childAt.getWidth();
        int width2 = c21700.getWidth();
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
            this.f16155 = 1000L;
        } else {
            if (childAt.getScrollX() > width) {
                childAt.scrollTo(-width, 0);
                sendMessageDelayed(obtainMessage(0, 1, 0), this.f16155);
                long j = this.f16155;
                if (j < 32000) {
                    this.f16155 = j * 2;
                    return;
                }
                return;
            }
            childAt.scrollBy(1, 0);
            sendMessageDelayed(obtainMessage(0, 1, 0), 8L);
        }
    }
}
