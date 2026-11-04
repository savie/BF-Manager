package l;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: l.ᩴ᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANA */
/* JADX INFO: loaded from: classes5.dex */
public final class C20083 extends AbstractC13006 implements InterfaceC19479 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ClassLoader f64547;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20083(ClassLoader classLoader) {
        super(0);
        this.f64547 = classLoader;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x003a  */
    @Override // l.InterfaceC19479
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4064() throws NoSuchMethodException, ClassNotFoundException {
        boolean z;
        C2184.f7187.getClass();
        ClassLoader classLoader = this.f64547;
        Method method = classLoader.loadClass("androidx.window.extensions.WindowExtensions").getMethod("getWindowLayoutComponent", null);
        Class<?> clsLoadClass = classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        C15243.m36591(method, "getWindowLayoutComponentMethod");
        if (Modifier.isPublic(method.getModifiers())) {
            C15243.m36591(clsLoadClass, "windowLayoutComponentClass");
            if (method.getReturnType().equals(clsLoadClass)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
