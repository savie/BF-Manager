package l;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.ܺۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 8827 */
/* JADX INFO: loaded from: classes4.dex */
public class C15737 implements InterfaceC20592 {
    @Override // l.InterfaceC20592
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7186 mo5183(C6044 c6044, C11730 c11730) {
        Type componentType;
        Type typeM29317 = c11730.m29317();
        boolean z = typeM29317 instanceof GenericArrayType;
        if (!z && (!(typeM29317 instanceof Class) || !((Class) typeM29317).isArray())) {
            return null;
        }
        if (z) {
            componentType = ((GenericArrayType) typeM29317).getGenericComponentType();
        } else {
            componentType = ((Class) typeM29317).getComponentType();
        }
        return new C19970(c6044, c6044.m16440(C11730.m29314(componentType)), C23415.m51555(componentType));
    }
}
