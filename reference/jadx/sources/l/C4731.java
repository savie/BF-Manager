package l;

/* JADX INFO: renamed from: l.ۙܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBDV */
/* JADX INFO: loaded from: classes3.dex */
public final class C4731 extends C5541 implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C4731 c4731) {
        int size = size();
        int size2 = c4731.size();
        int i = size < size2 ? size : size2;
        for (int i2 = 0; i2 < i; i2++) {
            int iCompareTo = ((AbstractC9901) m15249(i2)).compareTo((AbstractC9901) c4731.m15249(i2));
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
