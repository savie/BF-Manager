package l;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import bin.mt.plus.R;
import com.alipay.sdk.m.t0.b;

/* JADX INFO: renamed from: l.ܽۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J1RW */
/* JADX INFO: loaded from: classes4.dex */
public class ServiceC17530 extends Service {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public PowerManager.WakeLock f56977;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public WifiManager.WifiLock f56978;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f56980;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final BinderC16784 f56979 = new BinderC16784(this);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver f56981 = new C24990(this);

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("MTerm", getString(R.string.MT_Protector), 3));
        }
        m41164();
        C7247.m19877(this).m19880(this.f56981, new IntentFilter("bin.mt.term.TerminalService.ACTION_CLOSE_ALL_SESSIONS"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        m41164();
        String action = intent.getAction();
        if (action == null) {
            action = "";
        }
        byte b = -1;
        switch (action.hashCode()) {
            case -2127222010:
                if (action.equals("bin.mt.term.TerminalService.ACTION_ACQUIRE_LOCK")) {
                    b = 0;
                }
                break;
            case -1989614832:
                if (action.equals("bin.mt.term.TerminalService.ACTION_EXIT")) {
                    b = 1;
                }
                break;
            case 435239541:
                if (action.equals("bin.mt.term.TerminalService.ACTION_RELEASE_LOCK")) {
                    b = 2;
                }
                break;
        }
        BinderC16784 binderC16784 = this.f56979;
        switch (b) {
            case 0:
                binderC16784.m39635(false);
                return 2;
            case 1:
                stopSelf();
                return 2;
            case 2:
                binderC16784.m39645(false);
                return 2;
            default:
                return 2;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        BinderC16784 binderC16784 = this.f56979;
        binderC16784.m39628();
        binderC16784.m39645(false);
        stopForeground(true);
        C7247.m19877(this).m19879(this.f56981);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41157() {
        C7247.m19877(C21576.m49084()).m19882(new Intent("bin.mt.term.TerminalService.ACTION_CLOSE_ALL_SESSIONS"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m41164() {
        Intent intentAddFlags = new Intent(this, (Class<?>) ViewOnLayoutChangeListenerC6673.class).addFlags(268435456);
        C3558 c3558 = new C3558(this, "MTerm");
        c3558.m11592(C20613.f66084.f66117.m30078());
        c3558.m11599();
        c3558.m11594(getString(R.string.MT_Protector));
        Resources resources = getResources();
        BinderC16784 binderC16784 = this.f56979;
        c3558.m11593((CharSequence) resources.getQuantityString(R.plurals.MT_Protector, binderC16784.f54161.size(), Integer.valueOf(binderC16784.f54161.size())));
        c3558.m11591(PendingIntent.getActivity(this, 0, intentAddFlags, 67108864));
        c3558.m11597();
        c3558.m11596(false);
        c3558.m11590(android.R.drawable.ic_delete, getString(R.string.MT_Protector), PendingIntent.getService(this, 0, new Intent(this, (Class<?>) ServiceC17530.class).setAction("bin.mt.term.TerminalService.ACTION_EXIT"), 67108864));
        ServiceC17530 serviceC17530 = binderC16784.f54158;
        if (serviceC17530.f56977 != null || serviceC17530.f56978 != null) {
            c3558.m11590(android.R.drawable.ic_lock_lock, getString(R.string.MT_Protector), PendingIntent.getService(this, 0, new Intent(this, (Class<?>) ServiceC17530.class).setAction("bin.mt.term.TerminalService.ACTION_RELEASE_LOCK"), 67108864));
        } else {
            c3558.m11590(android.R.drawable.ic_lock_lock, getString(R.string.MT_Protector), PendingIntent.getService(this, 0, new Intent(this, (Class<?>) ServiceC17530.class).setAction("bin.mt.term.TerminalService.ACTION_ACQUIRE_LOCK"), 67108864));
        }
        startForeground(b.d, c3558.m11589());
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        m41164();
        return this.f56979;
    }
}
