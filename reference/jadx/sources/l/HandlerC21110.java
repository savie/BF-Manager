package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import bin.mt.plugin.api.util.UIUpdaterGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩶ۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 87OT */
/* JADX INFO: loaded from: classes5.dex */
public class HandlerC21110 extends Handler {
    public HandlerC21110(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        UIUpdaterGroup uIUpdaterGroup = (UIUpdaterGroup) ((WeakReference) message.obj).get();
        if (uIUpdaterGroup != null) {
            uIUpdaterGroup.processPendingUpdates();
        }
    }
}
