package l;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩷۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4HH */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC21934 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C10745 c10745 = (C10745) ((WeakReference) message.obj).get();
        if (c10745 != null) {
            c10745.m27387();
        }
    }
}
