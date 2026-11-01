package l;

import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۧۧܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB8K */
/* JADX INFO: loaded from: classes3.dex */
public final class C10958 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Method f37377;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long f37378;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m27712() {
        try {
            if (f37377 == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f37377 == null) {
                f37378 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f37377 = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f37377.invoke(null, Long.valueOf(f37378))).booleanValue();
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
