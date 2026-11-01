package l;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֡ܳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: H4NK */
/* JADX INFO: loaded from: classes2.dex */
public class C0476 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static Field f2152 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f2153 = false;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean f2154 = false;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean f2155 = true;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Method f2156;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo2345(View view, float f) {
        if (f2155) {
            try {
                C20233.m45737(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                f2155 = false;
            }
        }
        view.setAlpha(f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float mo2344(View view) {
        if (f2155) {
            try {
                return C20233.m45736(view);
            } catch (NoSuchMethodError unused) {
                f2155 = false;
            }
        }
        return view.getAlpha();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo2346(View view, int i) {
        if (!f2154) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f2152 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2154 = true;
        }
        Field field = f2152;
        if (field != null) {
            try {
                f2152.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo2347(View view, int i, int i2, int i3, int i4) {
        if (!f2153) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f2156 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f2153 = true;
        }
        Method method = f2156;
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
