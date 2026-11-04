package l;

/* JADX INFO: renamed from: l.᩷۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBDV */
/* JADX INFO: loaded from: classes.dex */
public final class C21911 extends C12763 implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C21911 c21911) {
        int size = size();
        int size2 = c21911.size();
        int i = size < size2 ? size : size2;
        for (int i2 = 0; i2 < i; i2++) {
            int iCompareTo = ((AbstractC13487) m31593(i2)).compareTo((AbstractC13487) c21911.m31593(i2));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (size < size2) {
            return -1;
        }
        return size > size2 ? 1 : 0;
    }
}
