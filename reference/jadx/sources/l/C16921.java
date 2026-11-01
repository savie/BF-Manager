package l;

import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: P4V3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16921 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static Field f54105;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean f54106;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Field f54107;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static Class f54108;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Field f54109;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static boolean f54110;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean f54111;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean f54112;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39610(Resources resources) {
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
            if (!f54106) {
                try {
                    Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                    f54109 = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f54106 = true;
            }
            Field field = f54109;
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
            if (!f54111) {
                try {
                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                    f54107 = declaredField2;
                    declaredField2.setAccessible(true);
                } catch (NoSuchFieldException unused3) {
                }
                f54111 = true;
            }
            Field field2 = f54107;
            if (field2 != null) {
                try {
                    obj2 = field2.get(obj);
                } catch (IllegalAccessException unused4) {
                }
            }
            if (obj2 != null) {
                m39611(obj2);
                return;
            }
            return;
        }
        if (i < 23) {
            if (!f54111) {
                try {
                    Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                    f54107 = declaredField3;
                    declaredField3.setAccessible(true);
                } catch (NoSuchFieldException unused5) {
                }
                f54111 = true;
            }
            Field field3 = f54107;
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
        if (!f54111) {
            try {
                Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                f54107 = declaredField4;
                declaredField4.setAccessible(true);
            } catch (NoSuchFieldException unused7) {
            }
            f54111 = true;
        }
        Field field4 = f54107;
        if (field4 != null) {
            try {
                obj3 = field4.get(resources);
            } catch (IllegalAccessException unused8) {
            }
        }
        if (obj3 == null) {
            return;
        }
        m39611(obj3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39611(Object obj) {
        LongSparseArray longSparseArray;
        if (!f54112) {
            try {
                f54108 = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f54112 = true;
        }
        Class cls = f54108;
        if (cls == null) {
            return;
        }
        if (!f54110) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f54105 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f54110 = true;
        }
        Field field = f54105;
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
