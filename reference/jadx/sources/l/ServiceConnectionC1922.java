package l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes2.dex */
public final class ServiceConnectionC1922 implements ServiceConnection {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC3333 f7272;

    public ServiceConnectionC1922(ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333) {
        this.f7272 = viewOnLayoutChangeListenerC3333;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f7272.runOnUiThread(new Runnable() { // from class: l.ܳܺۜ
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333 = this.f47855.f7272;
                viewOnLayoutChangeListenerC3333.f12352 = (BinderC14748) iBinder;
                Iterator it = viewOnLayoutChangeListenerC3333.f12355.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                viewOnLayoutChangeListenerC3333.f12355.clear();
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333 = this.f7272;
        if (viewOnLayoutChangeListenerC3333.isFinishing()) {
            return;
        }
        viewOnLayoutChangeListenerC3333.finish();
    }
}
