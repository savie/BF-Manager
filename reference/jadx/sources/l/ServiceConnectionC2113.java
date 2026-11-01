package l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: renamed from: l.֫᩹ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BM6 */
/* JADX INFO: loaded from: classes2.dex */
public final class ServiceConnectionC2113 implements ServiceConnection {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9876 f7766;

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f7766.f33724 = AbstractBinderC23987.m52822(iBinder);
    }

    public ServiceConnectionC2113(C9876 c9876) {
        this.f7766 = c9876;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f7766.f33724 = null;
    }
}
