package l;

import android.os.Build;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۤۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y68P */
/* JADX INFO: loaded from: classes3.dex */
public final class C10057 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean f34364;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Field f34365;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Method f34366;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean f34367;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25465(PopupWindow popupWindow, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            C8646.m22447(popupWindow, z);
            return;
        }
        if (!f34367) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f34365 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f34367 = true;
        }
        Field field = f34365;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25464(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            C8646.m22446(popupWindow, i);
            return;
        }
        if (!f34364) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f34366 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f34364 = true;
        }
        Method method = f34366;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }
}
