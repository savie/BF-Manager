package l;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.security.MessageDigest;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ۜۡ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: A9T8 */
/* JADX INFO: loaded from: classes2.dex */
public class ServiceC6650 extends Service {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f22461 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final NotificationManager f22462 = (NotificationManager) C16737.m39287("notification");

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C11590 f22463;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public PendingIntent f22464;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            f22462.createNotificationChannel(new NotificationChannel("MT_HTTP_SERVER", getString(R.string.MT_Protector), 3));
        }
        startForeground(1005, m18026());
        this.f22463 = new C11590(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Notification m18026() {
        Intent action = new Intent(this, (Class<?>) ServiceC6650.class).setAction("bin.mt.plus.NetworkStreamingService.ACTION_STOP");
        C3577 c3577 = new C3577(this, "MT_HTTP_SERVER");
        c3577.m10592();
        c3577.m10586(C16737.m39288(R.string.MT_Protector));
        c3577.m10590();
        c3577.m10582(android.R.drawable.ic_delete, getString(R.string.MT_Protector), PendingIntent.getService(this, 0, action, 67108864));
        if (this.f22464 != null) {
            c3577.m10585((CharSequence) getString(R.string.MT_Protector));
            c3577.m10583(this.f22464);
        }
        return c3577.m10581();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        startForeground(1005, m18026());
        String action = intent.getAction();
        if ("bin.mt.plus.NetworkStreamingService.ACTION_PLAY".equals(action)) {
            RunnableC3827 runnableC3827 = new RunnableC3827(0, this, intent);
            if (this.f22463.m28883()) {
                runnableC3827.run();
                return 2;
            }
            if (!this.f22463.isAlive()) {
                return 2;
            }
            C16737.m39274(runnableC3827, 100L);
            return 2;
        }
        if (!"bin.mt.plus.NetworkStreamingService.ACTION_STOP".equals(action)) {
            return 2;
        }
        stopSelf();
        return 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18027(ServiceC6650 serviceC6650, Intent intent) {
        try {
            ComponentName componentName = (ComponentName) intent.getParcelableExtra("componentName");
            byte[] byteArrayExtra = intent.getByteArrayExtra("statelessVisitor");
            C13638.requireNonNull(byteArrayExtra);
            String stringExtra = intent.getStringExtra(MotionUtils.EASING_TYPE_PATH);
            C13638.requireNonNull(stringExtra);
            String stringExtra2 = intent.getStringExtra("mime");
            C13638.requireNonNull(stringExtra2);
            long longExtra = intent.getLongExtra("time", 0L);
            long longExtra2 = intent.getLongExtra(Name.LENGTH, 0L);
            AbstractC12233 abstractC12233 = (AbstractC12233) C14616.m35094(byteArrayExtra, false);
            MessageDigest messageDigestM49416 = C22253.m49416();
            messageDigestM49416.update(byteArrayExtra);
            C22253.m49418(messageDigestM49416, stringExtra);
            C22253.m49418(messageDigestM49416, stringExtra2);
            C22253.m49418(messageDigestM49416, String.valueOf(longExtra));
            C22253.m49418(messageDigestM49416, String.valueOf(longExtra2));
            Uri uriM28882 = serviceC6650.f22463.m28882(new C3431(abstractC12233, C22253.m49424(messageDigestM49416.digest()).substring(0, 16), stringExtra, stringExtra2, longExtra2));
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setDataAndType(uriM28882, stringExtra2);
            intent2.setComponent(componentName);
            intent2.addFlags(268435456);
            serviceC6650.startActivity(intent2);
            serviceC6650.f22464 = PendingIntent.getActivity(serviceC6650, 0, intent2, 201326592);
            f22462.notify(1005, serviceC6650.m18026());
        } catch (Exception e) {
            Main mainM47527 = C21094.m47527();
            if (mainM47527 != null) {
                mainM47527.m31002(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        stopForeground(true);
        this.f22463.m28884();
    }
}
