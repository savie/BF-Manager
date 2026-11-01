package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.᩺᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: F542 */
/* JADX INFO: loaded from: classes.dex */
public final class C23327 extends AbstractC10959 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C23327 f75607 = new C23327();

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // l.AbstractC10959
    /* JADX INFO: renamed from: ۙ */
    public final Object mo27716(Object obj, Object obj2) {
        throw null;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    private Object readResolve() {
        return f75607;
    }

    @Override // l.AbstractC10959
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC10959 mo27718() {
        return C17308.f55088;
    }
}
