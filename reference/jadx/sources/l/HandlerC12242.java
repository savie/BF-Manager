package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: N4W1 */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC12242 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f40975;

    public HandlerC12242(C4479 c4479) {
        super(Looper.getMainLooper());
        this.f40975 = new WeakReference(c4479);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C4479 c4479 = (C4479) this.f40975.get();
        if (c4479 == null) {
            return;
        }
        if (message.what == -1) {
            c4479.invalidateSelf();
            return;
        }
        Iterator it = c4479.f15937.iterator();
        while (it.hasNext()) {
            ((InterfaceC14276) it.next()).m34443();
        }
    }
}
