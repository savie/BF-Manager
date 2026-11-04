package l;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: l.۫᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANA */
/* JADX INFO: loaded from: classes4.dex */
public final class C13370 extends AbstractC13006 implements InterfaceC19479 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ClassLoader f42614;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13370(ClassLoader classLoader) {
        super(0);
        this.f42614 = classLoader;
    }

    @Override // l.InterfaceC19479
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4064() throws NoSuchMethodException, ClassNotFoundException {
        C2184.f7187.getClass();
        ClassLoader classLoader = this.f42614;
        Method declaredMethod = classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider").getDeclaredMethod("getWindowExtensions", null);
        Class<?> clsLoadClass = classLoader.loadClass("androidx.window.extensions.WindowExtensions");
        C15243.m36591(declaredMethod, "getWindowExtensionsMethod");
        C15243.m36591(clsLoadClass, "windowExtensionsClass");
        return Boolean.valueOf(declaredMethod.getReturnType().equals(clsLoadClass) && Modifier.isPublic(declaredMethod.getModifiers()));
    }
}
