package l;

/* JADX INFO: renamed from: l.۟ۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBH2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7451 extends C5541 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C7451 f24835 = new C7451(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19931(int i, int i2, int i3, int i4, C6143 c6143) {
        m15252(i, new C10274(i2, i3, i4, c6143));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7451 m19930(int i) {
        int size = size();
        C10274[] c10274Arr = new C10274[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C10274 c10274 = (C10274) m15249(i3);
            if (c10274.m26061(i)) {
                C6143 c6143M26063 = c10274.m26063();
                int i4 = 0;
                while (true) {
                    if (i4 >= i2) {
                        c10274Arr[i2] = c10274;
                        i2++;
                        break;
                    }
                    C6143 c6143M26064 = c10274Arr[i4].m26063();
                    if (c6143M26064 == c6143M26063 || c6143M26064 == C6143.f20966) {
                        break;
                    }
                    i4++;
                }
            }
        }
        if (i2 != 0) {
            C7451 c7451 = new C7451(i2);
            for (int i5 = 0; i5 < i2; i5++) {
                C10274 c10275 = c10274Arr[i5];
                if (c10275 == null) {
                    throw new NullPointerException("item == null");
                }
                c7451.m15252(i5, c10275);
            }
            c7451.mo9637();
            return c7451;
        }
        return f24835;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C4129 m19932(int i) {
        if (i < -1) {
            throw new IllegalArgumentException("noException < -1");
        }
        int i2 = i >= 0 ? 1 : 0;
        int size = size();
        if (size == 0) {
            if (i2 != 0) {
                return C4129.m11753(i);
            }
            return C4129.f15128;
        }
        C4129 c4129 = new C4129(size + i2);
        for (int i3 = 0; i3 < size; i3++) {
            c4129.add(((C10274) m15249(i3)).m26062());
        }
        if (i2 != 0) {
            c4129.add(i);
        }
        c4129.mo9637();
        return c4129;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9672 m19933() {
        int size = size();
        if (size == 0) {
            return C9672.f32573;
        }
        C9672 c9672 = new C9672(size);
        for (int i = 0; i < size; i++) {
            c9672.m15255(i, ((C10274) m15249(i)).m26063().m17128());
        }
        c9672.mo9637();
        return c9672;
    }
}
