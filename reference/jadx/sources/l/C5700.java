package l;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۚܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G883 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5700 extends AbstractC15394 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Method f19679;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Method f19680;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Method f19682 = Class.class.getMethod("isRecord", null);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Method f19681 = Class.class.getMethod("getRecordComponents", null);

    public C5700() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f19679 = cls.getMethod("getName", null);
        this.f19680 = cls.getMethod("getType", null);
    }

    @Override // l.AbstractC15394
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo16731(Class cls) {
        try {
            return ((Boolean) this.f19682.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.15.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // l.AbstractC15394
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String[] mo16732(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f19681.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f19679.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.15.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // l.AbstractC15394
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Constructor mo16729(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f19681.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.f19680.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.15.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // l.AbstractC15394
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Method mo16730(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.15.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }
}
