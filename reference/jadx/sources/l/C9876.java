package l;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;

/* JADX INFO: renamed from: l.ۢ᩹ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BM6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9876 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Context f33722 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ServiceConnection f33723;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC14815 f33724;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24968(Context context) {
        this.f33722 = context;
        this.f33723 = new ServiceConnectionC2113(this);
        Intent intent = new Intent();
        intent.setClassName("org.repackage.com.zui.deviceidservice", "org.repackage.com.zui.deviceidservice.DeviceidService");
        return this.f33722.bindService(intent, this.f33723, 1) ? 1 : -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m24969() {
        if (this.f33722 == null) {
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        try {
            InterfaceC14815 interfaceC14815 = this.f33724;
            if (interfaceC14815 != null) {
                return interfaceC14815.a();
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m24970() {
        try {
            InterfaceC14815 interfaceC14815 = this.f33724;
            if (interfaceC14815 != null) {
                return interfaceC14815.c();
            }
            return false;
        } catch (RemoteException unused) {
            return false;
        }
    }
}
