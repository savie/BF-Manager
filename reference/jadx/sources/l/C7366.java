package l;

/* JADX INFO: renamed from: l.ۜ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBEZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C7366 extends C12763 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C7366 f24238 = new C7366(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7366 m20227(C7366 c7366, C7366 c7367) {
        if (c7366 == f24238) {
            return c7367;
        }
        int size = c7366.size();
        int size2 = c7367.size();
        C7366 c7368 = new C7366(size + size2);
        for (int i = 0; i < size; i++) {
            c7368.m31596(i, (C8857) c7366.m31593(i));
        }
        for (int i2 = 0; i2 < size2; i2++) {
            c7368.m31596(size + i2, (C8857) c7367.m31593(i2));
        }
        c7368.mo15005();
        return c7368;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C7366 m20228(C7366 c7366, C7366 c7367) {
        C8857 c8857;
        int size = c7366.size();
        C7366 c7368 = new C7366(size);
        for (int i = 0; i < size; i++) {
            C8857 c8857M23736 = (C8857) c7366.m31593(i);
            int size2 = c7367.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    c8857 = null;
                    break;
                }
                c8857 = (C8857) c7367.m31593(i2);
                if (c8857.m23738(c8857M23736)) {
                    break;
                }
                i2++;
            }
            if (c8857 != null) {
                c8857M23736 = c8857M23736.m23736(C8857.m23734(c8857));
            }
            c7368.m31596(i, c8857M23736);
        }
        c7368.mo15005();
        return c7368;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20229(int i, int i2, int i3, C9976 c9976, C9976 c9977, C9976 c9978, int i4) {
        m31596(i, new C8857(i2, i3, c9976, c9977, c9978, i4));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8857 m20230(int i, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            C8857 c8857 = (C8857) m31593(i3);
            if (c8857.m23737(i, i2)) {
                return c8857;
            }
        }
        return null;
    }
}
