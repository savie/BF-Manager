package l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: renamed from: l.ۚܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BM6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC5794 implements ServiceConnection {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2065 f19895;

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f19895.f6870 = AbstractBinderC15488.m37049(iBinder);
    }

    public ServiceConnectionC5794(C2065 c2065) {
        this.f19895 = c2065;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f19895.f6870 = null;
    }
}
