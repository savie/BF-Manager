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

/* JADX INFO: renamed from: l.ۘ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8UX */
/* JADX INFO: loaded from: classes2.dex */
public class ServiceC4415 extends Service {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static WeakReference f15846;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f15847 = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final NotificationManager f15848;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Handler f15849;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f15850;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C13363 f15851;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C4525 f15852;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public BroadcastReceiver f15853;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        f15846 = new WeakReference(this);
        C23807 c23807M11951 = C3669.m11951();
        if (c23807M11951 != null && c23807M11951.f77120) {
            this.f15850 = c23807M11951.f77117;
        }
        this.f15852 = C4525.m14247(this);
        C13363 c13363 = new C13363(this);
        this.f15851 = c13363;
        c13363.m32947(new C24553(this), null);
        this.f15851.m32950(true);
        if (Build.VERSION.SDK_INT >= 26) {
            f15848.createNotificationChannel(new NotificationChannel("MusicPlayerService", getString(R.string.MT_Protector), 3));
        }
        startForeground(1006, m14040());
        this.f15853 = new C6653(this);
        registerReceiver(this.f15853, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m14039() {
        WeakReference weakReference = f15846;
        ServiceC4415 serviceC4415 = weakReference == null ? null : (ServiceC4415) weakReference.get();
        if (serviceC4415 == null || !serviceC4415.m14038(C3669.m11951())) {
            return;
        }
        Handler handler = f15849;
        if (handler.hasMessages(0)) {
            return;
        }
        handler.sendEmptyMessageDelayed(0, 100L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14036(ServiceC4415 serviceC4415) {
        if (serviceC4415.m14038(C3669.m11951())) {
            serviceC4415.f15852.m14249(serviceC4415.m14040());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m14038(C23807 c23807) {
        return c23807 != null && c23807.f77120 && c23807.f77117 == this.f15850;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private Notification m14040() {
        int i;
        String str = (String) C3669.f12619.m40346();
        String str2 = (String) C3669.f12620.m40346();
        Bitmap bitmap = (Bitmap) C3669.f12615.m40346();
        Bitmap bitmap2 = (Bitmap) C3669.f12627.m40346();
        int iIntValue = ((Integer) C3669.f12626.m40346()).intValue();
        long jIntValue = ((Integer) C3669.f12616.m40346()).intValue() * 50;
        long jIntValue2 = ((Integer) C3669.f12624.m40346()).intValue() * 50;
        boolean z = C3669.f12621.m40346() == Boolean.TRUE;
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
        C13363 c13363 = this.f15851;
        C4657 c4657 = new C4657();
        c4657.m14514("android.media.metadata.TITLE", str);
        c4657.m14514("android.media.metadata.ARTIST", str2);
        c4657.m14512(jIntValue);
        c4657.m14513("android.media.metadata.ART", bitmap);
        c4657.m14513("android.media.metadata.DISPLAY_ICON", bitmap2);
        c13363.m32949(c4657.m14511());
        C13363 c13364 = this.f15851;
        C17838 c17838 = new C17838();
        c17838.m41692(z ? 3 : 2, jIntValue2, 1.0f, SystemClock.elapsedRealtime());
        c17838.m41693();
        c13364.m32948(c17838.m41691());
        Intent intentPutExtra = new Intent(this, (Class<?>) ActivityC20823.class).putExtra("fromService", true);
        C3558 c3558 = new C3558(this, "MusicPlayerService");
        c3558.m11599();
        c3558.m11594(str);
        c3558.m11593((CharSequence) str2);
        c3558.m11592(bitmap2);
        c3558.m11596(false);
        c3558.m11597();
        c3558.m11600();
        c3558.m11598();
        c3558.m11591(PendingIntent.getActivity(this, 0, intentPutExtra, 201326592));
        c3558.m11590(i, "mode", m14034("bin.mt.media.MusicPlayerService.ACTION_MODE"));
        c3558.m11590(R.drawable.MT_Protector, "Previous", m14034("bin.mt.media.MusicPlayerService.ACTION_PREVIOUS"));
        c3558.m11590(z ? R.drawable.MT_Protector : R.drawable.MT_Protector, z ? "Pause" : "Play", m14034("bin.mt.media.MusicPlayerService.ACTION_PLAY_OR_PAUSE"));
        c3558.m11590(R.drawable.MT_Protector, "Next", m14034("bin.mt.media.MusicPlayerService.ACTION_NEXT"));
        c3558.m11590(R.drawable.MT_Protector, "Expand", m14034("bin.mt.media.MusicPlayerService.ACTION_EXIT"));
        C16174 c16174 = new C16174();
        c16174.m38403(1, 2, 3);
        c16174.m38402(this.f15851.m32946());
        c3558.m11595(c16174);
        return c3558.m11589();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private PendingIntent m14034(String str) {
        return PendingIntent.getService(this, 0, new Intent(this, (Class<?>) ServiceC4415.class).setAction(str).putExtra("playbackSessionId", this.f15850), 201326592);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C23807 c23807M11951 = C3669.m11951();
        String action = intent.getAction();
        long longExtra = intent.getLongExtra("playbackSessionId", 0L);
        if (action == null) {
            if (longExtra != 0 && c23807M11951 != null && c23807M11951.f77120 && c23807M11951.f77117 == longExtra) {
                this.f15850 = longExtra;
                if (m14038(C3669.m11951())) {
                    this.f15852.m14249(m14040());
                    return 2;
                }
            } else if (c23807M11951 == null || !c23807M11951.f77120) {
                stopSelf();
                return 2;
            }
        } else if (m14038(c23807M11951)) {
            if (longExtra != 0 && longExtra == this.f15850) {
                switch (action) {
                    case "bin.mt.media.MusicPlayerService.ACTION_EXIT":
                        stopSelf();
                        break;
                    case "bin.mt.media.MusicPlayerService.ACTION_MODE":
                        C11369.m28683();
                        return 2;
                    case "bin.mt.media.MusicPlayerService.ACTION_NEXT":
                        c23807M11951.m53129();
                        return 2;
                    case "bin.mt.media.MusicPlayerService.ACTION_PLAY_OR_PAUSE":
                        c23807M11951.m53127();
                        return 2;
                    case "bin.mt.media.MusicPlayerService.ACTION_PREVIOUS":
                        c23807M11951.m53128();
                        return 2;
                }
            }
        } else if (c23807M11951 == null || !c23807M11951.f77120) {
            stopSelf();
            return 2;
        }
        return 2;
    }

    static {
        Object systemService = C21576.m49084().getSystemService("notification");
        C15243.m36586(systemService);
        f15848 = (NotificationManager) systemService;
        f15849 = new HandlerC12618(Looper.getMainLooper());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        f15849.removeMessages(0);
        WeakReference weakReference = f15846;
        if (weakReference != null && weakReference.get() == this) {
            f15846 = null;
        }
        this.f15851.m32950(false);
        this.f15851.m32951();
        C1432.m5166();
        C23807 c23807M11951 = C3669.m11951();
        if (c23807M11951 != null && c23807M11951.f77117 == this.f15850) {
            c23807M11951.m53126(true);
            C3669.m11941(c23807M11951);
        }
        stopForeground(true);
        this.f15852.m14251();
        BroadcastReceiver broadcastReceiver = this.f15853;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
    }
}
