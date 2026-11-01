package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܿۧܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y65K */
/* JADX INFO: loaded from: classes4.dex */
public final class C17308 extends AbstractC10959 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C17308 f55088 = new C17308();

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    @Override // l.AbstractC10959
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC10959 mo27718() {
        return C23327.f75607;
    }

    private Object readResolve() {
        return f55088;
    }
}
