package l;

/* JADX INFO: renamed from: l.۟ۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBEJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C7265 extends C5541 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C7265 f24181 = new C7265(0);

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C7265 c7265 = (C7265) obj;
        if (this != c7265) {
            int size = size();
            int size2 = c7265.size();
            int iMin = Math.min(size, size2);
            for (int i = 0; i < iMin; i++) {
                int iCompareTo = ((C10088) m15249(i)).compareTo((C10088) c7265.m15249(i));
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
