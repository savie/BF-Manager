package l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import java.util.HashSet;
import java.util.Iterator;
import moe.shizuku.server.IShizukuServiceConnection;

/* JADX INFO: renamed from: l.ۖܽ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: M98V */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2649 extends IShizukuServiceConnection.Stub {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Handler f10304 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ComponentName f10306;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashSet f10307 = new HashSet();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f10305 = false;

    public BinderC2649(C14170 c14170) {
        this.f10306 = c14170.f46504;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8175(ServiceConnection serviceConnection) {
        if (serviceConnection != null) {
            this.f10307.add(serviceConnection);
        }
    }

    @Override // moe.shizuku.server.IShizukuServiceConnection
    public final void connected(final IBinder iBinder) {
        f10304.post(new Runnable() { // from class: l.ۙܽ۟
            @Override // java.lang.Runnable
            public final void run() {
                BinderC2649.m8174(this.f16780, iBinder);
            }
        });
        try {
            iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: l.ܰܽ۟
                @Override // android.os.IBinder.DeathRecipient
                public final void binderDied() {
                    this.f45885.died();
                }
            }, 0);
        } catch (RemoteException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m8174(BinderC2649 binderC2649, IBinder iBinder) {
        Iterator it = binderC2649.f10307.iterator();
        while (it.hasNext()) {
            ((ServiceConnection) it.next()).onServiceConnected(binderC2649.f10306, iBinder);
        }
    }

    @Override // moe.shizuku.server.IShizukuServiceConnection
    public final void died() {
        if (this.f10305) {
            return;
        }
        this.f10305 = true;
        f10304.post(new Runnable() { // from class: l.ۨܽ۟
            @Override // java.lang.Runnable
            public final void run() {
                BinderC2649.m8173(this.f39713);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m8173(BinderC2649 binderC2649) {
        HashSet hashSet = binderC2649.f10307;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((ServiceConnection) it.next()).onServiceDisconnected(binderC2649.f10306);
        }
        hashSet.clear();
        C5472.m15139(binderC2649);
    }
}
