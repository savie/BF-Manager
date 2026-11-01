package l;

import android.app.Application;
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
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAMT */
/* JADX INFO: loaded from: classes3.dex */
public class ServiceC7629 extends Service implements Runnable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static volatile Thread f25188;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f25189 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static ServiceC7629 f25190;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Object f25191 = new Object();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public PowerManager.WakeLock f25194;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ServerSocket f25195;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C19729 f25198;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile boolean f25196 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C16801 f25197 = null;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f25192 = new ArrayList();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public WifiManager.WifiLock f25193 = null;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m20160() {
        boolean z;
        synchronized (f25191) {
            z = f25188 != null && f25188.isAlive();
        }
        return z;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m20167() {
        if (m20160()) {
            return;
        }
        Application applicationM39277 = C16737.m39277();
        C10405.m26303(applicationM39277, new Intent(applicationM39277, (Class<?>) ServiceC7629.class));
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("MT_FTP_SERVER", getString(R.string.MT_Protector), 3));
        }
        startForeground(1004, m20171());
        this.f25198 = new C19729(this, new RunnableC21384(3, this));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private Notification m20171() {
        Intent action = new Intent(this, (Class<?>) ServiceC7629.class).setAction("bin.mt.plus.FsService.ACTION_STOP");
        Intent intentPutExtra = new Intent(this, (Class<?>) ActivityC20515.class).putExtra("bin.mt.plus.tool.RemoteManageActivity.EXTRA_PROTOCOL", 1);
        C3577 c3577 = new C3577(this, "MT_FTP_SERVER");
        c3577.m10592();
        c3577.m10586(C16737.m39288(R.string.MT_Protector));
        c3577.m10585((CharSequence) m20169());
        c3577.m10583(PendingIntent.getActivity(this, 0, intentPutExtra, 201326592));
        c3577.m10590();
        c3577.m10588(false);
        c3577.m10582(android.R.drawable.ic_delete, getString(R.string.MT_Protector), PendingIntent.getService(this, 0, action, 67108864));
        return c3577.m10581();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        startForeground(1004, m20171());
        if (intent != null && "bin.mt.plus.FsService.ACTION_STOP".equals(intent.getAction())) {
            stopSelf();
            return 2;
        }
        synchronized (f25191) {
            Thread thread = f25188;
            if (thread != null && thread.isAlive()) {
                return 1;
            }
            RuntimeException runtimeException = null;
            f25188 = null;
            f25190 = null;
            this.f25196 = false;
            Thread thread2 = new Thread(this);
            f25188 = thread2;
            f25190 = this;
            try {
                thread2.start();
            } catch (RuntimeException e) {
                if (f25188 == thread2 && f25190 == this) {
                    f25188 = null;
                    f25190 = null;
                }
                runtimeException = e;
            }
            if (runtimeException == null) {
                return 1;
            }
            stopSelf();
            m20163(runtimeException.toString());
            return 2;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C10452 c10452;
        this.f25198.m44856();
        this.f25196 = true;
        synchronized (f25191) {
            if (f25190 != this) {
                c10452 = C10452.m26401();
            } else {
                this.f25196 = true;
                c10452 = new C10452();
                c10452.f35679 = f25188;
                c10452.f35683 = this.f25195;
                this.f25195 = null;
                c10452.f35684 = this.f25197;
                this.f25197 = null;
            }
        }
        if (c10452.f35679 != null) {
            c10452.f35679.interrupt();
        }
        m20165(c10452);
        m20165(m20173());
        stopForeground(true);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private C10452 m20173() {
        C10452 c10452;
        synchronized (f25191) {
            c10452 = new C10452();
            c10452.f35681 = this.f25194;
            this.f25194 = null;
            c10452.f35678 = this.f25193;
            this.f25193 = null;
        }
        return c10452;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m20175() throws Throwable {
        Throwable th;
        Throwable th2;
        ServerSocket serverSocket = new ServerSocket();
        boolean z = true;
        try {
            serverSocket.setReuseAddress(true);
            serverSocket.bind(new InetSocketAddress(C21034.m47435()));
            synchronized (f25191) {
                try {
                    if (!m20166(Thread.currentThread()) || this.f25196) {
                        z = false;
                    } else {
                        this.f25195 = serverSocket;
                    }
                    try {
                        if (!z) {
                            try {
                                serverSocket.close();
                            } catch (IOException unused) {
                            }
                        }
                        return z;
                    } catch (Throwable th3) {
                        th2 = th3;
                        while (true) {
                            try {
                                try {
                                    throw th2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    if (!z) {
                                        try {
                                            serverSocket.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th2 = th5;
                                z = z;
                            }
                            th2 = th5;
                            z = z;
                        }
                    }
                } catch (Throwable th6) {
                    th2 = th6;
                    z = false;
                }
            }
        } catch (Throwable th7) {
            th = th7;
            z = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018c  */
    /* JADX WARN: Code duplicated, block: B:103:0x019c  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b4  */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean z;
        boolean z2;
        C10452 c10452M20162;
        Intent intent;
        Intent intent2;
        Thread threadCurrentThread = Thread.currentThread();
        boolean z3 = false;
        String string = null;
        try {
            z = true;
            if (m20172(threadCurrentThread)) {
                C10452 c10452M20163 = m20162(threadCurrentThread, true);
                m20165(c10452M20163);
                if (!c10452M20163.f35680) {
                    return;
                }
                stopSelf();
                if (!c10452M20163.f35682) {
                    return;
                } else {
                    intent2 = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                }
            } else {
                try {
                    try {
                        C6696.m18104();
                        if (m20172(threadCurrentThread)) {
                            C10452 c10452M20164 = m20162(threadCurrentThread, true);
                            m20165(c10452M20164);
                            if (!c10452M20164.f35680) {
                                return;
                            }
                            stopSelf();
                            if (!c10452M20164.f35682) {
                                return;
                            } else {
                                intent2 = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                            }
                        } else {
                            try {
                                if (!m20175()) {
                                    C10452 c10452M20165 = m20162(threadCurrentThread, true);
                                    m20165(c10452M20165);
                                    if (!c10452M20165.f35680) {
                                        return;
                                    }
                                    stopSelf();
                                    if (!c10452M20165.f35682) {
                                        return;
                                    } else {
                                        intent2 = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                                    }
                                } else if (m20172(threadCurrentThread) || !m20168(threadCurrentThread) || !m20161(threadCurrentThread)) {
                                    C10452 c10452M20166 = m20162(threadCurrentThread, true);
                                    m20165(c10452M20166);
                                    if (!c10452M20166.f35680) {
                                        return;
                                    }
                                    stopSelf();
                                    if (!c10452M20166.f35682) {
                                        return;
                                    } else {
                                        intent2 = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                                    }
                                } else {
                                    if (!m20172(threadCurrentThread)) {
                                        C16737.m39270(new Intent("bin.mt.plus.FTP_SERVER_STARTED"));
                                        while (!m20172(threadCurrentThread)) {
                                            try {
                                                m20170(threadCurrentThread);
                                                try {
                                                    Thread.sleep(1000L);
                                                } catch (InterruptedException unused) {
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                z2 = false;
                                                if (z) {
                                                    m20159();
                                                }
                                                c10452M20162 = m20162(threadCurrentThread, false);
                                                m20165(c10452M20162);
                                                if (c10452M20162.f35680) {
                                                    stopSelf();
                                                    if (!z2) {
                                                        if (z) {
                                                            C16737.m39270(new Intent("bin.mt.plus.FTP_SERVER_STOPPED"));
                                                        } else {
                                                            C16737.m39270(new Intent("bin.mt.plus.FTP_SERVER_STOPPED"));
                                                        }
                                                    } else if (z) {
                                                        C16737.m39270(new Intent("bin.mt.plus.FTP_SERVER_STOPPED"));
                                                    } else {
                                                        C16737.m39270(new Intent("bin.mt.plus.FTP_SERVER_STOPPED"));
                                                    }
                                                }
                                                throw th;
                                            }
                                        }
                                        m20159();
                                        C10452 c10452M20167 = m20162(threadCurrentThread, true);
                                        m20165(c10452M20167);
                                        if (c10452M20167.f35680) {
                                            stopSelf();
                                            intent = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                                            C16737.m39270(intent);
                                            return;
                                        }
                                        return;
                                    }
                                    C10452 c10452M20168 = m20162(threadCurrentThread, true);
                                    m20165(c10452M20168);
                                    if (!c10452M20168.f35680) {
                                        return;
                                    }
                                    stopSelf();
                                    if (!c10452M20168.f35682) {
                                        return;
                                    } else {
                                        intent2 = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                                    }
                                }
                            } catch (IOException e) {
                                if (m20172(threadCurrentThread)) {
                                    z3 = true;
                                    z = false;
                                } else {
                                    string = e instanceof BindException ? C16737.m39264(R.string.MT_Protector, Integer.valueOf(C21034.m47435())) : e.toString();
                                }
                                C10452 c10452M20169 = m20162(threadCurrentThread, z3);
                                m20165(c10452M20169);
                                if (c10452M20169.f35680) {
                                    stopSelf();
                                    if (!z || c10452M20169.f35682) {
                                        if (!c10452M20169.f35682) {
                                            return;
                                        } else {
                                            intent = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                                        }
                                    }
                                    m20163(string);
                                    return;
                                }
                                return;
                            }
                        }
                    } catch (IOException e2) {
                        if (m20172(threadCurrentThread)) {
                            z3 = true;
                            z = false;
                        } else {
                            string = e2.toString();
                        }
                        C10452 c10452M201610 = m20162(threadCurrentThread, z3);
                        m20165(c10452M201610);
                        if (c10452M201610.f35680) {
                            stopSelf();
                            if (!z || c10452M201610.f35682) {
                                if (!c10452M201610.f35682) {
                                    return;
                                } else {
                                    intent = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                                }
                            }
                            m20163(string);
                            return;
                        }
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                    z2 = true;
                    if (z) {
                        m20159();
                    }
                    c10452M20162 = m20162(threadCurrentThread, false);
                    m20165(c10452M20162);
                    if (c10452M20162.f35680) {
                        stopSelf();
                        if (!z2 && !c10452M20162.f35682) {
                            m20163((String) null);
                        } else if (z || c10452M20162.f35682) {
                            C16737.m39270(new Intent("bin.mt.plus.FTP_SERVER_STOPPED"));
                        }
                    }
                    throw th;
                }
            }
            C16737.m39270(intent2);
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C10452 m20162(Thread thread, boolean z) {
        C10452 c10452;
        synchronized (f25191) {
            boolean zM20166 = m20166(thread);
            c10452 = new C10452();
            c10452.f35680 = zM20166;
            c10452.f35682 = z || this.f25196;
            c10452.f35683 = this.f25195;
            this.f25195 = null;
            c10452.f35684 = this.f25197;
            this.f25197 = null;
            c10452.f35681 = this.f25194;
            this.f25194 = null;
            c10452.f35678 = this.f25193;
            this.f25193 = null;
            if (zM20166) {
                f25188 = null;
                f25190 = null;
                this.f25196 = false;
            }
        }
        return c10452;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m20170(Thread thread) {
        C16801 c16801;
        ServerSocket serverSocket;
        synchronized (f25191) {
            if (m20166(thread) && !this.f25196) {
                C16801 c16802 = this.f25197;
                C16801 c16803 = null;
                if (c16802 == null || c16802.isAlive()) {
                    c16801 = null;
                } else {
                    c16801 = this.f25197;
                    this.f25197 = null;
                }
                if (c16801 != null) {
                    try {
                        c16801.join();
                    } catch (InterruptedException unused) {
                    }
                }
                synchronized (f25191) {
                    if (m20166(thread) && !this.f25196 && this.f25197 == null && (serverSocket = this.f25195) != null) {
                        c16803 = new C16801();
                        c16803.f53794 = serverSocket;
                        c16803.f53793 = this;
                        this.f25197 = c16803;
                    }
                }
                if (c16803 != null) {
                    c16803.start();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m20172(Thread thread) {
        boolean z;
        synchronized (f25191) {
            z = !m20166(thread) || this.f25196;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m20166(Thread thread) {
        return thread == f25188 && f25190 == this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20163(String str) {
        Intent intent = new Intent("bin.mt.plus.FTP_SERVER_FAILED_TO_START");
        intent.putExtra("msg", str);
        C16737.m39270(intent);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20165(C10452 c10452) {
        if (c10452.f35684 != null) {
            C16801 c16801 = c10452.f35684;
            c16801.getClass();
            try {
                c16801.f53794.close();
            } catch (Exception unused) {
            }
        }
        ServerSocket serverSocket = c10452.f35683;
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException unused2) {
            }
        }
        if (c10452.f35678 != null && c10452.f35678.isHeld()) {
            c10452.f35678.release();
        }
        if (c10452.f35681 == null || !c10452.f35681.isHeld()) {
            return;
        }
        c10452.f35681.release();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m20159() {
        synchronized (this) {
            for (C0572 c0572 : this.f25192) {
                if (c0572 != null) {
                    c0572.m2698();
                    c0572.m2710();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m20161(Thread thread) {
        Object obj = f25191;
        synchronized (obj) {
            if (m20166(thread) && !this.f25196) {
                if (this.f25194 != null) {
                    return true;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, getPackageName() + ":FTPServer");
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire();
                synchronized (obj) {
                    if (m20166(thread) && !this.f25196 && this.f25194 == null) {
                        this.f25194 = wakeLockNewWakeLock;
                        return true;
                    }
                    if (wakeLockNewWakeLock.isHeld()) {
                        wakeLockNewWakeLock.release();
                    }
                    return false;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m20168(Thread thread) {
        Object obj = f25191;
        synchronized (obj) {
            if (m20166(thread) && !this.f25196) {
                if (this.f25193 != null) {
                    return true;
                }
                WifiManager.WifiLock wifiLockCreateWifiLock = ((WifiManager) getApplicationContext().getSystemService("wifi")).createWifiLock(3, getPackageName() + ":FTPServer");
                wifiLockCreateWifiLock.setReferenceCounted(false);
                wifiLockCreateWifiLock.acquire();
                synchronized (obj) {
                    if (m20166(thread) && !this.f25196 && this.f25193 == null) {
                        this.f25193 = wifiLockCreateWifiLock;
                        return true;
                    }
                    if (wifiLockCreateWifiLock.isHeld()) {
                        wifiLockCreateWifiLock.release();
                    }
                    return false;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m20169() {
        String strM40770 = C17506.m40770();
        if (strM40770 == null) {
            return C16737.m39288(R.string.MT_Protector);
        }
        StringBuilder sbM30914 = C12441.m30914("ftp://", strM40770, ":");
        sbM30914.append(C21034.m47435());
        return sbM30914.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20174(C0572 c0572) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            for (C0572 c0573 : this.f25192) {
                if (!c0573.isAlive()) {
                    try {
                        c0573.join();
                        arrayList.add(c0573);
                        c0573.m2710();
                    } catch (InterruptedException unused) {
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f25192.remove((C0572) it.next());
            }
            this.f25192.add(c0572);
        }
    }
}
