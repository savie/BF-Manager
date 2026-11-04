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

/* JADX INFO: renamed from: l.ܽۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M98V */
/* JADX INFO: loaded from: classes5.dex */
public final class BinderC17272 extends IShizukuServiceConnection.Stub {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Handler f56263 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ComponentName f56266;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashSet f56265 = new HashSet();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f56264 = false;

    public BinderC17272(C15034 c15034) {
        this.f56266 = c15034.f49074;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40568(ServiceConnection serviceConnection) {
        if (serviceConnection != null) {
            this.f56265.add(serviceConnection);
        }
    }

    @Override // moe.shizuku.server.IShizukuServiceConnection
    public final void connected(final IBinder iBinder) {
        f56263.post(new Runnable() { // from class: l.ۧۖۘ
            @Override // java.lang.Runnable
            public final void run() {
                BinderC17272.m40567(this.f35640, iBinder);
            }
        });
        try {
            iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: l.᩻ۖۘ
                @Override // android.os.IBinder.DeathRecipient
                public final void binderDied() {
                    this.f80046.died();
                }
            }, 0);
        } catch (RemoteException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40567(BinderC17272 binderC17272, IBinder iBinder) {
        Iterator it = binderC17272.f56265.iterator();
        while (it.hasNext()) {
            ((ServiceConnection) it.next()).onServiceConnected(binderC17272.f56266, iBinder);
        }
    }

    @Override // moe.shizuku.server.IShizukuServiceConnection
    public final void died() {
        if (this.f56264) {
            return;
        }
        this.f56264 = true;
        f56263.post(new Runnable() { // from class: l.ܺۖۘ
            @Override // java.lang.Runnable
            public final void run() {
                BinderC17272.m40566(this.f53501);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40566(BinderC17272 binderC17272) {
        HashSet hashSet = binderC17272.f56265;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((ServiceConnection) it.next()).onServiceDisconnected(binderC17272.f56266);
        }
        hashSet.clear();
        C15780.m37717(binderC17272);
    }
}
