package l;

import android.graphics.Rect;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: l.ۘܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANA */
/* JADX INFO: loaded from: classes3.dex */
public final class C3981 extends AbstractC11348 implements InterfaceC4871 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ClassLoader f14777;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3981(ClassLoader classLoader) {
        super(0);
        this.f14777 = classLoader;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0071  */
    @Override // l.InterfaceC4871
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3788() throws NoSuchMethodException, ClassNotFoundException {
        boolean z;
        C18093 c18093 = C18093.f57858;
        c18093.getClass();
        Class<?> clsLoadClass = this.f14777.loadClass("androidx.window.extensions.layout.FoldingFeature");
        Method method = clsLoadClass.getMethod("getBounds", null);
        Method method2 = clsLoadClass.getMethod("getType", null);
        Method method3 = clsLoadClass.getMethod("getState", null);
        C13465.m32967(method, "getBoundsMethod");
        if (C18093.m42082(c18093, method, C12759.m31709(Rect.class)) && Modifier.isPublic(method.getModifiers())) {
            C13465.m32967(method2, "getTypeMethod");
            Class cls = Integer.TYPE;
            if (C18093.m42082(c18093, method2, C12759.m31709(cls)) && Modifier.isPublic(method2.getModifiers())) {
                C13465.m32967(method3, "getStateMethod");
                if (C18093.m42082(c18093, method3, C12759.m31709(cls)) && Modifier.isPublic(method3.getModifiers())) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
