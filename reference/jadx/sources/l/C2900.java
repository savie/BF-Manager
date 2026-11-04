package l;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* JADX INFO: renamed from: l.ۖ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: X4NC */
/* JADX INFO: loaded from: classes2.dex */
public final class C2900 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m9530(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C1409.m5146(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m9528(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C1409.m5144((AppOpsManager) C1409.m5145(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m9529(Context context, String str, String str2, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager appOpsManagerM25099 = C9611.m25099(context);
            int iM25097 = C9611.m25097(appOpsManagerM25099, str, Binder.getCallingUid(), str2);
            return iM25097 != 0 ? iM25097 : C9611.m25097(appOpsManagerM25099, str, i, C9611.m25098(context));
        }
        return m9528(context, str, str2);
    }
}
