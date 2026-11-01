package l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: l.᩶᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1X5 */
/* JADX INFO: loaded from: classes4.dex */
public final class ServiceConnectionC20472 implements ServiceConnection {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16944 f66411;

    public ServiceConnectionC20472(C16944 c16944) {
        this.f66411 = c16944;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC18831 c21653;
        int i = AbstractBinderC18125.f57950;
        if (iBinder == null) {
            c21653 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC18831)) {
                c21653 = (InterfaceC18831) iInterfaceQueryLocalInterface;
            } else {
                c21653 = new C21653(iBinder);
            }
        }
        this.f66411.f54168 = c21653;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f66411.f54168 = null;
    }
}
