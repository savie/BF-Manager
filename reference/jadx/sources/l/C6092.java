package l;

import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۛܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71JX */
/* JADX INFO: loaded from: classes2.dex */
public final class C6092 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Field f20609;

    static {
        try {
            Field declaredField = C17381.class.getDeclaredField("᩸ۙ");
            f20609 = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static View m16500(C17381 c17381, int i) {
        return c17381.m40491(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m16502(C17381 c17381) {
        View viewM40491 = c17381.m40491(8388611);
        return viewM40491 != null && ((C20909) viewM40491.getLayoutParams()).f67942 == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m16499(C17381 c17381, View view) {
        c17381.getClass();
        return ((C20909) view.getLayoutParams()).f67944;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16501(C17381 c17381, View view, float f) {
        c17381.m40476(f, view);
        C20909 c20909 = (C20909) view.getLayoutParams();
        if (f == 1.0f) {
            c20909.f67942 = (c20909.f67942 | 1) & (-3);
        } else if (f == 0.0f) {
            c20909.f67942 &= -4;
        } else {
            c20909.f67942 = (c20909.f67942 | 2) & (-2);
        }
        try {
            f20609.setFloat(c17381, f);
            c17381.invalidate();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
