package l;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.umeng.analytics.pro.am;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5R1 */
/* JADX INFO: loaded from: classes5.dex */
public class ResultReceiverC20319 extends ResultReceiver {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public WeakReference f65202;

    public ResultReceiverC20319(C6149 c6149) {
        super(null);
        this.f65202 = new WeakReference(c6149);
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        C6149 c6149 = (C6149) this.f65202.get();
        if (c6149 == null || bundle == null) {
            return;
        }
        synchronized (c6149.f20980) {
            c6149.f20981.m37332(AbstractBinderC24795.m55315(bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER")));
            C15600 c15600 = c6149.f20981;
            InterfaceC12239 interfaceC12239M38084 = null;
            try {
                Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                if (bundle2 != null) {
                    bundle2.setClassLoader(C23428.class.getClassLoader());
                    Parcelable parcelable = bundle2.getParcelable(am.av);
                    if (!(parcelable instanceof C15968)) {
                        throw new IllegalArgumentException("Invalid parcel");
                    }
                    interfaceC12239M38084 = ((C15968) parcelable).m38084();
                }
            } catch (RuntimeException unused) {
            }
            c15600.m37331(interfaceC12239M38084);
            c6149.m17750();
        }
    }
}
