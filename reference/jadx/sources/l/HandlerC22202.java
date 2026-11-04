package l;

import android.os.Handler;
import android.os.Message;
import com.alipay.sdk.m.u0.c;

/* JADX INFO: renamed from: l.᩷ܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: OBMG */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC22202 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 11) {
            C11013.f34776 = C11013.f34784.m8864(message.getData().getInt("type"), message.getData().getString(c.d));
            synchronized (C11013.f34782) {
                C11013.f34782.notify();
            }
        }
    }
}
