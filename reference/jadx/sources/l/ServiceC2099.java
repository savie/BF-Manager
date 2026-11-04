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

/* JADX INFO: renamed from: l.֫ᩳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: A9T8 */
/* JADX INFO: loaded from: classes2.dex */
public class ServiceC2099 extends Service {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final NotificationManager f6951 = (NotificationManager) C21576.m49087("notification");

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f6952 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C11047 f6953;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public PendingIntent f6954;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            f6951.createNotificationChannel(new NotificationChannel("MT_HTTP_SERVER", getString(R.string.MT_Protector), 3));
        }
        startForeground(1005, m7266());
        this.f6953 = new C11047(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Notification m7266() {
        Intent action = new Intent(this, (Class<?>) ServiceC2099.class).setAction("bin.mt.plus.NetworkStreamingService.ACTION_STOP");
        C3558 c3558 = new C3558(this, "MT_HTTP_SERVER");
        c3558.m11599();
        c3558.m11594(C21576.m49088(R.string.MT_Protector));
        c3558.m11597();
        c3558.m11590(android.R.drawable.ic_delete, getString(R.string.MT_Protector), PendingIntent.getService(this, 0, action, 67108864));
        if (this.f6954 != null) {
            c3558.m11593((CharSequence) getString(R.string.MT_Protector));
            c3558.m11591(this.f6954);
        }
        return c3558.m11589();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        startForeground(1005, m7266());
        String action = intent.getAction();
        if ("bin.mt.plus.NetworkStreamingService.ACTION_PLAY".equals(action)) {
            RunnableC9530 runnableC9530 = new RunnableC9530(3, this, intent);
            if (this.f6953.m27934()) {
                runnableC9530.run();
                return 2;
            }
            if (!this.f6953.isAlive()) {
                return 2;
            }
            C21576.m49069(runnableC9530, 100L);
            return 2;
        }
        if (!"bin.mt.plus.NetworkStreamingService.ACTION_STOP".equals(action)) {
            return 2;
        }
        stopSelf();
        return 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7267(ServiceC2099 serviceC2099, Intent intent) {
        try {
            ComponentName componentName = (ComponentName) intent.getParcelableExtra("componentName");
            byte[] byteArrayExtra = intent.getByteArrayExtra("statelessVisitor");
            C17359.requireNonNull(byteArrayExtra);
            String stringExtra = intent.getStringExtra(MotionUtils.EASING_TYPE_PATH);
            C17359.requireNonNull(stringExtra);
            String stringExtra2 = intent.getStringExtra("mime");
            C17359.requireNonNull(stringExtra2);
            long longExtra = intent.getLongExtra("time", 0L);
            long longExtra2 = intent.getLongExtra(Name.LENGTH, 0L);
            AbstractC18881 abstractC18881 = (AbstractC18881) C18070.m42101(byteArrayExtra, false);
            MessageDigest messageDigestM36174 = C15022.m36174();
            messageDigestM36174.update(byteArrayExtra);
            C15022.m36176(messageDigestM36174, stringExtra);
            C15022.m36176(messageDigestM36174, stringExtra2);
            C15022.m36176(messageDigestM36174, String.valueOf(longExtra));
            C15022.m36176(messageDigestM36174, String.valueOf(longExtra2));
            Uri uriM27933 = serviceC2099.f6953.m27933(new C13702(abstractC18881, C15022.m36182(messageDigestM36174.digest()).substring(0, 16), stringExtra, stringExtra2, longExtra2));
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setDataAndType(uriM27933, stringExtra2);
            intent2.setComponent(componentName);
            intent2.addFlags(268435456);
            serviceC2099.startActivity(intent2);
            serviceC2099.f6954 = PendingIntent.getActivity(serviceC2099, 0, intent2, 201326592);
            f6951.notify(1005, serviceC2099.m7266());
        } catch (Exception e) {
            Main mainM18052 = C6331.m18052();
            if (mainM18052 != null) {
                mainM18052.m40401(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        stopForeground(true);
        this.f6953.m27935();
    }
}
