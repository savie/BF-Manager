package l;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O529 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19412 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Method f62567;

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f62567 = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m44462(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C8123.m21389(C8123.m21387(C8123.m21388(locale)));
        }
        try {
            return C18706.m43240((Locale) f62567.invoke(null, locale));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return C18706.m43240(locale);
        }
    }
}
