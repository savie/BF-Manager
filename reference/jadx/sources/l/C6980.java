package l;

import android.app.Activity;
import android.app.SharedElementCallback;

/* JADX INFO: renamed from: l.ۜ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: U5Z7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6980 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18761(Activity activity, String[] strArr, int i) {
        activity.requestPermissions(strArr, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m18763(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18762(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }
}
