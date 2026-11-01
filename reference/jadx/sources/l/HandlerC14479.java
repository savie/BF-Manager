package l;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܳۧۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4HH */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC14479 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1777 c1777 = (C1777) ((WeakReference) message.obj).get();
        if (c1777 != null) {
            c1777.m5823();
        }
    }
}
