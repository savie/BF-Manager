package l;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܳ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AJG */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC15002 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C12765 c12765 = (C12765) ((WeakReference) message.obj).get();
        if (c12765 != null) {
            c12765.m31628();
        }
    }
}
