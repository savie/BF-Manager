package l;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: J62F */
/* JADX INFO: loaded from: classes3.dex */
public final class C10363 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final boolean f35515;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Field f35516;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Field f35517;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Field f35518;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Method f35519;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Field f35520;

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        boolean z;
        Field field4;
        try {
            Class<?> cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", null);
            try {
                field = cls.getField("left");
                try {
                    field2 = cls.getField("top");
                    try {
                        field3 = cls.getField("right");
                        try {
                            field4 = cls.getField("bottom");
                            z = true;
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                            z = false;
                            field4 = null;
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                    field2 = null;
                    field3 = null;
                    z = false;
                    field4 = null;
                    if (z) {
                        f35519 = method;
                        f35518 = field;
                        f35520 = field2;
                        f35517 = field3;
                        f35516 = field4;
                        f35515 = true;
                        return;
                    }
                    f35519 = null;
                    f35518 = null;
                    f35520 = null;
                    f35517 = null;
                    f35516 = null;
                    f35515 = false;
                }
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                field = null;
                field2 = null;
                field3 = null;
                z = false;
                field4 = null;
                if (z) {
                    f35519 = method;
                    f35518 = field;
                    f35520 = field2;
                    f35517 = field3;
                    f35516 = field4;
                    f35515 = true;
                    return;
                }
                f35519 = null;
                f35518 = null;
                f35520 = null;
                f35517 = null;
                f35516 = null;
                f35515 = false;
            }
        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
            method = null;
        }
        if (z) {
            f35519 = method;
            f35518 = field;
            f35520 = field2;
            f35517 = field3;
            f35516 = field4;
            f35515 = true;
            return;
        }
        f35519 = null;
        f35518 = null;
        f35520 = null;
        f35517 = null;
        f35516 = null;
        f35515 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Rect m26265(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29 && f35515) {
            try {
                Object objInvoke = f35519.invoke(drawable, null);
                if (objInvoke != null) {
                    return new Rect(f35518.getInt(objInvoke), f35520.getInt(objInvoke), f35517.getInt(objInvoke), f35516.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return C20946.f68271;
    }
}
