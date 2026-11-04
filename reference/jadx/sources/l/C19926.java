package l;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6EA */
/* JADX INFO: loaded from: classes5.dex */
public final class C19926 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final List f64088 = C7743.m21088((Object[]) new Class[]{Application.class, C10471.class});

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final List f64089 = C7743.m21087(C10471.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Constructor m45850(Class cls, List list) {
        C15243.m36590(list, "signature");
        Iterator itM3335 = C0834.m3335(cls.getConstructors());
        while (itM3335.hasNext()) {
            Constructor constructor = (Constructor) itM3335.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            C15243.m36591(parameterTypes, "getParameterTypes(...)");
            List listM48275 = C21168.m48275(parameterTypes);
            if (list.equals(listM48275)) {
                return constructor;
            }
            if (list.size() == listM48275.size() && listM48275.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC13213 m45852(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (AbstractC13213) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(C24966.m55772(cls, "Failed to access "), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(C20551.m47117(cls, "A ", " cannot be instantiated."), e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(C24966.m55772(cls, "An exception happened in constructor of "), e3.getCause());
        }
    }
}
