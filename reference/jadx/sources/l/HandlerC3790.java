package l;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۘ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAJH */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC3790 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC17902 abstractC17902 = (AbstractC17902) ((WeakReference) message.obj).get();
        if (abstractC17902 != null) {
            abstractC17902.f56709.mo23642(abstractC17902);
        }
    }
}
