package l;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;

/* JADX INFO: renamed from: l.֫ܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BM6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2065 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Context f6868 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ServiceConnection f6869;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC13251 f6870;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m7136(Context context) {
        this.f6868 = context;
        this.f6869 = new ServiceConnectionC5794(this);
        Intent intent = new Intent();
        intent.setClassName("org.repackage.com.zui.deviceidservice", "org.repackage.com.zui.deviceidservice.DeviceidService");
        return this.f6868.bindService(intent, this.f6869, 1) ? 1 : -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m7137() {
        if (this.f6868 == null) {
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        try {
            InterfaceC13251 interfaceC13251 = this.f6870;
            if (interfaceC13251 != null) {
                return interfaceC13251.a();
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m7138() {
        try {
            InterfaceC13251 interfaceC13251 = this.f6870;
            if (interfaceC13251 != null) {
                return interfaceC13251.c();
            }
            return false;
        } catch (RemoteException unused) {
            return false;
        }
    }
}
