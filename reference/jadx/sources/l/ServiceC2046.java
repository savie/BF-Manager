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

/* JADX INFO: renamed from: l.֫᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1RW */
/* JADX INFO: loaded from: classes2.dex */
public class ServiceC2046 extends Service {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f7621;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public WifiManager.WifiLock f7622;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public PowerManager.WakeLock f7624;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final BinderC14748 f7623 = new BinderC14748(this);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver f7625 = new C23920(this);

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("MTerm", getString(R.string.MT_Protector), 3));
        }
        m6548();
        C21843.m48614(this).m48617(this.f7625, new IntentFilter("bin.mt.term.TerminalService.ACTION_CLOSE_ALL_SESSIONS"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        m6548();
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
        BinderC14748 binderC14748 = this.f7623;
        switch (b) {
            case 0:
                binderC14748.m35357(false);
                return 2;
            case 1:
                stopSelf();
                return 2;
            case 2:
                binderC14748.m35365(false);
                return 2;
            default:
                return 2;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        BinderC14748 binderC14748 = this.f7623;
        binderC14748.m35350();
        binderC14748.m35365(false);
        stopForeground(true);
        C21843.m48614(this).m48616(this.f7625);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6541() {
        C21843.m48614(C16737.m39277()).m48619(new Intent("bin.mt.term.TerminalService.ACTION_CLOSE_ALL_SESSIONS"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m6548() {
        Intent intentAddFlags = new Intent(this, (Class<?>) ViewOnLayoutChangeListenerC3333.class).addFlags(268435456);
        C3577 c3577 = new C3577(this, "MTerm");
        c3577.m10584(C0690.f2931.f2944.m35072());
        c3577.m10592();
        c3577.m10586(getString(R.string.MT_Protector));
        Resources resources = getResources();
        BinderC14748 binderC14748 = this.f7623;
        c3577.m10585((CharSequence) resources.getQuantityString(R.plurals.MT_Protector, binderC14748.f48241.size(), Integer.valueOf(binderC14748.f48241.size())));
        c3577.m10583(PendingIntent.getActivity(this, 0, intentAddFlags, 67108864));
        c3577.m10590();
        c3577.m10588(false);
        c3577.m10582(android.R.drawable.ic_delete, getString(R.string.MT_Protector), PendingIntent.getService(this, 0, new Intent(this, (Class<?>) ServiceC2046.class).setAction("bin.mt.term.TerminalService.ACTION_EXIT"), 67108864));
        ServiceC2046 serviceC2046 = binderC14748.f48242;
        if (serviceC2046.f7624 != null || serviceC2046.f7622 != null) {
            c3577.m10582(android.R.drawable.ic_lock_lock, getString(R.string.MT_Protector), PendingIntent.getService(this, 0, new Intent(this, (Class<?>) ServiceC2046.class).setAction("bin.mt.term.TerminalService.ACTION_RELEASE_LOCK"), 67108864));
        } else {
            c3577.m10582(android.R.drawable.ic_lock_lock, getString(R.string.MT_Protector), PendingIntent.getService(this, 0, new Intent(this, (Class<?>) ServiceC2046.class).setAction("bin.mt.term.TerminalService.ACTION_ACQUIRE_LOCK"), 67108864));
        }
        startForeground(b.d, c3577.m10581());
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        m6548();
        return this.f7623;
    }
}
