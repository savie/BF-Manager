package l;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: l.ܶܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANA */
/* JADX INFO: loaded from: classes5.dex */
public final class C15272 extends AbstractC11348 implements InterfaceC4871 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ClassLoader f49776;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15272(ClassLoader classLoader) {
        super(0);
        this.f49776 = classLoader;
    }

    @Override // l.InterfaceC4871
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3788() throws NoSuchMethodException, ClassNotFoundException {
        C18093.f57858.getClass();
        ClassLoader classLoader = this.f49776;
        Method declaredMethod = classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider").getDeclaredMethod("getWindowExtensions", null);
        Class<?> clsLoadClass = classLoader.loadClass("androidx.window.extensions.WindowExtensions");
        C13465.m32967(declaredMethod, "getWindowExtensionsMethod");
        C13465.m32967(clsLoadClass, "windowExtensionsClass");
        return Boolean.valueOf(declaredMethod.getReturnType().equals(clsLoadClass) && Modifier.isPublic(declaredMethod.getModifiers()));
    }
}
