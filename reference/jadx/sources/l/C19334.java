package l;

import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ᩳ᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71JX */
/* JADX INFO: loaded from: classes5.dex */
public final class C19334 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Field f62449;

    static {
        try {
            Field declaredField = C8147.class.getDeclaredField("ܽۙ");
            f62449 = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static View m44722(C8147 c8147, int i) {
        return c8147.m22053(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44724(C8147 c8147) {
        View viewM22053 = c8147.m22053(8388611);
        return viewM22053 != null && ((C24556) viewM22053.getLayoutParams()).f79595 == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m44721(C8147 c8147, View view) {
        c8147.getClass();
        return ((C24556) view.getLayoutParams()).f79593;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44723(C8147 c8147, View view, float f) {
        c8147.m22036(f, view);
        C24556 c24556 = (C24556) view.getLayoutParams();
        if (f == 1.0f) {
            c24556.f79595 = (c24556.f79595 | 1) & (-3);
        } else if (f == 0.0f) {
            c24556.f79595 &= -4;
        } else {
            c24556.f79595 = (c24556.f79595 | 2) & (-2);
        }
        try {
            f62449.setFloat(c8147, f);
            c8147.invalidate();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
