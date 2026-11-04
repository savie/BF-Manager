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

/* JADX INFO: renamed from: l.ᩳ۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAJ2 */
/* JADX INFO: loaded from: classes4.dex */
public class ServiceC19096 extends Service {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final NotificationManager f61816;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f61819;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f61822;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12966 f61821 = new C12966();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final RunnableC7909 f61817 = new RunnableC7909(0, this);

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f61818 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f61820 = -1;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            f61816.createNotificationChannels(Arrays.asList(new NotificationChannel("MTaskService", "Task Running Notification", 3), new NotificationChannel("MTaskService3", "Task Error Notification", 4)));
        }
        C13678.m33465();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m44209() {
        int size = this.f61821.size();
        int i = this.f61818;
        if (size == i) {
            m44207();
            return;
        }
        this.f61820 = size;
        if (i == -1) {
            m44210();
            return;
        }
        if (this.f61822) {
            return;
        }
        long jElapsedRealtime = 1000 - (SystemClock.elapsedRealtime() - this.f61819);
        if (jElapsedRealtime <= 0) {
            m44210();
        } else {
            this.f61822 = true;
            C21576.m49069(this.f61817, jElapsedRealtime);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m44210() {
        this.f61822 = false;
        int i = this.f61820;
        this.f61820 = -1;
        if (i <= 0 || i == this.f61818) {
            return;
        }
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) ActivityC0451.class), 67108864);
        C3558 c3558 = new C3558(this, "MTaskService");
        c3558.m11599();
        c3558.m11594(getString(R.string.MT_Protector));
        c3558.m11593((CharSequence) getResources().getQuantityString(R.plurals.MT_Protector, i, Integer.valueOf(i)));
        c3558.m11591(activity);
        c3558.m11597();
        c3558.m11596(false);
        c3558.m11600();
        Notification notificationM11589 = c3558.m11589();
        if (this.f61818 == -1) {
            startForeground(b.c, notificationM11589);
        } else {
            f61816.notify(b.c, notificationM11589);
        }
        this.f61818 = i;
        this.f61819 = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44207() {
        this.f61820 = -1;
        if (this.f61822) {
            C21576.m49077().removeCallbacks(this.f61817);
            this.f61822 = false;
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        this.f61821.add(i2);
        m44209();
        try {
            AbstractC18900 abstractC18900 = (AbstractC18900) ((Class) intent.getSerializableExtra("TaskClass")).newInstance();
            abstractC18900.mo36391(intent);
            int i3 = C13678.f43415;
            C5261.f18540.submit(new RunnableC6967(this, abstractC18900, i2));
            return 2;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44211(int i) {
        C12966 c12966 = this.f61821;
        c12966.remove(i);
        if (c12966.isEmpty()) {
            m44207();
            stopSelf();
        } else {
            m44209();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m44207();
        super.onDestroy();
        stopForeground(true);
    }

    static {
        Object systemService = C21576.m49084().getSystemService("notification");
        C15243.m36586(systemService);
        f61816 = (NotificationManager) systemService;
    }
}
