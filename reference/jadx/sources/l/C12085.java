package l;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.۫֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G883 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12085 extends AbstractC0089 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Method f40443;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Method f40444;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Method f40442 = Class.class.getMethod("isRecord", null);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Method f40445 = Class.class.getMethod("getRecordComponents", null);

    public C12085() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f40443 = cls.getMethod("getName", null);
        this.f40444 = cls.getMethod("getType", null);
    }

    @Override // l.AbstractC0089
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo1032(Class cls) {
        try {
            return ((Boolean) this.f40442.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // l.AbstractC0089
    /* JADX INFO: renamed from: ܰ */
    public final String[] mo1033(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f40445.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f40443.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // l.AbstractC0089
    /* JADX INFO: renamed from: ۙ */
    public final Constructor mo1030(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f40445.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.f40444.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // l.AbstractC0089
    /* JADX INFO: renamed from: ۙ */
    public final Method mo1031(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }
}
