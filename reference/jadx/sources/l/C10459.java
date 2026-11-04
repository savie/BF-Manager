package l;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۢ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H88J */
/* JADX INFO: loaded from: classes4.dex */
public final class C10459 extends AbstractC18664 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final HashMap f33275;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Constructor f33276;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f33277;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object[] f33278;

    @Override // l.AbstractC18664
    /* JADX INFO: renamed from: ۙ */
    public final Object mo22117(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f33276;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e) {
            int i = C1971.f6612;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.15.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new RuntimeException("Failed to invoke constructor '" + C1971.m6782(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new RuntimeException("Failed to invoke constructor '" + C1971.m6782(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Failed to invoke constructor '" + C1971.m6782(constructor) + "' with args " + Arrays.toString(objArr), e4.getCause());
        }
    }

    @Override // l.AbstractC18664
    /* JADX INFO: renamed from: ۙ */
    public final void mo22118(Object obj, C4208 c4208, AbstractC0765 abstractC0765) {
        Object[] objArr = (Object[]) obj;
        String str = abstractC0765.f2773;
        Integer num = (Integer) this.f33277.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + C1971.m6782(this.f33276) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        abstractC0765.mo3139(c4208, num.intValue(), objArr);
    }

    public C10459(Class cls, C19410 c19410, boolean z) {
        super(c19410);
        this.f33277 = new HashMap();
        Constructor constructorM6784 = C1971.m6784(cls);
        this.f33276 = constructorM6784;
        if (z) {
            C1511.m5366((Object) null, constructorM6784);
        } else {
            C1971.m6786((AccessibleObject) constructorM6784);
        }
        String[] strArrM6790 = C1971.m6790(cls);
        for (int i = 0; i < strArrM6790.length; i++) {
            this.f33277.put(strArrM6790[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.f33276.getParameterTypes();
        this.f33278 = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.f33278[i2] = f33275.get(parameterTypes[i2]);
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
        f33275 = map;
    }

    @Override // l.AbstractC18664
    /* JADX INFO: renamed from: ᩷ */
    public final Object mo22119() {
        return (Object[]) this.f33278.clone();
    }
}
