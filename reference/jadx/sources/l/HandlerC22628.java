package l;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC22628 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f73728;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public WeakReference f73729;

    public HandlerC22628(C7811 c7811) {
        this.f73728 = new WeakReference(c7811);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference weakReference = this.f73729;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        WeakReference weakReference2 = this.f73728;
        if (weakReference2.get() == null) {
            return;
        }
        Bundle data = message.getData();
        C1148.m4220(data);
        InterfaceC9928 interfaceC9928 = (InterfaceC9928) weakReference2.get();
        Messenger messenger = (Messenger) this.f73729.get();
        try {
            int i = message.what;
            if (i == 1) {
                C1148.m4220(data.getBundle("data_root_hints"));
                data.getString("data_media_item_id");
                interfaceC9928.mo20508();
                return;
            }
            if (i == 2) {
                interfaceC9928.mo20504();
                return;
            }
            if (i == 3) {
                Bundle bundle = data.getBundle("data_options");
                C1148.m4220(bundle);
                C1148.m4220(data.getBundle("data_notify_children_changed_options"));
                String string = data.getString("data_media_item_id");
                data.getParcelableArrayList("data_media_item_list");
                interfaceC9928.mo20505(messenger, string, bundle);
                return;
            }
            message.toString();
        } catch (BadParcelableException unused) {
            if (message.what == 1) {
                interfaceC9928.mo20504();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50158(Messenger messenger) {
        this.f73729 = new WeakReference(messenger);
    }
}
