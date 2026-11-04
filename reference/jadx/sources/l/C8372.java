package l;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: l.۠ۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: L72M */
/* JADX INFO: loaded from: classes3.dex */
public final class C8372 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m22531(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(C8372.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InvocationHandler m22532(C2697 c2697) {
        return new C2406(c2697);
    }
}
