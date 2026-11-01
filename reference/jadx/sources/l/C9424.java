package l;

/* JADX INFO: renamed from: l.ۢۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BJ3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9424 extends C5541 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C9424 f31928 = new C9424(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9424 m24182(C9424 c9424, C9424 c9425) {
        int size = c9424.size();
        if (size != c9425.size()) {
            throw new IllegalArgumentException("list1.size() != list2.size()");
        }
        C9424 c9426 = new C9424(size);
        for (int i = 0; i < size; i++) {
            C1661 c1661 = (C1661) c9424.m15249(i);
            C1661 c1662 = (C1661) c9425.m15249(i);
            C1661 c1663 = new C1661();
            c1663.m5565(c1661);
            c1663.m5565(c1662);
            c1663.mo9637();
            c1663.m43642();
            c9426.m15252(i, (Object) c1663);
        }
        c9426.mo9637();
        return c9426;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24183(int i, C1661 c1661) {
        c1661.m43642();
        m15252(i, (Object) c1661);
    }
}
