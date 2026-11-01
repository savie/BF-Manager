package l;

import android.os.Handler;
import android.os.Message;
import com.alipay.sdk.m.u0.c;

/* JADX INFO: renamed from: l.۫᩹ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBMG */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC12698 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 11) {
            C17636.f56046 = C17636.f56052.m4602(message.getData().getInt("type"), message.getData().getString(c.d));
            synchronized (C17636.f56053) {
                C17636.f56053.notify();
            }
        }
    }
}
