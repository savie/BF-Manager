package l;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ۤ۬۠, reason: contains not printable characters */
/* JADX INFO: compiled from: D6OL */
/* JADX INFO: loaded from: classes3.dex */
public final class C10309 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f35350;

    static {
        Field declaredField;
        try {
            try {
                declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            } catch (NoSuchFieldException unused) {
                declaredField = Unsafe.class.getDeclaredField("THE_ONE");
            }
            declaredField.setAccessible(true);
            f35350 = (Unsafe) declaredField.get(null);
        } catch (Exception e) {
            throw new Error(e);
        }
    }
}
