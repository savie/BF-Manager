package l;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import java.util.List;

/* JADX INFO: renamed from: l.ܳᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X59Z */
/* JADX INFO: loaded from: classes4.dex */
public class C14683 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f48000 = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            C13638.toString(intent);
            return;
        }
        ComponentName componentNameM35214 = m35214(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameM35214 != null) {
            intent.setComponent(componentNameM35214);
            try {
                C10405.m26303(context, intent);
                return;
            } catch (IllegalStateException e) {
                if (Build.VERSION.SDK_INT < 31 || !C11155.m28088(e)) {
                    throw e;
                }
                C11155.m28087(e).getMessage();
                return;
            }
        }
        ComponentName componentNameM35215 = m35214(context, "android.media.browse.MediaBrowserService");
        if (componentNameM35215 != null) {
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            C23855 c23855 = new C23855(applicationContext, intent, pendingResultGoAsync);
            C5694 c5694 = new C5694(applicationContext, componentNameM35215, c23855);
            c23855.m52579(c5694);
            c5694.m15704();
            return;
        }
        throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ComponentName m35214(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder sbM30914 = C12441.m30914("Expected 1 service that handles ", str, ", found ");
        sbM30914.append(listQueryIntentServices.size());
        throw new IllegalStateException(sbM30914.toString());
    }
}
