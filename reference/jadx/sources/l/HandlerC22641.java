package l;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.᩺֡۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8UX */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC22641 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ServiceC17701 serviceC17701;
        if (message.what != 0 || ServiceC17701.f56204 == null || (serviceC17701 = (ServiceC17701) ServiceC17701.f56204.get()) == null) {
            return;
        }
        ServiceC17701.m41230(serviceC17701);
    }
}
