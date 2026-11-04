package l;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC24662 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f79825;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public WeakReference f79826;

    public HandlerC24662(C3032 c3032) {
        this.f79825 = new WeakReference(c3032);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference weakReference = this.f79826;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        WeakReference weakReference2 = this.f79825;
        if (weakReference2.get() == null) {
            return;
        }
        Bundle data = message.getData();
        C13363.m32945(data);
        InterfaceC6016 interfaceC6016 = (InterfaceC6016) weakReference2.get();
        Messenger messenger = (Messenger) this.f79826.get();
        try {
            int i = message.what;
            if (i == 1) {
                C13363.m32945(data.getBundle("data_root_hints"));
                data.getString("data_media_item_id");
                interfaceC6016.mo9843();
                return;
            }
            if (i == 2) {
                interfaceC6016.mo9839();
                return;
            }
            if (i == 3) {
                Bundle bundle = data.getBundle("data_options");
                C13363.m32945(bundle);
                C13363.m32945(data.getBundle("data_notify_children_changed_options"));
                String string = data.getString("data_media_item_id");
                data.getParcelableArrayList("data_media_item_list");
                interfaceC6016.mo9840(messenger, string, bundle);
                return;
            }
            message.toString();
        } catch (BadParcelableException unused) {
            if (message.what == 1) {
                interfaceC6016.mo9839();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55015(Messenger messenger) {
        this.f79826 = new WeakReference(messenger);
    }
}
