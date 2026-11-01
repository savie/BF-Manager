package l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: l.ܺ᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1X5 */
/* JADX INFO: loaded from: classes4.dex */
public final class ServiceConnectionC16239 implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        final InterfaceC8954 c8248;
        int i = AbstractBinderC19537.f62808;
        if (iBinder == null) {
            c8248 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("bin.mt.dstr.ipc.IJavaHookProbeAidlInterface");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC8954)) {
                c8248 = (InterfaceC8954) iInterfaceQueryLocalInterface;
            } else {
                c8248 = new C8248(iBinder);
            }
        }
        C4716.f16636.submit(new Runnable() { // from class: l.᩷᩺ۖ
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC16239 serviceConnectionC16239 = this.f68961;
                InterfaceC8954 interfaceC8954 = c8248;
                try {
                    C16944.f54164 = Boolean.valueOf(interfaceC8954.mo21638());
                } catch (Exception unused) {
                    C16944.f54164 = Boolean.FALSE;
                }
                try {
                    interfaceC8954.exit();
                } catch (Exception unused2) {
                }
                try {
                    C16737.m39277().unbindService(serviceConnectionC16239);
                } catch (Exception unused3) {
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (C16944.f54164 == null) {
            C16944.f54164 = Boolean.FALSE;
        }
    }
}
