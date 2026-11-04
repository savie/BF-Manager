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

/* JADX INFO: renamed from: l.᩸ۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAMT */
/* JADX INFO: loaded from: classes.dex */
public class ServiceC22717 extends Service implements Runnable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f73718 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static ServiceC22717 f73719;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static volatile Thread f73720;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Object f73721 = new Object();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public PowerManager.WakeLock f73723;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ServerSocket f73725;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C13700 f73728;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile boolean f73722 = false;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C1834 f73727 = null;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f73726 = new ArrayList();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public WifiManager.WifiLock f73724 = null;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m51237() {
        boolean z;
        synchronized (f73721) {
            z = f73720 != null && f73720.isAlive();
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m51233() {
        if (m51237()) {
            return;
        }
        Application applicationM49084 = C21576.m49084();
        C7508.m20562(applicationM49084, new Intent(applicationM49084, (Class<?>) ServiceC22717.class));
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("MT_FTP_SERVER", getString(R.string.MT_Protector), 3));
        }
        startForeground(1004, m51235());
        this.f73728 = new C13700(this, new RunnableC3003(2, this));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private Notification m51235() {
        Intent action = new Intent(this, (Class<?>) ServiceC22717.class).setAction("bin.mt.plus.FsService.ACTION_STOP");
        Intent intentPutExtra = new Intent(this, (Class<?>) ActivityC12647.class).putExtra("bin.mt.plus.tool.RemoteManageActivity.EXTRA_PROTOCOL", 1);
        C3558 c3558 = new C3558(this, "MT_FTP_SERVER");
        c3558.m11599();
        c3558.m11594(C21576.m49088(R.string.MT_Protector));
        c3558.m11593((CharSequence) m51229());
        c3558.m11591(PendingIntent.getActivity(this, 0, intentPutExtra, 201326592));
        c3558.m11597();
        c3558.m11596(false);
        c3558.m11590(android.R.drawable.ic_delete, getString(R.string.MT_Protector), PendingIntent.getService(this, 0, action, 67108864));
        return c3558.m11589();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        startForeground(1004, m51235());
        if (intent != null && "bin.mt.plus.FsService.ACTION_STOP".equals(intent.getAction())) {
            stopSelf();
            return 2;
        }
        synchronized (f73721) {
            Thread thread = f73720;
            if (thread != null && thread.isAlive()) {
                return 1;
            }
            RuntimeException runtimeException = null;
            f73720 = null;
            f73719 = null;
            this.f73722 = false;
            Thread thread2 = new Thread(this);
            f73720 = thread2;
            f73719 = this;
            try {
                thread2.start();
            } catch (RuntimeException e) {
                if (f73720 == thread2 && f73719 == this) {
                    f73720 = null;
                    f73719 = null;
                }
                runtimeException = e;
            }
            if (runtimeException == null) {
                return 1;
            }
            stopSelf();
            m51225(runtimeException.toString());
            return 2;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C10782 c10782;
        this.f73728.m33493();
        this.f73722 = true;
        synchronized (f73721) {
            if (f73719 != this) {
                c10782 = C10782.m27472();
            } else {
                this.f73722 = true;
                c10782 = new C10782();
                c10782.f34220 = f73720;
                c10782.f34219 = this.f73725;
                this.f73725 = null;
                c10782.f34217 = this.f73727;
                this.f73727 = null;
            }
        }
        if (c10782.f34220 != null) {
            c10782.f34220.interrupt();
        }
        m51226(c10782);
        m51226(m51232());
        stopForeground(true);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private C10782 m51232() {
        C10782 c10782;
        synchronized (f73721) {
            c10782 = new C10782();
            c10782.f34218 = this.f73723;
            this.f73723 = null;
            c10782.f34216 = this.f73724;
            this.f73724 = null;
        }
        return c10782;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m51240() throws Throwable {
        Throwable th;
        Throwable th2;
        ServerSocket serverSocket = new ServerSocket();
        boolean z = true;
        try {
            serverSocket.setReuseAddress(true);
            serverSocket.bind(new InetSocketAddress(C19733.m45439()));
            synchronized (f73721) {
                try {
                    if (!m51228(Thread.currentThread()) || this.f73722) {
                        z = false;
                    } else {
                        this.f73725 = serverSocket;
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
        C10782 c10782M51224;
        Intent intent;
        Intent intent2;
        Thread threadCurrentThread = Thread.currentThread();
        boolean z3 = false;
        String string = null;
        try {
            z = true;
            if (m51236(threadCurrentThread)) {
                C10782 c10782M51225 = m51224(threadCurrentThread, true);
                m51226(c10782M51225);
                if (!c10782M51225.f34214) {
                    return;
                }
                stopSelf();
                if (!c10782M51225.f34215) {
                    return;
                } else {
                    intent2 = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                }
            } else {
                try {
                    try {
                        C7756.m21114();
                        if (m51236(threadCurrentThread)) {
                            C10782 c10782M51226 = m51224(threadCurrentThread, true);
                            m51226(c10782M51226);
                            if (!c10782M51226.f34214) {
                                return;
                            }
                            stopSelf();
                            if (!c10782M51226.f34215) {
                                return;
                            } else {
                                intent2 = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                            }
                        } else {
                            try {
                                if (!m51240()) {
                                    C10782 c10782M51227 = m51224(threadCurrentThread, true);
                                    m51226(c10782M51227);
                                    if (!c10782M51227.f34214) {
                                        return;
                                    }
                                    stopSelf();
                                    if (!c10782M51227.f34215) {
                                        return;
                                    } else {
                                        intent2 = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                                    }
                                } else if (m51236(threadCurrentThread) || !m51234(threadCurrentThread) || !m51238(threadCurrentThread)) {
                                    C10782 c10782M51228 = m51224(threadCurrentThread, true);
                                    m51226(c10782M51228);
                                    if (!c10782M51228.f34214) {
                                        return;
                                    }
                                    stopSelf();
                                    if (!c10782M51228.f34215) {
                                        return;
                                    } else {
                                        intent2 = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                                    }
                                } else {
                                    if (!m51236(threadCurrentThread)) {
                                        C21576.m49065(new Intent("bin.mt.plus.FTP_SERVER_STARTED"));
                                        while (!m51236(threadCurrentThread)) {
                                            try {
                                                m51230(threadCurrentThread);
                                                try {
                                                    Thread.sleep(1000L);
                                                } catch (InterruptedException unused) {
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                z2 = false;
                                                if (z) {
                                                    m51231();
                                                }
                                                c10782M51224 = m51224(threadCurrentThread, false);
                                                m51226(c10782M51224);
                                                if (c10782M51224.f34214) {
                                                    stopSelf();
                                                    if (!z2) {
                                                        if (z) {
                                                            C21576.m49065(new Intent("bin.mt.plus.FTP_SERVER_STOPPED"));
                                                        } else {
                                                            C21576.m49065(new Intent("bin.mt.plus.FTP_SERVER_STOPPED"));
                                                        }
                                                    } else if (z) {
                                                        C21576.m49065(new Intent("bin.mt.plus.FTP_SERVER_STOPPED"));
                                                    } else {
                                                        C21576.m49065(new Intent("bin.mt.plus.FTP_SERVER_STOPPED"));
                                                    }
                                                }
                                                throw th;
                                            }
                                        }
                                        m51231();
                                        C10782 c10782M51229 = m51224(threadCurrentThread, true);
                                        m51226(c10782M51229);
                                        if (c10782M51229.f34214) {
                                            stopSelf();
                                            intent = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                                            C21576.m49065(intent);
                                            return;
                                        }
                                        return;
                                    }
                                    C10782 c10782M512210 = m51224(threadCurrentThread, true);
                                    m51226(c10782M512210);
                                    if (!c10782M512210.f34214) {
                                        return;
                                    }
                                    stopSelf();
                                    if (!c10782M512210.f34215) {
                                        return;
                                    } else {
                                        intent2 = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                                    }
                                }
                            } catch (IOException e) {
                                if (m51236(threadCurrentThread)) {
                                    z3 = true;
                                    z = false;
                                } else {
                                    string = e instanceof BindException ? C21576.m49059(R.string.MT_Protector, Integer.valueOf(C19733.m45439())) : e.toString();
                                }
                                C10782 c10782M512211 = m51224(threadCurrentThread, z3);
                                m51226(c10782M512211);
                                if (c10782M512211.f34214) {
                                    stopSelf();
                                    if (!z || c10782M512211.f34215) {
                                        if (!c10782M512211.f34215) {
                                            return;
                                        } else {
                                            intent = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                                        }
                                    }
                                    m51225(string);
                                    return;
                                }
                                return;
                            }
                        }
                    } catch (IOException e2) {
                        if (m51236(threadCurrentThread)) {
                            z3 = true;
                            z = false;
                        } else {
                            string = e2.toString();
                        }
                        C10782 c10782M512212 = m51224(threadCurrentThread, z3);
                        m51226(c10782M512212);
                        if (c10782M512212.f34214) {
                            stopSelf();
                            if (!z || c10782M512212.f34215) {
                                if (!c10782M512212.f34215) {
                                    return;
                                } else {
                                    intent = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                                }
                            }
                            m51225(string);
                            return;
                        }
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                    z2 = true;
                    if (z) {
                        m51231();
                    }
                    c10782M51224 = m51224(threadCurrentThread, false);
                    m51226(c10782M51224);
                    if (c10782M51224.f34214) {
                        stopSelf();
                        if (!z2 && !c10782M51224.f34215) {
                            m51225((String) null);
                        } else if (z || c10782M51224.f34215) {
                            C21576.m49065(new Intent("bin.mt.plus.FTP_SERVER_STOPPED"));
                        }
                    }
                    throw th;
                }
            }
            C21576.m49065(intent2);
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C10782 m51224(Thread thread, boolean z) {
        C10782 c10782;
        synchronized (f73721) {
            boolean zM51228 = m51228(thread);
            c10782 = new C10782();
            c10782.f34214 = zM51228;
            c10782.f34215 = z || this.f73722;
            c10782.f34219 = this.f73725;
            this.f73725 = null;
            c10782.f34217 = this.f73727;
            this.f73727 = null;
            c10782.f34218 = this.f73723;
            this.f73723 = null;
            c10782.f34216 = this.f73724;
            this.f73724 = null;
            if (zM51228) {
                f73720 = null;
                f73719 = null;
                this.f73722 = false;
            }
        }
        return c10782;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m51230(Thread thread) {
        C1834 c1834;
        ServerSocket serverSocket;
        synchronized (f73721) {
            if (m51228(thread) && !this.f73722) {
                C1834 c1835 = this.f73727;
                C1834 c1836 = null;
                if (c1835 == null || c1835.isAlive()) {
                    c1834 = null;
                } else {
                    c1834 = this.f73727;
                    this.f73727 = null;
                }
                if (c1834 != null) {
                    try {
                        c1834.join();
                    } catch (InterruptedException unused) {
                    }
                }
                synchronized (f73721) {
                    if (m51228(thread) && !this.f73722 && this.f73727 == null && (serverSocket = this.f73725) != null) {
                        c1836 = new C1834();
                        c1836.f6213 = serverSocket;
                        c1836.f6212 = this;
                        this.f73727 = c1836;
                    }
                }
                if (c1836 != null) {
                    c1836.start();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m51236(Thread thread) {
        boolean z;
        synchronized (f73721) {
            z = !m51228(thread) || this.f73722;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m51228(Thread thread) {
        return thread == f73720 && f73719 == this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51225(String str) {
        Intent intent = new Intent("bin.mt.plus.FTP_SERVER_FAILED_TO_START");
        intent.putExtra("msg", str);
        C21576.m49065(intent);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51226(C10782 c10782) {
        if (c10782.f34217 != null) {
            C1834 c1834 = c10782.f34217;
            c1834.getClass();
            try {
                c1834.f6213.close();
            } catch (Exception unused) {
            }
        }
        ServerSocket serverSocket = c10782.f34219;
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException unused2) {
            }
        }
        if (c10782.f34216 != null && c10782.f34216.isHeld()) {
            c10782.f34216.release();
        }
        if (c10782.f34218 == null || !c10782.f34218.isHeld()) {
            return;
        }
        c10782.f34218.release();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m51231() {
        synchronized (this) {
            for (C5563 c5563 : this.f73726) {
                if (c5563 != null) {
                    c5563.m16477();
                    c5563.m16494();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m51238(Thread thread) {
        Object obj = f73721;
        synchronized (obj) {
            if (m51228(thread) && !this.f73722) {
                if (this.f73723 != null) {
                    return true;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, getPackageName() + ":FTPServer");
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire();
                synchronized (obj) {
                    if (m51228(thread) && !this.f73722 && this.f73723 == null) {
                        this.f73723 = wakeLockNewWakeLock;
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

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m51234(Thread thread) {
        Object obj = f73721;
        synchronized (obj) {
            if (m51228(thread) && !this.f73722) {
                if (this.f73724 != null) {
                    return true;
                }
                WifiManager.WifiLock wifiLockCreateWifiLock = ((WifiManager) getApplicationContext().getSystemService("wifi")).createWifiLock(3, getPackageName() + ":FTPServer");
                wifiLockCreateWifiLock.setReferenceCounted(false);
                wifiLockCreateWifiLock.acquire();
                synchronized (obj) {
                    if (m51228(thread) && !this.f73722 && this.f73724 == null) {
                        this.f73724 = wifiLockCreateWifiLock;
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m51229() {
        String strM55708 = C24955.m55708();
        if (strM55708 == null) {
            return C21576.m49088(R.string.MT_Protector);
        }
        StringBuilder sbM51387 = C22783.m51387("ftp://", strM55708, ":");
        sbM51387.append(C19733.m45439());
        return sbM51387.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51239(C5563 c5563) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            for (C5563 c5564 : this.f73726) {
                if (!c5564.isAlive()) {
                    try {
                        c5564.join();
                        arrayList.add(c5564);
                        c5564.m16494();
                    } catch (InterruptedException unused) {
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f73726.remove((C5563) it.next());
            }
            this.f73726.add(c5563);
        }
    }
}
