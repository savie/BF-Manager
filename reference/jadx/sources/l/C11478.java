package l;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: WATP */
/* JADX INFO: loaded from: classes4.dex */
public final class C11478 implements InterfaceC7950 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C11478 f38646 = new C11478();

    @Override // l.InterfaceC7950
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1395(C14265 c14265, Type type, Object obj) {
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof TypeVariable) {
                genericComponentType = ((TypeVariable) genericComponentType).getBounds()[0];
            }
            ArrayList arrayList = new ArrayList();
            c14265.m34401(genericComponentType, arrayList, (Object) null);
            if (genericComponentType instanceof Class) {
                Object[] objArr = (Object[]) Array.newInstance((Class<?>) genericComponentType, arrayList.size());
                arrayList.toArray(objArr);
                return objArr;
            }
            return arrayList.toArray();
        }
        return c14265.m34396(obj);
    }
}
