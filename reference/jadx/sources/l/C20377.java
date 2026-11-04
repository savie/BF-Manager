package l;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.᩵ۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8827 */
/* JADX INFO: loaded from: classes5.dex */
public class C20377 implements InterfaceC16075 {
    @Override // l.InterfaceC16075
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17567 mo1459(C24522 c24522, C6446 c6446) {
        Type componentType;
        Type typeM18233 = c6446.m18233();
        boolean z = typeM18233 instanceof GenericArrayType;
        if (!z && (!(typeM18233 instanceof Class) || !((Class) typeM18233).isArray())) {
            return null;
        }
        if (z) {
            componentType = ((GenericArrayType) typeM18233).getGenericComponentType();
        } else {
            componentType = ((Class) typeM18233).getComponentType();
        }
        return new C12172(c24522, c24522.m54785(C6446.m18230(componentType)), C7872.m21408(componentType));
    }
}
