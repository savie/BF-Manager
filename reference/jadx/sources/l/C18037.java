package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.ᩳۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N4E9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18037 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f57686;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Class f57687;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Class[] f57688;

    public C18037(Class cls, String str, Class... clsArr) {
        this.f57687 = cls;
        this.f57686 = str;
        this.f57688 = clsArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m42024(SSLSocket sSLSocket) {
        return m42021(sSLSocket.getClass()) != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42023(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method methodM42021 = m42021(sSLSocket.getClass());
            if (methodM42021 == null) {
                return;
            }
            try {
                methodM42021.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m42022(Object obj, Object... objArr) {
        Method methodM42021 = m42021(obj.getClass());
        if (methodM42021 == null) {
            throw new AssertionError("Method " + this.f57686 + " not supported for object " + obj);
        }
        try {
            return methodM42021.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodM42021);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Method m42021(Class cls) {
        Method method;
        Class cls2;
        try {
            method = cls.getMethod(this.f57686, this.f57688);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    method = null;
                }
            } catch (NoSuchMethodException unused) {
            }
        } catch (NoSuchMethodException unused2) {
        }
        if (method == null || (cls2 = this.f57687) == null || cls2.isAssignableFrom(method.getReturnType())) {
            return method;
        }
        return null;
    }
}
