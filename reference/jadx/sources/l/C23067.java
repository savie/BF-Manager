package l;

import android.graphics.Rect;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: l.᩸᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANA */
/* JADX INFO: loaded from: classes2.dex */
public final class C23067 extends AbstractC13006 implements InterfaceC19479 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ClassLoader f74833;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23067(ClassLoader classLoader) {
        super(0);
        this.f74833 = classLoader;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0071  */
    @Override // l.InterfaceC19479
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4064() throws NoSuchMethodException, ClassNotFoundException {
        boolean z;
        C2184 c2184 = C2184.f7187;
        c2184.getClass();
        Class<?> clsLoadClass = this.f74833.loadClass("androidx.window.extensions.layout.FoldingFeature");
        Method method = clsLoadClass.getMethod("getBounds", null);
        Method method2 = clsLoadClass.getMethod("getType", null);
        Method method3 = clsLoadClass.getMethod("getState", null);
        C15243.m36591(method, "getBoundsMethod");
        if (C2184.m7490(c2184, method, C16735.m39514(Rect.class)) && Modifier.isPublic(method.getModifiers())) {
            C15243.m36591(method2, "getTypeMethod");
            Class cls = Integer.TYPE;
            if (C2184.m7490(c2184, method2, C16735.m39514(cls)) && Modifier.isPublic(method2.getModifiers())) {
                C15243.m36591(method3, "getStateMethod");
                if (C2184.m7490(c2184, method3, C16735.m39514(cls)) && Modifier.isPublic(method3.getModifiers())) {
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
