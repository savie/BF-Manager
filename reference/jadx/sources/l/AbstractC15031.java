package l;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: renamed from: l.ܶۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U87V */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15031 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15031 f49007;

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo17803(Object obj, AccessibleObject accessibleObject);

    static {
        AbstractC15031 c6563;
        if (C14243.m34377()) {
            try {
                c6563 = new C6563(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
                c6563 = null;
            }
        } else {
            c6563 = null;
        }
        if (c6563 == null) {
            c6563 = new C22792();
        }
        f49007 = c6563;
    }
}
