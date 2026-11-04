package l;

import android.os.Build;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֫᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANA */
/* JADX INFO: loaded from: classes2.dex */
public final class C2184 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C2184 f7187 = new C2184();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC0812 f7188 = C9015.m24070(C5913.f20231);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean m7489(C2184 c2184, ClassLoader classLoader) {
        c2184.getClass();
        return Build.VERSION.SDK_INT >= 24 && m7491(new C13370(classLoader)) && m7491(new C20083(classLoader)) && m7491(new C15607(classLoader)) && m7491(new C23067(classLoader));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean m7490(C2184 c2184, Method method, C13512 c13512) {
        c2184.getClass();
        return method.getReturnType().equals(C4560.m14318(c13512));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static WindowLayoutComponent m7488() {
        return (WindowLayoutComponent) f7188.getValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m7491(InterfaceC19479 interfaceC19479) {
        try {
            return ((Boolean) interfaceC19479.mo4064()).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }
}
