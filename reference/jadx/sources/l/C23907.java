package l;

import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAIZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23907 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object f77410 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Object f77411;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Object f77412;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Object f77413;

    static {
        EnumC6779 enumC6779 = EnumC6779.NONE;
        f77411 = C9015.m24069(enumC6779, new C25399());
        f77413 = C9015.m24069(enumC6779, new C17193(0));
        f77412 = C9015.m24069(enumC6779, new C17939(0));
        C9015.m24069(enumC6779, new C16447(0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.֨֡᩵] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m53404() {
        Class cls = (Class) f77411.getValue();
        if (cls != null) {
            return cls.getMethod("getInstance", null).invoke(null, null);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.֨֡᩵] */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static Class m53406() {
        return (Class) f77411.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l.֨֡᩵] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.֨֡᩵] */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final ArrayList m53408() {
        Field field;
        try {
            Object value = f77413.getValue();
            if (value != null && (field = (Field) f77412.getValue()) != null) {
                Object obj = field.get(value);
                C15243.m36587(obj, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>");
                return (ArrayList) obj;
            }
        } catch (Throwable unused) {
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Field m53407() throws NoSuchFieldException {
        Class clsM53406 = m53406();
        if (clsM53406 == null) {
            return null;
        }
        Field declaredField = clsM53406.getDeclaredField("mViews");
        declaredField.setAccessible(true);
        return declaredField;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Field m53405() throws NoSuchFieldException {
        Class clsM53406 = m53406();
        if (clsM53406 == null) {
            return null;
        }
        Field declaredField = clsM53406.getDeclaredField("mParams");
        declaredField.setAccessible(true);
        return declaredField;
    }
}
