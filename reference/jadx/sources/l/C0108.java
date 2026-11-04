package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.֡֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y65K */
/* JADX INFO: loaded from: classes3.dex */
public final class C0108 extends AbstractC18753 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C0108 f1051 = new C0108();

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

    @Override // l.AbstractC18753
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC18753 mo1214() {
        return C1884.f6320;
    }

    private Object readResolve() {
        return f1051;
    }
}
