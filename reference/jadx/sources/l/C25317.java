package l;

import android.content.Context;
import android.text.TextUtils;
import android.view.WindowManager;

/* JADX INFO: renamed from: l.᩻᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class C25317 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String f81777;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m56593(Context context) {
        if (!TextUtils.isEmpty(f81777)) {
            return f81777;
        }
        if (context == null) {
            return "";
        }
        f81777 = "";
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            f81777 = windowManager.getDefaultDisplay().getWidth() + "x" + windowManager.getDefaultDisplay().getHeight();
        }
        return f81777;
    }
}
