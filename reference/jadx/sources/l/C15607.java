package l;

import android.app.Activity;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳ᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANA */
/* JADX INFO: loaded from: classes5.dex */
public final class C15607 extends AbstractC13006 implements InterfaceC19479 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ClassLoader f50720;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15607(ClassLoader classLoader) {
        super(0);
        this.f50720 = classLoader;
    }

    @Override // l.InterfaceC19479
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4064() throws NoSuchMethodException, ClassNotFoundException {
        C2184.f7187.getClass();
        Class<?> clsLoadClass = this.f50720.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        boolean z = false;
        Method method = clsLoadClass.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
        Method method2 = clsLoadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        C15243.m36591(method, "addListenerMethod");
        if (Modifier.isPublic(method.getModifiers())) {
            C15243.m36591(method2, "removeListenerMethod");
            if (Modifier.isPublic(method2.getModifiers())) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
