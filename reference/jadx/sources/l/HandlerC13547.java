package l;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.۬ۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A151 */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC13547 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC6836 f43028;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final WeakReference f43029;

    public HandlerC13547(Object obj, InterfaceC6836 interfaceC6836) {
        this.f43029 = new WeakReference(obj);
        this.f43028 = interfaceC6836;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj = this.f43029.get();
        if (obj != null) {
            this.f43028.mo14768(obj, message);
        } else {
            this.f43028 = null;
        }
    }
}
