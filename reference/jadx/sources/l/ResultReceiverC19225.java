package l;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.umeng.analytics.pro.am;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5R1 */
/* JADX INFO: loaded from: classes4.dex */
public class ResultReceiverC19225 extends ResultReceiver {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public WeakReference f62111;

    public ResultReceiverC19225(C10053 c10053) {
        super(null);
        this.f62111 = new WeakReference(c10053);
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        C10053 c10053 = (C10053) this.f62111.get();
        if (c10053 == null || bundle == null) {
            return;
        }
        synchronized (c10053.f34346) {
            c10053.f34345.m49482(AbstractBinderC22753.m50413(bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER")));
            C22316 c22316 = c10053.f34345;
            InterfaceC23389 interfaceC23389M30089 = null;
            try {
                Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                if (bundle2 != null) {
                    bundle2.setClassLoader(C17038.class.getClassLoader());
                    Parcelable parcelable = bundle2.getParcelable(am.av);
                    if (!(parcelable instanceof C12100)) {
                        throw new IllegalArgumentException("Invalid parcel");
                    }
                    interfaceC23389M30089 = ((C12100) parcelable).m30089();
                }
            } catch (RuntimeException unused) {
            }
            c22316.m49483(interfaceC23389M30089);
            c10053.m25448();
        }
    }
}
