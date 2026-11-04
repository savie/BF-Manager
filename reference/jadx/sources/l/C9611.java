package l;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: renamed from: l.ۡ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: X4NC */
/* JADX INFO: loaded from: classes3.dex */
public final class C9611 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AppOpsManager m25099(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m25097(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m25098(Context context) {
        return context.getOpPackageName();
    }
}
