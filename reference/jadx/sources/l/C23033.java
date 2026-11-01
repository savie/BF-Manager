package l;

import android.app.Activity;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺ܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANA */
/* JADX INFO: loaded from: classes2.dex */
public final class C23033 extends AbstractC11348 implements InterfaceC4871 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ClassLoader f74842;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23033(ClassLoader classLoader) {
        super(0);
        this.f74842 = classLoader;
    }

    @Override // l.InterfaceC4871
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3788() throws NoSuchMethodException, ClassNotFoundException {
        C18093.f57858.getClass();
        Class<?> clsLoadClass = this.f74842.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        boolean z = false;
        Method method = clsLoadClass.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
        Method method2 = clsLoadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        C13465.m32967(method, "addListenerMethod");
        if (Modifier.isPublic(method.getModifiers())) {
            C13465.m32967(method2, "removeListenerMethod");
            if (Modifier.isPublic(method2.getModifiers())) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
