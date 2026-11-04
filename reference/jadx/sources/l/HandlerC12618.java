package l;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.ۨ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8UX */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC12618 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ServiceC4415 serviceC4415;
        if (message.what != 0 || ServiceC4415.f15846 == null || (serviceC4415 = (ServiceC4415) ServiceC4415.f15846.get()) == null) {
            return;
        }
        ServiceC4415.m14036(serviceC4415);
    }
}
