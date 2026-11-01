package l;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ᩳ֡۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8UX */
/* JADX INFO: loaded from: classes4.dex */
public class ServiceC17701 extends Service {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final NotificationManager f56203;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static WeakReference f56204;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f56205 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Handler f56206;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C5695 f56207;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C1148 f56208;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f56209;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public BroadcastReceiver f56210;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        f56204 = new WeakReference(this);
        C12763 c12763M10654 = C3589.m10654();
        if (c12763M10654 != null && c12763M10654.f42563) {
            this.f56209 = c12763M10654.f42570;
        }
        this.f56207 = C5695.m15707(this);
        C1148 c1148 = new C1148(this);
        this.f56208 = c1148;
        c1148.m4238(new C21229(this), null);
        this.f56208.m4239(true);
        if (Build.VERSION.SDK_INT >= 26) {
            f56203.createNotificationChannel(new NotificationChannel("MusicPlayerService", getString(R.string.MT_Protector), 3));
        }
        startForeground(1006, m41234());
        this.f56210 = new C14880(this);
        registerReceiver(this.f56210, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m41233() {
        WeakReference weakReference = f56204;
        ServiceC17701 serviceC17701 = weakReference == null ? null : (ServiceC17701) weakReference.get();
        if (serviceC17701 == null || !serviceC17701.m41231(C3589.m10654())) {
            return;
        }
        Handler handler = f56206;
        if (handler.hasMessages(0)) {
            return;
        }
        handler.sendEmptyMessageDelayed(0, 100L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41230(ServiceC17701 serviceC17701) {
        if (serviceC17701.m41231(C3589.m10654())) {
            serviceC17701.f56207.m15709(serviceC17701.m41234());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m41231(C12763 c12763) {
        return c12763 != null && c12763.f42563 && c12763.f42570 == this.f56209;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private Notification m41234() {
        int i;
        String str = (String) C3589.f13213.m44956();
        String str2 = (String) C3589.f13209.m44956();
        Bitmap bitmap = (Bitmap) C3589.f13215.m44956();
        Bitmap bitmap2 = (Bitmap) C3589.f13217.m44956();
        int iIntValue = ((Integer) C3589.f13212.m44956()).intValue();
        long jIntValue = ((Integer) C3589.f13218.m44956()).intValue() * 50;
        long jIntValue2 = ((Integer) C3589.f13222.m44956()).intValue() * 50;
        boolean z = C3589.f13219.m44956() == Boolean.TRUE;
        if (iIntValue == 1) {
            i = R.drawable.MT_Protector;
        } else if (iIntValue != 2) {
            i = iIntValue != 3 ? R.drawable.MT_Protector : R.drawable.MT_Protector;
        } else {
            i = R.drawable.MT_Protector;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            bitmap = null;
        }
        if (bitmap2 == null || bitmap2.isRecycled()) {
            bitmap2 = null;
        }
        C1148 c1148 = this.f56208;
        C4407 c4407 = new C4407();
        c4407.m12336("android.media.metadata.TITLE", str);
        c4407.m12336("android.media.metadata.ARTIST", str2);
        c4407.m12334(jIntValue);
        c4407.m12335("android.media.metadata.ART", bitmap);
        c4407.m12335("android.media.metadata.DISPLAY_ICON", bitmap2);
        c1148.m4237(c4407.m12333());
        C1148 c1149 = this.f56208;
        C21610 c21610 = new C21610();
        c21610.m48322(z ? 3 : 2, jIntValue2, 1.0f, SystemClock.elapsedRealtime());
        c21610.m48323();
        c1149.m4236(c21610.m48321());
        Intent intentPutExtra = new Intent(this, (Class<?>) ActivityC6412.class).putExtra("fromService", true);
        C3577 c3577 = new C3577(this, "MusicPlayerService");
        c3577.m10592();
        c3577.m10586(str);
        c3577.m10585((CharSequence) str2);
        c3577.m10584(bitmap2);
        c3577.m10588(false);
        c3577.m10590();
        c3577.m10589();
        c3577.m10579();
        c3577.m10583(PendingIntent.getActivity(this, 0, intentPutExtra, 201326592));
        c3577.m10582(i, "mode", m41228("bin.mt.media.MusicPlayerService.ACTION_MODE"));
        c3577.m10582(R.drawable.MT_Protector, "Previous", m41228("bin.mt.media.MusicPlayerService.ACTION_PREVIOUS"));
        c3577.m10582(z ? R.drawable.MT_Protector : R.drawable.MT_Protector, z ? "Pause" : "Play", m41228("bin.mt.media.MusicPlayerService.ACTION_PLAY_OR_PAUSE"));
        c3577.m10582(R.drawable.MT_Protector, "Next", m41228("bin.mt.media.MusicPlayerService.ACTION_NEXT"));
        c3577.m10582(R.drawable.MT_Protector, "Expand", m41228("bin.mt.media.MusicPlayerService.ACTION_EXIT"));
        C6215 c6215 = new C6215();
        c6215.m17218(1, 2, 3);
        c6215.m17217(this.f56208.m4235());
        c3577.m10587(c6215);
        return c3577.m10581();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private PendingIntent m41228(String str) {
        return PendingIntent.getService(this, 0, new Intent(this, (Class<?>) ServiceC17701.class).setAction(str).putExtra("playbackSessionId", this.f56209), 201326592);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C12763 c12763M10654 = C3589.m10654();
        String action = intent.getAction();
        long longExtra = intent.getLongExtra("playbackSessionId", 0L);
        if (action == null) {
            if (longExtra != 0 && c12763M10654 != null && c12763M10654.f42563 && c12763M10654.f42570 == longExtra) {
                this.f56209 = longExtra;
                if (m41231(C3589.m10654())) {
                    this.f56207.m15709(m41234());
                    return 2;
                }
            } else if (c12763M10654 == null || !c12763M10654.f42563) {
                stopSelf();
                return 2;
            }
        } else if (m41231(c12763M10654)) {
            if (longExtra != 0 && longExtra == this.f56209) {
                switch (action) {
                    case "bin.mt.media.MusicPlayerService.ACTION_EXIT":
                        stopSelf();
                        break;
                    case "bin.mt.media.MusicPlayerService.ACTION_MODE":
                        C2758.m8419();
                        return 2;
                    case "bin.mt.media.MusicPlayerService.ACTION_NEXT":
                        c12763M10654.m31737();
                        return 2;
                    case "bin.mt.media.MusicPlayerService.ACTION_PLAY_OR_PAUSE":
                        c12763M10654.m31738();
                        return 2;
                    case "bin.mt.media.MusicPlayerService.ACTION_PREVIOUS":
                        c12763M10654.m31741();
                        return 2;
                }
            }
        } else if (c12763M10654 == null || !c12763M10654.f42563) {
            stopSelf();
            return 2;
        }
        return 2;
    }

    static {
        Object systemService = C16737.m39277().getSystemService("notification");
        C13465.m32962(systemService);
        f56203 = (NotificationManager) systemService;
        f56206 = new HandlerC22641(Looper.getMainLooper());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        f56206.removeMessages(0);
        WeakReference weakReference = f56204;
        if (weakReference != null && weakReference.get() == this) {
            f56204 = null;
        }
        this.f56208.m4239(false);
        this.f56208.m4240();
        C15586.m37239();
        C12763 c12763M10654 = C3589.m10654();
        if (c12763M10654 != null && c12763M10654.f42570 == this.f56209) {
            c12763M10654.m31736(true);
            C3589.m10648(c12763M10654);
        }
        stopForeground(true);
        this.f56207.m15711();
        BroadcastReceiver broadcastReceiver = this.f56210;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
    }
}
