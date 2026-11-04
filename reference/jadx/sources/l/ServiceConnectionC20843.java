package l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes5.dex */
public final class ServiceConnectionC20843 implements ServiceConnection {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC6673 f66735;

    public ServiceConnectionC20843(ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673) {
        this.f66735 = viewOnLayoutChangeListenerC6673;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f66735.runOnUiThread(new Runnable() { // from class: l.ۗ᩷᩻
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673 = this.f12682.f66735;
                viewOnLayoutChangeListenerC6673.f22254 = (BinderC16784) iBinder;
                Iterator it = viewOnLayoutChangeListenerC6673.f22249.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                viewOnLayoutChangeListenerC6673.f22249.clear();
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673 = this.f66735;
        if (viewOnLayoutChangeListenerC6673.isFinishing()) {
            return;
        }
        viewOnLayoutChangeListenerC6673.finish();
    }
}
