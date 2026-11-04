package l;

import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩵֨᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: QB8K */
/* JADX INFO: loaded from: classes5.dex */
public final class C20226 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Method f64917;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long f64918;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m46501() {
        try {
            if (f64917 == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f64917 == null) {
                f64918 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f64917 = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f64917.invoke(null, Long.valueOf(f64918))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
