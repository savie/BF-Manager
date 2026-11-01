package l;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import bin.mt.plus.R;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7AT */
/* JADX INFO: loaded from: classes2.dex */
public class ServiceC4538 extends Service {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f16137 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C2025 f16138;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C2025 f16139;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public WifiManager.WifiLock f16140;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f16141;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f16142;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C19729 f16143;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public PowerManager.WakeLock f16144;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C8377 f16145;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static boolean m12674() {
        C2025 c2025 = f16138;
        return c2025 != null && c2025.m39653();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static String m12676() {
        C2025 c2025 = f16138;
        if (c2025 == null || !c2025.m39653()) {
            return null;
        }
        return c2025.m6515();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static long m12671() {
        C2025 c2025 = f16138;
        if (c2025 == null || !c2025.m39653()) {
            return 0L;
        }
        return c2025.m6517();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static long m12664() {
        int i = C2025.f7547;
        return C2004.m6447();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static ArrayList m12665() {
        C2025 c2025 = f16138;
        if (c2025 != null && c2025.m39653()) {
            return c2025.m6518();
        }
        C1299 c1299 = new C1299();
        ArrayList arrayList = new ArrayList();
        Iterator it = c1299.m4643().iterator();
        while (it.hasNext()) {
            arrayList.add(C1299.m4639((C22467) it.next()));
        }
        C1299.m4642(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m12670(String str) {
        C2025 c2025 = f16138;
        if (c2025 != null && c2025.m39653()) {
            return c2025.m6514(str);
        }
        return new C1299().m4645(str);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f16142 = false;
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("MT_WEB_MANAGER_SERVER", getString(R.string.MT_Protector), 3));
        }
        startForeground(1007, m12675());
        this.f16143 = new C19729(this, new RunnableC12507(2, this));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private Notification m12675() {
        C12751 c12751;
        Intent intentPutExtra = new Intent(this, (Class<?>) ActivityC20515.class).putExtra("bin.mt.plus.tool.RemoteManageActivity.EXTRA_PROTOCOL", 0);
        Intent action = new Intent(this, (Class<?>) ServiceC4538.class).setAction("bin.mt.remote.RemoteServerService.ACTION_STOP");
        String strM12673 = m12673();
        String strM1616 = this.f16141;
        if (strM1616 != null) {
            if (strM1616.length() == 6) {
                StringBuilder sb = new StringBuilder();
                sb.append(strM1616.substring(0, 3));
                sb.append(" ");
                strM1616 = C0242.m1616(3, strM1616, sb);
            }
            String string = getString(R.string.MT_Protector, strM1616);
            c12751 = new C12751();
            c12751.m31693(strM12673 + "\n" + string);
        } else {
            c12751 = null;
        }
        C3577 c3577 = new C3577(this, "MT_WEB_MANAGER_SERVER");
        c3577.m10592();
        c3577.m10586(C16737.m39288(R.string.MT_Protector));
        c3577.m10585((CharSequence) strM12673);
        c3577.m10583(PendingIntent.getActivity(this, 1, intentPutExtra, 201326592));
        c3577.m10590();
        c3577.m10588(false);
        c3577.m10582(android.R.drawable.ic_delete, getString(R.string.MT_Protector), PendingIntent.getService(this, 2, action, 201326592));
        if (c12751 != null) {
            c3577.m10587(c12751);
        }
        return c3577.m10581();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C8377 c8377;
        if (intent != null && "bin.mt.remote.RemoteServerService.ACTION_STOP".equals(intent.getAction())) {
            stopSelf();
            return 2;
        }
        C2025 c2025 = f16138;
        if (c2025 == null || !c2025.m39653()) {
            this.f16141 = null;
        }
        startForeground(1007, m12675());
        if (c2025 != null && c2025.m39653()) {
            if (c2025 == this.f16139 && (c8377 = this.f16145) != null) {
                c8377.m22002();
            }
            C16737.m39273(new RunnableC3436(this, c2025, c2025.m6515(), c2025.m6517()));
            return 1;
        }
        try {
            m12667();
            C8377 c8378 = new C8377(this);
            C2025 c2026 = new C2025(C17944.m41773(), new C3078(5, this), new C9788(c8378));
            this.f16145 = c8378;
            this.f16139 = c2026;
            f16138 = c2026;
            c2026.m39652();
            C16737.m39273(new RunnableC3436(this, c2026, c2026.m6515(), c2026.m6517()));
            m12666();
            m12672();
            c8378.m22002();
            C16737.m39270(new Intent("bin.mt.remote.RemoteServerService.ACTION_STARTED"));
            return 1;
        } catch (IOException | RuntimeException e) {
            Intent intent2 = new Intent("bin.mt.remote.RemoteServerService.ACTION_FAILED_TO_START");
            intent2.putExtra("msg", e instanceof BindException ? C16737.m39264(R.string.MT_Protector, Integer.valueOf(C17944.m41773())) : e.toString());
            C16737.m39270(intent2);
            m12667();
            stopSelf();
            return 2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12667() {
        this.f16141 = null;
        C8377 c8377 = this.f16145;
        if (c8377 != null) {
            c8377.m22004();
            this.f16145 = null;
        }
        this.f16139 = null;
        C2025 c2025 = f16138;
        f16138 = null;
        if (c2025 != null) {
            c2025.m6516();
            c2025.mo39649();
        }
        WifiManager.WifiLock wifiLock = this.f16140;
        if (wifiLock != null) {
            if (wifiLock.isHeld()) {
                this.f16140.release();
            }
            this.f16140 = null;
        }
        PowerManager.WakeLock wakeLock = this.f16144;
        if (wakeLock != null) {
            if (wakeLock.isHeld()) {
                this.f16144.release();
            }
            this.f16144 = null;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f16142 = true;
        this.f16143.m44856();
        m12667();
        stopForeground(true);
        C16737.m39270(new Intent("bin.mt.remote.RemoteServerService.ACTION_STOPPED"));
        super.onDestroy();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12669(ServiceC4538 serviceC4538, C2025 c2025, String str, long j) {
        if (!serviceC4538.f16142 && c2025 == f16138 && c2025.m39653()) {
            serviceC4538.f16141 = str;
            ((NotificationManager) serviceC4538.getSystemService("notification")).notify(1007, serviceC4538.m12675());
            C16737.m39270(new Intent("bin.mt.remote.RemoteServerService.ACTION_PAIRING_CODE_CHANGED").putExtra("expiresAt", j));
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m12666() {
        if (this.f16144 == null) {
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, getPackageName() + ":WebManager");
            this.f16144 = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
        }
        this.f16144.acquire();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m12672() {
        if (this.f16140 == null) {
            WifiManager.WifiLock wifiLockCreateWifiLock = ((WifiManager) getApplicationContext().getSystemService("wifi")).createWifiLock(3, getPackageName() + ":WebManager");
            this.f16140 = wifiLockCreateWifiLock;
            wifiLockCreateWifiLock.setReferenceCounted(false);
        }
        this.f16140.acquire();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m12673() {
        String strM40770 = C17506.m40770();
        if (strM40770 == null) {
            return C16737.m39288(R.string.MT_Protector);
        }
        StringBuilder sbM30914 = C12441.m30914("http://", strM40770, ":");
        sbM30914.append(C17944.m41773());
        return sbM30914.toString();
    }
}
