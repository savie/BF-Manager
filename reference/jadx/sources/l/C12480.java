package l;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5NH */
/* JADX INFO: loaded from: classes3.dex */
public final class C12480 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Field f41602;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f41602 = declaredField;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30981(AbsListView absListView) {
        Field field = f41602;
        if (field == null) {
            return false;
        }
        try {
            return field.getBoolean(absListView);
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30980(AbsListView absListView, boolean z) {
        Field field = f41602;
        if (field != null) {
            try {
                field.set(absListView, Boolean.valueOf(z));
            } catch (IllegalAccessException unused) {
            }
        }
    }
}
