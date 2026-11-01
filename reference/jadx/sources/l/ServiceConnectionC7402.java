package l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: l.۟ۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19AV */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC7402 implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC3127 c1716;
        C0577.m2746("Shizuku service connected");
        int i = AbstractBinderC9479.f32076;
        if (iBinder == null) {
            c1716 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("bin.mt.shell.IShizukuCommand");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC3127)) {
                c1716 = (InterfaceC3127) iInterfaceQueryLocalInterface;
            } else {
                c1716 = new C1716(iBinder);
            }
        }
        C20808 c20808 = new C20808(c1716);
        C0346.m2012(c20808);
        for (C0346 c0346 : C0346.m2022()) {
            C0346.m2010(c0346, c20808);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C0577.m2746("Shizuku service disconnected");
        C0346.m2005();
    }
}
