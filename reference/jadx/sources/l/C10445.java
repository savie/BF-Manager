package l;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۤܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A9CK */
/* JADX INFO: loaded from: classes3.dex */
public final class C10445 implements InvocationHandler {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C11821 f35670;

    public C10445(C11821 c11821) {
        this.f35670 = c11821;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        if (objArr == null || objArr.length <= 0 || (obj2 = objArr[0]) == null) {
            return null;
        }
        this.f35670.m29492(new C9034(obj2));
        return null;
    }
}
