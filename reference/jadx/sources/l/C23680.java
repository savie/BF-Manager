package l;

/* JADX INFO: renamed from: l.᩻ۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BF0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23680 extends C5541 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C23680 f76615 = new C23680(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23680 m52138(C23680 c23680, C23680 c23681) {
        if (c23680 == f76615) {
            return c23681;
        }
        int size = c23680.size();
        int size2 = c23681.size();
        C23680 c23682 = new C23680(size + size2);
        for (int i = 0; i < size; i++) {
            c23682.m15252(i, (C10980) c23680.m15249(i));
        }
        for (int i2 = 0; i2 < size2; i2++) {
            c23682.m15252(size + i2, (C10980) c23681.m15249(i2));
        }
        return c23682;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52140(int i, int i2, int i3) {
        m15252(i, new C10980(i2, i3));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m52139(int i) {
        int size = size();
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            C10980 c10980 = (C10980) m15249(i4);
            int iM27731 = c10980.m27731();
            if (iM27731 <= i && iM27731 > i2) {
                int iM27730 = c10980.m27730();
                if (iM27731 == i) {
                    return iM27730;
                }
                i3 = iM27730;
                i2 = iM27731;
            }
        }
        return i3;
    }
}
