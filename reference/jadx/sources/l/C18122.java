package l;

import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: PAIZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18122 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Object f57943;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object f57944 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Object f57945;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Object f57946;

    static {
        EnumC3792 enumC3792 = EnumC3792.NONE;
        f57945 = C22138.m49097(enumC3792, new C6833());
        f57943 = C22138.m49097(enumC3792, new C23062());
        f57946 = C22138.m49097(enumC3792, new C15301());
        C22138.m49097(enumC3792, new C21650());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ۚ۟۠] */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static Class m42189() {
        return (Class) f57945.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l.ۚ۟۠] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.ۚ۟۠] */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final ArrayList m42187() {
        Field field;
        try {
            Object value = f57943.getValue();
            if (value != null && (field = (Field) f57946.getValue()) != null) {
                Object obj = field.get(value);
                C13465.m32963(obj, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>");
                return (ArrayList) obj;
            }
        } catch (Throwable unused) {
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m42188() {
        Class clsM42189 = m42189();
        if (clsM42189 != null) {
            return clsM42189.getMethod("getInstance", null).invoke(null, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Field m42191() throws NoSuchFieldException {
        Class clsM42189 = m42189();
        if (clsM42189 == null) {
            return null;
        }
        Field declaredField = clsM42189.getDeclaredField("mViews");
        declaredField.setAccessible(true);
        return declaredField;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Field m42190() throws NoSuchFieldException {
        Class clsM42189 = m42189();
        if (clsM42189 == null) {
            return null;
        }
        Field declaredField = clsM42189.getDeclaredField("mParams");
        declaredField.setAccessible(true);
        return declaredField;
    }
}
