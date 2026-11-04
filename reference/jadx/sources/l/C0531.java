package l;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5NH */
/* JADX INFO: loaded from: classes2.dex */
public final class C0531 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f2237;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Method f2238;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Method f2239;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Method f2240;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f2239 = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f2240 = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f2238 = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f2237 = true;
        } catch (NoSuchMethodException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m2500() {
        return f2237;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2499(C9479 c9479, int i, View view) {
        try {
            f2239.invoke(c9479, Integer.valueOf(i), view, Boolean.FALSE, -1, -1);
            f2240.invoke(c9479, Integer.valueOf(i));
            f2238.invoke(c9479, Integer.valueOf(i));
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
