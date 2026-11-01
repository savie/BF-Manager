package l;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: renamed from: l.᩶᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: X4NC */
/* JADX INFO: loaded from: classes4.dex */
public final class C20386 {
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AppOpsManager m46036(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m46034(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46035(Context context) {
        return context.getOpPackageName();
    }
}
