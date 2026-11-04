package l;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ܺۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: H4NK */
/* JADX INFO: loaded from: classes4.dex */
public class C16540 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f53539 = false;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean f53540 = true;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean f53541;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Method f53542;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Field f53543;

    /* JADX INFO: renamed from: ۙ */
    public void mo17606(View view, float f) {
        if (f53540) {
            try {
                C24746.m55252(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                f53540 = false;
            }
        }
        view.setAlpha(f);
    }

    /* JADX INFO: renamed from: ۙ */
    public float mo17605(View view) {
        if (f53540) {
            try {
                return C24746.m55251(view);
            } catch (NoSuchMethodError unused) {
                f53540 = false;
            }
        }
        return view.getAlpha();
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo17607(View view, int i) {
        if (!f53541) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f53543 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f53541 = true;
        }
        Field field = f53543;
        if (field != null) {
            try {
                f53543.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10194(View view, int i, int i2, int i3, int i4) {
        if (!f53539) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f53542 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f53539 = true;
        }
        Method method = f53542;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
