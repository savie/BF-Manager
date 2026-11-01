package l;

import android.content.Context;
import android.text.TextUtils;
import android.view.WindowManager;

/* JADX INFO: renamed from: l.ۢ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C9839 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String f33620;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m24944(Context context) {
        if (!TextUtils.isEmpty(f33620)) {
            return f33620;
        }
        if (context == null) {
            return "";
        }
        f33620 = "";
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            f33620 = windowManager.getDefaultDisplay().getWidth() + "x" + windowManager.getDefaultDisplay().getHeight();
        }
        return f33620;
    }
}
