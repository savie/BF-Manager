package l;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܰۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAJH */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC14424 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC18900 abstractC18900 = (AbstractC18900) ((WeakReference) message.obj).get();
        if (abstractC18900 != null) {
            abstractC18900.f61338.mo40353(abstractC18900);
        }
    }
}
