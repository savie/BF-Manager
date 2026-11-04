package l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: l.ۜ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19AV */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC7010 implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC23419 c17451;
        C20653.m47271("Shizuku service connected");
        int i = AbstractBinderC15959.f51826;
        if (iBinder == null) {
            c17451 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("bin.mt.shell.IShizukuCommand");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC23419)) {
                c17451 = (InterfaceC23419) iInterfaceQueryLocalInterface;
            } else {
                c17451 = new C17451(iBinder);
            }
        }
        C13721 c13721 = new C13721(c17451);
        C10695.m27251(c13721);
        for (C10695 c10695 : C10695.m27261()) {
            C10695.m27249(c10695, c13721);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C20653.m47271("Shizuku service disconnected");
        C10695.m27244();
    }
}
