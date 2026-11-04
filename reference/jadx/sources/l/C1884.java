package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.֫ۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F542 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1884 extends AbstractC18753 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C1884 f6320 = new C1884();

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // l.AbstractC18753
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo6460(Object obj, Object obj2) {
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
        return f6320;
    }

    @Override // l.AbstractC18753
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18753 mo1214() {
        return C0108.f1051;
    }
}
