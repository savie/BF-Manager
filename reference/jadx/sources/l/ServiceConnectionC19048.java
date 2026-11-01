package l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: l.ᩴ᩹ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BLU */
/* JADX INFO: loaded from: classes4.dex */
public final class ServiceConnectionC19048 implements ServiceConnection {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19754 f61608;

    public ServiceConnectionC19048(C19754 c19754) {
        this.f61608 = c19754;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC9171 interfaceC9171;
        C19754 c19754 = this.f61608;
        int i = AbstractBinderC21870.f70964;
        if (iBinder == null) {
            interfaceC9171 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC9171)) {
                C15521 c15521 = new C15521();
                c15521.f50531 = iBinder;
                interfaceC9171 = c15521;
            } else {
                interfaceC9171 = (InterfaceC9171) iInterfaceQueryLocalInterface;
            }
        }
        c19754.f63477 = interfaceC9171;
        synchronized (this.f61608.f63476) {
            this.f61608.f63476.notify();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f61608.f63477 = null;
    }
}
