package l;

import android.graphics.Rect;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19639 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Field f63266;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Field f63267;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean f63268;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Field f63269;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f63269 = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f63267 = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f63266 = declaredField3;
            declaredField3.setAccessible(true);
            f63268 = true;
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3977 m45286(View view) {
        if (f63268 && view.isAttachedToWindow()) {
            try {
                Object obj = f63269.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) f63267.get(obj);
                    Rect rect2 = (Rect) f63266.get(obj);
                    if (rect != null && rect2 != null) {
                        C15163 c15163 = new C15163();
                        c15163.m36479(C13275.m32819(rect.left, rect.top, rect.right, rect.bottom));
                        c15163.m36480(C13275.m32819(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        C3977 c3977M36477 = c15163.m36477();
                        c3977M36477.m12819(c3977M36477);
                        c3977M36477.m12818(view.getRootView());
                        return c3977M36477;
                    }
                }
            } catch (IllegalAccessException e) {
                e.getMessage();
            }
        }
        return null;
    }
}
