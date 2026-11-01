package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܺܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N988 */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC15972 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f51738;

    public HandlerC15972(C20205 c20205) {
        super(Looper.getMainLooper());
        this.f51738 = new WeakReference(c20205);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C20205 c20205 = (C20205) this.f51738.get();
        if (c20205 != null) {
            C20205.m45659(c20205);
        }
    }
}
