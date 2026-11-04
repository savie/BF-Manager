package l;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: renamed from: l.۫ۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: U87V */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12918 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC12918 f41302;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo31992(Object obj, AccessibleObject accessibleObject);

    static {
        AbstractC12918 c19631;
        if (C19059.m44164()) {
            try {
                c19631 = new C19631(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
                c19631 = null;
            }
        } else {
            c19631 = null;
        }
        if (c19631 == null) {
            c19631 = new C15155();
        }
        f41302 = c19631;
    }
}
