package l;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: R697 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20344 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean f65885;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f65886 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Method f65887;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final boolean f65888;

    static {
        f65888 = Build.VERSION.SDK_INT >= 27;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45908(View view, Rect rect, Rect rect2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C16111.m38143(view, rect, rect2);
            return;
        }
        if (!f65885) {
            f65885 = true;
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                f65887 = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f65887.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
            }
        }
        Method method = f65887;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception unused2) {
            }
        }
    }
}
