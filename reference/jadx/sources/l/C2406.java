package l;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۖۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: L72M */
/* JADX INFO: loaded from: classes2.dex */
public final class C2406 implements InvocationHandler {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2697 f7723;

    public C2406(C2697 c2697) {
        this.f7723 = c2697;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, C2697.class.getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(this.f7723, objArr);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Reflection failed for method " + method, e2);
        }
    }
}
