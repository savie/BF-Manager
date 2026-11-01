package l;

import android.os.Build;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ᩳܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANA */
/* JADX INFO: loaded from: classes4.dex */
public final class C18093 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C18093 f57858 = new C18093();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC5204 f57859 = C22138.m49098(C21621.f70127);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean m42081(C18093 c18093, ClassLoader classLoader) {
        c18093.getClass();
        return Build.VERSION.SDK_INT >= 24 && m42080(new C15272(classLoader)) && m42080(new C6804(classLoader)) && m42080(new C23033(classLoader)) && m42080(new C3981(classLoader));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean m42082(C18093 c18093, Method method, C23922 c23922) {
        c18093.getClass();
        Class clsMo6762 = c23922.mo6762();
        C13465.m32963((Object) clsMo6762, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(clsMo6762);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static WindowLayoutComponent m42079() {
        return (WindowLayoutComponent) f57859.getValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m42080(InterfaceC4871 interfaceC4871) {
        try {
            return ((Boolean) interfaceC4871.mo3788()).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }
}
