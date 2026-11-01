package l;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۤۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A151 */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC10184 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC8773 f34809;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final WeakReference f34810;

    public HandlerC10184(Object obj, InterfaceC8773 interfaceC8773) {
        this.f34810 = new WeakReference(obj);
        this.f34809 = interfaceC8773;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj = this.f34810.get();
        if (obj != null) {
            this.f34809.mo5624(obj, message);
        } else {
            this.f34809 = null;
        }
    }
}
