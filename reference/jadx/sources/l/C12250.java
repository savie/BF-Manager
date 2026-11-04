package l;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۨۡۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4HM */
/* JADX INFO: loaded from: classes3.dex */
public final class C12250 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC15037 m30587(AbstractC15037 abstractC15037) {
        while (abstractC15037 != null && !(abstractC15037 instanceof C12800)) {
            abstractC15037 = abstractC15037.f49090;
        }
        return abstractC15037;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m30590(AbstractC15037 abstractC15037) {
        ((C12800) abstractC15037).m31745();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30588(C12800 c12800) {
        try {
            Field declaredField = C12800.class.getDeclaredField("᩵ۙ");
            declaredField.setAccessible(true);
            C0318 c0318 = ((C23243) declaredField.get(c12800)).f75312;
            Field declaredField2 = C0318.class.getDeclaredField("ۧ");
            declaredField2.setAccessible(true);
            C12800 c12801 = (C12800) declaredField2.get(c0318);
            Field declaredField3 = C0318.class.getDeclaredField("ۗ");
            declaredField3.setAccessible(true);
            C12800 c12802 = (C12800) declaredField3.get(c0318);
            if (c12801 == c12800) {
                declaredField2.set(c0318, null);
                if (c12802 == c12800) {
                    declaredField3.set(c0318, null);
                    return;
                }
                return;
            }
            while (c12801 != null) {
                AbstractC15037 abstractC15037 = c12801.f49090;
                if (abstractC15037 == c12800) {
                    c12801.f49090 = c12800.f49090;
                    if (c12802 == c12800) {
                        declaredField3.set(c0318, c12801);
                        return;
                    }
                    return;
                }
                c12801 = (C12800) abstractC15037;
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30589(AbstractC15037 abstractC15037, C3279 c3279) {
        C12800 c12800 = (C12800) abstractC15037;
        try {
            Field declaredField = C12800.class.getDeclaredField("᩵ۙ");
            declaredField.setAccessible(true);
            c3279.m10799(((C23243) declaredField.get(c12800)).f75312);
            m30588(c12800);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }
}
