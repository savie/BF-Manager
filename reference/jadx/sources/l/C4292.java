package l;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۙ֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4HM */
/* JADX INFO: loaded from: classes2.dex */
public final class C4292 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20521 m12092(AbstractC20521 abstractC20521) {
        while (abstractC20521 != null && !(abstractC20521 instanceof C15583)) {
            abstractC20521 = abstractC20521.f66498;
        }
        return abstractC20521;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m12095(AbstractC20521 abstractC20521) {
        ((C15583) abstractC20521).m37231();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12093(C15583 c15583) {
        try {
            Field declaredField = C15583.class.getDeclaredField("۠ۙ");
            declaredField.setAccessible(true);
            C12760 c12760 = ((C23344) declaredField.get(c15583)).f75628;
            Field declaredField2 = C12760.class.getDeclaredField("ۜ");
            declaredField2.setAccessible(true);
            C15583 c15584 = (C15583) declaredField2.get(c12760);
            Field declaredField3 = C12760.class.getDeclaredField("۠");
            declaredField3.setAccessible(true);
            C15583 c15585 = (C15583) declaredField3.get(c12760);
            if (c15584 == c15583) {
                declaredField2.set(c12760, null);
                if (c15585 == c15583) {
                    declaredField3.set(c12760, null);
                    return;
                }
                return;
            }
            while (c15584 != null) {
                AbstractC20521 abstractC20521 = c15584.f66498;
                if (abstractC20521 == c15583) {
                    c15584.f66498 = c15583.f66498;
                    if (c15585 == c15583) {
                        declaredField3.set(c12760, c15584);
                        return;
                    }
                    return;
                }
                c15584 = (C15583) abstractC20521;
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12094(AbstractC20521 abstractC20521, C14647 c14647) {
        C15583 c15583 = (C15583) abstractC20521;
        try {
            Field declaredField = C15583.class.getDeclaredField("۠ۙ");
            declaredField.setAccessible(true);
            c14647.m35167(((C23344) declaredField.get(c15583)).f75628);
            m12093(c15583);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }
}
