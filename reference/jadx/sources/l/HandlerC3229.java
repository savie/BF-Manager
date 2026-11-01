package l;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۗ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AJG */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC3229 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C4785 c4785 = (C4785) ((WeakReference) message.obj).get();
        if (c4785 != null) {
            c4785.m13275();
        }
    }
}
