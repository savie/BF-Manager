package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.֨֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: N4E9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0849 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f3196;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Class f3197;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Class[] f3198;

    public C0849(Class cls, String str, Class... clsArr) {
        this.f3197 = cls;
        this.f3196 = str;
        this.f3198 = clsArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3464(SSLSocket sSLSocket) {
        return m3461(sSLSocket.getClass()) != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3463(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method methodM3461 = m3461(sSLSocket.getClass());
            if (methodM3461 == null) {
                return;
            }
            try {
                methodM3461.invoke(sSLSocket, objArr);
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
    public final Object m3462(Object obj, Object... objArr) {
        Method methodM3461 = m3461(obj.getClass());
        if (methodM3461 == null) {
            throw new AssertionError("Method " + this.f3196 + " not supported for object " + obj);
        }
        try {
            return methodM3461.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodM3461);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Method m3461(Class cls) {
        Method method;
        Class cls2;
        try {
            method = cls.getMethod(this.f3196, this.f3198);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    method = null;
                }
            } catch (NoSuchMethodException unused) {
            }
        } catch (NoSuchMethodException unused2) {
        }
        if (method == null || (cls2 = this.f3197) == null || cls2.isAssignableFrom(method.getReturnType())) {
            return method;
        }
        return null;
    }
}
