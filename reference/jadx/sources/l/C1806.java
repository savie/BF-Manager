package l;

/* JADX INFO: renamed from: l.֫ۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBEZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C1806 extends C5541 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C1806 f6960 = new C1806(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1806 m5894(C1806 c1806, C1806 c1807) {
        if (c1806 == f6960) {
            return c1807;
        }
        int size = c1806.size();
        int size2 = c1807.size();
        C1806 c1808 = new C1806(size + size2);
        for (int i = 0; i < size; i++) {
            c1808.m15252(i, (C14508) c1806.m15249(i));
        }
        for (int i2 = 0; i2 < size2; i2++) {
            c1808.m15252(size + i2, (C14508) c1807.m15249(i2));
        }
        c1808.mo9637();
        return c1808;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C1806 m5895(C1806 c1806, C1806 c1807) {
        C14508 c14508;
        int size = c1806.size();
        C1806 c1808 = new C1806(size);
        for (int i = 0; i < size; i++) {
            C14508 c14508M34925 = (C14508) c1806.m15249(i);
            int size2 = c1807.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    c14508 = null;
                    break;
                }
                c14508 = (C14508) c1807.m15249(i2);
                if (c14508.m34928(c14508M34925)) {
                    break;
                }
                i2++;
            }
            if (c14508 != null) {
                c14508M34925 = c14508M34925.m34925(C14508.m34924(c14508));
            }
            c1808.m15252(i, c14508M34925);
        }
        c1808.mo9637();
        return c1808;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5896(int i, int i2, int i3, C17432 c17432, C17432 c17433, C17432 c17434, int i4) {
        m15252(i, new C14508(i2, i3, c17432, c17433, c17434, i4));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14508 m5897(int i, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            C14508 c14508 = (C14508) m15249(i3);
            if (c14508.m34927(i, i2)) {
                return c14508;
            }
        }
        return null;
    }
}
