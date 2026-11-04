package l;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: R697 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19374 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f62602 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Method f62603;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final boolean f62604;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean f62605;

    static {
        f62604 = Build.VERSION.SDK_INT >= 27;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44818(View view, Rect rect, Rect rect2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C8187.m22098(view, rect, rect2);
            return;
        }
        if (!f62605) {
            f62605 = true;
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                f62603 = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f62603.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
            }
        }
        Method method = f62603;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception unused2) {
            }
        }
    }
}
