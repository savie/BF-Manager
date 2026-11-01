package l;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.۟᩹ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public final class C7759 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Method f25612;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m20412(Context context) {
        C0702 c0702M3090 = C0702.m3090();
        return c0702M3090.m3093(context.getApplicationContext(), c0702M3090.f2966);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean m20413() {
        Context context = null;
        try {
            if (f25612 == null) {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentApplication", null);
                f25612 = method;
                method.setAccessible(true);
            }
            context = (Context) f25612.invoke(null, null);
        } catch (Exception e) {
            e.toString();
        }
        if (context == null) {
            return false;
        }
        return C0702.m3090().m3094(context, false);
    }
}
