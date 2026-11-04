package l;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H21F */
/* JADX INFO: loaded from: classes5.dex */
public final class C20734 extends C3580 {
    @Override // l.C3580
    /* JADX INFO: renamed from: ۙ */
    public final Typeface mo11639(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f12264, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f12262.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.C3580
    /* JADX INFO: renamed from: ۙ */
    public final Method mo11640(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
