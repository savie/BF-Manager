package l;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: W593 */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class C21217 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f67711 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static long f67712;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Method f67713;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f67712 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f67713 = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m48373() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C14503.m35013();
        }
        try {
            return ((Boolean) f67713.invoke(null, Long.valueOf(f67712))).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
