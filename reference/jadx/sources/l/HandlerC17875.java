package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܽ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N988 */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC17875 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f58579;

    public HandlerC17875(C16383 c16383) {
        super(Looper.getMainLooper());
        this.f58579 = new WeakReference(c16383);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C16383 c16383 = (C16383) this.f58579.get();
        if (c16383 != null) {
            C16383.m38879(c16383);
        }
    }
}
