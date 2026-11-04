package l;

/* JADX INFO: renamed from: l.ۖ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BF0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2891 extends C12763 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C2891 f9479 = new C2891(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2891 m9514(C2891 c2891, C2891 c2892) {
        if (c2891 == f9479) {
            return c2892;
        }
        int size = c2891.size();
        int size2 = c2892.size();
        C2891 c2893 = new C2891(size + size2);
        for (int i = 0; i < size; i++) {
            c2893.m31596(i, (C9602) c2891.m31593(i));
        }
        for (int i2 = 0; i2 < size2; i2++) {
            c2893.m31596(size + i2, (C9602) c2892.m31593(i2));
        }
        return c2893;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9515(int i, int i2, int i3) {
        m31596(i, new C9602(i2, i3));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m9516(int i) {
        int size = size();
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            C9602 c9602 = (C9602) m31593(i4);
            int iM25076 = c9602.m25076();
            if (iM25076 <= i && iM25076 > i2) {
                int iM25075 = c9602.m25075();
                if (iM25076 == i) {
                    return iM25075;
                }
                i3 = iM25075;
                i2 = iM25076;
            }
        }
        return i3;
    }
}
