package l;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۗ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9CK */
/* JADX INFO: loaded from: classes2.dex */
public final class C3418 implements InvocationHandler {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5833 f11090;

    public C3418(C5833 c5833) {
        this.f11090 = c5833;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        if (objArr == null || objArr.length <= 0 || (obj2 = objArr[0]) == null) {
            return null;
        }
        this.f11090.m17019(new C23556(obj2));
        return null;
    }
}
