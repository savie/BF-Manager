package l;

import android.os.Build;
import android.widget.EdgeEffect;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۨܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 88WU */
/* JADX INFO: loaded from: classes3.dex */
public final class C11815 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean f39692;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Field f39693;

    static {
        boolean z = Build.VERSION.SDK_INT >= 31;
        f39692 = z;
        Field field = null;
        if (z) {
            try {
                C0883.class.getDeclaredField("ۙ").setAccessible(true);
                try {
                    Field declaredField = EdgeEffect.class.getDeclaredField("mEdgeEffectType");
                    declaredField.setAccessible(true);
                    field = declaredField;
                } catch (Exception unused) {
                }
                f39693 = field;
                return;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        f39693 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29485(EdgeEffect edgeEffect) {
        Field field;
        if (!f39692 || (field = f39693) == null) {
            return;
        }
        try {
            field.setInt(edgeEffect, 0);
        } catch (Exception unused) {
        }
    }
}
