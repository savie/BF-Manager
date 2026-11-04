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
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۗۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7AT */
/* JADX INFO: loaded from: classes2.dex */
public class ServiceC3107 extends Service {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f10060 = 0;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static C16531 f10061;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C13700 f10062;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f10063;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public WifiManager.WifiLock f10064;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f10065;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C16531 f10066;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public PowerManager.WakeLock f10067;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C2557 f10068;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m10148() {
        C16531 c16531 = f10061;
        return c16531 != null && c16531.m5439();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m10152() {
        C16531 c16531 = f10061;
        if (c16531 == null || !c16531.m5439()) {
            return null;
        }
        return c16531.m39171();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static long m10153() {
        C16531 c16531 = f10061;
        if (c16531 == null || !c16531.m5439()) {
            return 0L;
        }
        return c16531.m39172();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static long m10151() {
        int i = C16531.f53510;
        return C3063.m9969();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static ArrayList m10155() {
        C16531 c16531 = f10061;
        if (c16531 != null && c16531.m5439()) {
            return c16531.m39173();
        }
        C0342 c0342 = new C0342();
        ArrayList arrayList = new ArrayList();
        Iterator it = c0342.m2078().iterator();
        while (it.hasNext()) {
            arrayList.add(C0342.m2074((C18241) it.next()));
        }
        C0342.m2077(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m10147(String str) {
        C16531 c16531 = f10061;
        if (c16531 != null && c16531.m5439()) {
            return c16531.m39169(str);
        }
        return new C0342().m2080(str);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f10065 = false;
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("MT_WEB_MANAGER_SERVER", getString(R.string.MT_Protector), 3));
        }
        startForeground(1007, m10154());
        this.f10062 = new C13700(this, new RunnableC7909(4, this));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private Notification m10154() {
        C23696 c23696;
        Intent intentPutExtra = new Intent(this, (Class<?>) ActivityC12647.class).putExtra("bin.mt.plus.tool.RemoteManageActivity.EXTRA_PROTOCOL", 0);
        Intent action = new Intent(this, (Class<?>) ServiceC3107.class).setAction("bin.mt.remote.RemoteServerService.ACTION_STOP");
        String strM10149 = m10149();
        String strM = this.f10063;
        if (strM != null) {
            if (strM.length() == 6) {
                StringBuilder sb = new StringBuilder();
                sb.append(strM.substring(0, 3));
                sb.append(" ");
                strM = ExternalValue$$ExternalSyntheticOutline0.m(3, strM, sb);
            }
            String string = getString(R.string.MT_Protector, strM);
            c23696 = new C23696();
            c23696.m52955(strM10149 + "\n" + string);
        } else {
            c23696 = null;
        }
        C3558 c3558 = new C3558(this, "MT_WEB_MANAGER_SERVER");
        c3558.m11599();
        c3558.m11594(C21576.m49088(R.string.MT_Protector));
        c3558.m11593((CharSequence) strM10149);
        c3558.m11591(PendingIntent.getActivity(this, 1, intentPutExtra, 201326592));
        c3558.m11597();
        c3558.m11596(false);
        c3558.m11590(android.R.drawable.ic_delete, getString(R.string.MT_Protector), PendingIntent.getService(this, 2, action, 201326592));
        if (c23696 != null) {
            c3558.m11595(c23696);
        }
        return c3558.m11589();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C2557 c2557;
        if (intent != null && "bin.mt.remote.RemoteServerService.ACTION_STOP".equals(intent.getAction())) {
            stopSelf();
            return 2;
        }
        C16531 c16531 = f10061;
        if (c16531 == null || !c16531.m5439()) {
            this.f10063 = null;
        }
        startForeground(1007, m10154());
        if (c16531 != null && c16531.m5439()) {
            if (c16531 == this.f10066 && (c2557 = this.f10068) != null) {
                c2557.m8588();
            }
            C21576.m49068(new RunnableC23245(this, c16531, c16531.m39171(), c16531.m39172()));
            return 1;
        }
        try {
            m10144();
            C2557 c2558 = new C2557(this);
            C16531 c16532 = new C16531(C0870.m3555(), new C17277(this), new C15785(c2558));
            this.f10068 = c2558;
            this.f10066 = c16532;
            f10061 = c16532;
            c16532.m5436();
            C21576.m49068(new RunnableC23245(this, c16532, c16532.m39171(), c16532.m39172()));
            m10143();
            m10150();
            c2558.m8588();
            C21576.m49065(new Intent("bin.mt.remote.RemoteServerService.ACTION_STARTED"));
            return 1;
        } catch (IOException | RuntimeException e) {
            Intent intent2 = new Intent("bin.mt.remote.RemoteServerService.ACTION_FAILED_TO_START");
            intent2.putExtra("msg", e instanceof BindException ? C21576.m49059(R.string.MT_Protector, Integer.valueOf(C0870.m3555())) : e.toString());
            C21576.m49065(intent2);
            m10144();
            stopSelf();
            return 2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m10144() {
        this.f10063 = null;
        C2557 c2557 = this.f10068;
        if (c2557 != null) {
            c2557.m8590();
            this.f10068 = null;
        }
        this.f10066 = null;
        C16531 c16531 = f10061;
        f10061 = null;
        if (c16531 != null) {
            c16531.m39170();
            c16531.mo5440();
        }
        WifiManager.WifiLock wifiLock = this.f10064;
        if (wifiLock != null) {
            if (wifiLock.isHeld()) {
                this.f10064.release();
            }
            this.f10064 = null;
        }
        PowerManager.WakeLock wakeLock = this.f10067;
        if (wakeLock != null) {
            if (wakeLock.isHeld()) {
                this.f10067.release();
            }
            this.f10067 = null;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f10065 = true;
        this.f10062.m33493();
        m10144();
        stopForeground(true);
        C21576.m49065(new Intent("bin.mt.remote.RemoteServerService.ACTION_STOPPED"));
        super.onDestroy();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10146(ServiceC3107 serviceC3107, C16531 c16531, String str, long j) {
        if (!serviceC3107.f10065 && c16531 == f10061 && c16531.m5439()) {
            serviceC3107.f10063 = str;
            ((NotificationManager) serviceC3107.getSystemService("notification")).notify(1007, serviceC3107.m10154());
            C21576.m49065(new Intent("bin.mt.remote.RemoteServerService.ACTION_PAIRING_CODE_CHANGED").putExtra("expiresAt", j));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m10143() {
        if (this.f10067 == null) {
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, getPackageName() + ":WebManager");
            this.f10067 = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
        }
        this.f10067.acquire();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m10150() {
        if (this.f10064 == null) {
            WifiManager.WifiLock wifiLockCreateWifiLock = ((WifiManager) getApplicationContext().getSystemService("wifi")).createWifiLock(3, getPackageName() + ":WebManager");
            this.f10064 = wifiLockCreateWifiLock;
            wifiLockCreateWifiLock.setReferenceCounted(false);
        }
        this.f10064.acquire();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m10149() {
        String strM55708 = C24955.m55708();
        if (strM55708 == null) {
            return C21576.m49088(R.string.MT_Protector);
        }
        StringBuilder sbM51387 = C22783.m51387("http://", strM55708, ":");
        sbM51387.append(C0870.m3555());
        return sbM51387.toString();
    }
}
