package l;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۡܺ᩺, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public final class C9499 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Method f30778;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m24880(Context context) {
        C13974 c13974M34055 = C13974.m34055();
        return c13974M34055.m34057(context.getApplicationContext(), c13974M34055.f44315);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean m24881() {
        Context context = null;
        try {
            if (f30778 == null) {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentApplication", null);
                f30778 = method;
                method.setAccessible(true);
            }
            context = (Context) f30778.invoke(null, null);
        } catch (Exception e) {
            e.toString();
        }
        if (context == null) {
            return false;
        }
        return C13974.m34055().m34058(context, false);
    }
}
