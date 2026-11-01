package l;

import android.graphics.Rect;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes.dex */
public final class C22193 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static Field f72607;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Field f72608;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Field f72609;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean f72610;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f72607 = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f72609 = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f72608 = declaredField3;
            declaredField3.setAccessible(true);
            f72610 = true;
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15844 m49253(View view) {
        if (f72610 && view.isAttachedToWindow()) {
            try {
                Object obj = f72607.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) f72609.get(obj);
                    Rect rect2 = (Rect) f72608.get(obj);
                    if (rect != null && rect2 != null) {
                        C1025 c1025 = new C1025();
                        c1025.m3871(C13954.m33793(rect.left, rect.top, rect.right, rect.bottom));
                        c1025.m3872(C13954.m33793(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        C15844 c15844M3869 = c1025.m3869();
                        c15844M3869.m37678(c15844M3869);
                        c15844M3869.m37676(view.getRootView());
                        return c15844M3869;
                    }
                }
            } catch (IllegalAccessException e) {
                e.getMessage();
            }
        }
        return null;
    }
}
