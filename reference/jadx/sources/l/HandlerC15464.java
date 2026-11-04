package l;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.ܳܺ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K1X4 */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC15464 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj = message.obj;
        if (obj instanceof C5770) {
            C5770 c5770 = (C5770) obj;
            try {
                try {
                    c5770.f19826 = c5770.f19825.call();
                    c5770.f19828 = false;
                } catch (Throwable th) {
                    c5770.f19828 = false;
                    throw th;
                }
            } catch (Exception e) {
                c5770.f19827 = e;
                c5770.f19828 = false;
            } catch (Throwable th2) {
                c5770.f19827 = new Exception(th2);
                c5770.f19828 = false;
            }
        }
    }
}
