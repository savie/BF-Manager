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

/* JADX INFO: renamed from: l.᩵ܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X59Z */
/* JADX INFO: loaded from: classes5.dex */
public class C20650 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f66221 = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            C17359.toString(intent);
            return;
        }
        ComponentName componentNameM47263 = m47263(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameM47263 != null) {
            intent.setComponent(componentNameM47263);
            try {
                C7508.m20562(context, intent);
                return;
            } catch (IllegalStateException e) {
                if (Build.VERSION.SDK_INT < 31 || !C23634.m52878(e)) {
                    throw e;
                }
                C23634.m52877(e).getMessage();
                return;
            }
        }
        ComponentName componentNameM47264 = m47263(context, "android.media.browse.MediaBrowserService");
        if (componentNameM47264 != null) {
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            C3496 c3496 = new C3496(applicationContext, intent, pendingResultGoAsync);
            C9743 c9743 = new C9743(applicationContext, componentNameM47264, c3496);
            c3496.m11494(c9743);
            c9743.m25370();
            return;
        }
        throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ComponentName m47263(Context context, String str) {
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
        StringBuilder sbM51387 = C22783.m51387("Expected 1 service that handles ", str, ", found ");
        sbM51387.append(listQueryIntentServices.size());
        throw new IllegalStateException(sbM51387.toString());
    }
}
