package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸᩵᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: N4W1 */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC23036 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f74752;

    public HandlerC23036(C17311 c17311) {
        super(Looper.getMainLooper());
        this.f74752 = new WeakReference(c17311);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C17311 c17311 = (C17311) this.f74752.get();
        if (c17311 == null) {
            return;
        }
        if (message.what == -1) {
            c17311.invalidateSelf();
            return;
        }
        Iterator it = c17311.f56383.iterator();
        while (it.hasNext()) {
            ((InterfaceC1650) it.next()).m5937();
        }
    }
}
