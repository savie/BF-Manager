package l;

import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4V3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19132 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Field f61917;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean f61918;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Field f61919;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static Field f61920;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean f61921;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static Class f61922;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean f61923;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean f61924;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44268(Resources resources) {
        Object obj;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        Map map = null;
        obj = null;
        obj = null;
        Object obj2 = null;
        Object obj3 = null;
        if (i >= 24) {
            if (!f61924) {
                try {
                    Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                    f61919 = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f61924 = true;
            }
            Field field = f61919;
            if (field == null) {
                return;
            }
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException unused2) {
                obj = null;
            }
            if (obj == null) {
                return;
            }
            if (!f61923) {
                try {
                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                    f61917 = declaredField2;
                    declaredField2.setAccessible(true);
                } catch (NoSuchFieldException unused3) {
                }
                f61923 = true;
            }
            Field field2 = f61917;
            if (field2 != null) {
                try {
                    obj2 = field2.get(obj);
                } catch (IllegalAccessException unused4) {
                }
            }
            if (obj2 != null) {
                m44269(obj2);
                return;
            }
            return;
        }
        if (i < 23) {
            if (!f61923) {
                try {
                    Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                    f61917 = declaredField3;
                    declaredField3.setAccessible(true);
                } catch (NoSuchFieldException unused5) {
                }
                f61923 = true;
            }
            Field field3 = f61917;
            if (field3 != null) {
                try {
                    map = (Map) field3.get(resources);
                } catch (IllegalAccessException unused6) {
                }
                if (map != null) {
                    map.clear();
                    return;
                }
                return;
            }
            return;
        }
        if (!f61923) {
            try {
                Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                f61917 = declaredField4;
                declaredField4.setAccessible(true);
            } catch (NoSuchFieldException unused7) {
            }
            f61923 = true;
        }
        Field field4 = f61917;
        if (field4 != null) {
            try {
                obj3 = field4.get(resources);
            } catch (IllegalAccessException unused8) {
            }
        }
        if (obj3 == null) {
            return;
        }
        m44269(obj3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44269(Object obj) {
        LongSparseArray longSparseArray;
        if (!f61921) {
            try {
                f61922 = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f61921 = true;
        }
        Class cls = f61922;
        if (cls == null) {
            return;
        }
        if (!f61918) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f61920 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f61918 = true;
        }
        Field field = f61920;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
