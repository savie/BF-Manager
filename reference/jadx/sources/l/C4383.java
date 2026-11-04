package l;

/* JADX INFO: renamed from: l.ۘ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBH2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4383 extends C12763 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C4383 f15791 = new C4383(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13992(int i, int i2, int i3, int i4, C1028 c1028) {
        m31596(i, new C24521(i2, i3, i4, c1028));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C4383 m13995(int i) {
        int size = size();
        C24521[] c24521Arr = new C24521[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C24521 c24521 = (C24521) m31593(i3);
            if (c24521.m54780(i)) {
                C1028 c1028M54782 = c24521.m54782();
                int i4 = 0;
                while (true) {
                    if (i4 >= i2) {
                        c24521Arr[i2] = c24521;
                        i2++;
                        break;
                    }
                    C1028 c1028M54783 = c24521Arr[i4].m54782();
                    if (c1028M54783 == c1028M54782 || c1028M54783 == C1028.f3733) {
                        break;
                    }
                    i4++;
                }
            }
        }
        if (i2 != 0) {
            C4383 c4383 = new C4383(i2);
            for (int i5 = 0; i5 < i2; i5++) {
                C24521 c24522 = c24521Arr[i5];
                if (c24522 == null) {
                    throw new NullPointerException("item == null");
                }
                c4383.m31596(i5, c24522);
            }
            c4383.mo15005();
            return c4383;
        }
        return f15791;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C24698 m13994(int i) {
        if (i < -1) {
            throw new IllegalArgumentException("noException < -1");
        }
        int i2 = i >= 0 ? 1 : 0;
        int size = size();
        if (size == 0) {
            if (i2 != 0) {
                return C24698.m55041(i);
            }
            return C24698.f79910;
        }
        C24698 c24698 = new C24698(size + i2);
        for (int i3 = 0; i3 < size; i3++) {
            c24698.add(((C24521) m31593(i3)).m54781());
        }
        if (i2 != 0) {
            c24698.add(i);
        }
        c24698.mo15005();
        return c24698;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C13705 m13993() {
        int size = size();
        if (size == 0) {
            return C13705.f43487;
        }
        C13705 c13705 = new C13705(size);
        for (int i = 0; i < size; i++) {
            c13705.m31599(i, ((C24521) m31593(i)).m54782().m3933());
        }
        c13705.mo15005();
        return c13705;
    }
}
