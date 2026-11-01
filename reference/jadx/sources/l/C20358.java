package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: renamed from: l.᩶ᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: C942 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20358 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45935(Context context, String str) {
        Intent intent;
        if (C12597.m31369()) {
            intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
            intent.setPackage("com.miui.securitycenter");
            intent.putExtra("extra_pkgname", str);
        } else if (C12597.m31372()) {
            intent = new Intent();
            intent.putExtra("packageName", context.getPackageName());
            intent.setClassName("com.oppo.launcher", "com.oppo.launcher.shortcut.ShortcutSettingsActivity");
            if (context.getPackageManager().queryIntentActivities(intent, 65536).size() <= 0) {
                intent.setComponent(new ComponentName("com.color.safecenter", "com.color.safecenter.permission.PermissionManagerActivity"));
            }
        } else if (C12597.m31368()) {
            intent = new Intent();
            intent.putExtra("packagename", context.getPackageName());
            intent.setComponent(new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity"));
            if (context.getPackageManager().queryIntentActivities(intent, 65536).size() <= 0) {
                intent.setComponent(new ComponentName("com.iqoo.secure", "com.iqoo.secure.safeguard.SoftPermissionDetailActivity"));
            }
        } else if (C12597.m31375()) {
            intent = new Intent();
            intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
        } else if (!C12597.m31373() || Build.VERSION.SDK_INT >= 24) {
            intent = null;
        } else {
            intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
            intent.putExtra("packageName", context.getPackageName());
            intent.setComponent(new ComponentName("com.meizu.safe", "com.meizu.safe.security.AppSecActivity"));
        }
        if (intent != null) {
            try {
                context.startActivity(intent);
                return;
            } catch (Exception unused) {
            }
        }
        ((InterfaceC17421) context).mo30999(str);
    }
}
