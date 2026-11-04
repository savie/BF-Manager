package l;

import java.lang.annotation.Annotation;

/* JADX INFO: renamed from: l.ۜ᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: UB5A */
/* JADX INFO: loaded from: classes3.dex */
public final class C7437 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Annotation m20382(Class cls) {
        for (Annotation annotation : cls.getDeclaredAnnotations()) {
            if (InterfaceC20862.class.equals(annotation.annotationType())) {
                return (Annotation) InterfaceC20862.class.cast(annotation);
            }
        }
        return null;
    }
}
