package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.᩶᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4WR */
/* JADX INFO: loaded from: classes.dex */
public final class C21670 extends AbstractC18753 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C21670 f69175 = new C21670();

    public final String toString() {
        return "Ordering.usingToString()";
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return obj.toString().compareTo(obj2.toString());
    }

    private Object readResolve() {
        return f69175;
    }
}
