package l;

import java.lang.annotation.Annotation;

/* JADX INFO: renamed from: l.ۖۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB5A */
/* JADX INFO: loaded from: classes2.dex */
public final class C2313 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Annotation m7056(Class cls) {
        for (Annotation annotation : cls.getDeclaredAnnotations()) {
            if (InterfaceC15638.class.equals(annotation.annotationType())) {
                return (Annotation) InterfaceC15638.class.cast(annotation);
            }
        }
        return null;
    }
}
