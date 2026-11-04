package l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: l.֡ܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BLU */
/* JADX INFO: loaded from: classes2.dex */
public final class ServiceConnectionC0551 implements ServiceConnection {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19196 f2284;

    public ServiceConnectionC0551(C19196 c19196) {
        this.f2284 = c19196;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC10245 interfaceC10245;
        C19196 c19196 = this.f2284;
        int i = AbstractBinderC21434.f68390;
        if (iBinder == null) {
            interfaceC10245 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC10245)) {
                C14720 c14720 = new C14720();
                c14720.f48114 = iBinder;
                interfaceC10245 = c14720;
            } else {
                interfaceC10245 = (InterfaceC10245) iInterfaceQueryLocalInterface;
            }
        }
        c19196.f62071 = interfaceC10245;
        synchronized (this.f2284.f62075) {
            this.f2284.f62075.notify();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f2284.f62071 = null;
    }
}
