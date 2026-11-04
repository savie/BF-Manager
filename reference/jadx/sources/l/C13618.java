package l;

import android.os.Build;
import android.widget.EdgeEffect;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.۬ۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88WU */
/* JADX INFO: loaded from: classes4.dex */
public final class C13618 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean f43262;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Field f43263;

    static {
        boolean z = Build.VERSION.SDK_INT >= 31;
        f43262 = z;
        Field field = null;
        if (z) {
            try {
                C19577.class.getDeclaredField("ۙ").setAccessible(true);
                try {
                    Field declaredField = EdgeEffect.class.getDeclaredField("mEdgeEffectType");
                    declaredField.setAccessible(true);
                    field = declaredField;
                } catch (Exception unused) {
                }
                f43263 = field;
                return;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        f43263 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33370(EdgeEffect edgeEffect) {
        Field field;
        if (!f43262 || (field = f43263) == null) {
            return;
        }
        try {
            field.setInt(edgeEffect, 0);
        } catch (Exception unused) {
        }
    }
}
