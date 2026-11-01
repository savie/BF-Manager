package l;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.ۘܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1X4 */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC4013 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj = message.obj;
        if (obj instanceof C23065) {
            C23065 c23065 = (C23065) obj;
            try {
                try {
                    c23065.f74938 = c23065.f74937.call();
                    c23065.f74936 = false;
                } catch (Throwable th) {
                    c23065.f74936 = false;
                    throw th;
                }
            } catch (Exception e) {
                c23065.f74939 = e;
                c23065.f74936 = false;
            } catch (Throwable th2) {
                c23065.f74939 = new Exception(th2);
                c23065.f74936 = false;
            }
        }
    }
}
