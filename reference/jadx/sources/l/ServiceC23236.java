package l;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.SystemClock;
import bin.mt.plus.R;
import com.alipay.sdk.m.t0.b;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩺᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAJ2 */
/* JADX INFO: loaded from: classes.dex */
public class ServiceC23236 extends Service {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final NotificationManager f75398;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f75401;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f75404;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C24014 f75403 = new C24014();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final RunnableC7361 f75402 = new RunnableC7361(4, this);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f75400 = -1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f75399 = -1;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            f75398.createNotificationChannels(Arrays.asList(new NotificationChannel("MTaskService", "Task Running Notification", 3), new NotificationChannel("MTaskService3", "Task Error Notification", 4)));
        }
        C20725.m46660();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m51277() {
        int size = this.f75403.size();
        int i = this.f75400;
        if (size == i) {
            m51275();
            return;
        }
        this.f75399 = size;
        if (i == -1) {
            m51278();
            return;
        }
        if (this.f75404) {
            return;
        }
        long jElapsedRealtime = 1000 - (SystemClock.elapsedRealtime() - this.f75401);
        if (jElapsedRealtime <= 0) {
            m51278();
        } else {
            this.f75404 = true;
            C16737.m39274(this.f75402, jElapsedRealtime);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m51278() {
        this.f75404 = false;
        int i = this.f75399;
        this.f75399 = -1;
        if (i <= 0 || i == this.f75400) {
            return;
        }
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) ActivityC7007.class), 67108864);
        C3577 c3577 = new C3577(this, "MTaskService");
        c3577.m10592();
        c3577.m10586(getString(R.string.MT_Protector));
        c3577.m10585((CharSequence) getResources().getQuantityString(R.plurals.MT_Protector, i, Integer.valueOf(i)));
        c3577.m10583(activity);
        c3577.m10590();
        c3577.m10588(false);
        c3577.m10589();
        Notification notificationM10581 = c3577.m10581();
        if (this.f75400 == -1) {
            startForeground(b.c, notificationM10581);
        } else {
            f75398.notify(b.c, notificationM10581);
        }
        this.f75400 = i;
        this.f75401 = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51275() {
        this.f75399 = -1;
        if (this.f75404) {
            C16737.m39278().removeCallbacks(this.f75402);
            this.f75404 = false;
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        this.f75403.add(i2);
        m51277();
        try {
            AbstractC17902 abstractC17902 = (AbstractC17902) ((Class) intent.getSerializableExtra("TaskClass")).newInstance();
            abstractC17902.mo2976(intent);
            int i3 = C20725.f67443;
            C4716.f16636.submit(new RunnableC7319(this, abstractC17902, i2));
            return 2;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51279(int i) {
        C24014 c24014 = this.f75403;
        c24014.remove(i);
        if (c24014.isEmpty()) {
            m51275();
            stopSelf();
        } else {
            m51277();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m51275();
        super.onDestroy();
        stopForeground(true);
    }

    static {
        Object systemService = C16737.m39277().getSystemService("notification");
        C13465.m32962(systemService);
        f75398 = (NotificationManager) systemService;
    }
}
