package l;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.Process;
import android.view.View;
import bin.mt.plus.R;
import com.alipay.sdk.m.n.a;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.net.BindException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۛܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XJ */
/* JADX INFO: loaded from: classes3.dex */
public class ServiceC6459 extends Service {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static volatile C11678 f21713;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f21714;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static ServiceC6459 f21715;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f21716 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public PowerManager.WakeLock f21717;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public WifiManager.WifiLock f21718;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f21719;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ScheduledExecutorService f21720;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C20733 f21721;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private synchronized void m18253() {
        ScheduledExecutorService scheduledExecutorService = this.f21720;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC25105());
            this.f21720 = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleWithFixedDelay(new RunnableC16899(0, this), 0L, 30000L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18242() {
        C11678 c11678 = f21713;
        return (f21714 || c11678 == null || !c11678.m5439()) ? false : true;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m18252() {
        Application applicationM49084 = C21576.m49084();
        C7508.m20562(applicationM49084, new Intent(applicationM49084, (Class<?>) ServiceC6459.class));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m18248() {
        if (m18242()) {
            Application applicationM49084 = C21576.m49084();
            applicationM49084.startService(new Intent(applicationM49084, (Class<?>) ServiceC6459.class).setAction("bin.mt.mcp.ACTION_REFRESH_FLOAT_WINDOW"));
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m18246() {
        C11678 c11678 = f21713;
        if (c11678 != null && c11678.m5439()) {
            return c11678.m29355();
        }
        return C0492.m2384();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        setTheme(C7207.m19791());
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("MT_APK_MCP", getString(R.string.MT_Protector), 3));
        }
        startForeground(1008, m18250());
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C11678 c11678;
        startForeground(1008, m18250());
        if (intent != null && "bin.mt.mcp.ACTION_STOP".equals(intent.getAction())) {
            stopSelf();
            return 2;
        }
        if (intent != null && "bin.mt.mcp.ACTION_REFRESH_FLOAT_WINDOW".equals(intent.getAction())) {
            if (m18242()) {
                m18251();
                return 1;
            }
            stopSelf();
            return 2;
        }
        if (f21714) {
            f21715 = this;
            return 1;
        }
        if (m18242()) {
            try {
                m18249();
                m18251();
                m18253();
                C21576.m49065(new Intent("bin.mt.mcp.ACTION_STARTED"));
                return 1;
            } catch (Exception e) {
                m18254();
                m18244(e);
                stopSelf();
                return 2;
            }
        }
        C11678 c11679 = f21713;
        if (c11679 != null && !c11679.m5439() && (c11678 = f21713) != null && !f21714) {
            f21714 = true;
            new Thread(new RunnableC0361(4, c11678), "MT MCP Stop").start();
        }
        if (f21714) {
            f21715 = this;
            return 1;
        }
        try {
            AbstractC22044 abstractC22044M2374 = C0492.m2374();
            if (!abstractC22044M2374.mo2934()) {
                try {
                    abstractC22044M2374.m49853();
                    C22099.m50062();
                } catch (Exception unused) {
                }
            }
            C11678 c116710 = new C11678(C0492.m2384());
            f21713 = c116710;
            c116710.m5436();
            m18249();
            m18251();
            startForeground(1008, m18250());
            m18253();
            C21576.m49065(new Intent("bin.mt.mcp.ACTION_STARTED"));
            ExecutorService executorService = C5261.f18540;
            executorService.execute(new RunnableC16153());
            executorService.execute(new RunnableC9309(1));
            return 1;
        } catch (Exception e2) {
            m18254();
            m18244(e2);
            stopSelf();
            return 2;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C20653.m47269("MT MCP service onDestroy");
        this.f21719 = true;
        if (f21715 == this) {
            f21715 = null;
        }
        m18254();
        stopForeground(true);
        if (!f21714) {
            C21576.m49065(new Intent("bin.mt.mcp.ACTION_STOPPED"));
        }
        super.onDestroy();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18255() {
        f21713 = null;
        f21714 = false;
        ServiceC6459 serviceC6459 = f21715;
        f21715 = null;
        if (serviceC6459 != null && !serviceC6459.f21719) {
            serviceC6459.onStartCommand(null, 0, 0);
        } else {
            C21576.m49065(new Intent("bin.mt.mcp.ACTION_STOPPED"));
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m18254() {
        synchronized (this) {
            ScheduledExecutorService scheduledExecutorService = this.f21720;
            this.f21720 = null;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }
        m18257();
        C11678 c11678 = f21713;
        if (c11678 != null && !f21714) {
            f21714 = true;
            new Thread(new RunnableC0361(4, c11678), "MT MCP Stop").start();
        }
        WifiManager.WifiLock wifiLock = this.f21718;
        if (wifiLock != null) {
            if (wifiLock.isHeld()) {
                this.f21718.release();
            }
            this.f21718 = null;
        }
        PowerManager.WakeLock wakeLock = this.f21717;
        if (wakeLock != null) {
            if (wakeLock.isHeld()) {
                this.f21717.release();
            }
            this.f21717 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18245(ServiceC6459 serviceC6459) {
        try {
            serviceC6459.m18256();
        } catch (Throwable th) {
            C20653.m47272("MT MCP health check failed", th);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m18256() throws Throwable {
        C12424 c12424M30890;
        HttpURLConnection httpURLConnection;
        String simpleName;
        C11678 c11678 = f21713;
        boolean z = c11678 != null;
        boolean z2 = z && c11678.m5437();
        boolean z3 = z && c11678.m5439();
        int iM29355 = z ? c11678.m29355() : -1;
        int iM5433 = z ? c11678.m5433() : -1;
        PowerManager.WakeLock wakeLock = this.f21717;
        boolean z4 = wakeLock != null && wakeLock.isHeld();
        WifiManager.WifiLock wifiLock = this.f21718;
        boolean z5 = wifiLock != null && wifiLock.isHeld();
        if (!z3 || iM5433 <= 0) {
            c12424M30890 = C12424.m30890();
        } else {
            long jNanoTime = System.nanoTime();
            HttpURLConnection httpURLConnection2 = null;
            try {
                try {
                    httpURLConnection = (HttpURLConnection) new URL(a.s, "127.0.0.1", iM5433, "/mcp").openConnection(Proxy.NO_PROXY);
                    try {
                        httpURLConnection.setRequestMethod("GET");
                        httpURLConnection.setConnectTimeout(1000);
                        httpURLConnection.setReadTimeout(1000);
                        httpURLConnection.setUseCaches(false);
                        c12424M30890 = C12424.m30891(httpURLConnection.getResponseCode(), TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime));
                        httpURLConnection.disconnect();
                    } catch (IOException e) {
                        e = e;
                        httpURLConnection2 = httpURLConnection;
                        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
                        String message = e.getMessage();
                        if (message == null || message.isEmpty()) {
                            simpleName = e.getClass().getSimpleName();
                        } else {
                            simpleName = e.getClass().getSimpleName() + ": " + message;
                        }
                        c12424M30890 = C12424.m30892(millis, simpleName);
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection = null;
                }
            } catch (IOException e2) {
                e = e2;
            }
        }
        C20653.m47269("MT MCP health state: pid=" + Process.myPid() + ", service=" + Integer.toHexString(System.identityHashCode(this)) + ", hasServer=" + z + ", wasStarted=" + z2 + ", alive=" + z3 + ", serverPort=" + iM29355 + ", listeningPort=" + iM5433 + ", configuredPort=" + C0492.m2384() + ", wakeLockHeld=" + z4 + ", wifiLockHeld=" + z5 + ", localHttpChecked=" + c12424M30890.f39946 + ", localHttpResponded=" + c12424M30890.f39950 + ", localHttpStatus=" + c12424M30890.f39948 + ", localHttpElapsedMs=" + c12424M30890.f39949 + ", localHttpError=" + c12424M30890.f39947);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m18249() {
        PowerManager.WakeLock wakeLock = this.f21717;
        if (wakeLock == null || !wakeLock.isHeld()) {
            this.f21717 = null;
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, getPackageName() + ":Mcp");
            this.f21717 = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            this.f21717.acquire();
        }
        WifiManager.WifiLock wifiLock = this.f21718;
        if (wifiLock == null || !wifiLock.isHeld()) {
            this.f21718 = null;
            WifiManager.WifiLock wifiLockCreateWifiLock = ((WifiManager) getApplicationContext().getSystemService("wifi")).createWifiLock(3, getPackageName() + ":Mcp");
            this.f21718 = wifiLockCreateWifiLock;
            wifiLockCreateWifiLock.setReferenceCounted(false);
            this.f21718.acquire();
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m18251() {
        if (!m18242() || !C0492.m2379()) {
            m18257();
            return;
        }
        try {
            if (!C7543.m20616(this)) {
                m18257();
                return;
            }
            if (this.f21721 == null) {
                C20733 c20733M47419 = C20733.m47419(this, "mcp");
                c20733M47419.setImageDrawable(C24920.m55517(getResources(), R.drawable.MT_Protector, getTheme()));
                c20733M47419.setOnClickListener(new View.OnClickListener() { // from class: l.ܽܳۚ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i = ServiceC6459.f21716;
                        if (C6679.m18690(C6331.m18052())) {
                            return;
                        }
                        Intent intent = new Intent("bin.mt.plus.ACTION_SHORTCUT");
                        ServiceC6459 serviceC6459 = this.f58017;
                        serviceC6459.startActivity(intent.setComponent(new ComponentName(serviceC6459.getPackageName(), "bin.mt.plus.ApkMcpActivity")).putExtra("operation", "tool-apk-mcp").addFlags(268435456));
                    }
                });
                this.f21721 = c20733M47419;
            }
            int iM2366 = C0492.m2366(getApplicationContext(), C0492.m2365(ApplicationC17729.f58258.getInt("amfbc", 0)));
            this.f21721.setBackgroundTintList(ColorStateList.valueOf(iM2366));
            this.f21721.setImageTintList(ColorStateList.valueOf(C8420.m22611(iM2366) > 220 ? -12895429 : -1));
            if (this.f21721.m47429()) {
                this.f21721.show();
            } else {
                this.f21721.m47426();
            }
        } catch (RuntimeException e) {
            C20653.m47272("Failed to show MT MCP floating window", e);
            m18257();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m18257() {
        C20733 c20733 = this.f21721;
        if (c20733 == null) {
            return;
        }
        try {
            c20733.m47428();
            this.f21721 = null;
        } catch (RuntimeException e) {
            C20653.m47272("Failed to remove MT MCP floating window", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18244(Exception exc) {
        String string;
        Intent intent = new Intent("bin.mt.mcp.ACTION_FAILED_TO_START");
        if (exc instanceof BindException) {
            string = C21576.m49059(R.string.MT_Protector, Integer.valueOf(C0492.m2384()));
        } else {
            string = exc.getMessage() == null ? exc.toString() : exc.getMessage();
        }
        intent.putExtra(d.O, string);
        C21576.m49065(intent);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private Notification m18250() {
        Intent intent = new Intent(this, (Class<?>) ActivityC20852.class);
        Intent action = new Intent(this, (Class<?>) ServiceC6459.class).setAction("bin.mt.mcp.ACTION_STOP");
        int iM18246 = m18246();
        ArrayList arrayListM33717 = C13808.m33717(iM18246);
        C3558 c3558 = new C3558(this, "MT_APK_MCP");
        c3558.m11599();
        c3558.m11594(getString(R.string.MT_Protector));
        c3558.m11593(arrayListM33717.isEmpty() ? C13808.m33720(iM18246) : (CharSequence) arrayListM33717.get(0));
        c3558.m11591(PendingIntent.getActivity(this, 0, intent, 201326592));
        c3558.m11597();
        c3558.m11596(false);
        c3558.m11590(android.R.drawable.ic_delete, getString(R.string.MT_Protector), PendingIntent.getService(this, 1, action, 201326592));
        return c3558.m11589();
    }
}
