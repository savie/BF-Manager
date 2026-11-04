package l;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.TransactionTooLargeException;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9A2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14322 implements InterfaceC24020 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ComponentName f45191;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ResolveInfo f45192;

    public C14322(ResolveInfo resolveInfo) {
        this.f45192 = resolveInfo;
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        this.f45191 = new ComponentName(activityInfo.packageName, activityInfo.name);
    }

    @Override // l.InterfaceC24020
    /* JADX INFO: renamed from: ۙ */
    public final String mo12514(PackageManager packageManager) {
        ResolveInfo resolveInfo = this.f45192;
        try {
            String strValueOf = String.valueOf(resolveInfo.loadLabel(packageManager));
            String strValueOf2 = String.valueOf(resolveInfo.activityInfo.applicationInfo.loadLabel(packageManager));
            if (strValueOf.contains(strValueOf2)) {
                return strValueOf;
            }
            return strValueOf2 + " - " + strValueOf;
        } catch (Exception e) {
            return e.toString();
        }
    }

    @Override // l.InterfaceC24020
    /* JADX INFO: renamed from: ۙ */
    public final String mo12513() {
        return this.f45191.flattenToShortString();
    }

    @Override // l.InterfaceC24020
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo12515(C24132 c24132) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.PROCESS_TEXT");
        intent.setComponent(this.f45191);
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", c24132.m53870());
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", true);
        try {
            c24132.getContext().startActivity(intent);
            return true;
        } catch (Exception e) {
            if (!(e.getCause() instanceof TransactionTooLargeException)) {
                return false;
            }
            C22673.m51152(R.string.MT_Protector);
            return true;
        }
    }
}
