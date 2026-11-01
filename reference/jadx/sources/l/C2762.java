package l;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ۖ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2762 {
    public static final C2762 b;
    public final Unsafe a;

    static {
        Field fieldG = g();
        fieldG.setAccessible(true);
        try {
            b = new C2762((Unsafe) fieldG.get(null));
        } catch (IllegalAccessException e) {
            throw new AssertionError("Couldn't get the Unsafe", e);
        }
    }

    public C2762(Unsafe unsafe) {
        this.a = unsafe;
    }

    public static Field g() {
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e);
        }
    }

    public final int e(C15900 c15900, long j) {
        int intVolatile;
        do {
            intVolatile = this.a.getIntVolatile(c15900, j);
        } while (!this.a.compareAndSwapInt(c15900, j, intVolatile, intVolatile - 4));
        return intVolatile;
    }

    public final long i(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public final long h(Class cls, String str) {
        try {
            return i(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError("Cannot find field:", e);
        }
    }

    public final int a(Class cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.a.arrayIndexScale(cls);
    }

    public final Object f(Object obj, long j) {
        return this.a.getObjectVolatile(obj, j);
    }

    public final void j(Object obj, long j, C19427 c19427) {
        this.a.putObjectVolatile(obj, j, c19427);
    }

    public final boolean c(Object obj, long j, int i, int i2) {
        return this.a.compareAndSwapInt(obj, j, i, i2);
    }

    public final boolean d(Object obj, long j, long j2, long j3) {
        return this.a.compareAndSwapLong(obj, j, j2, j3);
    }
}
