package l;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1GC */
/* JADX INFO: loaded from: classes4.dex */
public final class C18127 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final List f57953 = C4892.m13618((Object[]) new Class[]{Application.class, C13895.class});

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final List f57954 = C4892.m13617(C13895.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Constructor m42192(Class cls, List list) {
        C13465.m32966(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        C13465.m32967(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            C13465.m32967(parameterTypes, "constructor.parameterTypes");
            List listM5590 = C1676.m5590(parameterTypes);
            if (list.equals(listM5590)) {
                return constructor;
            }
            if (list.size() == listM5590.size() && listM5590.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC8956 m42194(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (AbstractC8956) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(C16236.m38347(cls, "A ", " cannot be instantiated."), e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
