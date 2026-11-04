package l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: l.ۛ᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: N1X5 */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC6758 implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        final InterfaceC23670 c17702;
        int i = AbstractBinderC16210.f52692;
        if (iBinder == null) {
            c17702 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("bin.mt.dstr.ipc.IJavaHookProbeAidlInterface");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC23670)) {
                c17702 = (InterfaceC23670) iInterfaceQueryLocalInterface;
            } else {
                c17702 = new C17702(iBinder);
            }
        }
        C5261.f18540.submit(new Runnable() { // from class: l.ۨ᩻᩸
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC6758 serviceConnectionC6758 = this.f40740;
                InterfaceC23670 interfaceC23670 = c17702;
                try {
                    C14960.f48866 = Boolean.valueOf(interfaceC23670.mo18392());
                } catch (Exception unused) {
                    C14960.f48866 = Boolean.FALSE;
                }
                try {
                    interfaceC23670.exit();
                } catch (Exception unused2) {
                }
                try {
                    C21576.m49084().unbindService(serviceConnectionC6758);
                } catch (Exception unused3) {
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (C14960.f48866 == null) {
            C14960.f48866 = Boolean.FALSE;
        }
    }
}
