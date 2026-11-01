package l;

import com.umeng.analytics.pro.am;
import dalvik.system.VMRuntime;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ܳ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 197J */
/* JADX INFO: loaded from: classes4.dex */
public final class C14751 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final long f48249;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final long f48250;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final long f48251;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final long f48252;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final long f48253;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Unsafe f48254;

    static {
        long jObjectFieldOffset;
        try {
            Unsafe unsafe = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", null).invoke(null, null);
            f48254 = unsafe;
            C20395 c20395 = new C20395(System.getProperty("java.boot.class.path", "").split(":", 2)[0], null);
            Class clsLoadClass = c20395.loadClass(C22979.m50819().getName());
            Class clsLoadClass2 = c20395.loadClass(C19028.m43759().getName());
            Class clsLoadClass3 = c20395.loadClass(Class.class.getName());
            f48249 = unsafe.objectFieldOffset(clsLoadClass.getDeclaredField("artMethod"));
            unsafe.objectFieldOffset(clsLoadClass.getDeclaredField("declaringClass"));
            f48252 = unsafe.objectFieldOffset(clsLoadClass2.getDeclaredField("artFieldOrMethod"));
            try {
                jObjectFieldOffset = unsafe.objectFieldOffset(clsLoadClass3.getDeclaredField("fields"));
            } catch (NoSuchFieldException unused) {
                Unsafe unsafe2 = f48254;
                jObjectFieldOffset = unsafe2.objectFieldOffset(clsLoadClass3.getDeclaredField("iFields"));
                unsafe2.objectFieldOffset(clsLoadClass3.getDeclaredField("sFields"));
            }
            Unsafe unsafe3 = f48254;
            long jObjectFieldOffset2 = unsafe3.objectFieldOffset(clsLoadClass3.getDeclaredField("methods"));
            f48251 = jObjectFieldOffset2;
            Method declaredMethod = C11223.class.getDeclaredMethod(am.av, null);
            Method declaredMethod2 = C11223.class.getDeclaredMethod("b", null);
            declaredMethod.setAccessible(true);
            declaredMethod2.setAccessible(true);
            MethodHandle methodHandleUnreflect = MethodHandles.lookup().unreflect(declaredMethod);
            MethodHandle methodHandleUnreflect2 = MethodHandles.lookup().unreflect(declaredMethod2);
            long j = f48252;
            long j2 = unsafe3.getLong(methodHandleUnreflect, j);
            long j3 = unsafe3.getLong(methodHandleUnreflect2, j);
            long j4 = unsafe3.getLong(C11223.class, jObjectFieldOffset2);
            long j5 = j3 - j2;
            f48253 = j5;
            f48250 = (j2 - j4) - j5;
            Field declaredField = C11223.class.getDeclaredField(am.aC);
            Field declaredField2 = C11223.class.getDeclaredField("j");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
            MethodHandle methodHandleUnreflectGetter2 = MethodHandles.lookup().unreflectGetter(declaredField2);
            unsafe3.getLong(methodHandleUnreflectGetter, j);
            unsafe3.getLong(methodHandleUnreflectGetter2, j);
            unsafe3.getLong(C11223.class, jObjectFieldOffset);
        } catch (ReflectiveOperationException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m35369(Class cls, Object obj, String str, Object... objArr) throws NoSuchMethodException {
        if (obj != null && !cls.isInstance(obj)) {
            throw new IllegalArgumentException("this object is not an instance of the given class");
        }
        Method declaredMethod = C17572.class.getDeclaredMethod("invoke", Object[].class);
        declaredMethod.setAccessible(true);
        Unsafe unsafe = f48254;
        long j = unsafe.getLong(cls, f48251);
        if (j == 0) {
            throw new NoSuchMethodException("Cannot find matching method");
        }
        int i = unsafe.getInt(j);
        for (int i2 = 0; i2 < i; i2++) {
            f48254.putLong(declaredMethod, f48249, f48250 + (((long) i2) * f48253) + j);
            if (str.equals(declaredMethod.getName())) {
                Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
                HashSet hashSet = C23923.f77497;
                if (parameterTypes.length == objArr.length) {
                    for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                        if (parameterTypes[i3].isPrimitive()) {
                            Class<?> cls2 = parameterTypes[i3];
                            if ((cls2 != Integer.TYPE || (objArr[i3] instanceof Integer)) && ((cls2 != Byte.TYPE || (objArr[i3] instanceof Byte)) && ((cls2 != Character.TYPE || (objArr[i3] instanceof Character)) && ((cls2 != Boolean.TYPE || (objArr[i3] instanceof Boolean)) && ((cls2 != Double.TYPE || (objArr[i3] instanceof Double)) && ((cls2 != Float.TYPE || (objArr[i3] instanceof Float)) && ((cls2 != Long.TYPE || (objArr[i3] instanceof Long)) && (cls2 != Short.TYPE || (objArr[i3] instanceof Short))))))))) {
                            }
                        } else {
                            Object obj2 = objArr[i3];
                            if (obj2 == null || parameterTypes[i3].isInstance(obj2)) {
                            }
                        }
                    }
                    return declaredMethod.invoke(obj, objArr);
                }
                continue;
            }
        }
        throw new NoSuchMethodException("Cannot find matching method");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m35371(String... strArr) {
        try {
            m35369(VMRuntime.class, m35369(VMRuntime.class, null, "getRuntime", new Object[0]), "setHiddenApiExemptions", strArr);
            return true;
        } catch (ReflectiveOperationException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35370(String... strArr) {
        HashSet hashSet = C23923.f77497;
        hashSet.addAll(Arrays.asList(strArr));
        String[] strArr2 = new String[hashSet.size()];
        hashSet.toArray(strArr2);
        m35371(strArr2);
    }
}
