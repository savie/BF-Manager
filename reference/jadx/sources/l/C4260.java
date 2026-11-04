package l;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: J62F */
/* JADX INFO: loaded from: classes2.dex */
public final class C4260 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Field f15494;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Field f15495;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Field f15496;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Field f15497;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Method f15498;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final boolean f15499;

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
                        f15498 = method;
                        f15495 = field;
                        f15496 = field2;
                        f15497 = field3;
                        f15494 = field4;
                        f15499 = true;
                        return;
                    }
                    f15498 = null;
                    f15495 = null;
                    f15496 = null;
                    f15497 = null;
                    f15494 = null;
                    f15499 = false;
                }
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                field = null;
                field2 = null;
                field3 = null;
                z = false;
                field4 = null;
                if (z) {
                    f15498 = method;
                    f15495 = field;
                    f15496 = field2;
                    f15497 = field3;
                    f15494 = field4;
                    f15499 = true;
                    return;
                }
                f15498 = null;
                f15495 = null;
                f15496 = null;
                f15497 = null;
                f15494 = null;
                f15499 = false;
            }
        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
            method = null;
        }
        if (z) {
            f15498 = method;
            f15495 = field;
            f15496 = field2;
            f15497 = field3;
            f15494 = field4;
            f15499 = true;
            return;
        }
        f15498 = null;
        f15495 = null;
        f15496 = null;
        f15497 = null;
        f15494 = null;
        f15499 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Rect m13591(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29 && f15499) {
            try {
                Object objInvoke = f15498.invoke(drawable, null);
                if (objInvoke != null) {
                    return new Rect(f15495.getInt(objInvoke), f15496.getInt(objInvoke), f15497.getInt(objInvoke), f15494.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return C21414.f68210;
    }
}
