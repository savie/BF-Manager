package l;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.TransactionTooLargeException;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9A2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5532 implements InterfaceC11883 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ComponentName f18957;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ResolveInfo f18958;

    public C5532(ResolveInfo resolveInfo) {
        this.f18958 = resolveInfo;
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        this.f18957 = new ComponentName(activityInfo.packageName, activityInfo.name);
    }

    @Override // l.InterfaceC11883
    /* JADX INFO: renamed from: ۙ */
    public final String mo8260(PackageManager packageManager) {
        ResolveInfo resolveInfo = this.f18958;
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

    @Override // l.InterfaceC11883
    /* JADX INFO: renamed from: ۙ */
    public final String mo8259() {
        return this.f18957.flattenToShortString();
    }

    @Override // l.InterfaceC11883
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8261(C6111 c6111) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.PROCESS_TEXT");
        intent.setComponent(this.f18957);
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", c6111.m17016());
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", true);
        try {
            c6111.getContext().startActivity(intent);
            return true;
        } catch (Exception e) {
            if (!(e.getCause() instanceof TransactionTooLargeException)) {
                return false;
            }
            C15829.m37611(R.string.MT_Protector);
            return true;
        }
    }
}
