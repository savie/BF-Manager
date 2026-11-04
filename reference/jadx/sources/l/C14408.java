package l;

/* JADX INFO: renamed from: l.ܰۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBEJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C14408 extends C12763 implements Comparable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C14408 f45407 = new C14408(0);

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C14408 c14408 = (C14408) obj;
        if (this != c14408) {
            int size = size();
            int size2 = c14408.size();
            int iMin = Math.min(size, size2);
            for (int i = 0; i < iMin; i++) {
                int iCompareTo = ((C3968) m31593(i)).compareTo((C3968) c14408.m31593(i));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            if (size < size2) {
                return -1;
            }
            if (size > size2) {
                return 1;
            }
        }
        return 0;
    }
}
