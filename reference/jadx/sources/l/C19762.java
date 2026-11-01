package l;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩵᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: H88J */
/* JADX INFO: loaded from: classes5.dex */
public final class C19762 extends AbstractC21878 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final HashMap f63497;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object[] f63498;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Constructor f63499;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f63500;

    @Override // l.AbstractC21878
    /* JADX INFO: renamed from: ۙ */
    public final Object mo43807(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f63499;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e) {
            int i = C17023.f54385;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new RuntimeException("Failed to invoke constructor '" + C17023.m39791(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new RuntimeException("Failed to invoke constructor '" + C17023.m39791(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Failed to invoke constructor '" + C17023.m39791(constructor) + "' with args " + Arrays.toString(objArr), e4.getCause());
        }
    }

    @Override // l.AbstractC21878
    /* JADX INFO: renamed from: ۙ */
    public final void mo43808(Object obj, C5379 c5379, AbstractC18350 abstractC18350) {
        Object[] objArr = (Object[]) obj;
        String str = abstractC18350.f58536;
        Integer num = (Integer) this.f63500.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + C17023.m39791(this.f63499) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        abstractC18350.mo37115(c5379, num.intValue(), objArr);
    }

    public C19762(Class cls, C8473 c8473, boolean z) {
        super(c8473);
        this.f63500 = new HashMap();
        Constructor constructorM39793 = C17023.m39793(cls);
        this.f63499 = constructorM39793;
        if (z) {
            C9179.m23614((Object) null, constructorM39793);
        } else {
            C17023.m39795((AccessibleObject) constructorM39793);
        }
        String[] strArrM39799 = C17023.m39799(cls);
        for (int i = 0; i < strArrM39799.length; i++) {
            this.f63500.put(strArrM39799[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.f63499.getParameterTypes();
        this.f63498 = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.f63498[i2] = f63497.get(parameterTypes[i2]);
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        f63497 = map;
    }

    @Override // l.AbstractC21878
    /* JADX INFO: renamed from: ܰ */
    public final Object mo43809() {
        return (Object[]) this.f63498.clone();
    }
}
