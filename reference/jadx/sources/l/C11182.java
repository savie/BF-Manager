package l;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: WATP */
/* JADX INFO: loaded from: classes4.dex */
public final class C11182 implements InterfaceC3725 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C11182 f35253 = new C11182();

    @Override // l.InterfaceC3725
    /* JADX INFO: renamed from: ۙ */
    public final Object mo12124(C2759 c2759, Type type, Object obj) {
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof TypeVariable) {
                genericComponentType = ((TypeVariable) genericComponentType).getBounds()[0];
            }
            ArrayList arrayList = new ArrayList();
            c2759.m9111(genericComponentType, arrayList, (Object) null);
            if (genericComponentType instanceof Class) {
                Object[] objArr = (Object[]) Array.newInstance((Class<?>) genericComponentType, arrayList.size());
                arrayList.toArray(objArr);
                return objArr;
            }
            return arrayList.toArray();
        }
        return c2759.m9106(obj);
    }
}
