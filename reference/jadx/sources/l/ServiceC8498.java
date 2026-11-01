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

/* JADX INFO: renamed from: l.۠᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XJ */
/* JADX INFO: loaded from: classes3.dex */
public class ServiceC8498 extends Service {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static ServiceC8498 f29452;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static volatile C22609 f29453;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f29454 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static volatile boolean f29455;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ScheduledExecutorService f29456;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public WifiManager.WifiLock f29457;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f29458;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public PowerManager.WakeLock f29459;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C20013 f29460;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private synchronized void m22217() {
        ScheduledExecutorService scheduledExecutorService = this.f29456;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC13437());
            this.f29456 = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleWithFixedDelay(new RunnableC4263(0, this), 0L, 30000L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static boolean m22208() {
        C22609 c22609 = f29453;
        return (f29455 || c22609 == null || !c22609.m39653()) ? false : true;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m22213() {
        if (m22208()) {
            Application applicationM39277 = C16737.m39277();
            applicationM39277.startService(new Intent(applicationM39277, (Class<?>) ServiceC8498.class).setAction("bin.mt.mcp.ACTION_REFRESH_FLOAT_WINDOW"));
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static int m22215() {
        C22609 c22609 = f29453;
        if (c22609 != null && c22609.m39653()) {
            return c22609.m50122();
        }
        return C16259.m38409();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        setTheme(C2666.m8210());
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("MT_APK_MCP", getString(R.string.MT_Protector), 3));
        }
        startForeground(1008, m22219());
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C22609 c22609;
        startForeground(1008, m22219());
        if (intent != null && "bin.mt.mcp.ACTION_STOP".equals(intent.getAction())) {
            stopSelf();
            return 2;
        }
        if (intent != null && "bin.mt.mcp.ACTION_REFRESH_FLOAT_WINDOW".equals(intent.getAction())) {
            if (m22208()) {
                m22218();
                return 1;
            }
            stopSelf();
            return 2;
        }
        if (f29455) {
            f29452 = this;
            return 1;
        }
        if (m22208()) {
            try {
                m22206();
                m22218();
                m22217();
                C16737.m39270(new Intent("bin.mt.mcp.ACTION_STARTED"));
                return 1;
            } catch (Exception e) {
                m22212();
                m22210(e);
                stopSelf();
                return 2;
            }
        }
        C22609 c226010 = f29453;
        if (c226010 != null && !c226010.m39653() && (c22609 = f29453) != null && !f29455) {
            f29455 = true;
            new Thread(new RunnableC1441(0, c22609), "MT MCP Stop").start();
        }
        if (f29455) {
            f29452 = this;
            return 1;
        }
        try {
            AbstractC20745 abstractC20745M38422 = C16259.m38422();
            if (!abstractC20745M38422.mo33975()) {
                try {
                    abstractC20745M38422.m46739();
                    C15157.m36345();
                } catch (Exception unused) {
                }
            }
            C22609 c226011 = new C22609(C16259.m38409());
            f29453 = c226011;
            c226011.m39652();
            m22206();
            m22218();
            startForeground(1008, m22219());
            m22217();
            C16737.m39270(new Intent("bin.mt.mcp.ACTION_STARTED"));
            ExecutorService executorService = C4716.f16636;
            executorService.execute(new RunnableC9185(1));
            executorService.execute(new RunnableC23315(0));
            return 1;
        } catch (Exception e2) {
            m22212();
            m22210(e2);
            stopSelf();
            return 2;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C0577.m2744("MT MCP service onDestroy");
        this.f29458 = true;
        if (f29452 == this) {
            f29452 = null;
        }
        m22212();
        stopForeground(true);
        if (!f29455) {
            C16737.m39270(new Intent("bin.mt.mcp.ACTION_STOPPED"));
        }
        super.onDestroy();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22216() {
        f29453 = null;
        f29455 = false;
        ServiceC8498 serviceC8498 = f29452;
        f29452 = null;
        if (serviceC8498 != null && !serviceC8498.f29458) {
            serviceC8498.onStartCommand(null, 0, 0);
        } else {
            C16737.m39270(new Intent("bin.mt.mcp.ACTION_STOPPED"));
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m22212() {
        synchronized (this) {
            ScheduledExecutorService scheduledExecutorService = this.f29456;
            this.f29456 = null;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }
        m22220();
        C22609 c22609 = f29453;
        if (c22609 != null && !f29455) {
            f29455 = true;
            new Thread(new RunnableC1441(0, c22609), "MT MCP Stop").start();
        }
        WifiManager.WifiLock wifiLock = this.f29457;
        if (wifiLock != null) {
            if (wifiLock.isHeld()) {
                this.f29457.release();
            }
            this.f29457 = null;
        }
        PowerManager.WakeLock wakeLock = this.f29459;
        if (wakeLock != null) {
            if (wakeLock.isHeld()) {
                this.f29459.release();
            }
            this.f29459 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22211(ServiceC8498 serviceC8498) {
        try {
            serviceC8498.m22207();
        } catch (Throwable th) {
            C0577.m2747("MT MCP health check failed", th);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m22207() throws Throwable {
        C19081 c19081M43854;
        HttpURLConnection httpURLConnection;
        String simpleName;
        C22609 c22609 = f29453;
        boolean z = c22609 != null;
        boolean z2 = z && c22609.m39651();
        boolean z3 = z && c22609.m39653();
        int iM50122 = z ? c22609.m50122() : -1;
        int iM39650 = z ? c22609.m39650() : -1;
        PowerManager.WakeLock wakeLock = this.f29459;
        boolean z4 = wakeLock != null && wakeLock.isHeld();
        WifiManager.WifiLock wifiLock = this.f29457;
        boolean z5 = wifiLock != null && wifiLock.isHeld();
        if (!z3 || iM39650 <= 0) {
            c19081M43854 = C19081.m43854();
        } else {
            long jNanoTime = System.nanoTime();
            HttpURLConnection httpURLConnection2 = null;
            try {
                try {
                    httpURLConnection = (HttpURLConnection) new URL(a.s, "127.0.0.1", iM39650, "/mcp").openConnection(Proxy.NO_PROXY);
                    try {
                        httpURLConnection.setRequestMethod("GET");
                        httpURLConnection.setConnectTimeout(1000);
                        httpURLConnection.setReadTimeout(1000);
                        httpURLConnection.setUseCaches(false);
                        c19081M43854 = C19081.m43855(httpURLConnection.getResponseCode(), TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime));
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
                        c19081M43854 = C19081.m43856(millis, simpleName);
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
        C0577.m2744("MT MCP health state: pid=" + Process.myPid() + ", service=" + Integer.toHexString(System.identityHashCode(this)) + ", hasServer=" + z + ", wasStarted=" + z2 + ", alive=" + z3 + ", serverPort=" + iM50122 + ", listeningPort=" + iM39650 + ", configuredPort=" + C16259.m38409() + ", wakeLockHeld=" + z4 + ", wifiLockHeld=" + z5 + ", localHttpChecked=" + c19081M43854.f61663 + ", localHttpResponded=" + c19081M43854.f61662 + ", localHttpStatus=" + c19081M43854.f61664 + ", localHttpElapsedMs=" + c19081M43854.f61666 + ", localHttpError=" + c19081M43854.f61665);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m22206() {
        PowerManager.WakeLock wakeLock = this.f29459;
        if (wakeLock == null || !wakeLock.isHeld()) {
            this.f29459 = null;
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, getPackageName() + ":Mcp");
            this.f29459 = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            this.f29459.acquire();
        }
        WifiManager.WifiLock wifiLock = this.f29457;
        if (wifiLock == null || !wifiLock.isHeld()) {
            this.f29457 = null;
            WifiManager.WifiLock wifiLockCreateWifiLock = ((WifiManager) getApplicationContext().getSystemService("wifi")).createWifiLock(3, getPackageName() + ":Mcp");
            this.f29457 = wifiLockCreateWifiLock;
            wifiLockCreateWifiLock.setReferenceCounted(false);
            this.f29457.acquire();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m22218() {
        if (!m22208() || !C16259.m38427()) {
            m22220();
            return;
        }
        try {
            if (!C16125.m38170(this)) {
                m22220();
                return;
            }
            if (this.f29460 == null) {
                C20013 c20013M45318 = C20013.m45318(this, "mcp");
                c20013M45318.setImageDrawable(C19861.m45105(getResources(), R.drawable.MT_Protector, getTheme()));
                c20013M45318.setOnClickListener(new View.OnClickListener() { // from class: l.ۜ᩻֨
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i = ServiceC8498.f29454;
                        if (C5301.m14716(C21094.m47527())) {
                            return;
                        }
                        Intent intent = new Intent("bin.mt.plus.ACTION_SHORTCUT");
                        ServiceC8498 serviceC8498 = this.f23763;
                        serviceC8498.startActivity(intent.setComponent(new ComponentName(serviceC8498.getPackageName(), "bin.mt.plus.ApkMcpActivity")).putExtra("operation", "tool-apk-mcp").addFlags(268435456));
                    }
                });
                this.f29460 = c20013M45318;
            }
            int iM38412 = C16259.m38412(getApplicationContext(), C16259.m38411(ApplicationC0716.f2992.getInt("amfbc", 0)));
            this.f29460.setBackgroundTintList(ColorStateList.valueOf(iM38412));
            this.f29460.setImageTintList(ColorStateList.valueOf(C3057.m9159(iM38412) > 220 ? -12895429 : -1));
            if (this.f29460.m45326()) {
                this.f29460.show();
            } else {
                this.f29460.m45324();
            }
        } catch (RuntimeException e) {
            C0577.m2747("Failed to show MT MCP floating window", e);
            m22220();
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m22220() {
        C20013 c20013 = this.f29460;
        if (c20013 == null) {
            return;
        }
        try {
            c20013.m45325();
            this.f29460 = null;
        } catch (RuntimeException e) {
            C0577.m2747("Failed to remove MT MCP floating window", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22210(Exception exc) {
        String string;
        Intent intent = new Intent("bin.mt.mcp.ACTION_FAILED_TO_START");
        if (exc instanceof BindException) {
            string = C16737.m39264(R.string.MT_Protector, Integer.valueOf(C16259.m38409()));
        } else {
            string = exc.getMessage() == null ? exc.toString() : exc.getMessage();
        }
        intent.putExtra(d.O, string);
        C16737.m39270(intent);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private Notification m22219() {
        Intent intent = new Intent(this, (Class<?>) ActivityC7109.class);
        Intent action = new Intent(this, (Class<?>) ServiceC8498.class).setAction("bin.mt.mcp.ACTION_STOP");
        int iM22215 = m22215();
        ArrayList arrayListM15157 = C5487.m15157(iM22215);
        C3577 c3577 = new C3577(this, "MT_APK_MCP");
        c3577.m10592();
        c3577.m10586(getString(R.string.MT_Protector));
        c3577.m10585(arrayListM15157.isEmpty() ? C5487.m15158(iM22215) : (CharSequence) arrayListM15157.get(0));
        c3577.m10583(PendingIntent.getActivity(this, 0, intent, 201326592));
        c3577.m10590();
        c3577.m10588(false);
        c3577.m10582(android.R.drawable.ic_delete, getString(R.string.MT_Protector), PendingIntent.getService(this, 1, action, 201326592));
        return c3577.m10581();
    }
}
