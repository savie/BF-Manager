package l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: l.᩺᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: N1X5 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC24658 implements ServiceConnection {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14960 f79818;

    public ServiceConnectionC24658(C14960 c14960) {
        this.f79818 = c14960;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC16956 c11735;
        int i = AbstractBinderC25162.f81353;
        if (iBinder == null) {
            c11735 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC16956)) {
                c11735 = (InterfaceC16956) iInterfaceQueryLocalInterface;
            } else {
                c11735 = new C11735(iBinder);
            }
        }
        this.f79818.f48868 = c11735;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f79818.f48868 = null;
    }
}
