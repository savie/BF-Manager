package l;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: l.ۜܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANA */
/* JADX INFO: loaded from: classes3.dex */
public final class C6804 extends AbstractC11348 implements InterfaceC4871 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ClassLoader f22952;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6804(ClassLoader classLoader) {
        super(0);
        this.f22952 = classLoader;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x003a  */
    @Override // l.InterfaceC4871
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3788() throws NoSuchMethodException, ClassNotFoundException {
        boolean z;
        C18093.f57858.getClass();
        ClassLoader classLoader = this.f22952;
        Method method = classLoader.loadClass("androidx.window.extensions.WindowExtensions").getMethod("getWindowLayoutComponent", null);
        Class<?> clsLoadClass = classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        C13465.m32967(method, "getWindowLayoutComponentMethod");
        if (Modifier.isPublic(method.getModifiers())) {
            C13465.m32967(clsLoadClass, "windowLayoutComponentClass");
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
